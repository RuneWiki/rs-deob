import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class92 {

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Ltja;")
    private class288 field1224 = new class288(128);

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Lbt;")
    private class48 field1223;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "F")
    public static float field1222;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Lvs;", line = 10)
    public final class618 method819(int arg0, int arg1) {
        field1219++;
        class288 var3 = this.field1224;
        class618 var4;
        synchronized (this.field1224) {
            var4 = (class618) this.field1224.method1684((long) arg1, -359);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1223.method437(class664.method3730(21981, arg1), (byte) 105, class123.method953(-12526, arg1));
        class618 var6 = new class618();
        if (var5 != null) {
            var6.method3505(new class403(var5), 0);
        }
        class288 var7 = this.field1224;
        synchronized (this.field1224) {
            this.field1224.method1686(-25638, (long) arg1, var6);
            int var8 = 99 / ((arg0 - 25) / 62);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lkg;I)V", line = 40)
    public static final void method820(class287 arg0, int arg1) {
        if ((arg0 instanceof class388)) {
            class388 var3 = (class388) arg0;
            if (var3.field5003 != null) {
                class597.method3413(var3, arg1 ^ 0x1B, class300.field3596.field808 != var3.field808);
            }
        } else if (arg0 instanceof class521) {
            class521 var2 = (class521) arg0;
            class542.method3208(0, var2, class300.field3596.field808 != var2.field808);
        }
        if (arg1 != -1) {
            method820(null, 49);
        }
        field1221++;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lmja;ILbt;)V", line = 78)
    public class92(class441 arg0, int arg1, class48 arg2) {
        this.field1223 = arg2;
        if (this.field1223 != null) {
            int var4 = this.field1223.method445(-114) - 1;
            this.field1223.method431(4, var4);
        }
    }
}
