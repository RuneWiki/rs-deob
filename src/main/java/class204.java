import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class204 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    private int field3177 = -1;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    private int field3188 = 0;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3187 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "Loh;")
    public static class281 field3185 = new class281(64);

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field3193 = 0;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public int field3180;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public int field3183;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public int field3190;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public int field3191;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1373(int arg0, Throwable arg1) throws IOException {
        field3192++;
        String var2;
        if ((arg1 instanceof class181)) {
            class181 var3 = (class181) arg1;
            arg1 = var3.field2821;
            var2 = var3.field2823 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg0 != 1) {
            method1378((byte) 1, 47);
        }
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLhc;)V")
    public static final void method1374(byte arg0, class235 arg1) {
        class30.field422 = class142.method954(class98.field1649, arg0 ^ 0xFFFFFFAE, arg1);
        class139.field2130 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) ((class238.field3857[var2] & 0xFF0000) >> 16);
            int var5 = (class238.field3857[var2 + 1] & 0xFF0000) >> 16;
            float var6 = (float) (class238.field3857[var2] >> 8 & 0xFF);
            float var7 = ((float) var5 - var4) / 64.0F;
            int var8 = class238.field3857[var2 + 1] >> 8 & 0xFF;
            float var9 = ((float) var8 - var6) / 64.0F;
            float var10 = (float) (class238.field3857[var2] & 0xFF);
            int var11 = class238.field3857[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var10) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class139.field2130[var2 * 64 + var13] = class45.method330(class45.method330((int) var4 << 16, (int) var6 << 8), (int) var10);
                var6 += var9;
                var10 += var12;
                var4 += var7;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class139.field2130[var3] = class238.field3857[3];
        }
        field3189++;
        if (arg0 != -82) {
            method1377((class235) null, (class235) null, -97);
        }
        class89.field1557 = new int[32768];
        class257.field4114 = new int[32768];
        class271.method1835((class290) null, true);
        class288.field4570 = new int[32768];
        class33.field502 = new int[32768];
        class31.field457 = new class276(128, 254);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static void method1375(byte arg0) {
        field3185 = null;
        if (arg0 == 83) {
            field3187 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)V")
    private final void method1376(int arg0, int arg1) {
        double var3 = (double) ((arg1 & 0xFF11C6) >> 16) / 256.0D;
        double var5 = (double) ((arg1 & 0xFFD8) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        field3181++;
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var5 > var3) {
            var11 = var5;
        }
        if (arg0 > -5) {
            this.method1379((class88) null, 1, -21, -50);
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var13 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var15 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var15 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var15 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        double var19 = var15 / 6.0D;
        this.field3183 = (int) (var17 * 256.0D);
        this.field3191 = (int) (var13 * 256.0D);
        if (this.field3183 < 0) {
            this.field3183 = 0;
        } else if (this.field3183 > 255) {
            this.field3183 = 255;
        }
        if (var17 > 0.5D) {
            this.field3190 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field3190 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field3191 < 0) {
            this.field3191 = 0;
        } else if (this.field3191 > 255) {
            this.field3191 = 255;
        }
        if (this.field3190 < 1) {
            this.field3190 = 1;
        }
        this.field3180 = (int) ((double) this.field3190 * var19);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lhc;Lhc;I)V")
    public static final void method1377(class235 arg0, class235 arg1, int arg2) {
        field3186++;
        class45.field643 = arg1;
        class5.field46 = arg0;
        int var3 = 76 / ((-arg2 - 79) / 36);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)V")
    public static final void method1378(byte arg0, int arg1) {
        class244.field3966.method1897(true, arg1);
        class235.field3773.method1897(true, arg1);
        if (arg0 != -74) {
            method1378((byte) -70, 43);
        }
        field3179++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lai;III)V")
    private final void method1379(class88 arg0, int arg1, int arg2, int arg3) {
        field3178++;
        if (arg3 != -4934) {
            method1374((byte) -25, (class235) null);
        }
        if (arg2 == 1) {
            this.field3188 = arg0.method671(125);
            this.method1376(-33, this.field3188);
        } else if (arg2 == 2) {
            this.field3177 = arg0.method645(11596);
            if (this.field3177 == 65535) {
                this.field3177 = -1;
                return;
            }
        } else if (arg2 == 3) {
            arg0.method645(11596);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lai;II)V")
    public final void method1380(class88 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method633(98);
            if (var4 == 0) {
                field3184++;
                if (arg1 != -2) {
                    this.field3183 = -48;
                    return;
                }
                return;
            }
            this.method1379(arg0, arg2, var4, -4934);
        }
    }
}
