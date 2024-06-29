import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class117 implements Runnable {

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "[I")
    private int[] field1606 = new int[3];

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "[Lwh;")
    private class40[] field1611 = new class40[8];

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "Z")
    private volatile boolean field1612 = true;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "Z")
    private volatile boolean field1604 = true;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Z")
    private volatile boolean field1608 = false;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    private int field1607;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "Lha;")
    private class543 field1605;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "J")
    private long field1610;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "Lre;")
    private class277 field1609;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "()V")
    private final void method824() {
        this.field1605.method383(this.field1607);
        while (!this.field1612 && this.field1604) {
            if (this.field1609 == null || this.field1609.method1786(1)) {
                this.field1608 = false;
                this.field1610 = class127.field1759.method583(83);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field1608 = true;
                class113 var1 = this.field1609.method1789(4196);
                if (var1 instanceof class280) {
                    class280 var2 = (class280) var1;
                    if (var2.field3921) {
                        var2.method610((byte) 74, class391.field5644);
                    } else {
                        class264.method1746(var2, this.field1611);
                        if (class716.field10110 != null) {
                            class716.field10110.method2433(-16777216, -256, var2.field3919, 0, this.field1609.field3887, var2.field3925);
                        }
                    }
                } else {
                    int var3 = ((class372) var1).field5402;
                    if (var3 >= 1 && var3 <= 4) {
                        class339 var4 = class95.field1372[var3 - 1];
                        for (int var5 = 0; var5 < class430.field6190 + class430.field6190; var5++) {
                            for (int var6 = 0; var6 < class430.field6190 + class430.field6190; var6++) {
                                if (class35.field315[var3 - 1][var5][var6]) {
                                    int var7 = class613.field8757 + var5 - class430.field6190;
                                    int var8 = class140.field1915 + var6 - class430.field6190;
                                    if (var7 >= 0 && var7 < var4.field4679 && var8 >= 0 && var8 < var4.field4672) {
                                        class391.field5644.method402(var7 << class639.field9095, var4.method2087(80, var7, var8), var8 << class639.field9095, this.field1606);
                                        if (class131.method923(this.field1606[0]) == this.field1607 - 1) {
                                            var4.method33(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field1605.method251(this.field1607);
        while (this.field1612 && this.field1604) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "()V")
    public final void method825() {
        this.field1612 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "()J")
    public final long method826() {
        return this.field1610;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lre;)V")
    public final void method827(class277 arg0) {
        if (this.field1609 != null) {
            this.field1609.method1784(null, -200);
        }
        this.field1609 = arg0;
        if (this.field1609 != null) {
            this.field1609.method1784(this, -200);
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "()V")
    public final void method828() {
        this.field1612 = false;
        this.field1604 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "()V")
    public final void method829() {
        this.field1612 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "()Z")
    public final boolean method830() {
        return this.field1609 == null || !this.field1608 && this.field1609.method1786(1);
    }

    @OriginalMember(owner = "client!bi", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field1604) {
            this.method824();
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(ILha;)V")
    public class117(int arg0, class543 arg1) {
        this.field1607 = arg0;
        this.field1605 = arg1;
    }
}
