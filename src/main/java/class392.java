import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public abstract class class392 {

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "Lbk;")
    public static class211 field5730 = new class211(new byte[5000]);

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field5734 = 0;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "[I")
    public static int[] field5737 = new int[128];

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "F")
    public static float field5736;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public int field5728;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public int field5732;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "Lra;")
    public static class57 field5735;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "[I")
    public int[] field5731;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljf;I)Ljf;")
    public static final class119 method2496(class119 arg0, int arg1) {
        field5729++;
        if (arg0.field1529 != -1) {
            return class179.method1170(arg0.field1529, arg1 ^ 0x30C20B2F);
        }
        if (arg1 != 23263) {
            method2499((String) null, true, (byte) -70);
        }
        int var2 = arg0.field1424 >>> 16;
        class221 var3 = new class221(class396.field5783);
        for (class201 var4 = (class201) var3.method1438(47); var4 != null; var4 = (class201) var3.method1439((byte) -1)) {
            if (var4.field2776 == var2) {
                return class179.method1170((int) var4.field5248, 818041328);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static void method2497(int arg0) {
        field5737 = null;
        field5735 = null;
        if (arg0 >= 13) {
            field5730 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Lqd;")
    public static final class260 method2498(int arg0, int arg1) {
        field5733++;
        class331 var2 = class42.field512;
        class260 var3;
        synchronized (class42.field512) {
            var3 = (class260) class42.field512.method2049(-109, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class92.field1016.method361(class219.method1433(arg0, 16), 63, class78.method439(255, arg0));
        class260 var5 = new class260();
        var5.field3519 = arg0;
        if (var4 != null) {
            var5.method1639(new class211(var4), 35);
        }
        if (arg1 >= -101) {
            field5735 = null;
        }
        var5.method1632(0);
        if (var5.field3570 != -1) {
            var5.method1634(method2498(var5.field3570, -128), -1, method2498(var5.field3521, -127));
        }
        if (var5.field3542 != -1) {
            var5.method1638(false, method2498(var5.field3540, -116), method2498(var5.field3542, -112));
        }
        if (!class112.field1295 && var5.field3592) {
            var5.field3582 = 0;
            var5.field3593 = class191.field2613;
            var5.field3534 = false;
            var5.field3569 = null;
            var5.field3532 = class423.field6074;
            var5.field3527 = class171.field2399;
        }
        class331 var6 = class42.field512;
        synchronized (class42.field512) {
            class42.field512.method2046((long) arg0, 0, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
    public static final void method2499(String arg0, boolean arg1, byte arg2) {
        class362.field5273.field665 = 1;
        field5725++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        if (arg2 > -107) {
            method2501(123, (byte) 0);
        }
        for (int var6 = 0; var6 < class350.field5116; var6++) {
            class260 var9 = method2498(var6, -112);
            if ((!arg1 || var9.field3534) && var9.field3570 == -1 && var9.field3542 == -1 && var9.field3589 == 0 && var9.field3527.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class201.field2773 = -1;
                    class51.field592 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class231.field3127 = 0;
        class201.field2773 = var5;
        class51.field592 = var4;
        String[] var7 = new String[class201.field2773];
        for (int var8 = 0; var8 < class201.field2773; var8++) {
            var7[var8] = method2498(var4[var8], -108).field3527;
        }
        class117.method655(class51.field592, var7, -72);
        class362.field5273.method338(-73);
        class362.field5273.field665 = 2;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public abstract void method1958(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)Z")
    public static final boolean method2500(int arg0, int arg1) {
        int var2 = 89 % ((arg0 - 73) / 41);
        field5724++;
        if (arg1 == 26 || arg1 == 34 || arg1 == 22 || arg1 == 49 || arg1 == 44 || arg1 == 41 || arg1 == 47 || arg1 == 60) {
            return true;
        } else if (arg1 == 48 || arg1 == 5 || arg1 == 1012 || arg1 == 1004) {
            return true;
        } else if (arg1 == 23 || arg1 == 2 || arg1 == 19 || arg1 == 11 || arg1 == 57) {
            return true;
        } else {
            return arg1 == 29 || arg1 == 8 || arg1 == 28 || arg1 == 30 || arg1 == 37 || arg1 == 20;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public abstract void method1960(Canvas arg0, byte arg1);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)C")
    public static final char method2501(int arg0, byte arg1) {
        field5727++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (arg0 != 21802) {
            field5738 = 91;
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class330.field4713[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
    public abstract void method1959(Graphics arg0, int arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(CI)Z")
    public static final boolean method2502(char arg0, int arg1) {
        if (arg1 <= 47) {
            method2499((String) null, false, (byte) 85);
        }
        field5726++;
        return arg0 >= '0' && arg0 <= '9';
    }
}
