import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class714 extends class735 {

    @OriginalMember(owner = "client!vha", name = "w", descriptor = "Z")
    public static boolean field9824 = false;

    @OriginalMember(owner = "client!vha", name = "B", descriptor = "Ljava/lang/String;")
    public static String field9829 = null;

    @OriginalMember(owner = "client!vha", name = "E", descriptor = "[I")
    public static int[] field9832 = new int[6];

    @OriginalMember(owner = "client!vha", name = "s", descriptor = "B")
    private byte field9820;

    @OriginalMember(owner = "client!vha", name = "u", descriptor = "B")
    private byte field9822;

    @OriginalMember(owner = "client!vha", name = "D", descriptor = "B")
    private byte field9831;

    @OriginalMember(owner = "client!vha", name = "F", descriptor = "B")
    private byte field9833;

    @OriginalMember(owner = "client!vha", name = "x", descriptor = "D")
    public static double field9825;

    @OriginalMember(owner = "client!vha", name = "t", descriptor = "I")
    public static int field9821;

    @OriginalMember(owner = "client!vha", name = "v", descriptor = "I")
    public static int field9823;

    @OriginalMember(owner = "client!vha", name = "y", descriptor = "I")
    public static int field9826;

    @OriginalMember(owner = "client!vha", name = "z", descriptor = "I")
    public static int field9827;

    @OriginalMember(owner = "client!vha", name = "A", descriptor = "I")
    public static int field9828;

    @OriginalMember(owner = "client!vha", name = "G", descriptor = "I")
    public static int field9834;

    @OriginalMember(owner = "client!vha", name = "H", descriptor = "I")
    public static int field9835;

    @OriginalMember(owner = "client!vha", name = "C", descriptor = "Z")
    private boolean field9830;

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(IB)V", line = 8)
    public static final void method3972(int arg0, byte arg1) {
        if (class101.field1628 == null) {
            class101.field1628 = new byte[4][class483.field6515][class65.field926];
        }
        field9835++;
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class483.field6515; var3++) {
                for (int var4 = 0; var4 < class65.field926; var4++) {
                    class101.field1628[var2][var3][var4] = arg1;
                }
            }
        }
        if (arg0 != 6) {
            method3972(-46, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(Llu;BZZLjava/lang/String;)V", line = 45)
    public static final void method3973(class742 arg0, byte arg1, boolean arg2, boolean arg3, String arg4) {
        field9827++;
        if (arg2) {
            if (class742.field10234.startsWith("win") && arg0.field10241) {
                String var5 = null;
                if (class286.field3936 != null) {
                    var5 = class286.field3936.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class545 var6 = class556.method3201(0, true, arg0, arg4);
                    class651.field9023 = arg0;
                    class102.field1650 = arg4;
                    class462.field6286 = var6;
                    return;
                }
            }
            if (class742.field10234.startsWith("mac")) {
                String var7 = null;
                if (class286.field3936 != null) {
                    var7 = class286.field3936.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg3) {
                    class556.method3201(1, true, arg0, arg4);
                    return;
                }
            }
            class556.method3201(2, true, arg0, arg4);
        } else {
            class556.method3201(3, true, arg0, arg4);
        }
        if (arg1 != -86) {
            method3976(null, (byte) 114);
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(I[B)V", line = 113)
    public static final void method3974(int arg0, byte[] arg1) {
        field9821++;
        class93 var2 = new class93(arg1);
        while (true) {
            while (true) {
                int var3 = var2.method793((byte) 32);
                if (var3 == 0) {
                    if (arg0 != 0) {
                        field9829 = null;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    int[] var4 = class155.field2535 = new int[6];
                    var4[0] = var2.method763(-51);
                    var4[1] = var2.method763(94);
                    var4[2] = var2.method763(-85);
                    var4[3] = var2.method763(arg0 - 89);
                    var4[4] = var2.method763(112);
                    var4[5] = var2.method763(-3);
                } else if (var3 == 4) {
                    int var5 = var2.method793((byte) 50);
                    class695.field9615 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        class695.field9615[var6] = var2.method763(-107);
                        if (class695.field9615[var6] == 65535) {
                            class695.field9615[var6] = -1;
                        }
                    }
                } else if (var3 == 5) {
                    int var7 = var2.method793((byte) 121);
                    class766.field10568 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        class766.field10568[var8] = var2.method763(110);
                        if (class766.field10568[var8] == 65535) {
                            class766.field10568[var8] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(I)V", line = 189)
    public static void method3975(int arg0) {
        field9829 = null;
        field9832 = null;
        int var1 = 98 % (-arg0 / 61);
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lbl;B)I", line = 202)
    public static final int method3976(class677 arg0, byte arg1) {
        field9823++;
        if (class170.field2717 == arg0) {
            return 9216;
        } else if (class5.field69 == arg0) {
            return 34065;
        } else if (class519.field7045 == arg0) {
            return 34066;
        } else {
            if (arg1 > -17) {
                field9832 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(ILfca;)V", line = 236)
    public final void method627(int arg0, class93 arg1) {
        this.field9830 = arg1.method793((byte) 10) == 1;
        if (arg0 != 5) {
            this.field9822 = 2;
        }
        field9828++;
        this.field9833 = arg1.method766((byte) 122);
        this.field9822 = arg1.method766((byte) 122);
        this.field9831 = arg1.method766((byte) 122);
        this.field9820 = arg1.method766((byte) 122);
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lrh;Z)V", line = 253)
    public final void method624(class280 arg0, boolean arg1) {
        arg0.field3894 = this.field9830;
        arg0.field3864 = this.field9822;
        arg0.field3870 = this.field9820;
        arg0.field3866 = this.field9831;
        field9826++;
        if (arg1) {
            method3974(-99, null);
        }
        arg0.field3897 = this.field9833;
    }
}
