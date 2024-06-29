import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class82 {

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "[[Z")
    public static boolean[][] field1060;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)Luj;", line = 7)
    public static final class356 method626(int arg0, int arg1) {
        if (arg1 > -10) {
            return null;
        } else {
            field1058++;
            return new class356(arg0, false);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V", line = 22)
    public static final void method627(int arg0) {
        if (class35.method233((byte) -77, class470.field5804) || class411.method2307(class470.field5804, 8)) {
            class347.method2002(5000, class238.field3071 >> 12, class710.field9924 >> 12, (byte) 5);
        } else {
            int var1 = class67.field815.field508[0] >> 3;
            int var2 = class67.field815.field511[0] >> 3;
            if (var1 >= 0 && var1 < class85.field1090 >> 3 && var2 >= 0 && class656.field8932 >> 3 > var2) {
                class347.method2002(5000, var1, var2, (byte) 68);
            } else {
                class347.method2002(0, class85.field1090 >> 4, class656.field8932 >> 4, (byte) -96);
            }
        }
        field1059++;
        if (arg0 < 61) {
            method629((byte) -7);
        }
        class675.method3742(84);
        class99.method725((byte) -42);
        class697.method3853(122);
        class497.method2711((byte) -125);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III)V", line = 57)
    public static final void method628(int arg0, int arg1, int arg2) {
        class565 var3 = class407.field5237[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field7079 != null) {
            var3.field7079 = null;
        }
        if (var3.field7087 != null) {
            var3.field7087 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V", line = 75)
    public static final void method629(byte arg0) {
        field1057++;
        class222.field2585.method3582(121);
        int var1 = class222.field2585.method3578(8, 8);
        if (var1 < class99.field1276) {
            for (int var2 = var1; var2 < class99.field1276; var2++) {
                class6.field64[class440.field5535++] = class352.field4562[var2];
            }
        }
        if (var1 > class99.field1276) {
            throw new RuntimeException("gnpov1");
        }
        class99.field1276 = 0;
        if (arg0 < 39) {
            field1060 = null;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class352.field4562[var3];
            class506 var5 = ((class704) class168.field1973.method3828((long) var4, (byte) -91)).field9854;
            int var6 = class222.field2585.method3578(8, 1);
            if (var6 == 0) {
                class352.field4562[class99.field1276++] = var4;
                var5.field441 = class665.field9027;
            } else {
                int var7 = class222.field2585.method3578(8, 2);
                if (var7 == 0) {
                    class352.field4562[class99.field1276++] = var4;
                    var5.field441 = class665.field9027;
                    class374.field4827[class94.field1209++] = var4;
                } else if (var7 == 1) {
                    class352.field4562[class99.field1276++] = var4;
                    var5.field441 = class665.field9027;
                    int var8 = class222.field2585.method3578(8, 3);
                    var5.method2763(var8, 37, 1);
                    int var9 = class222.field2585.method3578(8, 1);
                    if (var9 == 1) {
                        class374.field4827[class94.field1209++] = var4;
                    }
                } else if (var7 == 2) {
                    class352.field4562[class99.field1276++] = var4;
                    var5.field441 = class665.field9027;
                    if (class222.field2585.method3578(8, 1) == 1) {
                        int var11 = class222.field2585.method3578(8, 3);
                        var5.method2763(var11, 15, 2);
                        int var12 = class222.field2585.method3578(8, 3);
                        var5.method2763(var12, 70, 2);
                    } else {
                        int var10 = class222.field2585.method3578(8, 3);
                        var5.method2763(var10, 94, 0);
                    }
                    int var13 = class222.field2585.method3578(8, 1);
                    if (var13 == 1) {
                        class374.field4827[class94.field1209++] = var4;
                    }
                } else if (var7 == 3) {
                    class6.field64[class440.field5535++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V", line = 189)
    public static void method630(int arg0) {
        if (arg0 != 685907268) {
            method629((byte) 19);
        }
        field1060 = null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IILpg;ILoa;I)V", line = 199)
    public static final void method631(int arg0, int arg1, class687 arg2, int arg3, class650 arg4, int arg5) {
        field1061++;
        class329 var6 = class93.field1189.method1002(arg2.field9376, (byte) 117);
        if (var6.field4098 == -1) {
            return;
        }
        int var8;
        if (arg2.field9386) {
            int var7 = arg2.field9423 + arg0;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class468 var9 = var6.method1885((byte) -53, arg2.field9442, arg4, var8);
        if (var9 == null) {
            return;
        }
        int var10 = arg2.field9459;
        int var11 = arg2.field9395;
        if ((var8 & 0x1) == 1) {
            var10 = arg2.field9395;
            var11 = arg2.field9459;
        }
        int var12 = var9.method1552();
        if (arg5 != 24808) {
            return;
        }
        int var13 = var9.method1549();
        if (var6.field4088) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field4090 == 0) {
            var9.method2549(arg1, arg3 + 4 - (var11 * 4), var12, var13);
        } else {
            var9.method1553(arg1, arg3 - (var11 - 1) * 4, var12, var13, 0, var6.field4090 | 0xFF000000, 1);
        }
    }
}
