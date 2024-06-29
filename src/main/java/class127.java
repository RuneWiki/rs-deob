import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class127 {

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "[J")
    public static long[] field1764;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "Ljava/util/Random;")
    public static Random field1765;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "F")
    public static float field1767;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "[I")
    public static int[] field1762;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IC)Z")
    public static final boolean method767(int arg0, char arg1) {
        field1761++;
        if (arg0 <= 105) {
            field1766 = 94;
        }
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;ZBI)I")
    public static final int method768(String arg0, boolean arg1, byte arg2, int arg3) {
        field1763++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        if (arg2 != 59) {
            field1766 = -70;
        }
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg3 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if (var10 / arg3 != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static final void method769(int arg0) {
        field1760++;
        if (class439.field6276 != null) {
            class439.field6276.method1364((byte) -49);
        }
        if (class153.field2271 != null) {
            class153.field2271.method1364((byte) -71);
        }
        if (arg0 != 0) {
            field1766 = 43;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIII)V")
    public static final void method770(int arg0, int arg1, int arg2, int arg3) {
        field1759++;
        class276 var4 = class264.method1816((byte) -106, arg2, arg0);
        var4.method1876((byte) -117);
        var4.field3986 = arg3;
        var4.field3984 = arg1;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    public static void method771(int arg0) {
        if (arg0 != 57) {
            method768((String) null, true, (byte) -37, -52);
        }
        field1762 = null;
        field1764 = null;
        field1765 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZ)V")
    public static final void method772(int arg0, int arg1, boolean arg2) {
        field1758++;
        int var3 = 39 / ((arg0 - 10) / 42);
        class101 var4 = class438.method2729(arg2, arg1, true);
        if (var4 != null) {
            var4.method2660((byte) 125);
        }
    }

    static {
        new class349("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field1764 = new long[100];
        field1766 = 0;
        field1765 = new Random();
    }
}
