import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public abstract class class533 {

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public static int field7186 = -1;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "Lil;")
    public static class68 field7185 = new class68(64);

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public static int field7188;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
    public static int field7190;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "Lwp;")
    public static class453 field7187;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "Lpl;")
    public static class612 field7189;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IBIILrj;I)Ljava/awt/Frame;")
    public static final Frame method2890(int arg0, byte arg1, int arg2, int arg3, class648 arg4, int arg5) {
        field7188++;
        if (!arg4.method3635(false)) {
            return null;
        }
        if (arg0 == 0) {
            class170[] var6 = class162.method933(arg4, arg1 ^ 0x71);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field2216 == arg5 && var6[var8].field2213 == arg2 && (arg3 == 0 || var6[var8].field2214 == arg3) && (!var7 || var6[var8].field2218 > arg0)) {
                    var7 = true;
                    arg0 = var6[var8].field2218;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class264 var9 = arg4.method3642(arg3, arg0, (byte) -94, arg5, arg2);
        while (var9.field3358 == 0) {
            class419.method2233(-28448, 10L);
        }
        if (arg1 != 7) {
            field7189 = null;
        }
        Frame var10 = (Frame) var9.field3356;
        if (var10 == null) {
            return null;
        } else if (var9.field3358 == 2) {
            class645.method3604(var10, arg4, false);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V")
    public static void method2891(byte arg0) {
        field7189 = null;
        int var1 = -2 % ((-arg0 - 40) / 59);
        field7187 = null;
        field7185 = null;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ZI)V")
    public static final void method2892(boolean arg0, int arg1) {
        class622.field8685++;
        if (arg1 != -1) {
            method2890(-82, (byte) -82, 51, 1, null, -84);
        }
        field7190++;
        class704 var2 = class314.method1820(class504.field6676, class400.field5014, (byte) 112);
        class122.method654(var2, (byte) -36);
        for (class340 var3 = (class340) class138.field1797.method407((byte) 124); var3 != null; var3 = (class340) class138.field1797.method403(12561)) {
            if (!var3.method1873(123)) {
                var3 = (class340) class138.field1797.method407((byte) 124);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field4391 == 0) {
                class426.method2260(arg0, true, false, var3);
            }
        }
        if (class461.field5873 != null) {
            class572.method3158(class461.field5873, 1023);
            class461.field5873 = null;
        }
    }
}
