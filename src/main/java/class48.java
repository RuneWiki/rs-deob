import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class48 extends class329 {

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    public static int field690 = 0;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "Lui;")
    public static class98 field691 = new class98(64);

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "Lil;")
    public static class4 field689;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "[Lel;")
    public static class258[] field695;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)[Llj;", line = 14)
    public static final class289[] method356(boolean arg0) {
        field693++;
        if (arg0) {
            method356(true);
        }
        class289[] var1 = new class289[class2.field9];
        for (int var2 = 0; var2 < class2.field9; var2++) {
            byte[] var3 = class105.field1522[var2];
            int var4 = class94.field1379[var2] * class322.field5289[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class201.field3085[class235.method1623(var3[var6], 255)];
            }
            if (class245.field3886) {
                var1[var2] = new class232(class300.field4961, class96.field1400, class18.field228[var2], class28.field419[var2], class322.field5289[var2], class94.field1379[var2], var5);
            } else {
                var1[var2] = new class137(class300.field4961, class96.field1400, class18.field228[var2], class28.field419[var2], class322.field5289[var2], class94.field1379[var2], var5);
            }
        }
        class167.method1164(arg0);
        return var1;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BC)C", line = 57)
    public static final char method357(byte arg0, char arg1) {
        field692++;
        int var2 = -81 % ((arg0 + 56) / 41);
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(Z)V", line = 96)
    public static void method358(boolean arg0) {
        if (!arg0) {
            field691 = null;
            field695 = null;
            field689 = null;
        }
    }
}
