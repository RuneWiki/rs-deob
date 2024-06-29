import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class281 extends class467 {

    @OriginalMember(owner = "client!vca", name = "C", descriptor = "D")
    public static double field3981;

    @OriginalMember(owner = "client!vca", name = "q", descriptor = "I")
    public int field3969;

    @OriginalMember(owner = "client!vca", name = "r", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!vca", name = "s", descriptor = "I")
    public int field3971;

    @OriginalMember(owner = "client!vca", name = "t", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!vca", name = "u", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!vca", name = "w", descriptor = "I")
    public int field3975;

    @OriginalMember(owner = "client!vca", name = "x", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!vca", name = "y", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!vca", name = "z", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!vca", name = "A", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!vca", name = "B", descriptor = "I")
    public int field3980;

    @OriginalMember(owner = "client!vca", name = "v", descriptor = "J")
    public long field3974;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)J", line = 3)
    public final long method1791(byte arg0) {
        field3979++;
        if (arg0 != -102) {
            field3981 = 0.2728262599543444D;
        }
        return this.field3974;
    }

    @OriginalMember(owner = "client!vca", name = "g", descriptor = "(B)I", line = 18)
    public final int method1792(byte arg0) {
        field3973++;
        return arg0 >= -35 ? -25 : this.field3971;
    }

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "(B)I", line = 29)
    public final int method1793(byte arg0) {
        field3976++;
        int var2 = 50 % ((arg0 - 51) / 49);
        return this.field3975;
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(B)I", line = 40)
    public final int method1794(byte arg0) {
        if (arg0 < 114) {
            return 72;
        } else {
            field3977++;
            return this.field3969;
        }
    }

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "(B)I", line = 53)
    public final int method1795(byte arg0) {
        int var2 = -10 % ((27 - arg0) / 59);
        field3972++;
        return this.field3980;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(BLsca;)V", line = 64)
    public static final void method1796(byte arg0, class46 arg1) {
        int var2 = -75 / ((arg0 - 33) / 49);
        field3970++;
        if (!class282.field3986) {
            return;
        }
        class455.field6705++;
        if (arg1.field656 != null) {
            class46 var3 = class700.method3972(class76.field1062, class745.field10436, true);
            if (var3 != null) {
                class177 var4 = new class177();
                var4.field2745 = var3;
                var4.field2743 = arg1;
                var4.field2737 = arg1.field656;
                class709.method4025(var4);
            }
        }
        class468 var5 = class93.method734(class29.field284, class493.field7030, 8174);
        var5.field6839.method3695(arg1.field610, 255);
        var5.field6839.method3734(class745.field10436, 501927912);
        var5.field6839.method3706((byte) 82, class226.field3314);
        var5.field6839.method3742((byte) -120, class76.field1062);
        var5.field6839.method3706((byte) 82, arg1.field603);
        var5.field6839.method3734(arg1.field687, 501927912);
        class120.method872((byte) -103, var5);
    }
}
