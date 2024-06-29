import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class144 extends class124 {

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "Lm;")
    private class83 field3158 = new class83();

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "Lm;")
    private class83 field3159 = new class83();

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    private int field3161 = -1;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    private int field3160 = 0;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lrf;)V")
    public final synchronized void method1076(class124 arg0) {
        this.field3158.method679(true, arg0);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
    public final synchronized void method474(int arg0) {
        do {
            if (this.field3161 < 0) {
                this.method1078(arg0);
                return;
            }
            if (this.field3160 + arg0 < this.field3161) {
                this.field3160 += arg0;
                this.method1078(arg0);
                return;
            }
            int var2 = this.field3161 - this.field3160;
            this.method1078(var2);
            arg0 -= var2;
            this.field3160 += var2;
            this.method1082();
            class93 var3 = (class93) this.field3159.method682(0);
            synchronized (var3) {
                int var5 = var3.method778(this);
                if (var5 < 0) {
                    var3.field2392 = 0;
                    this.method1080(var3);
                } else {
                    var3.field2392 = var5;
                    this.method1077(var3.field2733, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lqe;Lnc;)V")
    private final void method1077(class116 arg0, class93 arg1) {
        while (this.field3159.field2061 != arg0 && ((class93) arg0).field2392 <= arg1.field2392) {
            arg0 = arg0.field2733;
        }
        this.field3159.method685(17488, arg0, arg1);
        this.field3161 = ((class93) this.field3159.field2061.field2733).field2392;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "()Lrf;")
    public final class124 method467() {
        return (class124) this.field3158.method684((byte) -65);
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
    private final void method1078(int arg0) {
        for (class124 var2 = (class124) this.field3158.method682(0); var2 != null; var2 = (class124) this.field3158.method684((byte) -65)) {
            var2.method474(arg0);
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "([III)V")
    private final void method1079(int[] arg0, int arg1, int arg2) {
        for (class124 var4 = (class124) this.field3158.method682(0); var4 != null; var4 = (class124) this.field3158.method684((byte) -65)) {
            var4.method946(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "()Lrf;")
    public final class124 method470() {
        return (class124) this.field3158.method682(0);
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "()I")
    public final int method483() {
        return 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lnc;)V")
    private final void method1080(class93 arg0) {
        arg0.method929(98);
        arg0.method779();
        class116 var2 = this.field3159.field2061.field2733;
        if (this.field3159.field2061 == var2) {
            this.field3161 = -1;
        } else {
            this.field3161 = ((class93) var2).field2392;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "([III)V")
    public final synchronized void method495(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3161 < 0) {
                this.method1079(arg0, arg1, arg2);
                return;
            }
            if (this.field3160 + arg2 < this.field3161) {
                this.field3160 += arg2;
                this.method1079(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3161 - this.field3160;
            this.method1079(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3160 += var4;
            this.method1082();
            class93 var5 = (class93) this.field3159.method682(0);
            synchronized (var5) {
                int var7 = var5.method778(this);
                if (var7 < 0) {
                    var5.field2392 = 0;
                    this.method1080(var5);
                } else {
                    var5.field2392 = var7;
                    this.method1077(var5.field2733, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(Lrf;)V")
    public final synchronized void method1081(class124 arg0) {
        arg0.method929(105);
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "()V")
    private final void method1082() {
        if (this.field3160 <= 0) {
            return;
        }
        for (class93 var1 = (class93) this.field3159.method682(0); var1 != null; var1 = (class93) this.field3159.method684((byte) -65)) {
            var1.field2392 -= this.field3160;
        }
        this.field3161 -= this.field3160;
        this.field3160 = 0;
    }
}
