import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class class241 {

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "[I")
    public static int[] field4321 = new int[500];

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Ljd;")
    public static class86 field4324 = class122.method868("Starte 3D)2Softwarebibliothek)3", true);

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "Ljd;")
    private static class86 field4329 = class122.method868("Loading textures )2 ", true);

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "Ljd;")
    public static class86 field4327 = field4329;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "[S")
    public static short[] field4331 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "[Ljd;")
    public static class86[] field4328 = new class86[8];

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "Lbj;")
    public static class151 field4333;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "[[[B")
    public static byte[][][] field4332;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZB)V")
    public static final void method1651(boolean arg0, byte arg1) {
        int var2 = -63 % ((-arg1 - 74) / 48);
        class49.method380(class248.field4414, 110, arg0, class4.field53, class178.field3225);
        field4325++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILte;)Lte;")
    public abstract class76 method1365(int arg0, class76 arg1);

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static final void method1652(int arg0) {
        boolean var1 = false;
        if (arg0 != -13588) {
            method1652(-121);
        }
        field4323++;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class16.field463 - 1; var2++) {
                if (class273.field4784[var2] < 1000 && class273.field4784[var2 + 1] > 1000) {
                    var1 = false;
                    class86 var3 = class188.field3332[var2];
                    class188.field3332[var2] = class188.field3332[var2 + 1];
                    class188.field3332[var2 + 1] = var3;
                    class86 var4 = class46.field1022[var2];
                    class46.field1022[var2] = class46.field1022[var2 + 1];
                    class46.field1022[var2 + 1] = var4;
                    int var5 = field4321[var2];
                    field4321[var2] = field4321[var2 + 1];
                    field4321[var2 + 1] = var5;
                    int var6 = class137.field2612[var2];
                    class137.field2612[var2] = class137.field2612[var2 + 1];
                    class137.field2612[var2 + 1] = var6;
                    short var7 = class273.field4784[var2];
                    class273.field4784[var2] = class273.field4784[var2 + 1];
                    class273.field4784[var2 + 1] = var7;
                    long var8 = class68.field1333[var2];
                    class68.field1333[var2] = class68.field1333[var2 + 1];
                    class68.field1333[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "([BIII)I")
    public static final int method1653(byte[] arg0, int arg1, int arg2, int arg3) {
        field4326++;
        int var4 = -1;
        if (arg1 >= -10) {
            return -110;
        } else {
            for (int var5 = arg3; var5 < arg2; var5++) {
                var4 = var4 >>> 8 ^ class171.field3146[(arg0[var5] ^ var4) & 0xFF];
            }
            return ~var4;
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
    public static void method1654(int arg0) {
        field4327 = null;
        field4328 = null;
        field4321 = null;
        field4331 = null;
        field4333 = null;
        field4332 = null;
        field4324 = null;
        if (arg0 != -640041400) {
            field4333 = null;
        }
        field4329 = null;
    }
}
