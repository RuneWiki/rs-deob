import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class50 extends class273 {

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "Ljd;")
    public static class86 field1046 = class122.method868("showVideoAd", true);

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "Ljd;")
    public static class86 field1052 = class122.method868("<col=ffffff>", true);

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "Ljd;")
    public static class86 field1049 = class122.method868(":tradereq:", true);

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "[I")
    public static int[] field1053 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "[I")
    public static int[] field1051 = new int[5];

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
    public static int field1050 = 0;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "Z")
    public static boolean field1045 = false;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "Ljg;")
    public static class163 field1059;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1057;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        ++field1055;
        if (arg2 >= -16) {
            method385(-33, -82, -109, -105, 70, (byte) 61, (class32) null);
        }
        if (~arg0 == -1) {
            super.field4778 = ~arg1.method1408((byte) -107) == -2;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(BI)Lfj;")
    public static final class239 method383(byte arg0, int arg1) {
        ++field1054;
        int var2 = 28 % ((69 - arg0) / 51);
        return class83.field1616 && arg1 >= class82.field1609 && class190.field3375 >= arg1 ? class232.field4203[arg1 - class82.field1609] : null;
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V")
    public static void method384(int arg0) {
        field1059 = null;
        field1057 = null;
        field1049 = null;
        field1051 = null;
        if (arg0 != -27297) {
            field1045 = false;
        }
        field1046 = null;
        field1053 = null;
        field1052 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)[[I")
    public final int[][] method29(int arg0, byte arg1) {
        ++field1058;
        int[][] var3 = super.field4787.method1657(arg0, (byte) -113);
        int var4 = -123 / ((arg1 - 12) / 58);
        if (super.field4787.field4355) {
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~var8 > ~class176.field3200; ++var8) {
                this.method386(true, var8, arg0);
                int[][] var9 = this.method1859(class122.field2369, 0, 3);
                var5[var8] = var9[0][class217.field3905];
                var6[var8] = var9[1][class217.field3905];
                var7[var8] = var9[2][class217.field3905];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field1048;
        int[] var3 = super.field4800.method1224(arg1, 0);
        if (arg0 != -7420) {
            field1052 = null;
        }
        if (super.field4800.field3160) {
            for (int var4 = 0; var4 < class176.field3200; ++var4) {
                this.method386(true, var4, arg1);
                int[] var5 = this.method1863(arg0 + 7330, 0, class122.field2369);
                var3[var4] = var5[class217.field3905];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class50() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIBLie;)Lie;")
    public static final class32 method385(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class32 arg6) {
        int var7 = 60 % ((arg5 - 59) / 43);
        long var8 = (long) arg2;
        ++field1047;
        class32 var10 = (class32) class14.field411.method701((byte) -117, var8);
        if (var10 == null) {
            class192 var11 = class192.method1339(class189.field3348, arg2, 0);
            if (var11 == null) {
                return null;
            }
            var10 = var11.method1316(64, 768, -50, -10, -50);
            class14.field411.method696(var8, var10, (byte) -96);
        }
        int var12 = arg6.method214();
        int var13 = arg6.method223();
        int var14 = arg6.method212();
        int var15 = arg6.method213();
        class32 var16 = var10.method219(true, true);
        if (~arg1 != -1) {
            var16.method226(arg1);
        }
        class89 var17 = (class89) var16;
        if (arg3 != class30.method198(31482, arg0 + var12, arg4 + var14, class180.field3244) || arg3 != class30.method198(31482, arg0 - -var13, arg4 - -var15, class180.field3244)) {
            for (int var18 = 0; var18 < var17.field1790; ++var18) {
                var17.field1783[var18] += class30.method198(31482, var17.field1772[var18] + arg0, var17.field1785[var18] + arg4, class180.field3244) + -arg3;
            }
            var17.field1780 = false;
        }
        return var16;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZII)V")
    private final void method386(boolean arg0, int arg1, int arg2) {
        ++field1056;
        int var4 = class114.field2184[arg1];
        int var5 = class143.field2711[arg2];
        if (arg0) {
            float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 - 2048));
            if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
                class217.field3905 = arg1;
                class122.field2369 = arg2;
            } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
                class217.field3905 = arg2;
                class122.field2369 = arg1;
            } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
                class122.field2369 = arg1;
                class217.field3905 = class176.field3200 - arg2;
            } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
                class217.field3905 = arg1;
                class122.field2369 = -arg2 + class96.field1896;
            } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
                class122.field2369 = -arg2 + class96.field1896;
                class217.field3905 = -arg1 + class176.field3200;
            } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
                class217.field3905 = -arg2 + class176.field3200;
                class122.field2369 = class96.field1896 - arg1;
            } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
                class217.field3905 = arg2;
                class122.field2369 = -arg1 + class96.field1896;
            } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
                class217.field3905 = -arg1 + class176.field3200;
                class122.field2369 = arg2;
            }
            class122.field2369 &= class274.field4808;
            class217.field3905 &= class90.field1844;
        }
    }
}
