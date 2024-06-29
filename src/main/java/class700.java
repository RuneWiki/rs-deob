import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class700 extends class633 implements class690 {

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "I")
    private int field9810;

    @OriginalMember(owner = "client!kaa", name = "h", descriptor = "[[I")
    public static int[][] field9814 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!kaa", name = "l", descriptor = "I")
    public static int field9818 = 0;

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "I")
    public static int field9809;

    @OriginalMember(owner = "client!kaa", name = "e", descriptor = "I")
    public static int field9811;

    @OriginalMember(owner = "client!kaa", name = "f", descriptor = "I")
    public static int field9812;

    @OriginalMember(owner = "client!kaa", name = "g", descriptor = "I")
    public static int field9813;

    @OriginalMember(owner = "client!kaa", name = "i", descriptor = "I")
    public static int field9815;

    @OriginalMember(owner = "client!kaa", name = "j", descriptor = "I")
    public static int field9816;

    @OriginalMember(owner = "client!kaa", name = "k", descriptor = "I")
    public static int field9817;

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)J")
    public final long method2596(int arg0) {
        if (arg0 != 10385) {
            field9818 = -94;
        }
        ++field9811;
        return super.field8946.getAddress();
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)I")
    public final int method2599(int arg0) {
        ++field9817;
        if (arg0 != 18850) {
            this.field9810 = 64;
        }
        return 0;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(III)V")
    public static final void method3920(int arg0, int arg1, int arg2) {
        ++field9812;
        if (arg0 < -91) {
            if (class429.field5944 == class113.field1647) {
                if (!class246.method1636(-2, 0, 1, (byte) -99, arg1, 1, 0, false, arg2)) {
                    class246.method1636(-3, 0, 1, (byte) -109, arg1, 1, 0, false, arg2);
                }
            } else if (!class246.method1636(-3, 0, 1, (byte) -123, arg1, 1, 0, false, arg2)) {
                class246.method1636(-2, 0, 1, (byte) -114, arg1, 1, 0, false, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "(I)V")
    public static void method3921(int arg0) {
        if (arg0 == 6) {
            field9814 = null;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Llea;I[BI)V")
    public class700(class573 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field9810 = arg1;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I[BII)V")
    public final void method2600(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 == -8525) {
            ++field9809;
            this.method3612(arg1, arg2);
            this.field9810 = arg3;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I[JII[I)V")
    public static final void method3922(int arg0, long[] arg1, int arg2, int arg3, int[] arg4) {
        ++field9815;
        if (arg2 > arg3) {
            int var5 = (arg3 - -arg2) / 2;
            int var6 = arg3;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var7;
            int var9 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg3; var11 < arg2; ++var11) {
                if (var7 - -((long) (var10 & var11)) > arg1[var11]) {
                    long var12 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6] = var12;
                    int var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg1[arg2] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg2] = arg4[var6];
            arg4[var6] = var9;
            method3922(-1, arg1, var6 + -1, arg3, arg4);
            method3922(-1, arg1, arg2, var6 - -1, arg4);
        }
        if (arg0 != -1) {
            field9814 = null;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)I")
    public final int method2597(byte arg0) {
        ++field9816;
        return arg0 != -79 ? 101 : this.field9810;
    }
}
