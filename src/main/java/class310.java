import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class310 {

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "[I")
    public static int[] field4498 = new int[99];

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "[Lrg;")
    public static class385[] field4502 = new class385[14];

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lvj;")
    public static class256 field4499;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field4498[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILtj;)V", line = 3)
    public static final void method2077(int arg0, class108 arg1) {
        if (arg0 != -15835) {
            field4498 = null;
        }
        class430.field6118 = 0;
        class327.field4748 = 0;
        field4501++;
        class130.field1904 = new class145();
        class355.field5143 = new class12[1024];
        class406.method2553(arg1, (byte) -113);
        class447.method2788(arg0 + 15928, arg1);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 26)
    public static void method2078(int arg0) {
        if (arg0 != 0) {
            field4502 = null;
        }
        field4502 = null;
        field4499 = null;
        field4498 = null;
    }
}
