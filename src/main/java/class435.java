import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class class435 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Lri;")
    public static class74 field6368 = new class74(2, 7);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Ldi;")
    public static class83 field6371 = new class83(10, 8);

    @OriginalMember(owner = "client!a", name = "h", descriptor = "[B")
    public static byte[] field6375 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!a", name = "g", descriptor = "[I")
    public static int[] field6374 = new int[250];

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "[S")
    public static short[] field6377;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)Z", line = 5)
    public final boolean method2563(int arg0) {
        field6369++;
        if (arg0 <= 37) {
            method2568(61, -110, 79);
        }
        return this.method1819(4) || this.method1812(-99) || this.method1814(false);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(JILjava/lang/String;ZIILjava/lang/String;IIZZ)V", line = 17)
    public static final void method2564(long arg0, int arg1, String arg2, boolean arg3, int arg4, int arg5, String arg6, int arg7, int arg8, boolean arg9, boolean arg10) {
        field6376++;
        int[] var12 = new int[4];
        if (arg7 <= 80) {
            field6375 = null;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class391 var14 = new class391(128);
        var14.method2302(-4, 10);
        var14.method2355(1686288168, (arg3 ? 1 : 0) | (arg9 ? 2 : 0) | (arg10 ? 4 : 0));
        var14.method2303(arg0, (byte) -28);
        var14.method2359(var12[0], -116);
        var14.method2349(arg6, true);
        var14.method2359(var12[1], -114);
        var14.method2355(1686288168, class461.field6784);
        var14.method2302(-4, arg1);
        var14.method2302(-4, arg8);
        var14.method2359(var12[2], -126);
        var14.method2355(1686288168, arg4);
        var14.method2355(1686288168, arg5);
        var14.method2359(var12[3], -91);
        var14.method2363(class474.field6926, (byte) -64, class120.field1776);
        class391 var15 = new class391(350);
        var15.method2349(arg2, true);
        int var16 = 8 - (class252.method1507(arg2, true) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method2302(-4, (int) (Math.random() * 255.0D));
        }
        var15.method2365(var12, true);
        class481.field7027.field5719 = 0;
        class481.field7027.method2302(-4, class141.field2023.field311);
        class481.field7027.method2355(1686288168, var15.field5719 + var14.field5719 + 2);
        class481.field7027.method2355(1686288168, 591);
        class481.field7027.method2315(4, var14.field5719, var14.field5678, 0);
        class481.field7027.method2315(4, var15.field5719, var15.field5678, 0);
        class401.field5888 = 0;
        class522.field7733 = 0;
        class377.field5530 = -3;
        class66.field906 = 1;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIII)V", line = 79)
    public static final void method2565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6370++;
        int var8 = arg4 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class131.field1923 - class360.field5254) * var8 / arg6 + class360.field5254;
        int var10 = arg0 * var9 >> 8;
        int var11 = 16384 - arg3 & 0x3FFF;
        int var12 = 16384 - arg5 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class183.field2684[var11] * -var10 >> 15;
            var15 = class183.field2678[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class183.field2684[var12] * var15 >> 15;
            var15 = class183.field2678[var12] * var15 >> 15;
        }
        class329.field4493 = arg7 - var13;
        class373.field5478 = arg1 - var15;
        class493.field7186 = 0;
        class62.field766 = arg2 - var14;
        class94.field1399 = arg5;
        class107.field1604 = arg3;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V", line = 137)
    public static void method2566(byte arg0) {
        field6375 = null;
        field6371 = null;
        int var1 = 61 % ((-arg0 - 7) / 42);
        field6377 = null;
        field6374 = null;
        field6368 = null;
    }

    @OriginalMember(owner = "client!a", name = "g", descriptor = "(I)V", line = 157)
    public static final void method2567(int arg0) {
        field6373++;
        for (class375 var1 = (class375) class225.field3202.method2452(-102); var1 != null; var1 = (class375) class225.field3202.method2452(-108)) {
            class53.method456((byte) 80, var1);
        }
        int var2;
        int var3;
        if (class20.field269.method1712(class152.field2332, false)) {
            var2 = 0;
            var3 = 3;
        } else {
            var3 = class124.field1854;
            var2 = class124.field1854;
        }
        client.method1221();
        int var4 = 126 % ((arg0 + 11) / 35);
        for (int var5 = var2; var5 <= var3; var5++) {
            client.method1229();
            client.method1231(var5);
            client.method1230(var5);
        }
        client.method1225();
        client.method1237();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III)I", line = 205)
    public static final int method2568(int arg0, int arg1, int arg2) {
        field6372++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (arg2 != 2985) {
            method2568(11, 14, 66);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)I")
    public abstract int method1822(int arg0);

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)Z")
    public abstract boolean method1819(int arg0);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)I")
    public abstract int method1813(int arg0);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(I)Llo;")
    public abstract class528 method1823(int arg0);

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)Z")
    public abstract boolean method1814(boolean arg0);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V")
    public abstract void method1818(int arg0);

    @OriginalMember(owner = "client!a", name = "h", descriptor = "(I)Z")
    public abstract boolean method1812(int arg0);

    @OriginalMember(owner = "client!a", name = "i", descriptor = "(I)V")
    public abstract void method1825(int arg0);
}
