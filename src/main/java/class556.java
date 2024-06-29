import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class556 {

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "Lvh;")
    private class328 field7513 = new class328(64);

    @OriginalMember(owner = "client!raa", name = "i", descriptor = "Lpj;")
    private class132 field7518;

    @OriginalMember(owner = "client!raa", name = "j", descriptor = "I")
    public static int field7519 = 0;

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "Lfc;")
    public static class235 field7516 = new class235(31, -1);

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!raa", name = "h", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!raa", name = "k", descriptor = "Lta;")
    public static class194 field7520;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z)V", line = 3)
    public final void method3043(boolean arg0) {
        field7517++;
        if (!arg0) {
            method3048((byte) 106);
        }
        class328 var2 = this.field7513;
        synchronized (this.field7513) {
            this.field7513.method1997(1);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZI)V", line = 20)
    public final void method3044(boolean arg0, int arg1) {
        if (!arg0) {
            this.field7518 = null;
        }
        field7515++;
        class328 var3 = this.field7513;
        synchronized (this.field7513) {
            this.field7513.method1989(arg1, (byte) 121);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V", line = 34)
    public final void method3045(int arg0) {
        class328 var2 = this.field7513;
        synchronized (this.field7513) {
            this.field7513.method1987(-31085);
            if (arg0 != -25009) {
                field7519 = -97;
            }
        }
        field7514++;
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(I)V", line = 51)
    public static void method3046(int arg0) {
        field7516 = null;
        field7520 = null;
        if (arg0 != 2) {
            field7520 = null;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IZ)Lcw;", line = 66)
    public final class164 method3047(int arg0, boolean arg1) {
        field7510++;
        class328 var3 = this.field7513;
        class164 var4;
        synchronized (this.field7513) {
            var4 = (class164) this.field7513.method1986((byte) -109, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class132 var5 = this.field7518;
        byte[] var6;
        synchronized (this.field7518) {
            var6 = this.field7518.method940(31, arg0, 0);
        }
        class164 var7 = new class164();
        if (arg1) {
            this.field7513 = null;
        }
        if (var6 != null) {
            var7.method1138(new class96(var6), -89);
        }
        class328 var8 = this.field7513;
        synchronized (this.field7513) {
            this.field7513.method1985(var7, (long) arg0, (byte) -102);
            return var7;
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V", line = 95)
    public static final void method3048(byte arg0) {
        class538.field7301 = 0;
        class609.field8471 = 0;
        class132.field1843 = 0;
        class171.field2566 = 0;
        if (arg0 != 2) {
            field7519 = -109;
        }
        field7511++;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIIIII)I", line = 108)
    public static final int method3049(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7512++;
        if (class144.field2149 == null) {
            return 0;
        }
        if (arg4 != 2) {
            method3049(54, -26, 62, -94, -6, 77);
        }
        if (arg0 < 3) {
            int var6 = arg1 >> 9;
            int var7 = arg5 >> 9;
            if (arg2 < 0 || arg3 < 0 || (class86.field1185 - 1) < arg2 || class526.field7212 - 1 < arg3) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || (class86.field1185 - 1) < var6 || (class526.field7212 - 1) < var7) {
                return 0;
            }
            boolean var8 = (class246.field3501[1][arg1 >> 9][arg5 >> 9] & 0x2) != 0;
            if ((arg1 & 0x1FF) == 0) {
                boolean var9 = (class246.field3501[1][var6 - 1][arg5 >> 9] & 0x2) != 0;
                boolean var10 = (class246.field3501[1][var6][arg5 >> 9] & 0x2) != 0;
                if (var10 != var9) {
                    var8 = (class246.field3501[1][arg2][arg3] & 0x2) != 0;
                }
            }
            if ((arg5 & 0x1FF) == 0) {
                boolean var11 = (class246.field3501[1][arg1 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class246.field3501[1][arg1 >> 9][var7] & 0x2) != 0;
                if (var12 != var11) {
                    var8 = (class246.field3501[1][arg2][arg3] & 0x2) != 0;
                }
            }
            if (var8) {
                arg0++;
            }
        }
        return class144.field2149[arg0].method267(arg1, arg5);
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(Ldd;ILpj;)V", line = 177)
    public class556(class647 arg0, int arg1, class132 arg2) {
        this.field7518 = arg2;
        this.field7518.method936(31, -125);
    }
}
