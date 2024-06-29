import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class212 extends class64 {

    @OriginalMember(owner = "client!h", name = "m", descriptor = "[J")
    private long[] field3503 = new long[10];

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    private int field3509 = 1;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    private int field3504 = 0;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    private int field3516 = 256;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "J")
    private long field3505 = class67.method501(-114);

    @OriginalMember(owner = "client!h", name = "r", descriptor = "Z")
    public static boolean field3508 = false;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "Z")
    public static boolean field3512 = false;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    private int field3510;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V", line = 240)
    public class212() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field3503[var1] = this.field3505;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 14)
    public static final int method1587(KeyEvent arg0, int arg1) {
        field3514++;
        if (arg1 != 128) {
            field3512 = false;
        }
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(III)I", line = 43)
    public final int method493(int arg0, int arg1, int arg2) {
        int var4 = this.field3516;
        this.field3516 = 300;
        field3507++;
        int var5 = this.field3509;
        this.field3509 = 1;
        this.field3505 = class67.method501(-97);
        if (arg1 > -72) {
            this.method490(-106);
        }
        if (this.field3503[this.field3510] == 0L) {
            this.field3516 = var4;
            this.field3509 = var5;
        } else if (this.field3505 > this.field3503[this.field3510]) {
            this.field3516 = (int) ((long) (arg2 * 2560) / (this.field3505 - this.field3503[this.field3510]));
        }
        if (this.field3516 < 25) {
            this.field3516 = 25;
        }
        if (this.field3516 > 256) {
            this.field3516 = 256;
            this.field3509 = (int) ((long) arg2 - ((this.field3505 - this.field3503[this.field3510]) / 10L));
        }
        if (this.field3509 > arg2) {
            this.field3509 = arg2;
        }
        this.field3503[this.field3510] = this.field3505;
        this.field3510 = (this.field3510 + 1) % 10;
        if (this.field3509 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field3503[var6] != 0L) {
                    this.field3503[var6] -= -((long) this.field3509);
                }
            }
        }
        if (arg0 > this.field3509) {
            this.field3509 = arg0;
        }
        class281.method2041((byte) 107, (long) this.field3509);
        int var7 = 0;
        while (this.field3504 < 256) {
            this.field3504 += this.field3516;
            var7++;
        }
        this.field3504 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Loh;IIZZI)V", line = 123)
    public static final void method1588(class15 arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        class86.field1372 = arg0;
        class266.field4562 = arg1;
        if (!arg3) {
            return;
        }
        class223.field3718 = 1;
        class144.field2404 = 10000;
        field3515++;
        class205.field3412 = arg4;
        class195.field3242 = arg5;
        class146.field2456 = arg2;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([II[III)V", line = 147)
    public static final void method1589(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        if (arg4 != 1) {
            method1589((int[]) null, 25, (int[]) null, 87, -93);
        }
        field3511++;
        if (arg3 >= arg1) {
            return;
        }
        int var5 = (arg3 + arg1) / 2;
        int var6 = arg3;
        int var7 = arg0[var5];
        arg0[var5] = arg0[arg1];
        arg0[arg1] = var7;
        int var8 = arg2[var5];
        arg2[var5] = arg2[arg1];
        arg2[arg1] = var8;
        for (int var9 = arg3; var9 < arg1; var9++) {
            if (((var9 & 0x1) + var7) < arg0[var9]) {
                int var10 = arg0[var9];
                arg0[var9] = arg0[var6];
                arg0[var6] = var10;
                int var11 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6++] = var11;
            }
        }
        arg0[arg1] = arg0[var6];
        arg0[var6] = var7;
        arg2[arg1] = arg2[var6];
        arg2[var6] = var8;
        method1589(arg0, var6 - 1, arg2, arg3, arg4);
        method1589(arg0, arg1, arg2, var6 + 1, 1);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 203)
    public final void method490(int arg0) {
        if (arg0 >= -26) {
            field3508 = false;
        }
        field3513++;
        for (int var2 = 0; var2 < 10; var2++) {
            this.field3503[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)I", line = 229)
    public static final int method1590(int arg0, int arg1) {
        if (arg1 != -16499) {
            field3512 = true;
        }
        field3506++;
        return arg0 & 0xFF;
    }
}
