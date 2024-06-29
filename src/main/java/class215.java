import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class215 {

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "[Lmg;")
    public static class126[] field4166 = new class126[500];

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "[I")
    public static int[] field4167;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static final void method1409(int arg0) {
        field4170++;
        for (int var1 = -1; var1 < class18.field378; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class189.field3703[var1];
            }
            class212 var3 = class183.field3600[var2];
            if (var3 != null) {
                class145.method924(1, var3, arg0 - 592636029);
            }
        }
        if (arg0 != 15977) {
            method1409(70);
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
    public static void method1410(int arg0) {
        if (arg0 != 0) {
            field4166 = null;
        }
        field4166 = null;
        field4167 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
    public static final void method1411(byte arg0) {
        class8.field150 = new class112(32);
        field4171++;
        if (arg0 != -31) {
            field4166 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
    public static final void method1412(byte arg0) {
        field4165++;
        if (!class167.field3223) {
            class195.field3792 = 1;
            class179.field3526[0] = 1005;
            class167.field3231[0] = class203.field3963;
            class21.field461[0] = class208.field4049;
        }
        if (class134.field2539 != -1) {
            class13.method98(class134.field2539, (byte) -81);
        }
        for (int var1 = 0; var1 < class67.field1297; var1++) {
            if (class70.field1373[var1]) {
                class177.field3477[var1] = true;
            }
            class69.field1331[var1] = class70.field1373[var1];
            class70.field1373[var1] = false;
        }
        class105.field1974 = null;
        class197.field3854 = -1;
        class28.field581 = -1;
        class182.field3580 = class217.field4203;
        if (class134.field2539 != -1) {
            class67.field1297 = 0;
            class196.method1308(0, -1, 21565, 0, 765, 0, class134.field2539, 0, 503);
        }
        if (arg0 >= -38) {
            field4168 = 91;
        }
        class27.method214();
        class133.method842((byte) -49);
        if (class167.field3223) {
            class123.method794(6116423);
        } else if (class28.field581 != -1) {
            class4.method34(true, class28.field581, class197.field3854);
        }
        if (class114.field2117 == 3) {
            for (int var2 = 0; var2 < class67.field1297; var2++) {
                if (class69.field1331[var2]) {
                    class27.method218(class179.field3520[var2], class36.field776[var2], class167.field3215[var2], class145.field2707[var2], 16711935, 128);
                } else if (class177.field3477[var2]) {
                    class27.method218(class179.field3520[var2], class36.field776[var2], class167.field3215[var2], class145.field2707[var2], 16711680, 128);
                }
            }
        }
        class220.method1433(class172.field3347, 0, class171.field3305, class175.field3447.field2820, class175.field3447.field2801);
        class171.field3305 = 0;
    }
}
