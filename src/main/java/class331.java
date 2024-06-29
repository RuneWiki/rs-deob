import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class331 {

    @OriginalMember(owner = "client!is", name = "l", descriptor = "[I")
    private int[] field4960 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!is", name = "b", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4950 = new Rectangle[100];

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!is", name = "n", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!is", name = "o", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!is", name = "q", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!is", name = "r", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!is", name = "s", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "Las;")
    public static class100 field4952;

    @OriginalMember(owner = "client!is", name = "u", descriptor = "Lrt;")
    public class144 field4969;

    @OriginalMember(owner = "client!is", name = "t", descriptor = "[I")
    private int[] field4968;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "[S")
    private short[] field4949;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "[S")
    private short[] field4953;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "[S")
    private short[] field4961;

    @OriginalMember(owner = "client!is", name = "p", descriptor = "[S")
    private short[] field4964;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field4950[var0] = new Rectangle();
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILha;)V", line = 3)
    public final void method2052(int arg0, class40 arg1) {
        field4951++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method257((byte) 46);
            if (var3 == 0) {
                return;
            }
            this.method2061(var3, arg1, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)V", line = 23)
    public static final void method2053(boolean arg0) {
        field4962++;
        if (class486.field7407 == null || class251.field3841 == null) {
            class251.field3841 = new int[256];
            class486.field7407 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class486.field7407[var1] = (int) (Math.sin(var2) * 4096.0D);
                class251.field3841[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0) {
            method2056(1.1909137186260677D, -126);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)Z", line = 56)
    public final boolean method2054(int arg0) {
        if (arg0 != 4096) {
            return false;
        }
        field4957++;
        if (this.field4968 == null) {
            return true;
        }
        boolean var2 = true;
        class458 var3 = this.field4969.field2344;
        synchronized (this.field4969.field2344) {
            for (int var4 = 0; var4 < this.field4968.length; var4++) {
                if (!this.field4969.field2344.method2721((byte) 126, this.field4968[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)Lwr;", line = 86)
    public final class303 method2055(int arg0) {
        field4959++;
        class303[] var2 = new class303[5];
        int var3 = 0;
        class458 var4 = this.field4969.field2344;
        synchronized (this.field4969.field2344) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field4960[var5] != -1) {
                    var2[var3++] = class175.method1096(this.field4960[var5], arg0 - 103, this.field4969.field2344, 0);
                }
                var5++;
            }
        }
        for (int var6 = arg0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field4564 < 13) {
                var2[var6].method1822(-13275, 0);
            }
        }
        class303 var7 = new class303(var2, var3);
        if (this.field4953 != null) {
            for (int var8 = 0; var8 < this.field4953.length; var8++) {
                var7.method1821(-22, this.field4953[var8], this.field4949[var8]);
            }
        }
        if (this.field4961 != null) {
            for (int var9 = 0; var9 < this.field4961.length; var9++) {
                var7.method1824(this.field4961[var9], this.field4964[var9], (byte) -102);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(DI)V", line = 154)
    public static final void method2056(double arg0, int arg1) {
        if (class166.field2574 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class145.field2356[var3] = var4 > 255 ? 255 : var4;
            }
            class166.field2574 = arg0;
        }
        if (arg1 != 255) {
            field4950 = null;
        }
        field4963++;
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(I)Lwr;", line = 186)
    public final class303 method2057(int arg0) {
        field4967++;
        if (this.field4968 == null) {
            return null;
        }
        class303[] var2 = new class303[this.field4968.length];
        class458 var3 = this.field4969.field2344;
        synchronized (this.field4969.field2344) {
            int var4 = arg0;
            while (true) {
                if (this.field4968.length <= var4) {
                    break;
                }
                var2[var4] = class175.method1096(this.field4968[var4], -9, this.field4969.field2344, 0);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field4968.length; var5++) {
            if (var2[var5].field4564 < 13) {
                var2[var5].method1822(-13275, 0);
            }
        }
        class303 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class303(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field4953 != null) {
            for (int var7 = 0; var7 < this.field4953.length; var7++) {
                var6.method1821(-61, this.field4953[var7], this.field4949[var7]);
            }
        }
        if (this.field4961 != null) {
            for (int var8 = 0; var8 < this.field4961.length; var8++) {
                var6.method1824(this.field4961[var8], this.field4964[var8], (byte) -113);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!is", name = "d", descriptor = "(I)I", line = 260)
    public static final int method2058(int arg0) {
        if (arg0 != -5576) {
            field4966 = -66;
        }
        field4954++;
        if (class201.field3190 == null) {
            return class109.field1889 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!is", name = "e", descriptor = "(I)V", line = 274)
    public static void method2059(int arg0) {
        field4950 = null;
        if (arg0 != -101) {
            field4952 = null;
        }
        field4952 = null;
    }

    @OriginalMember(owner = "client!is", name = "f", descriptor = "(I)Z", line = 287)
    public final boolean method2060(int arg0) {
        field4958++;
        boolean var2 = true;
        if (arg0 >= -84) {
            this.method2060(77);
        }
        class458 var3 = this.field4969.field2344;
        synchronized (this.field4969.field2344) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field4960[var4] != -1 && !this.field4969.field2344.method2721((byte) 115, this.field4960[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILha;B)V", line = 337)
    private final void method2061(int arg0, class40 arg1, byte arg2) {
        if (arg0 == 1) {
            arg1.method257((byte) 85);
        } else if (arg0 == 2) {
            int var4 = arg1.method257((byte) 76);
            this.field4968 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4968[var5] = arg1.method254((byte) -98);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var6 = arg1.method257((byte) 84);
                this.field4949 = new short[var6];
                this.field4953 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field4953[var7] = (short) arg1.method254((byte) -73);
                    this.field4949[var7] = (short) arg1.method254((byte) -72);
                }
            } else if (arg0 == 41) {
                int var8 = arg1.method257((byte) 46);
                this.field4964 = new short[var8];
                this.field4961 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field4961[var9] = (short) arg1.method254((byte) -77);
                    this.field4964[var9] = (short) arg1.method254((byte) -30);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field4960[arg0 - 60] = arg1.method254((byte) -63);
            }
        }
        if (arg2 == 120) {
            field4955++;
        }
    }
}
