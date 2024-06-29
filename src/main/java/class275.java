import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class275 extends class92 {

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    private int field4146;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    private int field4142;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
    private int field4151;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    private int field4140;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    private int field4143;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    private int field4141;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    private int field4149;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    private int field4152;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    public static int field4150 = 0;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "Z")
    public static boolean field4153;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Throwable;)V")
    public static final void method1822(String arg0, byte arg1, Throwable arg2) {
        ++field4138;
        try {
            if (arg1 >= -82) {
                field4148 = -12;
            }
            String var3 = "";
            if (arg2 != null) {
                var3 = class187.method1163(arg2, false);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class96.method621(var3, -21983);
            String var4 = class197.method1236(":", (byte) 123, var3, "%3a");
            String var5 = class197.method1236("@", (byte) 51, var4, "%40");
            String var6 = class197.method1236("&", (byte) 113, var5, "%26");
            String var7 = class197.method1236("#", (byte) 39, var6, "%23");
            if (class123.field1863.field150 != null) {
                class78 var8 = class123.field1863.method70(-107, new URL(class123.field1863.field150.getCodeBase(), "clienterror.ws?c=" + class295.field4679 + "&u=" + class209.field3150 + "&v1=" + class12.field157 + "&v2=" + class12.field151 + "&e=" + var7));
                while (~var8.field1249 == -1) {
                    class250.method1643(1, 1L);
                }
                if (~var8.field1249 == -2) {
                    DataInputStream var9 = (DataInputStream) var8.field1250;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIZ)V")
    public final void method49(int arg0, int arg1, boolean arg2) {
        int var4 = this.field4152 * arg1 >> 12;
        ++field4144;
        if (!arg2) {
            field4153 = true;
        }
        int var5 = this.field4140 * arg0 >> 12;
        int var6 = this.field4143 * arg1 >> 12;
        int var7 = this.field4146 * arg0 >> 12;
        int var8 = this.field4149 * arg1 >> 12;
        int var9 = this.field4151 * arg1 >> 12;
        int var10 = this.field4142 * arg0 >> 12;
        int var11 = this.field4141 * arg0 >> 12;
        class149.method905(var10, var4, var9, var11, var7, var8, var5, super.field1454, var6, !arg2);
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4146 = arg3;
        this.field4142 = arg5;
        this.field4151 = arg6;
        this.field4140 = arg1;
        this.field4143 = arg2;
        this.field4141 = arg7;
        this.field4149 = arg4;
        this.field4152 = arg0;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(III)V")
    public final void method50(int arg0, int arg1, int arg2) {
        if (arg2 == -7368) {
            ++field4137;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)V")
    public static final void method1823(int arg0, int arg1) {
        class287.field4298.method1780(arg0, true);
        if (arg1 >= 1) {
            ++field4147;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIILrf;IIII)V")
    public static final void method1824(int arg0, int arg1, int arg2, class289 arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4154;
        int var8 = arg0 * arg0 + arg2 * arg2;
        if (arg5 >= var8) {
            if (arg6 == -256) {
                int var9 = Math.min(arg3.field4478 / 2, arg3.field4444 / 2);
                if (var9 * var9 < var8) {
                    int var10 = (int) class84.field1336 + class154.field2311 & 2047;
                    int var11 = class249.field3767[var10];
                    var9 -= 10;
                    int var12 = var11 * 256 / (class82.field1324 - -256);
                    int var13 = class249.field3781[var10];
                    int var14 = var13 * 256 / (class82.field1324 + 256);
                    int var15 = arg0 * var14 + arg2 * var12 >> 16;
                    int var16 = arg2 * var14 + -(arg0 * var12) >> 16;
                    double var17 = Math.atan2((double) var15, (double) var16);
                    int var19 = (int) (Math.sin(var17) * (double) var9);
                    int var20 = (int) ((double) var9 * Math.cos(var17));
                    ((class201) class162.field2486[arg1]).method1265(arg3.field4478 / 2 + arg4 + -10 - -var19, arg7 - -(arg3.field4444 / 2) + (-var20 - 10), 20, 20, 15, 15, var17, 256);
                } else {
                    class100.method645(arg4, arg7, arg6 ^ -233, arg0, arg2, arg3, class18.field223[arg1]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([BZ)Lrl;")
    public static final class164 method1825(byte[] arg0, boolean arg1) {
        ++field4136;
        if (arg0 == null) {
            return null;
        } else {
            if (!arg1) {
                method1822((String) null, (byte) 52, (Throwable) null);
            }
            class181 var2 = new class181(arg0, class10.field139, class273.field4104, class220.field3315, class82.field1312, class10.field129);
            class82.method537(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(II)I")
    public static final int method1826(int arg0, int arg1) {
        ++field4139;
        if (arg0 != -1914808948) {
            method1826(-18, -126);
        }
        class23 var2 = class276.method1827((byte) 113, arg1);
        int var3 = var2.field272;
        int var4 = var2.field274;
        int var5 = var2.field281;
        int var6 = class66.field1052[-var4 + var5];
        return var6 & class35.field494[var3] >> var4;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBI)V")
    public final void method45(int arg0, byte arg1, int arg2) {
        if (arg1 != 124) {
            this.field4140 = 86;
        }
        ++field4145;
    }
}
