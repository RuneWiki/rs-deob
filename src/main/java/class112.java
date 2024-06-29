import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public abstract class class112 {

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Ltg;")
    public static class184 field2026 = class135.method812("welle2:", 3);

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2023;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
    public static void method691(byte arg0) {
        if (arg0 != 70) {
            field2026 = null;
        }
        field2026 = null;
        field2023 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)I")
    public static final int method692(int arg0, byte arg1) {
        if (arg1 != -23) {
            return -25;
        }
        int var7 = arg0 - 1;
        field2024++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)V")
    public abstract void method451(byte arg0);

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZII)I")
    public static final int method693(boolean arg0, int arg1, int arg2) {
        field2027++;
        if (arg0) {
            int var3 = class39.method227(arg1 - 1, 26515, arg2 - 1) + class39.method227(arg1 + 1, 26515, arg2 - 1) + class39.method227(arg1 + -1, 26515, arg2 + 1) + class39.method227(arg1 + 1, 26515, arg2 + 1);
            int var4 = class39.method227(arg1 - 1, 26515, arg2) + class39.method227(arg1 + 1, 26515, arg2) + class39.method227(arg1, 26515, arg2 - 1) + class39.method227(arg1, 26515, arg2 - -1);
            int var5 = class39.method227(arg1, 26515, arg2);
            return var4 / 8 + var3 / 16 + var5 / 4;
        } else {
            return -18;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ltg;I)Z")
    public static final boolean method694(class184 arg0, int arg1) {
        field2025++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class64.field1212; var2++) {
            if (arg0.method1150(class202.field3895[var2], -102)) {
                return true;
            }
        }
        if (arg1 != -683524792) {
            method693(true, -15, -94);
        }
        return arg0.method1150(class46.field872.field1299, -113);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BII)I")
    public abstract int method452(byte arg0, int arg1, int arg2);
}
