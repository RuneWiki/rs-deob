import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class172 {

    @OriginalMember(owner = "client!pha", name = "e", descriptor = "Lwc;")
    private class71 field2750 = new class71();

    @OriginalMember(owner = "client!pha", name = "l", descriptor = "Ljava/lang/String;")
    public String field2753;

    @OriginalMember(owner = "client!pha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2761 = new String[] { method1594(method1593("~\u001e\u0005\u001c")), method1594(method1593("kEG^7")), method1594(method1593("`\u0003\b^\u00028")), method1594(method1593("`\u0003\b^\u000b8")), method1594(method1593("`\u0003\b^\b8")), method1594(method1593("`\u0003\b^\u000e8")), method1594(method1593("`\u0003\b^\f8")), method1594(method1593("`\u0003\b^\t8")), method1594(method1593("`\u0003\b^vy\u0005\u0000\u0004t8")), method1594(method1593("`\u0003\b^\u000f8")), method1594(method1593("`\u0003\b^\r8")) };

    @OriginalMember(owner = "client!pha", name = "p", descriptor = "S")
    public static short field2752 = 205;

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "Lvn;")
    public static class330 field2751 = new class330(8, -1);

    @OriginalMember(owner = "client!pha", name = "j", descriptor = "[[I")
    public static int[][] field2758 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!pha", name = "h", descriptor = "I")
    public static int field2759 = 0;

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "F")
    public static float field2757;

    @OriginalMember(owner = "client!pha", name = "m", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!pha", name = "i", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!pha", name = "k", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!pha", name = "g", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!pha", name = "f", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!pha", name = "c", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!pha", name = "n", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!pha", name = "o", descriptor = "I")
    private volatile int field2760;

    @OriginalMember(owner = "client!pha", name = "d", descriptor = "Lpp;")
    private class415 field2755;

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(ILpp;)V", line = 3)
    public final void method1585(int arg0, class415 arg1) {
        try {
            if (arg0 == -14053) {
                this.field2755 = arg1;
                field2754++;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2761[6] + arg0 + ',' + (arg1 == null ? field2761[0] : field2761[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(I)V", line = 14)
    public static void method1586(int arg0) {
        try {
            field2751 = null;
            if (arg0 == 9) {
                field2758 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2761[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(Lrda;Z)V", line = 27)
    public final void method1587(class693 arg0, boolean arg1) {
        try {
            arg0.field9971 = arg1;
            field2746++;
            class71 var3 = this.field2750;
            synchronized (this.field2750) {
                this.field2750.method748(65, arg0);
                this.field2760++;
            }
            if (this.field2755 != null) {
                class415 var4 = this.field2755;
                synchronized (this.field2755) {
                    this.field2755.notify();
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2761[9] + (arg0 == null ? field2761[0] : field2761[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(IBI)Z", line = 46)
    public static final boolean method1588(int arg0, byte arg1, int arg2) {
        try {
            if (arg1 <= 4) {
                method1588(-110, (byte) -128, 38);
            }
            field2748++;
            return (arg2 & 0x20) != 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2761[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(Lrda;B)V", line = 58)
    public final void method1589(class693 arg0, byte arg1) {
        try {
            arg0.field9971 = true;
            if (arg1 > 102) {
                field2756++;
                class71 var3 = this.field2750;
                synchronized (this.field2750) {
                    this.field2750.method748(55, arg0);
                    this.field2760++;
                }
                if (this.field2755 != null) {
                    class415 var4 = this.field2755;
                    synchronized (this.field2755) {
                        this.field2755.notify();
                    }
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2761[2] + (arg0 == null ? field2761[0] : field2761[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "(I)Z", line = 80)
    public final boolean method1590(int arg0) {
        try {
            field2747++;
            if (arg0 == 3) {
                return this.field2760 == 0;
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2761[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(ILjw;)V", line = 95)
    public final void method1591(int arg0, class581 arg1) {
        try {
            class71 var3 = this.field2750;
            synchronized (this.field2750) {
                if (arg0 != 8) {
                    field2757 = -0.644506F;
                }
                this.field2750.method748(arg0 - 135, arg1);
                this.field2760++;
            }
            field2745++;
            if (this.field2755 != null) {
                class415 var4 = this.field2755;
                synchronized (this.field2755) {
                    this.field2755.notify();
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field2761[5] + arg0 + ',' + (arg1 == null ? field2761[0] : field2761[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(Z)Lhga;", line = 120)
    public final class182 method1592(boolean arg0) {
        try {
            field2749++;
            Object var2 = null;
            class71 var3 = this.field2750;
            class182 var4;
            synchronized (this.field2750) {
                var4 = this.field2750.method749(0);
                var4.method1715(-20685);
                this.field2760--;
            }
            return arg0 ? var4 : null;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field2761[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 160)
    public class172(String arg0) {
        try {
            this.field2753 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2761[8] + (arg0 == null ? field2761[0] : field2761[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!pha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1593(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1594(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 16;
                    break;
                case 1:
                    var10005 = 107;
                    break;
                case 2:
                    var10005 = 105;
                    break;
                case 3:
                    var10005 = 112;
                    break;
                default:
                    var10005 = 74;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
