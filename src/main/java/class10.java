import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class10 {

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Leb;")
    private class27 field196 = new class27(null);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "[B")
    private static byte[] field195 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public int field198;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "J")
    private long field203;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
    private int[] field197;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
    private int[] field200;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "[I")
    public int[] field201;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "[I")
    private int[] field202;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(J)V", line = 3)
    public final void method86(long arg0) {
        this.field203 = arg0;
        int var3 = this.field197.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field201[var4] = 0;
            this.field202[var4] = 0;
            this.field196.field482 = this.field200[var4];
            this.method97(var4);
            this.field197[var4] = this.field196.field482;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()I", line = 23)
    public final int method87() {
        int var1 = this.field197.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field197[var4] >= 0 && this.field201[var4] < var3) {
                var2 = var4;
                var3 = this.field201[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)I", line = 49)
    public final int method88(int arg0) {
        return this.method98(arg0);
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "()V", line = 56)
    public final void method89() {
        this.field196.field482 = -1;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "()Z", line = 60)
    public final boolean method90() {
        int var1 = this.field197.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field197[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "()Z", line = 73)
    public final boolean method91() {
        return this.field196.field482 < 0;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)J", line = 76)
    public final long method92(int arg0) {
        return (long) this.field199 * (long) arg0 + this.field203;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V", line = 80)
    public final void method93(int arg0) {
        this.field197[arg0] = this.field196.field482;
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "()I", line = 85)
    public final int method94() {
        return this.field197.length;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I", line = 88)
    private final int method95(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field195[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field196.method231(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field196.method231(255) << 16;
            }
            return var8;
        }
        int var3 = this.field196.method231(255);
        int var4 = this.field196.method247(78);
        if (var3 == 47) {
            this.field196.field482 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field196.method241(2);
            var4 -= 3;
            int var6 = this.field201[arg0];
            this.field203 += (long) (this.field199 - var5) * (long) var6;
            this.field199 = var5;
            this.field196.field482 += var4;
            return 2;
        } else {
            this.field196.field482 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "()V", line = 130)
    public final void method96() {
        this.field196.field502 = null;
        this.field200 = null;
        this.field197 = null;
        this.field201 = null;
        this.field202 = null;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V", line = 140)
    public final void method97(int arg0) {
        int var2 = this.field196.method247(86);
        this.field201[arg0] += var2;
    }

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)I", line = 148)
    private final int method98(int arg0) {
        byte var2 = this.field196.field502[this.field196.field482];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field202[arg0] = var3;
            this.field196.field482++;
        } else {
            var3 = this.field202[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method95(arg0, var3);
        }
        int var4 = this.field196.method247(61);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field196.field502[this.field196.field482] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field196.field482++;
                this.field202[arg0] = var5;
                return this.method95(arg0, var5);
            }
        }
        this.field196.field482 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "([B)V", line = 186)
    public final void method99(byte[] arg0) {
        this.field196.field502 = arg0;
        this.field196.field482 = 10;
        int var2 = this.field196.method227(127);
        this.field198 = this.field196.method227(127);
        this.field199 = 500000;
        this.field200 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field196.method251((byte) 105);
            int var5 = this.field196.method251((byte) 105);
            if (var4 == 1297379947) {
                this.field200[var3] = this.field196.field482;
                var3++;
            }
            this.field196.field482 += var5;
        }
        this.field197 = (int[]) this.field200.clone();
        this.field201 = new int[var2];
        this.field202 = new int[var2];
    }

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "()V", line = 232)
    public static void method100() {
        field195 = null;
    }

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "()Z", line = 236)
    public final boolean method101() {
        return this.field196.field502 != null;
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V", line = 246)
    public final void method102(int arg0) {
        this.field196.field482 = this.field197[arg0];
    }
}
