import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class305 extends OutputStream {

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "[Z")
    public static boolean[] field4739 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field4738 = 0;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field4743 = 0;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field4745 = 0;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "[I")
    public static int[] field4741;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V", line = 5)
    public static void method2192(byte arg0) {
        if (arg0 >= -29) {
            field4747 = 71;
        }
        field4739 = null;
        field4741 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIZ)I", line = 31)
    public static final int method2193(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg2 / arg1;
        field4748++;
        int var5 = arg0 / arg1;
        int var6 = arg1 - 1 & arg0;
        int var7 = arg1 - 1 & arg2;
        int var8 = class29.method332((byte) 62, var4, var5);
        int var9 = class29.method332((byte) 62, var4 + 1, var5);
        int var10 = class29.method332((byte) 62, var4, var5 + 1);
        int var11 = class29.method332((byte) 62, var4 + 1, var5 + 1);
        int var12 = class58.method575(arg3, var9, var7, arg1, var8);
        int var13 = class58.method575(arg3, var11, var7, arg1, var10);
        return class58.method575(true, var13, var6, arg1, var12);
    }

    @OriginalMember(owner = "client!vf", name = "write", descriptor = "(I)V", line = 63)
    public final void write(int arg0) throws IOException {
        field4740++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 81)
    public static final void method2194(int arg0) {
        class263.field4079.method655(-1);
        field4742++;
        int var1 = -106 % ((-arg0 - 61) / 44);
        class9.field125.method655(-1);
        class187.field2935.method655(-1);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)I", line = 94)
    public static final int method2195(int arg0, byte arg1) {
        if (arg1 != 5) {
            field4743 = 35;
        }
        field4746++;
        class222 var2 = class153.method1262(arg0, arg1 + 114);
        int var3 = var2.field3454;
        int var4 = var2.field3449;
        int var5 = var2.field3458;
        int var6 = class49.field773[var4 - var3];
        return class160.field2538[var5] >> var3 & var6;
    }
}
