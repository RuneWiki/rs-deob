import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class357 {

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
    private static int field4991 = 0;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "[Lkia;")
    private static class618[] field4992 = new class618[50];

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "[I")
    private static int[] field4996 = new int[1000];

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "[[I")
    private static int[][] field5004 = new int[5][5000];

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
    private static int field5001 = 0;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
    private static int field4997 = 0;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "[Ljava/lang/String;")
    private static String[] field5010 = new String[1000];

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "[I")
    private static int[] field5009 = new int[5];

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "Ljava/util/Calendar;")
    private static Calendar field5000 = Calendar.getInstance();

    @OriginalMember(owner = "client!ws", name = "C", descriptor = "[Ljava/lang/String;")
    private static String[] field5018 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ws", name = "A", descriptor = "[I")
    private static int[] field5017 = new int[3];

    @OriginalMember(owner = "client!ws", name = "y", descriptor = "Lnga;")
    public static class510 field5015 = new class510(4);

    @OriginalMember(owner = "client!ws", name = "D", descriptor = "I")
    private static int field5019 = 0;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!ws", name = "x", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "Lgm;")
    private static class123 field4995;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "Ldm;")
    private static class50 field4994;

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "Ldm;")
    private static class50 field5012;

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "[I")
    private static int[] field5002;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "[Ljava/lang/String;")
    private static String[] field5007;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lraa;)V", line = 3)
    public static final void method2223(class604 arg0) {
        method2233(arg0, 200000);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V", line = 7)
    private static final void method2224(int arg0) {
        class50 var1 = class545.method3220(65535, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class50[] var3 = class463.field6662[var2];
        if (var3 == null) {
            class50[] var4 = class117.field1849[var2];
            int var5 = var4.length;
            var3 = class463.field6662[var2] = new class50[var5];
            class622.method3594(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class622.method3594(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "()V", line = 55)
    public static void method2225() {
        field5002 = null;
        field5007 = null;
        field5009 = null;
        field5004 = null;
        field4996 = null;
        field5010 = null;
        field4992 = null;
        field4994 = null;
        field5012 = null;
        field4995 = null;
        field5000 = null;
        field5018 = null;
        field5017 = null;
        field5015 = null;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(C)I", line = 72)
    private static final int method2226(char arg0) {
        return class371.method2328(false, arg0) ? 1 : 0;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IZ)V", line = 76)
    private static final void method2227(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field4996[field4991++] = class261.field3816;
                return;
            }
            if (arg0 == 5001) {
                field4991 -= 3;
                class261.field3816 = field4996[field4991];
                class489.field6980 = class379.method2372(field4996[field4991 + 1], (byte) 124);
                if (class489.field6980 == null) {
                    class489.field6980 = class254.field3687;
                }
                class474.field6793 = field4996[field4991 + 2];
                field5008++;
                class135 var2 = class273.method1801(class459.field6629, class34.field453, 2);
                var2.field2109.method263((byte) -94, class261.field3816);
                var2.field2109.method263((byte) 112, class489.field6980.field6578);
                var2.field2109.method263((byte) 76, class474.field6793);
                class539.method3178(var2, -18925);
                return;
            }
            if (arg0 == 5002) {
                field4997 -= 2;
                String var3 = field5010[field4997];
                String var4 = field5010[field4997 + 1];
                field4991 -= 2;
                int var5 = field4996[field4991];
                int var6 = field4996[field4991 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field5005++;
                class135 var7 = class273.method1801(class459.field6629, class208.field2996, 2);
                var7.field2109.method263((byte) -101, class552.method3233((byte) -47, var3) + class552.method3233((byte) -60, var4) + 2);
                var7.field2109.method287((byte) 0, var3);
                var7.field2109.method263((byte) -87, var5 - 1);
                var7.field2109.method263((byte) 86, var6);
                var7.field2109.method287((byte) 0, var4);
                class539.method3178(var7, -18925);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field4996[--field4991];
                class146 var9 = class279.method1828(var8, (byte) -125);
                String var10 = "";
                if (var9 != null && var9.field2229 != null) {
                    var10 = var9.field2229;
                }
                field5010[field4997++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field4996[--field4991];
                class146 var12 = class279.method1828(var11, (byte) -69);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field2228;
                }
                field4996[field4991++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class489.field6980 == null) {
                    field4996[field4991++] = -1;
                    return;
                }
                field4996[field4991++] = class489.field6980.field6578;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field4996[--field4991];
                class135 var15 = class273.method1801(class459.field6629, class37.field557, 2);
                var15.field2109.method263((byte) 54, var14);
                class539.method3178(var15, -18925);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field5010[--field4997];
                method2228(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field4997 -= 2;
                String var17 = field5010[field4997];
                String var18 = field5010[field4997 + 1];
                if (class79.field1485 != 0 || (!class231.field3285 || class29.field398) && !class253.field3605) {
                    field4999++;
                    class135 var19 = class273.method1801(class459.field6629, class203.field2892, 2);
                    var19.field2109.method263((byte) 65, 0);
                    int var20 = var19.field2109.field469;
                    var19.field2109.method287((byte) 0, var17);
                    class687.method3863(0, var18, var19.field2109);
                    var19.field2109.method230(66, var19.field2109.field469 - var20);
                    class539.method3178(var19, -18925);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field4996[--field4991];
                class146 var22 = class279.method1828(var21, (byte) -74);
                String var23 = "";
                if (var22 != null && var22.field2234 != null) {
                    var23 = var22.field2234;
                }
                field5010[field4997++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field4996[--field4991];
                class146 var25 = class279.method1828(var24, (byte) -118);
                String var26 = "";
                if (var25 != null && var25.field2231 != null) {
                    var26 = var25.field2231;
                }
                field5010[field4997++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field4996[--field4991];
                class146 var28 = class279.method1828(var27, (byte) -67);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field2242;
                }
                field4996[field4991++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class468.field6748 == null || class468.field6748.field4897 == null) {
                    var30 = "";
                } else {
                    var30 = class468.field6748.method2192(true, -32526);
                }
                field5010[field4997++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field4996[field4991++] = class474.field6793;
                return;
            }
            if (arg0 == 5017) {
                field4996[field4991++] = class204.method1422(-22);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field4996[--field4991];
                class146 var32 = class279.method1828(var31, (byte) -74);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field2236;
                }
                field4996[field4991++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field4996[--field4991];
                class146 var35 = class279.method1828(var34, (byte) -112);
                String var36 = "";
                if (var35 != null && var35.field2232 != null) {
                    var36 = var35.field2232;
                }
                field5010[field4997++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class468.field6748 == null || class468.field6748.field4897 == null) {
                    var37 = "";
                } else {
                    var37 = class468.field6748.method2196((byte) -95, false);
                }
                field5010[field4997++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field4996[--field4991];
                class146 var39 = class279.method1828(var38, (byte) -100);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field2230;
                }
                field4996[field4991++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field4996[--field4991];
                class146 var42 = class279.method1828(var41, (byte) -79);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field2239;
                }
                field4996[field4991++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field4996[--field4991];
                class146 var45 = class279.method1828(var44, (byte) -110);
                String var46 = "";
                if (var45 != null && var45.field2238 != null) {
                    var46 = var45.field2238;
                }
                field5010[field4997++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field4996[--field4991];
                field5010[field4997++] = class87.field1581.method3040(var47, -121).field4655;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field4996[--field4991];
                class330 var49 = class87.field1581.method3040(var48, -92);
                if (var49.field4670 == null) {
                    field4996[field4991++] = 0;
                    return;
                }
                field4996[field4991++] = var49.field4670.length;
                return;
            }
            if (arg0 == 5052) {
                field4991 -= 2;
                int var50 = field4996[field4991];
                int var51 = field4996[field4991 + 1];
                class330 var52 = class87.field1581.method3040(var50, -104);
                int var53 = var52.field4670[var51];
                field4996[field4991++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field4996[--field4991];
                class330 var55 = class87.field1581.method3040(var54, -88);
                if (var55.field4660 == null) {
                    field4996[field4991++] = 0;
                    return;
                }
                field4996[field4991++] = var55.field4660.length;
                return;
            }
            if (arg0 == 5054) {
                field4991 -= 2;
                int var56 = field4996[field4991];
                int var57 = field4996[field4991 + 1];
                field4996[field4991++] = class87.field1581.method3040(var56, -127).field4660[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field4996[--field4991];
                field5010[field4997++] = class643.field9141.method3679(var58, 64).method2338((byte) -112);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field4996[--field4991];
                class372 var60 = class643.field9141.method3679(var59, 64);
                if (var60.field5216 == null) {
                    field4996[field4991++] = 0;
                    return;
                }
                field4996[field4991++] = var60.field5216.length;
                return;
            }
            if (arg0 == 5057) {
                field4991 -= 2;
                int var61 = field4996[field4991];
                int var62 = field4996[field4991 + 1];
                field4996[field4991++] = class643.field9141.method3679(var61, 64).field5216[var62];
                return;
            }
            if (arg0 == 5058) {
                field4995 = new class123();
                field4995.field1901 = field4996[--field4991];
                field4995.field1902 = class643.field9141.method3679(field4995.field1901, 64);
                field4995.field1904 = new int[field4995.field1902.method2341((byte) 104)];
                return;
            }
            if (arg0 == 5059) {
                field4998++;
                class135 var63 = class273.method1801(class459.field6629, class662.field9318, 2);
                var63.field2109.method263((byte) 65, 0);
                int var64 = var63.field2109.field469;
                var63.field2109.method263((byte) -74, 0);
                var63.field2109.method223(1493807496, field4995.field1901);
                field4995.field1902.method2336(field4995.field1904, var63.field2109, (byte) -117);
                var63.field2109.method230(35, var63.field2109.field469 - var64);
                class539.method3178(var63, -18925);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field5010[--field4997];
                field5011++;
                class135 var66 = class273.method1801(class459.field6629, class319.field4543, 2);
                var66.field2109.method263((byte) -103, 0);
                int var67 = var66.field2109.field469;
                var66.field2109.method287((byte) 0, var65);
                var66.field2109.method223(1493807496, field4995.field1901);
                field4995.field1902.method2336(field4995.field1904, var66.field2109, (byte) -117);
                var66.field2109.method230(92, var66.field2109.field469 - var67);
                class539.method3178(var66, -18925);
                return;
            }
            if (arg0 == 5061) {
                field4998++;
                class135 var68 = class273.method1801(class459.field6629, class662.field9318, 2);
                var68.field2109.method263((byte) -121, 0);
                int var69 = var68.field2109.field469;
                var68.field2109.method263((byte) 117, 1);
                var68.field2109.method223(1493807496, field4995.field1901);
                field4995.field1902.method2336(field4995.field1904, var68.field2109, (byte) -117);
                var68.field2109.method230(45, var68.field2109.field469 - var69);
                class539.method3178(var68, -18925);
                return;
            }
            if (arg0 == 5062) {
                field4991 -= 2;
                int var70 = field4996[field4991];
                int var71 = field4996[field4991 + 1];
                field4996[field4991++] = class87.field1581.method3040(var70, -70).field4664[var71];
                return;
            }
            if (arg0 == 5063) {
                field4991 -= 2;
                int var72 = field4996[field4991];
                int var73 = field4996[field4991 + 1];
                field4996[field4991++] = class87.field1581.method3040(var72, -82).field4662[var73];
                return;
            }
            if (arg0 == 5064) {
                field4991 -= 2;
                int var74 = field4996[field4991];
                int var75 = field4996[field4991 + 1];
                if (var75 == -1) {
                    field4996[field4991++] = -1;
                    return;
                }
                field4996[field4991++] = class87.field1581.method3040(var74, -76).method2109((char) var75, 8);
                return;
            }
            if (arg0 == 5065) {
                field4991 -= 2;
                int var76 = field4996[field4991];
                int var77 = field4996[field4991 + 1];
                if (var77 == -1) {
                    field4996[field4991++] = -1;
                    return;
                }
                field4996[field4991++] = class87.field1581.method3040(var76, -78).method2107((char) var77, 31);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field4996[--field4991];
                field4996[field4991++] = class643.field9141.method3679(var78, 64).method2341((byte) 87);
                return;
            }
            if (arg0 == 5067) {
                field4991 -= 2;
                int var79 = field4996[field4991];
                int var80 = field4996[field4991 + 1];
                int var81 = class643.field9141.method3679(var79, 64).method2343(78, var80).field1842;
                field4996[field4991++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field4991 -= 2;
                int var82 = field4996[field4991];
                int var83 = field4996[field4991 + 1];
                field4995.field1904[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field4991 -= 2;
                int var84 = field4996[field4991];
                int var85 = field4996[field4991 + 1];
                field4995.field1904[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field4991 -= 3;
                int var86 = field4996[field4991];
                int var87 = field4996[field4991 + 1];
                int var88 = field4996[field4991 + 2];
                class372 var89 = class643.field9141.method3679(var86, 64);
                if (var89.method2343(73, var87).field1842 != 0) {
                    throw new RuntimeException("bad command");
                }
                field4996[field4991++] = var89.method2344(var88, var87, true);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field5010[--field4997];
                boolean var91 = field4996[--field4991] == 1;
                class181.method1297(var90, var91, 262144);
                field4996[field4991++] = class525.field7465;
                return;
            }
            if (arg0 == 5072) {
                if (class330.field4657 != null && class271.field3882 < class525.field7465) {
                    field4996[field4991++] = class330.field4657[class271.field3882++] & 0xFFFF;
                    return;
                }
                field4996[field4991++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class271.field3882 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class167.field2461.method1540(121, 86)) {
                    field4996[field4991++] = 1;
                    return;
                }
                field4996[field4991++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class167.field2461.method1540(123, 82)) {
                    field4996[field4991++] = 1;
                    return;
                }
                field4996[field4991++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class167.field2461.method1540(124, 81)) {
                    field4996[field4991++] = 1;
                    return;
                }
                field4996[field4991++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class712.method3976(field4996[--field4991], 95);
                return;
            }
            if (arg0 == 5201) {
                field4996[field4991++] = class694.method3901(false);
                return;
            }
            if (arg0 == 5205) {
                class462.method2807((byte) 12, -1, field4996[--field4991], -1, false);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field4996[--field4991];
                class725 var93 = class542.method3209(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field4996[field4991++] = -1;
                    return;
                }
                field4996[field4991++] = var93.field10143;
                return;
            }
            if (arg0 == 5207) {
                class725 var94 = class542.method3191(field4996[--field4991]);
                if (var94 != null && var94.field10150 != null) {
                    field5010[field4997++] = var94.field10150;
                    return;
                }
                field5010[field4997++] = "";
                return;
            }
            if (arg0 == 5208) {
                field4996[field4991++] = class618.field8928;
                field4996[field4991++] = class189.field2728;
                return;
            }
            if (arg0 == 5209) {
                field4996[field4991++] = class587.field8271 + class542.field7632;
                field4996[field4991++] = class590.field8288 + class542.field7644;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field4996[--field4991];
                class725 var96 = class542.method3191(var95);
                if (var96 == null) {
                    field4996[field4991++] = 0;
                    field4996[field4991++] = 0;
                    return;
                }
                field4996[field4991++] = var96.field10140 >> 14 & 0x3FFF;
                field4996[field4991++] = var96.field10140 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field4996[--field4991];
                class725 var98 = class542.method3191(var97);
                if (var98 == null) {
                    field4996[field4991++] = 0;
                    field4996[field4991++] = 0;
                    return;
                }
                field4996[field4991++] = var98.field10154 - var98.field10157;
                field4996[field4991++] = var98.field10149 - var98.field10155;
                return;
            }
            if (arg0 == 5212) {
                class541 var99 = class371.method2332((byte) -107);
                if (var99 == null) {
                    field4996[field4991++] = -1;
                    field4996[field4991++] = -1;
                    return;
                }
                field4996[field4991++] = var99.field7608;
                int var100 = var99.field7605 << 28 | class542.field7632 + var99.field7597 << 14 | class542.field7644 + var99.field7601;
                field4996[field4991++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class541 var101 = class704.method3946((byte) -128);
                if (var101 == null) {
                    field4996[field4991++] = -1;
                    field4996[field4991++] = -1;
                    return;
                }
                field4996[field4991++] = var101.field7608;
                int var102 = var101.field7605 << 28 | class542.field7632 + var101.field7597 << 14 | class542.field7644 + var101.field7601;
                field4996[field4991++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field4996[--field4991];
                class725 var104 = class79.method780((byte) -110);
                if (var104 != null) {
                    boolean var105 = var104.method4037(var103 >> 14 & 0x3FFF, var103 >> 28 & 0x3, 12800, field5017, var103 & 0x3FFF);
                    if (var105) {
                        class352.method2210(field5017[1], field5017[2], (byte) -10);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field4991 -= 2;
                int var106 = field4996[field4991];
                int var107 = field4996[field4991 + 1];
                class158 var108 = class542.method3187(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class725 var110 = (class725) var108.method1196(-128); var110 != null; var110 = (class725) var108.method1204(false)) {
                    if (var110.field10143 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field4996[field4991++] = 1;
                    return;
                }
                field4996[field4991++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field4996[--field4991];
                class725 var112 = class542.method3191(var111);
                if (var112 == null) {
                    field4996[field4991++] = -1;
                    return;
                }
                field4996[field4991++] = var112.field10147;
                return;
            }
            if (arg0 == 5220) {
                field4996[field4991++] = class442.field6163 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field4996[--field4991];
                class352.method2210(var113 >> 14 & 0x3FFF, var113 & 0x3FFF, (byte) -10);
                return;
            }
            if (arg0 == 5222) {
                class725 var114 = class79.method780((byte) -110);
                if (var114 != null) {
                    boolean var115 = var114.method4036(class590.field8288 + class542.field7644, -120, field5017, class587.field8271 + class542.field7632);
                    if (var115) {
                        field4996[field4991++] = field5017[1];
                        field4996[field4991++] = field5017[2];
                        return;
                    }
                    field4996[field4991++] = -1;
                    field4996[field4991++] = -1;
                    return;
                }
                field4996[field4991++] = -1;
                field4996[field4991++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field4991 -= 2;
                int var116 = field4996[field4991];
                int var117 = field4996[field4991 + 1];
                class462.method2807((byte) -110, var117 >> 14 & 0x3FFF, var116, var117 & 0x3FFF, false);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field4996[--field4991];
                class725 var119 = class79.method780((byte) -110);
                if (var119 != null) {
                    boolean var120 = var119.method4037(var118 >> 14 & 0x3FFF, var118 >> 28 & 0x3, 12800, field5017, var118 & 0x3FFF);
                    if (var120) {
                        field4996[field4991++] = field5017[1];
                        field4996[field4991++] = field5017[2];
                        return;
                    }
                    field4996[field4991++] = -1;
                    field4996[field4991++] = -1;
                    return;
                }
                field4996[field4991++] = -1;
                field4996[field4991++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field4996[--field4991];
                class725 var122 = class79.method780((byte) -110);
                if (var122 != null) {
                    boolean var123 = var122.method4036(var121 & 0x3FFF, -123, field5017, var121 >> 14 & 0x3FFF);
                    if (var123) {
                        field4996[field4991++] = field5017[1];
                        field4996[field4991++] = field5017[2];
                        return;
                    }
                    field4996[field4991++] = -1;
                    field4996[field4991++] = -1;
                    return;
                }
                field4996[field4991++] = -1;
                field4996[field4991++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class523.method3100(-72, field4996[--field4991]);
                return;
            }
            if (arg0 == 5227) {
                field4991 -= 2;
                int var124 = field4996[field4991];
                int var125 = field4996[field4991 + 1];
                class462.method2807((byte) 61, var125 >> 14 & 0x3FFF, var124, var125 & 0x3FFF, true);
                return;
            }
            if (arg0 == 5228) {
                class698.field9814 = field4996[--field4991] == 1;
                return;
            }
            if (arg0 == 5229) {
                field4996[field4991++] = class698.field9814 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field4996[--field4991];
                class93.method850(var126, 100);
                return;
            }
            if (arg0 == 5231) {
                field4991 -= 2;
                int var127 = field4996[field4991];
                boolean var128 = field4996[field4991 + 1] == 1;
                if (class380.field5294 != null) {
                    class626 var129 = class380.field5294.method4203(true, (long) var127);
                    if (var129 != null && !var128) {
                        var129.method3617(1);
                        return;
                    }
                    if (var129 == null && var128) {
                        class626 var130 = new class626();
                        class380.field5294.method4211(var130, (byte) 43, (long) var127);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field4996[--field4991];
                if (class380.field5294 != null) {
                    class626 var132 = class380.field5294.method4203(true, (long) var131);
                    field4996[field4991++] = var132 == null ? 0 : 1;
                    return;
                }
                field4996[field4991++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field4991 -= 2;
                int var133 = field4996[field4991];
                boolean var134 = field4996[field4991 + 1] == 1;
                if (class37.field552 != null) {
                    class626 var135 = class37.field552.method4203(true, (long) var133);
                    if (var135 != null && !var134) {
                        var135.method3617(1);
                        return;
                    }
                    if (var135 == null && var134) {
                        class626 var136 = new class626();
                        class37.field552.method4211(var136, (byte) 28, (long) var133);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field4996[--field4991];
                if (class37.field552 != null) {
                    class626 var138 = class37.field552.method4203(true, (long) var137);
                    field4996[field4991++] = var138 == null ? 0 : 1;
                    return;
                }
                field4996[field4991++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field4996[field4991++] = class542.field7619 == null ? -1 : class542.field7619.field10143;
                return;
            }
            if (arg0 == 5236) {
                field4991 -= 2;
                int var139 = field4996[field4991];
                int var140 = field4996[field4991 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class36.method297(0, var142, var141, var139);
                if (var143 < 0) {
                    field4996[field4991++] = -1;
                    return;
                }
                field4996[field4991++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class139.method1103((byte) 45);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field4991 -= 2;
                int var144 = field4996[field4991];
                int var145 = field4996[field4991 + 1];
                class492.method2959(3, false, var145, var144, (byte) 64);
                field4996[field4991++] = class330.field4654 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class330.field4654 != null) {
                    class492.method2959(class471.field6781.field6700.method2157(27669), false, -1, -1, (byte) 123);
                }
                return;
            }
            if (arg0 == 5302) {
                class374[] var146 = class676.method3819((byte) 55);
                field4996[field4991++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field4996[--field4991];
                class374[] var148 = class676.method3819((byte) 55);
                field4996[field4991++] = var148[var147].field5250;
                field4996[field4991++] = var148[var147].field5244;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class98.field1676;
                int var150 = class374.field5242;
                int var151 = -1;
                class374[] var152 = class676.method3819((byte) 55);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class374 var154 = var152[var153];
                    if (var154.field5250 == var149 && var154.field5244 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field4996[field4991++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field4996[field4991++] = class190.method1336((byte) -106);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field4996[--field4991];
                if (var155 >= 1 && var155 <= 2) {
                    class492.method2959(var155, false, -1, -1, (byte) 96);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field4996[field4991++] = class471.field6781.field6700.method2157(27669);
                return;
            }
            if (arg0 == 5309) {
                int var156 = field4996[--field4991];
                if (var156 >= 1 && var156 <= 2) {
                    class471.field6781.method2826(var156, (byte) 99, class471.field6781.field6700);
                    class471.field6781.method2826(var156, (byte) 102, class471.field6781.field6692);
                    class129.method994((byte) 105);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field4997 -= 2;
                String var157 = field5010[field4997];
                String var158 = field5010[field4997 + 1];
                int var159 = field4996[--field4991];
                field5006++;
                class135 var160 = class273.method1801(class459.field6629, class754.field10505, 2);
                var160.field2109.method263((byte) -116, class552.method3233((byte) 107, var157) + class552.method3233((byte) 98, var158) + 1);
                var160.field2109.method287((byte) 0, var157);
                var160.field2109.method287((byte) 0, var158);
                var160.field2109.method263((byte) 108, var159);
                class539.method3178(var160, -18925);
                return;
            }
            if (arg0 == 5401) {
                field4991 -= 2;
                class87.field1575[field4996[field4991]] = (short) class244.method1627(field4996[field4991 + 1], 0);
                class558.field7942.method723(0);
                class558.field7942.method717(-96);
                class134.field2102.method3032((byte) -67);
                class237.method1608(true);
                return;
            }
            if (arg0 == 5405) {
                field4991 -= 2;
                int var161 = field4996[field4991];
                int var162 = field4996[field4991 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class756.field10528[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field4991 -= 7;
                int var163 = field4996[field4991];
                int var164 = field4996[field4991 + 1] << 1;
                int var165 = field4996[field4991 + 2];
                int var166 = field4996[field4991 + 3];
                int var167 = field4996[field4991 + 4];
                int var168 = field4996[field4991 + 5];
                int var169 = field4996[field4991 + 6];
                if (var163 >= 0 && var163 < 2 && class756.field10528[var163] != null && var164 >= 0 && var164 < class756.field10528[var163].length) {
                    class756.field10528[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class756.field10528[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class756.field10528[field4996[--field4991]].length >> 1;
                field4996[field4991++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class330.field4654 != null) {
                    class492.method2959(class471.field6781.field6700.method2157(27669), false, -1, -1, (byte) 90);
                }
                if (class754.field10504 != null) {
                    class217.method1509(124);
                    System.exit(0);
                    return;
                }
                String var171 = class673.field9443 == null ? class395.method2451((byte) -116) : class673.field9443;
                class548.method3229(23060, var171, class341.field4796, class471.field6781.field6684.method1843(27669) == 1, false);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class224.field3210 != null) {
                    if (class224.field3210.field9093 == null) {
                        var172 = class431.method2617(class224.field3210.field9089, true);
                    } else {
                        var172 = (String) class224.field3210.field9093;
                    }
                }
                field5010[field4997++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field4996[field4991++] = class341.field4796.field5141 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class330.field4654 != null) {
                    class492.method2959(class471.field6781.field6700.method2157(27669), false, -1, -1, (byte) 65);
                }
                String var173 = field5010[--field4997];
                boolean var174 = field4996[--field4991] == 1;
                String var175 = class395.method2451((byte) -120) + var173;
                class548.method3229(23060, var175, class341.field4796, class471.field6781.field6684.method1843(27669) == 1, var174);
                return;
            }
            if (arg0 == 5422) {
                field4997 -= 2;
                String var176 = field5010[field4997];
                String var177 = field5010[field4997 + 1];
                int var178 = field4996[--field4991];
                if (var176.length() > 0) {
                    if (class484.field6847 == null) {
                        class484.field6847 = new String[class634.field9081[class649.field9170.field2572]];
                    }
                    class484.field6847[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class334.field4727 == null) {
                        class334.field4727 = new String[class634.field9081[class649.field9170.field2572]];
                    }
                    class334.field4727[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field5010[--field4997]);
                return;
            }
            if (arg0 == 5424) {
                field4991 -= 11;
                class668.field9371 = field4996[field4991];
                class78.field1467 = field4996[field4991 + 1];
                class30.field401 = field4996[field4991 + 2];
                class187.field2697 = field4996[field4991 + 3];
                class534.field7544 = field4996[field4991 + 4];
                class158.field2365 = field4996[field4991 + 5];
                class558.field7946 = field4996[field4991 + 6];
                class675.field9480 = field4996[field4991 + 7];
                class535.field7555 = field4996[field4991 + 8];
                class92.field1615 = field4996[field4991 + 9];
                class288.field4062 = field4996[field4991 + 10];
                class501.field7161.method1472(-25711, class534.field7544);
                class501.field7161.method1472(-25711, class158.field2365);
                class501.field7161.method1472(-25711, class558.field7946);
                class501.field7161.method1472(-25711, class675.field9480);
                class501.field7161.method1472(-25711, class535.field7555);
                class328.field4637 = null;
                class609.field8821 = null;
                class747.field10449 = null;
                class512.field7314 = null;
                class427.field5963 = null;
                class118.field1859 = null;
                class562.field7970 = null;
                class402.field5612 = null;
                class214.field3067 = true;
                return;
            }
            if (arg0 == 5425) {
                class376.method2361((byte) 121);
                class214.field3067 = false;
                return;
            }
            if (arg0 == 5426) {
                field4991 -= 2;
                class273.field3898 = field4996[field4991];
                class719.field10072 = field4996[field4991 + 1];
                return;
            }
            if (arg0 == 5427) {
                field4991 -= 2;
                class224.field3197 = field4996[field4991 + 1];
                return;
            }
            if (arg0 == 5428) {
                field4991 -= 2;
                int var179 = field4996[field4991];
                int var180 = field4996[field4991 + 1];
                field4996[field4991++] = class741.method4124(-24567, var179, var180) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class217.method1512(false, false, -19797, field5010[--field4997]);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class101.method889("accountcreated", class476.field6812, -27420);
                    return;
                } catch (Throwable var321) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class101.method889("accountcreatestarted", class476.field6812, -27420);
                    return;
                } catch (Throwable var322) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class139.field2160 != null) {
                    Transferable var182 = class139.field2160.getContents(null);
                    if (var182 != null) {
                        try {
                            var181 = (String) var182.getTransferData(DataFlavor.stringFlavor);
                            if (var181 == null) {
                                var181 = "";
                            }
                        } catch (Exception var323) {
                        }
                    }
                }
                field5010[field4997++] = var181;
                return;
            }
            if (arg0 == 5433) {
                class710.field9929 = field4996[--field4991];
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field4991 -= 4;
                int var183 = field4996[field4991];
                int var184 = field4996[field4991 + 1];
                int var185 = field4996[field4991 + 2];
                int var186 = field4996[field4991 + 3];
                class607.method3513(var184 << 2, var185, (var183 >> 14 & 0x3FFF) - class115.field1845, var186, 91, false, (var183 & 0x3FFF) - class64.field1160);
                return;
            }
            if (arg0 == 5501) {
                field4991 -= 4;
                int var187 = field4996[field4991];
                int var188 = field4996[field4991 + 1];
                int var189 = field4996[field4991 + 2];
                int var190 = field4996[field4991 + 3];
                class423.method2584(var188 << 2, (var187 & 0x3FFF) - class64.field1160, (var187 >> 14 & 0x3FFF) - class115.field1845, var189, (byte) -87, var190);
                return;
            }
            if (arg0 == 5502) {
                field4991 -= 6;
                int var191 = field4996[field4991];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class323.field4588 = var191;
                int var192 = field4996[field4991 + 1];
                if (var192 + 1 >= class756.field10528[class323.field4588].length >> 1) {
                    throw new RuntimeException();
                }
                class2.field20 = var192;
                class148.field2256 = 0;
                class395.field5535 = field4996[field4991 + 2];
                class638.field9103 = field4996[field4991 + 3];
                int var193 = field4996[field4991 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class84.field1533 = var193;
                int var194 = field4996[field4991 + 5];
                if (var194 + 1 >= class756.field10528[class84.field1533].length >> 1) {
                    throw new RuntimeException();
                }
                class678.field9561 = var194;
                class666.field9338 = 3;
                class411.field5689 = -1;
                class679.field9569 = -1;
                return;
            }
            if (arg0 == 5503) {
                class57.method521(true);
                return;
            }
            if (arg0 == 5504) {
                field4991 -= 2;
                class434.method2626(field4996[field4991], 0, 24811, field4996[field4991 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field4996[field4991++] = (int) class432.field6035 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field4996[field4991++] = (int) class321.field4568 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class700.method3935(false);
                return;
            }
            if (arg0 == 5508) {
                class368.method2302(true);
                return;
            }
            if (arg0 == 5509) {
                class385.method2409(false);
                return;
            }
            if (arg0 == 5510) {
                class284.method1853((byte) -27);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field4996[--field4991];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class115.field1845;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class174.field2540) {
                    var198 = class174.field2540;
                }
                int var199 = var197 - class64.field1160;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class716.field9999) {
                    var199 = class716.field9999;
                }
                class218.field3100 = (var198 << 9) + 256;
                class211.field3044 = (var199 << 9) + 256;
                class666.field9338 = 4;
                class411.field5689 = -1;
                class679.field9569 = -1;
                return;
            }
            if (arg0 == 5512) {
                class156.method1189((byte) -117);
                return;
            }
            if (arg0 == 5514) {
                class220.field3141 = field4996[--field4991];
                return;
            }
            if (arg0 == 5516) {
                field4996[field4991++] = class220.field3141;
                return;
            }
            if (arg0 == 5517) {
                int var200 = field4996[--field4991];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class115.field1845;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class174.field2540) {
                        var203 = class174.field2540;
                    }
                    int var204 = var202 - class64.field1160;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class716.field9999) {
                        var204 = class716.field9999;
                    }
                    class679.field9569 = (var203 << 9) + 256;
                    class411.field5689 = (var204 << 9) + 256;
                    return;
                }
                class679.field9569 = -1;
                class411.field5689 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field4997 -= 2;
                String var205 = field5010[field4997];
                String var206 = field5010[field4997 + 1];
                int var207 = field4996[--field4991];
                if (var205.length() > 320) {
                    return;
                }
                if (class611.field8839 != 3) {
                    return;
                }
                if (class363.field5096 == 0 && class611.field8842 == 0) {
                    class47.field696 = var205;
                    class566.field7985 = var206;
                    class595.field8697 = var207;
                    class19.method122(1, 6);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class265.method1787(-90);
                return;
            }
            if (arg0 == 5602) {
                if (class363.field5096 == 0) {
                    class8.field138 = -2;
                    class115.field1839 = -2;
                }
                return;
            }
            if (arg0 == 5604) {
                field4997--;
                if (class611.field8839 != 3) {
                    return;
                }
                if (class363.field5096 == 0 && class611.field8842 == 0) {
                    class135.method1071(field5010[field4997], (byte) 68);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field4997 -= 2;
                field4991 -= 2;
                if (class611.field8839 != 3) {
                    return;
                }
                if (class363.field5096 == 0 && class611.field8842 == 0) {
                    class252.method1711(field5010[field4997], (byte) 53, field4996[field4991], field4996[field4991 + 1] == 1, field5010[field4997 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class611.field8842 == 0) {
                    class582.field8223 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field4996[field4991++] = class115.field1839;
                return;
            }
            if (arg0 == 5608) {
                field4996[field4991++] = class386.field5410;
                return;
            }
            if (arg0 == 5609) {
                field4996[field4991++] = class582.field8223;
                return;
            }
            if (arg0 == 5611) {
                field4996[field4991++] = class697.field9804;
                return;
            }
            if (arg0 == 5612) {
                int var208 = field4996[--field4991];
                if (class611.field8839 != 7) {
                    return;
                }
                if (class363.field5096 == 0 && class611.field8842 == 0) {
                    if (class555.field7776 != null) {
                        class555.field7776.method67(-1);
                        class555.field7776 = null;
                    }
                    class595.field8697 = var208;
                    class19.method122(1, 9);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field4996[field4991++] = class115.field1839;
                return;
            }
            if (arg0 == 5615) {
                field4997 -= 2;
                String var209 = field5010[field4997];
                String var210 = field5010[field4997 + 1];
                if (var209.length() > 320) {
                    return;
                }
                if (class611.field8839 != 3) {
                    return;
                }
                if (class363.field5096 == 0 && class611.field8842 == 0) {
                    if (class555.field7776 != null) {
                        class555.field7776.method67(-1);
                        class555.field7776 = null;
                    }
                    class47.field696 = var209;
                    class566.field7985 = var210;
                    class19.method122(1, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class144.method1123(false, (byte) -38);
                return;
            }
            if (arg0 == 5617) {
                field4996[field4991++] = class8.field138;
                return;
            }
            if (arg0 == 5618) {
                field4991--;
                return;
            }
            if (arg0 == 5619) {
                field4991--;
                return;
            }
            if (arg0 == 5620) {
                field4996[field4991++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field4997 -= 2;
                field4991 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class443.field6167 != null) {
                    field4996[field4991++] = 1;
                    return;
                }
                field4996[field4991++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field4996[field4991++] = (int) (class229.field3268 >> 32);
                field4996[field4991++] = (int) (class229.field3268 & 0xFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field4996[field4991++] = class247.field3472 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class247.field3472 = true;
                class96.method872((byte) 99);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var211 = field4996[--field4991];
                class471.field6781.method2826(var211, (byte) 78, class471.field6781.field6686);
                class314.method2030(114);
                class129.method994((byte) 125);
                class671.field9412 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var212 = field4996[--field4991] == 1;
                class471.field6781.method2826(var212 ? 1 : 0, (byte) 105, class471.field6781.field6719);
                class471.field6781.method2826(var212 ? 1 : 0, (byte) 102, class471.field6781.field6704);
                class314.method2030(53);
                class138.method1100((byte) -47);
                class129.method994((byte) 81);
                class671.field9412 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var213 = field4996[--field4991] == 1;
                class471.field6781.method2826(var213 ? 2 : 1, (byte) 109, class471.field6781.field6678);
                class471.field6781.method2826(var213 ? 2 : 1, (byte) 84, class471.field6781.field6668);
                class138.method1100((byte) -47);
                class129.method994((byte) 53);
                class671.field9412 = false;
                return;
            }
            if (arg0 == 6005) {
                class471.field6781.method2826(field4996[--field4991] == 1 ? 1 : 0, (byte) 97, class471.field6781.field6665);
                class314.method2030(8);
                class129.method994((byte) 39);
                class671.field9412 = false;
                return;
            }
            if (arg0 == 6007) {
                class471.field6781.method2826(field4996[--field4991], (byte) 78, class471.field6781.field6693);
                class129.method994((byte) 71);
                class671.field9412 = false;
                return;
            }
            if (arg0 == 6008) {
                class471.field6781.method2826(field4996[--field4991] == 1 ? 1 : 0, (byte) 83, class471.field6781.field6698);
                class129.method994((byte) 98);
                class671.field9412 = false;
                return;
            }
            if (arg0 == 6010) {
                class471.field6781.method2826(field4996[--field4991] == 1 ? 1 : 0, (byte) 99, class471.field6781.field6713);
                class129.method994((byte) 112);
                class671.field9412 = false;
                return;
            }
            if (arg0 == 6011) {
                class471.field6781.method2826(field4996[--field4991], (byte) 119, class471.field6781.field6689);
                class314.method2030(77);
                class129.method994((byte) 93);
                class671.field9412 = false;
                return;
            }
            if (arg0 == 6012) {
                class471.field6781.method2826(field4996[--field4991] == 1 ? 1 : 0, (byte) 113, class471.field6781.field6688);
                class685.method3857(true);
                class246.method1631(false);
                class129.method994((byte) 116);
                class671.field9412 = false;
                return;
            }
            if (arg0 == 6014) {
                class471.field6781.method2826(field4996[--field4991] == 1 ? 2 : 0, (byte) 112, class471.field6781.field6714);
                class314.method2030(32);
                class129.method994((byte) 126);
                class671.field9412 = false;
                return;
            }
            if (arg0 == 6015) {
                class471.field6781.method2826(field4996[--field4991] == 1 ? 1 : 0, (byte) 124, class471.field6781.field6673);
                class314.method2030(109);
                class129.method994((byte) 80);
                class671.field9412 = false;
                return;
            }
            if (arg0 == 6016) {
                class471.field6781.method2826(field4996[--field4991], (byte) 106, class471.field6781.field6697);
                class54.method490((byte) -52, false, class471.field6781.field6684.method1843(27669));
                class129.method994((byte) 79);
                return;
            }
            if (arg0 == 6017) {
                class471.field6781.method2826(field4996[--field4991] == 1 ? 1 : 0, (byte) 115, class471.field6781.field6718);
                class666.method3740(23709);
                class129.method994((byte) 103);
                class671.field9412 = false;
                return;
            }
            if (arg0 == 6018) {
                class471.field6781.method2826(field4996[--field4991], (byte) 106, class471.field6781.field6690);
                class129.method994((byte) 106);
                class671.field9412 = false;
                return;
            }
            if (arg0 == 6019) {
                int var214 = field4996[--field4991];
                int var215 = class471.field6781.field6669.method3134(27669);
                if (var214 != var215) {
                    if (class379.method2373(false, class611.field8839)) {
                        if (var215 == 0 && class122.field1893 != -1) {
                            class348.method2182(0, class122.field1893, false, class351.field4955, var214, false);
                            class226.method1558(-16032);
                            class90.field1607 = false;
                        } else if (var214 == 0) {
                            class186.method1322(66);
                            class90.field1607 = false;
                        } else {
                            class741.method4123((byte) 73, var214);
                        }
                    }
                    class471.field6781.method2826(var214, (byte) 110, class471.field6781.field6669);
                    class129.method994((byte) 96);
                    class671.field9412 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class471.field6781.method2826(field4996[--field4991], (byte) 120, class471.field6781.field6685);
                class129.method994((byte) 61);
                class671.field9412 = false;
                return;
            }
            if (arg0 == 6021) {
                int var216 = class471.field6781.field6678.method3947(27669);
                class471.field6781.method2826(field4996[--field4991] == 1 ? 0 : var216, (byte) 122, class471.field6781.field6668);
                class138.method1100((byte) -47);
                return;
            }
            if (arg0 == 6023) {
                int var217 = field4996[--field4991];
                class471.field6781.method2826(var217, (byte) 119, class471.field6781.field6687);
                class129.method994((byte) 110);
                class671.field9412 = false;
                return;
            }
            if (arg0 == 6024) {
                class471.field6781.method2826(field4996[--field4991], (byte) 79, class471.field6781.field6675);
                class129.method994((byte) 109);
                return;
            }
            if (arg0 == 6025) {
                class471.field6781.method2826(field4996[--field4991], (byte) 93, class471.field6781.field6677);
                class129.method994((byte) 62);
                class671.field9412 = false;
                return;
            }
            if (arg0 == 6027) {
                int var218 = field4996[--field4991];
                if (var218 < 0 || var218 > 1) {
                    var218 = 0;
                }
                class338.method2150(1, var218 == 1);
                return;
            }
            if (arg0 == 6028) {
                class471.field6781.method2826(field4996[--field4991] == 0 ? 0 : 1, (byte) 103, class471.field6781.field6679);
                class129.method994((byte) 73);
                return;
            }
            if (arg0 == 6029) {
                class471.field6781.method2826(field4996[--field4991], (byte) 90, class471.field6781.field6693);
                class129.method994((byte) 105);
                return;
            }
            if (arg0 == 6030) {
                class471.field6781.method2826(field4996[--field4991] == 0 ? 0 : 1, (byte) 102, class471.field6781.field6674);
                class129.method994((byte) 70);
                class314.method2030(9);
                return;
            }
            if (arg0 == 6031) {
                int var219 = field4996[--field4991];
                if (var219 < 0 || var219 > 5) {
                    var219 = 2;
                }
                class54.method490((byte) -7, false, var219);
                return;
            }
            if (arg0 == 6032) {
                class471.field6781.method2826(field4996[--field4991], (byte) 114, class471.field6781.field6695);
                class129.method994((byte) 93);
                class671.field9412 = false;
                return;
            }
            if (arg0 == 6033) {
                class471.field6781.method2826(field4996[--field4991], (byte) 84, class471.field6781.field6720);
                class129.method994((byte) 49);
                return;
            }
            if (arg0 == 6034) {
                class471.field6781.method2826(field4996[--field4991] == 1 ? 1 : 0, (byte) 97, class471.field6781.field6696);
                class129.method994((byte) 107);
                class685.method3857(true);
                class671.field9412 = false;
                return;
            }
            if (arg0 == 6035) {
                int var220 = class471.field6781.field6719.method2015(27669);
                class471.field6781.method2826(field4996[--field4991] == 1 ? 1 : var220, (byte) 85, class471.field6781.field6704);
                class314.method2030(38);
                class138.method1100((byte) -47);
                return;
            }
            if (arg0 == 6036) {
                class471.field6781.method2826(field4996[--field4991], (byte) 93, class471.field6781.field6705);
                class129.method994((byte) 76);
                class291.field4095 = true;
                return;
            }
            if (arg0 == 6037) {
                class471.field6781.method2826(field4996[--field4991], (byte) 123, class471.field6781.field6666);
                class129.method994((byte) 97);
                class671.field9412 = false;
                return;
            }
            if (arg0 == 6038) {
                int var221 = field4996[--field4991];
                int var222 = class471.field6781.field6670.method3134(27669);
                if (var221 != var222 && class122.field1893 == class11.field148) {
                    if (!class379.method2373(false, class611.field8839)) {
                        if (var222 == 0) {
                            class348.method2182(0, class122.field1893, false, class351.field4955, var221, false);
                            class226.method1558(-16032);
                            class90.field1607 = false;
                        } else if (var221 == 0) {
                            class186.method1322(109);
                            class90.field1607 = false;
                        } else {
                            class741.method4123((byte) 73, var221);
                        }
                    }
                    class471.field6781.method2826(var221, (byte) 109, class471.field6781.field6670);
                    class129.method994((byte) 55);
                    class671.field9412 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var223 = field4996[--field4991];
                if (var223 > 255 || var223 < 0) {
                    var223 = 0;
                }
                if (var223 != class471.field6781.field6706.method2801(27669)) {
                    class471.field6781.method2826(var223, (byte) 88, class471.field6781.field6706);
                    class129.method994((byte) 122);
                    class671.field9412 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var224 = field4996[--field4991];
                if (var224 != class471.field6781.field6708.method3692(27669)) {
                    class471.field6781.method2826(var224, (byte) 95, class471.field6781.field6708);
                    class129.method994((byte) 127);
                    class671.field9412 = false;
                    class633.method3638(true);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field4996[field4991++] = class471.field6781.field6686.method3630(27669);
                return;
            }
            if (arg0 == 6102) {
                field4996[field4991++] = class471.field6781.field6719.method2015(27669) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field4996[field4991++] = class471.field6781.field6678.method3947(27669) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field4996[field4991++] = class471.field6781.field6665.method3026(27669) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field4996[field4991++] = class471.field6781.field6693.method1792(27669);
                return;
            }
            if (arg0 == 6108) {
                field4996[field4991++] = class471.field6781.field6698.method3675(27669) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field4996[field4991++] = class471.field6781.field6713.method3504(27669) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field4996[field4991++] = class471.field6781.field6689.method56(27669);
                return;
            }
            if (arg0 == 6112) {
                field4996[field4991++] = class471.field6781.field6688.method3933(27669) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field4996[field4991++] = class471.field6781.field6714.method3368(27669) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field4996[field4991++] = class471.field6781.field6673.method2920(27669) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field4996[field4991++] = class471.field6781.field6697.method2961(27669);
                return;
            }
            if (arg0 == 6117) {
                field4996[field4991++] = class471.field6781.field6718.method710(27669) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field4996[field4991++] = class471.field6781.field6690.method3134(27669);
                return;
            }
            if (arg0 == 6119) {
                field4996[field4991++] = class471.field6781.field6669.method3134(27669);
                return;
            }
            if (arg0 == 6120) {
                field4996[field4991++] = class471.field6781.field6685.method3134(27669);
                return;
            }
            if (arg0 == 6123) {
                field4996[field4991++] = class176.method1279(-29035);
                return;
            }
            if (arg0 == 6124) {
                field4996[field4991++] = class471.field6781.field6675.method2961(27669);
                return;
            }
            if (arg0 == 6125) {
                field4996[field4991++] = class471.field6781.field6677.method2540(27669);
                return;
            }
            if (arg0 == 6127) {
                field4996[field4991++] = class471.field6781.field6676.method1572(27669) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field4996[field4991++] = class471.field6781.field6679.method3686(27669) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field4996[field4991++] = class471.field6781.field6693.method1792(27669);
                return;
            }
            if (arg0 == 6130) {
                field4996[field4991++] = class471.field6781.field6674.method3652(27669) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field4996[field4991++] = class471.field6781.field6684.method1843(27669);
                return;
            }
            if (arg0 == 6132) {
                field4996[field4991++] = class471.field6781.field6695.method1843(27669);
                return;
            }
            if (arg0 == 6133) {
                field4996[field4991++] = class341.field4796.field5141 && !class341.field4796.field5130 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field4996[field4991++] = class471.field6781.field6720.method409(27669);
                return;
            }
            if (arg0 == 6136) {
                field4996[field4991++] = class471.field6781.field6696.method3214(27669) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field4996[field4991++] = class242.method1625((byte) -18, class471.field6781.field6684.method1843(27669), 200);
                return;
            }
            if (arg0 == 6139) {
                field4996[field4991++] = class471.field6781.field6705.method3488(27669);
                return;
            }
            if (arg0 == 6142) {
                field4996[field4991++] = class471.field6781.field6666.method3134(27669);
                return;
            }
            if (arg0 == 6143) {
                field4996[field4991++] = class471.field6781.field6670.method3134(27669);
                return;
            }
            if (arg0 == 6144) {
                field4996[field4991++] = class85.field1546 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field4996[field4991++] = class471.field6781.field6706.method2801(27669);
                return;
            }
            if (arg0 == 6146) {
                field4996[field4991++] = class471.field6781.field6708.method3692(27669);
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field4991 -= 2;
                class385.field5380 = (short) field4996[field4991];
                if (class385.field5380 <= 0) {
                    class385.field5380 = 256;
                }
                class630.field9042 = (short) field4996[field4991 + 1];
                if (class630.field9042 <= 0) {
                    class630.field9042 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field4991 -= 2;
                class488.field6955 = (short) field4996[field4991];
                if (class488.field6955 <= 0) {
                    class488.field6955 = 256;
                }
                class475.field6800 = (short) field4996[field4991 + 1];
                if (class475.field6800 <= 0) {
                    class475.field6800 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field4991 -= 4;
                class687.field9682 = (short) field4996[field4991];
                if (class687.field9682 <= 0) {
                    class687.field9682 = 1;
                }
                class540.field7593 = (short) field4996[field4991 + 1];
                if (class540.field7593 <= 0) {
                    class540.field7593 = 32767;
                } else if (class540.field7593 < class687.field9682) {
                    class540.field7593 = class687.field9682;
                }
                class42.field641 = (short) field4996[field4991 + 2];
                if (class42.field641 <= 0) {
                    class42.field641 = 1;
                }
                class647.field9162 = (short) field4996[field4991 + 3];
                if (class647.field9162 <= 0) {
                    class647.field9162 = 32767;
                    return;
                }
                if (class647.field9162 < class42.field641) {
                    class647.field9162 = class42.field641;
                }
                return;
            }
            if (arg0 == 6203) {
                class368.method2306(false, class532.field7535.field830, 0, class532.field7535.field783, 2821, 0);
                field4996[field4991++] = class515.field7338;
                field4996[field4991++] = class498.field7096;
                return;
            }
            if (arg0 == 6204) {
                field4996[field4991++] = class488.field6955;
                field4996[field4991++] = class475.field6800;
                return;
            }
            if (arg0 == 6205) {
                field4996[field4991++] = class385.field5380;
                field4996[field4991++] = class630.field9042;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field4996[field4991++] = (int) (class742.method4128(1) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field4996[field4991++] = (int) (class742.method4128(1) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field4991 -= 3;
                int var225 = field4996[field4991];
                int var226 = field4996[field4991 + 1];
                int var227 = field4996[field4991 + 2];
                field5000.clear();
                field5000.set(11, 12);
                field5000.set(var227, var226, var225);
                int var228 = (int) (field5000.getTime().getTime() / 86400000L) - 11745;
                if (var227 < 1970) {
                    var228--;
                }
                field4996[field4991++] = var228;
                return;
            }
            if (arg0 == 6303) {
                field5000.clear();
                field5000.setTime(new Date(class742.method4128(1)));
                field4996[field4991++] = field5000.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var229 = field4996[--field4991];
                boolean var230 = true;
                if (var229 < 0) {
                    var230 = (var229 + 1) % 4 == 0;
                } else if (var229 < 1582) {
                    var230 = var229 % 4 == 0;
                } else if (var229 % 4 != 0) {
                    var230 = false;
                } else if (var229 % 100 != 0) {
                    var230 = true;
                } else if (var229 % 400 != 0) {
                    var230 = false;
                }
                field4996[field4991++] = var230 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field4996[field4991++] = class203.method1420((byte) -127) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field4996[field4991++] = class543.method3211((byte) -125) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class611.field8839 == 7 && class363.field5096 == 0 && class611.field8842 == 0) {
                    if (class540.field7594) {
                        field4996[field4991++] = 0;
                        return;
                    }
                    if (class560.field7957 > class742.method4128(1) - 1000L) {
                        field4996[field4991++] = 1;
                        return;
                    }
                    class540.field7594 = true;
                    class135 var231 = class273.method1801(class459.field6629, class720.field10083, 2);
                    var231.field2109.method233(class321.field4558, -23162);
                    class539.method3178(var231, -18925);
                    field4996[field4991++] = 0;
                    return;
                }
                field4996[field4991++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class483 var232 = class291.method1876(17210);
                if (var232 != null) {
                    field4996[field4991++] = var232.field6838;
                    field4996[field4991++] = var232.field9240;
                    field5010[field4997++] = var232.field6842;
                    class442 var233 = var232.method2911((byte) -81);
                    field4996[field4991++] = var233.field6161;
                    field5010[field4997++] = var233.field6162;
                    field4996[field4991++] = var232.field9247;
                    field4996[field4991++] = var232.field6844;
                    field5010[field4997++] = var232.field6839;
                    return;
                }
                field4996[field4991++] = -1;
                field4996[field4991++] = 0;
                field5010[field4997++] = "";
                field4996[field4991++] = 0;
                field5010[field4997++] = "";
                field4996[field4991++] = 0;
                field4996[field4991++] = 0;
                field5010[field4997++] = "";
                return;
            }
            if (arg0 == 6502) {
                class483 var234 = class394.method2448(0);
                if (var234 != null) {
                    field4996[field4991++] = var234.field6838;
                    field4996[field4991++] = var234.field9240;
                    field5010[field4997++] = var234.field6842;
                    class442 var235 = var234.method2911((byte) -33);
                    field4996[field4991++] = var235.field6161;
                    field5010[field4997++] = var235.field6162;
                    field4996[field4991++] = var234.field9247;
                    field4996[field4991++] = var234.field6844;
                    field5010[field4997++] = var234.field6839;
                    return;
                }
                field4996[field4991++] = -1;
                field4996[field4991++] = 0;
                field5010[field4997++] = "";
                field4996[field4991++] = 0;
                field5010[field4997++] = "";
                field4996[field4991++] = 0;
                field4996[field4991++] = 0;
                field5010[field4997++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var236 = field4996[--field4991];
                String var237 = field5010[--field4997];
                if (class611.field8839 == 7 && class363.field5096 == 0 && class611.field8842 == 0) {
                    field4996[field4991++] = class578.method3347(var237, -72, var236) ? 1 : 0;
                    return;
                }
                field4996[field4991++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var238 = field4996[--field4991];
                class483 var239 = class66.method696(var238, (byte) -127);
                if (var239 != null) {
                    field4996[field4991++] = var239.field9240;
                    field5010[field4997++] = var239.field6842;
                    class442 var240 = var239.method2911((byte) -125);
                    field4996[field4991++] = var240.field6161;
                    field5010[field4997++] = var240.field6162;
                    field4996[field4991++] = var239.field9247;
                    field4996[field4991++] = var239.field6844;
                    field5010[field4997++] = var239.field6839;
                    return;
                }
                field4996[field4991++] = -1;
                field5010[field4997++] = "";
                field4996[field4991++] = 0;
                field5010[field4997++] = "";
                field4996[field4991++] = 0;
                field4996[field4991++] = 0;
                field5010[field4997++] = "";
                return;
            }
            if (arg0 == 6507) {
                field4991 -= 4;
                int var241 = field4996[field4991];
                boolean var242 = field4996[field4991 + 1] == 1;
                int var243 = field4996[field4991 + 2];
                boolean var244 = field4996[field4991 + 3] == 1;
                class107.method929((byte) -73, var244, var242, var243, var241);
                return;
            }
            if (arg0 == 6508) {
                class401.method2479(-303881189);
                return;
            }
            if (arg0 == 6509) {
                if (class611.field8839 != 7) {
                    return;
                }
                class579.field8180 = field4996[--field4991] == 1;
                return;
            }
            if (arg0 == 6510) {
                field4996[field4991++] = class138.field2154;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class468.field6752 == class22.field283) {
                if (arg0 == 6700) {
                    int var245 = class310.field4383.method4208(false);
                    if (class401.field5610 != -1) {
                        var245++;
                    }
                    field4996[field4991++] = var245;
                    return;
                }
                if (arg0 == 6701) {
                    int var246 = field4996[--field4991];
                    if (class401.field5610 != -1) {
                        if (var246 == 0) {
                            field4996[field4991++] = class401.field5610;
                            return;
                        }
                        var246--;
                    }
                    class548 var247 = (class548) class310.field4383.method4209(false);
                    while (var246-- > 0) {
                        var247 = (class548) class310.field4383.method4207(9356);
                    }
                    field4996[field4991++] = var247.field7723;
                    return;
                }
                if (arg0 == 6702) {
                    int var248 = field4996[--field4991];
                    if (class117.field1849[var248] == null) {
                        field5010[field4997++] = "";
                        return;
                    }
                    String var249 = class117.field1849[var248][0].field746;
                    if (var249 == null) {
                        field5010[field4997++] = "";
                        return;
                    }
                    field5010[field4997++] = var249.substring(0, var249.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var250 = field4996[--field4991];
                    if (class117.field1849[var250] == null) {
                        field4996[field4991++] = 0;
                        return;
                    }
                    field4996[field4991++] = class117.field1849[var250].length;
                    return;
                }
                if (arg0 == 6704) {
                    field4991 -= 2;
                    int var251 = field4996[field4991];
                    int var252 = field4996[field4991 + 1];
                    if (class117.field1849[var251] == null) {
                        field5010[field4997++] = "";
                        return;
                    }
                    String var253 = class117.field1849[var251][var252].field746;
                    if (var253 == null) {
                        field5010[field4997++] = "";
                        return;
                    }
                    field5010[field4997++] = var253;
                    return;
                }
                if (arg0 == 6705) {
                    field4991 -= 2;
                    int var254 = field4996[field4991];
                    int var255 = field4996[field4991 + 1];
                    if (class117.field1849[var254] == null) {
                        field4996[field4991++] = 0;
                        return;
                    }
                    field4996[field4991++] = class117.field1849[var254][var255].field744;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field4991 -= 3;
                    int var256 = field4996[field4991];
                    int var257 = field4996[field4991 + 1];
                    int var258 = field4996[field4991 + 2];
                    class23.method140(var258, -116, 1, "", var256 << 16 | var257);
                    return;
                }
                if (arg0 == 6708) {
                    field4991 -= 3;
                    int var259 = field4996[field4991];
                    int var260 = field4996[field4991 + 1];
                    int var261 = field4996[field4991 + 2];
                    class23.method140(var261, -116, 2, "", var259 << 16 | var260);
                    return;
                }
                if (arg0 == 6709) {
                    field4991 -= 3;
                    int var262 = field4996[field4991];
                    int var263 = field4996[field4991 + 1];
                    int var264 = field4996[field4991 + 2];
                    class23.method140(var264, -123, 3, "", var262 << 16 | var263);
                    return;
                }
                if (arg0 == 6710) {
                    field4991 -= 3;
                    int var265 = field4996[field4991];
                    int var266 = field4996[field4991 + 1];
                    int var267 = field4996[field4991 + 2];
                    class23.method140(var267, -122, 4, "", var265 << 16 | var266);
                    return;
                }
                if (arg0 == 6711) {
                    field4991 -= 3;
                    int var268 = field4996[field4991];
                    int var269 = field4996[field4991 + 1];
                    int var270 = field4996[field4991 + 2];
                    class23.method140(var270, -117, 5, "", var268 << 16 | var269);
                    return;
                }
                if (arg0 == 6712) {
                    field4991 -= 3;
                    int var271 = field4996[field4991];
                    int var272 = field4996[field4991 + 1];
                    int var273 = field4996[field4991 + 2];
                    class23.method140(var273, -123, 6, "", var271 << 16 | var272);
                    return;
                }
                if (arg0 == 6713) {
                    field4991 -= 3;
                    int var274 = field4996[field4991];
                    int var275 = field4996[field4991 + 1];
                    int var276 = field4996[field4991 + 2];
                    class23.method140(var276, -128, 7, "", var274 << 16 | var275);
                    return;
                }
                if (arg0 == 6714) {
                    field4991 -= 3;
                    int var277 = field4996[field4991];
                    int var278 = field4996[field4991 + 1];
                    int var279 = field4996[field4991 + 2];
                    class23.method140(var279, -128, 8, "", var277 << 16 | var278);
                    return;
                }
                if (arg0 == 6715) {
                    field4991 -= 3;
                    int var280 = field4996[field4991];
                    int var281 = field4996[field4991 + 1];
                    int var282 = field4996[field4991 + 2];
                    class23.method140(var282, -124, 9, "", var280 << 16 | var281);
                    return;
                }
                if (arg0 == 6716) {
                    field4991 -= 3;
                    int var283 = field4996[field4991];
                    int var284 = field4996[field4991 + 1];
                    int var285 = field4996[field4991 + 2];
                    class23.method140(var285, -122, 10, "", var283 << 16 | var284);
                    return;
                }
                if (arg0 == 6717) {
                    field4991 -= 3;
                    int var286 = field4996[field4991];
                    int var287 = field4996[field4991 + 1];
                    int var288 = field4996[field4991 + 2];
                    class50 var289 = class434.method2624(var286 << 16 | var287, var288, (byte) -63);
                    class249.method1662((byte) 122);
                    class331 var290 = client.method1943(var289);
                    class438.method2634(64, var290.method2118(true), var290.field4675, var289);
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var291 = field4996[--field4991];
                    class524 var292 = class399.field5581.method2641(var291, 122);
                    if (var292.field7425 == null) {
                        field5010[field4997++] = "";
                        return;
                    }
                    field5010[field4997++] = var292.field7425;
                    return;
                }
                if (arg0 == 6801) {
                    int var293 = field4996[--field4991];
                    class524 var294 = class399.field5581.method2641(var293, 112);
                    field4996[field4991++] = var294.field7434;
                    return;
                }
                if (arg0 == 6802) {
                    int var295 = field4996[--field4991];
                    class524 var296 = class399.field5581.method2641(var295, 106);
                    field4996[field4991++] = var296.field7457;
                    return;
                }
                if (arg0 == 6803) {
                    int var297 = field4996[--field4991];
                    class524 var298 = class399.field5581.method2641(var297, 117);
                    field4996[field4991++] = var298.field7414;
                    return;
                }
                if (arg0 == 6804) {
                    field4991 -= 2;
                    int var299 = field4996[field4991];
                    int var300 = field4996[field4991 + 1];
                    class513 var301 = class285.field4042.method2993(var300, (byte) 80);
                    if (var301.method3063((byte) -100)) {
                        field5010[field4997++] = class399.field5581.method2641(var299, 95).method3106(106, var300, var301.field7320);
                        return;
                    }
                    field4996[field4991++] = class399.field5581.method2641(var299, 97).method3107(var301.field7315, var300, (byte) -23);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field4996[field4991++] = class231.field3285 && !class29.field398 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field4996[field4991++] = class36.field539;
                    return;
                }
                if (arg0 == 6902) {
                    field4996[field4991++] = class611.field8846;
                    return;
                }
                if (arg0 == 6903) {
                    field4996[field4991++] = class640.field9114;
                    return;
                }
                if (arg0 == 6904) {
                    field4996[field4991++] = class656.field9237;
                    return;
                }
                if (arg0 == 6905) {
                    String var302 = "";
                    if (class224.field3210 != null) {
                        if (class224.field3210.field9093 == null) {
                            var302 = class431.method2617(class224.field3210.field9089, true);
                        } else {
                            var302 = (String) class224.field3210.field9093;
                        }
                    }
                    field5010[field4997++] = var302;
                    return;
                }
                if (arg0 == 6906) {
                    field4996[field4991++] = class290.field4080;
                    return;
                }
                if (arg0 == 6907) {
                    field4996[field4991++] = class756.field10518;
                    return;
                }
                if (arg0 == 6908) {
                    field4996[field4991++] = class115.field1843;
                    return;
                }
                if (arg0 == 6909) {
                    field4996[field4991++] = class421.field5915 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field4996[field4991++] = class701.field9849;
                    return;
                }
                if (arg0 == 6911) {
                    field4996[field4991++] = class591.field8304;
                    return;
                }
                if (arg0 == 6912) {
                    field4996[field4991++] = class530.field7517;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var303 = class683.method3850(49);
                    field4996[field4991++] = class187.field2696 = class471.field6781.field6684.method1843(27669);
                    field4996[field4991++] = var303;
                    class314.method2030(68);
                    class129.method994((byte) 48);
                    class671.field9412 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class127.method988(2);
                    class314.method2030(110);
                    class129.method994((byte) 80);
                    class671.field9412 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class150.method1158((byte) -105);
                    class314.method2030(75);
                    class129.method994((byte) 59);
                    class671.field9412 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class405.method2489(-6589);
                    class314.method2030(48);
                    class129.method994((byte) 66);
                    class671.field9412 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class155.method1184(0, true);
                    class314.method2030(86);
                    class129.method994((byte) 65);
                    class671.field9412 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class471.field6781.method2826(0, (byte) 119, class471.field6781.field6712);
                    class129.method994((byte) 39);
                    class671.field9412 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class187.field2696 == 2) {
                        class455.field6588 = true;
                        return;
                    }
                    if (class187.field2696 == 1) {
                        class595.field8702 = true;
                        return;
                    }
                    if (class187.field2696 == 3) {
                        class130.field1951 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field4996[field4991++] = class471.field6781.field6712.method2872(27669);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field4991 -= 2;
                    int var304 = field4996[field4991];
                    int var305 = field4996[field4991 + 1];
                    if (var304 != -1) {
                        if (var305 > 255) {
                            var305 = 255;
                        } else if (var305 < 0) {
                            var305 = 0;
                        }
                        class351.method2208((byte) 56, false, var305, var304);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var306 = field4996[--field4991];
                    if (var306 != -1) {
                        class272.method1799(-110, var306);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var307 = field4996[--field4991];
                    if (var307 != -1) {
                        class291.method1874(var307, (byte) -128);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field4996[field4991++] = class115.method943((byte) -121, "jagtheora") ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field4996[field4991++] = class471.field6781.field6665.method3029(113) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field4996[field4991++] = class471.field6781.field6713.method3503(125) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field4996[field4991++] = class471.field6781.field6689.method63(111) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field4996[field4991++] = class471.field6781.field6714.method3366(103) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field4996[field4991++] = class471.field6781.field6675.method2960(118) && class359.field5046.method600() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field4996[field4991++] = class471.field6781.field6687.method2066(104) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field4996[field4991++] = class471.field6781.field6677.method2547(116) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field4996[field4991++] = class471.field6781.field6676.method1576(123) && class359.field5046.method634() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field4996[field4991++] = class471.field6781.field6674.method3650(100) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field4996[field4991++] = class471.field6781.field6696.method3215(127) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field4996[field4991++] = class471.field6781.field6705.method3489(124) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field4996[field4991++] = class471.field6781.field6673.method2923(124) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field4996[field4991++] = class471.field6781.field6708.method3690(104) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var308 = field4996[--field4991];
                    field4996[field4991++] = class471.field6781.field6665.method58(var308, 11260);
                    return;
                }
                if (arg0 == 7302) {
                    int var309 = field4996[--field4991];
                    field4996[field4991++] = class471.field6781.field6713.method58(var309, 11260);
                    return;
                }
                if (arg0 == 7303) {
                    int var310 = field4996[--field4991];
                    field4996[field4991++] = class471.field6781.field6689.method58(var310, 11260);
                    return;
                }
                if (arg0 == 7304) {
                    int var311 = field4996[--field4991];
                    field4996[field4991++] = class471.field6781.field6714.method58(var311, 11260);
                    return;
                }
                if (arg0 == 7305) {
                    int var312 = field4996[--field4991];
                    if (!class359.field5046.method600()) {
                        field4996[field4991++] = 3;
                        return;
                    }
                    field4996[field4991++] = class471.field6781.field6675.method58(var312, 11260);
                    return;
                }
                if (arg0 == 7306) {
                    int var313 = field4996[--field4991];
                    field4996[field4991++] = class471.field6781.field6687.method58(var313, 11260);
                    return;
                }
                if (arg0 == 7307) {
                    int var314 = field4996[--field4991];
                    field4996[field4991++] = class471.field6781.field6677.method58(var314, 11260);
                    return;
                }
                if (arg0 == 7308) {
                    int var315 = field4996[--field4991];
                    if (!class359.field5046.method634()) {
                        field4996[field4991++] = 3;
                        return;
                    }
                    field4996[field4991++] = class471.field6781.field6676.method58(var315, 11260);
                    return;
                }
                if (arg0 == 7309) {
                    int var316 = field4996[--field4991];
                    field4996[field4991++] = class471.field6781.field6674.method58(var316, 11260);
                    return;
                }
                if (arg0 == 7310) {
                    int var317 = field4996[--field4991];
                    field4996[field4991++] = class471.field6781.field6696.method58(var317, 11260);
                    return;
                }
                if (arg0 == 7311) {
                    int var318 = field4996[--field4991];
                    field4996[field4991++] = class471.field6781.field6705.method58(var318, 11260);
                    return;
                }
                if (arg0 == 7312) {
                    int var319 = field4996[--field4991];
                    field4996[field4991++] = class471.field6781.field6673.method58(var319, 11260);
                    return;
                }
                if (arg0 == 7313) {
                    int var320 = field4996[--field4991];
                    field4996[field4991++] = class471.field6781.field6708.method58(var320, 11260);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 3771)
    private static final void method2228(String arg0, int arg1) {
        if (class79.field1485 == 0 && !(!class231.field3285 || class29.field398) || class253.field3605) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class281.field3988.method1839((byte) 45, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class281.field3988.method1839((byte) 45, 0).length());
        } else if (var2.startsWith(class281.field3989.method1839((byte) 45, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class281.field3989.method1839((byte) 45, 0).length());
        } else if (var2.startsWith(class281.field3990.method1839((byte) 45, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class281.field3990.method1839((byte) 45, 0).length());
        } else if (var2.startsWith(class281.field3991.method1839((byte) 45, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class281.field3991.method1839((byte) 45, 0).length());
        } else if (var2.startsWith(class281.field3992.method1839((byte) 45, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class281.field3992.method1839((byte) 45, 0).length());
        } else if (var2.startsWith(class281.field3993.method1839((byte) 45, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class281.field3993.method1839((byte) 45, 0).length());
        } else if (var2.startsWith(class281.field3994.method1839((byte) 45, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class281.field3994.method1839((byte) 45, 0).length());
        } else if (var2.startsWith(class281.field3995.method1839((byte) 45, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class281.field3995.method1839((byte) 45, 0).length());
        } else if (var2.startsWith(class281.field3996.method1839((byte) 45, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class281.field3996.method1839((byte) 45, 0).length());
        } else if (var2.startsWith(class281.field3997.method1839((byte) 45, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class281.field3997.method1839((byte) 45, 0).length());
        } else if (var2.startsWith(class281.field3998.method1839((byte) 45, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class281.field3998.method1839((byte) 45, 0).length());
        } else if (var2.startsWith(class281.field3999.method1839((byte) 45, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class281.field3999.method1839((byte) 45, 0).length());
        } else if (class744.field10426 != 0) {
            if (var2.startsWith(class281.field3988.method1839((byte) 45, class744.field10426))) {
                var3 = 0;
                arg0 = arg0.substring(class281.field3988.method1839((byte) 45, class744.field10426).length());
            } else if (var2.startsWith(class281.field3989.method1839((byte) 45, class744.field10426))) {
                var3 = 1;
                arg0 = arg0.substring(class281.field3989.method1839((byte) 45, class744.field10426).length());
            } else if (var2.startsWith(class281.field3990.method1839((byte) 45, class744.field10426))) {
                var3 = 2;
                arg0 = arg0.substring(class281.field3990.method1839((byte) 45, class744.field10426).length());
            } else if (var2.startsWith(class281.field3991.method1839((byte) 45, class744.field10426))) {
                var3 = 3;
                arg0 = arg0.substring(class281.field3991.method1839((byte) 45, class744.field10426).length());
            } else if (var2.startsWith(class281.field3992.method1839((byte) 45, class744.field10426))) {
                var3 = 4;
                arg0 = arg0.substring(class281.field3992.method1839((byte) 45, class744.field10426).length());
            } else if (var2.startsWith(class281.field3993.method1839((byte) 45, class744.field10426))) {
                var3 = 5;
                arg0 = arg0.substring(class281.field3993.method1839((byte) 45, class744.field10426).length());
            } else if (var2.startsWith(class281.field3994.method1839((byte) 45, class744.field10426))) {
                var3 = 6;
                arg0 = arg0.substring(class281.field3994.method1839((byte) 45, class744.field10426).length());
            } else if (var2.startsWith(class281.field3995.method1839((byte) 45, class744.field10426))) {
                var3 = 7;
                arg0 = arg0.substring(class281.field3995.method1839((byte) 45, class744.field10426).length());
            } else if (var2.startsWith(class281.field3996.method1839((byte) 45, class744.field10426))) {
                var3 = 8;
                arg0 = arg0.substring(class281.field3996.method1839((byte) 45, class744.field10426).length());
            } else if (var2.startsWith(class281.field3997.method1839((byte) 45, class744.field10426))) {
                var3 = 9;
                arg0 = arg0.substring(class281.field3997.method1839((byte) 45, class744.field10426).length());
            } else if (var2.startsWith(class281.field3998.method1839((byte) 45, class744.field10426))) {
                var3 = 10;
                arg0 = arg0.substring(class281.field3998.method1839((byte) 45, class744.field10426).length());
            } else if (var2.startsWith(class281.field3999.method1839((byte) 45, class744.field10426))) {
                var3 = 11;
                arg0 = arg0.substring(class281.field3999.method1839((byte) 45, class744.field10426).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class281.field4000.method1839((byte) 45, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class281.field4000.method1839((byte) 45, 0).length());
        } else if (var4.startsWith(class281.field4001.method1839((byte) 45, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class281.field4001.method1839((byte) 45, 0).length());
        } else if (var4.startsWith(class281.field4002.method1839((byte) 45, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class281.field4002.method1839((byte) 45, 0).length());
        } else if (var4.startsWith(class281.field4003.method1839((byte) 45, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class281.field4003.method1839((byte) 45, 0).length());
        } else if (var4.startsWith(class281.field4004.method1839((byte) 45, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class281.field4004.method1839((byte) 45, 0).length());
        } else if (class744.field10426 != 0) {
            if (var4.startsWith(class281.field4000.method1839((byte) 45, class744.field10426))) {
                var5 = 1;
                arg0 = arg0.substring(class281.field4000.method1839((byte) 45, class744.field10426).length());
            } else if (var4.startsWith(class281.field4001.method1839((byte) 45, class744.field10426))) {
                var5 = 2;
                arg0 = arg0.substring(class281.field4001.method1839((byte) 45, class744.field10426).length());
            } else if (var4.startsWith(class281.field4002.method1839((byte) 45, class744.field10426))) {
                var5 = 3;
                arg0 = arg0.substring(class281.field4002.method1839((byte) 45, class744.field10426).length());
            } else if (var4.startsWith(class281.field4003.method1839((byte) 45, class744.field10426))) {
                var5 = 4;
                arg0 = arg0.substring(class281.field4003.method1839((byte) 45, class744.field10426).length());
            } else if (var4.startsWith(class281.field4004.method1839((byte) 45, class744.field10426))) {
                var5 = 5;
                arg0 = arg0.substring(class281.field4004.method1839((byte) 45, class744.field10426).length());
            }
        }
        field4993++;
        class135 var6 = class273.method1801(class459.field6629, class37.field566, 2);
        var6.field2109.method263((byte) -119, 0);
        int var7 = var6.field2109.field469;
        var6.field2109.method263((byte) 79, var3);
        var6.field2109.method263((byte) -128, var5);
        class687.method3863(0, arg0, var6.field2109);
        var6.field2109.method230(88, var6.field2109.field469 - var7);
        class539.method3178(var6, -18925);
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)Ljava/lang/String;", line = 4040)
    private static final String method2229(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field5000.setTime(new Date(var1));
        int var3 = field5000.get(5);
        int var4 = field5000.get(2);
        int var5 = field5000.get(1);
        return var3 + "-" + field5018[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "()V", line = 4054)
    public static final void method2230() {
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(I)V", line = 4069)
    public static final void method2231(int arg0) {
        if (arg0 == -1 || !class4.method19(127, arg0)) {
            return;
        }
        class50[] var1 = class117.field1849[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class50 var3 = var1[var2];
            if (var3.field750 != null) {
                class604 var4 = new class604();
                var4.field8782 = var3;
                var4.field8773 = var3.field750;
                method2233(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lkg;II)V", line = 4106)
    public static final void method2232(class271 arg0, int arg1, int arg2) {
        class745 var3 = class434.method2625(arg2, arg1, arg0, 67107840);
        if (var3 == null) {
            return;
        }
        field5002 = new int[var3.field10428];
        field5007 = new String[var3.field10437];
        if (class526.field7468 == var3.field10436 || class628.field9025 == var3.field10436 || class613.field8868 == var3.field10436) {
            int var4 = 0;
            int var5 = 0;
            if (class512.field7312 != null) {
                var4 = class512.field7312.field719;
                var5 = class512.field7312.field856;
            }
            field5002[0] = class422.field5917.method1597(112) - var4;
            field5002[1] = class422.field5917.method1592(true) - var5;
        }
        method2235(var3, 200000);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lraa;I)V", line = 4137)
    private static final void method2233(class604 arg0, int arg1) {
        Object[] var2 = arg0.field8773;
        int var3 = (Integer) var2[0];
        class745 var4 = class176.method1278(126, var3);
        if (var4 == null) {
            return;
        }
        field5002 = new int[var4.field10428];
        int var5 = 0;
        field5007 = new String[var4.field10437];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field8772;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field8778;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field8782 == null ? -1 : arg0.field8782.field792;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field8771;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field8782 == null ? -1 : arg0.field8782.field807;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field8774 == null ? -1 : arg0.field8774.field792;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field8774 == null ? -1 : arg0.field8774.field807;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field8780;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field8775;
                }
                field5002[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field8769;
                }
                field5007[var6++] = var9;
            }
        }
        field5019 = arg0.field8768;
        method2235(var4, arg1);
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(IZ)V", line = 4221)
    public static final void method2234(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lwga;I)V", line = 4226)
    private static final void method2235(class745 arg0, int arg1) {
        field4991 = 0;
        field4997 = 0;
        int var2 = -1;
        int[] var3 = arg0.field10427;
        int[] var4 = arg0.field10433;
        byte var5 = -1;
        field5001 = 0;
        try {
            int var6 = 0;
            label260: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var43 = var3[var2];
                if (var43 >= 100) {
                    boolean var35;
                    if (var4[var2] == 1) {
                        var35 = true;
                    } else {
                        var35 = false;
                    }
                    if (var43 >= 100 && var43 < 5000) {
                        method2237(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method2227(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field4996[field4991++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field4996[field4991++] = class742.field10408.field7584[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class742.field10408.method3170(field4996[--field4991], var8, -1);
                } else if (var43 == 3) {
                    field5010[field4997++] = arg0.field10429[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field4991 -= 2;
                    if (field4996[field4991 + 1] != field4996[field4991]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field4991 -= 2;
                    if (field4996[field4991 + 1] == field4996[field4991]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field4991 -= 2;
                    if (field4996[field4991] < field4996[field4991 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field4991 -= 2;
                    if (field4996[field4991] > field4996[field4991 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field5001 == 0) {
                        return;
                    }
                    class618 var9 = field4992[--field5001];
                    arg0 = var9.field8926;
                    var3 = arg0.field10427;
                    var4 = arg0.field10433;
                    var2 = var9.field8932;
                    field5002 = var9.field8933;
                    field5007 = var9.field8929;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field4996[field4991++] = class742.field10408.method3176((byte) 91, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class742.field10408.method3173(field4996[--field4991], 116, var11);
                } else if (var43 == 31) {
                    field4991 -= 2;
                    if (field4996[field4991] <= field4996[field4991 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field4991 -= 2;
                    if (field4996[field4991] >= field4996[field4991 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field4996[field4991++] = field5002[var4[var2]];
                } else if (var43 == 34) {
                    field5002[var4[var2]] = field4996[--field4991];
                } else if (var43 == 35) {
                    field5010[field4997++] = field5007[var4[var2]];
                } else if (var43 == 36) {
                    field5007[var4[var2]] = field5010[--field4997];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field4997 -= var12;
                    String var13 = class351.method2205(field5010, field4997, var12, 500);
                    field5010[field4997++] = var13;
                } else if (var43 == 38) {
                    field4991--;
                } else if (var43 == 39) {
                    field4997--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class745 var15 = class176.method1278(-71, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field10428];
                    String[] var17 = new String[var15.field10437];
                    for (int var18 = 0; var18 < var15.field10430; var18++) {
                        var16[var18] = field4996[field4991 + var18 - var15.field10430];
                    }
                    for (int var19 = 0; var19 < var15.field10432; var19++) {
                        var17[var19] = field5010[field4997 + var19 - var15.field10432];
                    }
                    field4991 -= var15.field10430;
                    field4997 -= var15.field10432;
                    class618 var20 = new class618();
                    var20.field8926 = arg0;
                    var20.field8932 = var2;
                    var20.field8933 = field5002;
                    var20.field8929 = field5007;
                    if (field5001 >= field4992.length) {
                        throw new RuntimeException();
                    }
                    field4992[field5001++] = var20;
                    arg0 = var15;
                    var3 = var15.field10427;
                    var4 = var15.field10433;
                    var2 = -1;
                    field5002 = var16;
                    field5007 = var17;
                } else if (var43 == 42) {
                    field4996[field4991++] = class41.field598[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class41.field598[var21] = field4996[--field4991];
                    class758.method4205(1, var21);
                    class291.field4082 |= class104.field1738[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field4996[--field4991];
                    if (var24 >= 0 && var24 <= 5000) {
                        field5009[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field5004[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field4996[--field4991];
                    if (var28 < 0 || var28 >= field5009[var27]) {
                        throw new RuntimeException();
                    }
                    field4996[field4991++] = field5004[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field4991 -= 2;
                    int var30 = field4996[field4991];
                    if (var30 < 0 || var30 >= field5009[var29]) {
                        throw new RuntimeException();
                    }
                    field5004[var29][var30] = field4996[field4991 + 1];
                } else if (var43 == 47) {
                    String var31 = class526.field7477[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field5010[field4997++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class526.field7477[var32] = field5010[--field4997];
                    class748.method4164(-4943, var32);
                } else if (var43 == 51) {
                    class758 var33 = arg0.field10439[var4[var2]];
                    class528 var34 = (class528) var33.method4203(true, (long) field4996[--field4991]);
                    if (var34 != null) {
                        var2 += var34.field7502;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field10435 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field8991).append(" ");
                for (int var41 = field5001 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field4992[var41].field8926.field8991).append(" ");
                }
                var40.append("op: ").append(var5);
                class621.method3591(var40.toString(), var42, (byte) -86);
            } else {
                class570.method3327((byte) 72, 4, "Clientscript error in: " + arg0.field10435);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field10435).append("\n");
                for (int var38 = field5001 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field4992[var38].field8926.field10435).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class621.method3591(var37.toString(), var42, (byte) -85);
                class569.method3326(var37.toString(), (byte) -42);
            }
        }
    }

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "(I)V", line = 4659)
    private static final void method2236(int arg0) {
        class50 var1 = class545.method3220(65535, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class50[] var3 = class463.field6662[var2];
        if (var3 == null) {
            class50[] var4 = class117.field1849[var2];
            int var5 = var4.length;
            var3 = class463.field6662[var2] = new class50[var5];
            class622.method3594(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class622.method3594(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(IZ)V", line = 4707)
    private static final void method2237(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field4991 -= 3;
                int var2 = field4996[field4991];
                int var3 = field4996[field4991 + 1];
                int var4 = field4996[field4991 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class50 var5 = class545.method3220(65535, var2);
                if (var5.field863 == null) {
                    var5.field863 = new class50[var4 + 1];
                }
                if (var5.field863.length <= var4) {
                    class50[] var6 = new class50[var4 + 1];
                    for (int var7 = 0; var7 < var5.field863.length; var7++) {
                        var6[var7] = var5.field863[var7];
                    }
                    var5.field863 = var6;
                }
                if (var4 > 0 && var5.field863[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class50 var8 = new class50();
                var8.field765 = var3;
                var8.field791 = var8.field792 = var5.field792;
                var8.field807 = var4;
                var5.field863[var4] = var8;
                if (arg1) {
                    field5012 = var8;
                } else {
                    field4994 = var8;
                }
                class262.method1776(0, var5);
                return;
            }
            if (arg0 == 101) {
                class50 var9 = arg1 ? field5012 : field4994;
                if (var9.field807 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class50 var10 = class545.method3220(65535, var9.field792);
                var10.field863[var9.field807] = null;
                class262.method1776(0, var10);
                return;
            }
            if (arg0 == 102) {
                class50 var11 = class545.method3220(65535, field4996[--field4991]);
                var11.field863 = null;
                class262.method1776(0, var11);
                return;
            }
            if (arg0 == 200) {
                field4991 -= 2;
                int var12 = field4996[field4991];
                int var13 = field4996[field4991 + 1];
                class50 var14 = class434.method2624(var12, var13, (byte) -41);
                if (var14 != null && var13 != -1) {
                    field4996[field4991++] = 1;
                    if (arg1) {
                        field5012 = var14;
                        return;
                    }
                    field4994 = var14;
                    return;
                }
                field4996[field4991++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field4996[--field4991];
                class50 var16 = class545.method3220(65535, var15);
                if (var16 != null) {
                    field4996[field4991++] = 1;
                    if (arg1) {
                        field5012 = var16;
                        return;
                    }
                    field4994 = var16;
                    return;
                }
                field4996[field4991++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field4996[--field4991];
                method2224(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field4996[--field4991];
                method2236(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field4991 -= 2;
                int var19 = field4996[field4991];
                int var20 = field4996[field4991 + 1];
                for (int var21 = 0; var21 < class178.field2565.length; var21++) {
                    if (class178.field2565[var21] == var19) {
                        class468.field6748.field4932.method843(var21, class284.field4039, Integer.MIN_VALUE, var20);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class351.field4950.length; var22++) {
                    if (class351.field4950[var22] == var19) {
                        class468.field6748.field4932.method843(var22, class284.field4039, Integer.MIN_VALUE, var20);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field4991 -= 2;
                int var23 = field4996[field4991];
                int var24 = field4996[field4991 + 1];
                class468.field6748.field4932.method842(var24, var23, (byte) 110);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field4996[--field4991] != 0;
                class468.field6748.field4932.method837(-1, var25);
                return;
            }
            if (arg0 == 411) {
                field4991 -= 2;
                int var26 = field4996[field4991];
                int var27 = field4996[field4991 + 1];
                class468.field6748.field4932.method841((byte) 105, var26, var27, class558.field7942);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class50 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class545.method3220(65535, field4996[--field4991]);
            } else {
                var28 = arg1 ? field5012 : field4994;
            }
            if (arg0 == 1000) {
                field4991 -= 4;
                var28.field712 = field4996[field4991];
                var28.field855 = field4996[field4991 + 1];
                int var29 = field4996[field4991 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field4996[field4991 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field793 = (byte) var29;
                var28.field747 = (byte) var30;
                class262.method1776(0, var28);
                class697.method3916(var28, 1);
                if (var28.field807 == -1) {
                    class420.method2575(var28.field792, 81);
                }
                return;
            }
            if (arg0 == 1001) {
                field4991 -= 4;
                var28.field721 = field4996[field4991];
                var28.field769 = field4996[field4991 + 1];
                var28.field814 = 0;
                var28.field876 = 0;
                int var31 = field4996[field4991 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field4996[field4991 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field868 = (byte) var31;
                var28.field815 = (byte) var32;
                class262.method1776(0, var28);
                class697.method3916(var28, 1);
                if (var28.field765 == 0) {
                    class756.method4196((byte) 90, false, var28);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field4996[--field4991] == 1;
                if (var28.field725 != var33) {
                    var28.field725 = var33;
                    class262.method1776(0, var28);
                }
                if (var28.field807 == -1) {
                    class735.method4107(-74, var28.field792);
                }
                return;
            }
            if (arg0 == 1004) {
                field4991 -= 2;
                var28.field822 = field4996[field4991];
                var28.field711 = field4996[field4991 + 1];
                class262.method1776(0, var28);
                class697.method3916(var28, 1);
                if (var28.field765 == 0) {
                    class756.method4196((byte) -18, false, var28);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field800 = field4996[--field4991] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class50 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class545.method3220(65535, field4996[--field4991]);
            } else {
                var34 = arg1 ? field5012 : field4994;
            }
            if (arg0 == 1100) {
                field4991 -= 2;
                var34.field790 = field4996[field4991];
                if (var34.field790 > var34.field796 - var34.field783) {
                    var34.field790 = var34.field796 - var34.field783;
                }
                if (var34.field790 < 0) {
                    var34.field790 = 0;
                }
                var34.field869 = field4996[field4991 + 1];
                if (var34.field869 > var34.field779 - var34.field830) {
                    var34.field869 = var34.field779 - var34.field830;
                }
                if (var34.field869 < 0) {
                    var34.field869 = 0;
                }
                class262.method1776(0, var34);
                if (var34.field807 == -1) {
                    class488.method2937(var34.field792, 72);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field874 = field4996[--field4991];
                class262.method1776(0, var34);
                if (var34.field807 == -1) {
                    class457.method2791(var34.field792, 8705);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field758 = field4996[--field4991] == 1;
                class262.method1776(0, var34);
                return;
            }
            if (arg0 == 1103) {
                var34.field731 = field4996[--field4991];
                class262.method1776(0, var34);
                return;
            }
            if (arg0 == 1104) {
                var34.field718 = field4996[--field4991];
                class262.method1776(0, var34);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field4996[--field4991];
                if (var34.field823 != var35) {
                    var34.field823 = var35;
                    class262.method1776(0, var34);
                }
                if (var34.field807 == -1) {
                    class421.method2576(15, var34.field792);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field835 = field4996[--field4991];
                class262.method1776(0, var34);
                return;
            }
            if (arg0 == 1107) {
                var34.field706 = field4996[--field4991] == 1;
                class262.method1776(0, var34);
                return;
            }
            if (arg0 == 1108) {
                var34.field851 = 1;
                var34.field780 = field4996[--field4991];
                class262.method1776(0, var34);
                if (var34.field807 == -1) {
                    class752.method4172(var34.field792, -11571);
                }
                return;
            }
            if (arg0 == 1109) {
                field4991 -= 6;
                var34.field776 = field4996[field4991];
                var34.field764 = field4996[field4991 + 1];
                var34.field875 = field4996[field4991 + 2];
                var34.field733 = field4996[field4991 + 3];
                var34.field838 = field4996[field4991 + 4];
                var34.field753 = field4996[field4991 + 5];
                class262.method1776(0, var34);
                if (var34.field807 == -1) {
                    class280.method1835(var34.field792, 92);
                    class601.method3495(var34.field792, (byte) 112);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field4996[--field4991];
                if (var34.field853 != var36) {
                    var34.field853 = var36;
                    var34.field714 = 0;
                    var34.field798 = 1;
                    var34.field751 = 0;
                    class718 var37 = var34.field853 == -1 ? null : class698.field9806.method851(var34.field853, -2);
                    if (var37 != null) {
                        class127.method984(-3991, var37, var34.field714);
                    }
                    class262.method1776(0, var34);
                }
                if (var34.field807 == -1) {
                    class309.method2008(var34.field792, -57);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field865 = field4996[--field4991] == 1;
                class262.method1776(0, var34);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field5010[--field4997];
                if (!var38.equals(var34.field859)) {
                    var34.field859 = var38;
                    class262.method1776(0, var34);
                }
                if (var34.field807 == -1) {
                    class170.method1257(true, var34.field792);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field801 = field4996[--field4991];
                class262.method1776(0, var34);
                if (var34.field807 == -1) {
                    class33.method217((byte) -101, var34.field792);
                }
                return;
            }
            if (arg0 == 1114) {
                field4991 -= 3;
                var34.field829 = field4996[field4991];
                var34.field812 = field4996[field4991 + 1];
                var34.field825 = field4996[field4991 + 2];
                class262.method1776(0, var34);
                return;
            }
            if (arg0 == 1115) {
                var34.field710 = field4996[--field4991] == 1;
                class262.method1776(0, var34);
                return;
            }
            if (arg0 == 1116) {
                var34.field762 = field4996[--field4991];
                class262.method1776(0, var34);
                return;
            }
            if (arg0 == 1117) {
                var34.field795 = field4996[--field4991];
                class262.method1776(0, var34);
                return;
            }
            if (arg0 == 1118) {
                var34.field742 = field4996[--field4991] == 1;
                class262.method1776(0, var34);
                return;
            }
            if (arg0 == 1119) {
                var34.field730 = field4996[--field4991] == 1;
                class262.method1776(0, var34);
                return;
            }
            if (arg0 == 1120) {
                field4991 -= 2;
                var34.field796 = field4996[field4991];
                var34.field779 = field4996[field4991 + 1];
                class262.method1776(0, var34);
                if (var34.field765 == 0) {
                    class756.method4196((byte) 105, false, var34);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field781 = field4996[--field4991] == 1;
                class262.method1776(0, var34);
                return;
            }
            if (arg0 == 1123) {
                var34.field753 = field4996[--field4991];
                class262.method1776(0, var34);
                if (var34.field807 == -1) {
                    class280.method1835(var34.field792, 106);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field4996[--field4991];
                var34.field806 = var39 == 1;
                class262.method1776(0, var34);
                return;
            }
            if (arg0 == 1125) {
                field4991 -= 2;
                var34.field736 = field4996[field4991];
                var34.field804 = field4996[field4991 + 1];
                class262.method1776(0, var34);
                return;
            }
            if (arg0 == 1126) {
                var34.field840 = field4996[--field4991];
                class262.method1776(0, var34);
                return;
            }
            if (arg0 == 1127) {
                field4991 -= 2;
                int var40 = field4996[field4991];
                int var41 = field4996[field4991 + 1];
                class513 var42 = class285.field4042.method2993(var40, (byte) 80);
                if (var42.field7315 != var41) {
                    var34.method438(var40, -63, var41);
                    return;
                }
                var34.method439(var40, 127);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field4996[--field4991];
                String var44 = field5010[--field4997];
                class513 var45 = class285.field4042.method2993(var43, (byte) 80);
                if (!var45.field7320.equals(var44)) {
                    var34.method443(var44, var43, 16);
                    return;
                }
                var34.method439(var43, 127);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var46 = field4996[--field4991];
                if (var34.field765 != 5 && arg0 == 1129 || var34.field765 != 4 && arg0 == 1130) {
                    return;
                }
                if (var34.field803 != var46) {
                    var34.field803 = var46;
                    class262.method1776(0, var34);
                }
                if (var34.field807 == -1) {
                    class175.method1275(var34.field792, 17);
                }
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class50 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class545.method3220(65535, field4996[--field4991]);
            } else {
                var47 = arg1 ? field5012 : field4994;
            }
            class262.method1776(0, var47);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field4991 -= 2;
                int var48 = field4996[field4991];
                int var49 = field4996[field4991 + 1];
                if (var47.field807 == -1) {
                    class651.method3681(var47.field792, (byte) 78);
                    class280.method1835(var47.field792, 122);
                    class601.method3495(var47.field792, (byte) 99);
                }
                if (var48 == -1) {
                    var47.field851 = 1;
                    var47.field780 = -1;
                    var47.field861 = -1;
                    return;
                }
                var47.field861 = var48;
                var47.field748 = var49;
                if (arg0 == 1208 || arg0 == 1209) {
                    var47.field720 = true;
                } else {
                    var47.field720 = false;
                }
                class253 var50 = class558.field7942.method721(-87, var48);
                var47.field875 = var50.field3608;
                var47.field733 = var50.field3606;
                var47.field838 = var50.field3612;
                var47.field776 = var50.field3684;
                var47.field764 = var50.field3673;
                var47.field753 = var50.field3639;
                if (arg0 == 1205 || arg0 == 1209) {
                    var47.field745 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var47.field745 = 1;
                } else {
                    var47.field745 = 2;
                }
                if (var47.field814 > 0) {
                    var47.field753 = var47.field753 * 32 / var47.field814;
                    return;
                }
                if (var47.field721 > 0) {
                    var47.field753 = var47.field753 * 32 / var47.field721;
                }
                return;
            }
            if (arg0 == 1201) {
                var47.field851 = 2;
                var47.field780 = field4996[--field4991];
                if (var47.field807 == -1) {
                    class752.method4172(var47.field792, -11571);
                }
                return;
            }
            if (arg0 == 1202) {
                var47.field851 = 3;
                var47.field780 = -1;
                if (var47.field807 == -1) {
                    class752.method4172(var47.field792, -11571);
                }
                return;
            }
            if (arg0 == 1203) {
                var47.field851 = 6;
                var47.field780 = field4996[--field4991];
                if (var47.field807 == -1) {
                    class752.method4172(var47.field792, -11571);
                }
                return;
            }
            if (arg0 == 1204) {
                var47.field851 = 5;
                var47.field780 = field4996[--field4991];
                if (var47.field807 == -1) {
                    class752.method4172(var47.field792, -11571);
                }
                return;
            }
            if (arg0 == 1206) {
                field4991 -= 4;
                var47.field749 = field4996[field4991];
                var47.field756 = field4996[field4991 + 1];
                var47.field847 = field4996[field4991 + 2];
                var47.field724 = field4996[field4991 + 3];
                class262.method1776(0, var47);
                return;
            }
            if (arg0 == 1207) {
                field4991 -= 2;
                var47.field771 = field4996[field4991];
                var47.field761 = field4996[field4991 + 1];
                class262.method1776(0, var47);
                return;
            }
            if (arg0 == 1210) {
                field4991 -= 4;
                var47.field780 = field4996[field4991];
                var47.field819 = field4996[field4991 + 1];
                if (field4996[field4991 + 2] == 1) {
                    var47.field851 = 9;
                } else {
                    var47.field851 = 8;
                }
                if (field4996[field4991 + 3] == 1) {
                    var47.field720 = true;
                } else {
                    var47.field720 = false;
                }
                if (var47.field807 == -1) {
                    class752.method4172(var47.field792, -11571);
                }
                return;
            }
            if (arg0 == 1211) {
                var47.field851 = 5;
                var47.field780 = class675.field9486;
                var47.field819 = 0;
                if (var47.field807 == -1) {
                    class752.method4172(var47.field792, -11571);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class50 var62;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var62 = class545.method3220(65535, field4996[--field4991]);
                } else {
                    var62 = arg1 ? field5012 : field4994;
                }
                if (arg0 == 1499) {
                    var62.method453((byte) 56);
                    return;
                }
                String var63 = field5010[--field4997];
                int[] var64 = null;
                if (var63.length() > 0 && var63.charAt(var63.length() - 1) == 'Y') {
                    int var65 = field4996[--field4991];
                    if (var65 > 0) {
                        var64 = new int[var65];
                        while (var65-- > 0) {
                            var64[var65] = field4996[--field4991];
                        }
                    }
                    var63 = var63.substring(0, var63.length() - 1);
                }
                Object[] var66 = new Object[var63.length() + 1];
                for (int var67 = var66.length - 1; var67 >= 1; var67--) {
                    if (var63.charAt(var67 - 1) == 's') {
                        var66[var67] = field5010[--field4997];
                    } else {
                        var66[var67] = Integer.valueOf(field4996[--field4991]);
                    }
                }
                int var68 = field4996[--field4991];
                if (var68 == -1) {
                    var66 = null;
                } else {
                    var66[0] = Integer.valueOf(var68);
                }
                if (arg0 == 1400) {
                    var62.field842 = var66;
                } else if (arg0 == 1401) {
                    var62.field739 = var66;
                } else if (arg0 == 1402) {
                    var62.field828 = var66;
                } else if (arg0 == 1403) {
                    var62.field726 = var66;
                } else if (arg0 == 1404) {
                    var62.field843 = var66;
                } else if (arg0 == 1405) {
                    var62.field836 = var66;
                } else if (arg0 == 1406) {
                    var62.field866 = var66;
                } else if (arg0 == 1407) {
                    var62.field773 = var66;
                    var62.field775 = var64;
                } else if (arg0 == 1408) {
                    var62.field785 = var66;
                } else if (arg0 == 1409) {
                    var62.field789 = var66;
                } else if (arg0 == 1410) {
                    var62.field852 = var66;
                } else if (arg0 == 1411) {
                    var62.field713 = var66;
                } else if (arg0 == 1412) {
                    var62.field849 = var66;
                } else if (arg0 == 1414) {
                    var62.field767 = var66;
                    var62.field734 = var64;
                } else if (arg0 == 1415) {
                    var62.field708 = var66;
                    var62.field757 = var64;
                } else if (arg0 == 1416) {
                    var62.field805 = var66;
                } else if (arg0 == 1417) {
                    var62.field860 = var66;
                } else if (arg0 == 1418) {
                    var62.field760 = var66;
                } else if (arg0 == 1419) {
                    var62.field864 = var66;
                } else if (arg0 == 1420) {
                    var62.field737 = var66;
                } else if (arg0 == 1421) {
                    var62.field727 = var66;
                } else if (arg0 == 1422) {
                    var62.field820 = var66;
                } else if (arg0 == 1423) {
                    var62.field788 = var66;
                } else if (arg0 == 1424) {
                    var62.field752 = var66;
                } else if (arg0 == 1425) {
                    var62.field786 = var66;
                } else if (arg0 == 1426) {
                    var62.field837 = var66;
                } else if (arg0 == 1427) {
                    var62.field802 = var66;
                } else if (arg0 == 1428) {
                    var62.field817 = var66;
                    var62.field858 = var64;
                } else if (arg0 == 1429) {
                    var62.field857 = var66;
                    var62.field810 = var64;
                } else if (arg0 == 1430) {
                    var62.field818 = var66;
                }
                var62.field715 = true;
                return;
            }
            if (arg0 < 1600) {
                class50 var69 = arg1 ? field5012 : field4994;
                if (arg0 == 1500) {
                    field4996[field4991++] = var69.field719;
                    return;
                }
                if (arg0 == 1501) {
                    field4996[field4991++] = var69.field856;
                    return;
                }
                if (arg0 == 1502) {
                    field4996[field4991++] = var69.field783;
                    return;
                }
                if (arg0 == 1503) {
                    field4996[field4991++] = var69.field830;
                    return;
                }
                if (arg0 == 1504) {
                    field4996[field4991++] = var69.field725 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field4996[field4991++] = var69.field791;
                    return;
                }
                if (arg0 == 1506) {
                    class50 var70 = class202.method1412(13493, var69);
                    field4996[field4991++] = var70 == null ? -1 : var70.field792;
                    return;
                }
            } else if (arg0 < 1700) {
                class50 var71 = arg1 ? field5012 : field4994;
                if (arg0 == 1600) {
                    field4996[field4991++] = var71.field790;
                    return;
                }
                if (arg0 == 1601) {
                    field4996[field4991++] = var71.field869;
                    return;
                }
                if (arg0 == 1602) {
                    field5010[field4997++] = var71.field859;
                    return;
                }
                if (arg0 == 1603) {
                    field4996[field4991++] = var71.field796;
                    return;
                }
                if (arg0 == 1604) {
                    field4996[field4991++] = var71.field779;
                    return;
                }
                if (arg0 == 1605) {
                    field4996[field4991++] = var71.field753;
                    return;
                }
                if (arg0 == 1606) {
                    field4996[field4991++] = var71.field875;
                    return;
                }
                if (arg0 == 1607) {
                    field4996[field4991++] = var71.field838;
                    return;
                }
                if (arg0 == 1608) {
                    field4996[field4991++] = var71.field733;
                    return;
                }
                if (arg0 == 1609) {
                    field4996[field4991++] = var71.field731;
                    return;
                }
                if (arg0 == 1610) {
                    field4996[field4991++] = var71.field776;
                    return;
                }
                if (arg0 == 1611) {
                    field4996[field4991++] = var71.field764;
                    return;
                }
                if (arg0 == 1612) {
                    field4996[field4991++] = var71.field823;
                    return;
                }
                if (arg0 == 1613) {
                    int var72 = field4996[--field4991];
                    class513 var73 = class285.field4042.method2993(var72, (byte) 80);
                    if (var73.method3063((byte) -127)) {
                        field5010[field4997++] = var71.method457(var73.field7320, var72, -5);
                        return;
                    }
                    field4996[field4991++] = var71.method441(0, var73.field7315, var72);
                    return;
                }
                if (arg0 == 1614) {
                    field4996[field4991++] = var71.field835;
                    return;
                }
                if (arg0 == 2614) {
                    field4996[field4991++] = var71.field851 == 1 ? var71.field780 : -1;
                    return;
                }
            } else if (arg0 < 1800) {
                class50 var74 = arg1 ? field5012 : field4994;
                if (arg0 == 1700) {
                    field4996[field4991++] = var74.field861;
                    return;
                }
                if (arg0 == 1701) {
                    if (var74.field861 != -1) {
                        field4996[field4991++] = var74.field748;
                        return;
                    }
                    field4996[field4991++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field4996[field4991++] = var74.field807;
                    return;
                }
            } else if (arg0 < 1900) {
                class50 var75 = arg1 ? field5012 : field4994;
                if (arg0 == 1800) {
                    field4996[field4991++] = client.method1943(var75).method2118(true);
                    return;
                }
                if (arg0 == 1801) {
                    int var76 = field4996[--field4991];
                    int var357 = var76 - 1;
                    if (var75.field784 != null && var357 < var75.field784.length && var75.field784[var357] != null) {
                        field5010[field4997++] = var75.field784[var357];
                        return;
                    }
                    field5010[field4997++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var75.field831 == null) {
                        field5010[field4997++] = "";
                        return;
                    }
                    field5010[field4997++] = var75.field831;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class50 var355;
                if (arg0 >= 2000) {
                    var355 = class545.method3220(65535, field4996[--field4991]);
                    arg0 -= 1000;
                } else {
                    var355 = arg1 ? field5012 : field4994;
                }
                if (field5019 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var355.field802 == null) {
                        return;
                    }
                    class604 var356 = new class604();
                    var356.field8782 = var355;
                    var356.field8773 = var355.field802;
                    var356.field8768 = field5019 + 1;
                    class35.field474.method1526(var356, 116);
                    return;
                }
            } else if (arg0 < 2600) {
                class50 var77 = class545.method3220(65535, field4996[--field4991]);
                if (arg0 == 2500) {
                    field4996[field4991++] = var77.field719;
                    return;
                }
                if (arg0 == 2501) {
                    field4996[field4991++] = var77.field856;
                    return;
                }
                if (arg0 == 2502) {
                    field4996[field4991++] = var77.field783;
                    return;
                }
                if (arg0 == 2503) {
                    field4996[field4991++] = var77.field830;
                    return;
                }
                if (arg0 == 2504) {
                    field4996[field4991++] = var77.field725 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field4996[field4991++] = var77.field791;
                    return;
                }
                if (arg0 == 1506) {
                    class50 var78 = class202.method1412(13493, var77);
                    field4996[field4991++] = var78 == null ? -1 : var78.field792;
                    return;
                }
            } else if (arg0 < 2700) {
                class50 var79 = class545.method3220(65535, field4996[--field4991]);
                if (arg0 == 2600) {
                    field4996[field4991++] = var79.field790;
                    return;
                }
                if (arg0 == 2601) {
                    field4996[field4991++] = var79.field869;
                    return;
                }
                if (arg0 == 2602) {
                    field5010[field4997++] = var79.field859;
                    return;
                }
                if (arg0 == 2603) {
                    field4996[field4991++] = var79.field796;
                    return;
                }
                if (arg0 == 2604) {
                    field4996[field4991++] = var79.field779;
                    return;
                }
                if (arg0 == 2605) {
                    field4996[field4991++] = var79.field753;
                    return;
                }
                if (arg0 == 2606) {
                    field4996[field4991++] = var79.field875;
                    return;
                }
                if (arg0 == 2607) {
                    field4996[field4991++] = var79.field838;
                    return;
                }
                if (arg0 == 2608) {
                    field4996[field4991++] = var79.field733;
                    return;
                }
                if (arg0 == 2609) {
                    field4996[field4991++] = var79.field731;
                    return;
                }
                if (arg0 == 2610) {
                    field4996[field4991++] = var79.field776;
                    return;
                }
                if (arg0 == 2611) {
                    field4996[field4991++] = var79.field764;
                    return;
                }
                if (arg0 == 2612) {
                    field4996[field4991++] = var79.field823;
                    return;
                }
                if (arg0 == 2613) {
                    field4996[field4991++] = var79.field835;
                    return;
                }
                if (arg0 == 2614) {
                    field4996[field4991++] = var79.field851 == 1 ? var79.field780 : -1;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class50 var80 = class545.method3220(65535, field4996[--field4991]);
                    field4996[field4991++] = var80.field861;
                    return;
                }
                if (arg0 == 2701) {
                    class50 var81 = class545.method3220(65535, field4996[--field4991]);
                    if (var81.field861 != -1) {
                        field4996[field4991++] = var81.field748;
                        return;
                    }
                    field4996[field4991++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var82 = field4996[--field4991];
                    class548 var83 = (class548) class310.field4383.method4203(true, (long) var82);
                    if (var83 != null) {
                        field4996[field4991++] = 1;
                        return;
                    }
                    field4996[field4991++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class50 var84 = class545.method3220(65535, field4996[--field4991]);
                    if (var84.field863 == null) {
                        field4996[field4991++] = 0;
                        return;
                    }
                    int var85 = var84.field863.length;
                    for (int var86 = 0; var86 < var84.field863.length; var86++) {
                        if (var84.field863[var86] == null) {
                            var85 = var86;
                            break;
                        }
                    }
                    field4996[field4991++] = var85;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field4991 -= 2;
                    int var87 = field4996[field4991];
                    int var88 = field4996[field4991 + 1];
                    class548 var89 = (class548) class310.field4383.method4203(true, (long) var87);
                    if (var89 != null && var89.field7723 == var88) {
                        field4996[field4991++] = 1;
                        return;
                    }
                    field4996[field4991++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class50 var90 = class545.method3220(65535, field4996[--field4991]);
                if (arg0 == 2800) {
                    field4996[field4991++] = client.method1943(var90).method2118(true);
                    return;
                }
                if (arg0 == 2801) {
                    int var91 = field4996[--field4991];
                    int var358 = var91 - 1;
                    if (var90.field784 != null && var358 < var90.field784.length && var90.field784[var358] != null) {
                        field5010[field4997++] = var90.field784[var358];
                        return;
                    }
                    field5010[field4997++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var90.field831 == null) {
                        field5010[field4997++] = "";
                        return;
                    }
                    field5010[field4997++] = var90.field831;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var92 = field5010[--field4997];
                    class283.method1848(var92, (byte) -115);
                    return;
                }
                if (arg0 == 3101) {
                    field4991 -= 2;
                    class667.method3743(field4996[field4991 + 1], field4996[field4991], true, class468.field6748);
                    return;
                }
                if (arg0 == 3103) {
                    class80.method787(1, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var93 = field5010[--field4997];
                    int var94 = 0;
                    if (class395.method2450(var93, 10)) {
                        var94 = class547.method3226((byte) -114, var93);
                    }
                    field5003++;
                    class135 var95 = class273.method1801(class459.field6629, class123.field1906, 2);
                    var95.field2109.method233(var94, -23162);
                    class539.method3178(var95, -18925);
                    return;
                }
                if (arg0 == 3105) {
                    String var96 = field5010[--field4997];
                    field5013++;
                    class135 var97 = class273.method1801(class459.field6629, class71.field1277, 2);
                    var97.field2109.method263((byte) 124, var96.length() + 1);
                    var97.field2109.method287((byte) 0, var96);
                    class539.method3178(var97, -18925);
                    return;
                }
                if (arg0 == 3106) {
                    String var98 = field5010[--field4997];
                    field5016++;
                    class135 var99 = class273.method1801(class459.field6629, class79.field1475, 2);
                    var99.field2109.method263((byte) -111, var98.length() + 1);
                    var99.field2109.method287((byte) 0, var98);
                    class539.method3178(var99, -18925);
                    return;
                }
                if (arg0 == 3107) {
                    int var100 = field4996[--field4991];
                    String var101 = field5010[--field4997];
                    class58.method546(var101, var100, 0);
                    return;
                }
                if (arg0 == 3108) {
                    field4991 -= 3;
                    int var102 = field4996[field4991];
                    int var103 = field4996[field4991 + 1];
                    int var104 = field4996[field4991 + 2];
                    class50 var105 = class545.method3220(65535, var104);
                    class62.method677(var105, false, var102, var103);
                    return;
                }
                if (arg0 == 3109) {
                    field4991 -= 2;
                    int var106 = field4996[field4991];
                    int var107 = field4996[field4991 + 1];
                    class50 var108 = arg1 ? field5012 : field4994;
                    class62.method677(var108, false, var106, var107);
                    return;
                }
                if (arg0 == 3110) {
                    int var109 = field4996[--field4991];
                    field5014++;
                    class135 var110 = class273.method1801(class459.field6629, class22.field271, 2);
                    var110.field2109.method223(1493807496, var109);
                    class539.method3178(var110, -18925);
                    return;
                }
                if (arg0 == 3111) {
                    field4991 -= 2;
                    int var111 = field4996[field4991];
                    int var112 = field4996[field4991 + 1];
                    class548 var113 = (class548) class310.field4383.method4203(true, (long) var111);
                    if (var113 != null) {
                        class740.method4119(var113, var113.field7723 != var112, true, 61);
                    }
                    class508.method3034(3, var112, var111, (byte) 22, true);
                    return;
                }
                if (arg0 == 3112) {
                    field4991--;
                    int var114 = field4996[field4991];
                    class548 var115 = (class548) class310.field4383.method4203(true, (long) var114);
                    if (var115 != null && var115.field7725 == 3) {
                        class740.method4119(var115, true, true, 126);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class583.method3374(0, field5010[--field4997]);
                    return;
                }
                if (arg0 == 3114) {
                    field4991 -= 2;
                    int var116 = field4996[field4991];
                    int var117 = field4996[field4991 + 1];
                    String var118 = field5010[--field4997];
                    class541.method3185("", "", var118, var117, var116, 6642, "");
                    return;
                }
                if (arg0 == 3115) {
                    field4991 -= 11;
                    class338[] var119 = class405.method2488(true);
                    class692[] var120 = class701.method3940(1);
                    class400.method2475(var120[field4996[field4991 + 1]], var119[field4996[field4991]], field4996[field4991 + 10], field4996[field4991 + 3], field4996[field4991 + 4], -30140, field4996[field4991 + 2], field4996[field4991 + 5], field4996[field4991 + 8], field4996[field4991 + 9], field4996[field4991 + 6], field4996[field4991 + 7]);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field4991 -= 3;
                    class247.method1652(256, field4996[field4991 + 1], true, 255, field4996[field4991], field4996[field4991 + 2]);
                    return;
                }
                if (arg0 == 3201) {
                    class431.method2615(255, field4996[--field4991], (byte) -54, 50);
                    return;
                }
                if (arg0 == 3202) {
                    field4991 -= 2;
                    class456.method2785(field4996[field4991], 255, field4996[field4991 + 1], (byte) -75);
                    return;
                }
                if (arg0 == 3203) {
                    field4991 -= 4;
                    class247.method1652(256, field4996[field4991 + 1], true, field4996[field4991 + 3], field4996[field4991], field4996[field4991 + 2]);
                    return;
                }
                if (arg0 == 3204) {
                    field4991 -= 3;
                    class431.method2615(field4996[field4991 + 1], field4996[field4991], (byte) -32, field4996[field4991 + 2]);
                    return;
                }
                if (arg0 == 3205) {
                    field4991 -= 3;
                    class456.method2785(field4996[field4991], field4996[field4991 + 2], field4996[field4991 + 1], (byte) -75);
                    return;
                }
                if (arg0 == 3206) {
                    field4991 -= 4;
                    class335.method2140(-120, 256, field4996[field4991], field4996[field4991 + 3], field4996[field4991 + 1], false, field4996[field4991 + 2]);
                    return;
                }
                if (arg0 == 3207) {
                    field4991 -= 4;
                    class335.method2140(-95, 256, field4996[field4991], field4996[field4991 + 3], field4996[field4991 + 1], true, field4996[field4991 + 2]);
                    return;
                }
                if (arg0 == 3208) {
                    field4991 -= 5;
                    class247.method1652(field4996[field4991 + 4], field4996[field4991 + 1], true, field4996[field4991 + 3], field4996[field4991], field4996[field4991 + 2]);
                    return;
                }
                if (arg0 == 3209) {
                    field4991 -= 5;
                    class335.method2140(-25, field4996[field4991 + 4], field4996[field4991], field4996[field4991 + 3], field4996[field4991 + 1], false, field4996[field4991 + 2]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field4996[field4991++] = class605.field8787;
                    return;
                }
                if (arg0 == 3301) {
                    field4991 -= 2;
                    int var121 = field4996[field4991];
                    int var122 = field4996[field4991 + 1];
                    field4996[field4991++] = class519.method3080((byte) -96, var122, var121, false);
                    return;
                }
                if (arg0 == 3302) {
                    field4991 -= 2;
                    int var123 = field4996[field4991];
                    int var124 = field4996[field4991 + 1];
                    field4996[field4991++] = class175.method1274((byte) 112, false, var124, var123);
                    return;
                }
                if (arg0 == 3303) {
                    field4991 -= 2;
                    int var125 = field4996[field4991];
                    int var126 = field4996[field4991 + 1];
                    field4996[field4991++] = class280.method1831(false, var125, var126, (byte) 82);
                    return;
                }
                if (arg0 == 3304) {
                    int var127 = field4996[--field4991];
                    field4996[field4991++] = class434.field6077.method1075((byte) -70, var127).field2845;
                    return;
                }
                if (arg0 == 3305) {
                    int var128 = field4996[--field4991];
                    field4996[field4991++] = class183.field2623[var128];
                    return;
                }
                if (arg0 == 3306) {
                    int var129 = field4996[--field4991];
                    field4996[field4991++] = class310.field4384[var129];
                    return;
                }
                if (arg0 == 3307) {
                    int var130 = field4996[--field4991];
                    field4996[field4991++] = class68.field1230[var130];
                    return;
                }
                if (arg0 == 3308) {
                    byte var131 = class468.field6748.field649;
                    int var132 = (class468.field6748.field644 >> 9) + class115.field1845;
                    int var133 = (class468.field6748.field648 >> 9) + class64.field1160;
                    field4996[field4991++] = (var131 << 28) + (var132 << 14) + var133;
                    return;
                }
                if (arg0 == 3309) {
                    int var134 = field4996[--field4991];
                    field4996[field4991++] = var134 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var135 = field4996[--field4991];
                    field4996[field4991++] = var135 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var136 = field4996[--field4991];
                    field4996[field4991++] = var136 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field4996[field4991++] = class399.field5585 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field4991 -= 2;
                    int var137 = field4996[field4991];
                    int var138 = field4996[field4991 + 1];
                    field4996[field4991++] = class519.method3080((byte) -123, var138, var137, true);
                    return;
                }
                if (arg0 == 3314) {
                    field4991 -= 2;
                    int var139 = field4996[field4991];
                    int var140 = field4996[field4991 + 1];
                    field4996[field4991++] = class175.method1274((byte) 112, true, var140, var139);
                    return;
                }
                if (arg0 == 3315) {
                    field4991 -= 2;
                    int var141 = field4996[field4991];
                    int var142 = field4996[field4991 + 1];
                    field4996[field4991++] = class280.method1831(true, var141, var142, (byte) 82);
                    return;
                }
                if (arg0 == 3316) {
                    if (class79.field1485 >= 2) {
                        field4996[field4991++] = class79.field1485;
                        return;
                    }
                    field4996[field4991++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field4996[field4991++] = class586.field8248;
                    return;
                }
                if (arg0 == 3318) {
                    field4996[field4991++] = class67.field1223.field8324;
                    return;
                }
                if (arg0 == 3321) {
                    field4996[field4991++] = class169.field2482;
                    return;
                }
                if (arg0 == 3322) {
                    field4996[field4991++] = class735.field10353;
                    return;
                }
                if (arg0 == 3323) {
                    if (class505.field7212 >= 5 && class505.field7212 <= 9) {
                        field4996[field4991++] = 1;
                        return;
                    }
                    field4996[field4991++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class505.field7212 >= 5 && class505.field7212 <= 9) {
                        field4996[field4991++] = class505.field7212;
                        return;
                    }
                    field4996[field4991++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field4996[field4991++] = class406.field5652 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field4996[field4991++] = class468.field6748.field4903;
                    return;
                }
                if (arg0 == 3327) {
                    field4996[field4991++] = class468.field6748.field4932.field1594 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field4996[field4991++] = class253.field3605 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var143 = field4996[--field4991];
                    field4996[field4991++] = class229.method1574(29652, var143, false);
                    return;
                }
                if (arg0 == 3331) {
                    field4991 -= 2;
                    int var144 = field4996[field4991];
                    int var145 = field4996[field4991 + 1];
                    field4996[field4991++] = class57.method519(86, var145, false, false, var144);
                    return;
                }
                if (arg0 == 3332) {
                    field4991 -= 2;
                    int var146 = field4996[field4991];
                    int var147 = field4996[field4991 + 1];
                    field4996[field4991++] = class57.method519(117, var147, false, true, var146);
                    return;
                }
                if (arg0 == 3333) {
                    field4996[field4991++] = class595.field8697;
                    return;
                }
                if (arg0 == 3335) {
                    field4996[field4991++] = class744.field10426;
                    return;
                }
                if (arg0 == 3336) {
                    field4991 -= 4;
                    int var148 = field4996[field4991];
                    int var149 = field4996[field4991 + 1];
                    int var150 = field4996[field4991 + 2];
                    int var151 = field4996[field4991 + 3];
                    int var152 = (var149 << 14) + var148;
                    int var153 = (var150 << 28) + var152;
                    int var154 = var151 + var153;
                    field4996[field4991++] = var154;
                    return;
                }
                if (arg0 == 3337) {
                    field4996[field4991++] = class66.field1197;
                    return;
                }
                if (arg0 == 3338) {
                    field4996[field4991++] = class591.method3391(100);
                    return;
                }
                if (arg0 == 3339) {
                    field4996[field4991++] = 0;
                    return;
                }
                if (arg0 == 3340) {
                    field4996[field4991++] = class33.field439 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field4996[field4991++] = class606.field8795 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field4996[field4991++] = class422.field5917.method1597(124);
                    return;
                }
                if (arg0 == 3343) {
                    field4996[field4991++] = class422.field5917.method1592(true);
                    return;
                }
                if (arg0 == 3344) {
                    field5010[field4997++] = class306.method1982(-1);
                    return;
                }
                if (arg0 == 3345) {
                    field5010[field4997++] = class46.method414(114);
                    return;
                }
                if (arg0 == 3346) {
                    field4996[field4991++] = class519.method3081(0);
                    return;
                }
                if (arg0 == 3347) {
                    field4996[field4991++] = class173.field2510;
                    return;
                }
                if (arg0 == 3349) {
                    field4996[field4991++] = class468.field6748.field888.method2999(16383) >> 3;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field4991 -= 2;
                    int var155 = field4996[field4991];
                    int var156 = field4996[field4991 + 1];
                    class362 var157 = class723.field10100.method2423(var155, (byte) -122);
                    field5010[field4997++] = var157.method2251(var156, -28891);
                    return;
                }
                if (arg0 == 3408) {
                    field4991 -= 4;
                    int var158 = field4996[field4991];
                    int var159 = field4996[field4991 + 1];
                    int var160 = field4996[field4991 + 2];
                    int var161 = field4996[field4991 + 3];
                    class362 var162 = class723.field10100.method2423(var160, (byte) -91);
                    if (var162.field5067 == var158 && var162.field5070 == var159) {
                        if (var159 == 115) {
                            field5010[field4997++] = var162.method2251(var161, -28891);
                            return;
                        }
                        field4996[field4991++] = var162.method2250(var161, 92);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field4991 -= 3;
                    int var163 = field4996[field4991];
                    int var164 = field4996[field4991 + 1];
                    int var165 = field4996[field4991 + 2];
                    if (var164 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class362 var166 = class723.field10100.method2423(var164, (byte) -83);
                    if (var166.field5070 != var163) {
                        throw new RuntimeException("C3409-1");
                    }
                    field4996[field4991++] = var166.method2258(-6, var165) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var167 = field4996[--field4991];
                    String var168 = field5010[--field4997];
                    if (var167 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class362 var169 = class723.field10100.method2423(var167, (byte) -117);
                    if (var169.field5070 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field4996[field4991++] = var169.method2252(var168, 3) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var170 = field4996[--field4991];
                    class362 var171 = class723.field10100.method2423(var170, (byte) -67);
                    field4996[field4991++] = var171.field5074.method4208(false);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class488.field6905 == 0) {
                        field4996[field4991++] = -2;
                        return;
                    }
                    if (class488.field6905 == 1) {
                        field4996[field4991++] = -1;
                        return;
                    }
                    field4996[field4991++] = class425.field5945;
                    return;
                }
                if (arg0 == 3601) {
                    int var172 = field4996[--field4991];
                    if (class488.field6905 == 2 && var172 < class425.field5945) {
                        field5010[field4997++] = class583.field8236[var172];
                        if (class111.field1800[var172] != null) {
                            field5010[field4997++] = class111.field1800[var172];
                            return;
                        }
                        field5010[field4997++] = "";
                        return;
                    }
                    field5010[field4997++] = "";
                    field5010[field4997++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var173 = field4996[--field4991];
                    if (class488.field6905 == 2 && var173 < class425.field5945) {
                        field4996[field4991++] = class170.field2486[var173];
                        return;
                    }
                    field4996[field4991++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var174 = field4996[--field4991];
                    if (class488.field6905 == 2 && var174 < class425.field5945) {
                        field4996[field4991++] = class159.field2371[var174];
                        return;
                    }
                    field4996[field4991++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var175 = field5010[--field4997];
                    int var176 = field4996[--field4991];
                    class369.method2313(var175, var176, (byte) 3);
                    return;
                }
                if (arg0 == 3605) {
                    String var177 = field5010[--field4997];
                    class415.method2532(-126, var177);
                    return;
                }
                if (arg0 == 3606) {
                    String var178 = field5010[--field4997];
                    class511.method3058(var178, 768);
                    return;
                }
                if (arg0 == 3607) {
                    String var179 = field5010[--field4997];
                    class117.method948(var179, 3169, false);
                    return;
                }
                if (arg0 == 3608) {
                    String var180 = field5010[--field4997];
                    class190.method1340((byte) 127, var180);
                    return;
                }
                if (arg0 == 3609) {
                    String var181 = field5010[--field4997];
                    if (var181.startsWith("<img=0>") || var181.startsWith("<img=1>")) {
                        var181 = var181.substring(7);
                    }
                    field4996[field4991++] = class443.method2658(var181, (byte) 115) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var182 = field4996[--field4991];
                    if (class488.field6905 == 2 && var182 < class425.field5945) {
                        field5010[field4997++] = class301.field4237[var182];
                        return;
                    }
                    field5010[field4997++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (client.field4194 != null) {
                        field5010[field4997++] = class660.method3713(119, client.field4194);
                        return;
                    }
                    field5010[field4997++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (client.field4194 != null) {
                        field4996[field4991++] = class208.field2982;
                        return;
                    }
                    field4996[field4991++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var183 = field4996[--field4991];
                    if (client.field4194 != null && var183 < class208.field2982) {
                        field5010[field4997++] = class20.field259[var183].field8125;
                        return;
                    }
                    field5010[field4997++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var184 = field4996[--field4991];
                    if (client.field4194 != null && var184 < class208.field2982) {
                        field4996[field4991++] = class20.field259[var184].field8127;
                        return;
                    }
                    field4996[field4991++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var185 = field4996[--field4991];
                    if (client.field4194 != null && var185 < class208.field2982) {
                        field4996[field4991++] = class20.field259[var185].field8129;
                        return;
                    }
                    field4996[field4991++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field4996[field4991++] = class244.field3406;
                    return;
                }
                if (arg0 == 3617) {
                    String var186 = field5010[--field4997];
                    class520.method3085(115, var186);
                    return;
                }
                if (arg0 == 3618) {
                    field4996[field4991++] = class588.field8273;
                    return;
                }
                if (arg0 == 3619) {
                    String var187 = field5010[--field4997];
                    class134.method1066(-7884, var187);
                    return;
                }
                if (arg0 == 3620) {
                    class217.method1513(0);
                    return;
                }
                if (arg0 == 3621) {
                    if (class488.field6905 == 0) {
                        field4996[field4991++] = -1;
                        return;
                    }
                    field4996[field4991++] = class222.field3169;
                    return;
                }
                if (arg0 == 3622) {
                    int var188 = field4996[--field4991];
                    if (class488.field6905 != 0 && var188 < class222.field3169) {
                        field5010[field4997++] = class162.field2404[var188];
                        if (class628.field9029[var188] != null) {
                            field5010[field4997++] = class628.field9029[var188];
                            return;
                        }
                        field5010[field4997++] = "";
                        return;
                    }
                    field5010[field4997++] = "";
                    field5010[field4997++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var189 = field5010[--field4997];
                    if (var189.startsWith("<img=0>") || var189.startsWith("<img=1>")) {
                        var189 = var189.substring(7);
                    }
                    field4996[field4991++] = class212.method1488(var189, (byte) 19) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var190 = field4996[--field4991];
                    if (class20.field259 != null && var190 < class208.field2982 && class20.field259[var190].field8123.equalsIgnoreCase(class468.field6748.field4939)) {
                        field4996[field4991++] = 1;
                        return;
                    }
                    field4996[field4991++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class63.field1146 != null) {
                        field5010[field4997++] = class63.field1146;
                        return;
                    }
                    field5010[field4997++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var191 = field4996[--field4991];
                    if (client.field4194 != null && var191 < class208.field2982) {
                        field5010[field4997++] = class20.field259[var191].field8128;
                        return;
                    }
                    field5010[field4997++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var192 = field4996[--field4991];
                    if (class488.field6905 == 2 && var192 >= 0 && var192 < class425.field5945) {
                        field4996[field4991++] = class425.field5947[var192] ? 1 : 0;
                        return;
                    }
                    field4996[field4991++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var193 = field5010[--field4997];
                    if (var193.startsWith("<img=0>") || var193.startsWith("<img=1>")) {
                        var193 = var193.substring(7);
                    }
                    field4996[field4991++] = class683.method3851(false, var193);
                    return;
                }
                if (arg0 == 3629) {
                    field4996[field4991++] = class417.field5856;
                    return;
                }
                if (arg0 == 3630) {
                    String var194 = field5010[--field4997];
                    class117.method948(var194, 3169, true);
                    return;
                }
                if (arg0 == 3631) {
                    int var195 = field4996[--field4991];
                    field4996[field4991++] = class259.field3808[var195] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var196 = field4996[--field4991];
                    if (client.field4194 != null && var196 < class208.field2982) {
                        field5010[field4997++] = class20.field259[var196].field8123;
                        return;
                    }
                    field5010[field4997++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var197 = field4996[--field4991];
                    if (class488.field6905 != 0 && var197 < class222.field3169) {
                        field5010[field4997++] = class349.field4928[var197];
                        return;
                    }
                    field5010[field4997++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var198 = field4996[--field4991];
                    field4996[field4991++] = class64.field1155[var198].method2983((byte) -14);
                    return;
                }
                if (arg0 == 3904) {
                    int var199 = field4996[--field4991];
                    field4996[field4991++] = class64.field1155[var199].field7075;
                    return;
                }
                if (arg0 == 3905) {
                    int var200 = field4996[--field4991];
                    field4996[field4991++] = class64.field1155[var200].field7071;
                    return;
                }
                if (arg0 == 3906) {
                    int var201 = field4996[--field4991];
                    field4996[field4991++] = class64.field1155[var201].field7068;
                    return;
                }
                if (arg0 == 3907) {
                    int var202 = field4996[--field4991];
                    field4996[field4991++] = class64.field1155[var202].field7065;
                    return;
                }
                if (arg0 == 3908) {
                    int var203 = field4996[--field4991];
                    field4996[field4991++] = class64.field1155[var203].field7069;
                    return;
                }
                if (arg0 == 3910) {
                    int var204 = field4996[--field4991];
                    int var205 = class64.field1155[var204].method2982((byte) -40);
                    field4996[field4991++] = var205 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var206 = field4996[--field4991];
                    int var207 = class64.field1155[var206].method2982((byte) -40);
                    field4996[field4991++] = var207 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var208 = field4996[--field4991];
                    int var209 = class64.field1155[var208].method2982((byte) -75);
                    field4996[field4991++] = var209 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var210 = field4996[--field4991];
                    int var211 = class64.field1155[var210].method2982((byte) -90);
                    field4996[field4991++] = var211 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field4991 -= 2;
                    int var212 = field4996[field4991];
                    int var213 = field4996[field4991 + 1];
                    field4996[field4991++] = var212 + var213;
                    return;
                }
                if (arg0 == 4001) {
                    field4991 -= 2;
                    int var214 = field4996[field4991];
                    int var215 = field4996[field4991 + 1];
                    field4996[field4991++] = var214 - var215;
                    return;
                }
                if (arg0 == 4002) {
                    field4991 -= 2;
                    int var216 = field4996[field4991];
                    int var217 = field4996[field4991 + 1];
                    field4996[field4991++] = var216 * var217;
                    return;
                }
                if (arg0 == 4003) {
                    field4991 -= 2;
                    int var218 = field4996[field4991];
                    int var219 = field4996[field4991 + 1];
                    field4996[field4991++] = var218 / var219;
                    return;
                }
                if (arg0 == 4004) {
                    int var220 = field4996[--field4991];
                    field4996[field4991++] = (int) (Math.random() * (double) var220);
                    return;
                }
                if (arg0 == 4005) {
                    int var221 = field4996[--field4991];
                    field4996[field4991++] = (int) (Math.random() * (double) (var221 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field4991 -= 5;
                    int var222 = field4996[field4991];
                    int var223 = field4996[field4991 + 1];
                    int var224 = field4996[field4991 + 2];
                    int var225 = field4996[field4991 + 3];
                    int var226 = field4996[field4991 + 4];
                    field4996[field4991++] = (var223 - var222) * (var226 - var224) / (var225 - var224) + var222;
                    return;
                }
                if (arg0 == 4007) {
                    field4991 -= 2;
                    long var227 = (long) field4996[field4991];
                    long var229 = (long) field4996[field4991 + 1];
                    field4996[field4991++] = (int) (var227 * var229 / 100L + var227);
                    return;
                }
                if (arg0 == 4008) {
                    field4991 -= 2;
                    int var231 = field4996[field4991];
                    int var232 = field4996[field4991 + 1];
                    field4996[field4991++] = var231 | 0x1 << var232;
                    return;
                }
                if (arg0 == 4009) {
                    field4991 -= 2;
                    int var233 = field4996[field4991];
                    int var234 = field4996[field4991 + 1];
                    field4996[field4991++] = var233 & -(0x1 << var234) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field4991 -= 2;
                    int var235 = field4996[field4991];
                    int var236 = field4996[field4991 + 1];
                    field4996[field4991++] = (var235 & 0x1 << var236) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field4991 -= 2;
                    int var237 = field4996[field4991];
                    int var238 = field4996[field4991 + 1];
                    field4996[field4991++] = var237 % var238;
                    return;
                }
                if (arg0 == 4012) {
                    field4991 -= 2;
                    int var239 = field4996[field4991];
                    int var240 = field4996[field4991 + 1];
                    if (var239 == 0) {
                        field4996[field4991++] = 0;
                        return;
                    }
                    field4996[field4991++] = (int) Math.pow((double) var239, (double) var240);
                    return;
                }
                if (arg0 == 4013) {
                    field4991 -= 2;
                    int var241 = field4996[field4991];
                    int var242 = field4996[field4991 + 1];
                    if (var241 == 0) {
                        field4996[field4991++] = 0;
                        return;
                    }
                    if (var242 == 0) {
                        field4996[field4991++] = Integer.MAX_VALUE;
                        return;
                    }
                    field4996[field4991++] = (int) Math.pow((double) var241, 1.0D / (double) var242);
                    return;
                }
                if (arg0 == 4014) {
                    field4991 -= 2;
                    int var243 = field4996[field4991];
                    int var244 = field4996[field4991 + 1];
                    field4996[field4991++] = var243 & var244;
                    return;
                }
                if (arg0 == 4015) {
                    field4991 -= 2;
                    int var245 = field4996[field4991];
                    int var246 = field4996[field4991 + 1];
                    field4996[field4991++] = var245 | var246;
                    return;
                }
                if (arg0 == 4016) {
                    field4991 -= 2;
                    int var247 = field4996[field4991];
                    int var248 = field4996[field4991 + 1];
                    field4996[field4991++] = var247 < var248 ? var247 : var248;
                    return;
                }
                if (arg0 == 4017) {
                    field4991 -= 2;
                    int var249 = field4996[field4991];
                    int var250 = field4996[field4991 + 1];
                    field4996[field4991++] = var249 > var250 ? var249 : var250;
                    return;
                }
                if (arg0 == 4018) {
                    field4991 -= 3;
                    long var251 = (long) field4996[field4991];
                    long var253 = (long) field4996[field4991 + 1];
                    long var255 = (long) field4996[field4991 + 2];
                    field4996[field4991++] = (int) (var251 * var255 / var253);
                    return;
                }
                if (arg0 == 4019) {
                    field4991 -= 2;
                    int var257 = field4996[field4991];
                    int var258 = field4996[field4991 + 1];
                    if (var257 > 700 || var258 > 700) {
                        field4996[field4991++] = 256;
                    }
                    double var259 = (Math.random() * (double) (var257 + var258) + 800.0D - (double) var257) / 100.0D;
                    field4996[field4991++] = (int) (Math.pow(2.0D, var259) + 0.5D);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var261 = field5010[--field4997];
                    int var262 = field4996[--field4991];
                    field5010[field4997++] = var261 + var262;
                    return;
                }
                if (arg0 == 4101) {
                    field4997 -= 2;
                    String var263 = field5010[field4997];
                    String var264 = field5010[field4997 + 1];
                    field5010[field4997++] = var263 + var264;
                    return;
                }
                if (arg0 == 4102) {
                    String var265 = field5010[--field4997];
                    int var266 = field4996[--field4991];
                    field5010[field4997++] = var265 + class154.method1178(24, var266, true);
                    return;
                }
                if (arg0 == 4103) {
                    String var267 = field5010[--field4997];
                    field5010[field4997++] = var267.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field5010[field4997++] = method2229(field4996[--field4991]);
                    return;
                }
                if (arg0 == 4105) {
                    field4997 -= 2;
                    String var268 = field5010[field4997];
                    String var269 = field5010[field4997 + 1];
                    if (class468.field6748.field4932 != null && class468.field6748.field4932.field1594) {
                        field5010[field4997++] = var269;
                        return;
                    }
                    field5010[field4997++] = var268;
                    return;
                }
                if (arg0 == 4106) {
                    int var270 = field4996[--field4991];
                    field5010[field4997++] = Integer.toString(var270);
                    return;
                }
                if (arg0 == 4107) {
                    field4997 -= 2;
                    field4996[field4991++] = class594.method3412(-8322, field5010[field4997 + 1], class744.field10426, field5010[field4997]);
                    return;
                }
                if (arg0 == 4108) {
                    String var271 = field5010[--field4997];
                    field4991 -= 2;
                    int var272 = field4996[field4991];
                    int var273 = field4996[field4991 + 1];
                    class323 var274 = class226.method1560(0, 255, class722.field10091, var273);
                    field4996[field4991++] = var274.method2076(var272, var271, class237.field3358, 60);
                    return;
                }
                if (arg0 == 4109) {
                    String var275 = field5010[--field4997];
                    field4991 -= 2;
                    int var276 = field4996[field4991];
                    int var277 = field4996[field4991 + 1];
                    class323 var278 = class226.method1560(0, 255, class722.field10091, var277);
                    field4996[field4991++] = var278.method2072(var276, class237.field3358, var275, (byte) 40);
                    return;
                }
                if (arg0 == 4110) {
                    field4997 -= 2;
                    String var279 = field5010[field4997];
                    String var280 = field5010[field4997 + 1];
                    if (field4996[--field4991] == 1) {
                        field5010[field4997++] = var279;
                        return;
                    }
                    field5010[field4997++] = var280;
                    return;
                }
                if (arg0 == 4111) {
                    String var281 = field5010[--field4997];
                    field5010[field4997++] = class57.method520(var281, 126);
                    return;
                }
                if (arg0 == 4112) {
                    String var282 = field5010[--field4997];
                    int var283 = field4996[--field4991];
                    if (var283 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field5010[field4997++] = var282 + (char) var283;
                    return;
                }
                if (arg0 == 4113) {
                    int var284 = field4996[--field4991];
                    field4996[field4991++] = method2226((char) var284);
                    return;
                }
                if (arg0 == 4114) {
                    int var285 = field4996[--field4991];
                    field4996[field4991++] = class317.method2038(122, (char) var285) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var286 = field4996[--field4991];
                    field4996[field4991++] = class178.method1288((char) var286, 65) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var287 = field4996[--field4991];
                    field4996[field4991++] = class338.method2151((char) var287, 127) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var288 = field5010[--field4997];
                    if (var288 != null) {
                        field4996[field4991++] = var288.length();
                        return;
                    }
                    field4996[field4991++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var289 = field5010[--field4997];
                    field4991 -= 2;
                    int var290 = field4996[field4991];
                    int var291 = field4996[field4991 + 1];
                    field5010[field4997++] = var289.substring(var290, var291);
                    return;
                }
                if (arg0 == 4119) {
                    String var292 = field5010[--field4997];
                    StringBuffer var293 = new StringBuffer(var292.length());
                    boolean var294 = false;
                    for (int var295 = 0; var295 < var292.length(); var295++) {
                        char var296 = var292.charAt(var295);
                        if (var296 == '<') {
                            var294 = true;
                        } else if (var296 == '>') {
                            var294 = false;
                        } else if (!var294) {
                            var293.append(var296);
                        }
                    }
                    field5010[field4997++] = var293.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var297 = field5010[--field4997];
                    field4991 -= 2;
                    int var298 = field4996[field4991];
                    int var299 = field4996[field4991 + 1];
                    field4996[field4991++] = var297.indexOf(var298, var299);
                    return;
                }
                if (arg0 == 4121) {
                    field4997 -= 2;
                    String var300 = field5010[field4997];
                    String var301 = field5010[field4997 + 1];
                    int var302 = field4996[--field4991];
                    field4996[field4991++] = var300.indexOf(var301, var302);
                    return;
                }
                if (arg0 == 4122) {
                    int var303 = field4996[--field4991];
                    field4996[field4991++] = Character.toLowerCase((char) var303);
                    return;
                }
                if (arg0 == 4123) {
                    int var304 = field4996[--field4991];
                    field4996[field4991++] = Character.toUpperCase((char) var304);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var305 = field4996[--field4991] != 0;
                    int var306 = field4996[--field4991];
                    field5010[field4997++] = class180.method1290(var305, -28679, 0, class744.field10426, (long) var306);
                    return;
                }
                if (arg0 == 4125) {
                    String var307 = field5010[--field4997];
                    int var308 = field4996[--field4991];
                    class323 var309 = class226.method1560(0, 255, class722.field10091, var308);
                    field4996[field4991++] = var309.method2068(-1, class237.field3358, var307);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var310 = field4996[--field4991];
                    field5010[field4997++] = class558.field7942.method721(67, var310).field3644;
                    return;
                }
                if (arg0 == 4201) {
                    field4991 -= 2;
                    int var311 = field4996[field4991];
                    int var312 = field4996[field4991 + 1];
                    class253 var313 = class558.field7942.method721(67, var311);
                    if (var312 >= 1 && var312 <= 5 && var313.field3648[var312 - 1] != null) {
                        field5010[field4997++] = var313.field3648[var312 - 1];
                        return;
                    }
                    field5010[field4997++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field4991 -= 2;
                    int var314 = field4996[field4991];
                    int var315 = field4996[field4991 + 1];
                    class253 var316 = class558.field7942.method721(-40, var314);
                    if (var315 >= 1 && var315 <= 5 && var316.field3671[var315 - 1] != null) {
                        field5010[field4997++] = var316.field3671[var315 - 1];
                        return;
                    }
                    field5010[field4997++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var317 = field4996[--field4991];
                    field4996[field4991++] = class558.field7942.method721(88, var317).field3643;
                    return;
                }
                if (arg0 == 4204) {
                    int var318 = field4996[--field4991];
                    field4996[field4991++] = class558.field7942.method721(81, var318).field3623 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var319 = field4996[--field4991];
                    class253 var320 = class558.field7942.method721(-117, var319);
                    if (var320.field3619 == -1 && var320.field3620 >= 0) {
                        field4996[field4991++] = var320.field3620;
                        return;
                    }
                    field4996[field4991++] = var319;
                    return;
                }
                if (arg0 == 4206) {
                    int var321 = field4996[--field4991];
                    class253 var322 = class558.field7942.method721(-49, var321);
                    if (var322.field3619 >= 0 && var322.field3620 >= 0) {
                        field4996[field4991++] = var322.field3620;
                        return;
                    }
                    field4996[field4991++] = var321;
                    return;
                }
                if (arg0 == 4207) {
                    int var323 = field4996[--field4991];
                    field4996[field4991++] = class558.field7942.method721(-46, var323).field3626 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field4991 -= 2;
                    int var324 = field4996[field4991];
                    int var325 = field4996[field4991 + 1];
                    class513 var326 = class285.field4042.method2993(var325, (byte) 80);
                    if (var326.method3063((byte) -126)) {
                        field5010[field4997++] = class558.field7942.method721(98, var324).method1720(11, var326.field7320, var325);
                        return;
                    }
                    field4996[field4991++] = class558.field7942.method721(-67, var324).method1726(-26242, var325, var326.field7315);
                    return;
                }
                if (arg0 == 4209) {
                    field4991 -= 2;
                    int var327 = field4996[field4991];
                    int var328 = field4996[field4991 + 1] - 1;
                    class253 var329 = class558.field7942.method721(67, var327);
                    if (var329.field3653 == var328) {
                        field4996[field4991++] = var329.field3642;
                        return;
                    }
                    if (var329.field3609 == var328) {
                        field4996[field4991++] = var329.field3610;
                        return;
                    }
                    field4996[field4991++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var330 = field5010[--field4997];
                    int var331 = field4996[--field4991];
                    class656.method3693((byte) -34, var330, var331 == 1);
                    field4996[field4991++] = class525.field7465;
                    return;
                }
                if (arg0 == 4211) {
                    if (class330.field4657 != null && class271.field3882 < class525.field7465) {
                        field4996[field4991++] = class330.field4657[class271.field3882++] & 0xFFFF;
                        return;
                    }
                    field4996[field4991++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class271.field3882 = 0;
                    return;
                }
                if (arg0 == 4213) {
                    int var332 = field4996[--field4991];
                    field4996[field4991++] = class558.field7942.method721(-117, var332).field3616;
                    return;
                }
                if (arg0 == 4214) {
                    String var333 = field5010[--field4997];
                    field4991 -= 3;
                    int var334 = field4996[field4991];
                    int var335 = field4996[field4991 + 1];
                    int var336 = field4996[field4991 + 2];
                    class233.method1595(var335, var334 == 1, var333, var336, false);
                    field4996[field4991++] = class525.field7465;
                    return;
                }
                if (arg0 == 4215) {
                    field4997 -= 2;
                    field4991 -= 2;
                    String var337 = field5010[field4997];
                    int var338 = field4996[field4991];
                    int var339 = field4996[field4991 + 1];
                    String var340 = field5010[field4997 + 1];
                    class79.method784(var340, false, var337, var338 == 1, var339);
                    field4996[field4991++] = class525.field7465;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field4991 -= 2;
                    int var341 = field4996[field4991];
                    int var342 = field4996[field4991 + 1];
                    class513 var343 = class285.field4042.method2993(var342, (byte) 80);
                    if (var343.method3063((byte) -90)) {
                        field5010[field4997++] = class134.field2102.method3038(var341, (byte) -107).method2927(-124, var342, var343.field7320);
                        return;
                    }
                    field4996[field4991++] = class134.field2102.method3038(var341, (byte) 29).method2935(var343.field7315, (byte) 56, var342);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field4991 -= 2;
                    int var344 = field4996[field4991];
                    int var345 = field4996[field4991 + 1];
                    class513 var346 = class285.field4042.method2993(var345, (byte) 80);
                    if (var346.method3063((byte) -121)) {
                        field5010[field4997++] = class66.field1181.method131(2, var344).method2525(var345, (byte) -95, var346.field7320);
                        return;
                    }
                    field4996[field4991++] = class66.field1181.method131(2, var344).method2510(104, var346.field7315, var345);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field4991 -= 2;
                    int var347 = field4996[field4991];
                    int var348 = field4996[field4991 + 1];
                    class513 var349 = class285.field4042.method2993(var348, (byte) 80);
                    if (var349.method3063((byte) -94)) {
                        field5010[field4997++] = class582.field8227.method1614(var347, (byte) -97).method3950(7, var349.field7320, var348);
                        return;
                    }
                    field4996[field4991++] = class582.field8227.method1614(var347, (byte) 74).method3951(var349.field7315, var348, (byte) -89);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var350 = field4996[--field4991];
                class500 var351 = class675.field9475.method1251(var350, -123);
                if (var351.field7147 != null && var351.field7147.length > 0) {
                    int var352 = 0;
                    int var353 = var351.field7145[0];
                    for (int var354 = 1; var354 < var351.field7147.length; var354++) {
                        if (var351.field7145[var354] > var353) {
                            var352 = var354;
                            var353 = var351.field7145[var354];
                        }
                    }
                    field4996[field4991++] = var351.field7147[var352];
                    return;
                }
                field4996[field4991++] = var351.field7127;
                return;
            }
        } else {
            class50 var51;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var51 = class545.method3220(65535, field4996[--field4991]);
            } else {
                var51 = arg1 ? field5012 : field4994;
            }
            if (arg0 == 1300) {
                int var52 = field4996[--field4991] - 1;
                if (var52 >= 0 && var52 <= 9) {
                    var51.method450((byte) -50, var52, field5010[--field4997]);
                    return;
                }
                field4997--;
                return;
            }
            if (arg0 == 1301) {
                field4991 -= 2;
                int var53 = field4996[field4991];
                int var54 = field4996[field4991 + 1];
                if (var53 == -1 && var54 == -1) {
                    var51.field832 = null;
                    return;
                }
                var51.field832 = class434.method2624(var53, var54, (byte) -87);
                return;
            }
            if (arg0 == 1302) {
                int var55 = field4996[--field4991];
                if (class262.field3830 != var55 && class603.field8759 != var55 && class425.field5951 != var55) {
                    return;
                }
                var51.field862 = var55;
                return;
            }
            if (arg0 == 1303) {
                var51.field846 = field4996[--field4991];
                return;
            }
            if (arg0 == 1304) {
                var51.field799 = field4996[--field4991];
                return;
            }
            if (arg0 == 1305) {
                var51.field831 = field5010[--field4997];
                return;
            }
            if (arg0 == 1306) {
                var51.field743 = field5010[--field4997];
                return;
            }
            if (arg0 == 1307) {
                var51.field784 = null;
                return;
            }
            if (arg0 == 1308) {
                var51.field797 = field4996[--field4991];
                var51.field770 = field4996[--field4991];
                return;
            }
            if (arg0 == 1309) {
                int var56 = field4996[--field4991];
                int var57 = field4996[--field4991];
                if (var57 >= 1 && var57 <= 10) {
                    var51.method458(var57 - 1, (byte) -124, var56);
                }
                return;
            }
            if (arg0 == 1310) {
                var51.field854 = field5010[--field4997];
                return;
            }
            if (arg0 == 1311) {
                var51.field768 = field4996[--field4991];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var58;
                int var59;
                int var60;
                if (arg0 == 1312) {
                    field4991 -= 3;
                    var58 = field4996[field4991] - 1;
                    var59 = field4996[field4991 + 1];
                    var60 = field4996[field4991 + 2];
                    if (var58 < 0 || var58 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field4991 -= 2;
                    var58 = 10;
                    var59 = field4996[field4991];
                    var60 = field4996[field4991 + 1];
                }
                if (var51.field848 == null) {
                    if (var59 == 0) {
                        return;
                    }
                    var51.field848 = new byte[11];
                    var51.field774 = new byte[11];
                    var51.field766 = new int[11];
                }
                var51.field848[var58] = (byte) var59;
                if (var59 == 0) {
                    var51.field777 = false;
                    for (int var61 = 0; var61 < var51.field848.length; var61++) {
                        if (var51.field848[var61] != 0) {
                            var51.field777 = true;
                            break;
                        }
                    }
                } else {
                    var51.field777 = true;
                }
                var51.field774[var58] = (byte) var60;
                return;
            }
            if (arg0 == 1314) {
                var51.field841 = field4996[--field4991];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }
}
