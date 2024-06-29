import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class190 {

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "[I")
    public static int[] field3828 = new int[128];

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "Ldd;")
    private static class35 field3833 = class180.method1196((byte) -119, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Ldd;")
    public static class35 field3835 = field3833;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[S")
    public static short[] field3832;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public static void method1250(byte arg0) {
        field3832 = null;
        field3835 = null;
        field3828 = null;
        field3833 = null;
        if (arg0 != 9) {
            method1254((byte) -90, null);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Lba;")
    public static final class12 method1251(int arg0) {
        if (arg0 > -13) {
            method1250((byte) -55);
        }
        field3834++;
        class12 var1 = new class12();
        var1.field221 = class118.field2623[0];
        var1.field223 = class15.field269[0];
        var1.field224 = class143.field3003[0];
        var1.field219 = class207.field4119[0];
        var1.field218 = class37.field815;
        var1.field220 = class57.field1425;
        int var2 = var1.field223 * var1.field221;
        byte[] var3 = class203.field4039[0];
        var1.field222 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var1.field222[var4] = class116.field2591[class208.method1372(var3[var4], 255)];
        }
        class123.method878(-23);
        return var1;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ldd;ILdd;I)V")
    public static final void method1252(class35 arg0, int arg1, class35 arg2, int arg3) {
        if (arg1 != 0) {
            field3828 = null;
        }
        field3829++;
        class148.method1009(arg2, (byte) -4, arg0, null, arg3);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)J")
    public static final synchronized long method1253(byte arg0) {
        field3830++;
        long var1 = System.currentTimeMillis();
        if (arg0 != 18) {
            method1253((byte) -2);
        }
        if (class39.field859 > var1) {
            class57.field1416 += class39.field859 - var1;
        }
        class39.field859 = var1;
        return var1 + class57.field1416;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLfd;)Lfd;")
    public static final class55 method1254(byte arg0, class55 arg1) {
        if (arg0 != 42) {
            return null;
        }
        field3827++;
        class55 var2 = class80.method602(arg1, (byte) -41);
        if (var2 == null) {
            var2 = arg1.field1366;
        }
        return var2;
    }
}
