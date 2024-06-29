import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class295 extends class329 {

    @OriginalMember(owner = "client!tha", name = "A", descriptor = "B")
    public byte field3973 = 5;

    @OriginalMember(owner = "client!tha", name = "y", descriptor = "I")
    public static int field3971 = 0;

    @OriginalMember(owner = "client!tha", name = "z", descriptor = "Lea;")
    public static class547 field3972 = new class547(13, 1);

    @OriginalMember(owner = "client!tha", name = "C", descriptor = "Llga;")
    public static class712 field3975 = new class712(41, -1);

    @OriginalMember(owner = "client!tha", name = "D", descriptor = "Lfha;")
    public static class382 field3976 = new class382(11, 8);

    @OriginalMember(owner = "client!tha", name = "q", descriptor = "I")
    public int field3963;

    @OriginalMember(owner = "client!tha", name = "r", descriptor = "I")
    public int field3964;

    @OriginalMember(owner = "client!tha", name = "s", descriptor = "I")
    public int field3965;

    @OriginalMember(owner = "client!tha", name = "t", descriptor = "I")
    public int field3966;

    @OriginalMember(owner = "client!tha", name = "u", descriptor = "I")
    public int field3967;

    @OriginalMember(owner = "client!tha", name = "v", descriptor = "I")
    public int field3968;

    @OriginalMember(owner = "client!tha", name = "w", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!tha", name = "x", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!tha", name = "B", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!tha", name = "p", descriptor = "Z")
    public boolean field3962;

    @OriginalMember(owner = "client!tha", name = "o", descriptor = "[Lgg;")
    public static class176[] field3961;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)V")
    public static void method1763(byte arg0) {
        field3975 = null;
        field3972 = null;
        if (arg0 < 52) {
            field3975 = null;
        }
        field3976 = null;
        field3961 = null;
    }

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(IB)Z")
    public static final boolean method1764(int arg0, byte arg1) {
        field3969++;
        if (arg1 >= -65) {
            method1764(-77, (byte) 42);
        }
        return arg0 == 0 || arg0 == 2;
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(BIIII[B)V")
    public static final void method1765(byte arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (arg0 != 1) {
            method1763((byte) 100);
        }
        field3970++;
        if (arg3 <= arg2) {
            return;
        }
        int var6 = arg1 + arg2;
        int var7 = arg3 - arg2 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg3 - arg2 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg5[var6++] = 1;
                }
            }
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
        }
    }
}
