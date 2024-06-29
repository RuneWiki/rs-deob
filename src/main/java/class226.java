import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class226 extends class38 {

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Loa;")
    public static class99 field3913 = class221.method1463(2844, " s(West connect-B)3");

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "Loa;")
    public static class99 field3912 = class221.method1463(2844, "Veuillez commencer par supprimer ");

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "Ltf;")
    public static class107 field3916 = null;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Loa;")
    public static class99 field3914 = class221.method1463(2844, "null");

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Lqh;")
    public static class202 field3917;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "[[S")
    public static short[][] field3918;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static final void method1487(int arg0) {
        int var1 = class164.field2877.length;
        field3915++;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class164.field2877[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class110.field1970; var4++) {
                    if (class31.field562[var4] == class171.field3042[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                int var5 = 0;
                if (var3 == -1) {
                    class31.field562[class110.field1970] = class171.field3042[var2];
                    var3 = class110.field1970++;
                }
                class261 var6 = new class261(class164.field2877[var2]);
                while (var6.field4587 < class164.field2877[var2].length && var5 < 511) {
                    int var7 = var3 | var5++ << 6;
                    int var8 = var6.method1740((byte) 67);
                    int var9 = var8 >> 14;
                    int var10 = var8 & 0x3F;
                    int var11 = (var8 & 0x1FF0) >> 7;
                    int var12 = (class171.field3042[var2] & 0xFF) * 64 + var10 - class215.field3731;
                    int var13 = (class171.field3042[var2] >> 8) * 64 + var11 - class280.field4910;
                    class257 var14 = class50.method348(var6.method1740((byte) 62), -30026);
                    if (class248.field4287[var7] == null && (var14.field4441 & 0x1) > 0 && class12.field112 == var9 && var13 >= 0 && (var14.field4469 + var13) < 104 && var12 >= 0 && var12 + var14.field4469 < 104) {
                        class248.field4287[var7] = new class156();
                        class156 var15 = class248.field4287[var7];
                        class239.field4120[class102.field1735++] = var7;
                        var15.field1274 = class56.field926;
                        var15.method1073(0, var14);
                        var15.method522(true, var15.field2793.field4469);
                        var15.field1275 = var15.field1296 = class276.field4857[var15.field2793.field4455];
                        var15.field1292 = var15.field2793.field4484;
                        var15.field1305 = var15.field2793.field4429;
                        var15.field1273 = var15.field2793.field4474;
                        var15.field1316 = var15.field2793.field4465;
                        var15.field1291 = var15.field2793.field4472;
                        var15.field1330 = var15.field2793.field4470;
                        var15.field1308 = var15.field2793.field4467;
                        if (var15.field1330 == 0) {
                            var15.field1296 = 0;
                        }
                        var15.field1328 = var15.field2793.field4457;
                        var15.method521(var12, var15.method516((byte) -65), var13, 7, true);
                    }
                }
            }
        }
        if (arg0 != -1) {
            method1489(-14);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)J")
    public static final long method1488(int arg0, int arg1, int arg2) {
        class216 var3 = class128.field2236[arg0][arg1][arg2];
        return var3 == null || var3.field3757 == null ? 0L : var3.field3757.field4889;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public static void method1489(int arg0) {
        field3918 = null;
        field3914 = null;
        field3913 = null;
        if (arg0 == 255) {
            field3912 = null;
            field3916 = null;
            field3917 = null;
        }
    }
}
