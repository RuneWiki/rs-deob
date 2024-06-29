import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class69 extends class320 {

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public int field1185 = 0;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public int field1180;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public int field1183;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public int field1184;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    public int field1190;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "I")
    public int field1196;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "I")
    public int field1198;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "Lat;")
    public class255 field1188;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "Lln;")
    public class256 field1194;

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "Lfi;")
    public static class388 field1205;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "Lgn;")
    public class493 field1181;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "Lgn;")
    public class493 field1186;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "Lgm;")
    public class79 field1189;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "Z")
    public boolean field1201;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "[I")
    public static int[] field1199;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "[I")
    public int[] field1200;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI[F)[F")
    public static final float[] method564(byte arg0, int arg1, float[] arg2) {
        if (arg0 < 68) {
            method568((byte) -83);
        }
        field1193++;
        float[] var3 = new float[arg1];
        class73.method594(arg2, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIII)V")
    public static final void method565(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class435.field6487 = arg3;
        class92.field1576 = arg0;
        if (arg4 != -912212377) {
            field1199 = null;
        }
        field1195++;
        class22.field458 = arg1;
        class242.field3494 = arg2;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V")
    public final void method566(int arg0) {
        field1191++;
        int var2 = this.field1190;
        if (arg0 != 31106) {
            return;
        }
        if (this.field1189 != null) {
            class79 var5 = this.field1189.method631(6574, class335.field5059);
            if (var5 == null) {
                this.field1200 = null;
                this.field1196 = 0;
                this.field1204 = 0;
                this.field1184 = 0;
                this.field1190 = -1;
                this.field1203 = 0;
            } else {
                this.field1204 = var5.field1379 << 7;
                this.field1184 = var5.field1313;
                this.field1200 = var5.field1350;
                this.field1190 = var5.field1317;
                this.field1196 = var5.field1399;
                this.field1203 = var5.field1342;
            }
        } else if (this.field1188 != null) {
            int var3 = class405.method2476(this.field1188, (byte) -29);
            if (var2 != var3) {
                this.field1190 = var3;
                class42 var4 = this.field1188.field3677;
                if (var4.field797 != null) {
                    var4 = var4.method427(class335.field5059, (byte) -128);
                }
                if (var4 == null) {
                    this.field1203 = this.field1204 = 0;
                } else {
                    this.field1204 = var4.field781 << 7;
                    this.field1203 = var4.field791;
                }
            }
        } else if (this.field1194 != null) {
            this.field1190 = class9.method47(this.field1194, true);
            this.field1203 = this.field1194.field3699;
            this.field1204 = this.field1194.field3709 << 7;
        }
        if (this.field1190 != var2 && this.field1181 != null) {
            class45.field837.method2035(this.field1181);
            this.field1181 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
    public static void method567(int arg0) {
        field1205 = null;
        field1199 = null;
        if (arg0 != 0) {
            method564((byte) 5, 74, null);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static final void method568(byte arg0) {
        if (arg0 != 68) {
            field1199 = null;
        }
        field1192++;
        class335.field5060 = 0;
        class150.field2387 = 0;
        class275.field3982 = 0;
        class141.field2243 = 0;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([BIB)I")
    public static final int method569(byte[] arg0, int arg1, byte arg2) {
        field1197++;
        int var3 = -125 % ((arg2 - 22) / 41);
        return class321.method2093(0, (byte) -70, arg1, arg0);
    }

    static {
        new class342("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
    }
}
