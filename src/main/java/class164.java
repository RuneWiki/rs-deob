import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class164 {

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Ljd;")
    public static class86 field3077 = class122.method868(":", true);

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field3078 = 50;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "Ljd;")
    public static class86 field3076 = class122.method868("Angreifen", true);

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Ljd;")
    public static class86 field3070 = class122.method868("runes", true);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "[I")
    public static int[] field3068 = new int[4096];

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
    public static int[] field3072 = new int[field3078];

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "[I")
    public static int[] field3073 = new int[field3078];

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Ljd;")
    public static class86 field3075 = class122.method868("Fertigkeit:", true);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "[I")
    public static int[] field3067 = new int[field3078];

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
    public static int[] field3071 = new int[field3078];

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "[I")
    public static int[] field3082 = new int[field3078];

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "[I")
    public static int[] field3079 = new int[field3078];

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public static int field3083 = 0;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "[I")
    public static int[] field3084 = new int[field3078];

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "[Ljd;")
    public static class86[] field3069 = new class86[field3078];

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "[[B")
    public static byte[][] field3086;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)I")
    public abstract int method191(byte arg0);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method1187(int arg0) {
        field3069 = null;
        field3076 = null;
        field3072 = null;
        field3067 = null;
        field3075 = null;
        field3077 = null;
        if (arg0 != 271801008) {
            return;
        }
        field3082 = null;
        field3079 = null;
        field3084 = null;
        field3068 = null;
        field3070 = null;
        field3071 = null;
        field3073 = null;
        field3086 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method192(Component arg0, boolean arg1);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public static final void method1188(int arg0) {
        field3083 = 0;
        class102.field1971 = 0;
        field3081++;
        class23.method170((byte) 126);
        class16.method122(28271);
        class18.method150((byte) 18);
        for (int var1 = 0; var1 < class102.field1971; var1++) {
            int var4 = class1.field11[var1];
            if (class236.field4265 != class233.field4217[var4].field702) {
                if (class233.field4217[var4].field3130.method89(-1)) {
                    class54.method401((byte) 113, class233.field4217[var4]);
                }
                class233.field4217[var4].field3130 = null;
                class233.field4217[var4] = null;
            }
        }
        if (class112.field2143 != class168.field3102.field3565) {
            throw new RuntimeException("gnp1 pos:" + class168.field3102.field3565 + " psize:" + class112.field2143);
        }
        int var2 = -91 % ((arg0 + 71) / 33);
        for (int var3 = 0; var3 < class61.field1207; var3++) {
            if (class233.field4217[class189.field3350[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class61.field1207);
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method190(Component arg0, byte arg1);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lwj;I)Lwj;")
    public static final class6 method1189(class6 arg0, int arg1) {
        field3080++;
        if (arg0.field221 != -1) {
            return class25.method178(arg1 ^ 0x10335AFF, arg0.field221);
        }
        int var2 = arg0.field222 >>> 16;
        if (arg1 != 271801008) {
            field3075 = null;
        }
        class187 var3 = new class187(class1.field15);
        for (class1 var4 = (class1) var3.method1286(347); var4 != null; var4 = (class1) var3.method1289(13052)) {
            if (var4.field2 == var2) {
                return class25.method178(126, (int) var4.field3759);
            }
        }
        return null;
    }
}
