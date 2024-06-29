import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class293 {

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field4980 = 500;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field4983 = 0;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "Lmh;")
    private static class62 field4990 = class201.method1405(true, "Take");

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Lmh;")
    public static class62 field4984 = field4990;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field4985 = 0;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field4992 = 0;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "Lmh;")
    public static class62 field4991 = class201.method1405(true, "hint_mapedge");

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field4993 = 0;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "Lmh;")
    public static class62 field4989 = class201.method1405(true, " loggt sich aus)3");

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "[I")
    public static int[] field4979;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "[Lwj;")
    public static class135[] field4982;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)J", line = 20)
    public static final synchronized long method1985(byte arg0) {
        if (arg0 != -71) {
            return 7L;
        }
        field4988++;
        long var1 = System.currentTimeMillis();
        if (class114.field1921 > var1) {
            class22.field230 += class114.field1921 - var1;
        }
        class114.field1921 = var1;
        return class22.field230 + var1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V", line = 46)
    public static void method1986(boolean arg0) {
        if (arg0) {
            field4981 = -121;
        }
        field4990 = null;
        field4991 = null;
        field4982 = null;
        field4984 = null;
        field4979 = null;
        field4989 = null;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)Z", line = 74)
    public static final boolean method1987(boolean arg0) {
        field4986++;
        if (!arg0) {
            method1987(false);
        }
        class109 var1 = class111.field1810;
        synchronized (class111.field1810) {
            if (class228.field3970 == class155.field2504) {
                return false;
            } else {
                class246.field4182 = class290.field4932[class228.field3970];
                class73.field1125 = class26.field296[class228.field3970];
                class228.field3970 = class228.field3970 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lu;I)V", line = 105)
    public static final void method1988(class204 arg0, int arg1) {
        field4987++;
        for (class114 var2 = (class114) class101.field1663.method334(-18673); var2 != null; var2 = (class114) class101.field1663.method335((byte) 105)) {
            if (var2.field1920 == arg0) {
                if (var2.field1898 != null) {
                    class27.field331.method132(var2.field1898);
                    var2.field1898 = null;
                }
                var2.method1444((byte) 89);
                return;
            }
        }
        if (arg1 <= 86) {
            field4979 = (int[]) null;
        }
    }
}
