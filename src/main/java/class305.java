import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public abstract class class305 {

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "Lhb;")
    public class728 field4323;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "I")
    public int field4320;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
    public static int field4322 = 0;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "[I")
    public static int[] field4321 = new int[3];

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!vw", name = "h", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(II)V")
    public final void method1927(int arg0, int arg1) {
        if (arg0 < 120) {
            this.field4323 = null;
        }
        if (this.method306(31401, arg1) != 3) {
            this.method303(-27751, arg1);
        }
        field4325++;
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(II)V")
    public abstract void method303(int arg0, int arg1);

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)I")
    public abstract int method305(byte arg0);

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V")
    public static final void method1928(int arg0) {
        if (arg0 == 3) {
            field4326++;
            class419.field6268 = new class342(class430.field6374.method2679(class650.field9160, -127), "", class389.field5865, 1009, -1, 0L, 0, 0, true, false, 0L, true);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILcs;)V")
    public static final void method1929(int arg0, class342 arg1) {
        if (arg0 != 0) {
            method1928(-54);
        }
        field4327++;
        if (arg1 == null) {
            return;
        }
        class748.field10459.method1203(arg1, (byte) -36);
        class68.field969++;
        Object var2 = null;
        class567 var5;
        if (arg1.field4958 || "".equals(arg1.field4969)) {
            var5 = new class567(arg1.field4969);
            class565.field8032++;
        } else {
            long var3 = arg1.field4959;
            for (var5 = (class567) class33.field350.method2287(var3, (byte) -117); var5 != null && !var5.field8054.equals(arg1.field4969); var5 = (class567) class33.field350.method2280(true)) {
            }
            if (var5 == null) {
                var5 = (class567) class606.field8553.method803(126, var3);
                if (var5 != null && !var5.field8054.equals(arg1.field4969)) {
                    var5 = null;
                }
                if (var5 == null) {
                    var5 = new class567(arg1.field4969);
                }
                class33.field350.method2278((byte) -81, var3, var5);
                class565.field8032++;
            }
        }
        if (var5.method3299(arg1, 14551)) {
            class371.method2277(var5, (byte) -102);
        }
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(B)V")
    public abstract void method308(byte arg0);

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "(II)I")
    public abstract int method306(int arg0, int arg1);

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "(II)Lru;")
    public static final class193 method1930(int arg0, int arg1) {
        field4324++;
        int var2 = 91 % ((arg0 - 58) / 59);
        class193 var3 = (class193) class350.field5111.method2515((long) arg1, (byte) 106);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class248.field3606.method211(true, arg1, 0);
        if (var4 == null || var4.length <= 1) {
            return null;
        }
        class193 var5;
        try {
            var5 = class34.method176(var4, 1);
        } catch (Exception var7) {
            throw new RuntimeException(var7.getMessage() + " S: " + arg1);
        }
        class350.field5111.method2518((long) arg1, 22363, var5);
        return var5;
    }

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "(B)V")
    public static void method1931(byte arg0) {
        field4321 = null;
        if (arg0 >= -38) {
            method1930(12, -56);
        }
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lhb;)V")
    public class305(class728 arg0) {
        this.field4323 = arg0;
        this.field4320 = this.method305((byte) 68);
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(ILhb;)V")
    public class305(int arg0, class728 arg1) {
        this.field4320 = arg0;
        this.field4323 = arg1;
    }
}
