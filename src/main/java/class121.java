import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class121 extends class47 {

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "Z")
    public static boolean field2945 = false;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "Loc;")
    public static class99 field2952 = class48.method402((byte) -104, "backright1");

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    public static int field2956 = 0;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "[[I")
    public static int[][] field2947 = new int[104][104];

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "Loc;")
    public static class99 field2946 = class48.method402((byte) -104, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "[[[I")
    public static int[][][] field2964 = new int[4][105][105];

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
    public static int field2950 = 0;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "Loc;")
    public static class99 field2961 = class48.method402((byte) -104, "Null");

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public static int field2963 = 0;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "Loc;")
    public static class99 field2948 = class48.method402((byte) -104, "Bitte versuchen Sie)1");

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
    public static int field2954 = 0;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "[Loc;")
    public static class99[] field2960 = new class99[5];

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "Z")
    public static boolean field2957 = false;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "Loc;")
    private static class99 field2959 = class48.method402((byte) -104, "Enter name of friend to add to list");

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "Loc;")
    public static class99 field2965 = field2959;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "Lsa;")
    public class121 field2951;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "Lsa;")
    public class121 field2953;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lre;B)V")
    public static final void method1008(class120 arg0, byte arg1) {
        if (arg1 != 30) {
            return;
        }
        arg0.field2942 = false;
        field2955++;
        if (arg0.field2943 != null) {
            arg0.field2943.field1925 = 0;
        }
        for (class120 var2 = arg0.method100(); var2 != null; var2 = arg0.method106()) {
            method1008(var2, (byte) 30);
        }
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V")
    public static void method1009(byte arg0) {
        field2947 = null;
        field2965 = null;
        field2964 = null;
        if (arg0 != 104) {
            field2959 = null;
        }
        field2961 = null;
        field2959 = null;
        field2952 = null;
        field2946 = null;
        field2948 = null;
        field2960 = null;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
    public final void method1010(byte arg0) {
        field2949++;
        if (this.field2951 == null) {
            return;
        }
        this.field2951.field2953 = this.field2953;
        this.field2953.field2951 = this.field2951;
        this.field2953 = null;
        this.field2951 = null;
        if (arg0 != 45) {
            field2959 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILra;Lpc;Lpc;Z)V")
    public static final void method1011(int arg0, class115 arg1, class105 arg2, class105 arg3, boolean arg4) {
        class37.field935 = arg3;
        class7.field212 = arg2;
        if (arg0 >= -73) {
            field2956 = -39;
        }
        field2958++;
        class133.field3261 = arg4;
        class37.field941 = class37.field935.method892(true, 10);
        class54.field1299 = arg1;
    }
}
