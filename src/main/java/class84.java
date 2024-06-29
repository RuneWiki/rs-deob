import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class84 {

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Lud;")
    public static class279 field1596 = class130.method1024("::", 255);

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "Lud;")
    public static class279 field1598 = class130.method1024("m", 255);

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Lud;")
    public static class279 field1594 = class130.method1024("Gestionnaire de saisie charg-B", 255);

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field1601 = 0;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "Lhc;")
    public static class171 field1591 = new class171(260);

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "[B")
    public static byte[] field1603;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "Z")
    public static boolean field1592;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "[S")
    public static short[] field1602;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "([FI)[F", line = 7)
    public static final float[] method726(float[] arg0, int arg1) {
        field1597++;
        if (arg0 == null) {
            return null;
        } else if (arg1 >= -120) {
            return (float[]) null;
        } else {
            float[] var2 = new float[arg0.length];
            class25.method224(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 28)
    public static final void method727(int arg0) {
        field1590++;
        for (int var1 = 0; var1 < 5; var1++) {
            class13.field406[var1] = false;
        }
        class318.field5583 = -1;
        class122.field2191 = 1;
        class171.field3094 = 0;
        if (arg0 < 7) {
            field1592 = true;
        }
        class184.field3364 = 0;
        class8.field338 = -1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V", line = 52)
    public static void method728(boolean arg0) {
        field1598 = null;
        field1591 = null;
        field1603 = null;
        field1594 = null;
        field1602 = null;
        field1596 = null;
        if (!arg0) {
            field1591 = (class171) null;
        }
    }

    static {
        int var0 = 0;
        field1603 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1603[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lok;ILok;)V", line = 83)
    public static final void method729(class149 arg0, int arg1, class149 arg2) {
        class222.field3932 = arg2;
        class130.field2387 = arg0;
        field1600++;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        if (arg1 != 18542) {
            method728(true);
        }
        class222.field3932.method1174(34, -17680);
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 41.0D) - 20;
        class230.field4008 = var4 + var6;
        class140.field2553 = var3 + var6;
        class209.field3677 = var5 + var6;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lvh;I)Ltm;", line = 109)
    public static final class71 method730(class53 arg0, int arg1) {
        field1599++;
        arg0.method483(-111);
        int var2 = arg0.method483(-122);
        class71 var3 = class243.method1744(var2, arg1 ^ 0xFFFFFFAC);
        var3.field1391 = arg0.method483(-121);
        int var4 = arg0.method483(-127);
        for (int var5 = arg1; var5 < var4; var5++) {
            int var6 = arg0.method483(-115);
            var3.method77(var6, true, arg0);
        }
        var3.method627(7);
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)Lbn;", line = 159)
    public static final class66 method731(int arg0) {
        field1593++;
        int var1 = class115.field2097[0] * class1.field92[0];
        byte[] var2 = class113.field2080[0];
        if (arg0 <= 66) {
            method726((float[]) null, 124);
        }
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class217.field3839[class52.method442(var2[var4], 255)];
        }
        class66 var5 = new class66(class86.field1646, class111.field2045, class44.field915[0], class216.field3811[0], class1.field92[0], class115.field2097[0], var3);
        class162.method1278(false);
        return var5;
    }
}
