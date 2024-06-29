import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class62 {

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public int field822 = 128;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public int field829 = 128;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public int field824;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public int field827;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public int field825;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public int field828;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Lnd;")
    public static class500 field821 = new class500();

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)Lsh;")
    public final class62 method509(int arg0) {
        if (arg0 == -18142) {
            field823++;
            return new class62(this.field824, this.field822, this.field829, this.field828, this.field825, this.field827);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIZ)V")
    public static final void method510(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            method510(104, -81, 2, -19, true);
        }
        field826++;
        if (arg0 - arg2 >= class482.field6703 && class144.field2148 >= arg0 + arg2 && arg3 - arg2 >= class92.field1219 && class631.field8829 >= (arg2 + arg3)) {
            class154.method1077(arg0, arg1, arg2, arg3, (byte) 87);
        } else {
            class91.method677(arg1, -96, arg0, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static void method511(byte arg0) {
        field821 = null;
        int var1 = -128 / ((arg0 + 65) / 43);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lsh;I)V")
    public final void method512(class62 arg0, int arg1) {
        this.field827 = arg0.field827;
        this.field828 = arg0.field828;
        if (arg1 != -18728) {
            method510(-88, -80, 42, 35, true);
        }
        field830++;
        this.field825 = arg0.field825;
        this.field829 = arg0.field829;
        this.field824 = arg0.field824;
        this.field822 = arg0.field822;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(I)V")
    public class62(int arg0) {
        this.field824 = arg0;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(IIIIII)V")
    private class62(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field829 = arg2;
        this.field827 = arg5;
        this.field825 = arg4;
        this.field824 = arg0;
        this.field828 = arg3;
        this.field822 = arg1;
    }
}
