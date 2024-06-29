import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class704 extends RuntimeException {

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field9800;

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "Ljava/lang/String;")
    public String field9797;

    @OriginalMember(owner = "client!iha", name = "e", descriptor = "Ljava/lang/String;")
    public static String field9801 = null;

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "I")
    public static int field9799;

    @OriginalMember(owner = "client!iha", name = "f", descriptor = "I")
    public static int field9802;

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "[I")
    public static int[] field9798;

    @OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class704(Throwable arg0, String arg1) {
        this.field9800 = arg0;
        this.field9797 = arg1;
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)V")
    public static void method3975(int arg0) {
        field9801 = null;
        field9798 = null;
        if (arg0 < 107) {
            field9801 = null;
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(ILgf;I)V")
    public static final void method3976(int arg0, class73 arg1, int arg2) {
        field9802++;
        if (class70.field770 >= 50 || arg1 == null || arg1.field820 == null || arg1.field820.length <= arg0 || arg1.field820[arg0] == null) {
            return;
        }
        if (arg2 != 1) {
            method3976(108, null, -44);
        }
        int var3 = arg1.field820[arg0][0];
        int var4 = var3 >> 8;
        int var5 = var3 >> 5 & 0x7;
        if (arg1.field820[arg0].length > 1) {
            int var6 = (int) (Math.random() * (double) arg1.field820[arg0].length);
            if (var6 > 0) {
                var4 = arg1.field820[arg0][var6];
            }
        }
        int var7 = 256;
        if (arg1.field815 != null && arg1.field806 != null) {
            var7 = class739.method4086(arg1.field815[arg0], (byte) -120, arg1.field806[arg0]);
        }
        if (arg1.field803) {
            class324.method2056(var5, 0, 255, false, 0, var4, var7);
        } else {
            class68.method522(var4, var5, var7, 0, (byte) 115, 255);
        }
    }
}
