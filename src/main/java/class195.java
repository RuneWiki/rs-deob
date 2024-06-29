import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class195 extends class102 {

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "Lih;")
    private class32 field3032 = new class32();

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "Lih;")
    private class32 field3033 = new class32();

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
    private int field3034 = 0;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    private int field3035 = -1;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lcc;)V", line = 5)
    private final void method1308(class247 arg0) {
        arg0.method1006(-1024);
        arg0.method1702();
        class147 var2 = this.field3033.field541.field2296;
        if (this.field3033.field541 == var2) {
            this.field3035 = -1;
        } else {
            this.field3035 = ((class247) var2).field4043;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lqb;)V", line = 22)
    public final synchronized void method1309(class102 arg0) {
        this.field3032.method258(64, arg0);
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "([III)V", line = 29)
    public final synchronized void method427(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field3035 < 0) {
                this.method1312(arg0, arg1, arg2);
                return;
            }
            if (this.field3034 + arg2 < this.field3035) {
                this.field3034 += arg2;
                this.method1312(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field3035 - this.field3034;
            this.method1312(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field3034 += var4;
            this.method1310();
            class247 var5 = (class247) this.field3033.method264(-49);
            synchronized (var5) {
                int var7 = var5.method1701(this);
                if (var7 < 0) {
                    var5.field4043 = 0;
                    this.method1308(var5);
                } else {
                    var5.field4043 = var7;
                    this.method1314(var5.field2296, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "()V", line = 74)
    private final void method1310() {
        if (this.field3034 <= 0) {
            return;
        }
        for (class247 var1 = (class247) this.field3033.method264(-124); var1 != null; var1 = (class247) this.field3033.method263(4)) {
            var1.field4043 -= this.field3034;
        }
        this.field3035 -= this.field3034;
        this.field3034 = 0;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "()Lqb;", line = 91)
    public final class102 method448() {
        return (class102) this.field3032.method264(-89);
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V", line = 97)
    private final void method1311(int arg0) {
        for (class102 var2 = (class102) this.field3032.method264(-94); var2 != null; var2 = (class102) this.field3032.method263(4)) {
            var2.method443(arg0);
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "([III)V", line = 109)
    private final void method1312(int[] arg0, int arg1, int arg2) {
        for (class102 var4 = (class102) this.field3032.method264(-113); var4 != null; var4 = (class102) this.field3032.method263(4)) {
            var4.method742(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(Lqb;)V", line = 118)
    public final synchronized void method1313(class102 arg0) {
        arg0.method1006(-1024);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()I", line = 121)
    public final int method435() {
        return 0;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V", line = 132)
    public final synchronized void method443(int arg0) {
        do {
            if (this.field3035 < 0) {
                this.method1311(arg0);
                return;
            }
            if (this.field3034 + arg0 < this.field3035) {
                this.field3034 += arg0;
                this.method1311(arg0);
                return;
            }
            int var2 = this.field3035 - this.field3034;
            this.method1311(var2);
            arg0 -= var2;
            this.field3034 += var2;
            this.method1310();
            class247 var3 = (class247) this.field3033.method264(-20);
            synchronized (var3) {
                int var5 = var3.method1701(this);
                if (var5 < 0) {
                    var3.field4043 = 0;
                    this.method1308(var3);
                } else {
                    var3.field4043 = var5;
                    this.method1314(var3.field2296, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "()Lqb;", line = 188)
    public final class102 method470() {
        return (class102) this.field3032.method263(4);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lab;Lcc;)V", line = 195)
    private final void method1314(class147 arg0, class247 arg1) {
        while (this.field3033.field541 != arg0 && ((class247) arg0).field4043 <= arg1.field4043) {
            arg0 = arg0.field2296;
        }
        class150.method1020(arg1, arg0, -16);
        this.field3035 = ((class247) this.field3033.field541.field2296).field4043;
    }
}
