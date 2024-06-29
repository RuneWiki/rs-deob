import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class453 extends class337 {

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "I")
    public int field5903;

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "I")
    public int field5906;

    @OriginalMember(owner = "client!ps", name = "u", descriptor = "I")
    public int field5911;

    @OriginalMember(owner = "client!ps", name = "v", descriptor = "I")
    public int field5912;

    @OriginalMember(owner = "client!ps", name = "w", descriptor = "Z")
    public boolean field5913;

    @OriginalMember(owner = "client!ps", name = "s", descriptor = "I")
    public int field5909;

    @OriginalMember(owner = "client!ps", name = "r", descriptor = "Luw;")
    public static class208 field5908 = new class208(126, 12);

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!ps", name = "t", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V", line = 12)
    public static void method2575(int arg0) {
        field5908 = null;
        if (arg0 >= -5) {
            field5908 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(III)Z", line = 27)
    public static final boolean method2576(int arg0, int arg1, int arg2) {
        field5910++;
        if (arg1 > -115) {
            method2577(108L, -27);
        }
        return (arg2 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(JI)V", line = 38)
    public static final void method2577(long arg0, int arg1) {
        field5907++;
        int var3 = class422.field5564.field2896 + class656.field8457;
        int var4 = class422.field5564.field2900 + class640.field8181;
        if (class599.field7622 - var3 < -2000 || (class599.field7622 - var3) > 2000 || (class572.field7251 - var4) < -2000 || class572.field7251 - var4 > 2000) {
            class599.field7622 = var3;
            class572.field7251 = var4;
        }
        if (class599.field7622 != var3) {
            int var5 = var3 - class599.field7622;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class599.field7622 += var6;
        }
        class297.field3762 += (float) arg0 * class327.field4010 / 6.0F;
        class698.field9250 += (float) arg0 * class436.field5733 / 6.0F;
        if (class572.field7251 != var4) {
            int var7 = var4 - class572.field7251;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class572.field7251 += var8;
        }
        class291.method1757(arg1 ^ 0x3BB0);
        if (arg1 != -15284) {
            method2575(-20);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(CZ)Z", line = 123)
    public static final boolean method2578(char arg0, boolean arg1) {
        field5902++;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class264.field3516;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        if (!arg1) {
            field5908 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(IIIIIZ)V", line = 158)
    public class453(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field5903 = arg1;
        this.field5906 = arg2;
        this.field5911 = arg0;
        this.field5912 = arg4;
        this.field5913 = arg5;
        this.field5909 = arg3;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "([BBI)[B", line = 171)
    public static final byte[] method2579(byte[] arg0, byte arg1, int arg2) {
        field5904++;
        byte[] var3 = new byte[arg2];
        class642.method3480(arg0, 0, var3, 0, arg2);
        if (arg1 > -113) {
            method2579(null, (byte) -106, -84);
        }
        return var3;
    }
}
