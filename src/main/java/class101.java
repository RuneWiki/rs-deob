import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class101 {

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "Z")
    public static boolean field1090 = false;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1084 = new BigInteger("b70fcea753e4785b7fa0e6de7d6a396a3b53c881461caa77c90dc72883ec7151b190f2fc6194e6ba0012c3eaa5b2edc28919de97772f988da44474a52706a881", 16);

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Lcq;")
    public static class110 field1094 = new class110(43, 6);

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public int field1092;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "[Lvb;")
    public class318[] field1093;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lnp;Z)V")
    public final void method545(class115 arg0, boolean arg1) {
        field1087++;
        this.field1092 = arg0.method675(-128);
        this.field1088 = arg0.method643((byte) -77);
        this.field1093 = new class318[arg0.method620((byte) 71)];
        class14[] var3 = class225.method1356(-120);
        int var4 = 0;
        if (!arg1) {
            while (var4 < this.field1093.length) {
                this.field1093[var4] = this.method548((byte) -54, var3[arg0.method620((byte) -126)], arg0);
                var4++;
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static void method546(int arg0) {
        int var1 = 114 % ((arg0 - 9) / 50);
        field1084 = null;
        field1094 = null;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)I")
    public static final int method547(int arg0) {
        if (arg0 != -32737) {
            method547(-61);
        }
        field1086++;
        return class286.field3576;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLib;Lnp;)Lvb;")
    private final class318 method548(byte arg0, class14 arg1, class115 arg2) {
        field1085++;
        if (class652.field9152 == arg1) {
            return class495.method2864(arg2, -107);
        }
        if (arg0 > -28) {
            field1094 = null;
        }
        if (class655.field9231 == arg1) {
            return class268.method1580(arg2, 28065);
        } else if (class365.field4897 == arg1) {
            return class100.method540(arg2, 11312);
        } else if (class373.field5080 == arg1) {
            return class509.method2912(arg2, (byte) -90);
        } else if (class192.field2221 == arg1) {
            return class499.method2876((byte) 65, arg2);
        } else if (class295.field3685 == arg1) {
            return class351.method2079(arg2, 83);
        } else if (class588.field8322 == arg1) {
            return class131.method743(arg2, (byte) 86);
        } else if (class632.field8899 == arg1) {
            return class104.method568(arg2, -29127);
        } else if (class325.field3998 == arg1) {
            return class587.method3311(arg2, true);
        } else if (class45.field465 == arg1) {
            return class32.method166(arg2, 1920);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V")
    public static final void method549(int arg0, int arg1) {
        if (arg1 == 16) {
            field1089++;
            if (class537.field7559 == null || class537.field7559.length < arg0) {
                class537.field7559 = new int[arg0];
            }
        }
    }
}
