import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class685 {

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Lwm;")
    private class30 field8826;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Lwm;")
    private class30 field8830;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field8832 = 0;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field8827;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field8831;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "Lbba;")
    private class575 field8833;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "[[B")
    public static byte[][] field8829;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lrh;B)Lol;", line = 5)
    public final class262 method3671(class660 arg0, byte arg1) {
        field8825++;
        int var3 = 86 / ((arg1 + 9) / 39);
        if (arg0 == null) {
            return null;
        }
        class576 var4 = arg0.method3((byte) -20);
        if (class604.field7675 == var4) {
            return new class162((class194) arg0);
        } else if (class316.field3940 == var4) {
            return new class317(this.method3674((byte) 95), (class560) arg0);
        } else if (class448.field5845 == var4) {
            return new class209(this.field8830, (class1) arg0);
        } else if (class682.field8797 == var4) {
            return new class145(this.field8830, (class370) arg0);
        } else if (class730.field9570 == var4) {
            return new class466(this.field8830, this.field8826, (class507) arg0);
        } else if (class170.field2261 == var4) {
            return new class288(this.field8830, this.field8826, (class167) arg0);
        } else if (class278.field3612 == var4) {
            return new class298(this.field8830, this.field8826, (class26) arg0);
        } else if (class598.field7611 == var4) {
            return new class748(this.field8830, this.field8826, (class196) arg0);
        } else if (class169.field2250 == var4) {
            return new class384(this.field8830, (class495) arg0);
        } else if (class406.field5386 == var4) {
            return new class729(this.field8830, this.field8826, (class621) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V", line = 59)
    public static void method3672(byte arg0) {
        field8829 = null;
        if (arg0 != -70) {
            method3672((byte) 127);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([[BLel;I)V", line = 73)
    public static final void method3673(byte[][] arg0, class752 arg1, int arg2) {
        field8827++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class234 var11 = new class234(var10);
                int var12 = class644.field8240[var5] >> 8;
                int var13 = class644.field8240[var5] & 0xFF;
                int var14 = var12 * 64 - class714.field9407;
                int var15 = var13 * 64 - class240.field3293;
                class204.method1385(arg2 ^ 0x76);
                arg1.method3224(arg2 + 11509, var14, class240.field3293, var11, var15, class179.field2391, class714.field9407);
                arg1.method4074(var15, var3, -119, var14, class576.field7320, var11);
                if (!arg1.field7571 && class527.field6693 / 8 == var12 && class742.field10047 / 8 == var13 && var3[0] != -1) {
                    class38.field430 = class55.field708.method3871((byte) -121, var3[3], var3[1], var3[2], var3[0], class526.field6688);
                    class313.field3898 = var3[4];
                }
            }
        }
        for (int var6 = arg2; var6 < var4; var6++) {
            int var7 = (class644.field8240[var6] >> 8) * 64 - class714.field9407;
            int var8 = (class644.field8240[var6] & 0xFF) * 64 - class240.field3293;
            byte[] var9 = arg0[var6];
            if (var9 == null && class742.field10047 < 800) {
                class204.method1385(arg2 ^ 0x5F);
                arg1.method3223(64, var8, var7, 64, (byte) -101);
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)Lbba;", line = 143)
    private final class575 method3674(byte arg0) {
        if (this.field8833 == null) {
            this.field8833 = new class575();
        }
        if (arg0 <= 89) {
            return null;
        } else {
            field8828++;
            return this.field8833;
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lwm;Lwm;)V", line = 163)
    public class685(class30 arg0, class30 arg1) {
        this.field8826 = arg1;
        this.field8830 = arg0;
    }
}
