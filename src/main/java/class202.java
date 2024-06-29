import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class202 extends class210 {

    @OriginalMember(owner = "client!td", name = "E", descriptor = "J")
    public static long field3597 = 0L;

    @OriginalMember(owner = "client!td", name = "F", descriptor = "Loc;")
    public static class151 field3598 = class137.method873(2, "headicons_prayer");

    @OriginalMember(owner = "client!td", name = "B", descriptor = "[B")
    public static byte[] field3595 = new byte[32896];

    @OriginalMember(owner = "client!td", name = "H", descriptor = "Z")
    public static boolean field3600;

    @OriginalMember(owner = "client!td", name = "L", descriptor = "Loc;")
    public static class151 field3604;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!td", name = "I", descriptor = "Lhf;")
    public static class82 field3601;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!td", name = "J", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!td", name = "G", descriptor = "Lsd;")
    public static class192 field3599;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(III)V")
    public static final void method1283(int arg0, int arg1, int arg2) {
        class72 var3 = class95.field1776[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field1419 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
    public static void method1284(int arg0) {
        field3598 = null;
        field3601 = null;
        field3604 = null;
        field3595 = null;
        field3599 = null;
        if (arg0 != 3469) {
            method1284(126);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIII)V")
    public static final void method1285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3596++;
        if (class169.field3089 == arg2 && class233.field4297 == arg5 && (class40.field817 == arg4 || !class13.field300)) {
            return;
        }
        class233.field4297 = arg5;
        class169.field3089 = arg2;
        class40.field817 = arg4;
        if (!class13.field300) {
            class40.field817 = 0;
        }
        class137.method871(25, (byte) 123);
        class192.method1207(class190.field3365, true, 255);
        if (arg1 >= -114) {
            field3597 = -65L;
        }
        int var6 = class64.field1255;
        class64.field1255 = (arg5 - 6) * 8;
        int var7 = class232.field4188;
        class232.field4188 = arg2 * 8 - 48;
        int var8 = class232.field4188 - var7;
        int var9 = class64.field1255 - var6;
        int var10 = class64.field1255;
        int var11 = class232.field4188;
        for (int var12 = 0; var12 < 32768; var12++) {
            class203 var28 = class122.field2190[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field3978[var29] -= var8;
                    var28.field4031[var29] -= var9;
                }
                var28.field3976 -= var8 * 128;
                var28.field4029 -= var9 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class20 var26 = class179.field3229[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field3978[var27] -= var8;
                    var26.field4031[var27] -= var9;
                }
                var26.field3976 -= var8 * 128;
                var26.field4029 -= var9 * 128;
            }
        }
        byte var14 = 0;
        byte var15 = 104;
        byte var16 = 1;
        byte var17 = 0;
        class234.field4325 = arg4;
        if (var8 < 0) {
            var14 = 103;
            var15 = -1;
            var16 = -1;
        }
        byte var18 = 104;
        class228.field3975.method1427(arg0, false, (byte) -123, arg3);
        byte var19 = 1;
        if (var9 < 0) {
            var17 = 103;
            var19 = -1;
            var18 = -1;
        }
        for (int var20 = var14; var20 != var15; var20 += var16) {
            for (int var22 = var17; var22 != var18; var22 += var19) {
                int var23 = var9 + var22;
                int var24 = var8 + var20;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
                        class29.field615[var25][var20][var22] = class29.field615[var25][var24][var23];
                    } else {
                        class29.field615[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class212 var21 = (class212) class180.field3257.method1358(-29726); var21 != null; var21 = (class212) class180.field3257.method1360(true)) {
            var21.field3713 -= var9;
            var21.field3728 -= var8;
            if (var21.field3728 < 0 || var21.field3713 < 0 || var21.field3728 >= 104 || var21.field3713 >= 104) {
                var21.method636(87);
            }
        }
        class58.field1165 = -1;
        if (class122.field2189 != 0) {
            class122.field2189 -= var8;
            class150.field2677 -= var9;
        }
        class89.field1622 = false;
        class182.field3299 = 0;
        class193.field3454.method1357(4);
        class90.field1649.method1357(4);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field3595[var0++] = (byte) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F)));
            }
        }
        field3600 = false;
        field3604 = class137.method873(2, "Keine Antwort vom Server)3");
        field3605 = 0;
        field3601 = new class82(0, 0);
    }
}
