import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class246 extends class45 {

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "Z")
    public boolean field3320 = false;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public int field3323 = -1;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field3316 = new String[5];

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public int field3317;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public int field3321;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public int field3322;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    public int field3326;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public int field3327;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "Llm;")
    public static class347 field3318;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "[[[I")
    public static int[][][] field3324;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)Lqa;", line = 3)
    public static final class242 method1486(int arg0) {
        if (arg0 != -18692) {
            return null;
        }
        field3319++;
        try {
            return (class242) Class.forName("jl").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V", line = 25)
    public static final void method1487(int arg0) {
        if (arg0 >= -85) {
            return;
        }
        field3325++;
        class189 var1 = class48.field674;
        synchronized (class48.field674) {
            class48.field674.method1141(256);
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(I)V", line = 74)
    public class246(int arg0) {
        this.field3323 = arg0;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)V", line = 62)
    public static void method1488(byte arg0) {
        if (arg0 < 69) {
            field3324 = null;
        }
        field3318 = null;
        field3324 = null;
        field3316 = null;
    }
}
