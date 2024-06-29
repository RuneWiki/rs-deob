import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class171 {

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    private int field2656 = 0;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "Llb;")
    private class465 field2661;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "[I")
    public static int[] field2658 = new int[1];

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "Lada;")
    public static class144 field2654 = new class144(46, 6);

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "Lh;")
    public static class572 field2663 = new class572("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field2665 = 0;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "Lsl;")
    public static class391 field2666 = new class391("", 16);

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field2667 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "[Z")
    public static boolean[] field2668 = new boolean[200];

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "Lkp;")
    private class417 field2662;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public static final void method1212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2655++;
        int var8 = class36.method223(class100.field1452, (byte) 50, arg3, class3.field25);
        int var9 = class36.method223(class100.field1452, (byte) 50, arg5, class3.field25);
        int var10 = class36.method223(class130.field1801, (byte) 50, arg0, class14.field136);
        int var11 = class36.method223(class130.field1801, (byte) 50, arg1, class14.field136);
        if (arg2 != 0) {
            method1212(99, -75, 4, -98, -67, -31, 23, 19);
        }
        int var12 = class36.method223(class100.field1452, (byte) 50, arg3 + arg4, class3.field25);
        int var13 = class36.method223(class100.field1452, (byte) 50, arg5 - arg4, class3.field25);
        for (int var14 = var8; var14 < var12; var14++) {
            class140.method969(var10, arg2 + 15888, arg6, var11, class604.field8993[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class140.method969(var10, arg2 + 15888, arg6, var11, class604.field8993[var15]);
        }
        int var16 = class36.method223(class130.field1801, (byte) 50, arg0 + arg4, class14.field136);
        int var17 = class36.method223(class130.field1801, (byte) 50, arg1 - arg4, class14.field136);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class604.field8993[var18];
            class140.method969(var10, 15888, arg6, var16, var19);
            class140.method969(var16, 15888, arg7, var17, var19);
            class140.method969(var17, 15888, arg6, var11, var19);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)Lkp;", line = 56)
    public final class417 method1213(byte arg0) {
        this.field2656 = 0;
        int var2 = 86 / ((arg0 - 75) / 48);
        field2657++;
        return this.method1215(120);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lqa;B)V", line = 69)
    public static final void method1214(class208 arg0, byte arg1) {
        field2664++;
        if (arg1 != 68) {
            field2665 = 21;
        }
        if (class345.field4748.method127(0) == 0) {
            return;
        }
        if (class526.field7533 == 0) {
            for (class539 var2 = (class539) class345.field4748.method124((byte) 42); var2 != null; var2 = (class539) class345.field4748.method120(arg1 ^ 0xFFFFFFCB)) {
                class150.field2242.method3593(var2.field8013, var2.field8015, var2.field8018, arg0, var2.field8016, false, arg0, false, class519.field7407, (byte) 25, var2.field8019 ? class541.field8119.field5127 : null, var2.field8017);
                var2.method2457(-8422);
            }
            class504.method2996((byte) 119);
            return;
        }
        if (class166.field2616 == null) {
            Canvas var3 = new Canvas();
            var3.setSize(36, 32);
            class166.field2616 = class208.method1382(class87.field1282, false, 0, 0, class96.field1410, var3);
            class163.field2566 = class166.field2616.method492(class26.method166(0, class647.field9401, class210.field3105, 1499), class126.method889(class585.field8595, class210.field3105, 0), true);
        }
        for (class539 var4 = (class539) class345.field4748.method124((byte) 42); var4 != null; var4 = (class539) class345.field4748.method120(arg1 ^ 0x64)) {
            class150.field2242.method3593(var4.field8013, var4.field8015, var4.field8018, class166.field2616, var4.field8016, false, arg0, false, class163.field2566, (byte) 25, var4.field8019 ? class541.field8119.field5127 : null, var4.field8017);
            var4.method2457(-8422);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)Lkp;", line = 122)
    public final class417 method1215(int arg0) {
        field2659++;
        if (this.field2656 > 0 && this.field2661.field6543[this.field2656 - 1] != this.field2662) {
            class417 var2 = this.field2662;
            this.field2662 = var2.field5645;
            return var2;
        }
        if (arg0 <= 100) {
            this.method1215(114);
        }
        while (this.field2656 < this.field2661.field6529) {
            class417 var3 = this.field2661.field6543[this.field2656++].field5645;
            if (this.field2661.field6543[this.field2656 - 1] != var3) {
                this.field2662 = var3.field5645;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 184)
    public class171() {
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Llb;)V", line = 187)
    public class171(class465 arg0) {
        this.field2661 = arg0;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V", line = 161)
    public static void method1216(int arg0) {
        field2666 = null;
        if (arg0 != 8506) {
            field2663 = null;
        }
        field2658 = null;
        field2663 = null;
        field2667 = null;
        field2668 = null;
        field2654 = null;
    }
}
