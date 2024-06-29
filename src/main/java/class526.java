import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class526 implements Runnable {

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Z")
    private volatile boolean field7683 = true;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "Z")
    private volatile boolean field7682 = true;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Z")
    private volatile boolean field7686 = false;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "[Lcp;")
    private class674[] field7688 = new class674[8];

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "[I")
    private int[] field7687 = new int[3];

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    private int field7690;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "Lr;")
    private class167 field7685;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "J")
    private long field7684;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "Ltb;")
    private class367 field7689;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "()V")
    public final void method3186() {
        this.field7683 = false;
        this.field7682 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "()V")
    private final void method3187() {
        this.field7685.method293(this.field7690);
        while (!this.field7683 && this.field7682) {
            if (this.field7689 == null || this.field7689.method2432(-119)) {
                this.field7686 = false;
                this.field7684 = class390.field6049.method2907(-22760);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field7686 = true;
                class416 var1 = this.field7689.method2428(-4634);
                if (var1 instanceof class692) {
                    class692 var2 = (class692) var1;
                    if (var2.field9698) {
                        var2.method412(class595.field8435, false);
                    } else {
                        class401.method2578(var2, this.field7688);
                        if (class65.field841 != null) {
                            class65.field841.method2657(this.field7689.field5748, -16777216, var2.field9700, -256, var2.field9704, (byte) -117);
                        }
                    }
                } else {
                    int var3 = ((class641) var1).field8994;
                    if (var3 >= 1 && var3 <= 4) {
                        class37 var4 = class587.field8346[var3 - 1];
                        for (int var5 = 0; var5 < class443.field6744 + class443.field6744; var5++) {
                            for (int var6 = 0; var6 < class443.field6744 + class443.field6744; var6++) {
                                if (class299.field4678[var3 - 1][var5][var6]) {
                                    int var7 = class325.field5056 + var5 - class443.field6744;
                                    int var8 = class542.field7902 + var6 - class443.field6744;
                                    if (var7 >= 0 && var7 < var4.field510 && var8 >= 0 && var8 < var4.field513) {
                                        class595.field8435.method330(var7 << class439.field6699, var4.method479(var8, var7, -105), var8 << class439.field6699, this.field7687);
                                        if (class644.method3732(this.field7687[0]) == this.field7690 - 1) {
                                            var4.method489(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field7685.method341(this.field7690);
        while (this.field7683 && this.field7682) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "()Z")
    public final boolean method3188() {
        return this.field7689 == null || !this.field7686 && this.field7689.method2432(-119);
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "()J")
    public final long method3189() {
        return this.field7684;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Ltb;)V")
    public final void method3190(class367 arg0) {
        if (this.field7689 != null) {
            this.field7689.method2431(-42, null);
        }
        this.field7689 = arg0;
        if (this.field7689 != null) {
            this.field7689.method2431(-119, this);
        }
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "()V")
    public final void method3191() {
        this.field7683 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!kj", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field7682) {
            this.method3187();
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(ILr;)V")
    public class526(int arg0, class167 arg1) {
        this.field7690 = arg0;
        this.field7685 = arg1;
    }

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "()V")
    public final void method3192() {
        this.field7683 = true;
        synchronized (this) {
            this.notify();
        }
    }
}
