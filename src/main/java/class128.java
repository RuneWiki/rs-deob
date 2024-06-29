import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class128 {

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Lqa;")
    public static class105 field3005 = new class105(30);

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Lvc;")
    public static class137 field3010 = class45.method325("::fpson", -46);

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lpb;")
    public static class100 field3008 = new class100();

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Lvc;")
    private static class137 field3011 = class45.method325("RuneScape has been updated(Q", -46);

    @OriginalMember(owner = "client!u", name = "k", descriptor = "[Leb;")
    public static class31[] field3013 = new class31[8];

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Lvc;")
    public static class137 field3014 = class45.method325("headicons_pk", -46);

    @OriginalMember(owner = "client!u", name = "j", descriptor = "Lvc;")
    public static class137 field3012 = field3011;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field3015 = 0;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
    public static void method956(boolean arg0) {
        field3010 = null;
        field3008 = null;
        field3014 = null;
        field3013 = null;
        field3005 = null;
        if (!arg0) {
            field3014 = null;
        }
        field3012 = null;
        field3011 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lqd;")
    public static final class108 method957(int arg0, int arg1) {
        class108 var2 = (class108) class105.field2446.method758((long) arg0, (byte) -113);
        field3006++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class7.field155.method668(arg1, -214, arg0);
        class108 var4 = new class108();
        var4.field2505 = arg0;
        if (var3 != null) {
            var4.method787(new class109(var3), (byte) -114);
        }
        class105.field2446.method760(var4, 0, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B[B)V")
    public static final void method958(byte arg0, byte[] arg1) {
        field3003++;
        class109 var2 = new class109(arg1);
        var2.field2583 = arg1.length - 2;
        class104.field2421 = var2.method835(2);
        class139.field3210 = new byte[class104.field2421][];
        class78.field1730 = new int[class104.field2421];
        class58.field1246 = new int[class104.field2421];
        class47.field1054 = new int[class104.field2421];
        class7.field149 = new int[class104.field2421];
        var2.field2583 = arg1.length - class104.field2421 * 8 - 7;
        class35.field751 = var2.method835(2);
        class142.field3346 = var2.method835(2);
        int var3 = (var2.method838(255) & 0xFF) + 1;
        for (int var4 = 0; var4 < class104.field2421; var4++) {
            class78.field1730[var4] = var2.method835(2);
        }
        if (arg0 > -77) {
            method958((byte) -91, null);
        }
        for (int var5 = 0; var5 < class104.field2421; var5++) {
            class47.field1054[var5] = var2.method835(2);
        }
        for (int var6 = 0; var6 < class104.field2421; var6++) {
            class7.field149[var6] = var2.method835(2);
        }
        for (int var7 = 0; var7 < class104.field2421; var7++) {
            class58.field1246[var7] = var2.method835(2);
        }
        var2.field2583 = arg1.length - class104.field2421 * 8 - (var3 + -1) * 3 - 7;
        class47.field1045 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class47.field1045[var8] = var2.method822((byte) 43);
            if (class47.field1045[var8] == 0) {
                class47.field1045[var8] = 1;
            }
        }
        var2.field2583 = 0;
        for (int var9 = 0; var9 < class104.field2421; var9++) {
            int var10 = class58.field1246[var9];
            int var11 = class7.field149[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class139.field3210[var9] = var13;
            int var14 = var2.method838(255);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method816(117);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var11; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var13[var11 * var16 + var15] = var2.method816(121);
                    }
                }
            }
        }
    }
}
