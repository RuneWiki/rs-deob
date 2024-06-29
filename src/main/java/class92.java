import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class92 extends class31 {

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "[J")
    private long[] field2018 = new long[10];

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "Lec;")
    public static class28 field2021 = class28.method210(-46, "Importing models )2 ");

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "[I")
    public static int[] field2022 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "Lec;")
    public static class28 field2019 = class28.method210(-46, "@bla@ from: @red@");

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "Lec;")
    public static class28 field2027 = class28.method210(-46, "Examine @yel@");

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "Lec;")
    public static class28 field2038 = class28.method210(-46, "@gre@1 unread message");

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    public static int field2026 = 0;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "Lec;")
    public static class28 field2029 = class28.method210(-46, "Trade)4compete");

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
    public static int field2041 = 0;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    private int field2023;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
    private int field2036;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
    private int field2037;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
    private int field2040;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "J")
    private long field2031;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "Lvb;")
    public static class122 field2028;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "Lvb;")
    public static class122 field2032;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "[Lea;")
    public static class26[] field2020;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILvb;Lvb;Lvb;)V")
    public static final void method667(int arg0, class122 arg1, class122 arg2, class122 arg3) {
        class109.field2287 = arg2;
        class98.field2162 = arg1;
        class90.field1975 = arg3;
        field2033++;
        class18.field372 = new class78[class98.field2162.method937((byte) -128)][];
        if (arg0 != 256) {
            method667(-100, null, null, null);
        }
        class105.field2210 = new boolean[class98.field2162.method937((byte) -128)];
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)V")
    public static final void method668(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2017++;
        for (int var5 = arg2; var5 <= arg1 + arg2; var5++) {
            for (int var6 = arg0; var6 <= arg0 + arg4; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class76.field1720[0][var6][var5] = 127;
                    if (arg0 == var6 && var6 > 0) {
                        class118.field2523[0][var6][var5] = class118.field2523[0][var6 - 1][var5];
                    }
                    if (arg0 + arg4 == var6 && var6 < 103) {
                        class118.field2523[0][var6][var5] = class118.field2523[0][var6 + 1][var5];
                    }
                    if (arg2 == var5 && var5 > 0) {
                        class118.field2523[0][var6][var5] = class118.field2523[0][var6][var5 - 1];
                    }
                    if (arg1 + arg2 == var5 && var5 < 103) {
                        class118.field2523[0][var6][var5] = class118.field2523[0][var6][var5 + 1];
                    }
                }
            }
        }
        if (arg3 < 93) {
            method667(-112, null, null, null);
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    public static void method669(int arg0) {
        field2038 = null;
        field2020 = null;
        field2029 = null;
        field2027 = null;
        field2032 = null;
        field2022 = null;
        field2028 = null;
        field2019 = null;
        field2021 = null;
        int var1 = 3 % ((80 - arg0) / 37);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
    public final void method28(boolean arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2018[var2] = 0L;
        }
        if (arg0) {
            method671(false);
        }
        field2035++;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
    private final void method670(int arg0) {
        this.field2036 = 1;
        this.field2023 = 0;
        field2030++;
        this.field2040 = 256;
        this.field2031 = System.currentTimeMillis();
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2018[var2] = this.field2031;
        }
        if (arg0 != 9165) {
            this.field2018 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V")
    public static final void method671(boolean arg0) {
        field2024++;
        class74.field1647 = arg0;
        class74.method576((byte) -16);
        if (class57.field1307 != -1) {
            boolean var2 = class18.method111(0, -1, class57.field1307, 0, 0, 261, 190, 1, -1);
            if (!var2) {
                class30.field646 = true;
            }
        } else if (class127.field2743[class7.field120] != -1) {
            boolean var1 = class18.method111(0, -1, class127.field2743[class7.field120], 0, 0, 261, 190, 1, -1);
            if (!var1) {
                class30.field646 = true;
            }
        }
        if (class13.field243 && class75.field1671 == 1) {
            class105.method729(false);
        }
        class64.method513(false, class117.field2493);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lec;Lud;I)I")
    public static final int method672(class28 arg0, class119 arg1, int arg2) {
        if (arg2 != 0) {
            field2038 = null;
        }
        int var3 = arg1.field2554;
        arg1.method868(arg0.field606, 32768);
        arg1.field2554 += class34.field780.method168(arg0.field606, arg0.field628, arg2 ^ 0xFFFFFFED, arg1.field2554, arg1.field2531, 0);
        field2016++;
        return arg1.field2554 - var3;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)I")
    public final int method30(int arg0, int arg1, int arg2) {
        int var4 = this.field2040;
        int var5 = this.field2036;
        int var6 = -128 % ((52 - arg2) / 49);
        field2034++;
        this.field2036 = 1;
        this.field2040 = 300;
        this.field2031 = System.currentTimeMillis();
        if (this.field2018[this.field2037] == 0L) {
            this.field2036 = var5;
            this.field2040 = var4;
        } else if (this.field2018[this.field2037] < this.field2031) {
            this.field2040 = (int) ((long) (arg0 * 2560) / (this.field2031 - this.field2018[this.field2037]));
        }
        if (this.field2040 < 25) {
            this.field2040 = 25;
        }
        if (this.field2040 > 256) {
            this.field2040 = 256;
            this.field2036 = (int) ((long) arg0 - (this.field2031 - this.field2018[this.field2037]) / 10L);
        }
        if (this.field2036 > arg0) {
            this.field2036 = arg0;
        }
        this.field2018[this.field2037] = this.field2031;
        this.field2037 = (this.field2037 + 1) % 10;
        if (this.field2036 > 1) {
            for (int var7 = 0; var7 < 10; var7++) {
                if (this.field2018[var7] != 0L) {
                    this.field2018[var7] += this.field2036;
                }
            }
        }
        if (arg1 > this.field2036) {
            this.field2036 = arg1;
        }
        class31.method247((long) this.field2036, (byte) 123);
        int var8 = 0;
        while (this.field2023 < 256) {
            this.field2023 += this.field2040;
            var8++;
        }
        this.field2023 &= 0xFF;
        return var8;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class92() {
        this.method670(9165);
    }
}
