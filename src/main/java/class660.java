import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public abstract class class660 {

    @OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
    public static int field9195 = 0;

    @OriginalMember(owner = "client!mga", name = "k", descriptor = "Lhga;")
    public static class158 field9198 = new class158(48, 4);

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "I")
    public static int field9188;

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "I")
    public static int field9189;

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
    public int field9190;

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "I")
    public static int field9191;

    @OriginalMember(owner = "client!mga", name = "f", descriptor = "I")
    public int field9193;

    @OriginalMember(owner = "client!mga", name = "g", descriptor = "I")
    public static int field9194;

    @OriginalMember(owner = "client!mga", name = "i", descriptor = "I")
    public int field9196;

    @OriginalMember(owner = "client!mga", name = "j", descriptor = "I")
    public static int field9197;

    @OriginalMember(owner = "client!mga", name = "e", descriptor = "Lac;")
    public static class501 field9192;

    @OriginalMember(owner = "client!mga", name = "l", descriptor = "Lri;")
    public static class97 field9199;

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(I)V", line = 13)
    public static void method3785(int arg0) {
        if (arg0 <= -115) {
            field9192 = null;
            field9198 = null;
            field9199 = null;
        }
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(IIILiq;Liq;)V", line = 26)
    public static final void method3786(int arg0, int arg1, int arg2, class563 arg3, class563 arg4) {
        class252 var5 = class115.method1040(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field4029 = arg3;
        var5.field4019 = arg4;
        int var6 = class587.field8346 == class493.field7208 ? 1 : 0;
        if (!arg3.method414(0)) {
            class245.field3903[var6][class95.field1483[var6]++] = arg3;
        } else if (arg3.method402(623404585)) {
            class321.field5016[var6][class124.field2052[var6]++] = arg3;
        } else {
            class20.field329[var6][class203.field3310[var6]++] = arg3;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method414(0)) {
            if (arg4.method402(623404585)) {
                class321.field5016[var6][class124.field2052[var6]++] = arg4;
                return;
            }
            class20.field329[var6][class203.field3310[var6]++] = arg4;
            return;
        }
        class245.field3903[var6][class95.field1483[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(B)Z", line = 64)
    public final boolean method3787(byte arg0) {
        field9191++;
        if (arg0 <= 79) {
            this.method3789(-66);
        }
        return (this.field9193 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(B)Z", line = 77)
    public final boolean method3788(byte arg0) {
        field9189++;
        int var2 = -55 / ((48 - arg0) / 41);
        return (this.field9193 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)Z", line = 87)
    public final boolean method3789(int arg0) {
        field9194++;
        if (arg0 != 0) {
            this.method3787((byte) -110);
        }
        return (this.field9193 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V", line = 103)
    public static final void method3790(int arg0, Throwable arg1, String arg2) {
        field9197++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class691.method3912(arg1, 17485);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class494.method3015(var3, arg0 ^ 0x278E);
            String var4 = class62.method685("%3a", ":", arg0 ^ arg0, var3);
            String var5 = class62.method685("%40", "@", 0, var4);
            String var6 = class62.method685("%26", "&", 0, var5);
            String var7 = class62.method685("%23", "#", arg0 ^ 0x27E8, var6);
            if (class166.field2794 != null) {
                class701 var8 = class546.field7949.method3168(new URL(class166.field2794.getCodeBase(), "clienterror.ws?c=" + class591.field8392 + "&u=" + class193.field3203 + "&v1=" + class525.field7663 + "&v2=" + class525.field7670 + "&e=" + var7), (byte) -30);
                while (var8.field9884 == 0) {
                    class549.method3313(1L, 124);
                }
                if (var8.field9884 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field9885;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "(I)Z", line = 158)
    public final boolean method3791(int arg0) {
        if (arg0 == 4) {
            field9188++;
            return (this.field9193 & 0x4) != 0;
        } else {
            return true;
        }
    }
}
