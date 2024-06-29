import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class281 {

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "B")
    public byte field4369 = 0;

    @OriginalMember(owner = "client!vt", name = "t", descriptor = "B")
    public byte field4384;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "B")
    public byte field4373;

    @OriginalMember(owner = "client!vt", name = "w", descriptor = "S")
    public short field4387;

    @OriginalMember(owner = "client!vt", name = "B", descriptor = "S")
    public short field4392;

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "Lsc;")
    public static class270 field4366 = new class270(4, 1, 1, 1);

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
    public static int field4378 = 0;

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "B")
    public byte field4375;

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "B")
    public byte field4377;

    @OriginalMember(owner = "client!vt", name = "r", descriptor = "B")
    public byte field4382;

    @OriginalMember(owner = "client!vt", name = "v", descriptor = "B")
    public byte field4386;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "Lso;")
    public class202 field4376;

    @OriginalMember(owner = "client!vt", name = "y", descriptor = "Lso;")
    public class202 field4389;

    @OriginalMember(owner = "client!vt", name = "q", descriptor = "Ljf;")
    public class21 field4381;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "Lvt;")
    public class281 field4372;

    @OriginalMember(owner = "client!vt", name = "u", descriptor = "Lvm;")
    public class320 field4385;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "Les;")
    public class481 field4371;

    @OriginalMember(owner = "client!vt", name = "p", descriptor = "Lem;")
    public class501 field4380;

    @OriginalMember(owner = "client!vt", name = "z", descriptor = "Lem;")
    public class501 field4390;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "Lsp;")
    public static class519 field4368;

    @OriginalMember(owner = "client!vt", name = "x", descriptor = "Led;")
    public class90 field4388;

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "Lclient;")
    public static client field4379;

    @OriginalMember(owner = "client!vt", name = "s", descriptor = "S")
    public short field4383;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "Z")
    public boolean field4370;

    @OriginalMember(owner = "client!vt", name = "A", descriptor = "Z")
    public boolean field4391;

    @OriginalMember(owner = "client!vt", name = "C", descriptor = "Z")
    public boolean field4393;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
    public final void method1895(byte arg0) {
        field4374++;
        while (this.field4381 != null) {
            class21 var2 = this.field4381.field235;
            this.field4381.method132(7);
            this.field4381 = var2;
        }
        if (arg0 > 12) {
            this.field4369 = 0;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1896(int arg0, int arg1, byte arg2) {
        field4365++;
        if (arg2 != 90) {
            field4378 = -35;
        }
        return (arg0 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(III)V")
    public class281(int arg0, int arg1, int arg2) {
        this.field4373 = this.field4384 = (byte) arg0;
        this.field4387 = (short) arg2;
        this.field4392 = (short) arg1;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "([IIII[J)V")
    public static final void method1897(int[] arg0, int arg1, int arg2, int arg3, long[] arg4) {
        if (arg1 > arg2) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg2;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var7;
            int var9 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg2; var11 < arg1; var11++) {
                if (((long) (var10 & var11) + var7) > arg4[var11]) {
                    long var12 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6] = var12;
                    int var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg4[arg1] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg1] = arg0[var6];
            arg0[var6] = var9;
            method1897(arg0, var6 - 1, arg2, arg3, arg4);
            method1897(arg0, arg1, var6 + 1, -31866, arg4);
        }
        field4367++;
        if (arg3 != -31866) {
            field4378 = 47;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)V")
    public static void method1898(boolean arg0) {
        field4366 = null;
        field4379 = null;
        field4368 = null;
        if (arg0) {
            field4379 = null;
        }
    }
}
