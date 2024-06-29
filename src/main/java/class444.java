import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class444 extends class502 {

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "[F")
    public static float[] field6016 = new float[16];

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "Lmo;")
    public static class780 field6023 = new class780("", 11);

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public static int field6019;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "[Z")
    public static boolean[] field6025;

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "[[B")
    public static byte[][] field6024;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(II)V", line = 6)
    public final void method52(int arg0, int arg1) {
        super.field6865 = arg0;
        if (arg1 == 0) {
            ++field6020;
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(B)I", line = 21)
    public final int method2574(byte arg0) {
        if (arg0 < 49) {
            this.method55(109);
        }
        ++field6017;
        return super.field6865;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V", line = 33)
    public static void method2575(int arg0) {
        field6023 = null;
        field6025 = null;
        field6016 = null;
        if (arg0 != 16) {
            method2575(21);
        }
        field6024 = null;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)I", line = 46)
    public final int method55(int arg0) {
        if (arg0 != -2) {
            this.method52(-89, 44);
        }
        ++field6021;
        return 1;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Leka;)V", line = 57)
    public class444(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)V", line = 60)
    public final void method58(boolean arg0) {
        if (arg0) {
            if (~super.field6865 != -2 && ~super.field6865 != -1) {
                super.field6865 = this.method55(-2);
            }
            ++field6022;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)I", line = 76)
    public final int method57(int arg0, int arg1) {
        if (arg1 != 0) {
            field6023 = null;
        }
        ++field6018;
        return 1;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(ILeka;)V", line = 89)
    public class444(int arg0, class492 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 95)
    public static final boolean method2576(String arg0, byte arg1) {
        int var2 = 120 % ((arg1 - 28) / 43);
        ++field6019;
        return class37.field627.containsKey(arg0);
    }
}
