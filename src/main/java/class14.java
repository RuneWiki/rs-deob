import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class14 extends class139 {

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
    private int field251 = 4096;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "Lrf;")
    public static class163 field248 = class53.method392(-80, "weiss:");

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "Lrf;")
    public static class163 field252 = class53.method392(-94, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "I")
    public static int field254 = 0;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "I")
    public static int field249 = -1;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "Lrf;")
    public static class163 field250 = class53.method392(-117, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!bc", name = "ab", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    public class14() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        ++field255;
        if (~arg0 == -1) {
            this.field251 = arg2.method390((byte) 97);
        }
        if (arg1 != 21) {
            field254 = -109;
        }
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V")
    public static void method96(int arg0) {
        field252 = null;
        field250 = null;
        field248 = null;
        if (arg0 != -14009) {
            method96(68);
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field253;
        int[] var3 = super.field2859.method1319(arg1 + -7557, arg0);
        if (super.field2859.field3966) {
            int[] var4 = this.method917(arg0 + -1 & class15.field260, 0, true);
            int[] var5 = this.method917(arg0, 0, true);
            int[] var6 = this.method917(arg0 + 1 & class15.field260, 0, true);
            for (int var7 = 0; class23.field402 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field251;
                int var9 = (var5[class29.field542 & var7 + 1] - var5[class29.field542 & var7 + -1]) * this.field251;
                int var10 = var8 >> 12;
                int var11 = var9 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((var12 + var13 + 4096) / 4096)));
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = 4096 - var15;
            }
        }
        return arg1 != 7451 ? null : var3;
    }
}
