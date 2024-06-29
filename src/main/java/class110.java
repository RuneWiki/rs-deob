import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class110 {

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lgk;")
    private class540 field1628 = new class540(null);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "[B")
    private static byte[] field1627 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    private int field1629;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public int field1633;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "J")
    private long field1634;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "[I")
    public int[] field1630;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "[I")
    private int[] field1631;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "[I")
    private int[] field1632;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "[I")
    private int[] field1635;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 4)
    public final void method823(int arg0) {
        int var2 = this.field1628.method3114(16711680);
        this.field1630[arg0] += var2;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)I", line = 9)
    private final int method824(int arg0) {
        byte var2 = this.field1628.field7952[this.field1628.field7956];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1632[arg0] = var3;
            this.field1628.field7956++;
        } else {
            var3 = this.field1632[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method830(arg0, var3);
        }
        int var4 = this.field1628.method3114(16711680);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1628.field7952[this.field1628.field7956] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1628.field7956++;
                this.field1632[arg0] = var5;
                return this.method830(arg0, var5);
            }
        }
        this.field1628.field7956 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "()V", line = 47)
    public final void method825() {
        this.field1628.field7952 = null;
        this.field1631 = null;
        this.field1635 = null;
        this.field1630 = null;
        this.field1632 = null;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "()V", line = 57)
    public final void method826() {
        this.field1628.field7956 = -1;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "()Z", line = 61)
    public final boolean method827() {
        int var1 = this.field1635.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1635[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "()I", line = 74)
    public final int method828() {
        return this.field1635.length;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V", line = 78)
    public final void method829(int arg0) {
        this.field1635[arg0] = this.field1628.field7956;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)I", line = 81)
    private final int method830(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1627[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1628.method3115(29871) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1628.method3115(29871) << 16;
            }
            return var8;
        }
        int var3 = this.field1628.method3115(29871);
        int var4 = this.field1628.method3114(16711680);
        if (var3 == 47) {
            this.field1628.field7956 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1628.method3154((byte) -13);
            var4 -= 3;
            int var6 = this.field1630[arg0];
            this.field1634 += (long) (this.field1629 - var5) * (long) var6;
            this.field1629 = var5;
            this.field1628.field7956 += var4;
            return 2;
        } else {
            this.field1628.field7956 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "()Z", line = 125)
    public final boolean method831() {
        return this.field1628.field7952 != null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([B)V", line = 128)
    public final void method832(byte[] arg0) {
        this.field1628.field7952 = arg0;
        this.field1628.field7956 = 10;
        int var2 = this.field1628.method3169(26488);
        this.field1633 = this.field1628.method3169(26488);
        this.field1629 = 500000;
        this.field1631 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1628.method3160(false);
            int var6 = this.field1628.method3160(false);
            if (var5 == 1297379947) {
                this.field1631[var3] = this.field1628.field7956;
                var3++;
            }
            this.field1628.field7956 += var6;
        }
        this.field1634 = 0L;
        this.field1635 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1635[var4] = this.field1631[var4];
        }
        this.field1630 = new int[var2];
        this.field1632 = new int[var2];
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)V", line = 186)
    public final void method833(int arg0) {
        this.field1628.field7956 = this.field1635[arg0];
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)I", line = 190)
    public final int method834(int arg0) {
        return this.method824(arg0);
    }

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)J", line = 197)
    public final long method835(int arg0) {
        return (long) this.field1629 * (long) arg0 + this.field1634;
    }

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "()I", line = 202)
    public final int method836() {
        int var1 = this.field1635.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1635[var4] >= 0 && this.field1630[var4] < var3) {
                var2 = var4;
                var3 = this.field1630[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "()V", line = 229)
    public static void method837() {
        field1627 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(J)V", line = 235)
    public final void method838(long arg0) {
        this.field1634 = arg0;
        int var3 = this.field1635.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1630[var4] = 0;
            this.field1632[var4] = 0;
            this.field1628.field7956 = this.field1631[var4];
            this.method823(var4);
            this.field1635[var4] = this.field1628.field7956;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 264)
    public class110() {
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "([B)V", line = 266)
    public class110(byte[] arg0) {
        this.method832(arg0);
    }
}
