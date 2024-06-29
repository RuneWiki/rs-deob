import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class139 {

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lgi;")
    public static class403 field1975 = new class403();

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Lfi;")
    public static class331 field1976 = new class331(64);

    @OriginalMember(owner = "client!se", name = "h", descriptor = "[I")
    public static int[] field1978 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field1979 = 52;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public int field1974;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Ljava/lang/String;")
    public String field1973;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "[I")
    public static int[] field1980;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Llj;IIII)V", line = 8)
    public static final void method828(class362 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class201.method1290(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class158.field2245) {
            class201.method1290(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class201.method1290(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class52.field598) {
            class201.method1290(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class52.field598) {
            class201.method1290(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class158.field2245 && arg4 <= class52.field598) {
            class201.method1290(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class201.method1290(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class158.field2245 && arg4 > 0) {
            class201.method1290(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V", line = 62)
    public static final void method829(byte arg0) {
        if (arg0 != 47) {
            field1980 = null;
        }
        field1972++;
        if (class27.field260 < 0) {
            return;
        }
        long var1 = class203.method1299((byte) 5);
        class27.field260 = (int) ((long) class27.field260 - (var1 - class58.field691));
        if (class27.field260 <= 0) {
            class21.field226 = class433.field6327.field3382;
            class27.field260 = -1;
            class37.field363 = class433.field6327.field3386;
            class319.field4532 = class433.field6327.field3391;
            class443.field6476 = class433.field6327.field3374;
            class419.field6016 = class433.field6327.field3384;
            class244.field3291 = class433.field6327.field3381;
            class191.field2604 = class433.field6327.field3387;
            class392.field5736 = class433.field6327.field3389;
            class330.field4712 = class433.field6327.field3375;
            class351.field5130 = class433.field6327.field3378;
        } else {
            int var3 = (class27.field260 << 8) / class281.field3961;
            int var4 = 255 - var3;
            float var5 = (float) var3 / 255.0F;
            class21.field226 = ((class444.field6491 & 0xFF00) * var3 + ((class433.field6327.field3382 & 0xFF00) * var4) & 0xFF0000) + ((class444.field6491 & 0xFF00FF) * var3 + (class433.field6327.field3382 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            float var6 = 1.0F - var5;
            class37.field363 = ((class101.field1140 & 0xFF00FF) * var3 + (class433.field6327.field3386 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class101.field1140 & 0xFF00) * var3 + (class433.field6327.field3386 & 0xFF00) * var4 & 0xFF0000) >>> 8;
            class419.field6016 = class315.field4482 * var3 + class433.field6327.field3384 * var4 >> 8;
            class319.field4532 = (class433.field6327.field3391 - class149.field2089) * var6 + class149.field2089;
            class392.field5736 = (class433.field6327.field3389 - class174.field2419) * var6 + class174.field2419;
            class191.field2604 = (class433.field6327.field3387 - class33.field316) * var6 + class33.field316;
            class443.field6476 = (class433.field6327.field3374 - class227.field3096) * var6 + class227.field3096;
            class330.field4712 = (class433.field6327.field3375 - class217.field2974) * var6 + class217.field2974;
            class351.field5130 = (class433.field6327.field3378 - class323.field4553) * var6 + class323.field4553;
            if (class372.field5439 != class433.field6327.field3381) {
                class244.field3291 = class257.field3504.method1002(class372.field5439, class433.field6327.field3381, var6, class244.field3291);
            }
        }
        class58.field691 = var1;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 119)
    public static void method830(int arg0) {
        field1978 = null;
        field1976 = null;
        field1980 = null;
        int var1 = 96 / ((arg0 - 46) / 46);
        field1975 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIB)Z", line = 136)
    public static final boolean method831(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1971++;
        if ((class166.field2327[0][arg0][arg3] & 0x2) != 0) {
            return true;
        } else if ((class166.field2327[arg2][arg0][arg3] & 0x10) == 0) {
            if (arg4 > -25) {
                field1979 = 49;
            }
            return arg1 == class401.method2542((byte) 85, arg3, arg2, arg0);
        } else {
            return false;
        }
    }
}
