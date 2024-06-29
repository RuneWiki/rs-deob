import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public abstract class class88 {

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field1246 = new String[100];

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field1248 = 0;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "[I")
    public static int[] field1247 = new int[256];

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field1250 = 0;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field1251 = new String[500];

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 7)
    public static void method681(int arg0) {
        field1251 = null;
        if (arg0 < -4) {
            field1246 = null;
            field1247 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)I", line = 22)
    public static final int method682(int arg0, int arg1) {
        field1249++;
        return arg1 == 10383 ? arg0 >>> 7 : -53;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lah;I)Lah;")
    public abstract class33 method683(class33 arg0, int arg1);
}
