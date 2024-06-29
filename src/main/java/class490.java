import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class490 extends class261 {

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "S")
    public short field7188;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "Llb;")
    public static class383 field7190;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field7189;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field7191;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field7192;

    static {
        new class309("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field7190 = new class383("LOCAL", 4);
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V", line = 3)
    public class490() {
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;)I", line = 18)
    public static final int method2959(String arg0, int arg1, byte arg2, String arg3) {
        field7189++;
        int var4 = arg0.length();
        int var5 = arg3.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > var6 - var8 || var5 > (var7 - var9)) {
            if ((var6 - var8) >= var4) {
                return -1;
            }
            if (var7 - var9 >= var5) {
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
            var8 = class272.method1721(var22, -63);
            var9 = class272.method1721(var24, arg2 ^ 0xFFFFFF9D);
            char var26 = class204.method1395(var22, arg1, (byte) 89);
            char var27 = class204.method1395(var24, arg1, (byte) 89);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class290.method1883(arg2 + 66, arg1, var28) - class290.method1883(arg2 ^ 0xBE, arg1, var29);
                }
            }
        }
        if (arg2 != 62) {
            method2963(54);
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg1 == 2) {
                var16 = var5 - (var11 + 1);
                var17 = var4 - (var11 + 1);
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
                    return class290.method1883(128, arg1, var20) - class290.method1883(128, arg1, var21);
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
                return class290.method1883(128, arg1, var14) - class290.method1883(arg2 + 66, arg1, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(S)V", line = 139)
    public class490(short arg0) {
        this.field7188 = arg0;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)I", line = 147)
    public static int method2960(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBI)I", line = 154)
    public static final int method2961(int arg0, byte arg1, int arg2) {
        field7191++;
        if (arg2 == 1 || arg2 == 3) {
            return class520.field7564[arg0 & 0x3];
        } else {
            if (arg1 <= 88) {
                method2959(null, 37, (byte) -89, null);
            }
            return class192.field3100[arg0 & 0x3];
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIBLjc;I)V", line = 168)
    public static final void method2962(int arg0, int arg1, byte arg2, class306 arg3, int arg4) {
        field7192++;
        for (class358 var5 = (class358) class378.field5531.method1892(98); var5 != null; var5 = (class358) class378.field5531.method1893((byte) -2)) {
            if (var5.field5245 == arg0 && arg1 << 7 == var5.field5262 && arg4 << 7 == var5.field5267 && var5.field5252.field4626 == arg3.field4626) {
                if (var5.field5248 != null) {
                    class288.field4357.method2157(var5.field5248);
                    var5.field5248 = null;
                }
                if (var5.field5266 != null) {
                    class288.field4357.method2157(var5.field5266);
                    var5.field5266 = null;
                }
                var5.method1676(true);
                return;
            }
        }
        if (arg2 != -9) {
            field7190 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 207)
    public static void method2963(int arg0) {
        field7190 = null;
        if (arg0 != 0) {
            field7190 = null;
        }
    }
}
