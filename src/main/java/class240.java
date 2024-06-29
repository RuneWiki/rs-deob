import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class240 {

    @OriginalMember(owner = "client!eia", name = "g", descriptor = "Lnga;")
    private class510 field3378 = new class510(256);

    @OriginalMember(owner = "client!eia", name = "d", descriptor = "Leq;")
    private class209 field3375;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "Lnt;")
    public static class220 field3372 = new class220();

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!eia", name = "c", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!eia", name = "e", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!eia", name = "f", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!eia", name = "h", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!eia", name = "i", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V", line = 5)
    public final void method1611(int arg0) {
        class510 var2 = this.field3378;
        synchronized (this.field3378) {
            if (arg0 != 8124) {
                return;
            }
            this.field3378.method3050(false);
        }
        field3377++;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(ILud;)V", line = 18)
    public static final void method1612(int arg0, class35 arg1) {
        field3380++;
        if ((arg1.field483.length - arg1.field469) < 1) {
            return;
        }
        int var2 = arg1.method273(255);
        if (var2 < 0 || var2 > 1 || arg0 < ~(arg1.field483.length - arg1.field469)) {
            return;
        }
        int var3 = arg1.method253(-13900);
        if ((var3 * 6) > (arg1.field483.length - arg1.field469)) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg1.method253(arg0 - 13897);
            int var6 = arg1.method234((byte) -128);
            if (class41.field598.length > var5 && class104.field1738[var5] && (class261.field3817.method3222(var5, 19).field1763 != '1' || var6 >= -1 && var6 <= 1)) {
                class41.field598[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(II)V", line = 69)
    public final void method1613(int arg0, int arg1) {
        field3374++;
        class510 var3 = this.field3378;
        synchronized (this.field3378) {
            this.field3378.method3049(arg1, (byte) 127);
            if (arg0 != 0) {
                this.field3375 = null;
            }
        }
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(IB)Lki;", line = 82)
    public final class705 method1614(int arg0, byte arg1) {
        field3376++;
        class510 var3 = this.field3378;
        class705 var4;
        synchronized (this.field3378) {
            var4 = (class705) this.field3378.method3054((byte) -93, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class209 var5 = this.field3375;
        byte[] var6;
        synchronized (this.field3375) {
            var6 = this.field3375.method1453(arg0, -121, 26);
        }
        int var7 = -93 % ((arg1 - 39) / 34);
        class705 var8 = new class705();
        if (var6 != null) {
            var8.method3954(new class35(var6), (byte) 126);
        }
        class510 var9 = this.field3378;
        synchronized (this.field3378) {
            this.field3378.method3047(false, var8, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "(I)V", line = 112)
    public final void method1615(int arg0) {
        class510 var2 = this.field3378;
        synchronized (this.field3378) {
            if (arg0 != -23953) {
                this.field3378 = null;
            }
            this.field3378.method3048(false);
        }
        field3373++;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(B)V", line = 127)
    public static void method1616(byte arg0) {
        if (arg0 != -112) {
            field3372 = null;
        }
        field3372 = null;
    }

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(IC)B", line = 142)
    public static final byte method1617(int arg0, char arg1) {
        field3379++;
        byte var2;
        if (arg1 > '\u0000' && arg1 < '\u0080' || arg1 >= ' ' && arg1 <= 'ÿ') {
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
        if (arg0 != 16697) {
            method1617(-20, '\n');
        }
        return var2;
    }

    @OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(Lcw;ILeq;)V", line = 273)
    public class240(class179 arg0, int arg1, class209 arg2) {
        this.field3375 = arg2;
        this.field3375.method1477(0, 26);
    }
}
