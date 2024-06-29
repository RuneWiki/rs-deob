import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public abstract class class182 extends class134 {

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "Z")
    public boolean field2896;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "[Ljj;")
    public class182[] field2909;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "[[B")
    public static byte[][] field2894 = new byte[1000][];

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "I")
    public static int field2900 = 2301979;

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "Ljava/lang/String;")
    public static String field2906 = "flash1:";

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "[I")
    public static int[] field2916 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    public int field2913;

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "Ldb;")
    public class13 field2911;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "Lch;")
    public class7 field2905;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)I")
    public int method1321(int arg0) {
        field2914++;
        if (arg0 != -1) {
            this.method469(1);
        }
        return -1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZLab;I)V")
    public void method155(boolean arg0, class249 arg1, int arg2) {
        if (!arg0) {
            field2919++;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)[I")
    public int[] method153(boolean arg0, int arg1) {
        field2907++;
        if (arg0) {
            this.field2913 = 76;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1322(int arg0, String arg1, int arg2) {
        field2899++;
        boolean var3 = false;
        for (int var4 = 0; var4 < class154.field2553; var4++) {
            class123 var5 = class15.field300[class162.field2627[var4]];
            if (var5 != null && var5.field2069 != null && var5.field2069.equalsIgnoreCase(arg1)) {
                if (arg2 == 1) {
                    class76.field1295++;
                    class236.field3980.method640((byte) 97, 229);
                    class236.field3980.method1822(class162.field2627[var4], 554582280);
                    class236.field3980.method1780(0, 124);
                } else if (arg2 == 4) {
                    class236.field3980.method640((byte) 97, 180);
                    class236.field3980.method1822(class162.field2627[var4], 554582280);
                    class55.field979++;
                    class236.field3980.method1782(0, -1);
                } else if (arg2 == 5) {
                    class236.field3980.method640((byte) 97, 175);
                    class226.field3828++;
                    class236.field3980.method1813(-1694, 0);
                    class236.field3980.method1771(class162.field2627[var4], (byte) 30);
                } else if (arg2 == 6) {
                    class236.field3980.method640((byte) 97, 207);
                    class269.field4466++;
                    class236.field3980.method1782(0, -1);
                    class236.field3980.method1778(class162.field2627[var4], -13989);
                } else if (arg2 == 7) {
                    class236.field3980.method640((byte) 97, 32);
                    class236.field3980.method1790(class162.field2627[var4], -127);
                    class232.field3927++;
                    class236.field3980.method1782(0, -1);
                }
                var3 = true;
                break;
            }
        }
        int var6 = -44 / (-arg0 / 60);
        if (!var3) {
            class42.method248((byte) -124, class181.field2880 + arg1);
        }
    }

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "(I)V")
    public void method469(int arg0) {
        field2895++;
        if (arg0 != -1) {
            this.method157((byte) 76, -42);
        }
    }

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "(I)I")
    public int method461(int arg0) {
        if (arg0 >= -111) {
            return -108;
        } else {
            field2917++;
            return -1;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)[[I")
    public int[][] method157(byte arg0, int arg1) {
        int var3 = -121 / ((arg0 + 64) / 49);
        field2915++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)[I")
    public final int[] method1323(int arg0, int arg1, int arg2) {
        field2897++;
        if (arg1 != -17707) {
            this.method153(false, 68);
        }
        return this.field2909[arg0].field2896 ? this.field2909[arg0].method153(false, arg2) : this.field2909[arg0].method157((byte) 18, arg2)[0];
    }

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "(I)V")
    public void method462(int arg0) {
        if (this.field2896) {
            this.field2911.method74(true);
            this.field2911 = null;
        } else {
            this.field2905.method48((byte) 47);
            this.field2905 = null;
        }
        if (arg0 < 34) {
            field2898 = 18;
        }
        field2904++;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(III)V")
    public final void method1324(int arg0, int arg1, int arg2) {
        field2912++;
        int var4 = ~this.field2913 == arg0 ? arg1 : this.field2913;
        if (this.field2896) {
            this.field2911 = new class13(var4, arg1, arg2);
        } else {
            this.field2905 = new class7(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static void method1325(byte arg0) {
        if (arg0 >= -8) {
            method1322(-78, (String) null, 71);
        }
        field2894 = null;
        field2916 = null;
        field2906 = null;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(IZ)V")
    public class182(int arg0, boolean arg1) {
        this.field2896 = arg1;
        this.field2909 = new class182[arg0];
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lvd;III)V")
    public static final void method1326(class307 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field761 == arg1 && arg1 != -1) {
            class163 var4 = class34.method211(arg1, 3);
            int var5 = var4.field2658;
            if (var5 == 1) {
                arg0.field731 = 1;
                arg0.field784 = 0;
                arg0.field804 = 0;
                arg0.field791 = arg2;
                arg0.field719 = 0;
                class131.method980(false, arg0.field771, arg0.field715, arg0.field719, (byte) -65, var4);
            }
            if (var5 == 2) {
                arg0.field804 = 0;
            }
        } else if (arg1 == -1 || arg0.field761 == -1 || class34.method211(arg1, 3).field2662 >= class34.method211(arg0.field761, 3).field2662) {
            arg0.field731 = 1;
            arg0.field761 = arg1;
            arg0.field719 = 0;
            arg0.field791 = arg2;
            arg0.field804 = 0;
            arg0.field784 = 0;
            arg0.field755 = arg0.field730;
            if (arg0.field761 != -1) {
                class131.method980(false, arg0.field771, arg0.field715, arg0.field719, (byte) -61, class34.method211(arg0.field761, arg3 ^ 0xE6));
            }
        }
        if (arg3 == 229) {
            field2910++;
        }
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(III)[[I")
    public final int[][] method1327(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field2906 = null;
        }
        field2918++;
        if (this.field2909[arg1].field2896) {
            int[] var4 = this.field2909[arg1].method153(false, arg2);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field2909[arg1].method157((byte) -128, arg2);
        }
    }
}
