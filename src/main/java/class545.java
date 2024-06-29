import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class545 {

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Lnga;")
    private class510 field7686 = new class510(64);

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Leq;")
    private class209 field7690;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public int field7689;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field7687 = -1;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "Lqe;")
    public static class465 field7691 = new class465(101, 0);

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Lnga;")
    public static class510 field7692 = new class510(128, 4);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Ldm;", line = 4)
    public static final class50 method3220(int arg0, int arg1) {
        field7688++;
        if (arg0 != 65535) {
            field7691 = null;
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class117.field1849[var2] == null || class117.field1849[var2][var3] == null) {
            boolean var4 = class4.method19(-104, var2);
            if (!var4) {
                return null;
            }
        }
        return class117.field1849[var2][var3];
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)I", line = 32)
    public static final int method3221(int arg0) {
        field7685++;
        byte var1;
        if (class438.field6123 < 96) {
            var1 = 1;
            class155.method1184(0, true);
        } else {
            int var2 = class591.method3391(100);
            if (var2 <= 100) {
                class127.method988(2);
                var1 = 4;
            } else if (var2 <= 500) {
                var1 = 3;
                class150.method1158((byte) -105);
            } else if (var2 > 1000) {
                var1 = 1;
                class155.method1184(0, true);
            } else {
                var1 = 2;
                class405.method2489(-6589);
            }
        }
        if (class471.field6781.field6684.method1843(27669) != 0) {
            class471.field6781.method2826(0, (byte) 97, class471.field6781.field6695);
            class54.method490((byte) -118, false, 0);
        }
        class129.method994((byte) 77);
        if (arg0 != -26536) {
            field7691 = null;
        }
        return var1;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)Leg;", line = 104)
    public final class107 method3222(int arg0, int arg1) {
        field7684++;
        class510 var3 = this.field7686;
        class107 var4;
        synchronized (this.field7686) {
            var4 = (class107) this.field7686.method3054((byte) -100, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class209 var5 = this.field7690;
        byte[] var6;
        synchronized (this.field7690) {
            var6 = this.field7690.method1453(arg0, -122, arg1);
        }
        class107 var7 = new class107();
        if (var6 != null) {
            var7.method928(arg1 ^ 0xFFFFFF93, new class35(var6));
        }
        class510 var8 = this.field7686;
        synchronized (this.field7686) {
            this.field7686.method3047(false, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V", line = 137)
    public static void method3223(int arg0) {
        if (arg0 != 1000) {
            method3221(-61);
        }
        field7692 = null;
        field7691 = null;
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lcw;ILeq;)V", line = 150)
    public class545(class179 arg0, int arg1, class209 arg2) {
        this.field7690 = arg2;
        this.field7689 = this.field7690.method1477(0, 19);
    }
}
