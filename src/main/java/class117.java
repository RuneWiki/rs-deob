import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class117 {

    @OriginalMember(owner = "client!un", name = "c", descriptor = "Lhb;")
    public static class250 field1636 = new class250(44, -1);

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public int field1634;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public int field1635;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public int field1640;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "Ldt;")
    public static class164 field1643;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "Lli;")
    public static class382 field1641;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "Z")
    public boolean field1642;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lqa;Lea;ILeo;IIIII)V", line = 3)
    public static final void method753(class129 arg0, class113 arg1, int arg2, class423 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1637++;
        class429 var9 = field1643.method1093(arg6, 84);
        if (var9 != null && var9.field5889 && var9.method2544(class198.field2555, -56)) {
            if (var9.field5901 != null) {
                int[] var10 = new int[var9.field5901.length];
                for (int var11 = 0; var11 < var10.length / 2; var11++) {
                    int var13;
                    if (class396.field5271 == 4) {
                        var13 = (int) class244.field3138 & 0x3FFF;
                    } else {
                        var13 = (int) class244.field3138 + class446.field6192 & 0x3FFF;
                    }
                    int var14 = class21.field385[var13];
                    int var15 = class21.field397[var13];
                    if (class396.field5271 != 4) {
                        var14 = var14 * 256 / (class364.field4694 + 256);
                        var15 = var15 * 256 / (class364.field4694 + 256);
                    }
                    var10[var11 * 2] = arg3.field5735 / 2 + (arg7 + ((arg4 + (var9.field5901[var11 * 2 + 1] * 4)) * var14 + (var9.field5901[var11 * 2] * 4 + arg2) * var15 >> 15));
                    var10[var11 * 2 + 1] = arg3.field5726 / 2 + arg5 - ((var9.field5901[var11 * 2 + 1] * 4 + arg4) * var15 + -((arg2 - -(var9.field5901[var11 * 2] * 4)) * var14) >> 15);
                }
                class427.method2533(arg0, var10, var9.field5917, arg3.field5778, arg3.field5817);
                for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                    arg0.method869(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[var12 * 2 + 2 + 1], var9.field5909, 1, arg1, arg7, arg5);
                }
                arg0.method869(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field5909, 1, arg1, arg7, arg5);
            }
            class404 var16 = null;
            if (var9.field5875 != -1) {
                var16 = var9.method2540(false, (byte) 65, arg0);
                if (var16 != null) {
                    class519.method3087(arg7, arg1, arg4, (byte) -120, arg2, arg3, arg5, var16);
                }
            }
            if (var9.field5916 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method378();
                }
                class167 var18 = class254.field3211;
                class278 var19 = class113.field1553;
                if (var9.field5899 == 1) {
                    var19 = class99.field1379;
                    var18 = class43.field635;
                }
                if (var9.field5899 == 2) {
                    var18 = class200.field2590;
                    var19 = class157.field2070;
                }
                class93.method636(var9.field5916, arg3, var18, arg4, var9.field5894, var17, arg5, var19, arg1, 121532524, arg7, arg2);
            }
        }
        if (arg8 != 1) {
            method755(-124, -2);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V", line = 104)
    public static void method754(byte arg0) {
        if (arg0 <= 81) {
            method753(null, null, -120, null, -104, -110, -44, -121, 22);
        }
        field1641 = null;
        field1643 = null;
        field1636 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)V", line = 122)
    public static final void method755(int arg0, int arg1) {
        field1639++;
        if (class40.field588 == arg0) {
            return;
        }
        class200.field2594 = class118.field1647 = class76.field960[arg0];
        class63.method360((byte) 76);
        class46.field674 = new int[4][class200.field2594 >> 3][class118.field1647 >> 3];
        class497.field7276 = new int[class200.field2594][class118.field1647];
        class484.field7043 = new int[class200.field2594][class118.field1647];
        for (int var2 = 0; var2 < 4; var2++) {
            class171.field2215[var2] = class116.method751((byte) -84, class200.field2594, class118.field1647);
        }
        if (arg1 != -23294) {
            field1636 = null;
        }
        class478.field6978 = new byte[4][class200.field2594][class118.field1647];
        class315.method1876(class200.field2594, 101, class118.field1647, 4);
        class143.method994(0, class512.field7538, class118.field1647 >> 3, class200.field2594 >> 3);
        class40.field588 = arg0;
    }
}
