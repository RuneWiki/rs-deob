import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class78 extends class335 {

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "[I")
    public static int[] field1252 = new int[32];

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "[[Z")
    public static boolean[][] field1261 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "I")
    public static int field1262 = 0;

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "F")
    public static float field1258;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "I")
    private int field1255;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "I")
    private int field1259;

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "I")
    private int field1260;

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "Lad;")
    public static class326 field1253;

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "[Lqd;")
    public static class252[] field1251;

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V", line = 11)
    public class78() {
        this(0);
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V", line = 16)
    public static void method569(int arg0) {
        field1251 = null;
        field1252 = null;
        field1253 = null;
        if (arg0 == 8202) {
            field1261 = (boolean[][]) null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)V", line = 30)
    public static final void method570(int arg0, int arg1, int arg2) {
        if (arg1 >= -98) {
            method572(-45, 64, 114, false, 57, 24);
        }
        for (int var3 = 0; var3 < class97.field1549; var3++) {
            class257 var4 = class43.method371(var3, false);
            if (var4 != null) {
                int var5 = var4.field4022;
                if (var5 >= 0 && !class15.field207.method2092(var5, -20003)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field4026 >= 0) {
                    int var10 = var4.field4026;
                    int var11 = (var10 & 0x7F) + arg0;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class15.field215[class12.method92(-385541369, 96, var12)];
                } else if (var5 >= 0) {
                    var9 = class15.field215[class12.method92(-385541369, 96, class15.field207.method2085(var5, (byte) -84))];
                } else if (var4.field4034 == -1) {
                    var9 = -1;
                } else {
                    int var6 = var4.field4034;
                    int var7 = (var6 & 0x7F) + arg0;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class15.field215[class12.method92(-385541369, 96, var8)];
                }
                class99.field1576[var3 + 1] = var9;
            }
        }
        field1256++;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(II)V", line = 103)
    private final void method571(int arg0, int arg1) {
        this.field1255 = arg1 >> 12 & 0xFF0;
        this.field1259 = (arg1 & 0xFF00) >> 4;
        field1263++;
        this.field1260 = arg1 & 0xFF << 4;
        if (arg0 != 32) {
            this.field1259 = 62;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILkh;I)V", line = 116)
    public final void method230(int arg0, class166 arg1, int arg2) {
        field1250++;
        if (arg2 < 51) {
            this.field1260 = 119;
        }
        if (arg0 == 0) {
            this.method571(32, arg1.method1156((byte) 107));
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)[[I", line = 152)
    public final int[][] method249(int arg0, byte arg1) {
        field1257++;
        if (arg1 != 51) {
            method569(62);
        }
        int[][] var3 = this.field5232.method1101(arg0, true);
        if (this.field5232.field2446) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class105.field1630; var7++) {
                var4[var7] = this.field1255;
                var5[var7] = this.field1259;
                var6[var7] = this.field1260;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(I)V", line = 190)
    private class78(int arg0) {
        super(0, false);
        this.method571(32, arg0);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIZII)V", line = 205)
    public static final void method572(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field1254++;
        if (arg3) {
            field1253 = (class326) null;
        }
        int var6 = class101.method739(class141.field2187, class119.field1817, (byte) 68, arg5);
        int var7 = class101.method739(class141.field2187, class119.field1817, (byte) 68, arg4);
        int var8 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg0);
        int var9 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg2);
        for (int var10 = var6; var10 <= var7; var10++) {
            class272.method1876(class34.field525[var10], var9, var8, arg1, (byte) -81);
        }
    }
}
