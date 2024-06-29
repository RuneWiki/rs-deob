import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class113 extends class112 {

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    private int field1603 = -1;

    @OriginalMember(owner = "client!ke", name = "bb", descriptor = "Lwm;")
    private static class152 field1614 = class157.method1048("You can(Wt add yourself to your own friend list)3", 112);

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "Lwm;")
    public static class152 field1608 = field1614;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    private int field1600;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    private int field1612;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!ke", name = "cb", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "[I")
    private int[] field1599;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "[I")
    public static int[] field1607;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "[Ldc;")
    public static class109[] field1611;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZIIII)V", line = 4)
    public static final void method756(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field1602++;
        int var6 = arg3;
        if (!arg1) {
            return;
        }
        while ((arg3 + arg4) >= var6) {
            for (int var7 = arg5; var7 <= arg2 + arg5; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class199.field3218[arg0][var7][var6] = 127;
                }
            }
            var6++;
        }
        for (int var8 = arg3; var8 < (arg3 + arg4); var8++) {
            for (int var9 = arg5; var9 < (arg2 + arg5); var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class65.field984[arg0][var9][var8] = arg0 > 0 ? class65.field984[arg0 - 1][var9][var8] : 0;
                }
            }
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var10 = arg3 + 1; var10 < (arg3 + arg4); var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class65.field984[arg0][arg5][var10] = class65.field984[arg0][arg5 - 1][var10];
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var11 = arg5 + 1; var11 < arg2 + arg5; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class65.field984[arg0][var11][arg3] = class65.field984[arg0][var11][arg3 - 1];
                }
            }
        }
        if (arg5 < 0 || arg3 < 0 || arg5 >= 104 || arg3 >= 104) {
            return;
        }
        if (arg0 == 0) {
            if (arg5 > 0 && class65.field984[arg0][arg5 - 1][arg3] != 0) {
                class65.field984[arg0][arg5][arg3] = class65.field984[arg0][arg5 - 1][arg3];
            } else if (arg3 > 0 && class65.field984[arg0][arg5][arg3 - 1] != 0) {
                class65.field984[arg0][arg5][arg3] = class65.field984[arg0][arg5][arg3 - 1];
            } else if (arg5 > 0 && arg3 > 0 && class65.field984[arg0][arg5 - 1][arg3 - 1] != 0) {
                class65.field984[arg0][arg5][arg3] = class65.field984[arg0][arg5 - 1][arg3 - 1];
            }
        } else if (arg5 > 0 && class65.field984[arg0][arg5 - 1][arg3] != class65.field984[arg0 - 1][arg5 - 1][arg3]) {
            class65.field984[arg0][arg5][arg3] = class65.field984[arg0][arg5 - 1][arg3];
        } else if (arg3 > 0 && class65.field984[arg0 - 1][arg5][arg3 - 1] != class65.field984[arg0][arg5][arg3 - 1]) {
            class65.field984[arg0][arg5][arg3] = class65.field984[arg0][arg5][arg3 - 1];
        } else if (arg5 > 0 && arg3 > 0 && class65.field984[arg0][arg5 - 1][arg3 - 1] != class65.field984[arg0 - 1][arg5 - 1][arg3 - 1]) {
            class65.field984[arg0][arg5][arg3] = class65.field984[arg0][arg5 - 1][arg3 - 1];
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)I", line = 126)
    public final int method748(int arg0) {
        if (arg0 <= 46) {
            field1610 = 45;
        }
        field1598++;
        return this.field1603;
    }

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "(I)V", line = 137)
    public static void method757(int arg0) {
        field1611 = null;
        field1608 = null;
        field1614 = null;
        field1607 = null;
        int var1 = -78 % ((arg0 - 17) / 35);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)[[I", line = 160)
    public final int[][] method55(int arg0, boolean arg1) {
        field1613++;
        int[][] var3 = this.field1594.method656((byte) -36, arg0);
        if (this.field1594.field1402 && this.method760((byte) 32)) {
            int var4 = (class268.field4526 == this.field1600 ? arg0 : this.field1600 * arg0 / class268.field4526) * this.field1612;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class58.field889 == this.field1612) {
                for (int var11 = 0; var11 < class58.field889; var11++) {
                    int var12 = this.field1599[var4++];
                    var7[var11] = class34.method251(var12 << 4, 4080);
                    var6[var11] = class34.method251(var12 >> 4, 4080);
                    var5[var11] = class34.method251(var12, 16711680) >> 12;
                }
            } else {
                for (int var8 = 0; var8 < class58.field889; var8++) {
                    int var9 = this.field1612 * var8 / class58.field889;
                    int var10 = this.field1599[var4 + var9];
                    var7[var8] = class34.method251(4080, var10 << 4);
                    var6[var8] = class34.method251(4080, var10 >> 4);
                    var5[var8] = class34.method251(var10, 16711680) >> 12;
                }
            }
        }
        if (arg1) {
            this.field1603 = 120;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)V", line = 229)
    public static final void method758(int arg0, int arg1) {
        if (class323.field5640 == arg0 && arg0 != 0) {
            class29 var2 = class239.field3928[arg0];
            var2.method35(class77.field1095);
        }
        field1597++;
        if (arg1 != -1) {
            method758(-20, 2);
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(BI)V", line = 249)
    public static final void method759(byte arg0, int arg1) {
        field1615++;
        if (arg0 == 33) {
            class303 var2 = class90.method589(false, arg1, 8);
            var2.method2114((byte) 113);
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V", line = 265)
    public class113() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)V", line = 274)
    public final void method754(int arg0) {
        super.method754(arg0);
        field1606++;
        this.field1599 = null;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)Z", line = 288)
    private final boolean method760(byte arg0) {
        field1605++;
        if (this.field1599 != null) {
            return true;
        } else if (arg0 != 32) {
            return false;
        } else if (this.field1603 < 0) {
            return false;
        } else {
            int var2 = class268.field4526;
            int var3 = class58.field889;
            int var4 = class60.field914.method1772(this.field1603, -104) ? 64 : 128;
            this.field1599 = class60.field914.method1782(this.field1603, -112);
            this.field1612 = var4;
            this.field1600 = var4;
            class54.method361(103, var2, var3);
            return this.field1599 != null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILhi;)V", line = 318)
    public final void method52(int arg0, int arg1, class291 arg2) {
        field1604++;
        if (arg0 == 31164 && arg1 == 0) {
            this.field1603 = arg2.method2021((byte) 74);
        }
    }
}
