import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ACKKZISC")
public class class1 {

    @OriginalMember(owner = "client!ACKKZISC", name = "a", descriptor = "Z")
    private boolean field1 = true;

    @OriginalMember(owner = "client!ACKKZISC", name = "b", descriptor = "Z")
    private boolean field2 = false;

    @OriginalMember(owner = "client!ACKKZISC", name = "e", descriptor = "LHZZJZIMV;")
    private class21 field5 = new class21();

    @OriginalMember(owner = "client!ACKKZISC", name = "i", descriptor = "LJTFJPMGL;")
    private class28 field9 = new class28(-120);

    @OriginalMember(owner = "client!ACKKZISC", name = "f", descriptor = "I")
    private int field6;

    @OriginalMember(owner = "client!ACKKZISC", name = "g", descriptor = "I")
    private int field7;

    @OriginalMember(owner = "client!ACKKZISC", name = "h", descriptor = "LSOYNUDRE;")
    private class53 field8;

    @OriginalMember(owner = "client!ACKKZISC", name = "c", descriptor = "I")
    private int field3;

    @OriginalMember(owner = "client!ACKKZISC", name = "d", descriptor = "I")
    private int field4;

    @OriginalMember(owner = "client!ACKKZISC", name = "<init>", descriptor = "(ZI)V")
    public class1(boolean arg0, int arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        this.field6 = arg1;
        this.field7 = arg1;
        this.field8 = new class53(1024, (byte) 34);
    }

    @OriginalMember(owner = "client!ACKKZISC", name = "a", descriptor = "(J)LHZZJZIMV;")
    public class21 method1(long arg0) {
        class21 var3 = (class21) this.field8.method440(arg0);
        if (var3 == null) {
            this.field3++;
        } else {
            this.field9.method270(var3);
            this.field4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ACKKZISC", name = "a", descriptor = "(IJLHZZJZIMV;)V")
    public void method2(int arg0, long arg1, class21 arg2) {
        if (this.field7 == 0) {
            class21 var5 = this.field9.method271();
            var5.method20();
            var5.method213();
            if (this.field5 == var5) {
                class21 var6 = this.field9.method271();
                var6.method20();
                var6.method213();
            }
        } else {
            this.field7--;
        }
        this.field8.method441(false, arg2, arg1);
        this.field9.method270(arg2);
        if (arg0 != 0) {
            this.field2 = !this.field2;
        }
    }

    @OriginalMember(owner = "client!ACKKZISC", name = "a", descriptor = "()V")
    public void method3() {
        while (true) {
            class21 var1 = this.field9.method271();
            if (var1 == null) {
                this.field7 = this.field6;
                return;
            }
            var1.method20();
            var1.method213();
        }
    }
}
