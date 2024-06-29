import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class359 {

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "I")
    private int field4901 = 32;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "Z")
    private boolean field4894 = false;

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "J")
    private long field4906 = class333.method1850(-3562);

    @OriginalMember(owner = "client!hv", name = "w", descriptor = "I")
    private int field4916 = 0;

    @OriginalMember(owner = "client!hv", name = "v", descriptor = "Z")
    private boolean field4915 = true;

    @OriginalMember(owner = "client!hv", name = "z", descriptor = "I")
    private int field4919 = 0;

    @OriginalMember(owner = "client!hv", name = "y", descriptor = "J")
    private long field4918 = 0L;

    @OriginalMember(owner = "client!hv", name = "B", descriptor = "I")
    private int field4921 = 0;

    @OriginalMember(owner = "client!hv", name = "E", descriptor = "[Ldm;")
    private class37[] field4924 = new class37[8];

    @OriginalMember(owner = "client!hv", name = "D", descriptor = "J")
    private long field4923 = 0L;

    @OriginalMember(owner = "client!hv", name = "x", descriptor = "[Ldm;")
    private class37[] field4917 = new class37[8];

    @OriginalMember(owner = "client!hv", name = "F", descriptor = "I")
    private int field4925 = 0;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!hv", name = "r", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!hv", name = "s", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!hv", name = "u", descriptor = "I")
    public int field4914;

    @OriginalMember(owner = "client!hv", name = "A", descriptor = "I")
    public int field4920;

    @OriginalMember(owner = "client!hv", name = "C", descriptor = "I")
    private int field4922;

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "Ldm;")
    private class37 field4904;

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "Lf;")
    public static class529 field4908;

    @OriginalMember(owner = "client!hv", name = "t", descriptor = "[I")
    public int[] field4913;

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "[Z")
    public static boolean[] field4910;

    static {
        new class83("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "()V", line = 4)
    public void method1983() throws Exception {
        field4895++;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V", line = 12)
    public void method1984(int arg0) throws Exception {
        field4909++;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)V", line = 20)
    public final synchronized void method1985(int arg0) {
        this.field4915 = true;
        field4903++;
        try {
            this.method1990();
            if (arg0 != 16384) {
                this.field4925 = -9;
            }
        } catch (Exception var2) {
            this.method1988();
            this.field4918 = class333.method1850(-3562) + 2000L;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)V", line = 60)
    public final synchronized void method1986(boolean arg0) {
        field4899++;
        if (this.field4894) {
            return;
        }
        long var2 = class333.method1850(-3562);
        if (!arg0) {
            this.method1988();
        }
        try {
            if (var2 > (this.field4906 + 500000L)) {
                this.field4906 = var2 - 500000L;
            }
            while (var2 > (this.field4906 + 5000L)) {
                this.method1997(256, true);
                this.field4906 += (256000 / class12.field141);
            }
        } catch (Exception var7) {
            this.field4906 = var2;
        }
        if (this.field4913 == null) {
            return;
        }
        try {
            if (this.field4918 != 0L) {
                if (var2 < this.field4918) {
                    return;
                }
                this.method1984(this.field4914);
                this.field4915 = true;
                this.field4918 = 0L;
            }
            int var4 = this.method1992();
            if (this.field4925 - var4 > this.field4919) {
                this.field4919 = this.field4925 - var4;
            }
            int var5 = this.field4922 + this.field4920;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if ((var5 + 256) > this.field4914) {
                this.field4914 += 1024;
                if (this.field4914 > 16384) {
                    this.field4914 = 16384;
                }
                this.method1988();
                var4 = 0;
                this.method1984(this.field4914);
                this.field4915 = true;
                if (this.field4914 < (var5 + 256)) {
                    var5 = this.field4914 - 256;
                    this.field4922 = var5 - this.field4920;
                }
            }
            while (var4 < var5) {
                this.method1995(this.field4913, 256);
                var4 += 256;
                this.method1983();
            }
            if (var2 > this.field4923) {
                if (this.field4915) {
                    this.field4915 = false;
                } else if (this.field4919 == 0 && this.field4921 == 0) {
                    this.method1988();
                    this.field4918 = var2 + 2000L;
                    return;
                } else {
                    this.field4922 = Math.min(this.field4921, this.field4919);
                    this.field4921 = this.field4919;
                }
                this.field4923 = var2 + 2000L;
                this.field4919 = 0;
            }
            this.field4925 = var4;
        } catch (Exception var6) {
            this.method1988();
            this.field4918 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)V", line = 180)
    public final synchronized void method1987(int arg0) {
        field4902++;
        if (arg0 != -16449) {
            this.field4914 = -15;
        }
        if (class1.field1 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class1.field1.field1335[var3] == this) {
                    class1.field1.field1335[var3] = null;
                }
                if (class1.field1.field1335[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class1.field1.field1329 = true;
                while (class1.field1.field1333) {
                    class496.method2931((byte) 122, 50L);
                }
                class1.field1 = null;
            }
        }
        this.method1988();
        this.field4913 = null;
        this.field4894 = true;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "()V", line = 228)
    public void method1988() {
        field4907++;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(Z)V", line = 235)
    public static void method1989(boolean arg0) {
        field4910 = null;
        field4908 = null;
        if (arg0) {
            field4910 = null;
        }
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "()V", line = 246)
    public void method1990() throws Exception {
        field4905++;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILdm;)V", line = 253)
    public final synchronized void method1991(int arg0, class37 arg1) {
        field4912++;
        this.field4904 = arg1;
        if (arg0 != -27890) {
            this.field4906 = -45L;
        }
    }

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "()I", line = 264)
    public int method1992() throws Exception {
        field4896++;
        return this.field4914;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 272)
    public void method1993(Component arg0) throws Exception {
        field4900++;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V", line = 280)
    public final void method1994(byte arg0) {
        field4897++;
        int var2 = 107 % ((-arg0 - 86) / 34);
        this.field4915 = true;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "([II)V", line = 291)
    private final void method1995(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class149.field2109) {
            var3 = arg1 << 1;
        }
        class416.method2490(arg0, 0, var3);
        this.field4916 -= arg1;
        if (this.field4904 != null && this.field4916 <= 0) {
            this.field4916 += class12.field141 >> 4;
            class145.method930(7507, this.field4904);
            this.method1996(this.field4904, this.field4904.method241(), (byte) -94);
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
                        class37 var10 = null;
                        class37 var11 = this.field4924[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class429 var12 = var11.field508;
                                if (var12 == null || var12.field6260 <= var8) {
                                    var11.field509 = true;
                                    int var13 = var11.method238();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field6260 += var13;
                                    }
                                    if (var4 >= this.field4901) {
                                        break label107;
                                    }
                                    class37 var14 = var11.method242();
                                    if (var14 != null) {
                                        int var15 = var11.field507;
                                        while (var14 != null) {
                                            this.method1996(var14, var15 * var14.method241() >> 8, (byte) -94);
                                            var14 = var11.method244();
                                        }
                                    }
                                    class37 var16 = var11.field510;
                                    var11.field510 = null;
                                    if (var10 == null) {
                                        this.field4924[var7] = var16;
                                    } else {
                                        var10.field510 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4917[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field510;
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
                class37 var18 = this.field4924[var17];
                this.field4924[var17] = this.field4917[var17] = null;
                while (var18 != null) {
                    class37 var19 = var18.field510;
                    var18.field510 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4916 < 0) {
            this.field4916 = 0;
        }
        if (this.field4904 != null) {
            this.field4904.method240(arg0, 0, arg1);
        }
        this.field4906 = class333.method1850(-3562);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ldm;IB)V", line = 472)
    private final void method1996(class37 arg0, int arg1, byte arg2) {
        if (arg2 != -94) {
            this.field4901 = 85;
        }
        field4911++;
        int var4 = arg1 >> 5;
        class37 var5 = this.field4917[var4];
        if (var5 == null) {
            this.field4924[var4] = arg0;
        } else {
            var5.field510 = arg0;
        }
        this.field4917[var4] = arg0;
        arg0.field507 = arg1;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZ)V", line = 493)
    private final void method1997(int arg0, boolean arg1) {
        this.field4916 -= arg0;
        field4898++;
        if (!arg1) {
            return;
        }
        if (this.field4916 < 0) {
            this.field4916 = 0;
        }
        if (this.field4904 != null) {
            this.field4904.method239(arg0);
        }
    }
}
