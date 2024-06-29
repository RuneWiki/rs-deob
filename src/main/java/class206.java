import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class206 extends class626 implements class31 {

    @OriginalMember(owner = "client!em", name = "A", descriptor = "Lpr;")
    public static class407 field2504 = new class407(75, -2);

    @OriginalMember(owner = "client!em", name = "G", descriptor = "Lpr;")
    public static class407 field2510 = new class407(39, -1);

    @OriginalMember(owner = "client!em", name = "B", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!em", name = "C", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!em", name = "D", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!em", name = "E", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!em", name = "F", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!em", name = "H", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(III)Z")
    public final boolean method169(int arg0, int arg1, int arg2) {
        if (arg2 != 1103) {
            this.method169(-65, 73, -12);
        }
        field2506++;
        super.method1024(arg2 ^ 0x435, arg0);
        return true;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Ljaclib/memory/Source;IBI)Z")
    public final boolean method168(Source arg0, int arg1, byte arg2, int arg3) {
        super.method3513(arg0, 0, arg3);
        if (arg2 > -90) {
            this.method169(-92, 42, 82);
        }
        field2509++;
        return true;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lnfa;Z)V")
    public class206(class621 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(B)V")
    public final void method166(byte arg0) {
        field2507++;
        int var2 = -8 / ((arg0 - 3) / 39);
        super.method166((byte) -53);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)I")
    public final int method737(byte arg0) {
        int var2 = 56 % ((-arg0 - 24) / 50);
        field2511++;
        return super.method737((byte) 65);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    public final Buffer method167(int arg0, boolean arg1) {
        field2508++;
        return arg0 == 18829 ? super.method167(18829, arg1) : null;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V")
    public static void method1252(int arg0) {
        field2504 = null;
        if (arg0 == -2) {
            field2510 = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)Z")
    public final boolean method170(int arg0) {
        field2505++;
        return arg0 == 9406 ? super.method170(9406) : true;
    }
}
