import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class222 extends class208 {

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "[J")
    private long[] field3570 = new long[10];

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    private int field3574 = 1;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    private int field3579 = 256;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
    private int field3584 = 0;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "J")
    private long field3576 = class249.method1723((byte) 8);

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
    public static int field3577 = 0;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    private int field3575;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "Lclient;")
    public static client field3583;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)Z")
    public static final boolean method1567(int arg0, int arg1, int arg2) {
        int var3 = class136.field2158[arg0][arg1][arg2];
        if (-class35.field452 == var3) {
            return false;
        } else if (class35.field452 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class186.method1299(var4 + 1, class17.field209[arg0][arg1][arg2], var5 + 1) && class186.method1299(var4 + 128 - 1, class17.field209[arg0][arg1 + 1][arg2], var5 + 1) && class186.method1299(var4 + 128 - 1, class17.field209[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class186.method1299(var4 + 1, class17.field209[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class136.field2158[arg0][arg1][arg2] = class35.field452;
                return true;
            } else {
                class136.field2158[arg0][arg1][arg2] = -class35.field452;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V")
    public final void method1462(int arg0) {
        field3581++;
        if (arg0 != -1) {
            method1569(-78);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field3570[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Leh;Leh;Leh;I)V")
    public static final void method1568(class137 arg0, class137 arg1, class137 arg2, int arg3) {
        if (arg3 != -257) {
            method1569(-93);
        }
        class67.field852 = arg0;
        class76.field954 = arg2;
        field3571++;
        class35.field456 = arg1;
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)V")
    public static void method1569(int arg0) {
        if (arg0 != 10) {
            method1567(79, 18, -61);
        }
        field3583 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIII)V")
    public static final void method1570(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class4.field57.field1228 = 0;
        class4.field57.method580((byte) 76, 20);
        field3573++;
        class4.field57.method580((byte) 80, arg3);
        class4.field57.method580((byte) 118, arg1);
        class4.field57.method572(true, arg0);
        class4.field57.method572(true, arg4);
        class261.field4227 = 1;
        class86.field1062 = -3;
        class220.field3528 = 0;
        class265.field4265 = arg2;
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)V")
    public static final void method1571(int arg0) {
        field3569++;
        class57.field734++;
        int var1 = 68 % ((35 - arg0) / 47);
        class4.field57.method1932(false, 217);
        class4.field57.method590(0L, 1027669520);
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class222() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field3570[var1] = this.field3576;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZII)I")
    public final int method1463(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return 83;
        }
        int var4 = this.field3579;
        int var5 = this.field3574;
        this.field3579 = 300;
        field3582++;
        this.field3574 = 1;
        this.field3576 = class249.method1723((byte) 55);
        if (this.field3570[this.field3575] == 0L) {
            this.field3574 = var5;
            this.field3579 = var4;
        } else if (this.field3570[this.field3575] < this.field3576) {
            this.field3579 = (int) ((long) (arg2 * 2560) / (this.field3576 - this.field3570[this.field3575]));
        }
        if (this.field3579 < 25) {
            this.field3579 = 25;
        }
        if (this.field3579 > 256) {
            this.field3579 = 256;
            this.field3574 = (int) ((long) arg2 - ((this.field3576 - this.field3570[this.field3575]) / 10L));
        }
        if (this.field3574 > arg2) {
            this.field3574 = arg2;
        }
        this.field3570[this.field3575] = this.field3576;
        this.field3575 = (this.field3575 + 1) % 10;
        if (this.field3574 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field3570[var6] != 0L) {
                    this.field3570[var6] += (long) this.field3574;
                }
            }
        }
        if (arg1 > this.field3574) {
            this.field3574 = arg1;
        }
        int var7 = 0;
        class115.method752((byte) -62, (long) this.field3574);
        while (this.field3584 < 256) {
            var7++;
            this.field3584 += this.field3579;
        }
        this.field3584 &= 0xFF;
        return var7;
    }
}
