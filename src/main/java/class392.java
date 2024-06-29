import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class392 extends class735 {

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    public int field5482;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "Lhda;")
    public static class752 field5473 = new class752(13, 7);

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "Lqr;")
    public static class65 field5477 = new class65(64);

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field5479 = 0;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "Lhda;")
    public static class752 field5480 = new class752(73, 3);

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "[Lal;")
    public static class101[] field5481;

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lle;Lqj;IIIIIIIIIIIIII)V")
    public class392(class311 arg0, class512 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field5482 = arg15;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
    public static final int method2319(String arg0, int arg1, int arg2, String arg3) {
        field5475++;
        int var4 = arg0.length();
        int var5 = arg3.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var6 - var8) || (var7 - var9) < var5) {
            if (var4 <= (var6 - var8)) {
                return -1;
            }
            if (var5 <= var7 - var9) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg0.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg3.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class434.method2498(true, var22);
            var9 = class434.method2498(true, var24);
            char var26 = class111.method910(var22, 0, arg1);
            char var27 = class111.method910(var24, 0, arg1);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class185.method1277(arg1, var28, (byte) -119) - class185.method1277(arg1, var29, (byte) 15);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = arg2; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg1 == 2) {
                var17 = var4 - var11 - 1;
                var16 = var5 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg0.charAt(var17);
            char var19 = arg3.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class185.method1277(arg1, var20, (byte) -123) - class185.method1277(arg1, var21, (byte) -119);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg0.charAt(var13);
            char var15 = arg3.charAt(var13);
            if (var14 != var15) {
                return class185.method1277(arg1, var14, (byte) -118) - class185.method1277(arg1, var15, (byte) -120);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public static void method2320(int arg0) {
        field5480 = null;
        field5477 = null;
        field5473 = null;
        field5481 = null;
        if (arg0 != 0) {
            method2320(-30);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)Lmha;")
    public final class419 method112(byte arg0) {
        field5472++;
        return arg0 == 62 ? class565.field7433 : null;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
    public static final void method2321(int arg0) {
        class526.field6973 = null;
        class45.field585 = null;
        class194.field2930 = null;
        class735.field10160 = -1;
        class681.field9513 = null;
        class410.field5681 = -1;
        if (arg0 != 0) {
            return;
        }
        class177.field2666 = -1;
        class156.field2382 = null;
        class304.field4330 = -1;
        field5476++;
        class550.field7256 = null;
        class577.field7567 = null;
        class273.field3803.method3876(28);
    }
}
