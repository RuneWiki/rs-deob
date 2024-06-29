import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class588 {

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "I")
    public int field7894 = 0;

    @OriginalMember(owner = "client!pda", name = "e", descriptor = "I")
    public int field7895 = 0;

    @OriginalMember(owner = "client!pda", name = "h", descriptor = "Lhm;")
    private class208 field7898 = new class208(64);

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "Ldea;")
    private class230 field7900 = null;

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "Lpfa;")
    private class275 field7893;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "Lpfa;")
    private class275 field7891;

    @OriginalMember(owner = "client!pda", name = "f", descriptor = "[I")
    public static int[] field7896 = new int[5];

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "I")
    public static int field7892;

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "I")
    public static int field7897;

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "I")
    public static int field7899;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lvf;[IIJ)Ljava/lang/String;", line = 3)
    public final String method3265(class141 arg0, int[] arg1, int arg2, long arg3) {
        field7892++;
        if (this.field7900 != null) {
            String var6 = this.field7900.method1396(-67, arg3, arg1, arg0);
            if (var6 != null) {
                return var6;
            }
        }
        if (arg2 != 1) {
            this.field7898 = null;
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)V", line = 25)
    public static void method3266(byte arg0) {
        field7896 = null;
        int var1 = -101 % ((arg0 - 37) / 56);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(II)Ldw;", line = 36)
    public final class673 method3267(int arg0, int arg1) {
        field7897++;
        int var3 = -95 / ((-arg1 - 4) / 59);
        class673 var4 = (class673) this.field7898.method1221((long) arg0, true);
        if (var4 != null) {
            return var4;
        }
        byte[] var5;
        if (arg0 < 32768) {
            var5 = this.field7893.method1659(-82, arg0, 1);
        } else {
            var5 = this.field7891.method1659(-105, arg0 & 0x7FFF, 1);
        }
        class673 var6 = new class673();
        var6.field9184 = this;
        if (var5 != null) {
            var6.method3732(106, new class572(var5));
        }
        if (arg0 >= 32768) {
            var6.method3738(1);
        }
        this.field7898.method1230((byte) -112, (long) arg0, var6);
        return var6;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILoa;)V", line = 69)
    public static final void method3268(int arg0, class650 arg1) {
        class580.field7774 = new class462[class391.field5010.length];
        field7899++;
        int var2 = 0;
        if (arg0 != -14646) {
            method3266((byte) 41);
        }
        while (class391.field5010.length > var2) {
            int var3 = class391.field5010[var2];
            class20 var4 = class267.method1587((byte) -124, var3, class578.field7760);
            class201 var5 = arg1.method414(var4, class495.method2690(class608.field8288, var3), true);
            class580.field7774[var2] = new class462(var5, var4);
            var2++;
        }
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(ILpfa;Lpfa;Ldea;)V", line = 123)
    public class588(int arg0, class275 arg1, class275 arg2, class230 arg3) {
        this.field7900 = arg3;
        this.field7893 = arg1;
        this.field7891 = arg2;
        if (this.field7893 != null) {
            this.field7894 = this.field7893.method1655(1, (byte) -82);
        }
        if (this.field7891 != null) {
            this.field7895 = this.field7891.method1655(1, (byte) -82);
        }
    }
}
