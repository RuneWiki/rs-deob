import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class434 {

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Ldk;")
    public static class326 field6055 = new class326("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Ldk;")
    public static class326 field6056 = new class326("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field6051;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static final void method2563(int arg0) {
        class337.field4900 = null;
        field6052++;
        if (arg0 != -1412584499) {
            method2564(-110);
        }
        class342.method2153((byte) 29, 0, 0, 0, -1, class144.field1900, 0, class36.field472, class244.field3634);
        if (class337.field4900 != null) {
            class347.method2172(-1412584499, class29.field396.field1977, 0, arg0 ^ 0xABCDABCD, class269.field3925, class144.field1900, class337.field4900, 0, class94.field1217, class244.field3634);
            class337.field4900 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
    public static final void method2564(int arg0) {
        field6051++;
        if (class161.field2380 == -1 || class203.field3017 == -1) {
            return;
        }
        int var1 = ((class353.field5101 - class342.field4989) * class178.field2554 >> 16) + class342.field4989;
        class178.field2554 += var1;
        if (class178.field2554 >= 65535) {
            class178.field2554 = 65535;
            if (class149.field2235) {
                class481.field6775 = false;
            } else {
                class481.field6775 = true;
            }
            class149.field2235 = true;
        } else {
            class149.field2235 = false;
            class481.field6775 = false;
        }
        float var2 = (float) class178.field2554 / 65535.0F;
        float[] var3 = new float[arg0];
        int var4 = class44.field641 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class244.field3631[class161.field2380][var4][var5] * 3;
            int var22 = class244.field3631[class161.field2380][var4 + 1][var5] * 3;
            int var23 = (class244.field3631[class161.field2380][var4 + 2][var5] + class244.field3631[class161.field2380][var4 + 2][var5] - class244.field3631[class161.field2380][var4 + 3][var5]) * 3;
            int var24 = class244.field3631[class161.field2380][var4][var5];
            int var25 = var22 - var21;
            int var26 = var23 + var21 - (var22 * 2);
            int var27 = class244.field3631[class161.field2380][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class343.field4996 = (int) var3[2] - (class360.field5180 * 128);
        class490.field6904 = (int) var3[0] - (class240.field3602 * 128);
        class134.field1778 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        int var7 = class28.field379 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class244.field3631[class203.field3017][var7][var8] * 3;
            int var15 = class244.field3631[class203.field3017][var7 + 1][var8] * 3;
            int var16 = (class244.field3631[class203.field3017][var7 + 2][var8] + class244.field3631[class203.field3017][var7 + 2][var8] - class244.field3631[class203.field3017][var7 + 3][var8]) * 3;
            int var17 = class244.field3631[class203.field3017][var7][var8];
            int var18 = var15 - var14;
            int var19 = var16 + var14 - (var15 * 2);
            int var20 = class244.field3631[class203.field3017][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class214.field3219 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class30.field407 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class140.field1861 = class244.field3631[class161.field2380][var4][3] + ((class244.field3631[class161.field2380][var4 + 2][3] - class244.field3631[class161.field2380][var4][3]) * class178.field2554 >> 16);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static void method2565(byte arg0) {
        if (arg0 >= 7) {
            field6055 = null;
            field6056 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
    public static final void method2566(boolean arg0) {
        if (arg0) {
            class330.field4786 = class311.field4394;
            class53.field725 = class28.field388;
        } else {
            class330.field4786 = class169.field2475;
            class53.field725 = class178.field2556;
        }
        class314.field4441 = class330.field4786.length;
    }
}
