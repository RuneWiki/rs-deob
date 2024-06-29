import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class14 {

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public int field358;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "[I")
    public int[] field352;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "[S")
    public short[] field356;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "[S")
    public short[] field364;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "[Loh;")
    public class263[] field357;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "[B")
    public byte[] field351;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field359 = 0;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "Loh;")
    public static class263 field362 = class253.method1681(-119, "details");

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "[Lca;")
    public static class253[] field354;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)I")
    public final int method108(int arg0, int arg1) {
        field355++;
        if (arg1 != 3) {
            this.field352 = null;
        }
        return this.field351[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)Lhb;")
    public static final class208 method109(byte arg0, int arg1) {
        field365++;
        class208 var2 = (class208) class162.field2946.method1464((byte) 41, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class269.field4739.method596(13, 0, arg1 & 0x7FFF);
        } else {
            var3 = class257.field4470.method596(-127, 0, arg1);
        }
        class208 var4 = new class208();
        int var5 = -94 / ((arg0 + 68) / 35);
        if (var3 != null) {
            var4.method1431(new class194(var3), false);
        }
        if (arg1 >= 32768) {
            var4.method1435(0);
        }
        class162.field2946.method1472((byte) -29, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)Z")
    public final boolean method110(int arg0, byte arg1) {
        if (arg1 > -17) {
            field354 = null;
        }
        field363++;
        return (this.field351[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static final void method111(int arg0) {
        class103.field1965 = null;
        class191.field3425 = null;
        class198.field3584 = null;
        field361++;
        class46.field1003 = null;
        class198.field3583 = null;
        class181.field3289 = null;
        if (arg0 != 0) {
            field354 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
    public static void method112(int arg0) {
        field362 = null;
        if (arg0 != 4) {
            field359 = 36;
        }
        field354 = null;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(I)V")
    public class14(int arg0) {
        this.field358 = arg0;
        this.field352 = new int[this.field358];
        this.field356 = new short[this.field358];
        this.field364 = new short[this.field358];
        this.field357 = new class263[this.field358];
        this.field351 = new byte[this.field358];
    }
}
