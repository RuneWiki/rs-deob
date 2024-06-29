import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class293 extends class102 {

    @OriginalMember(owner = "client!te", name = "w", descriptor = "Lih;")
    public class32 field4874 = new class32();

    @OriginalMember(owner = "client!te", name = "K", descriptor = "Lei;")
    public class195 field4887 = new class195();

    @OriginalMember(owner = "client!te", name = "E", descriptor = "Lva;")
    private class146 field4882;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "I")
    public static int field4880 = 64;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "[I")
    public static int[] field4879 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "Lve;")
    public static class266 field4876;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "[I")
    public static int[] field4884;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "()Lqb;", line = 5)
    public final class102 method470() {
        field4886++;
        class47 var1;
        do {
            var1 = (class47) this.field4874.method263(4);
            if (var1 == null) {
                return null;
            }
        } while (var1.field746 == null);
        return var1.field746;
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V", line = 29)
    public static void method2056(int arg0) {
        field4876 = null;
        field4879 = null;
        field4884 = null;
        if (arg0 != -28918) {
            method2061(-39);
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "()Lqb;", line = 43)
    public final class102 method448() {
        field4881++;
        class47 var1 = (class47) this.field4874.method264(-34);
        if (var1 == null) {
            return null;
        } else if (var1.field746 == null) {
            return this.method470();
        } else {
            return var1.field746;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lmf;II)V", line = 61)
    private final void method2057(class47 arg0, int arg1, int arg2) {
        if ((this.field4882.field2267[arg0.field753] & 0x4) != 0 && arg0.field745 < 0) {
            int var4 = this.field4882.field2242[arg0.field753] / class168.field2603;
            int var5 = (var4 + 1048575 - arg0.field755) / var4;
            arg0.field755 = arg2 * var4 + arg0.field755 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field4882.field2275[arg0.field753] == 0) {
                    arg0.field746 = class60.method447(arg0.field748, arg0.field746.method454(), arg0.field746.method439(), arg0.field746.method467());
                } else {
                    arg0.field746 = class60.method447(arg0.field748, arg0.field746.method454(), 0, arg0.field746.method467());
                    this.field4882.method994(arg0, arg0.field768.field1455[arg0.field760] < 0, (byte) -101);
                }
                if (arg0.field768.field1455[arg0.field760] < 0) {
                    arg0.field746.method444(-1);
                }
                arg2 = arg0.field755 / var4;
            }
        }
        arg0.field746.method443(arg2);
        field4878++;
        if (arg1 != 7) {
            this.field4887 = (class195) null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)V", line = 101)
    public static final void method2058(int arg0, boolean arg1) {
        if (!arg1) {
            method2056(92);
        }
        field4873++;
        class241.field3929.method1985(-128, arg0);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "()I", line = 113)
    public final int method435() {
        field4883++;
        return 0;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)Lda;", line = 134)
    public static final class120 method2059(int arg0, int arg1, int arg2) {
        class120 var3 = (class120) client.field4109.method1827((long) arg2 | (long) arg1 << 32, arg0 ^ arg0);
        if (var3 == null) {
            var3 = new class120(arg1, arg2);
            client.field4109.method1826(1, var3, var3.field2293);
        }
        field4872++;
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Lna;I)Z", line = 151)
    public static final boolean method2060(class26 arg0, int arg1) {
        field4885++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class132.field2014; var2++) {
            if (arg0.method162(63, class309.field5316[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V", line = 174)
    public static final void method2061(int arg0) {
        class49.method363();
        field4875++;
        class9.field121 = new class91[7];
        class9.field121[1] = new class77();
        class9.field121[2] = new class171();
        class9.field121[3] = new class288();
        class9.field121[4] = new class3();
        class9.field121[5] = new class290();
        class9.field121[arg0] = new class15();
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V", line = 189)
    public final void method443(int arg0) {
        field4871++;
        this.field4887.method443(arg0);
        for (class47 var2 = (class47) this.field4874.method264(-62); var2 != null; var2 = (class47) this.field4874.method263(4)) {
            if (!this.field4882.method997(var2, 121)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field751) {
                        this.method2057(var2, 7, var3);
                        var2.field751 -= var3;
                        break;
                    }
                    this.method2057(var2, 7, var2.field751);
                    var3 -= var2.field751;
                } while (!this.field4882.method985(var3, 0, var2, (byte) 14, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "([III)V", line = 237)
    public final void method427(int[] arg0, int arg1, int arg2) {
        field4888++;
        this.field4887.method427(arg0, arg1, arg2);
        for (class47 var4 = (class47) this.field4874.method264(-74); var4 != null; var4 = (class47) this.field4874.method263(4)) {
            if (!this.field4882.method997(var4, 126)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field751) {
                        this.method2062(arg0, var4, var6, var5, var5 + var6, (byte) 4);
                        var4.field751 -= var5;
                        break;
                    }
                    this.method2062(arg0, var4, var6, var4.field751, var5 + var6, (byte) 4);
                    var5 -= var4.field751;
                    var6 += var4.field751;
                } while (!this.field4882.method985(var5, var6, var4, (byte) 14, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([ILmf;IIIB)V", line = 276)
    private final void method2062(int[] arg0, class47 arg1, int arg2, int arg3, int arg4, byte arg5) {
        if ((this.field4882.field2267[arg1.field753] & 0x4) != 0 && arg1.field745 < 0) {
            int var7 = this.field4882.field2242[arg1.field753] / class168.field2603;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field755) / var7;
                if (arg3 < var8) {
                    arg1.field755 += arg3 * var7;
                    break;
                }
                arg3 -= var8;
                arg1.field746.method427(arg0, arg2, var8);
                int var9 = class168.field2603 / 100;
                class60 var10 = arg1.field746;
                int var11 = 262144 / var7;
                if (var11 < var9) {
                    var9 = var11;
                }
                arg1.field755 += var7 * var8 - 1048576;
                if (this.field4882.field2275[arg1.field753] == 0) {
                    arg1.field746 = class60.method447(arg1.field748, var10.method454(), var10.method439(), var10.method467());
                } else {
                    arg1.field746 = class60.method447(arg1.field748, var10.method454(), 0, var10.method467());
                    this.field4882.method994(arg1, arg1.field768.field1455[arg1.field760] < 0, (byte) -88);
                    arg1.field746.method446(var9, var10.method439());
                }
                if (arg1.field768.field1455[arg1.field760] < 0) {
                    arg1.field746.method444(-1);
                }
                arg2 += var8;
                var10.method429(var9);
                var10.method427(arg0, arg2, arg4 - arg2);
                if (var10.method461()) {
                    this.field4887.method1309(var10);
                }
            }
        }
        if (arg5 == 4) {
            field4877++;
            arg1.field746.method427(arg0, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lva;)V", line = 352)
    public class293(class146 arg0) {
        this.field4882 = arg0;
    }
}
