import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class589 {

    @OriginalMember(owner = "client!rha", name = "l", descriptor = "[I")
    private int[] field8452 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!rha", name = "m", descriptor = "I")
    public static int field8453 = -1;

    @OriginalMember(owner = "client!rha", name = "r", descriptor = "Low;")
    public static class747 field8458 = new class747("", 16);

    @OriginalMember(owner = "client!rha", name = "t", descriptor = "Z")
    public static boolean field8460 = false;

    @OriginalMember(owner = "client!rha", name = "s", descriptor = "Lqk;")
    public static class148 field8459 = new class148(4, -2);

    @OriginalMember(owner = "client!rha", name = "v", descriptor = "Lqk;")
    public static class148 field8462 = new class148(76, -1);

    @OriginalMember(owner = "client!rha", name = "d", descriptor = "I")
    public static int field8444;

    @OriginalMember(owner = "client!rha", name = "e", descriptor = "I")
    public static int field8445;

    @OriginalMember(owner = "client!rha", name = "f", descriptor = "I")
    public static int field8446;

    @OriginalMember(owner = "client!rha", name = "g", descriptor = "I")
    public static int field8447;

    @OriginalMember(owner = "client!rha", name = "h", descriptor = "I")
    public static int field8448;

    @OriginalMember(owner = "client!rha", name = "k", descriptor = "I")
    public static int field8451;

    @OriginalMember(owner = "client!rha", name = "o", descriptor = "I")
    public static int field8455;

    @OriginalMember(owner = "client!rha", name = "q", descriptor = "I")
    public static int field8457;

    @OriginalMember(owner = "client!rha", name = "u", descriptor = "I")
    public static int field8461;

    @OriginalMember(owner = "client!rha", name = "x", descriptor = "I")
    public static int field8464;

    @OriginalMember(owner = "client!rha", name = "i", descriptor = "Lbaa;")
    public class129 field8449;

    @OriginalMember(owner = "client!rha", name = "w", descriptor = "Lcw;")
    public static class21 field8463;

    @OriginalMember(owner = "client!rha", name = "c", descriptor = "[I")
    private int[] field8443;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "[S")
    private short[] field8441;

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "[S")
    private short[] field8442;

    @OriginalMember(owner = "client!rha", name = "j", descriptor = "[S")
    private short[] field8450;

    @OriginalMember(owner = "client!rha", name = "p", descriptor = "[S")
    private short[] field8456;

    @OriginalMember(owner = "client!rha", name = "n", descriptor = "[[I")
    public static int[][] field8454;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(B)Z", line = 8)
    public final boolean method3494(byte arg0) {
        field8444++;
        boolean var2 = true;
        class557 var3 = this.field8449.field1759;
        synchronized (this.field8449.field1759) {
            if (arg0 != 126) {
                return true;
            }
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field8452[var5] != -1 && !this.field8449.field1759.method3321(this.field8452[var5], (byte) 103, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(IBLvj;)V", line = 36)
    private final void method3495(int arg0, byte arg1, class26 arg2) {
        if (arg0 == 1) {
            arg2.method194((byte) 119);
        } else if (arg0 == 2) {
            int var8 = arg2.method194((byte) 119);
            this.field8443 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field8443[var9] = arg2.method193(2);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var6 = arg2.method194((byte) 119);
                this.field8456 = new short[var6];
                this.field8442 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field8442[var7] = (short) arg2.method193(2);
                    this.field8456[var7] = (short) arg2.method193(2);
                }
            } else if (arg0 == 41) {
                int var4 = arg2.method194((byte) 119);
                this.field8441 = new short[var4];
                this.field8450 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field8450[var5] = (short) arg2.method193(2);
                    this.field8441[var5] = (short) arg2.method193(2);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field8452[arg0 - 60] = arg2.method193(2);
            }
        }
        int var10 = -69 / ((arg1 + 41) / 41);
        field8455++;
    }

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "(B)V", line = 122)
    public static void method3496(byte arg0) {
        field8458 = null;
        field8462 = null;
        if (arg0 <= 24) {
            field8461 = -45;
        }
        field8454 = null;
        field8463 = null;
        field8459 = null;
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(IIIILad;)V", line = 136)
    public static final void method3497(int arg0, int arg1, int arg2, int arg3, class175 arg4) {
        field8446++;
        long var5 = (long) (arg3 | arg0 << 28 | arg1 << 14);
        class731 var7 = (class731) class118.field1631.method1381(true, var5);
        if (arg2 <= 81) {
            field8453 = -19;
        }
        if (var7 == null) {
            class731 var8 = new class731();
            class118.field1631.method1387(var8, var5, (byte) -113);
            var8.field10232.method3116(29066, arg4);
            return;
        }
        class544 var9 = class487.field6572.method3054(arg4.field2379, (byte) -99);
        int var10 = var9.field7638;
        if (var9.field7626 == 1) {
            var10 = (arg4.field2383 + 1) * var10;
        }
        for (class175 var11 = (class175) var7.field10232.method3118((byte) 73); var11 != null; var11 = (class175) var7.field10232.method3111(121)) {
            class544 var12 = class487.field6572.method3054(var11.field2379, (byte) -99);
            int var13 = var12.field7638;
            if (var12.field7626 == 1) {
                var13 = (var11.field2383 + 1) * var13;
            }
            if (var10 > var13) {
                class104.method705(false, arg4, var11);
                return;
            }
        }
        var7.field10232.method3116(29066, arg4);
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(Lvj;B)V", line = 190)
    public final void method3498(class26 arg0, byte arg1) {
        if (arg1 != 31) {
            field8460 = true;
        }
        field8447++;
        while (true) {
            int var3 = arg0.method194((byte) 119);
            if (var3 == 0) {
                return;
            }
            this.method3495(var3, (byte) 19, arg0);
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)Z", line = 212)
    public final boolean method3499(int arg0) {
        field8448++;
        if (this.field8443 == null) {
            return true;
        }
        if (arg0 > -121) {
            this.method3499(25);
        }
        boolean var2 = true;
        class557 var3 = this.field8449.field1759;
        synchronized (this.field8449.field1759) {
            for (int var4 = 0; var4 < this.field8443.length; var4++) {
                if (!this.field8449.field1759.method3321(this.field8443[var4], (byte) 120, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "(I)Lkda;", line = 248)
    public final class64 method3500(int arg0) {
        field8445++;
        if (this.field8443 == null) {
            return null;
        }
        class64[] var2 = new class64[this.field8443.length];
        class557 var3 = this.field8449.field1759;
        synchronized (this.field8449.field1759) {
            int var4 = 0;
            while (true) {
                if (this.field8443.length <= var4) {
                    break;
                }
                var2[var4] = class86.method524(this.field8449.field1759, this.field8443[var4], -66, 0);
                var4++;
            }
        }
        int var5 = 0;
        if (arg0 >= -52) {
            return null;
        }
        while (var5 < this.field8443.length) {
            if (var2[var5].field873 < 13) {
                var2[var5].method412(85, 2);
            }
            var5++;
        }
        class64 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class64(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field8442 != null) {
            for (int var7 = 0; var7 < this.field8442.length; var7++) {
                var6.method416(this.field8456[var7], this.field8442[var7], -4903);
            }
        }
        if (this.field8450 != null) {
            for (int var8 = 0; var8 < this.field8450.length; var8++) {
                var6.method423(this.field8450[var8], this.field8441[var8], 0);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!rha", name = "c", descriptor = "(I)Lkda;", line = 329)
    public final class64 method3501(int arg0) {
        field8451++;
        class64[] var2 = new class64[5];
        int var3 = 12 / ((arg0 - 61) / 59);
        int var4 = 0;
        class557 var5 = this.field8449.field1759;
        synchronized (this.field8449.field1759) {
            int var6 = 0;
            while (true) {
                if (var6 >= 5) {
                    break;
                }
                if (this.field8452[var6] != -1) {
                    var2[var4++] = class86.method524(this.field8449.field1759, this.field8452[var6], -66, 0);
                }
                var6++;
            }
        }
        for (int var7 = 0; var7 < 5; var7++) {
            if (var2[var7] != null && var2[var7].field873 < 13) {
                var2[var7].method412(67, 2);
            }
        }
        class64 var8 = new class64(var2, var4);
        if (this.field8442 != null) {
            for (int var9 = 0; var9 < this.field8442.length; var9++) {
                var8.method416(this.field8456[var9], this.field8442[var9], -4903);
            }
        }
        if (this.field8450 != null) {
            for (int var10 = 0; var10 < this.field8450.length; var10++) {
                var8.method423(this.field8450[var10], this.field8441[var10], 0);
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(IZI)Ljl;", line = 401)
    public static final class596 method3502(int arg0, boolean arg1, int arg2) {
        field8457++;
        class336[] var3 = class704.field9787;
        synchronized (class704.field9787) {
            if (arg2 != 0) {
                field8460 = false;
            }
            class596 var4;
            if (arg0 >= class704.field9787.length || class704.field9787[arg0].method1950(-107)) {
                var4 = new class596();
                var4.field8579 = new class247[arg0];
                for (int var5 = 0; var5 < arg0; var5++) {
                    var4.field8579[var5] = new class247();
                }
            } else {
                var4 = (class596) class704.field9787[arg0].method1949(true);
                var4.method1(-59);
                int var10002 = class296.field3860[arg0]--;
            }
            var4.field8578 = arg1;
            return var4;
        }
    }
}
