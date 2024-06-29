import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class120 {

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "Lpw;")
    public static class662 field2028;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "[I")
    public static int[] field2025;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIB)Z")
    public static final boolean method934(int arg0, int arg1, byte arg2) {
        field2024++;
        if (!class388.field5142) {
            return false;
        }
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (arg2 <= 60) {
            return true;
        } else if (class601.field7977[var3] == null || class601.field7977[var3][var4] == null) {
            return false;
        } else {
            class625 var5 = class601.field7977[var3][var4];
            if (arg1 == -1 && var5.field8421 == 0) {
                for (class117 var6 = (class117) class480.field6411.method3257(-61); var6 != null; var6 = (class117) class480.field6411.method3263((byte) -126)) {
                    if (var6.field1993 == 50 || var6.field1993 == 1006 || var6.field1993 == 10 || var6.field1993 == 4 || var6.field1993 == 12) {
                        for (class625 var7 = class153.method1078(65535, var6.field1999); var7 != null; var7 = class637.method3519(var7, 2122911660)) {
                            if (var5.field8327 == var7.field8327) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                for (class117 var8 = (class117) class480.field6411.method3257(-23); var8 != null; var8 = (class117) class480.field6411.method3263((byte) -108)) {
                    if (var8.field2003 == arg1 && var5.field8327 == var8.field1999 && (var8.field1993 == 50 || var8.field1993 == 1006 || var8.field1993 == 10 || var8.field1993 == 4 || var8.field1993 == 12)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;")
    public static final String method935(int arg0, int arg1, int arg2, String[] arg3) {
        field2023++;
        if (arg2 == 0) {
            return "";
        } else if (arg2 == 1) {
            String var4 = arg3[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg2;
            int var6 = arg0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
    public static void method936(int arg0) {
        int var1 = 117 % ((arg0 - 64) / 32);
        field2028 = null;
        field2025 = null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)S")
    public static final short method937(int arg0, int arg1) {
        field2027++;
        int var2 = (arg0 & 0xFD18) >> 10;
        int var3 = (arg0 & 0x386) >> 3;
        int var4 = arg0 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        if (arg1 != 26708) {
            field2028 = null;
        }
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var2 << 10 | var7 >> 4 << 7);
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Leda;[[BZ)V")
    public static final void method938(class90 arg0, byte[][] arg1, boolean arg2) {
        field2026++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg1.length;
        if (!arg2) {
            method936(-55);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg1[var5];
            if (var10 != null) {
                class335 var11 = new class335(var10);
                int var12 = class376.field5072[var5] >> 8;
                int var13 = class376.field5072[var5] & 0xFF;
                int var14 = var12 * 64 - class473.field6334;
                int var15 = var13 * 64 - class233.field3269;
                class381.method2226((byte) 117);
                arg0.method1547(var15, 0, var11, class233.field3269, var14, class591.field7820, class473.field6334);
                arg0.method713(var11, var14, var3, class10.field197, (byte) -15, var15);
                if (!arg0.field3479 && (class466.field6278 / 8) == var12 && class571.field7588 / 8 == var13 && var3[0] != -1) {
                    class111.field1784 = class152.field2405.method1004(var3[1], var3[0], arg2, var3[3], class328.field4518, var3[2]);
                    class292.field4124 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class376.field5072[var6] >> 8) * 64 - class473.field6334;
            int var8 = (class376.field5072[var6] & 0xFF) * 64 - class233.field3269;
            byte[] var9 = arg1[var6];
            if (var9 == null && class571.field7588 < 800) {
                class381.method2226((byte) 122);
                arg0.method1542((byte) -107, var8, 64, var7, 64);
            }
        }
    }
}
