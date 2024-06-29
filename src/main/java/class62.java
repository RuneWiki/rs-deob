import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class62 {

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "B")
    private byte field772;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
    public int field777;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public int field776;

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "I")
    public int field779;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public int field774;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "[I")
    public static int[] field775 = new int[200];

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "Lqi;")
    public static class406 field773 = new class406(64);

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "[I")
    public static int[] field780 = new int[25];

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "Lkn;")
    public static class530 field781 = new class530("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "Lfc;")
    public static class174 field783 = new class174(4);

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "Lcf;")
    public static class437 field784;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)I", line = 3)
    public final int method501(int arg0) {
        field782++;
        if (arg0 != 1769) {
            this.method501(-56);
        }
        return this.field772 & 0x7;
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)I", line = 15)
    public final int method502(int arg0) {
        field771++;
        if (arg0 == 15399) {
            return (this.field772 & 0x8) == 8 ? 1 : 0;
        } else {
            return 51;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)V", line = 28)
    public static void method503(byte arg0) {
        field775 = null;
        field773 = null;
        field781 = null;
        if (arg0 < -106) {
            field780 = null;
            field783 = null;
            field784 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V", line = 70)
    public class62() {
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lwm;)V", line = 77)
    public class62(class403 arg0) {
        this.field772 = arg0.method2359(-106);
        this.field778 = arg0.method2338(0);
        this.field777 = arg0.method2319((byte) 119);
        this.field776 = arg0.method2319((byte) 120);
        this.field779 = arg0.method2319((byte) 104);
        this.field774 = arg0.method2319((byte) 78);
    }
}
