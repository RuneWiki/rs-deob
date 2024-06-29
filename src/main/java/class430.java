import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class430 {

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    private int field5858 = 0;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "Lba;")
    private class607 field5857;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "Lbn;")
    public static class371 field5856;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "Lum;")
    private class108 field5861;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)Lum;")
    public final class108 method2511(int arg0) {
        field5862++;
        this.field5858 = arg0;
        return this.method2514(-60);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
    public static void method2512(byte arg0) {
        if (arg0 >= -66) {
            field5856 = null;
        }
        field5856 = null;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)Z")
    public static final boolean method2513(int arg0, int arg1, int arg2) {
        if (arg1 >= -46) {
            method2513(68, 42, 20);
        }
        field5860++;
        return (arg0 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)Lum;")
    public final class108 method2514(int arg0) {
        field5859++;
        if (arg0 >= -49) {
            this.method2511(28);
        }
        if (this.field5858 > 0 && this.field5857.field8724[this.field5858 - 1] != this.field5861) {
            class108 var2 = this.field5861;
            this.field5861 = var2.field1403;
            return var2;
        }
        while (this.field5857.field8731 > this.field5858) {
            class108 var3 = this.field5857.field8724[this.field5858++].field1403;
            if (this.field5857.field8724[this.field5858 - 1] != var3) {
                this.field5861 = var3.field1403;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
    public class430() {
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lba;)V")
    public class430(class607 arg0) {
        this.field5857 = arg0;
    }

    static {
        new class344("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field5856 = new class371(0, 2, 2, 1);
    }
}
