import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class265 {

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public int field3538 = 43594;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public int field3541 = 443;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "Z")
    private boolean field3544 = false;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "Z")
    private boolean field3550 = false;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field3552 = 0;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "Z")
    public static boolean field3555 = true;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public int field3554;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "Lufa;")
    public static class140 field3542;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "Ljava/lang/String;")
    public String field3543;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "[Lbq;")
    public static class650[] field3540;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IBIIIII)V")
    public static final void method1635(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3548++;
        int var7 = arg3 + arg5;
        int var8 = arg2 - arg5;
        for (int var9 = arg3; var9 < var7; var9++) {
            class349.method2008(arg0, (byte) 83, class213.field2746[var9], arg6, arg4);
        }
        int var10 = arg5 + arg6;
        int var11 = arg0 - arg5;
        for (int var12 = arg2; var12 > var8; var12--) {
            class349.method2008(arg0, (byte) 72, class213.field2746[var12], arg6, arg4);
        }
        if (arg1 < 17) {
            field3555 = true;
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class213.field2746[var13];
            class349.method2008(var10, (byte) 72, var14, arg6, arg4);
            class349.method2008(arg0, (byte) 65, var14, var11, arg4);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Luk;I)Z")
    public final boolean method1636(class265 arg0, int arg1) {
        int var3 = -72 % ((arg1 - 74) / 43);
        field3546++;
        if (arg0 == null) {
            return false;
        } else {
            return this.field3554 == arg0.field3554 && this.field3543.equals(arg0.field3543);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V")
    public static final void method1637(boolean arg0) {
        if (!arg0) {
            return;
        }
        field3539++;
        if (!class224.method1415(-3)) {
            return;
        }
        if (class612.field8281 == null) {
            class412.method2330(0);
        }
        class183.field2350 = true;
        class677.field9344 = 0;
        try {
            class64.field873 = class381.field4890.getToolkit().getSystemClipboard();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public final void method1638(int arg0) {
        if (!this.field3544) {
            this.field3550 = true;
            this.field3544 = true;
        } else if (this.field3550) {
            this.field3550 = false;
        } else {
            this.field3544 = false;
        }
        field3551++;
        if (arg0 != 128) {
            this.field3550 = true;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZLufa;)Ldn;")
    public final class548 method1639(boolean arg0, class140 arg1) {
        if (arg0) {
            field3555 = true;
        }
        field3553++;
        return arg1.method1054(-80, this.field3550, this.field3543, this.field3544 ? this.field3541 : this.field3538);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)I")
    public static final int method1640(int arg0, int arg1) {
        field3549++;
        if (arg1 != -2) {
            method1642(80);
        }
        int var2 = arg0 & 0x3F;
        int var3 = arg0 >> 6 & 0x3;
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

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
    public static final void method1641(byte arg0) {
        if (class5.field34 == null || class337.field4354 == null) {
            class5.field34 = new int[256];
            class337.field4354 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var3 = (double) var1 / 255.0D * 6.283185307179586D;
                class5.field34[var1] = (int) (Math.sin(var3) * 4096.0D);
                class337.field4354[var1] = (int) (Math.cos(var3) * 4096.0D);
            }
        }
        field3545++;
        int var2 = 18 / ((31 - arg0) / 56);
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    public static void method1642(int arg0) {
        field3540 = null;
        if (arg0 != 4096) {
            field3552 = -58;
        }
        field3542 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZZI)Ljs;")
    public static final class263 method1643(boolean arg0, boolean arg1, int arg2) {
        field3547++;
        long var3 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg2);
        if (arg0) {
            method1637(true);
        }
        return (class263) class349.field4467.method39(var3, 31750);
    }
}
