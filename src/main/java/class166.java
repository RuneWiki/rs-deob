import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public abstract class class166 extends class71 {

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "J")
    public static long field2690 = 0L;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "Z")
    public static boolean field2686 = false;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "Z")
    public boolean field2687;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)Z", line = 7)
    public final boolean method1142(int arg0) {
        field2691++;
        return arg0 >= -82 ? false : false;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "()I", line = 18)
    public int method761() {
        field2689++;
        return 0;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIBI)V", line = 30)
    public static final void method1143(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = -35 % ((arg3 - 16) / 59);
        class179 var6 = class319.method2220(arg2, (byte) -96, 10);
        field2684++;
        var6.method1242((byte) -39);
        var6.field2889 = arg1;
        var6.field2897 = arg0;
        var6.field2888 = arg4;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BII)V", line = 51)
    public static final void method1144(byte arg0, int arg1, int arg2) {
        field2692++;
        class179 var3 = class319.method2220(arg1, (byte) -96, 13);
        var3.method1242((byte) -36);
        int var4 = 127 / ((arg0 - 25) / 54);
        var3.field2897 = arg2;
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)Z", line = 73)
    public final boolean method1145(byte arg0) {
        field2688++;
        if (arg0 != 52) {
            method1147(117, (byte) 126, -51);
        }
        return false;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)Z", line = 92)
    public final boolean method1146(boolean arg0) {
        if (!arg0) {
            field2686 = true;
        }
        field2685++;
        return this.field2687;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(IBI)V", line = 110)
    public static final void method1147(int arg0, byte arg1, int arg2) {
        field2694++;
        class179 var3 = class319.method2220(arg2, (byte) -66, 7);
        var3.method1242((byte) -68);
        int var4 = 62 % ((-arg1 - 69) / 42);
        var3.field2897 = arg0;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(Z)I", line = 126)
    public final int method1148(boolean arg0) {
        field2693++;
        if (arg0) {
            field2686 = true;
        }
        return 1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "()Z")
    public abstract boolean method758();

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)V")
    public abstract void method763(int arg0, int arg1);

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "()V")
    public abstract void method762();

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIII)V")
    public abstract void method759(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V")
    public abstract void method764(int arg0);

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "()Z")
    public abstract boolean method760();
}
