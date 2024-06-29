import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public abstract class class35 extends class30 {

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "S")
    public short field758 = -32768;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "Lrd;")
    public static class173 field752 = class133.method843("Clientscript error )2 check log for details", 80);

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "Lrd;")
    public static class173 field756 = class133.method843("blinken1:", -68);

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "Lof;")
    public static class145 field757 = new class145();

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "[Lrh;")
    public static class177[] field760 = new class177[4];

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "Lrd;")
    public static class173 field762 = class133.method843("Anmelde)2Zeitlimit -Uberschritten)3", -102);

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "Lrd;")
    public static class173 field764 = class133.method843(" Sekunde(Xn(Y -Ubertragen)3", 50);

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "Lrd;")
    private static class173 field761 = class133.method843("slide:", -70);

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "I")
    public static int field765 = 0;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "Lrd;")
    public static class173 field763 = field761;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "Lrd;")
    public static class173 field759 = field761;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIILdd;Ldd;IIIIJ)V")
    public static final void method271(int arg0, int arg1, int arg2, int arg3, class35 arg4, class35 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class216 var12 = new class216();
        var12.field4178 = arg10;
        var12.field4176 = arg1 * 128 + 64;
        var12.field4186 = arg2 * 128 + 64;
        var12.field4187 = arg3;
        var12.field4184 = arg4;
        var12.field4183 = arg5;
        var12.field4193 = arg6;
        var12.field4190 = arg7;
        var12.field4188 = arg8;
        var12.field4174 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class208.field4055[var13][arg1][arg2] == null) {
                class208.field4055[var13][arg1][arg2] = new class105(var13, arg1, arg2);
            }
        }
        class208.field4055[arg0][arg1][arg2].field1957 = var12;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public void method272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class213 var11 = this.method274(-32768);
        field755++;
        if (var11 != null) {
            var11.method272(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field758 = var11.field758;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)J")
    public static final long method273(int arg0, int arg1, int arg2) {
        class105 var3 = class208.field4055[arg0][arg1][arg2];
        return var3 == null || var3.field1957 == null ? 0L : var3.field1957.field4178;
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)Lvf;")
    public class213 method274(int arg0) {
        field753++;
        return arg0 == -32768 ? null : null;
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)V")
    public static void method275(byte arg0) {
        field764 = null;
        field763 = null;
        field757 = null;
        field756 = null;
        field759 = null;
        field761 = null;
        field760 = null;
        field752 = null;
        field762 = null;
        if (arg0 >= -104) {
            method273(-97, -59, 22);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZBLa;IIBI)V")
    public static final void method276(boolean arg0, byte arg1, class1 arg2, int arg3, int arg4, byte arg5, int arg6) {
        field754++;
        long var7 = (long) ((arg4 << 16) + arg6);
        class220 var9 = (class220) class106.field1976.method677(-2755, var7);
        if (var9 != null || arg1 > -42) {
            return;
        }
        class220 var10 = (class220) class121.field2275.method677(-2755, var7);
        if (var10 != null) {
            return;
        }
        class220 var11 = (class220) class69.field1329.method677(-2755, var7);
        if (var11 == null) {
            if (!arg0) {
                class220 var12 = (class220) class196.field3811.method677(-2755, var7);
                if (var12 != null) {
                    return;
                }
            }
            class220 var13 = new class220();
            var13.field4228 = arg5;
            var13.field4232 = arg2;
            var13.field4236 = arg3;
            if (arg0) {
                class106.field1976.method675(var7, var13, false);
                class48.field1028++;
            } else {
                class161.field2991.method723(var13, true);
                class69.field1329.method675(var7, var13, false);
                class105.field1968++;
            }
        } else if (arg0) {
            var11.method236((byte) 120);
            class106.field1976.method675(var7, var11, false);
            class48.field1028++;
            class105.field1968--;
        }
    }
}
