import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public abstract class class691 {

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "Lji;")
    public static class567 field9691 = null;

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "[I")
    public static int[] field9692 = new int[3];

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "[I")
    public static int[] field9694 = new int[] { 3500, 200 };

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public static int field9688;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public static int field9689;

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
    public static int field9690;

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
    public static int field9693;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "[Z")
    public static boolean[] field9687;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 6)
    public static final String method3912(Throwable arg0, int arg1) throws IOException {
        field9690++;
        String var2;
        if ((arg0 instanceof class666)) {
            class666 var3 = (class666) arg0;
            var2 = var3.field9432 + " | ";
            arg0 = var3.field9431;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        if (arg1 != 17485) {
            method3916(true, null, -49L);
        }
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(JILri;ZIIII)V", line = 78)
    public static final void method3913(long arg0, int arg1, class97 arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        class206.field3453 = 10000;
        class386.field6000 = arg2;
        class490.field7168 = arg7;
        class466.field6944 = arg5;
        class419.field6421 = arg4;
        int var9 = 29 % ((-arg6 - 36) / 46);
        class20.field326 = arg1;
        class338.field5487 = arg3;
        class474.field7018 = null;
        class20.field332 = 1;
        field9689++;
        class105.field1708 = arg0;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIII)V", line = 106)
    public static final void method3914(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class17.field282.field4864 * arg1 >> 8;
        if (arg3 != 22662) {
            method3914(112, -48, -35, -70);
        }
        field9693++;
        if (var4 == 0 || arg0 == -1) {
            return;
        }
        if (!class659.field9185 && class187.field3121 != -1 && class426.method2696((byte) 126)) {
            class235.field3741 = class48.method556((byte) 89);
            class16 var5 = class333.method2306((byte) -105, class235.field3741);
            class258.method1828(true, -97, var5);
        }
        class143.method1216(0, class641.field8988, var4, (byte) 95, false, arg0);
        class9.method191(-1, 255, arg3 - 18390);
        class659.field9185 = true;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V", line = 134)
    public static void method3915(byte arg0) {
        field9687 = null;
        field9692 = null;
        field9691 = null;
        field9694 = null;
        if (arg0 > -110) {
            method3916(true, null, -39L);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZLr;J)V", line = 151)
    public static final void method3916(boolean arg0, class167 arg1, long arg2) {
        field9688++;
        class71.field896 = 0;
        if (arg0) {
            method3914(19, -126, -51, 119);
        }
        class319.field5000 = 0;
        class193.field3205 = class429.field6545;
        class429.field6545 = 0;
        long var4 = class112.method1033(-11752);
        for (class536 var6 = (class536) class364.field5737.method2754((byte) 110); var6 != null; var6 = (class536) class364.field5737.method2759(1486415172)) {
            if (var6.method3256(arg1, arg2)) {
                class319.field5000++;
            }
        }
        if (class693.field9716 && arg2 % 100L == 0L) {
            System.out.println("Particle system count: " + class364.field5737.method2750((byte) -111) + ", running: " + class319.field5000);
            System.out.println("Emitters: " + class71.field896 + " Particles: " + class429.field6545 + ". Time taken: " + (class112.method1033(-11752) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)J")
    public abstract long method2907(int arg0);
}
