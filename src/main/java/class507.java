import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class507 {

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "Lrp;")
    private class288 field7649 = new class288(64);

    @OriginalMember(owner = "client!mo", name = "x", descriptor = "Lrp;")
    public class288 field7672 = new class288(50);

    @OriginalMember(owner = "client!mo", name = "y", descriptor = "Ldf;")
    public class264 field7673 = new class264(250);

    @OriginalMember(owner = "client!mo", name = "z", descriptor = "Lrq;")
    private class224 field7674 = new class224();

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "Llt;")
    public class458 field7660;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "Z")
    private boolean field7661;

    @OriginalMember(owner = "client!mo", name = "B", descriptor = "Lwb;")
    private class207 field7676;

    @OriginalMember(owner = "client!mo", name = "u", descriptor = "I")
    public int field7669;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "Llt;")
    private class458 field7652;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
    public int field7659;

    @OriginalMember(owner = "client!mo", name = "C", descriptor = "[Ljava/lang/String;")
    private String[] field7677;

    @OriginalMember(owner = "client!mo", name = "A", descriptor = "[Ljava/lang/String;")
    private String[] field7675;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "Lft;")
    public static class4 field7655 = new class4();

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
    public static int field7667 = -1;

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "Loe;")
    public static class127 field7666 = new class127(64, 1);

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field7650;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!mo", name = "w", descriptor = "I")
    public static int field7671;

    @OriginalMember(owner = "client!mo", name = "D", descriptor = "I")
    public int field7678;

    @OriginalMember(owner = "client!mo", name = "v", descriptor = "Llc;")
    public static class440 field7670;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)V")
    public final void method3024(int arg0, int arg1) {
        class288 var3 = this.field7649;
        synchronized (this.field7649) {
            this.field7649.method1760(arg0, 30398);
            int var4 = 14 % ((arg1 + 50) / 62);
        }
        field7671++;
        class288 var5 = this.field7672;
        synchronized (this.field7672) {
            this.field7672.method1760(arg0, 30398);
        }
        class264 var6 = this.field7673;
        synchronized (this.field7673) {
            this.field7673.method1608(arg0, 544);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
    public final void method3025(int arg0) {
        class288 var2 = this.field7672;
        synchronized (this.field7672) {
            if (arg0 != 1) {
                this.field7677 = null;
            }
            this.field7672.method1761(-108);
        }
        field7662++;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
    public final void method3026(int arg0) {
        class288 var2 = this.field7649;
        synchronized (this.field7649) {
            this.field7649.method1749((byte) -118);
        }
        field7653++;
        class288 var3 = this.field7672;
        synchronized (this.field7672) {
            this.field7672.method1749((byte) -64);
            if (arg0 != 21632) {
                this.method3031(95, 125);
            }
        }
        class264 var4 = this.field7673;
        synchronized (this.field7673) {
            this.field7673.method1614(false);
        }
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)V")
    public final void method3027(int arg0) {
        class288 var2 = this.field7649;
        synchronized (this.field7649) {
            this.field7649.method1761(-109);
            if (arg0 >= -86) {
                this.field7669 = -85;
            }
        }
        field7651++;
        class288 var3 = this.field7672;
        synchronized (this.field7672) {
            this.field7672.method1761(-128);
        }
        class264 var4 = this.field7673;
        synchronized (this.field7673) {
            this.field7673.method1603(124);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIBLqq;IILeu;I)Lig;")
    public final class154 method3028(int arg0, int arg1, byte arg2, class318 arg3, int arg4, int arg5, class320 arg6, int arg7) {
        this.field7674.field3444 = arg7;
        this.field7674.field3446 = arg1;
        this.field7674.field3456 = arg3.field4787;
        if (arg2 <= 66) {
            return null;
        }
        this.field7674.field3455 = arg4;
        this.field7674.field3451 = arg5;
        field7654++;
        this.field7674.field3445 = arg0;
        this.field7674.field3453 = arg6 != null;
        return (class154) this.field7673.method1605((byte) -5, this.field7674);
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(I)V")
    public final void method3029(int arg0) {
        field7650++;
        class264 var2 = this.field7673;
        synchronized (this.field7673) {
            this.field7673.method1603(-106);
            if (arg0 != 1064) {
                this.field7652 = null;
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)Lbq;")
    public final class182 method3030(byte arg0, int arg1) {
        field7665++;
        class288 var3 = this.field7649;
        class182 var4;
        synchronized (this.field7649) {
            var4 = (class182) this.field7649.method1752(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field7652.method2715(class277.method1692((byte) -124, arg1), class361.method2196(arg1, (byte) 43), false);
        class182 var6 = new class182();
        var6.field2893 = arg1;
        var6.field2857 = this;
        var6.field2876 = new String[] { null, null, class487.field7422.method2473(this.field7669, -115), null, null };
        if (arg0 <= 48) {
            return null;
        }
        var6.field2880 = new String[] { null, null, null, null, class53.field799.method2473(this.field7669, -116) };
        if (var5 != null) {
            var6.method1129(new class40(var5), (byte) 127);
        }
        var6.method1137((byte) 98);
        if (var6.field2856 != -1) {
            var6.method1131((byte) 86, this.method3030((byte) 94, var6.field2856), this.method3030((byte) 68, var6.field2859));
        }
        if (var6.field2848 != -1) {
            var6.method1139((byte) -1, this.method3030((byte) 83, var6.field2901), this.method3030((byte) 89, var6.field2848));
        }
        if (!this.field7661 && var6.field2860) {
            var6.field2829 = class353.field5182.method2473(this.field7669, -86);
            var6.field2880 = this.field7675;
            var6.field2876 = this.field7677;
            var6.field2849 = false;
            var6.field2835 = 0;
            var6.field2836 = null;
            if (var6.field2843 != null) {
                boolean var7 = false;
                for (class179 var8 = var6.field2843.method2415((byte) 22); var8 != null; var8 = var6.field2843.method2416((byte) -120)) {
                    class85 var9 = this.field7676.method1267((byte) 41, (int) var8.field2798);
                    if (var9.field1434) {
                        var8.method1121(false);
                    } else {
                        var7 = true;
                    }
                }
                if (!var7) {
                    var6.field2843 = null;
                }
            }
        }
        class288 var10 = this.field7649;
        synchronized (this.field7649) {
            this.field7649.method1758(1, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)V")
    public final void method3031(int arg0, int arg1) {
        this.field7678 = arg1;
        if (arg0 != 0) {
            return;
        }
        field7658++;
        class288 var3 = this.field7672;
        synchronized (this.field7672) {
            this.field7672.method1761(-119);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZB)V")
    public final void method3032(boolean arg0, byte arg1) {
        field7668++;
        if (this.field7661 != arg0) {
            this.field7661 = arg0;
            this.method3027(-105);
            int var3 = -62 / ((arg1 + 79) / 37);
        }
    }

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "(I)V")
    public static final void method3033(int arg0) {
        field7664++;
        class230.field3508.field585 = 0;
        class60.field1014 = 0;
        class461.field7090 = null;
        class54.field827 = 0;
        class65.field1067 = 0;
        class257.field3918 = null;
        class374.field5459 = null;
        class491.field7457.field585 = 0;
        class348.field5138 = null;
        class359.method2191((byte) 60);
        class110.method791((byte) 29);
        for (int var1 = 0; var1 < 2048; var1++) {
            class224.field3450[var1] = null;
        }
        class286.field4329 = null;
        int var2 = 0;
        if (arg0 != -1) {
            return;
        }
        while (var2 < class195.field3085.length) {
            class249 var4 = class195.field3085[var2];
            if (var4 != null) {
                var4.field2148 = -1;
            }
            var2++;
        }
        class239.method1430(-106);
        class408.field5928 = 1;
        class189.method1196(30, -12254);
        for (int var3 = 0; var3 < 100; var3++) {
            class77.field1376[var3] = true;
        }
        class41.method291((byte) 57);
        class306.field4644 = 0L;
        class221.field3420 = null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Leu;IIILwn;IZBIZLqq;Lqq;)Lig;")
    public final class154 method3034(class320 arg0, int arg1, int arg2, int arg3, class488 arg4, int arg5, boolean arg6, byte arg7, int arg8, boolean arg9, class318 arg10, class318 arg11) {
        if (arg7 >= -51) {
            field7666 = null;
        }
        field7656++;
        class154 var13 = this.method3028(arg8, arg3, (byte) 83, arg10, arg5, arg2, arg0, arg1);
        if (var13 != null) {
            return var13;
        }
        class182 var14 = this.method3030((byte) 118, arg2);
        if (arg5 > 1 && var14.field2875 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (arg5 >= var14.field2832[var16] && var14.field2832[var16] != 0) {
                    var15 = var14.field2875[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method3030((byte) 73, var15);
            }
        }
        int[] var17 = var14.method1128(arg11, (byte) 91, arg10, arg4, arg9, arg5, arg1, arg8, arg0, arg3);
        if (var17 == null) {
            return null;
        }
        class154 var18;
        if (arg6) {
            var18 = arg11.method1924(var17, 0, 36, 36, 32);
        } else {
            var18 = arg10.method1924(var17, 0, 36, 36, 32);
        }
        if (!arg6) {
            class224 var19 = new class224();
            var19.field3453 = arg0 != null;
            var19.field3445 = arg8;
            var19.field3455 = arg5;
            var19.field3456 = arg10.field4787;
            var19.field3451 = arg2;
            var19.field3444 = arg1;
            var19.field3446 = arg3;
            this.field7673.method1611(var19, 1, var18);
        }
        return var18;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
    public static final void method3035(byte arg0) {
        field7663++;
        for (class76 var1 = (class76) class170.field2648.method8((byte) -98); var1 != null; var1 = (class76) class170.field2648.method17((byte) -77)) {
            if (var1.field1360 > 0) {
                var1.field1360--;
            }
            if (var1.field1360 != 0) {
                if (var1.field1363 > 0) {
                    var1.field1363--;
                }
                if (var1.field1363 == 0 && var1.field1367 >= 1 && var1.field1359 >= 1 && class150.field2422 - 2 >= var1.field1367 && var1.field1359 <= class21.field272 - 2 && (var1.field1365 < 0 || class379.method2281(var1.field1365, var1.field1361, true))) {
                    class408.method2419(var1.field1359, var1.field1361, var1.field1355, var1.field1358, var1.field1365, (byte) -70, var1.field1356, -1, var1.field1367);
                    var1.field1363 = -1;
                    if (var1.field1365 == var1.field1357 && var1.field1357 == -1) {
                        var1.method1121(false);
                    } else if (var1.field1365 == var1.field1357 && var1.field1362 == var1.field1358 && var1.field1368 == var1.field1361) {
                        var1.method1121(false);
                    }
                }
            } else if (var1.field1357 < 0 || class379.method2281(var1.field1357, var1.field1368, true)) {
                class408.method2419(var1.field1359, var1.field1368, var1.field1355, var1.field1362, var1.field1357, (byte) -117, var1.field1356, -1, var1.field1367);
                var1.method1121(false);
            }
        }
        if (arg0 != -103) {
            field7667 = 33;
        }
    }

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)V")
    public static void method3036(int arg0) {
        field7655 = null;
        if (arg0 != -1) {
            method3033(-95);
        }
        field7670 = null;
        field7666 = null;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lcm;IZLwb;Llt;Llt;)V")
    public class507(class491 arg0, int arg1, boolean arg2, class207 arg3, class458 arg4, class458 arg5) {
        this.field7660 = arg5;
        this.field7661 = arg2;
        this.field7676 = arg3;
        this.field7669 = arg1;
        this.field7652 = arg4;
        if (this.field7652 == null) {
            this.field7659 = 0;
        } else {
            int var7 = this.field7652.method2738((byte) 109) - 1;
            this.field7659 = var7 * 256 + this.field7652.method2726((byte) 113, var7);
        }
        this.field7677 = new String[] { null, null, class487.field7422.method2473(this.field7669, -101), null, null };
        this.field7675 = new String[] { null, null, null, null, class53.field799.method2473(this.field7669, -96) };
    }
}
