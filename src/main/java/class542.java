import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class542 extends class331 {

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "I")
    public static int field7630 = 0;

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "I")
    public static int field7641 = 0;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field7635 = new String[8];

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "I")
    public static int field7640;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "Lgaa;")
    public static class460 field7639;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)I")
    public final int method226(byte arg0) {
        ++field7636;
        if (arg0 != 13) {
            this.method226((byte) -9);
        }
        return 1;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(ILts;)V")
    public class542(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(II)V")
    public final void method227(int arg0, int arg1) {
        super.field4202 = arg1;
        ++field7632;
        if (arg0 < 113) {
            this.method227(-32, 96);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)V")
    public static final void method3083(byte arg0, int arg1) {
        ++field7631;
        if (arg1 < 0 || ~arg1 < -3) {
            arg1 = 0;
        }
        class266.field3369 = arg1;
        class149.field1812 = new class428[class613.field8536[class266.field3369] - -1];
        int var2 = 126 % ((arg0 - -53) / 44);
        class185.field2421 = 0;
        class111.field1371 = 0;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
    public static void method3084(int arg0) {
        field7635 = null;
        field7639 = null;
        int var1 = -50 / ((arg0 - -90) / 35);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public final void method224(int arg0) {
        if (super.field4203.method345((byte) 122) == class400.field5535) {
            if (super.field4203.method344((byte) -94)) {
                super.field4202 = 0;
            }
        } else {
            super.field4202 = 1;
        }
        if (arg0 != -1959) {
            this.method224(-13);
        }
        ++field7633;
        if (super.field4202 != 0 && super.field4202 != 1) {
            super.field4202 = this.method226((byte) 13);
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(II)I")
    public final int method222(int arg0, int arg1) {
        ++field7640;
        if (arg1 != 1) {
            this.method224(16);
        }
        if (super.field4203.method344((byte) -99)) {
            return 3;
        } else {
            return super.field4203.method345((byte) 122) == class400.field5535 ? 1 : 3;
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(B)Z")
    public final boolean method3085(byte arg0) {
        if (arg0 <= 103) {
            field7635 = null;
        }
        ++field7634;
        if (super.field4203.method344((byte) -119)) {
            return false;
        } else {
            return super.field4203.method345((byte) 122) == class400.field5535;
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)V")
    public static final void method3086(int arg0) {
        ++field7637;
        if (~class418.field5954 > -103) {
            class418.field5954 += 6;
        }
        if (class91.field1147 != -1 && class97.method654((byte) 109) > class327.field4178) {
            for (int var1 = class91.field1147; var1 < class278.field3529.length; ++var1) {
                if (class278.field3529[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class278.field3529[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class192.method1210(-111, "Pausing for " + var2 + " seconds...");
                    class91.field1147 = var1 + 1;
                    class327.field4178 = class97.method654((byte) 68) - -((long) (var2 * 1000));
                    return;
                }
                class534.field7501 = class278.field3529[var1];
                class389.method2325((byte) -75, false);
            }
            class91.field1147 = -1;
        }
        if (class8.field90 != 0) {
            class249.field3167 -= class8.field90 * 5;
            if (~class249.field3167 <= ~class10.field113) {
                class249.field3167 = class10.field113 + -1;
            }
            class8.field90 = 0;
            if (~class249.field3167 > -1) {
                class249.field3167 = 0;
            }
        }
        if (arg0 <= -16) {
            for (int var3 = 0; class234.field3023 > var3; ++var3) {
                class122 var4 = class753.field10513[var3];
                int var5 = var4.method802(-20069);
                char var6 = var4.method798(-17654);
                int var7 = var4.method800(127);
                if (~var5 == -85) {
                    class389.method2325((byte) -75, false);
                }
                if (var5 == 80) {
                    class389.method2325((byte) -75, true);
                } else if (var5 == 66 && (var7 & 4) != 0) {
                    if (class149.field1807 != null) {
                        String var11 = "";
                        for (int var12 = class48.field701.length + -1; ~var12 <= -1; --var12) {
                            if (class48.field701[var12] != null && ~class48.field701[var12].length() < -1) {
                                var11 = var11 + class48.field701[var12] + '\n';
                            }
                        }
                        class149.field1807.setContents(new StringSelection(var11), (ClipboardOwner) null);
                    }
                } else if (~var5 == -68 && ~(var7 & 4) != -1) {
                    if (class149.field1807 != null) {
                        Transferable var8 = class149.field1807.getContents((Object) null);
                        if (var8 != null) {
                            try {
                                String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                                if (var9 != null) {
                                    String[] var10 = class124.method809('\n', -6, var9);
                                    class701.method3885((byte) -74, var10);
                                }
                            } catch (Exception var14) {
                            }
                        }
                    }
                } else if (var5 == 85 && class607.field8420 > 0) {
                    class534.field7501 = class534.field7501.substring(0, class607.field8420 - 1) + class534.field7501.substring(class607.field8420);
                    --class607.field8420;
                } else if (var5 == 101 && ~class607.field8420 > ~class534.field7501.length()) {
                    class534.field7501 = class534.field7501.substring(0, class607.field8420) + class534.field7501.substring(class607.field8420 + 1);
                } else if (var5 == 96 && ~class607.field8420 < -1) {
                    --class607.field8420;
                } else if (~var5 == -98 && class607.field8420 < class534.field7501.length()) {
                    ++class607.field8420;
                } else if (~var5 != -103) {
                    if (~var5 != -104) {
                        if (~var5 == -105 && ~field7641 > ~class48.field701.length) {
                            ++field7641;
                            class497.method2886((byte) -115);
                            class607.field8420 = class534.field7501.length();
                        } else if (~var5 == -106 && field7641 > 0) {
                            --field7641;
                            class497.method2886((byte) -115);
                            class607.field8420 = class534.field7501.length();
                        } else if (class3.method13(var6, 248) || var6 == '\\' || ~var6 == -48 || ~var6 == -47 || ~var6 == -59 || ~var6 == -45 || ~var6 == -33 || ~var6 == -96 || ~var6 == -46 || ~var6 == -44 || ~var6 == -92 || var6 == ']') {
                            class534.field7501 = class534.field7501.substring(0, class607.field8420) + class753.field10513[var3].method798(-17654) + class534.field7501.substring(class607.field8420);
                            ++class607.field8420;
                        }
                    } else {
                        class607.field8420 = class534.field7501.length();
                    }
                } else {
                    class607.field8420 = 0;
                }
            }
            class237.field3068 = 0;
            class234.field3023 = 0;
            class728.method4033(-100);
        }
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(B)I")
    public final int method3087(byte arg0) {
        ++field7638;
        if (arg0 >= -119) {
            this.method224(-103);
        }
        return super.field4202;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lts;)V")
    public class542(class41 arg0) {
        super(arg0);
    }
}
