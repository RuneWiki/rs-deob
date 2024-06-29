import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public abstract class class163 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1994 = 0;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!m", name = "ha", descriptor = "()V")
    public abstract void method656();

    @OriginalMember(owner = "client!m", name = "I", descriptor = "(III[I)V")
    public abstract void method662(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!m", name = "ta", descriptor = "(I)V")
    public abstract void method666(int arg0);

    @OriginalMember(owner = "client!m", name = "B", descriptor = "(IIIIII)V")
    public abstract void method669(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!m", name = "k", descriptor = "(I)V")
    public abstract void method671(int arg0);

    @OriginalMember(owner = "client!m", name = "XA", descriptor = "(I)V")
    public abstract void method672(int arg0);

    @OriginalMember(owner = "client!m", name = "TA", descriptor = "(III)V")
    public abstract void method655(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!m", name = "ma", descriptor = "(I)V")
    public abstract void method664(int arg0);

    @OriginalMember(owner = "client!m", name = "va", descriptor = "([I)V")
    public abstract void method660(int[] arg0);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BZ)V")
    public static final void method890(byte arg0, boolean arg1) {
        if (arg0 >= -111) {
            field1995 = -94;
        }
        field1998++;
        while (class532.field7483.method2811(class445.field6138, 11672) >= 15) {
            int var2 = class532.field7483.method2813(15, -62);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            class415 var4 = (class415) class309.field3938.method2645((long) var2, (byte) -93);
            if (var4 == null) {
                class459 var5 = new class459();
                var5.field6399 = var2;
                var4 = new class415(var5);
                class309.field3938.method2640(1, (long) var2, var4);
                class393.field5189[class98.field1215++] = var4;
                var3 = true;
            }
            class459 var6 = var4.field5390;
            class194.field2345[class474.field6637++] = var2;
            var6.field6417 = class335.field4358;
            if (var6.field6334 != null && var6.field6334.method428(16384)) {
                class279.method1590(var6, -13416);
            }
            int var7 = class532.field7483.method2813(1, -97);
            if (var7 == 1) {
                class85.field1039[class594.field8624++] = var2;
            }
            int var8 = (class532.field7483.method2813(3, -55) + 4 & 0x14600007) << 11;
            int var9;
            if (arg1) {
                var9 = class532.field7483.method2813(8, -83);
                if (var9 > 127) {
                    var9 -= 256;
                }
            } else {
                var9 = class532.field7483.method2813(5, -103);
                if (var9 > 15) {
                    var9 -= 32;
                }
            }
            int var10;
            if (arg1) {
                var10 = class532.field7483.method2813(8, 114);
                if (var10 > 127) {
                    var10 -= 256;
                }
            } else {
                var10 = class532.field7483.method2813(5, -41);
                if (var10 > 15) {
                    var10 -= 32;
                }
            }
            int var11 = class532.field7483.method2813(2, -99);
            int var12 = class532.field7483.method2813(1, -54);
            var6.method2674(class518.field7296.method150(true, class532.field7483.method2813(14, -12)), 0);
            var6.method2696(true, var6.field6334.field844);
            var6.field6461 = var6.field6334.field813 << 3;
            if (var3) {
                var6.method2706(true, -47, var8);
            }
            var6.method2680(var12 == 1, var6.method2694(28146), class103.field1265.field6483[0] + var9, (byte) -116, var11, class103.field1265.field6491[0] + var10);
            if (var6.field6334.method428(16384)) {
                class131.method736((byte) -88, var6.field6483[0], var6, null, null, var6.field6491[0], 0, var6.field8660);
            }
        }
        class532.field7483.method2814((byte) 60);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III[I)V")
    public abstract void method657(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static final void method891(int arg0) {
        if (arg0 <= 119) {
            field1994 = 23;
        }
        field1996++;
        if (class578.field8435 != class36.field282) {
            try {
                class47.method249("tbrefresh", class216.field2633, (byte) 86);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "KA", descriptor = "(I)V")
    public abstract void method659(int arg0);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()Lm;")
    public abstract class163 method675();

    @OriginalMember(owner = "client!m", name = "oa", descriptor = "(III)V")
    public abstract void method661(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!m", name = "EA", descriptor = "(Lm;)V")
    public abstract void method676(class163 arg0);
}
