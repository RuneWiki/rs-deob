import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class460 {

    @OriginalMember(owner = "client!og", name = "e", descriptor = "B")
    public byte field6580;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Llc;")
    public class459 field6582;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "S")
    public short field6577;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "B")
    public byte field6578;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "[I")
    public static int[] field6584;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "[I")
    public static int[] field6583;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Lla;")
    public static class316 field6579;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Z")
    public static final boolean method2712(int arg0, int arg1, int arg2) {
        field6585++;
        if (arg1 < 78) {
            return true;
        } else {
            return class418.method2463(arg0, 52, arg2) | (arg2 & 0x70000) != 0 || class454.method2705(arg2, 74, arg0);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public static void method2713(byte arg0) {
        field6583 = null;
        int var1 = -122 % ((53 - arg0) / 60);
        field6579 = null;
        field6584 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILqn;)V")
    public static final void method2714(int arg0, class47 arg1) {
        field6576++;
        class76.field986 = arg1.method488("p11_full", 99);
        class323.field4103 = arg1.method488("p12_full", 111);
        class520.field7519 = arg1.method488("b12_full", 91);
        class522.field7551 = arg1.method488("hitmarks", 93);
        class375.field4915 = arg1.method488("hitbar_default", 104);
        class87.field1086 = arg1.method488("timerbar_default", 84);
        class384.field5059 = arg1.method488("headicons_pk", 120);
        class227.field2910 = arg1.method488("headicons_prayer", arg0 ^ 0xFFFFE3C0);
        if (arg0 != -7267) {
            method2712(-47, -32, -50);
        }
        class161.field2056 = arg1.method488("hint_headicons", 103);
        class59.field764 = arg1.method488("hint_mapmarkers", 93);
        class411.field5869 = arg1.method488("mapflag", 93);
        class266.field3357 = arg1.method488("cross", 124);
        class348.field4488 = arg1.method488("mapdots", arg0 ^ 0xFFFFE3E5);
        class402.field5729 = arg1.method488("scrollbar", 117);
        class68.field886 = arg1.method488("name_icons", 119);
        class327.field4135 = arg1.method488("floorshadows", 98);
        class177.field2346 = arg1.method488("compass", 88);
        class354.field4545 = arg1.method488("otherlevel", arg0 ^ 0xFFFFE3FD);
        class80.field1027 = arg1.method488("hint_mapedge", 89);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
    public static final void method2715(byte arg0) {
        field6581++;
        if (class24.field347 != null) {
            return;
        }
        if (arg0 < 42) {
            field6584 = null;
        }
        Container var1;
        if (class123.field1656 == null) {
            var1 = class219.field2794.field6891;
        } else {
            var1 = class123.field1656;
        }
        class250.field3209 = var1.getSize().width;
        class3.field33 = var1.getSize().height;
        if (class123.field1656 == var1) {
            Insets var2 = class123.field1656.getInsets();
            class250.field3209 -= var2.right + var2.left;
            class3.field33 -= var2.top + var2.bottom;
        }
        if (class191.method1184(false) == 1) {
            class252.field3218 = 0;
            class174.field2262 = class470.field6826;
            class468.field6762 = (class250.field3209 - class470.field6826) / 2;
            class390.field5236 = class345.field4426;
        } else if (class105.field1333 < 96 && class377.field4959 == 0) {
            int var3 = class250.field3209 <= 1024 ? class250.field3209 : 1024;
            int var4 = class3.field33 <= 768 ? class3.field33 : 768;
            class468.field6762 = (class250.field3209 - var3) / 2;
            class174.field2262 = var3;
            class390.field5236 = var4;
            class252.field3218 = 0;
        } else {
            class252.field3218 = 0;
            class468.field6762 = 0;
            class390.field5236 = class3.field33;
            class174.field2262 = class250.field3209;
        }
        if (class324.field4107 != class218.field2784) {
            boolean var10000;
            if (class174.field2262 < 1024 && class390.field5236 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class8.field71.setSize(class174.field2262, class390.field5236);
        if (class33.field416 != null) {
            class33.field416.method315(class8.field71);
        }
        if (class123.field1656 == var1) {
            Insets var5 = class123.field1656.getInsets();
            class8.field71.setLocation(class468.field6762 + var5.left, class252.field3218 + var5.top);
        } else {
            class8.field71.setLocation(class468.field6762, class252.field3218);
        }
        if (class277.field3510 != -1) {
            class161.method1039(true, 79);
        }
        class160.method1032((byte) 75);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Llc;III)V")
    public class460(class459 arg0, int arg1, int arg2, int arg3) {
        this.field6580 = (byte) arg2;
        this.field6582 = arg0;
        this.field6577 = (short) arg1;
        this.field6578 = (byte) arg3;
    }

    static {
        new class328("", 76);
        field6584 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        field6583 = new int[1];
        new class335("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
    }
}
