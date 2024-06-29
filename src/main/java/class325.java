import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class325 {

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "Ler;")
    public static class157 field4993 = new class157(64);

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "Lpg;")
    public static class492 field4995 = new class492(53, -2);

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "Ljj;")
    public static class177 field4996;

    static {
        new class375("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V", line = 9)
    public static void method2105(int arg0) {
        field4993 = null;
        if (arg0 < -98) {
            field4995 = null;
            field4996 = null;
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V", line = 23)
    public static final void method2106(int arg0) {
        field4994++;
        if (class479.field7007 == -1 || class11.field184 == -1) {
            return;
        }
        int var1 = ((class483.field7032 - class194.field2766) * class21.field331 >> 16) + class194.field2766;
        class21.field331 += var1;
        if (class21.field331 < 65535) {
            class249.field3464 = false;
            class412.field6196 = false;
        } else {
            class21.field331 = 65535;
            if (class249.field3464) {
                class412.field6196 = false;
            } else {
                class412.field6196 = true;
            }
            class249.field3464 = true;
        }
        float var2 = (float) class21.field331 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class87.field1195 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class336.field5230[class479.field7007][var4][var5] * 3;
            int var22 = class336.field5230[class479.field7007][var4 + 1][var5] * 3;
            int var23 = (class336.field5230[class479.field7007][var4 + 2][var5] - (class336.field5230[class479.field7007][var4 + 3][var5] - class336.field5230[class479.field7007][var4 + 2][var5])) * 3;
            int var24 = class336.field5230[class479.field7007][var4][var5];
            int var25 = var22 - var21;
            int var26 = var23 + var21 - (var22 * 2);
            int var27 = class336.field5230[class479.field7007][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class301.field4447 = (int) var3[2] - (class437.field6477 * 128);
        class154.field2246 = (int) var3[1] * -1;
        class34.field539 = (int) var3[0] - (class82.field1105 * 128);
        float[] var6 = new float[3];
        int var7 = class85.field1166 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class336.field5230[class11.field184][var7][var8] * 3;
            int var15 = class336.field5230[class11.field184][var7 + 1][var8] * 3;
            int var16 = (class336.field5230[class11.field184][var7 + 2][var8] + class336.field5230[class11.field184][var7 + 2][var8] - class336.field5230[class11.field184][var7 + 3][var8]) * 3;
            int var17 = class336.field5230[class11.field184][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class336.field5230[class11.field184][var7 + 2][var8] - var17 - (-var15 + var16);
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        if (arg0 > -39) {
            field4996 = null;
        }
        class353.field5478 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class30.field461 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class522.field7715 = ((class336.field5230[class479.field7007][var4 + 2][3] - class336.field5230[class479.field7007][var4][3]) * class21.field331 >> 16) + class336.field5230[class479.field7007][var4][3];
    }
}
