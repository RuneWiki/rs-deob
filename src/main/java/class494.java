import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class494 extends class4 {

    @OriginalMember(owner = "client!tt", name = "y", descriptor = "I")
    public static int field6926 = 0;

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!tt", name = "t", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!tt", name = "u", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!tt", name = "x", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!tt", name = "z", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!tt", name = "s", descriptor = "Lbaa;")
    private class130 field6920;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "([BI)Z")
    public static final boolean method2987(byte[] arg0, int arg1) {
        field6924++;
        class63 var2 = new class63(arg0);
        if (arg1 != 20832) {
            method2990(126, -26);
        }
        int var3 = var2.method505((byte) -119);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method505((byte) -119) == 1;
        if (var4) {
            class46.method251(arg1 ^ 0xFFFFAEF7, var2);
        }
        class683.method3846(var2, 65535);
        return true;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
    public static final void method2988(int arg0) {
        class259.field3750 = arg0;
        for (int var1 = 0; var1 < class61.field877; var1++) {
            for (int var2 = 0; var2 < class713.field9959; var2++) {
                if (class137.field1948[arg0][var1][var2] == null) {
                    class137.field1948[arg0][var1][var2] = new class262(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ldc;I)V")
    public final void method2989(class63 arg0, int arg1) {
        if (arg1 != 29949) {
            method2990(-83, -84);
        }
        while (true) {
            int var3 = arg0.method505((byte) -119);
            if (var3 == 0) {
                field6921++;
                return;
            }
            this.method2991(var3, (byte) 123, arg0);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)I")
    public static final int method2990(int arg0, int arg1) {
        return class680.field9452 == null ? 0 : class680.field9452[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IBLdc;)V")
    private final void method2991(int arg0, byte arg1, class63 arg2) {
        if (arg0 == 249) {
            int var4 = arg2.method505((byte) -119);
            if (this.field6920 == null) {
                int var5 = class606.method3450(var4, (byte) -25);
                this.field6920 = new class130(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method505((byte) -119) == 1;
                int var8 = arg2.method476((byte) 125);
                class71 var9;
                if (var7) {
                    var9 = new class481(arg2.method479((byte) -23));
                } else {
                    var9 = new class27(arg2.method457(-14532));
                }
                this.field6920.method820((long) var8, (byte) -42, var9);
            }
        }
        field6925++;
        if (arg1 <= 121) {
            field6919 = 22;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(CLjava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2992(char arg0, String arg1, int arg2) {
        field6923++;
        int var3 = class303.method1994(arg1, arg0, (byte) -37);
        String[] var4 = new String[arg2 + var3];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1.charAt(var8) != arg0; var8++) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BILjava/lang/String;)Ljava/lang/String;")
    public final String method2993(byte arg0, int arg1, String arg2) {
        field6927++;
        if (this.field6920 == null) {
            return arg2;
        } else if (arg0 == -65) {
            class481 var4 = (class481) this.field6920.method812(105, (long) arg1);
            return var4 == null ? arg2 : var4.field6707;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)I")
    public final int method2994(int arg0, int arg1, int arg2) {
        field6922++;
        if (this.field6920 == null) {
            return arg0;
        } else if (arg2 == 0) {
            class27 var4 = (class27) this.field6920.method812(124, (long) arg1);
            return var4 == null ? arg0 : var4.field347;
        } else {
            return -34;
        }
    }
}
