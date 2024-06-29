import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class class44 {

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "Lrd;")
    public static class117 field1239 = class95.method812("hitmarks", (byte) 8);

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Lrd;")
    public static class117 field1243 = class95.method812("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", (byte) 8);

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "Lrd;")
    public static class117 field1251 = class95.method812("Ihre Nachricht an: ", (byte) 8);

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "Lrd;")
    private static class117 field1249 = class95.method812("Loading friend list", (byte) 8);

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field1244 = 0;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field1252 = 0;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "Lrd;")
    public static class117 field1248 = field1249;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field1256 = 2;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field1255 = -1;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "Lrd;")
    public static class117 field1257 = class95.method812("Nehmen", (byte) 8);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public int field1245;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public int field1246;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "Lra;")
    public static class114 field1241;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Lge;")
    public static class47 field1240;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "Ljava/awt/Image;")
    public Image field1247;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "[I")
    public int[] field1250;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public static void method483(byte arg0) {
        field1249 = null;
        field1251 = null;
        field1239 = null;
        int var1 = -88 % ((arg0 - 69) / 52);
        field1248 = null;
        field1241 = null;
        field1257 = null;
        field1243 = null;
        field1240 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)Z")
    public static final boolean method484(int arg0, int arg1, int arg2) {
        field1253++;
        if (arg0 == 0 && class2.field60 == arg2) {
            return true;
        } else if (arg0 == arg1 && class23.field654 == arg2) {
            return true;
        } else {
            return (arg0 == 2 || arg0 == 3) && class72.field2010 == arg2;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method485(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
    public abstract void method486(int arg0, byte arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BZ)V")
    public static final void method487(byte arg0, boolean arg1) {
        field1254++;
        if (arg0 != 35) {
            method484(12, -14, 56);
        }
        for (int var2 = 0; var2 < class24.field678; var2++) {
            int var3 = (class95.field2379[var2] << 14) + 536870912;
            class36 var4 = class93.field2334[class95.field2379[var2]];
            if (var4 != null && var4.method265(-40) && arg1 == var4.field1061.field403 && var4.field1061.method185(arg0 + 58)) {
                int var5 = var4.field751 >> 7;
                int var6 = var4.field717 >> 7;
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    if (var4.field689 == 1 && (var4.field717 & 0x7F) == 64 && (var4.field751 & 0x7F) == 64) {
                        if (class71.field1974[var6][var5] == class128.field3112) {
                            continue;
                        }
                        class71.field1974[var6][var5] = class128.field3112;
                    }
                    if (!var4.field1061.field420) {
                        var3 += Integer.MIN_VALUE;
                    }
                    class90.field2308.method323(class120.field2940, var4.field717, var4.field751, class133.method1091(class120.field2940, var4.field689 * 64 + var4.field751 - 64, (byte) -7, var4.field689 * 64 + var4.field717 - 64), var4.field689 * 64 - 4, var4, var4.field697, var3, var4.field690);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    protected class44() {
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public final void method488(int arg0) {
        if (arg0 == -7913) {
            field1238++;
            class145.method1166(this.field1250, this.field1245, this.field1246);
        }
    }
}
