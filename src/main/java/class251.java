import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class251 implements class480 {

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "Lri;")
    private class97 field4008;

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "Ljava/lang/String;")
    private String field4007;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!vea", name = "e", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!vea", name = "f", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!vea", name = "g", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!vea", name = "h", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!vea", name = "i", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!vea", name = "j", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!vea", name = "k", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!vea", name = "d", descriptor = "[Z")
    public static boolean[] field4009;

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lofa;III)J", line = 6)
    public static final long method1784(class302 arg0, int arg1, int arg2, int arg3) {
        field4012++;
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class698 var8 = class213.field3537.method94(arg0.method394((byte) -106), (byte) -42);
        long var9 = (long) (arg2 | arg1 << 7 | arg0.method413((byte) 11) << 14 | arg0.method401((byte) 126) << 20 | 0x40000000);
        if (var8.field9830 == 0) {
            var9 |= var6;
        }
        if (var8.field9786 == 1) {
            var9 |= var4;
        }
        long var11 = var9 | (long) arg0.method394((byte) -88) << 32;
        if (arg3 != 5363) {
            field4009 = null;
        }
        return var11;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(B)V", line = 32)
    public static final void method1785(byte arg0) {
        field4006++;
        class234.field3710.method569(0);
        int var1 = -121 / ((49 - arg0) / 42);
    }

    @OriginalMember(owner = "client!vea", name = "c", descriptor = "(I)V", line = 42)
    public static void method1786(int arg0) {
        field4009 = null;
        if (arg0 != -23507) {
            field4010 = 48;
        }
    }

    @OriginalMember(owner = "client!vea", name = "b", descriptor = "(I)Lcj;", line = 52)
    public final class644 method1779(int arg0) {
        int var2 = -90 / ((-arg0 - 38) / 40);
        field4011++;
        return class644.field9054;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)I", line = 62)
    public final int method1781(int arg0) {
        field4016++;
        if (this.field4008.method920(this.field4007, 17852)) {
            return 100;
        } else {
            int var2 = -9 / ((29 - arg0) / 57);
            return 0;
        }
    }

    @OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lri;Ljava/lang/String;)V", line = 76)
    public class251(class97 arg0, String arg1) {
        this.field4008 = arg0;
        this.field4007 = arg1;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(BI)Lwg;", line = 93)
    public static final class391 method1787(byte arg0, int arg1) {
        field4014++;
        if (arg0 != -23) {
            method1787((byte) -36, 98);
        }
        class391 var2 = (class391) class694.field9724.method560(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class229.field3673.method926(0, -128, arg1);
        class391 var4 = new class391();
        if (var3 != null) {
            var4.method2538(0, new class6(var3));
        }
        var4.method2539((byte) 67);
        class694.field9724.method559(var4, (long) arg1, 0);
        return var4;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(B[BI)[B", line = 121)
    public static final byte[] method1788(byte arg0, byte[] arg1, int arg2) {
        field4013++;
        byte[] var3 = new byte[arg2];
        class398.method2566(arg1, 0, var3, 0, arg2);
        if (arg0 != 12) {
            field4010 = -50;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lll;IIILda;I)V", line = 136)
    public static final void method1789(class334 arg0, int arg1, int arg2, int arg3, class55 arg4, int arg5) {
        field4015++;
        if (arg4 != null) {
            arg0.method2313(arg5, arg4.method611(), arg4.method604(), -20483, arg4.method646(), arg4.method622(), arg4.method642(), arg4.method645(), arg4.method623(), arg2, arg3);
            int var6 = -63 / ((arg1 + 73) / 34);
        }
    }
}
