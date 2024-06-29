import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class584 extends class66 {

    @OriginalMember(owner = "client!sn", name = "G", descriptor = "I")
    public int field8314;

    @OriginalMember(owner = "client!sn", name = "w", descriptor = "I")
    private int field8304;

    @OriginalMember(owner = "client!sn", name = "I", descriptor = "I")
    private int field8316;

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "I")
    public int field8307;

    @OriginalMember(owner = "client!sn", name = "F", descriptor = "I")
    private int field8313;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
    private int field8301;

    @OriginalMember(owner = "client!sn", name = "C", descriptor = "I")
    private int field8310;

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "I")
    public int field8303;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
    public int field8300;

    @OriginalMember(owner = "client!sn", name = "y", descriptor = "Ljava/lang/String;")
    public static String field8306 = null;

    @OriginalMember(owner = "client!sn", name = "A", descriptor = "[I")
    public static int[] field8308 = new int[13];

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    public static int field8298;

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "I")
    public static int field8302;

    @OriginalMember(owner = "client!sn", name = "x", descriptor = "I")
    public static int field8305;

    @OriginalMember(owner = "client!sn", name = "B", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!sn", name = "D", descriptor = "I")
    public static int field8311;

    @OriginalMember(owner = "client!sn", name = "E", descriptor = "I")
    public static int field8312;

    @OriginalMember(owner = "client!sn", name = "H", descriptor = "I")
    public static int field8315;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "Lsb;")
    public static class266 field8299;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIII)Z")
    public final boolean method3419(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -26977) {
            method3425((byte) -9, true, null);
        }
        field8302++;
        return this.field8301 == arg2 && arg0 >= this.field8313 && arg0 <= this.field8310 && this.field8316 <= arg1 && arg1 <= this.field8304;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)Z")
    public final boolean method3420(int arg0, int arg1, int arg2) {
        field8315++;
        if (arg2 >= -78) {
            this.field8313 = 44;
        }
        return arg1 >= this.field8300 && arg1 <= this.field8314 && this.field8307 <= arg0 && this.field8303 >= arg0;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BII)Z")
    public final boolean method3421(byte arg0, int arg1, int arg2) {
        field8305++;
        if (arg0 == 57) {
            return this.field8313 <= arg1 && this.field8310 >= arg1 && this.field8316 <= arg2 && this.field8304 >= arg2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
    public static void method3422(byte arg0) {
        if (arg0 != 122) {
            field8308 = null;
        }
        field8308 = null;
        field8306 = null;
        field8299 = null;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II[II)V")
    public final void method3423(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[1] = this.field8300 + arg3 - this.field8313;
        if (arg1 >= -27) {
            this.field8303 = 17;
        }
        arg2[2] = this.field8307 + arg0 - this.field8316;
        arg2[0] = 0;
        field8312++;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZZ)V")
    public static final void method3424(boolean arg0, boolean arg1) {
        if (!arg0) {
            return;
        }
        field8298++;
        class673.field9486++;
        class165 var2 = class271.method1917(class420.field6424, (byte) -94, class354.field5657);
        class642.method3726(-684096285, var2);
        for (class102 var3 = (class102) class486.field7115.method1556(115); var3 != null; var3 = (class102) class486.field7115.method1559(126)) {
            if (!var3.method708(50)) {
                var3 = (class102) class486.field7115.method1556(120);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field1689 == 0) {
                class353.method2370(true, (byte) 0, arg1, var3);
            }
        }
        if (class672.field9481 != null) {
            class362.method2415(-118, class672.field9481);
            class672.field9481 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BZLjava/lang/String;)V")
    public static final void method3425(byte arg0, boolean arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        field8309++;
        short[] var4 = new short[16];
        int var5 = 0;
        if (arg0 <= 46) {
            field8299 = null;
        }
        int var6 = arg1 ? 32768 : 0;
        int var7 = var6 + (arg1 ? class139.field2340.field9894 : class139.field2340.field9892);
        for (int var8 = var6; var8 < var7; var8++) {
            class159 var11 = class139.field2340.method3968(var8, 0);
            if (var11.field2714 && var11.method1309((byte) -124).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class649.field9098 = null;
                    class661.field9221 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class661.field9221 = var5;
        class589.field8379 = 0;
        class649.field9098 = var4;
        String[] var9 = new String[class661.field9221];
        for (int var10 = 0; var10 < class661.field9221; var10++) {
            var9[var10] = class139.field2340.method3968(var4[var10], 0).method1309((byte) -116);
        }
        class319.method2173(-74, var9, class649.field9098);
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(II[II)V")
    public final void method3426(int arg0, int arg1, int[] arg2, int arg3) {
        field8311++;
        arg2[2] = -this.field8307 - (-this.field8316 - arg0);
        int var5 = 39 % ((arg3 + 7) / 50);
        arg2[1] = arg1 + this.field8313 - this.field8300;
        arg2[0] = this.field8301;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field8314 = arg7;
        this.field8304 = arg4;
        this.field8316 = arg2;
        this.field8307 = arg6;
        this.field8313 = arg1;
        this.field8301 = arg0;
        this.field8310 = arg3;
        this.field8303 = arg8;
        this.field8300 = arg5;
    }
}
