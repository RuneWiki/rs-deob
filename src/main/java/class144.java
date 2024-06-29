import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public abstract class class144 extends class429 {

    @OriginalMember(owner = "client!ada", name = "h", descriptor = "S")
    public short field1758;

    @OriginalMember(owner = "client!ada", name = "p", descriptor = "B")
    public byte field1766;

    @OriginalMember(owner = "client!ada", name = "g", descriptor = "B")
    public byte field1757;

    @OriginalMember(owner = "client!ada", name = "x", descriptor = "Z")
    public boolean field1774;

    @OriginalMember(owner = "client!ada", name = "l", descriptor = "S")
    public short field1762;

    @OriginalMember(owner = "client!ada", name = "n", descriptor = "I")
    public int field1764;

    @OriginalMember(owner = "client!ada", name = "r", descriptor = "I")
    public int field1768;

    @OriginalMember(owner = "client!ada", name = "w", descriptor = "S")
    public short field1773;

    @OriginalMember(owner = "client!ada", name = "k", descriptor = "S")
    public short field1761;

    @OriginalMember(owner = "client!ada", name = "s", descriptor = "I")
    public int field1769;

    @OriginalMember(owner = "client!ada", name = "u", descriptor = "[J")
    public static long[] field1771 = new long[256];

    @OriginalMember(owner = "client!ada", name = "o", descriptor = "Z")
    public static boolean field1765 = false;

    @OriginalMember(owner = "client!ada", name = "y", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!ada", name = "i", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!ada", name = "q", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!ada", name = "v", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!ada", name = "m", descriptor = "Llaa;")
    public static class103 field1763;

    @OriginalMember(owner = "client!ada", name = "t", descriptor = "Lkea;")
    public static class203 field1770;

    @OriginalMember(owner = "client!ada", name = "j", descriptor = "[Z")
    public static boolean[] field1760;

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
            field1771[var0] = var1;
        }
        field1775 = 0;
    }

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "(B)V", line = 4)
    public void method862(byte arg0) {
        field1772++;
        if (arg0 != 69) {
            method864(-117);
        }
    }

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "(B)V", line = 23)
    public static void method863(byte arg0) {
        field1771 = null;
        field1760 = null;
        if (arg0 < -87) {
            field1763 = null;
            field1770 = null;
        }
    }

    @OriginalMember(owner = "client!ada", name = "g", descriptor = "(I)V", line = 41)
    public static final void method864(int arg0) {
        field1759++;
        if (class437.field6502 || arg0 != -257) {
            return;
        }
        class437.field6502 = true;
        if (class595.field8694.field6547) {
            class639.field9187 = ((int) class639.field9187 + 47 & 0xFFFFFFF0);
        } else {
            class99.field1159 += (12.0F - class99.field1159) / 2.0F;
        }
        class421.field6304 = true;
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 103)
    public class144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field1758 = (short) arg6;
        this.field1766 = arg9;
        this.field1757 = (byte) arg0;
        this.field1774 = arg8;
        this.field1762 = (short) arg5;
        this.field1764 = arg1;
        this.field1768 = arg3;
        this.field1773 = (short) arg4;
        this.field1761 = (short) arg7;
        this.field1769 = arg2;
    }

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "(B)I")
    public abstract int method413(byte arg0);
}
