import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class268 {

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public int field4579;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public int field4581;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public int field4570;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public int field4569;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field4576 = 0;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Lpj;")
    public static class237 field4578 = class33.method353("<col=ffffff>(Y", 69);

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Lpj;")
    public static class237 field4577 = class33.method353("Untersuchen", 32);

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Lpj;")
    public static class237 field4580 = class33.method353("Ablegen", 112);

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "Lfa;")
    public static class239 field4575;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Laf;")
    public static class67 field4572;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Z")
    public static boolean field4571;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZIII)V")
    public static final void method1783(boolean arg0, int arg1, int arg2, int arg3) {
        field4573++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        field4571 = arg0;
        class255.field4372 = arg3;
        if (arg2 == 10867) {
            class47.field1023 = arg1;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public static void method1784(boolean arg0) {
        field4572 = null;
        if (arg0) {
            field4580 = null;
            field4577 = null;
            field4578 = null;
            field4575 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lhi;I)I")
    public static final int method1785(class210 arg0, int arg1) {
        if (arg1 != -1) {
            return 10;
        }
        field4574++;
        class231 var2 = arg0.field3586;
        if (var2.field3991 != null) {
            var2 = var2.method1530(-1);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field3996;
        if (arg0.field3723 == arg0.field3696) {
            var3 = var2.field3963;
        } else if (arg0.field3741 == arg0.field3696) {
            var3 = var2.field4010;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class268() {
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lee;)V")
    public class268(class268 arg0) {
        this.field4579 = arg0.field4579;
        this.field4581 = arg0.field4581;
        this.field4570 = arg0.field4570;
        this.field4569 = arg0.field4569;
    }
}
