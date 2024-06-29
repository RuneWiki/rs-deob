import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class657 {

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "[I")
    private int[] field9375;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field9373 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public static int field9372;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field9374;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    public static int field9376;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field9377;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)I", line = 4)
    public final int method3706(int arg0, int arg1) {
        if (arg1 != -1) {
            method3707((byte) 119);
        }
        field9376++;
        int var3 = (this.field9375.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field9375[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field9375[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V", line = 33)
    public static void method3707(byte arg0) {
        if (arg0 >= 41) {
            field9373 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IBI)Lep;", line = 44)
    public static final class382 method3708(int arg0, byte arg1, int arg2) {
        field9377++;
        class382 var3 = class505.method2903(arg2, 65535);
        if (arg0 == -1) {
            return var3;
        } else if (arg1 >= -38) {
            return null;
        } else if (var3 == null || var3.field4989 == null || arg0 >= var3.field4989.length) {
            return null;
        } else {
            return var3.field4989[arg0];
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)I", line = 64)
    public static final int method3709(int arg0) {
        field9374++;
        return arg0 == 1 ? class327.field4260++ : -56;
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "([I)V", line = 75)
    public class657(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field9375 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field9375[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field9375[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field9375[var5 + var5] = arg0[var4];
            this.field9375[var5 + var5 + 1] = var4++;
        }
    }
}
