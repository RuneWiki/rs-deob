import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class22 {

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    private int field312 = 0;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Ldq;")
    private class90 field308;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Lge;")
    public static class108 field306 = new class108(5000);

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field310 = 0;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "Lbn;")
    public static class160 field313 = new class160(65, 8);

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "[S")
    public static short[] field319 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "[I")
    public static int[] field316 = new int[500];

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public static int field320 = 0;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "Z")
    public static boolean field317 = false;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "Leb;")
    public static class395 field315 = new class395();

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Lgk;")
    private class264 field309;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Lae;")
    public static class285 field311;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "[I")
    public static int[] field314;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "[Z")
    public static boolean[] field318;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)Lgk;")
    public final class264 method240(byte arg0) {
        field307++;
        if (this.field312 > 0 && this.field308.field1109[this.field312 - 1] != this.field309) {
            class264 var2 = this.field309;
            this.field309 = var2.field3906;
            return var2;
        }
        if (arg0 != -104) {
            field319 = null;
        }
        while (this.field312 < this.field308.field1115) {
            class264 var3 = this.field308.field1109[this.field312++].field3906;
            if (this.field308.field1109[this.field312 - 1] != var3) {
                this.field309 = var3.field3906;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
    public static void method241(boolean arg0) {
        field315 = null;
        field316 = null;
        field318 = null;
        if (!arg0) {
            return;
        }
        field319 = null;
        field314 = null;
        field306 = null;
        field313 = null;
        field311 = null;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Ldq;)V")
    public class22(class90 arg0) {
        this.field308 = arg0;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)Lgk;")
    public final class264 method242(int arg0) {
        field305++;
        this.field312 = arg0;
        return this.method240((byte) -104);
    }
}
