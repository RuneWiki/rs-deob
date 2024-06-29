import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class369 extends class143 {

    @OriginalMember(owner = "client!qba", name = "D", descriptor = "I")
    public int field5102 = -1;

    @OriginalMember(owner = "client!qba", name = "G", descriptor = "I")
    public int field5105 = 0;

    @OriginalMember(owner = "client!qba", name = "H", descriptor = "I")
    public int field5106 = 12800;

    @OriginalMember(owner = "client!qba", name = "S", descriptor = "I")
    public int field5116 = 12800;

    @OriginalMember(owner = "client!qba", name = "U", descriptor = "Z")
    public boolean field5118 = true;

    @OriginalMember(owner = "client!qba", name = "E", descriptor = "I")
    public int field5103 = -1;

    @OriginalMember(owner = "client!qba", name = "V", descriptor = "I")
    public int field5119 = 0;

    @OriginalMember(owner = "client!qba", name = "M", descriptor = "Ljava/lang/String;")
    public String field5110;

    @OriginalMember(owner = "client!qba", name = "I", descriptor = "I")
    public int field5107;

    @OriginalMember(owner = "client!qba", name = "L", descriptor = "I")
    public int field5109;

    @OriginalMember(owner = "client!qba", name = "N", descriptor = "Ljava/lang/String;")
    public String field5111;

    @OriginalMember(owner = "client!qba", name = "B", descriptor = "Lau;")
    public class692 field5100;

    @OriginalMember(owner = "client!qba", name = "C", descriptor = "[F")
    public static float[] field5101 = new float[16384];

    @OriginalMember(owner = "client!qba", name = "J", descriptor = "[F")
    public static float[] field5108 = new float[16384];

    @OriginalMember(owner = "client!qba", name = "W", descriptor = "Z")
    public static boolean field5120;

    @OriginalMember(owner = "client!qba", name = "F", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!qba", name = "O", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!qba", name = "P", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!qba", name = "Q", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!qba", name = "R", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!qba", name = "T", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V")
    public final void method2206(int arg0) {
        this.field5119 = arg0;
        this.field5105 = 0;
        this.field5116 = 12800;
        this.field5106 = 12800;
        field5117++;
        for (class180 var2 = (class180) this.field5100.method3905(arg0 ^ 0xFFFFFF92); var2 != null; var2 = (class180) this.field5100.method3899(0)) {
            if (this.field5106 > var2.field2835) {
                this.field5106 = var2.field2835;
            }
            if (this.field5116 > var2.field2845) {
                this.field5116 = var2.field2845;
            }
            if (var2.field2837 > this.field5105) {
                this.field5105 = var2.field2837;
            }
            if (this.field5119 < var2.field2843) {
                this.field5119 = var2.field2843;
            }
        }
    }

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "(I)V")
    public static void method2207(int arg0) {
        field5101 = null;
        if (arg0 != 0) {
            field5120 = false;
        }
        field5108 = null;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIIZ[I)Z")
    public final boolean method2208(int arg0, int arg1, int arg2, boolean arg3, int[] arg4) {
        if (!arg3) {
            this.method2209(25, null, 47, 119);
        }
        field5112++;
        for (class180 var6 = (class180) this.field5100.method3905(-111); var6 != null; var6 = (class180) this.field5100.method3899(0)) {
            if (var6.method1297(1, arg1, arg2, arg0)) {
                var6.method1301(arg4, arg0, -117, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I[III)Z")
    public final boolean method2209(int arg0, int[] arg1, int arg2, int arg3) {
        field5114++;
        class180 var5 = (class180) this.field5100.method3905(-121);
        if (arg2 > -21) {
            this.field5111 = null;
        }
        while (var5 != null) {
            if (var5.method1300(arg0, arg3, 1)) {
                var5.method1301(arg1, arg3, -102, arg0);
                return true;
            }
            var5 = (class180) this.field5100.method3899(0);
        }
        return false;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIZ)Z")
    public final boolean method2210(int arg0, int arg1, boolean arg2) {
        field5104++;
        if (arg2) {
            this.method2208(-24, 8, -64, false, null);
        }
        for (class180 var4 = (class180) this.field5100.method3905(-118); var4 != null; var4 = (class180) this.field5100.method3899(0)) {
            if (var4.method1300(arg0, arg1, 1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(BLek;)Lom;")
    public static final class353 method2211(byte arg0, class465 arg1) {
        field5113++;
        class353 var2 = new class353();
        if (arg0 >= -17) {
            method2211((byte) -74, null);
        }
        var2.field4950 = arg1.method2755((byte) -117);
        var2.field4953 = class116.field1840.method2157(var2.field4950, (byte) -69);
        return var2;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "([IIII)Z")
    public final boolean method2212(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            this.field5109 = 43;
        }
        field5115++;
        for (class180 var5 = (class180) this.field5100.method3905(-120); var5 != null; var5 = (class180) this.field5100.method3899(arg1)) {
            if (var5.method1298(arg3, arg2, -32144)) {
                var5.method1296(25612, arg0, arg2, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class369(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field5110 = arg2;
        this.field5107 = arg3;
        this.field5118 = arg5;
        this.field5103 = arg6;
        this.field5109 = arg0;
        this.field5111 = arg1;
        this.field5102 = arg4;
        if (this.field5103 == 255) {
            this.field5103 = 0;
        }
        this.field5100 = new class692();
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5108[var2] = (float) Math.sin((double) var2 * var0);
            field5101[var2] = (float) Math.cos((double) var2 * var0);
        }
        field5120 = false;
    }
}
