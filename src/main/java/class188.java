import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class188 extends class37 {

    @OriginalMember(owner = "client!u", name = "S", descriptor = "Ldd;")
    public static class35 field3820 = class180.method1196((byte) -14, "hint_mapmarkers");

    @OriginalMember(owner = "client!u", name = "P", descriptor = "I")
    public static int field3817 = -1;

    @OriginalMember(owner = "client!u", name = "V", descriptor = "[I")
    public static int[] field3823 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!u", name = "R", descriptor = "Ldd;")
    public static class35 field3819 = class180.method1196((byte) 127, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!u", name = "T", descriptor = "Ldd;")
    public static class35 field3821 = class180.method1196((byte) -111, "mn");

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!u", name = "U", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ldd;Ldd;Ldd;I)V")
    public static final void method1243(class35 arg0, class35 arg1, class35 arg2, int arg3) {
        class134.field2873 = arg2;
        class134.field2855 = arg0;
        ++field3822;
        int var4 = 110 / ((-41 - arg3) / 42);
        class134.field2858 = arg1;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
    public static final void method1244() {
        for (int var0 = 0; var0 < class4.field66; ++var0) {
            for (int var5 = 0; var5 < class113.field2536; ++var5) {
                for (int var6 = 0; var6 < class102.field2272; ++var6) {
                    class191.field3853[var0][var5][var6] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class137.field2926; ++var1) {
            for (int var4 = 0; var4 < class137.field2923[var1]; ++var4) {
                class137.field2932[var1][var4] = null;
            }
            class137.field2923[var1] = 0;
        }
        for (int var2 = 0; var2 < class137.field2925; ++var2) {
            class21.field429[var2] = null;
        }
        class137.field2925 = 0;
        for (int var3 = 0; var3 < class196.field3908.length; ++var3) {
            class196.field3908[var3] = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        if (arg0 != 75) {
            method1244();
        }
        ++field3818;
        int[] var3 = super.field816.method1189((byte) 33, arg1);
        if (super.field816.field3661) {
            for (int var4 = 0; ~var4 > ~class72.field1719; ++var4) {
                var3[var4] = class118.field2622[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class188() {
        super(0, true);
    }

    @OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V")
    public static void method1245(int arg0) {
        field3819 = null;
        if (arg0 != 38) {
            method1245(62);
        }
        field3821 = null;
        field3823 = null;
        field3820 = null;
    }
}
