import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class273 {

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "Z")
    public static boolean field4108 = false;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "[I")
    public static int[] field4111 = new int[13];

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "[I")
    public static int[] field4105;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I[B)V", line = 3)
    public static final synchronized void method1798(int arg0, byte[] arg1) {
        field4106++;
        if (~arg1.length == arg0 && class158.field2277 < 1000) {
            class32.field495[class158.field2277++] = arg1;
        } else if (arg1.length == 5000 && class143.field2114 < 250) {
            class420.field6109[class143.field2114++] = arg1;
        } else if (arg1.length == 30000 && class368.field5270 < 50) {
            class64.field1210[class368.field5270++] = arg1;
        } else if (class101.field1577 != null) {
            for (int var2 = 0; var2 < class271.field4085.length; var2++) {
                if (class271.field4085[var2] == arg1.length && class101.field1577[var2].length > class327.field4850[var2]) {
                    class101.field1577[var2][class327.field4850[var2]++] = arg1;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I[BIII[BBII)V", line = 50)
    public static final void method1799(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5, byte arg6, int arg7, int arg8) {
        field4107++;
        int var9 = -(arg4 >> 2);
        if (arg6 != 8) {
            method1800((byte) -108);
        }
        int var10 = -(arg4 & 0x3);
        for (int var11 = -arg7; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg2++;
                arg5[var10001] = (byte) (arg5[var10001] - arg1[arg0++]);
                int var14 = arg2++;
                arg5[var14] = (byte) (arg5[var14] - arg1[arg0++]);
                int var15 = arg2++;
                arg5[var15] = (byte) (arg5[var15] - arg1[arg0++]);
                int var16 = arg2++;
                arg5[var16] = (byte) (arg5[var16] - arg1[arg0++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg2++;
                arg5[var10001] = (byte) (arg5[var10001] - arg1[arg0++]);
            }
            arg2 += arg3;
            arg0 += arg8;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V", line = 94)
    public static void method1800(byte arg0) {
        field4111 = null;
        if (arg0 != 104) {
            method1801(null, 36);
        }
        field4105 = null;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 107)
    public static final long method1801(String arg0, int arg1) {
        field4110++;
        long var2 = 0L;
        int var4 = arg0.length();
        int var5 = 28 % ((44 - arg1) / 63);
        for (int var6 = 0; var6 < var4; var6++) {
            var2 *= 37L;
            char var7 = arg0.charAt(var6);
            if (var7 >= 'A' && var7 <= 'Z') {
                var2 += (var7 + 1 - 65);
            } else if (var7 >= 'a' && var7 <= 'z') {
                var2 += (var7 + 1 - 97);
            } else if (var7 >= '0' && var7 <= '9') {
                var2 += (var7 - 21);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BI)[B", line = 153)
    public static final synchronized byte[] method1802(byte arg0, int arg1) {
        field4109++;
        if (arg0 < 107) {
            method1801(null, 43);
        }
        if (arg1 == 100 && class158.field2277 > 0) {
            byte[] var2 = class32.field495[--class158.field2277];
            class32.field495[class158.field2277] = null;
            return var2;
        } else if (arg1 == 5000 && class143.field2114 > 0) {
            byte[] var3 = class420.field6109[--class143.field2114];
            class420.field6109[class143.field2114] = null;
            return var3;
        } else if (arg1 == 30000 && class368.field5270 > 0) {
            byte[] var4 = class64.field1210[--class368.field5270];
            class64.field1210[class368.field5270] = null;
            return var4;
        } else {
            if (class101.field1577 != null) {
                for (int var5 = 0; var5 < class271.field4085.length; var5++) {
                    if (class271.field4085[var5] == arg1 && class327.field4850[var5] > 0) {
                        byte[] var6 = class101.field1577[var5][--class327.field4850[var5]];
                        class101.field1577[var5][class327.field4850[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg1];
        }
    }
}
