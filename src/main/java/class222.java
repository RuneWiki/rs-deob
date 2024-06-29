import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public abstract class class222 extends class235 {

    @OriginalMember(owner = "client!of", name = "u", descriptor = "[Lof;")
    public class222[] field3818;

    @OriginalMember(owner = "client!of", name = "S", descriptor = "Z")
    public boolean field3842;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "[I")
    public static int[] field3817 = new int[25];

    @OriginalMember(owner = "client!of", name = "A", descriptor = "I")
    public static int field3824 = 0;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "[I")
    public static int[] field3830 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!of", name = "v", descriptor = "Z")
    public static boolean field3819 = false;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "Lsb;")
    private static class98 field3825 = class47.method368("wave:", 0);

    @OriginalMember(owner = "client!of", name = "P", descriptor = "[I")
    public static int[] field3839 = new int[5];

    @OriginalMember(owner = "client!of", name = "N", descriptor = "I")
    public static int field3837 = 0;

    @OriginalMember(owner = "client!of", name = "L", descriptor = "I")
    public static int field3835 = 20;

    @OriginalMember(owner = "client!of", name = "O", descriptor = "[S")
    public static short[] field3838 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!of", name = "H", descriptor = "Lsb;")
    public static class98 field3831 = field3825;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "Lsb;")
    public static class98 field3829 = field3825;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!of", name = "D", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!of", name = "E", descriptor = "I")
    public int field3828;

    @OriginalMember(owner = "client!of", name = "I", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!of", name = "M", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!of", name = "R", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!of", name = "T", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!of", name = "V", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!of", name = "U", descriptor = "Lma;")
    public class4 field3844;

    @OriginalMember(owner = "client!of", name = "K", descriptor = "Lae;")
    public class84 field3834;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(III)[[I")
    public final int[][] method1531(int arg0, int arg1, int arg2) {
        field3832++;
        if (arg2 < 108) {
            method1534(-3, (class98) null);
        }
        if (this.field3818[arg1].field3842) {
            int[] var4 = this.field3818[arg1].method7((byte) 58, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3818[arg1].method4(arg0, 1);
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(B)I")
    public int method1532(byte arg0) {
        if (arg0 <= 99) {
            field3819 = true;
        }
        field3833++;
        return -1;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lca;IZ)V")
    public static final void method1533(class102 arg0, int arg1, boolean arg2) {
        field3836++;
        if (class75.field1328 != null) {
            try {
                class75.field1328.method790(false);
            } catch (Exception var8) {
            }
            class75.field1328 = null;
        }
        class75.field1328 = arg0;
        class236.method1616(arg2, true);
        class87.field1534 = 0;
        class78.field1397 = null;
        class242.field4192.field3728 = arg1;
        class26.field511 = null;
        while (true) {
            class33 var3 = (class33) class72.field1179.method1514((byte) 60);
            if (var3 == null) {
                while (true) {
                    class33 var4 = (class33) class28.field529.method1514((byte) 51);
                    if (var4 == null) {
                        if (class53.field858 != 0) {
                            try {
                                class216 var5 = new class216(4);
                                var5.method1477(4, -26755);
                                var5.method1477(class53.field858, arg1 - 26755);
                                var5.method1470((byte) -122, 0);
                                class75.field1328.method788(true, 0, 4, var5.field3706);
                            } catch (IOException var7) {
                                try {
                                    class75.field1328.method790(false);
                                } catch (Exception var6) {
                                }
                                class75.field1328 = null;
                                class112.field1995++;
                            }
                        }
                        class68.field1088 = 0;
                        class137.field2421 = class164.method1183((byte) 80);
                        return;
                    }
                    class117.field2095.method121(var4, arg1 ^ 0xFFFFF973);
                    class53.field861.method1513(var4.field4061, var4, -1);
                    class116.field2086++;
                    class225.field3879--;
                }
            }
            class97.field1664.method1513(var3.field4061, var3, -1);
            class101.field1788++;
            class146.field2560--;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public void method1497(int arg0) {
        field3826++;
        if (arg0 != 0) {
            this.field3844 = null;
        }
        if (this.field3842) {
            this.field3844.method14((byte) -122);
            this.field3844 = null;
        } else {
            this.field3834.method631((byte) -63);
            this.field3834 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILsb;)V")
    public static final void method1534(int arg0, class98 arg1) {
        field3827++;
        int var2 = class18.method170(arg1, arg0 + 13248);
        if (arg0 == var2) {
            return;
        }
        class192.field3354 = class31.field552.field4412[var2] - class51.field830;
        class70.field1121 = class255.field4470 + class148.field2743 - class31.field552.field4403[var2] - 1;
        int var3 = class192.field3354 - ((int) ((float) class106.field1901.field2694 / class4.field42));
        int var4 = class70.field1121 - (int) ((float) class106.field1901.field2647 / class4.field42);
        int var5 = (int) ((float) class106.field1901.field2694 / class4.field42) + class192.field3354;
        if (var3 < 0) {
            class192.field3354 = (int) ((float) class106.field1901.field2694 / class4.field42);
        }
        int var6 = (int) ((float) class106.field1901.field2647 / class4.field42) + class70.field1121;
        if (var5 > class140.field2488) {
            class192.field3354 = class140.field2488 - ((int) ((float) class106.field1901.field2694 / class4.field42));
        }
        if (var4 < 0) {
            class70.field1121 = (int) ((float) class106.field1901.field2647 / class4.field42);
        }
        if (var6 > class148.field2743) {
            class70.field1121 = class148.field2743 - ((int) ((float) class106.field1901.field2647 / class4.field42));
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public void method288(int arg0) {
        field3843++;
        int var2 = -5 / ((arg0 - 57) / 51);
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)I")
    public int method1495(int arg0) {
        if (arg0 == -1) {
            field3840++;
            return -1;
        } else {
            return -75;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Llj;ZI)V")
    public void method3(class216 arg0, boolean arg1, int arg2) {
        if (arg1) {
            method1533((class102) null, -57, false);
        }
        field3841++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZII)V")
    public final void method1535(boolean arg0, int arg1, int arg2) {
        field3820++;
        if (!arg0) {
            this.method1531(58, 43, -15);
        }
        int var4 = this.field3828 == 255 ? arg1 : this.field3828;
        if (this.field3842) {
            this.field3844 = new class4(var4, arg1, arg2);
        } else {
            this.field3834 = new class84(var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)[I")
    public int[] method7(byte arg0, int arg1) {
        if (arg0 < 35) {
            this.field3834 = null;
        }
        field3823++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(II)[[I")
    public int[][] method4(int arg0, int arg1) {
        if (arg1 == 1) {
            field3821++;
            throw new IllegalStateException("This operation does not have a colour output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V")
    public static void method1536(int arg0) {
        field3831 = null;
        field3817 = null;
        field3839 = null;
        field3825 = null;
        if (arg0 == 7405) {
            field3830 = null;
            field3829 = null;
            field3838 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BII)[I")
    public final int[] method1537(byte arg0, int arg1, int arg2) {
        field3822++;
        if (arg0 <= 45) {
            field3838 = null;
        }
        return this.field3818[arg1].field3842 ? this.field3818[arg1].method7((byte) 57, arg2) : this.field3818[arg1].method4(arg2, 1)[0];
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(IZ)V")
    public class222(int arg0, boolean arg1) {
        this.field3818 = new class222[arg0];
        this.field3842 = arg1;
    }
}
