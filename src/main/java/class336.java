import jaclib.memory.Buffer;
import jaclib.memory.Source;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class336 extends class16 implements class378 {

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "Ltf;")
    public static class269 field5029 = new class269();

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "I")
    public static int field5031 = 0;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "B")
    private byte field5020;

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!ll", name = "B", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!ll", name = "D", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!ll", name = "H", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "Lom;")
    public static class344 field5030;

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "Z")
    public static boolean field5025;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)Z")
    public final boolean method2164(int arg0, int arg1, int arg2) {
        ++field5032;
        this.field5020 = (byte) arg0;
        if (arg1 != 3573) {
            method2166((class214) null, 54, (Canvas) null);
        }
        super.method380(arg2, (byte) -17);
        return true;
    }

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "(B)I")
    public final int method2165(byte arg0) {
        ++field5024;
        return arg0 != 34 ? 72 : this.field5020;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lfa;ILjava/awt/Canvas;)Lr;")
    public static final class167 method2166(class214 arg0, int arg1, Canvas arg2) {
        if (arg1 != 25863) {
            method2166((class214) null, 12, (Canvas) null);
        }
        ++field5028;
        return new class351(arg2, arg0);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;")
    public final Buffer method2167(int arg0, boolean arg1) {
        ++field5021;
        if (arg0 != -1926) {
            this.field5020 = -126;
        }
        return super.method388((byte) 64, super.field765.field6827, arg1);
    }

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "(B)V")
    public static void method2168(byte arg0) {
        field5030 = null;
        field5029 = null;
        int var1 = 42 % ((arg0 - -28) / 61);
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Ljq;Z)V")
    public class336(class475 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
    public final void method382(byte arg0) {
        super.method382((byte) 76);
        ++field5022;
        if (arg0 < 63) {
            field5029 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)I")
    public final int method386(int arg0) {
        ++field5026;
        return arg0 != 0 ? 17 : super.method386(0);
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)Z")
    public final boolean method2169(byte arg0) {
        ++field5027;
        int var2 = -23 / ((-42 - arg0) / 54);
        return super.method379(super.field765.field6827, (byte) -125);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IILjaclib/memory/Source;I)Z")
    public final boolean method2170(int arg0, int arg1, Source arg2, int arg3) {
        this.field5020 = (byte) arg0;
        ++field5023;
        int var5 = 99 % ((82 - arg3) / 32);
        super.method385(arg2, 1, arg1);
        return true;
    }
}
