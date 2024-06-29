import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class90 {

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public int field1605 = 0;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field1606 = 1;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Ltb;")
    public static class69 field1612 = new class69();

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Lal;")
    public static class230 field1607;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Z")
    public static boolean field1603;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
    public static final void method660(int arg0, int arg1) {
        field1610++;
        if (!class104.method735(arg0, false)) {
            return;
        }
        class47[] var2 = class14.field206[arg0];
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class47 var4 = var2[var3];
            if (var4 != null) {
                var4.field736 = 1;
                var4.field790 = 0;
                var4.field831 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lgd;I)V")
    public final void method661(class74 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method489((byte) 105);
            if (var3 == 0) {
                if (arg1 != -2196) {
                    field1612 = null;
                }
                field1609++;
                return;
            }
            this.method663(var3, arg0, 32768);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)Lpe;")
    public static final class244 method662(int arg0, int arg1) {
        field1602++;
        class244 var2 = (class244) class108.field1868.method800(arg1 ^ 0xFFFC8170, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class48.field874.method1562(-809612665, arg0 & 0x7FFF, 1);
        } else {
            var3 = class237.field4159.method1562(-809612665, arg0, 1);
        }
        class244 var4 = new class244();
        if (var3 != null) {
            var4.method1701(false, new class74(var3));
        }
        if (arg1 >= ~arg0) {
            var4.method1696(false);
        }
        class108.field1868.method802((long) arg0, 0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILgd;I)V")
    private final void method663(int arg0, class74 arg1, int arg2) {
        if (arg2 != 32768) {
            field1606 = 18;
        }
        field1608++;
        if (arg0 == 5) {
            this.field1605 = arg1.method485(-2386);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static void method664(int arg0) {
        field1612 = null;
        field1607 = null;
        if (arg0 != 0) {
            method664(-99);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)V")
    public static final void method665(int arg0, byte arg1) {
        if (class135.field2449 == null) {
            class135.field2449 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    class135.field2449[var2][var4][var5] = arg1;
                }
            }
        }
        field1611++;
        int var3 = 25 / ((-arg0 - 19) / 44);
    }
}
