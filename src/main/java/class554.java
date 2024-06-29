import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class554 extends class30 {

    @OriginalMember(owner = "client!oea", name = "K", descriptor = "I")
    public static int field7475 = 0;

    @OriginalMember(owner = "client!oea", name = "z", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!oea", name = "A", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!oea", name = "B", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!oea", name = "E", descriptor = "I")
    private int field7471;

    @OriginalMember(owner = "client!oea", name = "F", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!oea", name = "H", descriptor = "I")
    private int field7473;

    @OriginalMember(owner = "client!oea", name = "L", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!oea", name = "M", descriptor = "I")
    private int field7477;

    @OriginalMember(owner = "client!oea", name = "N", descriptor = "I")
    public static int field7478;

    @OriginalMember(owner = "client!oea", name = "D", descriptor = "Llf;")
    public static class215 field7470;

    @OriginalMember(owner = "client!oea", name = "I", descriptor = "Lsea;")
    public static class648 field7474;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field7476;
        int[][] var3 = super.field377.method3683(arg0, (byte) 122);
        if (arg1 != 7) {
            this.field7473 = 50;
        }
        if (super.field377.field9085) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class31.field399; ++var7) {
                var4[var7] = this.field7471;
                var5[var7] = this.field7473;
                var6[var7] = this.field7477;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(I)V")
    private class554(int arg0) {
        super(0, false);
        this.method3109(arg0, -106);
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(III)V")
    public static final void method3107(int arg0, int arg1, int arg2) {
        ++field7468;
        class51 var3 = class703.method3938(-1989279584, arg1, 13);
        var3.method402((byte) 26);
        var3.field603 = arg2;
        if (arg0 != 10) {
            field7475 = -89;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIJZB)Ljava/lang/String;")
    public static final String method3108(int arg0, int arg1, long arg2, boolean arg3, byte arg4) {
        ++field7472;
        char var6 = ',';
        char var7 = '.';
        if (arg1 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg1 == 2) {
            var7 = 160;
        }
        boolean var8 = false;
        if (~arg2 > -1L) {
            arg2 = -arg2;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg4 != -93) {
            return null;
        } else {
            if (~arg0 < -1) {
                for (int var10 = 0; ~var10 > ~arg0; ++var10) {
                    int var11 = (int) arg2;
                    arg2 /= 10L;
                    var9.append((char) (-((int) arg2 * 10) + 48 + var11));
                }
                var9.append(var6);
            }
            int var12 = 0;
            while (true) {
                int var13 = (int) arg2;
                arg2 /= 10L;
                var9.append((char) (-((int) arg2 * 10) + var13 + 48));
                if (arg2 == 0L) {
                    if (var8) {
                        var9.append('-');
                    }
                    return var9.reverse().toString();
                }
                if (arg3) {
                    ++var12;
                    if (var12 % 3 == 0) {
                        var9.append(var7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(II)V")
    private final void method3109(int arg0, int arg1) {
        this.field7473 = 4080 & arg0 >> 4;
        this.field7477 = (arg0 & 255) << 4;
        int var3 = 16 % ((arg1 - -43) / 60);
        ++field7469;
        this.field7471 = arg0 >> 12 & 4080;
    }

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "(I)V")
    public static void method3110(int arg0) {
        field7474 = null;
        field7470 = null;
        if (arg0 <= 60) {
            field7475 = 119;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(BILac;)V")
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg0 <= 100) {
            this.field7477 = 53;
        }
        ++field7467;
        if (arg1 == 0) {
            this.method3109(arg2.method2819((byte) 72), -122);
        }
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "()V")
    public class554() {
        this(0);
    }

    @OriginalMember(owner = "client!oea", name = "g", descriptor = "(I)Lsc;")
    public static final class317 method3111(int arg0) {
        ++field7478;
        if (arg0 != -4141) {
            method3110(-57);
        }
        try {
            return (class317) Class.forName("fr").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
