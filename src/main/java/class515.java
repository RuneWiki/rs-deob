import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class515 {

    @OriginalMember(owner = "client!eo", name = "l", descriptor = "Z")
    public boolean field7127 = false;

    @OriginalMember(owner = "client!eo", name = "n", descriptor = "Luaa;")
    private class395 field7129 = new class395(64);

    @OriginalMember(owner = "client!eo", name = "r", descriptor = "Luaa;")
    public class395 field7133 = new class395(500);

    @OriginalMember(owner = "client!eo", name = "s", descriptor = "Luaa;")
    public class395 field7134 = new class395(30);

    @OriginalMember(owner = "client!eo", name = "t", descriptor = "Luaa;")
    public class395 field7135 = new class395(50);

    @OriginalMember(owner = "client!eo", name = "m", descriptor = "Lgp;")
    public class561 field7128;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "Z")
    public boolean field7118;

    @OriginalMember(owner = "client!eo", name = "j", descriptor = "Lgp;")
    private class561 field7125;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "Lid;")
    public static class224 field7120 = new class224("", 16);

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
    public static int field7121;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public static int field7122;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
    public static int field7123;

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "I")
    public static int field7124;

    @OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!eo", name = "o", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
    public static int field7131;

    @OriginalMember(owner = "client!eo", name = "q", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!eo", name = "u", descriptor = "I")
    public int field7136;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V", line = 7)
    public static void method2879(byte arg0) {
        field7120 = null;
        if (arg0 >= -85) {
            field7120 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)V", line = 18)
    public static final void method2880(byte arg0) {
        field7124++;
        class43.field586 = 0;
        int var1 = 0;
        int var2 = -111 / ((-arg0 - 32) / 63);
        while (var1 < 2048) {
            class514.field7115[var1] = null;
            class220.field3310[var1] = 1;
            class641.field9293[var1] = null;
            var1++;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IB)V", line = 39)
    public final void method2881(int arg0, byte arg1) {
        field7116++;
        class395 var3 = this.field7129;
        synchronized (this.field7129) {
            if (arg1 != 46) {
                this.field7134 = null;
            }
            this.field7129.method2397(arg0, (byte) -51);
        }
        class395 var4 = this.field7133;
        synchronized (this.field7133) {
            this.field7133.method2397(arg0, (byte) -47);
        }
        class395 var5 = this.field7134;
        synchronized (this.field7134) {
            this.field7134.method2397(arg0, (byte) -52);
        }
        class395 var6 = this.field7135;
        synchronized (this.field7135) {
            this.field7135.method2397(arg0, (byte) -108);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)V", line = 61)
    public final void method2882(int arg0, int arg1) {
        field7123++;
        if (arg0 != -4893) {
            this.field7127 = true;
        }
        this.field7129 = new class395(arg1);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZB)V", line = 73)
    public final void method2883(boolean arg0, byte arg1) {
        if (arg1 >= -59) {
            return;
        }
        field7117++;
        if (this.field7118 != arg0) {
            this.field7118 = arg0;
            this.method2886(50);
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(IB)V", line = 88)
    public final void method2884(int arg0, byte arg1) {
        field7126++;
        this.field7136 = arg0;
        if (arg1 != -22) {
            this.method2884(-44, (byte) -33);
        }
        class395 var3 = this.field7133;
        synchronized (this.field7133) {
            this.field7133.method2406(arg1 + 99);
        }
        class395 var4 = this.field7134;
        synchronized (this.field7134) {
            this.field7134.method2406(17);
        }
        class395 var5 = this.field7135;
        synchronized (this.field7135) {
            this.field7135.method2406(arg1 ^ 0x69);
        }
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(B)V", line = 112)
    public final void method2885(byte arg0) {
        field7131++;
        class395 var2 = this.field7129;
        synchronized (this.field7129) {
            this.field7129.method2404((byte) -84);
        }
        class395 var3 = this.field7133;
        synchronized (this.field7133) {
            this.field7133.method2404((byte) -101);
        }
        if (arg0 != 65) {
            return;
        }
        class395 var4 = this.field7134;
        synchronized (this.field7134) {
            this.field7134.method2404((byte) -60);
        }
        class395 var5 = this.field7135;
        synchronized (this.field7135) {
            this.field7135.method2404((byte) -124);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V", line = 134)
    public final void method2886(int arg0) {
        field7122++;
        class395 var2 = this.field7129;
        synchronized (this.field7129) {
            if (arg0 != 50) {
                this.field7136 = -57;
            }
            this.field7129.method2406(35);
        }
        class395 var3 = this.field7133;
        synchronized (this.field7133) {
            this.field7133.method2406(arg0 + 65);
        }
        class395 var4 = this.field7134;
        synchronized (this.field7134) {
            this.field7134.method2406(-116);
        }
        class395 var5 = this.field7135;
        synchronized (this.field7135) {
            this.field7135.method2406(-122);
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BZ)V", line = 156)
    public final void method2887(byte arg0, boolean arg1) {
        field7119++;
        if (this.field7127 != arg1) {
            this.field7127 = arg1;
            this.method2886(50);
            int var3 = -102 % ((arg0 + 7) / 46);
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)[Lnn;", line = 175)
    public static final class214[] method2888(int arg0) {
        if (arg0 != -16314) {
            method2888(52);
        }
        field7121++;
        return new class214[] { class574.field8171, class299.field4325, class151.field2276, class401.field5994, class599.field8509, class596.field8487, class368.field5229, class49.field740, class133.field2153, class275.field4024, class134.field2160, class54.field777, class25.field346, class72.field1356, class170.field2484 };
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZLjava/io/File;I[B)V", line = 189)
    public static final void method2889(boolean arg0, File arg1, int arg2, byte[] arg3) throws IOException {
        field7132++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
        try {
            var4.readFully(arg3, 0, arg2);
            if (arg0) {
                field7120 = null;
            }
        } catch (EOFException var5) {
        }
        var4.close();
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Ljc;IZLgp;Lgp;)V", line = 278)
    public class515(class584 arg0, int arg1, boolean arg2, class561 arg3, class561 arg4) {
        this.field7128 = arg4;
        this.field7118 = arg2;
        this.field7125 = arg3;
        if (this.field7125 != null) {
            int var6 = this.field7125.method3185(-109) - 1;
            this.field7125.method3164(var6, true);
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(II)Ltk;", line = 217)
    public final class370 method2890(int arg0, int arg1) {
        field7130++;
        class395 var3 = this.field7129;
        class370 var4;
        synchronized (this.field7129) {
            var4 = (class370) this.field7129.method2407(false, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class561 var5 = this.field7125;
        byte[] var6;
        synchronized (this.field7125) {
            var6 = this.field7125.method3175(class102.method861(arg0 - 125, arg1), (byte) -53, class87.method793(109, arg1));
        }
        class370 var7 = new class370();
        if (arg0 != 0) {
            field7120 = null;
        }
        var7.field5335 = arg1;
        var7.field5275 = this;
        if (var6 != null) {
            var7.method2240(new class268(var6), arg0 ^ 0xFFFFFFAF);
        }
        var7.method2247(27);
        if (!this.field7118 && var7.field5347) {
            var7.field5301 = null;
            var7.field5338 = null;
        }
        if (var7.field5330) {
            var7.field5292 = 0;
            var7.field5315 = false;
        }
        class395 var8 = this.field7129;
        synchronized (this.field7129) {
            this.field7129.method2408(var7, (long) arg1, -120);
            return var7;
        }
    }
}
