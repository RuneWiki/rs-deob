import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class123 {

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "I")
    public int field1590;

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "Z")
    public boolean field1582;

    @OriginalMember(owner = "client!ku", name = "r", descriptor = "Z")
    public boolean field1594;

    @OriginalMember(owner = "client!ku", name = "t", descriptor = "[S")
    public short[] field1596;

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
    private int field1586;

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "I")
    public int field1579;

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "[I")
    public static int[] field1581 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!ku", name = "s", descriptor = "[I")
    public static int[] field1595 = new int[2048];

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
    private int field1578;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "I")
    private int field1585;

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "I")
    private int field1588;

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "I")
    private int field1589;

    @OriginalMember(owner = "client!ku", name = "p", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!ku", name = "q", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!ku", name = "u", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!ku", name = "o", descriptor = "Lhj;")
    public class329 field1591;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method753(int arg0, int arg1, int arg2) {
        field1597++;
        if (arg1 != -18310) {
            method755(6);
        }
        return (arg2 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lsaa;I)Z", line = 16)
    public static final boolean method754(class507 arg0, int arg1) {
        field1587++;
        if (arg1 == -24883) {
            return class164.field2067 == arg0 || class577.field7972 == arg0 || class335.field4924 == arg0 || class75.field952 == arg0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V", line = 40)
    public static final void method755(int arg0) {
        class96.field1186 = 0;
        class257.field3565 = 0;
        class488.field6586 = 0;
        class332.field4851 = 0;
        if (arg0 != -16646) {
            method755(-52);
        }
        field1577++;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V", line = 59)
    private final void method756(byte arg0) {
        field1592++;
        if (arg0 < 120) {
            method759(-117, -49, 81);
        }
        int var2 = this.field1579;
        if (var2 == 2) {
            this.field1588 = 1;
            this.field1589 = 2048;
            this.field1585 = 2048;
            this.field1578 = 0;
        } else if (var2 == 3) {
            this.field1585 = 2048;
            this.field1588 = 1;
            this.field1578 = 0;
            this.field1589 = 4096;
        } else if (var2 == 4) {
            this.field1578 = 0;
            this.field1588 = 4;
            this.field1589 = 2048;
            this.field1585 = 2048;
        } else if (var2 == 5) {
            this.field1589 = 8192;
            this.field1588 = 4;
            this.field1578 = 0;
            this.field1585 = 2048;
        } else if (var2 == 12) {
            this.field1585 = 2048;
            this.field1578 = 0;
            this.field1588 = 2;
            this.field1589 = 2048;
        } else if (var2 == 13) {
            this.field1588 = 2;
            this.field1578 = 0;
            this.field1585 = 2048;
            this.field1589 = 8192;
        } else if (var2 == 10) {
            this.field1585 = 512;
            this.field1588 = 3;
            this.field1589 = 2048;
            this.field1578 = 1536;
        } else if (var2 == 11) {
            this.field1589 = 4096;
            this.field1588 = 3;
            this.field1585 = 512;
            this.field1578 = 1536;
        } else if (var2 == 6) {
            this.field1578 = 1280;
            this.field1589 = 2048;
            this.field1585 = 768;
            this.field1588 = 3;
        } else if (var2 == 7) {
            this.field1589 = 4096;
            this.field1578 = 1280;
            this.field1588 = 3;
            this.field1585 = 768;
        } else if (var2 == 8) {
            this.field1588 = 3;
            this.field1578 = 1024;
            this.field1589 = 2048;
            this.field1585 = 1024;
        } else if (var2 == 9) {
            this.field1588 = 3;
            this.field1589 = 4096;
            this.field1585 = 1024;
            this.field1578 = 1024;
        } else if (var2 == 14) {
            this.field1588 = 1;
            this.field1585 = 768;
            this.field1578 = 1280;
            this.field1589 = 2048;
        } else if (var2 == 15) {
            this.field1588 = 1;
            this.field1585 = 512;
            this.field1578 = 1536;
            this.field1589 = 4096;
        } else if (var2 == 16) {
            this.field1578 = 1792;
            this.field1585 = 256;
            this.field1589 = 8192;
            this.field1588 = 1;
        } else {
            this.field1589 = 2048;
            this.field1585 = 2048;
            this.field1588 = 0;
            this.field1578 = 0;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IZB)V", line = 261)
    public final void method757(int arg0, boolean arg1, byte arg2) {
        if (arg2 != -111) {
            this.field1586 = 105;
        }
        field1584++;
        int var6;
        if (arg1) {
            var6 = 2048;
        } else {
            int var4 = this.field1589 * arg0 / 50 + this.field1586 & 0x7FF;
            int var5 = this.field1588;
            if (var5 == 1) {
                var6 = (class654.field9259[var4 << 3] >> 4) + 1024;
            } else if (var5 == 3) {
                var6 = class73.field938[var4] >> 1;
            } else if (var5 == 4) {
                var6 = var4 >> 10 << 11;
            } else if (var5 == 2) {
                var6 = var4;
            } else if (var5 == 5) {
                var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
            } else {
                var6 = 2048;
            }
        }
        this.field1591.method1720(-22243, (float) (this.field1578 + (this.field1585 * var6 >> 11)) / 2048.0F);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIIII)V", line = 340)
    public final void method758(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1585 = arg2;
        this.field1589 = arg3;
        if (arg1 != 512) {
            this.field1591 = null;
        }
        this.field1578 = arg0;
        this.field1588 = arg4;
        field1583++;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(III)Z", line = 354)
    public static final boolean method759(int arg0, int arg1, int arg2) {
        field1580++;
        if (arg0 <= 102) {
            method755(64);
        }
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILoa;IIII)V", line = 366)
    private final void method760(int arg0, int arg1, class689 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 2086) {
            this.field1596 = null;
        }
        field1593++;
        this.field1591 = arg2.method1940(arg3, arg1, arg6, arg5, arg0, 1.0F);
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)V", line = 379)
    public static void method761(int arg0) {
        field1581 = null;
        field1595 = null;
        if (arg0 != 16) {
            method754(null, 116);
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "()V", line = 392)
    protected class123() {
        if (class73.field938 == null) {
            class19.method105(true);
        }
        this.method756((byte) 123);
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Loa;Ldga;I)V", line = 402)
    public class123(class689 arg0, class138 arg1, int arg2) {
        if (class73.field938 == null) {
            class19.method105(true);
        }
        this.field1590 = arg1.method957((byte) -124);
        this.field1582 = (this.field1590 & 0x8) != 0;
        this.field1594 = (this.field1590 & 0x10) != 0;
        this.field1590 &= 0x7;
        int var4 = arg1.method922((byte) -122) << arg2;
        int var5 = arg1.method922((byte) -125) << arg2;
        int var6 = arg1.method922((byte) -115) << arg2;
        int var7 = arg1.method957((byte) -64);
        int var8 = var7 * 2 + 1;
        this.field1596 = new short[var8];
        for (int var9 = 0; var9 < this.field1596.length; var9++) {
            short var13 = (short) arg1.method922((byte) -116);
            int var14 = var13 >>> 8;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if (var8 - var14 < var15) {
                var15 = var8 - var14;
            }
            this.field1596[var9] = (short) class288.method1722(var15, var14 << 8);
        }
        int var10 = (var7 << class428.field5949) + class49.field656;
        int var11 = class91.field1112 == null ? class554.field7586[class306.method1836(127, arg1.method922((byte) -123)) & 0xFFFF] : class91.field1112[arg1.method922((byte) -123)];
        int var12 = arg1.method957((byte) -79);
        this.field1586 = (var12 & 0xE0) << 3;
        this.field1579 = var12 & 0x1F;
        if (this.field1579 != 31) {
            this.method756((byte) 121);
        }
        this.method760(var11, var6, arg0, var4, 2086, var10, var5);
    }
}
