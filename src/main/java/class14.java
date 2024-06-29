import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class14 {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Lre;")
    private class263 field155 = new class263((byte[]) null);

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "[B")
    private static byte[] field160 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public int field157;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    private int field159;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "J")
    private long field162;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "[I")
    public int[] field156;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "[I")
    private int[] field158;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "[I")
    private int[] field161;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "[I")
    private int[] field163;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()Z", line = 7)
    public final boolean method78() {
        int var1 = this.field161.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field161[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 20)
    public final void method79(int arg0) {
        this.field155.field4025 = this.field161[arg0];
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([B)V", line = 24)
    public final void method80(byte[] arg0) {
        this.field155.field3986 = arg0;
        this.field155.field4025 = 10;
        int var2 = this.field155.method1830((byte) -77);
        this.field157 = this.field155.method1830((byte) -77);
        this.field159 = 500000;
        this.field163 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field155.method1826(-206227536);
            int var5 = this.field155.method1826(-206227536);
            if (var4 == 1297379947) {
                this.field163[var3] = this.field155.field4025;
                var3++;
            }
            this.field155.field4025 += var5;
        }
        this.field162 = 0L;
        this.field161 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field161[var6] = this.field163[var6];
        }
        this.field156 = new int[var2];
        this.field158 = new int[var2];
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "()I", line = 79)
    public final int method81() {
        return this.field161.length;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "()I", line = 85)
    public final int method82() {
        int var1 = this.field161.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field161[var4] >= 0 && this.field156[var4] < var3) {
                var2 = var4;
                var3 = this.field156[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V", line = 261)
    public class14() {
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "([B)V", line = 266)
    public class14(byte[] arg0) {
        this.method80(arg0);
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "()Z", line = 117)
    public final boolean method83() {
        return this.field155.field3986 != null;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)I", line = 121)
    private final int method84(int arg0) {
        byte var2 = this.field155.field3986[this.field155.field4025];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field158[arg0] = var3;
            this.field155.field4025++;
        } else {
            var3 = this.field158[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method88(arg0, var3);
        }
        int var4 = this.field155.method1828(-3732);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field155.field3986[this.field155.field4025] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field155.field4025++;
                this.field158[arg0] = var5;
                return this.method88(arg0, var5);
            }
        }
        this.field155.field4025 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(J)V", line = 159)
    public final void method85(long arg0) {
        this.field162 = arg0;
        int var3 = this.field161.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field156[var4] = 0;
            this.field158[var4] = 0;
            this.field155.field4025 = this.field163[var4];
            this.method89(var4);
            this.field161[var4] = this.field155.field4025;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)I", line = 180)
    public final int method86(int arg0) {
        return this.method84(arg0);
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "()V", line = 187)
    public static void method87() {
        field160 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)I", line = 192)
    private final int method88(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field160[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field155.method1787(false) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field155.method1787(false) << 16;
            }
            return var8;
        }
        int var3 = this.field155.method1787(false);
        int var4 = this.field155.method1828(-3732);
        if (var3 == 47) {
            this.field155.field4025 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field155.method1824(false);
            var4 -= 3;
            int var6 = this.field156[arg0];
            this.field162 += (long) (this.field159 - var5) * (long) var6;
            this.field159 = var5;
            this.field155.field4025 += var4;
            return 2;
        } else {
            this.field155.field4025 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V", line = 235)
    public final void method89(int arg0) {
        int var2 = this.field155.method1828(-3732);
        this.field156[arg0] += var2;
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "()V", line = 240)
    public final void method90() {
        this.field155.field3986 = null;
        this.field163 = null;
        this.field161 = null;
        this.field156 = null;
        this.field158 = null;
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "()V", line = 253)
    public final void method91() {
        this.field155.field4025 = -1;
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)J", line = 259)
    public final long method92(int arg0) {
        return (long) this.field159 * (long) arg0 + this.field162;
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V", line = 264)
    public final void method93(int arg0) {
        this.field161[arg0] = this.field155.field4025;
    }
}
