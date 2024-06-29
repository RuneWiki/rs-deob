import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class119 extends class320 {

    @OriginalMember(owner = "client!gm", name = "J", descriptor = "Z")
    public boolean field1825 = true;

    @OriginalMember(owner = "client!gm", name = "I", descriptor = "I")
    public static int field1824 = 20;

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!gm", name = "C", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!gm", name = "D", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!gm", name = "E", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!gm", name = "F", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!gm", name = "H", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!gm", name = "M", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!gm", name = "N", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!gm", name = "O", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!gm", name = "P", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!gm", name = "Q", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!gm", name = "V", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!gm", name = "U", descriptor = "Lie;")
    public static class330 field1835;

    @OriginalMember(owner = "client!gm", name = "S", descriptor = "[I")
    private int[] field1833;

    @OriginalMember(owner = "client!gm", name = "T", descriptor = "[I")
    public int[] field1834;

    @OriginalMember(owner = "client!gm", name = "R", descriptor = "[Ljava/lang/String;")
    private String[] field1832;

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "[[I")
    private int[][] field1822;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(III)I", line = 13)
    public final int method1006(int arg0, int arg1, int arg2) {
        field1819++;
        if (this.field1833 == null || arg2 < 0 || this.field1833.length < arg2) {
            return -1;
        } else if (this.field1822[arg2] == null || arg0 < 0 || arg0 > this.field1822[arg2].length) {
            return -1;
        } else {
            if (arg1 != 11241) {
                this.method1017((class25) null, (byte) 30);
            }
            return this.field1822[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IBLug;)V", line = 34)
    private final void method1007(int arg0, byte arg1, class25 arg2) {
        if (arg0 == 1) {
            this.field1832 = class231.method1733(arg2.method297((byte) -66), 0, '<');
        } else if (arg0 == 2) {
            int var8 = arg2.method281(-128);
            this.field1834 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1834[var9] = arg2.method314((byte) 31);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method281(-126);
            this.field1833 = new int[var4];
            this.field1822 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method314((byte) 108);
                this.field1833[var5] = var6;
                this.field1822[var5] = new int[class41.field656[var6]];
                for (int var7 = 0; var7 < class41.field656[var6]; var7++) {
                    this.field1822[var5][var7] = arg2.method314((byte) 28);
                }
            }
        } else if (arg0 == 4) {
            this.field1825 = false;
        }
        field1828++;
        if (arg1 <= 88) {
            field1824 = -44;
        }
    }

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "(I)I", line = 100)
    public final int method1008(int arg0) {
        if (arg0 != 29109) {
            this.method1006(57, -67, -42);
        }
        field1830++;
        return this.field1833 == null ? 0 : this.field1833.length;
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(B)V", line = 115)
    public final void method1009(byte arg0) {
        int var2 = 25 / ((arg0 - 51) / 63);
        if (this.field1834 != null) {
            for (int var3 = 0; var3 < this.field1834.length; var3++) {
                this.field1834[var3] = class41.method426(this.field1834[var3], 32768);
            }
        }
        field1829++;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BB)V", line = 132)
    public static final void method1010(byte arg0, byte arg1) {
        if (class157.field2521 == null) {
            class157.field2521 = new byte[4][104][104];
        }
        if (arg1 > -103) {
            return;
        }
        field1820++;
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class157.field2521[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lug;[II)V", line = 171)
    public final void method1011(class25 arg0, int[] arg1, int arg2) {
        field1816++;
        if (this.field1833 == null) {
            return;
        }
        for (int var4 = 0; this.field1833.length > var4 && var4 < arg1.length; var4++) {
            int var5 = class23.field353[this.method1014(var4, -1)];
            if (var5 > 0) {
                arg0.method295(var5, (long) arg1[var4], -8);
            }
        }
        if (arg2 != 20) {
            this.field1834 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(III)I", line = 204)
    public static final int method1012(int arg0, int arg1, int arg2) {
        field1827++;
        if (arg2 >= -119) {
            method1019(-18, 110, (String) null);
        }
        if (arg0 > arg1) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(B)V", line = 239)
    public static void method1013(byte arg0) {
        field1835 = null;
        if (arg0 != 121) {
            field1824 = -62;
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(II)I", line = 249)
    public final int method1014(int arg0, int arg1) {
        field1831++;
        if (arg1 != -1) {
            this.field1825 = false;
        }
        return this.field1833 == null || arg0 < 0 || arg0 > this.field1833.length ? -1 : this.field1833[arg0];
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILug;)V", line = 267)
    public final void method1015(int arg0, class25 arg1) {
        while (true) {
            int var3 = arg1.method281(73);
            if (var3 == 0) {
                field1823++;
                if (arg0 > -4) {
                    method1019(-1, 71, (String) null);
                }
                return;
            }
            this.method1007(var3, (byte) 110, arg1);
        }
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(III)V", line = 286)
    public static final void method1016(int arg0, int arg1, int arg2) {
        field1818++;
        if (arg0 > -106) {
            method1019(78, 7, (String) null);
        }
        class138 var3 = class149.method1242(arg1, 0, 13);
        var3.method1153((byte) 50);
        var3.field2282 = arg2;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lug;B)Ljava/lang/String;", line = 309)
    public final String method1017(class25 arg0, byte arg1) {
        int var3 = 3 / ((arg1 + 25) / 59);
        field1817++;
        StringBuffer var4 = new StringBuffer(80);
        if (this.field1833 != null) {
            for (int var5 = 0; var5 < this.field1833.length; var5++) {
                var4.append(this.field1832[var5]);
                var4.append(class62.method620(arg0.method313((byte) -78, class276.field4275[this.field1833[var5]]), this.field1822[var5], this.field1833[var5], false));
            }
        }
        var4.append(this.field1832[this.field1832.length - 1]);
        return var4.toString();
    }

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "(I)Ljava/lang/String;", line = 340)
    public final String method1018(int arg0) {
        int var2 = 6 % ((-arg0 - 6) / 62);
        StringBuffer var3 = new StringBuffer(80);
        field1836++;
        if (this.field1832 == null) {
            return "";
        }
        var3.append(this.field1832[0]);
        for (int var4 = 1; var4 < this.field1832.length; var4++) {
            var3.append("...");
            var3.append(this.field1832[var4]);
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILjava/lang/String;)I", line = 367)
    public static final int method1019(int arg0, int arg1, String arg2) {
        if (arg0 != -3) {
            field1824 = 48;
        }
        field1821++;
        return class293.method2117(arg2, (byte) 76, arg1, true);
    }
}
