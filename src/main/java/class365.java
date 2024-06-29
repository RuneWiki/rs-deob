import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class365 {

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "J")
    public static long field4859 = 0L;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!tb", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field4856++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I", line = 15)
    public static final int method2110(String arg0, int arg1, int arg2, String arg3) {
        field4858++;
        int var4 = arg0.length();
        int var5 = arg3.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while ((var6 - var8) < var4 || var5 > var7 - var9) {
            if (var6 - var8 >= var4) {
                return -1;
            }
            if (var5 <= (var7 - var9)) {
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
            var8 = class671.method3787((byte) -77, var22);
            var9 = class671.method3787((byte) -77, var24);
            char var26 = class414.method2403(var22, arg2, 99);
            char var27 = class414.method2403(var24, arg2, 99);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class174.method1225(var28, arg2, (byte) -123) - class174.method1225(var29, arg2, (byte) -102);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var5 - (var11 + 1);
                var17 = var4 - var11 - 1;
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
                    return class174.method1225(var20, arg2, (byte) -71) - class174.method1225(var21, arg2, (byte) -89);
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
                return class174.method1225(var14, arg2, (byte) -113) - class174.method1225(var15, arg2, (byte) -63);
            }
        }
        if (arg1 == -12017) {
            return 0;
        } else {
            return -45;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V", line = 142)
    public static final void method2111(byte arg0) {
        class12.field122 = false;
        class91.field1307 = new int[class107.field1493][class335.field4511 + 1][class643.field8878 + 1];
        if (arg0 != 72) {
            field4860 = -55;
        }
        class103.field1453 = class631.field8750;
        class547.field7414 = 0;
        class184.field2659 = new class209[1000];
        class325.field4430 = 0;
        field4857++;
        class111.field1542 = 0;
        class276.field3817 = class631.field8750;
        class598.field8361 = new class209[2000];
        class631.field8755 = 0;
        class9.field72 = new class209[500];
        class63.field713 = new class209[500];
        if ((class401.field5619 instanceof class18)) {
            class539.field7280 = false;
        } else {
            class539.field7280 = true;
        }
    }
}
