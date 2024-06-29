import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class13 extends class25 {

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "Lbk;")
    public class20 field196;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "Ldf;")
    public static class51 field193 = class46.method233(")1p", 100);

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "[J")
    public static long[] field192 = new long[500];

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "J")
    public static long field197 = 0L;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "Lla;")
    public static class91 field199;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "[I")
    public static int[] field198;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(I)V")
    public static void method74(int arg0) {
        field198 = null;
        field193 = null;
        if (arg0 == 0) {
            field192 = null;
            field199 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lbk;)V")
    public class13(class20 arg0) {
        this.field196 = arg0;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)Z")
    public static final boolean method75(boolean arg0) {
        field195++;
        try {
            if (!arg0) {
                field194 = -96;
            }
            if (class52.field876 == 2) {
                if (class23.field343 == null) {
                    class23.field343 = class18.method92(class134.field2225, class82.field1382, class204.field3419);
                    if (class23.field343 == null) {
                        return false;
                    }
                }
                if (class69.field1110 == null) {
                    class69.field1110 = new class39(class128.field2140, class189.field3162);
                }
                if (class162.field2656.method586(22050, class69.field1110, class23.field343, -23935, class168.field2738)) {
                    class162.field2656.method583((byte) -31);
                    class162.field2656.method596((byte) 127, class144.field2402);
                    class162.field2656.method567(class23.field343, class227.field3974, -3935);
                    class134.field2225 = null;
                    class23.field343 = null;
                    class69.field1110 = null;
                    class52.field876 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class162.field2656.method561(116);
            class52.field876 = 0;
            class23.field343 = null;
            class69.field1110 = null;
            class134.field2225 = null;
        }
        return false;
    }
}
