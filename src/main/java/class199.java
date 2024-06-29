import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class199 {

    @OriginalMember(owner = "client!ffa", name = "p", descriptor = "I")
    public int field3015;

    @OriginalMember(owner = "client!ffa", name = "t", descriptor = "Z")
    public boolean field3019;

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "Z")
    public boolean field3002;

    @OriginalMember(owner = "client!ffa", name = "o", descriptor = "[S")
    public short[] field3014;

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "I")
    public int field3006;

    @OriginalMember(owner = "client!ffa", name = "i", descriptor = "I")
    private int field3008;

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "I")
    public static int field3004 = 0;

    @OriginalMember(owner = "client!ffa", name = "m", descriptor = "S")
    public static short field3012 = 32767;

    @OriginalMember(owner = "client!ffa", name = "j", descriptor = "Lvl;")
    public static class15 field3009 = new class15(85, 8);

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "I")
    private int field3003;

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "I")
    private int field3005;

    @OriginalMember(owner = "client!ffa", name = "h", descriptor = "I")
    private int field3007;

    @OriginalMember(owner = "client!ffa", name = "k", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!ffa", name = "l", descriptor = "I")
    private int field3011;

    @OriginalMember(owner = "client!ffa", name = "n", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!ffa", name = "q", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!ffa", name = "r", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!ffa", name = "s", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!ffa", name = "u", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "Lbq;")
    public class307 field3001;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IZIII)V")
    public final void method1430(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        this.field3011 = arg4;
        if (arg1) {
            this.field3019 = false;
        }
        this.field3007 = arg2;
        field3016++;
        this.field3003 = arg3;
        this.field3005 = arg0;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V")
    private final void method1431(int arg0) {
        field3020++;
        int var2 = this.field3006;
        if (var2 == 2) {
            this.field3011 = 1;
            this.field3007 = 2048;
            this.field3003 = 2048;
            this.field3005 = 0;
        } else if (var2 == 3) {
            this.field3005 = 0;
            this.field3003 = 2048;
            this.field3007 = 4096;
            this.field3011 = 1;
        } else if (var2 == 4) {
            this.field3005 = 0;
            this.field3011 = 4;
            this.field3007 = 2048;
            this.field3003 = 2048;
        } else if (var2 == 5) {
            this.field3007 = 8192;
            this.field3011 = 4;
            this.field3005 = 0;
            this.field3003 = 2048;
        } else if (var2 == 12) {
            this.field3005 = 0;
            this.field3011 = 2;
            this.field3007 = 2048;
            this.field3003 = 2048;
        } else if (var2 == 13) {
            this.field3005 = 0;
            this.field3007 = 8192;
            this.field3003 = 2048;
            this.field3011 = 2;
        } else if (var2 == 10) {
            this.field3005 = 1536;
            this.field3003 = 512;
            this.field3011 = 3;
            this.field3007 = 2048;
        } else if (var2 == 11) {
            this.field3005 = 1536;
            this.field3003 = 512;
            this.field3011 = 3;
            this.field3007 = 4096;
        } else if (var2 == 6) {
            this.field3005 = 1280;
            this.field3007 = 2048;
            this.field3011 = 3;
            this.field3003 = 768;
        } else if (var2 == 7) {
            this.field3007 = 4096;
            this.field3011 = 3;
            this.field3003 = 768;
            this.field3005 = 1280;
        } else if (var2 == 8) {
            this.field3003 = 1024;
            this.field3011 = 3;
            this.field3005 = 1024;
            this.field3007 = 2048;
        } else if (var2 == 9) {
            this.field3003 = 1024;
            this.field3007 = 4096;
            this.field3011 = 3;
            this.field3005 = 1024;
        } else if (var2 == 14) {
            this.field3003 = 768;
            this.field3011 = 1;
            this.field3007 = 2048;
            this.field3005 = 1280;
        } else if (var2 == 15) {
            this.field3007 = 4096;
            this.field3005 = 1536;
            this.field3011 = 1;
            this.field3003 = 512;
        } else if (var2 == 16) {
            this.field3007 = 8192;
            this.field3005 = 1792;
            this.field3011 = 1;
            this.field3003 = 256;
        } else {
            this.field3011 = 0;
            this.field3005 = 0;
            this.field3003 = 2048;
            this.field3007 = 2048;
        }
        if (arg0 < 18) {
            this.field3001 = null;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIBIILha;)V")
    private final void method1432(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class66 arg6) {
        if (arg3 != -36) {
            this.method1432(53, -1, 93, (byte) 113, 35, 91, null);
        }
        this.field3001 = arg6.method531(arg2, arg4, arg0, arg1, arg5, 1.0F);
        field3017++;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIII)V")
    public static final void method1433(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class619.field8609 = arg2;
        class355.field4849 = arg4;
        class657.field9101 = arg1;
        class326.field4453 = arg3;
        field3000++;
        class518.field7039 = arg5;
        int var6 = 68 / ((-arg0 - 13) / 58);
        if (class657.field9101 >= 100) {
            int var7 = class619.field8609 * 512 + 256;
            int var8 = class326.field4453 * 512 + 256;
            int var9 = class309.method1973(15356, var7, var8, class282.field3917) - class518.field7039;
            int var10 = var7 - class733.field10131;
            int var11 = var9 - class605.field8452;
            int var12 = var8 - class450.field6172;
            int var13 = (int) Math.sqrt((double) (var10 * var10 + var12 * var12));
            class255.field3585 = (int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D) & 0x3FFF;
            class460.field6249 = (int) (Math.atan2((double) var10, (double) var12) * -2607.5945876176133D) & 0x3FFF;
            class463.field6307 = 0;
            if (class255.field3585 < 1024) {
                class255.field3585 = 1024;
            }
            if (class255.field3585 > 3072) {
                class255.field3585 = 3072;
            }
        }
        class536.field7291 = 2;
        class100.field1626 = -1;
        class577.field8185 = -1;
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V")
    public static void method1434(int arg0) {
        if (arg0 != 0) {
            method1433(-97, 47, -70, -77, -35, -88);
        }
        field3009 = null;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZII)V")
    public final void method1435(boolean arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method1432(-73, 38, -11, (byte) 90, 101, -21, null);
        }
        field3018++;
        int var4;
        if (arg0) {
            var4 = 2048;
        } else {
            int var5 = this.field3007 * arg2 / 50 + this.field3008 & 0x7FF;
            int var6 = this.field3011;
            if (var6 == 1) {
                var4 = (class191.field2937[var5 << 3] >> 4) + 1024;
            } else if (var6 == 3) {
                var4 = class183.field2844[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 >= 1024 ? 2048 - var5 : var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        this.field3001.method1398((byte) 125, (float) ((this.field3003 * var4 >> 11) + this.field3005) / 2048.0F);
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "()V")
    protected class199() {
        if (class183.field2844 == null) {
            class602.method3422((byte) 14);
        }
        this.method1431(68);
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lha;Lfca;I)V")
    public class199(class66 arg0, class93 arg1, int arg2) {
        if (class183.field2844 == null) {
            class602.method3422((byte) 14);
        }
        this.field3015 = arg1.method793((byte) 65);
        this.field3019 = (this.field3015 & 0x8) != 0;
        this.field3002 = (this.field3015 & 0x10) != 0;
        this.field3015 &= 0x7;
        int var4 = arg1.method763(110) << arg2;
        int var5 = arg1.method763(-75) << arg2;
        int var6 = arg1.method763(126) << arg2;
        int var7 = arg1.method793((byte) 5);
        int var8 = var7 * 2 + 1;
        this.field3014 = new short[var8];
        for (int var9 = 0; var9 < this.field3014.length; var9++) {
            short var13 = (short) arg1.method763(107);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            if (var15 > (var8 - var14)) {
                var15 = var8 - var14;
            }
            this.field3014[var9] = (short) class530.method3011(var15, var14 << 8);
        }
        int var10 = (var7 << class654.field9055) + class370.field5022;
        int var11 = class424.field5802 == null ? class624.field8692[class752.method4172(arg1.method763(-106), 1474149255) & 0xFFFF] : class424.field5802[arg1.method763(99)];
        int var12 = arg1.method793((byte) 33);
        this.field3006 = var12 & 0x1F;
        this.field3008 = var12 & 0xE0 << 3;
        if (this.field3006 != 31) {
            this.method1431(23);
        }
        this.method1432(var5, var10, var4, (byte) -36, var6, var11, arg0);
    }
}
