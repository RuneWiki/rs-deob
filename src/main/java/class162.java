import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class162 {

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "Lii;")
    private class221 field2466 = new class221((byte[]) null);

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "[B")
    private static byte[] field2474 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public int field2469;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    private int field2470;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "J")
    private long field2471;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "[I")
    public int[] field2467;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "[I")
    private int[] field2468;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "[I")
    private int[] field2472;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "[I")
    private int[] field2473;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)J", line = 5)
    public final long method1065(int arg0) {
        return (long) this.field2470 * (long) arg0 + this.field2471;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)I", line = 10)
    private final int method1066(int arg0) {
        byte var2 = this.field2466.field3617[this.field2466.field3610];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2468[arg0] = var3;
            this.field2466.field3610++;
        } else {
            var3 = this.field2468[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1071(arg0, var3);
        }
        int var4 = this.field2466.method1552(-122);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2466.field3617[this.field2466.field3610] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2466.field3610++;
                this.field2468[arg0] = var5;
                return this.method1071(arg0, var5);
            }
        }
        this.field2466.field3610 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "()Z", line = 49)
    public final boolean method1067() {
        return this.field2466.field3617 != null;
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "()Z", line = 53)
    public final boolean method1068() {
        int var1 = this.field2472.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2472[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V", line = 66)
    public final void method1069(int arg0) {
        this.field2466.field3610 = this.field2472[arg0];
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "()V", line = 69)
    public final void method1070() {
        this.field2466.field3610 = -1;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)I", line = 74)
    private final int method1071(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2474[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2466.method1509(true) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2466.method1509(true) << 16;
            }
            return var8;
        }
        int var3 = this.field2466.method1509(true);
        int var4 = this.field2466.method1552(-54);
        if (var3 == 47) {
            this.field2466.field3610 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2466.method1497(3610);
            var4 -= 3;
            int var6 = this.field2467[arg0];
            this.field2471 += (long) (this.field2470 - var5) * (long) var6;
            this.field2470 = var5;
            this.field2466.field3610 += var4;
            return 2;
        } else {
            this.field2466.field3610 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "()V", line = 116)
    public static void method1072() {
        field2474 = null;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V", line = 260)
    public class162() {
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "([B)V", line = 262)
    public class162(byte[] arg0) {
        this.method1079(arg0);
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)V", line = 129)
    public final void method1073(int arg0) {
        this.field2472[arg0] = this.field2466.field3610;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(J)V", line = 133)
    public final void method1074(long arg0) {
        this.field2471 = arg0;
        int var3 = this.field2472.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2467[var4] = 0;
            this.field2468[var4] = 0;
            this.field2466.field3610 = this.field2473[var4];
            this.method1080(var4);
            this.field2472[var4] = this.field2466.field3610;
        }
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "()I", line = 157)
    public final int method1075() {
        int var1 = this.field2472.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2472[var4] >= 0 && this.field2467[var4] < var3) {
                var2 = var4;
                var3 = this.field2467[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "()V", line = 182)
    public final void method1076() {
        this.field2466.field3617 = null;
        this.field2473 = null;
        this.field2472 = null;
        this.field2467 = null;
        this.field2468 = null;
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)I", line = 193)
    public final int method1077(int arg0) {
        return this.method1066(arg0);
    }

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "()I", line = 199)
    public final int method1078() {
        return this.field2472.length;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "([B)V", line = 202)
    public final void method1079(byte[] arg0) {
        this.field2466.field3617 = arg0;
        this.field2466.field3610 = 10;
        int var2 = this.field2466.method1524((byte) 117);
        this.field2469 = this.field2466.method1524((byte) 92);
        this.field2470 = 500000;
        this.field2473 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2466.method1517((byte) -109);
            int var5 = this.field2466.method1517((byte) -113);
            if (var4 == 1297379947) {
                this.field2473[var3] = this.field2466.field3610;
                var3++;
            }
            this.field2466.field3610 += var5;
        }
        this.field2471 = 0L;
        this.field2472 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2472[var6] = this.field2473[var6];
        }
        this.field2467 = new int[var2];
        this.field2468 = new int[var2];
    }

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "(I)V", line = 257)
    public final void method1080(int arg0) {
        int var2 = this.field2466.method1552(-58);
        this.field2467[arg0] += var2;
    }
}
