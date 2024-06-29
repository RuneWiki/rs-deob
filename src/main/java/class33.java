import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!v")
public class class33 extends class23 {

    @OriginalMember(owner = "mapview!v", name = "g", descriptor = "Lt;")
    public static class31 field349 = class14.method84(112, "Guide");

    @OriginalMember(owner = "mapview!v", name = "f", descriptor = "Lt;")
    public static class31 field348 = class14.method84(108, "mapfunction");

    @OriginalMember(owner = "mapview!v", name = "j", descriptor = "Lt;")
    public static class31 field352 = class14.method84(119, "Mace Shop");

    @OriginalMember(owner = "mapview!v", name = "k", descriptor = "[[B")
    public static byte[][] field353 = new byte[250][];

    @OriginalMember(owner = "mapview!v", name = "h", descriptor = "Lt;")
    public class31 field350;

    @OriginalMember(owner = "mapview!v", name = "i", descriptor = "[[B")
    public static byte[][] field351;

    @OriginalMember(owner = "mapview!v", name = "c", descriptor = "(I)V", line = 14)
    public static final void method207(int arg0) {
        class17 var1 = class11.field78;
        synchronized (class11.field78) {
            class1.field4 = class18.field156;
            if (class28.field316 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class14.field111[var2] = false;
                }
                class28.field316 = class14.field104;
            } else {
                while (class28.field316 != class14.field104) {
                    int var3 = class18.field154[class14.field104];
                    class14.field104 = class14.field104 + 1 & 0x7F;
                    if (var3 < 0) {
                        class14.field111[~var3] = false;
                    } else {
                        class14.field111[var3] = true;
                    }
                }
            }
            class18.field156 = class6.field57;
            if (arg0 != -12415) {
                method208(15);
            }
        }
    }

    @OriginalMember(owner = "mapview!v", name = "d", descriptor = "(I)V", line = 56)
    public static void method208(int arg0) {
        field353 = null;
        field348 = null;
        field349 = null;
        field352 = null;
        if (arg0 < 48) {
            field351 = null;
        }
        field351 = null;
    }

    @OriginalMember(owner = "mapview!v", name = "a", descriptor = "(I[BI)I", line = 80)
    public static final int method209(int arg0, byte[] arg1, int arg2) {
        if (arg0 > -112) {
            field353 = null;
        }
        return class31.method188(arg1, arg2, 0, 92);
    }
}
