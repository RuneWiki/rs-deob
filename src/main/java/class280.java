import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class280 {

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    private int field3980 = 32;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Z")
    private boolean field3985 = false;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "J")
    private long field3984 = class109.method653(false);

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "J")
    private long field3997 = 0L;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    private int field4000 = 0;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "[Lcb;")
    private class344[] field3998 = new class344[8];

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "Z")
    private boolean field3995 = true;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "J")
    private long field4009 = 0L;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    private int field4004 = 0;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "[Lcb;")
    private class344[] field4007 = new class344[8];

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    private int field4005 = 0;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
    private int field4011 = 0;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "Lul;")
    public static class386 field3989 = new class386(128);

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public static int field4003 = 0;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "Z")
    public static boolean field4012 = false;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public int field3999;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    public int field4006;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    private int field4008;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "Lcb;")
    private class344 field3990;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "[I")
    public int[] field3981;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 3)
    public void method1145(int arg0) throws Exception {
        field3979++;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "()V", line = 13)
    public void method1141() throws Exception {
        field4001++;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "()I", line = 24)
    public int method1146() throws Exception {
        field3996++;
        return this.field3999;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V", line = 32)
    public final synchronized void method1704(int arg0) {
        if (class399.field5882 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class399.field5882.field2628[var3] == this) {
                    class399.field5882.field2628[var3] = null;
                }
                if (class399.field5882.field2628[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class399.field5882.field2635 = true;
                while (class399.field5882.field2630) {
                    class322.method1935(true, 50L);
                }
                class399.field5882 = null;
            }
        }
        field3983++;
        this.method1143();
        this.field3985 = true;
        if (arg0 == 2) {
            this.field3981 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([II)V", line = 81)
    private final void method1705(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class281.field4017) {
            var3 = arg1 << 1;
        }
        class268.method1640(arg0, 0, var3);
        this.field4004 -= arg1;
        if (this.field3990 != null && this.field4004 <= 0) {
            this.field4004 += class266.field3763 >> 4;
            class382.method2302(0, this.field3990);
            this.method1709((byte) 49, this.field3990.method2075(), this.field3990);
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
                        class344 var10 = null;
                        class344 var11 = this.field3998[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class82 var12 = var11.field4987;
                                if (var12 == null || var12.field1125 <= var8) {
                                    var11.field4988 = true;
                                    int var13 = var11.method644();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1125 += var13;
                                    }
                                    if (var4 >= this.field3980) {
                                        break label107;
                                    }
                                    class344 var14 = var11.method642();
                                    if (var14 != null) {
                                        int var15 = var11.field4986;
                                        while (var14 != null) {
                                            this.method1709((byte) 43, var15 * var14.method2075() >> 8, var14);
                                            var14 = var11.method645();
                                        }
                                    }
                                    class344 var16 = var11.field4989;
                                    var11.field4989 = null;
                                    if (var10 == null) {
                                        this.field3998[var7] = var16;
                                    } else {
                                        var10.field4989 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4007[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4989;
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
                class344 var18 = this.field3998[var17];
                this.field3998[var17] = this.field4007[var17] = null;
                while (var18 != null) {
                    class344 var19 = var18.field4989;
                    var18.field4989 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4004 < 0) {
            this.field4004 = 0;
        }
        if (this.field3990 != null) {
            this.field3990.method651(arg0, 0, arg1);
        }
        this.field3984 = class109.method653(false);
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "()V", line = 239)
    public void method1144() throws Exception {
        field4010++;
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V", line = 247)
    public final void method1706(int arg0) {
        field3982++;
        if (arg0 <= 46) {
            this.field4008 = 20;
        }
        this.field3995 = true;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)Ltj;", line = 260)
    public static final class125 method1707(byte arg0) {
        if (arg0 != -5) {
            return null;
        }
        field3986++;
        try {
            return (class125) Class.forName("lm").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 287)
    public void method1147(Component arg0) throws Exception {
        field3993++;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)V", line = 294)
    private final void method1708(byte arg0, int arg1) {
        this.field4004 -= arg1;
        field3994++;
        if (arg0 != 17) {
            this.method1704(48);
        }
        if (this.field4004 < 0) {
            this.field4004 = 0;
        }
        if (this.field3990 != null) {
            this.field3990.method650(arg1);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BILcb;)V", line = 317)
    private final void method1709(byte arg0, int arg1, class344 arg2) {
        field3992++;
        int var4 = arg1 >> 5;
        class344 var5 = this.field4007[var4];
        if (var5 == null) {
            this.field3998[var4] = arg2;
        } else {
            var5.field4989 = arg2;
        }
        this.field4007[var4] = arg2;
        if (arg0 >= 4) {
            arg2.field4986 = arg1;
        }
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V", line = 344)
    public final synchronized void method1710(int arg0) {
        field3988++;
        if (this.field3985) {
            return;
        }
        long var2 = class109.method653(false);
        try {
            if ((this.field3984 + 500000L) < var2) {
                this.field3984 = var2 - 500000L;
            }
            while (this.field3984 + 5000L < var2) {
                this.method1708((byte) 17, 256);
                this.field3984 += (256000 / class266.field3763);
            }
        } catch (Exception var7) {
            this.field3984 = var2;
        }
        if (this.field3981 == null) {
            return;
        }
        try {
            if (this.field4009 != 0L) {
                if (var2 < this.field4009) {
                    return;
                }
                this.method1145(this.field3999);
                this.field4009 = 0L;
                this.field3995 = true;
            }
            int var4 = this.method1146();
            if (this.field4005 - var4 > this.field4000) {
                this.field4000 = this.field4005 - var4;
            }
            int var5 = this.field4008 + this.field4006;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field3999 < (var5 + 256)) {
                this.field3999 += 1024;
                if (this.field3999 > 16384) {
                    this.field3999 = 16384;
                }
                this.method1143();
                this.method1145(this.field3999);
                var4 = 0;
                if (this.field3999 < (var5 + 256)) {
                    var5 = this.field3999 - 256;
                    this.field4008 = var5 - this.field4006;
                }
                this.field3995 = true;
            }
            while (var5 > var4) {
                this.method1705(this.field3981, 256);
                var4 += 256;
                this.method1144();
            }
            if (var2 > this.field3997) {
                if (this.field3995) {
                    this.field3995 = false;
                } else if (this.field4000 == 0 && this.field4011 == 0) {
                    this.method1143();
                    this.field4009 = var2 + 2000L;
                    return;
                } else {
                    this.field4008 = Math.min(this.field4011, this.field4000);
                    this.field4011 = this.field4000;
                }
                this.field3997 = var2 + 2000L;
                this.field4000 = 0;
            }
            this.field4005 = var4;
        } catch (Exception var6) {
            this.method1143();
            this.field4009 = var2 + 2000L;
        }
        if (arg0 > -19) {
            this.method1708((byte) -49, -92);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V", line = 466)
    public final synchronized void method1711(boolean arg0) {
        field4002++;
        this.field3995 = arg0;
        try {
            this.method1141();
        } catch (Exception var2) {
            this.method1143();
            this.field4009 = class109.method653(false) + 2000L;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lcb;I)V", line = 486)
    public final synchronized void method1712(class344 arg0, int arg1) {
        field3987++;
        this.field3990 = arg0;
        int var3 = 1 % ((-arg1 - 34) / 33);
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)V", line = 522)
    public static void method1713(int arg0) {
        field3989 = null;
        if (arg0 >= -56) {
            field3989 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "()V", line = 533)
    public void method1143() {
        field3991++;
    }
}
