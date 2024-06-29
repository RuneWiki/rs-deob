import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class65 {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Z")
    public static boolean field977 = false;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "[Lfb;")
    public static class284[] field980 = new class284[50];

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Lnh;")
    public static class312 field976 = new class312(64);

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field983 = new String[100];

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Lrb;")
    public static class143 field982 = new class143(16);

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "[[B")
    public static byte[][] field984 = new byte[1000][];

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Ljava/lang/String;")
    public static String field985 = "yellow:";

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Llc;")
    public static class270 field986;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Lvf;")
    public static class60 field981;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[Ljava/lang/String;[S)V")
    public static final void method488(int arg0, String[] arg1, short[] arg2) {
        field979++;
        class242.method1661(arg1.length - 1, arg0, arg2, 2, arg1);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILlc;Llc;)V")
    public static final void method489(int arg0, class270 arg1, class270 arg2) {
        field978++;
        class284.field4566 = arg2;
        class240.field3518 = arg1;
        if (arg0 != 23494) {
            field977 = true;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static void method490(byte arg0) {
        field985 = null;
        field984 = null;
        field981 = null;
        field976 = null;
        if (arg0 == 4) {
            field983 = null;
            field986 = null;
            field980 = null;
            field982 = null;
        }
    }
}
