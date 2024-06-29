import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class755 {

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Ltq;")
    private class536 field10286 = new class536(64);

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Lwm;")
    private class30 field10284;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Lgh;")
    public static class54 field10287 = new class54(12, 0, 1, 0);

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field10282;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field10283;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field10285;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field10288;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field10289;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field10290;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field10291;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field10292;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
    public final void method4094(int arg0, int arg1) {
        class536 var3 = this.field10286;
        synchronized (this.field10286) {
            this.field10286.method2928(true, arg0);
        }
        if (arg1 == 12) {
            field10285++;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static void method4095(int arg0) {
        int var1 = 82 / ((arg0 - 78) / 45);
        field10287 = null;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    public final void method4096(int arg0) {
        class536 var2 = this.field10286;
        synchronized (this.field10286) {
            this.field10286.method2919(0);
        }
        field10290++;
        if (arg0 != -21052) {
            this.method4101(-8, -98);
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
    public static final void method4097(int arg0) {
        field10288++;
        if (class223.field3036 == null) {
            return;
        }
        class223.field3036 = null;
        if (arg0 != 8218) {
            method4097(-123);
        }
        class205.method1388(99, class29.field256, class400.field5303, class256.field3472, class650.field8290);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Z")
    public static final boolean method4098(int arg0, int arg1, int arg2) {
        field10283++;
        if (arg0 == 65536) {
            return (arg2 & 0x10000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IC)B")
    public static final byte method4099(int arg0, char arg1) {
        if (arg0 != -256) {
            return -44;
        }
        field10282++;
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
    public final void method4100(byte arg0) {
        field10291++;
        if (arg0 <= 57) {
            this.method4096(0);
        }
        class536 var2 = this.field10286;
        synchronized (this.field10286) {
            this.field10286.method2932((byte) 80);
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)Lmm;")
    public final class558 method4101(int arg0, int arg1) {
        field10289++;
        class536 var3 = this.field10286;
        class558 var4;
        synchronized (this.field10286) {
            var4 = (class558) this.field10286.method2931((long) arg0, (byte) -113);
        }
        if (var4 != null) {
            return var4;
        }
        class30 var5 = this.field10284;
        byte[] var6;
        synchronized (this.field10284) {
            var6 = this.field10284.method139(arg1, (byte) -94, arg0);
        }
        class558 var7 = new class558();
        if (var6 != null) {
            var7.method3027(new class234(var6), arg1 ^ 0x58);
        }
        class536 var8 = this.field10286;
        synchronized (this.field10286) {
            this.field10286.method2918((long) arg0, var7, 113);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lega;ILwm;)V")
    public class755(class473 arg0, int arg1, class30 arg2) {
        this.field10284 = arg2;
        if (this.field10284 != null) {
            this.field10284.method138(0, 11);
        }
    }
}
