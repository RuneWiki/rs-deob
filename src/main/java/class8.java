import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public abstract class class8 {

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)Z")
    public abstract boolean method52(byte arg0);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)I")
    public static final int method53(int arg0, String arg1, byte arg2, String arg3) {
        field99++;
        int var4 = arg1.length();
        int var5 = arg3.length();
        int var6 = 0;
        int var7 = 0;
        if (arg2 != -109) {
            method53(-18, null, (byte) -76, null);
        }
        char var8 = 0;
        char var9 = 0;
        while ((var6 - var8) < var4 || var5 > var7 - var9) {
            if ((var6 - var8) >= var4) {
                return -1;
            }
            if (var7 - var9 >= var5) {
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
                var24 = arg3.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class5.method33(var22, 69);
            var9 = class5.method33(var24, 69);
            char var26 = class409.method2397(arg0, -93, var22);
            char var27 = class409.method2397(arg0, arg2 ^ 0x1D, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class81.method628(16640, var28, arg0) - class81.method628(16640, var29, arg0);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg0 == 2) {
                var17 = var4 - var11 - 1;
                var16 = var5 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg1.charAt(var17);
            char var19 = arg3.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class81.method628(arg2 + 16749, var20, arg0) - class81.method628(arg2 + 16749, var21, arg0);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg1.charAt(var13);
            char var15 = arg3.charAt(var13);
            if (var14 != var15) {
                return class81.method628(16640, var14, arg0) - class81.method628(arg2 + 16749, var15, arg0);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public abstract void method54(int arg0);

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)I")
    public abstract int method55(byte arg0);

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)Lja;")
    public static final class221 method56(int arg0) {
        if (arg0 > -77) {
            return null;
        }
        field101++;
        class221 var1 = (class221) class33.field509.method2596(true);
        if (var1 == null) {
            return new class221();
        } else {
            class365.field5240--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)Z")
    public abstract boolean method57(int arg0);

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)Z")
    public abstract boolean method58(int arg0);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)Ldw;")
    public abstract class97 method59(boolean arg0);

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)Z")
    public final boolean method60(byte arg0) {
        if (arg0 == -78) {
            field100++;
            return this.method52((byte) 113) || this.method57(0) || this.method58(-127);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V")
    public abstract void method61(int arg0);

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(B)I")
    public abstract int method62(byte arg0);
}
