import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public abstract class class402 {

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "Lpc;")
    public class700 field5243;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILha;)V", line = 3)
    public static final void method2351(int arg0, class66 arg1) {
        class100.field1308 = new class705[class208.field2473.length];
        field5242++;
        for (int var2 = arg0; var2 < class208.field2473.length; var2++) {
            int var3 = class208.field2473[var2];
            class307 var4 = class779.method4323(-1, class755.field10461, var3);
            class67 var5 = arg1.method579(var4, class600.method3419(class459.field6468, var3), true);
            class100.field1308[var2] = new class705(var5, var4);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IZ)V", line = 31)
    public static final void method2352(int arg0, boolean arg1) {
        if (arg1 && class9.field140 != null) {
            class519.field7333 = class9.field140.field3044;
        } else {
            class519.field7333 = -1;
        }
        field5244++;
        class358.field4443 = null;
        class476.field6612 = null;
        class9.field140 = null;
        class121.field1557 = 0;
        class9.method155();
        class9.field156.method2729(arg0 - 47);
        class683.field9348 = -1;
        class461.field6482 = arg0;
        class389.field5029 = null;
        class554.field7705 = null;
        class784.field10823 = null;
        class188.field2271 = null;
        class648.field8842 = null;
        class9.field150 = null;
        class52.field709 = null;
        class535.field7531 = null;
        class356.field4422 = null;
        class181.field2211 = null;
        if (class9.field143 != null) {
            class9.field143.method4137((byte) -31);
            class9.field143.method4139(128, 64, (byte) 86);
        }
        if (class9.field141 != null) {
            class9.field141.method1706(-18, 64, 64);
        }
        if (class9.field139 != null) {
            class9.field139.method4187(false, 64);
        }
        class687.field9368.method4183(arg0 ^ 0xFFFFFFBF, 64);
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lpc;)V", line = 75)
    public class402(class700 arg0) {
        this.field5243 = arg0;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)Z")
    public abstract boolean method178(byte arg0);

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IBLfha;)V")
    public abstract void method180(int arg0, byte arg1, class400 arg2);

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(III)V")
    public abstract void method183(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(IZ)V")
    public abstract void method176(int arg0, boolean arg1);

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(IZ)V")
    public abstract void method184(int arg0, boolean arg1);

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V")
    public abstract void method181(int arg0);
}
