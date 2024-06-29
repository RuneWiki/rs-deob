import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class348 {

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "Ldr;")
    private class721 field4896 = new class721();

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "Ldr;")
    private class721 field4898 = new class721();

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "Ldr;")
    private class721 field4901 = new class721();

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "Ldr;")
    private class721 field4902 = new class721();

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "Lee;")
    private class677 field4905 = new class677(4);

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "B")
    private byte field4907 = 0;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
    public volatile int field4909 = 0;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
    public volatile int field4910 = 0;

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "Lee;")
    private class677 field4908 = new class677(8);

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "[F")
    public static float[] field4899 = new float[16];

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field4882 = 0;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "Lht;")
    public static class582 field4887 = new class582(0, 4);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field4889;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public static int field4894;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    private int field4904;

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "J")
    private long field4906;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "Lli;")
    public static class433 field4895;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "Loga;")
    private class477 field4903;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "Lic;")
    private class700 field4911;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
    public static void method2080(byte arg0) {
        field4899 = null;
        field4887 = null;
        if (arg0 == -127) {
            field4895 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)Z")
    public final boolean method2081(byte arg0) {
        field4881++;
        if (this.field4903 != null) {
            long var2 = class375.method2193(116);
            int var4 = (int) (var2 - this.field4906);
            this.field4906 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4904 += var4;
            if (this.field4904 > 30000) {
                try {
                    this.field4903.method2687((byte) -85);
                } catch (Exception var27) {
                }
                this.field4903 = null;
            }
        }
        if (this.field4903 == null) {
            return this.method2091(arg0 + 99) == 0 && this.method2092(arg0 ^ 0x4031) == 0;
        }
        try {
            this.field4903.method2688(0);
            for (class700 var5 = (class700) this.field4896.method4051(896); var5 != null; var5 = (class700) this.field4896.method4049(true)) {
                this.field4905.field9419 = 0;
                this.field4905.method3823(arg0 + 70, 1);
                this.field4905.method3797((byte) -56, (int) var5.field5747);
                this.field4903.method2685(-5324, this.field4905.field9399, 0, 4);
                this.field4898.method4050(var5, -114);
            }
            if (arg0 != -99) {
                this.method2092(-104);
            }
            for (class700 var6 = (class700) this.field4901.method4051(arg0 + 995); var6 != null; var6 = (class700) this.field4901.method4049(true)) {
                this.field4905.field9419 = 0;
                this.field4905.method3823(arg0 + 65, 0);
                this.field4905.method3797((byte) -56, (int) var6.field5747);
                this.field4903.method2685(-5324, this.field4905.field9399, 0, 4);
                this.field4902.method4050(var6, -106);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field4903.method2693((byte) 118);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field4904 = 0;
                byte var9 = 0;
                if (this.field4911 == null) {
                    var9 = 8;
                } else if (this.field4911.field9725 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field4908.field9419;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field4903.method2689(this.field4908.field9399, var10, this.field4908.field9419, (byte) 104);
                    if (this.field4907 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field4908.field9399[this.field4908.field9419 + var11] = (byte) class712.method4000(this.field4908.field9399[this.field4908.field9419 + var11], this.field4907);
                        }
                    }
                    this.field4908.field9419 += var10;
                    if (var9 <= this.field4908.field9419) {
                        if (this.field4911 == null) {
                            this.field4908.field9419 = 0;
                            int var12 = this.field4908.method3821((byte) -123);
                            int var13 = this.field4908.method3807(-1);
                            int var14 = this.field4908.method3821((byte) -60);
                            int var15 = this.field4908.method3799(false);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class700 var21;
                            if (var17) {
                                for (var21 = (class700) this.field4902.method4051(arg0 ^ 0xFFFFFC1D); var21 != null && var21.field5747 != var18; var21 = (class700) this.field4902.method4049(true)) {
                                }
                            } else {
                                for (var21 = (class700) this.field4898.method4051(896); var21 != null && var21.field5747 != var18; var21 = (class700) this.field4898.method4049(true)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field4911 = var21;
                            this.field4911.field9727 = new class677(var15 + var22 + this.field4911.field9720);
                            this.field4911.field9727.method3823(arg0 ^ 0x42, var16);
                            this.field4911.field9727.method3798(27695, var15);
                            this.field4908.field9419 = 0;
                            this.field4911.field9725 = 8;
                        } else if (this.field4911.field9725 != 0) {
                            throw new IOException();
                        } else if (this.field4908.field9399[0] == -1) {
                            this.field4911.field9725 = 1;
                            this.field4908.field9419 = 0;
                        } else {
                            this.field4911 = null;
                        }
                    }
                } else {
                    int var23 = this.field4911.field9727.field9399.length - this.field4911.field9720;
                    int var24 = 512 - this.field4911.field9725;
                    if (var24 > var23 - this.field4911.field9727.field9419) {
                        var24 = var23 - this.field4911.field9727.field9419;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field4903.method2689(this.field4911.field9727.field9399, var24, this.field4911.field9727.field9419, (byte) -69);
                    if (this.field4907 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field4911.field9727.field9399[this.field4911.field9727.field9419 + var25] = (byte) class712.method4000(this.field4911.field9727.field9399[this.field4911.field9727.field9419 + var25], this.field4907);
                        }
                    }
                    this.field4911.field9727.field9419 += var24;
                    this.field4911.field9725 += var24;
                    if (this.field4911.field9727.field9419 == var23) {
                        this.field4911.method2414((byte) -26);
                        this.field4911.field7580 = false;
                        this.field4911 = null;
                    } else if (this.field4911.field9725 == 512) {
                        this.field4911.field9725 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field4903.method2687((byte) -85);
            } catch (Exception var26) {
            }
            this.field4903 = null;
            this.field4910 = -2;
            this.field4909++;
            return this.method2091(0) == 0 && this.method2092(-16468) == 0;
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(B)V")
    public final void method2082(byte arg0) {
        field4900++;
        if (this.field4903 != null) {
            this.field4903.method2687((byte) -85);
        }
        if (arg0 >= -81) {
            field4887 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(B)V")
    public final void method2083(byte arg0) {
        field4890++;
        if (arg0 == 70 && this.field4903 != null) {
            this.field4903.method2691(0);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)Z")
    public final boolean method2084(int arg0) {
        if (arg0 < 38) {
            this.field4903 = null;
        }
        field4889++;
        return this.method2092(-16468) >= 20;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
    public final void method2085(int arg0) {
        field4891++;
        if (this.field4903 == null) {
            return;
        }
        if (arg0 != 1) {
            this.method2089(71);
        }
        try {
            this.field4905.field9419 = 0;
            this.field4905.method3823(-124, 7);
            this.field4905.method3797((byte) -56, 0);
            this.field4903.method2685(-5324, this.field4905.field9399, 0, 4);
        } catch (IOException var3) {
            try {
                this.field4903.method2687((byte) -85);
            } catch (Exception var2) {
            }
            this.field4909++;
            this.field4903 = null;
            this.field4910 = -2;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BZ)V")
    public final void method2086(byte arg0, boolean arg1) {
        field4897++;
        if (this.field4903 == null) {
            return;
        }
        try {
            int var3 = -102 / ((16 - arg0) / 37);
            this.field4905.field9419 = 0;
            this.field4905.method3823(-65, arg1 ? 2 : 3);
            this.field4905.method3797((byte) -56, 0);
            this.field4903.method2685(-5324, this.field4905.field9399, 0, 4);
        } catch (IOException var5) {
            try {
                this.field4903.method2687((byte) -85);
            } catch (Exception var4) {
            }
            this.field4903 = null;
            this.field4909++;
            this.field4910 = -2;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZLoga;I)V")
    public final void method2087(boolean arg0, class477 arg1, int arg2) {
        if (this.field4903 != null) {
            try {
                this.field4903.method2687((byte) -85);
            } catch (Exception var8) {
            }
            this.field4903 = null;
        }
        field4884++;
        this.field4903 = arg1;
        this.method2089(11);
        this.method2086((byte) -105, arg0);
        this.field4908.field9419 = 0;
        this.field4911 = null;
        while (true) {
            class700 var4 = (class700) this.field4898.method4056(896);
            if (var4 == null) {
                while (true) {
                    class700 var5 = (class700) this.field4902.method4056(896);
                    if (var5 == null) {
                        if (this.field4907 != 0) {
                            try {
                                this.field4905.field9419 = 0;
                                this.field4905.method3823(-121, 4);
                                this.field4905.method3823(-58, this.field4907);
                                this.field4905.method3831(1182, 0);
                                this.field4903.method2685(arg2 ^ 0xFFFFEB30, this.field4905.field9399, 0, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field4903.method2687((byte) -85);
                                } catch (Exception var6) {
                                }
                                this.field4903 = null;
                                this.field4910 = -2;
                                this.field4909++;
                            }
                        }
                        if (arg2 != 4) {
                            this.method2092(-93);
                        }
                        this.field4904 = 0;
                        this.field4906 = class375.method2193(arg2 ^ 0x70);
                        return;
                    }
                    this.field4901.method4050(var5, -114);
                }
            }
            this.field4896.method4050(var4, arg2 ^ 0xFFFFFF8D);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lee;I)Lkca;")
    public static final class83 method2088(class677 arg0, int arg1) {
        field4888++;
        String var2 = arg0.method3793(15598);
        class311 var3 = class439.method2534(-1)[arg0.method3821((byte) 127)];
        class512 var4 = class12.method106(-12865)[arg0.method3821((byte) 84)];
        if (arg1 != 8916) {
            field4895 = null;
        }
        int var5 = arg0.method3771((byte) -10);
        int var6 = arg0.method3771((byte) -10);
        int var7 = arg0.method3821((byte) -66);
        int var8 = arg0.method3821((byte) 86);
        int var9 = arg0.method3821((byte) -21);
        int var10 = arg0.method3807(-1);
        int var11 = arg0.method3807(arg1 ^ 0xFFFFDD2B);
        int var12 = arg0.method3799(false);
        int var13 = arg0.method3799(false);
        int var14 = arg0.method3799(false);
        return new class83(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)V")
    private final void method2089(int arg0) {
        field4892++;
        if (this.field4903 == null || arg0 <= 0) {
            return;
        }
        try {
            this.field4905.field9419 = 0;
            this.field4905.method3823(-85, 6);
            this.field4905.method3797((byte) -56, 3);
            this.field4903.method2685(-5324, this.field4905.field9399, 0, 4);
        } catch (IOException var3) {
            try {
                this.field4903.method2687((byte) -85);
            } catch (Exception var2) {
            }
            this.field4909++;
            this.field4910 = -2;
            this.field4903 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(B)V")
    public final void method2090(byte arg0) {
        try {
            this.field4903.method2687((byte) -85);
        } catch (Exception var2) {
        }
        field4893++;
        this.field4910 = -1;
        if (arg0 < 66) {
            this.method2092(7);
        }
        this.field4909++;
        this.field4903 = null;
        this.field4907 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)I")
    public final int method2091(int arg0) {
        field4886++;
        if (arg0 != 0) {
            this.method2089(0);
        }
        return this.field4896.method4053(55) + this.field4898.method4053(32);
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)I")
    private final int method2092(int arg0) {
        field4885++;
        return arg0 == -16468 ? this.field4901.method4053(31) + this.field4902.method4053(18) : 57;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZBIII)Lic;")
    public final class700 method2093(boolean arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4894++;
        long var6 = (long) ((arg2 << 16) + arg3);
        class700 var8 = new class700();
        var8.field7583 = arg0;
        if (arg4 != 22013) {
            return null;
        }
        var8.field9720 = arg1;
        var8.field5747 = var6;
        if (arg0) {
            if (this.method2091(arg4 ^ 0x55FD) >= 20) {
                throw new RuntimeException();
            }
            this.field4896.method4050(var8, -127);
        } else if (this.method2092(-16468) < 20) {
            this.field4901.method4050(var8, -107);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(I)Z")
    public final boolean method2094(int arg0) {
        if (arg0 == 0) {
            field4883++;
            return this.method2091(arg0) >= 20;
        } else {
            return false;
        }
    }
}
