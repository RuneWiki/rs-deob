import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class295 {

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "I")
    private int field4350 = -1;

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "Lef;")
    private class513 field4344 = new class513();

    @OriginalMember(owner = "client!vca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4351 = new String[] { method2415(method2414("-#?\u0003\"s")), method2415(method2414("552A")), method2415(method2414(" np\u0003\u001e")), method2415(method2414("-#?\u0003_2.7Y]s")), method2415(method2414("\u000e.,H\u00004'0D\u0010>$~n\u000f:.\rH\u0017/)0J\u0010\u001f%2Y\u0002{4']\u0006{)0\r\u0007>#1I\u0006si")), method2415(method2414("/z")), method2415(method2414("-#?\u0003 s")), method2415(method2414("{5.I\u0002/%\u0010X\u000ea")), method2415(method2414("\u0018,?C0>4*D\r<3\u001aH\u000f/!pL\u0013+,'y\f\u0018,?C0>4*D\r<3v\u0004Y{\u0003,H\u0007>.*D\u000273~I\f{.1YC6!*N\u000bz`\rH\u0017/)0J\u0010u/)C\u0006)z")), method2415(method2414("-#?\u0003!s")), method2415(method2414("{$;A\u0017:n1Z\r>2d")) };

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "Lef;")
    public static class513 field4349 = new class513();

    @OriginalMember(owner = "client!vca", name = "h", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!vca", name = "g", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "J")
    private long field4347;

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "[I")
    public static int[] field4343;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(ILib;)V")
    private final void method2411(int arg0, class163 arg1) {
        try {
            field4345++;
            this.field4347 = arg1.method1435(6);
            if (arg0 != -4) {
                this.field4347 = 14L;
            }
            this.field4350 = arg1.method1453((byte) 104);
            for (int var3 = arg1.method1455((byte) 62); var3 != 0; var3 = arg1.method1455((byte) 62)) {
                if (class288.field4281) {
                    System.out.println(field4351[5] + var3);
                }
                class756 var4;
                if (var3 == 3) {
                    var4 = new class687();
                } else if (var3 == 1) {
                    var4 = new class506();
                } else if (var3 == 4) {
                    var4 = new class650();
                } else if (var3 == 6) {
                    var4 = new class560();
                } else if (var3 == 5) {
                    var4 = new class546();
                } else if (var3 == 2) {
                    var4 = new class788();
                } else if (var3 == 7) {
                    var4 = new class6();
                } else if (var3 == 8) {
                    var4 = new class341();
                } else if (var3 == 9) {
                    var4 = new class243();
                } else if (var3 == 10) {
                    var4 = new class518();
                } else if (var3 == 11) {
                    var4 = new class56();
                } else if (var3 == 12) {
                    var4 = new class168();
                } else {
                    throw new RuntimeException(field4351[4]);
                }
                var4.method38((byte) 67, arg1);
                this.field4344.method3868(-114, var4);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4351[6] + arg0 + ',' + (arg1 == null ? field4351[1] : field4351[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lkp;I)V")
    public final void method2412(class514 arg0, int arg1) {
        try {
            field4346++;
            if (this.field4347 != arg0.field7394 || this.field4350 != arg0.field7401) {
                throw new RuntimeException(field4351[8] + class762.method5520(false, arg0.field7394) + field4351[7] + arg0.field7401 + field4351[10] + class762.method5520(false, this.field4347) + field4351[7] + this.field4350);
            }
            if (arg1 <= 109) {
                field4349 = null;
            }
            for (class756 var3 = (class756) this.field4344.method3863((byte) 64); var3 != null; var3 = (class756) this.field4344.method3862(-353)) {
                var3.method41(arg0, 9893);
            }
            arg0.field7401++;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4351[9] + (arg0 == null ? field4351[1] : field4351[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V")
    public static void method2413(int arg0) {
        try {
            if (arg0 != -21061) {
                field4349 = null;
            }
            field4343 = null;
            field4349 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4351[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lib;)V")
    public class295(class163 arg0) {
        try {
            this.method2411(-4, arg0);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4351[3] + (arg0 == null ? field4351[1] : field4351[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2414(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x63);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2415(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 91;
                    break;
                case 1:
                    var10005 = 64;
                    break;
                case 2:
                    var10005 = 94;
                    break;
                case 3:
                    var10005 = 45;
                    break;
                default:
                    var10005 = 99;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
