import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class93 extends class240 {

    @OriginalMember(owner = "client!p", name = "W", descriptor = "[I")
    public static int[] field1737 = new int[5];

    @OriginalMember(owner = "client!p", name = "S", descriptor = "Lke;")
    public static class106 field1733 = new class106();

    @OriginalMember(owner = "client!p", name = "O", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lna;ZLna;)V", line = 11)
    public static final void method710(class25 arg0, boolean arg1, class25 arg2) {
        field1732++;
        if (arg0.field408 != null) {
            arg0.method232(128);
        }
        arg0.field408 = arg2.field408;
        arg0.field415 = arg2;
        if (arg1) {
            arg0.field408.field415 = arg0;
            arg0.field415.field408 = arg0;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BI)[[I", line = 37)
    public final int[][] method286(byte arg0, int arg1) {
        if (arg0 < 34) {
            method711(-85);
        }
        int[][] var3 = this.field4095.method1797(arg1, -96);
        if (this.field4095.field4355) {
            int[][] var4 = this.method1746(-104, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class169.field2936; var11++) {
                var7[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var6[var11];
                var10[var11] = 4096 - var8[var11];
            }
        }
        field1731++;
        return var3;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)[I", line = 80)
    public final int[] method12(int arg0, int arg1) {
        field1729++;
        int[] var3 = this.field4094.method179(arg1, true);
        if (arg0 != 64) {
            method712(76, (class222) null, (byte) 15, -43);
        }
        if (this.field4094.field344) {
            int[] var4 = this.method1745(arg1, 0, (byte) 107);
            for (int var5 = 0; var5 < class169.field2936; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V", line = 114)
    public class93() {
        super(1, false);
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V", line = 118)
    public static void method711(int arg0) {
        field1733 = null;
        field1737 = null;
        if (arg0 != 1) {
            method711(-22);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IILkh;)V", line = 143)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.field4113 = arg2.method152((byte) -114) == 1;
            }
            field1736++;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILqm;BI)[Lqd;", line = 158)
    public static final class40[] method712(int arg0, class222 arg1, byte arg2, int arg3) {
        if (arg2 < 81) {
            return (class40[]) null;
        } else {
            field1730++;
            return class135.method966(94, arg0, arg3, arg1) ? class3.method17(0) : null;
        }
    }
}
