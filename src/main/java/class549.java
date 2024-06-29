import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class549 {

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "Llga;")
    private class663 field7429 = new class663(64);

    @OriginalMember(owner = "client!nu", name = "l", descriptor = "Llga;")
    private class663 field7433 = new class663(100);

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "Lsea;")
    private class648 field7422;

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "Llh;")
    public static class487 field7424 = new class487(1, 7);

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "I")
    public static int field7423;

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "I")
    public static int field7427;

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!nu", name = "i", descriptor = "I")
    public static int field7430;

    @OriginalMember(owner = "client!nu", name = "j", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!nu", name = "k", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V", line = 8)
    public static void method3083(byte arg0) {
        field7424 = null;
        if (arg0 != -1) {
            method3083((byte) -8);
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "([IILnv;I[II)Lk;", line = 18)
    public static final class525 method3084(int[] arg0, int arg1, class382 arg2, int arg3, int[] arg4, int arg5) {
        if (arg1 != 17998) {
            field7423 = 18;
        }
        field7430++;
        if (!arg2.method1054(class309.field4271, class559.field7539, 27)) {
            int[] var10 = new int[arg3 * arg5];
            for (int var11 = 0; var11 < arg5; var11++) {
                int var12 = arg3 * var11 + arg0[var11];
                for (int var13 = 0; var13 < arg4[var11]; var13++) {
                    var10[var12++] = -16777216;
                }
            }
            return new class525(arg2, arg3, arg5, var10);
        }
        byte[] var6 = new byte[arg3 * arg5];
        for (int var7 = 0; var7 < arg5; var7++) {
            int var8 = arg3 * var7 + arg0[var7];
            for (int var9 = 0; var9 < arg4[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class525(arg2, arg3, arg5, var6);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)Lut;", line = 76)
    public final class109 method3085(int arg0, int arg1) {
        field7428++;
        class663 var3 = this.field7433;
        class109 var4;
        synchronized (this.field7433) {
            var4 = (class109) this.field7433.method3747((byte) -66, (long) arg1);
            if (var4 == null) {
                var4 = new class109(arg1);
                this.field7433.method3748((long) arg1, var4, 12537);
            }
            if (!var4.method787(8)) {
                return null;
            }
        }
        if (arg0 != 0) {
            this.method3088(-125, -108);
        }
        return var4;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 105)
    public static final boolean method3086(String arg0, byte arg1) {
        field7426++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 != -63) {
            field7423 = 74;
        }
        for (int var2 = 0; var2 < class671.field9419; var2++) {
            if (arg0.equalsIgnoreCase(class696.field9891[var2])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class143.field2063.field9693);
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)V", line = 137)
    public final void method3087(byte arg0) {
        class663 var2 = this.field7429;
        synchronized (this.field7429) {
            this.field7429.method3749(7648);
        }
        int var3 = -67 / ((-arg0 - 37) / 61);
        field7425++;
        class663 var4 = this.field7433;
        synchronized (this.field7433) {
            this.field7433.method3749(7648);
        }
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(II)V", line = 156)
    public final void method3088(int arg0, int arg1) {
        class663 var3 = this.field7429;
        synchronized (this.field7429) {
            this.field7429.method3754(arg0, true);
        }
        if (arg1 != -16777216) {
            this.method3088(47, 29);
        }
        field7427++;
        class663 var4 = this.field7433;
        synchronized (this.field7433) {
            this.field7433.method3754(arg0, true);
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V", line = 173)
    public final void method3089(int arg0) {
        field7432++;
        class663 var2 = this.field7429;
        synchronized (this.field7429) {
            this.field7429.method3755(19713);
        }
        class663 var3 = this.field7433;
        synchronized (this.field7433) {
            this.field7433.method3755(19713);
            int var4 = -52 % ((80 - arg0) / 40);
        }
    }

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(II)Lks;", line = 190)
    public final class403 method3090(int arg0, int arg1) {
        field7431++;
        class663 var3 = this.field7429;
        class403 var4;
        synchronized (this.field7429) {
            var4 = (class403) this.field7429.method3747((byte) -66, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class648 var5 = this.field7422;
        byte[] var6;
        synchronized (this.field7422) {
            var6 = this.field7422.method3654(-15615, class158.method1120(arg1, 124), class61.method498(0, arg1));
            int var7 = 93 / ((arg0 + 27) / 48);
        }
        class403 var8 = new class403();
        var8.field5658 = arg1;
        var8.field5671 = this;
        if (var6 != null) {
            var8.method2355(true, new class501(var6));
        }
        var8.method2352(true);
        class663 var9 = this.field7429;
        synchronized (this.field7429) {
            this.field7429.method3748((long) arg1, var8, 12537);
            return var8;
        }
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(Lci;ILsea;Lsea;Lsea;)V", line = 231)
    public class549(class414 arg0, int arg1, class648 arg2, class648 arg3, class648 arg4) {
        this.field7422 = arg2;
        if (this.field7422 != null) {
            int var6 = this.field7422.method3649((byte) 112) - 1;
            this.field7422.method3653(var6, true);
        }
        class475.method2678(true, arg4, arg3, 2);
    }
}
