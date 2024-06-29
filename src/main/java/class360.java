import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class360 extends OutputStream {

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "Ldv;")
    public static class566 field4843 = new class566(7, 8);

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field4844 = 0;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!wg", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field4839++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)Z")
    public static final boolean method2158(int arg0, byte arg1) {
        field4842++;
        if (arg1 > -51) {
            method2162(false, null);
        }
        return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static void method2159(int arg0) {
        if (arg0 >= -27) {
            field4844 = -12;
        }
        field4843 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILan;IIZ)V")
    public static final void method2160(int arg0, int arg1, class21 arg2, int arg3, int arg4, boolean arg5) {
        class587.field8397 = 10000;
        field4840++;
        class112.field1726 = 1;
        class47.field903 = arg1;
        class467.field6585 = arg0;
        class5.field70 = arg4;
        if (arg3 == 15325) {
            class291.field4011 = arg2;
            class503.field6996 = arg5;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lvw;I)V")
    public static final void method2161(class254 arg0, int arg1) {
        arg0.field3523 = null;
        field4838++;
        int var2 = arg0.field3525.length;
        int var3 = -47 % ((arg1 - 4) / 42);
        for (int var4 = 0; var4 < var2; var4++) {
            arg0.field3525[var4].field9232 = false;
        }
        class555[] var5 = class251.field3485;
        synchronized (class251.field3485) {
            if (var2 < class251.field3485.length && class472.field6630[var2] < 200) {
                class251.field3485[var2].method3145(arg0, Integer.MAX_VALUE);
                int var10002 = class472.field6630[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZLnj;)V")
    public static final void method2162(boolean arg0, class204 arg1) {
        arg1.method1240(arg0);
        field4841++;
        int var2 = class97.field1472;
        class188 var3 = class645.field9372 = class349.field4696[var2] = new class188();
        var3.field607 = var2;
        int var4 = arg1.method1237(592256579, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        var3.field616[0] = var6 - class519.field7304;
        int var7 = var4 & 0x3FFF;
        var3.field6037 = (var3.field616[0] << 7) + (var3.method337(0) << 6);
        var3.field618[0] = var7 - class6.field80;
        var3.field6029 = (var3.field618[0] << 7) + (var3.method337(0) << 6);
        class206.field2901 = var3.field6035 = var5;
        if (class492.field6896[var2] != null) {
            var3.method1176(class492.field6896[var2], (byte) -107);
        }
        class559.field7738 = 0;
        class358.field4825[class559.field7738++] = var2;
        class611.field8783[var2] = 0;
        class561.field7777 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method1237(592256579, 18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class62 var13 = class112.field1727[var8] = new class62();
                var13.field1083 = -1;
                var13.field1081 = 0;
                var13.field1077 = (var10 << 28) + (var11 << 14) + var12;
                var13.field1078 = false;
                class285.field3916[class561.field7777++] = var8;
                class611.field8783[var8] = 0;
            }
        }
        arg1.method1239(8);
    }
}
