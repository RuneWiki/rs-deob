import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class57 {

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public static int field975 = 0;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "Lrp;")
    public static class288 field973 = new class288(4);

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
    public static int field978 = 0;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "Lbg;")
    public static class310 field979 = new class310(19, 8);

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)V", line = 3)
    public static final void method406(byte arg0) {
        field972++;
        if (arg0 >= -93) {
            return;
        }
        class215[] var1 = class377.field5499;
        synchronized (class377.field5499) {
            for (int var2 = 0; var2 < class377.field5499.length; var2++) {
                class377.field5499[var2] = new class215();
                class220.field3391[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIBI)V", line = 26)
    public static final void method407(int arg0, int arg1, byte arg2, int arg3) {
        field976++;
        if (arg2 != 126) {
            method408(-110);
        }
        if (arg0 == 1010) {
            class94.method701(class504.field7621, arg3, arg1);
        } else if (arg0 == 1003) {
            class94.method701(class67.field1076, arg3, arg1);
        } else if (arg0 == 1002) {
            class94.method701(class108.field1882, arg3, arg1);
        } else if (arg0 == 1004) {
            class94.method701(class362.field5345, arg3, arg1);
        } else if (arg0 == 1001) {
            class94.method701(class299.field4533, arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V", line = 65)
    public static void method408(int arg0) {
        field973 = null;
        if (arg0 != 0) {
            field975 = -35;
        }
        field979 = null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IB)V", line = 76)
    public static final void method409(int arg0, byte arg1) {
        class418.field6026.method1760(arg0, 30398);
        field974++;
        if (arg1 > -39) {
            method407(62, -62, (byte) 28, -16);
        }
        class336.field5043.method1760(arg0, 30398);
        class189.field3019.method1760(arg0, 30398);
        class501.field7588.method1760(arg0, 30398);
        class201.field3189.method1760(arg0, 30398);
    }
}
