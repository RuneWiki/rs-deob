import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!j")
public class class16 {

    @OriginalMember(owner = "mapview!j", name = "c", descriptor = "[I")
    private int[] field142;

    @OriginalMember(owner = "mapview!j", name = "b", descriptor = "Lw;")
    public static class38 field141 = class35.method219("Agility Training", true);

    @OriginalMember(owner = "mapview!j", name = "f", descriptor = "I")
    public static int field145 = 20;

    @OriginalMember(owner = "mapview!j", name = "j", descriptor = "Lw;")
    public static class38 field149 = class35.method219("_", true);

    @OriginalMember(owner = "mapview!j", name = "k", descriptor = "Lw;")
    public static class38 field150 = class35.method219(" ", true);

    @OriginalMember(owner = "mapview!j", name = "i", descriptor = "Lw;")
    public static class38 field148 = class35.method219("100(U", true);

    @OriginalMember(owner = "mapview!j", name = "g", descriptor = "J")
    public static long field146 = 0L;

    @OriginalMember(owner = "mapview!j", name = "d", descriptor = "Lw;")
    public static class38 field143 = class35.method219("Farming shop", true);

    @OriginalMember(owner = "mapview!j", name = "m", descriptor = "Lw;")
    public static class38 field152 = class35.method219("Requesting", true);

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "Lw;")
    public static class38 field140 = class35.method219("Quest Start", true);

    @OriginalMember(owner = "mapview!j", name = "h", descriptor = "Lw;")
    public static class38 field147 = class35.method219("Enter place name to find", true);

    @OriginalMember(owner = "mapview!j", name = "e", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "mapview!j", name = "n", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "mapview!j", name = "o", descriptor = "Ln;")
    public static class24 field154;

    @OriginalMember(owner = "mapview!j", name = "l", descriptor = "Ljava/awt/Font;")
    public static Font field151;

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(IB)I", line = 6)
    public final int method85(int arg0, byte arg1) {
        int var3 = this.field142.length - 2;
        int var4 = arg0 << 1 & var3;
        if (arg1 != 100) {
            field146 = -45L;
        }
        while (true) {
            int var5 = this.field142[var4];
            if (arg0 == var5) {
                return this.field142[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var4 + 2 & var3;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(I)V", line = 45)
    public static void method86(int arg0) {
        field147 = null;
        field148 = null;
        field154 = null;
        field152 = null;
        field151 = null;
        if (arg0 < 63) {
            method87(null, true);
        }
        field150 = null;
        field143 = null;
        field140 = null;
        field141 = null;
        field149 = null;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "([BZ)[B", line = 67)
    public static final byte[] method87(byte[] arg0, boolean arg1) {
        int var2 = arg0.length;
        if (arg1) {
            method87(null, false);
        }
        byte[] var3 = new byte[var2];
        class2.method5(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(IIB)V", line = 97)
    public static final void method88(int arg0, int arg1, byte arg2) {
        class9.field70 = arg1 >> 6;
        field144 = arg0 & 0x3F;
        class26.field367 = arg1 & 0x3F;
        mapview.field257 = (class26.field367 << 6) + field144;
        class34.field436 = arg0 >> 6;
        if (arg2 > -38) {
            method88(77, 110, (byte) 117);
        }
        mapview.method137(-6519);
    }

    @OriginalMember(owner = "mapview!j", name = "<init>", descriptor = "([I)V", line = 121)
    public class16(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field142 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field142[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field142[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field142[var5 + var5] = arg0[var4];
            this.field142[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "mapview!j", name = "a", descriptor = "(IIILha;)[Ld;", line = 172)
    public static final class7[] method89(int arg0, int arg1, int arg2, class13 arg3) {
        if (class9.method39(arg0, arg1, -98, arg3)) {
            if (arg2 <= 19) {
                field151 = null;
            }
            return class32.method197(255);
        } else {
            return null;
        }
    }
}
