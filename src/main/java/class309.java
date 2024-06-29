import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class309 {

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "[I")
    private int[] field3963 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "[B")
    public static byte[] field3962 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "Lkg;")
    public static class179 field3959 = new class179(80, -1);

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "Lgq;")
    public class357 field3966;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "[I")
    private int[] field3964;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "[S")
    private short[] field3949;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "[S")
    private short[] field3955;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "[S")
    private short[] field3958;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "[S")
    private short[] field3961;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
    public static final void method1800(int arg0) {
        if (arg0 != 810439968) {
            field3967 = 41;
        }
        field3951++;
        class303.field3890.method282(((float) class407.field5817.field3655 * 0.1F + 0.7F) * class414.field5898);
        class303.field3890.method328(class75.field972, class108.field1358, class450.field6492, (float) (class461.field6586 << 0), (float) (class402.field5732 << 0), (float) (class351.field4508 << 0));
        class303.field3890.method294(class299.field3853);
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)Lmb;")
    public final class173 method1801(int arg0) {
        field3960++;
        if (this.field3964 == null) {
            return null;
        }
        class173[] var2 = new class173[this.field3964.length];
        class47 var3 = this.field3966.field4595;
        synchronized (this.field3966.field4595) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field3964.length) {
                    break;
                }
                var2[var4] = class457.method2711(false, this.field3964[var4], 0, this.field3966.field4595);
                var4++;
            }
        }
        int var5 = 0;
        if (arg0 > -52) {
            this.field3958 = null;
        }
        while (this.field3964.length > var5) {
            if (var2[var5].field2200 < 13) {
                var2[var5].method1111(0, -65);
            }
            var5++;
        }
        class173 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class173(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field3955 != null) {
            for (int var7 = 0; var7 < this.field3955.length; var7++) {
                var6.method1102(588021775, this.field3961[var7], this.field3955[var7]);
            }
        }
        if (this.field3949 != null) {
            for (int var8 = 0; var8 < this.field3949.length; var8++) {
                var6.method1099((byte) -115, this.field3949[var8], this.field3958[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILfh;B)V")
    private final void method1802(int arg0, class463 arg1, byte arg2) {
        int var4 = 1 % ((-arg2 - 40) / 47);
        if (arg0 == 1) {
            arg1.method2737(false);
        } else if (arg0 == 2) {
            int var9 = arg1.method2737(false);
            this.field3964 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3964[var10] = arg1.method2758((byte) 103);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var7 = arg1.method2737(false);
                this.field3955 = new short[var7];
                this.field3961 = new short[var7];
                for (int var8 = 0; var8 < var7; var8++) {
                    this.field3955[var8] = (short) arg1.method2758((byte) 81);
                    this.field3961[var8] = (short) arg1.method2758((byte) 77);
                }
            } else if (arg0 == 41) {
                int var5 = arg1.method2737(false);
                this.field3949 = new short[var5];
                this.field3958 = new short[var5];
                for (int var6 = 0; var6 < var5; var6++) {
                    this.field3949[var6] = (short) arg1.method2758((byte) 98);
                    this.field3958[var6] = (short) arg1.method2758((byte) 120);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field3963[arg0 - 60] = arg1.method2758((byte) 97);
            }
        }
        field3952++;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)V")
    public static final void method1803(int arg0, int arg1) {
        field3956++;
        if (class131.field1723 == arg0) {
            return;
        }
        class452.field6526 = class440.field6307 = class11.field197[arg0];
        class109.method797(0);
        class225.field2867 = new int[4][class452.field6526 >> 3][class440.field6307 >> 3];
        class23.field341 = new int[class452.field6526][class440.field6307];
        if (arg1 != -30493) {
            return;
        }
        class300.field3868 = new int[class452.field6526][class440.field6307];
        for (int var2 = 0; var2 < 4; var2++) {
            class172.field2185[var2] = class91.method711(class452.field6526, class440.field6307, -5);
        }
        class387.field5105 = new byte[4][class452.field6526][class440.field6307];
        class218.method1339(4, class440.field6307, class452.field6526, (byte) -125);
        class162.method1041(class33.field416, class440.field6307 >> 3, (byte) 2, class452.field6526 >> 3);
        class131.field1723 = arg0;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)Z")
    public final boolean method1804(boolean arg0) {
        field3965++;
        if (this.field3964 == null) {
            return true;
        }
        boolean var2 = arg0;
        class47 var3 = this.field3966.field4595;
        synchronized (this.field3966.field4595) {
            for (int var4 = 0; var4 < this.field3964.length; var4++) {
                if (!this.field3966.field4595.method471(this.field3964[var4], (byte) -102, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)Lmb;")
    public final class173 method1805(byte arg0) {
        field3950++;
        class173[] var2 = new class173[5];
        int var3 = 0;
        class47 var4 = this.field3966.field4595;
        synchronized (this.field3966.field4595) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field3963[var5] != -1) {
                    var2[var3++] = class457.method2711(false, this.field3963[var5], 0, this.field3966.field4595);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field2200 < 13) {
                var2[var6].method1111(0, -59);
            }
        }
        class173 var7 = new class173(var2, var3);
        if (this.field3955 != null) {
            for (int var8 = 0; var8 < this.field3955.length; var8++) {
                var7.method1102(588021775, this.field3961[var8], this.field3955[var8]);
            }
        }
        if (this.field3949 != null) {
            for (int var9 = 0; var9 < this.field3949.length; var9++) {
                var7.method1099((byte) -125, this.field3949[var9], this.field3958[var9]);
            }
        }
        int var10 = -28 % ((-arg0 - 3) / 45);
        return var7;
    }

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
    public static void method1806(int arg0) {
        field3959 = null;
        field3962 = null;
        if (arg0 != 0) {
            method1803(-10, -84);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lfh;I)V")
    public final void method1807(class463 arg0, int arg1) {
        int var3 = -101 % ((-arg1 - 35) / 36);
        field3957++;
        while (true) {
            int var4 = arg0.method2737(false);
            if (var4 == 0) {
                return;
            }
            this.method1802(var4, arg0, (byte) 68);
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)Z")
    public final boolean method1808(byte arg0) {
        field3953++;
        if (arg0 > -49) {
            this.field3949 = null;
        }
        boolean var2 = true;
        class47 var3 = this.field3966.field4595;
        synchronized (this.field3966.field4595) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field3963[var4] != -1 && !this.field3966.field4595.method471(this.field3963[var4], (byte) -92, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    static {
        new class335(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field3967 = 0;
    }
}
