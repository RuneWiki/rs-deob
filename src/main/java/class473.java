import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class473 {

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lnq;")
    private class325 field7035;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "J")
    public long field7036;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "[S")
    public static short[] field7033 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field7032;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field7034;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIBZ)I", line = 5)
    public static final int method2824(int arg0, int arg1, byte arg2, boolean arg3) {
        field7034++;
        if (arg2 < 70) {
            return -57;
        }
        class94 var4 = class402.method2483(arg3, (byte) -113, arg1);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field1377.length; var6++) {
                if (var4.field1373[var6] == arg0) {
                    var5 += var4.field1377[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!pb", name = "finalize", descriptor = "()V", line = 41)
    protected final void finalize() throws Throwable {
        field7032++;
        this.field7035.method2054(0, this.field7036);
        super.finalize();
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V", line = 50)
    public static void method2825(byte arg0) {
        field7033 = null;
        if (arg0 != -95) {
            field7037 = 81;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lnq;JI)V", line = 65)
    public class473(class325 arg0, long arg1, int arg2) {
        this.field7035 = arg0;
        this.field7036 = arg1;
    }
}
