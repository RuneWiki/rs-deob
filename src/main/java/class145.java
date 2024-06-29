import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class145 implements class126 {

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "Z")
    private boolean field2557 = false;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    private int field2551 = 50;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "Ltg;")
    private class182 field2559;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "Ltg;")
    private class182 field2563;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Lgd;")
    private class74 field2544;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "Lgd;")
    private class74 field2552;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "[S")
    private short[] field2555;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "[Z")
    private boolean[] field2560;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "[B")
    private byte[] field2573;

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "[B")
    private byte[] field2576;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "[Z")
    private boolean[] field2567;

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "[Z")
    private boolean[] field2570;

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "[B")
    private byte[] field2575;

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "[Z")
    private boolean[] field2572;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "[B")
    private byte[] field2580;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "[Z")
    private boolean[] field2553;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "Loa;")
    public static class99 field2547 = class221.method1463(2844, "<col=ffff00>");

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "Z")
    public static boolean field2561 = false;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "Loa;")
    public static class99 field2562 = class221.method1463(2844, "Wordpack geladen)3");

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "[Lik;")
    public static class261[] field2565 = new class261[2048];

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "I")
    public static int field2571 = 0;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "Loa;")
    public static class99 field2569 = class221.method1463(2844, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public final void method984(byte arg0) {
        if (arg0 > -91) {
            this.method833(-28, 31);
        }
        this.field2544.method513(true);
        if (this.field2552 != null) {
            this.field2552.method513(true);
        }
        field2556++;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)[I")
    public final int[] method833(int arg0, int arg1) {
        field2566++;
        class247 var3 = this.method989(arg0, (byte) 27);
        if (arg1 == 255) {
            return var3 == null ? null : var3.method1604(false, this.field2559, this.field2557 || this.field2572[arg0], this);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(FBI)[I")
    public final int[] method831(float arg0, byte arg1, int arg2) {
        if (arg1 != -29) {
            this.method837(53, (byte) -105);
        }
        class247 var4 = this.method989(arg2, (byte) 27);
        field2545++;
        if (var4 == null) {
            return null;
        } else {
            var4.field4242 = true;
            return var4.method1603(arg0, this, this.field2559, this.field2557 || this.field2572[arg2], (byte) 89);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZB)V")
    public final void method985(boolean arg0, byte arg1) {
        field2568++;
        this.field2557 = arg0;
        this.method984((byte) -112);
        int var3 = -38 % ((21 - arg1) / 36);
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V")
    public static void method986(byte arg0) {
        if (arg0 != 72) {
            method987(120, false, -26, true, false);
        }
        field2562 = null;
        field2569 = null;
        field2547 = null;
        field2565 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZIZZ)Ltg;")
    public static final class182 method987(int arg0, boolean arg1, int arg2, boolean arg3, boolean arg4) {
        if (arg2 != 13379) {
            method990(10, -32, 39, 70, -20);
        }
        field2550++;
        class141 var5 = null;
        if (class264.field4681 != null) {
            var5 = new class141(arg0, class264.field4681, class69.field1150[arg0], 1000000);
        }
        class127.field2216[arg0] = class12.field110.method1090(class220.field3836, var5, arg0, (byte) 0);
        if (arg1) {
            class127.field2216[arg0].method1543(1);
        }
        return new class182(class127.field2216[arg0], arg4, arg3);
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(II)V")
    public final void method988(int arg0, int arg1) {
        field2579++;
        class247 var3 = (class247) this.field2544.method509(arg0 ^ 0x32);
        if (arg0 != 0) {
            this.field2551 = 116;
        }
        while (var3 != null) {
            if (var3.field4242) {
                var3.method1598((byte) 67, arg1);
                var3.field4242 = false;
            }
            var3 = (class247) this.field2544.method514((byte) -114);
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(IB)Z")
    public final boolean method837(int arg0, byte arg1) {
        field2577++;
        class247 var3 = this.method989(arg0, (byte) 27);
        if (arg1 >= -127) {
            this.method831(0.9603688F, (byte) -116, -109);
        }
        return var3 == null ? false : var3.method1600(this.field2559, (byte) -119, this);
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(II)I")
    public final int method836(int arg0, int arg1) {
        if (arg1 != 11775) {
            this.field2560 = null;
        }
        field2554++;
        return this.field2555[arg0] & 0xFFFF;
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(IB)Ljl;")
    private final class247 method989(int arg0, byte arg1) {
        field2564++;
        class247 var3 = (class247) this.field2544.method512((byte) 71, (long) arg0);
        if (arg1 != 27) {
            field2565 = null;
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field2563.method1242(0, arg0, 6801);
        if (var4 == null) {
            return null;
        } else {
            class261 var5 = new class261(var4);
            class247 var6 = new class247(var5);
            this.field2544.method511(arg1 + 89, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIII)V")
    public static final void method990(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= 96) {
            field2571 = -84;
        }
        if (class268.field4716 == 1) {
            class199.field3466[class209.field3616 / 100].method38(class43.field730 - 8, class263.field4658 + -8);
        }
        if (class268.field4716 == 2) {
            class199.field3466[(class209.field3616 / 100) + 4].method38(class43.field730 - 8, class263.field4658 + -8);
        }
        field2558++;
        class135.method919((byte) 63);
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(II)Z")
    public final boolean method835(int arg0, int arg1) {
        if (arg0 == 32401) {
            field2578++;
            return this.field2570[arg1];
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IB)Z")
    public final boolean method834(int arg0, byte arg1) {
        field2574++;
        if (arg1 != -85) {
            this.method988(38, 27);
        }
        return this.field2557 || this.field2572[arg0];
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILoa;Loa;Loa;)V")
    public static final void method991(int arg0, int arg1, class99 arg2, class99 arg3, class99 arg4) {
        class271.method1795(-1, arg1 + 16363, arg3, arg4, arg0, arg2);
        field2549++;
        if (arg1 != -16459) {
            method986((byte) -30);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Z")
    public final boolean method832(int arg0, int arg1) {
        field2548++;
        int var3 = 60 / ((-arg1 - 45) / 51);
        return this.field2553[arg0];
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Ltg;Ltg;Ltg;IZ)V")
    public class145(class182 arg0, class182 arg1, class182 arg2, int arg3, boolean arg4) {
        this.field2559 = arg2;
        this.field2563 = arg0;
        this.field2551 = arg3;
        this.field2557 = arg4;
        this.field2544 = new class74(this.field2551);
        this.field2552 = null;
        class261 var6 = new class261(arg1.method1242(0, 0, 6801));
        int var7 = var6.method1740((byte) 102);
        this.field2555 = new short[var7];
        this.field2560 = new boolean[var7];
        this.field2573 = new byte[var7];
        this.field2576 = new byte[var7];
        this.field2567 = new boolean[var7];
        this.field2570 = new boolean[var7];
        this.field2575 = new byte[var7];
        this.field2572 = new boolean[var7];
        this.field2580 = new byte[var7];
        this.field2553 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field2567[var8] = var6.method1693((byte) 103) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field2567[var9]) {
                this.field2570[var9] = var6.method1693((byte) -79) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field2567[var10]) {
                this.field2553[var10] = var6.method1693((byte) 91) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field2567[var11]) {
                this.field2572[var11] = var6.method1693((byte) 119) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field2567[var12]) {
                this.field2560[var12] = var6.method1693((byte) 87) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field2567[var13]) {
                this.field2580[var13] = var6.method1706(10819);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field2567[var14]) {
                this.field2575[var14] = var6.method1706(10819);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field2567[var15]) {
                this.field2573[var15] = var6.method1706(10819);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field2567[var16]) {
                this.field2576[var16] = var6.method1706(10819);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field2567[var17]) {
                this.field2555[var17] = (short) var6.method1740((byte) 122);
            }
        }
    }
}
