import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class51 extends class45 {

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "Z")
    private boolean field910 = true;

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "Z")
    private boolean field917 = true;

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "Lpi;")
    public static class342 field914;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "Lbu;")
    public static class17 field916;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field912;
        int[] var3 = super.field854.method863((byte) 12, arg1);
        if (arg0 != 0) {
            method465(116, (class145) null);
        }
        if (super.field854.field1928) {
            int[] var4 = this.method434(0, !this.field910 ? arg1 : -arg1 + class506.field7463, 124);
            if (this.field917) {
                for (int var5 = 0; ~var5 > ~class259.field3768; ++var5) {
                    var3[var5] = var4[-var5 + class290.field4128];
                }
            } else {
                class73.method591(var4, 0, var3, 0, class259.field3768);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class51() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(B)V")
    public static void method463(byte arg0) {
        field914 = null;
        if (arg0 >= 70) {
            field916 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        ++field913;
        if (arg1 == -26471) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (~arg2 == -3) {
                        super.field844 = arg0.method1063((byte) 111) == 1;
                    }
                } else {
                    this.field910 = ~arg0.method1063((byte) 115) == -2;
                }
            } else {
                this.field917 = ~arg0.method1063((byte) -121) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(II)I")
    public static final int method464(int arg0, int arg1) {
        int var7 = arg1 - 1;
        ++field909;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg0 != 1905326856) {
            method463((byte) 80);
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 - -1;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILcu;)Lqn;")
    public static final class45 method465(int arg0, class145 arg1) {
        ++field911;
        arg1.method1063((byte) 110);
        int var2 = arg1.method1063((byte) -90);
        class45 var3 = class86.method675((byte) -49, var2);
        if (arg0 != 21705) {
            method465(-63, (class145) null);
        }
        var3.field836 = arg1.method1063((byte) -89);
        int var4 = arg1.method1063((byte) -29);
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            int var6 = arg1.method1063((byte) 121);
            var3.method37(arg1, arg0 ^ -13232, var6);
        }
        var3.method38(4095);
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)[[I")
    public final int[][] method49(int arg0, int arg1) {
        ++field915;
        int[][] var3 = super.field833.method835(arg1, (byte) 23);
        if (arg0 != 8) {
            field916 = null;
        }
        if (super.field833.field1888) {
            int[][] var4 = this.method437(0, this.field910 ? -arg1 + class506.field7463 : arg1, -50);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field917) {
                for (int var11 = 0; class259.field3768 > var11; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; var12 < class259.field3768; ++var12) {
                    var8[var12] = var5[-var12 + class290.field4128];
                    var9[var12] = var6[-var12 + class290.field4128];
                    var10[var12] = var7[-var12 + class290.field4128];
                }
            }
        }
        return var3;
    }

    static {
        new class342("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field914 = new class342("K", "T", "K", "K");
    }
}
