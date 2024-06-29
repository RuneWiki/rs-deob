import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class111 extends class245 {

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "[I")
    public int[] field1538;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "[I")
    public int[] field1539;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "[I")
    public static int[] field1536 = new int[256];

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "S")
    public static short field1540 = 256;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "S")
    public static short field1543;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1544;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "Lah;")
    public static class215 field1545;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1536[var0] = var1;
        }
        field1543 = 1;
        field1544 = "yellow:";
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIZ)Ljd;", line = 6)
    public static final class124 method820(int arg0, int arg1, int arg2, boolean arg3) {
        field1533++;
        class232 var4 = class423.field6252[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        class124 var5 = null;
        int var6 = -1;
        class247 var7 = var4.field3866;
        if (arg3) {
            method823(-73, -9);
        }
        while (var7 != null) {
            class57 var8 = var7.field4052;
            if (var8 instanceof class124) {
                class124 var9 = (class124) var8;
                int var10 = (var9.method903(-75) - 1) * 64 + 60;
                int var11 = var9.field724 - var10 >> 7;
                int var12 = var9.field722 - var10 >> 7;
                int var13 = var9.field724 + var10 >> 7;
                int var14 = var9.field722 + var10 >> 7;
                if (var11 <= arg1 && arg2 >= var12 && arg1 <= var13 && arg2 <= var14) {
                    int var15 = (var14 + 1 - arg2) * (var13 + 1 - arg1);
                    if (var6 < var15) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
            var7 = var7.field4054;
        }
        return var5;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)Loh;", line = 66)
    public static final class231 method821(int arg0) {
        if (arg0 < 82) {
            method824((class244) null, (class447) null, -127, (class447) null);
        }
        field1534++;
        class354.field5449 = 0;
        return class107.method810(22068);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)I", line = 86)
    public static final int method822(byte arg0, int arg1) {
        int var7 = arg1 - 1;
        field1535++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg0 < 13) {
            field1544 = null;
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V", line = 105)
    public static final void method823(int arg0, int arg1) {
        field1541++;
        if (!class178.method1225(arg1 + 40, arg0)) {
            return;
        }
        class172[] var2 = class203.field3266[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class172 var4 = var2[var3];
            if (var4 != null) {
                var4.field2839 = 0;
                var4.field2754 = 0;
                var4.field2738 = 1;
            }
        }
        if (arg1 != -1) {
            field1544 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(II[I[I)V", line = 140)
    public class111(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field1538 = arg3;
        this.field1539 = arg2;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lwg;Lmo;ILmo;)V", line = 153)
    public static final void method824(class244 arg0, class447 arg1, int arg2, class447 arg3) {
        field1542++;
        class12.field168 = arg0;
        class156.field2462 = arg3;
        class29.field352 = arg1;
        if (class156.field2462 != null) {
            class117.field1628 = class156.field2462.method2758(1, arg2 ^ 0x3AC7);
        }
        if (class29.field352 != null) {
            class50.field606 = class29.field352.method2758(1, 14535);
        }
        if (arg2 != 512) {
            field1544 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V", line = 173)
    public static final void method825(byte arg0) {
        field1537++;
        int var1 = class357.method2331((byte) -117);
        if (arg0 != -128) {
            method823(74, 46);
        }
        if (var1 == 0) {
            class427.field6304 = null;
            class386.method2451(682, 0);
        } else if (var1 == 1) {
            class171.method1188((byte) 0, (byte) 19);
            class386.method2451(682, 512);
            if (class31.field382 != null) {
                class1.method2(2);
            }
        } else {
            class171.method1188((byte) (class264.field4260 - 4 & 0xFF), (byte) 19);
            class386.method2451(682, 2);
        }
        class39.field492 = class266.field4286;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Z)V", line = 208)
    public static void method826(boolean arg0) {
        field1536 = null;
        if (arg0) {
            field1544 = null;
            field1545 = null;
        }
    }
}
