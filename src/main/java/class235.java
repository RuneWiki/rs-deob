import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class235 extends class147 {

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public int field4172 = 0;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "Lqj;")
    private static class196 field4174 = class80.method502("", -48);

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "Lqj;")
    public static class196 field4176 = class80.method502(":chalreq:", -48);

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "[S")
    public static short[] field4173 = new short[256];

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "Lqj;")
    public static class196 field4178 = class80.method502(" ", -48);

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    public static int field4181 = -1;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "Lqj;")
    public static class196 field4170 = field4174;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "I")
    public static int field4182 = 0;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "[[I")
    public static int[][] field4183;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)V")
    public static final void method1576(byte arg0) {
        field4177++;
        int var1 = -19 / ((22 - arg0) / 46);
        class44.field514.method1529(382);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lqj;ISIIJLqj;)V")
    public static final void method1577(class196 arg0, int arg1, short arg2, int arg3, int arg4, long arg5, class196 arg6) {
        if (arg3 != -1709) {
            return;
        }
        field4186++;
        if (class160.field2574 || class125.field1767 >= 500) {
            return;
        }
        class65.field916[class125.field1767] = arg6;
        class52.field650[class125.field1767] = arg0;
        class142.field2169[class125.field1767] = arg2;
        class34.field410[class125.field1767] = arg5;
        class246.field4385[class125.field1767] = arg4;
        class47.field566[class125.field1767] = arg1;
        class125.field1767++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BILp;)V")
    private final void method1578(byte arg0, int arg1, class56 arg2) {
        if (arg0 >= -32) {
            this.field4172 = 126;
        }
        if (arg1 == 2) {
            this.field4172 = arg2.method318(true);
        }
        field4184++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)Lsj;")
    public static final class213 method1579(boolean arg0) {
        if (arg0) {
            return null;
        }
        field4175++;
        try {
            return (class213) Class.forName("ce").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lqj;BIJIII)V")
    public static final void method1580(class196 arg0, byte arg1, int arg2, long arg3, int arg4, int arg5, int arg6) {
        field4185++;
        class186.method1220(false);
        class56 var8 = new class56(128);
        var8.method329((byte) 16, 10);
        var8.method310((int) (Math.random() * 99999.0D), -88);
        var8.method310(502, -37);
        var8.method346(arg3, (byte) -99);
        if (arg1 > -107) {
            method1577(null, -30, (short) 27, -114, 94, -91L, null);
        }
        var8.method355((byte) 101, (int) (Math.random() * 9.9999999E7D));
        var8.method330(arg0, 12865);
        var8.method355((byte) -70, (int) (Math.random() * 9.9999999E7D));
        var8.method310(class22.field279, -83);
        var8.method329((byte) 45, arg5);
        var8.method329((byte) 30, arg4);
        var8.method355((byte) 108, (int) (Math.random() * 9.9999999E7D));
        var8.method310(arg6, -57);
        var8.method310(arg2, -120);
        var8.method355((byte) 104, (int) (Math.random() * 9.9999999E7D));
        var8.method361(class94.field1370, 22206, class19.field225);
        class44.field520.field699 = 0;
        class44.field520.method329((byte) 33, 44);
        class44.field520.method329((byte) 34, var8.field699);
        class44.field520.method360(0, true, var8.field693, var8.field699);
        class22.field289 = 3;
        class16.field179 = 1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLp;)V")
    public final void method1581(byte arg0, class56 arg1) {
        field4180++;
        if (arg0 > -98) {
            return;
        }
        while (true) {
            int var3 = arg1.method367(1);
            if (var3 == 0) {
                return;
            }
            this.method1578((byte) -85, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)V")
    public static void method1582(byte arg0) {
        field4174 = null;
        field4183 = null;
        field4170 = null;
        int var1 = -81 / (-arg0 / 43);
        field4173 = null;
        field4176 = null;
        field4178 = null;
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)Lp;")
    public static final class56 method1583(int arg0) {
        field4179++;
        class56 var1 = new class56(24);
        var1.method329((byte) 30, 2);
        var1.method329((byte) 99, class50.field602);
        var1.method329((byte) 19, class111.field1636 ? 1 : 0);
        var1.method329((byte) 79, class240.field4271 ? 1 : 0);
        var1.method329((byte) 112, class219.field3919 ? 1 : 0);
        var1.method329((byte) 41, class71.field1004 ? 1 : 0);
        var1.method329((byte) 59, class203.field3661 ? 1 : 0);
        var1.method329((byte) 46, class133.field1898 ? 1 : 0);
        if (arg0 < 77) {
            field4176 = null;
        }
        var1.method329((byte) 6, class19.field228 ? 1 : 0);
        var1.method329((byte) 36, class151.field2444 ? 1 : 0);
        var1.method329((byte) 7, class159.field2554);
        var1.method329((byte) 36, class174.field2935 ? 1 : 0);
        var1.method329((byte) 119, class159.field2556 ? 1 : 0);
        var1.method329((byte) 1, class192.field3371 ? 1 : 0);
        var1.method329((byte) 54, class88.field1293);
        var1.method329((byte) 29, class45.field543 ? 1 : 0);
        var1.method329((byte) 32, class189.field3315);
        var1.method329((byte) 94, class211.field3801);
        var1.method329((byte) 121, class70.field977);
        var1.method310(class132.field1890, -86);
        var1.method310(class172.field2906, -82);
        return var1;
    }
}
