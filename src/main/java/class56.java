import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class56 {

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "I")
    private int field771 = 0;

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "[Lfb;")
    public class45[] field770;

    @OriginalMember(owner = "client!vk", name = "u", descriptor = "I")
    public int field767;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    public static int field758 = -1;

    @OriginalMember(owner = "client!vk", name = "t", descriptor = "[Lio;")
    public static class285[] field766 = new class285[50];

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!vk", name = "v", descriptor = "J")
    private long field768;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "Lfb;")
    private class45 field751;

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "Lfb;")
    private class45 field772;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Lar;")
    public static class47 field747;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "[I")
    public static int[] field748;

    @OriginalMember(owner = "client!vk", name = "w", descriptor = "[[I")
    public static int[][] field769;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 4)
    public static final void method378(int arg0) {
        class185.field2507.method5(-6445, 231);
        if (arg0 != 0) {
            field766 = null;
        }
        field762++;
        class343.field4959++;
        class185.field2507.method1326(class196.field2624, 26);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILlm;I)Lcl;", line = 17)
    public static final class313 method379(int arg0, class347 arg1, int arg2) {
        field765++;
        byte[] var3 = arg1.method2266((byte) 64, arg0);
        if (var3 == null) {
            return null;
        } else {
            if (arg2 != 43) {
                field747 = null;
            }
            return new class313(var3);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BII)V", line = 34)
    public static final void method380(byte arg0, int arg1, int arg2) {
        field750++;
        if (arg0 > 72) {
            class263 var3 = class47.method337(6, 0, arg2);
            var3.method1807((byte) -121);
            var3.field3813 = arg1;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZLfb;J)V", line = 53)
    public final void method381(boolean arg0, class45 arg1, long arg2) {
        if (arg1.field641 != null) {
            arg1.method322(11);
        }
        field759++;
        class45 var5 = this.field770[(int) (arg2 & (long) (this.field767 - 1))];
        arg1.field641 = var5.field641;
        arg1.field636 = var5;
        if (!arg0) {
            field769 = null;
        }
        arg1.field641.field636 = arg1;
        arg1.field640 = arg2;
        arg1.field636.field641 = arg1;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V", line = 75)
    public static void method382(boolean arg0) {
        field766 = null;
        field747 = null;
        field769 = null;
        field748 = null;
        if (!arg0) {
            field758 = 101;
        }
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)I", line = 91)
    public final int method383(int arg0) {
        field755++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field767; var3++) {
            class45 var4 = this.field770[var3];
            for (class45 var5 = var4.field636; var5 != var4; var5 = var5.field636) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(JZ)Lfb;", line = 120)
    public final class45 method384(long arg0, boolean arg1) {
        this.field768 = arg0;
        field761++;
        class45 var4 = this.field770[(int) ((long) (this.field767 - 1) & arg0)];
        for (this.field751 = var4.field636; this.field751 != var4; this.field751 = this.field751.field636) {
            if (this.field751.field640 == arg0) {
                class45 var5 = this.field751;
                this.field751 = this.field751.field636;
                return var5;
            }
        }
        this.field751 = null;
        return arg1 ? null : null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B[Lfb;)I", line = 150)
    public final int method385(byte arg0, class45[] arg1) {
        field757++;
        int var3 = 0;
        int var4 = 103 % ((-arg0 - 20) / 56);
        for (int var5 = 0; var5 < this.field767; var5++) {
            class45 var6 = this.field770[var5];
            for (class45 var7 = var6.field636; var7 != var6; var7 = var7.field636) {
                arg1[var3++] = var7;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)Z", line = 183)
    public static final boolean method386(int arg0, byte arg1) {
        int var2 = -10 / ((-arg1 - 7) / 34);
        field760++;
        if (arg0 == 21 || arg0 == 20 || arg0 == 26 || arg0 == 24 || arg0 == 31) {
            return true;
        } else {
            return arg0 == 50 || arg0 == 43 || arg0 == 1011;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([J[IZ)V", line = 207)
    public static final void method387(long[] arg0, int[] arg1, boolean arg2) {
        if (!arg2) {
            method387((long[]) null, (int[]) null, true);
        }
        field764++;
        class147.method932(arg0, arg0.length - 1, 2, arg1, 0);
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)Lfb;", line = 220)
    public final class45 method388(int arg0) {
        field752++;
        if (arg0 < this.field771 && this.field770[this.field771 - 1] != this.field772) {
            class45 var2 = this.field772;
            this.field772 = var2.field636;
            return var2;
        }
        while (this.field767 > this.field771) {
            class45 var3 = this.field770[this.field771++].field636;
            if (this.field770[this.field771 - 1] != var3) {
                this.field772 = var3.field636;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)Lfb;", line = 250)
    public final class45 method389(int arg0) {
        this.field771 = arg0;
        field754++;
        return this.method388(0);
    }

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "(I)I", line = 262)
    public final int method390(int arg0) {
        field763++;
        if (arg0 != 0) {
            field747 = null;
        }
        return this.field767;
    }

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)V", line = 275)
    public final void method391(int arg0) {
        for (int var2 = 0; var2 < this.field767; var2++) {
            class45 var3 = this.field770[var2];
            while (true) {
                class45 var4 = var3.field636;
                if (var3 == var4) {
                    break;
                }
                var4.method322(11);
            }
        }
        if (arg0 < 39) {
            method386(-128, (byte) -73);
        }
        field756++;
        this.field751 = null;
        this.field772 = null;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(Z)Lfb;", line = 318)
    public final class45 method392(boolean arg0) {
        field753++;
        if (arg0) {
            return null;
        } else if (this.field751 == null) {
            return null;
        } else {
            class45 var2 = this.field770[(int) (this.field768 & (long) (this.field767 - 1))];
            while (this.field751 != var2) {
                if (this.field751.field640 == this.field768) {
                    class45 var3 = this.field751;
                    this.field751 = this.field751.field636;
                    return var3;
                }
                this.field751 = this.field751.field636;
            }
            this.field751 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(I)V", line = 347)
    public class56(int arg0) {
        this.field770 = new class45[arg0];
        this.field767 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class45 var3 = this.field770[var2] = new class45();
            var3.field641 = var3;
            var3.field636 = var3;
        }
    }
}
