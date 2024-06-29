import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class95 {

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Lja;")
    public static class61 field1503 = new class61();

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field1507 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Z")
    public static boolean field1512 = false;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field1513 = 0;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static void method684(int arg0) {
        field1507 = null;
        field1503 = null;
        if (arg0 != 256) {
            method684(-30);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILrg;IIIIIB)V")
    public static final void method685(int arg0, class248 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field1508++;
        int var8 = arg2 * arg2 + arg4 * arg4;
        if (arg6 < var8 || arg7 >= -65) {
            return;
        }
        int var9 = Math.min(arg1.field4016 / 2, arg1.field4057 / 2);
        if (var9 * var9 >= var8) {
            class188.method1325(arg3, class255.field4205[arg5], arg4, arg2, arg1, 155, arg0);
            return;
        }
        int var10 = (int) class114.field1742 + class278.field4540 & 0x7FF;
        int var11 = class136.field2191[var10];
        int var12 = class136.field2193[var10];
        int var13 = var12 * 256 / (class150.field2394 + 256);
        var9 -= 10;
        int var14 = var11 * 256 / (class150.field2394 + 256);
        int var15 = arg2 * var13 + arg4 * var14 >> 16;
        int var16 = arg4 * var13 - arg2 * var14 >> 16;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var9);
        int var20 = (int) (Math.cos(var17) * (double) var9);
        ((class67) class300.field4921[arg5]).method466(arg1.field4016 / 2 + var19 + arg3 - 10, -var20 + arg0 + -10 - -(arg1.field4057 / 2), 20, 20, 15, 15, var17, 256);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method686(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class268.field4333 * arg0 + class25.field455 * arg3 >> 16;
        int var6 = class268.field4333 * arg3 - class25.field455 * arg0 >> 16;
        int var7 = class281.field4575 * var6 + class270.field4354 * arg1 >> 16;
        int var8 = class281.field4575 * arg1 - class270.field4354 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class281.field4575 * var6 + class270.field4354 * arg2 >> 16;
        int var12 = class281.field4575 * arg2 - class270.field4354 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class79.field1277 && var13 < class79.field1277) {
            return false;
        } else if (var9 > class178.field2956 && var13 > class178.field2956) {
            return false;
        } else if (var10 < class261.field4262 && var14 < class261.field4262) {
            return false;
        } else {
            return var10 <= class87.field1365 || var14 <= class87.field1365;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public static final void method687(int arg0) {
        class164.field2690 = 0;
        class130.field2071 = 0;
        class35.field569 = 0;
        class46.field691 = false;
        class31.field531 = 0;
        if (arg0 != -14433) {
            field1504 = 64;
        }
        field1510++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
    public static final void method688(boolean arg0) {
        if (arg0) {
            field1504 = -78;
        }
        field1505++;
        if (class269.field4350) {
            return;
        }
        class269.field4350 = true;
        class8.field181 = true;
        if (class184.field3053) {
            class114.field1742 = (float) ((int) class114.field1742 + 191 & 0xFFFFFF80);
        } else {
            class271.field4364 += (24.0F - class271.field4364) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
    public static final void method689(int arg0, int arg1) {
        field1509++;
        int var2 = 88 / ((arg1 + 51) / 33);
        class45.field664.method1880(-73, arg0);
    }
}
