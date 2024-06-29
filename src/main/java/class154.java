import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class154 {

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Lkj;")
    public static class56 field2686 = new class56(4096);

    @OriginalMember(owner = "client!si", name = "f", descriptor = "Lij;")
    public static class50 field2690 = class78.method578(122, "::fpson");

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field2692 = 0;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "Lij;")
    public static class50 field2693 = class78.method578(126, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "Lmb;")
    public static class72 field2689;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lgg;I)V")
    public static final void method1084(class203 arg0, int arg1) {
        if (arg1 != 2) {
            field2693 = null;
        }
        field2688++;
        long var2 = 0L;
        if (arg0.field3367 == 0) {
            var2 = class176.method1212(arg0.field3376, arg0.field3366, arg0.field3373);
        }
        if (arg0.field3367 == 1) {
            var2 = class41.method314(arg0.field3376, arg0.field3366, arg0.field3373);
        }
        if (arg0.field3367 == 2) {
            var2 = class2.method5(arg0.field3376, arg0.field3366, arg0.field3373);
        }
        if (arg0.field3367 == 3) {
            var2 = class17.method132(arg0.field3376, arg0.field3366, arg0.field3373);
        }
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (var2 != 0L) {
            var6 = ((int) var2 & 0x36A864) >> 20;
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var5 = (int) var2 >> 14 & 0x1F;
        }
        arg0.field3370 = var4;
        arg0.field3372 = var6;
        arg0.field3380 = var5;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static final void method1085(byte arg0) {
        field2687++;
        if (arg0 > -93) {
            method1085((byte) -21);
        }
        if (class2.field20 < class252.field4369) {
            class2.field20 += class2.field20 / 30.0D;
            if (class2.field20 > class252.field4369) {
                class2.field20 = class252.field4369;
            }
            class125.method899(-1);
        } else if (class2.field20 > class252.field4369) {
            class2.field20 -= class2.field20 / 30.0D;
            if (class252.field4369 > class2.field20) {
                class2.field20 = class252.field4369;
            }
            class125.method899(-1);
        }
        if (class142.field2484 == -1 || class254.field4393 == -1) {
            return;
        }
        int var1 = class142.field2484 - class215.field3559;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        int var2 = class254.field4393 - class222.field3744;
        class215.field3559 += var1;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class222.field3744 -= -var2;
        if (var1 == 0 && var2 == 0) {
            class142.field2484 = -1;
            class254.field4393 = -1;
        }
        class125.method899(-1);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static void method1086(int arg0) {
        if (arg0 == 4) {
            field2686 = null;
            field2690 = null;
            field2689 = null;
            field2693 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lwi;BLbf;I)V")
    public static final void method1087(class21 arg0, byte arg1, class47 arg2, int arg3) {
        field2685++;
        class124 var4 = new class124();
        var4.field2169 = arg0;
        var4.field635 = (long) arg3;
        var4.field2178 = 1;
        if (arg1 < 99) {
            return;
        }
        var4.field2179 = arg2;
        class86 var5 = class129.field2259;
        synchronized (class129.field2259) {
            class129.field2259.method684(var4, (byte) 109);
        }
        class74.method557(-1);
    }
}
