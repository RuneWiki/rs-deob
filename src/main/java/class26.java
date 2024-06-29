import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class26 extends class209 {

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    public static int field324 = 0;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "Luf;")
    public static class168 field322 = class148.method1019(-1720, "(Udns");

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "Luf;")
    public static class168 field327 = class148.method1019(-1720, "blaugr-Un:");

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
    public static int field329 = 0;

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "Lkb;")
    public static class80 field319 = new class80(8);

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "Luf;")
    private static class168 field334 = class148.method1019(-1720, "World");

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "Luf;")
    public static class168 field333 = field334;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "F")
    public static float field323;

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "I")
    public int field325;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "Luf;")
    public class168 field332;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "[Lsk;")
    public static class193[] field321;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "[Lgk;")
    public static class265[] field314;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)J", line = 10)
    public final long method132(int arg0) {
        field317++;
        int var2 = 110 / ((68 - arg0) / 58);
        return Long.MAX_VALUE & this.field3454;
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(B)I", line = 25)
    public final int method133(byte arg0) {
        if (arg0 >= -112) {
            this.field332 = (class168) null;
        }
        field326++;
        return (int) (this.field292 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[IBI[I)V", line = 64)
    public static final void method134(int arg0, int[] arg1, byte arg2, int arg3, int[] arg4) {
        if (arg3 < arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var6;
            int var7 = arg3;
            int var8 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var8;
            for (int var9 = arg3; var9 < arg0; var9++) {
                if (arg1[var9] > ((var9 & 0x1) + var6)) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var7];
                    arg1[var7] = var10;
                    int var11 = arg4[var9];
                    arg4[var9] = arg4[var7];
                    arg4[var7++] = var11;
                }
            }
            arg1[arg0] = arg1[var7];
            arg1[var7] = var6;
            arg4[arg0] = arg4[var7];
            arg4[var7] = var8;
            method134(var7 - 1, arg1, (byte) -110, arg3, arg4);
            method134(arg0, arg1, (byte) -58, var7 + 1, arg4);
        }
        int var12 = 40 / ((arg2 - 44) / 63);
        field320++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V", line = 118)
    public static final void method135(int arg0, int arg1) {
        class144.field2218.method1428(arg1, 29946);
        if (arg0 == 0) {
            field318++;
        }
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)V", line = 129)
    public final void method136(int arg0) {
        this.field3454 = class194.method1368((byte) 74) + 500L | Long.MIN_VALUE & this.field3454;
        class28.field359.method1890(this, false);
        if (arg0 != 8) {
            this.method136(-78);
        }
        field330++;
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(I)V", line = 145)
    public final void method137(int arg0) {
        this.field3454 |= Long.MIN_VALUE;
        if (arg0 == 255) {
            field328++;
            if (this.method132(-68) == 0L) {
                class50.field609.method1890(this, false);
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(I)V", line = 160)
    public static final void method138(int arg0) {
        if (arg0 <= 39) {
            field314 = (class265[]) null;
        }
        field331++;
        class115.field1793 = class149.method1024(2048, 0.4F, 4, 0, 8, 8, true, 35);
    }

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "(I)I", line = 171)
    public final int method139(int arg0) {
        field315++;
        if (arg0 >= -95) {
            field319 = (class80) null;
        }
        return (int) this.field292;
    }

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "(I)V", line = 187)
    public static void method140(int arg0) {
        field327 = null;
        field333 = null;
        if (arg0 != -13077) {
            method140(-40);
        }
        field334 = null;
        field321 = null;
        field314 = null;
        field322 = null;
        field319 = null;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(II)V", line = 209)
    public class26(int arg0, int arg1) {
        this.field292 = (long) arg0 << 32 | (long) arg1;
    }
}
