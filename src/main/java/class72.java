import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public abstract class class72 {

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Lmaa;")
    public static class461 field1135 = new class461();

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Lvb;")
    public static class396 field1136 = new class396(13, -1);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public abstract void method679(int arg0);

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)Ltm;")
    public abstract class618 method680(int arg0);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)Z")
    public abstract boolean method681(byte arg0, int arg1);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BILuf;I)V")
    public static final void method682(byte arg0, int arg1, class519 arg2, int arg3) {
        if (class295.field4298) {
            class93 var4 = class626.field8893 == -1 ? null : class498.field6854.method3434(class626.field8893, 10549);
            if (client.method885(arg2).method1254(false) && (class345.field4896 & 0x20) != 0 && (var4 == null || arg2.method3037(class626.field8893, var4.field1331, 122) != var4.field1331)) {
                class526.method3076(arg2.field7129, false, 0L, 500, class460.field6275 + " -> " + arg2.field7123, arg2.field7247, arg2.field7193, false, true, class745.field10364, (long) (arg2.field7193 << 0 | arg2.field7247), 12, class470.field6405);
                class700.field9813++;
            }
        }
        if (arg0 < 111) {
            method682((byte) 49, -19, null, -63);
        }
        field1134++;
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class308.method1894(arg2, (byte) -3, var5);
            if (var9 != null) {
                class526.method3076(arg2.field7129, false, (long) (var5 + 1), 500, arg2.field7123, arg2.field7247, arg2.field7193, false, true, class334.method2049(var5, -1, arg2), (long) (arg2.field7193 << 0 | arg2.field7247), 1001, var9);
                class457.field6235++;
            }
        }
        String var6 = class481.method2846(arg2, true);
        if (var6 != null) {
            class190.field2855++;
            class526.method3076(arg2.field7129, false, 0L, 500, arg2.field7123, arg2.field7247, arg2.field7193, false, true, arg2.field7295, (long) (arg2.field7193 << 0 | arg2.field7247), 57, var6);
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class308.method1894(arg2, (byte) -3, var7);
            if (var8 != null) {
                class526.method3076(arg2.field7129, false, (long) (var7 + 1), 500, arg2.field7123, arg2.field7247, arg2.field7193, false, true, class334.method2049(var7, -1, arg2), (long) (arg2.field7193 << 0 | arg2.field7247), 15, var8);
                class457.field6235++;
            }
        }
        if (!client.method885(arg2).method1251(-16566)) {
            return;
        }
        class726.field10107++;
        if (arg2.field7282 == null) {
            class526.method3076(arg2.field7129, false, 0L, 500, "", arg2.field7247, arg2.field7193, false, true, -1, (long) (arg2.field7193 << 0 | arg2.field7247), 53, class563.field7808.method3281(class423.field5892, -1));
        } else {
            class526.method3076(arg2.field7129, false, 0L, 500, "", arg2.field7247, arg2.field7193, false, true, -1, (long) (arg2.field7247 | arg2.field7193 << 0), 53, arg2.field7282);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method683(byte arg0) {
        if (arg0 > -96) {
            method682((byte) 11, -21, null, -10);
        }
        field1136 = null;
        field1135 = null;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
    public static final void method684(byte arg0) {
        field1138++;
        class469.field6382 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            class39.field456[var1] = null;
            class279.field4025[var1] = 1;
            class197.field2970[var1] = null;
        }
        if (arg0 > -119) {
            field1136 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
    public abstract void method685(int arg0);
}
