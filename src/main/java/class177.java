import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public abstract class class177 extends class404 {

    @OriginalMember(owner = "client!aba", name = "F", descriptor = "S")
    public short field2726;

    @OriginalMember(owner = "client!aba", name = "C", descriptor = "Lej;")
    public static class124 field2723 = new class124(50, -1);

    @OriginalMember(owner = "client!aba", name = "D", descriptor = "F")
    public static float field2724;

    @OriginalMember(owner = "client!aba", name = "z", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!aba", name = "A", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!aba", name = "B", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!aba", name = "E", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!aba", name = "G", descriptor = "J")
    public static long field2727;

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "(B)Z", line = 3)
    public final boolean method937(byte arg0) {
        if (arg0 > -51) {
            field2723 = null;
        }
        ++field2722;
        return class393.method2471(super.field5921, super.field5922 >> class130.field2185, (byte) -97, super.field5933 >> class130.field2185);
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "([Lab;I)I", line = 14)
    public final int method935(class669[] arg0, int arg1) {
        ++field2721;
        int var3 = 88 % ((arg1 - -14) / 61);
        return this.method2523(arg0, super.field5922 >> class130.field2185, -2, super.field5933 >> class130.field2185);
    }

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "(B)V", line = 24)
    public static void method1316(byte arg0) {
        field2723 = null;
        if (arg0 != 50) {
            method1316((byte) 65);
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIII)V", line = 39)
    public static final void method1317(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 << arg3;
        ++field2725;
        int var5 = arg1 << 3;
        int var6 = arg2 << 3;
        if (class438.field6252 == 2) {
            class600.field8231 = var5;
            class546.field7523 = var6;
            class634.field8721 = var4;
        }
        class451.field6366 = (float) var5;
        class440.field6267 = (float) var4;
        class294.method1924(262144);
        class392.field5766 = true;
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(IIIIII)V", line = 63)
    public class177(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field5921 = (byte) arg4;
        super.field5922 = arg0;
        super.field5933 = arg2;
        this.field2726 = (short) arg5;
        super.field5927 = arg1;
        super.field5926 = (byte) arg3;
    }

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "(I)Z", line = 77)
    public final boolean method939(int arg0) {
        if (arg0 != 0) {
            field2723 = null;
        }
        ++field2720;
        return class196.field2890[(super.field5922 >> class130.field2185) + -class134.field2256 + class708.field9611][(super.field5933 >> class130.field2185) + -class492.field6813 + class708.field9611];
    }
}
