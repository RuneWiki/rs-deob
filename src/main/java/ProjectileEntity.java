import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SWTXAYDT")
public class ProjectileEntity extends Entity {

    @OriginalMember(owner = "SWTXAYDT", name = "o", descriptor = "I")
    private int _flowObfuscator1 = 9;

    @OriginalMember(owner = "SWTXAYDT", name = "u", descriptor = "Z")
    public boolean mobile = false;

    @OriginalMember(owner = "SWTXAYDT", name = "G", descriptor = "Z")
    private boolean _flowObfuscator3 = true;

    @OriginalMember(owner = "SWTXAYDT", name = "H", descriptor = "LMUDLUUBC;")
    private SpotAnimType spotanim;

    @OriginalMember(owner = "SWTXAYDT", name = "M", descriptor = "I")
    public int level;

    @OriginalMember(owner = "SWTXAYDT", name = "v", descriptor = "I")
    public int srcX;

    @OriginalMember(owner = "SWTXAYDT", name = "w", descriptor = "I")
    public int srcZ;

    @OriginalMember(owner = "SWTXAYDT", name = "x", descriptor = "I")
    public int srcY;

    @OriginalMember(owner = "SWTXAYDT", name = "m", descriptor = "I")
    public int startCycle;

    @OriginalMember(owner = "SWTXAYDT", name = "n", descriptor = "I")
    public int endCycle;

    @OriginalMember(owner = "SWTXAYDT", name = "D", descriptor = "I")
    public int peakPitch;

    @OriginalMember(owner = "SWTXAYDT", name = "E", descriptor = "I")
    public int arc;

    @OriginalMember(owner = "SWTXAYDT", name = "F", descriptor = "I")
    public int target;

    @OriginalMember(owner = "SWTXAYDT", name = "y", descriptor = "I")
    public int offsetY;

    @OriginalMember(owner = "SWTXAYDT", name = "t", descriptor = "D")
    private double accelerationY;

    @OriginalMember(owner = "SWTXAYDT", name = "r", descriptor = "D")
    private double velocity;

    @OriginalMember(owner = "SWTXAYDT", name = "p", descriptor = "D")
    private double velocityX;

    @OriginalMember(owner = "SWTXAYDT", name = "s", descriptor = "D")
    private double velocityY;

    @OriginalMember(owner = "SWTXAYDT", name = "q", descriptor = "D")
    private double velocityZ;

    @OriginalMember(owner = "SWTXAYDT", name = "A", descriptor = "D")
    public double x;

    @OriginalMember(owner = "SWTXAYDT", name = "C", descriptor = "D")
    public double y;

    @OriginalMember(owner = "SWTXAYDT", name = "B", descriptor = "D")
    public double z;

    @OriginalMember(owner = "SWTXAYDT", name = "z", descriptor = "I")
    private int _flowObfuscator2;

    @OriginalMember(owner = "SWTXAYDT", name = "L", descriptor = "I")
    public int pitch;

    @OriginalMember(owner = "SWTXAYDT", name = "J", descriptor = "I")
    private int seqCycle;

    @OriginalMember(owner = "SWTXAYDT", name = "I", descriptor = "I")
    private int seqFrame;

    @OriginalMember(owner = "SWTXAYDT", name = "K", descriptor = "I")
    public int yaw;

    @OriginalMember(owner = "SWTXAYDT", name = "a", descriptor = "(IIIIB)V")
    public final void updateVelocity(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (!this.mobile) {
            double var6 = (double) (arg3 - this.srcX);
            double var8 = (double) (arg1 - this.srcZ);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.x = (double) this.arc * var6 / var10 + (double) this.srcX;
            this.z = (double) this.arc * var8 / var10 + (double) this.srcZ;
            this.y = this.srcY;
        }
        double var12 = (double) (this.endCycle + 1 - arg0);
        this.velocityX = ((double) arg3 - this.x) / var12;
        if (arg4 != -83) {
            return;
        }
        this.velocityZ = ((double) arg1 - this.z) / var12;
        this.velocity = Math.sqrt(this.velocityZ * this.velocityZ + this.velocityX * this.velocityX);
        if (!this.mobile) {
            this.velocityY = -this.velocity * Math.tan((double) this.peakPitch * 0.02454369D);
        }
        this.accelerationY = ((double) arg2 - this.y - this.velocityY * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "SWTXAYDT", name = "a", descriptor = "(I)LZKARKDQW;")
    public final Model getModel(int arg0) {
        Model var2 = this.spotanim.getModel();
        if (var2 == null) {
            return null;
        }
        int var3 = -1;
        if (this.spotanim.seq != null) {
            var3 = this.spotanim.seq.frames[this.seqFrame];
        }
        Model var4 = new Model(9, true, AnimFrame.isNull(var3, false), false, var2);
        if (var3 != -1) {
            var4.createLabelReferences((byte) -71);
            var4.applyTransform(var3, 40542);
            var4.labelFaces = null;
            var4.labelVertices = null;
        }
        if (this.spotanim.resizeh != 128 || this.spotanim.resizev != 128) {
            var4.scale(this.spotanim.resizeh, this.spotanim.resizeh, this._flowObfuscator1, this.spotanim.resizev);
        }
        var4.rotateX(this.pitch, 1);
        var4.calculateNormals(this.spotanim.ambient + 64, this.spotanim.contrast + 850, -30, -50, -30, true);
        if (arg0 != 4016) {
            throw new NullPointerException();
        }
        return var4;
    }

    @OriginalMember(owner = "SWTXAYDT", name = "<init>", descriptor = "(IIIIIIIIIIII)V")
    public ProjectileEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        this.spotanim = SpotAnimType.instances[arg11];
        if (arg2 != 46883) {
            this._flowObfuscator3 = !this._flowObfuscator3;
        }
        this.level = arg6;
        this.srcX = arg9;
        this.srcZ = arg8;
        this.srcY = arg7;
        this.startCycle = arg3;
        this.endCycle = arg4;
        this.peakPitch = arg0;
        this.arc = arg5;
        this.target = arg10;
        this.offsetY = arg1;
        this.mobile = false;
    }

    @OriginalMember(owner = "SWTXAYDT", name = "a", descriptor = "(II)V")
    public final void update(int arg0, int arg1) {
        this.mobile = true;
        this.x += (double) arg0 * this.velocityX;
        this.z += (double) arg0 * this.velocityZ;
        this.y += this.accelerationY * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.velocityY;
        this.velocityY += (double) arg0 * this.accelerationY;
        if (arg1 != 0) {
            this._flowObfuscator2 = 16;
        }
        this.yaw = (int) (Math.atan2(this.velocityX, this.velocityZ) * 325.949D) + 1024 & 0x7FF;
        this.pitch = (int) (Math.atan2(this.velocityY, this.velocity) * 325.949D) & 0x7FF;
        if (this.spotanim.seq == null) {
            return;
        }
        this.seqCycle += arg0;
        while (this.seqCycle > this.spotanim.seq.getFrameDuration(this.seqFrame, (byte) -39)) {
            this.seqCycle -= this.spotanim.seq.getFrameDuration(this.seqFrame, (byte) -39) + 1;
            this.seqFrame++;
            if (this.seqFrame >= this.spotanim.seq.frameCount) {
                this.seqFrame = 0;
            }
        }
    }
}
