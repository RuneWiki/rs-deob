import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class48 extends class270 {

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "I")
    private int field761;

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!dl", name = "H", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!dl", name = "I", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!dl", name = "L", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!dl", name = "F", descriptor = "[Lpr;")
    public class233[] field765;

    @OriginalMember(owner = "client!dl", name = "G", descriptor = "[[B")
    private byte[][] field766;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(B)V", line = 3)
    public static final void method339(byte arg0) {
        int var1 = -60 / ((-arg0 - 35) / 60);
        class479.field7067 = class136.field2303.field5218 + class136.field2303.field5202 + 2;
        class383.field5913 = new String[500];
        class442.field6599 = class84.field1467.field5218 + class84.field1467.field5202 + 2;
        field759++;
        for (int var2 = 0; var2 < class383.field5913.length; var2++) {
            class383.field5913[var2] = "";
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(II)Z", line = 28)
    public final boolean method340(int arg0, int arg1) {
        if (arg0 != -2) {
            field764 = -8;
        }
        field760++;
        return this.field765[arg1].field4030;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZI)V", line = 42)
    public static final void method341(boolean arg0, int arg1) {
        field768++;
        if (!arg0) {
            field764 = -36;
        }
        if (!class510.field7403.field5109) {
            arg1 = -1;
        }
        if (class31.field485 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class419 var2 = class209.field3313.method1912((byte) -117, arg1);
            class523 var3 = var2.method2574(0);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class419.field6342.method2885(class270.field4495, var3.method3099(), var3.method3096(), var3.method3087(), new Point(var2.field6337, var2.field6335), 17);
                class31.field485 = arg1;
            }
        }
        if (arg1 == -1 && class31.field485 != -1) {
            class419.field6342.method2885(class270.field4495, -1, null, -1, new Point(), 17);
            class31.field485 = -1;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)Z", line = 81)
    public final boolean method342(int arg0) {
        field771++;
        if (this.field765 != null) {
            return true;
        }
        if (this.field766 == null) {
            if (!class448.field6682.method2925(0, this.field761)) {
                return false;
            }
            int[] var2 = class448.field6682.method2923(this.field761, -84);
            this.field766 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field766[var3] = class448.field6682.method2926(var2[var3], -81, this.field761);
            }
        }
        boolean var4 = true;
        if (arg0 < 9) {
            this.method346(true, 19);
        }
        for (int var5 = 0; var5 < this.field766.length; var5++) {
            byte[] var14 = this.field766[var5];
            int var15 = var14[1] & 0xFF | var14[0] & 0xFF << 8;
            var4 &= class351.field5486.method2929(var15, -63);
        }
        if (!var4) {
            return false;
        }
        class411 var6 = new class411();
        int var7 = class448.field6682.method2940(this.field761, -10511);
        this.field765 = new class233[var7];
        int[] var8 = class448.field6682.method2923(this.field761, -125);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field766[var9];
            int var11 = var10[1] & 0xFF | var10[0] & 0xFF << 8;
            class191 var12 = null;
            for (class191 var13 = (class191) var6.method2538(-3); var13 != null; var13 = (class191) var6.method2535((byte) -73)) {
                if (var13.field2970 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class191(var11, class351.field5486.method2942(var11, -10365));
                var6.method2541(0, var12);
            }
            this.field765[var8[var9]] = new class233(var10, var12);
        }
        this.field766 = null;
        return true;
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(B)Lij;", line = 177)
    public static final class266 method343(byte arg0) {
        if (arg0 < 95) {
            return null;
        }
        field770++;
        class266 var1 = (class266) class367.field5707.method3056(127);
        if (var1 != null) {
            var1.method1821((byte) -81);
            var1.method1799((byte) 89);
            return var1;
        }
        class266 var2;
        do {
            var2 = (class266) class14.field157.method3056(127);
            if (var2 == null) {
                return null;
            }
            if (var2.method1780(0) > class19.method91((byte) 98)) {
                return null;
            }
            var2.method1821((byte) 35);
            var2.method1799((byte) -49);
        } while ((var2.field4496 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V", line = 220)
    public static final void method344(int arg0) {
        field769++;
        class420.field6346 = -1;
        class314.field4946 = -1;
        class333.field5246 = arg0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)Z", line = 233)
    public static final boolean method345(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field767++;
            return class460.method2743(arg1, (byte) -112, arg0) || class378.method2397(-3469, arg1, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(ZI)Z", line = 247)
    public final boolean method346(boolean arg0, int arg1) {
        field758++;
        return arg0 ? true : this.field765[arg1].field4037;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(I)V", line = 259)
    public class48(int arg0) {
        this.field761 = arg0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IILpl;I)V", line = 267)
    public static final void method347(int arg0, int arg1, class162 arg2, int arg3) {
        field763++;
        if (arg2 == null || class108.field1934.field6207 == arg2) {
            return;
        }
        int var4 = arg2.field2582;
        int var5 = arg2.field2581;
        int var6 = arg2.field2576;
        int var7 = (int) arg2.field2578;
        long var8 = arg2.field2578;
        if (var6 >= 2000) {
            var6 -= 2000;
        }
        if (var6 == 1010) {
            class6.field74 = 0;
            class162.field2574 = arg3;
            class332.field5226 = arg1;
            class525.field7722 = 2;
            class505 var10 = (class505) class147.field2396.method2516((long) var7, arg0 ^ 0x1);
            if (var10 != null) {
                class265 var11 = var10.field7355;
                class510 var12 = var11.field4430;
                if (var12.field7448 != null) {
                    var12 = var12.method3000(1, class327.field5160);
                }
                if (var12 != null) {
                    class265.method1775(-2, class322.field5061);
                    class499.field7312++;
                    class261.field4357.method182(var12.field7465, 109);
                }
            }
        }
        if (var6 == 51) {
            class68 var13 = class453.method2708(var5, 126, var4);
            if (var13 != null) {
                class39.method285(false, var13);
            }
        }
        if (var6 == 4) {
            class236.field4082++;
            class332.field5226 = arg1;
            class6.field74 = 0;
            class525.field7722 = 2;
            class162.field2574 = arg3;
            class265.method1775(-2, class419.field6340);
            class261.field4357.method139(class455.field6794 + var5, (byte) 122);
            class261.field4357.method178(var7, (byte) 106);
            class261.field4357.method182(class16.field181 + var4, -118);
            class261.field4357.method182(class421.field6365, -123);
            class261.field4357.method163(class468.field6955.method1369(82, 26) ? 1 : 0, (byte) 49);
            class261.field4357.method178(class75.field1309, (byte) -96);
            class261.field4357.method118(-156051016, class345.field5413);
            class60.method402((byte) 116, var4, var5);
        }
        if (var6 == 5) {
            class505 var14 = (class505) class147.field2396.method2516((long) var7, -1);
            if (var14 != null) {
                class162.field2574 = arg3;
                class332.field5226 = arg1;
                class265 var15 = var14.field7355;
                class506.field7370++;
                class525.field7722 = 2;
                class6.field74 = 0;
                class265.method1775(-2, class170.field2733);
                class261.field4357.method163(class468.field6955.method1369(82, 26) ? 1 : 0, (byte) 49);
                class261.field4357.method159(class345.field5413, (byte) 22);
                class261.field4357.method139(var7, (byte) 122);
                class261.field4357.method178(class421.field6365, (byte) 102);
                class261.field4357.method139(class75.field1309, (byte) 122);
                class452.method2703(0, -2, var15.field3159[0], var15.field3158[0], 0, (byte) -124, true, var15.method1143(arg0 + 2), var15.method1143(0));
            }
        }
        if (var6 == 16) {
            class162.field2574 = arg3;
            class525.field7722 = 2;
            class6.field74 = 0;
            class332.field5226 = arg1;
            class130.field2228++;
            class265.method1775(-2, class14.field162);
            class261.field4357.method122(arg0 + 30395, class345.field5413);
            class261.field4357.method178(class302.field4850.field3130, (byte) -103);
            class261.field4357.method178(class75.field1309, (byte) -119);
            class261.field4357.method178(class421.field6365, (byte) 104);
            class261.field4357.method130(class468.field6955.method1369(82, 26) ? 1 : 0, -118);
        }
        if (var6 == 58) {
            class166 var16 = class435.field6489[var7];
            if (var16 != null) {
                class332.field5226 = arg1;
                class525.field7722 = 2;
                class6.field74 = 0;
                class289.field4698++;
                class162.field2574 = arg3;
                class265.method1775(-2, class131.field2240);
                class261.field4357.method178(var7, (byte) -108);
                class261.field4357.method119(class468.field6955.method1369(82, 26) ? 1 : 0, arg0 ^ 0x1279);
                class452.method2703(0, -2, var16.field3159[0], var16.field3158[0], 0, (byte) -127, true, var16.method1143(0), var16.method1143(arg0 ^ 0xFFFFFFFE));
            }
        }
        if (var6 == 59) {
            class505 var17 = (class505) class147.field2396.method2516((long) var7, arg0 + 1);
            if (var17 != null) {
                class162.field2574 = arg3;
                class525.field7722 = 2;
                class498.field7310++;
                class6.field74 = 0;
                class265 var18 = var17.field7355;
                class332.field5226 = arg1;
                class265.method1775(-2, class75.field1307);
                class261.field4357.method178(var7, (byte) -110);
                class261.field4357.method163(class468.field6955.method1369(82, 26) ? 1 : 0, (byte) 49);
                class452.method2703(0, -2, var18.field3159[0], var18.field3158[0], 0, (byte) -128, true, var18.method1143(0), var18.method1143(0));
            }
        }
        if (var6 == 12) {
            class505 var19 = (class505) class147.field2396.method2516((long) var7, -1);
            if (var19 != null) {
                class525.field7722 = 2;
                class162.field2574 = arg3;
                class332.field5226 = arg1;
                class386.field5925++;
                class6.field74 = 0;
                class265 var20 = var19.field7355;
                class265.method1775(arg0, class193.field3006);
                class261.field4357.method182(var7, -128);
                class261.field4357.method163(class468.field6955.method1369(82, 26) ? 1 : 0, (byte) 49);
                class452.method2703(0, -2, var20.field3159[0], var20.field3158[0], 0, (byte) -123, true, var20.method1143(0), var20.method1143(0));
            }
        }
        if (var6 == 23) {
            if (class407.field6189 > 0 && class468.field6955.method1369(82, 26) && class468.field6955.method1369(81, 26)) {
                class381.method2407(class455.field6794 + var5, class16.field181 - -var4, class302.field4850.field4720, false);
            } else {
                class507.method2984(var7, var5, var4, true);
                if (var7 == 1) {
                    class261.field4357.method163(-1, (byte) 49);
                    class261.field4357.method163(-1, (byte) 49);
                    class261.field4357.method182((int) class88.field1483, -122);
                    class261.field4357.method163(57, (byte) 49);
                    class261.field4357.method163(class227.field3959, (byte) 49);
                    class261.field4357.method163(class435.field6507, (byte) 49);
                    class261.field4357.method163(89, (byte) 49);
                    class261.field4357.method182(class302.field4850.field4716, arg0 - 114);
                    class261.field4357.method182(class302.field4850.field4714, arg0 - 119);
                    class261.field4357.method163(63, (byte) 49);
                } else {
                    class162.field2574 = arg3;
                    class525.field7722 = 1;
                    class332.field5226 = arg1;
                    class6.field74 = 0;
                }
                class452.method2703(0, -4, var4, var5, 0, (byte) -127, true, 1, 1);
            }
        }
        if (var6 == 47 && class402.field6122 == null) {
            class70.method497(var4, var5, (byte) -84);
            class402.field6122 = class453.method2708(var5, arg0 + 110, var4);
            class396.method2476(class402.field6122, 1);
        }
        if (var6 == 19) {
            class162.field2574 = arg3;
            class525.field7722 = 2;
            class112.field1970++;
            class6.field74 = 0;
            class332.field5226 = arg1;
            class265.method1775(-2, class129.field2213);
            class261.field4357.method139(class455.field6794 + var5, (byte) 122);
            class261.field4357.method139(class16.field181 + var4, (byte) 122);
            class261.field4357.method130(class468.field6955.method1369(82, 26) ? 1 : 0, -66);
            class261.field4357.method182(var7, 82);
            class60.method402((byte) 116, var4, var5);
        }
        if (var6 == 30) {
            class6.field74 = 0;
            class525.field7722 = 2;
            class162.field2574 = arg3;
            class332.field5226 = arg1;
            class380.field5887++;
            class265.method1775(-2, class343.field5364);
            class261.field4357.method160(-742698264, class16.field181 + var4);
            class261.field4357.method182(var7, -120);
            class261.field4357.method178(class455.field6794 + var5, (byte) -114);
            class261.field4357.method163(class468.field6955.method1369(82, 26) ? 1 : 0, (byte) 49);
            class60.method402((byte) 116, var4, var5);
        }
        if (var6 == 2) {
            class68 var21 = class453.method2708(var5, 124, var4);
            if (var21 != null) {
                class467.method2772(false);
                class314 var22 = client.method475(var21);
                class121.method952(-99, var22.method1988(arg0 ^ 0x503B), var22.field4949, var21);
                class460.field6823 = class125.method983(true, var21);
                class15.field179 = var21.field1052 + "<col=ffffff>";
                if (class460.field6823 == null) {
                    class460.field6823 = "Null";
                }
            }
            return;
        }
        if (var6 == 22) {
            class332.field5226 = arg1;
            class6.field74 = 0;
            class162.field2574 = arg3;
            class403.field6127++;
            class525.field7722 = 2;
            class265.method1775(-2, class529.field7781);
            class261.field4357.method139(class75.field1309, (byte) 122);
            class261.field4357.method178(class421.field6365, (byte) -115);
            class261.field4357.method119(class468.field6955.method1369(82, 26) ? 1 : 0, arg0 - 4727);
            class261.field4357.method152(class345.field5413, (byte) -38);
            class261.field4357.method139(class16.field181 + var4, (byte) 122);
            class261.field4357.method178(var5 + class455.field6794, (byte) -90);
            class261.field4357.method139((int) (var8 >>> 32) & Integer.MAX_VALUE, (byte) 122);
            class271.method1808(var4, var8, var5, (byte) 121);
        }
        if (var6 == 57) {
            class505 var23 = (class505) class147.field2396.method2516((long) var7, -1);
            if (var23 != null) {
                class162.field2574 = arg3;
                class6.field74 = 0;
                class332.field5226 = arg1;
                class525.field7722 = 2;
                class265 var24 = var23.field7355;
                class36.field539++;
                class265.method1775(-2, class20.field225);
                class261.field4357.method178(var7, (byte) -79);
                class261.field4357.method164(class468.field6955.method1369(82, 26) ? 1 : 0, (byte) -107);
                class452.method2703(0, -2, var24.field3159[0], var24.field3158[0], 0, (byte) -113, true, var24.method1143(arg0 ^ 0xFFFFFFFE), var24.method1143(0));
            }
        }
        if (var6 == 49) {
            class162.field2574 = arg3;
            class6.field74 = 0;
            class332.field5226 = arg1;
            class525.field7722 = 2;
            class517.field7649++;
            class265.method1775(arg0, class271.field4503);
            class261.field4357.method139(class455.field6794 + var5, (byte) 122);
            class261.field4357.method139(var4 + class16.field181, (byte) 122);
            class261.field4357.method182(var7, 51);
            class261.field4357.method163(class468.field6955.method1369(82, 26) ? 1 : 0, (byte) 49);
            class60.method402((byte) 116, var4, var5);
        }
        if (var6 == 46) {
            class166 var25 = class435.field6489[var7];
            if (var25 != null) {
                class332.field5226 = arg1;
                class6.field74 = 0;
                class525.field7722 = 2;
                class130.field2228++;
                class162.field2574 = arg3;
                class265.method1775(-2, class14.field162);
                class261.field4357.method122(30393, class345.field5413);
                class261.field4357.method178(var7, (byte) -104);
                class261.field4357.method178(class75.field1309, (byte) -123);
                class261.field4357.method178(class421.field6365, (byte) -94);
                class261.field4357.method130(class468.field6955.method1369(82, 26) ? 1 : 0, -56);
                class452.method2703(0, -2, var25.field3159[0], var25.field3158[0], 0, (byte) -117, true, var25.method1143(0), var25.method1143(0));
            }
        }
        if (arg0 != -2) {
            field764 = 59;
        }
        if (var6 == 15) {
            class525.field7722 = 2;
            class6.field74 = 0;
            class162.field2574 = arg3;
            class332.field5226 = arg1;
            class491.field7171++;
            class265.method1775(-2, class320.field5043);
            class261.field4357.method182(var7, arg0 ^ 0x78);
            class261.field4357.method164(class468.field6955.method1369(82, 26) ? 1 : 0, (byte) -117);
            class261.field4357.method182(class455.field6794 + var5, -116);
            class261.field4357.method160(-742698264, class16.field181 + var4);
            class60.method402((byte) 116, var4, var5);
        }
        if (var6 == 45) {
            class332.field5226 = arg1;
            class6.field74 = 0;
            class343.field5376++;
            class525.field7722 = 2;
            class162.field2574 = arg3;
            class265.method1775(arg0, class53.field857);
            class261.field4357.method139(var4 + class16.field181, (byte) 122);
            class261.field4357.method139(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) 122);
            class261.field4357.method182(class455.field6794 + var5, 46);
            class261.field4357.method163(class468.field6955.method1369(82, 26) ? 1 : 0, (byte) 49);
            class271.method1808(var4, var8, var5, (byte) 118);
        }
        if (var6 == 11) {
            class302.field4838++;
            class525.field7722 = 2;
            class162.field2574 = arg3;
            class332.field5226 = arg1;
            class6.field74 = 0;
            class265.method1775(-2, class260.field4351);
            class261.field4357.method182(class16.field181 + var4, arg0 + -116);
            class261.field4357.method160(-742698264, var7);
            class261.field4357.method160(-742698264, class455.field6794 + var5);
            class261.field4357.method163(class468.field6955.method1369(82, 26) ? 1 : 0, (byte) 49);
            class60.method402((byte) 116, var4, var5);
        }
        if (var6 == 60) {
            class525.field7722 = 1;
            class332.field5226 = arg1;
            class6.field74 = 0;
            class289.field4710++;
            class162.field2574 = arg3;
            class265.method1775(arg0, class476.field7043);
            class261.field4357.method160(-742698264, class16.field181 + var4);
            class261.field4357.method139(class455.field6794 + var5, (byte) 122);
            class261.field4357.method178(class75.field1309, (byte) 122);
            class261.field4357.method182(class421.field6365, 119);
            class261.field4357.method152(class345.field5413, (byte) -38);
            class452.method2703(0, -4, var4, var5, 0, (byte) -118, true, 1, 1);
        }
        if (var6 == 25) {
            if (class407.field6189 > 0 && class468.field6955.method1369(82, 26) && class468.field6955.method1369(81, 26)) {
                class381.method2407(class455.field6794 + var5, class16.field181 + var4, class302.field4850.field4720, false);
            } else {
                class332.field5226 = arg1;
                class217.field3779++;
                class162.field2574 = arg3;
                class6.field74 = 0;
                class525.field7722 = 1;
                class265.method1775(arg0, class468.field6952);
                class261.field4357.method139(class455.field6794 + var5, (byte) 122);
                class261.field4357.method160(-742698264, class16.field181 + var4);
            }
        }
        if (var6 == 1011) {
            class6.field74 = 0;
            class525.field7722 = 2;
            class332.field5226 = arg1;
            class505.field7354++;
            class162.field2574 = arg3;
            class265.method1775(arg0, class190.field2961);
            class261.field4357.method182(var7, arg0 ^ 0x73);
        }
        if (var6 == 44) {
            class166 var26 = class435.field6489[var7];
            if (var26 != null) {
                class162.field2574 = arg3;
                class332.field5226 = arg1;
                class111.field1963++;
                class525.field7722 = 2;
                class6.field74 = 0;
                class265.method1775(-2, class423.field6380);
                class261.field4357.method164(class468.field6955.method1369(82, arg0 ^ 0xFFFFFFE4) ? 1 : 0, (byte) -109);
                class261.field4357.method182(var7, 114);
                class452.method2703(0, -2, var26.field3159[0], var26.field3158[0], 0, (byte) -114, true, var26.method1143(0), var26.method1143(0));
            }
        }
        if (var6 == 20) {
            class525.field7722 = 2;
            class162.field2574 = arg3;
            class332.field5226 = arg1;
            class6.field74 = 0;
            class36.field533++;
            class265.method1775(-2, class49.field778);
            class261.field4357.method160(-742698264, class455.field6794 + var5);
            class261.field4357.method163(class468.field6955.method1369(82, 26) ? 1 : 0, (byte) 49);
            class261.field4357.method139(class16.field181 + var4, (byte) 122);
            class261.field4357.method160(-742698264, Integer.MAX_VALUE & (int) (var8 >>> 32));
            class271.method1808(var4, var8, var5, (byte) 122);
        }
        if (var6 == 10) {
            class166 var27 = class435.field6489[var7];
            if (var27 != null) {
                class162.field2574 = arg3;
                class6.field74 = 0;
                class332.field5226 = arg1;
                class21.field228++;
                class525.field7722 = 2;
                class265.method1775(-2, class77.field1327);
                class261.field4357.method119(class468.field6955.method1369(82, 26) ? 1 : 0, -4729);
                class261.field4357.method139(var7, (byte) 122);
                class452.method2703(0, -2, var27.field3159[0], var27.field3158[0], 0, (byte) -115, true, var27.method1143(0), var27.method1143(0));
            }
        }
        if (var6 == 17) {
            class332.field5226 = arg1;
            class77.field1342++;
            class162.field2574 = arg3;
            class6.field74 = 0;
            class525.field7722 = 2;
            class265.method1775(-2, class382.field5897);
            class261.field4357.method164(class468.field6955.method1369(82, 26) ? 1 : 0, (byte) -126);
            class261.field4357.method139(class16.field181 + var4, (byte) 122);
            class261.field4357.method182((int) (var8 >>> 32) & Integer.MAX_VALUE, -117);
            class261.field4357.method160(arg0 - 742698262, class455.field6794 + var5);
            class271.method1808(var4, var8, var5, (byte) 106);
        }
        if (var6 == 3) {
            class505 var28 = (class505) class147.field2396.method2516((long) var7, -1);
            if (var28 != null) {
                class265 var29 = var28.field7355;
                class332.field5226 = arg1;
                class162.field2574 = arg3;
                class6.field74 = 0;
                class263.field4376++;
                class525.field7722 = 2;
                class265.method1775(-2, class279.field4579);
                class261.field4357.method160(-742698264, var7);
                class261.field4357.method119(class468.field6955.method1369(82, arg0 + 28) ? 1 : 0, arg0 ^ 0x1279);
                class452.method2703(0, -2, var29.field3159[0], var29.field3158[0], 0, (byte) -121, true, var29.method1143(arg0 ^ 0xFFFFFFFE), var29.method1143(0));
            }
        }
        if (var6 == 13) {
            class166 var30 = class435.field6489[var7];
            if (var30 != null) {
                class162.field2574 = arg3;
                class525.field7722 = 2;
                class332.field5226 = arg1;
                class187.field2922++;
                class6.field74 = 0;
                class265.method1775(-2, class199.field3166);
                class261.field4357.method178(var7, (byte) -92);
                class261.field4357.method164(class468.field6955.method1369(82, 26) ? 1 : 0, (byte) -112);
                class452.method2703(0, -2, var30.field3159[0], var30.field3158[0], 0, (byte) -110, true, var30.method1143(0), var30.method1143(arg0 + 2));
            }
        }
        if (var6 == 21) {
            class505 var31 = (class505) class147.field2396.method2516((long) var7, arg0 + 1);
            if (var31 != null) {
                class162.field2574 = arg3;
                class6.field74 = 0;
                class525.field7722 = 2;
                class266.field4458++;
                class265 var32 = var31.field7355;
                class332.field5226 = arg1;
                class265.method1775(-2, class441.field6579);
                class261.field4357.method139(var7, (byte) 122);
                class261.field4357.method119(class468.field6955.method1369(82, 26) ? 1 : 0, -4729);
                class452.method2703(0, -2, var32.field3159[0], var32.field3158[0], 0, (byte) -116, true, var32.method1143(0), var32.method1143(0));
            }
        }
        if (var6 == 50) {
            class166 var33 = class435.field6489[var7];
            if (var33 != null) {
                class6.field74 = 0;
                class525.field7722 = 2;
                class332.field5226 = arg1;
                class162.field2574 = arg3;
                class17.field191++;
                class265.method1775(arg0, class528.field7776);
                class261.field4357.method178(var7, (byte) -79);
                class261.field4357.method163(class468.field6955.method1369(82, 26) ? 1 : 0, (byte) 49);
                class452.method2703(0, -2, var33.field3159[0], var33.field3158[0], 0, (byte) -125, true, var33.method1143(arg0 ^ 0xFFFFFFFE), var33.method1143(0));
            }
        }
        if (var6 == 1007) {
            class535.field7860++;
            class6.field74 = 0;
            class162.field2574 = arg3;
            class525.field7722 = 2;
            class332.field5226 = arg1;
            class265.method1775(arg0, class313.field4935);
            class261.field4357.method182(var7, arg0 + 124);
        }
        if (var6 == 1004 || var6 == 1001 || var6 == 1003 || var6 == 1008 || var6 == 1012) {
            class68.method439(-1009, var6, var7, var4);
        }
        if (var6 == 1002) {
            class6.field74 = 0;
            class135.field2295++;
            class525.field7722 = 2;
            class332.field5226 = arg1;
            class162.field2574 = arg3;
            class265.method1775(-2, class23.field313);
            class261.field4357.method178(class16.field181 + var4, (byte) -85);
            class261.field4357.method182(class455.field6794 + var5, 7);
            class261.field4357.method119(class468.field6955.method1369(82, 26) ? 1 : 0, -4729);
            class261.field4357.method160(arg0 ^ 0x2C44AD16, (int) (var8 >>> 32) & Integer.MAX_VALUE);
            class271.method1808(var4, var8, var5, (byte) 110);
        }
        if (var6 == 48) {
            class162.field2574 = arg3;
            class332.field5226 = arg1;
            class37.field557++;
            class525.field7722 = 2;
            class6.field74 = 0;
            class265.method1775(-2, class117.field2080);
            class261.field4357.method119(class468.field6955.method1369(82, 26) ? 1 : 0, -4729);
            class261.field4357.method139(var4 + class16.field181, (byte) 122);
            class261.field4357.method139(Integer.MAX_VALUE & (int) (var8 >>> 32), (byte) 122);
            class261.field4357.method182(class455.field6794 + var5, -128);
            class271.method1808(var4, var8, var5, (byte) 108);
        }
        if (var6 == 6) {
            class166 var34 = class435.field6489[var7];
            if (var34 != null) {
                class162.field2574 = arg3;
                class332.field5226 = arg1;
                class6.field74 = 0;
                class262.field4365++;
                class525.field7722 = 2;
                class265.method1775(-2, class364.field5671);
                class261.field4357.method163(class468.field6955.method1369(82, 26) ? 1 : 0, (byte) 49);
                class261.field4357.method139(var7, (byte) 122);
                class452.method2703(0, -2, var34.field3159[0], var34.field3158[0], 0, (byte) -113, true, var34.method1143(0), var34.method1143(0));
            }
        }
        if (var6 == 18 || var6 == 1009) {
            class41.method305(var4, arg2.field2572, var5, -5, var7);
        }
        if (var6 == 9) {
            class166 var35 = class435.field6489[var7];
            if (var35 != null) {
                class162.field2574 = arg3;
                class6.field74 = 0;
                class117.field2081++;
                class332.field5226 = arg1;
                class525.field7722 = 2;
                class265.method1775(-2, class127.field2187);
                class261.field4357.method160(arg0 ^ 0x2C44AD16, var7);
                class261.field4357.method130(class468.field6955.method1369(82, 26) ? 1 : 0, 79);
                class452.method2703(0, -2, var35.field3159[0], var35.field3158[0], 0, (byte) -120, true, var35.method1143(0), var35.method1143(0));
            }
        }
        if (var6 == 8) {
            class166 var36 = class435.field6489[var7];
            if (var36 != null) {
                class6.field74 = 0;
                class525.field7722 = 2;
                class432.field6466++;
                class162.field2574 = arg3;
                class332.field5226 = arg1;
                class265.method1775(-2, class118.field2095);
                class261.field4357.method163(class468.field6955.method1369(82, 26) ? 1 : 0, (byte) 49);
                class261.field4357.method160(-742698264, var7);
                class452.method2703(0, -2, var36.field3159[0], var36.field3158[0], 0, (byte) -112, true, var36.method1143(0), var36.method1143(0));
            }
        }
        if (class508.field7386) {
            class467.method2772(false);
        }
        if (class438.field6546 != null && class321.field5054 == 0) {
            class396.method2476(class438.field6546, 1);
        }
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(II)Z", line = 1002)
    public final boolean method348(int arg0, int arg1) {
        field762++;
        return arg0 == 82 ? this.field765[arg1].field4044 : true;
    }
}
