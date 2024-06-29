import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class268 {

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    private int field4243 = -1;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    private int field4236 = 0;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "Lud;")
    private class2 field4241 = new class2();

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "Z")
    public boolean field4257 = false;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    private int field4238;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "I")
    private int field4253;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "[Loi;")
    private class83[] field4247;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "[[[I")
    private int[][][] field4246;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "Z")
    public static volatile boolean field4252 = true;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "Lha;")
    public static class31 field4250 = new class31(new byte[5000]);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "Lub;")
    public static class92 field4237;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "[[B")
    public static byte[][] field4248;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method1812(int arg0) {
        field4240++;
        if (this.field4253 != this.field4238) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != -1) {
            this.method1818(30, true);
        }
        for (int var2 = 0; var2 < this.field4238; var2++) {
            this.field4247[var2] = class196.field3068;
        }
        return this.field4246;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIII)V")
    public static final void method1813(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg1; var6 <= arg3; var6++) {
            class173.method1240((byte) -115, arg0, class55.field872[var6], arg5, arg2);
        }
        if (arg4 == 9967) {
            field4242++;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public static void method1814(byte arg0) {
        field4250 = null;
        field4248 = null;
        field4237 = null;
        if (arg0 <= 48) {
            field4248 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIBIIII)V")
    public static final void method1815(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field4245++;
        if (class48.method401(arg4 + 152, arg2)) {
            if (arg4 != -46) {
                method1816(-76, (byte) 45, -120, 30);
            }
            class247.method1672(-66, arg3, arg6, class8.field144[arg2], arg5, arg8, arg0, arg1, -1, arg7);
        } else if (arg5 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class247.field3933[var9] = true;
            }
        } else {
            class247.field3933[arg5] = true;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBII)V")
    public static final void method1816(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = class85.field1274 * arg0 >> 8;
        if (var4 != 0 && arg2 != -1) {
            class104.method791(0, arg2, false, 96, class155.field2318, var4);
            class41.field697 = true;
        }
        if (arg1 >= -13) {
            field4237 = null;
        }
        field4235++;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V")
    public static final void method1817(int arg0) {
        field4244++;
        class121.field1829.method1169(true);
        if (arg0 <= 60) {
            field4252 = true;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method1818(int arg0, boolean arg1) {
        if (arg1) {
            method1816(108, (byte) -33, 15, 35);
        }
        field4239++;
        if (this.field4253 == this.field4238) {
            this.field4257 = this.field4247[arg0] == null;
            this.field4247[arg0] = class196.field3068;
            return this.field4246[arg0];
        } else if (this.field4238 == 1) {
            this.field4257 = this.field4243 != arg0;
            this.field4243 = arg0;
            return this.field4246[0];
        } else {
            class83 var3 = this.field4247[arg0];
            if (var3 == null) {
                this.field4257 = true;
                if (this.field4238 > this.field4236) {
                    var3 = new class83(arg0, this.field4236);
                    this.field4236++;
                } else {
                    class83 var4 = (class83) this.field4241.method5((byte) 79);
                    var3 = new class83(arg0, var4.field1245);
                    this.field4247[var4.field1246] = null;
                    var4.method995((byte) -110);
                }
                this.field4247[arg0] = var3;
            } else {
                this.field4257 = false;
            }
            this.field4241.method10(var3, true);
            return this.field4246[var3.field1245];
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V")
    public final void method1819(int arg0) {
        field4254++;
        for (int var2 = 0; var2 < this.field4238; var2++) {
            this.field4246[var2][0] = null;
            this.field4246[var2][1] = null;
            this.field4246[var2][2] = null;
            this.field4246[var2] = null;
        }
        int var3 = 23 / ((63 - arg0) / 52);
        this.field4246 = null;
        this.field4247 = null;
        this.field4241.method9(120);
        this.field4241 = null;
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)V")
    public static final void method1820(int arg0) {
        class290.field4508.method1172((byte) 122);
        class126.field1897.method1172((byte) 114);
        field4256++;
        if (arg0 != -1989393656) {
            method1815(71, -99, 59, 53, (byte) 83, -51, 74, 70, -11);
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(III)V")
    public class268(int arg0, int arg1, int arg2) {
        this.field4238 = arg0;
        this.field4253 = arg1;
        this.field4247 = new class83[this.field4253];
        this.field4246 = new int[this.field4238][3][arg2];
    }
}
