import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class113 extends class264 {

    @OriginalMember(owner = "client!ol", name = "nb", descriptor = "I")
    private int field1684 = -1;

    @OriginalMember(owner = "client!ol", name = "pb", descriptor = "Lel;")
    public static class218 field1686 = new class218();

    @OriginalMember(owner = "client!ol", name = "rb", descriptor = "[I")
    public static int[] field1688 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ol", name = "tb", descriptor = "Lma;")
    public static class5 field1690 = class12.method119("Lade Titelbild )2 ", (byte) 118);

    @OriginalMember(owner = "client!ol", name = "ub", descriptor = "Lma;")
    public static class5 field1691 = class12.method119("welle2:", (byte) 123);

    @OriginalMember(owner = "client!ol", name = "fb", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!ol", name = "gb", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!ol", name = "hb", descriptor = "I")
    private int field1678;

    @OriginalMember(owner = "client!ol", name = "ib", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!ol", name = "jb", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!ol", name = "kb", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!ol", name = "mb", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!ol", name = "ob", descriptor = "I")
    private int field1685;

    @OriginalMember(owner = "client!ol", name = "qb", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!ol", name = "sb", descriptor = "Lbd;")
    public static class27 field1689;

    @OriginalMember(owner = "client!ol", name = "lb", descriptor = "[I")
    private int[] field1682;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)I", line = 6)
    public final int method744(int arg0) {
        field1687++;
        int var2 = -58 % ((-arg0 - 51) / 46);
        return this.field1684;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BLjava/lang/Object;Lhf;)V", line = 16)
    public static final void method745(byte arg0, Object arg1, class154 arg2) {
        field1677++;
        if (arg2.field2276 == null || arg0 != -9) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field2276.peekEvent() != null; var3++) {
            class116.method759(arg0 + 8, 1L);
        }
        if (arg1 != null) {
            arg2.field2276.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(B)Z", line = 47)
    private final boolean method746(byte arg0) {
        if (arg0 != -92) {
            return false;
        }
        field1681++;
        if (this.field1682 != null) {
            return true;
        } else if (this.field1684 < 0) {
            return false;
        } else {
            int var2 = class226.field3716;
            int var3 = class119.field1807;
            int var4 = class238.field3930.method1086(this.field1684, false) ? 64 : 128;
            this.field1682 = class238.field3930.method1084(220, this.field1684);
            this.field1685 = var4;
            this.field1678 = var4;
            class138.method898(16828, var3, var2);
            return this.field1682 != null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(B)V", line = 79)
    public static final void method747(byte arg0) {
        if (class284.field4811 < 0) {
            class153.field2240 = -1;
            class171.field2634 = -1;
            class284.field4811 = 0;
        }
        if (class139.field2066 < class284.field4811) {
            class284.field4811 = class139.field2066;
            class153.field2240 = -1;
            class171.field2634 = -1;
        }
        field1679++;
        if (class14.field269 < 0) {
            class14.field269 = 0;
            class153.field2240 = -1;
            class171.field2634 = -1;
        }
        if (class97.field1460 < class14.field269) {
            class14.field269 = class97.field1460;
            class171.field2634 = -1;
            class153.field2240 = -1;
        }
        if (arg0 >= -26) {
            field1691 = (class5) null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(BI)[[I", line = 127)
    public final int[][] method138(byte arg0, int arg1) {
        field1676++;
        int[][] var3 = this.field4524.method1462(-15077, arg1);
        int var4 = -40 / ((arg0 + 43) / 55);
        if (this.field4524.field3506 && this.method746((byte) -92)) {
            int var5 = (class119.field1807 == this.field1678 ? arg1 : this.field1678 * arg1 / class119.field1807) * this.field1685;
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            if (class226.field3716 == this.field1685) {
                for (int var12 = 0; var12 < class226.field3716; var12++) {
                    int var13 = this.field1682[var5++];
                    var6[var12] = class204.method1354(var13, 255) << 4;
                    var7[var12] = class204.method1354(var13, 65280) >> 4;
                    var8[var12] = class204.method1354(var13, 16711680) >> 12;
                }
            } else {
                for (int var9 = 0; var9 < class226.field3716; var9++) {
                    int var10 = this.field1685 * var9 / class226.field3716;
                    int var11 = this.field1682[var5 + var10];
                    var6[var9] = class204.method1354(var11, 255) << 4;
                    var7[var9] = class204.method1354(var11 >> 4, 4080);
                    var8[var9] = class204.method1354(var11 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V", line = 191)
    public class113() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "(I)V", line = 196)
    public final void method652(int arg0) {
        int var2 = 107 / ((75 - arg0) / 34);
        super.method652(29);
        this.field1682 = null;
        field1680++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IILii;)V", line = 206)
    public final void method4(int arg0, int arg1, class221 arg2) {
        if (arg1 < -27) {
            field1683++;
            if (arg0 == 0) {
                this.field1684 = arg2.method1524((byte) 65);
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "(I)V", line = 241)
    public static void method748(int arg0) {
        field1688 = null;
        field1691 = null;
        field1690 = null;
        field1686 = null;
        if (arg0 != 0) {
            field1689 = (class27) null;
        }
        field1689 = null;
    }
}
