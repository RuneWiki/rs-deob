import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class class13 {

    @OriginalMember(owner = "client!se", name = "f", descriptor = "S")
    public static short field178 = 1;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Llc;")
    public static class175 field174;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Llc;")
    public static class175 field176;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 8)
    public static final void method90(int arg0) {
        boolean var1 = false;
        if (arg0 != 1) {
            return;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class310.field4794 - 1; var2++) {
                if (class30.field371[var2] < 1000 && class30.field371[var2 + 1] > 1000) {
                    String var3 = class148.field2061[var2];
                    class148.field2061[var2] = class148.field2061[var2 + 1];
                    class148.field2061[var2 + 1] = var3;
                    var1 = false;
                    String var4 = class221.field3124[var2];
                    class221.field3124[var2] = class221.field3124[var2 + 1];
                    class221.field3124[var2 + 1] = var4;
                    int var5 = class168.field2332[var2];
                    class168.field2332[var2] = class168.field2332[var2 + 1];
                    class168.field2332[var2 + 1] = var5;
                    int var6 = class121.field1702[var2];
                    class121.field1702[var2] = class121.field1702[var2 + 1];
                    class121.field1702[var2 + 1] = var6;
                    int var7 = class76.field968[var2];
                    class76.field968[var2] = class76.field968[var2 + 1];
                    class76.field968[var2 + 1] = var7;
                    short var8 = class30.field371[var2];
                    class30.field371[var2] = class30.field371[var2 + 1];
                    class30.field371[var2 + 1] = var8;
                    long var9 = class223.field3149[var2];
                    class223.field3149[var2] = class223.field3149[var2 + 1];
                    class223.field3149[var2 + 1] = var9;
                }
            }
        }
        field173++;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(II)V", line = 69)
    public static final void method92(int arg0, int arg1) {
        class260.field3945 = 1000 / arg0;
        if (arg1 == 1) {
            field175++;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V", line = 81)
    public static void method93(int arg0) {
        field176 = null;
        if (arg0 == 5845) {
            field174 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)I")
    public abstract int method88(int arg0, int arg1);

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(II)[B")
    public abstract byte[] method89(int arg0, int arg1);

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(II)V")
    public abstract void method91(int arg0, int arg1);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)Lbd;")
    public abstract class322 method94(byte arg0);
}
