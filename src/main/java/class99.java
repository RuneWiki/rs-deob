import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class99 {

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1514 = "Cancel";

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "[Lvg;")
    public static class33[] field1515;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZ)Lfr;", line = 8)
    public static final class236 method700(int arg0, boolean arg1) {
        field1517++;
        class236 var2 = (class236) class41.field615.method1246((byte) -109, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class359.field5064.method1920(arg0, arg1, 30);
        class236 var4 = new class236();
        if (var3 != null) {
            var4.method1485(new class371(var3), 0, arg0);
        }
        class41.field615.method1247((long) arg0, (byte) -83, var4);
        return var4;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZII)V", line = 30)
    public static final void method701(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            field1514 = null;
        }
        field1512++;
        String var4 = "tele " + arg3 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & 0x3F) + "," + (arg0 & 0x3F);
        System.out.println(var4);
        class160.method1064((byte) -60, true, var4);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V", line = 45)
    public static final void method702(int arg0, int arg1) {
        class259.method1599(false);
        field1516++;
        if (arg0 != -17666) {
            method701(-114, false, -102, -54);
        }
        class94.method640(arg0 + 17542);
        class152.method1030(9977, true, arg1);
        class266.method1651(class353.field4943, 0, class435.field6251, class408.field5920);
        class64.method433(class408.field5920, class353.field4943, arg0 ^ 0xFFFFFA46);
        class30.method232(class140.field1992, 91);
        class365.method2345(-122);
        class210.method1362(17612);
        if (class79.field1220 == 10) {
            class276.method1694(false, (byte) 52);
        } else if (class79.field1220 == 30) {
            class312.method1977(25, (byte) -53);
            return;
        } else if (class79.field1220 == 5) {
            class145.method997(class353.field4943, arg0 ^ 0xFFFFBAFF, class408.field5920);
            return;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 82)
    public static void method703(int arg0) {
        field1515 = null;
        field1514 = null;
        if (arg0 <= 51) {
            method700(-26, true);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/util/Random;IB)I", line = 93)
    public static final int method704(Random arg0, int arg1, byte arg2) {
        field1513++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class220.method1391(-17949, arg1)) {
            return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            if (arg2 != -10) {
                return 50;
            }
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            return class406.method2606(arg1, var4, (byte) -48);
        }
    }
}
