import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class194 extends class146 {

    @OriginalMember(owner = "client!u", name = "r", descriptor = "[I")
    public int[] field3173 = new int[1];

    @OriginalMember(owner = "client!u", name = "x", descriptor = "[I")
    public int[] field3179 = new int[] { -1 };

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field3172 = 0;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field3170 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!u", name = "s", descriptor = "[[I")
    public static int[][] field3174 = new int[5][5000];

    @OriginalMember(owner = "client!u", name = "p", descriptor = "[I")
    public static int[] field3171 = new int[50];

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!u", name = "v", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "Lbf;")
    public static class102 field3181;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lkj;B)Lkj;")
    public static final class114 method1326(class114 arg0, byte arg1) {
        field3180++;
        if (arg1 <= 1) {
            return null;
        }
        class114 var2 = client.method1922(arg0);
        if (var2 == null) {
            var2 = arg0.field1889;
        }
        return var2;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)Lod;")
    public static final class260 method1327(int arg0) {
        if (arg0 != 50) {
            method1328(64);
        }
        field3175++;
        try {
            return (class260) Class.forName("kc").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
    public static final void method1328(int arg0) {
        class92.field1454.method1157(arg0 + 760);
        field3182++;
        if (arg0 != 0) {
            method1329(-56);
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
    public static void method1329(int arg0) {
        field3170 = null;
        field3171 = null;
        field3174 = null;
        if (arg0 != 3208) {
            method1327(-59);
        }
        field3181 = null;
    }
}
