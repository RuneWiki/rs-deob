import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class71 extends class452 {

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
    public static int field1038 = 1;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public static int field1035 = -1;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V", line = 7)
    public static final void method537(int arg0) {
        if (arg0 != -2) {
            method537(-57);
        }
        field1033++;
        for (class366 var1 = (class366) class59.field802.method646(48); var1 != null; var1 = (class366) class59.field802.method641(false)) {
            class367 var2 = var1.field5162;
            if (class142.field2034 != var2.field6267 || var2.field5168) {
                var1.method2467((byte) -117);
                var2.method2364(true);
            } else if (class276.field3837 >= var2.field5180) {
                var2.method2366((byte) 114, class349.field4797);
                if (var2.field5168) {
                    var1.method2467((byte) 64);
                } else {
                    class80.method583(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(I)V", line = 45)
    public static final void method538(int arg0) {
        field1034++;
        class131 var1 = class440.field6202;
        synchronized (class440.field6202) {
            class440.field6202.method905((byte) 89);
            if (arg0 > -84) {
                method539(23, -106, 18);
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)V", line = 59)
    public static final void method539(int arg0, int arg1, int arg2) {
        field1036++;
        int var3 = class412.field5841.field5326[0];
        int var4 = class412.field5841.field5332[arg2];
        if (class129.field1827 == 1) {
            if (!class128.method878(var3, var4, -2, 1, arg0, 0, arg1, 0, -1, 1, false)) {
                class128.method878(var3, var4, -3, 1, arg0, 0, arg1, 0, -1, 1, false);
            }
        } else if (!class128.method878(var3, var4, -3, 1, arg0, 0, arg1, 0, -1, 1, false)) {
            class128.method878(var3, var4, -2, 1, arg0, 0, arg1, 0, -1, 1, false);
        }
    }
}
