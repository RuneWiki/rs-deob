import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class174 extends class202 {

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "Loh;")
    public static class263 field3158 = class253.method1681(-119, "welle2:");

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "Loh;")
    public static class263 field3163 = class253.method1681(-126, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "Loh;")
    public static class263 field3168 = class253.method1681(-123, "Lade)3)3)3");

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "I")
    private int field3164;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    public int field3165;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "Loh;")
    public class263 field3169;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lsi;ZI)V")
    private final void method1144(class194 arg0, boolean arg1, int arg2) {
        field3157++;
        if (arg1) {
            return;
        }
        if (arg2 == 1) {
            this.field3164 = arg0.method1301(-8317);
        } else if (arg2 == 2) {
            this.field3165 = arg0.method1266(4);
        } else if (arg2 == 5) {
            this.field3169 = arg0.method1320(false);
            return;
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)Z")
    public final boolean method1145(int arg0) {
        field3162++;
        if (arg0 == -18954) {
            return this.field3164 == 115;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lsi;Z)V")
    public final void method1146(class194 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field3160++;
        while (true) {
            int var3 = arg0.method1301(-8317);
            if (var3 == 0) {
                return;
            }
            this.method1144(arg0, false, var3);
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)V")
    public static void method1147(boolean arg0) {
        field3168 = null;
        field3158 = null;
        if (!arg0) {
            field3163 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
    public static final void method1148(int arg0) {
        if (arg0 != 9559) {
            method1151(109, -69);
        }
        field3167++;
        try {
            if (class177.field3242 == 1) {
                int var1 = class63.field1275.method1171((byte) 111);
                if (var1 > 0 && class63.field1275.method1193(arg0 - 9432)) {
                    int var2 = var1 - class181.field3294;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class63.field1275.method1166(true, var2);
                } else {
                    class63.field1275.method1187(-14331);
                    class63.field1275.method1175(40);
                    class107.field2031 = null;
                    if (class71.field1431 == null) {
                        class177.field3242 = 0;
                    } else {
                        class177.field3242 = 2;
                    }
                    class29.field731 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class63.field1275.method1187(-14331);
            class29.field731 = null;
            class107.field2031 = null;
            class177.field3242 = 0;
            class71.field1431 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(Z)V")
    public static final void method1149(boolean arg0) {
        if (!arg0) {
            return;
        }
        field3159++;
        int var1 = class200.field3621;
        int var2 = class225.field3964 - var1 - class143.field2616;
        int var3 = class114.field2138;
        int var4 = class195.field3527 - var3 - class138.field2558;
        if (var3 <= 0 && var4 <= 0 && var1 <= 0 && var2 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class90.field1774 != null) {
                var5 = class90.field1774;
            } else if (class130.field2381 == null) {
                var5 = class95.field1867.field4557;
            } else {
                var5 = class130.field2381;
            }
            int var6 = 0;
            int var7 = 0;
            if (class130.field2381 == var5) {
                Insets var8 = class130.field2381.getInsets();
                var7 = var8.left;
                var6 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var3 > 0) {
                var9.fillRect(var7, var6, var3, class225.field3964);
            }
            if (var1 > 0) {
                var9.fillRect(var7, var6, class195.field3527, var1);
            }
            if (var4 > 0) {
                var9.fillRect(var7 + class195.field3527 - var4, var6, var4, class225.field3964);
            }
            if (var2 > 0) {
                var9.fillRect(var7, class225.field3964 + var6 - var2, class195.field3527, var2);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)[Lw;")
    public static final class141[] method1150(int arg0) {
        field3161++;
        class141[] var1 = new class141[class31.field781];
        for (int var2 = arg0; var2 < class31.field781; var2++) {
            int var3 = class198.field3583[var2] * class181.field3289[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class191.field3425[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class103.field1965[class263.method1777(var5[var6], 255)];
            }
            var1[var2] = new class140(class240.field4200, class2.field46, class198.field3584[var2], class46.field1003[var2], class198.field3583[var2], class181.field3289[var2], var4);
        }
        class14.method111(0);
        return var1;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)V")
    public static final void method1151(int arg0, int arg1) {
        field3166++;
        class12.field312.method829(arg1, (byte) -111);
        if (arg0 != -32159) {
            method1151(-3, 78);
        }
    }
}
