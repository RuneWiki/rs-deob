import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class419 extends class200 {

    @OriginalMember(owner = "client!et", name = "w", descriptor = "I")
    public int field6252 = 0;

    @OriginalMember(owner = "client!et", name = "H", descriptor = "Z")
    public boolean field6262 = true;

    @OriginalMember(owner = "client!et", name = "E", descriptor = "I")
    public int field6259 = -1;

    @OriginalMember(owner = "client!et", name = "K", descriptor = "I")
    public int field6264 = 0;

    @OriginalMember(owner = "client!et", name = "L", descriptor = "I")
    public int field6265 = -1;

    @OriginalMember(owner = "client!et", name = "z", descriptor = "I")
    public int field6255 = 12800;

    @OriginalMember(owner = "client!et", name = "S", descriptor = "I")
    public int field6272 = 12800;

    @OriginalMember(owner = "client!et", name = "I", descriptor = "I")
    public int field6263;

    @OriginalMember(owner = "client!et", name = "C", descriptor = "I")
    public int field6258;

    @OriginalMember(owner = "client!et", name = "F", descriptor = "Ljava/lang/String;")
    public String field6260;

    @OriginalMember(owner = "client!et", name = "u", descriptor = "Ljava/lang/String;")
    public String field6250;

    @OriginalMember(owner = "client!et", name = "B", descriptor = "Lug;")
    public class392 field6257;

    @OriginalMember(owner = "client!et", name = "P", descriptor = "Liv;")
    public static class64 field6269;

    @OriginalMember(owner = "client!et", name = "U", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!et", name = "v", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!et", name = "x", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!et", name = "y", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!et", name = "A", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!et", name = "G", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!et", name = "M", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!et", name = "N", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!et", name = "Q", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!et", name = "T", descriptor = "Lbu;")
    public static class17 field6273;

    @OriginalMember(owner = "client!et", name = "R", descriptor = "Lce;")
    public static class201 field6271;

    @OriginalMember(owner = "client!et", name = "O", descriptor = "[Lf;")
    public static class529[] field6268;

    static {
        new class342("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field6269 = new class64(85, 4);
        field6274 = 1338;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(III[I)Z", line = 3)
    public final boolean method2528(int arg0, int arg1, int arg2, int[] arg3) {
        field6254++;
        if (arg0 != 0) {
            this.field6255 = 47;
        }
        for (class197 var5 = (class197) this.field6257.method2427(116); var5 != null; var5 = (class197) this.field6257.method2422(-93)) {
            if (var5.method1374(arg2, arg1, (byte) -77)) {
                var5.method1369(arg1, -1613, arg2, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(I)V", line = 31)
    public static void method2529(int arg0) {
        if (arg0 == 0) {
            field6269 = null;
            field6271 = null;
            field6273 = null;
            field6268 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I[III)Z", line = 47)
    public final boolean method2530(int arg0, int[] arg1, int arg2, int arg3) {
        field6266++;
        class197 var5 = (class197) this.field6257.method2427(117);
        if (arg0 != -13274) {
            return false;
        }
        while (var5 != null) {
            if (var5.method1372(arg2, false, arg3)) {
                var5.method1373(arg2, arg3, arg1, false);
                return true;
            }
            var5 = (class197) this.field6257.method2422(-123);
        }
        return false;
    }

    @OriginalMember(owner = "client!et", name = "f", descriptor = "(I)V", line = 77)
    public static final void method2531(int arg0) {
        field6253++;
        class346 var1 = null;
        try {
            class324 var2 = class368.field5553.method1856(0, "2");
            while (var2.field4940 == 0) {
                class71.method583(1L, arg0 + 55);
            }
            if (~var2.field4940 == arg0) {
                var1 = (class346) var2.field4939;
                byte[] var3 = new byte[(int) var1.method2200(false)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2198(var4, var3.length - var4, var3, false);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class240.method1568(false, new class145(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2199((byte) -122);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(III)Z", line = 123)
    public final boolean method2532(int arg0, int arg1, int arg2) {
        if (arg2 != 12800) {
            this.field6265 = -3;
        }
        field6251++;
        for (class197 var4 = (class197) this.field6257.method2427(105); var4 != null; var4 = (class197) this.field6257.method2422(-118)) {
            if (var4.method1374(arg1, arg0, (byte) -77)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!et", name = "g", descriptor = "(I)V", line = 153)
    public final void method2533(int arg0) {
        this.field6252 = 0;
        this.field6272 = arg0;
        this.field6255 = 12800;
        field6267++;
        this.field6264 = 0;
        for (class197 var2 = (class197) this.field6257.method2427(121); var2 != null; var2 = (class197) this.field6257.method2422(-108)) {
            if (var2.field2905 > this.field6252) {
                this.field6252 = var2.field2905;
            }
            if (this.field6272 > var2.field2904) {
                this.field6272 = var2.field2904;
            }
            if (this.field6255 > var2.field2900) {
                this.field6255 = var2.field2900;
            }
            if (this.field6264 < var2.field2916) {
                this.field6264 = var2.field2916;
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIZ)I", line = 188)
    public static final int method2534(int arg0, int arg1, boolean arg2) {
        field6270++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (!arg2) {
            method2536(-118, 33, -48);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!et", name = "h", descriptor = "(I)[Lko;", line = 211)
    public static final class347[] method2535(int arg0) {
        field6256++;
        int var1 = -49 / ((18 - arg0) / 37);
        return new class347[] { class296.field4205, class427.field6346, class521.field7739 };
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 296)
    public class419(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field6263 = arg0;
        this.field6259 = arg4;
        this.field6258 = arg3;
        this.field6265 = arg6;
        this.field6260 = arg1;
        this.field6250 = arg2;
        this.field6262 = arg5;
        if (this.field6265 == 255) {
            this.field6265 = 0;
        }
        this.field6257 = new class392();
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(III)Lrl;", line = 237)
    public static final class506 method2536(int arg0, int arg1, int arg2) {
        class429 var3 = class380.field5761[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6367;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(II[III)Z", line = 249)
    public final boolean method2537(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field6261++;
        if (arg4 != -26767) {
            method2534(51, -48, false);
        }
        for (class197 var6 = (class197) this.field6257.method2427(arg4 + 26880); var6 != null; var6 = (class197) this.field6257.method2422(arg4 + 26679)) {
            if (var6.method1371(arg3, arg1, arg0, 2)) {
                var6.method1369(arg0, -1613, arg1, arg2);
                return true;
            }
        }
        return false;
    }
}
