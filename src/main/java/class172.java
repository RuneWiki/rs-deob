import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class172 extends class67 {

    @OriginalMember(owner = "client!t", name = "D", descriptor = "[B")
    public byte[] field3440;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "[Lic;")
    public static class77[] field3433 = new class77[32768];

    @OriginalMember(owner = "client!t", name = "x", descriptor = "Led;")
    public static class43 field3434 = class191.method1219("headicons_prayer", false);

    @OriginalMember(owner = "client!t", name = "z", descriptor = "Led;")
    public static class43 field3436 = class191.method1219("Der Server wird gerade aktualisiert)3", false);

    @OriginalMember(owner = "client!t", name = "F", descriptor = "Led;")
    public static class43 field3442 = class191.method1219("gelb:", false);

    @OriginalMember(owner = "client!t", name = "A", descriptor = "Led;")
    public static class43 field3437 = class191.method1219(" )2> <col=ffff00>", false);

    @OriginalMember(owner = "client!t", name = "u", descriptor = "Led;")
    public static class43 field3431 = class191.method1219("<col=00ff00>", false);

    @OriginalMember(owner = "client!t", name = "E", descriptor = "Led;")
    private static class43 field3441 = class191.method1219(" has logged in)3", false);

    @OriginalMember(owner = "client!t", name = "H", descriptor = "Led;")
    public static class43 field3444 = field3441;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "[[[B")
    public static byte[][][] field3435;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
    public static void method1089(int arg0) {
        field3437 = null;
        field3434 = null;
        field3435 = null;
        field3433 = null;
        field3431 = null;
        field3442 = null;
        field3444 = null;
        if (arg0 != 0) {
            method1090(8, (byte) -94);
        }
        field3436 = null;
        field3441 = null;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "([B)V")
    public class172(byte[] arg0) {
        this.field3440 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)Led;")
    public static final class43 method1090(int arg0, byte arg1) {
        field3438++;
        if (arg1 < 91) {
            return null;
        } else if (arg0 < 999999999) {
            return class30.method161(arg0, 10);
        } else {
            return class124.field2458;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(JI)V")
    public static final void method1091(long arg0, int arg1) {
        field3432++;
        if (arg0 == 0L) {
            return;
        }
        if (class73.field1457 >= 100) {
            class81.method504(class174.field3470, class110.field2127, 0, (byte) 118);
            return;
        }
        class43 var3 = class9.method47(arg0, (byte) -119).method273(-117);
        for (int var4 = 0; var4 < class73.field1457; var4++) {
            if (class78.field1546[var4] == arg0) {
                class81.method504(class167.method1036(new class43[] { var3, class143.field2955 }, true), class110.field2127, 0, (byte) 99);
                return;
            }
        }
        for (int var5 = arg1; var5 < class40.field778; var5++) {
            if (class117.field2286[var5] == arg0) {
                class81.method504(class167.method1036(new class43[] { class73.field1455, var3, class95.field1853 }, true), class110.field2127, 0, (byte) 54);
                return;
            }
        }
        if (var3.method257(class67.field1348.field23, 57)) {
            class81.method504(class159.field3227, class110.field2127, 0, (byte) 60);
            return;
        }
        class16.field237++;
        class78.field1546[class73.field1457] = arg0;
        class185.field3640[class73.field1457++] = class9.method47(arg0, (byte) -97);
        class27.field479 = class200.field3940;
        class29.field522.method338(253, 200);
        class29.field522.method550(-94, arg0);
    }
}
