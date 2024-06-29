import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class90 {

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Lod;")
    public static class127 field1713 = new class127(16);

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "[J")
    public static long[] field1715 = new long[256];

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "Lkj;")
    public static class56 field1716;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BJ)Lij;")
    public static final class50 method700(byte arg0, long arg1) {
        if (arg0 >= -109) {
            method701(-94, -15);
        }
        class79.field1452.setTime(new Date(arg1));
        field1709++;
        int var3 = class79.field1452.get(7);
        int var4 = class79.field1452.get(5);
        int var5 = class79.field1452.get(2);
        int var6 = class79.field1452.get(1);
        int var7 = class79.field1452.get(11);
        int var8 = class79.field1452.get(12);
        int var9 = class79.field1452.get(13);
        return class80.method589(new class50[] { class130.field2274[var3 - 1], class15.field343, class78.method579(var4 / 10, -26225), class78.method579(var4 % 10, -26225), class132.field2309, class96.field1804[var5], class132.field2309, class78.method579(var6, -26225), class177.field2960, class78.method579(var7 / 10, -26225), class78.method579(var7 % 10, -26225), class52.field949, class78.method579(var8 / 10, -26225), class78.method579(var8 % 10, -26225), class52.field949, class78.method579(var9 / 10, -26225), class78.method579(var9 % 10, -26225), class249.field4318 }, 28743);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)Z")
    public static final boolean method701(int arg0, int arg1) {
        field1708++;
        if (arg0 != 255) {
            field1715 = null;
        }
        return (arg1 & 0x346991) >> 21 != 0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lce;IIII)V")
    public static final void method702(class10 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class34.field668 < 3) {
            ((class169) class96.field1792).method1162(arg4, arg3, arg0.field243, arg0.field242, class96.field1792.field1636 / 2, class96.field1792.field1643 / 2, class160.field2758, 256, arg0.field158, arg0.field286);
        } else {
            class158.method1115(arg4, arg3, 0, arg0.field158, arg0.field286);
        }
        if (arg1 != 0) {
            field1714 = 122;
        }
        class208.field3458[arg2] = true;
        field1710++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static final void method703(int arg0) {
        field1711++;
        if (arg0 != 12) {
            field1713 = null;
        }
        for (class87 var1 = (class87) class132.field2304.method446(1); var1 != null; var1 = (class87) class132.field2304.method448((byte) 67)) {
            int var2 = var1.field1678;
            if (class10.method67(var2, (byte) -67)) {
                boolean var3 = true;
                class10[] var4 = class137.field2380[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field222;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field635;
                    class10 var7 = class89.method698(var6, (byte) 94);
                    if (var7 != null) {
                        class140.method979((byte) 113, var7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public static final void method704(byte arg0) {
        class204.method1381(59);
        if (arg0 >= -124) {
            method701(18, -26);
        }
        field1712++;
        System.gc();
        class120.method868(56, 25);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public static void method705(int arg0) {
        field1715 = null;
        field1713 = null;
        int var1 = 25 / ((arg0 + 65) / 48);
        field1716 = null;
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
            field1715[var0] = var1;
        }
        field1716 = new class56(32);
        field1717 = 0;
    }
}
