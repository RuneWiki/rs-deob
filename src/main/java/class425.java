import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class425 {

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
    private int field5853 = 0;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "Ldu;")
    private class360 field5849;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "Lhda;")
    public static class752 field5851 = new class752(35, -2);

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "D")
    public static double field5855;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "Lpb;")
    private class656 field5850;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)Lpb;", line = 6)
    public final class656 method2453(int arg0) {
        field5848++;
        if (this.field5853 > 0 && this.field5849.field5075[this.field5853 - 1] != this.field5850) {
            class656 var2 = this.field5850;
            this.field5850 = var2.field8677;
            return var2;
        }
        if (arg0 != 20322) {
            field5856 = 21;
        }
        while (this.field5849.field5084 > this.field5853) {
            class656 var3 = this.field5849.field5075[this.field5853++].field8677;
            if (this.field5849.field5075[this.field5853 - 1] != var3) {
                this.field5850 = var3.field8677;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)Lpb;", line = 39)
    public final class656 method2454(byte arg0) {
        field5847++;
        int var2 = 127 / ((20 - arg0) / 38);
        this.field5853 = 0;
        return this.method2453(20322);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)Z", line = 51)
    public static final boolean method2455(int arg0, int arg1) {
        if (arg1 > -17) {
            field5854 = -44;
        }
        field5846++;
        return arg0 == 21 || arg0 == 46 || arg0 == 9 || arg0 == 44 || arg0 == 60 || arg0 == 22 || arg0 == 25;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V", line = 65)
    public static void method2456(int arg0) {
        if (arg0 != -1) {
            method2455(-74, -7);
        }
        field5851 = null;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II[BI)[B", line = 76)
    public static final byte[] method2457(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 == 20569) {
            field5852++;
            byte[] var4 = new byte[arg0];
            class335.method2020(arg2, arg3, var4, 0, arg0);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "()V", line = 98)
    public class425() {
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Ldu;)V", line = 100)
    public class425(class360 arg0) {
        this.field5849 = arg0;
    }
}
