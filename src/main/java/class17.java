import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class17 {

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Ldf;")
    public static class51 field260 = class46.method233("<col=00ffff>", 100);

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Ldf;")
    public static class51 field263 = class46.method233("<col=ffb000>", 100);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "[I")
    public static int[] field261;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public static void method84(byte arg0) {
        field260 = null;
        field261 = null;
        if (arg0 != 82) {
            method90(108, 31);
        }
        field263 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZIIIZZIZ)Ltg;")
    public static final class171 method85(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6, boolean arg7) {
        class222 var8 = class219.method1508(arg2, (byte) 119);
        if (arg3 > 1 && var8.field3863 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field3885[var10] <= arg3 && var8.field3885[var10] != 0) {
                    var9 = var8.field3863[var10];
                }
            }
            if (var9 != -1) {
                var8 = class219.method1508(var9, (byte) 91);
            }
        }
        field257++;
        class137 var11 = var8.method1521((byte) -34);
        if (var11 == null) {
            return null;
        }
        class254 var12 = null;
        if (var8.field3882 != -1) {
            var12 = (class254) method85(arg0, 1, var8.field3900, 10, true, false, 0, true);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field3866 != -1) {
            var12 = (class254) method85(true, arg1, var8.field3850, arg3, false, false, arg6, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class59.field957;
        int var14 = class59.field960;
        int var15 = class59.field963;
        int[] var16 = new int[4];
        class59.method378(var16);
        class254 var17 = new class254(36, 32);
        class59.method384(var17.field4447, 36, 32);
        class73.method527();
        class73.method512(16, 16);
        int var18 = var8.field3851;
        class73.field1159 = false;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg1 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class73.field1155[var8.field3911] * var18 >> 16;
        int var20 = class73.field1167[var8.field3911] * var18 >> 16;
        var11.method439(0, var8.field3906, var8.field3847, var8.field3911, var8.field3874, var19 + (var8.field3848 - (var11.method94() / 2)), var8.field3848 + var20);
        if (arg1 >= 1) {
            var17.method1725(1);
            if (arg1 >= 2) {
                var17.method1725(16777215);
            }
            class59.method384(var17.field4447, 36, 32);
        }
        if (arg6 != 0) {
            var17.method1736(arg6);
        }
        if (var8.field3882 != -1) {
            var12.method1103(0, 0);
        } else if (var8.field3866 != -1) {
            class59.method384(var12.field4447, 36, 32);
            var17.method1103(0, 0);
            var17 = var12;
        }
        if (arg5 && (var8.field3913 == 1 || arg3 != 1) && arg3 != -1) {
            class92.field1519.method1335(class156.method1115(arg3, -101), 0, 9, 16776960, 1);
        }
        class59.method384(var13, var14, var15);
        class59.method373(var16);
        class73.method527();
        class73.field1159 = arg0;
        return var17;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lfi;I)V")
    public static final void method86(class103 arg0, int arg1) {
        field259++;
        class93 var2 = (class93) class36.field556.method1453(arg0.field1711.method316(arg1 - 14344), 1);
        if (var2 != null) {
            if (var2.field1552 != null) {
                class166.field2709.method488(var2.field1552);
                var2.field1552 = null;
            }
            var2.method764((byte) -88);
        }
        if (arg1 != 14420) {
            field261 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BI)V")
    public static final void method87(byte arg0, int arg1) {
        class260.field4539.method1348(0, arg1);
        field264++;
        class213.field3706.method1348(0, arg1);
        if (arg0 < 18) {
            field260 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IBI)V")
    public static final void method88(int arg0, byte arg1, int arg2) {
        int var3 = 100 / ((arg1 + 79) / 35);
        field258++;
        if (class207.method1426((byte) 98, arg0)) {
            class183.method1297(arg2, false, class10.field106[arg0]);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)I")
    public static final int method89(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)I")
    public static final int method90(int arg0, int arg1) {
        if (arg1 != -4102) {
            field263 = null;
        }
        field262++;
        if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
            return arg0 + 32;
        } else if (arg0 == 159) {
            return 255;
        } else if (arg0 == 140) {
            return 156;
        } else {
            return arg0;
        }
    }
}
