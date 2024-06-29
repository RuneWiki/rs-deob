import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class448 {

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "Lap;")
    public static class310 field6375 = new class310(19, 4);

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field6381 = 0;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "[I")
    public static int[] field6380;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)I", line = 10)
    public static final int method2708(int arg0) {
        field6373++;
        if (arg0 != 0) {
            method2712((String) null, (String) null, 20, (byte) -49);
        }
        if (class273.field3967 == null) {
            return class149.field2059 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lnl;I)V", line = 27)
    public static final void method2709(class435 arg0, int arg1) {
        class284.field4074 = arg0.method2657("titlebg", (byte) 15);
        field6376++;
        class366.field5026 = arg0.method2657("logo", (byte) 15);
        if (arg1 != 24295) {
            method2708(-71);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 39)
    public static final void method2710(byte arg0) {
        if (arg0 >= -99) {
            return;
        }
        field6379++;
        if (class238.field3475 == -1) {
            return;
        }
        int var1 = class175.field2661.method1625((byte) -128);
        int var2 = class175.field2661.method1617(false);
        if (class69.field1012 != null) {
            var1 = class69.field1012.method936(0);
            var2 = class69.field1012.method938(1);
        }
        class343.method2135(class431.field6099, 19112, var2, 0, 0, var1, 0, class238.field3475, 0, class364.field5007);
        if (class125.field1697 != null) {
            class108.method858(var2, var1, -1);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V", line = 74)
    public static void method2711(int arg0) {
        field6375 = null;
        if (arg0 != 1) {
            method2712((String) null, (String) null, -102, (byte) 95);
        }
        field6380 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IB)I", line = 85)
    public static final int method2712(String arg0, String arg1, int arg2, byte arg3) {
        field6378++;
        int var4 = arg1.length();
        int var5 = arg0.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        if (arg3 != 89) {
            method2712((String) null, (String) null, 22, (byte) -99);
        }
        while ((var6 - var8) < var4 || var7 - var9 < var5) {
            if ((var6 - var8) >= var4) {
                return -1;
            }
            if ((var7 - var9) >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg1.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg0.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class344.method2143((byte) 81, var22);
            var9 = class344.method2143((byte) 80, var24);
            char var26 = class478.method2829(var22, arg2, (byte) -40);
            char var27 = class478.method2829(var24, arg2, (byte) -60);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class367.method2250(arg2, var28, 1762) - class367.method2250(arg2, var29, 1762);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var5 - var11 - 1;
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
                    return class367.method2250(arg2, var20, 1762) - class367.method2250(arg2, var21, 1762);
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
                return class367.method2250(arg2, var14, 1762) - class367.method2250(arg2, var15, 1762);
            }
        }
        return 0;
    }
}
