import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class531 {

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Luw;")
    public static class418 field7318 = new class418("", 10);

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Lej;")
    public static class124 field7321 = new class124(47, 4);

    @OriginalMember(owner = "client!de", name = "g", descriptor = "[I")
    public static int[] field7323 = new int[32];

    @OriginalMember(owner = "client!de", name = "h", descriptor = "[I")
    public static int[] field7324 = new int[2];

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Lkn;")
    public static class737 field7325 = new class737(4, 7);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static void method3061(byte arg0) {
        field7318 = null;
        if (arg0 >= -49) {
            method3063(31, -15L);
        }
        field7325 = null;
        field7321 = null;
        field7323 = null;
        field7324 = null;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)Z")
    public static final boolean method3062(byte arg0) {
        field7319++;
        if (arg0 != -99) {
            field7324 = null;
        }
        return class326.field4513 != 0;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IJ)V")
    public static final void method3063(int arg0, long arg1) {
        field7317++;
        try {
            Thread.sleep(arg1);
            int var3 = 107 % ((-arg0 - 80) / 35);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILjava/io/File;I)[B")
    public static final byte[] method3064(int arg0, File arg1, int arg2) {
        field7320++;
        try {
            int var3 = -87 / ((28 - arg2) / 54);
            byte[] var4 = new byte[arg0];
            class252.method1706(var4, (byte) 7, arg0, arg1);
            return var4;
        } catch (IOException var5) {
            return null;
        }
    }
}
