import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class191 extends class189 {

    @OriginalMember(owner = "client!ao", name = "y", descriptor = "I")
    public int field3074 = -1;

    @OriginalMember(owner = "client!ao", name = "A", descriptor = "I")
    public int field3076 = -1;

    @OriginalMember(owner = "client!ao", name = "C", descriptor = "I")
    public int field3078 = 12800;

    @OriginalMember(owner = "client!ao", name = "O", descriptor = "I")
    public int field3090 = 12800;

    @OriginalMember(owner = "client!ao", name = "N", descriptor = "Z")
    public boolean field3089 = true;

    @OriginalMember(owner = "client!ao", name = "v", descriptor = "I")
    public int field3071 = 0;

    @OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
    public int field3085 = 0;

    @OriginalMember(owner = "client!ao", name = "P", descriptor = "I")
    public int field3091;

    @OriginalMember(owner = "client!ao", name = "Q", descriptor = "Ljava/lang/String;")
    public String field3092;

    @OriginalMember(owner = "client!ao", name = "F", descriptor = "Ljava/lang/String;")
    public String field3081;

    @OriginalMember(owner = "client!ao", name = "K", descriptor = "I")
    public int field3086;

    @OriginalMember(owner = "client!ao", name = "D", descriptor = "Lmf;")
    public class291 field3079;

    @OriginalMember(owner = "client!ao", name = "I", descriptor = "Z")
    public static boolean field3084 = false;

    @OriginalMember(owner = "client!ao", name = "x", descriptor = "Z")
    public static boolean field3073 = false;

    @OriginalMember(owner = "client!ao", name = "z", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!ao", name = "B", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!ao", name = "E", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!ao", name = "G", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!ao", name = "H", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!ao", name = "L", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!ao", name = "M", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!ao", name = "w", descriptor = "Z")
    public static boolean field3072;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([SBI)[S")
    public static final short[] method1293(short[] arg0, byte arg1, int arg2) {
        if (arg1 == 49) {
            field3087++;
            short[] var3 = new short[arg2];
            class394.method2450(arg0, 0, var3, 0, arg2);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(III[I)Z")
    public final boolean method1294(int arg0, int arg1, int arg2, int[] arg3) {
        if (arg2 != 12800) {
            method1293(null, (byte) -30, 115);
        }
        field3088++;
        for (class447 var5 = (class447) this.field3079.method1892(112); var5 != null; var5 = (class447) this.field3079.method1893((byte) -2)) {
            if (var5.method2672(arg1, arg0, 13967)) {
                var5.method2671(arg0, (byte) -107, arg1, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public static final void method1295(int arg0) {
        if (class71.field1437 < 0) {
            class79.field1578 = -1;
            class322.field4926 = -1;
            class71.field1437 = 0;
        }
        if (arg0 != 1130) {
            return;
        }
        field3077++;
        if (class71.field1437 > class319.field4880) {
            class322.field4926 = -1;
            class79.field1578 = -1;
            class71.field1437 = class319.field4880;
        }
        if (class457.field6775 < 0) {
            class457.field6775 = 0;
            class79.field1578 = -1;
            class322.field4926 = -1;
        }
        if (class319.field4865 < class457.field6775) {
            class457.field6775 = class319.field4865;
            class79.field1578 = -1;
            class322.field4926 = -1;
        }
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V")
    public final void method1296(int arg0) {
        this.field3071 = 0;
        field3082++;
        this.field3090 = 12800;
        this.field3078 = 12800;
        this.field3085 = arg0;
        for (class447 var2 = (class447) this.field3079.method1892(86); var2 != null; var2 = (class447) this.field3079.method1893((byte) -2)) {
            if (this.field3078 > var2.field6650) {
                this.field3078 = var2.field6650;
            }
            if (this.field3071 < var2.field6649) {
                this.field3071 = var2.field6649;
            }
            if (var2.field6659 > this.field3085) {
                this.field3085 = var2.field6659;
            }
            if (var2.field6664 < this.field3090) {
                this.field3090 = var2.field6664;
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIB[I)Z")
    public final boolean method1297(int arg0, int arg1, byte arg2, int[] arg3) {
        if (arg2 > -14) {
            return false;
        }
        field3083++;
        for (class447 var5 = (class447) this.field3079.method1892(93); var5 != null; var5 = (class447) this.field3079.method1893((byte) -2)) {
            if (var5.method2673(arg1, arg0, -2035)) {
                var5.method2670(arg0, arg1, -123, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BI[III)Z")
    public final boolean method1298(byte arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field3075++;
        if (arg0 > -62) {
            this.method1294(-89, 107, 97, null);
        }
        for (class447 var6 = (class447) this.field3079.method1892(88); var6 != null; var6 = (class447) this.field3079.method1893((byte) -2)) {
            if (var6.method2678(arg1, arg3, arg4, 0)) {
                var6.method2670(arg3, arg4, -115, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BII)Z")
    public final boolean method1299(byte arg0, int arg1, int arg2) {
        field3080++;
        for (class447 var4 = (class447) this.field3079.method1892(89); var4 != null; var4 = (class447) this.field3079.method1893((byte) -2)) {
            if (var4.method2673(arg2, arg1, -2035)) {
                return true;
            }
        }
        if (arg0 != -62) {
            this.field3092 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class191(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field3076 = arg4;
        this.field3091 = arg3;
        this.field3092 = arg1;
        this.field3074 = arg6;
        this.field3081 = arg2;
        this.field3086 = arg0;
        this.field3089 = arg5;
        if (this.field3074 == 255) {
            this.field3074 = 0;
        }
        this.field3079 = new class291();
    }
}
