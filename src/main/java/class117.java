import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class117 extends class213 {

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "Z")
    public boolean field1523 = true;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "[I")
    public static int[] field1528 = new int[14];

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "Lic;")
    public static class329 field1529 = new class329(16);

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "Lvn;")
    public static class11 field1527;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "Ljava/awt/Frame;")
    public static Frame field1519;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "[I")
    private int[] field1515;

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "[I")
    public int[] field1530;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "[Ljava/lang/String;")
    private String[] field1533;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "[[I")
    private int[][] field1516;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lco;)V", line = 7)
    public static final void method853(class294 arg0) {
        for (int var1 = arg0.field4283; var1 <= arg0.field4285; var1++) {
            for (int var2 = arg0.field4287; var2 <= arg0.field4276; var2++) {
                class119 var3 = class345.field5367[arg0.field4278][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1563; var4++) {
                        if (var3.field1549[var4] == arg0) {
                            var3.field1563--;
                            for (int var5 = var4; var5 < var3.field1563; var5++) {
                                var3.field1549[var5] = var3.field1549[var5 + 1];
                                var3.field1568[var5] = var3.field1568[var5 + 1];
                            }
                            var3.field1549[var3.field1563] = null;
                            break;
                        }
                    }
                    var3.field1560 = 0;
                    for (int var6 = 0; var6 < var3.field1563; var6++) {
                        var3.field1560 |= var3.field1568[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)I", line = 71)
    public final int method854(int arg0) {
        field1531++;
        if (arg0 != 0) {
            field1529 = (class329) null;
        }
        return this.field1515 == null ? 0 : this.field1515.length;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)I", line = 87)
    public final int method855(int arg0, int arg1, int arg2) {
        field1525++;
        if (arg1 != 0) {
            this.method860(20, (class299) null);
        }
        if (this.field1515 == null || arg2 < 0 || arg2 > this.field1515.length) {
            return -1;
        } else if (this.field1516[arg2] == null || arg0 < 0 || arg0 > this.field1516[arg2].length) {
            return -1;
        } else {
            return this.field1516[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)I", line = 106)
    public final int method856(int arg0, int arg1) {
        if (arg1 == 0) {
            field1520++;
            return this.field1515 == null || arg0 < 0 || arg0 > this.field1515.length ? -1 : this.field1515[arg0];
        } else {
            return -72;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZLfd;)V", line = 121)
    private final void method857(int arg0, boolean arg1, class299 arg2) {
        field1526++;
        if (arg1) {
            field1527 = (class11) null;
        }
        if (arg0 == 1) {
            this.field1533 = class91.method655(0, '<', arg2.method2060(-12482));
        } else if (arg0 == 2) {
            int var8 = arg2.method2096((byte) -122);
            this.field1530 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1530[var9] = arg2.method2083((byte) -58);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method2096((byte) -122);
            this.field1516 = new int[var4][];
            this.field1515 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method2083((byte) -97);
                this.field1515[var5] = var6;
                this.field1516[var5] = new int[class58.field740[var6]];
                for (int var7 = 0; var7 < class58.field740[var6]; var7++) {
                    this.field1516[var5][var7] = arg2.method2083((byte) -20);
                }
            }
        } else if (arg0 == 4) {
            this.field1523 = false;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IC)Z", line = 194)
    public static final boolean method858(int arg0, char arg1) {
        field1524++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            if (arg0 != 80) {
                field1527 = (class11) null;
            }
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lfd;I)V", line = 217)
    public final void method859(class299 arg0, int arg1) {
        if (arg1 != 0) {
            this.field1523 = false;
        }
        field1532++;
        while (true) {
            int var3 = arg0.method2096((byte) -122);
            if (var3 == 0) {
                return;
            }
            this.method857(var3, false, arg0);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILfd;)Ljava/lang/String;", line = 239)
    public final String method860(int arg0, class299 arg1) {
        field1521++;
        if (arg0 >= -49) {
            return (String) null;
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field1515 != null) {
            for (int var4 = 0; var4 < this.field1515.length; var4++) {
                var3.append(this.field1533[var4]);
                var3.append(class284.method1929(arg1.method2063(-124, class344.field5346[this.field1515[var4]]), 1544261996, this.field1515[var4], this.field1516[var4]));
            }
        }
        var3.append(this.field1533[this.field1533.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V", line = 268)
    public final void method861(int arg0) {
        int var2 = -52 / ((-arg0 - 21) / 57);
        field1518++;
        if (this.field1530 != null) {
            for (int var3 = 0; var3 < this.field1530.length; var3++) {
                this.field1530[var3] = class80.method568(this.field1530[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([IBLfd;)V", line = 292)
    public final void method862(int[] arg0, byte arg1, class299 arg2) {
        field1517++;
        if (this.field1515 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field1515.length && var4 < arg0.length; var4++) {
            int var5 = class245.field3577[this.method856(var4, 0)];
            if (var5 > 0) {
                arg2.method2073((long) arg0[var4], true, var5);
            }
        }
        if (arg1 != 107) {
            this.field1516 = (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V", line = 320)
    public static void method863(boolean arg0) {
        field1528 = null;
        field1519 = null;
        if (!arg0) {
            method863(false);
        }
        field1527 = null;
        field1529 = null;
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)Ljava/lang/String;", line = 337)
    public final String method864(int arg0) {
        StringBuffer var2 = new StringBuffer(80);
        field1522++;
        if (arg0 != 17538) {
            return (String) null;
        } else if (this.field1533 == null) {
            return "";
        } else {
            var2.append(this.field1533[0]);
            for (int var3 = 1; var3 < this.field1533.length; var3++) {
                var2.append("...");
                var2.append(this.field1533[var3]);
            }
            return var2.toString();
        }
    }
}
