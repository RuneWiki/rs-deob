import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oja")
public class class477 {

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "Lla;")
    private class476 field6943;

    @OriginalMember(owner = "client!oja", name = "j", descriptor = "Lla;")
    private class476 field6947;

    @OriginalMember(owner = "client!oja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6954 = new String[] { method3658(method3657("YIl\u0014\u0006\u001e")), method3658(method3657("M\r#\u0014=")), method3658(method3657("YIl\u0014|_MdN~\u001e")), method3658(method3657("XVaV")), method3658(method3657("YIl\u0014\u0004\u001e")), method3658(method3657("YIl\u0014\u0005\u001e")), method3658(method3657("YIl\u0014\u0002\u001e")), method3658(method3657("YIl\u0014\u0003\u001e")), method3658(method3657("YIl\u0014\u0001\u001e")) };

    @OriginalMember(owner = "client!oja", name = "k", descriptor = "Lwia;")
    public static class790 field6949 = new class790(82, 1);

    @OriginalMember(owner = "client!oja", name = "c", descriptor = "Lel;")
    public static class573 field6951 = new class573(20, 7);

    @OriginalMember(owner = "client!oja", name = "e", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!oja", name = "i", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!oja", name = "f", descriptor = "I")
    public static int field6946;

    @OriginalMember(owner = "client!oja", name = "b", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!oja", name = "d", descriptor = "I")
    public static int field6950;

    @OriginalMember(owner = "client!oja", name = "h", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!oja", name = "g", descriptor = "Lsca;")
    private class50 field6953;

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(BI)I", line = 5)
    public static final int method3651(byte arg0, int arg1) {
        try {
            field6952++;
            int var2 = -84 % ((-arg0 - 15) / 61);
            return arg1 & 0xFF;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6954[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(ILjl;)Lfu;", line = 19)
    public final class410 method3652(int arg0, class285 arg1) {
        try {
            field6950++;
            if (arg1 == null) {
                return null;
            }
            class494 var3 = arg1.method1226(arg0 - 126);
            if (class494.field7099 == var3) {
                return new class787((class668) arg1);
            } else if (class149.field1834 == var3) {
                return new class47(this.method3655(19579), (class783) arg1);
            } else if (class625.field9136 == var3) {
                return new class387(this.field6947, (class145) arg1);
            } else if (class67.field710 == var3) {
                return new class85(this.field6947, (class630) arg1);
            } else if (class417.field6138 == var3) {
                return new class27(this.field6947, this.field6943, (class738) arg1);
            } else if (class235.field3540 == var3) {
                return new class484(this.field6947, this.field6943, (class265) arg1);
            } else if (class638.field9279 == var3) {
                return new class315(this.field6947, this.field6943, (class358) arg1);
            } else if (class724.field10464 == var3) {
                return new class507(this.field6947, this.field6943, (class538) arg1);
            } else if (class759.field11002 == var3) {
                return new class422(this.field6947, (class610) arg1);
            } else if (arg0 == 4) {
                return class544.field8132 == var3 ? new class533(this.field6947, this.field6943, (class669) arg1) : null;
            } else {
                return null;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6954[7] + arg0 + ',' + (arg1 == null ? field6954[3] : field6954[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(II)V", line = 71)
    public static final void method3653(int arg0, int arg1) {
        try {
            field6948++;
            if (arg0 != 3650) {
                field6945 = 15;
            }
            class28.field347 = arg1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6954[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(B)V", line = 84)
    public static void method3654(byte arg0) {
        try {
            if (arg0 != 7) {
                method3656(8, null);
            }
            field6951 = null;
            field6949 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6954[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(I)Lsca;", line = 96)
    private final class50 method3655(int arg0) {
        try {
            field6944++;
            if (this.field6953 == null) {
                this.field6953 = new class50();
            }
            if (arg0 != 19579) {
                this.field6943 = null;
            }
            return this.field6953;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6954[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(ILtia;)[I", line = 116)
    public static final int[] method3656(int arg0, class280 arg1) {
        try {
            field6946++;
            class163 var2 = new class163(518);
            int[] var3 = new int[4];
            for (int var4 = 0; var4 < 4; var4++) {
                var3[var4] = (int) (Math.random() * 9.9999999E7D);
            }
            var2.method1428((byte) -24, 10);
            var2.method1412(true, var3[0]);
            var2.method1412(true, var3[1]);
            var2.method1412(true, var3[2]);
            var2.method1412(true, var3[3]);
            if (arg0 != -24197) {
                method3653(45, 20);
            }
            for (int var5 = 0; var5 < 10; var5++) {
                var2.method1412(true, (int) (Math.random() * 9.9999999E7D));
            }
            var2.method1406((int) (Math.random() * 9.9999999E7D), 380332136);
            var2.method1420(class77.field886, (byte) 109, class298.field4702);
            arg1.field4197.method1454(var2.field2201, 0, var2.field2209, (byte) 91);
            return var3;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field6954[6] + arg0 + ',' + (arg1 == null ? field6954[3] : field6954[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!oja", name = "<init>", descriptor = "(Lla;Lla;)V", line = 157)
    public class477(class476 arg0, class476 arg1) {
        try {
            this.field6943 = arg1;
            this.field6947 = arg0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6954[2] + (arg0 == null ? field6954[3] : field6954[1]) + ',' + (arg1 == null ? field6954[3] : field6954[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!oja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3657(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x40);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3658(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 54;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 13;
                    break;
                case 3:
                    var10005 = 58;
                    break;
                default:
                    var10005 = 64;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
