import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class567 {

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZII)Ldfa;", line = 4)
    public static final class176 method3167(boolean arg0, int arg1, int arg2) {
        field7576++;
        class15[] var3 = class90.field1244;
        synchronized (class90.field1244) {
            if (arg1 != 0) {
                method3168(-43, -112, -61, true, false, null, -51);
            }
            class176 var4;
            if (class90.field1244.length <= arg2 || class90.field1244[arg2].method110(0)) {
                var4 = new class176();
                var4.field2345 = new class431[arg2];
                for (int var5 = 0; var5 < arg2; var5++) {
                    var4.field2345[var5] = new class431();
                }
            } else {
                var4 = (class176) class90.field1244[arg2].method116((byte) 118);
                var4.method2922((byte) -98);
                int var10002 = class303.field4362[arg2]--;
            }
            var4.field2340 = arg0;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIZZLaj;I)V", line = 40)
    public static final void method3168(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, class333 arg5, int arg6) {
        class685.field9629 = arg2;
        class99.field1374 = 1;
        class549.field7445 = arg5;
        class482.field6670 = arg3;
        class311.field4478 = arg6;
        class636.field8868 = arg0;
        class300.field4348 = arg1;
        class633.field8849 = null;
        if (!arg4) {
            field7577++;
        }
    }
}
