import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class81 {

    @OriginalMember(owner = "client!on", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1413 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ILla;)[Lti;", line = 5)
    public static final class248[] method600(int arg0, class157 arg1) {
        field1411++;
        if (!arg1.method1119(7173)) {
            return new class248[0];
        }
        int var2 = 93 / ((-arg0 - 85) / 33);
        class210 var3 = arg1.method1116(-115);
        while (var3.field3504 == 0) {
            class122.method881(98, 10L);
        }
        if (var3.field3504 == 2) {
            return new class248[0];
        }
        int[] var4 = (int[]) ((int[]) var3.field3501);
        class248[] var5 = new class248[var4.length >> 2];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class248 var7 = new class248();
            var5[var6] = var7;
            var7.field4070 = var4[var6 << 2];
            var7.field4073 = var4[(var6 << 2) + 1];
            var7.field4074 = var4[(var6 << 2) + 2];
            var7.field4075 = var4[(var6 << 2) + 3];
        }
        return var5;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V", line = 48)
    public static void method601(byte arg0) {
        field1413 = null;
        if (arg0 != 66) {
            field1413 = (BigInteger) null;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIILth;)V", line = 60)
    public static final void method602(int arg0, int arg1, int arg2, class98 arg3) {
        field1414++;
        int var4 = 85 % ((35 - arg1) / 62);
        if ((arg2 & 0x10) != 0) {
            arg3.field190 = class342.field5413.method1054(2);
            if (arg3.field190 == 65535) {
                arg3.field190 = -1;
            }
        }
        if ((arg2 & 0x100) != 0) {
            int var5 = class342.field5413.method1007(-2);
            int[] var6 = new int[var5];
            int[] var7 = new int[var5];
            int[] var8 = new int[var5];
            for (int var9 = 0; var9 < var5; var9++) {
                int var10 = class342.field5413.method1054(2);
                if (var10 == 65535) {
                    var10 = -1;
                }
                var6[var9] = var10;
                var7[var9] = class342.field5413.method1034(0);
                var8[var9] = class342.field5413.method989(67);
            }
            class128.method913(var7, var8, 19915, var6, arg3);
        }
        if ((arg2 & 0x4) != 0) {
            int var11 = class342.field5413.method1054(2);
            if (var11 == 65535) {
                var11 = -1;
            }
            int var12 = class342.field5413.method992((byte) 102);
            class253.method1784(120, var12, arg3, var11);
        }
        if ((arg2 & 0x400) != 0) {
            arg3.field183 = class342.field5413.method1005((byte) 122);
            arg3.field187 = class342.field5413.method992((byte) 83);
            arg3.field219 = class342.field5413.method1005((byte) 122);
            arg3.field165 = class342.field5413.method1005((byte) 122);
            arg3.field172 = class342.field5413.method989(65) + class267.field4371;
            arg3.field161 = class342.field5413.method989(117) + class267.field4371;
            arg3.field151 = class342.field5413.method1005((byte) 122);
            arg3.field179 = 1;
            arg3.field212 = 0;
        }
        if ((arg2 & 0x80) != 0) {
            int var13 = class342.field5413.method1020(true);
            int var14 = class342.field5413.method1005((byte) 122);
            arg3.method47(class267.field4371, var13, -68, var14);
            arg3.field137 = class267.field4371 + 300;
            arg3.field174 = class342.field5413.method992((byte) 126);
        }
        if ((arg2 & 0x200) != 0) {
            int var15 = class342.field5413.method989(69);
            boolean var16 = true;
            int var17 = class342.field5413.method1024(11008);
            if (var15 == 65535) {
                var15 = -1;
            }
            if (var15 != -1 && arg3.field127 != -1 && class258.method1807(class134.method944(1, var15).field3322, 97).field4892 < class258.method1807(class134.method944(1, arg3.field127).field3322, 63).field4892) {
                var16 = false;
            }
            if (var16) {
                arg3.field204 = 1;
                arg3.field153 = 0;
                arg3.field147 = 0;
                arg3.field159 = var17 >> 16;
                arg3.field127 = var15;
                arg3.field209 = (var17 & 0xFFFF) + class267.field4371;
                if (arg3.field209 > class267.field4371) {
                    arg3.field147 = -1;
                }
                if (arg3.field127 != -1 && class267.field4371 == arg3.field209) {
                    int var18 = class134.method944(1, arg3.field127).field3322;
                    if (var18 != -1) {
                        class300 var19 = class258.method1807(var18, 115);
                        if (var19 != null && var19.field4885 != null) {
                            class347.method2479(class96.field1750 == arg3, (byte) -118, var19, 0, arg3.field199, arg3.field213);
                        }
                    }
                }
            }
        }
        if ((arg2 & 0x800) != 0) {
            int var20 = class342.field5413.method1020(true);
            int var21 = class342.field5413.method992((byte) 102);
            arg3.method47(class267.field4371, var20, -100, var21);
        }
        if ((arg2 & 0x40) != 0) {
            int var22 = class342.field5413.method989(120);
            int var23 = class342.field5413.method1034(0);
            int var24 = class342.field5413.method1007(-2);
            boolean var25 = (var22 & 0x8000) != 0;
            int var26 = class342.field5413.field2435;
            if (arg3.field1779 != null && arg3.field1775 != null) {
                boolean var27 = false;
                if (var23 <= 1) {
                    if (!var25 && (class153.field2612 && !class345.field5452 || class312.field5088)) {
                        var27 = true;
                    } else if (class110.method823(arg3.field1779, -105)) {
                        var27 = true;
                    }
                }
                if (!var27 && class18.field495 == 0) {
                    class82.field1415.field2435 = 0;
                    class342.field5413.method1052(var24, 0, class82.field1415.field2496, 4);
                    class82.field1415.field2435 = 0;
                    int var28 = -1;
                    String var29;
                    if (var25) {
                        var22 &= 0x7FFF;
                        class131 var30 = class201.method1375((byte) 123, class82.field1415);
                        var28 = var30.field2265;
                        var29 = var30.field2257.method251((byte) 50, class82.field1415);
                    } else {
                        var29 = class84.method622(class298.method2136((byte) 102, class216.method1509(class82.field1415, -82)));
                    }
                    arg3.field122 = var29.trim();
                    arg3.field126 = var22 >> 8;
                    arg3.field145 = var22 & 0xFF;
                    int var31;
                    if (var23 == 1 || var23 == 2) {
                        var31 = var25 ? 17 : 1;
                    } else {
                        var31 = var25 ? 17 : 2;
                    }
                    arg3.field217 = 150;
                    if (var23 == 2) {
                        class287.method2038(false, (String) null, var29, "<img=1>" + arg3.method743(true, false), var28, "<img=1>" + arg3.method743(true, true), var31, 0);
                    } else if (var23 == 1) {
                        class287.method2038(false, (String) null, var29, "<img=0>" + arg3.method743(true, false), var28, "<img=0>" + arg3.method743(true, true), var31, 0);
                    } else {
                        class287.method2038(false, (String) null, var29, arg3.method743(true, false), var28, arg3.method743(true, true), var31, 0);
                    }
                }
            }
            class342.field5413.field2435 = var24 + var26;
        }
        if ((arg2 & 0x20) != 0) {
            int var32 = class342.field5413.method1034(0);
            byte[] var33 = new byte[var32];
            class146 var34 = new class146(var33);
            class342.field5413.method1015(var32, var33, 0, -800545168);
            class227.field3738[arg0] = var34;
            arg3.method745(0, arg0, var34);
        }
        if ((arg2 & 0x1) != 0) {
            arg3.field122 = class342.field5413.method1017((byte) -115);
            if (arg3.field122.charAt(0) == '~') {
                arg3.field122 = arg3.field122.substring(1);
                class220.method1533(arg3.field122, arg3.method743(true, false), 0, arg3.method743(true, true), 2, 27293);
            } else if (class96.field1750 == arg3) {
                class220.method1533(arg3.field122, arg3.method743(true, false), 0, arg3.method743(true, true), 2, 27293);
            }
            arg3.field145 = 0;
            arg3.field217 = 150;
            arg3.field126 = 0;
        }
        if ((arg2 & 0x8) != 0) {
            arg3.field157 = class342.field5413.method1054(2);
            arg3.field181 = class342.field5413.method1011(-32768);
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(B)V", line = 324)
    public static final void method603(byte arg0) {
        class328.field5273.method889((byte) -123);
        if (arg0 != -20) {
            method601((byte) 109);
        }
        field1410++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V", line = 337)
    public static final void method604(int arg0) {
        class289.field4699.method889((byte) -124);
        field1412++;
        if (arg0 != -12127) {
            method603((byte) 7);
        }
    }
}
