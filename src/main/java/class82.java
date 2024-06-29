import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class82 {

    @OriginalMember(owner = "client!e", name = "a", descriptor = "Lfb;")
    private class341 field1147 = new class341((byte[]) null);

    @OriginalMember(owner = "client!e", name = "f", descriptor = "[B")
    private static byte[] field1152 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    private int field1153;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "J")
    private long field1151;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "[I")
    private int[] field1148;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "[I")
    private int[] field1149;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "[I")
    private int[] field1154;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "[I")
    public int[] field1155;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)I", line = 5)
    private final int method639(int arg0) {
        byte var2 = this.field1147.field5042[this.field1147.field5049];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1148[arg0] = var3;
            this.field1147.field5049++;
        } else {
            var3 = this.field1148[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method651(arg0, var3);
        }
        int var4 = this.field1147.method2259((byte) -81);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1147.field5042[this.field1147.field5049] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1147.field5049++;
                this.field1148[arg0] = var5;
                return this.method651(arg0, var5);
            }
        }
        this.field1147.field5049 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()I", line = 45)
    public final int method640() {
        return this.field1154.length;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()Z", line = 48)
    public final boolean method641() {
        return this.field1147.field5042 != null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(J)V", line = 51)
    public final void method642(long arg0) {
        this.field1151 = arg0;
        int var3 = this.field1154.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1155[var4] = 0;
            this.field1148[var4] = 0;
            this.field1147.field5049 = this.field1149[var4];
            this.method648(var4);
            this.field1154[var4] = this.field1147.field5049;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([B)V", line = 69)
    public final void method643(byte[] arg0) {
        this.field1147.field5042 = arg0;
        this.field1147.field5049 = 10;
        int var2 = this.field1147.method2239(-1076227960);
        this.field1150 = this.field1147.method2239(-1076227960);
        this.field1153 = 500000;
        this.field1149 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1147.method2232(-104);
            int var6 = this.field1147.method2232(-7);
            if (var5 == 1297379947) {
                this.field1149[var3] = this.field1147.field5049;
                var3++;
            }
            this.field1147.field5049 += var6;
        }
        this.field1151 = 0L;
        this.field1154 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1154[var4] = this.field1149[var4];
        }
        this.field1155 = new int[var2];
        this.field1148 = new int[var2];
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V", line = 122)
    public final void method644(int arg0) {
        this.field1147.field5049 = this.field1154[arg0];
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)I", line = 127)
    public final int method645(int arg0) {
        return this.method639(arg0);
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "()Z", line = 134)
    public final boolean method646() {
        int var1 = this.field1154.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1154[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()V", line = 147)
    public final void method647() {
        this.field1147.field5049 = -1;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V", line = 264)
    public class82() {
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "([B)V", line = 266)
    public class82(byte[] arg0) {
        this.method643(arg0);
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V", line = 162)
    public final void method648(int arg0) {
        int var2 = this.field1147.method2259((byte) 69);
        this.field1155[arg0] += var2;
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "()V", line = 166)
    public final void method649() {
        this.field1147.field5042 = null;
        this.field1149 = null;
        this.field1154 = null;
        this.field1155 = null;
        this.field1148 = null;
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V", line = 177)
    public final void method650(int arg0) {
        this.field1154[arg0] = this.field1147.field5049;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)I", line = 181)
    private final int method651(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1152[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1147.method2233((byte) 104) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1147.method2233((byte) 104) << 16;
            }
            return var8;
        }
        int var3 = this.field1147.method2233((byte) 104);
        int var4 = this.field1147.method2259((byte) 91);
        if (var3 == 47) {
            this.field1147.field5049 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1147.method2249(32767);
            var4 -= 3;
            int var6 = this.field1155[arg0];
            this.field1151 += (long) (this.field1153 - var5) * (long) var6;
            this.field1153 = var5;
            this.field1147.field5049 += var4;
            return 2;
        } else {
            this.field1147.field5049 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(I)J", line = 225)
    public final long method652(int arg0) {
        return (long) this.field1153 * (long) arg0 + this.field1151;
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "()I", line = 229)
    public final int method653() {
        int var1 = this.field1154.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1154[var4] >= 0 && this.field1155[var4] < var3) {
                var2 = var4;
                var3 = this.field1155[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "()V", line = 254)
    public static void method654() {
        field1152 = null;
    }
}
