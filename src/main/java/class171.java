import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class class171 extends class455 {

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Z")
    public boolean field2545 = false;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Z")
    public boolean field2544 = false;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public int field2540;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public int field2542;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public int field2541;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Z")
    public static boolean field2539 = false;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Lak;")
    public static class234 field2543 = new class234("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Lnu;")
    public static class421 field2547 = new class421();

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Lhn;")
    public static class509 field2548 = new class509(51, 4);

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
    public static final void method1146(boolean arg0) {
        field2538++;
        if (class181.field2711 < 1024.0F) {
            class181.field2711 = 1024.0F;
        }
        while (class473.field6830 >= 16384.0F) {
            class473.field6830 -= 16384.0F;
        }
        if (class181.field2711 > 3072.0F) {
            class181.field2711 = 3072.0F;
        }
        while (class473.field6830 < 0.0F) {
            class473.field6830 += 16384.0F;
        }
        int var1 = class380.field5738 >> 7;
        int var2 = class468.field6767 >> 7;
        int var3 = class172.method1153(class154.field2286, -4, class380.field5738, class468.field6767);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && (class69.field976 - 4) > var1 && (class285.field4328 - 4) > var2) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class154.field2286;
                    if (var7 < 3 && class385.method2406(-17064, var5, var6)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class356.field5279.field3964 != null && class356.field5279.field3964[var7] != null) {
                        var8 = (class356.field5279.field3964[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var8 + var3 - class491.field7059[var7].method411(var5, var6);
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (!arg0) {
            method1146(true);
        }
        if (var10 > class40.field535) {
            class40.field535 += (var10 - class40.field535) / 24;
        } else if (class40.field535 > var10) {
            class40.field535 += (var10 - class40.field535) / 80;
        }
    }

    @OriginalMember(owner = "client!se", name = "g", descriptor = "(I)V")
    public static final void method1147(int arg0) {
        field2546++;
        if (arg0 == 1553722848) {
            class327.field4919.method2588(-127);
            class490.field7042.method2588(-108);
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
    public static void method1148(byte arg0) {
        if (arg0 != 96) {
            field2539 = false;
        }
        field2543 = null;
        field2548 = null;
        field2547 = null;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(IIIZZ)V")
    public class171(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field2540 = arg1;
        this.field2542 = arg2;
        this.field2541 = arg0;
        this.field2545 = arg4;
        this.field2544 = arg3;
    }
}
