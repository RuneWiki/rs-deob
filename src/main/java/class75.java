import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class75 extends class577 {

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "S")
    public short field853;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "[I")
    public static int[] field854 = new int[1];

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)Z")
    public static final boolean method591(int arg0, int arg1, int arg2) {
        if (arg0 != 65536) {
            field854 = null;
        }
        field850++;
        boolean var3 = (arg1 & 0x37) == 0 ? class26.method240(10420, arg1, arg2) : class390.method2420(-86, arg2, arg1);
        return class462.method2768((byte) -106, arg1, arg2) | (arg2 & 0x10000) != 0 | var3;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZII)Lwia;")
    public static final class791 method592(int arg0, boolean arg1, int arg2, int arg3) {
        field851++;
        class126 var4 = null;
        if (class582.field8222 != null) {
            var4 = new class126(arg2, class582.field8222, class465.field6548[arg2], 1000000);
        }
        if (arg0 == 1000000) {
            class695.field9712[arg2] = class639.field8960.method3222(arg2, var4, class574.field8102, 0);
            class695.field9712[arg2].method3476(127);
            return new class791(class695.field9712[arg2], arg1, arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZIII)V")
    public static final void method593(boolean arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 << 3;
        int var5 = arg3 << 3;
        int var6 = arg1 << 3;
        field855++;
        class758.field10460 = var6;
        class642.field8990 = var5;
        if (class416.field5704 == 2) {
            class544.field7813 = var6;
            class565.field8018 = var4;
            class589.field8310 = var5;
        }
        class588.method3427((byte) 98);
        class532.field7692 = arg0;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class75() {
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(S)V")
    public class75(short arg0) {
        this.field853 = arg0;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method594(int arg0) {
        field854 = null;
        if (arg0 != -6242) {
            method593(false, 16, 77, -82);
        }
    }
}
