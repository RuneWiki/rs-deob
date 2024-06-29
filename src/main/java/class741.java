import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class741 {

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public int field9976 = -1;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public int field9973;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public int field9974;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public int field9975;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
    public int field9977;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
    public static int field9978;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    public int field9979;

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
    public int field9980;

    @OriginalMember(owner = "client!wo", name = "i", descriptor = "I")
    public int field9981;

    @OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
    public int field9982;

    @OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
    public static int field9983;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZIIIZ)V", line = 12)
    public static final void method4067(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class632.method3611(arg2, 0, class690.field9322.length - 1, arg0, (byte) 56, arg3, arg4);
        field9978++;
        class653.field8957 = arg1;
        class530.field7313 = null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BJ)V", line = 26)
    public static final void method4068(byte arg0, long arg1) {
        field9983++;
        if (class649.field8928 != null) {
            if (class438.field6252 == 1 || class438.field6252 == 5) {
                class53.method598(-1, arg1);
            } else if (class438.field6252 == 4) {
                class549.method3164((byte) 125, arg1);
            }
        }
        class564.method3271(class272.field3822, (byte) 83, (long) class641.field8810);
        if (class184.field2784 != -1) {
            class165.method1246(class184.field2784, (byte) 118);
        }
        for (int var3 = 0; var3 < class697.field9413; var3++) {
            if (class286.field3995[var3]) {
                class521.field7232[var3] = true;
            }
            class195.field2885[var3] = class286.field3995[var3];
            class286.field3995[var3] = false;
        }
        class273.field3844 = class641.field8810;
        class608.method3459(null, false, -1, -1);
        class195.method1391(-1, null, 1, -1);
        if (class184.field2784 != -1) {
            class697.field9413 = 0;
            class526.method3044(false);
        }
        class272.field3822.method305();
        class336.method2127((byte) 46, class272.field3822);
        int var4 = class724.method4015(3112);
        if (var4 == -1) {
            var4 = class130.field2184;
        }
        if (var4 == -1) {
            var4 = class421.field6075;
        }
        class529.method3057(0, var4);
        if (arg0 == -43) {
            int var5 = class58.field1147.method2457((byte) 103) << 8;
            class14.method118(98, class58.field1147.field5926, class322.field4464, class58.field1147.field5933 + var5, class58.field1147.field5922 - -var5);
            class322.field4464 = 0;
        }
    }
}
