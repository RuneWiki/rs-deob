import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class752 extends class330 {

    @OriginalMember(owner = "client!bba", name = "G", descriptor = "I")
    private int field10372;

    @OriginalMember(owner = "client!bba", name = "F", descriptor = "Lqk;")
    public static class1 field10371 = new class1(56, 7);

    @OriginalMember(owner = "client!bba", name = "H", descriptor = "I")
    public static int field10373 = 0;

    @OriginalMember(owner = "client!bba", name = "J", descriptor = "Ljn;")
    public static class134 field10375 = new class134(11, -2);

    @OriginalMember(owner = "client!bba", name = "L", descriptor = "Llk;")
    public static class638 field10377 = new class638(64);

    @OriginalMember(owner = "client!bba", name = "C", descriptor = "I")
    public static int field10369;

    @OriginalMember(owner = "client!bba", name = "D", descriptor = "I")
    public static int field10370;

    @OriginalMember(owner = "client!bba", name = "I", descriptor = "I")
    public static int field10374;

    @OriginalMember(owner = "client!bba", name = "M", descriptor = "I")
    public static int field10378;

    @OriginalMember(owner = "client!bba", name = "K", descriptor = "[J")
    public static long[] field10376;

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(I)V")
    public class752(int arg0) {
        super(0, true);
        this.field10372 = 4096;
        this.field10372 = arg0;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IZ)[I")
    public final int[] method464(int arg0, boolean arg1) {
        ++field10374;
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (arg1) {
            method4158(-72, (class473) null, -118);
        }
        if (super.field4630.field5704) {
            class335.method2121(var3, 0, class80.field901, this.field10372);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)V")
    public static void method4157(int arg0) {
        if (arg0 != -25981) {
            method4158(-17, (class473) null, 8);
        }
        field10375 = null;
        field10376 = null;
        field10377 = null;
        field10371 = null;
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILha;I)Lho;")
    public static final class318 method4158(int arg0, class473 arg1, int arg2) {
        ++field10370;
        class469 var3 = (class469) class297.field4327.method3669(false, (long) arg0);
        if (var3 != null) {
            class43 var4 = var3.field6502.method2970(-112);
            var3.field6500 = true;
            if (var4 != null) {
                return var4.method339(arg1, -96);
            }
        }
        if (arg2 != 0) {
            field10378 = -89;
        }
        return null;
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "()V")
    public class752() {
        this(4096);
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lgga;IB)V")
    public final void method466(class511 arg0, int arg1, byte arg2) {
        int var4 = -60 % ((arg2 - -41) / 42);
        ++field10369;
        if (arg1 == 0) {
            this.field10372 = (arg0.method3013(-121) << 12) / 255;
        }
    }
}
