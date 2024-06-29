import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public abstract class class215 extends class320 {

    @OriginalMember(owner = "client!ho", name = "C", descriptor = "Z")
    public static boolean field3361 = false;

    @OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
    public static int field3364 = 0;

    @OriginalMember(owner = "client!ho", name = "A", descriptor = "I")
    public int field3359;

    @OriginalMember(owner = "client!ho", name = "B", descriptor = "I")
    public int field3360;

    @OriginalMember(owner = "client!ho", name = "D", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!ho", name = "E", descriptor = "I")
    public int field3363;

    @OriginalMember(owner = "client!ho", name = "G", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!ho", name = "H", descriptor = "I")
    public int field3366;

    @OriginalMember(owner = "client!ho", name = "I", descriptor = "I")
    public int field3367;

    @OriginalMember(owner = "client!ho", name = "J", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!ho", name = "K", descriptor = "I")
    public int field3369;

    @OriginalMember(owner = "client!ho", name = "L", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!ho", name = "M", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(B)V", line = 14)
    public static final void method1609(byte arg0) {
        class224.field3496.method656(0);
        class63.field967.method656(0);
        field3370++;
        if (arg0 != -21) {
            method1611((long[]) null, -15, -33, (int[]) null, 57);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIB)V", line = 33)
    public final void method1610(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != -33) {
            field3368 = 62;
        }
        int var6 = this.field3360 << 3;
        int var7 = (arg3 << 4) + (var6 & 0xF);
        field3362++;
        int var8 = this.field3369 << 3;
        int var9 = (arg2 << 4) + (var8 & 0xF);
        this.method14(var6, var8, var7, var9, arg1, arg0);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "([JII[II)V", line = 75)
    public static final void method1611(long[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        if (arg1 > arg2) {
            int var5 = arg2;
            int var6 = (arg1 + arg2) / 2;
            long var7 = arg0[var6];
            arg0[var6] = arg0[arg1];
            arg0[arg1] = var7;
            int var9 = arg3[var6];
            arg3[var6] = arg3[arg1];
            arg3[arg1] = var9;
            for (int var10 = arg2; var10 < arg1; var10++) {
                if (arg0[var10] < ((long) (var10 & 0x1) + var7)) {
                    long var11 = arg0[var10];
                    arg0[var10] = arg0[var5];
                    arg0[var5] = var11;
                    int var13 = arg3[var10];
                    arg3[var10] = arg3[var5];
                    arg3[var5++] = var13;
                }
            }
            arg0[arg1] = arg0[var5];
            arg0[var5] = var7;
            arg3[arg1] = arg3[var5];
            arg3[var5] = var9;
            method1611(arg0, var5 - 1, arg2, arg3, 12179);
            method1611(arg0, arg1, var5 + 1, arg3, 12179);
        }
        field3365++;
        if (arg4 != 12179) {
            method1609((byte) -97);
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(II)V")
    public abstract void method17(int arg0, int arg1);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIII)V")
    public abstract void method14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(III)V")
    public abstract void method5(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(II)V")
    public abstract void method18(int arg0, int arg1);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIII)V")
    public abstract void method13(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(II)V")
    public abstract void method9(int arg0, int arg1);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIII)V")
    public abstract void method12(int arg0, int arg1, int arg2, int arg3, int arg4);
}
