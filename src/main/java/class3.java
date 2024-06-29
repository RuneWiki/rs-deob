import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public class class3 {

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "Lea;")
    private static class10 field15 = method8("Gem Shop", -73);

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "Lda;")
    public static class8 field14 = new class8();

    @OriginalMember(owner = "mapview!b", name = "e", descriptor = "Lea;")
    private static class10 field18 = method8("???", -10);

    @OriginalMember(owner = "mapview!b", name = "d", descriptor = "Lea;")
    public static class10 field17 = method8("sprites", 100);

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "Lea;")
    public static class10 field16 = method8("map", 102);

    @OriginalMember(owner = "mapview!b", name = "h", descriptor = "Lea;")
    public static class10 field21 = method8("Key", -127);

    @OriginalMember(owner = "mapview!b", name = "f", descriptor = "Lj;")
    public static class18 field19 = null;

    @OriginalMember(owner = "mapview!b", name = "j", descriptor = "Lea;")
    private static class10 field23 = method8("Short)2cut", 122);

    @OriginalMember(owner = "mapview!b", name = "i", descriptor = "Lea;")
    public static class10 field22 = method8("underlay)3dat", 111);

    @OriginalMember(owner = "mapview!b", name = "g", descriptor = "I")
    public static int field20 = 0;

    @OriginalMember(owner = "mapview!b", name = "k", descriptor = "Lea;")
    public static class10 field24 = method8("fonts", -115);

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Ljava/lang/String;I)Lea;", line = 6)
    public static final class10 method8(String arg0, int arg1) {
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class10 var4 = new class10();
        var4.field78 = new byte[var3];
        int var5 = 0;
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field78[var4.field83++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field78[var4.field83++] = (byte) var6;
            }
        }
        int var8 = -54 / ((arg1 - 43) / 47);
        var4.method55(0);
        return var4.method49(-126);
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(I)V", line = 44)
    public static void method9(int arg0) {
        field24 = null;
        field23 = null;
        field18 = null;
        if (arg0 != 24799) {
            field24 = null;
        }
        field22 = null;
        field21 = null;
        field17 = null;
        field15 = null;
        field16 = null;
        field14 = null;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "([Lea;Z)Lea;", line = 70)
    public static final class10 method10(class10[] arg0, boolean arg1) {
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        } else if (arg1) {
            return class18.method128(0, arg0.length, (byte) 103, arg0);
        } else {
            return (class10) null;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "(I)[Lea;", line = 113)
    public static final class10[] method11(int arg0) {
        if (arg0 != 28583) {
            field24 = null;
        }
        class10[] var10000 = new class10[] { class6.field51, class13.field111, class35.field473, mapview.field320, class33.field448, class40.field520, class32.field436, mapview.field383, class33.field446, class25.field387, class4.field29, class13.field119, class25.field386, class14.field160, class16.field182, class31.field425, class32.field441, class31.field429, class19.field205, class13.field148, class2.field11, class11.field91, field15, class1.field6, class28.field403, class4.field25, class4.field26, class22.field243, class14.field156, class18.field196, class7.field58, class39.field500, class38.field497, class39.field502, class21.field229, class8.field69, class2.field8, class35.field468, class16.field172, class25.field393, class6.field38, class40.field511, class14.field161, class31.field435, class16.field177, class34.field455, class40.field512, class25.field394, class6.field37, class31.field430, class1.field4, class20.field218, class2.field13, class6.field49, class40.field517, class35.field462, class36.field488, class19.field199, class1.field3, class20.field211, class16.field173, mapview.field317, field18, class22.field235, field18, class6.field46, field18, class8.field65, class2.field10, field18, field23, class38.field499, field18, class34.field456, class28.field410, field18, field18 };
        if (class18.field197) {
        }
        return var10000;
    }
}
