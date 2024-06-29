import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class287 extends class443 {

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "Lbv;")
    public static class567 field4175 = new class567(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "I")
    public static int field4179 = 0;

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "[I")
    public static int[] field4176 = new int[8];

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
    public static int field4181 = -60;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "Z")
    public static boolean field4180 = true;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "Lgp;")
    public static class561 field4182;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "Lcb;")
    private class78 field4174;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILco;B)V")
    private final void method1819(int arg0, class268 arg1, byte arg2) {
        int var4 = 71 % ((arg2 - 18) / 48);
        field4177++;
        if (arg0 != 249) {
            return;
        }
        int var5 = arg1.method1738(255);
        if (this.field4174 == null) {
            int var6 = class243.method1546(-26367, var5);
            this.field4174 = new class78(var6);
        }
        for (int var7 = 0; var7 < var5; var7++) {
            boolean var8 = arg1.method1738(255) == 1;
            int var9 = arg1.method1700((byte) 44);
            class108 var10;
            if (var8) {
                var10 = new class172(arg1.method1752(false));
            } else {
                var10 = new class264(arg1.method1748(86));
            }
            this.field4174.method737((long) var9, (byte) 92, var10);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BI)V")
    public static final void method1820(byte arg0, int arg1) {
        if (arg0 == 31) {
            class319.field4629 = arg1;
            field4183++;
            class142.field2216.method2406(111);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BLco;)V")
    public final void method1821(byte arg0, class268 arg1) {
        field4178++;
        if (arg0 != 101) {
            this.field4174 = null;
        }
        while (true) {
            int var3 = arg1.method1738(255);
            if (var3 == 0) {
                return;
            }
            this.method1819(var3, arg1, (byte) 112);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
    public final String method1822(int arg0, int arg1, String arg2) {
        field4185++;
        if (this.field4174 == null) {
            return arg2;
        } else {
            class172 var4 = (class172) this.field4174.method740(arg0, (long) arg1);
            return var4 == null ? arg2 : var4.field2499;
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V")
    public static void method1823(byte arg0) {
        if (arg0 != -28) {
            field4175 = null;
        }
        field4182 = null;
        field4176 = null;
        field4175 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)I")
    public final int method1824(int arg0, int arg1, int arg2) {
        field4184++;
        if (this.field4174 == null) {
            return arg2;
        }
        class264 var4 = (class264) this.field4174.method740(0, (long) arg1);
        if (arg0 != 8) {
            this.method1824(36, -59, 11);
        }
        return var4 == null ? arg2 : var4.field3841;
    }
}
