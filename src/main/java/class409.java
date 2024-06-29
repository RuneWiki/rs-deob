import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class409 {

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Ljv;")
    public static class73 field5527 = new class73("", 16);

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field5528 = 0;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static final void method2345(int arg0) {
        field5529++;
        int var1 = class37.field560 * 512 + 256;
        int var2 = class561.field7431 * 512 + 256;
        int var3 = class315.method1878(var1, arg0 - 12472, class29.field476, var2) - class123.field2051;
        if (class253.field3492 >= 100) {
            class259.field3563 = class37.field560 * 512 + 256;
            class643.field8632 = class561.field7431 * 512 + 256;
            class553.field7350 = class315.method1878(class259.field3563, 2921, class29.field476, class643.field8632) - class123.field2051;
        } else {
            if (class259.field3563 < var1) {
                class259.field3563 += (var1 - class259.field3563) * class253.field3492 / 1000 + class695.field9759;
                if (var1 < class259.field3563) {
                    class259.field3563 = var1;
                }
            }
            if (class259.field3563 > var1) {
                class259.field3563 -= (class259.field3563 - var1) * class253.field3492 / 1000 + class695.field9759;
                if (class259.field3563 < var1) {
                    class259.field3563 = var1;
                }
            }
            if (class553.field7350 < var3) {
                class553.field7350 += (var3 - class553.field7350) * class253.field3492 / 1000 + class695.field9759;
                if (class553.field7350 > var3) {
                    class553.field7350 = var3;
                }
            }
            if (var3 < class553.field7350) {
                class553.field7350 -= (class553.field7350 - var3) * class253.field3492 / 1000 + class695.field9759;
                if (class553.field7350 < var3) {
                    class553.field7350 = var3;
                }
            }
            if (class643.field8632 < var2) {
                class643.field8632 += (var2 - class643.field8632) * class253.field3492 / 1000 + class695.field9759;
                if (var2 < class643.field8632) {
                    class643.field8632 = var2;
                }
            }
            if (class643.field8632 > var2) {
                class643.field8632 -= (class643.field8632 - var2) * class253.field3492 / 1000 + class695.field9759;
                if (var2 > class643.field8632) {
                    class643.field8632 = var2;
                }
            }
        }
        int var4 = class317.field4363 * 512 + 256;
        int var5 = class438.field6035 * 512 + 256;
        int var6 = class315.method1878(var5, 2921, class29.field476, var4) - class690.field9728;
        int var7 = var5 - class259.field3563;
        int var8 = var6 - class553.field7350;
        int var9 = var4 - class643.field8632;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class510.field6806 < var11) {
            class510.field6806 += (var11 - class510.field6806 >> 3) * class2.field13 / 1000 + class480.field6408 << 3;
            if (var11 < class510.field6806) {
                class510.field6806 = var11;
            }
        }
        if (var11 < class510.field6806) {
            class510.field6806 -= (class510.field6806 - var11 >> 3) * class2.field13 / 1000 + class480.field6408 << 3;
            if (class510.field6806 < var11) {
                class510.field6806 = var11;
            }
        }
        int var13 = var12 - class331.field4539;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (arg0 != 15393) {
            field5527 = null;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class331.field4539 += class2.field13 * var14 / 1000 + class480.field6408 << 3;
            class331.field4539 &= 0x3FFF;
        }
        if (var14 < 0) {
            class331.field4539 -= -var14 * class2.field13 / 1000 + class480.field6408 << 3;
            class331.field4539 &= 0x3FFF;
        }
        int var15 = var12 - class331.field4539;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class331.field4539 = var12;
        }
        class370.field4993 = 0;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public static void method2346(int arg0) {
        if (arg0 > -37) {
            method2345(-76);
        }
        field5527 = null;
    }
}
