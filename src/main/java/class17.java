import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!INFJTSRJ")
public class class17 extends class21 {

    @OriginalMember(owner = "client!INFJTSRJ", name = "k", descriptor = "I")
    private int field777 = -43582;

    @OriginalMember(owner = "client!INFJTSRJ", name = "t", descriptor = "I")
    private int field786;

    @OriginalMember(owner = "client!INFJTSRJ", name = "u", descriptor = "I")
    private int field787;

    @OriginalMember(owner = "client!INFJTSRJ", name = "v", descriptor = "I")
    private int field788;

    @OriginalMember(owner = "client!INFJTSRJ", name = "l", descriptor = "I")
    private int field778;

    @OriginalMember(owner = "client!INFJTSRJ", name = "m", descriptor = "I")
    private int field779;

    @OriginalMember(owner = "client!INFJTSRJ", name = "n", descriptor = "I")
    private int field780;

    @OriginalMember(owner = "client!INFJTSRJ", name = "o", descriptor = "I")
    private int field781;

    @OriginalMember(owner = "client!INFJTSRJ", name = "s", descriptor = "LKMWMLVIH;")
    private class26 field785;

    @OriginalMember(owner = "client!INFJTSRJ", name = "q", descriptor = "I")
    private int field783;

    @OriginalMember(owner = "client!INFJTSRJ", name = "p", descriptor = "I")
    private int field782;

    @OriginalMember(owner = "client!INFJTSRJ", name = "x", descriptor = "I")
    public int field790;

    @OriginalMember(owner = "client!INFJTSRJ", name = "y", descriptor = "I")
    public int field791;

    @OriginalMember(owner = "client!INFJTSRJ", name = "w", descriptor = "[I")
    public int[] field789;

    @OriginalMember(owner = "client!INFJTSRJ", name = "r", descriptor = "Lclient;")
    public static client field784;

    @OriginalMember(owner = "client!INFJTSRJ", name = "<init>", descriptor = "(IIIIIIIZII)V")
    public class17(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        this.field786 = arg2;
        this.field787 = arg5;
        this.field788 = arg6;
        while (arg4 >= 0) {
            this.field777 = 135;
        }
        this.field778 = arg8;
        this.field779 = arg1;
        this.field780 = arg0;
        this.field781 = arg9;
        if (arg3 != -1) {
            this.field785 = class26.field921[arg3];
            this.field783 = 0;
            this.field782 = client.field346;
            if (arg7 && this.field785.field926 != -1) {
                this.field783 = (int) (Math.random() * (double) this.field785.field922);
                this.field782 -= (int) (Math.random() * (double) this.field785.method320(this.field783, (byte) 0));
            }
        }
        class47 var11 = class47.method417(this.field786);
        this.field790 = var11.field1292;
        this.field791 = var11.field1288;
        this.field789 = var11.field1285;
    }

    @OriginalMember(owner = "client!INFJTSRJ", name = "a", descriptor = "(I)LPXRGLLGB;")
    public final class47 method265(int arg0) {
        int var2 = -1;
        if (arg0 != 38796) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field790 != -1) {
            class12 var4 = class12.field623[this.field790];
            int var5 = var4.field625;
            int var6 = var4.field626;
            int var7 = var4.field627;
            int var8 = client.field211[var7 - var6];
            var2 = field784.field197[var5] >> var6 & var8;
        } else if (this.field791 != -1) {
            var2 = field784.field197[this.field791];
        }
        return var2 < 0 || var2 >= this.field789.length || this.field789[var2] == -1 ? null : class47.method417(this.field789[var2]);
    }

    @OriginalMember(owner = "client!INFJTSRJ", name = "a", descriptor = "(Z)LIYSWJGDE;")
    public final class19 method2(boolean arg0) {
        if (!arg0) {
            this.field777 = -118;
        }
        int var2 = -1;
        if (this.field785 != null) {
            int var3 = client.field346 - this.field782;
            if (var3 > 100 && this.field785.field926 > 0) {
                var3 = 100;
            }
            label44: {
                do {
                    do {
                        if (var3 <= this.field785.method320(this.field783, (byte) 0)) {
                            break label44;
                        }
                        var3 -= this.field785.method320(this.field783, (byte) 0);
                        this.field783++;
                    } while (this.field783 < this.field785.field922);
                    this.field783 -= this.field785.field926;
                } while (this.field783 >= 0 && this.field783 < this.field785.field922);
                this.field785 = null;
            }
            this.field782 = client.field346 - var3;
            if (this.field785 != null) {
                var2 = this.field785.field923[this.field783];
            }
        }
        class47 var4;
        if (this.field789 == null) {
            var4 = class47.method417(this.field786);
        } else {
            var4 = this.method265(38796);
        }
        return var4 == null ? null : var4.method414(this.field787, this.field788, this.field778, this.field779, this.field780, this.field781, var2);
    }
}
