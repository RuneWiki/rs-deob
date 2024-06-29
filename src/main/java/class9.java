import java.awt.Canvas;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!e")
public class class9 {

    @OriginalMember(owner = "mapview!e", name = "n", descriptor = "[I")
    private int[] field93;

    @OriginalMember(owner = "mapview!e", name = "c", descriptor = "Ls;")
    public static class34 field82 = method35("Mini)2Game", 220);

    @OriginalMember(owner = "mapview!e", name = "d", descriptor = "[J")
    private static long[] field83 = new long[256];

    @OriginalMember(owner = "mapview!e", name = "h", descriptor = "Z")
    public static volatile boolean field87;

    @OriginalMember(owner = "mapview!e", name = "f", descriptor = "I")
    public static volatile int field85;

    @OriginalMember(owner = "mapview!e", name = "k", descriptor = "Ls;")
    public static class34 field90;

    @OriginalMember(owner = "mapview!e", name = "j", descriptor = "Z")
    public static boolean field89;

    @OriginalMember(owner = "mapview!e", name = "m", descriptor = "Ls;")
    public static class34 field92;

    @OriginalMember(owner = "mapview!e", name = "q", descriptor = "Ls;")
    public static class34 field96;

    @OriginalMember(owner = "mapview!e", name = "i", descriptor = "Ls;")
    public static class34 field88;

    @OriginalMember(owner = "mapview!e", name = "p", descriptor = "Ls;")
    public static class34 field95;

    @OriginalMember(owner = "mapview!e", name = "o", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "mapview!e", name = "g", descriptor = "La;")
    public static class1 field86;

    @OriginalMember(owner = "mapview!e", name = "e", descriptor = "Ln;")
    public static class26 field84;

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "Lca;")
    public static class6 field81;

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field80;

    @OriginalMember(owner = "mapview!e", name = "l", descriptor = "[[B")
    public static byte[][] field91;

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(B)V", line = 15)
    public static void method33(byte arg0) {
        field95 = null;
        field86 = null;
        field92 = null;
        field84 = null;
        field91 = null;
        field90 = null;
        field80 = null;
        field81 = null;
        field82 = null;
        field88 = null;
        field83 = null;
        if (arg0 != -39) {
            field94 = 81;
        }
        field96 = null;
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(BI)I", line = 45)
    public final int method34(byte arg0, int arg1) {
        if (arg0 != -120) {
            return -26;
        }
        int var3 = (this.field93.length >> 1) - 1;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field93[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field93[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field83[var0] = var1;
        }
        field87 = false;
        field85 = 0;
        field90 = method35("fonts", 220);
        field89 = false;
        field92 = method35("Kebab Seller", 220);
        field96 = method35("Hunter Store", 220);
        field88 = method35("Requesting", 220);
        field95 = method35("Fishing Shop", 220);
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(Ljava/lang/String;I)Ls;", line = 77)
    public static final class34 method35(String arg0, int arg1) {
        if (arg1 != 220) {
            method35(null, -10);
        }
        byte[] var2 = arg0.getBytes();
        int var3 = 0;
        int var4 = var2.length;
        class34 var5 = new class34();
        var5.field475 = new byte[var4];
        while (var3 < var4) {
            int var6 = var2[var3++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 >= var4) {
                    break;
                }
                int var7 = var2[var3++] & 0xFF;
                var5.field475[var5.field478++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field475[var5.field478++] = (byte) var6;
            }
        }
        var5.method233((byte) -95);
        return var5.method225((byte) -38);
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(ZLjava/lang/Throwable;Ljava/lang/String;)V", line = 122)
    public static final void method36(boolean arg0, Throwable arg1, String arg2) {
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class12.method52((byte) -127, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            if (!arg0) {
                method35(null, -17);
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class6.field46.field459 == null) {
                return;
            }
            class2 var8 = class6.field46.method217(new URL(class6.field46.field459.getCodeBase(), "clienterror.ws?c=" + class39.field533 + "&u=" + class24.field234 + "&v1=" + class32.field463 + "&v2=" + class32.field454 + "&e=" + var7), (byte) -19);
            while (var8.field20 == 0) {
                class26.method164(1L, (byte) 2);
            }
            if (var8.field20 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field23;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "(B)V", line = 170)
    public static final void method37(byte arg0) {
        if (class32.field463.toLowerCase().indexOf("microsoft") == -1) {
            class8.field79[59] = 57;
            class8.field79[44] = 71;
            class8.field79[45] = 26;
            class8.field79[46] = 72;
            class8.field79[61] = 27;
            class8.field79[47] = 73;
            class8.field79[92] = 74;
            class8.field79[91] = 42;
            if (class32.field455 == null) {
                class8.field79[192] = 58;
                class8.field79[222] = 59;
            } else {
                class8.field79[520] = 59;
                class8.field79[192] = 28;
                class8.field79[222] = 58;
            }
            class8.field79[93] = 43;
        } else {
            class8.field79[221] = 43;
            class8.field79[188] = 71;
            class8.field79[222] = 59;
            class8.field79[220] = 74;
            class8.field79[192] = 58;
            class8.field79[191] = 73;
            class8.field79[186] = 57;
            class8.field79[187] = 27;
            class8.field79[189] = 26;
            class8.field79[219] = 42;
            class8.field79[190] = 72;
            class8.field79[223] = 28;
        }
        if (arg0 <= 107) {
            field81 = null;
        }
    }

    @OriginalMember(owner = "mapview!e", name = "<init>", descriptor = "([I)V", line = 268)
    public class9(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field93 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field93[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field93[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field93[var5 + var5] = arg0[var4];
            this.field93[var5 + var5 + 1] = var4++;
        }
    }
}
