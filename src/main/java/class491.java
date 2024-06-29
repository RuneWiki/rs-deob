import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public abstract class class491 extends class85 {

    @OriginalMember(owner = "client!qq", name = "G", descriptor = "I")
    public int field7175;

    @OriginalMember(owner = "client!qq", name = "A", descriptor = "Ls;")
    public class160 field7170;

    @OriginalMember(owner = "client!qq", name = "y", descriptor = "Lgp;")
    public static class459 field7168 = new class459(2, 3);

    @OriginalMember(owner = "client!qq", name = "E", descriptor = "J")
    public static long field7173 = -1L;

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!qq", name = "B", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!qq", name = "D", descriptor = "I")
    public static int field7172;

    @OriginalMember(owner = "client!qq", name = "H", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!qq", name = "F", descriptor = "Ldn;")
    public static class201 field7174;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
    public static void method2936(int arg0) {
        field7174 = null;
        field7168 = null;
        if (arg0 > -123) {
            field7168 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lwt;II)V")
    public static final void method2937(class16 arg0, int arg1, int arg2) {
        class415.field5519 = 0;
        field7171++;
        int var3 = -72 / ((arg1 + 34) / 40);
        class29.field497 = false;
        class311.method1858(79, arg0);
        class108.method710(arg0, (byte) 34);
        if (class29.field497) {
            System.out.println("---endgpp---");
        }
        if (arg0.field1176 != arg2) {
            throw new RuntimeException("gpi1 pos:" + arg0.field1176 + " psize:" + arg2);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(III)I")
    public static final int method2938(int arg0, int arg1, int arg2) {
        field7169++;
        if (arg0 != -1) {
            return 92;
        }
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg1 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(B)Z")
    public abstract boolean method2326(byte arg0);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IILjava/lang/String;IZIZJILjava/lang/String;Z)V")
    public static final void method2939(int arg0, int arg1, String arg2, int arg3, boolean arg4, int arg5, boolean arg6, long arg7, int arg8, String arg9, boolean arg10) {
        field7172++;
        int var12 = 107 / ((arg3 + 17) / 37);
        int[] var13 = new int[4];
        for (int var14 = 0; var14 < 3; var14++) {
            var13[var14] = (int) (Math.random() * 9.9999999E7D);
        }
        class88 var15 = new class88(128);
        var15.method565(-106, 10);
        var15.method609((arg10 ? 1 : 0) | (arg4 ? 2 : 0) | (arg6 ? 4 : 0), -99);
        var15.method554(arg7, -290082784);
        var15.method572(-108, var13[0]);
        var15.method597(-128, arg2);
        var15.method572(-122, var13[1]);
        var15.method609(class326.field4189, -104);
        var15.method565(104, arg1);
        var15.method565(-114, arg5);
        var15.method572(-117, var13[2]);
        var15.method609(arg8, -89);
        var15.method609(arg0, -66);
        var15.method572(-106, var13[3]);
        var15.method600(class518.field7667, class411.field5489, 0);
        class88 var16 = new class88(350);
        var16.method597(-127, arg9);
        int var17 = 8 - (class415.method2442(63, arg9) % 8);
        for (int var18 = 0; var18 < var17; var18++) {
            var16.method565(-80, (int) (Math.random() * 255.0D));
        }
        var16.method576(var13, -15661);
        class319.field4112.field1176 = 0;
        class319.field4112.method565(77, class275.field3520.field195);
        class319.field4112.method609(var15.field1176 + var16.field1176 + 2, -94);
        class319.field4112.method609(583, -63);
        class319.field4112.method590(var15.field1176, -1, var15.field1223, 0);
        class319.field4112.method590(var16.field1176, -1, var16.field1223, 0);
        class82.field1020 = -3;
        class227.field2925 = 0;
        class407.field5455 = 1;
        class221.field2857 = 0;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method2327(boolean arg0);

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Ls;I)V")
    public class491(class160 arg0, int arg1) {
        this.field7175 = arg1;
        this.field7170 = arg0;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method2940(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field7176++;
        int var7 = arg3 + arg6;
        int var8 = arg4 - arg6;
        if (arg5 != -56) {
            return;
        }
        for (int var9 = arg3; var9 < var7; var9++) {
            class183.method1212(arg1, class333.field4265[var9], true, arg2, arg0);
        }
        for (int var10 = arg4; var10 > var8; var10--) {
            class183.method1212(arg1, class333.field4265[var10], true, arg2, arg0);
        }
        int var11 = arg2 + arg6;
        int var12 = arg0 - arg6;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class333.field4265[var13];
            class183.method1212(arg1, var14, true, arg2, var11);
            class183.method1212(arg1, var14, true, var12, arg0);
        }
    }
}
