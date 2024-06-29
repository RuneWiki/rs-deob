import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class196 {

    @OriginalMember(owner = "client!qga", name = "i", descriptor = "Lwq;")
    private class178 field2621 = new class178(64);

    @OriginalMember(owner = "client!qga", name = "g", descriptor = "I")
    public int field2630 = 0;

    @OriginalMember(owner = "client!qga", name = "n", descriptor = "Lla;")
    private class476 field2629;

    @OriginalMember(owner = "client!qga", name = "l", descriptor = "I")
    public int field2619;

    @OriginalMember(owner = "client!qga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2633 = new String[] { method1674(method1673("7PZP\u0018n")), method1674(method1673("7PZP\u001an")), method1674(method1673("7PZP\u001cn")), method1674(method1673("7PZP\u001bn")), method1674(method1673("7PZP\u0019n")), method1674(method1673("7PZP\u001en")), method1674(method1673("7PZP\u0015n")), method1674(method1673("(BW\u0012")), method1674(method1673("7PZPa/YR\ncn")), method1674(method1673("=\u0019\u0015P ")), method1674(method1673("7PZP\u001fn")) };

    @OriginalMember(owner = "client!qga", name = "k", descriptor = "Lwia;")
    public static class790 field2626 = new class790(45, -1);

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "[Z")
    public static boolean[] field2631 = new boolean[8];

    @OriginalMember(owner = "client!qga", name = "j", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!qga", name = "f", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!qga", name = "h", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!qga", name = "m", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!qga", name = "e", descriptor = "[I")
    public static int[] field2632;

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "(I)V", line = 7)
    public static void method1665(int arg0) {
        try {
            field2631 = null;
            field2626 = null;
            field2632 = null;
            if (arg0 != 45) {
                field2631 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2633[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)V", line = 23)
    public static final void method1666(int arg0) {
        try {
            field2623++;
            for (int var1 = 0; var1 < class184.field2545.length; var1++) {
                for (int var2 = 0; var2 < class184.field2545[0].length; var2++) {
                    for (int var3 = 0; var3 < class184.field2545[0][0].length; var3++) {
                        class184.field2545[var1][var2][var3] = 0;
                    }
                }
            }
            if (arg0 != 28123) {
                method1666(88);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field2633[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "(I)V", line = 59)
    public static final void method1667(int arg0) {
        try {
            class3.field34 = arg0;
            field2625++;
            for (int var1 = 0; var1 < 2048; var1++) {
                class216.field3295[var1] = null;
                class459.field6686[var1] = 1;
                class176.field2458[var1] = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field2633[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IB)V", line = 80)
    public final void method1668(int arg0, byte arg1) {
        try {
            class178 var3 = this.field2621;
            synchronized (this.field2621) {
                this.field2621.method1557(arg0, (byte) -118);
            }
            field2624++;
            if (arg1 < 59) {
                this.field2630 = -103;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field2633[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)V", line = 93)
    public final void method1669(byte arg0) {
        try {
            if (arg0 <= 104) {
                this.method1671(42);
            }
            field2628++;
            class178 var2 = this.field2621;
            synchronized (this.field2621) {
                this.field2621.method1569(10574);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field2633[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(JII)Lgaa;", line = 108)
    public static final class313 method1670(long arg0, int arg1, int arg2) {
        try {
            int var4 = -121 / ((arg2 - 32) / 46);
            field2620++;
            class313 var5 = (class313) class728.field10554.method977((long) arg1 << 56 | arg0, 1);
            if (var5 == null) {
                var5 = new class313(arg1, arg0);
                class728.field10554.method968((byte) -111, var5.field3177, var5);
            }
            return var5;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field2633[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V", line = 130)
    public final void method1671(int arg0) {
        try {
            field2622++;
            class178 var2 = this.field2621;
            synchronized (this.field2621) {
                this.field2621.method1559(0);
            }
            if (arg0 >= -3) {
                this.field2621 = null;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field2633[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lto;ILla;)V", line = 149)
    public class196(class8 arg0, int arg1, class476 arg2) {
        try {
            this.field2629 = arg2;
            this.field2619 = this.field2629.method3646(4, (byte) -84);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field2633[8] + (arg0 == null ? field2633[7] : field2633[9]) + ',' + arg1 + ',' + (arg2 == null ? field2633[7] : field2633[9]) + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(II)Lap;", line = 167)
    public final class502 method1672(int arg0, int arg1) {
        try {
            field2627++;
            class178 var3 = this.field2621;
            class502 var4;
            synchronized (this.field2621) {
                var4 = (class502) this.field2621.method1558((byte) 96, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class476 var5 = this.field2629;
            byte[] var6;
            synchronized (this.field2629) {
                var6 = this.field2629.method3632(4, arg0, 36);
            }
            class502 var7 = new class502();
            var7.field7267 = arg0;
            var7.field7259 = this;
            if (arg1 != -2049) {
                return null;
            }
            if (var6 != null) {
                var7.method3784(new class163(var6), true);
            }
            var7.method3783((byte) 81);
            class178 var8 = this.field2621;
            synchronized (this.field2621) {
                this.field2621.method1556((long) arg0, var7, 1);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field2633[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1673(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1674(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 70;
                    break;
                case 1:
                    var10005 = 55;
                    break;
                case 2:
                    var10005 = 59;
                    break;
                case 3:
                    var10005 = 126;
                    break;
                default:
                    var10005 = 93;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
