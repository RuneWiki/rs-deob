import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class108 extends class344 {

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "Lum;")
    private class347 field1437 = new class347();

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "Lum;")
    private class347 field1438 = new class347();

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    private int field1440 = 0;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
    private int field1439 = -1;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lcb;)V")
    public final synchronized void method640(class344 arg0) {
        this.field1437.method2092(-118, arg0);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lcg;Lod;)V")
    private final void method641(class86 arg0, class333 arg1) {
        while (this.field1438.field5018 != arg0 && ((class333) arg0).field4836 <= arg1.field4836) {
            arg0 = arg0.field1179;
        }
        class52.method385(0, arg1, arg0);
        this.field1439 = ((class333) this.field1438.field5018.field1179).field4836;
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "()Lcb;")
    public final class344 method642() {
        return (class344) this.field1437.method2096(-21400);
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(Lcb;)V")
    public final synchronized void method643(class344 arg0) {
        arg0.method536(false);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "()I")
    public final int method644() {
        return 0;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "()Lcb;")
    public final class344 method645() {
        return (class344) this.field1437.method2084((byte) 19);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lod;)V")
    private final void method646(class333 arg0) {
        arg0.method536(false);
        arg0.method2015();
        class86 var2 = this.field1438.field5018.field1179;
        if (this.field1438.field5018 == var2) {
            this.field1439 = -1;
        } else {
            this.field1439 = ((class333) var2).field4836;
        }
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "()I")
    public final synchronized int method647() {
        return this.field1437.method2085(-18021);
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "([III)V")
    private final void method648(int[] arg0, int arg1, int arg2) {
        for (class344 var4 = (class344) this.field1437.method2096(-21400); var4 != null; var4 = (class344) this.field1437.method2084((byte) 19)) {
            var4.method2076(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V")
    private final void method649(int arg0) {
        for (class344 var2 = (class344) this.field1437.method2096(-21400); var2 != null; var2 = (class344) this.field1437.method2084((byte) 19)) {
            var2.method650(arg0);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public final synchronized void method650(int arg0) {
        do {
            if (this.field1439 < 0) {
                this.method649(arg0);
                return;
            }
            if (this.field1440 + arg0 < this.field1439) {
                this.field1440 += arg0;
                this.method649(arg0);
                return;
            }
            int var2 = this.field1439 - this.field1440;
            this.method649(var2);
            arg0 -= var2;
            this.field1440 += var2;
            this.method652();
            class333 var3 = (class333) this.field1438.method2096(-21400);
            synchronized (var3) {
                int var5 = var3.method2014(this);
                if (var5 < 0) {
                    var3.field4836 = 0;
                    this.method646(var3);
                } else {
                    var3.field4836 = var5;
                    this.method641(var3.field1179, var3);
                }
            }
        } while (arg0 != 0);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([III)V")
    public final synchronized void method651(int[] arg0, int arg1, int arg2) {
        do {
            if (this.field1439 < 0) {
                this.method648(arg0, arg1, arg2);
                return;
            }
            if (this.field1440 + arg2 < this.field1439) {
                this.field1440 += arg2;
                this.method648(arg0, arg1, arg2);
                return;
            }
            int var4 = this.field1439 - this.field1440;
            this.method648(arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
            this.field1440 += var4;
            this.method652();
            class333 var5 = (class333) this.field1438.method2096(-21400);
            synchronized (var5) {
                int var7 = var5.method2014(this);
                if (var7 < 0) {
                    var5.field4836 = 0;
                    this.method646(var5);
                } else {
                    var5.field4836 = var7;
                    this.method641(var5.field1179, var5);
                }
            }
        } while (arg2 != 0);
    }

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "()V")
    private final void method652() {
        if (this.field1440 <= 0) {
            return;
        }
        for (class333 var1 = (class333) this.field1438.method2096(-21400); var1 != null; var1 = (class333) this.field1438.method2084((byte) 19)) {
            var1.field4836 -= this.field1440;
        }
        this.field1439 -= this.field1440;
        this.field1440 = 0;
    }
}
