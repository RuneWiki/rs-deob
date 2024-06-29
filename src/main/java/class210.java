import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class210 extends class65 {

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "[J")
    private long[] field3737 = new long[10];

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    private int field3735 = 256;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    private int field3739 = 0;

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "I")
    private int field3744 = 1;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "J")
    private long field3732 = class81.method608(19644);

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    public static int field3742 = 0;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "Lve;")
    public static class189 field3743 = new class189(5);

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "Lve;")
    public static class189 field3746 = new class189(100);

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
    public static int field3747 = 0;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "Lid;")
    public static class149 field3750 = class60.method382("leuchten3:", (byte) 70);

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "I")
    public static int field3751 = -1;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
    public static int field3748 = 0;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    private int field3740;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "[Z")
    public static boolean[] field3745;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)V")
    public static final void method1429(int arg0) {
        if (arg0 != 64) {
            method1430(-2, -32);
        }
        field3734++;
        class9.field118.method1291(arg0 - 64);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(II)I")
    public static final int method1430(int arg0, int arg1) {
        field3736++;
        if (arg1 != -26) {
            method1429(110);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V")
    public static void method1431(byte arg0) {
        field3743 = null;
        field3750 = null;
        if (arg0 <= -98) {
            field3745 = null;
            field3746 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public final void method193(byte arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field3737[var2] = 0L;
        }
        int var3 = -84 / ((-arg0 - 79) / 44);
        field3741++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)Lec;")
    public static final class23 method1432(int arg0, int arg1, int arg2) {
        class231 var3 = class261.field4664[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field4047; var4++) {
            class23 var5 = var3.field4061[var4];
            if ((var5.field338 >> 29 & 0x3L) == 2L && var5.field318 == arg1 && var5.field330 == arg2) {
                class186.method1284(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lgd;I)V")
    public static final void method1433(class74 arg0, int arg1) {
        field3738++;
        if (arg1 != -1276586906) {
            return;
        }
        while (true) {
            while (arg0.field1340 < arg0.field1321.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method489((byte) 93) == 1) {
                    var4 = arg0.method489((byte) -34);
                    var3 = arg0.method489((byte) 115);
                    var2 = true;
                }
                int var5 = arg0.method489((byte) -54);
                int var6 = arg0.method489((byte) 111);
                int var7 = var5 * 64 - class80.field1480;
                int var8 = class287.field5086 + class91.field1615 - var6 * 64 - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class62.field1121 > var7 + 63 && var8 < class287.field5086) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var4 * 8) && (var4 * 8 + 8) > var11 && var12 >= (var3 * 8) && var12 < var3 * 8 + 8) {
                                byte var13 = arg0.method514((byte) 1);
                                if (var13 != 0) {
                                    if (class68.field1189[var10][var9] == null) {
                                        class68.field1189[var10][var9] = new byte[4096];
                                    }
                                    class68.field1189[var10][var9][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method514((byte) 1);
                                    if (class264.field4704[var10][var9] == null) {
                                        class264.field4704[var10][var9] = new byte[4096];
                                    }
                                    class264.field4704[var10][var9][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method514((byte) 1);
                        if (var16 != 0) {
                            arg0.field1340++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BII)I")
    public final int method194(byte arg0, int arg1, int arg2) {
        if (arg0 <= 57) {
            this.field3739 = 121;
        }
        int var4 = this.field3735;
        this.field3735 = 300;
        int var5 = this.field3744;
        this.field3744 = 1;
        this.field3732 = class81.method608(19644);
        if (this.field3737[this.field3740] == 0L) {
            this.field3744 = var5;
            this.field3735 = var4;
        } else if (this.field3737[this.field3740] < this.field3732) {
            this.field3735 = (int) ((long) (arg2 * 2560) / (this.field3732 - this.field3737[this.field3740]));
        }
        if (this.field3735 < 25) {
            this.field3735 = 25;
        }
        if (this.field3735 > 256) {
            this.field3735 = 256;
            this.field3744 = (int) ((long) arg2 - (this.field3732 - this.field3737[this.field3740]) / 10L);
        }
        field3733++;
        if (this.field3744 > arg2) {
            this.field3744 = arg2;
        }
        this.field3737[this.field3740] = this.field3732;
        this.field3740 = (this.field3740 + 1) % 10;
        if (this.field3744 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field3737[var6] != 0L) {
                    this.field3737[var6] += (long) this.field3744;
                }
            }
        }
        if (this.field3744 < arg1) {
            this.field3744 = arg1;
        }
        class151.method1074(-114, (long) this.field3744);
        int var7 = 0;
        while (this.field3739 < 256) {
            this.field3739 += this.field3735;
            var7++;
        }
        this.field3739 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
    public class210() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field3737[var1] = this.field3732;
        }
    }
}
