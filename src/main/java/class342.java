import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class342 extends class238 {

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    public int field4981 = 0;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    public static int field4989 = 0;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "Z")
    public static boolean field4986 = false;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "Lwf;")
    public static class79 field4982 = new class79(49, 0);

    @OriginalMember(owner = "client!e", name = "K", descriptor = "Ldk;")
    public static class326 field4990 = new class326("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!e", name = "L", descriptor = "F")
    public static float field4991;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public int field4965;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public int field4968;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public int field4971;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public int field4972;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public int field4973;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public int field4977;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public int field4978;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "I")
    public int field4983;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "I")
    public int field4985;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "I")
    public int field4987;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    public int field4988;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "Lds;")
    public class12 field4974;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "Lds;")
    public class12 field4984;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Lkm;")
    public class216 field4966;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "Loa;")
    public class452 field4970;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "Ldq;")
    public class453 field4979;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Z")
    public boolean field4969;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "[I")
    public int[] field4980;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BIIIIIIII)V")
    public static final void method2153(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4967++;
        if (class78.method452(arg7, -3192)) {
            if (class77.field945[arg7] == null) {
                class347.method2172(-1, arg4, arg6, 0, arg1, arg5, class112.field1421[arg7], arg3, arg2, arg8);
            } else {
                class347.method2172(-1, arg4, arg6, 0, arg1, arg5, class77.field945[arg7], arg3, arg2, arg8);
            }
            int var10 = -27 % ((arg0 + 12) / 33);
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class359.field5166[var9] = true;
            }
        } else {
            class359.field5166[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(Z)V")
    public static void method2154(boolean arg0) {
        if (!arg0) {
            field4990 = null;
        }
        field4982 = null;
        field4990 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public final void method2155(int arg0) {
        field4976++;
        int var2 = this.field4965;
        if (arg0 != 0) {
            return;
        }
        if (this.field4979 != null) {
            class453 var3 = this.field4979.method2655(114, class140.field1859);
            if (var3 == null) {
                this.field4968 = 0;
                this.field4983 = 0;
                this.field4965 = -1;
                this.field4980 = null;
                this.field4972 = 0;
                this.field4985 = 0;
            } else {
                this.field4983 = var3.field6361;
                this.field4965 = var3.field6317;
                this.field4972 = var3.field6339 * 128;
                this.field4985 = var3.field6310;
                this.field4968 = var3.field6389;
                this.field4980 = var3.field6369;
            }
        } else if (this.field4966 != null) {
            int var4 = class491.method2877(-1, this.field4966);
            if (var2 != var4) {
                this.field4965 = var4;
                class466 var5 = this.field4966.field3232;
                if (var5.field6526 != null) {
                    var5 = var5.method2742(-61, class140.field1859);
                }
                if (var5 == null) {
                    this.field4985 = this.field4972 = 0;
                } else {
                    this.field4985 = var5.field6514;
                    this.field4972 = var5.field6562 * 128;
                }
            }
        } else if (this.field4970 != null) {
            this.field4965 = class437.method2574(this.field4970, (byte) -110);
            this.field4985 = this.field4970.field6261;
            this.field4972 = this.field4970.field6283 * 128;
        }
        if (this.field4965 != var2 && this.field4984 != null) {
            class59.field796.method2561(this.field4984);
            this.field4984 = null;
        }
    }

    static {
        new class326("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field4991 = 0.0F;
    }
}
