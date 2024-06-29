import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public class class120 {

    @OriginalMember(owner = "client!jja", name = "d", descriptor = "I")
    private int field1534 = 0;

    @OriginalMember(owner = "client!jja", name = "f", descriptor = "Ldj;")
    private class362 field1536;

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "Lgp;")
    public static class53 field1531 = new class53();

    @OriginalMember(owner = "client!jja", name = "i", descriptor = "Lft;")
    public static class4 field1539 = new class4();

    @OriginalMember(owner = "client!jja", name = "j", descriptor = "Llja;")
    public static class744 field1540 = new class744(13, 16);

    @OriginalMember(owner = "client!jja", name = "k", descriptor = "Lhj;")
    public static class596 field1541 = new class596(57, -2);

    @OriginalMember(owner = "client!jja", name = "c", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!jja", name = "e", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!jja", name = "g", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!jja", name = "h", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!jja", name = "m", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!jja", name = "b", descriptor = "Loq;")
    private class379 field1532;

    @OriginalMember(owner = "client!jja", name = "l", descriptor = "Lbt;")
    public static class48 field1542;

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(I)Loq;")
    public final class379 method937(int arg0) {
        if (arg0 != -1) {
            method940((byte) 27);
        }
        field1538++;
        if (this.field1534 > 0 && this.field1536.field4514[this.field1534 - 1] != this.field1532) {
            class379 var2 = this.field1532;
            this.field1532 = var2.field4806;
            return var2;
        }
        while (this.field1534 < this.field1536.field4502) {
            class379 var3 = this.field1536.field4514[this.field1534++].field4806;
            if (this.field1536.field4514[this.field1534 - 1] != var3) {
                this.field1532 = var3.field4806;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jja", name = "b", descriptor = "(I)Loq;")
    public final class379 method938(int arg0) {
        this.field1534 = 0;
        field1535++;
        return arg0 == 16 ? this.method937(arg0 - 17) : null;
    }

    @OriginalMember(owner = "client!jja", name = "c", descriptor = "(I)V")
    public static void method939(int arg0) {
        field1531 = null;
        field1542 = null;
        if (arg0 == -30369) {
            field1541 = null;
            field1540 = null;
            field1539 = null;
        }
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(B)V")
    public static final void method940(byte arg0) {
        if (arg0 != -61) {
            return;
        }
        field1537++;
        if (class737.field10282 != null && class285.field3332 != null) {
            return;
        }
        class285.field3332 = new int[256];
        class737.field10282 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class737.field10282[var1] = (int) (Math.sin(var2) * 4096.0D);
            class285.field3332[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!jja", name = "<init>", descriptor = "()V")
    public class120() {
    }

    @OriginalMember(owner = "client!jja", name = "<init>", descriptor = "(Ldj;)V")
    public class120(class362 arg0) {
        this.field1536 = arg0;
    }
}
