import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class6 extends class322 {

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
    public static int field55 = 0;

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "Ljava/lang/String;")
    public static String field58 = "K";

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "I")
    public static int field62 = 0;

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "I")
    public static int field63 = 0;

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "I")
    public int field56;

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "Lbm;")
    public class137 field54;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "Z")
    public static boolean field60;

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "[B")
    public byte[] field53;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(B)[B", line = 4)
    public final byte[] method54(byte arg0) {
        field52++;
        if (this.field5004) {
            throw new RuntimeException();
        } else if (arg0 == 33) {
            return this.field53;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIZ)I", line = 33)
    public static final int method55(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg2 & 0x3;
        field61++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 1023 - arg0;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            if (!arg3) {
                method57((byte) 96);
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)I", line = 60)
    public final int method56(int arg0) {
        field59++;
        if (this.field5004) {
            return 0;
        } else if (arg0 == 100) {
            return 100;
        } else {
            return -5;
        }
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(B)V", line = 83)
    public static void method57(byte arg0) {
        field58 = null;
        if (arg0 != 116) {
            method55(-128, 3, -91, true);
        }
    }
}
