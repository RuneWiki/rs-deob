import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class118 {

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "[I")
    public static int[] field1466 = new int[1000];

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Lum;")
    public static class184 field1467 = new class184();

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "[Z")
    public static boolean[] field1473 = new boolean[5];

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field1474 = 0;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "S")
    public static short field1475 = 320;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static final void method639(int arg0) {
        class244.field3323 = 0;
        field1469++;
        class342.field4577.method829(false);
        class452.field6586 = false;
        if (arg0 != 1150) {
            method641((class322) null, (class128) null, 110, 11, 60);
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
    public static void method640(int arg0) {
        field1467 = null;
        field1466 = null;
        if (arg0 != 1336672256) {
            field1472 = 120;
        }
        field1473 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lvm;Lai;III)V")
    public static final void method641(class322 arg0, class128 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class231.field3184) {
            class96 var5 = class176.field2209[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field1135 != null && var5.field1135.method345((byte) -72)) {
                arg1.method353(true, 107, 0, 128, var5.field1135, 0, arg0);
            }
        }
        if (arg4 < class231.field3184) {
            class96 var6 = class176.field2209[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field1135 != null && var6.field1135.method345((byte) -72)) {
                arg1.method353(true, 103, 0, 0, var6.field1135, 128, arg0);
            }
        }
        if (arg3 < class231.field3184 && arg4 < class209.field2840) {
            class96 var7 = class176.field2209[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field1135 != null && var7.field1135.method345((byte) -72)) {
                arg1.method353(true, 118, 0, 128, var7.field1135, 128, arg0);
            }
        }
        if (arg3 < class231.field3184 && arg4 > 0) {
            class96 var8 = class176.field2209[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field1135 != null && var8.field1135.method345((byte) -72)) {
                arg1.method353(true, 114, 0, 128, var8.field1135, -128, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZ)Lhk;")
    public static final class201 method642(int arg0, boolean arg1) {
        field1470++;
        if (!arg1) {
            field1472 = -38;
        }
        class201 var2 = (class201) class371.field5193.method222((long) arg0, -8407);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class389.field5571.method1687(arg0 & 0x7FFF, 0, 255);
        } else {
            var3 = class151.field1909.method1687(arg0, 0, 255);
        }
        class201 var4 = new class201();
        if (var3 != null) {
            var4.method1091(28036, new class250(var3));
        }
        if (arg0 >= 32768) {
            var4.method1096(32174);
        }
        class371.field5193.method218((long) arg0, (byte) 125, var4);
        return var4;
    }
}
