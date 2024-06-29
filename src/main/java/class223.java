import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class223 {

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Ldf;")
    private static class51 field3928 = class46.method233("Sat", 100);

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Ldf;")
    private static class51 field3926 = class46.method233("Thu", 100);

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "Ldf;")
    private static class51 field3930 = class46.method233("Mon", 100);

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Ldf;")
    private static class51 field3931 = class46.method233("Sun", 100);

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Ldf;")
    private static class51 field3929 = class46.method233("Fri", 100);

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Ldf;")
    public static class51 field3927 = class46.method233("Starte 3D)2Softwarebibliothek)3", 100);

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "Ldf;")
    private static class51 field3932 = class46.method233("Tue", 100);

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "Ldf;")
    private static class51 field3936 = class46.method233("Wed", 100);

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "[Ldf;")
    public static class51[] field3925 = new class51[] { field3931, field3930, field3932, field3936, field3926, field3929, field3928 };

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "Ljf;")
    public static class60 field3935 = new class60();

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "Lhc;")
    public static class212 field3938 = new class212(16);

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "Lja;")
    public static class55 field3933;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static final void method1540(int arg0) {
        field3937++;
        for (int var1 = 0; var1 < 5; var1++) {
            class64.field1049[var1] = false;
        }
        int var2 = 56 % ((arg0 - 50) / 37);
        class48.field759 = -1;
        class188.field3143 = -1;
        class201.field3361 = 1;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)V")
    public static final void method1541(boolean arg0, int arg1) {
        field3934++;
        byte var2 = 4;
        byte[][] var3 = class105.field1732;
        int var4 = var3.length;
        if (arg1 != 16335) {
            method1543(-76, -5);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class101.field1681[var5] >> 8) * 64 - class11.field160;
            int var12 = (class101.field1681[var5] & 0xFF) * 64 - class241.field4179;
            byte[] var13 = var3[var5];
            if (var13 != null) {
                class190.method1361(arg1 ^ 0x3F02);
                class76.method548(var12, var13, (class147.field2470 - 6) * 8, class159.field2605, (byte) 10, arg0, var11, class70.field1129 * 8 - 48);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class101.field1681[var6] >> 8) * 64 - class11.field160;
            int var8 = (class101.field1681[var6] & 0xFF) * 64 - class241.field4179;
            byte[] var9 = var3[var6];
            if (var9 == null && class70.field1129 < 800) {
                class190.method1361(205);
                for (int var10 = 0; var10 < var2; var10++) {
                    class5.method21(var8, var7, (byte) -83, 64, 64, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static void method1542(int arg0) {
        field3928 = null;
        field3935 = null;
        field3927 = null;
        field3938 = null;
        field3931 = null;
        field3936 = null;
        field3926 = null;
        field3932 = null;
        field3925 = null;
        if (arg0 == -801) {
            field3933 = null;
            field3929 = null;
            field3930 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
    public static final void method1543(int arg0, int arg1) {
        field3924++;
        if (arg0 == -1 || !class246.field4274[arg0]) {
            return;
        }
        class222.field3865.method829(-21463, arg0);
        if (class10.field106[arg0] == null) {
            return;
        }
        boolean var2 = true;
        if (arg1 != 28842) {
            return;
        }
        for (int var3 = 0; var3 < class10.field106[arg0].length; var3++) {
            if (class10.field106[arg0][var3] != null) {
                if (class10.field106[arg0][var3].field3623 == 2) {
                    var2 = false;
                } else {
                    class10.field106[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class10.field106[arg0] = null;
        }
        class246.field4274[arg0] = false;
    }
}
