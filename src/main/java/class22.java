import java.awt.FontMetrics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class22 {

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "Lh;")
    public static class15 field315 = class26.method190(true, "Jewellery");

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "Lh;")
    public static class15 field314 = class26.method190(true, "Enter place name to find");

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "Lh;")
    public static class15 field317 = class26.method190(true, "Brewery");

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "Lh;")
    public static class15 field313 = class26.method190(true, "Food Shop");

    @OriginalMember(owner = "mapview!ka", name = "h", descriptor = "I")
    public static int field319 = 0;

    @OriginalMember(owner = "mapview!ka", name = "i", descriptor = "Lh;")
    public static class15 field320 = class26.method190(true, "overlay)3dat");

    @OriginalMember(owner = "mapview!ka", name = "k", descriptor = "Lh;")
    public static class15 field322 = class26.method190(true, "Tannery");

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "Lh;")
    public static class15 field316 = class26.method190(true, "Helmet Shop");

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "Lm;")
    public static class25 field312;

    @OriginalMember(owner = "mapview!ka", name = "l", descriptor = "Lna;")
    public static class27 field323;

    @OriginalMember(owner = "mapview!ka", name = "g", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field318;

    @OriginalMember(owner = "mapview!ka", name = "j", descriptor = "Ljava/awt/Image;")
    public static Image field321;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(Laa;ILh;Lh;)[Ls;", line = 10)
    public static final class32[] method166(class2 arg0, int arg1, class15 arg2, class15 arg3) {
        int var4 = arg0.method43(arg2, (byte) 45);
        if (arg1 > -61) {
            method167(75);
        }
        int var5 = arg0.method38(arg3, var4, 3);
        return class21.method165(arg0, true, var5, var4);
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I)V", line = 57)
    public static void method167(int arg0) {
        field315 = null;
        field321 = null;
        field313 = null;
        field318 = null;
        field314 = null;
        if (arg0 <= 56) {
            method166(null, -20, null, null);
        }
        field320 = null;
        field323 = null;
        field322 = null;
        field312 = null;
        field316 = null;
        field317 = null;
    }
}
