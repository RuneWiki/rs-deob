import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class286 extends class101 {

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "[I")
    public static int[] field4319 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "Ljava/lang/String;")
    public static String field4322 = "Started 3d Library";

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static int field4311 = 0;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "Ljava/lang/String;")
    public static String field4325 = null;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "[I")
    public static int[] field4314 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public int field4320;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    public int field4321;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "I")
    public int field4326;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
    public int field4327;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
    public int field4329;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "Llm;")
    public static class210 field4324;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "Lf;")
    public class329 field4312;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "Lf;")
    public class329 field4330;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "Ljava/lang/String;")
    public String field4317;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "Z")
    public boolean field4316;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "[Ljava/lang/Object;")
    public Object[] field4310;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V", line = 5)
    public static final void method1989(byte arg0) {
        class163.field2467++;
        class234.field3507.method28(42, false);
        class234.field3507.method1813(-98, class48.method329((byte) 81));
        field4318++;
        if (arg0 <= 56) {
            field4325 = (String) null;
        }
        class234.field3507.method1823(class136.field2071, (byte) -38);
        class234.field3507.method1823(class251.field3747, (byte) -53);
        class234.field3507.method1813(-92, class194.field2902);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(JI)V", line = 32)
    public static final void method1990(long arg0, int arg1) {
        try {
            if (arg1 != 1) {
                field4311 = 48;
            }
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
        field4315++;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjava/lang/String;)I", line = 54)
    public static final int method1991(int arg0, String arg1) {
        if (arg0 >= -78) {
            method1990(42L, -42);
        }
        field4323++;
        return class55.method367(true, 28637, 10, arg1);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([Ljava/lang/Object;III[J)V", line = 65)
    public static final void method1992(Object[] arg0, int arg1, int arg2, int arg3, long[] arg4) {
        if (arg2 != 19) {
            return;
        }
        field4328++;
        if (arg1 <= arg3) {
            return;
        }
        int var5 = (arg1 + arg3) / 2;
        long var6 = arg4[var5];
        int var8 = arg3;
        arg4[var5] = arg4[arg1];
        arg4[arg1] = var6;
        Object var9 = arg0[var5];
        arg0[var5] = arg0[arg1];
        arg0[arg1] = var9;
        for (int var10 = arg3; var10 < arg1; var10++) {
            if (((long) (var10 & 0x1) + var6) > arg4[var10]) {
                long var11 = arg4[var10];
                arg4[var10] = arg4[var8];
                arg4[var8] = var11;
                Object var13 = arg0[var10];
                arg0[var10] = arg0[var8];
                arg0[var8++] = var13;
            }
        }
        arg4[arg1] = arg4[var8];
        arg4[var8] = var6;
        arg0[arg1] = arg0[var8];
        arg0[var8] = var9;
        method1992(arg0, var8 - 1, 19, arg3, arg4);
        method1992(arg0, arg1, arg2 ^ 0x0, var8 + 1, arg4);
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V", line = 120)
    public static void method1993(int arg0) {
        int var1 = 58 % ((39 - arg0) / 55);
        field4324 = null;
        field4314 = null;
        field4322 = null;
        field4325 = null;
        field4319 = null;
    }
}
