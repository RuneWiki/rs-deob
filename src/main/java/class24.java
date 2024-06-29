import java.awt.Component;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public abstract class class24 {

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Lc;")
    public static class15 field382 = new class15();

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field390 = 20;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Z")
    public static boolean field388 = false;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Ljava/util/Calendar;")
    public static Calendar field386 = Calendar.getInstance();

    @OriginalMember(owner = "client!db", name = "l", descriptor = "Lv;")
    private static class146 field392 = class159.method1226((byte) -37, "To play on this world move to a free area first");

    @OriginalMember(owner = "client!db", name = "k", descriptor = "Lv;")
    public static class146 field391 = class159.method1226((byte) -37, "Sprites geladen)3");

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Lv;")
    public static class146 field393 = field392;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Lv;")
    public static class146 field394 = class159.method1226((byte) -37, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Ldc;")
    public static class25 field389;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "[I")
    public static int[] field387;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "[Lv;")
    public static class146[] field395;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method145(int arg0) {
        field386 = null;
        field389 = null;
        field382 = null;
        field395 = null;
        field393 = null;
        field392 = null;
        if (arg0 == -23) {
            field394 = null;
            field387 = null;
            field391 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIBII)V")
    public static final void method146(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        class138.field3128[0].method1065(arg4, arg2);
        class138.field3128[1].method1065(arg4, arg2 + arg5 - 16);
        int var6 = (arg5 - 32) * arg5 / arg1;
        if (var6 < 8) {
            var6 = 8;
        }
        class56.method382(arg4, arg2 + 16, 16, arg5 - 32, class17.field273);
        if (arg3 != 123) {
            field393 = null;
        }
        field384++;
        int var7 = (arg5 - var6 - 32) * arg0 / (arg1 - arg5);
        class56.method382(arg4, arg2 + var7 + 16, 16, var6, class125.field2894);
        class56.method386(arg4, arg2 + var7 + 16, var6, class122.field2835);
        class56.method386(arg4 + 1, arg2 + var7 + 16, var6, class122.field2835);
        class56.method392(arg4, arg2 + var7 + 16, 16, class122.field2835);
        class56.method392(arg4, var7 + arg2 + 17, 16, class122.field2835);
        class56.method386(arg4 + 15, arg2 + 16 + var7, var6, class77.field1869);
        class56.method386(arg4 + 14, var7 + 17 + arg2, var6 - 1, class77.field1869);
        class56.method392(arg4, arg2 + var6 + var7 + 15, 16, class77.field1869);
        class56.method392(arg4 + 1, arg2 + 14 + var6 + var7, 15, class77.field1869);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method147(int arg0, Component arg1);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method148(Component arg0, int arg1);

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)I")
    public abstract int method149(int arg0);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)Z")
    public static final boolean method150(int arg0, int arg1, int arg2, int arg3) {
        field385++;
        int var4 = class66.field1496.method1196(class148.field3428, arg0, arg3, arg1);
        int var5 = arg1 >> 14 & 0x7FFF;
        if (var4 == -1) {
            return false;
        }
        int var6 = var4 >> 6 & 0x3;
        int var7 = var4 & 0x1F;
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class69 var8 = class124.method928(-1, var5);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var10 = var8.field1597;
                var9 = var8.field1584;
            } else {
                var9 = var8.field1597;
                var10 = var8.field1584;
            }
            int var11 = var8.field1599;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class81.method617(0, var11, arg0, 1, 0, var9, true, arg3, var10, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
        } else {
            class81.method617(var6, 0, arg0, 1, var7 + 1, 0, true, arg3, 0, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
        }
        class141.field3221 = 2;
        class72.field1687 = class25.field401;
        if (arg2 != -17368) {
            method146(113, 125, 51, (byte) -101, 25, -94);
        }
        class72.field1688 = 0;
        class13.field205 = class90.field2150;
        return true;
    }
}
