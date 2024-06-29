import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public abstract class class70 {

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Lv;")
    public static class147 field1285 = new class147(500);

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "Leb;")
    private static class230 field1293 = class68.method589(0, "flash3:");

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "Leb;")
    public static class230 field1292 = class68.method589(0, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "Leb;")
    public static class230 field1294 = field1293;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "Leb;")
    public static class230 field1295 = field1293;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIBII)V")
    public void method602(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1290++;
        int var6 = -17 / ((-arg2 - 32) / 58);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lhj;IIIZ)V")
    public void method603(class70 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1289++;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "()I")
    public abstract int method496();

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lfh;Z)V")
    public static final void method604(class129 arg0, boolean arg1) {
        class196.field3510 = 3;
        class235 var2 = null;
        class123.method959(1, true);
        class47.field837 = true;
        class231.field4020 = 127;
        class16.field365 = 255;
        class18.field404 = arg1;
        class154.field2748 = true;
        class190.field3354 = 0;
        class154.field2749 = 0;
        class127.field2228 = true;
        class123.field2163 = true;
        class206.field3633 = 2;
        class8.field126 = true;
        class249.field4425 = true;
        field1291++;
        class42.field774 = true;
        class99.field1833 = true;
        class16.field371 = 0;
        class8.field129 = 0;
        class263.field4672 = true;
        class23.field437 = 0;
        class191.field3372 = true;
        class97.field1790 = 127;
        class246.field4377 = true;
        try {
            class193 var3 = arg0.method1020(0, "runescape");
            while (var3.field3421 == 0) {
                class52.method417((byte) -115, 1L);
            }
            if (var3.field3421 == 1) {
                var2 = (class235) var3.field3423;
                byte[] var4 = new byte[(int) var2.method1655(26852)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1656(var4.length - var5, -31517, var5, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class200.method1413(new class14(var4), false);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1654(68);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)Lhj;")
    public class70 method605(int arg0, int arg1, int arg2) {
        field1288++;
        return this;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIZIIII)V")
    public static final void method606(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class272.field4802 = arg4;
        field1283++;
        class13.field264 = arg1;
        class210.field3676 = arg6;
        class178.field3123 = arg5;
        if (arg3 != 128) {
            field1293 = null;
        }
        class89.field1566 = arg0;
        if (arg2 && class13.field264 >= 100) {
            class176.field3099 = class89.field1566 * 128 + 64;
            class77.field1403 = class210.field3676 * 128 + 64;
            class263.field4681 = class37.method333(class77.field1403, 1637367879, class124.field2174, class176.field3099) - class272.field4802;
        }
        class229.field3948 = 2;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "()Z")
    public boolean method607() {
        field1287++;
        return false;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static void method608(int arg0) {
        field1292 = null;
        field1293 = null;
        field1295 = null;
        if (arg0 == 2) {
            field1294 = null;
            field1285 = null;
        }
    }
}
