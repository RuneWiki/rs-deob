import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class31 {

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "Lsb;")
    public static class98 field554 = class47.method368(" loggt sich ein)3", 0);

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field557 = 0;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "Lac;")
    public static class188 field549;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "Lih;")
    public static class252 field552;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "[[Z")
    public static boolean[][] field551;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "[[[Lp;")
    public static class71[][][] field553;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lki;I)V")
    public static final void method282(class255 arg0, int arg1) {
        field550++;
        if (arg1 <= 39) {
            method284(-13);
        }
        if (arg0.field4497 == 0) {
            return;
        }
        if (arg0.field4464 != -1 && arg0.field4464 < 32768) {
            class108 var2 = class180.field3109[arg0.field4464];
            if (var2 != null) {
                int var3 = arg0.field4492 - var2.field4492;
                int var4 = arg0.field4466 - var2.field4466;
                if (var3 != 0 || var4 != 0) {
                    arg0.field4480 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field4464 >= 32768) {
            int var5 = arg0.field4464 - 32768;
            if (class234.field4046 == var5) {
                var5 = 2047;
            }
            class192 var6 = class141.field2499[var5];
            if (var6 != null) {
                int var7 = arg0.field4492 - var6.field4492;
                int var8 = arg0.field4466 - var6.field4466;
                if (var7 != 0 || var8 != 0) {
                    arg0.field4480 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field4506 != 0 || arg0.field4472 != 0) && (arg0.field4496 == 0 || arg0.field4459 > 0)) {
            int var9 = arg0.field4486 * 64 + arg0.field4492 - (arg0.field4506 - (class189.field3277 - -class189.field3277)) * 64 - 64;
            int var10 = (arg0.field4486 * 64) + arg0.field4466 - ((arg0.field4472 - (class182.field3143 + class182.field3143)) * 64) - 64;
            if (var9 != 0 || var10 != 0) {
                arg0.field4480 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field4506 = 0;
            arg0.field4472 = 0;
        }
        int var11 = arg0.field4480 - arg0.field4527 & 0x7FF;
        if (var11 == 0) {
            arg0.field4489 = 0;
            return;
        }
        arg0.field4489++;
        if (var11 <= 1024) {
            arg0.field4527 += arg0.field4497;
            boolean var12 = true;
            if (var11 < arg0.field4497 || 2048 - arg0.field4497 < var11) {
                var12 = false;
                arg0.field4527 = arg0.field4480;
            }
            if (arg0.field4510 == arg0.field4479 && (arg0.field4489 > 25 || var12)) {
                if (arg0.field4517 == -1) {
                    arg0.field4479 = arg0.field4508;
                } else {
                    arg0.field4479 = arg0.field4517;
                }
            }
        } else {
            boolean var13 = true;
            arg0.field4527 -= arg0.field4497;
            if (arg0.field4497 > var11 || var11 > 2048 - arg0.field4497) {
                var13 = false;
                arg0.field4527 = arg0.field4480;
            }
            if (arg0.field4510 == arg0.field4479 && (arg0.field4489 > 25 || var13)) {
                if (arg0.field4462 == -1) {
                    arg0.field4479 = arg0.field4508;
                } else {
                    arg0.field4479 = arg0.field4462;
                }
            }
        }
        arg0.field4527 &= 0x7FF;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static void method283(int arg0) {
        if (arg0 >= -53) {
            field557 = 70;
        }
        field552 = null;
        field549 = null;
        field554 = null;
        field551 = null;
        field553 = null;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
    public static final void method284(int arg0) {
        field556++;
        class255.method1762(arg0 ^ 0x5, 5);
        class107.method818(arg0 - 81, arg0);
        class48.method380(5, 30735);
        class121.method906(arg0 + 99, 5);
        class251.method1742(true, 5);
        class122.method907(5, (byte) -15);
        class215.method1434(5, 1);
        class261.method1791(5, 66);
        class104.method799(-21731, 5);
        class191.method1316(1, 5);
        class206.method1390(5, (byte) 70);
        class115.method860(50, -1);
        class113.method847(5, -1075092692);
        class230.method1589(-72, 5);
        class138.field2457.method1561(arg0 - 102, 5);
    }
}
