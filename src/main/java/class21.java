import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class21 extends class308 {

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    public static int field254 = 0;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    public static int field262 = 0;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "[I")
    public static int[] field263 = new int[100];

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "[I")
    public static int[] field260 = new int[200];

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
    public static int field269 = 1;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "C")
    private char field267;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public int field264;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "Ljava/lang/String;")
    public String field252;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "[I")
    public static int[] field253;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(ZI)V", line = 4)
    public static final void method126(boolean arg0, int arg1) {
        class13.field169 = arg1;
        class192.method1324(3, (byte) 87);
        class192.method1324(4, (byte) 87);
        if (arg0) {
            method126(true, -29);
        }
        field265++;
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)Z", line = 25)
    public final boolean method127(int arg0) {
        field257++;
        if (arg0 >= -3) {
            this.field252 = (String) null;
        }
        return this.field267 == 's';
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIII)V", line = 36)
    public static final void method128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field256++;
        if (arg5 >= 27 && class31.method266(arg0, 1)) {
            client.method903(class167.field2627[arg0], -1, arg4, arg1, arg3, arg2, arg7, arg6);
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)Z", line = 54)
    public static final boolean method129(byte arg0) {
        field258++;
        if (class5.field60) {
            try {
                class73.method499(arg0 ^ 0xFFFFFFB9, "showVideoAd", class96.field1382.field4515);
                return true;
            } catch (Throwable var2) {
            }
        }
        return arg0 != -92;
    }

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)V", line = 75)
    public static void method130(int arg0) {
        if (arg0 == 1) {
            field253 = null;
            field263 = null;
            field260 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "(I)V", line = 91)
    public static final void method131(int arg0) {
        field266++;
        if (class291.field4828 != null) {
            class291.field4828.method1092(-26619);
        }
        if (class15.field199 != null) {
            class15.field199.method1092(-26619);
        }
        class96.method634(2, true, 22050, class352.field5610);
        class291.field4828 = class248.method1758(0, 22050, class96.field1382, false, class235.field3731);
        class291.field4828.method1095(class340.field5465, 0);
        class15.field199 = class248.method1758(1, 2048, class96.field1382, false, class235.field3731);
        class15.field199.method1095(class28.field434, arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILkl;I)V", line = 116)
    public static final void method132(int arg0, int arg1, class39 arg2, int arg3) {
        field250++;
        if (arg0 != -17367) {
            method132(38, 68, (class39) null, 99);
        }
        if (arg2.field4795 == arg1 && arg1 != -1) {
            class131 var4 = class68.method476((byte) 118, arg1);
            int var5 = var4.field2004;
            if (var5 == 1) {
                arg2.field4767 = 1;
                arg2.field4773 = 0;
                arg2.field4703 = 0;
                arg2.field4776 = 0;
                arg2.field4715 = arg3;
                class276.method1970(var4, class329.field5388 == arg2, arg2.field4783, arg0 ^ 0xFFFFBC72, arg2.field4796, arg2.field4773);
            }
            if (var5 == 2) {
                arg2.field4703 = 0;
            }
        } else if (arg1 == -1 || arg2.field4795 == -1 || class68.method476((byte) 104, arg1).field2011 >= class68.method476((byte) 117, arg2.field4795).field2011) {
            arg2.field4776 = 0;
            arg2.field4773 = 0;
            arg2.field4703 = 0;
            arg2.field4694 = arg2.field4792;
            arg2.field4795 = arg1;
            arg2.field4715 = arg3;
            arg2.field4767 = 1;
            if (arg2.field4795 != -1) {
                class276.method1970(class68.method476((byte) 120, arg2.field4795), class329.field5388 == arg2, arg2.field4783, arg0 ^ 0xFFFFBC57, arg2.field4796, arg2.field4773);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "(I)V", line = 169)
    public static final void method133(int arg0) {
        class143.field2302.method651(0);
        field249++;
        if (arg0 >= -73) {
            method129((byte) 22);
        }
        class347.field5559.method651(0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lfh;Z)V", line = 181)
    public final void method134(class313 arg0, boolean arg1) {
        field259++;
        if (!arg1) {
            this.method134((class313) null, true);
        }
        while (true) {
            int var3 = arg0.method2224(-126);
            if (var3 == 0) {
                return;
            }
            this.method137(arg0, var3, 2);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILjava/lang/String;)V", line = 212)
    public static final void method135(int arg0, int arg1, String arg2) {
        class211 var3 = class17.method115(arg1, arg0, 4086);
        field255++;
        var3.method1433(true);
        var3.field3213 = arg2;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLnm;Lme;ZLnm;)V", line = 222)
    public static final void method136(byte arg0, class221 arg1, class82 arg2, boolean arg3, class221 arg4) {
        class276.field4551 = arg4;
        class37.field554 = arg3;
        field251++;
        class246.field3902 = arg1;
        if (arg0 > -72) {
            method130(-78);
        }
        int var5 = class276.field4551.method1503(false) - 1;
        class6.field82 = var5 * 256 + class276.field4551.method1486(var5, -27734);
        class345.field5532 = new String[] { null, null, null, null, class353.field5622 };
        class34.field529 = new String[] { null, null, class76.field1142, null, null };
        class265.field4365 = arg2;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lfh;II)V", line = 244)
    private final void method137(class313 arg0, int arg1, int arg2) {
        if (arg2 != 2) {
            field248 = -49;
        }
        if (arg1 == 1) {
            this.field267 = class121.method782(false, arg0.method2200(69));
        } else if (arg1 == 2) {
            this.field264 = arg0.method2231((byte) -125);
        } else if (arg1 == 5) {
            this.field252 = arg0.method2198(-430);
        }
        field261++;
    }
}
