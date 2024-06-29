import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class class126 extends class101 implements Runnable {

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    private int field2725 = 256;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
    private int field2728 = 0;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    private int field2718 = 0;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "[I")
    private int[] field2722 = new int[512];

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "J")
    private long field2726 = 0L;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "Z")
    private boolean field2724 = false;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    private int field2721 = 0;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    private int field2723 = 0;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "[I")
    public static int[] field2729 = new int[256];

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "I")
    private int field2717;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "I")
    private int field2727;

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
    private int field2730;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "J")
    private long field2719;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "J")
    private long field2720;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "()V")
    public static void method926() {
        field2729 = null;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(J)V")
    private final void method927(long arg0) {
        if (this.field2726 != 0L) {
            while (true) {
                if (this.field2719 >= arg0) {
                    if (arg0 < this.field2726) {
                        return;
                    }
                    try {
                        this.method928(arg0);
                    } catch (Exception var8) {
                        this.method45();
                        this.field2726 += 5000L;
                        return;
                    }
                    this.field2726 = 0L;
                    break;
                }
                class101.method769(256, (byte) 107);
                this.field2719 += 256000 / class35.field710;
            }
        }
        while (this.field2719 < arg0) {
            this.field2719 += 250880 / class35.field710;
            int var3;
            try {
                var3 = this.method42();
            } catch (Exception var6) {
                this.method45();
                this.field2726 = arg0;
                return;
            }
            this.method930(var3);
            int var4 = this.field2728 * 3 / 512 - this.field2723 * 2;
            if (var4 < 0) {
                var4 = 0;
            } else if (var4 > this.field2718) {
                var4 = this.field2718;
            }
            this.field2725 = this.field2717 - var4 - 256;
            if (this.field2725 < 256) {
                this.field2725 = 256;
            }
            if (this.field2717 < 16384) {
                if (var3 >= this.field2717) {
                    this.field2730 += 5;
                    if (this.field2730 >= 100) {
                        this.method45();
                        this.field2717 += 2048;
                        this.field2726 = arg0;
                        return;
                    }
                } else if (this.field2727 != var3 && this.field2730 > 0) {
                    this.field2730--;
                }
            }
            this.field2727 = var3;
            if (var3 < this.field2725) {
                break;
            }
            class101.method765(field2729, 256);
            try {
                this.method43();
            } catch (Exception var7) {
                this.method45();
                this.field2726 = arg0;
                return;
            }
            this.field2720 = arg0;
            this.field2727 -= 256;
        }
        if (arg0 < this.field2720 + 5000L) {
            return;
        }
        this.method45();
        this.field2726 = arg0;
        for (int var5 = 0; var5 < 512; var5++) {
            this.field2722[var5] = 0;
        }
        this.field2723 = this.field2718 = this.field2728 = 0;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(J)V")
    private final void method928(long arg0) throws Exception {
        this.method44(this.field2717);
        while (true) {
            int var3 = this.method42();
            if (var3 < this.field2725) {
                this.field2730 = 0;
                this.field2727 = 0;
                this.field2719 = arg0;
                this.field2720 = arg0;
                return;
            }
            this.method43();
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(J)V")
    public final synchronized void method767(long arg0) {
        this.method927(arg0);
        if (this.field2719 < arg0) {
            this.field2719 = arg0;
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "()I")
    public abstract int method42() throws Exception;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lqd;I)V")
    public final void method929(class99 arg0, int arg1) throws Exception {
        this.field2717 = arg1;
        this.method928(System.currentTimeMillis());
        arg0.method751(10, this, 116);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "()V")
    public final void method766() {
        synchronized (this) {
            this.field2724 = true;
        }
        while (true) {
            synchronized (this) {
                if (!this.field2724) {
                    return;
                }
            }
            class108.method814((byte) 15, 50L);
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    public abstract void method44(int arg0) throws Exception;

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V")
    public class126(int arg0) throws Exception {
        super(arg0);
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "()V")
    public abstract void method43() throws Exception;

    @OriginalMember(owner = "client!wa", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (this.field2724) {
                        if (this.field2726 == 0L) {
                            this.method45();
                        }
                        this.field2724 = false;
                        return;
                    }
                    this.method767(System.currentTimeMillis());
                }
                class108.method814((byte) 15, 5L);
            }
        } catch (Exception var6) {
            class70.method499(null, var6, 40);
        }
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "()V")
    public abstract void method45();

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
    private final void method930(int arg0) {
        int var2 = arg0 - this.field2725;
        int var3 = this.field2722[this.field2721];
        this.field2722[this.field2721] = var2;
        this.field2728 += var2 - var3;
        int var4 = this.field2721 + 1 & 0x1FF;
        if (var2 > this.field2718) {
            this.field2718 = var2;
        }
        if (var2 < this.field2723) {
            this.field2723 = var2;
        }
        if (this.field2718 == var3) {
            int var5 = var2;
            for (int var6 = var4; this.field2721 != var6 && var5 < this.field2718; var6 = var6 + 1 & 0x1FF) {
                int var7 = this.field2722[var6];
                if (var7 > var5) {
                    var5 = var7;
                }
            }
            this.field2718 = var5;
        }
        if (this.field2723 == var3) {
            int var8 = var2;
            for (int var9 = var4; this.field2721 != var9 && var8 > this.field2723; var9 = var9 + 1 & 0x1FF) {
                int var10 = this.field2722[var9];
                if (var10 < var8) {
                    var8 = var10;
                }
            }
            this.field2723 = var8;
        }
        this.field2721 = var4;
    }
}
