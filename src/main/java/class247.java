import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class247 {

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field3933 = 0;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Z")
    public static boolean field3931 = true;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "[I")
    public static int[] field3937 = new int[8];

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static volatile int field3929 = 0;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Ldk;")
    public static class251 field3932;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Ldk;")
    public static class251 field3938;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
    public static final void method1652(int arg0, int arg1, int arg2) {
        class246 var3 = class192.field3113[class56.field941][arg0][arg2];
        field3939++;
        if (var3 == null) {
            class99.method674(class56.field941, arg0, arg2);
            return;
        }
        class294 var4 = null;
        class294 var5 = (class294) var3.method1643((byte) -46);
        int var6 = -99999999;
        while (var5 != null) {
            class115 var13 = class81.method562(var5.field4707.field2530, arg1 ^ 0xFFFFB03A);
            int var14 = var13.field1791;
            if (var13.field1794 == 1) {
                var14 = (var5.field4707.field2529 + 1) * var14;
            }
            if (var6 < var14) {
                var4 = var5;
                var6 = var14;
            }
            var5 = (class294) var3.method1642((byte) 40);
        }
        if (var4 == null) {
            class99.method674(class56.field941, arg0, arg2);
            return;
        }
        var3.method1645(123, var4);
        class159 var7 = null;
        class294 var8 = (class294) var3.method1643((byte) 124);
        class159 var9 = null;
        while (var8 != null) {
            class159 var12 = var8.field4707;
            if (var4.field4707.field2530 != var12.field2530) {
                if (var7 == null) {
                    var7 = var12;
                }
                if (var7.field2530 != var12.field2530 && var9 == null) {
                    var9 = var12;
                }
            }
            var8 = (class294) var3.method1642((byte) 107);
        }
        long var10 = (long) ((arg2 << 7) + arg0 + 1610612736);
        class9.method43(class56.field941, arg0, arg2, class155.method1060((byte) -12, class56.field941, arg2 * 128 + 64, arg0 * 128 + arg1), var4.field4707, var10, var7, var9);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static final void method1653(int arg0) {
        field3936++;
        class69.field1145 = 0;
        class244.field3873 = 0;
        class81.method563(true);
        class303.method2011(61440);
        class240.method1619(17998);
        class59.method403(-110);
        if (arg0 > -49) {
            method1652(9, -47, 76);
        }
        for (int var1 = 0; var1 < class244.field3873; var1++) {
            int var3 = class108.field1724[var1];
            if (class29.field360 != class270.field4355[var3].field695) {
                if (class270.field4355[var3].field4788 > 0) {
                    class173.method1260(-16, var3, class270.field4355[var3]);
                }
                class270.field4355[var3] = null;
            }
        }
        if (class47.field793 != class131.field2053.field2568) {
            throw new RuntimeException("gpp1 pos:" + class131.field2053.field2568 + " psize:" + class47.field793);
        }
        for (int var2 = 0; var2 < class13.field145; var2++) {
            if (class270.field4355[class259.field4176[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class13.field145);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)I")
    public static final int method1654(int arg0, int arg1) {
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        field3935++;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        if (arg1 != 455314946) {
            method1654(95, -2);
        }
        return var6 + 1;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static void method1655(byte arg0) {
        int var1 = 22 % ((arg0 - 60) / 40);
        field3938 = null;
        field3932 = null;
        field3937 = null;
    }
}
