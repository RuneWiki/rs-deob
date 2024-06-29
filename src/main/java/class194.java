import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class194 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    private int field3027 = -1;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    private int field3033 = 0;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field3046 = 0;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public int field3032;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public int field3042;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public int field3043;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public int field3047;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "Lel;")
    public static class213 field3039;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lub;Lub;I)V")
    public static final void method1376(class92 arg0, class92 arg1, int arg2) {
        int var3 = -44 % ((arg2 + 59) / 37);
        class259.field4108 = arg1;
        class170.field2578 = arg0;
        field3035++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1377(int arg0, int arg1, String[] arg2, byte arg3) {
        field3040++;
        if (arg0 == 0) {
            return "";
        } else if (arg0 == 1) {
            String var4 = arg2[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg1;
            if (arg3 != 98) {
                field3039 = null;
            }
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg2[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBLha;)V")
    public final void method1378(int arg0, byte arg1, class31 arg2) {
        field3048++;
        while (true) {
            int var4 = arg2.method265(-101);
            if (var4 == 0) {
                if (arg1 == 40) {
                    return;
                } else {
                    field3046 = 85;
                    return;
                }
            }
            this.method1385(arg1 ^ 0xFFFFFFAC, var4, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BIII)I")
    public static final int method1379(byte arg0, int arg1, int arg2, int arg3) {
        field3041++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            if (arg0 != -122) {
                field3039 = null;
            }
            return arg2;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lub;IIB)[Lel;")
    public static final class213[] method1380(class92 arg0, int arg1, int arg2, byte arg3) {
        field3045++;
        if (arg3 < 28) {
            return null;
        } else if (class246.method1668(arg1, arg0, arg2, -1)) {
            return class7.method45(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
    private final void method1381(int arg0, int arg1) {
        field3030++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = 0.0D;
        if (var3 < var7) {
            var9 = var7;
        }
        double var13 = (double) arg1;
        double var15 = var3;
        if (var3 > var7) {
            var15 = var7;
        }
        if (var5 > var9) {
            var9 = var5;
        }
        if (var5 < var15) {
            var15 = var5;
        }
        double var17 = (var9 + var15) / 2.0D;
        if (var9 != var15) {
            if (var3 == var9) {
                var11 = (var7 - var5) / (var9 - var15);
            } else if (var7 == var9) {
                var11 = (var5 - var3) / (var9 - var15) + 2.0D;
            } else if (var5 == var9) {
                var11 = (var3 - var7) / (var9 - var15) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var9 - var15) / (var9 + var15);
            }
            if (var17 >= 0.5D) {
                var13 = (var9 - var15) / (2.0D - var9 - var15);
            }
        }
        double var19 = var11 / 6.0D;
        this.field3047 = (int) (var13 * 256.0D);
        if (this.field3047 < 0) {
            this.field3047 = 0;
        } else if (this.field3047 > 255) {
            this.field3047 = 255;
        }
        this.field3042 = (int) (var17 * 256.0D);
        if (this.field3042 < 0) {
            this.field3042 = 0;
        } else if (this.field3042 > 255) {
            this.field3042 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field3043 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field3043 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field3043 < 1) {
            this.field3043 = 1;
        }
        this.field3032 = (int) ((double) this.field3043 * var19);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)I")
    public static final int method1382(boolean arg0) {
        if (!arg0) {
            field3046 = -37;
        }
        field3031++;
        return 0;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method1383(int arg0) {
        if (arg0 != 29) {
            field3039 = null;
        }
        field3039 = null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public static final void method1384(int arg0) {
        class253.field4052 = 0;
        field3036++;
        class122.field1840 = 0;
        class127.method949(-6);
        class234.method1608(-3);
        class201.method1418(true);
        if (arg0 > -98) {
            field3046 = 16;
        }
        for (int var1 = 0; var1 < class253.field4052; var1++) {
            int var3 = class178.field2738[var1];
            if (class41.field686 != class116.field1781[var3].field4761) {
                if (class116.field1781[var3].field2421.method740(0)) {
                    class195.method1391(class116.field1781[var3], 93);
                }
                class116.field1781[var3].method1164(-11497, (class95) null);
                class116.field1781[var3] = null;
            }
        }
        if (class95.field1528 != class183.field2900.field541) {
            throw new RuntimeException("gnp1 pos:" + class183.field2900.field541 + " psize:" + class95.field1528);
        }
        for (int var2 = 0; var2 < class117.field1782; var2++) {
            if (class116.field1781[class255.field4084[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class117.field1782);
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIILha;)V")
    private final void method1385(int arg0, int arg1, int arg2, class31 arg3) {
        field3044++;
        if (arg0 >= -119) {
            field3039 = null;
        }
        if (arg1 == 1) {
            this.field3033 = arg3.method304((byte) 84);
            this.method1381(this.field3033, 0);
        } else if (arg1 == 2) {
            this.field3027 = arg3.method260((byte) -67);
            if (this.field3027 == 65535) {
                this.field3027 = -1;
                return;
            }
            return;
        } else if (arg1 == 3) {
            arg3.method260((byte) -67);
            return;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V")
    public static final void method1386(boolean arg0) {
        class249.method1683((long) class41.field686);
        field3028++;
        if (class298.field4803 != -1) {
            class74.method587(class298.field4803, 22608);
        }
        for (int var1 = 0; var1 < class126.field1895; var1++) {
            if (class247.field3933[var1]) {
                class112.field1729[var1] = true;
            }
            class186.field2926[var1] = class247.field3933[var1];
            class247.field3933[var1] = false;
        }
        class85.field1270 = -1;
        class182.field2874 = class41.field686;
        class15.field180 = -1;
        class215.field3291 = null;
        if (class298.field4803 != -1) {
            class126.field1895 = 0;
            class174.method1244(21098);
        }
        class66.method517();
        if (!arg0) {
            field3039 = null;
        }
        class209.field3230 = 0;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lub;I)V")
    public static final void method1387(class92 arg0, int arg1) {
        class223.field3579 = arg0;
        class67.field1041 = class223.field3579.method700((byte) -107, 16);
        if (arg1 < -55) {
            field3038++;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)Lff;")
    public static final class19 method1388(int arg0, int arg1, int arg2) {
        class22 var3 = class149.field2210[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field371; var4++) {
            class19 var5 = var3.field355[var4];
            if ((var5.field267 >> 29 & 0x3L) == 2L && var5.field255 == arg1 && var5.field258 == arg2) {
                class33.method328(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)V")
    public static final void method1389(int arg0, int arg1) {
        if (!class230.field3648) {
            arg1 = -1;
        }
        field3034++;
        if (arg0 != 26365) {
            field3046 = -27;
        }
        if (class28.field468 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class130 var2 = class193.method1372(0, arg1);
            class51 var3 = var2.method966(-128);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class123.field1863.method32((byte) -126, class105.field1651, var3.method429(), var3.field3267, new Point(var2.field1938, var2.field1931), var3.field3272);
                class28.field468 = arg1;
            }
        }
        if (arg1 == -1 && class28.field468 != -1) {
            class123.field1863.method32((byte) -128, class105.field1651, (int[]) null, -1, new Point(), -1);
            class28.field468 = -1;
        }
    }
}
