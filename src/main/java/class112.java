import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class112 {

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "Ljda;")
    public class90 field1360;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "[Loq;")
    public static class230[] field1361;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 11)
    public static final void method812(int arg0) {
        class609.field8594 = new class115[class131.field1691.method1866((byte) 86)][];
        field1364++;
        if (arg0 != -22476) {
            method814(-77, null, 91, 99, -8, 66);
        }
        class558.field7840 = new class115[class131.field1691.method1866((byte) 47)][];
        class689.field9604 = new boolean[class131.field1691.method1866((byte) 38)];
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 25)
    public static void method813(int arg0) {
        field1361 = null;
        if (arg0 != 16776960) {
            field1363 = 1;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILha;IIII)V", line = 38)
    public static final void method814(int arg0, class473 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.method225(arg2, arg3, arg0 + arg2, arg3 - -arg5);
        field1362++;
        arg1.method2822(arg5, arg0, arg2, 1, arg3, -16777216);
        if (class130.field1678 < 100) {
            return;
        }
        float var6 = (float) class46.field516 / (float) class46.field509;
        int var7 = arg0;
        int var8 = arg5;
        if (arg4 != 1381) {
            return;
        }
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg0 * var6);
        } else {
            var7 = (int) ((float) arg5 / var6);
        }
        int var9 = (arg0 - var7) / 2 + arg2;
        int var10 = (arg5 - var8) / 2 + arg3;
        if (class120.field1595 == null || class120.field1595.method737() != arg0 || arg5 != class120.field1595.method738()) {
            class46.method361(class46.field503, class46.field516 + class46.field511, class46.field503 - -class46.field509, class46.field511, var9, var10, var7 + var9, var10 - -var8);
            class46.method366(arg1);
            class120.field1595 = arg1.method228(var9, var10, var7, var8, false);
        }
        class120.field1595.method2025(var9, var10);
        int var11 = class35.field362 * var7 / class46.field509;
        int var12 = class100.field1177 * var8 / class46.field516;
        int var13 = var9 + (class278.field4004 * var7 / class46.field509);
        int var14 = var10 - ((class152.field1996 * var8 / class46.field516) - var8) - var12;
        int var15 = -1996554240;
        if (class389.field5550 == class327.field4603) {
            var15 = -1996488705;
        }
        arg1.method233(var13, var14, var11, var12, var15, 1);
        arg1.method171(var13, var14, var11, var12, var15, 0);
        if (class202.field2840 <= 0) {
            return;
        }
        int var16;
        if (class160.field2064 <= 50) {
            var16 = class160.field2064 * 5;
        } else {
            var16 = 500 - (class160.field2064 * 5);
        }
        for (class226 var17 = (class226) class46.field490.method1041(1048832); var17 != null; var17 = (class226) class46.field490.method1033(-1)) {
            class547 var18 = class46.field485.method514(var17.field3433, (byte) 115);
            if (class676.method3851(33985, var18)) {
                if (class457.field6394 == var17.field3433) {
                    int var19 = var17.field3424 * var7 / class46.field509 + var9;
                    int var20 = (class46.field516 - var17.field3434) * var8 / class46.field516 + var10;
                    arg1.method2822(4, 4, var19 - 2, 1, var20 - 2, var16 << 24 | 0xFFFF00);
                } else if (class95.field1108 != -1 && class95.field1108 == var18.field7604) {
                    int var21 = var17.field3424 * var7 / class46.field509 + var9;
                    int var22 = var10 + ((class46.field516 - var17.field3434) * var8 / class46.field516);
                    arg1.method2822(4, 4, var21 - 2, arg4 + -1380, var22 - 2, var16 << 24 | 0xFFFF00);
                }
            }
        }
    }
}
