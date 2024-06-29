import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class class256 {

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4224 = "slide:";

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field4228 = -1;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)I")
    public abstract int method1544(int arg0, int arg1);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)V")
    public static final void method1787(int arg0, byte arg1) {
        class82.field1298.method147(arg0, (byte) -118);
        if (arg1 == -59) {
            field4227++;
            class98.field1463.method147(arg0, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static final void method1788(byte arg0) {
        if (arg0 != 76) {
            method1787(125, (byte) 11);
        }
        class12.field152.method145(-108);
        field4225++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLib;Lib;)V")
    public static final void method1789(boolean arg0, class162 arg1, class162 arg2) {
        if (arg2.field2547 != null) {
            arg2.method1075(7596);
        }
        field4226++;
        arg2.field2547 = arg1;
        arg2.field2551 = arg1.field2551;
        arg2.field2547.field2551 = arg2;
        arg2.field2551.field2547 = arg2;
        if (arg0) {
            field4224 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)Lrh;")
    public abstract class47 method1549(int arg0);

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(IB)[B")
    public abstract byte[] method1538(int arg0, byte arg1);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lkk;II)I")
    public static final int method1790(class254 arg0, int arg1, int arg2) {
        field4223++;
        if (arg0.field4145 == null || arg1 >= arg0.field4145.length) {
            return -2;
        }
        try {
            int[] var3 = arg0.field4145[arg1];
            int var4 = 0;
            int var5 = arg2;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 1) {
                    var8 = class189.field2911[var3[var5++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 2) {
                    var8 = class177.field2757[var3[var5++]];
                }
                if (var7 == 3) {
                    var8 = class113.field1710[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class254 var12 = class80.method534(-98, var11);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class14.method92(var13, false).field2077 || class141.field2180)) {
                        for (int var14 = 0; var14 < var12.field4068.length; var14++) {
                            if (var13 + 1 == var12.field4068[var14]) {
                                var8 += var12.field4021[var14];
                            }
                        }
                    }
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 5) {
                    var8 = class209.field3356[var3[var5++]];
                }
                if (var7 == 6) {
                    var8 = class118.field1808[class177.field2757[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class209.field3356[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class309.field5006.field3330;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class149.field2324[var15]) {
                            var8 += class177.field2757[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class254 var18 = class80.method534(120, var17);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class14.method92(var19, false).field2077 || class141.field2180)) {
                        for (int var20 = 0; var20 < var18.field4068.length; var20++) {
                            if (var19 + 1 == var18.field4068[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class212.field3388;
                }
                if (var7 == 12) {
                    var8 = class187.field2895;
                }
                if (var7 == 13) {
                    int var21 = class209.field3356[var3[var5++]];
                    int var22 = var3[var5++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var8 = class201.method1393(false, var23);
                }
                if (var7 == 18) {
                    var8 = (class309.field5006.field836 >> 7) + class101.field1517;
                }
                if (var7 == 19) {
                    var8 = (class309.field5006.field850 >> 7) + class254.field4063;
                }
                if (var7 == 20) {
                    var8 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var8;
                    }
                    if (var6 == 1) {
                        var4 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var6 == 3) {
                        var4 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)V")
    public abstract void method1539(int arg0, int arg1);

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public static void method1791(int arg0) {
        if (arg0 != 11) {
            field4228 = 99;
        }
        field4224 = null;
    }
}
