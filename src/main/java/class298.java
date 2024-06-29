import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class298 {

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "Lhn;")
    private class509 field3921 = new class509(256);

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "Lur;")
    private class377 field3922;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "Ll;")
    private class16 field3919;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "[I")
    public static int[] field3923 = new int[250];

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "Ljc;")
    public static class305 field3918 = new class305("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "Lje;")
    public static class277 field3924;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V", line = 3)
    public final void method1781(byte arg0) {
        if (arg0 >= -111) {
            this.method1782(-11);
        }
        field3920++;
        this.field3921.method3045(48);
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lur;Ll;)V", line = 89)
    public class298(class377 arg0, class16 arg1) {
        this.field3922 = arg0;
        this.field3919 = arg1;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V", line = 25)
    public final void method1782(int arg0) {
        field3926++;
        this.field3921.method3036(arg0, (byte) -57);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BI)Lkm;", line = 35)
    public final class238 method1783(byte arg0, int arg1) {
        field3925++;
        Object var3 = this.field3921.method3032(3589, (long) arg1);
        if (var3 != null) {
            return (class238) var3;
        } else if (this.field3919.method91(arg1, -1221)) {
            if (arg0 != -113) {
                this.method1782(17);
            }
            class433 var4 = this.field3919.method94(arg1, (byte) -72);
            int var5 = var4.field6302 ? 64 : this.field3922.field5303;
            class238 var7;
            if (var4.field6318 && this.field3922.method1142()) {
                float[] var6 = this.field3919.method93(7474, var5, var5, false, arg1, 0.7F);
                var7 = new class238(this.field3922, 3553, 34842, var5, var5, var4.field6323 != 0, var6, 6408);
            } else {
                short var8;
                int[] var9;
                if (var4.field6311 && class178.method1038(var4.field6320, -28083)) {
                    var8 = 6407;
                    var9 = this.field3919.method90(0.7F, false, false, arg1, var5, var5);
                } else {
                    var9 = this.field3919.method92(2384, var5, var5, arg1, 0.7F, false);
                    var8 = 6408;
                }
                var7 = new class238(this.field3922, 3553, var8, var5, var5, var4.field6323 != 0, var9, false);
            }
            var7.method1499(var4.field6316, 0, var4.field6322);
            this.field3921.method3046((long) arg1, var7, 1);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V", line = 98)
    public static void method1784(boolean arg0) {
        if (arg0) {
            method1784(true);
        }
        field3918 = null;
        field3923 = null;
        field3924 = null;
    }
}
