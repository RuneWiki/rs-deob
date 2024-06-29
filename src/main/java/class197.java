import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public abstract class class197 {

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "Lgd;")
    public static class206 field2679 = new class206("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(III)I", line = 8)
    public static final int method1132(int arg0, int arg1, int arg2) {
        field2677++;
        int var3 = 0;
        if (arg2 >= 0) {
            method1135(false, 35);
        }
        while (arg1 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg1--;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I[B)[B", line = 29)
    public static final byte[] method1133(int arg0, byte[] arg1) {
        field2676++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class380.method2334(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "(I)V", line = 46)
    public static void method1134(int arg0) {
        field2679 = null;
        int var1 = -90 % ((78 - arg0) / 44);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZI)V", line = 64)
    public static final void method1135(boolean arg0, int arg1) {
        if (arg0) {
            method1133(123, (byte[]) null);
        }
        class108.field1612 = new int[arg1];
        class138.field2006 = new int[arg1];
        class97.field1420 = new int[arg1];
        class127.field1866 = new int[arg1];
        class121.field1774 = new int[arg1];
        field2678++;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIBLwm;)Z")
    public abstract boolean method14(int arg0, int arg1, byte arg2, class364 arg3);

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "(I)V")
    public abstract void method8(int arg0);

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lwm;B)V")
    public abstract void method10(class364 arg0, byte arg1);

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(Lwm;B)Lnf;")
    public abstract class374 method3(class364 arg0, byte arg1);

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIILwm;ZLhp;Z)V")
    public abstract void method2(int arg0, int arg1, int arg2, class364 arg3, boolean arg4, class197 arg5, boolean arg6);

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "(I)Z")
    public abstract boolean method17(int arg0);
}
