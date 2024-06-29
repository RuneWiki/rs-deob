import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public abstract class class71 {

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field696 = 13156520;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "Lwd;")
    public static class357 field695 = new class357(12, 0, 1, 0);

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "Lcq;")
    public static class110 field701 = new class110(81, 0);

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)Z", line = 8)
    public static final boolean method367(int arg0, int arg1) {
        if (arg0 == -9) {
            field700++;
            return arg1 >= 4 && arg1 <= 8;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V", line = 20)
    public static void method368(byte arg0) {
        field695 = null;
        field701 = null;
        if (arg0 < 87) {
            method372(-4, (byte) 13, null, 113);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBLwp;I)V", line = 37)
    public static final void method372(int arg0, byte arg1, class452 arg2, int arg3) {
        if (arg1 != -21) {
            method368((byte) -11);
        }
        field699++;
        class598 var4 = arg2.method2607(-56, class701.field9813);
        if (var4 == null) {
            return;
        }
        class701.field9813.method982(arg3, arg0, arg2.field6483 + arg3, arg2.field6443 + arg0);
        if (class16.field130 >= 3) {
            class701.field9813.method1036(-16777216, var4, arg3, arg0);
        } else {
            class50.field508.method3000((float) arg2.field6483 / 2.0F + (float) arg3, (float) arg2.field6443 / 2.0F + (float) arg0, 4096, (int) (-class508.field7300) & 0x3FFF << 2, var4, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIJZ)Ljava/lang/String;", line = 60)
    public static final String method373(int arg0, int arg1, int arg2, long arg3, boolean arg4) {
        if (arg2 != -28863) {
            return null;
        }
        field698++;
        char var6 = ',';
        char var7 = '.';
        if (arg0 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg0 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg3 < 0L) {
            arg3 = -arg3;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg3 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg3 * 10)));
            if (arg3 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(JI)I", line = 141)
    public final int method375(long arg0, int arg1) {
        field697++;
        long var4 = this.method374(-1913);
        if (var4 > 0L) {
            class452.method2602(var4, (byte) -97);
        }
        return arg1 == 26 ? this.method371(arg0, false) : -90;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)V")
    public abstract void method369(byte arg0);

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)J")
    public abstract long method370(int arg0);

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(JZ)I")
    public abstract int method371(long arg0, boolean arg1);

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)J")
    public abstract long method374(int arg0);
}
