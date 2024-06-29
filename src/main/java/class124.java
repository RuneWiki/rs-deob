import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class124 {

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "Ljt;")
    private class106 field1671 = new class106(64);

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "Lvd;")
    private class39 field1672;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "Lvd;")
    private class39 field1670;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "[Lcha;")
    public static class218[] field1669 = new class218[0];

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "Lql;")
    public static class738 field1673;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public static void method885(int arg0) {
        if (arg0 >= 55) {
            field1669 = null;
            field1673 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
    public static final void method886(int arg0) {
        field1668++;
        if (arg0 <= 88) {
            method885(36);
        }
        client.method1892(-123, false);
        if (class749.field10471 >= 0 && class749.field10471 != 0) {
            class134.method950(0, class749.field10471, false);
            class749.field10471 = -1;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)Lfs;")
    public final class557 method887(int arg0, int arg1) {
        field1674++;
        int var3 = -41 / ((arg1 + 10) / 54);
        class557 var4 = (class557) this.field1671.method803(118, (long) arg0);
        if (var4 != null) {
            return var4;
        }
        byte[] var5;
        if (arg0 < 32768) {
            var5 = this.field1670.method211(true, 0, arg0);
        } else {
            var5 = this.field1672.method211(true, 0, arg0 & 0x7FFF);
        }
        class557 var6 = new class557();
        if (var5 != null) {
            var6.method3246(68, new class645(var5));
        }
        if (arg0 >= 32768) {
            var6.method3251(-88);
        }
        this.field1671.method801(1, var6, (long) arg0);
        return var6;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(ILvd;Lvd;)V")
    public class124(int arg0, class39 arg1, class39 arg2) {
        this.field1672 = arg2;
        this.field1670 = arg1;
        if (this.field1670 != null) {
            this.field1670.method229(0, 0);
        }
        if (this.field1672 != null) {
            this.field1672.method229(0, 0);
        }
    }
}
