import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class179 {

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!cfa", name = "e", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!cfa", name = "f", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IZIILjava/lang/String;)V", line = 3)
    public static final void method1287(int arg0, boolean arg1, int arg2, int arg3, String arg4) {
        field2786++;
        class451 var5 = class63.method422(arg0, 17492, arg2);
        if (var5 == null) {
            return;
        }
        if (arg1) {
            field2787 = -50;
        }
        if (var5.field6300 != null) {
            class166 var6 = new class166();
            var6.field2619 = var5.field6300;
            var6.field2617 = arg3;
            var6.field2627 = var5;
            var6.field2628 = arg4;
            class379.method2349(var6);
        }
        if (class266.field3873 != 10 || !client.method2046(var5).method276(arg3 - 1, 0)) {
            return;
        }
        if (arg3 == 1) {
            class394.field5423++;
            class312 var7 = class353.method2245(class87.field971, class145.field2114, (byte) 104);
            class275.method1782(-1, arg2, var5.field6183, var7, arg0);
            class208.method1440(var7, 32);
        }
        if (arg3 == 2) {
            class173.field2685++;
            class312 var8 = class353.method2245(class87.field971, class216.field3337, (byte) 103);
            class275.method1782(-1, arg2, var5.field6183, var8, arg0);
            class208.method1440(var8, 38);
        }
        if (arg3 == 3) {
            class338.field4742++;
            class312 var9 = class353.method2245(class87.field971, class205.field3182, (byte) 107);
            class275.method1782(-1, arg2, var5.field6183, var9, arg0);
            class208.method1440(var9, 78);
        }
        if (arg3 == 4) {
            class374.field5163++;
            class312 var10 = class353.method2245(class87.field971, class253.field3729, (byte) 40);
            class275.method1782(-1, arg2, var5.field6183, var10, arg0);
            class208.method1440(var10, 108);
        }
        if (arg3 == 5) {
            class483.field6806++;
            class312 var11 = class353.method2245(class87.field971, class211.field3265, (byte) 28);
            class275.method1782(-1, arg2, var5.field6183, var11, arg0);
            class208.method1440(var11, 43);
        }
        if (arg3 == 6) {
            class178.field2746++;
            class312 var12 = class353.method2245(class87.field971, class48.field609, (byte) 94);
            class275.method1782(-1, arg2, var5.field6183, var12, arg0);
            class208.method1440(var12, 46);
        }
        if (arg3 == 7) {
            class288.field4227++;
            class312 var13 = class353.method2245(class87.field971, class713.field9887, (byte) 30);
            class275.method1782(-1, arg2, var5.field6183, var13, arg0);
            class208.method1440(var13, 48);
        }
        if (arg3 == 8) {
            class466.field6551++;
            class312 var14 = class353.method2245(class87.field971, class513.field7254, (byte) 91);
            class275.method1782(-1, arg2, var5.field6183, var14, arg0);
            class208.method1440(var14, 117);
        }
        if (arg3 == 9) {
            class31.field425++;
            class312 var15 = class353.method2245(class87.field971, class33.field432, (byte) 91);
            class275.method1782(-1, arg2, var5.field6183, var15, arg0);
            class208.method1440(var15, 77);
        }
        if (arg3 == 10) {
            class674.field9407++;
            class312 var16 = class353.method2245(class87.field971, class36.field476, (byte) 70);
            class275.method1782(-1, arg2, var5.field6183, var16, arg0);
            class208.method1440(var16, 57);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "toString", descriptor = "()Ljava/lang/String;", line = 139)
    public final String toString() {
        field2789++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "([Ljava/lang/String;[IB)V", line = 148)
    public static final void method1288(String[] arg0, int[] arg1, byte arg2) {
        if (arg2 > -103) {
            field2787 = -76;
        }
        class521.method3140(-112, arg1, 0, arg0, arg0.length - 1);
        field2790++;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(B[B)[B", line = 163)
    public static final byte[] method1289(byte arg0, byte[] arg1) {
        field2788++;
        class494 var2 = new class494(arg1);
        int var3 = var2.method2964((byte) 66);
        int var4 = var2.method2976(-124);
        if (var4 < 0 || !(class4.field33 == 0 || var4 <= class4.field33)) {
            throw new RuntimeException();
        }
        if (arg0 != -57) {
            method1287(23, false, 105, 78, null);
        }
        if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method2958(true, var5, 0, var4);
            return var5;
        }
        int var6 = var2.method2976(-127);
        if (var6 < 0 || class4.field33 != 0 && class4.field33 < var6) {
            throw new RuntimeException();
        }
        byte[] var7 = new byte[var6];
        if (var3 == 1) {
            class264.method1713(var7, var6, arg1, var4, 9);
        } else {
            class551 var8 = class98.field1109;
            synchronized (class98.field1109) {
                class98.field1109.method3289(var7, 118, var2);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ILso;)Lee;", line = 222)
    public static final class704 method1290(int arg0, class494 arg1) {
        field2785++;
        return arg0 == -1 ? new class704(arg1.method2988(-3), arg1.method2988(-3), arg1.method2988(-3), arg1.method2988(-3), arg1.method2960((byte) 94), arg1.method2964((byte) 104)) : null;
    }
}
