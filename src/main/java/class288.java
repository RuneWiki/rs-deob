import java.applet.Applet;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class288 {

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "Z")
    private boolean field4233 = false;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    private int field4232 = 32;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "J")
    private long field4228 = class683.method3903((byte) 4);

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
    private int field4241 = 0;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "J")
    private long field4243 = 0L;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "[Lqp;")
    private class487[] field4249 = new class487[8];

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "Z")
    private boolean field4247 = true;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "[Lqp;")
    private class487[] field4250 = new class487[8];

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    private int field4244 = 0;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    private int field4242 = 0;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    private int field4248 = 0;

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "J")
    private long field4251 = 0L;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Lqk;")
    public static class1 field4219 = new class1(21, 3);

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    public int field4245;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    public int field4246;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
    private int field4252;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "J")
    public static long field4220;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Ljw;")
    public static class474 field4222;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "Lqp;")
    private class487 field4226;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "Ljava/applet/Applet;")
    public static Applet field4238;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "[I")
    public int[] field4218;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "()V", line = 11)
    public void method1901() {
        field4221++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V", line = 18)
    public static void method1902(boolean arg0) {
        field4222 = null;
        field4219 = null;
        field4238 = null;
        if (arg0) {
            method1908(27);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILsha;Lha;)V", line = 31)
    public static final void method1903(int arg0, class115 arg1, class473 arg2) {
        field4225++;
        boolean var3 = class35.field367.method3050(arg1.field1557, arg1.field1539 ? class724.field10031.field9993 : null, arg1.field1458, arg1.field1435, arg1.field1496, arg1.field1497 | 0xFF000000, arg2, 116) == null;
        if (arg0 != 0) {
            field4219 = null;
        }
        if (var3) {
            class80.field900.method1039(new class493(arg1.field1458, arg1.field1435, arg1.field1557, arg1.field1497 | 0xFF000000, arg1.field1496, arg1.field1539), 0);
            class43.method336(-1, arg1);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLqp;)V", line = 49)
    public final synchronized void method1904(byte arg0, class487 arg1) {
        field4234++;
        this.field4226 = arg1;
        int var3 = 105 % ((-arg0 - 59) / 42);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZ)V", line = 61)
    private final void method1905(int arg0, boolean arg1) {
        field4224++;
        this.field4248 -= arg0;
        if (this.field4248 < 0) {
            this.field4248 = 0;
        }
        if (this.field4226 != null) {
            this.field4226.method599(arg0);
        }
        if (arg1) {
            this.method1916(null, -120);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 81)
    public final synchronized void method1906(int arg0) {
        field4231++;
        if (this.field4233) {
            return;
        }
        long var2 = class683.method3903((byte) 4);
        try {
            if (this.field4228 + 6000L < var2) {
                this.field4228 = var2 - 6000L;
            }
            while (this.field4228 + 5000L < var2) {
                this.method1905(256, false);
                this.field4228 += (256000 / class223.field3174);
                var2 = class683.method3903((byte) 4);
            }
        } catch (Exception var7) {
            this.field4228 = var2;
        }
        if (this.field4218 == null) {
            return;
        }
        try {
            if (arg0 >= 48) {
                if (this.field4251 != 0L) {
                    if (var2 < this.field4251) {
                        return;
                    }
                    this.method1914(this.field4245);
                    this.field4251 = 0L;
                    this.field4247 = true;
                }
                int var4 = this.method1910();
                if (this.field4241 < (this.field4244 - var4)) {
                    this.field4241 = this.field4244 - var4;
                }
                int var5 = this.field4252 + this.field4246;
                if ((var5 + 256) > 16384) {
                    var5 = 16128;
                }
                if (this.field4245 < var5 + 256) {
                    this.field4245 += 1024;
                    if (this.field4245 > 16384) {
                        this.field4245 = 16384;
                    }
                    this.method1901();
                    var4 = 0;
                    this.method1914(this.field4245);
                    if (var5 + 256 > this.field4245) {
                        var5 = this.field4245 - 256;
                        this.field4252 = var5 - this.field4246;
                    }
                    this.field4247 = true;
                }
                while (var5 > var4) {
                    this.method1916(this.field4218, 256);
                    var4 += 256;
                    this.method1911();
                }
                if (var2 > this.field4243) {
                    if (this.field4247) {
                        this.field4247 = false;
                    } else if (this.field4241 == 0 && this.field4242 == 0) {
                        this.method1901();
                        this.field4251 = var2 + 2000L;
                        return;
                    } else {
                        this.field4252 = Math.min(this.field4242, this.field4241);
                        this.field4242 = this.field4241;
                    }
                    this.field4243 = var2 + 2000L;
                    this.field4241 = 0;
                }
                this.field4244 = var4;
            }
        } catch (Exception var6) {
            this.method1901();
            this.field4251 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 200)
    public void method1907(Component arg0) throws Exception {
        field4230++;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)Lts;", line = 207)
    public static final class41 method1908(int arg0) {
        if (arg0 != 0) {
            method1902(false);
        }
        field4237++;
        return class284.method1871(1, (byte) 1);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V", line = 219)
    public final synchronized void method1909(byte arg0) {
        if (class480.field6656 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class480.field6656.field861[var3] == this) {
                    class480.field6656.field861[var3] = null;
                }
                if (class480.field6656.field861[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class480.field6656.field856 = true;
                while (class480.field6656.field857) {
                    class730.method4066((byte) -45, 50L);
                }
                class480.field6656 = null;
            }
        }
        if (arg0 == 93) {
            field4227++;
            this.method1901();
            this.field4218 = null;
            this.field4233 = true;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "()I", line = 265)
    public int method1910() throws Exception {
        field4229++;
        return this.field4245;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "()V", line = 275)
    public void method1911() throws Exception {
        field4223++;
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "()V", line = 282)
    public void method1912() throws Exception {
        field4240++;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V", line = 289)
    public final synchronized void method1913(int arg0) {
        this.field4247 = true;
        field4236++;
        if (arg0 <= 64) {
            return;
        }
        try {
            this.method1912();
        } catch (Exception var2) {
            this.method1901();
            this.field4251 = class683.method3903((byte) 4) + 2000L;
        }
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)V", line = 309)
    public void method1914(int arg0) throws Exception {
        field4239++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lqp;II)V", line = 317)
    private final void method1915(class487 arg0, int arg1, int arg2) {
        field4235++;
        int var4 = arg1 >> 5;
        class487 var5 = this.field4250[var4];
        if (var5 == null) {
            this.field4249[var4] = arg0;
        } else {
            var5.field6721 = arg0;
        }
        this.field4250[var4] = arg0;
        arg0.field6719 = arg1;
        if (arg2 != -256) {
            field4238 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([II)V", line = 348)
    private final void method1916(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class568.field8013) {
            var3 = arg1 << 1;
        }
        class335.method2125(arg0, 0, var3);
        this.field4248 -= arg1;
        if (this.field4226 != null && this.field4248 <= 0) {
            this.field4248 += class223.field3174 >> 4;
            class352.method2218(25, this.field4226);
            this.method1915(this.field4226, this.field4226.method1089(), -256);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class487 var10 = null;
                        class487 var11 = this.field4249[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class790 var12 = var11.field6720;
                                if (var12 == null || var12.field10829 <= var8) {
                                    var11.field6718 = true;
                                    int var13 = var11.method613();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field10829 += var13;
                                    }
                                    if (var4 >= this.field4232) {
                                        break label107;
                                    }
                                    class487 var14 = var11.method614();
                                    if (var14 != null) {
                                        int var15 = var11.field6719;
                                        while (var14 != null) {
                                            this.method1915(var14, var15 * var14.method1089() >> 8, -256);
                                            var14 = var11.method615();
                                        }
                                    }
                                    class487 var16 = var11.field6721;
                                    var11.field6721 = null;
                                    if (var10 == null) {
                                        this.field4249[var7] = var16;
                                    } else {
                                        var10.field6721 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4250[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field6721;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class487 var18 = this.field4249[var17];
                this.field4249[var17] = this.field4250[var17] = null;
                while (var18 != null) {
                    class487 var19 = var18.field6721;
                    var18.field6721 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4248 < 0) {
            this.field4248 = 0;
        }
        if (this.field4226 != null) {
            this.field4226.method604(arg0, 0, arg1);
        }
        this.field4228 = class683.method3903((byte) 4);
    }
}
