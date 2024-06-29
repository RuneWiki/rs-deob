import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class94 {

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "B")
    private byte field1322;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    public int field1327;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public int field1324;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public int field1320;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public int field1329;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field1317 = 2;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "Lrc;")
    public static class108 field1315 = new class108(15, -2);

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "[I")
    public static int[] field1326;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "[Lrn;")
    public static class417[] field1318;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBI)Z")
    public static final boolean method783(int arg0, byte arg1, int arg2) {
        if (arg1 > -74) {
            field1318 = null;
        }
        field1314++;
        return (class372.field5120[1][arg0][arg2] & 0x2) != 0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)I")
    public final int method784(boolean arg0) {
        field1330++;
        return arg0 ? this.field1322 & 0x7 : 23;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
    public static final void method785(byte arg0) {
        field1319++;
        if (arg0 != -5) {
            field1318 = null;
        }
        if (class374.field5152.method419()) {
            class409.method2448((byte) 122);
            class374.field5152.method435(class33.field338);
            class125.method947(arg0 - 111);
        } else {
            class136.method1006(class377.field5192, -69);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIII)V")
    public static final void method786(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1323++;
        int var5 = 59 % ((arg2 + 26) / 59);
        if (class483.field6826 == 1) {
            class77.field1144[class323.field4515 / 100].method2493(class127.field1735 - 8, class39.field528 + -8);
        }
        if (class483.field6826 == 2) {
            class77.field1144[class323.field4515 / 100 + 4].method2493(class127.field1735 - 8, class39.field528 - 8);
        }
        class232.method1628(-1);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(JI)V")
    public static final void method787(long arg0, int arg1) {
        class311.field4403.field2298 = 0;
        field1328++;
        class311.field4403.method1180((byte) -110, class433.field6129.field60);
        class311.field4403.method1190(arg0, (byte) -27);
        class181.field2729 = arg1;
        class196.field2908 = 0;
        class67.field973 = 0;
        class39.field530 = -3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)I")
    public final int method788(int arg0) {
        if (arg0 != 8) {
            method789(-85, -104, -40, -53, -124, true, 6);
        }
        field1321++;
        return (this.field1322 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method789(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        if (arg2 != 1184) {
            return;
        }
        class114.field1605 = arg6;
        field1316++;
        class103.field1456 = arg1;
        class178.field2697 = arg3;
        class352.field4836 = arg0;
        class125.field1695 = arg4;
        if (arg5 && class125.field1695 >= 100) {
            class135.field1884 = class352.field4836 * 128 + 64;
            class184.field2784 = class103.field1456 * 128 + 64;
            class303.field4302 = class407.method2440(class135.field1884, arg2 ^ 0xFFFFBB36, class184.field2784, class387.field5306) - class178.field2697;
        }
        class390.field5393 = 2;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method790(String arg0, int arg1) {
        if (class390.field5397 == null) {
            class92.method769((byte) -108);
        }
        if (arg1 != -30123) {
            return;
        }
        field1325++;
        String[] var2 = class237.method1645('\n', arg0, 0);
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class213.field3102; var4 > 0; var4--) {
                class390.field5397[var4] = class390.field5397[var4 - 1];
            }
            class390.field5397[0] = var2[var3];
            if (class390.field5397.length - 1 > class213.field3102) {
                class213.field3102++;
                if (class75.field1079 > 0) {
                    class75.field1079++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V")
    public static void method791(byte arg0) {
        field1315 = null;
        field1326 = null;
        if (arg0 == -9) {
            field1318 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class94() {
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lkk;)V")
    public class94(class161 arg0) {
        this.field1322 = arg0.method1152(-1910700904);
        this.field1327 = arg0.method1134(-16848);
        this.field1331 = arg0.method1168(255);
        this.field1324 = arg0.method1168(255);
        this.field1320 = arg0.method1168(255);
        this.field1329 = arg0.method1168(255);
    }
}
