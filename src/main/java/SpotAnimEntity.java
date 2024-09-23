import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("OJEALINP")
public class SpotAnimEntity extends Entity {

    @OriginalMember(owner = "OJEALINP", name = "r", descriptor = "Z")
    private boolean _flowObfuscator1 = true;

    @OriginalMember(owner = "OJEALINP", name = "s", descriptor = "I")
    private int _flowObfuscator2 = 9;

    @OriginalMember(owner = "OJEALINP", name = "t", descriptor = "Z")
    public boolean seqComplete = false;

    @OriginalMember(owner = "OJEALINP", name = "u", descriptor = "LMUDLUUBC;")
    private SpotAnimType type;

    @OriginalMember(owner = "OJEALINP", name = "m", descriptor = "I")
    public int level;

    @OriginalMember(owner = "OJEALINP", name = "n", descriptor = "I")
    public int x;

    @OriginalMember(owner = "OJEALINP", name = "o", descriptor = "I")
    public int z;

    @OriginalMember(owner = "OJEALINP", name = "p", descriptor = "I")
    public int y;

    @OriginalMember(owner = "OJEALINP", name = "q", descriptor = "I")
    public int startCycle;

    @OriginalMember(owner = "OJEALINP", name = "w", descriptor = "I")
    private int seqCycle;

    @OriginalMember(owner = "OJEALINP", name = "v", descriptor = "I")
    private int seqFrame;

    @OriginalMember(owner = "OJEALINP", name = "<init>", descriptor = "(IIIIIIII)V")
    public SpotAnimEntity(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.type = SpotAnimType.instances[arg4];
        this.level = arg0;
        this.x = arg7;
        this.z = arg6;
        this.y = arg5;
        this.startCycle = arg1 + arg3;
        if (arg2 != 6) {
            throw new NullPointerException();
        }
        this.seqComplete = false;
    }

    @OriginalMember(owner = "OJEALINP", name = "a", descriptor = "(I)LZKARKDQW;")
    public final Model getModel(int arg0) {
        if (arg0 != 4016) {
            throw new NullPointerException();
        }
        Model var2 = this.type.getModel();
        if (var2 == null) {
            return null;
        }
        int var3 = this.type.seq.frames[this.seqFrame];
        Model var4 = new Model(9, true, AnimFrame.isNull(var3, false), false, var2);
        if (!this.seqComplete) {
            var4.createLabelReferences((byte) -71);
            var4.applyTransform(var3, 40542);
            var4.labelFaces = null;
            var4.labelVertices = null;
        }
        if (this.type.resizeh != 128 || this.type.resizev != 128) {
            var4.scale(this.type.resizeh, this.type.resizeh, this._flowObfuscator2, this.type.resizev);
        }
        if (this.type.angle != 0) {
            if (this.type.angle == 90) {
                var4.rotateY90(360);
            }
            if (this.type.angle == 180) {
                var4.rotateY90(360);
                var4.rotateY90(360);
            }
            if (this.type.angle == 270) {
                var4.rotateY90(360);
                var4.rotateY90(360);
                var4.rotateY90(360);
            }
        }
        var4.calculateNormals(this.type.ambient + 64, this.type.contrast + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "OJEALINP", name = "a", descriptor = "(IZ)V")
    public final void update(int arg0, boolean arg1) {
        if (!arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.seqCycle += arg0;
        while (true) {
            do {
                do {
                    if (this.seqCycle <= this.type.seq.getFrameDuration(this.seqFrame, (byte) -39)) {
                        return;
                    }
                    this.seqCycle -= this.type.seq.getFrameDuration(this.seqFrame, (byte) -39) + 1;
                    this.seqFrame++;
                } while (this.seqFrame < this.type.seq.frameCount);
            } while (this.seqFrame >= 0 && this.seqFrame < this.type.seq.frameCount);
            this.seqFrame = 0;
            this.seqComplete = true;
        }
    }
}
