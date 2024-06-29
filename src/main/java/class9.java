import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public abstract class class9 {

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "[I")
    public static int[] field150 = new int[128];

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field147 = 0;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "[I")
    public static int[] field160 = new int[25];

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "Lnf;")
    public static class162 field153 = new class162(64);

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "Ljava/lang/String;")
    public static String field161 = "flash1:";

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field162 = 0;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field163 = 0;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public int field148;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public int field151;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public int field157;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public int field158;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "Lqh;")
    public static class212 field155;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "Lub;")
    public static class92 field159;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
    public static final void method56(int arg0, int arg1) {
        if (arg1 == -22840) {
            field152++;
            class69 var2 = class255.method1723((byte) 32, arg0, 2);
            var2.method554(arg1 ^ 0x88382668);
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)V")
    public abstract void method57(int arg0, int arg1);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method58(int arg0) {
        field153 = null;
        field159 = null;
        field155 = null;
        field150 = null;
        field161 = null;
        field160 = null;
        if (arg0 != 0) {
            method58(89);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
    public abstract void method59(int arg0, int arg1, int arg2);
}
