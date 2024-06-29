import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class258 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field3579 = 0;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Ldi;")
    public static class98 field3583 = null;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;", line = 4)
    public static final String method1620(int arg0, int arg1, int arg2, String[] arg3) {
        field3582++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg3[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg2;
            int var6 = arg0;
            for (int var7 = arg2; var7 < var5; var7++) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg2; var9 < var5; var9++) {
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

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 67)
    public static void method1621(int arg0) {
        if (arg0 <= 80) {
            method1620(43, -39, -71, null);
        }
        field3583 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILdga;I)Ljava/lang/String;", line = 77)
    public static final String method1622(int arg0, class138 arg1, int arg2) {
        field3580++;
        try {
            int var3 = arg1.method914(80);
            if (var3 > arg0) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg1.field1745 += class664.field9420.method867(0, arg1.field1745, 4880, arg1.field1712, var4, var3);
            return class93.method523(var3, var4, (byte) -114, arg2);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILej;II)Luw;", line = 109)
    public static final class175 method1623(int arg0, class229 arg1, int arg2, int arg3) {
        field3581++;
        int var4 = arg1.field2987 | arg0 << 8;
        class175 var5 = (class175) class101.field1229.method3026(6, (long) var4 << 16);
        if (arg3 != -1861) {
            method1622(42, null, -127);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class314.field4517.method1082((byte) 33, class314.field4517.method1085(false, var4));
        if (var6 == null) {
            int var8 = arg1.field2987 | arg2 + 65536 << 8;
            class175 var9 = (class175) class101.field1229.method3026(arg3 ^ 0x73D, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class314.field4517.method1082((byte) 33, class314.field4517.method1085(false, var8));
            if (var10 == null) {
                int var12 = arg1.field2987 | 0xFFFF00;
                class175 var13 = (class175) class101.field1229.method3026(-33, (long) var12 << 16);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class314.field4517.method1082((byte) 33, class314.field4517.method1085(false, var12));
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class175 var15 = class285.method1710(var14, false);
                    var15.field2207 = arg1;
                    class101.field1229.method3027((long) var12 << 16, var15, (byte) 111);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class175 var11 = class285.method1710(var10, false);
                var11.field2207 = arg1;
                class101.field1229.method3027((long) var8 << 16, var11, (byte) 111);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class175 var7 = class285.method1710(var6, false);
            var7.field2207 = arg1;
            class101.field1229.method3027((long) var4 << 16, var7, (byte) 111);
            return var7;
        }
    }
}
