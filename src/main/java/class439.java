import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public abstract class class439 {

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field6128 = 328;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "F")
    public static float field6127;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field6126;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "J")
    public static long field6124;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLwc;)Ljava/lang/String;", line = 4)
    public static final String method2636(byte arg0, class66 arg1) {
        if (arg0 < 93) {
            field6127 = 1.0298154F;
        }
        field6129++;
        if (arg1.field1182 == null || arg1.field1182.length() == 0) {
            return arg1.field1192 == null || arg1.field1192.length() <= 0 ? arg1.field1187 : arg1.field1187 + class281.field3973.method1839((byte) 45, class744.field10426) + arg1.field1192;
        } else if (arg1.field1192 == null || arg1.field1192.length() <= 0) {
            return arg1.field1187 + class281.field3973.method1839((byte) 45, class744.field10426) + arg1.field1182;
        } else {
            return arg1.field1187 + class281.field3973.method1839((byte) 45, class744.field10426) + arg1.field1192 + class281.field3973.method1839((byte) 45, class744.field10426) + arg1.field1182;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(JI)I", line = 33)
    public final int method2637(long arg0, int arg1) {
        field6125++;
        if (arg1 >= -25) {
            this.method2082(-67);
        }
        long var4 = this.method2083(-1);
        if (var4 > 0L) {
            class246.method1639(var4, (byte) -97);
        }
        return this.method2081(-64, arg0);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)Z", line = 50)
    public static final boolean method2638(int arg0, int arg1, int arg2) {
        if (arg0 == 25829) {
            field6130++;
            return (arg1 & 0x180) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)V", line = 75)
    public static final void method2639(int arg0) {
        class683.field9617 = 1;
        if (arg0 != -23954) {
            return;
        }
        class595.field8697 = -1;
        field6126++;
        long var1 = 0L;
        if (class443.field6167 == null) {
            class552.method3231((byte) 58, 35);
        } else {
            class35 var3 = new class35(class311.method2016(class526.method3118(0, class443.field6167), 1));
            long var4 = var3.method246(19271);
            class552.field7730 = var3.method246(19271);
            class592.method3398(true, class198.method1389(var4, (byte) 82), "", (byte) 53);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IJ)I")
    public abstract int method2081(int arg0, long arg1);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)J")
    public abstract long method2083(int arg0);

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)J")
    public abstract long method2080(int arg0);

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
    public abstract void method2082(int arg0);
}
