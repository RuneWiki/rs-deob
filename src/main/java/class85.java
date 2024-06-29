import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class85 extends class21 {

    @OriginalMember(owner = "client!an", name = "fb", descriptor = "I")
    private int field1615 = -1;

    @OriginalMember(owner = "client!an", name = "R", descriptor = "Ljava/lang/String;")
    public static String field1601 = "Checking for updates - ";

    @OriginalMember(owner = "client!an", name = "ab", descriptor = "I")
    public static int field1610 = 0;

    @OriginalMember(owner = "client!an", name = "X", descriptor = "I")
    public static int field1607 = 0;

    @OriginalMember(owner = "client!an", name = "bb", descriptor = "Lab;")
    public static class279 field1611 = new class279(100);

    @OriginalMember(owner = "client!an", name = "N", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!an", name = "O", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!an", name = "P", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!an", name = "Q", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!an", name = "T", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!an", name = "V", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!an", name = "W", descriptor = "I")
    private int field1606;

    @OriginalMember(owner = "client!an", name = "Y", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!an", name = "Z", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!an", name = "cb", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!an", name = "db", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!an", name = "eb", descriptor = "I")
    private int field1614;

    @OriginalMember(owner = "client!an", name = "S", descriptor = "[I")
    public static int[] field1602;

    @OriginalMember(owner = "client!an", name = "U", descriptor = "[I")
    private int[] field1604;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IILag;)V", line = 8)
    public final void method178(int arg0, int arg1, class202 arg2) {
        field1597++;
        if (arg1 == 0) {
            this.field1615 = arg2.method1315(14289);
        }
        if (arg0 != -318) {
            this.method178(-91, -101, (class202) null);
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V", line = 23)
    public class85() {
        super(0, false);
    }

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(I)V", line = 27)
    public static void method593(int arg0) {
        field1602 = null;
        if (arg0 == 0) {
            field1611 = null;
            field1601 = null;
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V", line = 39)
    public final void method174(int arg0) {
        super.method174(-104);
        if (arg0 <= -75) {
            this.field1604 = null;
            field1605++;
        }
    }

    @OriginalMember(owner = "client!an", name = "e", descriptor = "(I)V", line = 51)
    public static final void method594(int arg0) {
        field1608++;
        class6.field133.method1884(-22054);
        class28.field533.method1884(-22054);
        if (arg0 <= 117) {
            method595(9, -93, (byte) -4, 101, -51, 115);
        }
    }

    @OriginalMember(owner = "client!an", name = "e", descriptor = "(B)I", line = 64)
    public final int method184(byte arg0) {
        field1603++;
        if (arg0 != 25) {
            this.method175(42, (byte) 55);
        }
        return this.field1615;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIBIII)V", line = 84)
    public static final void method595(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg0; var6 <= (arg0 + arg5); var6++) {
            for (int var7 = arg3; var7 <= arg1 + arg3; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class46.field957[arg4][var7][var6] = 127;
                }
            }
        }
        if (arg2 != -118) {
            method595(-77, 39, (byte) -120, -72, 99, -106);
        }
        for (int var8 = arg0; var8 < (arg0 + arg5); var8++) {
            for (int var9 = arg3; var9 < (arg1 + arg3); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class45.field923[arg4][var9][var8] = arg4 <= 0 ? 0 : class45.field923[arg4 - 1][var9][var8];
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var10 = arg0 + 1; var10 < (arg0 + arg5); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class45.field923[arg4][arg3][var10] = class45.field923[arg4][arg3 - 1][var10];
                }
            }
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var11 = arg3 + 1; var11 < (arg1 + arg3); var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class45.field923[arg4][var11][arg0] = class45.field923[arg4][var11][arg0 - 1];
                }
            }
        }
        if (arg3 >= 0 && arg0 >= 0 && arg3 < 104 && arg0 < 104) {
            if (arg4 == 0) {
                if (arg3 > 0 && class45.field923[arg4][arg3 - 1][arg0] != 0) {
                    class45.field923[arg4][arg3][arg0] = class45.field923[arg4][arg3 - 1][arg0];
                } else if (arg0 > 0 && class45.field923[arg4][arg3][arg0 - 1] != 0) {
                    class45.field923[arg4][arg3][arg0] = class45.field923[arg4][arg3][arg0 - 1];
                } else if (arg3 > 0 && arg0 > 0 && class45.field923[arg4][arg3 - 1][arg0 - 1] != 0) {
                    class45.field923[arg4][arg3][arg0] = class45.field923[arg4][arg3 - 1][arg0 - 1];
                }
            } else if (arg3 > 0 && class45.field923[arg4 - 1][arg3 - 1][arg0] != class45.field923[arg4][arg3 - 1][arg0]) {
                class45.field923[arg4][arg3][arg0] = class45.field923[arg4][arg3 - 1][arg0];
            } else if (arg0 > 0 && class45.field923[arg4 - 1][arg3][arg0 - 1] != class45.field923[arg4][arg3][arg0 - 1]) {
                class45.field923[arg4][arg3][arg0] = class45.field923[arg4][arg3][arg0 - 1];
            } else if (arg3 > 0 && arg0 > 0 && class45.field923[arg4 - 1][arg3 - 1][arg0 - 1] != class45.field923[arg4][arg3 - 1][arg0 - 1]) {
                class45.field923[arg4][arg3][arg0] = class45.field923[arg4][arg3 - 1][arg0 - 1];
            }
        }
        field1612++;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(JI)V", line = 205)
    public static final void method596(long arg0, int arg1) {
        field1613++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = arg1; var3 < class77.field1538; var3++) {
            if (class291.field4471[var3] == arg0) {
                class241.field3762++;
                class77.field1538--;
                for (int var4 = var3; var4 < class77.field1538; var4++) {
                    class291.field4471[var4] = class291.field4471[var4 + 1];
                    class122.field2108[var4] = class122.field2108[var4 + 1];
                    class131.field2221[var4] = class131.field2221[var4 + 1];
                }
                class165.field2670 = class342.field5323;
                class14.field263.method80(68, (byte) 116);
                class14.field263.method1353((byte) -105, arg0);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "f", descriptor = "(B)Z", line = 246)
    private final boolean method597(byte arg0) {
        field1600++;
        if (this.field1604 != null) {
            return true;
        }
        if (arg0 > -48) {
            this.method184((byte) 9);
        }
        if (this.field1615 < 0) {
            return false;
        }
        int var2 = class147.field2421;
        int var3 = class294.field4489;
        int var4 = class298.field4528.method960((byte) 99, this.field1615).field1030 ? 64 : 128;
        this.field1604 = class298.field4528.method957(1.0F, var4, var4, true, false, this.field1615);
        this.field1614 = var4;
        this.field1606 = var4;
        class234.method1553(true, var2, var3);
        return this.field1604 != null;
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(II)Z", line = 290)
    public static final boolean method598(int arg0, int arg1) {
        if (arg1 == -1) {
            field1599++;
            return arg0 == 4 || arg0 == 8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(IB)[[I", line = 301)
    public final int[][] method175(int arg0, byte arg1) {
        field1598++;
        if (arg1 <= 16) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field441.method220(arg0, 17433);
        if (this.field441.field532 && this.method597((byte) -66)) {
            int var4 = (class147.field2421 == this.field1606 ? arg0 : this.field1606 * arg0 / class147.field2421) * this.field1614;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class294.field4489 == this.field1614) {
                for (int var8 = 0; var8 < class294.field4489; var8++) {
                    int var9 = this.field1604[var4++];
                    var7[var8] = class61.method475(255, var9) << 4;
                    var6[var8] = class61.method475(var9, 65280) >> 4;
                    var5[var8] = class61.method475(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; var10 < class294.field4489; var10++) {
                    int var11 = this.field1614 * var10 / class294.field4489;
                    int var12 = this.field1604[var4 + var11];
                    var7[var10] = class61.method475(255, var12) << 4;
                    var6[var10] = class61.method475(65280, var12) >> 4;
                    var5[var10] = class61.method475(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }
}
