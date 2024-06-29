import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public abstract class class518 {

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Lmfa;")
    public static class562 field7399 = new class562();

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field7395;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field7396;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field7398;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field7400;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lfo;[IB[III)Lufa;", line = 7)
    public static final class622 method2952(class473 arg0, int[] arg1, byte arg2, int[] arg3, int arg4, int arg5) {
        field7397++;
        if (arg2 != -1) {
            return null;
        } else if (arg0.method1169(class595.field8446, class271.field3429, (byte) 127)) {
            byte[] var10 = new byte[arg4 * arg5];
            for (int var11 = 0; var11 < arg5; var11++) {
                int var12 = arg4 * var11 + arg3[var11];
                for (int var13 = 0; var13 < arg1[var11]; var13++) {
                    var10[var12++] = -1;
                }
            }
            return new class622(arg0, arg4, arg5, var10);
        } else {
            int[] var6 = new int[arg4 * arg5];
            for (int var7 = 0; var7 < arg5; var7++) {
                int var8 = arg4 * var7 + arg3[var7];
                for (int var9 = 0; var9 < arg1[var7]; var9++) {
                    var6[var8++] = -16777216;
                }
            }
            return new class622(arg0, arg4, arg5, var6);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 66)
    public static final Class method2953(String arg0, int arg1) throws ClassNotFoundException {
        field7396++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg1 != 65536) {
            return null;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V", line = 105)
    public static void method2954(boolean arg0) {
        field7399 = null;
        if (arg0) {
            method2952(null, null, (byte) -17, null, 123, -75);
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V", line = 116)
    public static final void method2955(int arg0) {
        if (class351.field4601 == 9) {
            class508.method2921(5, (byte) -116);
        } else if (class351.field4601 == 5 || class351.field4601 == 6) {
            class508.method2921(3, (byte) -114);
        } else if (class351.field4601 == 12) {
            class508.method2921(3, (byte) -108);
        }
        int var1 = 66 / ((-arg0 - 48) / 57);
        field7398++;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZI)Z", line = 154)
    public static final boolean method2956(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field7400 = -93;
        }
        field7395++;
        return (arg0 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public abstract void method1642(int arg0);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([BIII)I")
    public abstract int method1640(byte[] arg0, int arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public abstract void method1645(int arg0);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III[B)V")
    public abstract void method1641(int arg0, int arg1, int arg2, byte[] arg3) throws IOException;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Z")
    public abstract boolean method1644(int arg0, int arg1) throws IOException;
}
