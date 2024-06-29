import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class512 {

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "[I")
    private int[] field7204;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field7203 = 0;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "[Z")
    public static boolean[] field7202 = new boolean[200];

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V", line = 3)
    public static void method2986(byte arg0) {
        field7202 = null;
        if (arg0 != -43) {
            field7203 = 86;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)I", line = 15)
    public final int method2987(int arg0, int arg1) {
        field7201++;
        int var3 = (this.field7204.length >> 1) - 1;
        if (arg1 >= -62) {
            return 30;
        }
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field7204[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field7204[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 44)
    public static final Class method2988(String arg0, int arg1) throws ClassNotFoundException {
        field7200++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else {
            if (arg1 != 0) {
                method2986((byte) 81);
            }
            return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "([I)V", line = 91)
    public class512(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field7204 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field7204[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field7204[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field7204[var5 + var5] = arg0[var4];
            this.field7204[var5 + var5 + 1] = var4++;
        }
    }
}
