import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class207 extends class102 {

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "I")
    private int field3867 = 4096;

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "Lqe;")
    public static class179 field3869 = class206.method1380("overlay)3dat", (byte) -128);

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "Lqe;")
    public static class179 field3860 = class206.method1380("(Y<)4col>", (byte) -126);

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "J")
    public static volatile long field3870 = 0L;

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "Lqe;")
    private static class179 field3858 = class206.method1380("skill)2", (byte) 96);

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "Lqe;")
    public static class179 field3864 = field3858;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "Lqe;")
    public static class179 field3868 = class206.method1380("", (byte) -45);

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "Lqe;")
    public static class179 field3866 = class206.method1380("<col=ff9040>", (byte) -127);

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "Ls;")
    public static class194 field3862 = new class194(20);

    @OriginalMember(owner = "client!tc", name = "gb", descriptor = "Lqe;")
    public static class179 field3877 = class206.method1380("Lade Wordpack )2 ", (byte) -127);

    @OriginalMember(owner = "client!tc", name = "fb", descriptor = "Lqe;")
    public static class179 field3876 = class206.method1380("blinken3:", (byte) -128);

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!tc", name = "bb", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!tc", name = "cb", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!tc", name = "db", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!tc", name = "eb", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "Lae;")
    public static class6 field3861;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field3875;
            int[] var3 = super.field1960.method699((byte) -74, arg1);
            if (super.field1960.field2007) {
                int[] var4 = this.method679(arg1 + -1 & class233.field4296, 0, (byte) -109);
                int[] var5 = this.method679(arg1, 0, (byte) -109);
                int[] var6 = this.method679(arg1 + 1 & class233.field4296, 0, (byte) -109);
                for (int var7 = 0; ~var7 > ~class155.field2796; ++var7) {
                    int var8 = (var6[var7] + -var4[var7]) * this.field3867;
                    int var9 = (var5[class227.field4193 & var7 + 1] + -var5[class227.field4193 & var7 + -1]) * this.field3867;
                    int var10 = var9 >> 12;
                    int var11 = var8 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var13 + 4096 + var12) / 4096.0F)));
                    int var15 = var14 == 0 ? 0 : 16777216 / var14;
                    var3[var7] = -var15 + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)I")
    public static final int method1381(int arg0, int arg1) {
        ++field3871;
        if (class113.field2129 == 1) {
            return 7;
        } else if (arg0 != 77) {
            if (~arg0 != -39) {
                if (arg0 != 16) {
                    if (arg0 != 161) {
                        if (~arg0 != -192) {
                            if (arg0 == 69) {
                                return 6;
                            } else {
                                if (arg1 != 77) {
                                    method1383(-27, -4);
                                }
                                return 0;
                            }
                        } else {
                            return 5;
                        }
                    } else {
                        return 4;
                    }
                } else {
                    return 3;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(IIB)I")
    public static final int method1382(int arg0, int arg1, byte arg2) {
        ++field3873;
        class177 var3 = (class177) class155.field2777.method909(arg2 + 125, (long) arg1);
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && ~var3.field3219.length < ~arg0) {
            if (arg2 != -126) {
                method1381(74, -45);
            }
            return var3.field3219[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)[B")
    public static final byte[] method1383(int arg0, int arg1) {
        ++field3863;
        class226 var2 = (class226) class133.field2411.method1299((byte) -113, (long) arg1);
        int var3 = 90 % ((-25 - arg0) / 58);
        if (var2 == null) {
            Random var4 = new Random((long) arg1);
            byte[] var5 = new byte[512];
            for (int var6 = 0; ~var6 > -256; ++var6) {
                var5[var6] = (byte) var6;
            }
            for (int var7 = 0; ~var7 > -256; ++var7) {
                int var8 = 255 - var7;
                int var9 = class4.method26(var4, 12024, var8);
                byte var10 = var5[var9];
                var5[var9] = var5[var8];
                var5[var8] = var5[-var7 + 511] = var10;
            }
            var2 = new class226(var5);
            class133.field2411.method1303(var2, (long) arg1, (byte) -73);
        }
        return var2.field4188;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILra;)Lgi;")
    public static final class74 method1384(int arg0, class185 arg1) {
        if (arg0 >= -68) {
            return null;
        } else {
            ++field3872;
            return new class74(arg1.method1225((byte) -77), arg1.method1225((byte) -77), arg1.method1225((byte) -77), arg1.method1225((byte) -77), arg1.method1225((byte) -77), arg1.method1225((byte) -77), arg1.method1225((byte) -77), arg1.method1225((byte) -77), arg1.method1244(-27523), arg1.method1243(3));
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        if (arg2) {
            field3861 = null;
        }
        ++field3859;
        if (arg1 == 0) {
            this.field3867 = arg0.method1252(2);
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class207() {
        super(1, true);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BZIIILee;I)V")
    public static final void method1385(byte arg0, boolean arg1, int arg2, int arg3, int arg4, class49 arg5, int arg6) {
        ++field3865;
        long var7 = (long) ((arg3 << 16) + arg2);
        class116 var9 = (class116) class105.field1977.method909(-1, var7);
        if (arg6 >= -28) {
            method1381(-85, 9);
        }
        if (var9 == null) {
            class116 var10 = (class116) class194.field3603.method909(-1, var7);
            if (var10 == null) {
                class116 var11 = (class116) class174.field3115.method909(-1, var7);
                if (var11 != null) {
                    if (arg1) {
                        var11.method187((byte) -128);
                        class105.field1977.method914(var7, var11, true);
                        --class191.field3569;
                        ++class47.field1022;
                    }
                } else {
                    if (!arg1) {
                        class116 var12 = (class116) class111.field2088.method909(-1, var7);
                        if (var12 != null) {
                            return;
                        }
                    }
                    class116 var13 = new class116();
                    var13.field2190 = arg0;
                    var13.field2179 = arg4;
                    var13.field2189 = arg5;
                    if (!arg1) {
                        class56.field1241.method1021(-1, var13);
                        class174.field3115.method914(var7, var13, true);
                        ++class191.field3569;
                    } else {
                        class105.field1977.method914(var7, var13, true);
                        ++class47.field1022;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
    public static void method1386(int arg0) {
        field3860 = null;
        field3864 = null;
        field3869 = null;
        field3862 = null;
        if (arg0 != 1442707532) {
            method1386(66);
        }
        field3866 = null;
        field3868 = null;
        field3858 = null;
        field3861 = null;
        field3877 = null;
        field3876 = null;
    }
}
