import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public abstract class class230 extends class461 {

    @OriginalMember(owner = "client!oq", name = "C", descriptor = "Z")
    public boolean field3468 = false;

    @OriginalMember(owner = "client!oq", name = "w", descriptor = "Lo;")
    public static class208 field3462 = new class208(8, 0, 4, 1);

    @OriginalMember(owner = "client!oq", name = "A", descriptor = "Ljn;")
    public static class134 field3466 = new class134(107, 4);

    @OriginalMember(owner = "client!oq", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field3473 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!oq", name = "B", descriptor = "B")
    public byte field3467;

    @OriginalMember(owner = "client!oq", name = "D", descriptor = "B")
    public byte field3469;

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
    public int field3453;

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!oq", name = "r", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!oq", name = "s", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!oq", name = "u", descriptor = "I")
    public int field3460;

    @OriginalMember(owner = "client!oq", name = "v", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!oq", name = "x", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!oq", name = "y", descriptor = "I")
    public int field3464;

    @OriginalMember(owner = "client!oq", name = "z", descriptor = "I")
    public int field3465;

    @OriginalMember(owner = "client!oq", name = "E", descriptor = "I")
    public int field3470;

    @OriginalMember(owner = "client!oq", name = "F", descriptor = "I")
    public int field3471;

    @OriginalMember(owner = "client!oq", name = "G", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "Loq;")
    public class230 field3455;

    @OriginalMember(owner = "client!oq", name = "t", descriptor = "Z")
    public boolean field3459;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(B)I", line = 5)
    public int method564(byte arg0) {
        if (arg0 >= -46) {
            return -93;
        } else {
            field3463++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(B[Lsca;II)I", line = 34)
    public final int method1527(byte arg0, class251[] arg1, int arg2, int arg3) {
        field3457++;
        long var5 = class182.field2291[this.field3467][arg3][arg2];
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            arg1[var9++] = class205.field2880[var10 - 1].field7687;
            var7 += 16L;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg1[var11] = null;
        }
        if (arg0 != -32) {
            method1529((byte) -17);
        }
        return var9;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILae;)V", line = 72)
    public static final void method1528(int arg0, class283 arg1) {
        class580.field8151 = 0;
        field3472++;
        int var2 = -17 / ((45 - arg0) / 43);
        class588.field8292 = 0;
        class361.field5207 = new class519();
        class285.field4105 = new class200[1024];
        class256.field3783 = new class388[class563.field7934[class778.field10694] + 1];
        class158.field2050 = 0;
        class722.field9956 = 0;
        class562.method3325(2, arg1);
        class16.method60(arg1, false);
    }

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "(B)V", line = 90)
    public static void method1529(byte arg0) {
        if (arg0 >= 36) {
            field3466 = null;
            field3462 = null;
            field3473 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lgga;I)Lgha;", line = 102)
    public static final class687 method1530(class511 arg0, int arg1) {
        if (arg1 == 1) {
            field3458++;
            return new class687(arg0.method3034(1), arg0.method3034(1), arg0.method3034(1), arg0.method3034(arg1), arg0.method2983(true), arg0.method2983(true), arg0.method3013(121));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "f", descriptor = "(I)Lfs;", line = 113)
    public static final class607 method1531(int arg0) {
        field3454++;
        class523 var1 = null;
        class607 var2 = new class607(class327.field4603, 0);
        try {
            class344 var3 = class129.field1674.method4243((byte) -127, true, "");
            while (var3.field4970 == 0) {
                class730.method4066((byte) -45, 1L);
            }
            if (arg0 != 3) {
                return null;
            }
            if (var3.field4970 == 1) {
                var1 = (class523) var3.field4975;
                byte[] var4 = new byte[(int) var1.method3114((byte) -121)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var1.method3115(var5, (byte) 126, var4.length - var5, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                var2 = new class607(new class511(var4), class327.field4603, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var1 != null) {
                var1.method3121((byte) 63);
            }
        } catch (Exception var7) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)V", line = 167)
    public static final void method1532(int arg0, int arg1) {
        field3461++;
        if (arg0 <= 116) {
            field3473 = null;
        }
        class17 var2 = class245.method1634(1, (long) arg1, 14);
        var2.method69(13);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIIIII)I", line = 189)
    public static final int method1533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 & 0x3;
        field3456++;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg2;
            arg2 = arg3;
            arg3 = var8;
        }
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return arg5;
        } else if (var7 == 2) {
            return 7 + 1 - arg0 - arg2;
        } else if (arg1 == 23467) {
            return 7 + 1 - arg5 - arg3;
        } else {
            return -46;
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILha;II)Z")
    public abstract boolean method88(int arg0, class473 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)I")
    public abstract int method89(int arg0);

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "(B)I")
    public abstract int method78(byte arg0);

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lha;B)Z")
    public abstract boolean method1525(class473 arg0, byte arg1);

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "(I)Z")
    public abstract boolean method80(int arg0);

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "(I)Z")
    public abstract boolean method77(int arg0);

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILha;)Lrk;")
    public abstract class289 method74(int arg0, class473 arg1);

    @OriginalMember(owner = "client!oq", name = "e", descriptor = "(B)V")
    public abstract void method81(byte arg0);

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z[Lsca;)I")
    public abstract int method1526(boolean arg0, class251[] arg1);

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "(Z)Z")
    public abstract boolean method83(boolean arg0);

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "(Lha;I)V")
    public abstract void method76(class473 arg0, int arg1);

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "(Lha;I)Ltja;")
    public abstract class491 method72(class473 arg0, int arg1);

    @OriginalMember(owner = "client!oq", name = "g", descriptor = "(I)Z")
    public abstract boolean method1534(int arg0);

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Loq;IZILha;II)V")
    public abstract void method73(class230 arg0, int arg1, boolean arg2, int arg3, class473 arg4, int arg5, int arg6);
}
