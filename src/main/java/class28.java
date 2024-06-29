import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class28 {

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Lvi;")
    public static class560 field274 = new class560(64);

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "Lrh;")
    public static class59 field278 = new class59();

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "J")
    public long field272;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Lsf;")
    public class28 field275;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Lsf;")
    public class28 field276;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)Z", line = 3)
    public final boolean method174(int arg0) {
        field270++;
        if (arg0 != 64) {
            method177(null, 71);
        }
        return this.field275 != null;
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V", line = 18)
    public final void method175(int arg0) {
        field273++;
        if (this.field275 == null) {
            return;
        }
        this.field275.field276 = this.field276;
        this.field276.field275 = this.field275;
        this.field276 = null;
        this.field275 = null;
        if (arg0 != 30604) {
            this.method175(-84);
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V", line = 38)
    public static void method176(byte arg0) {
        field278 = null;
        int var1 = -81 % ((-arg0 - 7) / 45);
        field274 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lfca;I)Ljava/lang/String;", line = 56)
    public static final String method177(class188 arg0, int arg1) {
        field271++;
        if (client.method1411(arg0).method1645(false) == 0) {
            return null;
        } else if (arg0.field2417 == null || arg0.field2417.trim().length() == 0) {
            return class380.field5455 ? "Hidden-use" : null;
        } else {
            if (arg1 != 64) {
                field277 = -40;
            }
            return arg0.field2417;
        }
    }
}
