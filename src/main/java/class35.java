import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class35 extends class409 {

    @OriginalMember(owner = "client!ts", name = "x", descriptor = "I")
    private int field558;

    @OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
    private int field557;

    @OriginalMember(owner = "client!ts", name = "r", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client!ts", name = "u", descriptor = "Z")
    public static boolean field555 = false;

    @OriginalMember(owner = "client!ts", name = "t", descriptor = "[I")
    public static int[] field554 = new int[2048];

    @OriginalMember(owner = "client!ts", name = "q", descriptor = "[Lmq;")
    public static class71[] field551 = new class71[2048];

    @OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
    public static int field550 = 0;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!ts", name = "o", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!ts", name = "s", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!ts", name = "v", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "(III)V")
    public final void method205(int arg0, int arg1, int arg2) {
        ++field553;
        if (arg0 != 2048) {
            this.field558 = -116;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
    public static void method206(int arg0) {
        field554 = null;
        field551 = null;
        if (arg0 != 29616) {
            method208(-125);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(III)V")
    public final void method207(int arg0, int arg1, int arg2) {
        ++field547;
        int var4 = this.field548 * arg2 >> 12;
        int var5 = this.field552 * arg2 >> 12;
        int var6 = this.field558 * arg1 >> 12;
        int var7 = this.field557 * arg1 >> 12;
        class270.method1616(super.field6091, var4, super.field6098, false, super.field6095, var7, var5, var6);
        if (arg0 != -1) {
            method206(119);
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
    public static final void method208(int arg0) {
        if (class298.field4389 < 102) {
            class298.field4389 += 6;
        }
        ++field546;
        if (~class94.field1457 != 0 && class60.method371(false) > class332.field4822) {
            for (int var1 = class94.field1457; class449.field6506.length > var1; ++var1) {
                if (class449.field6506[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class449.field6506[var1].substring(6));
                    } catch (Exception var13) {
                    }
                    class600.method3415("Pausing for " + var2 + " seconds...", true);
                    class94.field1457 = var1 + 1;
                    class332.field4822 = class60.method371(false) - -((long) (var2 * 1000));
                    return;
                }
                class362.field5322 = class449.field6506[var1];
                class512.method2898(false, 0);
            }
            class94.field1457 = -1;
        }
        if (~class623.field9013 != -1) {
            class217.field2899 -= class623.field9013 * 5;
            if (~class477.field6836 >= ~class217.field2899) {
                class217.field2899 = class477.field6836 + -1;
            }
            class623.field9013 = 0;
            if (class217.field2899 < 0) {
                class217.field2899 = 0;
            }
        }
        for (int var3 = arg0; var3 < class314.field4593; ++var3) {
            class439 var4 = class272.field3551[var3];
            int var5 = var4.method2606(true);
            char var6 = var4.method2604(-115);
            int var7 = var4.method2605((byte) 19);
            if (var5 == 84) {
                class512.method2898(false, 0);
            }
            if (var5 == 80) {
                class512.method2898(true, 0);
            } else if (~var5 == -67 && (var7 & 4) != 0) {
                if (class562.field8219 != null) {
                    String var11 = "";
                    for (int var12 = class69.field1078.length - 1; var12 >= 0; --var12) {
                        if (class69.field1078[var12] != null && class69.field1078[var12].length() > 0) {
                            var11 = var11 + class69.field1078[var12] + '\n';
                        }
                    }
                    class562.field8219.setContents(new StringSelection(var11), (ClipboardOwner) null);
                }
            } else if (var5 == 67 && (4 & var7) != 0) {
                if (class562.field8219 != null) {
                    Transferable var8 = class562.field8219.getContents((Object) null);
                    if (var8 != null) {
                        try {
                            String var9 = (String) var8.getTransferData(DataFlavor.stringFlavor);
                            if (var9 != null) {
                                String[] var10 = class509.method2891(var9, '\n', arg0 ^ 67);
                                class187.method1240(var10, (byte) -128);
                            }
                        } catch (Exception var14) {
                        }
                    }
                }
            } else if (~var5 == -86 && ~class576.field8374 < -1) {
                class362.field5322 = class362.field5322.substring(0, class576.field8374 + -1) + class362.field5322.substring(class576.field8374);
                --class576.field8374;
            } else if (~var5 == -102 && ~class576.field8374 > ~class362.field5322.length()) {
                class362.field5322 = class362.field5322.substring(0, class576.field8374) + class362.field5322.substring(class576.field8374 + 1);
            } else if (~var5 == -97 && ~class576.field8374 < -1) {
                --class576.field8374;
            } else if (var5 == 97 && ~class576.field8374 > ~class362.field5322.length()) {
                ++class576.field8374;
            } else if (var5 != 102) {
                if (var5 != 103) {
                    if (~var5 == -105 && class569.field8287 < class69.field1078.length) {
                        ++class569.field8287;
                        class12.method85((byte) 82);
                        class576.field8374 = class362.field5322.length();
                    } else if (~var5 == -106 && ~class569.field8287 < -1) {
                        --class569.field8287;
                        class12.method85((byte) 59);
                        class576.field8374 = class362.field5322.length();
                    } else if (class36.method212(-28476, var6) || ~var6 == -93 || ~var6 == -48 || var6 == '.' || ~var6 == -59 || ~var6 == -45 || ~var6 == -33 || var6 == '_' || var6 == '-' || var6 == '+' || var6 == '[' || var6 == ']') {
                        class362.field5322 = class362.field5322.substring(0, class576.field8374) + class272.field3551[var3].method2604(-72) + class362.field5322.substring(class576.field8374);
                        ++class576.field8374;
                    }
                } else {
                    class576.field8374 = class362.field5322.length();
                }
            } else {
                class576.field8374 = 0;
            }
        }
        class314.field4593 = 0;
        class417.field6162 = 0;
        class12.method83((byte) -127);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method209(String arg0, int arg1) {
        ++field549;
        int var2 = 46 / ((-70 - arg1) / 45);
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; ~class564.field8248 < ~var3; ++var3) {
                if (arg0.equalsIgnoreCase(class268.field3501[var3])) {
                    return true;
                }
                if (arg0.equalsIgnoreCase(class656.field9378[var3])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(III)V")
    public final void method210(int arg0, int arg1, int arg2) {
        if (arg1 != 27775) {
            this.method210(-54, 50, -45);
        }
        ++field556;
        int var4 = this.field548 * arg0 >> 12;
        int var5 = this.field552 * arg0 >> 12;
        int var6 = this.field558 * arg2 >> 12;
        int var7 = this.field557 * arg2 >> 12;
        class389.method2396(var7, var5, var6, (byte) -123, var4, super.field6095);
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(IIIIIII)V")
    public class35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field558 = arg1;
        this.field557 = arg3;
        this.field552 = arg2;
        this.field548 = arg0;
    }
}
