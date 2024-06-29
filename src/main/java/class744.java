import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class744 implements class204 {

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "Lsga;")
    private class609 field10334;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "[Ljq;")
    private class385[] field10343;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field10340 = 1337;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field10333;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public static int field10335;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public static int field10336;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field10338;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public static int field10339;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public static int field10341;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
    public static int field10344;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "Lha;")
    private class475 field10342;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "Z")
    private boolean field10337;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V", line = 7)
    public final void method738(int arg0) {
        field10338++;
        if (class686.field9702 != this.field10342) {
            this.field10342 = class686.field9702;
            this.field10337 = true;
        }
        this.field10342.method97(0);
        if (arg0 != 23978) {
            return;
        }
        class385[] var2 = this.field10343;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class385 var4 = var2[var3];
            if (var4 != null) {
                var4.method20(-60);
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)I", line = 41)
    public final int method733(boolean arg0) {
        field10344++;
        int var2 = 0;
        class385[] var3 = this.field10343;
        if (arg0) {
            this.field10342 = null;
        }
        for (int var4 = 0; var4 < var3.length; var4++) {
            class385 var5 = var3[var4];
            if (var5 == null || var5.method17(-109)) {
                var2++;
            }
        }
        return var2 * 100 / this.field10343.length;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V", line = 67)
    public final void method735(byte arg0) {
        if (arg0 >= -44) {
            this.field10334 = null;
        }
        field10336++;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZ)V", line = 77)
    public final void method740(int arg0, boolean arg1) {
        field10341++;
        boolean var3 = true;
        if (arg0 != -23960) {
            this.method736(-41);
        }
        class385[] var4 = this.field10343;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class385 var6 = var4[var5];
            if (var6 != null) {
                var6.method19(var3 || this.field10337, arg0 ^ 0xFFFFA227);
            }
        }
        this.field10337 = false;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)I", line = 102)
    public final int method736(int arg0) {
        field10333++;
        return arg0 == 14383 ? this.field10334.field8648 : 46;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(JZ)Z", line = 118)
    public final boolean method731(long arg0, boolean arg1) {
        field10335++;
        if (!arg1) {
            this.method731(104L, true);
        }
        return class337.method2062(false) >= (long) this.field10334.field8653 + arg0;
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lsga;Lho;)V", line = 133)
    public class744(class609 arg0, class319 arg1) {
        this.field10334 = arg0;
        this.field10343 = new class385[this.field10334.field8654.length];
        for (int var3 = 0; var3 < this.field10343.length; var3++) {
            this.field10343[var3] = arg1.method1935(this.field10334.field8654[var3], (byte) -125);
        }
    }
}
