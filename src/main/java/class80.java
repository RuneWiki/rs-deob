import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class80 extends class264 {

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "Lcf;")
    public static class93 field1483 = class147.method1066("www", -48);

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "[I")
    public static int[] field1485 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!oi", name = "S", descriptor = "[I")
    public static int[] field1490 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "I")
    public static int field1489 = 0;

    @OriginalMember(owner = "client!oi", name = "T", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1491 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!oi", name = "X", descriptor = "S")
    public static short field1495 = 1;

    @OriginalMember(owner = "client!oi", name = "ab", descriptor = "I")
    public static volatile int field1498 = 0;

    @OriginalMember(owner = "client!oi", name = "bb", descriptor = "Lcf;")
    public static class93 field1499 = class147.method1066("Hierhin drehen", -48);

    @OriginalMember(owner = "client!oi", name = "Z", descriptor = "Lcf;")
    public static class93 field1497 = class147.method1066("", -48);

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!oi", name = "U", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!oi", name = "W", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!oi", name = "Y", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!oi", name = "V", descriptor = "Lhg;")
    public static class177 field1493;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lhg;Lhg;I)V")
    public static final void method551(class177 arg0, class177 arg1, int arg2) {
        class253.field4551 = arg0;
        if (arg2 != 8326) {
            method554(-35, 59, -75);
        }
        class283.field5080 = arg1;
        ++field1482;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)I")
    public static final int method552(int arg0, int arg1) {
        ++field1488;
        return arg0 < 8 ? 94 : 255 & arg1;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BII)I")
    private final int method553(byte arg0, int arg1, int arg2) {
        if (arg0 != -34) {
            return 45;
        } else {
            ++field1487;
            int var4 = arg1 * 57 + arg2;
            int var5 = var4 ^ var4 << 1;
            return -(((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(III)V")
    public static final void method554(int arg0, int arg1, int arg2) {
        class212 var3 = class123.method905(-1205364448, arg1, arg0);
        ++field1484;
        var3.method1493(13);
        var3.field3883 = arg2;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILcf;)I")
    public static final int method555(int arg0, class93 arg1) {
        if (arg0 != 0) {
            field1497 = null;
        }
        ++field1494;
        return arg1.method666(false) - -1;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class80() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
    public static void method556(boolean arg0) {
        field1490 = null;
        if (arg0) {
            field1493 = null;
        }
        field1491 = null;
        field1499 = null;
        field1483 = null;
        field1493 = null;
        field1497 = null;
        field1485 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        ++field1486;
        int[] var3 = super.field4716.method532((byte) 77, arg0);
        if (super.field4716.field1424) {
            int var4 = class67.field1220[arg0];
            for (int var5 = 0; ~var5 > ~class176.field3060; ++var5) {
                var3[var5] = this.method553((byte) -34, var4, class144.field2497[var5]) % 4096;
            }
        }
        return arg1 > -83 ? null : var3;
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V")
    public static final void method557(int arg0) {
        ++field1492;
        int var1 = -67 / ((8 - arg0) / 49);
        for (int var2 = -1; var2 < class252.field4543; ++var2) {
            int var3;
            if (~var2 == 0) {
                var3 = 2047;
            } else {
                var3 = class234.field4166[var2];
            }
            class237 var4 = class224.field4031[var3];
            if (var4 != null) {
                class35.method207(var4, var4.method1475(false), (byte) -128);
            }
        }
    }
}
