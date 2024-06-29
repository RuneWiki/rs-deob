import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class3 {

    @OriginalMember(owner = "client!el", name = "c", descriptor = "B")
    private byte field24;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public int field29;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
    public static final void method8(byte arg0) {
        field30++;
        class420.field6187.method1668(0);
        class373.method2299(true);
        class149.field2111 = 0;
        if (arg0 <= 53) {
            return;
        }
        class389.field5816.field7956 = 0;
        class543.field8034 = null;
        class160.field2275 = null;
        class334.field4862 = null;
        class47.field746 = 0;
        class7.method39((byte) -112);
        class356.field5266 = 0;
        class642.field9202 = null;
        class587.field8520 = 0;
        class372.field5507 = 0;
        class451.field6509 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)I")
    public final int method9(int arg0) {
        field25++;
        if (arg0 < 103) {
            this.field31 = -102;
        }
        return this.field24 & 0x7;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)I")
    public final int method10(byte arg0) {
        field27++;
        int var2 = 99 / ((arg0 - 16) / 39);
        return (this.field24 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method11(int arg0, String arg1) {
        field23++;
        if (arg0 == 7) {
            System.out.println("Error: " + class696.method3915((byte) -55, arg1, "%0a", "\n"));
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
    public class3() {
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lgk;)V")
    public class3(class540 arg0) {
        this.field24 = arg0.method3128(32767);
        this.field26 = arg0.method3169(26488);
        this.field22 = arg0.method3160(false);
        this.field31 = arg0.method3160(false);
        this.field29 = arg0.method3160(false);
        this.field28 = arg0.method3160(false);
    }
}
