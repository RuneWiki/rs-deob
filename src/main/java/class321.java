import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class321 {

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Lpm;")
    public static class349 field4700 = new class349("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!j", name = "j", descriptor = "[I")
    public static int[] field4702 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public int field4693;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public int field4694;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public int field4695;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public int field4698;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Lbk;")
    public static class211 field4701;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(JB)V")
    public static final void method2130(long arg0, byte arg1) {
        field4699++;
        int var3 = class446.field6379 + class181.field2555.field4463;
        int var4 = class390.field5492 + class181.field2555.field4466;
        if ((class323.field4712 - var3) < -500 || (class323.field4712 - var3) > 500 || (class431.field6168 - var4) < -500 || class431.field6168 - var4 > 500) {
            class323.field4712 = var3;
            class431.field6168 = var4;
        }
        if (class323.field4712 != var3) {
            int var5 = var3 - class323.field4712;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class323.field4712 += var6;
        }
        if (arg1 != -50) {
            return;
        }
        if (class431.field6168 != var4) {
            int var7 = var4 - class431.field6168;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class431.field6168 += var8;
        }
        if (!class24.field304) {
            class358.field5176 += (float) arg0 * class353.field5128 / 6.0F;
            class241.field3553 += (float) arg0 * class198.field2835 / 6.0F;
        }
        class190.method1365(arg1 ^ 0xFFFFFFCE);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method2131(int arg0) {
        field4701 = null;
        field4702 = null;
        field4700 = null;
        if (arg0 != -30016) {
            method2132(-86, (byte) -12);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)Lnb;")
    public static final class165 method2132(int arg0, byte arg1) {
        field4697++;
        if (arg1 <= 98) {
            return null;
        }
        class165 var2 = (class165) class262.field3867.method99(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class115.field1486.method643(35, arg0, true);
        class165 var4 = new class165();
        if (var3 != null) {
            var4.method1193(new class130(var3), -51);
        }
        var4.method1194(-124);
        class262.field3867.method90(var4, (long) arg0, 0);
        return var4;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public static final void method2133(int arg0) {
        if (arg0 >= -109) {
            field4700 = null;
        }
        field4696++;
        class15 var1 = class197.field2819;
        synchronized (class197.field2819) {
            class197.field2819.method102((byte) -95);
        }
    }
}
