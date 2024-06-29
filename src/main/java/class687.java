import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public abstract class class687 {

    @OriginalMember(owner = "client!gfa", name = "g", descriptor = "I")
    public static int field9669 = 1400;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
    public static int field9663;

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "I")
    public static int field9664;

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "I")
    public static int field9665;

    @OriginalMember(owner = "client!gfa", name = "e", descriptor = "I")
    public static int field9667;

    @OriginalMember(owner = "client!gfa", name = "f", descriptor = "I")
    public static int field9668;

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "Lxa;")
    public static class461 field9666;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ILoa;)Lwc;")
    public abstract class60 method555(int arg0, class638 arg1);

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Loa;B)Lac;")
    public abstract class496 method551(class638 arg0, byte arg1);

    @OriginalMember(owner = "client!gfa", name = "f", descriptor = "(I)V")
    public static void method3781(int arg0) {
        if (arg0 != 17795) {
            method3782(94, 21, -121);
        }
        field9666 = null;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(III)V")
    public static final void method3782(int arg0, int arg1, int arg2) {
        if (class465.field6544 != arg0) {
            class346.field4994 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class346.field4994[var3] = (var3 << 12) / arg0;
            }
            class168.field2537 = arg0 - 1;
            class385.field5387 = arg0 * 32;
            class465.field6544 = arg0;
        }
        if (arg1 != 0) {
            method3783(86, 56, null, 58, 68);
        }
        field9663++;
        if (class250.field3529 == arg2) {
            return;
        }
        if (class465.field6544 == arg2) {
            class105.field1409 = class346.field4994;
        } else {
            class105.field1409 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class105.field1409[var4] = (var4 << 12) / arg2;
            }
        }
        class384.field5383 = arg2 - 1;
        class250.field3529 = arg2;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IILba;II)Lac;")
    public static final class496 method3783(int arg0, int arg1, class352 arg2, int arg3, int arg4) {
        field9667++;
        if (arg4 >= -81) {
            field9666 = null;
        }
        return arg2 == null ? null : new class496(arg0, arg1, arg3, arg2.method196(), arg2.method214(), arg2.method229(), arg2.method220(), arg2.method239(), arg2.method219(), arg2.method198());
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZLoa;)V")
    public abstract void method552(boolean arg0, class638 arg1);

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Z[B)V")
    public static final void method3784(boolean arg0, byte[] arg1) {
        if (arg0) {
            method3783(83, 6, null, -116, 76);
        }
        field9668++;
        class96 var2 = new class96(arg1);
        while (true) {
            while (true) {
                int var3 = var2.method718(-84);
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int[] var4 = class525.field7180 = new int[6];
                    var4[0] = var2.method743((byte) -61);
                    var4[1] = var2.method743((byte) -117);
                    var4[2] = var2.method743((byte) -95);
                    var4[3] = var2.method743((byte) -102);
                    var4[4] = var2.method743((byte) -9);
                    var4[5] = var2.method743((byte) -84);
                } else if (var3 == 4) {
                    int var7 = var2.method718(108);
                    class309.field4611 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        class309.field4611[var8] = var2.method743((byte) -54);
                        if (class309.field4611[var8] == 65535) {
                            class309.field4611[var8] = -1;
                        }
                    }
                } else if (var3 == 5) {
                    int var5 = var2.method718(-68);
                    class472.field6586 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        class472.field6586[var6] = var2.method743((byte) -115);
                        if (class472.field6586[var6] == 65535) {
                            class472.field6586[var6] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gfa", name = "g", descriptor = "(I)Z")
    public abstract boolean method140(int arg0);

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IILgfa;IIZLoa;)V")
    public abstract void method143(int arg0, int arg1, class687 arg2, int arg3, int arg4, boolean arg5, class638 arg6);

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IILoa;I)Z")
    public abstract boolean method559(int arg0, int arg1, class638 arg2, int arg3);

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Z)V")
    public abstract void method142(boolean arg0);
}
