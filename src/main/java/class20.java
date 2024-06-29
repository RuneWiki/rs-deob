import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public abstract class class20 extends class426 {

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field528 = -1;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "Lwo;")
    public static class690 field526 = new class690(47, 3);

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "B")
    public byte field532;

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "B")
    public byte field535;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "F")
    public static float field529;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public int field527;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public int field530;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    public int field531;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    public int field534;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    public int field536;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public int field537;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "Z")
    public boolean field538;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([Lul;III)I", line = 21)
    public final int method336(class530[] arg0, int arg1, int arg2, int arg3) {
        field539++;
        long var5 = class321.field4226[this.field532][arg3][arg2];
        if (arg1 <= 62) {
            this.field538 = false;
        }
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            var7 += 16L;
            arg0[var9++] = class436.field6249[var10 - 1].field6647;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg0[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "(I)V", line = 62)
    public static void method337(int arg0) {
        field526 = null;
        if (arg0 <= 106) {
            field528 = -103;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZJ)V", line = 77)
    public static final void method338(boolean arg0, long arg1) {
        field533++;
        class543 var3 = class215.method1314((byte) -111);
        var3.field7872.method2281((byte) 58, class238.field3282.field7714);
        var3.field7872.method2230((byte) 23, arg1);
        var3.field7872.method2281((byte) 58, class370.field4980);
        if (arg0) {
            method337(20);
        }
        class511.method3028(7482, var3);
        class184.field2257 = 0;
        class696.field9865 = -3;
        class382.field5103 = 1;
        class88.field1237 = 0;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)Z")
    public abstract boolean method167(byte arg0);

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)Z")
    public abstract boolean method335(byte arg0);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lr;III)Z")
    public abstract boolean method166(class165 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)I")
    public abstract int method173(int arg0);

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)Z")
    public abstract boolean method175(int arg0);

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "(I)V")
    public abstract void method163(int arg0);

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(BLr;)Lsr;")
    public abstract class229 method161(byte arg0, class165 arg1);

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(B)I")
    public abstract int method172(byte arg0);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lr;Z)V")
    public abstract void method162(class165 arg0, boolean arg1);

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "(I)Z")
    public abstract boolean method339(int arg0);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIZLr;ILub;I)V")
    public abstract void method169(int arg0, int arg1, boolean arg2, class165 arg3, int arg4, class20 arg5, int arg6);

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(B)Z")
    public abstract boolean method165(byte arg0);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([Lul;I)I")
    public abstract int method340(class530[] arg0, int arg1);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lr;B)Llt;")
    public abstract class626 method170(class165 arg0, byte arg1);
}
