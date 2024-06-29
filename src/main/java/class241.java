import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class241 {

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "[I")
    public static int[] field3843 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field3845 = 255;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "[I")
    public static int[] field3848 = new int[2];

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "[[[I")
    public static int[][][] field3841;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIBII)Lsh;")
    public static final class219 method1684(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        long var5 = (long) arg0 & 0xFFFFL | (long) arg4 << 48 & 0xFFFFL << 48 | ((long) arg3 & 0xFFFFL) << 32 | (long) arg1 << 16 & 0xFFFFL << 16;
        class219 var7 = (class219) class109.field1577.method1553(var5, (byte) -101);
        field3847++;
        if (var7 != null) {
            return var7;
        }
        class87[] var8 = null;
        class287 var9 = class3.method13(arg0, (byte) 84);
        if (var9.field4564 != null) {
            var8 = new class87[var9.field4564.length];
            for (int var10 = 0; var10 < var8.length; var10++) {
                class12 var11 = class286.method1942(var9.field4564[var10], 0);
                var8[var10] = new class87(var11.field141, var11.field137, var11.field142, var11.field138, var11.field148, var11.field145, var11.field136, var11.field151);
            }
        }
        class219 var12 = new class219(var9.field4556, var8, var9.field4560, arg4, arg3, arg1);
        if (arg2 != -5) {
            field3839 = 15;
        }
        class109.field1577.method1551(var12, 0, var5);
        return var12;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public static final void method1685(int arg0) {
        if (arg0 >= -122) {
            field3848 = null;
        }
        for (int var1 = 0; var1 < class133.field2191; var1++) {
            int var10002 = class39.field554[var1]--;
            if (class39.field554[var1] >= -10) {
                class74 var3 = class83.field1202[var1];
                if (var3 == null) {
                    var3 = class74.method540(class257.field4235, class32.field403[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class39.field554[var1] += var3.method541();
                    class83.field1202[var1] = var3;
                }
                if (class39.field554[var1] < 0) {
                    int var4;
                    if (class234.field3752[var1] == 0) {
                        var4 = class291.field4611[var1] * class171.field2757 >> 8;
                    } else {
                        int var5 = (class234.field3752[var1] & 0xFF) * 128;
                        int var6 = (class234.field3752[var1] & 0xFFECC4) >> 16;
                        int var7 = (class234.field3752[var1] & 0xFFD8) >> 8;
                        int var8 = var6 * 128 + 64 - class186.field2993.field1979;
                        int var9 = var7 * 128 + 64 - class186.field2993.field1910;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var10 = var8 + var9 - 128;
                        if (var10 > var5) {
                            class39.field554[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = class291.field4611[var1] * class212.field3402 * (var5 - var10) / var5 >> 8;
                    }
                    if (var4 > 0) {
                        class15 var11 = var3.method539().method109(class119.field1723);
                        class89 var12 = class89.method678(var11, 100, var4);
                        var12.method704(class209.field3357[var1] - 1);
                        class73.field1057.method793(var12);
                    }
                    class39.field554[var1] = -100;
                }
            } else {
                class133.field2191--;
                for (int var2 = var1; var2 < class133.field2191; var2++) {
                    class32.field403[var2] = class32.field403[var2 + 1];
                    class83.field1202[var2] = class83.field1202[var2 + 1];
                    class209.field3357[var2] = class209.field3357[var2 + 1];
                    class39.field554[var2] = class39.field554[var2 + 1];
                    class234.field3752[var2] = class234.field3752[var2 + 1];
                    class291.field4611[var2] = class291.field4611[var2 + 1];
                }
                var1--;
            }
        }
        field3849++;
        if (class195.field3136 && !class155.method1151(0)) {
            if (field3845 != 0 && class92.field1372 != -1) {
                class86.method632(class92.field1372, field3845, (byte) -126, class81.field1173, 0, false);
            }
            class195.field3136 = false;
        } else if (field3845 != 0 && class92.field1372 != -1 && !class155.method1151(0)) {
            class220.field3532.method557(187, 8);
            class185.field2990++;
            class220.field3532.method1119(class92.field1372, (byte) 70);
            class92.field1372 = -1;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V")
    public static void method1686(boolean arg0) {
        field3841 = null;
        field3848 = null;
        if (arg0) {
            field3843 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V")
    public static final void method1687(byte arg0) {
        if (arg0 != -10) {
            method1686(false);
        }
        class229.field3685.method1558(-82);
        class109.field1577.method1558(-120);
        field3842++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1688(int arg0, long arg1) {
        field3844++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % (long) arg0) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class193.field3111[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    var9 = ' ';
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBI)V")
    public static final void method1689(int arg0, byte arg1, int arg2) {
        field3840++;
        class201 var3 = class94.method738(-95, arg2, 7);
        if (arg1 == -20) {
            var3.method1477(0);
            var3.field3226 = arg0;
        }
    }
}
