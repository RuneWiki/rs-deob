import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class75 extends class72 {

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    private final int field1307;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    private final int field1303;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
    private final int field1310;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
    private final int field1316;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "Loh;")
    public static class258 field1306 = class153.method1046(" )2> <col=ff9040>", 105);

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field1304 = 0;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public static int field1309 = 0;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "Z")
    public static boolean field1308 = false;

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "I")
    public static int field1314 = 0;

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "Loh;")
    public static class258 field1313 = class153.method1046("headicons_pk", 127);

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "F")
    public static float field1312;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method549(boolean arg0) {
        if (arg0) {
            class178.field3180 = class108.field1915;
            class201.field3482 = class144.field2424;
            class13.field168 = class38.field503;
        } else {
            class178.field3180 = class27.field329;
            class201.field3482 = class134.field2317;
            class13.field168 = class301.field5159;
        }
        class300.field5129 = class178.field3180.length;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)V", line = 28)
    public final void method495(int arg0, int arg1, int arg2) {
        if (arg2 == 512) {
            field1305++;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIZIIIIII)V", line = 42)
    public static final void method550(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1315++;
        if (class92.method685(-1, arg4)) {
            class145.field2433 = null;
            class1.method6(-1, arg1, arg3, class23.field290[arg4], arg2, arg7, arg8, arg0, arg6, arg5);
            if (class145.field2433 != null) {
                class1.method6(-1412584499, arg1, arg3, class145.field2433, arg2, arg7, arg8, arg0, class307.field5209, class279.field4778);
                class145.field2433 = null;
            }
        } else if (arg0 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class238.field4151[var9] = true;
            }
        } else {
            class238.field4151[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIB)V", line = 84)
    public final void method492(int arg0, int arg1, byte arg2) {
        if (arg2 <= -120) {
            field1300++;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 94)
    public static void method551(int arg0) {
        if (arg0 < 109) {
            method550(-88, 43, true, 57, 86, -64, -109, 119, 67);
        }
        field1313 = null;
        field1306 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ls;IIIB)V", line = 105)
    public static final void method552(class171 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1311++;
        if (arg4 != -75) {
            return;
        }
        if (class257.field4390) {
            class296.method2085(arg2, arg3, arg0.field3002 + arg2, arg3 - -arg0.field3054);
        }
        if (class91.field1610 >= 3) {
            if (class257.field4390) {
                class65 var5 = arg0.method1146((byte) -48, false);
                if (var5 != null) {
                    var5.method327(arg2, arg3);
                }
            } else {
                class211.method1409(arg2, arg3, 0, arg0.field2952, arg0.field2972);
            }
        } else if (class257.field4390) {
            ((class221) class241.field4182).method1496(arg2, arg3, arg0.field3002, arg0.field3054, class241.field4182.field1141 / 2, class241.field4182.field1148 / 2, class68.field1177, 256, (class221) arg0.method1146((byte) -70, false));
        } else {
            ((class41) class241.field4182).method326(arg2, arg3, arg0.field3002, arg0.field3054, class241.field4182.field1141 / 2, class241.field4182.field1148 / 2, class68.field1177, 256, arg0.field2952, arg0.field2972);
        }
        class74.field1292[arg1] = true;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)V", line = 159)
    public final void method494(int arg0, int arg1, int arg2) {
        field1302++;
        int var4 = this.field1316 * arg2 >> 12;
        if (arg1 != 17898) {
            field1308 = false;
        }
        int var5 = this.field1307 * arg2 >> 12;
        int var6 = this.field1310 * arg0 >> 12;
        int var7 = this.field1303 * arg0 >> 12;
        class4.method26((byte) 89, this.field1269, var4, var7, var6, var5);
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(IIIIII)V", line = 175)
    public class75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1307 = arg0;
        this.field1303 = arg1;
        this.field1310 = arg3;
        this.field1316 = arg2;
    }
}
