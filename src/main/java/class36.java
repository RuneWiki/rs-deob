import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 {

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field876 = 0;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field882 = 0;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field879 = 0;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Ln;")
    public static class90 field883 = new class90(64);

    @OriginalMember(owner = "client!f", name = "n", descriptor = "Loa;")
    public static class98 field888 = class38.method349(255, "backtop1");

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public static int field889 = -1;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Lcc;")
    public static class18 field890 = new class18(5000);

    @OriginalMember(owner = "client!f", name = "u", descriptor = "Loa;")
    public static class98 field895 = class38.method349(255, "Hierhin gehen");

    @OriginalMember(owner = "client!f", name = "w", descriptor = "Loa;")
    public static class98 field897 = class38.method349(255, ": ");

    @OriginalMember(owner = "client!f", name = "v", descriptor = "Loa;")
    public static class98 field896 = class38.method349(255, ")2");

    @OriginalMember(owner = "client!f", name = "t", descriptor = "Loa;")
    public static class98 field894 = class38.method349(255, "au");

    @OriginalMember(owner = "client!f", name = "z", descriptor = "Loa;")
    public static class98 field900 = class38.method349(255, " ");

    @OriginalMember(owner = "client!f", name = "r", descriptor = "Loa;")
    public static class98 field892 = class38.method349(255, "Fallen lassen");

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public static int field899 = 0;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "Ltd;")
    public static class132 field893;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "Lmd;")
    public static class87 field887;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "Lnc;")
    public static class93 field886;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "Ljava/awt/Font;")
    public static Font field898;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "[[Ltd;")
    public static class132[][] field901;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lb;Loa;B)I")
    public static final int method340(class8 arg0, class98 arg1, byte arg2) {
        int var3 = 89 / ((28 - arg2) / 43);
        field885++;
        int var4 = arg0.field182;
        arg0.method96(arg1.field2277, (byte) 55);
        arg0.field182 += class8.field162.method28(0, arg1.field2255, 64, arg0.field132, arg1.field2277, arg0.field182);
        return arg0.field182 - var4;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)I")
    public static final int method341(int arg0) {
        int var1 = class31.method305(-123, class18.field394, class114.field2572, class71.field1472);
        field877++;
        if (var1 - class132.field3227 >= 800 || (class80.field1771[class114.field2572][class71.field1472 >> 7][class18.field394 >> 7] & 0x4) == 0) {
            if (arg0 != 26801) {
                field898 = null;
            }
            return 3;
        } else {
            return class114.field2572;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public static final void method342(int arg0) {
        field881++;
        if (arg0 != -21634) {
            field887 = null;
        }
        if (class53.field1166 != null) {
            class78 var1 = class53.field1166;
            synchronized (class53.field1166) {
                class53.field1166 = null;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILuc;II)V")
    public static final void method343(int arg0, int arg1, class137 arg2, int arg3, int arg4) {
        if (arg4 >= -13) {
            return;
        }
        field878++;
        if (class80.field1780 >= 400) {
            return;
        }
        if (arg2.field3334 != null) {
            arg2 = arg2.method1113(932);
        }
        if (arg2 == null || !arg2.field3351) {
            return;
        }
        class98 var5 = arg2.field3319;
        if (arg2.field3337 != 0) {
            var5 = class102.method840(new class98[] { var5, class15.method153(5, arg2.field3337, class73.field1536.field1204), class75.field1652, class18.field383, class132.method1074(arg2.field3337, (byte) 113), class96.field2211 }, 10);
        }
        if (class119.field2669 == 1) {
            class141.field3432++;
            class118.method935(arg3, class71.field1448, 52, -23060, arg0, class102.method840(new class98[] { class102.field2354, class101.field2335, var5 }, 10), arg1);
        } else if (!class113.field2555) {
            class98[] var6 = arg2.field3361;
            class31.field725++;
            if (class6.field114) {
                var6 = class105.method887(true, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method782(-1, class123.field2753)) {
                        class73.field1530++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 19;
                        }
                        if (var7 == 1) {
                            var8 = 24;
                        }
                        if (var7 == 2) {
                            var8 = 10;
                        }
                        if (var7 == 3) {
                            var8 = 27;
                        }
                        if (var7 == 4) {
                            var8 = 28;
                        }
                        class118.method935(arg3, var6[var7], var8, -23060, arg0, class102.method840(new class98[] { class58.field1288, var5 }, 10), arg1);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method782(-1, class123.field2753)) {
                        class1.field17++;
                        short var10 = 0;
                        int var11 = 0;
                        if (class73.field1536.field1204 < arg2.field3337) {
                            var10 = 2000;
                        }
                        if (var9 == 0) {
                            var11 = var10 + 19;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 24;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 10;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 27;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 28;
                        }
                        class118.method935(arg3, var6[var9], var11, -23060, arg0, class102.method840(new class98[] { class58.field1288, var5 }, 10), arg1);
                    }
                }
            }
            class118.method935(arg3, class146.field3542, 1002, -23060, arg0, class102.method840(new class98[] { class58.field1288, var5 }, 10), arg1);
        } else if ((class77.field1696 & 0x2) == 2) {
            class21.field454++;
            class118.method935(arg3, class91.field2111, 25, -23060, arg0, class102.method840(new class98[] { class149.field3674, class101.field2335, var5 }, 10), arg1);
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
    public static void method344(int arg0) {
        if (arg0 >= -105) {
            method343(-43, 126, null, 71, 57);
        }
        field888 = null;
        field892 = null;
        field883 = null;
        field900 = null;
        field898 = null;
        field894 = null;
        field897 = null;
        field886 = null;
        field890 = null;
        field901 = null;
        field895 = null;
        field887 = null;
        field896 = null;
        field893 = null;
    }
}
