import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!v")
public class class37 extends RuntimeException {

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field503;

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "Ljava/lang/String;")
    public String field502;

    @OriginalMember(owner = "mapview!v", name = "e", descriptor = "Lr;")
    public static class33 field504 = class29.method192("Enter place name to find", (byte) 126);

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "J")
    public static long field501;

    @OriginalMember(owner = "mapview!v", name = "f", descriptor = "Lba;")
    public static class4 field505;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "[Lda;")
    public static class8[] field500;

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(I)I", line = 13)
    public static final int method248(int arg0) {
        if (arg0 != -16167) {
            field501 = -23L;
        }
        if (class25.field267 == null) {
            return 0;
        } else if (class25.field267.field481 == null) {
            return class25.field273[class25.field267.field480 & 0xFF];
        } else {
            return class25.field273[class25.field267.field481[class26.field396] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "([BI)V", line = 35)
    private static final void method249(byte[] arg0, int arg1) {
        class20 var2 = new class20(arg0);
        var2.field206 = arg0.length - 2;
        class35.field477 = var2.method129(arg1 ^ 0x3);
        class25.field272 = new int[class35.field477];
        class22.field230 = new int[class35.field477];
        class21.field219 = new int[class35.field477];
        class36.field494 = new int[class35.field477];
        class32.field448 = new byte[class35.field477][];
        var2.field206 = arg0.length - class35.field477 * 8 - 7;
        class22.field238 = var2.method129(2);
        class13.field165 = var2.method129(2);
        int var3 = arg1 + (var2.method133(23789) & 0xFF);
        for (int var4 = 0; var4 < class35.field477; var4++) {
            class25.field272[var4] = var2.method129(2);
        }
        for (int var5 = 0; var5 < class35.field477; var5++) {
            class36.field494[var5] = var2.method129(2);
        }
        for (int var6 = 0; var6 < class35.field477; var6++) {
            class21.field219[var6] = var2.method129(2);
        }
        for (int var7 = 0; var7 < class35.field477; var7++) {
            class22.field230[var7] = var2.method129(2);
        }
        var2.field206 = arg0.length - (var3 - 1) * 3 - class35.field477 * 8 - 7;
        class11.field146 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class11.field146[var8] = var2.method127((byte) -89);
            if (class11.field146[var8] == 0) {
                class11.field146[var8] = 1;
            }
        }
        var2.field206 = 0;
        for (int var9 = 0; var9 < class35.field477; var9++) {
            int var10 = class21.field219[var9];
            int var11 = class22.field230[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class32.field448[var9] = var13;
            int var14 = var2.method133(arg1 + 23788);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method124(class8.method49(arg1, 110));
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var10 * var16 + var15] = var2.method124(-83);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V", line = 162)
    public static final void method250(int arg0, Throwable arg1, String arg2) {
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class10.method58(-9479, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', (char) arg0);
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class17.field187.field28 == null) {
                return;
            }
            class27 var8 = class17.field187.method20(new URL(class17.field187.field28.getCodeBase(), "clienterror.ws?c=" + class8.field116 + "&u=" + class14.field172 + "&v1=" + class3.field19 + "&v2=" + class3.field20 + "&e=" + var7), false);
            while (var8.field413 == 0) {
                class35.method240(false, 1L);
            }
            if (var8.field413 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field408;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "mapview!v", name = "b", descriptor = "(I)V", line = 209)
    public static void method251(int arg0) {
        field504 = null;
        field500 = null;
        field505 = null;
        if (arg0 != 9053) {
            field505 = null;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(IILc;I)Z", line = 228)
    public static final boolean method252(int arg0, int arg1, class5 arg2, int arg3) {
        if (arg1 != -2) {
            method249(null, 78);
        }
        byte[] var4 = arg2.method28(arg0, arg1 ^ 0x1, arg3);
        if (var4 == null) {
            return false;
        } else {
            method249(var4, arg1 + 3);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!v", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 241)
    public class37(Throwable arg0, String arg1) {
        this.field503 = arg0;
        this.field502 = arg1;
    }
}
