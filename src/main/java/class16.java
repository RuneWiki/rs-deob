import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class16 {

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public int field218 = 128;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Z")
    public boolean field213 = true;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public int field229 = -1;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    private int field231 = 0;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "Lwm;")
    private static class152 field217 = class157.method1048("glow2:", 112);

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "Lwm;")
    public static class152 field227 = field217;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lwm;")
    public static class152 field214 = field217;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Lwm;")
    public static class152 field212 = class157.method1048("clignotant3:", 112);

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field223 = 0;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "Loe;")
    public static class127 field225 = null;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public int field221;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public int field222;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public int field228;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public int field230;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B[B)Lrd;", line = 7)
    public static final class171 method100(byte arg0, byte[] arg1) {
        field216++;
        if (arg1 == null) {
            return null;
        }
        class171 var2;
        if (class217.field3516) {
            var2 = new class126(arg1, class180.field2865, class179.field2856, class253.field4383, class8.field106, class23.field403);
        } else {
            var2 = new class158(arg1, class180.field2865, class179.field2856, class253.field4383, class8.field106, class23.field403);
        }
        if (arg0 != -7) {
            method105(-116, -14);
        }
        class132.method841((byte) 107);
        return var2;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lhi;II)V", line = 29)
    public final void method101(class291 arg0, int arg1, int arg2) {
        field224++;
        if (arg1 != -1) {
            return;
        }
        while (true) {
            int var4 = arg0.method2011(arg1 - 101);
            if (var4 == 0) {
                return;
            }
            this.method106(false, arg2, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V", line = 59)
    private final void method102(int arg0, int arg1) {
        field215++;
        double var3 = (double) ((arg0 & 0xFF1B19) >> 16) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        if (arg1 != 1002) {
            this.method101((class291) null, -103, -123);
        }
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = (var9 + var11) / 2.0D;
        double var17 = 0.0D;
        if (var9 != var11) {
            if (var15 < 0.5D) {
                var17 = (var11 - var9) / (var9 + var11);
            }
            if (var15 >= 0.5D) {
                var17 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        this.field228 = (int) (var17 * 256.0D);
        this.field230 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field228 < 0) {
            this.field228 = 0;
        } else if (this.field228 > 255) {
            this.field228 = 255;
        }
        if (var15 > 0.5D) {
            this.field221 = (int) ((1.0D - var15) * var17 * 512.0D);
        } else {
            this.field221 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field221 < 1) {
            this.field221 = 1;
        }
        this.field222 = (int) ((double) this.field221 * var19);
        if (this.field230 < 0) {
            this.field230 = 0;
        } else if (this.field230 > 255) {
            this.field230 = 255;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V", line = 151)
    public static void method103(byte arg0) {
        field214 = null;
        field227 = null;
        field212 = null;
        field225 = null;
        field217 = null;
        int var1 = 97 / ((arg0 + 47) / 33);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIII)V", line = 170)
    public static final void method104(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field220++;
        if (arg3 != 0) {
            field227 = (class152) null;
        }
        if (arg1 - arg2 >= class308.field5283 && class238.field3902 >= (arg1 + arg2) && arg4 - arg2 >= class157.field2505 && class110.field1553 >= (arg2 + arg4)) {
            class120.method780(arg3 - 76, arg1, arg2, arg0, arg4);
        } else {
            class251.method1734(arg4, arg2, arg0, arg1, 8);
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)V", line = 203)
    public static final void method105(int arg0, int arg1) {
        field226++;
        class303 var2 = class90.method589(false, arg1, arg0);
        var2.method2114((byte) 110);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZILhi;I)V", line = 219)
    private final void method106(boolean arg0, int arg1, class291 arg2, int arg3) {
        field219++;
        if (arg3 == 1) {
            this.field231 = arg2.method2009((byte) 64);
            this.method102(this.field231, 1002);
        } else if (arg3 == 2) {
            this.field229 = arg2.method2021((byte) 74);
            if (this.field229 == 65535) {
                this.field229 = -1;
            }
        } else if (arg3 == 3) {
            this.field218 = arg2.method2021((byte) 74);
        } else if (arg3 == 4) {
            this.field213 = false;
        }
        if (arg0) {
            method104(40, -123, -94, -47, 102);
        }
    }
}
