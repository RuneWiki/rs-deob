import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class90 {

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "[F")
    public float[] field1637 = new float[4];

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public int field1634;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "Z")
    public boolean field1627;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Z")
    public boolean field1617;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public int field1641;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public int field1614;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public int field1626;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public int field1628;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "[S")
    public short[] field1621;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public int field1619;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    private int field1622;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    private int field1616;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "Lqd;")
    public static class40 field1625 = class147.method1106("(U2", (byte) -127);

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "[I")
    public static int[] field1624 = new int[99];

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "Ldh;")
    public static class161 field1633;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "[I")
    public static int[] field1644;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "F")
    public float field1615;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "F")
    public float field1640;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    private int field1623;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    private int field1630;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    private int field1631;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    private int field1643;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "Lcf;")
    public class124 field1639;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 5)
    private final void method694(byte arg0) {
        field1620++;
        int var2 = -86 / ((arg0 + 42) / 63);
        int var3 = this.field1616;
        if (var3 == 2) {
            this.field1631 = 2048;
            this.field1630 = 1;
            this.field1623 = 2048;
            this.field1643 = 0;
        } else if (var3 == 3) {
            this.field1623 = 4096;
            this.field1643 = 0;
            this.field1631 = 2048;
            this.field1630 = 1;
        } else if (var3 == 4) {
            this.field1630 = 4;
            this.field1631 = 2048;
            this.field1643 = 0;
            this.field1623 = 2048;
        } else if (var3 == 5) {
            this.field1643 = 0;
            this.field1631 = 2048;
            this.field1623 = 8192;
            this.field1630 = 4;
        } else if (var3 == 12) {
            this.field1631 = 2048;
            this.field1643 = 0;
            this.field1630 = 2;
            this.field1623 = 2048;
        } else if (var3 == 13) {
            this.field1643 = 0;
            this.field1623 = 8192;
            this.field1631 = 2048;
            this.field1630 = 2;
        } else if (var3 == 10) {
            this.field1631 = 512;
            this.field1630 = 3;
            this.field1623 = 2048;
            this.field1643 = 1536;
        } else if (var3 == 11) {
            this.field1630 = 3;
            this.field1631 = 512;
            this.field1623 = 4096;
            this.field1643 = 1536;
        } else if (var3 == 6) {
            this.field1631 = 768;
            this.field1630 = 3;
            this.field1623 = 2048;
            this.field1643 = 1280;
        } else if (var3 == 7) {
            this.field1623 = 4096;
            this.field1643 = 1280;
            this.field1631 = 768;
            this.field1630 = 3;
        } else if (var3 == 8) {
            this.field1623 = 2048;
            this.field1643 = 1024;
            this.field1631 = 1024;
            this.field1630 = 3;
        } else if (var3 == 9) {
            this.field1623 = 4096;
            this.field1643 = 1024;
            this.field1630 = 3;
            this.field1631 = 1024;
        } else if (var3 == 14) {
            this.field1630 = 1;
            this.field1623 = 2048;
            this.field1643 = 1280;
            this.field1631 = 768;
        } else if (var3 == 15) {
            this.field1631 = 512;
            this.field1623 = 4096;
            this.field1630 = 1;
            this.field1643 = 1536;
        } else if (var3 == 16) {
            this.field1631 = 256;
            this.field1623 = 8192;
            this.field1630 = 1;
            this.field1643 = 1792;
        } else {
            this.field1630 = 0;
            this.field1623 = 2048;
            this.field1631 = 2048;
            this.field1643 = 0;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 216)
    private final void method695(int arg0) {
        if (arg0 < 72) {
            this.field1631 = -7;
        }
        field1618++;
        int var2 = (this.field1628 << 7) + 64;
        this.field1640 = 1.0F / (float) (var2 * var2);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZBI)V", line = 231)
    public final void method696(boolean arg0, byte arg1, int arg2) {
        field1629++;
        int var4 = this.field1622 + (this.field1623 * arg2 / 50) & 0x7FF;
        int var5 = this.field1630;
        int var6;
        if (var5 == 1) {
            var6 = (class203.field3208[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class315.field5338[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg0) {
            var6 = 2048;
        }
        if (arg1 != 26) {
            return;
        }
        this.field1615 = (float) ((this.field1631 * var6 >> 11) + this.field1643) / 2048.0F;
        float var7 = this.field1615 / 255.0F;
        this.field1637[0] = (float) class276.method1923(this.field1619 >> 16, 255) * var7;
        this.field1637[2] = (float) class276.method1923(255, this.field1619) * var7;
        this.field1637[1] = var7 * (float) (class276.method1923(65363, this.field1619) >> 8);
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V", line = 312)
    public static void method697(byte arg0) {
        int var1 = -64 % ((-arg0 - 47) / 60);
        field1633 = null;
        field1644 = null;
        field1624 = null;
        field1625 = null;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field1624[var1] = var0 / 4;
        }
        field1636 = 255;
        field1633 = null;
        field1638 = 0;
        field1642 = 0;
        field1644 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };
        field1645 = 0;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V", line = 383)
    protected class90() {
        if (class315.field5338 == null) {
            class240.method1684(-21270);
        }
        this.method694((byte) 75);
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lsd;)V", line = 397)
    public class90(class26 arg0) {
        if (class315.field5338 == null) {
            class240.method1684(-21270);
        }
        this.field1634 = arg0.method226(255);
        this.field1627 = (this.field1634 & 0x8) != 0;
        this.field1617 = (this.field1634 & 0x10) != 0;
        this.field1634 &= 0x7;
        this.field1641 = arg0.method197(-1);
        this.field1614 = arg0.method197(-1);
        this.field1626 = arg0.method197(-1);
        this.field1628 = arg0.method226(255);
        this.method695(95);
        this.field1621 = new short[this.field1628 * 2 + 1];
        for (int var2 = 0; var2 < this.field1621.length; var2++) {
            this.field1621[var2] = (short) arg0.method197(-1);
        }
        this.field1619 = class203.field3212[arg0.method197(-1)];
        int var3 = arg0.method226(255);
        this.field1622 = var3 & 0xE0 << 3;
        this.field1616 = var3 & 0x1F;
        this.method694((byte) 105);
    }
}
