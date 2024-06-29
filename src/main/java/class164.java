import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class164 extends class336 {

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "Ljava/lang/Object;")
    private Object field2354;

    @OriginalMember(owner = "client!ih", name = "A", descriptor = "I")
    public static int field2349 = -1;

    @OriginalMember(owner = "client!ih", name = "B", descriptor = "Ljw;")
    public static class259 field2350 = new class259(2, 6);

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1006(int arg0) {
        if (arg0 != 14) {
            field2349 = -5;
        }
        field2353++;
        return this.field2354;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZZ)V")
    public static final void method1007(boolean arg0, boolean arg1) {
        if (arg0) {
            return;
        }
        if (class540.field7407 == null) {
            class163.method1003((byte) 94);
        }
        field2351++;
        if (arg1) {
            class540.field7407.method2867(-69);
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
    public static void method1008(byte arg0) {
        if (arg0 <= -37) {
            field2350 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)Z")
    public final boolean method1009(boolean arg0) {
        if (arg0) {
            method1007(false, false);
        }
        field2348++;
        return false;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)I")
    public static final int method1010(int arg0) {
        field2352++;
        if (class75.field890 == 0) {
            class293.field3874.method1740(-2, new class447("jaclib"));
            if (class293.field3874.method1733(104).method184(110) != 100) {
                return 1;
            }
            if (!((class447) class293.field3874.method1733(92)).method2518((byte) -119)) {
                class386.field5153.method2618((byte) -20);
            }
            class75.field890 = 1;
        }
        if (class75.field890 == 1) {
            class120.field1534 = class293.method1739(-1);
            class293.field3867.method1740(-2, new class544(class417.field5481));
            class293.field3876.method1740(-2, new class447("jaggl"));
            class293.field3877.method1740(-2, new class447("jagdx"));
            class293.field3878.method1740(-2, new class447("jagmisc"));
            class293.field3879.method1740(-2, new class447("sw3d"));
            class293.field3880.method1740(-2, new class447("hw3d"));
            class293.field3881.method1740(-2, new class544(class329.field4418));
            class293.field3882.method1740(-2, new class544(class200.field2708));
            class293.field3883.method1740(-2, new class544(class82.field947));
            class293.field3884.method1740(-2, new class544(class361.field4786));
            class293.field3885.method1740(-2, new class544(class89.field1084));
            class293.field3886.method1740(-2, new class544(class651.field9100));
            class293.field3887.method1740(-2, new class544(class411.field5404));
            class293.field3888.method1740(-2, new class544(class219.field2867));
            class293.field3889.method1740(-2, new class544(class630.field8722));
            class293.field3890.method1740(-2, new class544(class426.field5748));
            class293.field3891.method1740(-2, new class544(class33.field461));
            class293.field3892.method1740(-2, new class544(class85.field1045));
            class293.field3893.method1740(-2, new class544(class102.field1219));
            class293.field3894.method1740(-2, new class544(class311.field4196));
            class293.field3895.method1740(-2, new class28(class13.field164, "huffman"));
            class293.field3896.method1740(-2, new class544(class542.field7425));
            class293.field3897.method1740(-2, new class544(class614.field8506));
            class293.field3898.method1740(-2, new class544(class208.field2785));
            class293.field3899.method1740(-2, new class542(class688.field9713, "details"));
            for (int var1 = 0; var1 < class120.field1534.length; var1++) {
                if (class120.field1534[var1].method1733(7) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class293[] var3 = class120.field1534;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class293 var5 = var3[var4];
                int var6 = var5.method1736(23978);
                int var7 = var5.method1733(39).method184(-38);
                var2 += var6 * var7 / 100;
            }
            class75.field890 = 2;
            class300.field3980 = var2;
        }
        if (class120.field1534 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        class293[] var11 = class120.field1534;
        for (int var12 = 0; var12 < var11.length; var12++) {
            class293 var16 = var11[var12];
            int var17 = var16.method1736(23978);
            int var18 = var16.method1733(40).method184(124);
            var8 += var17;
            if (var18 < 100) {
                var10 = false;
            }
            var9 += var17 * var18 / 100;
        }
        if (arg0 > -26) {
            return 27;
        }
        if (var10) {
            if (!((class447) class293.field3878.method1733(38)).method2518((byte) -83)) {
                class386.field5153.method2619((byte) 13);
            }
            class120.field1534 = null;
        }
        int var13 = var9 - class300.field3980;
        int var14 = var8 - class300.field3980;
        int var15 = var14 <= 0 ? 100 : var13 * 100 / var14;
        if (!var10 && var15 > 99) {
            var15 = 99;
        }
        return var15;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Ldc;Ljava/lang/Object;I)V")
    public class164(class23 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field2354 = arg1;
    }
}
