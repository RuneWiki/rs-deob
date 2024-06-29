import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class183 implements class534 {

    @OriginalMember(owner = "client!cda", name = "k", descriptor = "Ljn;")
    private class750 field2448;

    @OriginalMember(owner = "client!cda", name = "i", descriptor = "[Lww;")
    private class762[] field2446;

    @OriginalMember(owner = "client!cda", name = "j", descriptor = "[I")
    public static int[] field2447 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!cda", name = "e", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!cda", name = "l", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!cda", name = "m", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!cda", name = "n", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!cda", name = "o", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!cda", name = "p", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!cda", name = "r", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!cda", name = "g", descriptor = "Laj;")
    public static class333 field2444;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "Lha;")
    private class65 field2438;

    @OriginalMember(owner = "client!cda", name = "h", descriptor = "Z")
    private boolean field2445;

    @OriginalMember(owner = "client!cda", name = "d", descriptor = "[Lvr;")
    public static class147[] field2441;

    @OriginalMember(owner = "client!cda", name = "q", descriptor = "[[S")
    public static short[][] field2454;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)Z", line = 4)
    public static final boolean method1270(byte arg0) {
        field2440++;
        if (arg0 != -58) {
            method1270((byte) 103);
        }
        if (class299.field4335) {
            try {
                if ((Boolean) class623.method3414(class735.field10183, "showingVideoAd", (byte) 115)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)I", line = 28)
    public final int method69(int arg0) {
        field2442++;
        int var2 = 0;
        if (arg0 != -31784) {
            field2447 = null;
        }
        class762[] var3 = this.field2446;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class762 var5 = var3[var4];
            if (var5 == null || var5.method15(20662)) {
                var2++;
            }
        }
        return var2 * 100 / this.field2446.length;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ZZ)V", line = 54)
    public final void method80(boolean arg0, boolean arg1) {
        boolean var3 = arg0;
        field2443++;
        class762[] var4 = this.field2446;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class762 var6 = var4[var5];
            if (var6 != null) {
                var6.method1500(-112, var3 || this.field2445);
            }
        }
        this.field2445 = false;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILjp;)Lle;", line = 79)
    public static final class325 method1271(int arg0, class376 arg1) {
        field2450++;
        arg1.method2398(-1372747256);
        int var2 = arg1.method2398(arg0 - 1372747256);
        class325 var3 = class192.method1318(arg0 ^ 0x1B, var2);
        var3.field4739 = arg1.method2398(-1372747256);
        int var4 = arg1.method2398(-1372747256);
        for (int var5 = arg0; var5 < var4; var5++) {
            int var6 = arg1.method2398(arg0 ^ 0xAE2D8A08);
            var3.method95(arg1, var6, (byte) -107);
        }
        var3.method101(true);
        return var3;
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(Z)V", line = 112)
    public final void method76(boolean arg0) {
        if (class379.field5542 != this.field2438) {
            this.field2445 = true;
            this.field2438 = class379.field5542;
        }
        if (!arg0) {
            field2444 = null;
        }
        field2455++;
        this.field2438.method458(0);
        class762[] var2 = this.field2446;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class762 var4 = var2[var3];
            if (var4 != null) {
                var4.method16(112);
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(BLha;)V", line = 149)
    public static final void method1272(byte arg0, class65 arg1) {
        class174.field2339 = new class93[class383.field5611.length];
        field2451++;
        if (arg0 < 87) {
            field2452 = 94;
        }
        for (int var2 = 0; var2 < class383.field5611.length; var2++) {
            int var3 = class383.field5611[var2];
            class255 var4 = class194.method1335(class569.field7583, -5707, var3);
            class66 var5 = arg1.method545(var4, class508.method2943(class543.field7371, var3), true);
            class174.field2339[var2] = new class93(var5, var4);
        }
    }

    @OriginalMember(owner = "client!cda", name = "c", descriptor = "(I)V", line = 177)
    public static void method1273(int arg0) {
        if (arg0 == 0) {
            field2444 = null;
            field2454 = null;
            field2441 = null;
            field2447 = null;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)I", line = 190)
    public final int method79(int arg0) {
        field2449++;
        if (arg0 != -4076) {
            method1270((byte) 93);
        }
        return this.field2448.field10334;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IJ)Z", line = 201)
    public final boolean method78(int arg0, long arg1) {
        if (arg0 != -18419) {
            this.field2445 = true;
        }
        field2453++;
        return class302.method1910(0) >= ((long) this.field2448.field10332 + arg1);
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Z)V", line = 214)
    public final void method68(boolean arg0) {
        field2439++;
        if (!arg0) {
            this.method78(1, 82L);
        }
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Ljn;Ljaa;)V", line = 224)
    public class183(class750 arg0, class642 arg1) {
        this.field2448 = arg0;
        this.field2446 = new class762[this.field2448.field10336.length];
        for (int var3 = 0; var3 < this.field2446.length; var3++) {
            this.field2446[var3] = arg1.method3563(this.field2448.field10336[var3], (byte) 105);
        }
    }
}
