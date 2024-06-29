import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class355 extends class376 {

    @OriginalMember(owner = "client!cn", name = "K", descriptor = "I")
    public int field4960 = 12800;

    @OriginalMember(owner = "client!cn", name = "N", descriptor = "I")
    public int field4963 = 0;

    @OriginalMember(owner = "client!cn", name = "I", descriptor = "I")
    public int field4958 = -1;

    @OriginalMember(owner = "client!cn", name = "B", descriptor = "I")
    public int field4951 = 12800;

    @OriginalMember(owner = "client!cn", name = "G", descriptor = "I")
    public int field4956 = 0;

    @OriginalMember(owner = "client!cn", name = "J", descriptor = "I")
    public int field4959 = -1;

    @OriginalMember(owner = "client!cn", name = "y", descriptor = "Z")
    public boolean field4948 = true;

    @OriginalMember(owner = "client!cn", name = "E", descriptor = "I")
    public int field4954;

    @OriginalMember(owner = "client!cn", name = "M", descriptor = "Ljava/lang/String;")
    public String field4962;

    @OriginalMember(owner = "client!cn", name = "O", descriptor = "Ljava/lang/String;")
    public String field4964;

    @OriginalMember(owner = "client!cn", name = "S", descriptor = "I")
    public int field4968;

    @OriginalMember(owner = "client!cn", name = "L", descriptor = "Lpk;")
    public class133 field4961;

    @OriginalMember(owner = "client!cn", name = "z", descriptor = "[C")
    public static char[] field4949 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!cn", name = "A", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!cn", name = "F", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!cn", name = "H", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!cn", name = "P", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!cn", name = "Q", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!cn", name = "R", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!cn", name = "C", descriptor = "Lfs;")
    public static class387 field4952;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I[IBI)Z")
    public final boolean method2141(int arg0, int[] arg1, byte arg2, int arg3) {
        field4967++;
        for (class402 var5 = (class402) this.field4961.method1018(50); var5 != null; var5 = (class402) this.field4961.method1022((byte) -112)) {
            if (var5.method2470(arg3, arg0, (byte) -58)) {
                var5.method2468(arg3, arg0, 2, arg1);
                return true;
            }
        }
        if (arg2 != 111) {
            method2147((byte) -56);
        }
        return false;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I[III)Z")
    public final boolean method2142(int arg0, int[] arg1, int arg2, int arg3) {
        field4953++;
        for (class402 var5 = (class402) this.field4961.method1018(124); var5 != null; var5 = (class402) this.field4961.method1022((byte) -112)) {
            if (var5.method2469((byte) 110, arg2, arg3)) {
                var5.method2467(arg1, 0, arg3, arg2);
                return true;
            }
        }
        if (arg0 <= 8) {
            this.field4963 = -24;
        }
        return false;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)Z")
    public final boolean method2143(int arg0, int arg1, int arg2) {
        field4950++;
        if (arg0 > -82) {
            this.method2146(false, null, 112, -88, -95);
        }
        for (class402 var4 = (class402) this.field4961.method1018(96); var4 != null; var4 = (class402) this.field4961.method1022((byte) -112)) {
            if (var4.method2469((byte) 82, arg1, arg2)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "(B)V")
    public final void method2144(byte arg0) {
        this.field4960 = 12800;
        this.field4956 = 0;
        this.field4963 = 0;
        field4957++;
        if (arg0 > -4) {
            this.method2143(83, 104, -33);
        }
        this.field4951 = 12800;
        for (class402 var2 = (class402) this.field4961.method1018(112); var2 != null; var2 = (class402) this.field4961.method1022((byte) -112)) {
            if (var2.field5965 < this.field4951) {
                this.field4951 = var2.field5965;
            }
            if (var2.field5953 < this.field4960) {
                this.field4960 = var2.field5953;
            }
            if (this.field4963 < var2.field5957) {
                this.field4963 = var2.field5957;
            }
            if (this.field4956 < var2.field5951) {
                this.field4956 = var2.field5951;
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2145(int arg0, int arg1, byte arg2) {
        field4966++;
        if (arg2 != -60) {
            field4952 = null;
        }
        return (arg0 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z[IIII)Z")
    public final boolean method2146(boolean arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field4955++;
        if (arg0) {
            this.field4962 = null;
        }
        for (class402 var6 = (class402) this.field4961.method1018(50); var6 != null; var6 = (class402) this.field4961.method1022((byte) -112)) {
            if (var6.method2471(98, arg3, arg4, arg2)) {
                var6.method2467(arg1, 0, arg4, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "(B)V")
    public static void method2147(byte arg0) {
        field4949 = null;
        field4952 = null;
        int var1 = 78 % ((-arg0 - 34) / 62);
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class355(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field4959 = arg4;
        this.field4958 = arg6;
        this.field4954 = arg0;
        this.field4948 = arg5;
        this.field4962 = arg2;
        this.field4964 = arg1;
        this.field4968 = arg3;
        if (this.field4958 == 255) {
            this.field4958 = 0;
        }
        this.field4961 = new class133();
    }
}
