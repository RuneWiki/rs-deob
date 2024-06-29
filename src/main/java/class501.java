import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class501 {

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    public int field7393;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public int field7389;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "Lnk;")
    public class501 field7385;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "Lia;")
    public class414 field7391;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Lpi;")
    public static class342 field7382 = new class342("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public int field7384;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public int field7386;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public int field7395;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "Leu;")
    public static class332 field7392;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "[Lmp;")
    public static class531[] field7390;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)Lhm;")
    public final class146 method2998(int arg0) {
        field7394++;
        if (arg0 < 53) {
            method2999(-32, -44, 100);
        }
        return class42.method415(-121, this.field7389);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)V")
    public static final void method2999(int arg0, int arg1, int arg2) {
        field7388++;
        if (arg0 >= -74) {
            field7392 = null;
        }
        class20 var3 = new class20(16);
        for (class294 var4 = (class294) class433.field6430.method160((byte) -20); var4 != null; var4 = (class294) class433.field6430.method163(126)) {
            var4.method2090(-1);
            int var5 = (int) (var4.field4904 >> 28);
            int var6 = (int) (var4.field4904 >> 14 & 0x3FFFL) - arg1;
            int var7 = (int) (var4.field4904 & 0x3FFFL) - arg2;
            if (var7 >= 0 && var6 >= 0 && class33.field662 > var7 && class121.field1966 > var6) {
                var3.method166(var4, (long) (var7 | var6 << 14 | var5 << 28), -72);
            }
        }
        class433.field6430 = var3;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZI)Lnk;")
    public final class501 method3000(boolean arg0, int arg1) {
        if (!arg0) {
            method2999(-102, -125, 45);
        }
        field7387++;
        return new class501(this.field7389, arg1);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
    public static void method3001(byte arg0) {
        field7390 = null;
        field7382 = null;
        int var1 = 44 / ((-arg0 - 73) / 39);
        field7392 = null;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(II)V")
    public class501(int arg0, int arg1) {
        this.field7393 = arg1;
        this.field7389 = arg0;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lnk;I)V")
    public class501(class501 arg0, int arg1) {
        this.field7385 = arg0;
        this.field7393 = this.field7385.field7393 + arg1;
        this.field7389 = this.field7385.field7389;
        this.field7391 = this.field7385.field7391;
    }
}
