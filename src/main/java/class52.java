import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class52 {

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "Lgg;")
    private class114 field768 = new class114(64);

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "Lkha;")
    private class687 field765;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
    public static int field764 = 0;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIILpda;Lpda;)V", line = 4)
    public static final void method428(int arg0, int arg1, int arg2, class149 arg3, class149 arg4) {
        class73 var5 = class663.method3590(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field964 = arg3;
        var5.field971 = arg4;
        int var6 = class517.field7282 == class109.field1341 ? 1 : 0;
        if (!arg3.method265((byte) -87)) {
            arg3.field5793 = class293.field3797[var6];
            class293.field3797[var6] = arg3;
        } else if (arg3.method256((byte) 83)) {
            arg3.field5793 = class466.field6722[var6];
            class466.field6722[var6] = arg3;
        } else {
            arg3.field5793 = class684.field9445[var6];
            class684.field9445[var6] = arg3;
            class571.field7967 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method265((byte) -13)) {
            if (arg4.method256((byte) -100)) {
                arg4.field5793 = class466.field6722[var6];
                class466.field6722[var6] = arg4;
                return;
            }
            arg4.field5793 = class684.field9445[var6];
            class684.field9445[var6] = arg4;
            class571.field7967 = true;
            return;
        }
        arg4.field5793 = class293.field3797[var6];
        class293.field3797[var6] = arg4;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(BI)Lui;", line = 62)
    public final class530 method429(byte arg0, int arg1) {
        field771++;
        class114 var3 = this.field768;
        class530 var4;
        synchronized (this.field768) {
            var4 = (class530) this.field768.method778((long) arg1, -109);
        }
        if (var4 != null) {
            return var4;
        }
        class687 var5 = this.field765;
        byte[] var6;
        synchronized (this.field765) {
            var6 = this.field765.method3810(31, arg0 - 23457, arg1);
        }
        class530 var7 = new class530();
        if (var6 != null) {
            var7.method3030(0, new class179(var6));
        }
        class114 var8 = this.field768;
        synchronized (this.field768) {
            this.field768.method774((long) arg1, 78, var7);
        }
        if (arg0 != 97) {
            this.method432(-96, -42);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V", line = 96)
    public final void method430(byte arg0) {
        if (arg0 > -22) {
            return;
        }
        field769++;
        class114 var2 = this.field768;
        synchronized (this.field768) {
            this.field768.method781((byte) 47);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II[Ljava/awt/Rectangle;)V", line = 110)
    public static final void method431(int arg0, int arg1, Rectangle[] arg2) throws class510 {
        if (class709.field9973 == 1) {
            class422.field5998.method122(arg2, arg0, class314.field4027, class437.field6143);
        } else {
            class422.field5998.method122(arg2, arg0, 0, 0);
        }
        if (arg1 != -23405) {
            field764 = -125;
        }
        field770++;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(II)V", line = 127)
    public final void method432(int arg0, int arg1) {
        class114 var3 = this.field768;
        synchronized (this.field768) {
            this.field768.method775(1, arg0);
            if (arg1 > -77) {
                method428(-128, 93, 56, null, null);
            }
        }
        field766++;
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(B)V", line = 147)
    public final void method433(byte arg0) {
        field772++;
        class114 var2 = this.field768;
        synchronized (this.field768) {
            this.field768.method776((byte) 87);
            if (arg0 < 103) {
                this.field768 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Ldh;ILkha;)V", line = 164)
    public class52(class286 arg0, int arg1, class687 arg2) {
        this.field765 = arg2;
        this.field765.method3812(0, 31);
    }
}
