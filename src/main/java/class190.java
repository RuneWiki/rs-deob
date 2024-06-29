import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class190 {

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "B")
    private byte field2459;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
    public int field2460;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public int field2464;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public int field2450;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
    public int field2462;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
    public int field2455;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "Z")
    public static boolean field2452 = false;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
    public static int field2456 = -60;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
    public static int field2458 = 0;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "[B")
    public static byte[] field2463;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "[I")
    public static int[] field2453;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IZB)V")
    public static final void method1215(int arg0, boolean arg1, byte arg2) {
        field2451++;
        if (arg0 == 0) {
            class301.field3918 = class167.method904(0, class501.field6954.field7858 * 2, class141.field1806, true, class615.field8870, class555.field7756);
        } else {
            if (arg1) {
                class301.field3918 = class167.method904(0, 0, class141.field1806, true, class615.field8870, class555.field7756);
                class301.field3918.method949(0);
                class157 var3 = class477.method2705(class496.field6916, 0, (byte) -26, class532.field7434);
                class262 var4 = class301.field3918.method982(var3, class295.method1803(class24.field433, class496.field6916, 0), true);
                class410.method2447(class512.field7135.method2157(class245.field3103, 4074), true, -25375, var4);
                class342.method2152(100);
                class301.field3918.method920(-118);
            }
            try {
                class301.field3918 = class167.method904(arg0, class501.field6954.field7858 * 2, class141.field1806, true, class615.field8870, class555.field7756);
                if (class301.field3918.method975()) {
                    boolean var5 = true;
                    try {
                        var5 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var7) {
                    }
                    class425 var6;
                    if (var5) {
                        var6 = class301.field3918.method971(146800640);
                    } else {
                        var6 = class301.field3918.method971(104857600);
                    }
                    class301.field3918.method925(var6);
                }
            } catch (Throwable var8) {
                arg0 = 0;
                class301.field3918 = class167.method904(0, 0, class141.field1806, true, class615.field8870, class555.field7756);
            }
        }
        class428.field5845 = arg0;
        if (arg2 >= -24) {
            return;
        }
        class121.method661(6625);
        if (!class301.field3918.method937()) {
            class549.field7635 = 1;
        }
        class301.field3918.method194(class549.field7635);
        class301.field3918.method198(0);
        class301.field3918.method973(32);
        class643.field9335 = class301.field3918.method987();
        class82.field1116 = class301.field3918.method987();
        class236.method1489(200);
        class301.field3918.method984(!class501.field6954.field7879);
        if (class301.field3918.method944()) {
            class503.method2814(class501.field6954.field7864, -12070);
        }
        class248.method1519(class139.field1760 >> 3, class369.field5135 >> 3, class301.field3918, -10564);
        class9.method37(2);
        class372.field5181 = false;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)V")
    public static void method1216(boolean arg0) {
        field2453 = null;
        field2463 = null;
        if (arg0) {
            field2449 = 35;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)I")
    public final int method1217(int arg0) {
        field2454++;
        if (arg0 == -28074) {
            return (this.field2459 & 0x8) == 8 ? 1 : 0;
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)[Lbn;")
    public static final class371[] method1218(byte arg0) {
        if (arg0 >= -118) {
            method1215(-76, false, (byte) -27);
        }
        field2457++;
        return new class371[] { class430.field5856, class317.field4375, class89.field1188, class383.field5347, class487.field6795, class504.field7014, class442.field6067, class459.field6557, class292.field3801, class548.field7630, class199.field2603, class610.field8766, class520.field7248, class545.field7602 };
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)I")
    public final int method1219(int arg0) {
        field2461++;
        if (arg0 != 7) {
            this.method1219(-98);
        }
        return this.field2459 & 0x7;
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "()V")
    public class190() {
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lge;)V")
    public class190(class551 arg0) {
        this.field2459 = arg0.method3051((byte) 91);
        this.field2460 = arg0.method3090(-122);
        this.field2464 = arg0.method3048(-4);
        this.field2450 = arg0.method3048(-4);
        this.field2462 = arg0.method3048(-4);
        this.field2455 = arg0.method3048(-4);
    }
}
