import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public abstract class class100 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Lwl;")
    public static class452 field1369 = new class452(8, 3);

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field1374 = 0;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field1373 = 0;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "Lsc;")
    public static class239 field1372;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLjq;)Ljq;")
    public abstract class324 method637(byte arg0, class324 arg1);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
    public static final void method638(int arg0, int arg1) {
        class380 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class143 var4 = class85.field1201[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class265.field4044; var5++) {
                    for (int var6 = 0; var6 < class275.field4206; var6++) {
                        var2 = var4.method110(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class254.field3869;
                            int var8 = var5 << class254.field3869;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class143 var10 = class85.field1201[var9];
                                if (var10 != null) {
                                    int var11 = var4.method92(var6, var5) - var10.method92(var6, var5);
                                    int var12 = var4.method92(var6 + 1, var5) - var10.method92(var6 + 1, var5);
                                    int var13 = var4.method92(var6 + 1, var5 + 1) - var10.method92(var6 + 1, var5 + 1);
                                    int var14 = var4.method92(var6, var5 + 1) - var10.method92(var6, var5 + 1);
                                    var10.method94(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)I")
    public static final int method639(int arg0, int arg1) {
        if (class301.field4543 != null) {
            class301.field4543.method2163(true);
            class301.field4543 = null;
        }
        field1370++;
        class462.field6815++;
        if (class462.field6815 > 4) {
            class462.field6815 = 0;
            class103.field1403 = 0;
            return arg0;
        }
        class103.field1403 = 0;
        if (arg1 != 419) {
            method640((byte) -39);
        }
        if (class244.field3661 == class141.field1898) {
            class244.field3661 = class264.field4032;
        } else {
            class244.field3661 = class141.field1898;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static void method640(byte arg0) {
        if (arg0 <= 93) {
            field1371 = 20;
        }
        field1369 = null;
        field1372 = null;
    }
}
