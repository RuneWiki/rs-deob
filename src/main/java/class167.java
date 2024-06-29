import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class167 {

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "Lhi;")
    private class264 field2716 = new class264((byte[]) null);

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "[B")
    private static byte[] field2723 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public int field2719;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    private int field2724;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "J")
    private long field2720;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "[I")
    public int[] field2717;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "[I")
    private int[] field2718;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "[I")
    private int[] field2721;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "[I")
    private int[] field2722;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)I")
    public final int method1163(int arg0) {
        return this.method1171(arg0);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I")
    private final int method1164(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2723[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2716.method1779(-83) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2716.method1779(-50) << 16;
            }
            return var8;
        }
        int var3 = this.field2716.method1779(-81);
        int var4 = this.field2716.method1781(-3);
        if (var3 == 47) {
            this.field2716.field4195 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2716.method1732(100);
            var4 -= 3;
            int var6 = this.field2717[arg0];
            this.field2720 += (long) (this.field2724 - var5) * (long) var6;
            this.field2724 = var5;
            this.field2716.field4195 += var4;
            return 2;
        } else {
            this.field2716.field4195 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
    public final void method1165(int arg0) {
        this.field2716.field4195 = this.field2721[arg0];
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()Z")
    public final boolean method1166() {
        return this.field2716.field4198 != null;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "()I")
    public final int method1167() {
        return this.field2721.length;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "()V")
    public final void method1168() {
        this.field2716.field4195 = -1;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "()I")
    public final int method1169() {
        int var1 = this.field2721.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2721[var4] >= 0 && this.field2717[var4] < var3) {
                var2 = var4;
                var3 = this.field2717[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
    public final void method1170(int arg0) {
        this.field2721[arg0] = this.field2716.field4195;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)I")
    private final int method1171(int arg0) {
        byte var2 = this.field2716.field4198[this.field2716.field4195];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2718[arg0] = var3;
            this.field2716.field4195++;
        } else {
            var3 = this.field2718[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1164(arg0, var3);
        }
        int var4 = this.field2716.method1781(-3);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2716.field4198[this.field2716.field4195] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2716.field4195++;
                this.field2718[arg0] = var5;
                return this.method1164(arg0, var5);
            }
        }
        this.field2716.field4195 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)J")
    public final long method1172(int arg0) {
        return (long) this.field2724 * (long) arg0 + this.field2720;
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "()Z")
    public final boolean method1173() {
        int var1 = this.field2721.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2721[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "()V")
    public final void method1174() {
        this.field2716.field4198 = null;
        this.field2722 = null;
        this.field2721 = null;
        this.field2717 = null;
        this.field2718 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(J)V")
    public final void method1175(long arg0) {
        this.field2720 = arg0;
        int var3 = this.field2721.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2717[var4] = 0;
            this.field2718[var4] = 0;
            this.field2716.field4195 = this.field2722[var4];
            this.method1177(var4);
            this.field2721[var4] = this.field2716.field4195;
        }
    }

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "()V")
    public static void method1176() {
        field2723 = null;
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
    public final void method1177(int arg0) {
        int var2 = this.field2716.method1781(-3);
        this.field2717[arg0] += var2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([B)V")
    public final void method1178(byte[] arg0) {
        this.field2716.field4198 = arg0;
        this.field2716.field4195 = 10;
        int var2 = this.field2716.method1777(-74);
        this.field2719 = this.field2716.method1777(-87);
        this.field2724 = 500000;
        this.field2722 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2716.method1765((byte) 122);
            int var6 = this.field2716.method1765((byte) 116);
            if (var5 == 1297379947) {
                this.field2722[var3] = this.field2716.field4195;
                var3++;
            }
            this.field2716.field4195 += var6;
        }
        this.field2720 = 0L;
        this.field2721 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2721[var4] = this.field2722[var4];
        }
        this.field2717 = new int[var2];
        this.field2718 = new int[var2];
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
    public class167() {
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "([B)V")
    public class167(byte[] arg0) {
        this.method1178(arg0);
    }
}
