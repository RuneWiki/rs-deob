import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class236 {

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "Lb;")
    public static class48 field4221 = new class48();

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field4222 = 0;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Lsg;")
    public static class30 field4224 = class167.method1221((byte) 33, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "[I")
    public static int[] field4227 = new int[5];

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "Lsg;")
    public static class30 field4228 = class167.method1221((byte) 33, "1");

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "J")
    public long field4215;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "Lmc;")
    public static class151 field4213;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "Lmc;")
    public static class151 field4226;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lcb;")
    public class236 field4211;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "Lcb;")
    public class236 field4218;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "[Lce;")
    public static class205[] field4223;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Log;")
    public static final class169 method1678(int arg0, int arg1) {
        class169 var2 = (class169) class35.field858.method1644((byte) -32, (long) arg1);
        field4219++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class77.field1689.method1115(arg1, (byte) -105, arg0);
        class169 var4 = new class169();
        if (var3 != null) {
            var4.method1244(arg1, new class8(var3), 9482);
        }
        class35.field858.method1646((long) arg1, var4, -110);
        return var4;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Lsg;")
    public static final class30 method1679(int arg0, int arg1, int arg2) {
        field4220++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return class97.field1975;
        } else if (var3 < -6) {
            return class62.field1332;
        } else if (var3 < -3) {
            return class262.field4636;
        } else if (var3 < 0) {
            return class251.field4440;
        } else if (arg2 < 43) {
            return null;
        } else if (var3 > 9) {
            return class231.field4099;
        } else if (var3 > 6) {
            return class224.field4009;
        } else if (var3 > 3) {
            return class208.field3748;
        } else if (var3 > 0) {
            return class96.field1961;
        } else {
            return class209.field3764;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method1680(int arg0) {
        field4226 = null;
        field4221 = null;
        if (arg0 != 128) {
            return;
        }
        field4228 = null;
        field4213 = null;
        field4224 = null;
        field4227 = null;
        field4223 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V")
    public final void method1681(boolean arg0) {
        if (arg0) {
            method1682(27);
        }
        field4217++;
        if (this.field4218 != null) {
            this.field4218.field4211 = this.field4211;
            this.field4211.field4218 = this.field4218;
            this.field4211 = null;
            this.field4218 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
    public static final void method1682(int arg0) {
        class31.field784.method1652(-8259);
        if (arg0 >= -122) {
            field4224 = null;
        }
        field4216++;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLsg;ILsg;)V")
    public static final void method1683(byte arg0, class30 arg1, int arg2, class30 arg3) {
        if (arg0 < 86) {
            field4225 = -104;
        }
        class55.field1227 = arg3;
        class69.field1562 = arg2;
        class55.field1215 = arg1;
        field4212++;
        if (class55.field1227.method267(-52, class55.field1203) || class55.field1215.method267(-52, class55.field1203)) {
            class68.field1498 = 3;
        } else if (class200.field3579 == -1) {
            class68.field1498 = -3;
            class62.field1334 = 0;
            class208.field3745 = 1;
            class8 var4 = new class8(128);
            var4.method76(5305, 10);
            var4.method97((int) (Math.random() * 99999.0D), (byte) -2);
            var4.method97(519, (byte) -2);
            var4.method72(-1033389592, class55.field1227.method297((byte) -98));
            var4.method57((int) (Math.random() * 9.9999999E7D), 115);
            var4.method85(class55.field1215, (byte) 68);
            var4.method57((int) (Math.random() * 9.9999999E7D), 116);
            var4.method75(class266.field4696, 15955, class88.field1800);
            class196.field3553.field146 = 0;
            class196.field3553.method76(5305, 136);
            class196.field3553.method76(5305, var4.field146);
            class196.field3553.method62(var4.field146, 0, var4.field124, 0);
        } else {
            class17.method173(-116);
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)Z")
    public final boolean method1684(int arg0) {
        field4214++;
        if (arg0 != 15284) {
            this.method1681(true);
        }
        return this.field4218 != null;
    }
}
