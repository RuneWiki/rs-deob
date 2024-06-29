import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class86 {

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Loh;")
    private class281 field1169 = new class281();

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    private int field1177;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    private int field1165;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Lvd;")
    private class4 field1162;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field1171 = 0;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Z")
    public static boolean field1174 = true;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "[[[B")
    public static byte[][][] field1176;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
    public final void method536(int arg0, int arg1) {
        field1178++;
        if (class256.field3921 != null) {
            for (class92 var3 = (class92) this.field1169.method1887((byte) -90); var3 != null; var3 = (class92) this.field1169.method1886(118)) {
                if (var3.method599(128)) {
                    if (var3.method601(0) == null) {
                        var3.method1115(87);
                        var3.method527(false);
                        this.field1165++;
                    }
                } else if ((++var3.field1148) > ((long) arg1)) {
                    class92 var4 = class256.field3921.method795(var3, 50);
                    this.field1162.method20(var4, var3.field2369, 0);
                    class238.method1596((byte) 64, var4, var3);
                    var3.method1115(21);
                    var3.method527(false);
                }
            }
        }
        int var5 = -77 % ((22 - arg0) / 39);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIBIII)V")
    public static final void method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        class215 var10 = null;
        class215 var11 = (class215) class41.field607.method990(-123);
        field1167++;
        while (var11 != null) {
            if (var11.field3242 == arg7 && var11.field3230 == arg0 && var11.field3232 == arg8 && var11.field3243 == arg4) {
                var10 = var11;
                break;
            }
            var11 = (class215) class41.field607.method993(-67);
        }
        if (var10 == null) {
            var10 = new class215();
            var10.field3232 = arg8;
            var10.field3243 = arg4;
            var10.field3242 = arg7;
            var10.field3230 = arg0;
            class232.method1534(var10, (byte) -126);
            class41.field607.method988(var10, (byte) -77);
        }
        var10.field3237 = arg5;
        int var12 = 7 / ((arg6 + 37) / 40);
        var10.field3252 = arg2;
        var10.field3239 = arg3;
        var10.field3244 = arg9;
        var10.field3249 = arg1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)I")
    public final int method538(int arg0) {
        field1172++;
        int var2 = arg0;
        for (class92 var3 = (class92) this.field1169.method1887((byte) -56); var3 != null; var3 = (class92) this.field1169.method1886(102)) {
            if (!var3.method599(arg0 + 128)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IJ)V")
    public final void method539(int arg0, long arg1) {
        field1161++;
        if (arg0 != 4408) {
            return;
        }
        class92 var4 = (class92) this.field1162.method23(216, arg1);
        if (var4 != null) {
            var4.method1115(13);
            var4.method527(false);
            this.field1165++;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
    public final Object method540(byte arg0, long arg1) {
        field1170++;
        class92 var4 = (class92) this.field1162.method23(216, arg1);
        if (var4 == null) {
            return null;
        }
        if (arg0 > -113) {
            this.field1169 = null;
        }
        Object var5 = var4.method601(0);
        if (var5 == null) {
            var4.method1115(-120);
            var4.method527(false);
            this.field1165++;
            return null;
        }
        if (var4.method599(128)) {
            class226 var6 = new class226(var5);
            this.field1162.method20(var6, var4.field2369, 0);
            this.field1169.method1890(var6, 0);
            var6.field1148 = 0L;
            var4.method1115(87);
            var4.method527(false);
        } else {
            this.field1169.method1890(var4, 0);
            var4.field1148 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public static void method541(byte arg0) {
        if (arg0 <= -32) {
            field1176 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)I")
    public static final int method542(int arg0, int arg1) {
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        field1179++;
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        if (arg1 <= 66) {
            field1164 = 96;
        }
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
    public final void method543(Object arg0, long arg1, int arg2) {
        field1166++;
        this.method539(arg2 - 858989051, arg1);
        if (this.field1165 == 0) {
            class92 var5 = (class92) this.field1169.method1880(0);
            var5.method1115(arg2 ^ 0xCCCCCCD5);
            var5.method527(false);
        } else {
            this.field1165--;
        }
        class226 var6 = new class226(arg0);
        this.field1162.method20(var6, arg1, 0);
        this.field1169.method1890(var6, arg2 ^ arg2);
        var6.field1148 = 0L;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    public final void method544(boolean arg0) {
        field1163++;
        for (class92 var2 = (class92) this.field1169.method1887((byte) -51); var2 != null; var2 = (class92) this.field1169.method1886(83)) {
            if (var2.method599(128)) {
                var2.method1115(117);
                var2.method527(false);
                this.field1165++;
            }
        }
        if (arg0) {
            field1171 = -46;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lhc;BLhc;)V")
    public static final void method545(class235 arg0, byte arg1, class235 arg2) {
        class56.field803 = arg2;
        if (arg1 != -74) {
            field1176 = null;
        }
        field1173++;
        class17.field176 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public final void method546(int arg0) {
        this.field1169.method1888(0);
        field1175++;
        this.field1162.method19((byte) 11);
        this.field1165 = this.field1177;
        if (arg0 != -90762264) {
            this.field1177 = -93;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(I)V")
    public class86(int arg0) {
        this.field1177 = arg0;
        this.field1165 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field1162 = new class4(var2);
    }
}
