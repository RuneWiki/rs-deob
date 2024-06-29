import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class1 implements class649 {

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Lqp;")
    private class715 field2 = new class715(128);

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "[I")
    public int[] field6 = new int[class600.field8526.field1768];

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "[I")
    private int[] field5 = new int[class600.field8526.field1768];

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BII)V", line = 3)
    public final void method1(byte arg0, int arg1, int arg2) {
        field1++;
        this.field6[arg2] = arg1;
        class181 var4 = (class181) this.field2.method4020((long) arg2, (byte) -69);
        if (arg0 != -42) {
            this.method1((byte) 63, 59, 29);
        }
        if (var4 == null) {
            class181 var5 = new class181(class465.method2818(255) + 500L);
            this.field2.method4022(var5, 121, (long) arg2);
        } else {
            var4.field2504 = class465.method2818(255) + 500L;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I", line = 28)
    public final int method2(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field6 = null;
        }
        field10++;
        class20 var3 = class215.field3233.method1144(arg0, 82);
        int var4 = var3.field191;
        int var5 = var3.field190;
        int var6 = var3.field189;
        int var7 = class566.field8193[var6 - var5];
        return var7 & this.field6[var4] >> var5;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)I", line = 49)
    public final int method3(int arg0, byte arg1) {
        field8++;
        if (arg1 != -43) {
            this.method4(-94, 5, -87);
        }
        return this.field6[arg0];
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V", line = 60)
    public final void method4(int arg0, int arg1, int arg2) {
        field3++;
        this.field5[arg1] = arg0;
        if (arg2 != 0) {
            this.method5(-63, 65, (byte) 114);
        }
        class181 var4 = (class181) this.field2.method4020((long) arg1, (byte) -80);
        if (var4 == null) {
            class181 var5 = new class181(4611686018427387905L);
            this.field2.method4022(var5, 110, (long) arg1);
        } else if (var4.field2504 != 4611686018427387905L) {
            var4.field2504 = class465.method2818(arg2 ^ 0xFF) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIB)V", line = 88)
    public final void method5(int arg0, int arg1, byte arg2) {
        field4++;
        if (arg2 > -65) {
            this.field6 = null;
        }
        class20 var4 = class215.field3233.method1144(arg1, 88);
        int var5 = var4.field191;
        int var6 = var4.field190;
        int var7 = var4.field189;
        int var8 = class566.field8193[var7 - var6];
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method1((byte) -42, arg0 << var6 & var9 | this.field6[var5] & ~var9, var5);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(BII)V", line = 117)
    public final void method6(byte arg0, int arg1, int arg2) {
        field11++;
        class20 var4 = class215.field3233.method1144(arg1, 73);
        int var5 = var4.field191;
        if (arg0 < 9) {
            return;
        }
        int var6 = var4.field190;
        int var7 = var4.field189;
        int var8 = class566.field8193[var7 - var6];
        if (arg2 < 0 || var8 < arg2) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method4(var9 & arg2 << var6 | this.field5[var5] & ~var9, var5, 0);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 158)
    public final void method7(int arg0) {
        field9++;
        for (int var2 = 0; var2 < class600.field8526.field1768; var2++) {
            class732 var3 = class600.field8526.method904(var2, 16);
            if (var3 != null && var3.field10254 == 0) {
                this.field5[var2] = 0;
                this.field6[var2] = 0;
            }
        }
        this.field2 = new class715(128);
        if (arg0 < 122) {
            this.method4(27, 100, 54);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BZ)I", line = 188)
    public final int method8(byte arg0, boolean arg1) {
        field7++;
        long var3 = class465.method2818(255);
        if (arg0 != 4) {
            this.method2(45, 99);
        }
        for (class181 var5 = arg1 ? (class181) this.field2.method4023((byte) -127) : (class181) this.field2.method4021((byte) 80); var5 != null; var5 = (class181) this.field2.method4021((byte) 80)) {
            if ((var5.field2504 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field2504 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field6188;
                    this.field6[var6] = this.field5[var6];
                    var5.method2656((byte) 120);
                    return var6;
                }
                var5.method2656((byte) 121);
            }
        }
        return -1;
    }
}
