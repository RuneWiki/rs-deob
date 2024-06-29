import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class21 {

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "[I")
    public static int[] field239 = new int[32];

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field243 = 0;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field244 = 0;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Loa;")
    public static class99 field240 = class221.method1463(2844, "Choisir une option");

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Lwk;")
    public static class273 field249 = new class273(500);

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Ltg;")
    public static class182 field246;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIILuk;JZ)V")
    public static final void method123(int arg0, int arg1, int arg2, int arg3, class98 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class278 var8 = new class278();
        var8.field4891 = arg4;
        var8.field4884 = arg1 * 128 + 64;
        var8.field4882 = arg2 * 128 + 64;
        var8.field4878 = arg3;
        var8.field4889 = arg5;
        if (class128.field2236[arg0][arg1][arg2] == null) {
            class128.field2236[arg0][arg1][arg2] = new class216(arg0, arg1, arg2);
        }
        class128.field2236[arg0][arg1][arg2].field3757 = var8;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static final void method124(int arg0) {
        field248++;
        class138.method942(5, (byte) -82);
        class220.method1459(5, 0);
        class54.method371(false, 5);
        class58.method394(-122, 5);
        class63.method415(5, false);
        class52.method363(0, 5);
        class32.method267(5, (byte) -116);
        class39.method302(342462184, 5);
        class251.method1631(5, -1);
        int var1 = -51 % ((arg0 - 19) / 35);
        class33.method276(5, -13182);
        class124.method819(-102, 5);
        class3.method13((byte) -108, 50);
        class129.method853(5, -863634588);
        class250.method1617((byte) 125, 5);
        class67.field1123.method1809(5, (byte) 101);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public static void method125(int arg0) {
        field240 = null;
        field249 = null;
        field246 = null;
        if (arg0 != 0) {
            field239 = null;
        }
        field239 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)V")
    public static final void method126(boolean arg0, int arg1) {
        if (!arg0) {
            field247++;
            class65 var2 = class152.method1010(arg1, 1, (byte) -33);
            var2.method426((byte) -33);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ltf;I)Ltf;")
    public static final class107 method127(class107 arg0, int arg1) {
        field242++;
        if (arg0.field1801 != -1) {
            return class22.method131(arg0.field1801, 1538872048);
        } else if (arg1 == 64) {
            int var2 = arg0.field1873 >>> 16;
            class127 var3 = new class127(class57.field959);
            for (class2 var4 = (class2) var3.method845(107); var4 != null; var4 = (class2) var3.method844((byte) 45)) {
                if (var4.field12 == var2) {
                    return class22.method131((int) var4.field2187, 1538872048);
                }
            }
            return null;
        } else {
            return null;
        }
    }
}
