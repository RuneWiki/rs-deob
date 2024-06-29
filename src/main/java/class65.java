import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class65 {

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Lcc;")
    public static class209 field1263 = class95.method669(121, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field1266 = 0;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "Lcc;")
    public static class209 field1267 = class95.method669(88, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "Lsj;")
    public static class49 field1264;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIII)V")
    public static final void method479(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class159.field2895 == 1) {
            class256.field4630[class284.field5002 / 100].method232(class31.field570 - 8, class253.field4571 + -8);
        }
        if (class159.field2895 == 2) {
            class256.field4630[(class284.field5002 / 100) + 4].method232(class31.field570 - 8, class253.field4571 + -8);
        }
        class63.method466(86);
        int var5 = 50 % ((arg4 - 33) / 52);
        field1262++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)I")
    public static final int method480(int arg0, byte arg1) {
        int var2 = arg0 & 0x3F;
        field1265++;
        if (arg1 < 53) {
            return 125;
        }
        int var3 = arg0 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILcc;II)V")
    public static final void method481(int arg0, int arg1, class209 arg2, int arg3, int arg4) {
        field1261++;
        class42 var5 = class116.method827(arg4, (byte) 100, arg0);
        if (var5 == null) {
            return;
        }
        if (var5.field717 != null) {
            class227 var6 = new class227();
            var6.field4144 = arg3;
            var6.field4134 = var5.field717;
            var6.field4139 = arg2;
            var6.field4143 = var5;
            class147.method1021(var6, 200000);
        }
        boolean var7 = true;
        if (var5.field715 > 0) {
            var7 = class157.method1094(250, var5);
        }
        if (!var7 || !class218.method1531(arg3 - 1, false, client.method1070(var5))) {
            return;
        }
        if (arg3 == 1) {
            class228.field4157++;
            class84.field1677.method287((byte) 122, 197);
            class84.field1677.method758(arg0, 1469334200);
            class84.field1677.method740(255, arg4);
        }
        if (arg3 == 2) {
            class276.field4869++;
            class84.field1677.method287((byte) 126, 206);
            class84.field1677.method758(arg0, 1469334200);
            class84.field1677.method740(255, arg4);
        }
        if (arg1 != -24377) {
            field1264 = null;
        }
        if (arg3 == 3) {
            class84.field1677.method287((byte) 121, 200);
            class84.field1677.method758(arg0, 1469334200);
            class84.field1677.method740(255, arg4);
            class247.field4474++;
        }
        if (arg3 == 4) {
            class114.field2277++;
            class84.field1677.method287((byte) 125, 96);
            class84.field1677.method758(arg0, 1469334200);
            class84.field1677.method740(255, arg4);
        }
        if (arg3 == 5) {
            client.field2813++;
            class84.field1677.method287((byte) 124, 9);
            class84.field1677.method758(arg0, 1469334200);
            class84.field1677.method740(255, arg4);
        }
        if (arg3 == 6) {
            class85.field1694++;
            class84.field1677.method287((byte) 124, 249);
            class84.field1677.method758(arg0, arg1 + 1469358577);
            class84.field1677.method740(arg1 ^ 0xFFFFA038, arg4);
        }
        if (arg3 == 7) {
            class84.field1677.method287((byte) 122, 12);
            class244.field4425++;
            class84.field1677.method758(arg0, 1469334200);
            class84.field1677.method740(255, arg4);
        }
        if (arg3 == 8) {
            class169.field3088++;
            class84.field1677.method287((byte) 123, 179);
            class84.field1677.method758(arg0, arg1 + 1469358577);
            class84.field1677.method740(255, arg4);
        }
        if (arg3 == 9) {
            class84.field1677.method287((byte) 118, 132);
            class84.field1677.method758(arg0, 1469334200);
            class119.field2382++;
            class84.field1677.method740(255, arg4);
        }
        if (arg3 == 10) {
            class84.field1677.method287((byte) 121, 40);
            class84.field1677.method758(arg0, arg1 ^ 0xA86BE27F);
            class84.field1677.method740(255, arg4);
            class129.field2473++;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
    public static void method482(int arg0) {
        field1267 = null;
        field1264 = null;
        field1263 = null;
        if (arg0 < 3) {
            field1267 = null;
        }
    }
}
