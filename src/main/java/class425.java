import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class425 extends class338 {

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "F")
    public static float field6241 = 0.0F;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public int field6227;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field6231;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public int field6233;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public int field6236;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public int field6238;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public int field6239;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "Lfd;")
    public class194 field6237;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "Lfd;")
    public class194 field6242;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "Ljava/lang/String;")
    public String field6228;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "Z")
    public boolean field6229;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "[Ljava/lang/Object;")
    public Object[] field6240;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lam;Lam;BLam;Lam;)V")
    public static final void method2639(class286 arg0, class286 arg1, byte arg2, class286 arg3, class286 arg4) {
        class131.field1693 = arg4;
        class142.field1812 = arg1;
        class216.field2899 = arg3;
        class166.field2110 = arg0;
        field6230++;
        if (arg2 != -21) {
            method2641(false);
        }
        class235.field3227 = new class194[class131.field1693.method1676(arg2 + 104)][];
        class289.field3940 = new boolean[class131.field1693.method1676(98)];
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)I")
    public static final int method2640(int arg0, byte arg1) {
        field6232++;
        if (arg0 < 0) {
            return 0;
        }
        class367 var2 = (class367) class106.field1305.method308((long) arg0, (byte) -93);
        if (arg1 != -11) {
            method2642((class286) null, (class286) null, false, (class322) null);
        }
        if (var2 == null) {
            return class229.method1245(false, arg0).field5993;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field5141.length; var4++) {
            if (var2.field5141[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class229.method1245(false, arg0).field5993 - var2.field5141.length);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
    public static final void method2641(boolean arg0) {
        field6235++;
        if (!arg0) {
            method2642((class286) null, (class286) null, true, (class322) null);
        }
        if (!class65.field682) {
            return;
        }
        class194 var1 = class142.method769(-1, class106.field1297, class199.field2657);
        if (var1 != null && var1.field2616 != null) {
            class425 var2 = new class425();
            var2.field6240 = var1.field2616;
            var2.field6242 = var1;
            class277.method1523(var2);
        }
        class65.field682 = false;
        class373.field5205 = -1;
        class204.method1107(var1, (byte) -123);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lam;Lam;ZLvm;)V")
    public static final void method2642(class286 arg0, class286 arg1, boolean arg2, class322 arg3) {
        field6231++;
        class207.field2798 = class243.method1305(arg0, 0, class229.field3155, true);
        class115.field1436 = arg3.method1601(class207.field2798, class241.method1291(arg1, class229.field3155, 0), arg2);
        class383.field5461 = class243.method1305(arg0, 0, class333.field4428, true);
        class105.field1296 = arg3.method1601(class383.field5461, class241.method1291(arg1, class333.field4428, 0), true);
        class111.field1385 = class243.method1305(arg0, 0, class222.field2978, true);
        class291.field3957 = arg3.method1601(class111.field1385, class241.method1291(arg1, class222.field2978, 0), true);
    }
}
