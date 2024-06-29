import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class552 {

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "Lvda;")
    private class164 field8019 = new class164();

    @OriginalMember(owner = "client!oea", name = "h", descriptor = "Lan;")
    private class22 field8023 = new class22();

    @OriginalMember(owner = "client!oea", name = "g", descriptor = "I")
    private int field8022;

    @OriginalMember(owner = "client!oea", name = "i", descriptor = "I")
    private int field8024;

    @OriginalMember(owner = "client!oea", name = "j", descriptor = "Lwaa;")
    private class652 field8025;

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "F")
    public static float field8017;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "I")
    public static int field8016;

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "I")
    public static int field8020;

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "I")
    public static int field8021;

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "Lnga;")
    public static class477 field8018;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V", line = 7)
    public static void method3239(int arg0) {
        if (arg0 != -51) {
            field8017 = -0.542692F;
        }
        field8018 = null;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lvda;IJ)V", line = 22)
    public final void method3240(class164 arg0, int arg1, long arg2) {
        if (this.field8024 == 0) {
            class164 var5 = this.field8023.method352((byte) 115);
            var5.method3045(true);
            var5.method1037(-69);
            if (this.field8019 == var5) {
                class164 var6 = this.field8023.method352((byte) 115);
                var6.method3045(true);
                var6.method1037(-88);
            }
        } else {
            this.field8024--;
        }
        field8021++;
        this.field8025.method3670(arg2, arg0, (byte) 127);
        this.field8023.method345(arg0, -1);
        int var7 = -24 % ((-arg1 - 65) / 52);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IJ)Lvda;", line = 53)
    public final class164 method3241(int arg0, long arg1) {
        field8016++;
        if (arg0 != -26958) {
            this.field8023 = null;
        }
        class164 var4 = (class164) this.field8025.method3678(arg1, -122);
        if (var4 != null) {
            this.field8023.method345(var4, -1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)V", line = 90)
    public final void method3242(int arg0) {
        this.field8023.method353(0);
        field8020++;
        this.field8025.method3674((byte) -84);
        this.field8019 = new class164();
        this.field8024 = this.field8022;
        int var2 = -65 / ((-arg0 - 1) / 44);
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(I)V", line = 114)
    public class552(int arg0) {
        this.field8022 = arg0;
        this.field8024 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field8025 = new class652(var2);
    }
}
