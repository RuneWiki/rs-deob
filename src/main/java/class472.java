import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class472 {

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "I")
    private int field5833 = -1;

    @OriginalMember(owner = "client!bda", name = "n", descriptor = "I")
    private int field5841 = 0;

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "Lws;")
    private class333 field5832 = new class333();

    @OriginalMember(owner = "client!bda", name = "p", descriptor = "Z")
    public boolean field5843 = false;

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "I")
    private int field5829;

    @OriginalMember(owner = "client!bda", name = "h", descriptor = "I")
    private int field5835;

    @OriginalMember(owner = "client!bda", name = "m", descriptor = "[[[I")
    private int[][][] field5840;

    @OriginalMember(owner = "client!bda", name = "l", descriptor = "[Lae;")
    private class235[] field5839;

    @OriginalMember(owner = "client!bda", name = "k", descriptor = "Lnba;")
    public static class278 field5838 = new class278();

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!bda", name = "g", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!bda", name = "i", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!bda", name = "j", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!bda", name = "o", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field5828;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IBIII[BI)Z")
    public static final boolean method2561(int arg0, byte arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        field5842++;
        int var7 = arg2 % arg0;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg0 - var7;
        }
        int var9 = -((arg4 + arg0 - 1) / arg0);
        int var10 = -((arg0 + arg2 - 1) / arg0);
        if (arg1 > -38) {
            field5838 = null;
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg5[arg6] == 0) {
                    return true;
                }
                arg6 += arg0;
            }
            int var13 = arg6 - var8;
            if (arg5[var13 - 1] == 0) {
                return true;
            }
            arg6 = arg3 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method2562(byte arg0) {
        field5837++;
        if (this.field5835 != this.field5829) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 < 97) {
            return null;
        } else {
            for (int var2 = 0; var2 < this.field5829; var2++) {
                this.field5839[var2] = class278.field3532;
            }
            return this.field5840;
        }
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(B)V")
    public static void method2563(byte arg0) {
        field5838 = null;
        field5828 = null;
        if (arg0 >= -14) {
            field5828 = null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(B)V")
    public static final void method2564(byte arg0) {
        if (arg0 > -69) {
            method2561(-52, (byte) -99, -118, -2, -3, null, 43);
        }
        class117.field1453.method3839((byte) -92);
        field5830++;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IZIIZIIII)Z")
    public static final boolean method2565(int arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        field5836++;
        int var9 = class67.field815.field508[0];
        int var10 = class67.field815.field511[0];
        if (var9 < 0 || class85.field1090 <= var9 || var10 < 0 || var10 >= class656.field8932) {
            return false;
        } else if (arg3 >= 0 && arg3 < class85.field1090 && arg8 >= 0 && arg8 < class656.field8932) {
            int var11 = class510.method2783(arg1, var10, class634.field8601[class67.field815.field8010], arg0, arg5, arg2, var9, arg8, arg3, class67.field815.method210(arg4), class20.field211, arg6, arg7, -96, class703.field9846);
            if (var11 < 1) {
                return false;
            }
            class295.field3763 = class20.field211[var11 - 1];
            class536.field6752 = class703.field9846[var11 - 1];
            class435.field5478 = false;
            class706.method3896(1);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(II)[[I")
    public final int[][] method2566(int arg0, int arg1) {
        if (arg0 != -27346) {
            this.method2566(-22, -125);
        }
        field5831++;
        if (this.field5835 == this.field5829) {
            this.field5843 = this.field5839[arg1] == null;
            this.field5839[arg1] = class278.field3532;
            return this.field5840[arg1];
        } else if (this.field5829 == 1) {
            this.field5843 = this.field5833 != arg1;
            this.field5833 = arg1;
            return this.field5840[0];
        } else {
            class235 var3 = this.field5839[arg1];
            if (var3 == null) {
                this.field5843 = true;
                if (this.field5829 > this.field5841) {
                    var3 = new class235(arg1, this.field5841);
                    this.field5841++;
                } else {
                    class235 var4 = (class235) this.field5832.method1911(7);
                    var3 = new class235(arg1, var4.field3042);
                    this.field5839[var4.field3045] = null;
                    var4.method1566(-62);
                }
                this.field5839[arg1] = var3;
            } else {
                this.field5843 = false;
            }
            this.field5832.method1907(30081, var3);
            return this.field5840[var3.field3042];
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
    public final void method2567(int arg0) {
        for (int var2 = 0; var2 < this.field5829; var2++) {
            this.field5840[var2][0] = null;
            this.field5840[var2][1] = null;
            this.field5840[var2][2] = null;
            this.field5840[var2] = null;
        }
        field5834++;
        this.field5840 = null;
        this.field5839 = null;
        int var3 = -125 % ((arg0 - 54) / 56);
        this.field5832.method1913((byte) 103);
        this.field5832 = null;
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(III)V")
    public class472(int arg0, int arg1, int arg2) {
        this.field5829 = arg0;
        this.field5835 = arg1;
        this.field5840 = new int[this.field5829][3][arg2];
        this.field5839 = new class235[this.field5835];
    }
}
