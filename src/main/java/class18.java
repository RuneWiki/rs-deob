import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ja")
public class class18 {

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "I")
    public static int field197 = 0;

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "Lna;")
    public static class26 field196 = class6.method40("sprites", 48);

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "Lna;")
    public static class26 field198 = class6.method40("Cookery Shop", 48);

    @OriginalMember(owner = "mapview!ja", name = "d", descriptor = "Lna;")
    public static class26 field199 = class6.method40("75(U", 48);

    @OriginalMember(owner = "mapview!ja", name = "f", descriptor = "Lna;")
    public static class26 field201 = class6.method40("Loading", 48);

    @OriginalMember(owner = "mapview!ja", name = "e", descriptor = "Lna;")
    public static class26 field200;

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(B)Lma;", line = 22)
    public static final class24 method110(byte arg0) {
        class24 var1 = new class24(class4.field46, class33.field431, class19.field209, class8.field99, class11.field136);
        if (arg0 != -113) {
            field201 = null;
        }
        method114((byte) 75);
        return var1;
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(I)V", line = 36)
    public static void method111(int arg0) {
        field200 = null;
        field196 = null;
        field201 = null;
        field199 = null;
        if (arg0 != -26701) {
            method114((byte) -85);
        }
        field198 = null;
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(B)[Lna;", line = 58)
    public static final class26[] method112(byte arg0) {
        int var1 = -15 / ((arg0 + 32) / 50);
        return new class26[] { class13.field157, class2.field27, class26.field378, class12.field150, class39.field512, class2.field31, class4.field52, class31.field401, mapview.field340, class31.field408, class2.field37, mapview.field283, class1.field14 };
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(II)[B", line = 76)
    public static final synchronized byte[] method113(int arg0, int arg1) {
        if (arg0 == arg1 && class7.field87 > 0) {
            byte[] var2 = class19.field207[--class7.field87];
            class19.field207[class7.field87] = null;
            return var2;
        } else if (arg1 == 5000 && class21.field221 > 0) {
            byte[] var3 = class11.field137[--class21.field221];
            class11.field137[class21.field221] = null;
            return var3;
        } else if (arg1 == 30000 && class23.field240 > 0) {
            byte[] var4 = class2.field30[--class23.field240];
            class2.field30[class23.field240] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "(B)V", line = 109)
    public static final void method114(byte arg0) {
        class19.field209 = null;
        class33.field431 = null;
        class11.field136 = null;
        if (arg0 != 75) {
            field196 = null;
        }
        class8.field99 = null;
        class4.field46 = null;
        class9.field102 = null;
    }
}
