import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class113 extends class282 {

    @OriginalMember(owner = "client!wu", name = "t", descriptor = "B")
    public byte field1587 = 5;

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "I")
    public int field1582;

    @OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!wu", name = "q", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "client!wu", name = "r", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!wu", name = "s", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!wu", name = "u", descriptor = "I")
    public int field1588;

    @OriginalMember(owner = "client!wu", name = "v", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!wu", name = "x", descriptor = "I")
    public int field1591;

    @OriginalMember(owner = "client!wu", name = "y", descriptor = "I")
    public int field1592;

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!wu", name = "A", descriptor = "I")
    public int field1594;

    @OriginalMember(owner = "client!wu", name = "w", descriptor = "Z")
    public boolean field1590;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lkj;I)I")
    public static final int method726(class55 arg0, int arg1) {
        field1589++;
        if (arg0.field850 == 0) {
            return 0;
        }
        if (arg0.field829 != -1) {
            class55 var2 = null;
            if (arg0.field829 < 32768) {
                class38 var3 = (class38) class365.field5659.method1122((byte) 59, (long) arg0.field829);
                if (var3 != null) {
                    var2 = var3.field378;
                }
            } else if (arg0.field829 >= 32768) {
                var2 = class264.field4276[arg0.field829 - 32768];
            }
            if (var2 != null) {
                int var4 = arg0.field6417 - var2.field6417;
                int var5 = arg0.field6410 - var2.field6410;
                if (var4 != 0 || var5 != 0) {
                    arg0.method428((int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF, (byte) 93);
                }
            }
        }
        if (arg1 != 32768) {
            return -73;
        }
        if ((arg0 instanceof class350)) {
            class350 var9 = (class350) arg0;
            if (var9.field5461 != -1 && (var9.field898 == 0 || var9.field900 > 0)) {
                var9.method428(var9.field5461, (byte) -2);
                var9.field5461 = -1;
            }
        } else if (arg0 instanceof class378) {
            class378 var6 = (class378) arg0;
            if (var6.field5803 != -1 && (var6.field898 == 0 || var6.field900 > 0)) {
                int var7 = var6.field6417 - ((var6.field5803 - class453.field7018 - class453.field7018) * 64);
                int var8 = var6.field6410 - (var6.field5813 - class126.field1718 - class126.field1718) * 64;
                if (var7 != 0 || var8 != 0) {
                    var6.method428((int) (Math.atan2((double) var7, (double) var8) * 2607.5945876176133D) & 0x3FFF, (byte) 103);
                }
                var6.field5803 = -1;
            }
        }
        return arg0.method432(20899);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V")
    public static final void method727(int arg0, int arg1) {
        field1586++;
        class16.field170 = new int[arg1];
        class279.field4424 = new int[arg1];
        class421.field6390 = new int[arg1];
        if (arg0 < -125) {
            class160.field2187 = new int[arg1];
            class180.field2623 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BI)V")
    public static final void method728(byte arg0, int arg1) {
        field1585++;
        if (arg0 < -10) {
            class456 var2 = class233.method1654(arg1, 5, -94);
            var2.method2862(0);
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(II)V")
    public static final void method729(int arg0, int arg1) {
        if (arg1 == 16383) {
            field1583++;
            class456 var2 = class233.method1654(arg0, 14, 126);
            var2.method2862(0);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIILfv;Lfv;)V")
    public static final void method730(int arg0, int arg1, int arg2, class477 arg3, class477 arg4) {
        class409 var5 = class207.method1413(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field6180 = arg3;
            var5.field6188 = arg4;
        }
    }

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "(I)V")
    public static final void method731(int arg0) {
        if (arg0 != -1) {
            method726(null, 32);
        }
        class280.method1887((byte) -36);
        field1593++;
        class500.method3052(0);
    }
}
