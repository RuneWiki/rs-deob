import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public abstract class class218 {

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public int field3065;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public int field3070;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public int field3071;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3062 = " has logged out.";

    @OriginalMember(owner = "client!og", name = "d", descriptor = "[F")
    public static float[] field3064 = new float[4];

    @OriginalMember(owner = "client!og", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3068 = "wave2:";

    @OriginalMember(owner = "client!og", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3061 = "Please wait...";

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "La;")
    public static class289 field3063;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "[[Z")
    public static boolean[][] field3067;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V", line = 7)
    public static void method1502(byte arg0) {
        field3062 = null;
        field3061 = null;
        field3063 = null;
        field3068 = null;
        if (arg0 == 54) {
            field3064 = null;
            field3067 = (boolean[][]) null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V", line = 38)
    public static final void method1503(int arg0, int arg1) {
        field3069++;
        class96 var2 = class141.method935(arg1, arg0, 102);
        var2.method582(arg0 - 6);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lq;BLq;)V", line = 59)
    public static final void method1504(class104 arg0, byte arg1, class104 arg2) {
        field3066++;
        if (arg0.field1341 != null) {
            arg0.method610(-1);
        }
        arg0.field1343 = arg2.field1343;
        arg0.field1341 = arg2;
        arg0.field1341.field1343 = arg0;
        int var3 = -108 / ((arg1 - 22) / 59);
        arg0.field1343.field1341 = arg0;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(III)V", line = 79)
    public class218(int arg0, int arg1, int arg2) {
        this.field3065 = arg0;
        this.field3070 = arg2;
        this.field3071 = arg1;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
    public abstract void method882(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIZ)V")
    public abstract void method884(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BII)V")
    public abstract void method881(byte arg0, int arg1, int arg2);
}
