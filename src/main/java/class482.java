import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class482 {

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "Ljo;")
    private class382 field7125 = new class382(16);

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Lok;")
    private class74 field7117;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field7122 = new CRC32();

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field7114;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Ll;")
    public static class127 field7121;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "Lns;")
    public static class62 field7126;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 7)
    public final void method2872(int arg0) {
        class382 var2 = this.field7125;
        synchronized (this.field7125) {
            this.field7125.method2293(false);
            if (arg0 != 28666) {
                field7122 = null;
            }
        }
        field7116++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)V", line = 21)
    public static final void method2873(int arg0, boolean arg1) {
        if (arg1) {
            field7120++;
            class506 var2 = class14.method185(-1304589728, arg0, 9);
            var2.method2986(-82);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BIC)I", line = 37)
    public static final int method2874(byte arg0, int arg1, char arg2) {
        if (arg0 <= 47) {
            return 70;
        }
        field7123++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V", line = 61)
    public final void method2875(byte arg0) {
        field7114++;
        if (arg0 == -43) {
            class382 var2 = this.field7125;
            synchronized (this.field7125) {
                this.field7125.method2287(82);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIZ)I", line = 74)
    public static final int method2876(int arg0, int arg1, boolean arg2) {
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        field7124++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg2) {
            field7122 = null;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Loo;", line = 95)
    public static final class31 method2877(int arg0, int arg1) {
        field7119++;
        if (arg1 != -29080) {
            return null;
        }
        class31[] var2 = class412.method2470((byte) -88);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class31 var4 = var2[var3];
            if (var4.field447 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V", line = 123)
    public static void method2878(byte arg0) {
        if (arg0 != -60) {
            field7122 = null;
        }
        field7122 = null;
        field7121 = null;
        field7126 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V", line = 135)
    public static final void method2879(boolean arg0) {
        field7127++;
        if (class130.field1926 == 5) {
            if (arg0) {
                method2882(-5, 105, 87, -122, 113, 90, -5, 34, 84);
            }
            class130.field1926 = 6;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)V", line = 155)
    public final void method2880(int arg0, byte arg1) {
        class382 var3 = this.field7125;
        synchronized (this.field7125) {
            this.field7125.method2294(arg0, true);
        }
        int var4 = 68 % ((-arg1 - 35) / 39);
        field7115++;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)Lvm;", line = 170)
    public final class317 method2881(int arg0, int arg1) {
        field7118++;
        class382 var3 = this.field7125;
        class317 var4;
        synchronized (this.field7125) {
            var4 = (class317) this.field7125.method2288((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class74 var5 = this.field7117;
        byte[] var6;
        synchronized (this.field7117) {
            var6 = this.field7117.method541(arg0, 30, (byte) -122);
        }
        class317 var7 = new class317();
        if (var6 != null) {
            var7.method1981(new class468(var6), -128);
        }
        class382 var8 = this.field7125;
        synchronized (this.field7125) {
            this.field7125.method2290((long) arg0, var7, 101);
        }
        if (arg1 != -27862) {
            method2876(-32, -75, true);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIIII)Z", line = 200)
    public static final boolean method2882(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field7128++;
        if (arg0 >= arg1 + arg4 || arg1 >= (arg0 + arg2)) {
            return false;
        } else if (arg3 < (arg6 + arg8) && arg3 + arg7 > arg6) {
            return arg5 > -98 ? true : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lkr;ILok;)V", line = 222)
    public class482(class262 arg0, int arg1, class74 arg2) {
        this.field7117 = arg2;
        this.field7117.method536(false, 30);
    }
}
