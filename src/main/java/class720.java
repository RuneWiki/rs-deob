import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class720 {

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public int field10035;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "B")
    public byte field10041;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public int field10038;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Lwea;")
    public class167 field10047;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public int field10045;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public int field10037;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public int field10036;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public int field10042;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "[Luca;")
    public static class540[] field10034 = new class540[8];

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Lmga;")
    public static class739 field10032 = new class739(32, -1);

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field10040;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field10044;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field10046;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Lma;")
    public class14 field10048;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "Lks;")
    public class465 field10043;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lmk;")
    public class61 field10033;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Lab;")
    public class699 field10039;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLwc;)I", line = 3)
    public static final int method4019(byte arg0, class73 arg1) {
        field10044++;
        int var2 = arg1.field1025;
        class208 var3 = arg1.method1014((byte) -34);
        if (arg1.field1794 == -1 || arg1.field1826) {
            var2 = arg1.field1021;
        } else if (arg1.field1794 == var3.field2765 || arg1.field1794 == var3.field2744 || arg1.field1794 == var3.field2737 || arg1.field1794 == var3.field2739) {
            var2 = arg1.field1045;
        } else if (arg1.field1794 == var3.field2716 || arg1.field1794 == var3.field2727 || arg1.field1794 == var3.field2729 || arg1.field1794 == var3.field2754) {
            var2 = arg1.field1076;
        }
        if (arg0 != -109) {
            method4021((byte) 90, null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)Z", line = 35)
    public final boolean method4020(byte arg0) {
        field10046++;
        if (arg0 <= 68) {
            return true;
        } else {
            return this.field10041 == 2 || this.field10041 == 3;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLdia;)V", line = 47)
    public static final void method4021(byte arg0, class246 arg1) {
        if (arg0 >= -111) {
            method4022((byte) 117);
        }
        if (class72.field1012 == null) {
            class362 var2 = new class362();
            byte[] var3 = var2.method2277(16, -31095, 128, 128);
            class72.field1012 = class229.method1498(var3, false, -137);
        }
        field10040++;
        if (class705.field9892 == null) {
            class736 var4 = new class736();
            byte[] var5 = var4.method4080(-87, 128, 128, 16);
            class705.field9892 = class229.method1498(var5, false, -137);
        }
        class742 var6 = arg1.field3530;
        if (var6.method4105((byte) 36) && class80.field1144 == null) {
            byte[] var7 = class432.method2623(0.6F, false, 4.0F, 4.0F, 16, 128, 0.5F, 16.0F, 128, new class498(419684), 8);
            class80.field1144 = class229.method1498(var7, false, -137);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V", line = 87)
    public static void method4022(byte arg0) {
        field10032 = null;
        if (arg0 != -67) {
            method4021((byte) 59, null);
        }
        field10034 = null;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(BIIIIIILwea;)V", line = 114)
    public class720(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class167 arg7) {
        this.field10035 = arg3;
        this.field10041 = arg0;
        this.field10038 = arg6;
        this.field10047 = arg7;
        this.field10045 = arg2;
        this.field10037 = arg4;
        this.field10036 = arg5;
        this.field10042 = arg1;
    }
}
