import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 {

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field28 = 0;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Ljd;")
    public static class86 field30 = class122.method868("document)3cookie=(R", true);

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Lrk;")
    public static class257 field33 = new class257();

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Lnh;")
    public static class53 field35 = new class53(64);

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Ljd;")
    public static class86 field36 = class122.method868("Speicher wird zugewiesen)3", true);

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "J")
    public static long field37 = 0L;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "[Lei;")
    public static class167[] field34;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
    public static void method12(byte arg0) {
        field36 = null;
        field33 = null;
        int var1 = 69 / ((arg0 - 46) / 53);
        field35 = null;
        field30 = null;
        field34 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(JILjd;IIII)V")
    public static final void method13(long arg0, int arg1, class86 arg2, int arg3, int arg4, int arg5, int arg6) {
        field26++;
        class200 var8 = new class200(128);
        var8.method1388(-68, 10);
        var8.method1428((byte) 50, (int) (Math.random() * 99999.0D));
        var8.method1428((byte) -2, 514);
        var8.method1399((byte) -65, arg0);
        var8.method1406(1472534024, (int) (Math.random() * 9.9999999E7D));
        var8.method1379(0, arg2);
        var8.method1406(1472534024, (int) (Math.random() * 9.9999999E7D));
        var8.method1428((byte) -111, class179.field3235);
        var8.method1388(-86, arg5);
        var8.method1388(-78, arg1);
        var8.method1406(1472534024, (int) (Math.random() * 9.9999999E7D));
        var8.method1428((byte) 22, arg6);
        var8.method1428((byte) -2, arg3);
        var8.method1406(1472534024, (int) (Math.random() * 9.9999999E7D));
        var8.method1385(0, class81.field1586, class132.field2499);
        class36.field809.field3565 = 0;
        class36.field809.method1388(-51, 161);
        class36.field809.method1388(-41, var8.field3565);
        int var9 = 89 / ((arg4 + 60) / 49);
        class36.field809.method1423(var8.field3565, (byte) 57, var8.field3547, 0);
        class195.field3489 = 1;
        class153.field2890 = -3;
        class253.field4497 = 0;
        class138.field2633 = 0;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static final void method14(int arg0) {
        class60.field1198.method703((byte) 122);
        field32++;
        if (arg0 != 17946) {
            method16((class151) null, -26, (class151) null);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILof;)V")
    public static final void method15(int arg0, class254 arg1) {
        int var2 = 41 % ((-arg0 - 11) / 60);
        class103 var3 = null;
        field27++;
        try {
            class26 var4 = arg1.method1713("runescape", (byte) -114);
            while (var4.field613 == 0) {
                class91.method677(0, 1L);
            }
            if (var4.field613 == 1) {
                var3 = (class103) var4.field611;
                class200 var5 = class83.method577(false);
                var3.method739(var5.field3547, 1, var5.field3565, 0);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method740(1);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lbj;ILbj;)V")
    public static final void method16(class151 arg0, int arg1, class151 arg2) {
        class241.field4333 = arg0;
        field31++;
        class46.field1020 = arg2;
        class180.field3248 = class241.field4333.method1075(arg1, 10);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)I")
    public static final int method17(int arg0, int arg1, int arg2) {
        field29++;
        class13 var3 = (class13) class152.field2876.method1698((long) arg2, (byte) 117);
        if (var3 == null) {
            return 0;
        } else if (~arg0 == arg1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field402.length; var5++) {
                if (var3.field405[var5] == arg0) {
                    var4 += var3.field402[var5];
                }
            }
            return var4;
        }
    }
}
