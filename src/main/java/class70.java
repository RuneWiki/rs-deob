import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class70 extends Canvas {

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field1378;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "[Z")
    public static boolean[] field1381 = new boolean[100];

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field1376 = 0;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Lpj;")
    public static class237 field1379 = class33.method353(" <col=ffff00>", 14);

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "Lrk;")
    public static class257 field1385;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "[[[I")
    public static int[][][] field1386;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZIJI)Z")
    public static final boolean method569(boolean arg0, int arg1, long arg2, int arg3) {
        if (!arg0) {
            method570(59);
        }
        field1380++;
        int var5 = (int) arg2 >> 20 & 0x3;
        int var6 = ((int) arg2 & 0x7F454) >> 14;
        int var7 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class28 var8 = class94.method700(40, var7);
            int var9;
            int var10;
            if (var5 == 0 || var5 == 2) {
                var9 = var8.field571;
                var10 = var8.field507;
            } else {
                var9 = var8.field507;
                var10 = var8.field571;
            }
            int var11 = var8.field518;
            if (var5 != 0) {
                var11 = (var11 << var5 & 0xF) + (var11 >> 4 - var5);
            }
            class210.method1406(0, var9, arg3, arg1, 0, 2, (byte) -56, class229.field3911.field3743[0], var11, class229.field3911.field3715[0], true, var10);
        } else {
            class210.method1406(var5, 0, arg3, arg1, var6 + 1, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], true, 0);
        }
        class36.field788 = 2;
        class203.field3487 = class227.field3891;
        class36.field796 = class58.field1196;
        class135.field2351 = 0;
        return true;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static final void method570(int arg0) {
        field1384++;
        for (int var1 = -1; var1 < class258.field4439; var1++) {
            int var3;
            if (var1 == -1) {
                var3 = 2047;
            } else {
                var3 = class126.field2202[var1];
            }
            class271 var4 = class232.field4025[var3];
            if (var4 != null) {
                class256.method1728(var4.method1441((byte) 50), var4, (byte) 48);
            }
        }
        int var2 = -21 / ((-arg0 - 85) / 32);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V")
    public static void method571(boolean arg0) {
        field1379 = null;
        field1381 = null;
        field1385 = null;
        if (arg0) {
            method570(-128);
        }
        field1386 = null;
    }

    @OriginalMember(owner = "client!hj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field1383++;
        this.field1378.paint(arg0);
    }

    @OriginalMember(owner = "client!hj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field1377++;
        this.field1378.update(arg0);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)Lw;")
    public static final class141 method572(int arg0, int arg1) {
        if (arg0 != 20043) {
            return null;
        }
        int var2 = arg1 >> 16;
        field1382++;
        int var3 = arg1 & 0xFFFF;
        if (class22.field406[var2] == null || class22.field406[var2][var3] == null) {
            boolean var4 = class47.method434(0, var2);
            if (!var4) {
                return null;
            }
        }
        return class22.field406[var2][var3];
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class70(Component arg0) {
        this.field1378 = arg0;
    }
}
