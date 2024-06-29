import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public abstract class class451 {

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    public int field6458;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public int field6457;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public int field6456;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "[S")
    public static short[] field6453 = new short[256];

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    public static int field6459 = -1;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V", line = 3)
    public static void method2792(int arg0) {
        int var1 = -101 % ((arg0 - 30) / 60);
        field6453 = null;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILon;)Lon;", line = 18)
    public static final class184 method2793(int arg0, class184 arg1) {
        field6455++;
        class184 var2 = client.method1114(arg1);
        if (var2 == null) {
            var2 = arg1.field2660;
        }
        if (arg0 != -18008) {
            method2796((class376) null, -46);
        }
        return var2;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILjava/lang/String;IIII)V", line = 36)
    public static final void method2794(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
        field6460++;
        class203 var7 = new class203();
        var7.field2912 = arg4;
        var7.field2915 = arg5;
        var7.field2920 = arg3;
        var7.field2918 = arg2;
        if (arg0 != 0) {
            method2794(-89, -14, (String) null, -118, 125, -115, -97);
        }
        var7.field2917 = class189.field2726 + arg1;
        var7.field2916 = arg6;
        class158.field2062.method2511(-118, var7);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)V", line = 55)
    public static final void method2795(boolean arg0) {
        field6461++;
        if (class377.field5318.length() == 0) {
            return;
        }
        class397.method2538(-120, "--> " + class377.field5318);
        class130.method807(class377.field5318, arg0, 10);
        class69.field790 = 0;
        class377.field5318 = "";
        class18.field209 = 0;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ltq;I)V", line = 78)
    public static final void method2796(class376 arg0, int arg1) {
        field6454++;
        if (arg1 < 118) {
            field6459 = 112;
        }
        class379.field5340 = arg0;
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(III)V", line = 88)
    public class451(int arg0, int arg1, int arg2) {
        this.field6458 = arg2;
        this.field6457 = arg1;
        this.field6456 = arg0;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)V")
    public abstract void method261(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IBI)V")
    public abstract void method259(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(III)V")
    public abstract void method260(int arg0, int arg1, int arg2);
}
