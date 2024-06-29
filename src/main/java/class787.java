import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class787 extends class165 {

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Ljava/lang/String;")
    private String field10813 = null;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "J")
    private long field10815 = -1L;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "Ljo;")
    public static class351 field10819 = new class351(9, -1);

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field10814;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    public static int field10816;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public static int field10817;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "I")
    public static int field10818;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    public static int field10820;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)Z")
    public static final boolean method4312(int arg0, int arg1, int arg2) {
        field10817++;
        int var3 = -51 % ((-arg2 - 1) / 60);
        return (arg1 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILmia;)V")
    public final void method612(int arg0, class69 arg1) {
        field10816++;
        arg1.method554(this.field10813, this.field10815, 25694);
        if (arg0 >= -100) {
            method4312(-96, -8, -13);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
    public static void method4313(boolean arg0) {
        if (!arg0) {
            method4313(false);
        }
        field10819 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lrv;I)V")
    public final void method614(class120 arg0, int arg1) {
        field10818++;
        if (arg0.method842(arg1 + 1314) != 255) {
            arg0.field1521--;
            this.field10815 = arg0.method834(-8616);
        }
        this.field10813 = arg0.method891(arg1 ^ 0x4C42);
        if (arg1 != 1070) {
            this.field10815 = 123L;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Lnh;")
    public static final class777 method4314(int arg0, int arg1) {
        field10814++;
        if (arg0 != 0) {
            method4312(42, 86, -75);
        }
        return new class777(arg1, false);
    }
}
