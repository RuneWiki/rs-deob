import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class29 extends class589 {

    @OriginalMember(owner = "client!mca", name = "D", descriptor = "B")
    public byte field619 = 5;

    @OriginalMember(owner = "client!mca", name = "F", descriptor = "[I")
    public static int[] field621 = new int[4096];

    @OriginalMember(owner = "client!mca", name = "B", descriptor = "Ldc;")
    public static class5 field617 = new class5(7500);

    @OriginalMember(owner = "client!mca", name = "C", descriptor = "I")
    public int field618;

    @OriginalMember(owner = "client!mca", name = "G", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "client!mca", name = "H", descriptor = "I")
    public int field623;

    @OriginalMember(owner = "client!mca", name = "I", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "client!mca", name = "J", descriptor = "I")
    public int field625;

    @OriginalMember(owner = "client!mca", name = "K", descriptor = "I")
    public int field626;

    @OriginalMember(owner = "client!mca", name = "E", descriptor = "Z")
    public boolean field620;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)V")
    public static void method386(int arg0) {
        int var1 = -119 % ((arg0 + 47) / 60);
        field617 = null;
        field621 = null;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)V")
    public static final void method387(int arg0, int arg1) {
        class54 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class37 var4 = class399.field5631[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class302.field4057; var5++) {
                    for (int var6 = 0; var6 < class455.field6393; var6++) {
                        var2 = var4.method423(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class295.field3981;
                            int var8 = var5 << class295.field3981;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class37 var10 = class399.field5631[var9];
                                if (var10 != null) {
                                    int var11 = var4.method437(119, var5, var6) - var10.method437(87, var5, var6);
                                    int var12 = var4.method437(96, var5, var6 + 1) - var10.method437(121, var5, var6 + 1);
                                    int var13 = var4.method437(116, var5 + 1, var6 + 1) - var10.method437(112, var5 + 1, var6 + 1);
                                    int var14 = var4.method437(125, var5 + 1, var6) - var10.method437(90, var5 + 1, var6);
                                    var10.method429(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
