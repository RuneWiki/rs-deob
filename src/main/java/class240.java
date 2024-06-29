import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class240 {

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "Lmo;")
    public static class780 field3418 = new class780("", 16);

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "Lsk;")
    public static class650 field3416;

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "[[S")
    public static short[][] field3420;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(B[[BLct;)V")
    public static final void method1602(byte arg0, byte[][] arg1, class157 arg2) {
        int var3 = -118 % ((-arg0 - 12) / 36);
        field3417++;
        int[] var4 = new int[] { -1, 0, 0, 0, 0 };
        int var5 = arg1.length;
        for (int var6 = 0; var6 < var5; var6++) {
            byte[] var11 = arg1[var6];
            if (var11 != null) {
                class93 var12 = new class93(var11);
                int var13 = class201.field3055[var6] >> 8;
                int var14 = class201.field3055[var6] & 0xFF;
                int var15 = var13 * 64 - class217.field3198;
                int var16 = var14 * 64 - class400.field5510;
                class204.method1458(-17818);
                arg2.method2972(class711.field9798, var16, class400.field5510, class217.field3198, (byte) 99, var15, var12);
                arg2.method1217(var12, 0, var15, var4, class95.field1472, var16);
                if (!arg2.field7093 && (class666.field9269 / 8) == var13 && class171.field2735 / 8 == var14 && var4[0] != -1) {
                    class288.field3973 = class780.field10746.method1656(class498.field6811, var4[2], var4[1], var4[0], (byte) -113, var4[3]);
                    class58.field817 = var4[4];
                }
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = (class201.field3055[var7] >> 8) * 64 - class217.field3198;
            int var9 = (class201.field3055[var7] & 0xFF) * 64 - class400.field5510;
            byte[] var10 = arg1[var7];
            if (var10 == null && class171.field2735 < 800) {
                class204.method1458(-17818);
                arg2.method2971(var8, 64, 64, var9, true);
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)V")
    public static void method1603(byte arg0) {
        field3416 = null;
        int var1 = 102 % ((41 - arg0) / 60);
        field3418 = null;
        field3420 = null;
    }

    @OriginalMember(owner = "client!jda", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3419++;
        throw new IllegalStateException();
    }
}
