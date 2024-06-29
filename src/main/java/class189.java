import java.math.BigInteger;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class189 extends class146 {

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
    public int field3086;

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "I")
    public int field3093;

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "I")
    private int field3094;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    private int field3078;

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "I")
    public int field3095;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
    public int field3084;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
    private int field3091;

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "I")
    private int field3099;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    private int field3085;

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "I")
    private int field3097;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    public static int field3080 = 0;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public static volatile int field3079 = -1;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "Z")
    public static boolean field3090 = false;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "S")
    public static short field3081 = 1;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "Lkj;")
    public static class114 field3092 = null;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "Lre;")
    public static class266 field3082 = new class266();

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "I")
    public static int field3102 = -1;

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3103 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1300(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var6 = -56 % ((arg0 - 66) / 55);
        if (arg1 < 1) {
            arg1 = 1;
        }
        class92.field1450 = (short) arg1;
        field3083++;
        if (arg3 < 1) {
            arg3 = 1;
        }
        class57.field1001 = (short) arg3;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)Z")
    public static final boolean method1301(int arg0, int arg1) {
        if (arg0 <= 5) {
            return false;
        }
        field3100++;
        class80 var2 = class105.method785(100, arg1);
        if (var2 == null) {
            return false;
        } else if (class78.field1306 == 1 || class78.field1306 == 2 || class197.field3225 == 2) {
            class130.field2153 = var2.field1323;
            class295.field4680 = var2.field1322;
            if (class197.field3225 != 0) {
                class113.field1741 = class295.field4680 + 40000;
                class194.field3176 = class113.field1741;
                class236.field3735 = class295.field4680 + 50000;
            }
            return true;
        } else {
            String var3 = "";
            String var4 = "";
            if (class241.field3801 != null) {
                var3 = "/p=" + class241.field3801;
            }
            if (class197.field3225 != 0) {
                var4 = ":" + (var2.field1322 + 7000);
            }
            String var5 = "http://" + var2.field1323 + var4 + "/l=" + class145.field2391 + "/a=" + class252.field4019 + var3 + "/j" + (class137.field2309 ? "1" : "0") + ",o" + (class229.field3646 ? "1" : "0") + ",a2,m" + (class47.field869 ? "1" : "0");
            try {
                class208.field3344.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)Z")
    public static final boolean method1302(byte arg0) {
        field3087++;
        if (class138.field2311 == 0) {
            return arg0 == -21 ? class180.field2996.method226(128) : true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;")
    public static final String method1303(String arg0, String arg1, byte arg2, String arg3) {
        if (arg2 > -96) {
            return null;
        }
        field3076++;
        int var4 = arg3.length();
        int var5 = arg0.length();
        int var6 = arg1.length();
        if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var7 = var4;
        int var8 = var6 - var5;
        if (var8 != 0) {
            int var9 = 0;
            while (true) {
                int var10 = arg3.indexOf(arg0, var9);
                if (var10 < 0) {
                    break;
                }
                var9 = var5 + var10;
                var7 += var8;
            }
        }
        int var11 = 0;
        StringBuffer var12 = new StringBuffer(var7);
        while (true) {
            int var13 = arg3.indexOf(arg0, var11);
            if (var13 < 0) {
                var12.append(arg3.substring(var11));
                return var12.toString();
            }
            var12.append(arg3.substring(var11, var13));
            var11 = var5 + var13;
            var12.append(arg1);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)[I")
    public final int[] method1304(int arg0, int arg1, int arg2) {
        if (arg0 <= 108) {
            return null;
        } else {
            field3088++;
            return new int[] { this.field3099, this.field3084 + arg1 - this.field3091, arg2 - -this.field3093 + -this.field3078 };
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(III)Z")
    public final boolean method1305(int arg0, int arg1, int arg2) {
        if (arg0 == -2) {
            field3089++;
            return arg1 >= this.field3084 && this.field3086 >= arg1 && arg2 >= this.field3093 && this.field3095 >= arg2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(III)[I")
    public final int[] method1306(int arg0, int arg1, int arg2) {
        field3096++;
        int var4 = 46 % ((arg0 + 82) / 35);
        return new int[] { this.field3094, arg2 + this.field3091 - this.field3084, this.field3078 - (this.field3093 - arg1) };
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
    public static final void method1307(int arg0) {
        if (class210.field3374 != null) {
            class154 var1 = class210.field3374;
            synchronized (class210.field3374) {
                class210.field3374 = null;
            }
        }
        field3077++;
        if (arg0 != 1) {
            field3104 = 98;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IBII)Z")
    public final boolean method1308(int arg0, byte arg1, int arg2, int arg3) {
        field3098++;
        if (arg1 <= 85) {
            this.method1308(-20, (byte) -19, -26, 46);
        }
        return this.field3094 == arg2 && arg0 >= this.field3091 && this.field3097 >= arg0 && this.field3078 <= arg3 && this.field3085 >= arg3;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BII)Z")
    public final boolean method1309(byte arg0, int arg1, int arg2) {
        if (arg0 == -121) {
            field3101++;
            return this.field3091 <= arg1 && this.field3097 >= arg1 && arg2 >= this.field3078 && arg2 <= this.field3085;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V")
    public static void method1310(int arg0) {
        field3103 = null;
        field3082 = null;
        if (arg0 != 1917) {
            field3102 = -28;
        }
        field3092 = null;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field3086 = arg8;
        this.field3093 = arg7;
        this.field3094 = arg0;
        this.field3078 = arg3;
        this.field3095 = arg9;
        this.field3084 = arg6;
        this.field3091 = arg2;
        this.field3099 = arg1;
        this.field3085 = arg5;
        this.field3097 = arg4;
    }
}
