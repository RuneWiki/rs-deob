import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class404 {

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "[F")
    public static float[] field6061;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "[F")
    public static float[] field6064;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "Lpi;")
    public static class342 field6066;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "Lrn;")
    public static class174 field6068;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIFZIII)[[I")
    public static final int[][] method2470(int arg0, int arg1, int arg2, int arg3, float arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field6063++;
        int[][] var9 = new int[arg3][arg8];
        class25 var10 = new class25();
        var10.field548 = (int) (arg4 * 4096.0F);
        var10.field537 = arg7;
        var10.field544 = arg6;
        var10.field545 = arg1;
        var10.field553 = arg5;
        var10.method38(arg2 ^ 0xFFF);
        class121.method910(arg8, arg3, -126);
        for (int var11 = arg2; var11 < arg3; var11++) {
            var10.method308(var11, var9[var11], (byte) 126);
        }
        return var9;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)V")
    public static final void method2471(int arg0, int arg1) {
        field6060++;
        if (arg0 != 0) {
            field6064 = null;
        }
        class54 var2 = class442.method2651(arg1, 9, -13208);
        var2.method476((byte) -44);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method2472(int arg0, String arg1, boolean arg2) {
        field6062++;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = var6 + (arg2 ? class474.field7099.field3182 : class474.field7099.field3183);
        for (int var8 = var6; var8 < var7; var8++) {
            class23 var11 = class474.field7099.method1473(true, var8);
            if (var11.field466 && var11.method191(-2).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class511.field7543 = -1;
                    class364.field5514 = null;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class364.field5514 = var4;
        class58.field1032 = arg0;
        class511.field7543 = var5;
        String[] var9 = new String[class511.field7543];
        for (int var10 = 0; var10 < class511.field7543; var10++) {
            var9[var10] = class474.field7099.method1473(true, var4[var10]).method191(-2);
        }
        class382.method2374(11698, class364.field5514, var9);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZZI)V")
    public static final void method2473(boolean arg0, boolean arg1, int arg2) {
        if (arg0) {
            class343.field5165--;
            if (class343.field5165 == 0) {
                class441.field6587 = null;
            }
        }
        field6065++;
        if (arg1) {
            class105.field1757--;
            if (class105.field1757 == 0) {
                class168.field2605 = null;
            }
        }
        if (arg2 != 7) {
            field6061 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
    public static void method2474(int arg0) {
        field6066 = null;
        field6064 = null;
        int var1 = 76 % ((arg0 - 6) / 47);
        field6061 = null;
        field6068 = null;
    }

    static {
        new class342("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field6061 = new float[16384];
        field6064 = new float[16384];
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field6061[var2] = (float) Math.sin((double) var2 * var0);
            field6064[var2] = (float) Math.cos((double) var2 * var0);
        }
        field6066 = new class342("wave:", "welle:", "ondulation:", "onda:");
        field6068 = new class174(3, 7);
        field6069 = 0;
    }
}
