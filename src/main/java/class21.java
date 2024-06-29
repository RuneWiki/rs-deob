import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class21 extends class211 {

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public int field225 = -1;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "Lrc;")
    public static class108 field223 = new class108(62, -2);

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "[I")
    public static int[] field226 = new int[25];

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "Z")
    public static boolean field231 = false;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "Lvh;")
    public static class84 field229 = new class84(5000);

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
    public int field228;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "Ljava/lang/String;")
    public String field220;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "Ljava/lang/String;")
    public String field232;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "[I")
    public static int[] field227;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "[I")
    public static int[] field233;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(B)V", line = 6)
    public static void method149(byte arg0) {
        if (arg0 != -12) {
            method149((byte) -69);
        }
        field226 = null;
        field229 = null;
        field227 = null;
        field223 = null;
        field233 = null;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)Lsc;", line = 24)
    public final class25 method150(int arg0) {
        if (arg0 < 65) {
            this.field232 = null;
        }
        ++field219;
        return class166.field2414[super.field3075];
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III[Ljava/lang/Object;[I)V", line = 40)
    public static final void method151(int arg0, int arg1, int arg2, Object[] arg3, int[] arg4) {
        if (~arg2 > ~arg1) {
            int var5 = (arg2 - -arg1) / 2;
            int var6 = arg2;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var7;
            Object var8 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var8;
            for (int var9 = arg2; arg1 > var9; ++var9) {
                if (~(var7 - -(1 & var9)) < ~arg4[var9]) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    Object var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg4[arg1] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var8;
            method151(108, var6 + -1, arg2, arg3, arg4);
            method151(88, arg1, var6 + 1, arg3, arg4);
        }
        if (arg0 < 41) {
            field226 = null;
        }
        ++field234;
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(B)V", line = 93)
    public static final void method152(byte arg0) {
        ++field224;
        int var1 = 31 % ((37 - arg0) / 42);
        if (class76.field1132 != null) {
            class76.field1132.method755(-95);
            class202.field2988 = null;
            class76.field1132 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)I", line = 116)
    public static final int method153(byte arg0, int arg1) {
        int var2 = 55 % ((arg0 - 49) / 51);
        ++field222;
        return arg1 & 127;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)I", line = 130)
    public static final int method154(int arg0, int arg1, int arg2) {
        ++field230;
        if (arg2 != 44) {
            method153((byte) 71, 68);
        }
        return arg0 != 4 && ~arg0 != -6 ? 256 : class143.field1995[3 & arg1];
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V", line = 158)
    public static final void method155(int arg0) {
        ++field221;
        if (~class255.field3668 != -1) {
            class75.field1079 -= class255.field3668 * 5;
            if (class213.field3102 <= class75.field1079) {
                class75.field1079 = class213.field3102 - 1;
            }
            class255.field3668 = 0;
            if (class75.field1079 < 0) {
                class75.field1079 = 0;
            }
        }
        if (~class276.field3990 > -103) {
            class276.field3990 += 6;
        }
        for (int var1 = 0; ~var1 > ~class484.field6858; ++var1) {
            int var2 = class399.field5469[var1].method471(-1);
            char var3 = class399.field5469[var1].method477(arg0 + 29712);
            if (var2 == 84) {
                class225.method1534(arg0 + 29821);
            } else if (class162.field2363.method1820((byte) -96, 82) && var2 == 66) {
                if (class4.field31 != null) {
                    String var4 = "";
                    for (int var5 = class390.field5397.length - 1; ~var5 <= -1; --var5) {
                        if (class390.field5397[var5] != null && ~class390.field5397[var5].length() < -1) {
                            var4 = var4 + class390.field5397[var5] + '\n';
                        }
                    }
                    class4.field31.setContents(new StringSelection(var4), (ClipboardOwner) null);
                }
            } else if (class162.field2363.method1820((byte) -96, 82) && ~var2 == -68) {
                if (class4.field31 != null) {
                    Transferable var6 = class4.field31.getContents((Object) null);
                    if (var6 != null) {
                        try {
                            String var7 = (String) var6.getTransferData(DataFlavor.stringFlavor);
                            if (var7 != null) {
                                String[] var8 = class237.method1645('\n', var7, 0);
                                if (var8.length > 1) {
                                    for (int var9 = 0; var9 < var8.length; ++var9) {
                                        class243.field3527 = var8[var9];
                                        class225.method1534(32);
                                    }
                                } else {
                                    class243.field3527 = class243.field3527 + var7;
                                }
                            }
                        } catch (Exception var11) {
                        }
                    }
                }
            } else if (~var2 == -86 && class206.field3014 > 0) {
                class243.field3527 = class243.field3527.substring(0, class206.field3014 + -1) + class243.field3527.substring(class206.field3014);
                --class206.field3014;
            } else if (var2 == 101 && ~class206.field3014 > ~class243.field3527.length()) {
                class243.field3527 = class243.field3527.substring(0, class206.field3014) + class243.field3527.substring(class206.field3014 + 1);
            } else if (~var2 == -97 && ~class206.field3014 < -1) {
                --class206.field3014;
            } else if (~var2 == -98 && ~class206.field3014 > ~class243.field3527.length()) {
                ++class206.field3014;
            } else if (var2 == 102) {
                class206.field3014 = 0;
            } else if (var2 != 103) {
                if (var2 == 104 && class454.field6438 < class390.field5397.length) {
                    ++class454.field6438;
                    class303.method1948(0);
                    class206.field3014 = class243.field3527.length();
                } else if (~var2 == -106 && class454.field6438 > 0) {
                    --class454.field6438;
                    class303.method1948(arg0 ^ -29705);
                    class206.field3014 = class243.field3527.length();
                } else if (class227.method1547((byte) 74, var3) || var3 == ':' || var3 == ',' || ~var3 == -33 || var3 == '_' || ~var3 == -46 || var3 == '+' || ~var3 == -92 || ~var3 == -94) {
                    class243.field3527 = class243.field3527.substring(0, class206.field3014) + class399.field5469[var1].method477(7) + class243.field3527.substring(class206.field3014);
                    ++class206.field3014;
                }
            } else {
                class206.field3014 = class243.field3527.length();
            }
        }
        if (arg0 != -29705) {
            method152((byte) -61);
        }
        class484.field6858 = 0;
        for (int var10 = 0; ~var10 > -101; ++var10) {
            int var10002;
            if (class96.field1348[var10]) {
                var10002 = class352.field4844[var10]++;
                if (~class352.field4844[var10] < -103) {
                    class96.field1348[var10] = false;
                }
            } else {
                var10002 = class352.field4844[var10]--;
                if (~class352.field4844[var10] > -1) {
                    class94.field1326[var10] = (int) (Math.random() * (double) class364.field5007);
                    class454.field6426[var10] = (int) (350.0D * Math.random());
                    class352.field4844[var10] = 0;
                    class96.field1348[var10] = true;
                }
            }
        }
        class125.method947(-113);
    }
}
