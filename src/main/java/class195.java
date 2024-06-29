import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class195 {

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "Z")
    public static boolean field3351 = false;

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "B")
    public static byte field3353;

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "F")
    public static float field3356;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "I")
    public int field3354;

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "I")
    public int field3355;

    @OriginalMember(owner = "client!pba", name = "h", descriptor = "I")
    public int field3357;

    @OriginalMember(owner = "client!pba", name = "i", descriptor = "Z")
    public boolean field3358;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V")
    public static final void method1470(int arg0) {
        field3350++;
        if (arg0 != 0) {
            method1470(-3);
        }
        class695.field9855.method76(-116);
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZI)V")
    public static final void method1471(boolean arg0, int arg1) {
        field3352++;
        if (!class118.method934(arg1, 23)) {
            return;
        }
        if (arg0) {
            field3351 = false;
        }
        class353[] var2 = class158.field2453[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class353 var4 = var2[var3];
            if (var4 != null) {
                var4.field5266 = 0;
                var4.field5242 = 0;
                var4.field5245 = 1;
            }
        }
    }
}
