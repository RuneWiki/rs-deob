import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class91 extends class154 {

    @OriginalMember(owner = "client!be", name = "H", descriptor = "I")
    public int field1336 = 0;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "[Lvd;")
    public class160[] field1339 = new class160[5];

    @OriginalMember(owner = "client!be", name = "N", descriptor = "[I")
    public int[] field1342 = new int[5];

    @OriginalMember(owner = "client!be", name = "L", descriptor = "I")
    public int field1340;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public int field1327;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "I")
    public int field1338;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    public int field1322;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field1320 = -1;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "[I")
    public static int[] field1321 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!be", name = "C", descriptor = "B")
    public byte field1331;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    public int field1325;

    @OriginalMember(owner = "client!be", name = "I", descriptor = "I")
    public int field1337;

    @OriginalMember(owner = "client!be", name = "O", descriptor = "I")
    public int field1343;

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "Lvh;")
    public class115 field1332;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "Lmj;")
    public class152 field1333;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "Lom;")
    public class165 field1341;

    @OriginalMember(owner = "client!be", name = "F", descriptor = "Lpb;")
    public class180 field1334;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "Lt;")
    public class234 field1335;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "Lni;")
    public class308 field1323;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "Ll;")
    public class75 field1329;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "Lbe;")
    public class91 field1326;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "Z")
    public boolean field1328;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "Z")
    public boolean field1330;

    @OriginalMember(owner = "client!be", name = "P", descriptor = "Z")
    public boolean field1344;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IBI)I")
    public static final int method590(int arg0, byte arg1, int arg2) {
        field1319++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (arg1 != 63) {
            field1320 = -63;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static void method591(byte arg0) {
        int var1 = -1 % ((arg0 - 25) / 36);
        field1321 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIIILsk;IZJ)Z")
    public static final boolean method592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class202 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class228.field3576 == class185.field2812;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var24 = arg2; var24 < arg2 + arg4; var24++) {
                if (var15 < 0 || var24 < 0 || var15 >= class207.field3086 || var24 >= class265.field4271) {
                    return false;
                }
                class91 var25 = class246.field3856[arg0][var15][var24];
                if (var25 != null && var25.field1343 >= 5) {
                    return false;
                }
            }
        }
        class160 var16 = new class160();
        var16.field2225 = arg11;
        var16.field2221 = arg0;
        var16.field2226 = arg5;
        var16.field2227 = arg6;
        var16.field2233 = arg7;
        var16.field2230 = arg8;
        var16.field2222 = arg9;
        var16.field2234 = arg1;
        var16.field2229 = arg2;
        var16.field2224 = arg1 + arg3 - 1;
        var16.field2228 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; var17++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var17 > arg1) {
                    var21++;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class246.field3856[var22][var17][var20] == null) {
                        class246.field3856[var22][var17][var20] = new class91(var22, var17, var20);
                    }
                }
                class91 var23 = class246.field3856[arg0][var17][var20];
                var23.field1339[var23.field1343] = var16;
                var23.field1342[var23.field1343] = var21;
                var23.field1336 |= var21;
                var23.field1343++;
                if (var13 && class271.field4320[var17][var20] != 0) {
                    var14 = class271.field4320[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; var18++) {
                for (int var19 = arg2; var19 < arg2 + arg4; var19++) {
                    if (class271.field4320[var18][var19] == 0) {
                        class271.field4320[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class126.field1764[class57.field787++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(III)V")
    public class91(int arg0, int arg1, int arg2) {
        this.field1340 = arg1;
        this.field1327 = arg2;
        this.field1322 = this.field1338 = arg0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILbj;)Lcg;")
    public static final class263 method593(int arg0, class215 arg1) {
        if (arg0 == 1) {
            field1318++;
            return new class263(arg1.method1356(false), arg1.method1356(false), arg1.method1356(false), arg1.method1356(false), arg1.method1403(6591), arg1.method1403(6591), arg1.method1374((byte) -60));
        } else {
            return null;
        }
    }
}
