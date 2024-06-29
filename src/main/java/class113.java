import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class113 {

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field2183 = 0;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "[Lmb;")
    public static class132[] field2186 = new class132[100];

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "[I")
    public static int[] field2187;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static void method765(int arg0) {
        field2187 = null;
        field2186 = null;
        if (arg0 != 8) {
            method769(109);
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
    public static final void method766(int arg0) {
        field2190++;
        int var1 = class53.field895.method687(class155.field2843);
        for (int var2 = arg0; var2 < class57.field974; var2++) {
            int var6 = class53.field895.method687(class127.method834(var2, false));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        class172.field3208 = var1;
        int var3 = class57.field974 * 15 + 21;
        int var4 = class48.field826 - var1 / 2;
        class202.field3721 = true;
        class160.field2913 = class57.field974 * 15 + 22;
        int var5 = class189.field3501;
        if (var3 + var5 > class47.field813) {
            var5 = class47.field813 - var3;
        }
        if (class187.field3461 < var1 + var4) {
            var4 = class187.field3461 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        class25.field407 = var5;
        class52.field887 = var4;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)V")
    public static final void method767(byte arg0, int arg1) {
        field2189++;
        class219 var2 = (class219) class231.field4166.method806(-1, (long) arg1);
        if (var2 == null) {
            return;
        }
        if (arg0 < 74) {
            method769(-20);
        }
        for (int var3 = 0; var3 < var2.field3997.length; var3++) {
            var2.field3997[var3] = -1;
            var2.field3998[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
    public static final void method768(int arg0, int arg1) {
        class163.field2949 = arg0;
        field2185++;
        class185.field3438 = 50;
        if (arg1 < 123) {
            field2183 = 46;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)J")
    public static final synchronized long method769(int arg0) {
        field2184++;
        if (arg0 <= 35) {
            method767((byte) 89, 41);
        }
        long var1 = System.currentTimeMillis();
        if (class186.field3447 > var1) {
            class198.field3679 += class186.field3447 - var1;
        }
        class186.field3447 = var1;
        return var1 + class198.field3679;
    }
}
