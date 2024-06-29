import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public abstract class class374 {

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field4839 = new String[100];

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V")
    public abstract void method836(boolean arg0);

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
    public static void method2120(int arg0) {
        if (arg0 != -1121067160) {
            method2120(-111);
        }
        field4839 = null;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)Lks;")
    public abstract class304 method841(int arg0);

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)I")
    public static final int method2121(int arg0, int arg1) {
        field4838++;
        if (arg0 != -1121067160) {
            field4837 = 4;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)V")
    public abstract void method838(int arg0);

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)Z")
    public abstract boolean method834(boolean arg0, int arg1);
}
