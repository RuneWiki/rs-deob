import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class278 {

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "[I")
    private int[] field3481 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field3476 = 0;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field3478 = -1;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "Lcn;")
    public class21 field3477;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "[I")
    private int[] field3486;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "[S")
    private short[] field3479;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "[S")
    private short[] field3482;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "[S")
    private short[] field3483;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "[S")
    private short[] field3487;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILjava/lang/String;)V", line = 4)
    public static final void method1577(int arg0, String arg1) {
        if (arg0 != -2747) {
            method1577(-71, null);
        }
        System.exit(1);
        field3484++;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)Leg;", line = 24)
    public final class47 method1578(int arg0) {
        field3480++;
        if (this.field3486 == null) {
            return null;
        }
        class47[] var2 = new class47[this.field3486.length];
        class612 var3 = this.field3477.field326;
        synchronized (this.field3477.field326) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field3486.length) {
                    break;
                }
                var2[var4] = class156.method893(this.field3486[var4], this.field3477.field326, 0, false);
                var4++;
            }
        }
        int var5 = -87 % ((arg0 + 26) / 51);
        for (int var6 = 0; var6 < this.field3486.length; var6++) {
            if (var2[var6].field667 < 13) {
                var2[var6].method296((byte) -107, 2);
            }
        }
        class47 var7;
        if (var2.length == 1) {
            var7 = var2[0];
        } else {
            var7 = new class47(var2, var2.length);
        }
        if (var7 == null) {
            return null;
        }
        if (this.field3479 != null) {
            for (int var8 = 0; var8 < this.field3479.length; var8++) {
                var7.method300(this.field3479[var8], (byte) -111, this.field3482[var8]);
            }
        }
        if (this.field3483 != null) {
            for (int var9 = 0; var9 < this.field3483.length; var9++) {
                var7.method291(this.field3483[var9], -60, this.field3487[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)Z", line = 95)
    public static final boolean method1579(int arg0, int arg1) {
        field3485++;
        if (arg0 < 12) {
            field3478 = 63;
        }
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILes;)V", line = 106)
    public final void method1580(int arg0, class630 arg1) {
        field3490++;
        if (arg0 < 5) {
            return;
        }
        while (true) {
            int var3 = arg1.method3501(-9268);
            if (var3 == 0) {
                return;
            }
            this.method1583(var3, arg1, false);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)Z", line = 134)
    public final boolean method1581(boolean arg0) {
        field3488++;
        if (this.field3486 == null) {
            return true;
        }
        boolean var2 = arg0;
        class612 var3 = this.field3477.field326;
        synchronized (this.field3477.field326) {
            for (int var4 = 0; var4 < this.field3486.length; var4++) {
                if (!this.field3477.field326.method3370(0, (byte) 75, this.field3486[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(Z)Leg;", line = 160)
    public final class47 method1582(boolean arg0) {
        field3492++;
        class47[] var2 = new class47[5];
        if (arg0) {
            field3476 = 102;
        }
        int var3 = 0;
        class612 var4 = this.field3477.field326;
        synchronized (this.field3477.field326) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field3481[var5] != -1) {
                    var2[var3++] = class156.method893(this.field3481[var5], this.field3477.field326, 0, false);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field667 < 13) {
                var2[var6].method296((byte) -107, 2);
            }
        }
        class47 var7 = new class47(var2, var3);
        if (this.field3479 != null) {
            for (int var8 = 0; var8 < this.field3479.length; var8++) {
                var7.method300(this.field3479[var8], (byte) 55, this.field3482[var8]);
            }
        }
        if (this.field3483 != null) {
            for (int var9 = 0; var9 < this.field3483.length; var9++) {
                var7.method291(this.field3483[var9], 120, this.field3487[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILes;Z)V", line = 234)
    private final void method1583(int arg0, class630 arg1, boolean arg2) {
        field3491++;
        if (arg0 == 1) {
            arg1.method3501(-9268);
        } else if (arg0 == 2) {
            int var4 = arg1.method3501(-9268);
            this.field3486 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3486[var5] = arg1.method3470(13111);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var8 = arg1.method3501(-9268);
                this.field3482 = new short[var8];
                this.field3479 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field3479[var9] = (short) arg1.method3470(13111);
                    this.field3482[var9] = (short) arg1.method3470(13111);
                }
            } else if (arg0 == 41) {
                int var6 = arg1.method3501(-9268);
                this.field3487 = new short[var6];
                this.field3483 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field3483[var7] = (short) arg1.method3470(13111);
                    this.field3487[var7] = (short) arg1.method3470(13111);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field3481[arg0 - 60] = arg1.method3470(13111);
            }
        }
        if (arg2) {
            this.field3477 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)Z", line = 325)
    public final boolean method1584(byte arg0) {
        field3489++;
        boolean var2 = true;
        if (arg0 >= -67) {
            return false;
        }
        class612 var3 = this.field3477.field326;
        synchronized (this.field3477.field326) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field3481[var4] != -1 && !this.field3477.field326.method3370(0, (byte) 79, this.field3481[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }
}
