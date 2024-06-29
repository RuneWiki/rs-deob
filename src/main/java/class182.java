import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class182 {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "Llh;")
    private class364 field2737 = new class364(64);

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "Lhh;")
    private class84 field2741;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "Lao;")
    public static class188 field2742 = new class188(83, 5);

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "Ldq;")
    public static class489 field2743 = new class489(7, 15);

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public static int field2749 = 0;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "F")
    public static float field2745;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
    public static final void method1276(byte arg0) {
        if (arg0 >= -45) {
            field2749 = 60;
        }
        field2739++;
        if (class25.field439 < 0) {
            class25.field439 = 0;
            class504.field7389 = -1;
            class511.field7539 = -1;
        }
        if (class25.field439 > class2.field39) {
            class511.field7539 = -1;
            class25.field439 = class2.field39;
            class504.field7389 = -1;
        }
        if (class33.field522 < 0) {
            class504.field7389 = -1;
            class33.field522 = 0;
            class511.field7539 = -1;
        }
        if (class33.field522 > class2.field36) {
            class511.field7539 = -1;
            class33.field522 = class2.field36;
            class504.field7389 = -1;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V")
    public static void method1277(boolean arg0) {
        field2742 = null;
        if (arg0) {
            field2743 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
    public final void method1278(int arg0, int arg1) {
        if (arg0 != -2624) {
            return;
        }
        class364 var3 = this.field2737;
        synchronized (this.field2737) {
            this.field2737.method2348(arg1, -126);
        }
        field2738++;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public final void method1279(int arg0) {
        field2748++;
        if (arg0 != -18650) {
            this.method1279(-17);
        }
        class364 var2 = this.field2737;
        synchronized (this.field2737) {
            this.field2737.method2349(0);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)Lsj;")
    public final class318 method1280(int arg0, int arg1) {
        field2744++;
        class364 var3 = this.field2737;
        class318 var4;
        synchronized (this.field2737) {
            var4 = (class318) this.field2737.method2339(arg1 ^ 0xFFFFFFB5, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2741.method683(arg1, arg0, 5);
        class318 var6 = new class318();
        if (var5 != null) {
            var6.method1996(new class303(var5), false);
        }
        class364 var7 = this.field2737;
        synchronized (this.field2737) {
            this.field2737.method2342((long) arg0, var6, arg1 ^ 0x4D);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V")
    public final void method1281(int arg0) {
        field2740++;
        if (arg0 != 31) {
            this.method1280(-32, 33);
        }
        class364 var2 = this.field2737;
        synchronized (this.field2737) {
            this.field2737.method2350((byte) 112);
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lmt;ILhh;)V")
    public class182(class271 arg0, int arg1, class84 arg2) {
        this.field2741 = arg2;
        this.field2741.method656((byte) 122, 31);
    }
}
