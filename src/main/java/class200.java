import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class200 {

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public int field2922 = 0;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Z")
    public boolean field2917 = false;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public int field2915 = -1;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    private int field2927 = -1;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "Z")
    public boolean field2935 = true;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "[Ljava/lang/String;")
    public String[] field2910 = new String[5];

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public int field2916 = -1;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Z")
    public boolean field2907 = true;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    private int field2930 = -1;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public int field2909 = -1;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Z")
    public boolean field2906 = true;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "I")
    public int field2937 = -1;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    private int field2923 = -1;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    private int field2928 = -1;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "I")
    private int field2939 = -1;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field2908 = 0;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "Lg;")
    public static class67 field2936 = new class67(16);

    @OriginalMember(owner = "client!id", name = "K", descriptor = "Lth;")
    public static class57 field2941 = new class57(64);

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    public static int field2944 = 0;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2943 = Calendar.getInstance();

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    private int field2905;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public int field2911;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    private int field2913;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public int field2918;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    private int field2919;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public int field2921;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public int field2925;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public int field2931;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    private int field2933;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "I")
    public int field2934;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "Ljava/lang/String;")
    public String field2920;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "Ljava/lang/String;")
    public String field2929;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "[I")
    public int[] field2932;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Lwi;", line = 9)
    public final class234 method1453(byte arg0) {
        if (arg0 != 116) {
            return (class234) null;
        }
        field2924++;
        class234 var2 = (class234) class357.field5473.method461((byte) 120, (long) (this.field2923 | 0x20000));
        if (var2 != null) {
            return var2;
        }
        class312.field4641.method2514((byte) 82, this.field2923);
        class234 var3 = class296.method2110(0, class312.field4641, (byte) 111, this.field2923);
        if (var3 != null) {
            var3.field3708 = 0;
            var3.field3713 = var3.field3716;
            var3.field3719 = var3.field3715;
            var3.field3711 = 0;
            class357.field5473.method460(var3, arg0 - 26205, (long) (this.field2923 | 0x20000));
        }
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 46)
    public static void method1454(int arg0) {
        field2941 = null;
        field2943 = null;
        field2936 = null;
        if (arg0 != -1) {
            field2944 = -105;
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)Z", line = 58)
    public final boolean method1455(int arg0) {
        if (arg0 <= 86) {
            return false;
        }
        field2940++;
        if (this.field2930 == -1 && this.field2939 == -1) {
            return true;
        }
        boolean var2 = false;
        int var3;
        if (this.field2930 == -1) {
            var3 = class144.method1033(1, this.field2939);
        } else {
            var3 = class227.field3423[this.field2930];
        }
        if (this.field2919 > var3 || this.field2905 < var3) {
            return false;
        } else if (this.field2928 == -1 && this.field2927 == -1) {
            return true;
        } else {
            boolean var4 = false;
            int var5;
            if (this.field2928 == -1) {
                var5 = class144.method1033(1, this.field2927);
            } else {
                var5 = class227.field3423[this.field2928];
            }
            return var5 >= this.field2933 && this.field2913 >= var5;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIBI)I", line = 112)
    public static final int method1456(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = 65536 - class345.field5343[arg0 * 1024 / arg1] >> 1;
        field2912++;
        if (arg3 != 5) {
            field2941 = (class57) null;
        }
        return ((65536 - var5) * arg4 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lsb;I)V", line = 124)
    public final void method1457(class190 arg0, int arg1) {
        if (arg1 != -1) {
            this.method1453((byte) 25);
        }
        field2938++;
        while (true) {
            int var3 = arg0.method1319(arg1 + 256);
            if (var3 == 0) {
                return;
            }
            this.method1458(arg0, arg1 + 69, var3);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lsb;II)V", line = 154)
    private final void method1458(class190 arg0, int arg1, int arg2) {
        field2942++;
        int var4 = -2 % ((arg1 + 21) / 53);
        if (arg2 == 1) {
            this.field2916 = arg0.method1317((byte) 39);
        } else if (arg2 == 2) {
            this.field2937 = arg0.method1317((byte) 56);
        } else if (arg2 == 3) {
            this.field2920 = arg0.method1329((byte) 59);
        } else if (arg2 == 4) {
            this.field2931 = arg0.method1312(69);
        } else if (arg2 == 5) {
            this.field2909 = arg0.method1312(117);
        } else if (arg2 == 6) {
            this.field2922 = arg0.method1319(255);
        } else if (arg2 == 7) {
            int var5 = arg0.method1319(255);
            if ((var5 & 0x2) == 2) {
                this.field2917 = true;
            }
            if ((var5 & 0x1) == 0) {
                this.field2906 = false;
            }
        } else if (arg2 == 8) {
            this.field2907 = arg0.method1319(255) == 1;
        } else if (arg2 == 9) {
            this.field2939 = arg0.method1317((byte) 55);
            if (this.field2939 == 65535) {
                this.field2939 = -1;
            }
            this.field2930 = arg0.method1317((byte) 82);
            if (this.field2930 == 65535) {
                this.field2930 = -1;
            }
            this.field2919 = arg0.method1371(-4);
            this.field2905 = arg0.method1371(-4);
        } else if (arg2 >= 10 && arg2 <= 14) {
            this.field2910[arg2 - 10] = arg0.method1329((byte) 59);
        } else if (arg2 == 15) {
            int var6 = arg0.method1319(255);
            this.field2932 = new int[var6 * 2];
            for (int var7 = 0; var7 < (var6 * 2); var7++) {
                this.field2932[var7] = arg0.method1347((byte) 61);
            }
            this.field2925 = arg0.method1371(-4);
            this.field2911 = arg0.method1371(-4);
        } else if (arg2 == 16) {
            this.field2935 = false;
        } else if (arg2 == 17) {
            this.field2929 = arg0.method1329((byte) 59);
        } else if (arg2 == 18) {
            this.field2923 = arg0.method1317((byte) 53);
        } else if (arg2 == 19) {
            this.field2915 = arg0.method1317((byte) 76);
        } else if (arg2 == 20) {
            this.field2927 = arg0.method1317((byte) 73);
            if (this.field2927 == 65535) {
                this.field2927 = -1;
            }
            this.field2928 = arg0.method1317((byte) 110);
            if (this.field2928 == 65535) {
                this.field2928 = -1;
            }
            this.field2933 = arg0.method1371(-4);
            this.field2913 = arg0.method1371(-4);
        } else if (arg2 == 21) {
            this.field2918 = arg0.method1371(-4);
        } else if (arg2 == 22) {
            this.field2934 = arg0.method1371(-4);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 294)
    public static final String[] method1459(int arg0, String[] arg1) {
        String[] var2 = new String[5];
        for (int var3 = arg0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        field2926++;
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZBZ)Lmo;", line = 318)
    public final class250 method1460(boolean arg0, byte arg1, boolean arg2) {
        field2914++;
        int var4 = arg0 ? this.field2937 : this.field2916;
        class250 var5 = (class250) class357.field5473.method461((byte) 120, (long) ((arg0 ? 65536 : 0) | var4));
        if (var5 != null) {
            return var5;
        }
        int var6 = 28 % ((68 - arg1) / 58);
        if (!class312.field4641.method2514((byte) 85, var4)) {
            return null;
        }
        class234 var7 = class296.method2110(0, class312.field4641, (byte) 98, var4);
        class250 var8;
        if (class141.field2031 && !arg2) {
            var8 = new class204(var7);
        } else {
            var8 = var7;
        }
        if (var8 != null) {
            var8.field3719 = var8.field3715;
            var8.field3711 = 0;
            var8.field3713 = var8.field3716;
            var8.field3708 = 0;
            class357.field5473.method460(var8, -26089, (long) ((arg0 ? 65536 : 0) | var4));
        }
        return var8;
    }
}
