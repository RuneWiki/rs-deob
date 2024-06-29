import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class215 {

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "Lmq;")
    private class104 field3045 = new class104(64);

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "Lmq;")
    public class104 field3056 = new class104(50);

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "Lmq;")
    public class104 field3057 = new class104(5);

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "Lfc;")
    public class343 field3052;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "Lfc;")
    private class343 field3043;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public int field3042;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "Z")
    public boolean field3049;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public int field3058;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "[Lvn;")
    public static class490[] field3048;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method1355(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class192.field2752++;
        class356.field4977 = 0;
        for (int var6 = class425.field5846; var6 < class109.field1542; var6++) {
            class406[][] var17 = class455.field6293[var6];
            for (int var18 = class443.field6111; var18 < class371.field5246; var18++) {
                for (int var19 = class175.field2568; var19 < class153.field2206; var19++) {
                    class406 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class435.field5973[var18 + class125.field1713 - class381.field5398][var19 + class125.field1713 - class8.field171] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field5609 = true;
                            var20.field5611 = true;
                            if (var20.field5613 == null) {
                                var20.field5610 = false;
                            } else {
                                var20.field5610 = true;
                            }
                            class356.field4977++;
                        } else {
                            var20.field5609 = false;
                            var20.field5611 = false;
                            var20.field5607 = 0;
                            if (var18 >= class381.field5398 - 16 && var18 <= class381.field5398 + 16 && var19 >= class8.field171 - 16 && var19 <= class8.field171 + 16 && (var20.field5617 != null || var20.field5624 != null || var20.field5625 != null || var20.field5608 != null || var20.field5621 != null || var20.field5613 != null)) {
                                class302.field4135.method818((byte) -122, var20);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class8.field166 == class317.field4306;
        for (int var8 = class425.field5846; var8 < class109.field1542; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class259.field3611.method1092() && var8 >= arg2 && arg1 != null) {
                int var10 = class435.field5973.length;
                if (class435.field5973.length + class443.field6111 > class456.field6299) {
                    var10 -= class435.field5973.length + class443.field6111 - class456.field6299;
                }
                int var11 = class435.field5973[0].length;
                if (class435.field5973[0].length + class175.field2568 > class205.field2946) {
                    var11 -= class435.field5973[0].length + class175.field2568 - class205.field2946;
                }
                int var12 = class456.field6313;
                while (true) {
                    if (var12 >= var10) {
                        class302.field4135.method810(-7792, var8, var9, class317.field4306[var8], true);
                        break;
                    }
                    int var13 = class443.field6111 + var12 - class456.field6313;
                    for (int var14 = class175.field2576; var14 < var11; var14++) {
                        class451.field6194[var12][var14] = false;
                        if (class435.field5973[var12][var14]) {
                            int var15 = class175.field2568 + var14 - class175.field2576;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class455.field6293[var16][var13][var15] != null && class455.field6293[var16][var13][var15].field5620 == var8) {
                                    class451.field6194[var12][var14] = class455.field6293[var16][var13][var15].field5609;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class302.field4135.method810(-7792, var8, var9, class317.field4306[var8], false);
            }
            class302.field4135.method814(-13417);
        }
        if (!class437.method2539(true)) {
            class437.method2539(false);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZI)V")
    public final void method1356(boolean arg0, int arg1) {
        field3039++;
        if (arg1 != 16) {
            this.method1359(95, true);
        }
        if (this.field3049 != arg0) {
            this.field3049 = arg0;
            this.method1360(-75);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIII)V")
    public static final void method1357(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 0) {
            return;
        }
        if (arg2 - arg3 >= class299.field4121 && (arg2 + arg3) <= class248.field3487 && arg4 - arg3 >= class53.field874 && class8.field174 >= arg3 + arg4) {
            class491.method2877(arg2, arg1 - 32746, arg0, arg3, arg4);
        } else {
            class267.method1680(-30415, arg4, arg0, arg2, arg3);
        }
        field3055++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
    public final void method1358(int arg0, int arg1) {
        if (arg0 != 0) {
            return;
        }
        this.field3058 = arg1;
        field3046++;
        class104 var3 = this.field3056;
        synchronized (this.field3056) {
            this.field3056.method656(arg0 + 97);
        }
        class104 var4 = this.field3057;
        synchronized (this.field3057) {
            this.field3057.method656(104);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZ)Lvl;")
    public final class127 method1359(int arg0, boolean arg1) {
        field3041++;
        class104 var3 = this.field3045;
        class127 var4;
        synchronized (this.field3045) {
            var4 = (class127) this.field3045.method659((long) arg0, (byte) -1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3043.method2029(class336.method1999(arg0, (byte) -9), class133.method799(arg0, 127), 0);
        class127 var6 = new class127();
        var6.field1765 = this;
        var6.field1784 = arg0;
        if (var5 != null) {
            var6.method778(-27390, new class425(var5));
        }
        var6.method771(-4152);
        class104 var7 = this.field3045;
        synchronized (this.field3045) {
            if (arg1) {
                this.field3045.method653(75, (long) arg0, var6);
                return var6;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public final void method1360(int arg0) {
        field3040++;
        class104 var2 = this.field3045;
        synchronized (this.field3045) {
            this.field3045.method656(127);
        }
        class104 var3 = this.field3056;
        synchronized (this.field3056) {
            this.field3056.method656(121);
            if (arg0 > -73) {
                this.field3056 = null;
            }
        }
        class104 var4 = this.field3057;
        synchronized (this.field3057) {
            this.field3057.method656(95);
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)Lji;")
    public static final class163 method1361(int arg0) {
        field3044++;
        if (class379.field5366 == null || class37.field633 == null) {
            return null;
        } else if (arg0 == 16) {
            for (class163 var1 = (class163) class37.field633.method2579(-128); var1 != null; var1 = (class163) class37.field633.method2579(-128)) {
                class442 var2 = class379.field5358.method85(var1.field2342, true);
                if (var2 != null && var2.field6088 && var2.method2571(true, class379.field5360)) {
                    return var1;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public final void method1362(byte arg0) {
        class104 var2 = this.field3045;
        synchronized (this.field3045) {
            if (arg0 != 126) {
                this.method1359(75, true);
            }
            this.field3045.method654(false);
        }
        field3051++;
        class104 var3 = this.field3056;
        synchronized (this.field3056) {
            this.field3056.method654(false);
        }
        class104 var4 = this.field3057;
        synchronized (this.field3057) {
            this.field3057.method654(false);
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V")
    public final void method1363(int arg0) {
        if (arg0 < 109) {
            this.field3056 = null;
        }
        class104 var2 = this.field3056;
        synchronized (this.field3056) {
            this.field3056.method656(106);
        }
        field3047++;
        class104 var3 = this.field3057;
        synchronized (this.field3057) {
            this.field3057.method656(110);
        }
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
    public static void method1364(int arg0) {
        if (arg0 != 2130) {
            field3048 = null;
        }
        field3048 = null;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)V")
    public final void method1365(int arg0, int arg1) {
        class104 var3 = this.field3045;
        synchronized (this.field3045) {
            this.field3045.method666(arg0, false);
        }
        field3054++;
        class104 var4 = this.field3056;
        synchronized (this.field3056) {
            this.field3056.method666(arg0, false);
            if (arg1 != -1) {
                this.field3045 = null;
            }
        }
        class104 var5 = this.field3057;
        synchronized (this.field3057) {
            this.field3057.method666(arg0, false);
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Ldk;IZLfc;Lfc;)V")
    public class215(class328 arg0, int arg1, boolean arg2, class343 arg3, class343 arg4) {
        this.field3052 = arg4;
        this.field3043 = arg3;
        this.field3042 = arg1;
        this.field3049 = arg2;
        if (this.field3043 != null) {
            int var6 = this.field3043.method2027(-115) - 1;
            this.field3043.method2054(0, var6);
        }
    }
}
