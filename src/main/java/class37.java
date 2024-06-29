import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public abstract class class37 extends class31 implements Runnable {

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "[I")
    private int[] field777 = new int[512];

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "Z")
    private boolean field780 = false;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    private int field781 = 0;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    private int field783 = 0;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    private int field786 = 256;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    private int field776 = 0;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    private int field785 = 0;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "J")
    private long field778 = 0L;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    private int field774;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    private int field784;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    private int field787;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "J")
    private long field775;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "J")
    private long field782;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "[I")
    public static int[] field779;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public abstract void method260(int arg0) throws Exception;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(J)V")
    private final void method261(long arg0) {
        if (this.field778 != 0L) {
            while (true) {
                if (this.field782 >= arg0) {
                    if (arg0 < this.field778) {
                        return;
                    }
                    try {
                        this.method269(arg0);
                    } catch (Exception var8) {
                        this.method264();
                        this.field778 += 5000L;
                        return;
                    }
                    this.field778 = 0L;
                    break;
                }
                class31.method230(256, 0);
                this.field782 += 256000 / class52.field1106;
            }
        }
        while (this.field782 < arg0) {
            this.field782 += 250880 / class52.field1106;
            int var3;
            try {
                var3 = this.method262();
            } catch (Exception var6) {
                this.method264();
                this.field778 = arg0;
                return;
            }
            this.method263(var3);
            int var4 = this.field785 * 3 / 512 - this.field781 * 2;
            if (var4 < 0) {
                var4 = 0;
            } else if (var4 > this.field783) {
                var4 = this.field783;
            }
            this.field786 = this.field784 - var4 - 256;
            if (this.field786 < 256) {
                this.field786 = 256;
            }
            if (this.field784 < 16384) {
                if (var3 >= this.field784) {
                    this.field774 += 5;
                    if (this.field774 >= 100) {
                        this.method264();
                        this.field784 += 2048;
                        this.field778 = arg0;
                        return;
                    }
                } else if (this.field787 != var3 && this.field774 > 0) {
                    this.field774--;
                }
            }
            this.field787 = var3;
            if (var3 < this.field786) {
                break;
            }
            class31.method228(field779, 256);
            try {
                this.method268();
            } catch (Exception var7) {
                this.method264();
                this.field778 = arg0;
                return;
            }
            this.field775 = arg0;
            this.field787 -= 256;
        }
        if (arg0 < this.field775 + 5000L) {
            return;
        }
        this.method264();
        this.field778 = arg0;
        for (int var5 = 0; var5 < 512; var5++) {
            this.field777[var5] = 0;
        }
        this.field781 = this.field783 = this.field785 = 0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "()V")
    public final void method229() {
        synchronized (this) {
            this.field780 = true;
        }
        while (true) {
            synchronized (this) {
                if (!this.field780) {
                    break;
                }
            }
            class141.method1122(17525, 50L);
        }
        field779 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(J)V")
    public final synchronized void method226(long arg0) {
        this.method261(arg0);
        if (this.field782 < arg0) {
            this.field782 = arg0;
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "()I")
    public abstract int method262() throws Exception;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
    private final void method263(int arg0) {
        int var2 = arg0 - this.field786;
        int var3 = this.field777[this.field776];
        this.field777[this.field776] = var2;
        this.field785 += var2 - var3;
        int var4 = this.field776 + 1 & 0x1FF;
        if (var2 > this.field783) {
            this.field783 = var2;
        }
        if (var2 < this.field781) {
            this.field781 = var2;
        }
        if (this.field783 == var3) {
            int var5 = var2;
            for (int var6 = var4; this.field776 != var6 && var5 < this.field783; var6 = var6 + 1 & 0x1FF) {
                int var7 = this.field777[var6];
                if (var7 > var5) {
                    var5 = var7;
                }
            }
            this.field783 = var5;
        }
        if (this.field781 == var3) {
            int var8 = var2;
            for (int var9 = var4; this.field776 != var9 && var8 > this.field781; var9 = var9 + 1 & 0x1FF) {
                int var10 = this.field777[var9];
                if (var10 < var8) {
                    var8 = var10;
                }
            }
            this.field781 = var8;
        }
        this.field776 = var4;
    }

    @OriginalMember(owner = "client!fa", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (this.field780) {
                        if (this.field778 == 0L) {
                            this.method264();
                        }
                        this.field780 = false;
                        return;
                    }
                    this.method226(class99.method747(0));
                }
                class141.method1122(17525, 5L);
            }
        } catch (Exception var6) {
            class121.method943((byte) -100, var6, null);
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "()V")
    public abstract void method264();

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "()V")
    public static void method265() {
        field779 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/awt/Component;IZ)V")
    public abstract void method266(Component arg0, int arg1, boolean arg2) throws Exception;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lg;I)V")
    public final void method267(class43 arg0, int arg1) throws Exception {
        this.field784 = arg1;
        this.method269(class99.method747(0));
        arg0.method309(10, (byte) -112, this);
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "()V")
    public abstract void method268() throws Exception;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(J)V")
    private final void method269(long arg0) throws Exception {
        this.method260(this.field784);
        while (true) {
            int var3 = this.method262();
            if (var3 < this.field786) {
                this.field774 = 0;
                this.field787 = 0;
                this.field782 = arg0;
                this.field775 = arg0;
                return;
            }
            this.method268();
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
    public class37() {
        int var1 = 256;
        if (class106.field2447) {
            var1 <<= 0x1;
        }
        field779 = new int[var1];
    }
}
