import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class351 {

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    private int field4996 = 32;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "Z")
    private boolean field4999 = false;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "J")
    private long field5001 = class10.method63(-21149);

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "Z")
    private boolean field5011 = true;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "[Lwm;")
    private class298[] field5014 = new class298[8];

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "[Lwm;")
    private class298[] field5012 = new class298[8];

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    private int field5017 = 0;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    private int field5016 = 0;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "J")
    private long field5018 = 0L;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "J")
    private long field5019 = 0L;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    private int field5020 = 0;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    private int field5021 = 0;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field4986 = 0;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field4983 = 0;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "[I")
    public static int[] field4988 = new int[2500];

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field4984 = 0;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "[I")
    public static int[] field4987 = new int[2500];

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "Ljava/lang/String;")
    public static String field5006 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    public int field5010;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
    public int field5013;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    private int field5015;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "Lwm;")
    private class298 field4993;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "[I")
    public int[] field4997;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public void method18(int arg0) throws Exception {
        field5009++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([II)V")
    private final void method2249(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class122.field1929) {
            var3 = arg1 << 1;
        }
        class82.method639(arg0, 0, var3);
        this.field5020 -= arg1;
        if (this.field4993 != null && this.field5020 <= 0) {
            this.field5020 += class326.field4692 >> 4;
            class297.method2063(this.field4993, true);
            this.method2259((byte) -108, this.field4993, this.field4993.method180());
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
                        class298 var10 = null;
                        class298 var11 = this.field5012[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class142 var12 = var11.field4403;
                                if (var12 == null || var12.field2234 <= var8) {
                                    var11.field4405 = true;
                                    int var13 = var11.method185();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field2234 += var13;
                                    }
                                    if (var4 >= this.field4996) {
                                        break label107;
                                    }
                                    class298 var14 = var11.method206();
                                    if (var14 != null) {
                                        int var15 = var11.field4404;
                                        while (var14 != null) {
                                            this.method2259((byte) -113, var14, var15 * var14.method180() >> 8);
                                            var14 = var11.method183();
                                        }
                                    }
                                    class298 var16 = var11.field4406;
                                    var11.field4406 = null;
                                    if (var10 == null) {
                                        this.field5012[var7] = var16;
                                    } else {
                                        var10.field4406 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field5014[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4406;
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
                class298 var18 = this.field5012[var17];
                this.field5012[var17] = this.field5014[var17] = null;
                while (var18 != null) {
                    class298 var19 = var18.field4406;
                    var18.field4406 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field5020 < 0) {
            this.field5020 = 0;
        }
        if (this.field4993 != null) {
            this.field4993.method187(arg0, 0, arg1);
        }
        this.field5001 = class10.method63(-21149);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V")
    private final void method2250(int arg0, int arg1) {
        int var3 = 10 / ((-arg0 - 61) / 50);
        this.field5020 -= arg1;
        field5002++;
        if (this.field5020 < 0) {
            this.field5020 = 0;
        }
        if (this.field4993 != null) {
            this.field4993.method173(arg1);
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
    public static void method2251(int arg0) {
        field4987 = null;
        field5006 = null;
        field4988 = null;
        if (arg0 <= 104) {
            method2251(-18);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)I")
    public static final int method2252(int arg0, byte arg1) {
        field5000++;
        class74 var2 = class220.method1679((byte) -15, arg0);
        if (arg1 != -38) {
            method2254(-108, (byte) 111);
        }
        int var3 = var2.field1276;
        int var4 = var2.field1281;
        int var5 = var2.field1275;
        int var6 = class263.field3962[var5 - var4];
        return var6 & field4988[var3] >> var4;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lwm;B)V")
    public final synchronized void method2253(class298 arg0, byte arg1) {
        if (arg1 == -22) {
            this.field4993 = arg0;
            field4994++;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method20(Component arg0) throws Exception {
        field4991++;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(IB)V")
    public static final void method2254(int arg0, byte arg1) {
        if (arg1 > -94) {
            return;
        }
        field4982++;
        if (class439.field6387 == 0) {
            class416.field6028.method1591(-92, arg0);
        } else {
            class267.field4004 = arg0;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "()V")
    public void method21() throws Exception {
        field4985++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V")
    public final synchronized void method2255(boolean arg0) {
        if (class356.field5061 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class356.field5061.field5552[var3] == this) {
                    class356.field5061.field5552[var3] = null;
                }
                if (class356.field5061.field5552[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class356.field5061.field5548 = true;
                while (class356.field5061.field5541) {
                    class134.method1106(50L, 10);
                }
                class356.field5061 = null;
            }
        }
        field4998++;
        this.method16();
        this.field4999 = true;
        this.field4997 = null;
        if (arg0) {
            field4990 = -53;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "()V")
    public void method16() {
        field5007++;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(Z)V")
    public final synchronized void method2256(boolean arg0) {
        field4995++;
        this.field5011 = arg0;
        try {
            this.method19();
        } catch (Exception var2) {
            this.method16();
            this.field5018 = class10.method63(-21149) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "()I")
    public int method17() throws Exception {
        field5003++;
        return this.field5013;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V")
    public final void method2257(int arg0) {
        this.field5011 = true;
        if (arg0 != -17664) {
            this.method2257(-77);
        }
        field4989++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    public final synchronized void method2258(byte arg0) {
        field5005++;
        if (this.field4999) {
            return;
        }
        long var2 = class10.method63(-21149);
        try {
            if (var2 > this.field5001 + 500000L) {
                this.field5001 = var2 - 500000L;
            }
            while (var2 > this.field5001 + 5000L) {
                this.method2250(-120, 256);
                this.field5001 += (long) (256000 / class326.field4692);
            }
        } catch (Exception var7) {
            this.field5001 = var2;
        }
        if (this.field4997 == null) {
            return;
        }
        try {
            if (this.field5018 != 0L) {
                if (var2 < this.field5018) {
                    return;
                }
                this.method18(this.field5013);
                this.field5018 = 0L;
                this.field5011 = true;
            }
            int var4 = this.method17();
            if (this.field5016 < this.field5017 - var4) {
                this.field5016 = this.field5017 - var4;
            }
            int var5 = this.field5015 + this.field5010;
            if (arg0 >= 65) {
                if (var5 + 256 > 16384) {
                    var5 = 16128;
                }
                if (this.field5013 < (var5 + 256)) {
                    this.field5013 += 1024;
                    if (this.field5013 > 16384) {
                        this.field5013 = 16384;
                    }
                    this.method16();
                    var4 = 0;
                    this.method18(this.field5013);
                    if (var5 + 256 > this.field5013) {
                        var5 = this.field5013 - 256;
                        this.field5015 = var5 - this.field5010;
                    }
                    this.field5011 = true;
                }
                while (var5 > var4) {
                    this.method2249(this.field4997, 256);
                    var4 += 256;
                    this.method21();
                }
                if (this.field5019 < var2) {
                    if (this.field5011) {
                        this.field5011 = false;
                    } else if (this.field5016 == 0 && this.field5021 == 0) {
                        this.method16();
                        this.field5018 = var2 + 2000L;
                        return;
                    } else {
                        this.field5015 = Math.min(this.field5021, this.field5016);
                        this.field5021 = this.field5016;
                    }
                    this.field5016 = 0;
                    this.field5019 = var2 + 2000L;
                }
                this.field5017 = var4;
            }
        } catch (Exception var6) {
            this.method16();
            this.field5018 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "()V")
    public void method19() throws Exception {
        field5004++;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLwm;I)V")
    private final void method2259(byte arg0, class298 arg1, int arg2) {
        field5008++;
        int var4 = arg2 >> 5;
        class298 var5 = this.field5014[var4];
        if (var5 == null) {
            this.field5012[var4] = arg1;
        } else {
            var5.field4406 = arg1;
        }
        this.field5014[var4] = arg1;
        if (arg0 > -97) {
            this.field4993 = null;
        }
        arg1.field4404 = arg2;
    }
}
