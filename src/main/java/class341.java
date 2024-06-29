import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class341 {

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Lwb;")
    public class360 field4710 = new class360();

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "Lrc;")
    public static class108 field4707 = new class108(16, -1);

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4711 = new Rectangle[100];

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "Lwb;")
    private class360 field4715;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)Lip;")
    public static final class371 method2128(int arg0, int arg1, int arg2) {
        class52 var3 = class385.field5285[arg0][arg1][arg2];
        return var3 == null ? null : var3.field756;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
    public final void method2129(byte arg0) {
        while (true) {
            class360 var2 = this.field4710.field4948;
            if (this.field4710 == var2) {
                field4708++;
                this.field4715 = null;
                int var3 = -92 % ((61 - arg0) / 36);
                return;
            }
            var2.method2212(-2207);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)Lwb;")
    public final class360 method2130(int arg0) {
        field4713++;
        if (arg0 != 100) {
            this.method2133(-4, (class360) null);
        }
        class360 var2 = this.field4710.field4948;
        if (this.field4710 == var2) {
            this.field4715 = null;
            return null;
        } else {
            this.field4715 = var2.field4948;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V")
    public static void method2131(int arg0) {
        if (arg0 >= -47) {
            field4711 = null;
        }
        field4707 = null;
        field4711 = null;
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)Lwb;")
    public final class360 method2132(int arg0) {
        if (arg0 != -101) {
            this.field4710 = null;
        }
        field4714++;
        class360 var2 = this.field4715;
        if (this.field4710 == var2) {
            this.field4715 = null;
            return null;
        } else {
            this.field4715 = var2.field4948;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
    public class341() {
        this.field4710.field4948 = this.field4710;
        this.field4710.field4947 = this.field4710;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILwb;)V")
    public final void method2133(int arg0, class360 arg1) {
        if (arg1.field4947 != null) {
            arg1.method2212(-2207);
        }
        field4712++;
        arg1.field4948 = this.field4710;
        arg1.field4947 = this.field4710.field4947;
        arg1.field4947.field4948 = arg1;
        arg1.field4948.field4947 = arg1;
        if (arg0 != 0) {
            method2128(98, -37, -110);
        }
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field4711[var0] = new Rectangle();
        }
        field4717 = 0;
    }
}
