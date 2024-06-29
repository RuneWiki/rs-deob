import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class225 {

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "Lhn;")
    public static class509 field3677 = new class509(70, 8);

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "Lak;")
    public static class234 field3678 = new class234("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
    public static int field3679 = 328;

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "Lrj;")
    public static class424 field3674;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
    public static final void method1602(byte arg0) {
        field3676++;
        if (class440.field6454) {
            return;
        }
        if (arg0 > -19) {
            method1603(49);
        }
        class440.field6454 = true;
        if (class193.field3258.field7239) {
            class181.field2711 = ((int) class181.field2711 + 47 & 0xFFFFFFF0);
        } else {
            class52.field654 += (12.0F - class52.field654) / 2.0F;
        }
        class471.field6814 = true;
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
    public static final void method1603(int arg0) {
        field3675++;
        if (class168.field2489 != null) {
            return;
        }
        if (arg0 > -15) {
            method1603(-74);
        }
        Container var1;
        if (class281.field4281 == null) {
            var1 = class360.field5349.field5199;
        } else {
            var1 = class281.field4281;
        }
        class468.field6769 = var1.getSize().width;
        class173.field2593 = var1.getSize().height;
        if (class281.field4281 == var1) {
            Insets var2 = class281.field4281.getInsets();
            class468.field6769 -= var2.right + var2.left;
            class173.field2593 -= var2.top + var2.bottom;
        }
        if (class32.method223((byte) 126) == 1) {
            class13.field195 = (class468.field6769 - class374.field5608) / 2;
            class76.field1105 = class498.field7160;
            class80.field1163 = class374.field5608;
            class415.field6197 = 0;
        } else if (class494.field7129 < 96 && class96.field1384 == 0) {
            int var3 = class468.field6769 > 1024 ? 1024 : class468.field6769;
            class13.field195 = (class468.field6769 - var3) / 2;
            int var4 = class173.field2593 > 768 ? 768 : class173.field2593;
            class80.field1163 = var3;
            class415.field6197 = 0;
            class76.field1105 = var4;
        } else {
            class76.field1105 = class173.field2593;
            class415.field6197 = 0;
            class13.field195 = 0;
            class80.field1163 = class468.field6769;
        }
        if (class310.field4662 != class125.field1855) {
            boolean var10000;
            if (class80.field1163 < 1024 && class76.field1105 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class111.field1557.setSize(class80.field1163, class76.field1105);
        if (class377.field5692 != null) {
            class377.field5692.method274(class111.field1557);
        }
        if (class281.field4281 == var1) {
            Insets var5 = class281.field4281.getInsets();
            class111.field1557.setLocation(class13.field195 + var5.left, class415.field6197 + var5.top);
        } else {
            class111.field1557.setLocation(class13.field195, class415.field6197);
        }
        if (class155.field2310 != -1) {
            class128.method939(465824240, true);
        }
        class456.method2771(0);
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)V")
    public static void method1604(int arg0) {
        field3674 = null;
        if (arg0 != -12299) {
            field3674 = null;
        }
        field3677 = null;
        field3678 = null;
    }
}
