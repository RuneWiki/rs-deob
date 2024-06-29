import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class242 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Ltf;")
    private class106 field4373 = new class106((byte[]) null);

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "[B")
    private static byte[] field4374 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public int field4376;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    private int field4377;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "J")
    private long field4380;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "[I")
    private int[] field4375;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "[I")
    private int[] field4378;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "[I")
    public int[] field4379;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "[I")
    private int[] field4381;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public final void method1674(int arg0) {
        this.field4381[arg0] = this.field4373.field2085;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "()V")
    public static void method1675() {
        field4374 = null;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public final void method1676(int arg0) {
        int var2 = this.field4373.method772((byte) 113);
        this.field4379[arg0] += var2;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "()V")
    public final void method1677() {
        this.field4373.field2108 = null;
        this.field4375 = null;
        this.field4381 = null;
        this.field4379 = null;
        this.field4378 = null;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "()I")
    public final int method1678() {
        int var1 = this.field4381.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4381[var4] >= 0 && this.field4379[var4] < var3) {
                var2 = var4;
                var3 = this.field4379[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "()Z")
    public final boolean method1679() {
        int var1 = this.field4381.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4381[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
    public final void method1680(int arg0) {
        this.field4373.field2085 = this.field4381[arg0];
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "()I")
    public final int method1681() {
        return this.field4381.length;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(J)V")
    public final void method1682(long arg0) {
        this.field4380 = arg0;
        int var3 = this.field4381.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4379[var4] = 0;
            this.field4378[var4] = 0;
            this.field4373.field2085 = this.field4375[var4];
            this.method1676(var4);
            this.field4381[var4] = this.field4373.field2085;
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)I")
    public final int method1683(int arg0) {
        return this.method1688(arg0);
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "()Z")
    public final boolean method1684() {
        return this.field4373.field2108 != null;
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "()V")
    public final void method1685() {
        this.field4373.field2085 = -1;
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)J")
    public final long method1686(int arg0) {
        return (long) this.field4377 * (long) arg0 + this.field4380;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)I")
    private final int method1687(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4374[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4373.method774((byte) 87) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4373.method774((byte) 99) << 16;
            }
            return var8;
        }
        int var3 = this.field4373.method774((byte) 78);
        int var4 = this.field4373.method772((byte) -127);
        if (var3 == 47) {
            this.field4373.field2085 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4373.method776(125);
            var4 -= 3;
            int var6 = this.field4379[arg0];
            this.field4380 += (long) (this.field4377 - var5) * (long) var6;
            this.field4377 = var5;
            this.field4373.field2085 += var4;
            return 2;
        } else {
            this.field4373.field2085 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)I")
    private final int method1688(int arg0) {
        byte var2 = this.field4373.field2108[this.field4373.field2085];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4378[arg0] = var3;
            this.field4373.field2085++;
        } else {
            var3 = this.field4378[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1687(arg0, var3);
        }
        int var4 = this.field4373.method772((byte) -52);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4373.field2108[this.field4373.field2085] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4373.field2085++;
                this.field4378[arg0] = var5;
                return this.method1687(arg0, var5);
            }
        }
        this.field4373.field2085 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([B)V")
    public final void method1689(byte[] arg0) {
        this.field4373.field2108 = arg0;
        this.field4373.field2085 = 10;
        int var2 = this.field4373.method736(126);
        this.field4376 = this.field4373.method736(122);
        this.field4377 = 500000;
        this.field4375 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4373.method746((byte) -100);
            int var6 = this.field4373.method746((byte) -100);
            if (var5 == 1297379947) {
                this.field4375[var3] = this.field4373.field2085;
                var3++;
            }
            this.field4373.field2085 += var6;
        }
        this.field4380 = 0L;
        this.field4381 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4381[var4] = this.field4375[var4];
        }
        this.field4379 = new int[var2];
        this.field4378 = new int[var2];
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class242() {
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "([B)V")
    public class242(byte[] arg0) {
        this.method1689(arg0);
    }
}
