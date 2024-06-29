import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class106 {

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "[Lwb;")
    public static class171[] field1761;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 5)
    public static void method902(int arg0) {
        if (arg0 != 2048) {
            method904(40, -121, -117);
        }
        field1761 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)V", line = 16)
    public static final void method903(int arg0, boolean arg1) {
        field1762++;
        if (arg1) {
            field1761 = (class171[]) null;
        }
        int var2 = class269.field4309;
        int var3 = class32.field454;
        int var4 = class139.field2563;
        int var5 = class141.field2592;
        int var6 = class311.field4924;
        int var7 = (int) class288.field4590;
        if (var7 < (class138.field2553 / 256)) {
            var7 = class138.field2553 / 256;
        }
        if (class104.field1745[4] && (class42.field623[4] + 128) > var7) {
            var7 = class42.field623[4] + 128;
        }
        int var8 = (int) class83.field1331 + class263.field4257 & 0x7FF;
        class41.method343(var7, arg0, class53.field833, arg1, var7 * 3 + 600, var8, class223.method1627((byte) -120, class218.field3632.field1985, class218.field3632.field2036, class205.field3497) - 50, class139.field2556);
        if (class269.field4309 == var2 && class139.field2563 == var4 && class32.field454 == var3 && class141.field2592 == var5 && class311.field4924 == var6) {
            class191.field3194 = 1;
            return;
        }
        class303.field4789 = 10;
        class304.field4812 = 10;
        class304.field4821 = 10;
        class286.field4550 = 10;
        if (class269.field4309 > var2) {
            var2 += (class269.field4309 - var2) * class304.field4821 / 1000 + class304.field4812;
            if (var2 < class269.field4309) {
                class269.field4309 = var2;
            }
        }
        if (var2 > class269.field4309) {
            int var9 = var2 - ((var2 - class269.field4309) * class304.field4821 / 1000 + class304.field4812);
            if (class269.field4309 < var9) {
                class269.field4309 = var9;
            }
        }
        if (var3 < class32.field454) {
            var3 += (class32.field454 - var3) * class304.field4821 / 1000 + class304.field4812;
            if (var3 < class32.field454) {
                class32.field454 = var3;
            }
        }
        if (var3 > class32.field454) {
            int var10 = var3 - ((var3 - class32.field454) * class304.field4821 / 1000 + class304.field4812);
            if (var10 > class32.field454) {
                class32.field454 = var10;
            }
        }
        if (class139.field2563 > var4) {
            var4 += (class139.field2563 - var4) * class304.field4821 / 1000 + class304.field4812;
            if (class139.field2563 > var4) {
                class139.field2563 = var4;
            }
        }
        if (class141.field2592 > var5) {
            var5 += (class141.field2592 - var5) * class286.field4550 / 1000 + class303.field4789;
            if (var5 < class141.field2592) {
                class141.field2592 = var5;
            }
        }
        int var11 = class311.field4924 - var6;
        if (class139.field2563 < var4) {
            int var12 = var4 - ((var4 - class139.field2563) * class304.field4821 / 1000 + class304.field4812);
            if (class139.field2563 < var12) {
                class139.field2563 = var12;
            }
        }
        if (var11 > 1024) {
            var11 -= 2048;
        }
        if (var11 < -1024) {
            var11 += 2048;
        }
        if (var11 > 0) {
            int var13 = class303.field4789 + (class286.field4550 * var11 / 1000) + var6;
            var6 = var13 & 0x7FF;
        }
        if (var11 < 0) {
            int var14 = var6 - (-var11 * class286.field4550 / 1000 + class303.field4789);
            var6 = var14 & 0x7FF;
        }
        if (class141.field2592 < var5) {
            int var15 = var5 - (class303.field4789 + ((var5 - class141.field2592) * class286.field4550 / 1000));
            if (class141.field2592 < var15) {
                class141.field2592 = var15;
            }
        }
        int var16 = class311.field4924 - var6;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 >= 0 || var11 <= 0 || var16 > 0 && var11 < 0) {
            class311.field4924 = var6;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)Lp;", line = 164)
    public static final class112 method904(int arg0, int arg1, int arg2) {
        class257 var3 = class279.field4430[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class112 var4 = var3.field4167;
            var3.field4167 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILcg;)V", line = 183)
    public static final void method905(int arg0, class49 arg1) {
        int var2 = -32 / ((arg0 + 36) / 50);
        field1763++;
        class107.field1831 = arg1.method437((byte) -33, "titlebg");
        class178.field3026 = arg1.method437((byte) -33, "logo");
    }
}
