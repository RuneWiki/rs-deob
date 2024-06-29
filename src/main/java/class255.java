import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class255 {

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "Lja;")
    public static class64 field3953;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lja;ZLja;)V", line = 8)
    public static final void method1807(class64 arg0, boolean arg1, class64 arg2) {
        class282.field4357 = arg0;
        class75.field1154 = arg2;
        class75.field1154.method465(34, 0);
        field3950++;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 41.0D) - 20;
        if (!arg1) {
            class152.field2450 = var4 + var6;
            class149.field2401 = var3 + var6;
            class213.field3389 = var5 + var6;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 37)
    public static void method1808(byte arg0) {
        field3953 = null;
        if (arg0 != 51) {
            field3953 = (class64) null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)V", line = 47)
    public static final void method1809(int arg0, int arg1) {
        if (arg1 != -12599) {
            return;
        }
        if (arg0 == -1 && !class165.field2559) {
            class145.method1097(arg1 ^ 0xFFFFCEAD);
        } else if (arg0 != -1 && (class306.field4808 != arg0 || !class211.method1535((byte) 63)) && class288.field4397 != 0 && !class165.field2559) {
            class163.method1207(0, arg1 ^ 0x3149, arg0, class288.field4397, false, class111.field1842, 2);
        }
        class306.field4808 = arg0;
        field3951++;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V", line = 71)
    public static final void method1810(byte arg0) {
        class268.method1922(5, (byte) 114);
        class230.method1667(5, arg0 ^ 0xFFFFDBD9);
        field3952++;
        class200.method1455(false, 5);
        class33.method232((byte) -97, 5);
        class73.method551((byte) -119, 5);
        class292.method2048(5, (byte) 75);
        class160.method1195(-119, 5);
        class248.method1763((byte) 109, 5);
        class276.method1980(5, false);
        class284.method2015(5, arg0 ^ 0xFFFFFF9F);
        if (arg0 != 43) {
            return;
        }
        class254.method1803(5, -15252);
        class195.method1428(5, (byte) -28);
        class323.method2206(arg0 - 157, 5);
        class107.method821((byte) -94, 5);
        class302.method2102(5, (byte) -17);
        class269.method1939((byte) -14, 50);
        class95.method683(5, 16760865);
        class260.method1843(5, -11264);
        class196.field3117.method1828(5, (byte) 125);
        class88.field1355.method1828(5, (byte) 124);
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(II)[B", line = 102)
    public static final synchronized byte[] method1811(int arg0, int arg1) {
        field3948++;
        if (arg1 == 100 && class79.field1212 > 0) {
            byte[] var2 = class104.field1762[--class79.field1212];
            class104.field1762[class79.field1212] = null;
            return var2;
        } else if (arg0 != 24957) {
            return (byte[]) null;
        } else if (arg1 == 5000 && class293.field4613 > 0) {
            byte[] var3 = class211.field3372[--class293.field4613];
            class211.field3372[class293.field4613] = null;
            return var3;
        } else if (arg1 == 30000 && class210.field3353 > 0) {
            byte[] var4 = class145.field2278[--class210.field3353];
            class145.field2278[class210.field3353] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
