import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class108 implements Runnable {

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "[Lcb;")
    public volatile class120[] field1884 = new class120[2];

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "Z")
    public volatile boolean field1875 = false;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "Z")
    public volatile boolean field1877 = false;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "Lda;")
    public static class275 field1870 = class255.method1672(113, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field1873 = 0;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "Lda;")
    public static class275 field1874 = class255.method1672(96, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field1880 = -1;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field1878 = 0;

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "I")
    public static int field1888 = 1;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "Lib;")
    public static class69 field1869 = new class69();

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "Lma;")
    public static class105 field1876;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "Llb;")
    public static class274 field1879;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "Ljk;")
    public class58 field1868;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLfd;)Z")
    public static final boolean method799(byte arg0, class229 arg1) {
        field1871++;
        if (arg1.field3886 == 205) {
            class67.field1102 = 250;
            return true;
        } else if (arg0 == 9) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)Z")
    public static final boolean method800(byte arg0) {
        field1889++;
        try {
            return arg0 >= -45 ? true : class73.method480(false);
        } catch (IOException var4) {
            class135.method981((byte) 29);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class268.field4650 + "," + field1873 + "," + class72.field1165 + " - " + class59.field1000 + "," + (class66.field1094.field1752[0] + class16.field237) + "," + (class66.field1094.field1722[0] + class234.field4083) + " - ";
            for (int var3 = 0; var3 < class59.field1000 && var3 < 50; var3++) {
                var2 = var2 + class196.field3351.field1381[var3] + ",";
            }
            class1.method1(var5, var2, false);
            class244.method1591((byte) -128);
            return true;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIII)V")
    public static final void method801(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1885++;
        int var6 = arg4 - arg2;
        int var7 = arg3 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class135.method985(23284, arg2, arg1, arg4, arg5);
            }
        } else if (var6 == 0) {
            class243.method1585((byte) 80, arg5, arg2, arg3, arg1);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            if (arg0 <= -27) {
                boolean var8 = var6 > var7;
                if (var8) {
                    int var9 = arg5;
                    arg5 = arg2;
                    arg2 = var9;
                    int var10 = arg3;
                    arg3 = arg4;
                    arg4 = var10;
                }
                if (arg5 > arg3) {
                    int var11 = arg5;
                    int var12 = arg2;
                    arg2 = arg4;
                    arg5 = arg3;
                    arg3 = var11;
                    arg4 = var12;
                }
                int var13 = arg2;
                int var14 = arg4 - arg2;
                if (var14 < 0) {
                    var14 = -var14;
                }
                int var15 = arg3 - arg5;
                int var16 = -(var15 >> 1);
                int var17 = arg2 < arg4 ? 1 : -1;
                if (var8) {
                    for (int var18 = arg5; var18 <= arg3; var18++) {
                        class19.field280[var18][var13] = arg1;
                        var16 += var14;
                        if (var16 > 0) {
                            var16 -= var15;
                            var13 += var17;
                        }
                    }
                } else {
                    for (int var19 = arg5; var19 <= arg3; var19++) {
                        class19.field280[var13][var19] = arg1;
                        var16 += var14;
                        if (var16 > 0) {
                            var16 -= var15;
                            var13 += var17;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "run", descriptor = "()V")
    public final void run() {
        field1886++;
        this.field1877 = true;
        try {
            while (!this.field1875) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class120 var2 = this.field1884[var1];
                    if (var2 != null) {
                        var2.method878(24820);
                    }
                }
                class250.method1640(10L, -107);
                client.method644(this.field1868, (byte) -113, (Object) null);
            }
        } catch (Exception var9) {
            class1.method1(var9, (String) null, false);
        } finally {
            Object var6 = null;
            this.field1877 = false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZZ)V")
    public static final void method802(boolean arg0, boolean arg1) {
        field1883++;
        class48.field798 = arg0;
        class267.field4640 = !class262.method1714(-1);
        if (!arg1) {
            method805(true, (class105) null, -42, 93, -24, 89, -59);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)Lda;")
    public static final class275 method803(int arg0) {
        field1890++;
        class275 var1 = class236.field4106;
        class275 var2 = class79.field1301;
        if (~class42.field704 != arg0) {
            var1 = class92.field1559;
        }
        if (class199.field3394 != null) {
            var2 = class197.method1291(new class275[] { class168.field2929, class199.field3394 }, arg0 ^ 0x7548);
        }
        return class197.method1291(new class275[] { class249.field4400, var1, class59.field989, class250.method1644(class205.field3480, (byte) -115), class137.field2401, class250.method1644(class160.field2813, (byte) -115), var2, class73.field1192 }, -30025);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V")
    public static void method804(byte arg0) {
        int var1 = 89 % ((arg0 + 41) / 59);
        field1869 = null;
        field1874 = null;
        field1870 = null;
        field1876 = null;
        field1879 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZLma;IIIII)V")
    public static final void method805(boolean arg0, class105 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class116.field2070 = arg5;
        class224.field3787 = arg4;
        class83.field1347 = arg2;
        class238.field4185 = arg3;
        class100.field1688 = arg6;
        class96.field1636 = arg1;
        class192.field3309 = arg0;
        field1872++;
    }
}
