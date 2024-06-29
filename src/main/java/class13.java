import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class class13 extends class15 {

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "Z")
    public volatile boolean field176 = true;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "Lce;")
    private static class126 field168 = class206.method1445(-7923, "Attack");

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "Lce;")
    public static class126 field179 = class206.method1445(-7923, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "Lce;")
    public static class126 field175 = field168;

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "Z")
    public static boolean field172 = true;

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "[Luj;")
    public static class157[] field180 = new class157[28];

    @OriginalMember(owner = "client!nc", name = "bb", descriptor = "Z")
    public static boolean field184 = false;

    @OriginalMember(owner = "client!nc", name = "Z", descriptor = "Lce;")
    public static class126 field182 = class206.method1445(-7923, "Interfaces charg-Bes");

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "Lcc;")
    public static class313 field178;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "Z")
    public boolean field170;

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "Z")
    public boolean field177;

    @OriginalMember(owner = "client!nc", name = "ab", descriptor = "[[[S")
    public static short[][][] field183;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ldb;", line = 19)
    public static final class132 method73(Throwable arg0, String arg1) {
        field181++;
        class132 var2;
        if ((arg0 instanceof class132)) {
            var2 = (class132) arg0;
            var2.field2269 = var2.field2269 + ' ' + arg1;
        } else {
            var2 = new class132(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(B)V", line = 38)
    public static void method74(byte arg0) {
        if (arg0 < 42) {
            return;
        }
        field178 = null;
        field168 = null;
        field182 = null;
        field179 = null;
        field180 = null;
        field175 = null;
        field183 = (short[][][]) null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)Z", line = 59)
    public static final boolean method75(int arg0, byte arg1) {
        field171++;
        if (arg1 >= -17) {
            return true;
        } else if (class136.field2363[arg0]) {
            return true;
        } else if (class127.field2196.method2180(1, arg0)) {
            int var2 = class127.field2196.method2165(0, arg0);
            if (var2 == 0) {
                class136.field2363[arg0] = true;
                return true;
            }
            if (class291.field4825[arg0] == null) {
                class291.field4825[arg0] = new class112[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class291.field4825[arg0][var3] == null) {
                    byte[] var4 = class127.field2196.method2173(arg0, var3, (byte) -81);
                    if (var4 != null) {
                        class112 var5 = class291.field4825[arg0][var3] = new class112();
                        var5.field1833 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method741(-125, new class134(var4));
                        } else {
                            var5.method746(new class134(var4), 1);
                        }
                    }
                }
            }
            class136.field2363[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILce;Lce;B)V", line = 114)
    public static final void method76(int arg0, class126 arg1, class126 arg2, byte arg3) {
        class132.field2270 = arg0;
        class224.field3784 = arg1;
        class224.field3789 = arg2;
        if (arg3 != -119) {
            return;
        }
        field174++;
        if (class224.field3784.method872(class224.field3772, 0) || class224.field3789.method872(class224.field3772, 0)) {
            class289.field4792 = 3;
        } else if (class91.field1422 == -1) {
            class200.field3415 = 0;
            class289.field4792 = -3;
            class45.field703 = 0;
            class232.field3900 = 1;
            class134 var4 = new class134(128);
            var4.method933(arg3 ^ 0x74, 10);
            var4.method959(arg3 ^ 0x2E, (int) (Math.random() * 99999.0D));
            var4.method959(96, 527);
            var4.method962(-117, class224.field3784.method845((byte) -120));
            var4.method947((int) (Math.random() * 9.9999999E7D), (byte) 113);
            var4.method980(class224.field3789, true);
            var4.method947((int) (Math.random() * 9.9999999E7D), (byte) 125);
            var4.method946(class195.field3323, class187.field3231, (byte) 120);
            class103.field1645.field2299 = 0;
            class103.field1645.method933(-3, 164);
            class103.field1645.method933(-3, var4.field2299);
            class103.field1645.method924((byte) 112, 0, var4.field2299, var4.field2282);
        } else {
            class8.method46(true);
        }
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(B)Lvj;", line = 205)
    public static final class184 method79(byte arg0) {
        field173++;
        int var1 = class279.field4643[0] * class263.field4389[0];
        byte[] var2 = class190.field3255[0];
        class184 var5;
        if (class31.field434[0]) {
            byte[] var6 = class303.field5044[0];
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class221.method1516(class47.method289(var6[var8], 255) << 24, class241.field4062[class47.method289(var2[var8], 255)]);
            }
            var5 = new class311(class307.field5187, class290.field4802, class27.field386[0], class63.field1032[0], class279.field4643[0], class263.field4389[0], var7);
        } else {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; var4++) {
                var3[var4] = class241.field4062[class47.method289(255, var2[var4])];
            }
            var5 = new class184(class307.field5187, class290.field4802, class27.field386[0], class63.field1032[0], class279.field4643[0], class263.field4389[0], var3);
        }
        if (arg0 < 16) {
            return (class184) null;
        } else {
            class197.method1395((byte) 127);
            return var5;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)[B")
    public abstract byte[] method77(int arg0);

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)I")
    public abstract int method78(int arg0);
}
