import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class84 extends class171 {

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "[J")
    public static long[] field1144 = new long[200];

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "I")
    public static int field1151 = 0;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "J")
    public long field1148;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "Llk;")
    public class84 field1141;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "Llk;")
    public class84 field1143;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)V")
    public static void method523(int arg0) {
        int var1 = -108 / ((9 - arg0) / 58);
        field1144 = null;
    }

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "(I)V")
    public static final void method524(int arg0) {
        field1142++;
        int var1 = class233.field3521;
        if (arg0 != -1) {
            return;
        }
        int var2 = class110.field1531;
        int var3 = class33.field501 - class275.field4263 - var1;
        int var4 = client.field2194 - var2 - class197.field2739;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class11.field110 != null) {
                var5 = class11.field110;
            } else if (class17.field179 == null) {
                var5 = class200.field2784.field3715;
            } else {
                var5 = class17.field179;
            }
            int var6 = 0;
            int var7 = 0;
            if (class17.field179 == var5) {
                Insets var8 = class17.field179.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, client.field2194);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class33.field501, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class33.field501 - var3, var7, var3, client.field2194);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + client.field2194 - var4, class33.field501, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BI)C")
    public static final char method525(byte arg0, int arg1) {
        int var2 = arg0 & 0xFF;
        field1147++;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else if (arg1 == 30582) {
            if (var2 >= 128 && var2 < 160) {
                char var3 = class40.field599[var2 - 128];
                if (var3 == '\u0000') {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        } else {
            return (char) 65509;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lhc;Lhc;III)Lgf;")
    public static final class126 method526(class235 arg0, class235 arg1, int arg2, int arg3, int arg4) {
        field1146++;
        if (class57.method351(arg1, arg3, arg2, (byte) -82)) {
            if (arg4 != -6702) {
                field1144 = null;
            }
            return class156.method1034((byte) 29, arg0.method1576(-54, arg2, arg3));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
    public final void method527(boolean arg0) {
        field1149++;
        if (this.field1143 == null) {
            return;
        }
        if (arg0) {
            method528(90);
        }
        this.field1143.field1141 = this.field1141;
        this.field1141.field1143 = this.field1143;
        this.field1143 = null;
        this.field1141 = null;
    }

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "(I)Lcj;")
    public static final class119 method528(int arg0) {
        field1145++;
        try {
            return arg0 == 24161 ? (class119) Class.forName("bj").getDeclaredConstructor().newInstance() : null;
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(B)V")
    public static final void method529(byte arg0) {
        field1150++;
        if (arg0 >= 104) {
            class208.field2942.method546(-90762264);
        }
    }
}
