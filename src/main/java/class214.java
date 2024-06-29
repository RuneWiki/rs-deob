import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class214 extends class232 {

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "Lhi;")
    public static class82 field3726 = class95.method664((byte) -48, "(U2");

    @OriginalMember(owner = "client!ek", name = "T", descriptor = "Lhi;")
    private static class82 field3730 = class95.method664((byte) -118, "Loaded textures");

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "Lhi;")
    public static class82 field3727 = field3730;

    @OriginalMember(owner = "client!ek", name = "X", descriptor = "Lhi;")
    public static class82 field3734 = class95.method664((byte) -25, "gleiten:");

    @OriginalMember(owner = "client!ek", name = "Y", descriptor = "[I")
    public static int[] field3735 = new int[5];

    @OriginalMember(owner = "client!ek", name = "cb", descriptor = "Lhi;")
    public static class82 field3739 = class95.method664((byte) -101, "::tele ");

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!ek", name = "V", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!ek", name = "W", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!ek", name = "Z", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!ek", name = "ab", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!ek", name = "bb", descriptor = "Z")
    public static boolean field3738;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBLbc;)V", line = 22)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg0 == 0) {
            this.field3990 = arg2.method1082(-101) == 1;
        }
        if (arg1 != -19) {
            method1528(111);
        }
        field3729++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)[[I", line = 41)
    public final int[][] method146(int arg0, byte arg1) {
        int[][] var3 = this.field3996.method136(0, arg0);
        if (arg1 != -82) {
            this.method80(-57, (byte) -19);
        }
        field3728++;
        if (this.field3996.field278) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class54.field858; var7++) {
                this.method1530(arg0, 26868, var7);
                int[][] var8 = this.method1641(0, class227.field3939, (byte) -98);
                var4[var7] = var8[0][class234.field4083];
                var5[var7] = var8[1][class234.field4083];
                var6[var7] = var8[2][class234.field4083];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(IB)[I", line = 85)
    public final int[] method80(int arg0, byte arg1) {
        int var3 = 81 / ((-arg1 - 31) / 55);
        int[] var4 = this.field4008.method131((byte) -119, arg0);
        field3737++;
        if (this.field4008.field256) {
            for (int var5 = 0; var5 < class54.field858; var5++) {
                this.method1530(arg0, 26868, var5);
                int[] var6 = this.method1649(0, (byte) 102, class227.field3939);
                var4[var5] = var6[class234.field4083];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "(I)V", line = 115)
    public static void method1528(int arg0) {
        field3735 = null;
        field3726 = null;
        field3727 = null;
        field3739 = null;
        field3734 = null;
        if (arg0 != -12218) {
            method1528(89);
        }
        field3730 = null;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)V", line = 130)
    public static final void method1529(byte arg0) {
        field3732++;
        for (class146 var1 = (class146) class191.field3195.method502((byte) -104); var1 != null; var1 = (class146) class191.field3195.method494(true)) {
            int var2 = var1.field2474;
            if (class113.method777((byte) 90, var2)) {
                class75[] var3 = class277.field4660[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field1136;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field2418;
                    class75 var7 = class282.method1965(var6, (byte) 6);
                    if (var7 != null) {
                        class138.method937(var7, 16);
                    }
                }
            }
        }
        if (arg0 <= 19) {
            method1528(64);
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(III)V", line = 197)
    private final void method1530(int arg0, int arg1, int arg2) {
        int var4 = class24.field329[arg2];
        field3731++;
        int var5 = class273.field4607[arg0];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class227.field3939 = arg0;
            class234.field4083 = arg2;
        } else if (-1.5707963267948966D >= (double) var6 && (double) var6 >= -2.356194490192345D) {
            class227.field3939 = arg2;
            class234.field4083 = arg0;
        } else if (-0.7853981633974483D >= (double) var6 && (double) var6 >= -1.5707963267948966D) {
            class227.field3939 = arg2;
            class234.field4083 = class54.field858 - arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class234.field4083 = arg2;
            class227.field3939 = class133.field2294 - arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class227.field3939 = class133.field2294 - arg0;
            class234.field4083 = class54.field858 - arg2;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class227.field3939 = class133.field2294 - arg2;
            class234.field4083 = class54.field858 - arg0;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class234.field4083 = arg0;
            class227.field3939 = class133.field2294 - arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class227.field3939 = arg0;
            class234.field4083 = class54.field858 - arg2;
        }
        if (arg1 == 26868) {
            class234.field4083 &= class65.field1024;
            class227.field3939 &= class209.field3684;
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V", line = 270)
    public class214() {
        super(1, false);
    }
}
