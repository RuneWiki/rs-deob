import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class69 {

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "Ljr;")
    private class112 field1282 = new class112(64);

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "Lin;")
    private class91 field1283;

    @OriginalMember(owner = "client!sga", name = "g", descriptor = "Lin;")
    private class91 field1287;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "Leq;")
    public static class213 field1281 = new class213(512);

    @OriginalMember(owner = "client!sga", name = "f", descriptor = "I")
    public static int field1286 = 64;

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)V")
    public static void method681(int arg0) {
        field1281 = null;
        if (arg0 != 28962) {
            field1281 = null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(II)Lug;")
    public final class561 method682(int arg0, int arg1) {
        field1285++;
        class561 var3 = (class561) this.field1282.method992((long) arg1, -51);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field1283.method863(-1860, 0, arg1);
        } else {
            var4 = this.field1287.method863(-1860, 0, arg1 & 0x7FFF);
        }
        class561 var5 = new class561();
        if (var4 != null) {
            var5.method3220(117, new class215(var4));
        }
        if (arg1 >= 32768) {
            var5.method3223((byte) 104);
        }
        if (arg0 != 0) {
            this.field1287 = null;
        }
        this.field1282.method991(var5, (long) arg1, (byte) -123);
        return var5;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(IZ)V")
    public static final void method683(int arg0, boolean arg1) {
        field1284++;
        int var2 = class93.field1640;
        int var3 = class607.field8333;
        if (arg0 != 1) {
            return;
        }
        if (arg1 && class458.field6459) {
            var2 <<= 0x1;
            var3 = -var2;
        }
        class272.field3822.method349(var3, var2);
    }

    @OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(ILin;Lin;)V")
    public class69(int arg0, class91 arg1, class91 arg2) {
        this.field1283 = arg1;
        this.field1287 = arg2;
        if (this.field1283 != null) {
            this.field1283.method860(0, 0);
        }
        if (this.field1287 != null) {
            this.field1287.method860(0, 0);
        }
    }
}
