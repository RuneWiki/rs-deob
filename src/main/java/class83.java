import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class83 extends class30 {

    @OriginalMember(owner = "client!t", name = "s", descriptor = "I")
    private int field1257;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    private int field1264;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    private int field1250;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "I")
    private int field1254;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field1249 = 0;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "Z")
    public static boolean field1258 = false;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "Z")
    public static boolean field1256;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "[Lng;")
    public static class245[] field1252;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V", line = 5)
    public final void method225(int arg0, int arg1, int arg2) {
        field1263++;
        int var4 = this.field1254 * arg0 >> 12;
        if (arg2 != 2) {
            method572('W', (byte) -51);
        }
        int var5 = this.field1257 * arg0 >> 12;
        int var6 = this.field1264 * arg1 >> 12;
        int var7 = this.field1250 * arg1 >> 12;
        class38.method285(var4, true, var5, this.field370, var6, var7);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 26)
    public static void method571(int arg0) {
        if (arg0 >= -27) {
            method573(-127, 92, 62, 22, 98, 37, 93, -83);
        }
        field1252 = null;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(IIIIII)V", line = 35)
    public class83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1257 = arg2;
        this.field1264 = arg1;
        this.field1250 = arg3;
        this.field1254 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(CB)C", line = 56)
    public static final char method572(char arg0, byte arg1) {
        field1251++;
        if (arg0 == 'Æ') {
            return 'E';
        }
        if (arg1 <= 15) {
            method573(-93, -96, 127, -7, 68, 101, -37, -122);
        }
        if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIB)V", line = 91)
    public final void method228(int arg0, int arg1, byte arg2) {
        field1262++;
        if (arg2 != -94) {
            method573(109, -125, 26, -106, 71, 82, -101, -79);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIII)V", line = 101)
    public static final void method573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1261++;
        int var8 = arg1 + arg7;
        int var9 = arg1 + arg6;
        int var10 = arg0 - arg1;
        int var11 = arg3 - arg1;
        for (int var12 = arg7; var12 < var8; var12++) {
            class253.method1704(arg6, arg0, arg5, class175.field2675[var12], arg2 - 2011948101);
        }
        for (int var13 = arg3; var13 > var11; var13--) {
            class253.method1704(arg6, arg0, arg5, class175.field2675[var13], 7);
        }
        if (arg2 != 2011948108) {
            return;
        }
        for (int var14 = var8; var14 <= var11; var14++) {
            int[] var15 = class175.field2675[var14];
            class253.method1704(arg6, var9, arg5, var15, 7);
            class253.method1704(var9, var10, arg4, var15, arg2 - 2011948101);
            class253.method1704(var10, arg0, arg5, var15, 7);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lte;B)V", line = 146)
    public static final void method574(class38 arg0, byte arg1) {
        if (class343.field5341 == arg0.field466 || arg0.field507 == -1 || arg0.field558 != 0 || (arg0.field495 + 1) > class118.method809((byte) 92, arg0.field507).field3522[arg0.field557]) {
            int var2 = arg0.field466 - arg0.field553;
            int var3 = class343.field5341 - arg0.field553;
            int var4 = arg0.field480 * 128 + arg0.method271((byte) 52) * 64;
            int var5 = arg0.field464 * 128 + (arg0.method271((byte) 121) * 64);
            int var6 = arg0.field502 * 128 + arg0.method271((byte) 124) * 64;
            int var7 = arg0.field518 * 128 + (arg0.method271((byte) 123) * 64);
            arg0.field519 = ((var2 - var3) * var5 + (var3 * var7)) / var2;
            arg0.field537 = ((var2 - var3) * var4 + var3 * var6) / var2;
        }
        field1255++;
        arg0.field543 = 0;
        if (arg0.field469 == 0) {
            arg0.field520 = 1024;
        }
        if (arg1 != 71) {
            field1258 = false;
        }
        if (arg0.field469 == 1) {
            arg0.field520 = 1536;
        }
        if (arg0.field469 == 2) {
            arg0.field520 = 0;
        }
        if (arg0.field469 == 3) {
            arg0.field520 = 512;
        }
        arg0.field564 = arg0.field520;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(III)V", line = 196)
    public final void method227(int arg0, int arg1, int arg2) {
        if (arg0 != 1325998625) {
            this.field1254 = 87;
        }
        field1260++;
    }
}
