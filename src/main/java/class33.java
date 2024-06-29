import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class33 {

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Leh;")
    public static class47 field632 = class195.method1282((byte) -4, "Passwort: ");

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Leh;")
    public static class47 field634 = class195.method1282((byte) -4, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Leh;")
    public static class47 field633 = class195.method1282((byte) -4, "mapfunction");

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Leh;")
    public static class47 field636 = class195.method1282((byte) -4, "0(U");

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public int field630;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public int field631;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public int field637;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public int field638;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public int field642;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public int field643;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "[B")
    public byte[] field640;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "[B")
    public byte[] field644;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "[I")
    public static int[] field645;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method285(int arg0) {
        field633 = null;
        field634 = null;
        field645 = null;
        field636 = null;
        if (arg0 != 952081) {
            method285(-64);
        }
        field632 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)I")
    public static final int method286(int arg0, boolean arg1) {
        if (!arg1) {
            field645 = null;
        }
        field647++;
        return arg0 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILvd;)V")
    public static final void method287(int arg0, class193 arg1) {
        class110.field2288 = arg1;
        if (arg0 != -500) {
            method287(88, null);
        }
        field646++;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static final void method288(int arg0) {
        int var1 = class44.field891 + class123.field2489.field3291;
        if (class90.field1892[96]) {
            class167.field3264 += (-class167.field3264 - 24) / 2;
        } else if (class90.field1892[97]) {
            class167.field3264 += (24 - class167.field3264) / 2;
        } else {
            class167.field3264 /= 2;
        }
        if (class90.field1892[98]) {
            class103.field2161 += (12 - class103.field2161) / 2;
        } else if (class90.field1892[99]) {
            class103.field2161 += (-class103.field2161 - 12) / 2;
        } else {
            class103.field2161 /= 2;
        }
        class160.field3116 = class167.field3264 / 2 + class160.field3116 & 0x7FF;
        field641++;
        class146.field2854 += class103.field2161 / 2;
        int var2 = class35.field687 + class123.field2489.field3281;
        if (class100.field2103 - var1 < -500 || class100.field2103 - var1 > 500 || class94.field1947 - var2 < -500 || class94.field1947 - var2 > 500) {
            class100.field2103 = var1;
            class94.field1947 = var2;
        }
        if (class100.field2103 != var1) {
            class100.field2103 += (var1 - class100.field2103) / 16;
        }
        if (class94.field1947 != var2) {
            class94.field1947 += (var2 - class94.field1947) / 16;
        }
        int var3 = class94.field1947 >> 7;
        if (class146.field2854 < 128) {
            class146.field2854 = 128;
        }
        int var4 = 0;
        int var5 = class100.field2103 >> 7;
        if (class146.field2854 > 383) {
            class146.field2854 = 383;
        }
        int var6 = class39.method335(class100.field2103, class196.field3827, class94.field1947, arg0 + 10207);
        if (arg0 != 10689) {
            method287(-125, null);
        }
        if (var5 > 3 && var3 > 3 && var5 < 100 && var3 < 100) {
            for (int var7 = var5 - 4; var7 <= var5 + 4; var7++) {
                for (int var8 = var3 - 4; var8 <= var3 + 4; var8++) {
                    int var9 = class196.field3827;
                    if (var9 < 3 && (class182.field3490[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class103.field2171[var9][var7][var8];
                    if (var4 < var10) {
                        var4 = var10;
                    }
                }
            }
        }
        int var11 = var4 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class88.field1877 < var11) {
            class88.field1877 += (var11 - class88.field1877) / 24;
        } else if (var11 < class88.field1877) {
            class88.field1877 += (var11 - class88.field1877) / 80;
        }
    }
}
