import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class289 {

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "I")
    private int field4115 = 32;

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "Z")
    private boolean field4114 = false;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "J")
    private long field4111 = class375.method2193(116);

    @OriginalMember(owner = "client!uu", name = "z", descriptor = "[Lgu;")
    private class581[] field4131 = new class581[8];

    @OriginalMember(owner = "client!uu", name = "x", descriptor = "[Lgu;")
    private class581[] field4129 = new class581[8];

    @OriginalMember(owner = "client!uu", name = "t", descriptor = "J")
    private long field4125 = 0L;

    @OriginalMember(owner = "client!uu", name = "B", descriptor = "J")
    private long field4133 = 0L;

    @OriginalMember(owner = "client!uu", name = "A", descriptor = "Z")
    private boolean field4132 = true;

    @OriginalMember(owner = "client!uu", name = "r", descriptor = "I")
    private int field4123 = 0;

    @OriginalMember(owner = "client!uu", name = "C", descriptor = "I")
    private int field4134 = 0;

    @OriginalMember(owner = "client!uu", name = "E", descriptor = "I")
    private int field4136 = 0;

    @OriginalMember(owner = "client!uu", name = "u", descriptor = "I")
    private int field4126 = 0;

    @OriginalMember(owner = "client!uu", name = "q", descriptor = "Z")
    public static boolean field4122 = false;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!uu", name = "k", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!uu", name = "n", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!uu", name = "o", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!uu", name = "p", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!uu", name = "s", descriptor = "I")
    public int field4124;

    @OriginalMember(owner = "client!uu", name = "v", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!uu", name = "w", descriptor = "I")
    private int field4128;

    @OriginalMember(owner = "client!uu", name = "y", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!uu", name = "D", descriptor = "I")
    public int field4135;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "Lgu;")
    private class581 field4109;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "[I")
    public int[] field4106;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "[Lut;")
    public static class126[] field4110;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IB)V", line = 4)
    private final void method1791(int arg0, byte arg1) {
        if (arg1 != 40) {
            return;
        }
        this.field4123 -= arg0;
        field4127++;
        if (this.field4123 < 0) {
            this.field4123 = 0;
        }
        if (this.field4109 != null) {
            this.field4109.method60(arg0);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "()V", line = 25)
    public void method1421() throws Exception {
        field4119++;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "()I", line = 32)
    public int method1423() throws Exception {
        field4130++;
        return this.field4124;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V", line = 43)
    public final synchronized void method1792(int arg0) {
        field4118++;
        if (arg0 <= 116) {
            return;
        }
        this.field4132 = true;
        try {
            this.method1421();
        } catch (Exception var2) {
            this.method1425();
            this.field4125 = class375.method2193(116) + 2000L;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "([II)V", line = 63)
    private final void method1793(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class27.field430) {
            var3 = arg1 << 1;
        }
        class335.method2019(arg0, 0, var3);
        this.field4123 -= arg1;
        if (this.field4109 != null && this.field4123 <= 0) {
            this.field4123 += class405.field5646 >> 4;
            class286.method1769(this.field4109, (byte) -86);
            this.method1798(this.field4109, (byte) -117, this.field4109.method2925());
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
                        class581 var10 = null;
                        class581 var11 = this.field4129[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class523 var12 = var11.field7626;
                                if (var12 == null || var12.field6947 <= var8) {
                                    var11.field7627 = true;
                                    int var13 = var11.method49();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field6947 += var13;
                                    }
                                    if (var4 >= this.field4115) {
                                        break label107;
                                    }
                                    class581 var14 = var11.method33();
                                    if (var14 != null) {
                                        int var15 = var11.field7624;
                                        while (var14 != null) {
                                            this.method1798(var14, (byte) -87, var15 * var14.method2925() >> 8);
                                            var14 = var11.method53();
                                        }
                                    }
                                    class581 var16 = var11.field7625;
                                    var11.field7625 = null;
                                    if (var10 == null) {
                                        this.field4129[var7] = var16;
                                    } else {
                                        var10.field7625 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4131[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field7625;
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
                class581 var18 = this.field4129[var17];
                this.field4129[var17] = this.field4131[var17] = null;
                while (var18 != null) {
                    class581 var19 = var18.field7625;
                    var18.field7625 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4123 < 0) {
            this.field4123 = 0;
        }
        if (this.field4109 != null) {
            this.field4109.method26(arg0, 0, arg1);
        }
        this.field4111 = class375.method2193(116);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 226)
    public void method1422(Component arg0) throws Exception {
        field4121++;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V", line = 233)
    public final synchronized void method1794(int arg0) {
        if (class682.field9523 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class682.field9523.field7353[var3] == this) {
                    class682.field9523.field7353[var3] = null;
                }
                if (class682.field9523.field7353[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class682.field9523.field7357 = true;
                while (class682.field9523.field7352) {
                    class226.method1447((byte) -124, 50L);
                }
                class682.field9523 = null;
            }
        }
        field4117++;
        this.method1425();
        this.field4114 = true;
        if (arg0 > -97) {
            this.method1793(null, -27);
        }
        this.field4106 = null;
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)V", line = 278)
    public void method1420(int arg0) throws Exception {
        field4108++;
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(I)V", line = 287)
    public final synchronized void method1795(int arg0) {
        field4113++;
        if (this.field4114) {
            return;
        }
        long var2 = class375.method2193(arg0 ^ 0x74);
        try {
            if (var2 > (this.field4111 + 6000L)) {
                this.field4111 = var2 - 6000L;
            }
            while (this.field4111 + 5000L < var2) {
                this.method1791(256, (byte) 40);
                this.field4111 += (256000 / class405.field5646);
                var2 = class375.method2193(116);
            }
        } catch (Exception var7) {
            this.field4111 = var2;
        }
        if (this.field4106 == null) {
            return;
        }
        try {
            if ((long) arg0 != this.field4125) {
                if (var2 < this.field4125) {
                    return;
                }
                this.method1420(this.field4124);
                this.field4132 = true;
                this.field4125 = 0L;
            }
            int var4 = this.method1423();
            if ((this.field4136 - var4) > this.field4134) {
                this.field4134 = this.field4136 - var4;
            }
            int var5 = this.field4135 + this.field4128;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field4124) {
                this.field4124 += 1024;
                if (this.field4124 > 16384) {
                    this.field4124 = 16384;
                }
                this.method1425();
                var4 = 0;
                this.method1420(this.field4124);
                this.field4132 = true;
                if ((var5 + 256) > this.field4124) {
                    var5 = this.field4124 - 256;
                    this.field4128 = var5 - this.field4135;
                }
            }
            while (var4 < var5) {
                this.method1793(this.field4106, 256);
                var4 += 256;
                this.method1424();
            }
            if (this.field4133 < var2) {
                if (this.field4132) {
                    this.field4132 = false;
                } else if (this.field4134 == 0 && this.field4126 == 0) {
                    this.method1425();
                    this.field4125 = var2 + 2000L;
                    return;
                } else {
                    this.field4128 = Math.min(this.field4126, this.field4134);
                    this.field4126 = this.field4134;
                }
                this.field4133 = var2 + 2000L;
                this.field4134 = 0;
            }
            this.field4136 = var4;
        } catch (Exception var6) {
            this.method1425();
            this.field4125 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lgu;I)V", line = 402)
    public final synchronized void method1796(class581 arg0, int arg1) {
        field4120++;
        if (arg1 >= 64) {
            this.field4109 = arg0;
        }
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "()V", line = 450)
    public void method1425() {
        field4107++;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V", line = 458)
    public static void method1797(byte arg0) {
        if (arg0 != -29) {
            field4122 = true;
        }
        field4110 = null;
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "()V", line = 486)
    public void method1424() throws Exception {
        field4112++;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lgu;BI)V", line = 493)
    private final void method1798(class581 arg0, byte arg1, int arg2) {
        field4116++;
        int var4 = arg2 >> 5;
        class581 var5 = this.field4131[var4];
        if (var5 == null) {
            this.field4129[var4] = arg0;
        } else {
            var5.field7625 = arg0;
        }
        this.field4131[var4] = arg0;
        if (arg1 <= -68) {
            arg0.field7624 = arg2;
        }
    }
}
