import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public abstract class class321 extends class196 {

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
    public static int field4856 = 0;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "J")
    public static long field4850;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "Llm;")
    public static class210 field4851;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "[I")
    public static int[] field4852;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lf;IILea;III)V", line = 6)
    public static final void method2201(class329 arg0, int arg1, int arg2, class235 arg3, int arg4, int arg5, int arg6) {
        field4855++;
        if (arg3 == null) {
            return;
        }
        int var7 = class284.field4297 + class160.field2401 & 0x7FF;
        int var8 = Math.max(arg0.field5018 / 2, arg0.field4994 / 2) + 10;
        int var9 = arg4 * arg4 + arg6 * arg6;
        if (arg1 != 24483) {
            field4850 = 120L;
        }
        if (var9 > (var8 * var8)) {
            return;
        }
        int var10 = class148.field2229[var7];
        int var11 = var10 * 256 / (class178.field2641 + 256);
        int var12 = class148.field2239[var7];
        int var13 = var12 * 256 / (class178.field2641 + 256);
        int var14 = arg4 * var13 + arg6 * var11 >> 16;
        int var15 = arg4 * var11 - arg6 * var13 >> 16;
        if (class117.field1817) {
            ((class303) arg3).method2100(arg0.field5018 / 2 + (arg5 + var14) - arg3.field3535 / 2, arg0.field4994 / 2 + arg2 - arg3.field3527 / 2 + -var15, (class303) arg0.method2237(false, 104));
        } else {
            ((class127) arg3).method929(arg5 + arg0.field5018 / 2 + var14 - arg3.field3535 / 2, arg0.field4994 / 2 + arg2 - (arg3.field3527 / 2 + var15), arg0.field4940, arg0.field5012);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILbj;)V", line = 47)
    public static final void method2202(int arg0, class98 arg1) {
        field4853++;
        int var2 = arg1.field1547 - class304.field4641;
        int var3 = arg1.field1525 * 128 + (arg1.method696((byte) 117) * 64);
        int var4 = arg1.field1556 * 128 + arg1.method696((byte) 117) * 64;
        arg1.field1565 = 0;
        if (arg1.field1523 == 0) {
            arg1.field1474 = 1024;
        }
        arg1.field1505 += (var4 - arg1.field1505) / var2;
        if (arg1.field1523 == 1) {
            arg1.field1474 = 1536;
        }
        if (arg1.field1523 == 2) {
            arg1.field1474 = 0;
        }
        arg1.field1566 += (var3 - arg1.field1566) / var2;
        if (~arg1.field1523 == arg0) {
            arg1.field1474 = 512;
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V", line = 79)
    public static void method2203(int arg0) {
        field4851 = null;
        field4852 = null;
        if (arg0 != 2) {
            field4850 = 4L;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)[B", line = 97)
    public static final byte[] method2204(int arg0, int arg1) {
        field4854++;
        class230 var2 = (class230) class162.field2438.method1674(0, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class216.method1488(var7, true, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class230(var3);
            class162.field2438.method1672(-125, (long) arg0, var2);
        }
        if (arg1 != 511) {
            method2202(55, (class98) null);
        }
        return var2.field3478;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)Z")
    public abstract boolean method425(byte arg0);

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method421(int arg0);
}
