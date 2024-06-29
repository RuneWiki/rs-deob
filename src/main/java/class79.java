import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class79 extends class35 implements Runnable {

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    private int field1773 = 256;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "[I")
    private int[] field1772 = new int[512];

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    private int field1777 = 0;

    @OriginalMember(owner = "client!na", name = "A", descriptor = "Z")
    private boolean field1779 = false;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "I")
    private int field1781 = 0;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "I")
    private int field1780 = 0;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    private int field1782 = 0;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "J")
    private long field1784 = 0L;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "[I")
    public static int[] field1774 = new int[256];

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    private int field1775;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    private int field1776;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "I")
    private int field1783;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "J")
    private long field1778;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "J")
    private long field1785;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "()V", line = 3)
    public static void method679() {
        field1774 = null;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(J)V", line = 7)
    private final void method680(long arg0) throws Exception {
        this.method44(this.field1775);
        while (true) {
            int var3 = this.method45();
            if (var3 < this.field1773) {
                this.field1783 = 0;
                this.field1776 = 0;
                this.field1785 = arg0;
                this.field1778 = arg0;
                return;
            }
            this.method47();
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I)V", line = 287)
    public class79(int arg0) throws Exception {
        super(arg0);
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(J)V", line = 35)
    private final void method681(long arg0) {
        if (this.field1784 != 0L) {
            while (true) {
                if (this.field1785 >= arg0) {
                    if (arg0 < this.field1784) {
                        return;
                    }
                    try {
                        this.method680(arg0);
                    } catch (Exception var8) {
                        this.method46();
                        this.field1784 += 5000L;
                        return;
                    }
                    this.field1784 = 0L;
                    break;
                }
                class35.method328((byte) -91, 256);
                this.field1785 += 256000 / class76.field1698;
            }
        }
        while (this.field1785 < arg0) {
            this.field1785 += 250880 / class76.field1698;
            int var3;
            try {
                var3 = this.method45();
            } catch (Exception var6) {
                this.method46();
                this.field1784 = arg0;
                return;
            }
            this.method683(var3);
            int var4 = this.field1780 * 3 / 512 - this.field1781 * 2;
            if (var4 < 0) {
                var4 = 0;
            } else if (var4 > this.field1782) {
                var4 = this.field1782;
            }
            this.field1773 = this.field1775 - var4 - 256;
            if (this.field1773 < 256) {
                this.field1773 = 256;
            }
            if (this.field1775 < 16384) {
                if (var3 >= this.field1775) {
                    this.field1783 += 5;
                    if (this.field1783 >= 100) {
                        this.method46();
                        this.field1775 += 2048;
                        this.field1784 = arg0;
                        return;
                    }
                } else if (this.field1776 != var3 && this.field1783 > 0) {
                    this.field1783--;
                }
            }
            this.field1776 = var3;
            if (var3 < this.field1773) {
                break;
            }
            class35.method332(field1774, 256);
            try {
                this.method47();
            } catch (Exception var7) {
                this.method46();
                this.field1784 = arg0;
                return;
            }
            this.field1778 = arg0;
            this.field1776 -= 256;
        }
        if (arg0 < this.field1778 + 5000L) {
            return;
        }
        this.method46();
        this.field1784 = arg0;
        for (int var5 = 0; var5 < 512; var5++) {
            this.field1772[var5] = 0;
        }
        this.field1781 = this.field1782 = this.field1780 = 0;
    }

    @OriginalMember(owner = "client!na", name = "run", descriptor = "()V", line = 155)
    public final void run() {
        try {
            while (true) {
                synchronized (this) {
                    if (this.field1779) {
                        if (this.field1784 == 0L) {
                            this.method46();
                        }
                        this.field1779 = false;
                        return;
                    }
                    this.method327(class1.method3(false));
                }
                class75.method634(5L, 20306);
            }
        } catch (Exception var6) {
            class19.method225(0, null, var6);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "()V", line = 190)
    public final void method114() {
        synchronized (this) {
            this.field1779 = true;
        }
        while (true) {
            synchronized (this) {
                if (!this.field1779) {
                    return;
                }
            }
            class75.method634(50L, 20306);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lfb;I)V", line = 215)
    public final void method682(class33 arg0, int arg1) throws Exception {
        this.field1775 = arg1;
        this.method680(class1.method3(false));
        arg0.method318(10, -102, this);
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V", line = 222)
    private final void method683(int arg0) {
        int var2 = arg0 - this.field1773;
        int var3 = this.field1772[this.field1777];
        this.field1772[this.field1777] = var2;
        this.field1780 += var2 - var3;
        int var4 = this.field1777 + 1 & 0x1FF;
        if (var2 > this.field1782) {
            this.field1782 = var2;
        }
        if (var2 < this.field1781) {
            this.field1781 = var2;
        }
        if (this.field1782 == var3) {
            int var5 = var2;
            for (int var6 = var4; this.field1777 != var6 && var5 < this.field1782; var6 = var6 + 1 & 0x1FF) {
                int var7 = this.field1772[var6];
                if (var7 > var5) {
                    var5 = var7;
                }
            }
            this.field1782 = var5;
        }
        if (this.field1781 == var3) {
            int var8 = var2;
            for (int var9 = var4; this.field1777 != var9 && var8 > this.field1781; var9 = var9 + 1 & 0x1FF) {
                int var10 = this.field1772[var9];
                if (var10 < var8) {
                    var8 = var10;
                }
            }
            this.field1781 = var8;
        }
        this.field1777 = var4;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(J)V", line = 281)
    public final synchronized void method327(long arg0) {
        this.method681(arg0);
        if (this.field1785 < arg0) {
            this.field1785 = arg0;
        }
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "()V")
    public abstract void method46();

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public abstract void method44(int arg0) throws Exception;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "()V")
    public abstract void method47() throws Exception;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "()I")
    public abstract int method45() throws Exception;
}
