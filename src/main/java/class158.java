import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class158 extends class81 {

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "Z")
    public static boolean field2143 = true;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "Lqk;")
    public static class148 field2145 = new class148(99, 6);

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 3)
    public static void method992(int arg0) {
        if (arg0 == 99) {
            field2145 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(JJ)J", line = 16)
    public static long method993(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "([IB[I)V", line = 30)
    public static final void method994(int[] arg0, byte arg1, int[] arg2) {
        field2142++;
        if (arg0 == null || arg2 == null) {
            class647.field9176 = null;
            class304.field3955 = null;
            class191.field2768 = null;
            return;
        }
        class191.field2768 = arg0;
        class304.field3955 = new int[arg0.length];
        class647.field9176 = new byte[arg0.length][][];
        if (arg1 != -73) {
            field2144 = 15;
        }
        for (int var3 = 0; var3 < class191.field2768.length; var3++) {
            class647.field9176[var3] = new byte[arg2[var3]][];
        }
    }
}
