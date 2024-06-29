import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class233 {

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    private int field4184 = 128;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public int field4193 = -1;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    private int field4186 = 0;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    private int field4191 = 128;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    private int field4195 = 0;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    private int field4188 = 0;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "Z")
    public boolean field4201 = false;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field4187 = 0;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Lli;")
    public static class185 field4183 = class245.method1649("Connexion perdue)3", -92);

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "I")
    private int field4196;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public int field4199;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "[S")
    private short[] field4185;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "[S")
    private short[] field4190;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "[S")
    private short[] field4194;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "[S")
    private short[] field4200;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljd;II)V")
    private final void method1592(class118 arg0, int arg1, int arg2) {
        if (arg2 != 128) {
            return;
        }
        field4189++;
        if (arg1 == 1) {
            this.field4196 = arg0.method827(255);
        } else if (arg1 == 2) {
            this.field4193 = arg0.method827(255);
        } else if (arg1 == 4) {
            this.field4184 = arg0.method827(255);
        } else if (arg1 == 5) {
            this.field4191 = arg0.method827(255);
        } else if (arg1 == 6) {
            this.field4188 = arg0.method827(255);
        } else if (arg1 == 7) {
            this.field4186 = arg0.method867(false);
        } else if (arg1 == 8) {
            this.field4195 = arg0.method867(false);
        } else if (arg1 == 9) {
            this.field4201 = true;
            return;
        } else if (arg1 == 40) {
            int var4 = arg0.method867(false);
            this.field4200 = new short[var4];
            this.field4190 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4190[var5] = (short) arg0.method827(255);
                this.field4200[var5] = (short) arg0.method827(255);
            }
            return;
        } else if (arg1 == 41) {
            int var6 = arg0.method867(false);
            this.field4185 = new short[var6];
            this.field4194 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4185[var7] = (short) arg0.method827(255);
                this.field4194[var7] = (short) arg0.method827(255);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)V")
    public static final void method1593(int arg0, int arg1) {
        class80.field1402.method85((byte) 75, arg0);
        int var2 = -6 / ((arg1 - 37) / 42);
        field4198++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILjd;)V")
    public final void method1594(int arg0, class118 arg1) {
        while (true) {
            int var3 = arg1.method867(false);
            if (var3 == 0) {
                field4197++;
                if (arg0 != -5) {
                    this.field4191 = -30;
                    return;
                }
                return;
            }
            this.method1592(arg1, var3, 128);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)Lic;")
    public final class98 method1595(int arg0, int arg1) {
        if (arg0 != 7208) {
            method1593(-58, 107);
        }
        class98 var3 = (class98) class30.field495.method82(-128, (long) this.field4199);
        field4192++;
        if (var3 == null) {
            class4 var4 = class4.method68(class262.field4653, this.field4196, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field4190 != null) {
                for (int var5 = 0; var5 < this.field4190.length; var5++) {
                    var4.method56(this.field4190[var5], this.field4200[var5]);
                }
            }
            if (this.field4185 != null) {
                for (int var6 = 0; var6 < this.field4185.length; var6++) {
                    var4.method49(this.field4185[var6], this.field4194[var6]);
                }
            }
            var3 = var4.method64(this.field4186 + 64, 850 - -this.field4195, -30, -50, -30);
            class30.field495.method84(113, (long) this.field4199, var3);
        }
        class98 var7;
        if (this.field4193 == -1 || arg1 == -1) {
            var7 = var3.method639(true, true);
        } else {
            var7 = class253.method1712(this.field4193, -126).method21(arg1, var3, (byte) -105);
        }
        if (this.field4184 != 128 || this.field4191 != 128) {
            var7.method642(this.field4184, this.field4191, this.field4184);
        }
        if (this.field4188 != 0) {
            if (this.field4188 == 90) {
                var7.method629();
            }
            if (this.field4188 == 180) {
                var7.method638();
            }
            if (this.field4188 == 270) {
                var7.method644();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method1596(int arg0) {
        if (arg0 == 850) {
            field4183 = null;
        }
    }
}
