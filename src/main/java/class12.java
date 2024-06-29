import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class12 extends class16 {

    @OriginalMember(owner = "client!em", name = "Z", descriptor = "I")
    private int field140 = -1;

    @OriginalMember(owner = "client!em", name = "W", descriptor = "[I")
    public static int[] field137 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!em", name = "fb", descriptor = "Z")
    public static boolean field146 = false;

    @OriginalMember(owner = "client!em", name = "Q", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!em", name = "R", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!em", name = "S", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!em", name = "T", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!em", name = "U", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!em", name = "V", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!em", name = "X", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!em", name = "ab", descriptor = "I")
    public int field141;

    @OriginalMember(owner = "client!em", name = "db", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!em", name = "eb", descriptor = "I")
    public int field145;

    @OriginalMember(owner = "client!em", name = "gb", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!em", name = "hb", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!em", name = "ib", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!em", name = "jb", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!em", name = "bb", descriptor = "Lji;")
    public static class114 field142;

    @OriginalMember(owner = "client!em", name = "cb", descriptor = "Lva;")
    public static class156 field143;

    @OriginalMember(owner = "client!em", name = "Y", descriptor = "[I")
    public int[] field139;

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V", line = 8)
    public class12() {
        super(0, false);
    }

    @OriginalMember(owner = "client!em", name = "f", descriptor = "(I)V", line = 14)
    public final void method68(int arg0) {
        super.method68(arg0);
        field144++;
        this.field139 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lkb;IIIZI)V", line = 23)
    public static final void method69(class39 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class37.field497 = 1;
        class310.field4845 = arg5;
        field135++;
        if (arg1 < 122) {
            field137 = (int[]) null;
        }
        class64.field853 = arg0;
        class305.field4753 = arg2;
        class226.field3585 = 10000;
        field147 = arg3;
        class59.field770 = arg4;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)I", line = 57)
    public final int method70(int arg0) {
        field138++;
        return arg0 == 0 ? this.field140 : 12;
    }

    @OriginalMember(owner = "client!em", name = "g", descriptor = "(I)V", line = 82)
    public static void method71(int arg0) {
        field137 = null;
        field142 = null;
        if (arg0 != 16711680) {
            method71(-118);
        }
        field143 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)[[I", line = 94)
    public int[][] method54(int arg0, byte arg1) {
        field131++;
        int var3 = 64 / ((arg1 - 40) / 41);
        int[][] var4 = this.field197.method715(true, arg0);
        if (this.field197.field1548 && this.method72((byte) -94)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int var7 = this.field145 * (class294.field4619 == this.field141 ? arg0 : this.field141 * arg0 / class294.field4619);
            int[] var8 = var4[2];
            if (class276.field4376 == this.field145) {
                for (int var12 = 0; var12 < class276.field4376; var12++) {
                    int var13 = this.field139[var7++];
                    var8[var12] = class200.method1465(var13, 255) << 4;
                    var6[var12] = class200.method1465(var13 >> 4, 4080);
                    var5[var12] = class200.method1465(var13, 16711680) >> 12;
                }
            } else {
                for (int var9 = 0; var9 < class276.field4376; var9++) {
                    int var10 = this.field145 * var9 / class276.field4376;
                    int var11 = this.field139[var7 + var10];
                    var8[var9] = class200.method1465(var11, 255) << 4;
                    var6[var9] = class200.method1465(4080, var11 >> 4);
                    var5[var9] = class200.method1465(var11, 16711680) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BLim;I)V", line = 164)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        if (arg2 == 0) {
            this.field140 = arg1.method1396(arg0 - 23);
        }
        if (arg0 != -7) {
            field134 = -59;
        }
        field148++;
    }

    @OriginalMember(owner = "client!em", name = "e", descriptor = "(B)Z", line = 177)
    public final boolean method72(byte arg0) {
        field133++;
        if (arg0 >= -26) {
            field150 = 66;
        }
        if (this.field139 != null) {
            return true;
        } else if (this.field140 < 0) {
            return false;
        } else {
            class298 var2 = class194.field3177 < 0 ? class28.method188(class308.field4821, 31478, this.field140) : class39.method249(class308.field4821, this.field140, 0, class194.field3177);
            var2.method2079();
            this.field145 = var2.field5040;
            this.field141 = var2.field5030;
            this.field139 = var2.field4659;
            return true;
        }
    }
}
