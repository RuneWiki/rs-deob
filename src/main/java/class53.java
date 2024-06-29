import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class class53 extends class81 {

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "Lsg;")
    public static class30 field1178 = class167.method1221((byte) 33, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "[I")
    public static int[] field1181 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "Lsg;")
    private static class30 field1182 = class167.method1221((byte) 33, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
    public static int field1184 = 0;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "Lsg;")
    public static class30 field1177 = field1182;

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "Lsg;")
    public static class30 field1188 = class167.method1221((byte) 33, "Fps:");

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
    public static int field1189 = 0;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(Z)Z")
    public abstract boolean method517(boolean arg0);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIILeh;Z)V")
    public static final void method518(int arg0, int arg1, int arg2, int arg3, class138 arg4, boolean arg5) {
        field1183++;
        if (class233.field4153 >= 50 || arg4.field2685 == null || arg4.field2685.length <= arg3 || arg4.field2685[arg3] == null) {
            return;
        }
        int var6 = arg4.field2685[arg3][0];
        int var7 = var6 >> 4 & 0x7;
        if (arg2 >= -126) {
            return;
        }
        int var8 = var6 >> 8;
        int var9 = var6 & 0xF;
        if (arg4.field2685[arg3].length > 1) {
            int var10 = (int) (Math.random() * (double) arg4.field2685[arg3].length);
            if (var10 > 0) {
                var8 = arg4.field2685[arg3][var10];
            }
        }
        if (var9 == 0) {
            if (arg5) {
                class33.method332(false, var7, 0, var8);
            }
        } else if (class169.field3185 != 0) {
            class277.field4826[class233.field4153] = var8;
            int var11 = (arg0 - 64) / 128;
            int var12 = (arg1 - 64) / 128;
            class25.field483[class233.field4153] = var7;
            class272.field4765[class233.field4153] = 0;
            class193.field3494[class233.field4153] = null;
            class22.field419[class233.field4153] = (var11 << 16) + (var12 << 8) + var9;
            class233.field4153++;
        }
    }

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "(I)V")
    public static void method519(int arg0) {
        field1181 = null;
        int var1 = 75 / ((arg0 - 34) / 44);
        field1177 = null;
        field1188 = null;
        field1182 = null;
        field1178 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static final void method520(byte arg0) {
        Container var1;
        if (class259.field4569 != null) {
            var1 = class259.field4569;
        } else if (class261.field4614 == null) {
            var1 = class190.field3452.field1449;
        } else {
            var1 = class261.field4614;
        }
        field1187++;
        class222.field3988 = var1.getSize().width;
        class93.field1885 = var1.getSize().height;
        if (arg0 > -105) {
            return;
        }
        if (class261.field4614 == var1) {
            Insets var2 = class261.field4614.getInsets();
            class93.field1885 -= var2.top + var2.bottom;
            class222.field3988 -= var2.right + var2.left;
        }
        if (class150.method1089((byte) 67) < 2) {
            class80.field1724 = (class222.field3988 - 765) / 2;
            class15.field324 = 765;
            class238.field4238 = 503;
            class40.field1005 = 0;
        } else {
            class238.field4238 = class93.field1885;
            class80.field1724 = 0;
            class15.field324 = class222.field3988;
            class40.field1005 = 0;
        }
        class224.field4021.setSize(class15.field324, class238.field4238);
        if (class261.field4614 == var1) {
            Insets var3 = class261.field4614.getInsets();
            class224.field4021.setLocation(var3.left + class80.field1724, class40.field1005 + var3.top);
        } else {
            class224.field4021.setLocation(class80.field1724, class40.field1005);
        }
        if (class196.field3548 != -1) {
            class73.method671(73, true);
        }
        class1.method8(6447);
    }

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method521(int arg0);
}
