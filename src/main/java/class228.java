import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class228 extends class238 {

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "Loa;")
    private class262 field3872 = new class262();

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "Loa;")
    private class262 field3873 = new class262();

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    private int field3875 = 0;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "I")
    private int field3874 = -1;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
    private final void method1549(int arg0) {
        for (class238 var2 = (class238) this.field3872.method1811(2); var2 != null; var2 = (class238) this.field3872.method1810(false)) {
            var2.method235(arg0);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()I")
    public final int method224() {
        return 0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lck;)V")
    public final synchronized void method1550(class238 arg0) {
        arg0.method1743((byte) 61);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lh;Ltc;)V")
    private final void method1551(class249 arg0, class129 arg1) {
        while (this.field3873.field4593 != arg0 && ((class129) arg0).field2343 <= arg1.field2343) {
            arg0 = arg0.field4307;
        }
        class252.method1757(arg0, (byte) 122, arg1);
        this.field3874 = ((class129) this.field3873.field4593.field4307).field2343;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([III)V")
    public final synchronized void method255(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3874 < 0) {
                this.method1552(arg0, arg1, arg2);
                return;
            }
            if (this.field3875 + arg2 < this.field3874) {
                this.field3875 += arg2;
                this.method1552(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3874 - this.field3875;
            this.method1552(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3875 += var4;
            this.method1553();
            class129 var5 = (class129) this.field3873.method1811(2);
            synchronized (var5) {
                int var7 = var5.method981(this);
                if (var7 < 0) {
                    var5.field2343 = 0;
                    this.method1555(var5);
                } else {
                    var5.field2343 = var7;
                    this.method1551(var5.field4307, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "([III)V")
    private final void method1552(int[] arg0, int arg1, int arg2) {
        for (class238 var4 = (class238) this.field3872.method1811(2); var4 != null; var4 = (class238) this.field3872.method1810(false)) {
            var4.method1615(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "()V")
    private final void method1553() {
        if (this.field3875 <= 0) {
            return;
        }
        for (class129 var1 = (class129) this.field3873.method1811(2); var1 != null; var1 = (class129) this.field3873.method1810(false)) {
            var1.field2343 -= this.field3875;
        }
        this.field3874 -= this.field3875;
        this.field3875 = 0;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
    public final synchronized void method235(int arg0) {
        do {
            if (this.field3874 < 0) {
                this.method1549(arg0);
                return;
            }
            if (this.field3875 + arg0 < this.field3874) {
                this.field3875 += arg0;
                this.method1549(arg0);
                return;
            }
            int var2 = this.field3874 - this.field3875;
            this.method1549(var2);
            arg0 -= var2;
            this.field3875 += var2;
            this.method1553();
            class129 var3 = (class129) this.field3873.method1811(2);
            synchronized (var3) {
                int var5 = var3.method981(this);
                if (var5 < 0) {
                    var3.field2343 = 0;
                    this.method1555(var3);
                } else {
                    var3.field2343 = var5;
                    this.method1551(var3.field4307, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(Lck;)V")
    public final synchronized void method1554(class238 arg0) {
        this.field3872.method1819(-9166, arg0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ltc;)V")
    private final void method1555(class129 arg0) {
        arg0.method1743((byte) 55);
        arg0.method980();
        class249 var2 = this.field3873.field4593.field4307;
        if (this.field3873.field4593 == var2) {
            this.field3874 = -1;
        } else {
            this.field3874 = ((class129) var2).field2343;
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "()Lck;")
    public final class238 method237() {
        return (class238) this.field3872.method1811(2);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "()Lck;")
    public final class238 method225() {
        return (class238) this.field3872.method1810(false);
    }
}
