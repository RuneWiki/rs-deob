import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ma")
public class class24 {

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "Lj;")
    public static class17 field310 = class30.method190(-103, "Please wait)3)3)3 Rendering Map");

    @OriginalMember(owner = "mapview!ma", name = "e", descriptor = "J")
    public static volatile long field314 = 0L;

    @OriginalMember(owner = "mapview!ma", name = "f", descriptor = "Lj;")
    public static class17 field315 = class30.method190(-104, "loc)3dat");

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "I")
    public static int field311 = -1;

    @OriginalMember(owner = "mapview!ma", name = "i", descriptor = "I")
    public static int field318 = 0;

    @OriginalMember(owner = "mapview!ma", name = "j", descriptor = "I")
    public static int field319 = 0;

    @OriginalMember(owner = "mapview!ma", name = "h", descriptor = "Z")
    public static volatile boolean field317 = false;

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "Lj;")
    public static class17 field312 = class30.method190(-90, "Silver Shop");

    @OriginalMember(owner = "mapview!ma", name = "d", descriptor = "Lj;")
    public static class17 field313 = class30.method190(-95, "Axe Shop");

    @OriginalMember(owner = "mapview!ma", name = "m", descriptor = "Lj;")
    public static class17 field322 = class30.method190(-92, "Water Source");

    @OriginalMember(owner = "mapview!ma", name = "g", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "mapview!ma", name = "n", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "mapview!ma", name = "k", descriptor = "[B")
    public static byte[] field320;

    @OriginalMember(owner = "mapview!ma", name = "l", descriptor = "[Lv;")
    public static class36[] field321;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(I)V", line = 40)
    public static void method160(int arg0) {
        field313 = null;
        field310 = null;
        field321 = null;
        field320 = null;
        field312 = null;
        field322 = null;
        if (arg0 != -1) {
            field323 = -5;
        }
        field315 = null;
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(I)V", line = 62)
    public static final void method161(int arg0) {
        if (class2.field84[0][class23.field305][class18.field276] == null) {
            class18.field271 = null;
        } else {
            class18.field271 = class2.field84[0][class23.field305][class18.field276];
        }
        if (class2.field84[1][class23.field305][class18.field276] == null) {
            class23.field309 = null;
        } else {
            class23.field309 = class2.field84[1][class23.field305][class18.field276];
        }
        int var1 = 16 % ((arg0 - 22) / 46);
        if (class2.field84[2][class23.field305][class18.field276] == null) {
            class4.field114 = null;
        } else {
            class4.field114 = class2.field84[2][class23.field305][class18.field276];
        }
        if (class2.field84[3][class23.field305][class18.field276] == null) {
            class35.field447 = null;
        } else {
            class35.field447 = class2.field84[3][class23.field305][class18.field276];
        }
        if (class2.field84[4][class23.field305][class18.field276] == null) {
            class13.field238 = null;
        } else {
            class13.field238 = class2.field84[4][class23.field305][class18.field276];
        }
        if (class20.field293[class23.field305][class18.field276] == null) {
            class6.field122 = null;
        } else {
            class6.field122 = class20.field293[class23.field305][class18.field276];
        }
        if (mapview.field36[class23.field305][class18.field276] == null) {
            class1.field78 = null;
        } else {
            class1.field78 = mapview.field36[class23.field305][class18.field276];
        }
        if (class33.field408[class23.field305][class18.field276] == null) {
            class26.field346 = null;
        } else {
            class26.field346 = class33.field408[class23.field305][class18.field276];
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "(I)B", line = 118)
    public static final byte method162(int arg0) {
        if (arg0 != 31072) {
            method162(-92);
        }
        return class4.field114 == null ? 0 : class4.field114[class13.field234];
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lg;", line = 167)
    public static final class11 method163(Throwable arg0, String arg1) {
        class11 var2;
        if (arg0 instanceof class11) {
            var2 = (class11) arg0;
            var2.field225 = var2.field225 + ' ' + arg1;
        } else {
            var2 = new class11(arg0, arg1);
        }
        return var2;
    }
}
