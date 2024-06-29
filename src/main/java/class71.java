import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class71 extends class104 {

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "Lvh;")
    private class252 field1137 = new class252();

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "Lvh;")
    private class252 field1138 = new class252();

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
    private int field1140 = 0;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    private int field1139 = -1;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "([III)V")
    private final void method487(int[] arg0, int arg1, int arg2) {
        for (class104 var4 = (class104) this.field1137.method1720(true); var4 != null; var4 = (class104) this.field1137.method1712((byte) 112)) {
            var4.method751(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lth;)V")
    public final synchronized void method488(class104 arg0) {
        arg0.method764((byte) -110);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lce;)V")
    private final void method489(class200 arg0) {
        arg0.method764((byte) -24);
        arg0.method1399();
        class107 var2 = this.field1138.field4423.field1770;
        if (this.field1138.field4423 == var2) {
            this.field1139 = -1;
        } else {
            this.field1139 = ((class200) var2).field3350;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "()Lth;")
    public final class104 method490() {
        return (class104) this.field1137.method1712((byte) 112);
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "()I")
    public final int method491() {
        return 0;
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "()V")
    private final void method492() {
        if (this.field1140 <= 0) {
            return;
        }
        for (class200 var1 = (class200) this.field1138.method1720(true); var1 != null; var1 = (class200) this.field1138.method1712((byte) 112)) {
            var1.field3350 -= this.field1140;
        }
        this.field1139 -= this.field1140;
        this.field1140 = 0;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "()Lth;")
    public final class104 method493() {
        return (class104) this.field1137.method1720(true);
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
    private final void method494(int arg0) {
        for (class104 var2 = (class104) this.field1137.method1720(true); var2 != null; var2 = (class104) this.field1137.method1712((byte) 112)) {
            var2.method496(arg0);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(Lth;)V")
    public final synchronized void method495(class104 arg0) {
        this.field1137.method1711((byte) 79, arg0);
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
    public final synchronized void method496(int arg0) {
        do {
            if (this.field1139 < 0) {
                this.method494(arg0);
                return;
            }
            if (this.field1140 + arg0 < this.field1139) {
                this.field1140 += arg0;
                this.method494(arg0);
                return;
            }
            int var2 = this.field1139 - this.field1140;
            this.method494(var2);
            arg0 -= var2;
            this.field1140 += var2;
            this.method492();
            class200 var3 = (class200) this.field1138.method1720(true);
            synchronized (var3) {
                int var5 = var3.method1398(this);
                if (var5 < 0) {
                    var3.field3350 = 0;
                    this.method489(var3);
                } else {
                    var3.field3350 = var5;
                    this.method497(var3.field1770, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lvj;Lce;)V")
    private final void method497(class107 arg0, class200 arg1) {
        while (this.field1138.field4423 != arg0 && ((class200) arg0).field3350 <= arg1.field3350) {
            arg0 = arg0.field1770;
        }
        class157.method1121(-116, arg0, arg1);
        this.field1139 = ((class200) this.field1138.field4423.field1770).field3350;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([III)V")
    public final synchronized void method498(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1139 < 0) {
                this.method487(arg0, arg1, arg2);
                return;
            }
            if (this.field1140 + arg2 < this.field1139) {
                this.field1140 += arg2;
                this.method487(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1139 - this.field1140;
            this.method487(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1140 += var4;
            this.method492();
            class200 var5 = (class200) this.field1138.method1720(true);
            synchronized (var5) {
                int var7 = var5.method1398(this);
                if (var7 < 0) {
                    var5.field3350 = 0;
                    this.method489(var5);
                } else {
                    var5.field3350 = var7;
                    this.method497(var5.field1770, var5);
                }
            }
        } while (arg2 != 0);
    }
}
