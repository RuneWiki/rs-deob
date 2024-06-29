import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class101 {

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Ljd;")
    public static class85 field1801 = class221.method1499("gelb:", (byte) -127);

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field1806 = 0;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public int field1798;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public int field1800;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public int field1803;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "J")
    public static long field1804;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method699(int arg0) {
        if (arg0 <= -15) {
            field1801 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLik;)V")
    public final void method700(byte arg0, class247 arg1) {
        field1797++;
        if (arg0 < 71) {
            field1806 = -59;
        }
        while (true) {
            int var3 = arg1.method1711((byte) -67);
            if (var3 == 0) {
                return;
            }
            this.method703(0, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Z")
    public static final boolean method701(int arg0, int arg1) {
        field1802++;
        if (arg1 == 481760156) {
            return (arg0 & 0x1C3389B2) >> 28 != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)Lrf;")
    public static final class267 method702(int arg0, int arg1, int arg2) {
        class208 var3 = class99.field1780[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class267 var4 = var3.field3641;
            var3.field3641 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILik;I)V")
    private final void method703(int arg0, class247 arg1, int arg2) {
        if (arg2 == 1) {
            this.field1803 = arg1.method1694((byte) -100);
            this.field1800 = arg1.method1711((byte) -67);
            this.field1798 = arg1.method1711((byte) -67);
        }
        if (arg0 != 0) {
            this.field1800 = -121;
        }
        field1807++;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)Lde;")
    public static final class106 method704(int arg0, int arg1) {
        if (arg0 != 1) {
            field1801 = null;
        }
        field1805++;
        class106 var2 = (class106) class189.field3247.method1269((long) arg1, (byte) 46);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class203.field3548.method464(-1, class219.method1490(arg0 ^ -84, arg1), class19.method137((byte) -117, arg1));
        class106 var4 = new class106();
        if (var3 != null) {
            var4.method729(new class247(var3), (byte) -81);
        }
        var4.method734(0);
        class189.field3247.method1271(-15561, var4, (long) arg1);
        return var4;
    }
}
