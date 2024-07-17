import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("WBWOBAFW")
public class LocEntity extends Entity {

    @OriginalMember(owner = "WBWOBAFW", name = "m", descriptor = "B")
    private byte _flowObfuscator6 = 7;

    @OriginalMember(owner = "WBWOBAFW", name = "y", descriptor = "I")
    private int type;

    @OriginalMember(owner = "WBWOBAFW", name = "z", descriptor = "I")
    private int shape;

    @OriginalMember(owner = "WBWOBAFW", name = "A", descriptor = "I")
    private int rotation;

    @OriginalMember(owner = "WBWOBAFW", name = "r", descriptor = "I")
    private int heightmapSW;

    @OriginalMember(owner = "WBWOBAFW", name = "s", descriptor = "I")
    private int heightmapSE;

    @OriginalMember(owner = "WBWOBAFW", name = "t", descriptor = "I")
    private int heightmapNE;

    @OriginalMember(owner = "WBWOBAFW", name = "u", descriptor = "I")
    private int heightmapNW;

    @OriginalMember(owner = "WBWOBAFW", name = "v", descriptor = "LLKGEGIEW;")
    private SeqType anim;

    @OriginalMember(owner = "WBWOBAFW", name = "n", descriptor = "I")
    private int animFrame;

    @OriginalMember(owner = "WBWOBAFW", name = "w", descriptor = "I")
    private int animCycle;

    @OriginalMember(owner = "WBWOBAFW", name = "p", descriptor = "I")
    public int multivarbit;

    @OriginalMember(owner = "WBWOBAFW", name = "q", descriptor = "I")
    public int mutlivarp;

    @OriginalMember(owner = "WBWOBAFW", name = "o", descriptor = "[I")
    public int[] multiloc;

    @OriginalMember(owner = "WBWOBAFW", name = "B", descriptor = "I")
    private int _flowObfuscator7;

    @OriginalMember(owner = "WBWOBAFW", name = "x", descriptor = "Lclient;")
    public static client varProvider;

    @OriginalMember(owner = "WBWOBAFW", name = "a", descriptor = "(I)LZKARKDQW;")
    public final Model getModel(int arg0) {
        int var2 = -1;
        if (arg0 != 4016) {
            this._flowObfuscator7 = -272;
        }
        if (this.anim != null) {
            int var3 = client.loopCycle - this.animCycle;
            if (var3 > 100 && this.anim.replayoff > 0) {
                var3 = 100;
            }
            label44: {
                do {
                    do {
                        if (var3 <= this.anim.getFrameDuration(this.animFrame, (byte) -39)) {
                            break label44;
                        }
                        var3 -= this.anim.getFrameDuration(this.animFrame, (byte) -39);
                        this.animFrame++;
                    } while (this.animFrame < this.anim.frameCount);
                    this.animFrame -= this.anim.replayoff;
                } while (this.animFrame >= 0 && this.animFrame < this.anim.frameCount);
                this.anim = null;
            }
            this.animCycle = client.loopCycle - var3;
            if (this.anim != null) {
                var2 = this.anim.frames[this.animFrame];
            }
        }
        LocType var4;
        if (this.multiloc == null) {
            var4 = LocType.get(this.type);
        } else {
            var4 = this.getMultiLoc(true);
        }
        return var4 == null ? null : var4.getModel(this.shape, this.rotation, this.heightmapSW, this.heightmapSE, this.heightmapNE, this.heightmapNW, var2);
    }

    @OriginalMember(owner = "WBWOBAFW", name = "a", descriptor = "(Z)LYZDBYLRM;")
    public final LocType getMultiLoc(boolean arg0) {
        int var2 = -1;
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.multivarbit != -1) {
            VarbitType var4 = VarbitType.instances[this.multivarbit];
            int var5 = var4.basevar;
            int var6 = var4.startbit;
            int var7 = var4.endbit;
            int var8 = client.BITMASK[var7 - var6];
            var2 = varProvider.varps[var5] >> var6 & var8;
        } else if (this.mutlivarp != -1) {
            var2 = varProvider.varps[this.mutlivarp];
        }
        return var2 < 0 || var2 >= this.multiloc.length || this.multiloc[var2] == -1 ? null : LocType.get(this.multiloc[var2]);
    }

    @OriginalMember(owner = "WBWOBAFW", name = "<init>", descriptor = "(IIIIBIIIIZ)V")
    public LocEntity(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (this._flowObfuscator6 != arg4) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        this.type = arg0;
        this.shape = arg2;
        this.rotation = arg1;
        this.heightmapSW = arg6;
        this.heightmapSE = arg3;
        this.heightmapNE = arg5;
        this.heightmapNW = arg7;
        if (arg8 != -1) {
            this.anim = SeqType.instances[arg8];
            this.animFrame = 0;
            this.animCycle = client.loopCycle;
            if (arg9 && this.anim.replayoff != -1) {
                this.animFrame = (int) (Math.random() * (double) this.anim.frameCount);
                this.animCycle -= (int) (Math.random() * (double) this.anim.getFrameDuration(this.animFrame, (byte) -39));
            }
        }
        LocType var12 = LocType.get(this.type);
        this.multivarbit = var12.multivarbit;
        this.mutlivarp = var12.multivarp;
        this.multiloc = var12.multiloc;
    }
}
