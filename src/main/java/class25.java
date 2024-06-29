import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class25 {

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public int field376 = 0;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public int field381 = 0;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Lkb;")
    public static class93 field377 = class76.method390("(U0a )2 in: ", 0);

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field373 = 0;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "[I")
    public static int[] field382 = new int[256];

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field374 = -1;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field387 = 0;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "Lkb;")
    public static class93 field390 = class76.method390("gelb:", 0);

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "[I")
    public static int[] field392 = new int[4000];

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public int field388;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "Lac;")
    public class4 field386;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "[I")
    public static int[] field391;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Lkb;")
    public static final class93 method141(int arg0, int arg1) {
        int var2 = 111 % ((arg0 + 11) / 45);
        field384++;
        if (arg1 < 100000) {
            return class203.method1321(new class93[] { class148.field2860, class67.method357((byte) -94, arg1), class92.field1682 }, -66);
        } else if (arg1 < 10000000) {
            return class203.method1321(new class93[] { class3.field54, class67.method357((byte) -93, arg1 / 1000), class47.field766, class92.field1682 }, -26);
        } else {
            return class203.method1321(new class93[] { class115.field2156, class67.method357((byte) -108, arg1 / 1000000), class138.field2680, class92.field1682 }, -14);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static void method142(int arg0) {
        field390 = null;
        if (arg0 > -5) {
            field377 = null;
        }
        field391 = null;
        field382 = null;
        field377 = null;
        field392 = null;
    }
}
