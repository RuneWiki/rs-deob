import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class520 {

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "[I")
    public int[] field7341;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "[S")
    public short[] field7340;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "J")
    public long field7338;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "[S")
    public short[] field7344;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "[I")
    public static int[] field7342 = new int[3];

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "[I")
    public static int[] field7345 = new int[2];

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "Lwia;")
    public static class791 field7346;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V", line = 6)
    public static void method3129(int arg0) {
        if (arg0 != 0) {
            field7345 = null;
        }
        field7342 = null;
        field7345 = null;
        field7346 = null;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V", line = 19)
    public static final void method3130(int arg0) {
        class793.field10902 = 0;
        field7343++;
        class725.field10028 = 0;
        for (int var1 = 0; var1 < class422.field5771; var1++) {
            int var2 = class703.field9803 * var1;
            for (int var3 = 0; var3 < class703.field9803; var3++) {
                int var4 = var2 + var3;
                class537.field7719[var4].method1551(class103.field1192 * var3, class373.field5148 * var1, class103.field1192, class373.field5148, 0, 0, true, true);
            }
        }
        if (arg0 < 112) {
            field7342 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)Z", line = 57)
    public static final boolean method3131(int arg0, int arg1, int arg2) {
        field7339++;
        if (arg0 != -1) {
            method3130(80);
        }
        return (arg1 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(J[I[S[S)V", line = 71)
    public class520(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field7341 = arg1;
        this.field7340 = arg3;
        this.field7338 = arg0;
        this.field7344 = arg2;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V", line = 81)
    protected class520() {
    }
}
