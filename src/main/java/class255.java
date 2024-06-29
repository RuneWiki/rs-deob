import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class255 {

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "Lvg;")
    private class49 field4058 = new class49(64);

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "Lvg;")
    public class49 field4065 = new class49(2);

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "Lri;")
    private class97 field4054;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "Lri;")
    public class97 field4060;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "[I")
    public static int[] field4052 = new int[16];

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "Z")
    public static boolean field4063 = false;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Lmq;")
    public static class470 field4053;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "Lfl;")
    public static class687 field4056;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 5)
    public final void method1803(int arg0) {
        field4055++;
        class49 var2 = this.field4058;
        synchronized (this.field4058) {
            this.field4058.method569(0);
        }
        class49 var3 = this.field4065;
        synchronized (this.field4065) {
            this.field4065.method569(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)Z", line = 18)
    public static final boolean method1804(int arg0, int arg1) {
        field4059++;
        if (arg0 == -5737) {
            return arg1 == 4 || arg1 == 8 || arg1 == 11;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V", line = 29)
    public static final void method1805(byte arg0) {
        field4057++;
        int var1 = 0;
        if (class17.field282 != null) {
            var1 = class17.field282.method2086(32416, class497.field7259);
        }
        if (var1 == 2) {
            int var4 = class235.field3727 <= 800 ? class235.field3727 : 800;
            class56.field732 = var4;
            int var5 = class101.field1659 > 600 ? 600 : class101.field1659;
            class290.field4596 = (class235.field3727 - var4) / 2;
            class425.field6468 = 0;
            class259.field4147 = var5;
        } else if (var1 == 1) {
            int var2 = class235.field3727 <= 1024 ? class235.field3727 : 1024;
            class290.field4596 = (class235.field3727 - var2) / 2;
            int var3 = class101.field1659 > 768 ? 768 : class101.field1659;
            class56.field732 = var2;
            class425.field6468 = 0;
            class259.field4147 = var3;
        } else {
            class259.field4147 = class101.field1659;
            class56.field732 = class235.field3727;
            class425.field6468 = 0;
            class290.field4596 = 0;
        }
        if (arg0 > -84) {
            field4053 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IB)Lct;", line = 76)
    public final class131 method1806(int arg0, byte arg1) {
        field4066++;
        class49 var3 = this.field4058;
        class131 var4;
        synchronized (this.field4058) {
            if (arg1 != 81) {
                method1809(45L, false, 92, 66, (byte) -80);
            }
            var4 = (class131) this.field4058.method560(false, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class97 var5 = this.field4054;
        byte[] var6;
        synchronized (this.field4054) {
            var6 = this.field4054.method926(33, -127, arg0);
        }
        class131 var7 = new class131();
        var7.field2143 = this;
        if (var6 != null) {
            var7.method1143(new class6(var6), (byte) -90);
        }
        class49 var8 = this.field4058;
        synchronized (this.field4058) {
            this.field4058.method559(var7, (long) arg0, 0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)V", line = 113)
    public static final void method1807(byte arg0) {
        field4064++;
        class640 var1 = (class640) class580.field8270.method3465((byte) 124);
        if (arg0 <= 10) {
            method1809(110L, false, 93, -37, (byte) 85);
        }
        while (var1 != null) {
            if (var1.field8983 > 0) {
                var1.field8983--;
            }
            if (var1.field8983 != 0) {
                if (var1.field8979 > 0) {
                    var1.field8979--;
                }
                if (var1.field8979 == 0 && var1.field8975 >= 1 && var1.field8980 >= 1 && (class275.field4426 - 2) >= var1.field8975 && class417.field6374 - 2 >= var1.field8980 && (var1.field8982 < 0 || class508.method3086(var1.field8978, var1.field8982, 115))) {
                    class700.method3952(var1.field8978, 107, var1.field8975, var1.field8981, -1, var1.field8972, var1.field8971, var1.field8982, var1.field8980);
                    var1.field8979 = -1;
                    if (var1.field8982 == var1.field8973 && var1.field8973 == -1) {
                        var1.method707((byte) -82);
                    } else if (var1.field8982 == var1.field8973 && var1.field8981 == var1.field8976 && var1.field8978 == var1.field8974) {
                        var1.method707((byte) -125);
                    }
                }
            } else if (var1.field8973 < 0 || class508.method3086(var1.field8974, var1.field8973, 72)) {
                class700.method3952(var1.field8974, 109, var1.field8975, var1.field8976, -1, var1.field8972, var1.field8971, var1.field8973, var1.field8980);
                var1.method707((byte) -108);
            }
            var1 = (class640) class580.field8270.method3469(0);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V", line = 173)
    public static void method1808(boolean arg0) {
        if (arg0) {
            field4063 = false;
        }
        field4052 = null;
        field4053 = null;
        field4056 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(JZIIB)Ljava/lang/String;", line = 192)
    public static final String method1809(long arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        field4062++;
        char var6 = ',';
        char var7 = '.';
        if (arg2 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg2 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg0 < 0L) {
            var8 = true;
            arg0 = -arg0;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg3 > 0) {
            for (int var10 = 0; var10 < arg3; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg0 * 10)));
            }
            var9.append(var6);
        }
        if (arg4 != -104) {
            return null;
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg0 * 10)));
            if (arg0 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lei;ILri;Lri;)V", line = 317)
    public class255(class162 arg0, int arg1, class97 arg2, class97 arg3) {
        this.field4054 = arg2;
        this.field4060 = arg3;
        this.field4054.method949(33, 0);
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V", line = 278)
    public final void method1810(int arg0) {
        class49 var2 = this.field4058;
        synchronized (this.field4058) {
            this.field4058.method563(0);
            if (arg0 > -60) {
                this.method1810(-128);
            }
        }
        field4061++;
        class49 var3 = this.field4065;
        synchronized (this.field4065) {
            this.field4065.method563(0);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)V", line = 303)
    public final void method1811(int arg0, int arg1) {
        class49 var3 = this.field4058;
        synchronized (this.field4058) {
            this.field4058.method573((byte) 124, arg0);
        }
        field4067++;
        class49 var4 = this.field4065;
        synchronized (this.field4065) {
            this.field4065.method573((byte) 125, arg0);
            int var5 = -27 % ((80 - arg1) / 44);
        }
    }
}
