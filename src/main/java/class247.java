import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class247 {

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "[I")
    private int[] field4127;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4121 = "glow2:";

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field4128 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field4125 = 0;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "[I")
    public static int[] field4123 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "[S")
    public static short[] field4130;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method1778(int arg0, boolean arg1, int arg2) {
        field4129++;
        if (arg1 && arg2 >= 0) {
            int var3 = 4 % ((arg0 + 11) / 55);
            return class212.method1542(arg1, arg2, -97, 10);
        } else {
            return Integer.toString(arg2);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
    public static void method1779(boolean arg0) {
        field4123 = null;
        field4130 = null;
        if (!arg0) {
            field4124 = -71;
        }
        field4128 = null;
        field4121 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)I")
    public final int method1780(int arg0, byte arg1) {
        if (arg1 <= 37) {
            method1782((String) null, 50, (String) null, 109);
        }
        field4132++;
        int var3 = (this.field4127.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field4127[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4127[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "([I)V")
    public class247(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field4127 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field4127[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field4127[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field4127[var5 + var5] = arg0[var4];
            this.field4127[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Llc;I)V")
    public static final void method1781(class86 arg0, int arg1) {
        if (arg1 != 1) {
            field4121 = null;
        }
        field4122++;
        class28.field326 = arg0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I")
    public static final int method1782(String arg0, int arg1, String arg2, int arg3) {
        field4126++;
        int var4 = arg0.length();
        if (arg1 != 2) {
            method1778(-80, false, 121);
        }
        int var5 = 0;
        int var6 = arg2.length();
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var7 - var8) || var6 > var5 - var9) {
            if (var4 <= var7 - var8) {
                return -1;
            }
            if (var5 - var9 >= var6) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg0.charAt(var7++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg2.charAt(var5++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class242.method1696(103, var22);
            var9 = class242.method1696(108, var24);
            char var26 = class208.method1519(arg3, (byte) 74, var22);
            char var27 = class208.method1519(arg3, (byte) 74, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class185.method1375(arg3, var28, 121) - class185.method1375(arg3, var29, 120);
                }
            }
        }
        int var10 = Math.min(var4, var6);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg3 == 2) {
                var16 = var6 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg0.charAt(var17);
            char var19 = arg2.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class185.method1375(arg3, var20, arg1 ^ 0x72) - class185.method1375(arg3, var21, 117);
                }
            }
        }
        int var12 = var4 - var6;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg0.charAt(var13);
            char var15 = arg2.charAt(var13);
            if (var14 != var15) {
                return class185.method1375(arg3, var14, 107) - class185.method1375(arg3, var15, 127);
            }
        }
        return 0;
    }
}
