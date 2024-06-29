import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class466 {

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
    public static int field6347 = 0;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "Lin;")
    public static class380 field6346 = new class380(57, 8);

    @OriginalMember(owner = "client!dba", name = "r", descriptor = "Z")
    public static boolean field6363 = false;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    public int field6348;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "I")
    public int field6349;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "I")
    public int field6351;

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!dba", name = "h", descriptor = "I")
    public int field6353;

    @OriginalMember(owner = "client!dba", name = "i", descriptor = "I")
    public int field6354;

    @OriginalMember(owner = "client!dba", name = "j", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!dba", name = "k", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!dba", name = "l", descriptor = "I")
    public int field6357;

    @OriginalMember(owner = "client!dba", name = "m", descriptor = "I")
    public int field6358;

    @OriginalMember(owner = "client!dba", name = "n", descriptor = "I")
    public int field6359;

    @OriginalMember(owner = "client!dba", name = "o", descriptor = "I")
    public int field6360;

    @OriginalMember(owner = "client!dba", name = "p", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!dba", name = "q", descriptor = "I")
    public int field6362;

    @OriginalMember(owner = "client!dba", name = "s", descriptor = "I")
    public int field6364;

    @OriginalMember(owner = "client!dba", name = "t", descriptor = "I")
    public int field6365;

    @OriginalMember(owner = "client!dba", name = "u", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(II)V")
    public static final void method2722(int arg0, int arg1) {
        field6352++;
        class414.field5684 = -1;
        class630.field8932 = -1;
        class761.field10553 = arg0;
        class274.method1744(1);
        if (arg1 != 57) {
            field6363 = true;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)Ljea;")
    public static final class250 method2723(int arg0) {
        if (arg0 != 50) {
            field6347 = 73;
        }
        field6356++;
        return class751.field10419;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IBII)V")
    public static final void method2724(int arg0, byte arg1, int arg2, int arg3) {
        field6366++;
        class341 var4 = class548.field7629[arg3][arg0];
        int var5 = -52 / ((62 - arg1) / 32);
        class259.method1689(arg2, var4 == null ? class252.field3618 : var4, 0);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IZFIIIII)[I")
    public static final int[] method2725(int arg0, boolean arg1, float arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6355++;
        int[] var8 = new int[arg0];
        class558 var9 = new class558();
        var9.field7750 = arg4;
        if (arg7 > -39) {
            field6346 = null;
        }
        var9.field7740 = arg6;
        var9.field7753 = (int) (arg2 * 4096.0F);
        var9.field7743 = arg3;
        var9.field7744 = arg1;
        var9.field7746 = arg5;
        var9.method27((byte) -100);
        class242.method1611(1, -1, arg0);
        var9.method3252(var8, 0, -72);
        return var8;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)Z")
    public static final boolean method2726(byte arg0) {
        if (arg0 != -99) {
            field6346 = null;
        }
        field6350++;
        try {
            return class636.method3622((byte) 50);
        } catch (IOException var4) {
            class317.method1929(13);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class673.field9429 == null ? -1 : class673.field9429.method2291((byte) -114)) + "," + (class654.field9250 == null ? -1 : class654.field9250.method2291((byte) -128)) + "," + (class651.field9225 == null ? -1 : class651.field9225.method2291((byte) -100)) + " - " + class549.field7634 + "," + (class719.field10041.field4142[0] + class222.field3266) + "," + (class719.field10041.field4136[0] + class697.field9798) + " - ";
            for (int var3 = 0; var3 < class549.field7634 && var3 < 50; var3++) {
                var2 = var2 + class48.field674.field6002[var3] + ",";
            }
            class349.method2122(var5, var2, arg0 + 100);
            class477.method2832(false, (byte) 126);
            return true;
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(BLdba;)Z")
    public final boolean method2727(byte arg0, class466 arg1) {
        field6361++;
        if (arg0 < 89) {
            method2726((byte) -17);
        }
        return this.field6365 == arg1.field6365 && this.field6358 == arg1.field6358 && this.field6354 == arg1.field6354;
    }

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(B)V")
    public static void method2728(byte arg0) {
        field6346 = null;
        int var1 = 103 / ((15 - arg0) / 42);
    }
}
