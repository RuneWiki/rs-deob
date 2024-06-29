import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class368 extends class184 {

    @OriginalMember(owner = "client!fd", name = "I", descriptor = "I")
    private int field4765 = 4;

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    private int field4761 = 4;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "I")
    public static int field4764 = -1;

    @OriginalMember(owner = "client!fd", name = "L", descriptor = "Ldq;")
    public static class493 field4768 = new class493(56, 3);

    @OriginalMember(owner = "client!fd", name = "M", descriptor = "Ldq;")
    public static class493 field4769 = new class493(42, 3);

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!fd", name = "J", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
    public static final void method2106(byte arg0) {
        ++field4763;
        if (class109.field1364 != 0) {
            class520.field7512 -= class109.field1364 * 5;
            if (class520.field7512 >= class488.field7109) {
                class520.field7512 = class488.field7109 + -1;
            }
            class109.field1364 = 0;
            if (class520.field7512 < 0) {
                class520.field7512 = 0;
            }
        }
        if (class294.field3760 < 102) {
            class294.field3760 += 6;
        }
        for (int var1 = 0; var1 < class346.field4439; ++var1) {
            int var2 = class389.field5220[var1].method1263((byte) -97);
            char var3 = class389.field5220[var1].method1262(true);
            if (var2 == 84) {
                class271.method1609(-487);
            } else if (class343.field4392.method834(false, 82) && var2 == 66) {
                if (class116.field1569 != null) {
                    String var8 = "";
                    for (int var9 = class99.field1199.length - 1; var9 >= 0; --var9) {
                        if (class99.field1199[var9] != null && ~class99.field1199[var9].length() < -1) {
                            var8 = var8 + class99.field1199[var9] + '\n';
                        }
                    }
                    class116.field1569.setContents(new StringSelection(var8), (ClipboardOwner) null);
                }
            } else if (class343.field4392.method834(false, 82) && ~var2 == -68) {
                if (class116.field1569 != null) {
                    Transferable var4 = class116.field1569.getContents((Object) null);
                    if (var4 != null) {
                        try {
                            String var5 = (String) var4.getTransferData(DataFlavor.stringFlavor);
                            if (var5 != null) {
                                String[] var6 = class335.method1937(-94, var5, '\n');
                                if (~var6.length >= -2) {
                                    class113.field1505 = class113.field1505 + var5;
                                } else {
                                    for (int var7 = 0; ~var6.length < ~var7; ++var7) {
                                        class113.field1505 = var6[var7];
                                        class271.method1609(-487);
                                    }
                                }
                            }
                        } catch (Exception var10) {
                        }
                    }
                }
            } else if (var2 == 85 && ~class232.field2965 < -1) {
                class113.field1505 = class113.field1505.substring(0, class232.field2965 - 1) + class113.field1505.substring(class232.field2965);
                --class232.field2965;
            } else if (~var2 == -102 && class232.field2965 < class113.field1505.length()) {
                class113.field1505 = class113.field1505.substring(0, class232.field2965) + class113.field1505.substring(class232.field2965 + 1);
            } else if (var2 == 96 && ~class232.field2965 < -1) {
                --class232.field2965;
            } else if (~var2 == -98 && ~class232.field2965 > ~class113.field1505.length()) {
                ++class232.field2965;
            } else if (var2 != 102) {
                if (~var2 != -104) {
                    if (~var2 == -105 && class97.field1187 < class99.field1199.length) {
                        ++class97.field1187;
                        class491.method2977(16);
                        class232.field2965 = class113.field1505.length();
                    } else if (~var2 == -106 && class97.field1187 > 0) {
                        --class97.field1187;
                        class491.method2977(-125);
                        class232.field2965 = class113.field1505.length();
                    } else if (class489.method2969(var3, -19880) || ~var3 == -59 || ~var3 == -45 || ~var3 == -33 || var3 == '_' || ~var3 == -46 || ~var3 == -44 || ~var3 == -92 || var3 == ']') {
                        class113.field1505 = class113.field1505.substring(0, class232.field2965) + class389.field5220[var1].method1262(true) + class113.field1505.substring(class232.field2965);
                        ++class232.field2965;
                    }
                } else {
                    class232.field2965 = class113.field1505.length();
                }
            } else {
                class232.field2965 = 0;
            }
        }
        if (arg0 > -12) {
            field4764 = 71;
        }
        class346.field4439 = 0;
        class68.method604(-9192);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)[[I")
    public final int[][] method13(int arg0, int arg1) {
        ++field4762;
        int[][] var3 = super.field2416.method3031(arg1 ^ -28525, arg0);
        if (arg1 != 1) {
            this.method13(-37, 98);
        }
        if (super.field2416.field7271) {
            int var4 = class245.field3167 / this.field4765;
            int var5 = class79.field1026 / this.field4761;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method1163(1, 0, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method1163(1, class79.field1026 * var7 / var5, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; var14 < class245.field3167; ++var14) {
                int var16;
                if (var4 > 0) {
                    int var15 = var14 % var4;
                    var16 = class245.field3167 * var15 / var4;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var12[var14] = var9[var16];
                var13[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)V")
    public static void method2107(byte arg0) {
        field4768 = null;
        if (arg0 == -81) {
            field4769 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        ++field4766;
        int[] var3 = super.field2409.method248(arg0, 16776960);
        if (arg1 != 578) {
            this.method7((byte) -6, -113, (class463) null);
        }
        if (super.field2409.field436) {
            int var4 = class245.field3167 / this.field4765;
            int var5 = class79.field1026 / this.field4761;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method1159(82, 0, 0);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method1159(30, class79.field1026 * var7 / var5, 0);
            }
            for (int var8 = 0; ~var8 > ~class245.field3167; ++var8) {
                if (var4 <= 0) {
                    var3[var8] = var6[0];
                } else {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class245.field3167 * var9 / var4];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class368() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BILfh;)V")
    public final void method7(byte arg0, int arg1, class463 arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field4761 = arg2.method2737(false);
            }
        } else {
            this.field4765 = arg2.method2737(false);
        }
        int var5 = -23 / ((arg0 - -13) / 51);
        ++field4767;
    }
}
