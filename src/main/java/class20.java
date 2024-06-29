import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class20 {

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Z")
    public static boolean field411 = false;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lmb;")
    public static class84 field410 = class79.method672(true, "mapfunction");

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Z")
    public static boolean field412 = false;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field416 = 0;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "[Lmb;")
    public static class84[] field420 = new class84[1000];

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "Lmb;")
    public static class84 field421 = class79.method672(true, "Fertigkeit)2");

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Lmb;")
    public static class84 field418 = class79.method672(true, "headicons_hint");

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "Lmb;")
    public static class84 field426 = class79.method672(true, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "Lmb;")
    private static class84 field428 = class79.method672(true, "Enter your username (V password)3");

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Lmb;")
    public static class84 field424 = class79.method672(true, "scrollen:");

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lmb;")
    public static class84 field414 = field428;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field427 = 0;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field429 = 0;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Ljd;")
    public static class66 field415;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Ljd;")
    public static class66 field425;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Z")
    public static boolean field417;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "[Lsc;")
    public static class121[] field413;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method130(int arg0) {
        field413 = null;
        field418 = null;
        field426 = null;
        field415 = null;
        field420 = null;
        field428 = null;
        field410 = null;
        field424 = null;
        field414 = null;
        field421 = null;
        if (arg0 > -107) {
            method131((byte) -53);
        }
        field425 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static final void method131(byte arg0) {
        field419++;
        int var1 = class108.field2611;
        int var2 = class52.field1184;
        int var3 = class123.field2960;
        int var4 = class91.field2276;
        int var5 = 6116423;
        class142.method1151(var1, var2, var3, var4, var5);
        class142.method1151(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class142.method1160(var1 + 1, var2 + 18, var3 - 2, var4 + -19, 0);
        class13.field239.method205(class2.field41, var1 + 3, var2 + 14, var5);
        int var6 = class60.field1498;
        int var7 = field427;
        if (arg0 >= -3) {
            return;
        }
        if (class117.field2784 == 0) {
            var7 -= 4;
            var6 -= 4;
        }
        if (class117.field2784 == 1) {
            var6 -= 205;
            var7 -= 553;
        }
        if (class117.field2784 == 2) {
            var6 -= 357;
            var7 -= 17;
        }
        for (int var8 = 0; var8 < field429; var8++) {
            int var9 = (field429 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var1 < var7 && var7 < var1 + var3 && var6 > var9 - 13 && var6 < var9 + 3) {
                var10 = 16776960;
            }
            class13.field239.method223(class46.field994[var8], var1 + 3, var9, var10, true);
        }
    }
}
