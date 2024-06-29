import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public abstract class class104 {

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field1738 = 0;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1736 = "Face here";

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field1747 = 0;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "[Z")
    public static boolean[] field1745 = new boolean[5];

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field1748 = -1;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "Ltm;")
    public static class79 field1741 = new class79(16);

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field1749 = 2;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "Lcg;")
    public static class49 field1742;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "[I")
    public static int[] field1743;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 8)
    public static void method893(int arg0) {
        field1743 = null;
        field1741 = null;
        if (arg0 != -1) {
            method893(-40);
        }
        field1742 = null;
        field1736 = null;
        field1745 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Luk;IIIZ)V", line = 24)
    public void method894(class104 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1740++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 41)
    public static final void method895(int arg0, String arg1, String arg2, String arg3, int arg4) {
        class263.method1815(arg1, arg3, true, arg2, -1, arg0);
        int var5 = -23 / ((arg4 - 12) / 41);
        field1737++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "()Z", line = 51)
    public boolean method896() {
        field1744++;
        return false;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V", line = 66)
    public static final void method897(int arg0, int arg1) {
        class188.field3158[2] = (float) class36.method319(255, arg1) / 255.0F;
        field1746++;
        class188.field3158[0] = (float) (class36.method319(arg1, 16739466) >> 16) / 255.0F;
        class188.field3158[1] = (float) class36.method319(255, arg1 >> 8) / 255.0F;
        class344.method2410(3, (byte) 93);
        class344.method2410(4, (byte) 60);
        int var2 = -6 % ((14 - arg0) / 50);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)Luk;", line = 95)
    public class104 method898(int arg0, int arg1, int arg2) {
        field1739++;
        return this;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIIIJILil;)V")
    public abstract void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class65 arg10);

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "()I")
    public abstract int method95();

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII)V")
    public abstract void method97(int arg0, int arg1, int arg2, int arg3, int arg4);
}
