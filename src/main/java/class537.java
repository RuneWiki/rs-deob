import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class537 {

    @OriginalMember(owner = "client!uca", name = "h", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field7724;

    @OriginalMember(owner = "client!uca", name = "m", descriptor = "Lrf;")
    private class90 field7729;

    @OriginalMember(owner = "client!uca", name = "i", descriptor = "Lgu;")
    private class605 field7725;

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field7720;

    @OriginalMember(owner = "client!uca", name = "l", descriptor = "Lkka;")
    private class327 field7728;

    @OriginalMember(owner = "client!uca", name = "f", descriptor = "J")
    public static long field7722 = -1L;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "Lfba;")
    public static class27 field7717 = new class27(6, 4);

    @OriginalMember(owner = "client!uca", name = "g", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!uca", name = "j", descriptor = "I")
    public static int field7726;

    @OriginalMember(owner = "client!uca", name = "n", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!uca", name = "o", descriptor = "I")
    public static int field7731;

    @OriginalMember(owner = "client!uca", name = "p", descriptor = "I")
    public static int field7732;

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "Lso;")
    private class494 field7718;

    @OriginalMember(owner = "client!uca", name = "k", descriptor = "Lnea;")
    public static class743 field7727;

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "[Lpt;")
    public static class555[] field7719;

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "[Lim;")
    private class596[] field7721;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IBI)Z", line = 6)
    public static final boolean method3221(int arg0, byte arg1, int arg2) {
        field7726++;
        int var3 = -25 / ((arg1 - 10) / 59);
        return (arg0 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILuaa;Luaa;I)Lim;", line = 17)
    public final class596 method3222(int arg0, class126 arg1, class126 arg2, int arg3) {
        if (arg3 == 0) {
            field7730++;
            return this.method3228((byte) -91, arg0, arg1, arg2, true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)V", line = 28)
    public final void method3223(byte arg0) {
        field7732++;
        if (this.field7721 == null) {
            return;
        }
        if (arg0 != 41) {
            method3226(-50);
        }
        for (int var2 = 0; var2 < this.field7721.length; var2++) {
            if (this.field7721[var2] != null) {
                this.field7721[var2].method3475(arg0 ^ 0xD6);
            }
        }
        for (int var3 = 0; var3 < this.field7721.length; var3++) {
            if (this.field7721[var3] != null) {
                this.field7721[var3].method3480(false);
            }
        }
    }

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(B)Z", line = 67)
    public final boolean method3224(byte arg0) {
        field7723++;
        if (this.field7718 != null) {
            return true;
        }
        if (this.field7728 == null) {
            if (this.field7725.method3515((byte) 46)) {
                return false;
            }
            this.field7728 = this.field7725.method3504(-127, 255, 255, (byte) 0, true);
        }
        if (this.field7728.field930) {
            return false;
        }
        class494 var2 = new class494(this.field7728.method638((byte) 82));
        var2.field7042 = 5;
        int var3 = var2.method2964((byte) 85);
        var2.field7042 += var3 * 72;
        byte[] var4 = new byte[var2.field7050.length - var2.field7042];
        var2.method2958(true, var4, 0, var4.length);
        byte[] var7;
        if (this.field7720 == null || this.field7724 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field7720, this.field7724);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class413.method2507(105, 5, var2.field7050, var2.field7042 - var4.length - 5);
        int var9 = 0;
        int var10 = -16 % ((arg0 - 67) / 36);
        while (var9 < 64) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
            var9++;
        }
        this.field7718 = var2;
        this.field7721 = new class596[var3];
        return true;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIILeba;Leba;)V", line = 141)
    public static final void method3225(int arg0, int arg1, int arg2, class613 arg3, class613 arg4) {
        class46 var5 = class704.method3985(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field582 = arg3;
        var5.field589 = arg4;
        int var6 = class774.field10642 == class208.field3219 ? 1 : 0;
        if (!arg3.method909(false)) {
            arg3.field5747 = class695.field9711[var6];
            class695.field9711[var6] = arg3;
        } else if (arg3.method906(72)) {
            arg3.field5747 = class338.field4733[var6];
            class338.field4733[var6] = arg3;
        } else {
            arg3.field5747 = class745.field10328[var6];
            class745.field10328[var6] = arg3;
            class98.field1115 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method909(false)) {
            if (arg4.method906(75)) {
                arg4.field5747 = class338.field4733[var6];
                class338.field4733[var6] = arg4;
                return;
            }
            arg4.field5747 = class745.field10328[var6];
            class745.field10328[var6] = arg4;
            class98.field1115 = true;
            return;
        }
        arg4.field5747 = class695.field9711[var6];
        class695.field9711[var6] = arg4;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(I)V", line = 198)
    public static void method3226(int arg0) {
        field7719 = null;
        field7717 = null;
        if (arg0 != -5333) {
            method3226(90);
        }
        field7727 = null;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIILjava/lang/Class;)Lit;", line = 212)
    public static final class672 method3227(int arg0, int arg1, int arg2, Class arg3) {
        class46 var4 = class767.field10562[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class48 var5 = var4.field586; var5 != null; var5 = var5.field611) {
            class672 var6 = var5.field605;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field9368 == arg1 && var6.field9364 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(BILuaa;Luaa;Z)Lim;", line = 251)
    private final class596 method3228(byte arg0, int arg1, class126 arg2, class126 arg3, boolean arg4) {
        field7731++;
        if (this.field7718 == null) {
            throw new RuntimeException();
        } else if (arg1 >= 0 && arg1 < this.field7721.length) {
            if (arg0 != -91) {
                field7727 = null;
            }
            if (this.field7721[arg1] != null) {
                return this.field7721[arg1];
            }
            this.field7718.field7042 = arg1 * 72 + 6;
            int var6 = this.field7718.method2976(arg0 - 36);
            int var7 = this.field7718.method2976(-127);
            byte[] var8 = new byte[64];
            this.field7718.method2958(true, var8, 0, 64);
            class596 var9 = new class596(arg1, arg2, arg3, this.field7725, this.field7729, var6, var8, var7, arg4);
            this.field7721[arg1] = var9;
            return var9;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(Lgu;Lrf;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 295)
    public class537(class605 arg0, class90 arg1, BigInteger arg2, BigInteger arg3) {
        this.field7724 = arg3;
        this.field7729 = arg1;
        this.field7725 = arg0;
        this.field7720 = arg2;
        if (!this.field7725.method3515((byte) -113)) {
            this.field7728 = this.field7725.method3504(-127, 255, 255, (byte) 0, true);
        }
    }
}
