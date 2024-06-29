import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class87 extends class137 {

    @OriginalMember(owner = "client!we", name = "H", descriptor = "Z")
    public boolean field1423 = true;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!we", name = "P", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!we", name = "S", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!we", name = "U", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!we", name = "V", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "Lfl;")
    public static class85 field1433;

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "[I")
    public int[] field1432;

    @OriginalMember(owner = "client!we", name = "T", descriptor = "[I")
    private int[] field1435;

    @OriginalMember(owner = "client!we", name = "O", descriptor = "[Ljava/lang/String;")
    private String[] field1430;

    @OriginalMember(owner = "client!we", name = "G", descriptor = "[[I")
    private int[][] field1422;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Z)V")
    public final void method589(boolean arg0) {
        field1427++;
        if (arg0) {
            this.method599(0, 100, 104);
        }
        if (this.field1432 != null) {
            for (int var2 = 0; var2 < this.field1432.length; var2++) {
                this.field1432[var2] = class173.method1263(this.field1432[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)V")
    public static final void method590(byte arg0, int arg1) {
        if (arg0 < 25) {
            method596((byte) 26);
        }
        class227 var2 = (class227) class1.field14.method1059(0, (long) arg1);
        field1431++;
        if (var2 != null) {
            var2.method913(-3542);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)I")
    public final int method591(byte arg0) {
        field1426++;
        if (this.field1435 == null) {
            return 0;
        } else {
            int var2 = 26 / ((-arg0 - 68) / 52);
            return this.field1435.length;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lwd;I)Ljava/lang/String;")
    public final String method592(class162 arg0, int arg1) {
        StringBuffer var3 = new StringBuffer(80);
        field1428++;
        if (this.field1435 != null) {
            for (int var4 = 0; var4 < this.field1435.length; var4++) {
                var3.append(this.field1430[var4]);
                var3.append(class129.method915(arg0.method1112(class144.field2273[this.field1435[var4]], 8), this.field1422[var4], (byte) 88, this.field1435[var4]));
            }
        }
        int var5 = -29 / ((arg1 + 60) / 62);
        var3.append(this.field1430[this.field1430.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)I")
    public final int method593(int arg0, int arg1) {
        field1424++;
        if (this.field1435 == null || arg0 < 0 || this.field1435.length < arg0) {
            return -1;
        } else {
            if (arg1 <= 49) {
                this.field1435 = null;
            }
            return this.field1435[arg0];
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILwd;)V")
    private final void method594(int arg0, int arg1, class162 arg2) {
        if (arg0 == 1) {
            this.field1430 = class268.method1801(arg2.method1152(-81), 114, '<');
        } else if (arg0 == 2) {
            int var8 = arg2.method1133((byte) 53);
            this.field1432 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1432[var9] = arg2.method1142(-18970);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method1133((byte) 53);
            this.field1422 = new int[var4][];
            this.field1435 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1142(-18970);
                this.field1435[var5] = var6;
                this.field1422[var5] = new int[class131.field2066[var6]];
                for (int var7 = 0; var7 < class131.field2066[var6]; var7++) {
                    this.field1422[var5][var7] = arg2.method1142(-18970);
                }
            }
        } else if (arg0 == 4) {
            this.field1423 = false;
        }
        field1437++;
        if (arg1 != -1) {
            method590((byte) 87, -66);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BLwd;)V")
    public final void method595(byte arg0, class162 arg1) {
        if (arg0 != -10) {
            return;
        }
        field1429++;
        while (true) {
            int var3 = arg1.method1133((byte) 53);
            if (var3 == 0) {
                return;
            }
            this.method594(var3, arg0 ^ 0x9, arg1);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
    public static void method596(byte arg0) {
        int var1 = -59 / ((63 - arg0) / 49);
        field1433 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([IILwd;)V")
    public final void method597(int[] arg0, int arg1, class162 arg2) {
        field1436++;
        if (this.field1435 == null) {
            return;
        }
        for (int var4 = 0; this.field1435.length > var4 && arg0.length > var4; var4++) {
            int var5 = class270.field4348[this.method593(var4, 52)];
            if (var5 > 0) {
                arg2.method1159((long) arg0[var4], var5, -124);
            }
        }
        if (arg1 != -32041) {
            field1433 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(Z)Ljava/lang/String;")
    public final String method598(boolean arg0) {
        field1425++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field1430 == null) {
            return "";
        }
        var2.append(this.field1430[0]);
        for (int var3 = 1; var3 < this.field1430.length; var3++) {
            var2.append("...");
            var2.append(this.field1430[var3]);
        }
        if (!arg0) {
            this.method597((int[]) null, -65, (class162) null);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)I")
    public final int method599(int arg0, int arg1, int arg2) {
        field1434++;
        if (this.field1435 == null || arg2 < 0 || this.field1435.length < arg2) {
            return -1;
        } else if (this.field1422[arg2] == null || arg0 < 0 || arg0 > this.field1422[arg2].length) {
            return -1;
        } else {
            int var4 = -119 / ((arg1 - 43) / 43);
            return this.field1422[arg2][arg0];
        }
    }
}
