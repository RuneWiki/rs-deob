import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class396 {

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
    private int field5278;

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "I")
    private int field5280;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    private int field5266;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    private int field5269;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
    private int field5274;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
    private int field5277;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    private int field5267;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    private int field5268;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
    private int field5275;

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "I")
    private int field5282;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "Lpr;")
    public static class407 field5273 = new class407(67, 6);

    @OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
    public static int field5283 = 0;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public static int field5270;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
    public static int field5271;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public static int field5272;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public static final boolean method2159(boolean arg0, String arg1) {
        field5281++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class601.field8535; var2++) {
            if (arg1.equalsIgnoreCase(class13.field113[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class30.field354[var2])) {
                return true;
            }
        }
        if (!arg0) {
            method2164((byte) 56);
        }
        return false;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public static void method2160(int arg0) {
        field5273 = null;
        if (arg0 != 13589) {
            method2161(50, 22, -44);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)Lne;")
    public static final class287 method2161(int arg0, int arg1, int arg2) {
        if (class97.field1074[arg0][arg1][arg2] == null) {
            boolean var3 = class97.field1074[0][arg1][arg2] != null && class97.field1074[0][arg1][arg2].field3688 != null;
            if (var3 && arg0 >= class337.field4416 - 1) {
                return null;
            }
            class66.method432(arg0, arg1, arg2);
        }
        return class97.field1074[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BIIIIIIIIII)V")
    public final void method2162(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5276++;
        this.field5266 = arg1;
        this.field5269 = arg9 * arg9;
        this.field5280 = arg10;
        this.field5278 = arg4;
        if (arg0 > -119) {
            this.field5282 = -47;
        }
        this.field5268 = this.field5266 + arg2;
        this.field5274 = this.field5278 + arg5;
        this.field5275 = this.field5278 + arg8;
        this.field5282 = this.field5280 + arg6;
        this.field5277 = this.field5266 + arg3;
        this.field5267 = this.field5280 + arg7;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIILjava/lang/Class;)Lfu;")
    public static final class354 method2163(int arg0, int arg1, int arg2, Class arg3) {
        class287 var4 = class97.field1074[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class60 var5 = var4.field3680; var5 != null; var5 = var5.field623) {
            class354 var6 = var5.field625;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field4642 == arg1 && var6.field4648 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
    public static final void method2164(byte arg0) {
        field5271++;
        class647 var1 = null;
        try {
            class199 var2 = class623.field8837.method3140("3", false, -88);
            while (var2.field2437 == 0) {
                class370.method2025(arg0 ^ 0x7B, 1L);
            }
            if (var2.field2437 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class647) var2.field2434;
            byte[] var3 = new byte[(int) var1.method3632((byte) 47)];
            if (var3.length == 0) {
                class375.field4865 = "";
                class316.field4114 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method3630(false, var3, var3.length - var4, var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class452 var6 = new class452(var3);
                int var7 = var6.method2541(94);
                if (var7 > 60) {
                    throw new RuntimeException("Bad length");
                }
                var6.field6215 = var7 + 1;
                if (!var6.method2527((byte) -18)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field6215 = 1;
                int var8 = var6.method2541(33);
                if (var8 > 2) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class375.field4865 = var6.method2545((byte) 126);
                class316.field4114 = var6.method2545((byte) -48);
                if (var8 >= 1) {
                    class53.field551 = var6.method2574(arg0 - 1758460124);
                } else {
                    class53.field551 = class559.field7965;
                }
                if (var8 >= 2) {
                    class284.field3604 = var6.method2510((byte) 38);
                } else {
                    class284.field3604 = class222.field2795;
                }
            }
        } catch (Exception var10) {
            class316.field4114 = "";
            class375.field4865 = "";
        }
        try {
            if (var1 != null) {
                var1.method3633(0);
            }
            if (arg0 != -124) {
                field5273 = null;
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lep;III)V")
    public static final void method2165(class382 arg0, int arg1, int arg2, int arg3) {
        field5279++;
        if (arg2 >= 31) {
            class80.field855 = arg3;
            class70.field748 = arg1;
            class68.field743 = arg0;
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)V")
    public static final void method2166(byte arg0) {
        field5272++;
        if (arg0 != -38) {
            field5283 = 98;
        }
        for (int var1 = 0; var1 < class379.field4922.length; var1++) {
            for (int var2 = 0; var2 < class379.field4922[0].length; var2++) {
                for (int var3 = 0; var3 < class379.field4922[0][0].length; var3++) {
                    class379.field4922[var1][var2][var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIBI)Z")
    public final boolean method2167(int arg0, int arg1, byte arg2, int arg3) {
        field5270++;
        if (arg1 < this.field5274 || arg1 > this.field5275) {
            return false;
        } else if (arg0 < this.field5267 || arg0 > this.field5282) {
            return false;
        } else if (arg3 >= this.field5277 && this.field5268 >= arg3) {
            int var5 = arg1 - this.field5278;
            if (arg2 <= 38) {
                return true;
            } else {
                int var6 = arg3 - this.field5266;
                return (var5 * var5 + var6 * var6) < this.field5269;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIBLep;)V")
    public static final void method2168(int arg0, int arg1, byte arg2, class382 arg3) {
        field5284++;
        if (arg3 == null) {
            return;
        }
        if (arg3.field5090 != null) {
            class676 var4 = new class676();
            var4.field9580 = arg3.field5090;
            var4.field9585 = arg3;
            class364.method1998(var4);
        }
        class378.field4915 = arg3.field4995;
        class122.field1376 = arg3.field5006;
        class411.field5451 = arg3.field5055;
        if (arg2 != 91) {
            field5283 = 7;
        }
        class420.field5591 = arg3.field5110;
        class406.field5414 = arg1;
        class292.field3767 = arg3.field5073;
        class477.field6938 = true;
        class109.field1269 = arg0;
        class567.method3207((byte) -69, arg3);
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class396(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field5278 = arg0;
        this.field5280 = arg1;
        this.field5266 = arg2;
        this.field5269 = arg3 * arg3;
        this.field5274 = this.field5278 + arg4;
        this.field5277 = this.field5266 + arg8;
        this.field5267 = this.field5280 + arg6;
        this.field5268 = this.field5266 + arg9;
        this.field5275 = this.field5278 + arg5;
        this.field5282 = this.field5280 + arg7;
    }
}
