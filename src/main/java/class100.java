import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class100 extends class122 {

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "[J")
    private long[] field1746 = new long[10];

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    private int field1741 = 0;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    private int field1745 = 1;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    private int field1742 = 256;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "J")
    private long field1744 = class12.method57(-106);

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "Lra;")
    public static class40 field1750 = new class40();

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
    public static int field1753 = 0;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public static int field1752 = 0;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "Lub;")
    public static class227 field1754 = class257.method1749("cookiehost", 17263);

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    public static int field1755 = 0;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "Lub;")
    public static class227 field1758 = class257.method1749("blinken3:", 17263);

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    public static int field1757 = 2;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "[I")
    public static int[] field1756 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
    public static int field1759 = 0;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    private int field1740;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "[Lgb;")
    public static class46[] field1751;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZIIZ[Ldj;II[BIII)V")
    public static final void method613(boolean arg0, int arg1, int arg2, boolean arg3, class134[] arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9, int arg10) {
        if (!arg0) {
            method616(-43);
        }
        if (!arg3) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if (arg1 + var11 > 0 && (arg1 + var11) < 103 && (arg6 + var12) > 0 && arg6 + var12 < 103) {
                        arg4[arg2].field2338[arg1 + var11][arg6 + var12] = class76.method446(arg4[arg2].field2338[arg1 + var11][arg6 + var12], -16777217);
                    }
                }
            }
        }
        field1748++;
        byte var13;
        if (arg3) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        class226 var14 = new class226(arg7);
        for (int var15 = 0; var15 < var13; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg8 == var15 && arg5 <= var16 && var16 < (arg5 + 8) && var17 >= arg9 && (arg9 + 8) > var17) {
                        class254.method1726((byte) 106, arg3, 0, 0, class112.method715(var16 & 0x7, 117, arg10, var17 & 0x7) + arg1, arg10, arg2, class134.method826(arg10, var17 & 0x7, var16 & 0x7, (byte) 105) + arg6, var14);
                    } else {
                        class254.method1726((byte) 70, arg3, 0, 0, -1, 0, 0, -1, var14);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)I")
    public final int method535(int arg0, int arg1, int arg2) {
        field1747++;
        int var4 = this.field1742;
        this.field1742 = 300;
        int var5 = this.field1745;
        this.field1745 = 1;
        this.field1744 = class12.method57(arg0 ^ 0xFFFFE5C3);
        if (this.field1746[this.field1740] == 0L) {
            this.field1742 = var4;
            this.field1745 = var5;
        } else if (this.field1746[this.field1740] < this.field1744) {
            this.field1742 = (int) ((long) (arg2 * 2560) / (this.field1744 - this.field1746[this.field1740]));
        }
        if (arg0 != 6724) {
            this.method535(125, -2, -32);
        }
        if (this.field1742 < 25) {
            this.field1742 = 25;
        }
        if (this.field1742 > 256) {
            this.field1742 = 256;
            this.field1745 = (int) ((long) arg2 - ((this.field1744 - this.field1746[this.field1740]) / 10L));
        }
        if (arg2 < this.field1745) {
            this.field1745 = arg2;
        }
        this.field1746[this.field1740] = this.field1744;
        this.field1740 = (this.field1740 + 1) % 10;
        if (this.field1745 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1746[var6] != 0L) {
                    this.field1746[var6] += (long) this.field1745;
                }
            }
        }
        if (arg1 > this.field1745) {
            this.field1745 = arg1;
        }
        int var7 = 0;
        class171.method1088(117, (long) this.field1745);
        while (this.field1741 < 256) {
            this.field1741 += this.field1742;
            var7++;
        }
        this.field1741 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)I")
    public static final int method614(boolean arg0, int arg1) {
        field1749++;
        if (!(arg1 < 65 || arg1 > 90) || !(arg1 < 192 || arg1 > 222 || arg1 == 215)) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else {
            if (!arg0) {
                field1751 = null;
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
    public static void method615(boolean arg0) {
        field1758 = null;
        field1756 = null;
        field1751 = null;
        field1750 = null;
        if (arg0) {
            field1754 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public static final void method616(int arg0) {
        if (arg0 == -11) {
            class168.field2806.method1723(-4173);
            field1743++;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public final void method534(byte arg0) {
        field1739++;
        if (arg0 <= 48) {
            this.field1742 = 74;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1746[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class100() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1746[var1] = this.field1744;
        }
    }
}
