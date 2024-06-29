import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class54 extends class499 {

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "I")
    public int field846 = -1;

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "I")
    public int field845 = -1;

    @OriginalMember(owner = "client!kl", name = "P", descriptor = "Z")
    public boolean field853 = true;

    @OriginalMember(owner = "client!kl", name = "Q", descriptor = "I")
    public int field854 = 12800;

    @OriginalMember(owner = "client!kl", name = "U", descriptor = "I")
    public int field858 = 0;

    @OriginalMember(owner = "client!kl", name = "J", descriptor = "I")
    public int field848 = 0;

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
    public int field849 = 12800;

    @OriginalMember(owner = "client!kl", name = "T", descriptor = "I")
    public int field857;

    @OriginalMember(owner = "client!kl", name = "O", descriptor = "I")
    public int field852;

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "Ljava/lang/String;")
    public String field851;

    @OriginalMember(owner = "client!kl", name = "S", descriptor = "Ljava/lang/String;")
    public String field856;

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "Lwl;")
    public class280 field847;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "[F")
    public static float[] field838 = new float[16];

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "Lff;")
    public static class9 field844 = new class9(23, -2);

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!kl", name = "L", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!kl", name = "R", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!kl", name = "V", descriptor = "[Lcr;")
    public static class403[] field859;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IBI)Z")
    public final boolean method392(int arg0, byte arg1, int arg2) {
        field855++;
        for (class148 var4 = (class148) this.field847.method1672((byte) -120); var4 != null; var4 = (class148) this.field847.method1668(-1)) {
            if (var4.method1017(arg2, arg0, false)) {
                return true;
            }
        }
        return arg1 <= 5 ? false : false;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BIII[I)Z")
    public final boolean method393(byte arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field840++;
        if (arg0 <= 69) {
            return true;
        }
        for (class148 var6 = (class148) this.field847.method1672((byte) -92); var6 != null; var6 = (class148) this.field847.method1668(-1)) {
            if (var6.method1019(-5023, arg2, arg1, arg3)) {
                var6.method1024(arg1, -1, arg4, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II[II)Z")
    public final boolean method394(int arg0, int arg1, int[] arg2, int arg3) {
        field841++;
        for (class148 var5 = (class148) this.field847.method1672((byte) -89); var5 != null; var5 = (class148) this.field847.method1668(-1)) {
            if (var5.method1015(arg0, 0, arg3)) {
                var5.method1018((byte) 116, arg3, arg0, arg2);
                return true;
            }
        }
        if (arg1 != -21) {
            this.field858 = 59;
        }
        return false;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([IIBI)Z")
    public final boolean method395(int[] arg0, int arg1, byte arg2, int arg3) {
        field837++;
        class148 var5 = (class148) this.field847.method1672((byte) -111);
        if (arg2 < 96) {
            return true;
        }
        while (var5 != null) {
            if (var5.method1017(arg1, arg3, false)) {
                var5.method1024(arg1, -1, arg0, arg3);
                return true;
            }
            var5 = (class148) this.field847.method1668(-1);
        }
        return false;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method396(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 == -18510) {
            field839++;
            class435.method2505(arg0, arg5, arg2, (byte) -95, arg7, arg6, 0, arg4, arg8, arg1);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIII)V")
    public static final void method397(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class209.field2863 != null) {
            class209.field2863[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class257.field3401 != null) {
            class257.field3401[arg0][arg1] = (byte) (arg3 >> 3);
        }
        if (class156.field2280 != null) {
            class156.field2280[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(B)V")
    public static final void method398(byte arg0) {
        client.field2740 = null;
        if (arg0 == 21) {
            class473.field6514 = -1;
            field850++;
        }
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(B)V")
    public final void method399(byte arg0) {
        this.field849 = 12800;
        this.field858 = 0;
        field843++;
        this.field854 = 12800;
        if (arg0 >= -52) {
            this.field852 = 54;
        }
        this.field848 = 0;
        for (class148 var2 = (class148) this.field847.method1672((byte) -105); var2 != null; var2 = (class148) this.field847.method1668(-1)) {
            if (this.field849 > var2.field2104) {
                this.field849 = var2.field2104;
            }
            if (this.field858 < var2.field2095) {
                this.field858 = var2.field2095;
            }
            if (var2.field2108 > this.field848) {
                this.field848 = var2.field2108;
            }
            if (var2.field2103 < this.field854) {
                this.field854 = var2.field2103;
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public static void method400(int arg0) {
        field844 = null;
        field838 = null;
        field859 = null;
        if (arg0 != 22259) {
            field838 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZ)Z")
    public static final boolean method401(int arg0, boolean arg1) {
        field842++;
        if (arg0 == 16 || arg0 == 10 || arg0 == 20 || arg0 == 22 || arg0 == 2) {
            return true;
        } else if (arg0 == 51 || arg0 == 1009) {
            return true;
        } else {
            if (arg1) {
                field844 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class54(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field857 = arg0;
        this.field852 = arg3;
        this.field853 = arg5;
        this.field851 = arg1;
        this.field856 = arg2;
        this.field845 = arg6;
        this.field846 = arg4;
        if (this.field845 == 255) {
            this.field845 = 0;
        }
        this.field847 = new class280();
    }
}
