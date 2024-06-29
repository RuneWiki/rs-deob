import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public abstract class class247 {

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lib;)V")
    public abstract void method740(class247 arg0);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
    public abstract void method742(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()V")
    public abstract void method746();

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)V")
    public abstract void method747(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)Lfc;")
    public static final class191 method1317(byte arg0, int arg1) {
        field3335++;
        class191 var2 = (class191) class151.field1919.method616(118, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class390.field5594.method1687(arg1, 4, arg0 ^ 0x9E);
        if (arg0 != 97) {
            return null;
        }
        class191 var4 = new class191();
        if (var3 != null) {
            var4.method1024(arg1, new class250(var3), 109);
        }
        var4.method1023(true, arg1);
        class151.field1919.method615((byte) -127, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III[I)V")
    public abstract void method745(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public abstract void method743(int arg0);

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public abstract void method749(int arg0);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIII)V")
    public abstract void method750(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([I)V")
    public abstract void method739(int[] arg0);

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public abstract void method744(int arg0);

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
    public abstract void method751(int arg0);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lur;B)I")
    public static final int method1318(class91 arg0, byte arg1) {
        field3337++;
        class345 var2 = arg0.field1035;
        if (var2.field4672 != null) {
            var2 = var2.method2026(-1);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4638;
        class70 var4 = arg0.method2606(0);
        if (arg0.field6056) {
            var3 = var2.field4643;
        } else if (arg0.field6100 == var4.field783 || arg0.field6100 == var4.field743 || arg0.field6100 == var4.field770 || arg0.field6100 == var4.field775) {
            var3 = var2.field4661;
        } else if (arg0.field6100 == var4.field784 || arg0.field6100 == var4.field756 || arg0.field6100 == var4.field774 || arg0.field6100 == var4.field739) {
            var3 = var2.field4677;
        }
        if (arg1 <= 68) {
            field3336 = -77;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
    public abstract void method738(int arg0);
}
