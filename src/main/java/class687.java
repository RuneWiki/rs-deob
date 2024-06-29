import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class687 {

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Leq;")
    private class209 field9689;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Leq;")
    private class209 field9683;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "S")
    public static short field9682 = 1;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Lqaa;")
    public static class27 field9691 = new class27(4, 3);

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "[I")
    public static int[] field9693 = new int[8];

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field9684;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field9686;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field9687;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field9688;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field9690;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field9692;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Lpb;")
    private class652 field9685;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 4)
    public static void method3861(byte arg0) {
        field9693 = null;
        if (arg0 != 33) {
            field9691 = null;
        }
        field9691 = null;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)Lpb;", line = 16)
    private final class652 method3862(byte arg0) {
        if (this.field9685 == null) {
            this.field9685 = new class652();
        }
        if (arg0 == 20) {
            field9688++;
            return this.field9685;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;Lud;)I", line = 31)
    public static final int method3863(int arg0, String arg1, class35 arg2) {
        field9687++;
        int var3 = arg2.field469;
        byte[] var4 = class644.method3670((byte) 126, arg1);
        arg2.method257(var4.length, 36);
        arg2.field469 += class377.field5263.method1328(arg2.field469, arg0, var4, var4.length, -1518661985, arg2.field483);
        return arg2.field469 - var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Lrea;", line = 49)
    public static final class205 method3864(int arg0, int arg1) {
        field9686++;
        class205 var2 = (class205) class291.field4083.method3054((byte) -95, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -9562) {
            method3861((byte) 120);
        }
        byte[] var3 = class245.field3411.method1453(arg1, arg0 + 9443, 0);
        class205 var4 = new class205();
        if (var3 != null) {
            var4.method1427(new class35(var3), arg0 + 9514, arg1);
        }
        class291.field4083.method3047(false, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)I", line = 78)
    public static final int method3865(int arg0) {
        if (arg0 > -17) {
            return -122;
        } else {
            field9684++;
            return class219.method1520(false, false);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILci;)Lql;", line = 89)
    public final class733 method3866(int arg0, class447 arg1) {
        field9690++;
        if (arg1 == null) {
            return null;
        }
        int var3 = 83 / ((arg0 - 13) / 35);
        class551 var4 = arg1.method930(17503);
        if (class630.field9039 == var4) {
            return new class274((class267) arg1);
        } else if (class676.field9502 == var4) {
            return new class457(this.method3862((byte) 20), (class706) arg1);
        } else if (class375.field5253 == var4) {
            return new class245(this.field9689, (class109) arg1);
        } else if (class54.field1031 == var4) {
            return new class583(this.field9689, (class577) arg1);
        } else if (class438.field6122 == var4) {
            return new class649(this.field9689, this.field9683, (class562) arg1);
        } else if (class601.field8731 == var4) {
            return new class400(this.field9689, this.field9683, (class162) arg1);
        } else if (class415.field5814 == var4) {
            return new class412(this.field9689, this.field9683, (class519) arg1);
        } else if (class70.field1259 == var4) {
            return new class153(this.field9689, this.field9683, (class512) arg1);
        } else if (class519.field7368 == var4) {
            return new class558(this.field9689, (class434) arg1);
        } else if (class459.field6630 == var4) {
            return new class609(this.field9689, this.field9683, (class525) arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Leq;Leq;)V", line = 143)
    public class687(class209 arg0, class209 arg1) {
        this.field9689 = arg0;
        this.field9683 = arg1;
    }
}
