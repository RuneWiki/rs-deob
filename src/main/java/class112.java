import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class112 extends class378 {

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    private int field1179;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    private int field1177;

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    private int field1182;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "Lln;")
    private class377 field1180;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
    private int field1174;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
    private int field1183;

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "I")
    private int field1190;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
    public static int field1175 = 50;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "[I")
    public static int[] field1181 = new int[field1175];

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "[I")
    public static int[] field1178 = new int[field1175];

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "[I")
    public static int[] field1176 = new int[field1175];

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "[I")
    public static int[] field1184 = new int[field1175];

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "[I")
    public static int[] field1186 = new int[field1175];

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field1189 = new String[field1175];

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "[I")
    public static int[] field1187 = new int[field1175];

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "Lvq;")
    private class460 field1185;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)Lvq;")
    public final class460 method751(byte arg0) {
        field1188++;
        int var2 = 90 % ((-arg0 - 30) / 39);
        if (this.field1185 == null) {
            class686.field9685[0] = this.field1183;
            class686.field9685[5] = this.field1190;
            class686.field9685[2] = this.field1179;
            class150 var3 = this.field1180.field578;
            class686.field9685[3] = this.field1174;
            class686.field9685[1] = this.field1182;
            class686.field9685[4] = this.field1177;
            boolean var4 = false;
            int var5 = 0;
            for (int var6 = 0; var6 < 6; var6++) {
                if (!var3.method929(15715, class686.field9685[var6])) {
                    return null;
                }
                class298 var8 = var3.method931(class686.field9685[var6], true);
                int var9 = var8.field3711 ? 64 : 128;
                if (var8.field3701 > 0) {
                    var4 = true;
                }
                if (var9 > var5) {
                    var5 = var9;
                }
            }
            for (int var7 = 0; var7 < 6; var7++) {
                class84.field885[var7] = var3.method930(false, -115, var5, class686.field9685[var7], 1.0F, var5);
            }
            this.field1185 = this.field1180.method2216(var5, var4, (byte) -79, class84.field885);
        }
        return this.field1185;
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)V")
    public static void method752(int arg0) {
        field1181 = null;
        if (arg0 != 1) {
            field1186 = null;
        }
        field1186 = null;
        field1189 = null;
        field1184 = null;
        field1176 = null;
        field1187 = null;
        field1178 = null;
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lln;IIIIII)V")
    public class112(class377 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1179 = arg3;
        this.field1177 = arg5;
        this.field1182 = arg2;
        this.field1180 = arg0;
        this.field1174 = arg4;
        this.field1183 = arg1;
        this.field1190 = arg6;
    }
}
