import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class96 {

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    private int field1535 = -1;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    private int field1539;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    private int field1538;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    private int field1537;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "[Lfk;")
    private class14[] field1544;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "[Lfk;")
    private class14[] field1543;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "Lfk;")
    private class14 field1536;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    private int field1534;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    private int field1542;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "Luf;")
    public static class176 field1541;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "La;")
    private class49 field1545;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Luf;)V")
    public static final void method742(class176 arg0) {
        field1541 = arg0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
    private final void method743(int arg0) {
        if (this.field1535 == arg0) {
            return;
        }
        this.field1535 = arg0;
        int var2 = class77.method618(arg0, (byte) 119);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field1534 != var2) {
            this.field1534 = var2;
            this.field1545 = null;
        }
        if (this.field1544 == null) {
            return;
        }
        this.field1542 = 0;
        int[] var3 = new int[this.field1544.length];
        for (int var4 = 0; var4 < this.field1544.length; var4++) {
            class14 var5 = this.field1544[var4];
            if (var5.method136(this.field1540, this.field1539, this.field1538, this.field1535)) {
                var3[this.field1542] = var5.field235;
                this.field1543[this.field1542++] = var5;
            }
        }
        class294.method1975(this.field1542 - 1, var3, this.field1543, 0, (byte) 126);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "()V")
    public static void method744() {
        field1541 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIIIII)V")
    public final void method745(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method743(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field1537 == -1) {
            class201.method1333(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field1545 == null) {
                this.field1545 = class97.field1547.method1896(this.field1534, false, class97.field1549, this.field1537, false);
            }
            if (!class97.field1547.method1892((byte) -33, this.field1537)) {
                class201.method1333(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field1545 != null) {
                int var10 = arg4 * arg5 / -512;
                int var11;
                for (var11 = arg4 * var9 / 512 + (arg3 - arg4) / 2; var11 > arg4; var11 -= arg4) {
                }
                while (var11 < 0) {
                    var11 += arg4;
                }
                while (var10 > arg4) {
                    var10 -= arg4;
                }
                while (var10 < 0) {
                    var10 += arg4;
                }
                for (int var12 = var11 - arg4; var12 < class201.field3146; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class201.field3144; var13 += arg4) {
                        this.field1545.method39(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field1542 - 1; var14 >= 0; var14--) {
            this.field1543[var14].method143(arg1, arg2, arg3, arg4, arg5, var9, this.field1536);
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(I[Lfk;IIII)V")
    public class96(int arg0, class14[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1540 = arg3;
        this.field1539 = arg4;
        this.field1538 = arg5;
        this.field1537 = arg0;
        this.field1544 = arg1;
        if (arg1 == null) {
            this.field1543 = null;
            this.field1536 = null;
        } else {
            this.field1543 = new class14[arg1.length];
            this.field1536 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
