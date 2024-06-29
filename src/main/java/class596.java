import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class596 extends class108 {

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public int field8591 = 0;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public int field8594 = -1;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "F")
    public static float field8589;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    public int field8588;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public int field8590;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public int field8592;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public int field8595;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "I")
    public int field8596;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "I")
    public static int field8597;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "I")
    public int field8598;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "I")
    public int field8599;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    public int field8600;

    @OriginalMember(owner = "client!on", name = "w", descriptor = "I")
    public static int field8601;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "I")
    public int field8602;

    @OriginalMember(owner = "client!on", name = "y", descriptor = "I")
    public int field8603;

    @OriginalMember(owner = "client!on", name = "z", descriptor = "I")
    public static int field8604;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "[[B")
    public static byte[][] field8593;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V")
    public static void method3430(boolean arg0) {
        field8593 = null;
        if (arg0) {
            field8593 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method3431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field8604++;
        if (class134.method708(-28, arg6)) {
            if (class567.field7930[arg6] == null) {
                class443.method2574(arg5, -1, 255, arg2, arg7, arg0, arg4, arg3, arg8, class508.field7087[arg6]);
            } else {
                class443.method2574(arg5, -1, 255, arg2, arg7, arg0, arg4, arg3, arg8, class567.field7930[arg6]);
            }
            if (arg1 < 65) {
                method3430(true);
            }
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class99.field1326[var9] = true;
            }
        } else {
            class99.field1326[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I[FB)[F")
    public static final float[] method3432(int arg0, float[] arg1, byte arg2) {
        field8601++;
        float[] var3 = new float[arg0];
        class205.method1314(arg1, 0, var3, 0, arg0);
        int var4 = 84 % ((11 - arg2) / 55);
        return var3;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method3433(boolean arg0, int arg1, String arg2) {
        class98.field1317.field4528 = 1;
        field8597++;
        String var3 = arg2.toLowerCase();
        if (arg1 != -22907) {
            method3430(false);
        }
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class98.field1307.field8493; var6++) {
            class456 var9 = class98.field1307.method3391(0, var6);
            if ((!arg0 || var9.field6504) && var9.field6484 == -1 && var9.field6514 == -1 && var9.field6519 == 0 && var9.field6471.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class590.field8520 = -1;
                    class369.field5144 = null;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class577.field8037 = 0;
        class590.field8520 = var5;
        class369.field5144 = var4;
        String[] var7 = new String[class590.field8520];
        for (int var8 = 0; var8 < class590.field8520; var8++) {
            var7[var8] = class98.field1307.method3391(arg1 + 22907, var4[var8]).field6471;
        }
        class582.method3325(class369.field5144, var7, true);
        class98.field1317.method2062(arg1 ^ 0x5902);
        class98.field1317.field4528 = 2;
    }
}
