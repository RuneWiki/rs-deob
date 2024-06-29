import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class324 extends class274 {

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "[J")
    private long[] field4957 = new long[10];

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    private int field4952 = 256;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    private int field4944 = 0;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    private int field4940 = 1;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "J")
    private long field4955 = class338.method2339((byte) -120);

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Ljava/util/Random;")
    public static Random field4941 = new Random();

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
    public static int field4954 = 0;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    public static int field4956 = 0;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    private int field4949;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "[Loj;")
    public static class283[] field4950;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBI)I", line = 6)
    public final int method835(int arg0, byte arg1, int arg2) {
        field4939++;
        int var4 = this.field4952;
        this.field4952 = 300;
        int var5 = -47 % ((-arg1 - 28) / 49);
        int var6 = this.field4940;
        this.field4940 = 1;
        this.field4955 = class338.method2339((byte) -120);
        if (this.field4957[this.field4949] == 0L) {
            this.field4952 = var4;
            this.field4940 = var6;
        } else if (this.field4955 > this.field4957[this.field4949]) {
            this.field4952 = (int) ((long) (arg2 * 2560) / (this.field4955 - this.field4957[this.field4949]));
        }
        if (this.field4952 < 25) {
            this.field4952 = 25;
        }
        if (this.field4952 > 256) {
            this.field4952 = 256;
            this.field4940 = (int) ((long) arg2 - ((this.field4955 - this.field4957[this.field4949]) / 10L));
        }
        if (arg2 < this.field4940) {
            this.field4940 = arg2;
        }
        this.field4957[this.field4949] = this.field4955;
        this.field4949 = (this.field4949 + 1) % 10;
        if (this.field4940 > 1) {
            for (int var7 = 0; var7 < 10; var7++) {
                if (this.field4957[var7] != 0L) {
                    this.field4957[var7] += (long) this.field4940;
                }
            }
        }
        int var8 = 0;
        if (arg0 > this.field4940) {
            this.field4940 = arg0;
        }
        class127.method843(-74, (long) this.field4940);
        while (this.field4944 < 256) {
            var8++;
            this.field4944 += this.field4952;
        }
        this.field4944 &= 0xFF;
        return var8;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 79)
    public final void method836(byte arg0) {
        if (arg0 >= -81) {
            this.field4944 = 16;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field4957[var2] = 0L;
        }
        field4942++;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V", line = 96)
    public static final void method2243(int arg0) {
        field4946++;
        if (class214.field3434) {
            return;
        }
        class214.field3434 = true;
        if (arg0 != -28121) {
            method2243(9);
        }
        if (class6.field136) {
            class120.field2090 = (float) ((int) class120.field2090 + 47 & 0xFFFFFFF0);
        } else {
            class69.field1467 += (12.0F - class69.field1467) / 2.0F;
        }
        class35.field707 = true;
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V", line = 124)
    public static void method2244(int arg0) {
        field4950 = null;
        int var1 = 88 % ((-arg0 - 60) / 45);
        field4941 = null;
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V", line = 137)
    public static final void method2245(int arg0) {
        field4948++;
        int var1 = class214.field3428.method2118(class330.field5059);
        for (int var2 = arg0; var2 < class48.field999; var2++) {
            int var3 = class214.field3428.method2118(class50.method377(-17414, var2));
            if (var1 < var3) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class48.field999 * 15 + 21;
        int var5 = class75.field1529;
        if (class134.field2257 < var4 + var5) {
            var5 = class134.field2257 - var4;
        }
        int var6 = class189.field3058 - var1 / 2;
        if (class88.field1658 < (var1 + var6)) {
            var6 = class88.field1658 - var1;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class15.field273 == 1) {
            if (class189.field3058 == class171.field2764 && class75.field1529 == class276.field4221) {
                class290.field4459 = true;
                class42.field813 = var1;
                class343.field5328 = var5;
                class15.field273 = 0;
                class112.field1966 = var6;
                class187.field3033 = (class267.field4117 ? 26 : 22) + class48.field999 * 15;
            }
        } else if (class215.field3441 == class189.field3058 && class75.field1529 == class72.field1510) {
            class42.field813 = var1;
            class343.field5328 = var5;
            class187.field3033 = class48.field999 * 15 + (class267.field4117 ? 26 : 22);
            class15.field273 = 0;
            class290.field4459 = true;
            class112.field1966 = var6;
        } else {
            class171.field2764 = class215.field3441;
            class276.field4221 = class72.field1510;
            class15.field273 = 1;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILrg;)I", line = 225)
    public static final int method2246(int arg0, class255 arg1) {
        field4953++;
        class44 var2 = arg1.field3991;
        if (arg0 != -1) {
            field4950 = (class283[]) null;
        }
        if (var2.field888 != null) {
            var2 = var2.method338(17911);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field845;
        class322 var4 = arg1.method698(127);
        if (arg1.field1893 == var4.field4907) {
            var3 = var2.field872;
        } else if (arg1.field1893 == var4.field4936 || arg1.field1893 == var4.field4918 || arg1.field1893 == var4.field4902 || arg1.field1893 == var4.field4928) {
            var3 = var2.field873;
        } else if (arg1.field1893 == var4.field4910 || arg1.field1893 == var4.field4920 || arg1.field1893 == var4.field4931 || arg1.field1893 == var4.field4934) {
            var3 = var2.field862;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)Lam;", line = 264)
    public static final class146 method2247(byte arg0, int arg1) {
        field4945++;
        class146 var2 = (class146) class159.field2601.method1881(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 57) {
            method2247((byte) 42, 85);
        }
        byte[] var3 = class149.field2443.method2036(33, arg1, (byte) 79);
        class146 var4 = new class146();
        if (var3 != null) {
            var4.method948(new class202(var3), arg1, false);
        }
        class159.field2601.method1880(var4, (long) arg1, 62);
        return var4;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILve;)V", line = 291)
    public static final void method2248(int arg0, class278 arg1) {
        field4943++;
        class174 var2 = (class174) class200.field3197.method303(class116.method767(arg0 - 128, arg1.field4269), (byte) 103);
        if (var2 == null) {
            class142.method921(arg1.field1871[0], (class31) null, (class255) null, arg1.field1899[0], arg1, 0, false, class289.field4438);
        } else {
            var2.method1097(128);
        }
        if (arg0 != 0) {
            field4941 = (Random) null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIILhm;IZ)V", line = 315)
    public static final void method2249(int arg0, int arg1, int arg2, int arg3, class109 arg4, int arg5, boolean arg6) {
        class239.method1587(arg5, -10452, arg4.field1869, arg4.field1872, arg0, arg2, arg1, arg3);
        field4951++;
        if (arg6) {
            field4954 = 87;
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 340)
    public class324() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field4957[var1] = this.field4955;
        }
    }
}
