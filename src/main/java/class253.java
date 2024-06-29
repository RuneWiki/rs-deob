import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class253 extends class170 {

    @OriginalMember(owner = "client!pd", name = "zb", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!pd", name = "Ab", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!pd", name = "Cb", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!pd", name = "Db", descriptor = "I")
    private int field4200;

    @OriginalMember(owner = "client!pd", name = "Eb", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!pd", name = "Fb", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!pd", name = "Gb", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!pd", name = "Hb", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!pd", name = "Ib", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!pd", name = "Jb", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!pd", name = "Kb", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!pd", name = "Lb", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!pd", name = "Bb", descriptor = "Lqi;")
    private class275 field4198;

    @OriginalMember(owner = "client!pd", name = "Mb", descriptor = "Ljava/awt/Frame;")
    public static Frame field4209;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "(B)V", line = 5)
    public static void method1759(byte arg0) {
        field4209 = null;
        int var1 = -87 % ((arg0 - 15) / 50);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(ZI)I", line = 14)
    public static final int method1760(boolean arg0, int arg1) {
        field4205++;
        int var2 = arg1 & 0x3F;
        if (arg0) {
            method1764(12, -100);
        }
        int var3 = (arg1 & 0xF6) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBIIII)V", line = 70)
    public static final void method1761(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = (arg2 - 32) * arg2 / arg4;
        field4203++;
        if (arg1 < 30) {
            return;
        }
        class263.field4400[0].method38(arg0, arg5);
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg2 - var6 - 32) * arg3 / (arg4 - arg2);
        class263.field4400[1].method38(arg0, arg5 + arg2 - 16);
        if (!class55.field815) {
            class272.method1892(arg0, arg5 + 16, 16, arg2 - 32, class20.field273);
            class272.method1892(arg0, arg5 + var7 + 16, 16, var6, class75.field1215);
            class272.method1897(arg0, arg5 + var7 + 16, var6, class38.field579);
            class272.method1897(arg0 + 1, arg5 - -16 + var7, var6, class38.field579);
            class272.method1900(arg0, arg5 + var7 + 16, 16, class38.field579);
            class272.method1900(arg0, arg5 - (-var7 - 17), 16, class38.field579);
            class272.method1897(arg0 + 15, arg5 - -16 - -var7, var6, class100.field1606);
            class272.method1897(arg0 + 14, arg5 - -17 + var7, var6 - 1, class100.field1606);
            class272.method1900(arg0, arg5 + var6 + var7 + 15, 16, class100.field1606);
            class272.method1900(arg0 + 1, arg5 + 14 + var6 + var7, 15, class100.field1606);
            return;
        }
        class240.method1688(arg0, arg5 + 16, 16, arg2 - 32, class20.field273);
        class240.method1688(arg0, var7 + arg5 + 16, 16, var6, class75.field1215);
        class240.method1682(arg0, arg5 + var7 + 16, var6, class38.field579);
        class240.method1682(arg0 + 1, var7 + 16 + arg5, var6, class38.field579);
        class240.method1690(arg0, arg5 + var7 + 16, 16, class38.field579);
        class240.method1690(arg0, arg5 + var7 + 17, 16, class38.field579);
        class240.method1682(arg0 + 15, arg5 - -16 + var7, var6, class100.field1606);
        class240.method1682(arg0 + 14, var7 + 17 + arg5, var6 - 1, class100.field1606);
        class240.method1690(arg0, arg5 + 15 - (-var7 - var6), 16, class100.field1606);
        class240.method1690(arg0 + 1, arg5 + 14 - -var6 + var7, 15, class100.field1606);
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(BI)I", line = 136)
    public final int method1762(byte arg0, int arg1) {
        int var3 = this.field4200 >> 3;
        field4204++;
        int var4 = 8 - (this.field4200 & 0x7);
        this.field4200 += arg1;
        int var5 = 0;
        while (arg1 > var4) {
            var5 += (class213.field3503[var4] & this.field2758[var3++]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6 = -72 % ((-arg0 - 56) / 54);
        int var7;
        if (arg1 == var4) {
            var7 = (class213.field3503[var4] & this.field2758[var3]) + var5;
        } else {
            var7 = (this.field2758[var3] >> var4 - arg1 & class213.field3503[arg1]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([II)V", line = 164)
    public final void method1763(int[] arg0, int arg1) {
        field4202++;
        this.field4198 = new class275(arg0);
        if (arg1 != -28247) {
            this.method1769(112);
        }
    }

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "(II)Z", line = 175)
    public static final boolean method1764(int arg0, int arg1) {
        field4201++;
        if (class314.field5317[arg0]) {
            return true;
        } else if (class219.field3560.method2046((byte) -120, arg0)) {
            int var2 = class219.field3560.method2040(arg0, (byte) -97);
            if (var2 == 0) {
                class314.field5317[arg0] = true;
                return true;
            }
            if (class239.field3986[arg0] == null) {
                class239.field3986[arg0] = new class263[var2];
            }
            for (int var3 = arg1; var3 < var2; var3++) {
                if (class239.field3986[arg0][var3] == null) {
                    byte[] var4 = class219.field3560.method2042(arg0, var3, (byte) -119);
                    if (var4 != null) {
                        class239.field3986[arg0][var3] = new class263();
                        class239.field3986[arg0][var3].field4392 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class239.field3986[arg0][var3].method1817(false, new class170(var4));
                        } else {
                            class239.field3986[arg0][var3].method1821((byte) -70, new class170(var4));
                        }
                    }
                }
            }
            class314.field5317[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "(I)V", line = 232)
    public final void method1765(int arg0) {
        this.field4200 = this.field2787 * 8;
        field4196++;
        if (arg0 != -1) {
            this.field4198 = (class275) null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V", line = 244)
    public class253(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "(I)V", line = 255)
    public final void method1766(int arg0) {
        field4208++;
        this.field2787 = (this.field4200 + 7) / 8;
        int var2 = 6 / ((-arg0 - 23) / 62);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI[BI)V", line = 266)
    public final void method1767(byte arg0, int arg1, byte[] arg2, int arg3) {
        field4197++;
        for (int var5 = 0; var5 < arg3; var5++) {
            arg2[arg1 + var5] = (byte) (this.field2758[this.field2787++] - this.field4198.method1927(8));
        }
        if (arg0 <= 45) {
            this.method1769(92);
        }
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(ZI)V", line = 288)
    public final void method1768(boolean arg0, int arg1) {
        field4199++;
        if (arg0) {
            this.field2758[this.field2787++] = (byte) (this.field4198.method1927(8) + arg1);
        }
    }

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "(I)I", line = 300)
    public final int method1769(int arg0) {
        if (arg0 > -49) {
            return -30;
        } else {
            field4206++;
            return this.field2758[this.field2787++] - this.field4198.method1927(8) & 0xFF;
        }
    }

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "(II)I", line = 311)
    public final int method1770(int arg0, int arg1) {
        if (arg0 < 47) {
            this.field4200 = 30;
        }
        field4207++;
        return arg1 * 8 - this.field4200;
    }
}
