import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class386 extends class142 {

    @OriginalMember(owner = "client!im", name = "C", descriptor = "I")
    private int field4863;

    @OriginalMember(owner = "client!im", name = "z", descriptor = "I")
    private int field4860;

    @OriginalMember(owner = "client!im", name = "E", descriptor = "I")
    private int field4865;

    @OriginalMember(owner = "client!im", name = "A", descriptor = "I")
    private int field4861;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "[I")
    public static int[] field4852 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!im", name = "p", descriptor = "Z")
    public static boolean field4850 = false;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "Lfh;")
    public static class266 field4848 = new class266(9, 6);

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "I")
    private int field4851;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "I")
    private int field4853;

    @OriginalMember(owner = "client!im", name = "u", descriptor = "I")
    private int field4855;

    @OriginalMember(owner = "client!im", name = "v", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!im", name = "w", descriptor = "I")
    private int field4857;

    @OriginalMember(owner = "client!im", name = "x", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!im", name = "y", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!im", name = "B", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!im", name = "D", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!im", name = "t", descriptor = "[B")
    private byte[] field4854;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BII)V", line = 3)
    public final void method838(byte arg0, int arg1, int arg2) {
        if (arg0 < 111) {
            this.method838((byte) 99, 80, -42);
        }
        field4856++;
        if (arg1 == 0) {
            this.field4851 = this.field4860 - (arg2 >= 0 ? arg2 : -arg2);
            this.field4853 = 4096;
            this.field4851 = this.field4851 * this.field4851 >> 12;
            this.field4857 = this.field4851;
            return;
        }
        this.field4853 = this.field4863 * this.field4851 >> 12;
        if (this.field4853 < 0) {
            this.field4853 = 0;
        } else if (this.field4853 > 4096) {
            this.field4853 = 4096;
        }
        this.field4851 = this.field4860 - (arg2 >= 0 ? arg2 : -arg2);
        this.field4851 = this.field4851 * this.field4851 >> 12;
        this.field4851 = this.field4853 * this.field4851 >> 12;
        this.field4857 += this.field4861 * this.field4851 >> 12;
        this.field4861 = this.field4865 * this.field4861 >> 12;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IBI)V", line = 40)
    public static final void method2076(int arg0, byte arg1, int arg2) {
        if (arg1 >= -22) {
            return;
        }
        field4859++;
        if (class657.field9287 != arg2) {
            class269.field3405 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class269.field3405[var3] = (var3 << 12) / arg2;
            }
            class194.field2440 = arg2 - 1;
            class686.field9645 = arg2 * 32;
            class657.field9287 = arg2;
        }
        if (class622.field8706 == arg0) {
            return;
        }
        if (class657.field9287 == arg0) {
            class272.field3439 = class269.field3405;
        } else {
            class272.field3439 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class272.field3439[var4] = (var4 << 12) / arg0;
            }
        }
        class669.field9431 = arg0 - 1;
        class622.field8706 = arg0;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(IIIIIFFF)V", line = 94)
    public class386(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4863 = (int) (arg7 * 4096.0F);
        this.field4860 = (int) (arg6 * 4096.0F);
        this.field4861 = this.field4865 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/String;JZB)V", line = 105)
    public static final void method2077(String arg0, long arg1, boolean arg2, byte arg3) {
        field4858++;
        if (arg2) {
            class667.method3747(-99);
            if (class355.field4528.equals("")) {
                class76.field1046 = 39;
                return;
            }
        }
        class630 var5 = new class630(576);
        var5.method3509(10, (byte) -119);
        var5.method3526((int) (Math.random() * 65535.0D), 13469);
        var5.method3494(arg1, -16719);
        var5.method3526(arg2 ? class37.field507 : class322.field4130, 13469);
        var5.method3489(arg0, -23);
        var5.method3494(arg2 ? class361.field4596 : class49.field702, -16719);
        if (arg2) {
            var5.method3494(class102.method576(0, class355.field4528), -16719);
            try {
                var5.method3494(Long.parseLong(class562.field7815), -16719);
            } catch (Exception var9) {
                class76.field1046 = 39;
                return;
            }
        } else {
            var5.method3464((int) (Math.random() * 9.9999999E7D), -109);
            var5.method3464((int) (Math.random() * 9.9999999E7D), -108);
            var5.method3464((int) (Math.random() * 9.9999999E7D), -97);
            var5.method3464((int) (Math.random() * 9.9999999E7D), -102);
        }
        var5.method3464((int) (Math.random() * 9.9999999E7D), -96);
        if (arg3 <= 73) {
            return;
        }
        var5.method3477(class37.field500, -57, class384.field4841);
        class704 var6 = class573.method3163(-107);
        var6.field9929.method3509(arg2 ? class350.field4481.field2831 : class350.field4478.field2831, (byte) -110);
        int var7 = 1;
        if (class195.field2446 != null) {
            var7 += class195.field2446.length() + 1;
        }
        var6.field9929.method3526(var7 + var5.field8812 + 28, 13469);
        var6.field9929.method3526(621, 13469);
        var6.field9929.method3509(class250.field3068, (byte) -119);
        var6.field9929.method3509(class98.field1337.field1469, (byte) -125);
        class475.method2514(var6.field9929, 0);
        String var8 = arg2 ? class343.field4411 : class195.field2446;
        var6.field9929.method3509(var8 == null ? 0 : 1, (byte) -116);
        if (var8 != null) {
            var6.field9929.method3489(var8, -80);
        }
        var6.field9929.method3475(65536, var5.field8812, 0, var5.field8804);
        class122.method654(var6, (byte) -36);
        class82.field1097 = 1;
        class290.field3618 = 0;
        class279.field3503 = 0;
        class76.field1046 = -3;
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(B)V", line = 188)
    public static void method2078(byte arg0) {
        field4852 = null;
        field4848 = null;
        if (arg0 >= -51) {
            field4850 = true;
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V", line = 200)
    public final void method835(int arg0) {
        this.field4857 >>= 0x4;
        field4849++;
        this.field4861 = this.field4865;
        if (this.field4857 < 0) {
            this.field4857 = 0;
        } else if (this.field4857 > 255) {
            this.field4857 = 255;
        }
        if (arg0 != 1) {
            this.method835(-108);
        }
        this.method2079((byte) this.field4857, this.field4855++, false);
        this.field4857 = 0;
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(I)V", line = 232)
    public final void method836(int arg0) {
        int var2 = 90 / ((-arg0 - 84) / 39);
        this.field4857 = 0;
        this.field4855 = 0;
        field4864++;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BIZ)V", line = 245)
    public void method2079(byte arg0, int arg1, boolean arg2) {
        if (arg2) {
            method2078((byte) 21);
        }
        field4862++;
        this.field4854[arg1] = arg0;
    }
}
