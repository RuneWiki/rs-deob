import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class120 implements Runnable {

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Lgk;")
    private class259 field1714 = new class259();

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Z")
    private boolean field1717 = false;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public int field1719 = 0;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "Ljava/lang/Thread;")
    private Thread field1720;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "[C")
    public static char[] field1715 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1718 = "rating: ";

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Lbc;")
    public static class282 field1705;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lcg;I)V")
    private final void method781(class247 arg0, int arg1) {
        field1709++;
        class259 var3 = this.field1714;
        synchronized (this.field1714) {
            this.field1714.method1656(arg0, (byte) -86);
            this.field1719++;
            this.field1714.notifyAll();
        }
        if (arg1 != 8212) {
            this.field1717 = false;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method782(byte arg0) {
        field1705 = null;
        if (arg0 == 63) {
            field1718 = null;
            field1715 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V")
    public static final void method783(int arg0, int arg1, int arg2) {
        class263 var3 = class251.method1610(1, arg1);
        if (arg2 != 710) {
            method787((byte) 37, -83);
        }
        field1707++;
        int var4 = var3.field3819;
        int var5 = var3.field3818;
        int var6 = var3.field3817;
        int var7 = class36.field418[var6 - var4];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        class282.method1846(arg0 << var4 & var8 | ~var8 & class19.field224[var5], var5, (byte) 1);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Llb;I[BI)Lcg;")
    public final class247 method784(class105 arg0, int arg1, byte[] arg2, int arg3) {
        field1713++;
        class247 var5 = new class247();
        if (arg1 > -88) {
            this.method786(-67);
        }
        var5.field339 = false;
        var5.field3588 = arg0;
        var5.field3599 = arg2;
        var5.field3592 = 2;
        var5.field651 = (long) arg3;
        this.method781(var5, 8212);
        return var5;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Llb;II)Lcg;")
    public final class247 method785(class105 arg0, int arg1, int arg2) {
        field1711++;
        class247 var4 = new class247();
        var4.field3588 = arg0;
        var4.field339 = false;
        var4.field651 = (long) arg2;
        var4.field3592 = 3;
        if (arg1 < 22) {
            return null;
        } else {
            this.method781(var4, 8212);
            return var4;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public final void method786(int arg0) {
        if (arg0 < 13) {
            this.field1717 = false;
        }
        this.field1717 = true;
        class259 var2 = this.field1714;
        synchronized (this.field1714) {
            this.field1714.notifyAll();
        }
        field1712++;
        try {
            this.field1720.join();
        } catch (InterruptedException var3) {
        }
        this.field1720 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)I")
    public static final int method787(byte arg0, int arg1) {
        if (arg0 == -112) {
            field1716++;
            return arg1 & 0x3FF;
        } else {
            return -68;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILlb;B)Lcg;")
    public final class247 method788(int arg0, class105 arg1, byte arg2) {
        class247 var4 = new class247();
        var4.field3592 = 1;
        field1706++;
        class259 var5 = this.field1714;
        synchronized (this.field1714) {
            class247 var6 = (class247) this.field1714.method1657((byte) 122);
            while (true) {
                if (var6 == null) {
                    if (arg2 <= 1) {
                        field1715 = null;
                    }
                    break;
                }
                if ((long) arg0 == var6.field651 && var6.field3588 == arg1 && var6.field3592 == 2) {
                    var4.field338 = false;
                    var4.field3599 = var6.field3599;
                    return var4;
                }
                var6 = (class247) this.field1714.method1658(-30630);
            }
        }
        var4.field3599 = arg1.method634(1288987528, arg0);
        var4.field339 = true;
        var4.field338 = false;
        return var4;
    }

    @OriginalMember(owner = "client!md", name = "run", descriptor = "()V")
    public final void run() {
        field1710++;
        while (!this.field1717) {
            class259 var1 = this.field1714;
            class247 var2;
            synchronized (this.field1714) {
                var2 = (class247) this.field1714.method1664((byte) -81);
                if (var2 == null) {
                    try {
                        this.field1714.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field1719--;
            }
            try {
                if (var2.field3592 == 2) {
                    var2.field3588.method638(6, var2.field3599, (int) var2.field651, var2.field3599.length);
                } else if (var2.field3592 == 3) {
                    var2.field3599 = var2.field3588.method634(1288987528, (int) var2.field651);
                }
            } catch (Exception var6) {
                class142.method918(-1, var6, (String) null);
            }
            var2.field338 = false;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    public class120() {
        class81 var1 = class115.field1592.method341(11569, 5, this);
        while (var1.field960 == 0) {
            class247.method1595(10L, (byte) -83);
        }
        if (var1.field960 == 2) {
            throw new RuntimeException();
        }
        this.field1720 = (Thread) var1.field958;
    }
}
