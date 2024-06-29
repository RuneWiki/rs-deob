import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class95 extends class320 {

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "Lrl;")
    private class232 field1301;

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "I")
    private int field1308;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
    private int field1303;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "I")
    private int field1304;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
    private int field1302;

    @OriginalMember(owner = "client!rm", name = "A", descriptor = "I")
    private int field1309;

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "Lpb;")
    public static class79 field1305 = new class79(1);

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "D")
    public static double field1306;

    @OriginalMember(owner = "client!rm", name = "y", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!rm", name = "B", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!rm", name = "D", descriptor = "Lvr;")
    public static class200 field1312;

    @OriginalMember(owner = "client!rm", name = "C", descriptor = "Luu;")
    public static class237 field1311;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "Lpda;")
    private class492 field1300;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)Lpda;")
    public final class492 method638(boolean arg0) {
        if (arg0) {
            method639(-34);
        }
        field1307++;
        if (this.field1300 == null) {
            class290.field4165[3] = this.field1304;
            class270 var2 = this.field1301.field7623;
            class290.field4165[0] = this.field1309;
            class290.field4165[2] = this.field1308;
            class290.field4165[5] = this.field1302;
            class290.field4165[1] = this.field1299;
            class290.field4165[4] = this.field1303;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method517(class290.field4165[var5], !arg0)) {
                    return null;
                }
                class239 var7 = var2.method521(class290.field4165[var5], 116);
                int var8 = var7.field3556 ? 64 : 128;
                if (var7.field3575 > 0) {
                    var3 = true;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class111.field1493[var6] = var2.method519(-6839, class290.field4165[var6], 1.0F, var4, var4, false);
            }
            this.field1300 = this.field1301.method329(var4, (byte) 75, class111.field1493, var3);
        }
        return this.field1300;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lrl;IIIIII)V")
    public class95(class232 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1301 = arg0;
        this.field1308 = arg3;
        this.field1299 = arg2;
        this.field1303 = arg5;
        this.field1304 = arg4;
        this.field1302 = arg6;
        this.field1309 = arg1;
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V")
    public static void method639(int arg0) {
        field1305 = null;
        field1311 = null;
        if (arg0 != 6046) {
            field1310 = -5;
        }
        field1312 = null;
    }
}
