import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class276 extends class202 {

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "Lj;")
    public static class138 field4752 = new class138(64);

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public static int field4753 = -2;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "Z")
    public static boolean field4754;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V", line = 12)
    public static void method1929(byte arg0) {
        int var1 = -111 / ((-arg0 - 3) / 52);
        field4752 = null;
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(B)V", line = 34)
    public static final void method1930(byte arg0) {
        field4751++;
        class213 var1 = class262.field4365;
        synchronized (class262.field4365) {
            class37.field550++;
            if (arg0 == 89) {
                class59.field910 = class155.field2530;
                class254.field4213 = class94.field1455;
                class184.field3079 = class147.field2400;
                class154.field2513 = class93.field1449;
                class231.field3794 = class139.field2295;
                class149.field2444 = class101.field1654;
                class36.field527 = class219.field3561;
                class93.field1449 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B[I[III)V", line = 63)
    public static final void method1931(byte arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        field4749++;
        int var5 = 13 / ((6 - arg0) / 47);
        if (arg4 >= arg3) {
            return;
        }
        int var6 = (arg4 + arg3) / 2;
        int var7 = arg4;
        int var8 = arg2[var6];
        arg2[var6] = arg2[arg3];
        arg2[arg3] = var8;
        int var9 = arg1[var6];
        arg1[var6] = arg1[arg3];
        arg1[arg3] = var9;
        for (int var10 = arg4; var10 < arg3; var10++) {
            if (arg2[var10] > (var10 & 0x1) + var8) {
                int var11 = arg2[var10];
                arg2[var10] = arg2[var7];
                arg2[var7] = var11;
                int var12 = arg1[var10];
                arg1[var10] = arg1[var7];
                arg1[var7++] = var12;
            }
        }
        arg2[arg3] = arg2[var7];
        arg2[var7] = var8;
        arg1[arg3] = arg1[var7];
        arg1[var7] = var9;
        method1931((byte) -48, arg1, arg2, var7 - 1, arg4);
        method1931((byte) 76, arg1, arg2, arg3, var7 + 1);
    }
}
