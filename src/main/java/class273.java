import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public abstract class class273 {

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field4805 = 0;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "Lka;")
    public static class245 field4804;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "[I")
    public static int[] field4806;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZB)V")
    public static final void method1860(boolean arg0, byte arg1) {
        field4807++;
        int var2 = -71 / ((arg1 + 41) / 55);
        byte var3 = 4;
        byte[][] var4 = class100.field1849;
        for (int var5 = 0; var5 < var3; var5++) {
            class154.method1175(95);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class125.field2195[var5][var6][var7];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x3D3C22A) >> 24;
                        if (!arg0 || var9 == 0) {
                            int var10 = (var8 & 0x6) >> 1;
                            int var11 = (var8 & 0xFFF823) >> 14;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class13.field262.length; var14++) {
                                if (class13.field262[var14] == var13 && var4[var14] != null) {
                                    class67.method585(var9, var7 * 8, var5, (var11 & 0x7) * 8, class112.field2007, (byte) -116, var10, (var12 & 0x7) * 8, var4[var14], arg0, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method115(int arg0, Component arg1);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)I")
    public abstract int method116(int arg0);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method114(Component arg0, int arg1);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V")
    public static final void method1861(int arg0, int arg1) {
        field4810++;
        class197 var2 = class164.method1228(2, arg0, -1665874464);
        if (arg1 < 115) {
            field4809 = -50;
        }
        var2.method1407(-105);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static void method1862(byte arg0) {
        field4806 = null;
        if (arg0 != 13) {
            field4804 = null;
        }
        field4804 = null;
    }
}
