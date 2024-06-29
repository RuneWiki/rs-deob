import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class218 extends class40 {

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "Ljava/lang/Object;")
    private Object field3584;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZIZLij;)V")
    public static final void method1568(boolean arg0, int arg1, boolean arg2, class293 arg3) {
        field3583++;
        int var4 = arg3.field4454;
        int var5 = (int) arg3.field6388;
        arg3.method2677(-22491);
        if (arg2) {
            class323.method2055((byte) -18, var4);
        }
        class128.method934((byte) -77, var4);
        class114 var6 = class475.method2864(true, var5);
        if (var6 != null) {
            class262.method1747(20556, var6);
        }
        class320.method2048(8);
        if (!arg0 && class155.field2310 != -1) {
            class129.method944(class155.field2310, 1031, 1);
        }
        if (arg1 > -121) {
            method1569(89, null);
        }
        class530 var7 = new class530(class70.field993);
        for (class293 var8 = (class293) var7.method3143(true); var8 != null; var8 = (class293) var7.method3137(-11627)) {
            if (!var8.method2674(26931)) {
                var8 = (class293) var7.method3143(true);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field4453 == 3) {
                int var9 = (int) var8.field6388;
                if ((var9 >>> 16) == var4) {
                    method1568(arg0, -126, true, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method381(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field3582++;
            return this.field3584;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILkd;)V")
    public static final void method1569(int arg0, class188 arg1) {
        field3585++;
        if (arg0 != 16) {
            return;
        }
        if (class474.field6837 == null) {
            class486 var2 = new class486();
            byte[] var3 = var2.method2904(arg0 + 239, 128, 128, 16);
            class474.field6837 = class491.method2916(var3, -15460, false);
        }
        if (class89.field1273 == null) {
            class321 var4 = new class321();
            byte[] var5 = var4.method2050(16, 128, -122, 128);
            class89.field1273 = class491.method2916(var5, -15460, false);
        }
        class203 var6 = arg1.field3026;
        if (var6.method1418(0) && class434.field6424 == null) {
            byte[] var7 = class136.method991(0.6F, 8, (byte) 65, 4.0F, new class474(419684), 128, 128, 0.5F, 16.0F, 4.0F, 16);
            class434.field6424 = class491.method2916(var7, -15460, false);
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lcp;Ljava/lang/Object;I)V")
    public class218(class512 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field3584 = arg1;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)Z")
    public final boolean method378(byte arg0) {
        if (arg0 != 8) {
            this.field3584 = null;
        }
        field3586++;
        return false;
    }
}
