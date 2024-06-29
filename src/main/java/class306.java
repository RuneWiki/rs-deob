import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class306 implements class318 {

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "Lpl;")
    private class616 field4650 = new class616(128);

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "[I")
    public int[] field4645 = new int[class346.field5119.field9337];

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "[I")
    private int[] field4651 = new int[class346.field5119.field9337];

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "Lvj;")
    public static class26 field4641 = new class26(6, 1);

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIB)V", line = 4)
    public final void method2008(int arg0, int arg1, byte arg2) {
        field4642++;
        this.field4645[arg0] = arg1;
        class173 var4 = (class173) this.field4650.method3512(true, (long) arg0);
        if (arg2 >= -68) {
            this.field4650 = null;
        }
        if (var4 == null) {
            class173 var5 = new class173(class18.method109(-11121) + 500L);
            this.field4650.method3516(255, (long) arg0, var5);
        } else {
            var4.field2959 = class18.method109(-11121) + 500L;
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)I", line = 32)
    public final int method2009(int arg0, int arg1) {
        if (arg1 <= 55) {
            this.field4650 = null;
        }
        field4647++;
        return this.field4645[arg0];
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 47)
    public static void method2010(byte arg0) {
        field4641 = null;
        if (arg0 > -28) {
            field4641 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IBI)V", line = 57)
    public final void method2011(int arg0, byte arg1, int arg2) {
        field4648++;
        class27 var4 = class52.field836.method1715(arg2, arg1 + 152);
        int var5 = var4.field274;
        if (arg1 != -88) {
            this.method2016(74, 95, (byte) -20);
        }
        int var6 = var4.field273;
        int var7 = var4.field270;
        int var8 = class49.field810[var7 - var6];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method2008(var5, var9 & arg0 << var6 | ~var9 & this.field4645[var5], (byte) -118);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZZ)I", line = 89)
    public final int method2012(boolean arg0, boolean arg1) {
        field4649++;
        if (!arg1) {
            this.method2013(-99, -78);
        }
        long var3 = class18.method109(-11121);
        for (class173 var5 = arg0 ? (class173) this.field4650.method3508((byte) -64) : (class173) this.field4650.method3520(-1); var5 != null; var5 = (class173) this.field4650.method3520(-1)) {
            if (var3 > (var5.field2959 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field2959 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field1039;
                    this.field4645[var6] = this.field4651[var6];
                    var5.method636((byte) 97);
                    return var6;
                }
                var5.method636((byte) 97);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)I", line = 128)
    public final int method2013(int arg0, int arg1) {
        int var3 = 112 % ((arg0 + 31) / 60);
        field4646++;
        class27 var4 = class52.field836.method1715(arg1, 115);
        int var5 = var4.field274;
        int var6 = var4.field273;
        int var7 = var4.field270;
        int var8 = class49.field810[var7 - var6];
        return var8 & this.field4645[var5] >> var6;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)V", line = 149)
    public final void method2014(int arg0, int arg1, int arg2) {
        field4652++;
        class27 var4 = class52.field836.method1715(arg2, 120);
        int var5 = var4.field274;
        if (arg1 <= 83) {
            return;
        }
        int var6 = var4.field273;
        int var7 = var4.field270;
        int var8 = class49.field810[var7 - var6];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method2016(arg0 << var6 & var9 | ~var9 & this.field4651[var5], var5, (byte) 88);
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)V", line = 178)
    public final void method2015(byte arg0) {
        for (int var2 = 0; var2 < class346.field5119.field9337; var2++) {
            class178 var3 = class346.field5119.method3690(-47, var2);
            if (var3 != null && var3.field3053 == 0) {
                this.field4651[var2] = 0;
                this.field4645[var2] = 0;
            }
        }
        field4643++;
        if (arg0 != 24) {
            this.method2011(-70, (byte) -53, -71);
        }
        this.field4650 = new class616(128);
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(IIB)V", line = 207)
    public final void method2016(int arg0, int arg1, byte arg2) {
        this.field4651[arg1] = arg0;
        field4644++;
        class173 var4 = (class173) this.field4650.method3512(true, (long) arg1);
        if (var4 == null) {
            class173 var5 = new class173(4611686018427387905L);
            this.field4650.method3516(255, (long) arg1, var5);
        } else if (var4.field2959 != 4611686018427387905L) {
            var4.field2959 = class18.method109(-11121) + 500L | 0x4000000000000000L;
        }
        if (arg2 <= 20) {
            this.method2016(4, -94, (byte) 71);
        }
    }
}
