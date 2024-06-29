import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class132 {

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2069 = " more options";

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Z")
    public static boolean field2070 = true;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Z")
    public static boolean field2072 = true;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "[Lai;")
    public static class88[] field2075 = new class88[2048];

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lhc;")
    public static class235 field2073;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "[Lul;")
    public static class192[] field2071;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
    public static void method914(byte arg0) {
        field2073 = null;
        field2069 = null;
        field2071 = null;
        if (arg0 > 53) {
            field2075 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLre;I)I")
    public static final int method915(byte arg0, class228 arg1, int arg2) {
        field2074++;
        if (arg1.field3565 == null || arg2 >= arg1.field3565.length) {
            return -2;
        }
        try {
            int[] var3 = arg1.field3565[arg2];
            int var4 = 0;
            int var5 = 0;
            if (arg0 != 48) {
                method915((byte) -115, (class228) null, -15);
            }
            byte var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var5;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 1) {
                    var8 = class11.field194[var3[var4++]];
                }
                if (var7 == 2) {
                    var8 = class28.field382[var3[var4++]];
                }
                if (var7 == 3) {
                    var8 = class166.field2595[var3[var4++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class228 var12 = class84.method596((byte) 35, var11);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class85.method602(false, var13).field1169 || class43.field616)) {
                        for (int var14 = 0; var14 < var12.field3604.length; var14++) {
                            if (var13 + 1 == var12.field3604[var14]) {
                                var8 += var12.field3488[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class31.field462[var3[var4++]];
                }
                if (var7 == 6) {
                    var8 = class280.field4430[class28.field382[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class31.field462[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class283.field4473.field3821;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class102.field1710[var15]) {
                            var8 += class28.field382[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class228 var18 = class84.method596((byte) 35, var17);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class85.method602(false, var19).field1169 || class43.field616)) {
                        for (int var20 = 0; var20 < var18.field3604.length; var20++) {
                            if ((var19 + 1) == var18.field3604[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class180.field2800;
                }
                if (var7 == 12) {
                    var8 = class102.field1705;
                }
                if (var7 == 13) {
                    int var21 = class31.field462[var3[var4++]];
                    int var22 = var3[var4++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var8 = class251.method1719(true, var23);
                }
                if (var7 == 18) {
                    var8 = (class283.field4473.field2240 >> 7) + class46.field656;
                }
                if (var7 == 19) {
                    var8 = (class283.field4473.field2278 >> 7) + class260.field4162;
                }
                if (var7 == 20) {
                    var8 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var5 += var8;
                    }
                    if (var6 == 1) {
                        var5 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var5 /= var8;
                    }
                    if (var6 == 3) {
                        var5 *= var8;
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

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILhc;IIZI)V")
    public static final void method916(int arg0, class235 arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class253.field4061 = 1;
        class205.field3198 = arg1;
        class111.field1817 = arg3;
        if (arg0 != -6178) {
            method917(-39);
        }
        class84.field1422 = arg4;
        class240.field3908 = 10000;
        class179.field2783 = arg5;
        class179.field2792 = arg2;
        field2068++;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static final void method917(int arg0) {
        class171.field2678.method1888(109);
        field2076++;
        int var1 = 20 / ((arg0 - 55) / 41);
        class165.field2587.method1888(125);
    }
}
