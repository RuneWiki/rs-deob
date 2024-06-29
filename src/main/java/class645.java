import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class645 implements class536 {

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "Lbaa;")
    private class130 field8652 = new class130(128);

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "[I")
    public int[] field8648 = new int[class131.field1846.field1018];

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "[I")
    private int[] field8658 = new int[class131.field1846.field1018];

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field8645;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
    public static int field8646;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    public static int field8647;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
    public static int field8649;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    public static int field8651;

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
    public static int field8653;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
    public static int field8654;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "I")
    public static int field8655;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
    public static int field8657;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "Lha;")
    public static class548 field8656;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIB)V")
    public final void method3599(int arg0, int arg1, byte arg2) {
        if (arg2 < 88) {
            field8656 = null;
        }
        field8653++;
        class327 var4 = class601.field8138.method1900(true, arg1);
        int var5 = var4.field4521;
        int var6 = var4.field4522;
        int var7 = var4.field4515;
        int var8 = class162.field2246[var7 - var6];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method3602(var5, arg0 << var6 & var9 | this.field8648[var5] & ~var9, false);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IB)I")
    public final int method3172(int arg0, byte arg1) {
        field8646++;
        class327 var3 = class601.field8138.method1900(true, arg0);
        int var4 = var3.field4521;
        int var5 = var3.field4522;
        int var6 = var3.field4515;
        if (arg1 <= 120) {
            method3600(null, 10);
        }
        int var7 = class162.field2246[var6 - var5];
        return var7 & this.field8648[var4] >> var5;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method3600(String arg0, int arg1) {
        field8649++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = arg1; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg0.charAt(var4) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
    public static void method3601(int arg0) {
        if (arg0 != 128) {
            field8656 = null;
        }
        field8656 = null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZI)I")
    public final int method3173(boolean arg0, int arg1) {
        if (arg0) {
            this.method3173(false, 88);
        }
        field8655++;
        return this.field8648[arg1];
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZ)V")
    public final void method3602(int arg0, int arg1, boolean arg2) {
        field8651++;
        if (arg2) {
            method3600(null, -4);
        }
        this.field8648[arg0] = arg1;
        class42 var4 = (class42) this.field8652.method812(102, (long) arg0);
        if (var4 == null) {
            class42 var5 = new class42(class97.method664((byte) -50) + 500L);
            this.field8652.method820((long) arg0, (byte) -42, var5);
        } else {
            var4.field524 = class97.method664((byte) -50) + 500L;
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(IIZ)V")
    public final void method3603(int arg0, int arg1, boolean arg2) {
        field8647++;
        this.field8658[arg0] = arg1;
        if (arg2) {
            method3600(null, 60);
        }
        class42 var4 = (class42) this.field8652.method812(107, (long) arg0);
        if (var4 == null) {
            class42 var5 = new class42(4611686018427387905L);
            this.field8652.method820((long) arg0, (byte) -42, var5);
        } else if (var4.field524 != 4611686018427387905L) {
            var4.field524 = class97.method664((byte) -50) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
    public final void method3604(byte arg0) {
        field8654++;
        int var2 = 0;
        int var3 = -53 / ((arg0 + 21) / 44);
        while (var2 < class131.field1846.field1018) {
            class653 var4 = class131.field1846.method525(true, var2);
            if (var4 != null && var4.field8739 == 0) {
                this.field8658[var2] = 0;
                this.field8648[var2] = 0;
            }
            var2++;
        }
        this.field8652 = new class130(128);
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
    public static final void method3605(int arg0) {
        field8657++;
        class316.field4389 = 0;
        class157.field2204 = 0;
        class393.field5648 = 0;
        class540.field7510 = 0;
        if (arg0 >= -109) {
            method3605(-66);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BII)V")
    public final void method3606(byte arg0, int arg1, int arg2) {
        field8650++;
        class327 var4 = class601.field8138.method1900(true, arg1);
        int var5 = var4.field4521;
        if (arg0 >= -52) {
            field8656 = null;
        }
        int var6 = var4.field4522;
        int var7 = var4.field4515;
        int var8 = class162.field2246[var7 - var6];
        if (arg2 < 0 || var8 < arg2) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method3603(var5, var9 & arg2 << var6 | ~var9 & this.field8658[var5], false);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZB)I")
    public final int method3607(boolean arg0, byte arg1) {
        field8645++;
        long var3 = class97.method664((byte) -50);
        if (arg1 != -71) {
            this.field8652 = null;
        }
        for (class42 var5 = arg0 ? (class42) this.field8652.method821((byte) 112) : (class42) this.field8652.method818(arg1 + 129); var5 != null; var5 = (class42) this.field8652.method818(74)) {
            if (var3 > (var5.field524 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field524 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field1079;
                    this.field8648[var6] = this.field8658[var6];
                    var5.method549(arg1 ^ 0xFFFFE6B3);
                    return var6;
                }
                var5.method549(arg1 + 6481);
            }
        }
        return -1;
    }
}
