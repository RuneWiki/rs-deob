import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class72 extends class251 {

    @OriginalMember(owner = "client!co", name = "x", descriptor = "I")
    public int field1270 = 0;

    @OriginalMember(owner = "client!co", name = "D", descriptor = "I")
    public int field1276 = 12800;

    @OriginalMember(owner = "client!co", name = "E", descriptor = "Z")
    public boolean field1277 = true;

    @OriginalMember(owner = "client!co", name = "M", descriptor = "I")
    public int field1284 = 0;

    @OriginalMember(owner = "client!co", name = "N", descriptor = "I")
    public int field1285 = 12800;

    @OriginalMember(owner = "client!co", name = "L", descriptor = "I")
    public int field1283 = -1;

    @OriginalMember(owner = "client!co", name = "Q", descriptor = "I")
    public int field1288 = -1;

    @OriginalMember(owner = "client!co", name = "z", descriptor = "I")
    public int field1272;

    @OriginalMember(owner = "client!co", name = "w", descriptor = "Ljava/lang/String;")
    public String field1269;

    @OriginalMember(owner = "client!co", name = "O", descriptor = "I")
    public int field1286;

    @OriginalMember(owner = "client!co", name = "v", descriptor = "Ljava/lang/String;")
    public String field1268;

    @OriginalMember(owner = "client!co", name = "u", descriptor = "Lft;")
    public class4 field1267;

    @OriginalMember(owner = "client!co", name = "B", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1274 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!co", name = "t", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!co", name = "y", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!co", name = "A", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!co", name = "C", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!co", name = "F", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!co", name = "H", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!co", name = "I", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!co", name = "K", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!co", name = "P", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!co", name = "G", descriptor = "[B")
    public static byte[] field1279;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IBI[II)Z")
    public final boolean method530(int arg0, byte arg1, int arg2, int[] arg3, int arg4) {
        field1280++;
        for (class58 var6 = (class58) this.field1267.method8((byte) -98); var6 != null; var6 = (class58) this.field1267.method17((byte) -116)) {
            if (var6.method417(arg0, 110, arg4, arg2)) {
                var6.method412(arg2, (byte) 123, arg0, arg3);
                return true;
            }
        }
        return arg1 >= 0 ? false : false;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "([IIII)Z")
    public final boolean method531(int[] arg0, int arg1, int arg2, int arg3) {
        field1281++;
        if (arg2 != 6734) {
            this.field1270 = 122;
        }
        for (class58 var5 = (class58) this.field1267.method8((byte) -98); var5 != null; var5 = (class58) this.field1267.method17((byte) -105)) {
            if (var5.method413(arg1, (byte) -127, arg3)) {
                var5.method412(arg3, (byte) 120, arg1, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(CB)Z")
    public static final boolean method532(char arg0, byte arg1) {
        if (arg1 <= 92) {
            field1274 = null;
        }
        field1273++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method533(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class17.field237[arg0][var8][var14] == -class321.field4828) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class239.field3602) + 1;
            int var10 = (arg3 << class239.field3602) + 2;
            int var11 = class99.field1801[arg0].method318(arg1, arg3) + arg5;
            if (!class262.method1590(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class239.field3602) - 1;
            if (!class262.method1590(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class239.field3602) - 1;
            if (!class262.method1590(var9, var11, var13)) {
                return false;
            } else if (class262.method1590(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class39.method218(arg0, arg1, arg3)) {
            int var6 = arg1 << class239.field3602;
            int var7 = arg3 << class239.field3602;
            return class262.method1590(var6 + 1, class99.field1801[arg0].method318(arg1, arg3) + arg5, var7 + 1) && class262.method1590(class434.field6362 + var6 - 1, class99.field1801[arg0].method318(arg1 + 1, arg3) + arg5, var7 + 1) && class262.method1590(class434.field6362 + var6 - 1, class99.field1801[arg0].method318(arg1 + 1, arg3 + 1) + arg5, class434.field6362 + var7 - 1) && class262.method1590(var6 + 1, class99.field1801[arg0].method318(arg1, arg3 + 1) + arg5, class434.field6362 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IBI)Z")
    public final boolean method534(int arg0, byte arg1, int arg2) {
        field1282++;
        class58 var4 = (class58) this.field1267.method8((byte) -98);
        if (arg1 < 20) {
            method536((byte) -85);
        }
        while (var4 != null) {
            if (var4.method413(arg2, (byte) -127, arg0)) {
                return true;
            }
            var4 = (class58) this.field1267.method17((byte) 46);
        }
        return false;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I[III)Z")
    public final boolean method535(int arg0, int[] arg1, int arg2, int arg3) {
        field1266++;
        if (arg0 != 1) {
            method533(-9, -121, -68, 25, -28, 79);
        }
        for (class58 var5 = (class58) this.field1267.method8((byte) -98); var5 != null; var5 = (class58) this.field1267.method17((byte) 110)) {
            if (var5.method410(arg2, arg0 ^ 0x9, arg3)) {
                var5.method414(arg2, arg3, (byte) -66, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
    public static void method536(byte arg0) {
        field1274 = null;
        if (arg0 != -127) {
            method532((char) 65423, (byte) -36);
        }
        field1279 = null;
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(B)V")
    public final void method537(byte arg0) {
        this.field1284 = 0;
        this.field1270 = 0;
        this.field1276 = 12800;
        if (arg0 != -56) {
            return;
        }
        this.field1285 = 12800;
        field1275++;
        for (class58 var2 = (class58) this.field1267.method8((byte) -98); var2 != null; var2 = (class58) this.field1267.method17((byte) -84)) {
            if (this.field1276 > var2.field995) {
                this.field1276 = var2.field995;
            }
            if (this.field1285 > var2.field992) {
                this.field1285 = var2.field992;
            }
            if (var2.field981 > this.field1284) {
                this.field1284 = var2.field981;
            }
            if (this.field1270 < var2.field983) {
                this.field1270 = var2.field983;
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lqh;ILuj;IIIZLin;)V")
    public static final void method538(class47 arg0, int arg1, class249 arg2, int arg3, int arg4, int arg5, boolean arg6, class56 arg7) {
        if (!arg6) {
            field1287 = -63;
        }
        field1278++;
        class286 var8 = new class286();
        var8.field4326 = arg4;
        var8.field4333 = arg1 << 7;
        var8.field4332 = arg5 << 7;
        if (arg7 != null) {
            var8.field4328 = arg7;
            int var10 = arg7.field915;
            int var11 = arg7.field967;
            if (arg3 == 1 || arg3 == 3) {
                var11 = arg7.field915;
                var10 = arg7.field967;
            }
            var8.field4319 = arg7.field954 << 7;
            var8.field4342 = arg7.field939;
            var8.field4335 = arg7.field906;
            var8.field4320 = arg7.field899;
            var8.field4323 = arg7.field903;
            var8.field4322 = arg5 + var11 << 7;
            var8.field4330 = arg1 + var10 << 7;
            var8.field4338 = arg7.field882;
            if (arg7.field892 != null) {
                var8.field4339 = true;
                var8.method1743(25996);
            }
            if (var8.field4342 != null) {
                var8.field4340 = (int) ((double) (var8.field4335 - var8.field4323) * Math.random()) + var8.field4323;
            }
            class14.field204.method4(1, var8);
        } else if (arg2 != null) {
            var8.field4341 = arg2;
            class245 var9 = arg2.field3819;
            if (var9.field3703 != null) {
                var8.field4339 = true;
                var9 = var9.method1477(class273.field4144, -12819);
            }
            if (var9 != null) {
                var8.field4322 = var9.field3707 + arg5 << 7;
                var8.field4330 = arg1 + var9.field3707 << 7;
                var8.field4320 = class108.method782(-1, arg2);
                var8.field4319 = var9.field3691 << 7;
                var8.field4338 = var9.field3684;
            }
            class414.field5999.method4(1, var8);
        } else if (arg0 != null) {
            var8.field4334 = arg0;
            var8.field4330 = arg1 + arg0.method337(0) << 7;
            var8.field4322 = arg0.method337(0) + arg5 << 7;
            var8.field4320 = class473.method2848(arg0, 0);
            var8.field4338 = arg0.field678;
            var8.field4319 = arg0.field702 << 7;
            class199.field3141.method2413((long) arg0.field2197, -1, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!co", name = "f", descriptor = "(I)[Lqi;")
    public static final class382[] method539(int arg0) {
        field1271++;
        return arg0 < 42 ? null : new class382[] { class77.field1378, class372.field5448, class504.field7623, class8.field98, class296.field4492, class292.field4454 };
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class72(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field1272 = arg0;
        this.field1269 = arg2;
        this.field1286 = arg3;
        this.field1268 = arg1;
        this.field1288 = arg6;
        this.field1283 = arg4;
        this.field1277 = arg5;
        if (this.field1288 == 255) {
            this.field1288 = 0;
        }
        this.field1267 = new class4();
    }
}
