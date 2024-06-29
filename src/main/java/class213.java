import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class213 extends class29 {

    @OriginalMember(owner = "client!np", name = "H", descriptor = "I")
    private int field3000;

    @OriginalMember(owner = "client!np", name = "C", descriptor = "Lvq;")
    public static class24 field2996 = new class24(54, -1);

    @OriginalMember(owner = "client!np", name = "J", descriptor = "Ljn;")
    public static class409 field3002 = new class409("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!np", name = "N", descriptor = "Ljn;")
    public static class409 field3006 = new class409("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!np", name = "Q", descriptor = "Lbn;")
    public static class160 field3009 = new class160(42, 2);

    @OriginalMember(owner = "client!np", name = "R", descriptor = "I")
    public static int field3010 = 2;

    @OriginalMember(owner = "client!np", name = "D", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!np", name = "E", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!np", name = "F", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!np", name = "K", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!np", name = "L", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!np", name = "P", descriptor = "Lct;")
    public static class104 field3008;

    @OriginalMember(owner = "client!np", name = "M", descriptor = "[Lvb;")
    public class94[] field3005;

    @OriginalMember(owner = "client!np", name = "O", descriptor = "[S")
    public static short[] field3007;

    @OriginalMember(owner = "client!np", name = "I", descriptor = "[[B")
    private byte[][] field3001;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(II)Z", line = 4)
    public final boolean method1458(int arg0, int arg1) {
        if (arg1 <= 48) {
            return true;
        } else {
            field2997++;
            return this.field3005[arg0].field1175;
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(Z)V", line = 15)
    public static final void method1459(boolean arg0) {
        field3003++;
        if (class244.field3612 == -1 || class447.field6538 == -1) {
            return;
        }
        int var1 = class234.field3514 + ((class3.field46 - class234.field3514) * class167.field2204 >> 16);
        class167.field2204 += var1;
        if (class167.field2204 < 65535) {
            class305.field4504 = false;
            class339.field5005 = false;
        } else {
            class167.field2204 = 65535;
            if (class305.field4504) {
                class339.field5005 = false;
            } else {
                class339.field5005 = true;
            }
            class305.field4504 = true;
        }
        float var2 = (float) class167.field2204 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class265.field3930 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class118.field1592[class244.field3612][var4][var5] * 3;
            int var22 = class118.field1592[class244.field3612][var4 + 1][var5] * 3;
            int var23 = (class118.field1592[class244.field3612][var4 + 2][var5] - (class118.field1592[class244.field3612][var4 + 3][var5] - class118.field1592[class244.field3612][var4 + 2][var5])) * 3;
            int var24 = class118.field1592[class244.field3612][var4][var5];
            int var25 = var22 - var21;
            int var26 = var23 + var21 - (var22 * 2);
            int var27 = var22 + class118.field1592[class244.field3612][var4 + 2][var5] - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class345.field5077 = (int) var3[2] - (class134.field1846 * 128);
        class164.field2171 = (int) var3[1] * -1;
        class298.field4343 = (int) var3[0] - (class28.field399 * 128);
        float[] var6 = new float[3];
        int var7 = class244.field3618 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class118.field1592[class447.field6538][var7][var8] * 3;
            int var15 = class118.field1592[class447.field6538][var7 + 1][var8] * 3;
            int var16 = (class118.field1592[class447.field6538][var7 + 2][var8] - (class118.field1592[class447.field6538][var7 + 3][var8] - class118.field1592[class447.field6538][var7 + 2][var8])) * 3;
            int var17 = class118.field1592[class447.field6538][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class118.field1592[class447.field6538][var7 + 2][var8] + var15 - var16 - var17;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        if (arg0) {
            method1459(false);
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class103.field1341 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class136.field1867 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class86.field1067 = ((class118.field1592[class244.field3612][var4 + 2][3] - class118.field1592[class244.field3612][var4][3]) * class167.field2204 >> 16) + class118.field1592[class244.field3612][var4][3];
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(B)V", line = 122)
    public static void method1460(byte arg0) {
        field3008 = null;
        field3007 = null;
        field3006 = null;
        field3002 = null;
        if (arg0 >= -21) {
            field3008 = null;
        }
        field3009 = null;
        field2996 = null;
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(II)Z", line = 140)
    public final boolean method1461(int arg0, int arg1) {
        field2998++;
        if (arg0 != 3) {
            method1462((class223) null, 117);
        }
        return this.field3005[arg1].field1169;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lkg;I)V", line = 153)
    public static final void method1462(class223 arg0, int arg1) {
        field2999++;
        if (class241.field3570 == arg0.field3357) {
            if (class187.field2619.field5587 == null) {
                arg0.field3239 = 0;
                arg0.field3343 = 0;
            } else {
                arg0.field3204 = 150;
                arg0.field3213 = (int) (Math.sin((double) class388.field5665 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field3337 = 5;
                arg0.field3343 = class420.field6085;
                arg0.field3239 = class92.method628(0, class187.field2619.field5587);
                arg0.field3289 = class187.field2619.field723;
                arg0.field3242 = class187.field2619.field706;
                arg0.field3344 = class187.field2619.field772;
                arg0.field3287 = 0;
            }
        } else if (arg1 != 5) {
            method1462((class223) null, 92);
        }
    }

    @OriginalMember(owner = "client!np", name = "d", descriptor = "(B)Z", line = 188)
    public final boolean method1463(byte arg0) {
        field3004++;
        if (this.field3005 != null) {
            return true;
        }
        if (this.field3001 == null) {
            if (!class230.field3442.method706(this.field3000, (byte) -121)) {
                return false;
            }
            int[] var2 = class230.field3442.method710(this.field3000, (byte) -34);
            this.field3001 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field3001[var3] = class230.field3442.method715(var2[var3], (byte) 67, this.field3000);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field3001.length; var5++) {
            byte[] var15 = this.field3001[var5];
            int var16 = var15[1] & 0xFF | var15[0] & 0xFF << 8;
            var4 &= class161.field2150.method708(var16, (byte) -116);
        }
        if (!var4) {
            return false;
        }
        class395 var6 = new class395();
        int var7 = 88 % ((59 - arg0) / 62);
        int var8 = class230.field3442.method734(65, this.field3000);
        this.field3005 = new class94[var8];
        int[] var9 = class230.field3442.method710(this.field3000, (byte) -105);
        for (int var10 = 0; var10 < var9.length; var10++) {
            byte[] var11 = this.field3001[var10];
            int var12 = (var11[0] & 0xFF) << 8 | var11[1] & 0xFF;
            class307 var13 = null;
            for (class307 var14 = (class307) var6.method2478(1603); var14 != null; var14 = (class307) var6.method2486((byte) -82)) {
                if (var14.field4528 == var12) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == null) {
                var13 = new class307(var12, class161.field2150.method733(0, var12));
                var6.method2484(0, var13);
            }
            this.field3005[var9[var10]] = new class94(var11, var13);
        }
        this.field3001 = null;
        return true;
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(I)V", line = 295)
    public class213(int arg0) {
        this.field3000 = arg0;
    }
}
