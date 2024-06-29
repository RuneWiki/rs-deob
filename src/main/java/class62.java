import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class62 {

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Lwb;")
    private class148 field1607 = new class148(null);

    @OriginalMember(owner = "client!j", name = "a", descriptor = "[B")
    private static byte[] field1606 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public int field1610;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    private int field1612;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "J")
    private long field1614;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "[I")
    private int[] field1608;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "[I")
    private int[] field1609;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "[I")
    private int[] field1611;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "[I")
    public int[] field1613;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)I")
    public final int method483(int arg0) {
        return this.method496(arg0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)I")
    private final int method484(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1606[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1607.method1137(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1607.method1137(255) << 16;
            }
            return var8;
        }
        int var3 = this.field1607.method1137(255);
        int var4 = this.field1607.method1118(0);
        if (var3 == 47) {
            this.field1607.field3601 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1607.method1152((byte) 103);
            var4 -= 3;
            int var6 = this.field1613[arg0];
            this.field1614 += (long) (this.field1612 - var5) * (long) var6;
            this.field1612 = var5;
            this.field1607.field3601 += var4;
            return 2;
        } else {
            this.field1607.field3601 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()Z")
    public final boolean method485() {
        return this.field1607.field3592 != null;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public final void method486(int arg0) {
        this.field1607.field3601 = this.field1608[arg0];
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I")
    public final int method487() {
        return this.field1608.length;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
    public final void method488(int arg0) {
        int var2 = this.field1607.method1118(0);
        this.field1613[arg0] += var2;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()V")
    public final void method489() {
        this.field1607.field3601 = -1;
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()V")
    public static void method490() {
        field1606 = null;
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "()Z")
    public final boolean method491() {
        int var1 = this.field1608.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1608[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "()I")
    public final int method492() {
        int var1 = this.field1608.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1608[var4] >= 0 && this.field1613[var4] < var3) {
                var2 = var4;
                var3 = this.field1613[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)J")
    public final long method493(int arg0) {
        return (long) this.field1612 * (long) arg0 + this.field1614;
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "()V")
    public final void method494() {
        this.field1607.field3592 = null;
        this.field1611 = null;
        this.field1608 = null;
        this.field1613 = null;
        this.field1609 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([B)V")
    public final void method495(byte[] arg0) {
        this.field1607.field3592 = arg0;
        this.field1607.field3601 = 10;
        int var2 = this.field1607.method1140(-1);
        this.field1610 = this.field1607.method1140(-1);
        this.field1612 = 500000;
        this.field1611 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1607.method1104(true);
            int var6 = this.field1607.method1104(true);
            if (var5 == 1297379947) {
                this.field1611[var3] = this.field1607.field3601;
                var3++;
            }
            this.field1607.field3601 += var6;
        }
        this.field1614 = 0L;
        this.field1608 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1608[var4] = this.field1611[var4];
        }
        this.field1613 = new int[var2];
        this.field1609 = new int[var2];
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(I)I")
    private final int method496(int arg0) {
        byte var2 = this.field1607.field3592[this.field1607.field3601];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1609[arg0] = var3;
            this.field1607.field3601++;
        } else {
            var3 = this.field1609[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method484(arg0, var3);
        }
        int var4 = this.field1607.method1118(0);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1607.field3592[this.field1607.field3601] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1607.field3601++;
                this.field1609[arg0] = var5;
                return this.method484(arg0, var5);
            }
        }
        this.field1607.field3601 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(I)V")
    public final void method497(int arg0) {
        this.field1608[arg0] = this.field1607.field3601;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(J)V")
    public final void method498(long arg0) {
        this.field1614 = arg0;
        int var3 = this.field1608.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1613[var4] = 0;
            this.field1609[var4] = 0;
            this.field1607.field3601 = this.field1611[var4];
            this.method488(var4);
            this.field1608[var4] = this.field1607.field3601;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
    public class62() {
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "([B)V")
    public class62(byte[] arg0) {
        this.method495(arg0);
    }
}
