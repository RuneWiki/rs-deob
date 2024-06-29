import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class346 {

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "I")
    public int field4864 = 64;

    @OriginalMember(owner = "client!ow", name = "f", descriptor = "I")
    public int field4869 = 64;

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "I")
    public int field4866 = -1;

    @OriginalMember(owner = "client!ow", name = "i", descriptor = "Z")
    public boolean field4872 = false;

    @OriginalMember(owner = "client!ow", name = "m", descriptor = "I")
    public int field4876 = 2;

    @OriginalMember(owner = "client!ow", name = "j", descriptor = "Z")
    public boolean field4873 = false;

    @OriginalMember(owner = "client!ow", name = "n", descriptor = "I")
    public int field4877 = 1;

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!ow", name = "e", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!ow", name = "h", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!ow", name = "l", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!ow", name = "k", descriptor = "Lgca;")
    public static class249 field4874;

    @OriginalMember(owner = "client!ow", name = "g", descriptor = "[Loia;")
    public static class88[] field4870;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(II)I")
    public static final int method2236(int arg0, int arg1) {
        field4871++;
        return arg0 == 26922 ? arg1 >>> 7 : -90;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Lee;IB)V")
    public final void method2237(class675 arg0, int arg1, byte arg2) {
        while (true) {
            int var4 = arg0.method3750((byte) 35);
            if (var4 == 0) {
                int var5 = -18 % ((arg2 - 49) / 52);
                field4865++;
                return;
            }
            this.method2238(var4, arg0, arg1, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(ILee;IB)V")
    private final void method2238(int arg0, class675 arg1, int arg2, byte arg3) {
        if (arg0 == 1) {
            this.field4866 = arg1.method3757((byte) -65);
            if (this.field4866 == 65535) {
                this.field4866 = -1;
            }
        } else if (arg0 == 2) {
            this.field4869 = arg1.method3757((byte) -65) + 1;
            this.field4864 = arg1.method3757((byte) -65) + 1;
        } else if (arg0 == 3) {
            arg1.method3719(1854307120);
        } else if (arg0 == 4) {
            this.field4876 = arg1.method3750((byte) 35);
        } else if (arg0 == 5) {
            this.field4877 = arg1.method3750((byte) 35);
        } else if (arg0 == 6) {
            this.field4872 = true;
        } else if (arg0 == 7) {
            this.field4873 = true;
        }
        if (arg3 == 0) {
            field4868++;
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IILkba;Lmga;)V")
    public static final void method2239(int arg0, int arg1, class105 arg2, class709 arg3) {
        field4867++;
        if (class557.field7828 >= 50 || arg3 == null || arg3.field9845 == null || arg3.field9845.length <= arg1 || arg3.field9845[arg1] == null || arg0 != -701644944) {
            return;
        }
        int var4 = arg3.field9845[arg1][0];
        int var5 = var4 >> 8;
        int var6 = var4 >> 5 & 0x7;
        if (arg3.field9845[arg1].length > 1) {
            int var7 = (int) ((double) arg3.field9845[arg1].length * Math.random());
            if (var7 > 0) {
                var5 = arg3.field9845[arg1][var7];
            }
        }
        int var8 = var4 & 0x1F;
        int var9 = 256;
        if (arg3.field9844 != null && arg3.field9825 != null) {
            var9 = arg3.field9844[arg1] + (int) (Math.random() * (double) (arg3.field9825[arg1] - arg3.field9844[arg1]));
        }
        int var10 = arg3.field9851 == null ? 255 : arg3.field9851[arg1];
        if (var8 == 0) {
            if (class660.field9039 == arg2) {
                if (!arg3.field9832) {
                    class420.method2576(var9, var10, (byte) 112, var6, var5, 0);
                    return;
                }
                class220.method1349(var5, false, var6, var9, arg0 ^ 0xD62D9BC8, var10, 0);
            }
        } else if (class557.field7812.field6550.method3029(false) != 0) {
            int var11 = arg2.field1264 - 256 >> 9;
            int var12 = arg2.field1250 - 256 >> 9;
            int var13 = class660.field9039 == arg2 ? 0 : (arg2.field1266 << 24) + (var12 << 8) + var8 + (var11 << 16);
            class503.field7212[class557.field7828++] = new class319((byte) (arg3.field9832 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg2);
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Z)I")
    public static final int method2240(boolean arg0) {
        if (arg0) {
            field4874 = null;
        }
        field4875++;
        if (class643.field8813 == null) {
            if (!class436.field6192 && class231.field3108 != null) {
                return class231.field3108.field472;
            }
            int var1 = class530.field7470.method1094(-73);
            int var2 = class530.field7470.method1089((byte) -63);
            if (class600.field8427) {
                if (class208.field2732 < var1 && class470.field6668 + class208.field2732 > var1) {
                    int var10 = -1;
                    for (int var11 = 0; var11 < class350.field4958; var11++) {
                        if (class273.field3903) {
                            int var16 = var11 * 16 + class652.field8959 + 33;
                            if (var16 - 13 < var2 && var2 <= (var16 + 3)) {
                                var10 = var11;
                            }
                        } else {
                            int var15 = var11 * 16 + class652.field8959 + 31;
                            if (var2 > var15 - 13 && var15 + 3 >= var2) {
                                var10 = var11;
                            }
                        }
                    }
                    if (var10 != -1) {
                        int var12 = 0;
                        class674 var13 = new class674(class455.field6429);
                        for (class508 var14 = (class508) var13.method3685(true); var14 != null; var14 = (class508) var13.method3684((byte) 106)) {
                            if (var10 == (var12++)) {
                                if (var14.field7268 == 1) {
                                    return ((class37) var14.field7267.field9891.field8206).field472;
                                }
                                return -1;
                            }
                        }
                    }
                } else if (class430.field6135 != null && var1 > class326.field4512 && var1 < (class326.field4512 + class426.field5986)) {
                    int var17 = -1;
                    for (int var18 = 0; var18 < class430.field6135.field7268; var18++) {
                        if (class273.field3903) {
                            int var23 = var18 * 16 + class373.field5236 + 33;
                            if ((var23 - 13) < var2 && var2 <= (var23 + 3)) {
                                var17 = var18;
                            }
                        } else {
                            int var22 = var18 * 16 + class373.field5236 + 31;
                            if (var2 > var22 - 13 && var22 + 3 >= var2) {
                                var17 = var18;
                            }
                        }
                    }
                    if (var17 != -1) {
                        int var19 = 0;
                        class674 var20 = new class674(class430.field6135.field7267);
                        for (class37 var21 = (class37) var20.method3685(true); var21 != null; var21 = (class37) var20.method3684((byte) 106)) {
                            if (var17 == var19++) {
                                return var21.field472;
                            }
                        }
                    }
                }
            } else if (var1 > class208.field2732 && var1 < class470.field6668 + class208.field2732) {
                int var3 = -1;
                for (int var4 = 0; var4 < class25.field341; var4++) {
                    if (class273.field3903) {
                        int var9 = (class25.field341 - var4 - 1) * 16 + class652.field8959 + 33;
                        if (var9 - 13 < var2 && (var9 + 3) >= var2) {
                            var3 = var4;
                        }
                    } else {
                        int var8 = class652.field8959 + ((class25.field341 - var4 + -1) * 16) + 31;
                        if (var8 - 13 < var2 && var2 <= (var8 + 3)) {
                            var3 = var4;
                        }
                    }
                }
                if (var3 != -1) {
                    int var5 = 0;
                    class383 var6 = new class383(class215.field2820);
                    for (class37 var7 = (class37) var6.method2430(11034); var7 != null; var7 = (class37) var6.method2434(146800640)) {
                        if (var3 == var5++) {
                            return var7.field472;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(B)V")
    public static void method2241(byte arg0) {
        field4870 = null;
        field4874 = null;
        if (arg0 <= 67) {
            method2240(true);
        }
    }
}
