import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class327 extends OutputStream {

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "Z")
    public static boolean field4742 = false;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "[B")
    public static byte[] field4739 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "[I")
    public static int[] field4746 = new int[] { 0, 0, 0, 0, -1, 1, 3, 0, 0, 0, 0, 0, -2, 4, 7, 0, 0, 0, 5, 0, 2, 0, 0, -2, 8, -1, 0, 10, 0, 0, 0, 12, 0, 0, 0, 3, 0, 0, 8, -1, 0, 0, 0, 6, 0, 0, 0, 0, 0, 8, -1, 0, 0, 0, 0, 6, 2, 0, 0, 6, 8, 6, 3, 0, 8, 28, -2, 14, -1, -1, 8, 1, 12, 5, 0, 0, 0, 5, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 11, 8, 0, 0, 0, -1, 6, 0, 14, 0, 9, 0, 0, 1, 0, 0, -2, 3, 3, -1, 0, -1, 12, 2, 0, 12, 0, -1, 0, -1, 8, 0, 0, 6, 0, 0, 6, 0, 0, 0, 0, 0, 7, 0, 0, 0, 4, -1, 0, 0, 0, -1, 0, 0, 0, 0, 7, 0, 2, 0, -2, -1, 0, 0, 0, 0, 0, 7, 8, 0, 0, 0, 5, 0, 0, 0, 0, 4, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 1, 17, 0, 0, 0, 0, 0, 0, 0, 8, -1, 2, 6, 0, -2, -2, 0, 6, 0, -1, 0, -1, 10, 0, 0, 6, 0, 0, -2, 20, 10, 2, 6, 0, 0, 0, 0, 0, 15, 0, -2, 0, -1, 0, 0, -2, 0, 3, -2, 15, 0, 1, 0, 0, 0, 12, -2, 0, 0, 0, 8, 3, 0, 6, 0, 10, 0, 0, 0, 0, 2, 0, 3, 0, 0, 0, 0, 0, 0, 3 };

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "[I")
    public static int[] field4744 = new int[2];

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "Lbr;")
    public static class223 field4749;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "Ltj;")
    public static class108 field4745;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
    public static void method2147(byte arg0) {
        field4744 = null;
        field4745 = null;
        field4739 = null;
        if (arg0 <= -12) {
            field4749 = null;
            field4746 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)I")
    public static final int method2148(int arg0, byte arg1) {
        field4743++;
        if (arg1 >= -55) {
            method2147((byte) -71);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)I")
    public static final int method2149(String arg0, byte arg1, String arg2, int arg3) {
        field4740++;
        int var4 = arg2.length();
        int var5 = arg0.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var6 - var8) || var5 > var7 - var9) {
            if (var6 - var8 >= var4) {
                return -1;
            }
            if (var7 - var9 >= var5) {
                return 1;
            }
            char var23;
            if (var8 == '\u0000') {
                var23 = arg2.charAt(var6++);
            } else {
                var23 = var8;
                boolean var24 = false;
            }
            char var25;
            if (var9 == '\u0000') {
                var25 = arg0.charAt(var7++);
            } else {
                var25 = var9;
                boolean var26 = false;
            }
            var8 = class392.method2470(var23, 0);
            var9 = class392.method2470(var25, 0);
            char var27 = class178.method1279(arg3, var23, -112);
            char var28 = class178.method1279(arg3, var25, -95);
            if (var27 != var28 && Character.toUpperCase(var27) != Character.toUpperCase(var28)) {
                char var29 = Character.toLowerCase(var27);
                char var30 = Character.toLowerCase(var28);
                if (var29 != var30) {
                    return class106.method620(arg3, var29, (byte) 79) - class106.method620(arg3, var30, (byte) 79);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        int var11 = 49 / ((arg1 - 55) / 32);
        for (int var12 = 0; var12 < var10; var12++) {
            int var17;
            int var18;
            if (arg3 == 2) {
                var17 = var4 - var12 - 1;
                var18 = var5 - var12 - 1;
            } else {
                var18 = var12;
                var17 = var12;
            }
            char var19 = arg2.charAt(var17);
            char var20 = arg0.charAt(var18);
            if (var19 != var20 && Character.toUpperCase(var19) != Character.toUpperCase(var20)) {
                char var21 = Character.toLowerCase(var19);
                char var22 = Character.toLowerCase(var20);
                if (var21 != var22) {
                    return class106.method620(arg3, var21, (byte) 79) - class106.method620(arg3, var22, (byte) 79);
                }
            }
        }
        int var13 = var4 - var5;
        if (var13 != 0) {
            return var13;
        }
        for (int var14 = 0; var14 < var10; var14++) {
            char var15 = arg2.charAt(var14);
            char var16 = arg0.charAt(var14);
            if (var15 != var16) {
                return class106.method620(arg3, var15, (byte) 79) - class106.method620(arg3, var16, (byte) 79);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!gh", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field4747++;
        throw new IOException();
    }

    static {
        new class349("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field4748 = 0;
        field4749 = null;
    }
}
