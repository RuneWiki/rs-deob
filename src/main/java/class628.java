import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class628 {

    @OriginalMember(owner = "client!oea", name = "q", descriptor = "I")
    public int field8702;

    @OriginalMember(owner = "client!oea", name = "j", descriptor = "Z")
    public boolean field8695;

    @OriginalMember(owner = "client!oea", name = "m", descriptor = "Z")
    public boolean field8698;

    @OriginalMember(owner = "client!oea", name = "k", descriptor = "[S")
    public short[] field8696;

    @OriginalMember(owner = "client!oea", name = "n", descriptor = "I")
    private int field8699;

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "I")
    public int field8688;

    @OriginalMember(owner = "client!oea", name = "g", descriptor = "I")
    public static int field8692 = 0;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "Ltt;")
    public static class338 field8686 = new class338(35, 7);

    @OriginalMember(owner = "client!oea", name = "t", descriptor = "I")
    public static int field8705 = 1;

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "I")
    private int field8689;

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "I")
    private int field8691;

    @OriginalMember(owner = "client!oea", name = "h", descriptor = "I")
    private int field8693;

    @OriginalMember(owner = "client!oea", name = "i", descriptor = "I")
    public static int field8694;

    @OriginalMember(owner = "client!oea", name = "l", descriptor = "I")
    private int field8697;

    @OriginalMember(owner = "client!oea", name = "o", descriptor = "I")
    public static int field8700;

    @OriginalMember(owner = "client!oea", name = "p", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!oea", name = "r", descriptor = "I")
    public static int field8703;

    @OriginalMember(owner = "client!oea", name = "s", descriptor = "Lga;")
    public static class332 field8704;

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "Lqea;")
    public class392 field8687;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIBI)V", line = 15)
    public final void method3478(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        this.field8689 = arg2;
        this.field8691 = arg0;
        if (arg3 > 5) {
            this.field8693 = arg1;
            this.field8697 = arg4;
            field8703++;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIILr;III)V", line = 29)
    private final void method3479(int arg0, int arg1, int arg2, class562 arg3, int arg4, int arg5, int arg6) {
        if (arg0 >= -126) {
            this.method3482((byte) -8, true, -21);
        }
        this.field8687 = arg3.method1152(arg2, arg4, arg1, arg6, arg5, 1.0F);
        field8694++;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)V", line = 40)
    private final void method3480(byte arg0) {
        field8690++;
        int var2 = this.field8688;
        if (var2 == 2) {
            this.field8693 = 0;
            this.field8697 = 2048;
            this.field8691 = 2048;
            this.field8689 = 1;
        } else if (var2 == 3) {
            this.field8693 = 0;
            this.field8691 = 2048;
            this.field8697 = 4096;
            this.field8689 = 1;
        } else if (var2 == 4) {
            this.field8689 = 4;
            this.field8693 = 0;
            this.field8691 = 2048;
            this.field8697 = 2048;
        } else if (var2 == 5) {
            this.field8689 = 4;
            this.field8693 = 0;
            this.field8691 = 2048;
            this.field8697 = 8192;
        } else if (var2 == 12) {
            this.field8697 = 2048;
            this.field8693 = 0;
            this.field8689 = 2;
            this.field8691 = 2048;
        } else if (var2 == 13) {
            this.field8693 = 0;
            this.field8691 = 2048;
            this.field8689 = 2;
            this.field8697 = 8192;
        } else if (var2 == 10) {
            this.field8689 = 3;
            this.field8697 = 2048;
            this.field8693 = 1536;
            this.field8691 = 512;
        } else if (var2 == 11) {
            this.field8693 = 1536;
            this.field8689 = 3;
            this.field8691 = 512;
            this.field8697 = 4096;
        } else if (var2 == 6) {
            this.field8691 = 768;
            this.field8697 = 2048;
            this.field8693 = 1280;
            this.field8689 = 3;
        } else if (var2 == 7) {
            this.field8693 = 1280;
            this.field8697 = 4096;
            this.field8689 = 3;
            this.field8691 = 768;
        } else if (var2 == 8) {
            this.field8689 = 3;
            this.field8697 = 2048;
            this.field8693 = 1024;
            this.field8691 = 1024;
        } else if (var2 == 9) {
            this.field8689 = 3;
            this.field8691 = 1024;
            this.field8697 = 4096;
            this.field8693 = 1024;
        } else if (var2 == 14) {
            this.field8691 = 768;
            this.field8689 = 1;
            this.field8693 = 1280;
            this.field8697 = 2048;
        } else if (var2 == 15) {
            this.field8693 = 1536;
            this.field8697 = 4096;
            this.field8691 = 512;
            this.field8689 = 1;
        } else if (var2 == 16) {
            this.field8697 = 8192;
            this.field8693 = 1792;
            this.field8689 = 1;
            this.field8691 = 256;
        } else {
            this.field8691 = 2048;
            this.field8697 = 2048;
            this.field8689 = 0;
            this.field8693 = 0;
        }
        int var3 = -39 % ((-arg0 - 17) / 49);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V", line = 247)
    public static void method3481(int arg0) {
        if (arg0 == 14411) {
            field8704 = null;
            field8686 = null;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(BZI)V", line = 259)
    public final void method3482(byte arg0, boolean arg1, int arg2) {
        field8700++;
        int var4 = -75 % ((arg0 + 14) / 54);
        int var5;
        if (arg1) {
            var5 = 2048;
        } else {
            int var6 = this.field8697 * arg2 / 50 + this.field8699 & 0x7FF;
            int var7 = this.field8689;
            if (var7 == 1) {
                var5 = (class240.field3176[var6 << 3] >> 4) + 1024;
            } else if (var7 == 3) {
                var5 = class262.field3411[var6] >> 1;
            } else if (var7 == 4) {
                var5 = var6 >> 10 << 11;
            } else if (var7 == 2) {
                var5 = var6;
            } else if (var7 == 5) {
                var5 = (var6 < 1024 ? var6 : 2048 - var6) << 1;
            } else {
                var5 = 2048;
            }
        }
        this.field8687.method212((float) (this.field8693 + (this.field8691 * var5 >> 11)) / 2048.0F, -25467);
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "()V", line = 337)
    protected class628() {
        if (class262.field3411 == null) {
            class381.method2183(-1);
        }
        this.method3480((byte) 120);
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(B)V", line = 349)
    public static final void method3483(byte arg0) {
        field8701++;
        int var1 = (int) ((double) class703.field9886 * 34.46D);
        int var2 = var1 << 2;
        int var3 = -69 / ((arg0 - 24) / 43);
        if (class146.field1963.method1071()) {
            var2 += 512;
        }
        class146.field1963.method1090(200, var2);
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(Lr;Lio;I)V", line = 364)
    public class628(class562 arg0, class157 arg1, int arg2) {
        if (class262.field3411 == null) {
            class381.method2183(-1);
        }
        this.field8702 = arg1.method930(255);
        this.field8695 = (this.field8702 & 0x8) != 0;
        this.field8698 = (this.field8702 & 0x10) != 0;
        this.field8702 &= 0x7;
        int var4 = arg1.method963(-118) << arg2;
        int var5 = arg1.method963(-118) << arg2;
        int var6 = arg1.method963(-123) << arg2;
        int var7 = arg1.method930(255);
        int var8 = var7 * 2 + 1;
        this.field8696 = new short[var8];
        for (int var9 = 0; var9 < this.field8696.length; var9++) {
            short var13 = (short) arg1.method963(-128);
            int var14 = var13 >>> 8;
            if (var14 >= var8) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var15 > (var8 - var14)) {
                var15 = var8 - var14;
            }
            this.field8696[var9] = (short) class665.method3789(var15, var14 << 8);
        }
        int var10 = (var7 << class62.field762) + class332.field4443;
        int var11 = class104.field1240 == null ? class310.field4189[class227.method1412(-10, arg1.method963(-128)) & 0xFFFF] : class104.field1240[arg1.method963(-118)];
        int var12 = arg1.method930(255);
        this.field8699 = var12 & 0xE0 << 3;
        this.field8688 = var12 & 0x1F;
        if (this.field8688 != 31) {
            this.method3480((byte) 100);
        }
        this.method3479(-127, var5, var4, arg0, var6, var11, var10);
    }
}
