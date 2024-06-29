import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class213 {

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field2984 = 0;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public int field2976;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    private int field2979;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public int field2980;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIZ)V")
    public static final void method1340(int arg0, int arg1, boolean arg2) {
        field2982++;
        class66 var3 = class6.method34(5, arg2, arg0);
        var3.method408(0);
        var3.field784 = arg1;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILqi;I)V")
    private final void method1341(int arg0, int arg1, class216 arg2, int arg3) {
        field2977++;
        if (arg0 == 1) {
            this.field2979 = arg2.method1380(true);
        } else if (arg0 == 2) {
            this.field2980 = arg2.method1407(121);
            this.field2976 = arg2.method1407(117);
        }
        if (arg3 != 0) {
            this.field2976 = -41;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([BB)Lse;")
    public static final class89 method1342(byte[] arg0, byte arg1) {
        field2983++;
        if (arg1 != -89) {
            return null;
        } else if (arg0 == null) {
            return null;
        } else {
            class111 var2 = new class111(arg0, class233.field3367, class273.field4041, class296.field4677, class91.field1236, class277.field4210);
            class294.method1965(true);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)Lpg;")
    public final class187 method1343(int arg0) {
        field2981++;
        class187 var2 = (class187) class104.field1408.method65((byte) -91, (long) this.field2979);
        if (var2 != null) {
            return var2;
        } else if (arg0 < 72) {
            return null;
        } else {
            class187 var3 = class172.method1123(this.field2979, class26.field312, -72, 0);
            if (var3 != null) {
                class104.field1408.method64((long) this.field2979, -1, var3);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILqi;)V")
    public final void method1344(int arg0, int arg1, class216 arg2) {
        if (arg0 != 1) {
            return;
        }
        while (true) {
            int var4 = arg2.method1407(111);
            if (var4 == 0) {
                field2978++;
                return;
            }
            this.method1341(var4, arg1, arg2, 0);
        }
    }
}
