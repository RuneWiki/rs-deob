import java.awt.Component;
import java.awt.Image;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class134 extends class148 {

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "Lja;")
    private static class62 field3064 = class30.method243(43, "Please wait)3)3)3");

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "Lja;")
    public static class62 field3071 = class30.method243(43, "bevor Sie den Vorgang wiederholen)3");

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "[[I")
    public static int[][] field3076 = new int[5][5000];

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "Lja;")
    public static class62 field3084 = field3064;

    @OriginalMember(owner = "client!tc", name = "db", descriptor = "I")
    public static int field3088 = 0;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "[Z")
    public static boolean[] field3070 = new boolean[100];

    @OriginalMember(owner = "client!tc", name = "cb", descriptor = "Lja;")
    public static class62 field3087 = class30.method243(43, "scrollen:");

    @OriginalMember(owner = "client!tc", name = "mb", descriptor = "Lja;")
    private static class62 field3097 = class30.method243(43, "Click to switch");

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "Lja;")
    public static class62 field3075 = field3097;

    @OriginalMember(owner = "client!tc", name = "nb", descriptor = "Lja;")
    private static class62 field3098 = class30.method243(43, "cyan:");

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "Lja;")
    public static class62 field3058 = field3098;

    @OriginalMember(owner = "client!tc", name = "ob", descriptor = "Lja;")
    public static class62 field3099 = class30.method243(43, "_");

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "Lja;")
    public static class62 field3065 = field3098;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
    public int field3059;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
    public int field3060;

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
    public int field3061;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "I")
    public int field3062;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "I")
    public int field3063;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
    public int field3067;

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
    public int field3068;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "I")
    public int field3072;

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "I")
    public int field3073;

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "I")
    public int field3074;

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "I")
    public int field3081;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "I")
    public int field3085;

    @OriginalMember(owner = "client!tc", name = "fb", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "client!tc", name = "gb", descriptor = "I")
    public int field3091;

    @OriginalMember(owner = "client!tc", name = "jb", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!tc", name = "lb", descriptor = "I")
    public int field3096;

    @OriginalMember(owner = "client!tc", name = "pb", descriptor = "I")
    public int field3100;

    @OriginalMember(owner = "client!tc", name = "kb", descriptor = "Lea;")
    public static class29 field3095;

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "Lic;")
    public static class58 field3069;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "Lke;")
    public class74 field3080;

    @OriginalMember(owner = "client!tc", name = "bb", descriptor = "Lnd;")
    public class94 field3086;

    @OriginalMember(owner = "client!tc", name = "eb", descriptor = "Lob;")
    public class98 field3089;

    @OriginalMember(owner = "client!tc", name = "ib", descriptor = "Loc;")
    public class99 field3093;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "Ljava/awt/Image;")
    public static Image field3057;

    @OriginalMember(owner = "client!tc", name = "hb", descriptor = "[I")
    public static int[] field3092;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)Z")
    public static final boolean method1068(int arg0, int arg1) {
        if (arg1 == 3511) {
            field3082++;
            return (arg0 >> 31 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILpd;I)Z")
    public static final boolean method1069(int arg0, class108 arg1, int arg2) {
        field3077++;
        byte[] var3 = arg1.method878(-1, arg2);
        if (var3 == null) {
            return false;
        }
        class105.method852((byte) -107, var3);
        if (arg0 != 0) {
            method1072(51);
        }
        return true;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
    public static final void method1070(int arg0) {
        class113.field2613.method753(true);
        field3056++;
        int var1 = 0;
        if (arg0 != -309) {
            method1072(-27);
        }
        while (var1 < 32) {
            class8.field220[var1] = 0L;
            var1++;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class113.field2616[var2] = 0L;
        }
        class155.field3577 = 0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method1071(Component arg0, byte arg1) {
        if (arg1 <= 66) {
            field3076 = null;
        }
        Method var2 = class41.field953;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class13.field315);
        arg0.addFocusListener(class13.field315);
        field3079++;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
    public static void method1072(int arg0) {
        if (arg0 != -13223) {
            field3071 = null;
        }
        field3058 = null;
        field3071 = null;
        field3084 = null;
        field3069 = null;
        field3087 = null;
        field3070 = null;
        field3099 = null;
        field3076 = null;
        field3065 = null;
        field3097 = null;
        field3075 = null;
        field3092 = null;
        field3095 = null;
        field3098 = null;
        field3064 = null;
        field3057 = null;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(II)V")
    public static final void method1073(int arg0, int arg1) {
        if (arg0 < 9) {
            return;
        }
        field3083++;
        if (class43.field1011 == 0) {
            class94.field2215.method58((byte) -21, arg1);
        } else {
            class151.field3542 = arg1;
        }
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
    public final void method1074(int arg0) {
        this.field3086 = null;
        this.field3080 = null;
        this.field3093 = null;
        field3066++;
        this.field3089 = null;
        int var2 = 109 / ((-arg0 - 62) / 48);
    }
}
