import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class24 extends class17 {

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lki;")
    public static class498 field254 = new class498(58, -1);

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Llt;")
    public static class475 field256 = new class475("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!o", name = "l", descriptor = "[I")
    public static int[] field261 = new int[14];

    @OriginalMember(owner = "client!o", name = "m", descriptor = "F")
    public static float field262 = 1024.0F;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "[B")
    public static byte[] field260 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V", line = 6)
    public static final void method152(int arg0, int arg1) {
        field253++;
        if (!class525.method3102(arg1, -1)) {
            return;
        }
        int var2 = -92 / ((-arg0 - 38) / 47);
        class38[] var3 = class185.field2754[arg1];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class38 var5 = var3[var4];
            if (var5 != null) {
                var5.field455 = 0;
                var5.field522 = 0;
                var5.field443 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V", line = 39)
    public static void method153(byte arg0) {
        field261 = null;
        field254 = null;
        if (arg0 >= -98) {
            method154(-102, -49, false);
        }
        field256 = null;
        field260 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIZ)Z", line = 60)
    public static final boolean method154(int arg0, int arg1, boolean arg2) {
        field255++;
        if (arg2) {
            return class163.method1131(arg1, arg0, false) || class508.method3010((byte) 82, arg1, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ltd;I[[B)V", line = 71)
    public static final void method155(class314 arg0, int arg1, byte[][] arg2) {
        field257++;
        if (arg1 != -1811030303) {
            field261 = null;
        }
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg0.field3597; var4++) {
            class110.method675(arg1 ^ 0x940D9592);
            for (int var5 = 0; var5 < class30.field323 >> 3; var5++) {
                for (int var6 = 0; var6 < class182.field2661 >> 3; var6++) {
                    boolean var7 = false;
                    int var8 = class168.field2493[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg0.field3583 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = (var8 & 0xFFE79D) >> 14;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class331.field4689.length; var14++) {
                                if (class331.field4689[var14] == var13 && arg2[var14] != null) {
                                    class209 var15 = new class209(arg2[var14]);
                                    arg0.method1638(var12, false, var9, var15, class434.field6500, var10, var4, var11, var5 * 8, var6 * 8);
                                    var7 = true;
                                    arg0.method1959(var15, var5 * 8, var11, var4, true, var3[0] == -1 ? var3 : null, var10, class348.field5015, var6 * 8, var9, var12);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        arg0.method1632(var4, var5 * 8, 8, var6 * 8, (byte) -21, 8);
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class323.field4623 = class77.field1154.method2335(var3[3], class515.field7515, var3[2], var3[1], var3[0], -99);
            class318.field4562 = var3[4];
        }
    }
}
