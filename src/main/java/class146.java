import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class146 extends class177 {

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    private int field2224 = 1365;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    private int field2225 = 0;

    @OriginalMember(owner = "client!va", name = "K", descriptor = "I")
    private int field2231 = 20;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "I")
    private int field2229 = 0;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "Ljava/lang/String;")
    public static String field2234 = "Connected to update server";

    @OriginalMember(owner = "client!va", name = "C", descriptor = "Lta;")
    public static class197 field2223 = new class197(5);

    @OriginalMember(owner = "client!va", name = "R", descriptor = "Ljava/lang/String;")
    public static String field2237 = "shake:";

    @OriginalMember(owner = "client!va", name = "F", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!va", name = "L", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "Llb;")
    public static class211 field2235;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "Llb;")
    public static class211 field2236;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(II)I", line = 6)
    public static final int method1087(int arg0, int arg1) {
        field2228++;
        return arg1 == -989985305 ? arg0 >>> 7 : -61;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)V", line = 17)
    public static final void method1088(int arg0, boolean arg1) {
        field2227++;
        if (arg1) {
            if (class319.field4972 != -1) {
                class13.method102(arg0 ^ 0xFFFFE3B7, class319.field4972);
            }
            for (class111 var2 = (class111) client.field3794.method200(0); var2 != null; var2 = (class111) client.field3794.method202((byte) -47)) {
                class163.method1170((byte) 111, var2, true);
            }
            class319.field4972 = -1;
            client.field3794 = new class29(8);
            class219.method1569(-116);
            class319.field4972 = class3.field5;
            class324.method2227(false, true);
            class274.method1899(true);
            class321.method2193(class319.field4972, arg0 ^ 0xBB8);
        }
        class323.field5016 = -1;
        class271.method1888(class105.field1617, (byte) -96);
        class235.field3602 = new class121();
        class235.field3602.field4496 = arg0;
        class235.field3602.field4507 = 3000;
        if (!class36.field534) {
            class187.method1353(class80.field1118, 14547);
            class113.method889(123, 10);
            return;
        }
        if (class78.field1104 == 2) {
            class220.field3455 = class51.field791 << 7;
            class311.field4845 = class53.field802 << 7;
        } else {
            class171.method1255(106);
        }
        class32.method227((byte) 124);
        class50.method459(8);
        class113.method889(arg0 ^ 0xBE7, 28);
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 235)
    public class146() {
        super(0, true);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lhb;II)V", line = 91)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field2224 = arg0.method300(-1394191632);
        } else if (arg2 == 1) {
            this.field2231 = arg0.method300(arg1 - 1394173571);
        } else if (arg2 == 2) {
            this.field2229 = arg0.method300(-1394191632);
        } else if (arg2 == 3) {
            this.field2225 = arg0.method300(-1394191632);
        }
        field2226++;
        if (arg1 != -18061) {
            this.field2229 = 43;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 134)
    public static final boolean method1089(byte arg0, String arg1) {
        if (arg0 != 39) {
            return true;
        }
        field2230++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class314.field4873; var2++) {
            if (arg1.equalsIgnoreCase(class119.field1874[var2])) {
                return true;
            }
        }
        if (arg1.equalsIgnoreCase(class235.field3602.field1895)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)[I", line = 165)
    public final int[] method95(int arg0, int arg1) {
        field2233++;
        int[] var3 = this.field2652.method1481(arg1, (byte) -59);
        if (this.field2652.field3287) {
            for (int var4 = 0; var4 < class287.field4415; var4++) {
                int var5 = (class179.field2684[var4] << 12) / this.field2224 + this.field2229;
                int var6 = var5;
                int var7 = var5;
                int var8 = (class260.field3858[arg1] << 12) / this.field2224 + this.field2225;
                int var9 = var8;
                int var10 = var5 * var5 >> 12;
                int var11 = var8;
                int var12 = var8 * var8 >> 12;
                int var13 = 0;
                while ((var10 + var12) < 16384 && this.field2231 > var13) {
                    var11 = (var7 * var11 >> 12) * 2 + var9;
                    var7 = var10 + var6 - var12;
                    var10 = var7 * var7 >> 12;
                    var13++;
                    var12 = var11 * var11 >> 12;
                }
                var3[var4] = this.field2231 - 1 > var13 ? (var13 << 12) / this.field2231 : 0;
            }
        }
        if (arg0 >= -52) {
            this.method95(118, 12);
        }
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIIIII)V", line = 247)
    public static final void method1090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2232++;
        if (class179.method1294(arg1, arg2 + 2)) {
            client.method1768(class305.field4779[arg1], arg2, arg6, arg3, arg4, arg7, arg0, arg5);
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)V", line = 265)
    public static void method1091(boolean arg0) {
        field2237 = null;
        field2235 = null;
        if (arg0) {
            field2235 = (class211) null;
        }
        field2223 = null;
        field2234 = null;
        field2236 = null;
    }
}
