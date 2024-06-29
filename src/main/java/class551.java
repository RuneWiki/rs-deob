import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class class551 extends class649 {

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Lae;")
    public static class254 field8117;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Ljava/applet/Applet;")
    public static Applet field8116;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLmq;I[I)V")
    public static final void method3215(byte arg0, class71 arg1, int arg2, int[] arg3) {
        field8115++;
        if (arg1.field7328 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg1.field7328.length; var5++) {
                if (arg1.field7328[var5] != arg3[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg1.field7389 != -1) {
                class47 var6 = class203.field2769.method2971(-124, arg1.field7389);
                int var7 = var6.field725;
                if (var7 == 1) {
                    arg1.field7371 = 1;
                    arg1.field7392 = arg2;
                    arg1.field7419 = 0;
                    arg1.field7342 = 0;
                    arg1.field7391 = 0;
                    if (!arg1.field7372) {
                        class620.method3567(arg1, arg1.field7419, var6, (byte) -128);
                    }
                }
                if (var7 == 2) {
                    arg1.field7342 = 0;
                }
            }
        }
        boolean var8 = true;
        if (arg0 != 63) {
            method3216(-89);
        }
        for (int var9 = 0; var9 < arg3.length; var9++) {
            if (arg3[var9] != -1) {
                var8 = false;
            }
            if (arg1.field7328 == null || arg1.field7328[var9] == -1 || class203.field2769.method2971(arg0 ^ 0xFFFFFF99, arg3[var9]).field742 >= class203.field2769.method2971(arg0 ^ 0xFFFFFFFC, arg1.field7328[var9]).field742) {
                arg1.field7328 = arg3;
                arg1.field7392 = arg2;
                break;
            }
        }
        if (var8) {
            arg1.field7392 = arg2;
            arg1.field7328 = arg3;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Lap;")
    public abstract class447 method996(int arg0);

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public static void method3216(int arg0) {
        if (arg0 == -1) {
            field8116 = null;
            field8117 = null;
        }
    }
}
