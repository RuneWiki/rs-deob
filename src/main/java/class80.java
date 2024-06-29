import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class80 extends class156 {

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "[J")
    public static long[] field1333 = new long[1000];

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "[S")
    public static short[] field1335 = new short[256];

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "Lta;")
    public static class262 field1338 = new class262(50);

    @OriginalMember(owner = "client!ld", name = "ab", descriptor = "[S")
    public static short[] field1341 = new short[500];

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "I")
    public int field1340;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "Lpe;")
    public class252 field1336;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "[B")
    public byte[] field1330;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method629(String arg0, int arg1) {
        ++field1332;
        if (arg0 == null) {
            return -1;
        } else {
            for (int var2 = arg1; ~class262.field4100 < ~var2; ++var2) {
                if (arg0.equalsIgnoreCase(class3.field53[var2])) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)Z")
    public static final boolean method630(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class7.field119; ++var3) {
            class100 var4 = class169.field2540[var3];
            if (var4.field1587 == 1) {
                int var5 = var4.field1600 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1592 * var5 >> 8) + var4.field1598;
                    int var7 = (var4.field1603 * var5 >> 8) + var4.field1595;
                    int var8 = (var4.field1588 * var5 >> 8) + var4.field1597;
                    int var9 = (var4.field1602 * var5 >> 8) + var4.field1594;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1587 == 2) {
                int var10 = arg0 - var4.field1600;
                if (var10 > 0) {
                    int var11 = (var4.field1592 * var10 >> 8) + var4.field1598;
                    int var12 = (var4.field1603 * var10 >> 8) + var4.field1595;
                    int var13 = (var4.field1588 * var10 >> 8) + var4.field1597;
                    int var14 = (var4.field1602 * var10 >> 8) + var4.field1594;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1587 == 3) {
                int var15 = var4.field1598 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1609 * var15 >> 8) + var4.field1600;
                    int var17 = (var4.field1606 * var15 >> 8) + var4.field1601;
                    int var18 = (var4.field1588 * var15 >> 8) + var4.field1597;
                    int var19 = (var4.field1602 * var15 >> 8) + var4.field1594;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1587 == 4) {
                int var20 = arg2 - var4.field1598;
                if (var20 > 0) {
                    int var21 = (var4.field1609 * var20 >> 8) + var4.field1600;
                    int var22 = (var4.field1606 * var20 >> 8) + var4.field1601;
                    int var23 = (var4.field1588 * var20 >> 8) + var4.field1597;
                    int var24 = (var4.field1602 * var20 >> 8) + var4.field1594;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1587 == 5) {
                int var25 = arg1 - var4.field1597;
                if (var25 > 0) {
                    int var26 = (var4.field1609 * var25 >> 8) + var4.field1600;
                    int var27 = (var4.field1606 * var25 >> 8) + var4.field1601;
                    int var28 = (var4.field1592 * var25 >> 8) + var4.field1598;
                    int var29 = (var4.field1603 * var25 >> 8) + var4.field1595;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III[B)I")
    public static final int method631(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field1337;
        int var4 = -1;
        int var5 = arg2;
        if (arg1 >= -47) {
            field1333 = null;
        }
        while (~var5 > ~arg0) {
            var4 = class223.field3496[255 & (arg3[var5] ^ var4)] ^ var4 >>> 8;
            ++var5;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(BI)V")
    public static final void method632(byte arg0, int arg1) {
        ++field1334;
        class127 var2 = (class127) class251.field3858.method1414(true, (long) arg1);
        if (var2 != null) {
            int var3 = -69 / ((arg0 - -12) / 42);
            var2.method693(114);
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)I")
    public final int method515(boolean arg0) {
        if (!arg0) {
            return -113;
        } else {
            ++field1339;
            return super.field2386 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)V")
    public static void method633(int arg0) {
        field1335 = null;
        field1338 = null;
        if (arg0 <= 65) {
            method630(91, 106, 116);
        }
        field1341 = null;
        field1333 = null;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)[B")
    public final byte[] method517(int arg0) {
        ++field1331;
        if (arg0 != 10933) {
            field1341 = null;
        }
        if (super.field2386) {
            throw new RuntimeException();
        } else {
            return this.field1330;
        }
    }
}
