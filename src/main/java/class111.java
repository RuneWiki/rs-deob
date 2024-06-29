import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class111 {

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Z")
    private boolean field1673 = false;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    private int field1687 = 32;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "J")
    private long field1674 = class257.method1736(14361);

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
    private int field1701 = 0;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "Z")
    private boolean field1699 = true;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    private int field1700 = 0;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "[Lgj;")
    private class271[] field1705 = new class271[8];

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "[Lgj;")
    private class271[] field1706 = new class271[8];

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "J")
    private long field1707 = 0L;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "J")
    private long field1708 = 0L;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    private int field1709 = 0;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    private int field1710 = 0;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "[[I")
    public static int[][] field1682 = new int[5][5000];

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field1693 = 0;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
    private int field1702;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    public int field1703;

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
    public int field1704;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "Lgj;")
    private class271 field1692;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "Ljk;")
    public static class297 field1695;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "[I")
    public static int[] field1681;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "[I")
    public int[] field1698;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
    public final void method799(boolean arg0) {
        this.field1699 = true;
        if (arg0) {
            this.field1710 = -64;
        }
        field1679++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "()V")
    public void method199() throws Exception {
        field1696++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)V")
    private final void method800(boolean arg0, int arg1) {
        if (arg0) {
            this.method811((byte) -45);
        }
        field1697++;
        this.field1700 -= arg1;
        if (this.field1700 < 0) {
            this.field1700 = 0;
        }
        if (this.field1692 != null) {
            this.field1692.method280(arg1);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method801(byte arg0, String arg1) {
        field1689++;
        int var2 = arg1.length();
        long var3 = 0L;
        if (arg0 > -54) {
            field1693 = -68;
        }
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = ((var3 << 5) + ((long) arg1.charAt(var5))) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjk;IIIILji;)V")
    public static final void method802(int arg0, class297 arg1, int arg2, int arg3, int arg4, int arg5, class256 arg6) {
        field1691++;
        if (arg6 == null) {
            return;
        }
        int var7 = (int) class89.field1349 + class96.field1420 & 0x7FF;
        int var8 = arg3 * arg3 + arg5 * arg5;
        int var9 = Math.max(arg1.field4627 / 2, arg1.field4531 / 2) + 10;
        if (var8 > var9 * var9) {
            return;
        }
        int var10 = class119.field1774[var7];
        int var11 = var10 * 256 / (class258.field3958 + 256);
        int var12 = class119.field1776[var7];
        int var13 = var12 * 256 / (class258.field3958 + 256);
        int var14 = arg3 * var13 + arg5 * var11 >> 16;
        if (arg2 > -7) {
            field1693 = 69;
        }
        int var15 = arg5 * var13 - (arg3 * var11) >> 16;
        ((class289) arg6).method1913(arg1.field4627 / 2 + arg0 - (arg6.field3941 / 2 + -var14), arg1.field4531 / 2 + -var15 + -(arg6.field3943 / 2) + arg4, arg1.field4550, arg1.field4645);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BZII)Ljava/lang/String;")
    public static final String method803(byte arg0, boolean arg1, int arg2, int arg3) {
        field1686++;
        if (arg0 <= 113) {
            return null;
        } else if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg1 && arg2 >= 0) {
            int var4 = 2;
            int var5 = arg2 / arg3;
            while (var5 != 0) {
                var5 /= arg3;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg2;
                arg2 /= arg3;
                int var9 = var8 - (arg2 * arg3);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BILgj;)V")
    private final void method804(byte arg0, int arg1, class271 arg2) {
        int var4 = -111 % ((-arg0 - 61) / 40);
        field1690++;
        int var5 = arg1 >> 5;
        class271 var6 = this.field1705[var5];
        if (var6 == null) {
            this.field1706[var5] = arg2;
        } else {
            var6.field4223 = arg2;
        }
        this.field1705[var5] = arg2;
        arg2.field4220 = arg1;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static void method805(int arg0) {
        field1681 = null;
        field1695 = null;
        if (arg0 != 25045) {
            field1695 = null;
        }
        field1682 = null;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public void method201(int arg0) throws Exception {
        field1683++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLgj;)V")
    public final synchronized void method806(byte arg0, class271 arg1) {
        int var3 = -6 / ((41 - arg0) / 33);
        this.field1692 = arg1;
        field1678++;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "()V")
    public void method197() {
        field1685++;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
    public static final void method807(int arg0) {
        if (arg0 != 700) {
            field1695 = null;
        }
        class81.field1261.method940(75);
        class15.field219.method940(101);
        field1694++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public final synchronized void method808(byte arg0) {
        if (arg0 >= -58) {
            method802(12, (class297) null, -21, 100, 83, 76, (class256) null);
        }
        field1677++;
        this.field1699 = true;
        try {
            this.method202();
        } catch (Exception var2) {
            this.method197();
            this.field1707 = class257.method1736(14361) + 2000L;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([II)V")
    private final void method809(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class133.field1955) {
            var3 = arg1 << 1;
        }
        class41.method337(arg0, 0, var3);
        this.field1700 -= arg1;
        if (this.field1692 != null && this.field1700 <= 0) {
            this.field1700 += class174.field2547 >> 4;
            class59.method485(this.field1692, 123);
            this.method804((byte) -122, this.field1692.method238(), this.field1692);
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
                        class271 var10 = null;
                        class271 var11 = this.field1706[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class53 var12 = var11.field4221;
                                if (var12 == null || var12.field843 <= var8) {
                                    var11.field4222 = true;
                                    int var13 = var11.method275();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field843 += var13;
                                    }
                                    if (var4 >= this.field1687) {
                                        break label107;
                                    }
                                    class271 var14 = var11.method259();
                                    if (var14 != null) {
                                        int var15 = var11.field4220;
                                        while (var14 != null) {
                                            this.method804((byte) -107, var15 * var14.method238() >> 8, var14);
                                            var14 = var11.method250();
                                        }
                                    }
                                    class271 var16 = var11.field4223;
                                    var11.field4223 = null;
                                    if (var10 == null) {
                                        this.field1706[var7] = var16;
                                    } else {
                                        var10.field4223 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1705[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4223;
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
                class271 var18 = this.field1706[var17];
                this.field1706[var17] = this.field1705[var17] = null;
                while (var18 != null) {
                    class271 var19 = var18.field4223;
                    var18.field4223 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1700 < 0) {
            this.field1700 = 0;
        }
        if (this.field1692 != null) {
            this.field1692.method262(arg0, 0, arg1);
        }
        this.field1674 = class257.method1736(14361);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method198(Component arg0) throws Exception {
        field1671++;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "()I")
    public int method203() throws Exception {
        field1680++;
        return this.field1704;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "()V")
    public void method202() throws Exception {
        field1672++;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
    public final synchronized void method810(int arg0) {
        field1684++;
        if (this.field1673) {
            return;
        }
        long var2 = class257.method1736(14361);
        try {
            if (this.field1674 + 500000L < var2) {
                this.field1674 = var2 - 500000L;
            }
            while (this.field1674 + 5000L < var2) {
                this.method800(false, 256);
                this.field1674 += (long) (256000 / class174.field2547);
            }
        } catch (Exception var7) {
            this.field1674 = var2;
        }
        if (this.field1698 == null) {
            return;
        }
        try {
            if (this.field1707 != 0L) {
                if (this.field1707 > var2) {
                    return;
                }
                this.method201(this.field1704);
                this.field1707 = 0L;
                this.field1699 = true;
            }
            int var4 = this.method203();
            if ((this.field1701 - var4) > this.field1710) {
                this.field1710 = this.field1701 - var4;
            }
            if (arg0 <= 14) {
                this.method809((int[]) null, 89);
            }
            int var5 = this.field1703 + this.field1702;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field1704 < var5 + 256) {
                this.field1704 += 1024;
                var4 = 0;
                if (this.field1704 > 16384) {
                    this.field1704 = 16384;
                }
                this.method197();
                this.method201(this.field1704);
                this.field1699 = true;
                if (this.field1704 < var5 + 256) {
                    var5 = this.field1704 - 256;
                    this.field1702 = var5 - this.field1703;
                }
            }
            while (var4 < var5) {
                this.method809(this.field1698, 256);
                this.method199();
                var4 += 256;
            }
            if (this.field1708 < var2) {
                if (this.field1699) {
                    this.field1699 = false;
                } else if (this.field1710 == 0 && this.field1709 == 0) {
                    this.method197();
                    this.field1707 = var2 + 2000L;
                    return;
                } else {
                    this.field1702 = Math.min(this.field1709, this.field1710);
                    this.field1709 = this.field1710;
                }
                this.field1708 = var2 + 2000L;
                this.field1710 = 0;
            }
            this.field1701 = var4;
        } catch (Exception var6) {
            this.method197();
            this.field1707 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
    public final synchronized void method811(byte arg0) {
        field1675++;
        if (class275.field4249 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class275.field4249.field98[var3] == this) {
                    class275.field4249.field98[var3] = null;
                }
                if (class275.field4249.field98[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class275.field4249.field97 = true;
                while (class275.field4249.field103) {
                    client.method323(50L, arg0 ^ 0x8);
                }
                class275.field4249 = null;
            }
        }
        this.method197();
        this.field1673 = true;
        this.field1698 = null;
        if (arg0 != -116) {
            this.method808((byte) 44);
        }
    }
}
