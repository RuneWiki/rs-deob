import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class70 {

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "[B")
    private byte[] field1783;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "[I")
    private int[] field1778;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "[I")
    private int[] field1785;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "Lja;")
    private static class62 field1777 = class30.method243(43, "green:");

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lja;")
    public static class62 field1775 = field1777;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field1772 = 0;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Lja;")
    public static class62 field1781 = class30.method243(43, "logo");

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Z")
    public static boolean field1786 = false;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lja;")
    public static class62 field1774 = field1777;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field1790 = 500;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "Lja;")
    private static class62 field1793 = class30.method243(43, "Cancel");

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "Lja;")
    public static class62 field1782 = field1793;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public static int field1792 = 0;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Lrb;")
    public static class119 field1788 = new class119();

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "Lo;")
    public static class100 field1794 = new class100(5000);

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public static int field1797 = 0;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "Lja;")
    public static class62 field1795 = class30.method243(43, "::fpsoff");

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public static int field1796 = 1;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "Lea;")
    public static class29 field1798;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "Lmf;")
    public static class89 field1789;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BII[BI)I")
    public final int method593(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field1773++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = arg0 + arg2;
        int var8 = arg3;
        int var9 = arg5;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var8 = this.field1778[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field1778[var8]) < 0) {
                arg4[arg2++] = (byte) ~var11;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1778[var8];
            }
            int var12;
            if ((var12 = this.field1778[var8]) < 0) {
                arg4[arg2++] = (byte) ~var12;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1778[var8];
            }
            int var13;
            if ((var13 = this.field1778[var8]) < 0) {
                arg4[arg2++] = (byte) ~var13;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1778[var8];
            }
            int var14;
            if ((var14 = this.field1778[var8]) < 0) {
                arg4[arg2++] = (byte) ~var14;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1778[var8];
            }
            int var15;
            if ((var15 = this.field1778[var8]) < 0) {
                arg4[arg2++] = (byte) ~var15;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1778[var8];
            }
            int var16;
            if ((var16 = this.field1778[var8]) < 0) {
                arg4[arg2++] = (byte) ~var16;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1778[var8];
            }
            int var17;
            if ((var17 = this.field1778[var8]) < 0) {
                arg4[arg2++] = (byte) ~var17;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1778[var8];
            }
            int var18;
            if ((var18 = this.field1778[var8]) < 0) {
                arg4[arg2++] = (byte) ~var18;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([Lja;I)Lja;")
    public static final class62 method594(class62[] arg0, int arg1) {
        if (arg1 != 1229) {
            field1775 = null;
        }
        field1776++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class47.method333(arg0.length, -121, 0, arg0);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZII)V")
    public static final void method595(int arg0, boolean arg1, int arg2, int arg3) {
        field1791++;
        class54 var4 = class68.method533((byte) 76, arg2, arg3);
        if (var4 != null && var4.field1320 != null) {
            class113 var5 = new class113();
            var5.field2610 = var4;
            var5.field2601 = var4.field1320;
            class124.method976(var5, -101);
        }
        class79.field1915 = arg3;
        class90.field2145 = true;
        class52.field1201 = arg0;
        class119.field2732 = arg2;
        client.method163(var4, -93);
        if (arg1) {
            method596(-99);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static void method596(int arg0) {
        field1793 = null;
        field1795 = null;
        field1788 = null;
        field1775 = null;
        field1774 = null;
        field1782 = null;
        field1794 = null;
        field1789 = null;
        field1777 = null;
        field1781 = null;
        if (arg0 <= 90) {
            field1794 = null;
        }
        field1798 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III[BI[B)I")
    public final int method597(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        int var7 = arg4 << 3;
        if (arg0 != 215231619) {
            field1781 = null;
        }
        int var8 = arg1 + arg2;
        int var9 = 0;
        field1787++;
        while (arg1 < var8) {
            int var10 = arg5[arg1] & 0xFF;
            int var11 = this.field1785[var10];
            byte var12 = this.field1783[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var7 >> 3;
            int var14 = var7 & 0x7;
            int var15 = (var14 + var12 - 1 >> 3) + var13;
            int var16 = var9 & -var14 >> 31;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var9 = class85.method660(var16, var11 >>> var17));
            if (var13 < var15) {
                var14 = var17 - 8;
                var13++;
                arg3[var13] = (byte) (var9 = var11 >>> var14);
                if (var13 < var15) {
                    var13++;
                    var14 -= 8;
                    arg3[var13] = (byte) (var9 = var11 >>> var14);
                    if (var15 > var13) {
                        var13++;
                        var14 -= 8;
                        arg3[var13] = (byte) (var9 = var11 >>> var14);
                        if (var15 > var13) {
                            var13++;
                            var14 -= 8;
                            arg3[var13] = (byte) (var9 = var11 << -var14);
                        }
                    }
                }
            }
            var7 += var12;
            arg1++;
        }
        return (var7 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static final void method598(byte arg0) {
        field1780++;
        Object var1 = class40.field925;
        synchronized (class40.field925) {
            if (arg0 != -110) {
                method595(50, true, -13, 73);
            }
            if (class130.field2976 != 0) {
                class130.field2976 = 1;
                try {
                    class40.field925.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "([B)V")
    public class70(byte[] arg0) {
        int var2 = 0;
        int[] var3 = new int[33];
        int var4 = arg0.length;
        this.field1783 = arg0;
        this.field1778 = new int[8];
        this.field1785 = new int[var4];
        for (int var5 = 0; var5 < var4; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1785[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class85.method660(var11, var12);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field1778[var14] == 0) {
                            this.field1778[var14] = var2;
                        }
                        var14 = this.field1778[var14];
                    }
                    if (var14 >= this.field1778.length) {
                        int[] var17 = new int[this.field1778.length * 2];
                        for (int var18 = 0; var18 < this.field1778.length; var18++) {
                            var17[var18] = this.field1778[var18];
                        }
                        this.field1778 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var2 <= var14) {
                    var2 = var14 + 1;
                }
                this.field1778[var14] = ~var5;
            }
        }
    }
}
