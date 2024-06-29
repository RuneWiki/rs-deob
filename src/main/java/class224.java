import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class224 {

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "[Lpm;")
    private class501[] field3245;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    private int field3240;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "[I")
    public static int[] field3244 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "Lh;")
    public static class572 field3239 = new class572("Loaded JACLIB", "JACLIB geladen", "JACLIB chargé", "JACLIB carregado");

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "J")
    private long field3237;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "Lpm;")
    private class501 field3234;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "Lha;")
    public static class53 field3246;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static void method1442(byte arg0) {
        field3239 = null;
        field3246 = null;
        field3244 = null;
        if (arg0 >= -28) {
            method1442((byte) 24);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZJ)Lpm;")
    public final class501 method1443(boolean arg0, long arg1) {
        field3235++;
        this.field3237 = arg1;
        class501 var4 = this.field3245[(int) (arg1 & (long) (this.field3240 - 1))];
        for (this.field3234 = var4.field7110; this.field3234 != var4; this.field3234 = this.field3234.field7110) {
            if (this.field3234.field7109 == arg1) {
                class501 var5 = this.field3234;
                this.field3234 = this.field3234.field7110;
                return var5;
            }
        }
        this.field3234 = null;
        if (arg0) {
            this.field3240 = -107;
        }
        return null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lpm;BJ)V")
    public final void method1444(class501 arg0, byte arg1, long arg2) {
        if (arg0.field7112 != null) {
            arg0.method2987(-1);
        }
        field3238++;
        class501 var5 = this.field3245[(int) ((long) (this.field3240 - 1) & arg2)];
        arg0.field7110 = var5;
        arg0.field7112 = var5.field7112;
        arg0.field7112.field7110 = arg0;
        arg0.field7110.field7112 = arg0;
        if (arg1 > -51) {
            method1442((byte) -113);
        }
        arg0.field7109 = arg2;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIBII)V")
    public static final void method1445(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class533.field7942; var5++) {
            Rectangle var6 = class621.field9154[var5];
            if (arg0 < var6.x + var6.width && (arg0 + arg1) > var6.x && arg4 < var6.y + var6.height && arg3 + arg4 > var6.y) {
                class243.field3474[var5] = true;
            }
        }
        if (arg2 != -31) {
            method1445(48, 119, (byte) -120, -97, -113);
        }
        field3236++;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)Lpm;")
    public final class501 method1446(int arg0) {
        field3241++;
        if (this.field3234 == null) {
            return null;
        } else if (arg0 <= 34) {
            return null;
        } else {
            class501 var2 = this.field3245[(int) ((long) (this.field3240 - 1) & this.field3237)];
            while (this.field3234 != var2) {
                if (this.field3234.field7109 == this.field3237) {
                    class501 var3 = this.field3234;
                    this.field3234 = this.field3234.field7110;
                    return var3;
                }
                this.field3234 = this.field3234.field7110;
            }
            this.field3234 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(I)V")
    public class224(int arg0) {
        this.field3245 = new class501[arg0];
        this.field3240 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class501 var3 = this.field3245[var2] = new class501();
            var3.field7110 = var3;
            var3.field7112 = var3;
        }
    }
}
