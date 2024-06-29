import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class77 extends class137 {

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public int field1269 = -1;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    public int field1270 = 0;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
    public int field1272 = 12800;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public int field1267 = 12800;

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "I")
    public int field1282 = 0;

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "I")
    public int field1280 = -1;

    @OriginalMember(owner = "client!dd", name = "cb", descriptor = "Z")
    public boolean field1285 = true;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public int field1265;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "Ljava/lang/String;")
    public String field1264;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "Ljava/lang/String;")
    public String field1276;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "Loj;")
    public class246 field1278;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "[S")
    public static short[] field1274 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "Ljava/lang/String;")
    public static String field1266 = "Close";

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "I")
    public static int field1281 = 0;

    @OriginalMember(owner = "client!dd", name = "db", descriptor = "Ljava/lang/String;")
    public static String field1286 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!dd", name = "fb", descriptor = "[J")
    public static long[] field1288 = new long[500];

    @OriginalMember(owner = "client!dd", name = "gb", descriptor = "I")
    public static int field1289 = 3;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!dd", name = "eb", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBLag;I)V")
    public static final void method518(int arg0, byte arg1, class211 arg2, int arg3) {
        field1273++;
        if (class83.field1384 < 2 && class46.field778 == 0 && !class139.field2211) {
            return;
        }
        if (arg1 != 23) {
            method521(127);
        }
        String var4 = class159.method1095(-2);
        if (arg2 == null) {
            int var5 = class59.field967.method644(var4, arg0 + 4, arg3 + 15, 16777215, 0, class243.field3858, class55.field906);
            class236.method1603(arg3, 15, arg0 + 4, var5 + class59.field967.method634(var4), 0);
            return;
        }
        class93 var6 = arg2.method1476(class42.field611, true);
        if (var6 == null) {
            var6 = class59.field967;
        }
        var6.method622(var4, arg0, arg3, arg2.field3430, arg2.field3394, arg2.field3393, arg2.field3360, arg2.field3442, arg2.field3425, class243.field3858, class55.field906, class40.field595);
        class236.method1603(class40.field595[1], class40.field595[3], class40.field595[0], class40.field595[2], 0);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z)V")
    public static void method519(boolean arg0) {
        field1266 = null;
        if (arg0) {
            field1274 = null;
            field1286 = null;
            field1288 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([IIIII)Z")
    public final boolean method520(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field1279++;
        if (arg3 < 111) {
            method518(9, (byte) 69, (class211) null, -69);
        }
        for (class201 var6 = (class201) this.field1278.method1643((byte) -59); var6 != null; var6 = (class201) this.field1278.method1642((byte) 112)) {
            if (var6.method1409(arg4, 11850, arg1, arg2)) {
                var6.method1408((byte) 98, arg4, arg0, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "(I)V")
    public static final void method521(int arg0) {
        field1284++;
        int var1 = class180.field2944.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class180.field2944[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class139.field2222; var4++) {
                    if (class206.field3271[var4] == class120.field1914[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class206.field3271[class139.field2222] = class120.field1914[var2];
                    var3 = class139.field2222++;
                }
                class162 var5 = new class162(class180.field2944[var2]);
                int var6 = 0;
                while (var5.field2568 < class180.field2944[var2].length && var6 < 511 && class246.field3912 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method1142(-18970);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = (class120.field1914[var2] >> 8) * 64 + var10 - class276.field4438;
                    int var12 = var8 & 0x3F;
                    int var13 = (class120.field1914[var2] & 0xFF) * 64 + var12 - class108.field1732;
                    class253 var14 = class234.method1586(var5.method1142(-18970), true);
                    if (class12.field127[var7] == null && (var14.field4080 & 0x1) > 0 && class287.field4606 == var9 && var11 >= 0 && (var14.field4048 + var11) < 104 && var13 >= 0 && var14.field4048 + var13 < 104) {
                        class12.field127[var7] = new class131();
                        class131 var15 = class12.field127[var7];
                        class184.field3020[class246.field3912++] = var7;
                        var15.field695 = class29.field360;
                        var15.method927(true, var14);
                        var15.method280((byte) -125, var15.field2056.field4048);
                        var15.field702 = var15.field652 = class70.field1157[var15.field2056.field4060];
                        var15.field626 = var15.field2056.field4083;
                        var15.field664 = var15.field2056.field4084;
                        if (var15.field664 == 0) {
                            var15.field652 = 0;
                        }
                        var15.method278(true, var11, var13, (byte) -103, var15.method279(23397));
                    }
                }
            }
        }
        if (arg0 != -813656690) {
            field1266 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([IIII)Z")
    public final boolean method522(int[] arg0, int arg1, int arg2, int arg3) {
        field1277++;
        if (arg3 != -1202095642) {
            return true;
        }
        for (class201 var5 = (class201) this.field1278.method1643((byte) -125); var5 != null; var5 = (class201) this.field1278.method1642((byte) 73)) {
            if (var5.method1405(-96, arg2, arg1)) {
                var5.method1408((byte) -1, arg2, arg0, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "(I)V")
    public final void method523(int arg0) {
        this.field1267 = arg0;
        this.field1282 = 0;
        field1263++;
        this.field1272 = 12800;
        this.field1270 = 0;
        for (class201 var2 = (class201) this.field1278.method1643((byte) -124); var2 != null; var2 = (class201) this.field1278.method1642((byte) 33)) {
            if (this.field1267 > var2.field3225) {
                this.field1267 = var2.field3225;
            }
            if (this.field1270 < var2.field3211) {
                this.field1270 = var2.field3211;
            }
            if (var2.field3216 < this.field1272) {
                this.field1272 = var2.field3216;
            }
            if (this.field1282 < var2.field3214) {
                this.field1282 = var2.field3214;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI[II)Z")
    public final boolean method524(byte arg0, int arg1, int[] arg2, int arg3) {
        field1283++;
        if (arg0 != 56) {
            method526((class162) null, 116);
        }
        for (class201 var5 = (class201) this.field1278.method1643((byte) -89); var5 != null; var5 = (class201) this.field1278.method1642((byte) 66)) {
            if (var5.method1402(14, arg1, arg3)) {
                var5.method1403(arg3, 0, arg1, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BII)Z")
    public final boolean method525(byte arg0, int arg1, int arg2) {
        if (arg0 != -24) {
            field1274 = null;
        }
        field1275++;
        for (class201 var4 = (class201) this.field1278.method1643((byte) -37); var4 != null; var4 = (class201) this.field1278.method1642((byte) 97)) {
            if (var4.method1405(arg0 - 67, arg1, arg2)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lwd;I)Lol;")
    public static final class117 method526(class162 arg0, int arg1) {
        field1268++;
        int var2 = -55 / ((arg1 + 9) / 35);
        arg0.method1133((byte) 53);
        int var3 = arg0.method1133((byte) 53);
        class117 var4 = class32.method216(125, var3);
        var4.field1888 = arg0.method1133((byte) 53);
        int var5 = arg0.method1133((byte) 53);
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg0.method1133((byte) 53);
            var4.method44(arg0, 255, var7);
        }
        var4.method64(1);
        return var4;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    public class77(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field1271 = arg0;
        this.field1265 = arg3;
        this.field1285 = arg5;
        this.field1280 = arg6;
        this.field1264 = arg2;
        this.field1269 = arg4;
        this.field1276 = arg1;
        if (this.field1280 == 255) {
            this.field1280 = 0;
        }
        this.field1278 = new class246();
    }
}
