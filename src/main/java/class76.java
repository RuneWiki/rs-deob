import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class76 extends class201 {

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "Ljd;")
    public static class85 field1405 = class221.method1499(":assist:", (byte) 108);

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "Ljd;")
    public static class85 field1403 = class221.method1499("Bitte warten Sie)3)3)3", (byte) 96);

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "Ljd;")
    public static class85 field1404 = class221.method1499(" )2> <col=ff9040>", (byte) -57);

    @OriginalMember(owner = "client!ph", name = "Z", descriptor = "Ljd;")
    public static class85 field1419 = class221.method1499("settings=", (byte) 88);

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ph", name = "R", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "I")
    public int field1412;

    @OriginalMember(owner = "client!ph", name = "T", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!ph", name = "U", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ph", name = "X", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!ph", name = "Y", descriptor = "I")
    public int field1418;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "Ljd;")
    public class85 field1402;

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "[I")
    public int[] field1407;

    @OriginalMember(owner = "client!ph", name = "W", descriptor = "[I")
    public int[] field1416;

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "[Lfg;")
    public static class12[] field1406;

    @OriginalMember(owner = "client!ph", name = "P", descriptor = "[Lpa;")
    public class204[] field1409;

    @OriginalMember(owner = "client!ph", name = "O", descriptor = "[Ljd;")
    public class85[] field1408;

    @OriginalMember(owner = "client!ph", name = "V", descriptor = "[[[I")
    public static int[][][] field1415;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public static void method532(byte arg0) {
        field1419 = null;
        field1415 = null;
        field1406 = null;
        field1403 = null;
        if (arg0 == -22) {
            field1405 = null;
            field1404 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)V")
    public static final void method533(int arg0) {
        field1417++;
        if (class247.field4223 != null) {
            class247.field4223.method264((byte) 109);
        }
        if (class24.field346 != null) {
            class24.field346.method264((byte) 109);
        }
        class172.method1152(class95.field1743, 2, 22050, 106);
        if (arg0 > 14) {
            class247.field4223 = class216.method1479(0, class254.field4389, class107.field1882, (byte) -34, 22050);
            class247.field4223.method265(-128, class213.field3746);
            class24.field346 = class216.method1479(1, class254.field4389, class107.field1882, (byte) -34, 2048);
            class24.field346.method265(-128, class247.field4249);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIII)V")
    public static final void method534(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1414++;
        int var7 = arg1 + arg3;
        int var8 = arg0 - arg3;
        int var9 = arg3 + arg6;
        int var10 = arg2 - arg3;
        for (int var11 = arg1; var11 < var7; var11++) {
            class183.method1260(arg5, arg6, -105, class146.field2488[var11], arg2);
        }
        for (int var12 = arg0; var12 > var8; var12--) {
            class183.method1260(arg5, arg6, arg4 + 1405, class146.field2488[var12], arg2);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class146.field2488[var13];
            class183.method1260(arg5, arg6, 90, var14, var9);
            class183.method1260(arg5, var10, arg4 ^ 0x589, var14, arg2);
        }
        if (arg4 != -1419) {
            method535(78, 89, 87);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)Lme;")
    public static final class213 method535(int arg0, int arg1, int arg2) {
        class208 var3 = class99.field1780[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3646; var4++) {
            class213 var5 = var3.field3650[var4];
            if ((var5.field3728 >> 29 & 0x3L) == 2L && var5.field3731 == arg1 && var5.field3729 == arg2) {
                return var5;
            }
        }
        return null;
    }
}
