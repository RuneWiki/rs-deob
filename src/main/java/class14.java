import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class14 implements class217 {

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "Lmn;")
    private class249 field263 = new class249(128);

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "[I")
    public int[] field258 = new int[class161.field2593.field3276];

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "[I")
    private int[] field253 = new int[class161.field2593.field3276];

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "[[I")
    public static int[][] field256 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "Ls;")
    public static class186 field264 = new class186(8, 3);

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)V", line = 3)
    public final void method89(int arg0, int arg1, int arg2) {
        field261++;
        if (arg0 >= -61) {
            this.method96((byte) -109, -42, -57);
        }
        this.field253[arg2] = arg1;
        class520 var4 = (class520) this.field263.method1622((long) arg2, 114);
        if (var4 == null) {
            class520 var5 = new class520(4611686018427387905L);
            this.field263.method1618(var5, (long) arg2, -1);
        } else if (var4.field7557 != 4611686018427387905L) {
            var4.field7557 = class423.method2578(-19698) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)I", line = 31)
    public final int method90(int arg0, byte arg1) {
        field259++;
        class303 var3 = class155.field2526.method1455(arg0, -11680);
        int var4 = var3.field4541;
        int var5 = var3.field4546;
        int var6 = var3.field4543;
        if (arg1 < 107) {
            field256 = null;
        }
        int var7 = class218.field3428[var6 - var5];
        return var7 & this.field258[var4] >> var5;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)V", line = 52)
    public static final void method91(int arg0, int arg1) {
        if (arg1 < 47) {
            return;
        }
        class420.field6337 = 3;
        class263.field4026 = -1;
        class25.field383 = 100;
        class310.field4697 = arg0;
        field257++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)I", line = 67)
    public final int method92(int arg0, int arg1) {
        field251++;
        if (arg1 != -29949) {
            this.method90(-13, (byte) -68);
        }
        return this.field258[arg0];
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 79)
    public final void method93(int arg0) {
        for (int var2 = 0; var2 < class161.field2593.field3276; var2++) {
            class534 var3 = class161.field2593.method1400((byte) -44, var2);
            if (var3 != null && var3.field7764 == 0) {
                this.field253[var2] = 0;
                this.field258[var2] = 0;
            }
        }
        if (arg0 > 86) {
            field254++;
            this.field263 = new class249(128);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZZ)I", line = 106)
    public final int method94(boolean arg0, boolean arg1) {
        field250++;
        long var3 = class423.method2578(-19698);
        if (!arg1) {
            field264 = null;
        }
        for (class520 var5 = arg0 ? (class520) this.field263.method1615(0) : (class520) this.field263.method1621((byte) 123); var5 != null; var5 = (class520) this.field263.method1621((byte) -103)) {
            if ((var5.field7557 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field7557 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field3977;
                    this.field258[var6] = this.field253[var6];
                    var5.method1676(true);
                    return var6;
                }
                var5.method1676(true);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V", line = 146)
    public static final void method95(int arg0) {
        field255++;
        if (class207.field3321) {
            return;
        }
        if (arg0 != -22894) {
            field264 = null;
        }
        if (class186.field2990.field2527) {
            class525.field7631 = ((int) class525.field7631 + 191 & 0xFFFFFF80);
        } else {
            class435.field6475 += (24.0F - class435.field6475) / 2.0F;
        }
        class207.field3321 = true;
        class23.field339 = true;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BII)V", line = 174)
    public final void method96(byte arg0, int arg1, int arg2) {
        if (arg0 > -16) {
            return;
        }
        field252++;
        this.field258[arg2] = arg1;
        class520 var4 = (class520) this.field263.method1622((long) arg2, 109);
        if (var4 == null) {
            class520 var5 = new class520(class423.method2578(-19698) + 500L);
            this.field263.method1618(var5, (long) arg2, -1);
        } else {
            var4.field7557 = class423.method2578(-19698) + 500L;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(III)V", line = 197)
    public final void method97(int arg0, int arg1, int arg2) {
        field260++;
        class303 var4 = class155.field2526.method1455(arg2, -11680);
        int var5 = var4.field4541;
        int var6 = var4.field4546;
        int var7 = var4.field4543;
        int var8 = class218.field3428[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method96((byte) -58, ~var9 & this.field258[var5] | var9 & arg1 << var6, var5);
        if (arg0 != 0) {
            this.method98(-12, -111, -44);
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(III)V", line = 225)
    public final void method98(int arg0, int arg1, int arg2) {
        if (arg2 != -22498) {
            this.field258 = null;
        }
        field262++;
        class303 var4 = class155.field2526.method1455(arg0, -11680);
        int var5 = var4.field4541;
        int var6 = var4.field4546;
        int var7 = var4.field4543;
        int var8 = class218.field3428[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method89(-128, var9 & arg1 << var6 | this.field253[var5] & ~var9, var5);
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V", line = 255)
    public static void method99(int arg0) {
        field256 = null;
        field264 = null;
        if (arg0 > -65) {
            method95(30);
        }
    }
}
