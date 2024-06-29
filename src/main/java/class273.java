import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public abstract class class273 extends class207 {

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "Z")
    public boolean field4778;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "[Lpf;")
    public class273[] field4794;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "Ljd;")
    public static class86 field4781 = class122.method868("compass", true);

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "I")
    public static int field4791 = 0;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    public static int field4790 = 0;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "Ljd;")
    private static class86 field4798 = class122.method868("Loading fonts )2 ", true);

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "[I")
    public static int[] field4799 = new int[2];

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "Ljd;")
    public static class86 field4795 = field4798;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "[I")
    public static int[] field4805 = new int[2000];

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "[S")
    public static short[] field4784 = new short[500];

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
    public int field4806;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "Ldi;")
    public class171 field4800;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "Lta;")
    public class243 field4787;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "[I")
    public static int[] field4796;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "[Ljd;")
    public static class86[] field4804;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static final void method1857(byte arg0) {
        if (arg0 == -106) {
            for (int var1 = 0; var1 < 100; var1++) {
                class21.field540[var1] = true;
            }
            field4792++;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)Lph;")
    public static final class77 method1858(byte arg0, int arg1) {
        class77 var2 = (class77) class88.field1739.method701((byte) -124, (long) arg1);
        field4785++;
        if (arg0 != 14) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class2.field20.method1084((byte) -120, class248.method1682(arg1, false), class151.method1104((byte) 98, arg1));
            class77 var4 = new class77();
            if (var3 != null) {
                var4.method550((byte) -120, new class200(var3));
            }
            class88.field1739.method696((long) arg1, var4, (byte) -96);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)I")
    public int method1006(byte arg0) {
        field4783++;
        if (arg0 <= 118) {
            this.method34(-121, (class200) null, -73);
        }
        return -1;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I")
    public int[] method31(int arg0, int arg1) {
        if (arg0 != -7420) {
            this.method966((byte) -117);
        }
        field4788++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)[[I")
    public final int[][] method1859(int arg0, int arg1, int arg2) {
        field4789++;
        if (arg2 != 3) {
            return null;
        } else if (this.field4794[arg1].field4778) {
            int[][] var4 = new int[3][];
            int[] var5 = this.field4794[arg1].method31(arg2 - 7423, arg0);
            var4[0] = var5;
            var4[2] = var5;
            var4[1] = var5;
            return var4;
        } else {
            return this.field4794[arg1].method29(arg0, (byte) -77);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBI)V")
    public final void method1860(int arg0, byte arg1, int arg2) {
        if (arg1 <= 50) {
            this.method1860(73, (byte) -83, -58);
        }
        int var4 = this.field4806 == 255 ? arg0 : this.field4806;
        if (this.field4778) {
            this.field4800 = new class171(var4, arg0, arg2);
        } else {
            this.field4787 = new class243(var4, arg0, arg2);
        }
        field4802++;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)V")
    public void method966(byte arg0) {
        if (arg0 != -113) {
            return;
        }
        field4786++;
        if (this.field4778) {
            this.field4800.method1227(1);
            this.field4800 = null;
        } else {
            this.field4787.method1659(arg0 + 24387);
            this.field4787 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)V")
    public static final void method1861(int arg0) {
        for (int var1 = -1; var1 < class209.field3786; var1++) {
            int var3;
            if (var1 == -1) {
                var3 = 2047;
            } else {
                var3 = class142.field2689[var1];
            }
            class224 var4 = class186.field3294[var3];
            if (var4 != null) {
                class233.method1614(var4.method240((byte) 104), var4, false);
            }
        }
        int var2 = 36 % ((46 - arg0) / 34);
        field4801++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILqk;I)V")
    public void method34(int arg0, class200 arg1, int arg2) {
        field4807++;
        if (arg2 >= -16) {
            this.field4794 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(B)V")
    public static void method1862(byte arg0) {
        field4798 = null;
        if (arg0 < 120) {
            field4805 = null;
        }
        field4796 = null;
        field4795 = null;
        field4799 = null;
        field4805 = null;
        field4784 = null;
        field4781 = null;
        field4804 = null;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)[I")
    public final int[] method1863(int arg0, int arg1, int arg2) {
        field4803++;
        if (arg0 >= -85) {
            return null;
        } else if (this.field4794[arg1].field4778) {
            return this.field4794[arg1].method31(-7420, arg2);
        } else {
            return this.field4794[arg1].method29(arg2, (byte) -56)[0];
        }
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(B)I")
    public int method970(byte arg0) {
        if (arg0 != 116) {
            this.method84(-63);
        }
        field4793++;
        return -1;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(III)V")
    public static final void method1864(int arg0, int arg1, int arg2) {
        field4779++;
        class161 var3 = class204.method1456(true, 7, arg1);
        var3.method1174(arg0 ^ arg0);
        var3.field3027 = arg2;
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)V")
    public void method84(int arg0) {
        if (arg0 == 4095) {
            field4782++;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZIIII)V")
    public static final void method1865(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field4777++;
        int var7 = arg0 + arg5;
        int var8 = arg1 + arg5;
        int var9 = arg6 - arg5;
        if (arg2) {
            method1858((byte) 39, -97);
        }
        int var10 = arg4 - arg5;
        for (int var11 = arg0; var11 < var7; var11++) {
            class56.method412(arg3, (byte) -113, arg4, class249.field4420[var11], arg1);
        }
        for (int var12 = arg6; var12 > var9; var12--) {
            class56.method412(arg3, (byte) -114, arg4, class249.field4420[var12], arg1);
        }
        for (int var13 = var7; var13 <= var9; var13++) {
            int[] var14 = class249.field4420[var13];
            class56.method412(arg3, (byte) -101, var8, var14, arg1);
            class56.method412(arg3, (byte) -121, arg4, var14, var10);
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IZ)V")
    public class273(int arg0, boolean arg1) {
        this.field4778 = arg1;
        this.field4794 = new class273[arg0];
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)[[I")
    public int[][] method29(int arg0, byte arg1) {
        field4780++;
        int var3 = 107 % ((arg1 - 12) / 58);
        throw new IllegalStateException("This operation does not have a colour output");
    }
}
