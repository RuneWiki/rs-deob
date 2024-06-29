import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public abstract class class619 {

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field8352;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field8353;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field8354;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Lpe;")
    public static class615 field8351;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)Lfi;", line = 4)
    public static final class237 method3376(int arg0, int arg1, int arg2) {
        class530 var3 = class483.field6438[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6893;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V", line = 11)
    public static void method3377(boolean arg0) {
        if (!arg0) {
            field8351 = null;
        }
        field8351 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILjava/lang/String;IBI)V", line = 25)
    public static final void method3378(int arg0, String arg1, int arg2, byte arg3, int arg4) {
        field8353++;
        if (arg3 != -68) {
            field8352 = 68;
        }
        class477 var5 = class386.method2203(arg2, 0, arg0);
        if (var5 == null) {
            return;
        }
        if (var5.field6268 != null) {
            class155 var6 = new class155();
            var6.field1962 = var5.field6268;
            var6.field1968 = var5;
            var6.field1963 = arg1;
            var6.field1958 = arg4;
            class709.method3885(var6);
        }
        if (class566.field7391 != 10 || !client.method696(var5).method1143(93, arg4 - 1)) {
            return;
        }
        if (arg4 == 1) {
            class162.field2010++;
            class11 var7 = class130.method931(class649.field9035, (byte) 54, class492.field6517);
            class62.method523(arg0, var5.field6321, arg2, arg3 ^ 0xFFFFFFBD, var7);
            class100.method760(var7, -100);
        }
        if (arg4 == 2) {
            class143.field1869++;
            class11 var8 = class130.method931(class649.field9035, (byte) 54, class691.field9436);
            class62.method523(arg0, var5.field6321, arg2, 1, var8);
            class100.method760(var8, 31);
        }
        if (arg4 == 3) {
            class38.field547++;
            class11 var9 = class130.method931(class649.field9035, (byte) 54, class49.field688);
            class62.method523(arg0, var5.field6321, arg2, 1, var9);
            class100.method760(var9, 71);
        }
        if (arg4 == 4) {
            class129.field1646++;
            class11 var10 = class130.method931(class649.field9035, (byte) 54, class323.field4194);
            class62.method523(arg0, var5.field6321, arg2, 1, var10);
            class100.method760(var10, 90);
        }
        if (arg4 == 5) {
            class337.field4357++;
            class11 var11 = class130.method931(class649.field9035, (byte) 54, class194.field2533);
            class62.method523(arg0, var5.field6321, arg2, 1, var11);
            class100.method760(var11, 96);
        }
        if (arg4 == 6) {
            class203.field2644++;
            class11 var12 = class130.method931(class649.field9035, (byte) 54, class363.field4685);
            class62.method523(arg0, var5.field6321, arg2, 1, var12);
            class100.method760(var12, arg3 + 66);
        }
        if (arg4 == 7) {
            class681.field9387++;
            class11 var13 = class130.method931(class649.field9035, (byte) 54, class304.field3979);
            class62.method523(arg0, var5.field6321, arg2, 1, var13);
            class100.method760(var13, 0);
        }
        if (arg4 == 8) {
            class194.field2527++;
            class11 var14 = class130.method931(class649.field9035, (byte) 54, class7.field63);
            class62.method523(arg0, var5.field6321, arg2, arg3 + 69, var14);
            class100.method760(var14, -120);
        }
        if (arg4 == 9) {
            class333.field4323++;
            class11 var15 = class130.method931(class649.field9035, (byte) 54, class384.field4911);
            class62.method523(arg0, var5.field6321, arg2, 1, var15);
            class100.method760(var15, arg3 ^ 0x29);
        }
        if (arg4 == 10) {
            class25.field282++;
            class11 var16 = class130.method931(class649.field9035, (byte) 54, class639.field8891);
            class62.method523(arg0, var5.field6321, arg2, 1, var16);
            class100.method760(var16, -119);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIII)V", line = 163)
    public static final void method3379(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8354++;
        for (int var5 = arg3; var5 < class57.field758; var5++) {
            Rectangle var6 = class20.field220[var5];
            if (var6.x + var6.width > arg2 && var6.x < (arg0 + arg2) && arg1 < var6.y + var6.height && arg1 + arg4 > var6.y) {
                class541.field7022[var5] = true;
            }
        }
    }
}
