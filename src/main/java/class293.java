import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class293 {

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    private int field4019 = 0;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "Lsq;")
    private class454 field4013;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Ltm;")
    public static class112 field4017 = new class112("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "[Llk;")
    public static class425[] field4020 = new class425[2048];

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field4021 = 0;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Lag;")
    private class180 field4015;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Lhs;")
    public static class284 field4024;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1809(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4014++;
        int var8 = arg5 + arg0;
        int var9 = arg7 - arg0;
        if (arg1 > -108) {
            return;
        }
        for (int var10 = arg5; var10 < var8; var10++) {
            class80.method554(class2.field16[var10], 124, arg3, arg2, arg4);
        }
        int var11 = arg2 - arg0;
        for (int var12 = arg7; var12 > var9; var12--) {
            class80.method554(class2.field16[var12], 113, arg3, arg2, arg4);
        }
        int var13 = arg0 + arg4;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class2.field16[var14];
            class80.method554(var15, 100, arg3, var13, arg4);
            class80.method554(var15, 106, arg6, var11, var13);
            class80.method554(var15, 121, arg3, arg2, var11);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static void method1810(byte arg0) {
        field4020 = null;
        field4017 = null;
        if (arg0 == 112) {
            field4024 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)Lag;")
    public final class180 method1811(byte arg0) {
        field4016++;
        if (this.field4019 > 0 && this.field4013.field6267[this.field4019 - 1] != this.field4015) {
            class180 var2 = this.field4015;
            this.field4015 = var2.field2610;
            return var2;
        } else if (arg0 < 62) {
            return null;
        } else {
            while (this.field4019 < this.field4013.field6268) {
                class180 var3 = this.field4013.field6267[this.field4019++].field2610;
                if (this.field4013.field6267[this.field4019 - 1] != var3) {
                    this.field4015 = var3.field2610;
                    return var3;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ltq;IZ)Lnp;")
    public static final class146 method1812(class478 arg0, int arg1, boolean arg2) {
        field4018++;
        if (arg2) {
            field4023 = 30;
        }
        class146 var3;
        if (class117.field1637 == null) {
            var3 = new class146();
        } else {
            var3 = class117.field1637;
            class117.field1637 = class117.field1637.field2066;
            class444.field6120--;
            var3.field2066 = null;
        }
        var3.field2065 = arg1;
        var3.field2062 = arg0;
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lsq;)V")
    public class293(class454 arg0) {
        this.field4013 = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)Lag;")
    public final class180 method1813(int arg0) {
        field4022++;
        if (arg0 != 24004) {
            field4017 = null;
        }
        this.field4019 = 0;
        return this.method1811((byte) 89);
    }
}
