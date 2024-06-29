import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class250 {

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field4000 = 0;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field3998 = 2301979;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "Lik;")
    public static class232 field3997 = new class232(0, 0);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "J")
    public static long field3999;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Ljj;")
    public static class134 field4004;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "Lcb;")
    public static class255 field4006;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLhi;)Lug;")
    public static final class277 method1648(byte arg0, class264 arg1) {
        field4002++;
        if (arg0 <= 7) {
            method1650(0);
        }
        return new class277(arg1.method1756(-119), arg1.method1756(-101), arg1.method1756(-117), arg1.method1756(-128), arg1.method1732(99), arg1.method1779(-77));
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)V")
    public static final void method1649(boolean arg0, int arg1) {
        byte[][] var2 = class81.field1122;
        field3996++;
        if (arg1 > -54) {
            method1651((String) null, (byte) 33);
        }
        int var3 = class67.field948.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class69.field958[var4] >> 8) * 64 - class296.field4685;
                int var7 = (class69.field958[var4] & 0xFF) * 64 - class93.field1321;
                class280.method1873((byte) -54);
                class10.method59(0, var7, class61.field839, var6, var5, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static void method1650(int arg0) {
        if (arg0 < 43) {
            method1651((String) null, (byte) 70);
        }
        field4004 = null;
        field3997 = null;
        field4006 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1651(String arg0, byte arg1) {
        String var2 = class245.method1610(125, class238.method1570(arg0, (byte) 80));
        field4003++;
        if (var2 == null) {
            var2 = "";
        }
        if (arg1 <= 37) {
            field3997 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I")
    public static final int method1652(String arg0, String arg1, int arg2, int arg3) {
        field4005++;
        int var4 = arg1.length();
        int var5 = arg0.length();
        int var6 = 0;
        char var7 = 0;
        char var8 = 0;
        int var9 = 0;
        while ((var9 - var7) < var4 || (var6 - var8) < var5) {
            if (var4 <= (var9 - var7)) {
                return -1;
            }
            if ((var6 - var8) >= var5) {
                return 1;
            }
            char var22;
            if (var7 == '\u0000') {
                var22 = arg1.charAt(var9++);
            } else {
                var22 = var7;
                boolean var23 = false;
            }
            char var24;
            if (var8 == '\u0000') {
                var24 = arg0.charAt(var6++);
            } else {
                var24 = var8;
                boolean var25 = false;
            }
            var7 = class16.method116(var22, -106);
            var8 = class16.method116(var24, -4);
            char var26 = class8.method47((byte) 79, arg3, var22);
            char var27 = class8.method47((byte) 115, arg3, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class260.method1702(false, var28, arg3) - class260.method1702(false, var29, arg3);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        if (arg2 != 27403) {
            method1650(-28);
        }
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg3 == 2) {
                var16 = var5 - (var11 + 1);
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg1.charAt(var17);
            char var19 = arg0.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class260.method1702(false, var20, arg3) - class260.method1702(false, var21, arg3);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg1.charAt(var13);
            char var15 = arg0.charAt(var13);
            if (var14 != var15) {
                return class260.method1702(false, var14, arg3) - class260.method1702(false, var15, arg3);
            }
        }
        return 0;
    }
}
