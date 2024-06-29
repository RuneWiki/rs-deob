import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class108 extends class4 {

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "Z")
    public boolean field1790 = true;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "Lf;")
    public static class36 field1787 = null;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "Ljava/lang/String;")
    public static String field1784 = "Please remove ";

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "[I")
    public static int[] field1795 = new int[14];

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "Laf;")
    public static class68 field1777 = new class68(20);

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "[I")
    private int[] field1779;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "[I")
    public int[] field1791;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field1781;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field1788;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "[[I")
    private int[][] field1789;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBI)I")
    public final int method787(int arg0, byte arg1, int arg2) {
        field1794++;
        if (this.field1779 == null || arg0 < 0 || arg0 > this.field1779.length) {
            return -1;
        } else {
            if (arg1 >= -10) {
                this.method789((class221) null, (byte) 45);
            }
            return this.field1789[arg0] == null || arg2 < 0 || this.field1789[arg0].length < arg2 ? -1 : this.field1789[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)I")
    public final int method788(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method791((byte) -111, (class221) null);
        }
        field1778++;
        return this.field1779 == null || arg1 < 0 || arg1 > this.field1779.length ? -1 : this.field1779[arg1];
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Log;B)Ljava/lang/String;")
    public final String method789(class221 arg0, byte arg1) {
        field1785++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field1779 != null) {
            for (int var4 = 0; var4 < this.field1779.length; var4++) {
                var3.append(this.field1781[var4]);
                var3.append(class199.method1349(this.field1779[var4], this.field1789[var4], arg0.method1560(class99.field1637[this.field1779[var4]], 0), (byte) -125));
            }
        }
        var3.append(this.field1781[this.field1781.length - 1]);
        if (arg1 != -128) {
            field1777 = null;
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)V")
    public static void method790(int arg0) {
        field1787 = null;
        field1777 = null;
        field1784 = null;
        field1788 = null;
        if (arg0 < 90) {
            field1787 = null;
        }
        field1795 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLog;)V")
    public final void method791(byte arg0, class221 arg1) {
        while (true) {
            int var3 = arg1.method1517((byte) -96);
            if (var3 == 0) {
                field1793++;
                if (arg0 >= -63) {
                    method790(-17);
                    return;
                }
                return;
            }
            this.method795(arg1, var3, -17033);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)Ljava/lang/String;")
    public final String method792(byte arg0) {
        field1783++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field1781 == null) {
            return "";
        }
        var2.append(this.field1781[0]);
        for (int var3 = 1; var3 < this.field1781.length; var3++) {
            var2.append("...");
            var2.append(this.field1781[var3]);
        }
        if (arg0 > -62) {
            field1787 = null;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
    public final void method793(byte arg0) {
        field1786++;
        if (arg0 != -22) {
            field1777 = null;
        }
        if (this.field1791 != null) {
            for (int var2 = 0; var2 < this.field1791.length; var2++) {
                this.field1791[var2] = class220.method1495(this.field1791[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[ILog;)V")
    public final void method794(int arg0, int[] arg1, class221 arg2) {
        field1792++;
        if (this.field1779 == null) {
            return;
        }
        int var4 = 0;
        if (arg0 != -1) {
            this.method794(90, (int[]) null, (class221) null);
        }
        while (var4 < this.field1779.length) {
            if (arg1.length <= var4) {
                return;
            }
            int var5 = class64.field1035[this.method788(~arg0, var4)];
            if (var5 > 0) {
                arg2.method1516((byte) -112, (long) arg1[var4], var5);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Log;II)V")
    private final void method795(class221 arg0, int arg1, int arg2) {
        field1780++;
        if (arg2 != -17033) {
            return;
        }
        if (arg1 == 1) {
            this.field1781 = class68.method477(arg0.method1539(-100), '<', arg2 ^ 0xFFFFBD77);
        } else if (arg1 == 2) {
            int var8 = arg0.method1517((byte) -96);
            this.field1791 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1791[var9] = arg0.method1521((byte) 113);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method1517((byte) -96);
            this.field1779 = new int[var4];
            this.field1789 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1521((byte) 113);
                this.field1779[var5] = var6;
                this.field1789[var5] = new int[class129.field2088[var6]];
                for (int var7 = 0; var7 < class129.field2088[var6]; var7++) {
                    this.field1789[var5][var7] = arg0.method1521((byte) 113);
                }
            }
        } else if (arg1 == 4) {
            this.field1790 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)I")
    public final int method796(byte arg0) {
        if (arg0 != -124) {
            this.method787(39, (byte) 32, 92);
        }
        field1782++;
        return this.field1779 == null ? 0 : this.field1779.length;
    }
}
