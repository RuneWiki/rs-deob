import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class265 {

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public int field4117 = -1;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    private int field4121 = 0;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "Z")
    public boolean field4125 = false;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    private int field4123 = 128;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    private int field4135 = 0;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    private int field4134 = 128;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    private int field4136 = 0;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "Z")
    public boolean field4133 = false;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4124 = "glow2:";

    @OriginalMember(owner = "client!he", name = "h", descriptor = "Lql;")
    public static class87 field4120 = new class87();

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    private int field4115;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public int field4129;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "Lah;")
    public static class126 field4132;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "[I")
    public static int[] field4114;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "[S")
    private short[] field4126;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "[S")
    private short[] field4127;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "[S")
    private short[] field4130;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "[S")
    private short[] field4131;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lkh;Z)V", line = 13)
    public final void method1808(class166 arg0, boolean arg1) {
        if (arg1) {
            this.field4126 = (short[]) null;
        }
        while (true) {
            int var3 = arg0.method1178(0);
            if (var3 == 0) {
                field4122++;
                return;
            }
            this.method1811(64, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)Lwi;", line = 57)
    public final class221 method1809(int arg0, int arg1, int arg2, int arg3) {
        field4113++;
        if (arg1 != 2) {
            method1810((byte) -55);
        }
        class221 var5 = (class221) class291.field4522.method2179(false, (long) this.field4129);
        if (var5 == null) {
            class42 var6 = class42.method337(class117.field1786, this.field4115, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field4127 != null) {
                for (int var7 = 0; var7 < this.field4127.length; var7++) {
                    var6.method353(this.field4127[var7], this.field4131[var7]);
                }
            }
            if (this.field4126 != null) {
                for (int var8 = 0; var8 < this.field4126.length; var8++) {
                    var6.method356(this.field4126[var8], this.field4130[var8]);
                }
            }
            var5 = var6.method341(this.field4136 + 64, this.field4121 + 850, -30, -50, -30);
            class291.field4522.method2173(var5, true, (long) this.field4129);
        }
        class221 var9;
        if (this.field4117 == -1 || arg3 == -1) {
            var9 = var5.method191(true, true, true);
        } else {
            var9 = class133.method948(this.field4117, (byte) 33).method1923((byte) 111, var5, arg3, arg2, arg0);
        }
        if (this.field4123 != 128 || this.field4134 != 128) {
            var9.method210(this.field4123, this.field4134, this.field4123);
        }
        if (this.field4135 != 0) {
            if (this.field4135 == 90) {
                var9.method180();
            }
            if (this.field4135 == 180) {
                var9.method213();
            }
            if (this.field4135 == 270) {
                var9.method181();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 139)
    public static void method1810(byte arg0) {
        field4114 = null;
        field4120 = null;
        field4132 = null;
        field4124 = null;
        int var1 = -73 % ((arg0 - 23) / 57);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILkh;I)V", line = 155)
    private final void method1811(int arg0, class166 arg1, int arg2) {
        if (arg2 == 1) {
            this.field4115 = arg1.method1151(-59);
        } else if (arg2 == 2) {
            this.field4117 = arg1.method1151(arg0 - 191);
        } else if (arg2 == 4) {
            this.field4123 = arg1.method1151(arg0 - 185);
        } else if (arg2 == 5) {
            this.field4134 = arg1.method1151(-68);
        } else if (arg2 == 6) {
            this.field4135 = arg1.method1151(-66);
        } else if (arg2 == 7) {
            this.field4136 = arg1.method1178(arg0 ^ 0x40);
        } else if (arg2 == 8) {
            this.field4121 = arg1.method1178(0);
        } else if (arg2 == 9) {
            this.field4125 = true;
        } else if (arg2 == 10) {
            this.field4133 = true;
        } else if (arg2 == 40) {
            int var4 = arg1.method1178(0);
            this.field4127 = new short[var4];
            this.field4131 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4127[var5] = (short) arg1.method1151(-106);
                this.field4131[var5] = (short) arg1.method1151(-69);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method1178(0);
            this.field4126 = new short[var6];
            this.field4130 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4126[var7] = (short) arg1.method1151(-106);
                this.field4130[var7] = (short) arg1.method1151(arg0 - 191);
            }
        }
        if (arg0 != 64) {
            this.method1809(-111, -23, 110, -62);
        }
        field4118++;
    }
}
