import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public abstract class class301 {

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field4706 = 0;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V", line = 5)
    public static final void method2054(byte arg0) {
        if ((class229.field3637 > class165.field2472)) {
            class165.field2472 = (float) ((double) class165.field2472 / 30.0D + (double) class165.field2472);
            if (class229.field3637 < class165.field2472) {
                class165.field2472 = class229.field3637;
            }
            class17.method137(arg0 ^ 0x7004);
        } else if (class165.field2472 > class229.field3637) {
            class165.field2472 = (float) ((double) class165.field2472 - (double) class165.field2472 / 30.0D);
            if (class229.field3637 > class165.field2472) {
                class165.field2472 = class229.field3637;
            }
            class17.method137(-28707);
        }
        if (class54.field911 != -1 && class273.field4228 != -1) {
            int var1 = class54.field911 - class265.field4119;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            int var2 = class273.field4228 - class128.field2024;
            class265.field4119 += var1;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var1 == 0 && var2 == 0) {
                class54.field911 = -1;
                class273.field4228 = -1;
            }
            class128.field2024 += var2;
            class17.method137(-28707);
        }
        field4704++;
        if (arg0 != -39) {
            field4706 = 48;
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)V", line = 63)
    public static final void method2055(byte arg0) {
        if (arg0 > -105) {
            return;
        }
        while (class10.field132.method756(class186.field2778, 255) >= 27) {
            int var1 = class10.field132.method759(false, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class254.field3989[var1] == null) {
                var2 = true;
                class254.field3989[var1] = new class313();
            }
            class313 var3 = class254.field3989[var1];
            class325.field5049[class312.field4839++] = var1;
            var3.field1857 = class227.field3618;
            if (var3.field4859 != null && var3.field4859.method1469(-8968)) {
                class295.method2006(-23156, var3);
            }
            int var4 = class10.field132.method759(false, 5);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class134.field2138[class10.field132.method759(false, 3)];
            if (var2) {
                var3.field1858 = var3.field1939 = var5;
            }
            int var6 = class10.field132.method759(false, 1);
            int var7 = class10.field132.method759(false, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class10.field132.method759(false, 1);
            if (var8 == 1) {
                class260.field4065[class98.field1562++] = var1;
            }
            var3.method2126(class231.method1630(-92, class10.field132.method759(false, 14)), 18570);
            var3.method891(2047, var3.field4859.field3118);
            var3.field1883 = var3.field4859.field3138;
            var3.field1941 = var3.field4859.field3142;
            if (var3.field1941 == 0) {
                var3.field1939 = 0;
            }
            var3.method894(var3.method280(false), var6 == 1, class98.field1566.field1938[0] + var4, class98.field1566.field1910[0] - -var7, (byte) -56);
            if (var3.field4859.method1469(-8968)) {
                class11.method82(class205.field3101, (class85) null, var3.field1938[0], var3, (class33) null, var3.field1910[0], 128, 0);
            }
        }
        class10.field132.method758((byte) -124);
        field4705++;
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)I")
    public abstract int method68(byte arg0);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method69(Component arg0, int arg1);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method70(byte arg0, Component arg1);
}
