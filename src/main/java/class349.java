import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class349 {

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "Lad;")
    private class11 field4468 = new class11(256);

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "Ldn;")
    private class201 field4465;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "Z")
    public static boolean field4470 = false;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "Lcp;")
    public static class515 field4464 = new class515(0, 0);

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
    public static int field4474 = 10;

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "F")
    public static float field4473;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "Lf;")
    public static class404 field4462;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "[I")
    public static int[] field4472;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V", line = 4)
    public final void method2050(byte arg0) {
        class11 var2 = this.field4468;
        synchronized (this.field4468) {
            this.field4468.method84(-103);
        }
        field4466++;
        if (arg0 != -103) {
            this.method2055(17, -56);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V", line = 17)
    public final void method2051(int arg0, int arg1) {
        class11 var3 = this.field4468;
        synchronized (this.field4468) {
            this.field4468.method80(-104, arg1);
        }
        if (arg0 < -73) {
            field4463++;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZILjava/lang/String;)V", line = 32)
    public static final void method2052(boolean arg0, int arg1, String arg2) {
        if (arg0) {
            field4474 = -45;
        }
        field4469++;
        class436 var3 = class459.method2712(3, arg1, -1759243680);
        var3.method2574((byte) 66);
        var3.field5975 = arg2;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)Z", line = 46)
    public static final boolean method2053(int arg0, int arg1, int arg2) {
        field4471++;
        if (arg2 != 256) {
            method2053(24, -68, -95);
        }
        return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Z)V", line = 67)
    public final void method2054(boolean arg0) {
        class11 var2 = this.field4468;
        synchronized (this.field4468) {
            this.field4468.method90((byte) -27);
            if (arg0) {
                this.method2051(-46, 82);
            }
        }
        field4467++;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(II)Lih;", line = 82)
    public final class122 method2055(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method2055(-73, -17);
        }
        field4461++;
        class11 var3 = this.field4468;
        class122 var4;
        synchronized (this.field4468) {
            var4 = (class122) this.field4468.method78((long) arg0, (byte) -126);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4465.method1313((byte) -118, 26, arg0);
        class122 var6 = new class122();
        if (var5 != null) {
            var6.method780((byte) 77, new class88(var5));
        }
        class11 var7 = this.field4468;
        synchronized (this.field4468) {
            this.field4468.method88((long) arg0, 120, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)V", line = 112)
    public static void method2056(byte arg0) {
        field4462 = null;
        field4464 = null;
        field4472 = null;
        if (arg0 != -104) {
            field4474 = -5;
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lgt;ILdn;)V", line = 128)
    public class349(class65 arg0, int arg1, class201 arg2) {
        this.field4465 = arg2;
        this.field4465.method1302(-63, 26);
    }
}
