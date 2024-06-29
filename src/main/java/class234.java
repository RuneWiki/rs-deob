import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class234 {

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    private int field4080 = 32;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "J")
    private long field4098 = class25.method182(true);

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "[Lv;")
    private class147[] field4103 = new class147[8];

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "J")
    private long field4104 = 0L;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
    private int field4101 = 0;

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "Z")
    private boolean field4109 = true;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "J")
    private long field4105 = 0L;

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "I")
    private int field4110 = 0;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "[Lv;")
    private class147[] field4102 = new class147[8];

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "I")
    private int field4111 = 0;

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
    private int field4112 = 0;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "Loh;")
    public static class263 field4084 = class253.method1681(-127, "<col=ff0000>");

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Lli;")
    public static class277 field4083 = new class277();

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "[I")
    public static int[] field4100 = new int[1000];

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "Loh;")
    public static class263 field4099 = class253.method1681(-118, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "Lig;")
    public static class9 field4108 = null;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
    public int field4106;

    @OriginalMember(owner = "client!ci", name = "D", descriptor = "I")
    private int field4107;

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "I")
    public int field4113;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "Lv;")
    private class147 field4089;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "[I")
    public int[] field4085;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([II)[I")
    public static final int[] method1569(int[] arg0, int arg1) {
        field4094++;
        if (arg0 == null) {
            return null;
        }
        int[] var2 = new int[arg0.length];
        class149.method979(arg0, 0, var2, 0, arg0.length);
        if (arg1 <= 43) {
            field4083 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "()I")
    public int method545() throws Exception {
        field4081++;
        return this.field4106;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
    private final void method1570(int arg0, int arg1) {
        this.field4101 -= arg0;
        if (arg1 > -27) {
            return;
        }
        if (this.field4101 < 0) {
            this.field4101 = 0;
        }
        if (this.field4089 != null) {
            this.field4089.method744(arg0);
        }
        field4079++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public final synchronized void method1571(byte arg0) {
        if (class220.field3900 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class220.field3900.field2594[var3] == this) {
                    class220.field3900.field2594[var3] = null;
                }
                if (class220.field3900.field2594[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class220.field3900.field2604 = true;
                while (class220.field3900.field2605) {
                    class215.method1457(50L, (byte) 122);
                }
                class220.field3900 = null;
            }
        }
        this.method542();
        this.field4085 = null;
        field4097++;
        if (arg0 != 51) {
            this.field4105 = 118L;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lv;Z)V")
    public final synchronized void method1572(class147 arg0, boolean arg1) {
        if (!arg1) {
            this.method1575(-64);
        }
        this.field4089 = arg0;
        field4078++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
    public final synchronized void method1573(boolean arg0) {
        this.field4109 = arg0;
        try {
            this.method541();
        } catch (Exception var2) {
            this.method542();
            this.field4105 = class25.method182(true) + 2000L;
        }
        field4096++;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "([II)V")
    private final void method1574(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class137.field2526) {
            var3 = arg1 << 1;
        }
        class149.method976(arg0, 0, var3);
        this.field4101 -= arg1;
        if (this.field4089 != null && this.field4101 <= 0) {
            this.field4101 += class198.field3580 >> 4;
            class161.method1061(124, this.field4089);
            this.method1579(this.field4089, this.field4089.method964(), 92);
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
                        class147 var10 = null;
                        class147 var11 = this.field4102[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class123 var12 = var11.field2683;
                                if (var12 == null || var12.field2275 <= var8) {
                                    var11.field2685 = true;
                                    int var13 = var11.method741();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2275 += var13;
                                    }
                                    if (var4 >= this.field4080) {
                                        break label107;
                                    }
                                    class147 var14 = var11.method747();
                                    if (var14 != null) {
                                        int var15 = var11.field2684;
                                        while (var14 != null) {
                                            this.method1579(var14, var15 * var14.method964() >> 8, -115);
                                            var14 = var11.method742();
                                        }
                                    }
                                    class147 var16 = var11.field2686;
                                    var11.field2686 = null;
                                    if (var10 == null) {
                                        this.field4102[var7] = var16;
                                    } else {
                                        var10.field2686 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4103[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2686;
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
                class147 var18 = this.field4102[var17];
                this.field4102[var17] = this.field4103[var17] = null;
                while (var18 != null) {
                    class147 var19 = var18.field2686;
                    var18.field2686 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4101 < 0) {
            this.field4101 = 0;
        }
        if (this.field4089 != null) {
            this.field4089.method748(arg0, 0, arg1);
        }
        this.field4098 = class25.method182(true);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public final void method1575(int arg0) {
        this.field4109 = true;
        if (arg0 != 0) {
            this.field4089 = null;
        }
        field4092++;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
    public static void method1576(int arg0) {
        if (arg0 != 1) {
            field4108 = null;
        }
        field4084 = null;
        field4100 = null;
        field4083 = null;
        field4099 = null;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V")
    public void method544(int arg0) throws Exception {
        field4090++;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "()V")
    public void method542() {
        field4091++;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "()V")
    public void method541() throws Exception {
        field4093++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method540(Component arg0) throws Exception {
        field4087++;
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "()V")
    public void method546() throws Exception {
        field4095++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)V")
    public static final void method1577(int arg0, byte arg1) {
        class64 var2 = class84.method563(6, arg0, -73);
        var2.method393(-73);
        field4086++;
        if (arg1 != 78) {
            field4099 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V")
    public final synchronized void method1578(int arg0) {
        field4088++;
        if (this.field4085 == null) {
            return;
        }
        long var2 = class25.method182(true);
        try {
            if (this.field4105 != 0L) {
                if (var2 < this.field4105) {
                    return;
                }
                this.method544(this.field4106);
                this.field4105 = 0L;
                this.field4109 = true;
            }
            int var4 = this.method545();
            if ((this.field4111 - var4) > this.field4112) {
                this.field4112 = this.field4111 - var4;
            }
            int var5 = this.field4113 + this.field4107;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field4106 < var5 + 256) {
                this.field4106 += 1024;
                if (this.field4106 > 16384) {
                    this.field4106 = 16384;
                }
                this.method542();
                var4 = 0;
                this.method544(this.field4106);
                this.field4109 = true;
                if (var5 + 256 > this.field4106) {
                    var5 = this.field4106 - 256;
                    this.field4107 = var5 - this.field4113;
                }
            }
            while (var4 < var5) {
                var4 += 256;
                this.method1574(this.field4085, 256);
                this.method546();
            }
            if (var2 > this.field4104) {
                if (this.field4109) {
                    this.field4109 = false;
                } else if (this.field4112 == 0 && this.field4110 == 0) {
                    this.method542();
                    this.field4105 = var2 + 2000L;
                    return;
                } else {
                    this.field4107 = Math.min(this.field4110, this.field4112);
                    this.field4110 = this.field4112;
                }
                this.field4112 = 0;
                this.field4104 = var2 + 2000L;
            }
            this.field4111 = var4;
            if (arg0 <= 75) {
                this.field4103 = null;
            }
        } catch (Exception var7) {
            this.method542();
            this.field4105 = var2 + 2000L;
        }
        try {
            if (var2 > this.field4098 + 500000L) {
                var2 = this.field4098;
            }
            while (var2 > this.field4098 + 5000L) {
                this.method1570(256, -79);
                this.field4098 += (long) (256000 / class198.field3580);
            }
        } catch (Exception var6) {
            this.field4098 = var2;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lv;II)V")
    private final void method1579(class147 arg0, int arg1, int arg2) {
        field4082++;
        int var4 = arg1 >> 5;
        class147 var5 = this.field4103[var4];
        if (var5 == null) {
            this.field4102[var4] = arg0;
        } else {
            var5.field2686 = arg0;
        }
        int var6 = -53 / ((-arg2 - 46) / 61);
        this.field4103[var4] = arg0;
        arg0.field2684 = arg1;
    }
}
