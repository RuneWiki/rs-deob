import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class632 extends class608 {

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    private int field9081;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "Lnv;")
    private class417 field9084;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    private int field9082;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    private int field9078;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    private int field9079;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    private int field9080;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
    private int field9087;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field9083 = new String[100];

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "I")
    public static int field9085;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
    public static int field9086;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "Ltc;")
    private class351 field9088;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)Ltc;")
    public final class351 method2889(int arg0) {
        field9085++;
        if (this.field9088 == null) {
            class541.field7791[3] = this.field9081;
            class150 var2 = this.field9084.field578;
            class541.field7791[0] = this.field9079;
            class541.field7791[2] = this.field9080;
            class541.field7791[5] = this.field9078;
            class541.field7791[1] = this.field9087;
            class541.field7791[4] = this.field9082;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method929(15715, class541.field7791[var5])) {
                    return null;
                }
                class298 var7 = var2.method931(class541.field7791[var5], true);
                int var8 = var7.field3711 ? 64 : 128;
                if (var7.field3701 > 0) {
                    var3 = 1;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class597.field8428[var6] = var2.method930(false, 127, var4, class541.field7791[var6], 1.0F, var4);
            }
            this.field9088 = new class351(this.field9084, 6407, var4, var3 != 0, class597.field8428);
        }
        return arg0 >= -38 ? null : this.field9088;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IC)Z")
    public static final boolean method3626(int arg0, char arg1) {
        field9086++;
        if (arg0 <= 95) {
            field9083 = null;
        }
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class231.field2698;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V")
    public static void method3627(boolean arg0) {
        if (!arg0) {
            method3626(-27, '\u0011');
        }
        field9083 = null;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lnv;IIIIII)V")
    public class632(class417 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field9081 = arg4;
        this.field9084 = arg0;
        this.field9082 = arg5;
        this.field9078 = arg6;
        this.field9079 = arg1;
        this.field9080 = arg3;
        this.field9087 = arg2;
    }
}
