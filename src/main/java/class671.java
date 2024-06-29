import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class671 extends class620 {

    @OriginalMember(owner = "client!naa", name = "K", descriptor = "Lrga;")
    public static class280 field9448 = new class280(16, 7);

    @OriginalMember(owner = "client!naa", name = "G", descriptor = "I")
    public static int field9444;

    @OriginalMember(owner = "client!naa", name = "H", descriptor = "I")
    public static int field9445;

    @OriginalMember(owner = "client!naa", name = "I", descriptor = "I")
    public static int field9446;

    @OriginalMember(owner = "client!naa", name = "J", descriptor = "I")
    public static int field9447;

    @OriginalMember(owner = "client!naa", name = "L", descriptor = "J")
    public static long field9449;

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "(B)V")
    public static void method3766(byte arg0) {
        if (arg0 > -53) {
            field9449 = 72L;
        }
        field9448 = null;
    }

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "(B)V")
    public static final void method3767(byte arg0) {
        if (class260.field3213 != null) {
            class260.field3213.method1502(-26789);
        }
        if (arg0 == 76) {
            ++field9447;
            if (class411.field5140 != null) {
                class411.field5140.method1502(-26789);
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "([BI)Lit;")
    public static final class517 method3768(byte[] arg0, int arg1) {
        int var2 = -40 / ((arg1 - 19) / 34);
        ++field9444;
        class517 var3 = new class517();
        class630 var4 = new class630(arg0);
        var4.field8812 = var4.field8804.length + -2;
        int var5 = var4.method3470(13111);
        int var6 = var4.field8804.length + -12 - 2 - var5;
        var4.field8812 = var6;
        int var7 = var4.method3483(97);
        var3.field7058 = var4.method3470(13111);
        var3.field7059 = var4.method3470(13111);
        var3.field7056 = var4.method3470(13111);
        var3.field7051 = var4.method3470(13111);
        int var8 = var4.method3501(-9268);
        if (~var8 < -1) {
            var3.field7057 = new class68[var8];
            for (int var9 = 0; ~var9 > ~var8; ++var9) {
                int var10 = var4.method3470(13111);
                class68 var11 = new class68(class391.method2101(var10, 128));
                var3.field7057[var9] = var11;
                while (~(var10--) < -1) {
                    int var12 = var4.method3483(94);
                    int var13 = var4.method3483(74);
                    var11.method402(new class262(var13), (byte) -30, (long) var12);
                }
            }
        }
        var4.field8812 = 0;
        var3.field7066 = var4.method3473(9283);
        var3.field7060 = new int[var7];
        var3.field7064 = new String[var7];
        var3.field7054 = new int[var7];
        int var14 = 0;
        while (~var4.field8812 > ~var6) {
            int var15 = var4.method3470(13111);
            if (~var15 != -4) {
                if (~var15 > -101 && var15 != 21 && var15 != 38 && var15 != 39) {
                    var3.field7054[var14] = var4.method3483(93);
                } else {
                    var3.field7054[var14] = var4.method3501(-9268);
                }
            } else {
                var3.field7064[var14] = var4.method3500((byte) 123).intern();
            }
            var3.field7060[var14++] = var15;
        }
        return var3;
    }

    @OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(Lpl;Lpl;Laea;)V")
    public class671(class612 arg0, class612 arg1, class39 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "(B)Leaa;")
    public static final class43 method3769(byte arg0) {
        ++field9445;
        if (arg0 != 103) {
            field9448 = null;
        }
        return class656.field9236;
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IBIII)V")
    public final void method3403(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field9446;
        int var6 = super.field8662.method160();
        if (arg1 != 85) {
            field9448 = null;
        }
        int var7 = ((class39) super.field2603).field522 * class16.method111(783) / 10 % var6;
        super.field8662.method2909(-var6 + arg2 + var7, arg3, arg4 + var6 + -var7, arg0);
    }
}
