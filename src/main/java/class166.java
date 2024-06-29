import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class166 {

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Lpm;")
    public static class349 field2367 = new class349(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Ldj;")
    public static class191 field2374 = new class191(512);

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field2376 = 0;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public int field2365;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public int field2369;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    private int field2372;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Lbk;")
    public static class211 field2373;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)I")
    public static final int method1195(int arg0, int arg1) {
        return class25.field314 == null ? 0 : class25.field314[arg0][arg1] >>> 21 & 0x7F8;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLlf;II)V")
    private final void method1196(byte arg0, class130 arg1, int arg2, int arg3) {
        field2370++;
        if (arg2 == 1) {
            this.field2372 = arg1.method798(false);
        } else if (arg2 == 2) {
            this.field2369 = arg1.method837(true);
            this.field2365 = arg1.method837(true);
        }
        if (arg0 < 18) {
            this.method1196((byte) -36, (class130) null, -7, -14);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BILlf;)V")
    public final void method1197(byte arg0, int arg1, class130 arg2) {
        field2368++;
        while (true) {
            int var4 = arg2.method837(true);
            if (var4 == 0) {
                if (arg0 == -57) {
                    return;
                } else {
                    this.method1199((byte) -126);
                    return;
                }
            }
            this.method1196((byte) 80, arg2, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static final void method1198(int arg0) {
        class365.method2357((byte) 88);
        field2371++;
        class242.method1654(0);
        class409.method2580(arg0 + 22276);
        class228.method1590(4096);
        class439.method2737(false);
        class411.method2602(121);
        class373.method2390(arg0 + 22032);
        class436.method2723((byte) -119);
        class126.method765(arg0 ^ 0xFFFFA934);
        class58.method379(false);
        class321.method2133(arg0 + 22034);
        class5.method21(0);
        class334.method2189(-11930);
        class410.method2596((byte) -70);
        class177.method1265(113);
        class266.method1821(arg0 + 22028);
        class371.method2385(6);
        if (arg0 != -22156) {
            return;
        }
        class215.method1503(-121);
        class431.method2682(-22508);
        class318.method2115(8);
        class75.method451((byte) -93);
        class15.method101((byte) -69);
        if (class31.field387 != 0) {
            for (int var1 = 0; var1 < class440.field6292.length; var1++) {
                class440.field6292[var1] = null;
            }
            class421.field6020 = 0;
        }
        class26.method138(-13044);
        class21.method117(-101);
        class46.method303(90);
        class57.method375(30113);
        class332.method2179(-63);
        class424.field6065.method102((byte) -91);
        class59.field786.method879();
        class308.field4476.method1976((byte) 59);
        class56.method364(8);
        class105.field1350.method658(true);
        class222.field3179.method658(true);
        class365.field5227.method658(true);
        class213.field3010.method658(true);
        class119.field1609.method658(true);
        class226.field3370.method658(true);
        class72.field942.method658(true);
        class287.field4167.method658(true);
        class15.field216.method658(true);
        class264.field3888.method658(true);
        class170.field2406.method658(true);
        class173.field2448.method658(true);
        class311.field4563.method658(true);
        class327.field4745.method658(true);
        class413.field5910.method658(true);
        class229.field3395.method658(true);
        class245.field3662.method658(true);
        class47.field625.method658(true);
        class224.field3357.method658(true);
        class449.field6414.method658(true);
        class418.field6002.method658(true);
        class196.field2813.method658(true);
        class122.field1636.method658(true);
        class284.field4140.method658(true);
        class83.field1064.method658(true);
        class247.field3702.method658(true);
        class278.field4004.method658(true);
        class331.field4795.method658(true);
        class331.field4794.method658(true);
        class105.field1347.method102((byte) -87);
        class353.field5120.method102((byte) -87);
        class357.field5163.method102((byte) -93);
        class199.field2840.method102((byte) -109);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)Lk;")
    public final class337 method1199(byte arg0) {
        if (arg0 != -119) {
            this.field2365 = -101;
        }
        field2375++;
        class337 var2 = (class337) class83.field1056.method99(true, (long) this.field2372);
        if (var2 != null) {
            return var2;
        }
        class337 var3 = class337.method2225(class140.field2139, this.field2372, 0);
        if (var3 != null) {
            class83.field1056.method90(var3, (long) this.field2372, 0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public static void method1200(int arg0) {
        field2373 = null;
        field2367 = null;
        field2374 = null;
        if (arg0 != 31963) {
            field2374 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZ)Lrb;")
    public static final class197 method1201(int arg0, boolean arg1) {
        field2366++;
        class197 var2 = (class197) class173.field2446.method99(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class282.field4089.method643(31, arg0, arg1);
        class197 var4 = new class197();
        if (var3 != null) {
            var4.method1401(new class130(var3), arg0, -1);
        }
        class173.field2446.method90(var4, (long) arg0, 0);
        return var4;
    }
}
