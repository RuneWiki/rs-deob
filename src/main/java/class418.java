import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class418 {

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Lsg;")
    public static class418 field5447 = new class418();

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Lsg;")
    public static class418 field5450 = new class418();

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Lsg;")
    public static class418 field5451 = new class418();

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Lsg;")
    public static class418 field5452 = new class418();

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "Lmc;")
    public static class146 field5453;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lr;III[Z)V", line = 9)
    public static final void method2496(class196 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class704.field9910 == class621.field8523) {
            return;
        }
        int var5 = class707.field9933[arg1].method1730(arg2, arg3, -1);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class296 var7 = class707.field9933[var6];
                if (var7 != null) {
                    var7.method1397(arg0, arg2, var5 - var7.method1730(arg2, arg3, -1), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 35)
    public static final void method2497(int arg0) {
        field5446++;
        class396.field5130.method1690(0);
        class502.field7098.method1690(arg0 - 8302);
        if (arg0 != 8302) {
            field5447 = null;
        }
        class132.field1639.method1690(0);
        class151.field1886.method1690(0);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 49)
    public static void method2498(int arg0) {
        field5450 = null;
        field5453 = null;
        if (arg0 != -9147) {
            field5447 = null;
        }
        field5451 = null;
        field5447 = null;
        field5452 = null;
    }

    @OriginalMember(owner = "client!sg", name = "toString", descriptor = "()Ljava/lang/String;", line = 64)
    public final String toString() {
        field5449++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILes;)Llca;", line = 72)
    public static final class672 method2499(int arg0, class403 arg1) {
        field5448++;
        if (arg0 != -31064) {
            field5450 = null;
        }
        return new class672(arg1.method2365(true), arg1.method2365(true), arg1.method2365(true), arg1.method2365(true), arg1.method2358(arg0 + 31129), arg1.method2358(93), arg1.method2396((byte) -126));
    }
}
