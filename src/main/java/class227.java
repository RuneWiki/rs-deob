import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class227 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Lpe;")
    private class101 field3626 = new class101((byte[]) null);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "[B")
    private static byte[] field3625 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    private int field3627;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public int field3630;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "J")
    private long field3629;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "[I")
    private int[] field3628;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "[I")
    private int[] field3631;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "[I")
    public int[] field3632;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "[I")
    private int[] field3633;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "()V", line = 6)
    public static void method1637() {
        field3625 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)I", line = 10)
    public final int method1638(int arg0) {
        return this.method1642(arg0);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "()I", line = 19)
    public final int method1639() {
        return this.field3633.length;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "()V", line = 22)
    public final void method1640() {
        this.field3626.field1667 = -1;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "()Z", line = 26)
    public final boolean method1641() {
        return this.field3626.field1661 != null;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)I", line = 31)
    private final int method1642(int arg0) {
        byte var2 = this.field3626.field1661[this.field3626.field1667];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3628[arg0] = var3;
            this.field3626.field1667++;
        } else {
            var3 = this.field3628[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1650(arg0, var3);
        }
        int var4 = this.field3626.method761(-1);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3626.field1661[this.field3626.field1667] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3626.field1667++;
                this.field3628[arg0] = var5;
                return this.method1650(arg0, var5);
            }
        }
        this.field3626.field1667 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "()I", line = 70)
    public final int method1643() {
        int var1 = this.field3633.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3633[var4] >= 0 && this.field3632[var4] < var3) {
                var2 = var4;
                var3 = this.field3632[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V", line = 98)
    public final void method1644(int arg0) {
        this.field3633[arg0] = this.field3626.field1667;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([B)V", line = 103)
    public final void method1645(byte[] arg0) {
        this.field3626.field1661 = arg0;
        this.field3626.field1667 = 10;
        int var2 = this.field3626.method731(false);
        this.field3630 = this.field3626.method731(false);
        this.field3627 = 500000;
        this.field3631 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3626.method775(110);
            int var5 = this.field3626.method775(73);
            if (var4 == 1297379947) {
                this.field3631[var3] = this.field3626.field1667;
                var3++;
            }
            this.field3626.field1667 += var5;
        }
        this.field3629 = 0L;
        this.field3633 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3633[var6] = this.field3631[var6];
        }
        this.field3632 = new int[var2];
        this.field3628 = new int[var2];
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "()V", line = 156)
    public final void method1646() {
        this.field3626.field1661 = null;
        this.field3631 = null;
        this.field3633 = null;
        this.field3632 = null;
        this.field3628 = null;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V", line = 166)
    public final void method1647(int arg0) {
        int var2 = this.field3626.method761(-1);
        this.field3632[arg0] += var2;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V", line = 264)
    public class227() {
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "([B)V", line = 266)
    public class227(byte[] arg0) {
        this.method1645(arg0);
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)J", line = 174)
    public final long method1648(int arg0) {
        return (long) this.field3627 * (long) arg0 + this.field3629;
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "()Z", line = 181)
    public final boolean method1649() {
        int var1 = this.field3633.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3633[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)I", line = 194)
    private final int method1650(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3625[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3626.method741(60) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3626.method741(98) << 16;
            }
            return var8;
        }
        int var3 = this.field3626.method741(56);
        int var4 = this.field3626.method761(-1);
        if (var3 == 47) {
            this.field3626.field1667 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3626.method776(-1574267376);
            var4 -= 3;
            int var6 = this.field3632[arg0];
            this.field3629 += (long) (this.field3627 - var5) * (long) var6;
            this.field3627 = var5;
            this.field3626.field1667 += var4;
            return 2;
        } else {
            this.field3626.field1667 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(J)V", line = 241)
    public final void method1651(long arg0) {
        this.field3629 = arg0;
        int var3 = this.field3633.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3632[var4] = 0;
            this.field3628[var4] = 0;
            this.field3626.field1667 = this.field3631[var4];
            this.method1647(var4);
            this.field3633[var4] = this.field3626.field1667;
        }
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)V", line = 262)
    public final void method1652(int arg0) {
        this.field3626.field1667 = this.field3633[arg0];
    }
}
