import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class60 {

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "Lcga;")
    public static class449 field755 = new class449(56, -1);

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "[I")
    public static int[] field758 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([Ljava/lang/String;I[S)V", line = 3)
    public static final void method504(String[] arg0, int arg1, short[] arg2) {
        field756++;
        class514.method2801(arg2, 1, 0, arg0, arg0.length - 1);
        if (arg1 != 2688) {
            method504(null, -70, null);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 18)
    public static void method505(int arg0) {
        field755 = null;
        if (arg0 == -6874) {
            field758 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILjava/lang/String;)J", line = 35)
    public static final long method506(int arg0, String arg1) {
        if (arg0 != -1166517115) {
            field757 = -128;
        }
        field754++;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + (((long) arg1.charAt(var5)) - var3);
        }
        return var3;
    }
}
