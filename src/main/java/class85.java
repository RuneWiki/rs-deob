import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class85 {

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "I")
    private int field1301 = -1;

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "I")
    private int field1305 = 0;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "Lvp;")
    private class123 field1300 = new class123();

    @OriginalMember(owner = "client!hu", name = "q", descriptor = "Z")
    public boolean field1312 = false;

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "I")
    private int field1304;

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "I")
    private int field1302;

    @OriginalMember(owner = "client!hu", name = "o", descriptor = "[[I")
    private int[][] field1310;

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "[Ltc;")
    private class233[] field1303;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "[I")
    public static int[] field1296 = new int[200];

    @OriginalMember(owner = "client!hu", name = "k", descriptor = "I")
    public static int field1306 = 0;

    @OriginalMember(owner = "client!hu", name = "n", descriptor = "Llt;")
    public static class475 field1309 = new class475("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!hu", name = "r", descriptor = "Lki;")
    public static class498 field1313 = new class498(15, 8);

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!hu", name = "l", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!hu", name = "p", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!hu", name = "s", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(FIZIFLuv;FFIIFI[BI)V")
    public static final void method496(float arg0, int arg1, boolean arg2, int arg3, float arg4, class243 arg5, float arg6, float arg7, int arg8, int arg9, float arg10, int arg11, byte[] arg12, int arg13) {
        field1311++;
        if (arg2) {
            return;
        }
        int var14 = arg1 * arg13;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg3; var16++) {
            int var19 = arg9;
            arg5.method134(arg11, 0, arg13, var15, arg4 / (float) arg1, arg1, arg10 / (float) arg8, arg7 / (float) arg13, arg2, arg8, arg0 * 127.0F);
            arg7 *= 2.0F;
            arg4 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg12[var19] = (byte) ((int) ((float) arg12[var19] + var15[var20]));
                var19++;
            }
            arg10 *= 2.0F;
            arg0 *= arg6;
        }
        int var17 = arg9;
        for (int var18 = 0; var18 < var14; var18++) {
            arg12[var17] = (byte) (arg12[var17] + 127);
            var17++;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZ)[I")
    public final int[] method497(int arg0, boolean arg1) {
        field1297++;
        if (arg1) {
            this.method501((byte) 41);
        }
        if (this.field1304 == this.field1302) {
            this.field1312 = this.field1303[arg0] == null;
            this.field1303[arg0] = class190.field2803;
            return this.field1310[arg0];
        } else if (this.field1304 == 1) {
            this.field1312 = this.field1301 != arg0;
            this.field1301 = arg0;
            return this.field1310[0];
        } else {
            class233 var3 = this.field1303[arg0];
            if (var3 == null) {
                this.field1312 = true;
                if (this.field1304 <= this.field1305) {
                    class233 var4 = (class233) this.field1300.method818(arg1);
                    var3 = new class233(arg0, var4.field3463);
                    this.field1303[var4.field3462] = null;
                    var4.method2049(-103);
                } else {
                    var3 = new class233(arg0, this.field1305);
                    this.field1305++;
                }
                this.field1303[arg0] = var3;
            } else {
                this.field1312 = false;
            }
            this.field1300.method819((byte) -72, var3);
            return this.field1310[var3.field3463];
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
    public static final void method498(int arg0) {
        class482.field7072.method1540(arg0 ^ arg0);
        field1298++;
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)V")
    public static void method499(int arg0) {
        field1296 = null;
        field1309 = null;
        field1313 = null;
        int var1 = 106 % ((arg0 + 15) / 51);
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)[[I")
    public final int[][] method500(int arg0) {
        field1308++;
        if (this.field1304 != this.field1302) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = -1 / ((-arg0 - 39) / 63);
        for (int var3 = 0; var3 < this.field1304; var3++) {
            this.field1303[var3] = class190.field2803;
        }
        return this.field1310;
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(III)V")
    public class85(int arg0, int arg1, int arg2) {
        this.field1304 = arg0;
        this.field1302 = arg1;
        this.field1310 = new int[this.field1304][arg2];
        this.field1303 = new class233[this.field1302];
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V")
    public final void method501(byte arg0) {
        for (int var2 = 0; var2 < this.field1304; var2++) {
            this.field1310[var2] = null;
        }
        if (arg0 < 52) {
            field1299 = -3;
        }
        field1307++;
        this.field1310 = null;
        this.field1303 = null;
        this.field1300.method817(-4);
        this.field1300 = null;
    }
}
