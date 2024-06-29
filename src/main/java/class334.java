import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class334 {

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field4849 = -1;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field4847 = 0;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "[S")
    public static short[] field4846 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!si", name = "i", descriptor = "[[I")
    public static int[][] field4852 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Llf;Z)V")
    public static final void method2186(class130 arg0, boolean arg1) {
        field4848++;
        byte[] var2 = new byte[24];
        if (class204.field2886 != null) {
            try {
                class204.field2886.method1109(0L, (byte) -79);
                class204.field2886.method1115(-9030, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method821(24, -115, 0, var2);
        if (arg1) {
            method2191(false, (String) null, (Throwable) null);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static final void method2187(int arg0) {
        field4845++;
        class15 var1 = class446.field6372;
        synchronized (class446.field6372) {
            class446.field6372.method102((byte) -112);
            if (arg0 != -31407) {
                method2188(79);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V")
    public static void method2188(int arg0) {
        field4852 = null;
        field4846 = null;
        if (arg0 < 8) {
            field4849 = 18;
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V")
    public static final void method2189(int arg0) {
        field4851++;
        class262.field3867.method102((byte) -111);
        if (arg0 != -11930) {
            field4852 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(JIIILjava/lang/String;IZZZILjava/lang/String;)V")
    public static final void method2190(long arg0, int arg1, int arg2, int arg3, String arg4, int arg5, boolean arg6, boolean arg7, boolean arg8, int arg9, String arg10) {
        field4850++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class130 var14 = new class130(128);
        var14.method831(10, (byte) 119);
        var14.method799((arg8 ? 4 : 0) | (arg6 ? 2 : 0) | (arg7 ? 1 : 0), 62);
        var14.method832((byte) -61, arg0);
        var14.method849(var12[0], (byte) -91);
        var14.method807((byte) 124, arg10);
        var14.method849(var12[1], (byte) -103);
        var14.method799(class363.field5213, -68);
        var14.method831(arg3, (byte) 114);
        var14.method831(arg5, (byte) -41);
        var14.method849(var12[2], (byte) -98);
        var14.method799(arg1, -125);
        var14.method799(arg2, -113);
        var14.method849(var12[3], (byte) -62);
        var14.method833(class246.field3674, class15.field220, -111);
        class130 var15 = new class130(350);
        var15.method807((byte) 124, arg4);
        int var16 = 8 - (class276.method1873(true, arg4) % 8);
        if (arg9 < 107) {
            method2187(48);
        }
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method831((int) (Math.random() * 255.0D), (byte) -104);
        }
        var15.method851(var12, false);
        class407.field5761.field1880 = 0;
        class407.field5761.method831(22, (byte) -33);
        class407.field5761.method799(var14.field1880 + var15.field1880 + 2, 73);
        class407.field5761.method799(566, 117);
        class407.field5761.method821(var14.field1880, -121, 0, var14.field1851);
        class407.field5761.method821(var15.field1880, -113, 0, var15.field1851);
        class44.field599 = -3;
        class103.field1332 = 0;
        class429.field6100 = 0;
        class415.field5926 = 1;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method2191(boolean arg0, String arg1, Throwable arg2) {
        field4844++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class8.method46(arg2, (byte) -84);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            if (!arg0) {
                method2188(98);
            }
            class291.method1973(var3, 30);
            String var4 = class354.method2320(":", -1, "%3a", var3);
            String var5 = class354.method2320("@", -1, "%40", var4);
            String var6 = class354.method2320("&", -1, "%26", var5);
            String var7 = class354.method2320("#", -1, "%23", var6);
            if (class138.field2116.field3154 != null) {
                class156 var8 = class138.field2116.method1541(-21, new URL(class138.field2116.field3154.getCodeBase(), "clienterror.ws?c=" + class233.field3443 + "&u=" + class452.field6483 + "&v1=" + class219.field3143 + "&v2=" + class219.field3144 + "&e=" + var7));
                while (var8.field2298 == 0) {
                    class259.method1790((byte) -105, 1L);
                }
                if (var8.field2298 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2295;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }
}
