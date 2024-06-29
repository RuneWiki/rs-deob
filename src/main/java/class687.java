import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jka")
public class class687 extends class751 {

    @OriginalMember(owner = "client!jka", name = "C", descriptor = "I")
    private int field9736 = 4;

    @OriginalMember(owner = "client!jka", name = "A", descriptor = "I")
    private int field9734 = 4;

    @OriginalMember(owner = "client!jka", name = "B", descriptor = "I")
    public static int field9735;

    @OriginalMember(owner = "client!jka", name = "D", descriptor = "I")
    public static int field9737;

    @OriginalMember(owner = "client!jka", name = "E", descriptor = "I")
    public static int field9738;

    @OriginalMember(owner = "client!jka", name = "H", descriptor = "I")
    public static int field9741;

    @OriginalMember(owner = "client!jka", name = "I", descriptor = "I")
    public static int field9742;

    @OriginalMember(owner = "client!jka", name = "J", descriptor = "I")
    public static int field9743;

    @OriginalMember(owner = "client!jka", name = "F", descriptor = "Lcca;")
    public static class257 field9739;

    @OriginalMember(owner = "client!jka", name = "G", descriptor = "[J")
    public static long[] field9740;

    @OriginalMember(owner = "client!jka", name = "<init>", descriptor = "()V", line = 3)
    public class687() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "([BZI)Ljava/lang/Object;", line = 14)
    public static final Object method3876(byte[] arg0, boolean arg1, int arg2) {
        ++field9741;
        if (arg0 == null) {
            return null;
        } else {
            if (arg2 > ~arg0.length && !class772.field10655) {
                try {
                    class581 var3 = (class581) Class.forName("bh").newInstance();
                    var3.method285(arg2 + 101, arg0);
                    return var3;
                } catch (Throwable var4) {
                    class772.field10655 = true;
                }
            }
            return !arg1 ? arg0 : class536.method3101(arg0, arg2 ^ -137);
        }
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(ILrv;I)V", line = 47)
    public final void method309(int arg0, class120 arg1, int arg2) {
        ++field9743;
        int var4 = -126 % ((25 - arg0) / 63);
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field9734 = arg1.method842(2384);
            }
        } else {
            this.field9736 = arg1.method842(2384);
        }
    }

    @OriginalMember(owner = "client!jka", name = "c", descriptor = "(I)V", line = 84)
    public static void method3877(int arg0) {
        field9739 = null;
        field9740 = null;
        if (arg0 != 1289) {
            field9740 = null;
        }
    }

    @OriginalMember(owner = "client!jka", name = "e", descriptor = "(B)V", line = 99)
    public static final void method3878(byte arg0) {
        ++field9742;
        if (~class2.field20 > -103) {
            class2.field20 += 6;
        }
        if (class234.field3392 != -1 && ~class109.method731(101) < ~class238.field3433) {
            for (int var1 = class234.field3392; var1 < class630.field8899.length; ++var1) {
                if (class630.field8899[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class630.field8899[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class561.method3260("Pausing for " + var2 + " seconds...", 105);
                    class234.field3392 = var1 + 1;
                    class238.field3433 = class109.method731(77) + (long) (var2 * 1000);
                    return;
                }
                class230.field3350 = class630.field8899[var1];
                class357.method2251(false, (byte) -114);
            }
            class234.field3392 = -1;
        }
        if (~class516.field7387 != -1) {
            class90.field1170 -= class516.field7387 * 5;
            if (class636.field8960 <= class90.field1170) {
                class90.field1170 = class636.field8960 + -1;
            }
            class516.field7387 = 0;
            if (~class90.field1170 > -1) {
                class90.field1170 = 0;
            }
        }
        for (int var3 = 0; ~var3 > ~class33.field440; ++var3) {
            class706 var4 = class190.field2829[var3];
            int var5 = var4.method2709((byte) -123);
            char var6 = var4.method2710(-9159);
            int var7 = var4.method2715((byte) 50);
            if (var5 == 84) {
                class357.method2251(false, (byte) -128);
            }
            if (var5 == 80) {
                class357.method2251(true, (byte) -110);
            } else if (var5 == 66 && ~(4 & var7) != -1) {
                if (class53.field745 != null) {
                    String var11 = "";
                    for (int var12 = class543.field7607.length + -1; var12 >= 0; --var12) {
                        if (class543.field7607[var12] != null && ~class543.field7607[var12].length() < -1) {
                            var11 = var11 + class543.field7607[var12] + '\n';
                        }
                    }
                    class53.field745.setContents(new StringSelection(var11), (ClipboardOwner) null);
                }
            } else if (var5 == 67 && ~(var7 & 4) != -1) {
                if (class53.field745 != null) {
                    Transferable var8 = class53.field745.getContents((Object) null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class29.method214('\n', var9, -70);
                                class738.method4136(false, var10);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (var5 == 85 && class109.field1317 > 0) {
                class230.field3350 = class230.field3350.substring(0, class109.field1317 + -1) + class230.field3350.substring(class109.field1317);
                --class109.field1317;
            } else if (~var5 == -102 && class109.field1317 < class230.field3350.length()) {
                class230.field3350 = class230.field3350.substring(0, class109.field1317) + class230.field3350.substring(class109.field1317 - -1);
            } else if (var5 == 96 && class109.field1317 > 0) {
                --class109.field1317;
            } else if (var5 == 97 && ~class109.field1317 > ~class230.field3350.length()) {
                ++class109.field1317;
            } else if (var5 != 102) {
                if (var5 == 103) {
                    class109.field1317 = class230.field3350.length();
                } else if (var5 == 104 && class543.field7607.length > class322.field4784) {
                    ++class322.field4784;
                    class322.method2086((byte) -74);
                    class109.field1317 = class230.field3350.length();
                } else if (var5 == 105 && ~class322.field4784 < -1) {
                    --class322.field4784;
                    class322.method2086((byte) -74);
                    class109.field1317 = class230.field3350.length();
                } else if (class385.method2353(105, var6) || var6 == '\\' || ~var6 == -48 || ~var6 == -47 || var6 == ':' || var6 == ',' || var6 == ' ' || var6 == '_' || var6 == '-' || ~var6 == -44 || var6 == '[' || ~var6 == -94) {
                    class230.field3350 = class230.field3350.substring(0, class109.field1317) + class190.field2829[var3].method2710(-9159) + class230.field3350.substring(class109.field1317);
                    ++class109.field1317;
                }
            } else {
                class109.field1317 = 0;
            }
        }
        if (arg0 < 40) {
            method3877(-108);
        }
        class593.field8366 = 0;
        class33.field440 = 0;
        class149.method1028(-19376);
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(II)[I", line = 290)
    public final int[] method365(int arg0, int arg1) {
        ++field9738;
        if (arg1 != 4095) {
            this.field9734 = -24;
        }
        int[] var3 = super.field10405.method3601(true, arg0);
        if (super.field10405.field8923) {
            int var4 = class673.field9452 / this.field9736;
            int var5 = class152.field2253 / this.field9734;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method4173(class152.field2253 * var6 / var5, (byte) -125, 0);
            } else {
                var7 = this.method4173(0, (byte) -123, 0);
            }
            for (int var8 = 0; ~var8 > ~class673.field9452; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class673.field9452 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(IB)[[I", line = 344)
    public final int[][] method147(int arg0, byte arg1) {
        ++field9737;
        int[][] var3 = super.field10409.method3474(2132, arg0);
        if (arg1 != 57) {
            field9740 = null;
        }
        if (super.field10409.field8481) {
            int var4 = class673.field9452 / this.field9736;
            int var5 = class152.field2253 / this.field9734;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method4172(0, 0, 1);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method4172(0, class152.field2253 * var7 / var5, 1);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~var14 > ~class673.field9452; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class673.field9452 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }
}
