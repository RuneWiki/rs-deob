import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class27 {

    @OriginalMember(owner = "client!de", name = "g", descriptor = "[I")
    public static int[] field600 = new int[500];

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Ltd;")
    private static class136 field599 = class145.method1172("Error connecting to server)3", 45);

    @OriginalMember(owner = "client!de", name = "j", descriptor = "Ltd;")
    public static class136 field603 = field599;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Ltd;")
    public static class136 field602 = null;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Ltd;")
    private static class136 field604 = class145.method1172("Loaded update list", 45);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Ltd;")
    public static class136 field594 = field604;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "J")
    private static long field596;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
    public static final byte[] method232(boolean arg0, int arg1, Object arg2) {
        field598++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class140.method1140(false, var3) : var3;
        } else if (arg1 != 500) {
            return null;
        } else if (arg2 instanceof class8) {
            class8 var4 = (class8) arg2;
            return var4.method38((byte) -93);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)J")
    public static final synchronized long method233(byte arg0) {
        field605++;
        int var1 = 5 / ((70 - arg0) / 32);
        long var2 = System.currentTimeMillis();
        if (class99.field2374 > var2) {
            field596 += class99.field2374 - var2;
        }
        class99.field2374 = var2;
        return field596 + var2;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V")
    public static void method234(byte arg0) {
        field603 = null;
        field602 = null;
        field594 = null;
        if (arg0 > -110) {
            method232(false, -44, null);
        }
        field599 = null;
        field604 = null;
        field600 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/awt/Component;III)Lka;")
    public static final class70 method235(Component arg0, int arg1, int arg2, int arg3) {
        field597++;
        try {
            Class var4 = Class.forName("re");
            class70 var5 = (class70) var4.getDeclaredConstructor().newInstance();
            var5.method522(arg0, arg1, arg2, (byte) -108);
            return arg3 == 1 ? var5 : null;
        } catch (Throwable var7) {
            class122 var6 = new class122();
            var6.method522(arg0, arg1, arg2, (byte) -34);
            return var6;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BLtd;ILtd;)V")
    public static final void method236(byte arg0, class136 arg1, int arg2, class136 arg3) {
        if (arg0 != -38) {
            method236((byte) -49, null, 2, null);
        }
        class28.method243(null, arg1, arg2, false, arg3);
        field595++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIBI)Lr;")
    public static final class118 method237(int arg0, int arg1, byte arg2, int arg3) {
        field601++;
        class118 var4 = new class118();
        var4.field2682 = arg1;
        var4.field2693 = arg0;
        class18.field363.method112(var4, (byte) 3, (long) arg3);
        class133.method1078(arg0, 0);
        class44.method357(arg0, (byte) -95);
        class74 var5 = class12.method82(arg3, (byte) 108);
        if (var5 != null) {
            class145.method1173(var5, -4008);
        }
        if (class107.field2523 != null) {
            class145.method1173(class107.field2523, -4008);
            class107.field2523 = null;
        }
        class14.field274 = 0;
        class96.field2267 = false;
        class14.method101(class38.field892, class65.field1394, class128.field3088, class49.field1125, (byte) -118);
        if (arg2 <= 118) {
            method232(false, -120, null);
        }
        if (class55.field1233 != -1) {
            class99.method801(class55.field1233, 1, 128);
        }
        return var4;
    }
}
