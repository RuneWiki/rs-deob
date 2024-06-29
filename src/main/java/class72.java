import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class72 {

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field810 = "Loaded wordpack";

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "[S")
    public static short[] field813 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Lfi;")
    public static class331 field808 = new class331(64);

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "[I")
    public static int[] field817 = new int[13];

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Laf;")
    public static class249 field812;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Lra;")
    public static class57 field816;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method420(int arg0) {
        field813 = null;
        field816 = null;
        field812 = null;
        if (arg0 <= 53) {
            field817 = null;
        }
        field817 = null;
        field810 = null;
        field808 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public static final void method421(byte arg0) {
        field809++;
        if (class442.field6457) {
            return;
        }
        class404.field5889 = true;
        if (class291.field4173) {
            class135.field1886 = (float) ((int) class135.field1886 - 17 & 0xFFFFFFF0);
        } else {
            class102.field1155 += (-12.0F - class102.field1155) / 2.0F;
        }
        class442.field6457 = true;
        if (arg0 != 87) {
            field812 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IB)I")
    public static final int method422(int arg0, byte arg1) {
        int var2 = -4 % ((-arg1 - 52) / 43);
        field811++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[I[IBI)V")
    public static final void method423(int arg0, int[] arg1, int[] arg2, byte arg3, int arg4) {
        if (arg3 != 90) {
            method420(-52);
        }
        if (arg4 > arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg0;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var8;
            for (int var9 = arg0; var9 < arg4; var9++) {
                if (arg1[var9] < ((var9 & 0x1) + var7)) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    int var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg1[arg4] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var8;
            method423(arg0, arg1, arg2, (byte) 90, var6 - 1);
            method423(var6 + 1, arg1, arg2, (byte) 90, arg4);
        }
        field815++;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public static final void method424(int arg0) {
        field814++;
        class331 var1 = class238.field3241;
        synchronized (class238.field3241) {
            class238.field3241.method2052(0);
            int var2 = 92 / ((arg0 - 56) / 33);
        }
    }
}
