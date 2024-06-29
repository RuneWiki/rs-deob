import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class75 {

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "J")
    public long field1213 = 0L;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field1201 = 0;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Lsc;")
    public static class181 field1204 = null;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field1200 = -1;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field1206 = 0;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Lnk;")
    public static class95 field1199 = new class95();

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "[S")
    public static short[] field1214 = new short[256];

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public int field1210;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public int field1211;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Laf;")
    public class208 field1203;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "Laf;")
    public class208 field1212;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)I")
    public static final int method522(byte arg0, int arg1) {
        if (arg0 != 42) {
            method526(35, -118);
        }
        field1198++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static void method523(byte arg0) {
        field1204 = null;
        int var1 = -58 % ((arg0 - 53) / 54);
        field1199 = null;
        field1214 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)I")
    public static final int method524(int arg0, int arg1, int arg2) {
        field1208++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            if (arg2 != 50) {
                method526(-48, 111);
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method525(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class234.field4084 * arg3 + class157.field2636 * arg0 >> 16;
        int var6 = class157.field2636 * arg3 - class234.field4084 * arg0 >> 16;
        int var7 = class80.field1289 * var6 + class217.field3728 * arg1 >> 16;
        int var8 = class80.field1289 * arg1 - class217.field3728 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class80.field1289 * var6 + class217.field3728 * arg2 >> 16;
        int var12 = class80.field1289 * arg2 - class217.field3728 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class46.field729 && var13 < class46.field729) {
            return false;
        } else if (var9 > class200.field3457 && var13 > class200.field3457) {
            return false;
        } else if (var10 < class215.field3697 && var14 < class215.field3697) {
            return false;
        } else {
            return var10 <= class106.field1724 || var14 <= class106.field1724;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)I")
    public static final int method526(int arg0, int arg1) {
        field1197++;
        if (!(arg1 < 97 || arg1 > 122) || !(arg1 < 224 || arg1 > 254 || arg1 == 247)) {
            return arg1 - 32;
        } else if (arg1 == 255) {
            return 159;
        } else if (arg1 == 156) {
            return 140;
        } else if (arg0 == 254) {
            return arg1;
        } else {
            return -110;
        }
    }
}
