import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class516 extends class257 {

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field7208;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "Lbaa;")
    public static class130 field7206 = new class130(16);

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "Luv;")
    public static class755 field7211 = null;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "S")
    public static short field7212 = 1;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "Lclient;")
    public static client field7210;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
    public static final void method3087(int arg0) {
        class453.field6283.method1457(((float) class332.field4707.field4780.method3040(0) * 0.1F + 0.7F) * class156.field2196);
        if (arg0 == -9) {
            field7204++;
            class453.field6283.method1498(class66.field1025, class196.field2634, class316.field4379, (float) (class96.field1324 << 2), (float) (class237.field3509 << 2), (float) (class223.field3013 << 2));
            class453.field6283.method1391(class416.field5889);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILjava/lang/String;IIB)V")
    public static final void method3088(int arg0, String arg1, int arg2, int arg3, byte arg4) {
        field7207++;
        class755 var5 = class171.method1093((byte) 93, arg3, arg0);
        if (var5 == null) {
            return;
        }
        if (var5.field10502 != null) {
            class142 var6 = new class142();
            var6.field2016 = arg1;
            var6.field2020 = var5;
            var6.field2024 = var5.field10502;
            var6.field2027 = arg2;
            class546.method3233(var6);
        }
        if (arg4 != -44) {
            field7210 = null;
        }
        if (class102.field1401 != 10 || !client.method2738(var5).method1840(arg2 - 1, (byte) -124)) {
            return;
        }
        if (arg2 == 1) {
            class465.field6469++;
            class583 var7 = class54.method400(class213.field2800, (byte) 96, class545.field7564);
            class500.method3017(arg3, var5.field10441, arg0, var7, (byte) -113);
            class463.method2838(var7, (byte) 121);
        }
        if (arg2 == 2) {
            class316.field4385++;
            class583 var8 = class54.method400(class213.field2800, (byte) -76, class331.field4699);
            class500.method3017(arg3, var5.field10441, arg0, var8, (byte) -102);
            class463.method2838(var8, (byte) 121);
        }
        if (arg2 == 3) {
            class394.field5665++;
            class583 var9 = class54.method400(class213.field2800, (byte) -44, class371.field5235);
            class500.method3017(arg3, var5.field10441, arg0, var9, (byte) -101);
            class463.method2838(var9, (byte) 122);
        }
        if (arg2 == 4) {
            class593.field8039++;
            class583 var10 = class54.method400(class213.field2800, (byte) 88, class655.field8751);
            class500.method3017(arg3, var5.field10441, arg0, var10, (byte) -94);
            class463.method2838(var10, (byte) 121);
        }
        if (arg2 == 5) {
            class38.field462++;
            class583 var11 = class54.method400(class213.field2800, (byte) 88, class641.field8584);
            class500.method3017(arg3, var5.field10441, arg0, var11, (byte) -115);
            class463.method2838(var11, (byte) 120);
        }
        if (arg2 == 6) {
            class3.field23++;
            class583 var12 = class54.method400(class213.field2800, (byte) 112, class587.field7983);
            class500.method3017(arg3, var5.field10441, arg0, var12, (byte) -97);
            class463.method2838(var12, (byte) 120);
        }
        if (arg2 == 7) {
            class118.field1554++;
            class583 var13 = class54.method400(class213.field2800, (byte) -66, class234.field3475);
            class500.method3017(arg3, var5.field10441, arg0, var13, (byte) -91);
            class463.method2838(var13, (byte) 117);
        }
        if (arg2 == 8) {
            class445.field6179++;
            class583 var14 = class54.method400(class213.field2800, (byte) -61, class279.field4058);
            class500.method3017(arg3, var5.field10441, arg0, var14, (byte) -116);
            class463.method2838(var14, (byte) 120);
        }
        if (arg2 == 9) {
            class655.field8750++;
            class583 var15 = class54.method400(class213.field2800, (byte) -65, class293.field4211);
            class500.method3017(arg3, var5.field10441, arg0, var15, (byte) -93);
            class463.method2838(var15, (byte) 126);
        }
        if (arg2 == 10) {
            class291.field4178++;
            class583 var16 = class54.method400(class213.field2800, (byte) 108, class286.field4112);
            class500.method3017(arg3, var5.field10441, arg0, var16, (byte) -98);
            class463.method2838(var16, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V")
    public final void method3089(int arg0) {
        if (arg0 != -834900382) {
            method3088(93, null, 32, 1, (byte) -32);
        }
        this.field7208.method2624();
        field7209++;
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)V")
    public static void method3090(int arg0) {
        field7206 = null;
        int var1 = -103 / ((arg0 - 51) / 42);
        field7210 = null;
        field7211 = null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IB)I")
    public static final int method3091(int arg0, byte arg1) {
        field7205++;
        int var2 = 24 / ((-arg1 - 4) / 51);
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(I)V")
    public class516(int arg0) {
        this.field7208 = new NativeHeap(arg0);
    }
}
