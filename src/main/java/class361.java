import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class361 {

    @OriginalMember(owner = "client!po", name = "c", descriptor = "Lus;")
    public static class1 field5192 = new class1(72, 3);

    @OriginalMember(owner = "client!po", name = "g", descriptor = "Lef;")
    public static class311 field5196 = new class311(13, 17);

    @OriginalMember(owner = "client!po", name = "h", descriptor = "Ldk;")
    public static class326 field5197 = new class326("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IJ)V")
    public static final void method2230(int arg0, long arg1) {
        field5191++;
        int var3 = class453.field6393;
        if (arg0 != -66) {
            method2232(false);
        }
        int var4 = class317.field4596;
        if (class353.field5098 != var3) {
            int var5 = var3 - class353.field5098;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class353.field5098 += var6;
        }
        if (!class314.field4438.field5782) {
            class483.field6806 += (float) arg1 * class342.field4991 / 40.0F * 8.0F;
            class157.field2346 += (float) arg1 * class111.field1413 / 40.0F * 8.0F;
        }
        if (class480.field6734 != var4) {
            int var7 = var4 - class480.field6734;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class480.field6734 += var8;
        }
        class153.method963((byte) 91);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II)V")
    public static final void method2231(int arg0, int arg1) {
        if (arg1 != -23955) {
            field5196 = null;
        }
        class100.field1286 = arg0;
        field5194++;
        class360.field5179.method1478((byte) -111);
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V")
    public static final void method2232(boolean arg0) {
        class15.method110(class111.field1414, -126);
        field5190++;
        class26.field326++;
        class225.field3415.method1753(true, class262.method1624(16822));
        class225.field3415.method1711(arg0, class144.field1900);
        class225.field3415.method1711(false, class244.field3634);
        class225.field3415.method1753(true, class314.field4438.field5778);
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(Z)V")
    public static void method2233(boolean arg0) {
        field5197 = null;
        field5192 = null;
        field5196 = null;
        if (!arg0) {
            field5196 = null;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BIIII)V")
    public static final void method2234(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class168.field2449 = arg1;
        class345.field5011 = arg3;
        class485.field6827 = arg2;
        if (arg0 >= -120) {
            field5197 = null;
        }
        field5193++;
        class94.field1209 = arg4;
    }
}
