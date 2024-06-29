import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class76 extends class748 {

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
    private int field1049 = 10;

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
    private int field1043 = 2048;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
    private int field1050 = 0;

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "[Lsc;")
    public static class451[] field1046 = new class451[16];

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "Lwu;")
    public static class557 field1047;

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "Luha;")
    public static class723 field1051;

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "[I")
    private int[] field1041;

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "[I")
    private int[] field1045;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)V")
    private final void method467(boolean arg0) {
        ++field1042;
        this.field1045 = new int[this.field1049 + 1];
        int var2 = 0;
        this.field1041 = new int[this.field1049 + 1];
        int var3 = 4096 / this.field1049;
        int var4 = this.field1043 * var3 >> 12;
        if (!arg0) {
            for (int var5 = 0; ~var5 > ~this.field1049; ++var5) {
                this.field1041[var5] = var2;
                this.field1045[var5] = var2 + var4;
                var2 += var3;
            }
            this.field1041[this.field1049] = 4096;
            this.field1045[this.field1049] = this.field1045[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class76() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(Z)V")
    public static void method468(boolean arg0) {
        field1047 = null;
        if (!arg0) {
            field1051 = null;
        }
        field1051 = null;
        field1046 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    public final void method23(byte arg0) {
        this.method467(false);
        ++field1038;
        if (arg0 != 67) {
            this.method467(true);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field1039;
        int[] var3 = super.field10407.method3873(0, arg0);
        if (super.field10407.field9527) {
            int var4 = class370.field4727[arg0];
            if (~this.field1050 == -1) {
                short var5 = 0;
                for (int var6 = 0; ~this.field1049 < ~var6; ++var6) {
                    if (var4 >= this.field1041[var6] && ~this.field1041[var6 + 1] < ~var4) {
                        if (~var4 > ~this.field1045[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class34.method240(var3, 0, class424.field5889, var5);
            } else {
                for (int var7 = 0; ~var7 > ~class424.field5889; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class237.field3298[var7];
                    int var11 = this.field1050;
                    if (~var11 != -2) {
                        if (var11 != 2) {
                            if (~var11 == -4) {
                                var8 = 2048 - -(-var4 + var10 >> 1);
                            }
                        } else {
                            var8 = (var10 - (-var4 + 4096) >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; var12 < this.field1049; ++var12) {
                        if (this.field1041[var12] <= var8 && ~var8 > ~this.field1041[var12 - -1]) {
                            if (var8 < this.field1045[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return arg1 != 255 ? null : var3;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)V")
    public static final void method469(int arg0, int arg1) {
        class507.field7075 = -1;
        class536.field7505 = 3;
        class137.field1830 = 100;
        if (arg1 > -112) {
            field1047 = null;
        }
        ++field1044;
        class387.field5412 = arg0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZLvj;)V")
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field1050 = arg2.method194((byte) 119);
                }
            } else {
                this.field1043 = arg2.method193(2);
            }
        } else {
            this.field1049 = arg2.method194((byte) 119);
        }
        if (arg1) {
            method469(-94, -59);
        }
        ++field1052;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BIZIII)V")
    public static final void method470(byte arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        ++field1048;
        if (class455.field6257 != null && (~arg4 != -4 || class576.field8226 != arg3 || class97.field1414 != arg5)) {
            class329.method1916(126, class455.field6257, class379.field5339);
            class455.field6257 = null;
        }
        if (arg4 == 3 && class455.field6257 == null) {
            class455.field6257 = class4.method13(arg5, arg3, class379.field5339, 136, 0, 0);
            if (class455.field6257 != null) {
                class97.field1414 = arg5;
                class576.field8226 = arg3;
                class199.method1350(-26159);
            }
        }
        if (arg4 == 3 && class455.field6257 == null) {
            method470((byte) -114, arg1, true, -1, class674.field9500.field5133.method1962(0), -1);
        } else {
            Container var7;
            if (class455.field6257 == null) {
                if (class244.field3384 != null) {
                    Insets var6 = class244.field3384.getInsets();
                    class389.field5428 = class244.field3384.getSize().width + -var6.right + -var6.left;
                    int var10001 = -var6.top;
                    class611.field8696 = class244.field3384.getSize().height + var10001 + -var6.bottom;
                    var7 = class244.field3384;
                } else {
                    if (class622.field8847 == null) {
                        var7 = class128.field1752;
                    } else {
                        var7 = class622.field8847;
                    }
                    class389.field5428 = var7.getSize().width;
                    class611.field8696 = var7.getSize().height;
                }
            } else {
                class611.field8696 = arg5;
                class389.field5428 = arg3;
                var7 = class455.field6257;
            }
            if (~arg4 != -2) {
                class354.method2008((byte) -86);
            } else {
                class58.field807 = class95.field1381;
                class614.field8750 = 0;
                class305.field3963 = (-class95.field1381 + class389.field5428) / 2;
                class582.field8281 = class631.field8989;
            }
            if (class746.field10392 != class456.field6280) {
                boolean var10000;
                if (class58.field807 < 1024 && class582.field8281 < 768) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            if (!arg2) {
                class438.field6016.setSize(class58.field807, class582.field8281);
                if (class264.field3595) {
                    class595.method3525(class438.field6016, (byte) 2);
                } else {
                    class96.field1401.method2224(class438.field6016, class58.field807, class582.field8281);
                }
                if (class244.field3384 == var7) {
                    Insets var8 = class244.field3384.getInsets();
                    class438.field6016.setLocation(class305.field3963 + var8.left, class614.field8750 + var8.top);
                } else {
                    class438.field6016.setLocation(class305.field3963, class614.field8750);
                }
            } else {
                class148.method954(-125);
            }
            if (arg4 < 2) {
                class93.field1299 = false;
            } else {
                class93.field1299 = true;
            }
            if (arg0 < -33) {
                if (class312.field4004 != -1) {
                    class636.method3700(true, 1);
                }
                if (class275.field3699 != null && class439.method2630(class213.field3004, (byte) -78)) {
                    class566.method3389(-114);
                }
                for (int var9 = 0; ~var9 > -101; ++var9) {
                    class142.field1966[var9] = true;
                }
                class686.field9628 = true;
            }
        }
    }
}
