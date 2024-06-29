import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class9 {

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Lau;")
    private class692 field259 = new class692(256);

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Lmv;")
    private class295 field254;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "Lefa;")
    public static class322 field253 = new class322(16);

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "Lvg;")
    public static class622 field262 = new class622(21, 0);

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "Z")
    public static boolean field263 = false;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "Lvg;")
    public static class622 field264 = new class622(70, -2);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "[I")
    public static int[] field265;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public final void method61(boolean arg0) {
        field251++;
        if (!arg0) {
            class692 var2 = this.field259;
            synchronized (this.field259) {
                this.field259.method3890(-1);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[III[J)V")
    public static final void method62(int arg0, int[] arg1, int arg2, int arg3, long[] arg4) {
        if (arg2 != 16) {
            field262 = null;
        }
        if (arg3 > arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg0;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var7;
            int var9 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg0; var11 < arg3; var11++) {
                if (var7 + ((long) (var11 & var10)) > arg4[var11]) {
                    long var12 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6] = var12;
                    int var14 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6++] = var14;
                }
            }
            arg4[arg3] = arg4[var6];
            arg4[var6] = var7;
            arg1[arg3] = arg1[var6];
            arg1[var6] = var9;
            method62(arg0, arg1, 16, var6 - 1, arg4);
            method62(var6 + 1, arg1, 16, arg3, arg4);
        }
        field256++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)Lpba;")
    public final class49 method63(byte arg0, int arg1) {
        field255++;
        if (arg0 != 100) {
            this.field254 = null;
        }
        class692 var3 = this.field259;
        class49 var4;
        synchronized (this.field259) {
            var4 = (class49) this.field259.method3901((long) arg1, -100);
        }
        if (var4 != null) {
            return var4;
        }
        class295 var5 = this.field254;
        byte[] var6;
        synchronized (this.field254) {
            var6 = this.field254.method1844(26, 31330, arg1);
        }
        class49 var7 = new class49();
        if (var6 != null) {
            var7.method298(new class540(var6), -1);
        }
        class692 var8 = this.field259;
        synchronized (this.field259) {
            this.field259.method3894(var7, (byte) 60, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)[Ltca;")
    public static final class545[] method64(byte arg0) {
        if (arg0 >= -113) {
            method62(46, null, -107, 75, null);
        }
        field250++;
        return new class545[] { class647.field9305, class592.field8598, class68.field1068 };
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIILfg;Lfg;)V")
    public static final void method65(int arg0, int arg1, int arg2, class391 arg3, class391 arg4) {
        class44 var5 = class471.method2715(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field669 = arg3;
        var5.field675 = arg4;
        int var6 = class383.field5753 == class178.field2480 ? 1 : 0;
        if (!arg3.method270(-97)) {
            class153.field2152[var6][class464.field6700[var6]++] = arg3;
        } else if (arg3.method274(-1510217528)) {
            class403.field6051[var6][class48.field760[var6]++] = arg3;
        } else {
            class313.field4591[var6][class311.field4576[var6]++] = arg3;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method270(-53)) {
            if (arg4.method274(-1510217528)) {
                class403.field6051[var6][class48.field760[var6]++] = arg4;
                return;
            }
            class313.field4591[var6][class311.field4576[var6]++] = arg4;
            return;
        }
        class153.field2152[var6][class464.field6700[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
    public final void method66(int arg0, int arg1) {
        class692 var3 = this.field259;
        synchronized (this.field259) {
            if (arg0 < 4) {
                method65(-81, 53, 72, null, null);
            }
            this.field259.method3900(arg1, 0);
        }
        field252++;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
    public final void method67(byte arg0) {
        if (arg0 <= 60) {
            method64((byte) -115);
        }
        class692 var2 = this.field259;
        synchronized (this.field259) {
            this.field259.method3891(13747);
        }
        field258++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZZII)V")
    public static final void method68(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field260++;
        class589.method3366(arg1, arg2, class568.field8284.length - 1, arg0, arg4, arg3, 14176);
        class196.field2692 = 0;
        class200.field2717 = null;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)V")
    public static final void method69(byte arg0) {
        if (arg0 != -4) {
            field253 = null;
        }
        class332.field4830++;
        field257++;
        class537.field7862 = 0;
        class12.field297 = 0;
        class216.method1364(true);
        class215.method1357(arg0 + 4);
        class87.method494((byte) -82);
        boolean var1 = false;
        for (int var2 = 0; var2 < class537.field7862; var2++) {
            int var5 = class442.field6422[var2];
            class177 var6 = (class177) class271.field3550.method2002((byte) -110, (long) var5);
            class53 var7 = var6.field2476;
            if (class683.field9638 && class665.method3737(var5, -66)) {
                class291.method1794(arg0 + 15673);
            }
            if (class332.field4830 != var7.field7354) {
                if (var7.field805.method446(false)) {
                    class565.method3260(0, var7);
                }
                var7.method316(null, (byte) 75);
                var1 = true;
                var6.method2360((byte) 66);
            }
        }
        if (var1) {
            class378.field5678 = class271.field3550.method1996((byte) -112);
            class271.field3550.method1994(class13.field299, (byte) 124);
        }
        if (class297.field4376 != class389.field5816.field7956) {
            throw new RuntimeException("gnp1 pos:" + class389.field5816.field7956 + " psize:" + class297.field4376);
        }
        for (int var3 = 0; var3 < class155.field2213; var3++) {
            if (class271.field3550.method2002((byte) -121, (long) class523.field7379[var3]) == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class155.field2213);
            }
        }
        if ((class378.field5678 - class155.field2213) != 0) {
            throw new RuntimeException("gnp3 mis:" + (class378.field5678 - class155.field2213));
        }
        for (int var4 = 0; var4 < class378.field5678; var4++) {
            if (class332.field4830 != class13.field299[var4].field2476.field7354) {
                throw new RuntimeException("gnp4 uk:" + class13.field299[var4].field2476.field7405);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(B)V")
    public static void method70(byte arg0) {
        field264 = null;
        field265 = null;
        field253 = null;
        field262 = null;
        if (arg0 >= -72) {
            field265 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Leh;II)Z")
    public static final boolean method71(class203 arg0, int arg1, int arg2) {
        field261++;
        class311.field4577.method892(arg0.field2770[arg1], arg0.field2780[arg1], arg0.field2772[arg1], class520.field7297);
        int var3 = class520.field7297[2];
        if (arg2 <= 15) {
            field265 = null;
        }
        if (var3 < 50) {
            return false;
        } else {
            arg0.field2765[arg1] = (short) (class520.field7297[0] * class443.field6437 / var3 + class542.field8028);
            arg0.field2775[arg1] = (short) (class520.field7297[1] * class111.field1636 / var3 + class205.field2803);
            arg0.field2773[arg1] = (short) var3;
            return true;
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lsea;ILmv;)V")
    public class9(class373 arg0, int arg1, class295 arg2) {
        this.field254 = arg2;
        this.field254.method1845(26, true);
    }
}
