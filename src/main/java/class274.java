import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class274 {

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Lbp;")
    private class251 field4152 = new class251();

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "Lpo;")
    private class375 field4162 = new class375();

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    private int field4165;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    private int field4163;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "Lke;")
    private class407 field4164;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "[I")
    public static int[] field4151 = new int[32];

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Lfb;")
    public static class457 field4155;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Llt;")
    public static class458 field4160;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "Llt;")
    public static class458 field4161;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4151[var1] = var0 - 1;
            var0 += var0;
        }
        field4155 = class512.method3061(31046);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 3)
    public final void method1665(int arg0) {
        field4158++;
        this.field4162.method2257((byte) -84);
        this.field4164.method2412(119);
        if (arg0 != 0) {
            this.method1665(53);
        }
        this.field4152 = new class251();
        this.field4165 = this.field4163;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IJ)Lbp;", line = 39)
    public final class251 method1666(int arg0, long arg1) {
        if (arg0 >= -125) {
            this.field4164 = null;
        }
        field4156++;
        class251 var4 = (class251) this.field4164.method2409(false, arg1);
        if (var4 != null) {
            this.field4162.method2256(var4, 30978);
        }
        return var4;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V", line = 62)
    public static void method1667(int arg0) {
        field4160 = null;
        if (arg0 <= 71) {
            method1669(null, false, 109);
        }
        field4161 = null;
        field4155 = null;
        field4151 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BJLbp;)V", line = 78)
    public final void method1668(byte arg0, long arg1, class251 arg2) {
        field4154++;
        if (this.field4165 == 0) {
            class251 var5 = this.field4162.method2254((byte) -105);
            var5.method1121(false);
            var5.method1512((byte) 125);
            if (this.field4152 == var5) {
                class251 var6 = this.field4162.method2254((byte) -103);
                var6.method1121(false);
                var6.method1512((byte) 126);
            }
        } else {
            this.field4165--;
        }
        this.field4164.method2413(arg1, -1, arg2);
        this.field4162.method2256(arg2, 30978);
        int var7 = 16 % ((arg0 + 64) / 56);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 108)
    public static final void method1669(String arg0, boolean arg1, int arg2) {
        class478.field7307.field7042 = 1;
        field4159++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class288.field4362.field7659; var6++) {
            class182 var9 = class288.field4362.method3030((byte) 116, var6);
            if ((!arg1 || var9.field2849) && var9.field2856 == -1 && var9.field2848 == -1 && var9.field2887 == 0 && var9.field2829.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class507.field7657 = -1;
                    class78.field1390 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class310.field4676 = arg2;
        class507.field7657 = var5;
        class78.field1390 = var4;
        String[] var7 = new String[class507.field7657];
        for (int var8 = 0; var8 < class507.field7657; var8++) {
            var7[var8] = class288.field4362.method3030((byte) 102, var4[var8]).field2829;
        }
        class205.method1261(-30299, class78.field1390, var7);
        class478.field7307.method2732((byte) -104);
        class478.field7307.field7042 = 2;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII)V", line = 181)
    public static final void method1670(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4157++;
        float var5 = (float) class492.field7485 / (float) class492.field7500;
        int var6 = arg1;
        if (arg4 > -83) {
            field4160 = null;
        }
        int var7 = arg3;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg3 / var5);
        }
        int var8 = arg0 - (arg1 - var6) / 2;
        int var9 = arg2 - (arg3 - var7) / 2;
        class264.field3989 = class492.field7485 - (class492.field7485 * var9 / var7);
        class403.field5863 = -1;
        class226.field3471 = -1;
        class466.field7158 = class492.field7500 * var8 / var6;
        class419.method2454((byte) 126);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lhf;Ljava/awt/Frame;Z)V", line = 215)
    public static final void method1671(class260 arg0, Frame arg1, boolean arg2) {
        field4153++;
        while (true) {
            class180 var3 = arg0.method1562((byte) -118, arg1);
            while (var3.field2802 == 0) {
                class414.method2437(10L, (byte) -122);
            }
            if (var3.field2802 == 1) {
                if (!arg2) {
                    return;
                }
                arg1.setVisible(false);
                arg1.dispose();
                return;
            }
            class414.method2437(100L, (byte) -122);
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(I)V", line = 266)
    public class274(int arg0) {
        this.field4165 = arg0;
        this.field4163 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field4164 = new class407(var2);
    }
}
