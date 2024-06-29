import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class40 {

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "Loe;")
    private class146 field866 = new class146((byte[]) null);

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "[B")
    private static byte[] field865 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    private int field868;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public int field870;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "J")
    private long field869;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "[I")
    public int[] field867;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "[I")
    private int[] field871;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "[I")
    private int[] field872;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "[I")
    private int[] field873;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)J", line = 4)
    public final long method300(int arg0) {
        return (long) this.field868 * (long) arg0 + this.field869;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(J)V", line = 8)
    public final void method301(long arg0) {
        this.field869 = arg0;
        int var3 = this.field872.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field867[var4] = 0;
            this.field873[var4] = 0;
            this.field866.field2435 = this.field871[var4];
            this.method302(var4);
            this.field872[var4] = this.field866.field2435;
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 27)
    public final void method302(int arg0) {
        int var2 = this.field866.method997((byte) -98);
        this.field867[arg0] += var2;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)I", line = 35)
    public final int method303(int arg0) {
        return this.method309(arg0);
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V", line = 264)
    public class40() {
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "([B)V", line = 266)
    public class40(byte[] arg0) {
        this.method312(arg0);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)I", line = 44)
    private final int method304(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field865[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field866.method1005((byte) 122) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field866.method1005((byte) 122) << 16;
            }
            return var8;
        }
        int var3 = this.field866.method1005((byte) 122);
        int var4 = this.field866.method997((byte) -98);
        if (var3 == 47) {
            this.field866.field2435 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field866.method1025((byte) -75);
            var4 -= 3;
            int var6 = this.field867[arg0];
            this.field869 += (long) (this.field868 - var5) * (long) var6;
            this.field868 = var5;
            this.field866.field2435 += var4;
            return 2;
        } else {
            this.field866.field2435 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "()V", line = 86)
    public static void method305() {
        field865 = null;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "()V", line = 96)
    public final void method306() {
        this.field866.field2496 = null;
        this.field871 = null;
        this.field872 = null;
        this.field867 = null;
        this.field873 = null;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "()Z", line = 107)
    public final boolean method307() {
        int var1 = this.field872.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field872[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "()V", line = 120)
    public final void method308() {
        this.field866.field2435 = -1;
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)I", line = 124)
    private final int method309(int arg0) {
        byte var2 = this.field866.field2496[this.field866.field2435];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field873[arg0] = var3;
            this.field866.field2435++;
        } else {
            var3 = this.field873[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method304(arg0, var3);
        }
        int var4 = this.field866.method997((byte) -98);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field866.field2496[this.field866.field2435] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field866.field2435++;
                this.field873[arg0] = var5;
                return this.method304(arg0, var5);
            }
        }
        this.field866.field2435 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "()Z", line = 163)
    public final boolean method310() {
        return this.field866.field2496 != null;
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)V", line = 167)
    public final void method311(int arg0) {
        this.field872[arg0] = this.field866.field2435;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "([B)V", line = 170)
    public final void method312(byte[] arg0) {
        this.field866.field2496 = arg0;
        this.field866.field2435 = 10;
        int var2 = this.field866.method989(126);
        this.field870 = this.field866.method989(61);
        this.field868 = 500000;
        this.field871 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field866.method1004(3);
            int var5 = this.field866.method1004(3);
            if (var4 == 1297379947) {
                this.field871[var3] = this.field866.field2435;
                var3++;
            }
            this.field866.field2435 += var5;
        }
        this.field869 = 0L;
        this.field872 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field872[var6] = this.field871[var6];
        }
        this.field867 = new int[var2];
        this.field873 = new int[var2];
    }

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "()I", line = 224)
    public final int method313() {
        int var1 = this.field872.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field872[var4] >= 0 && this.field867[var4] < var3) {
                var2 = var4;
                var3 = this.field867[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "(I)V", line = 249)
    public final void method314(int arg0) {
        this.field866.field2435 = this.field872[arg0];
    }

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "()I", line = 254)
    public final int method315() {
        return this.field872.length;
    }
}
