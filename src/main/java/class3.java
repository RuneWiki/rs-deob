import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public class class3 extends class10 {

    @OriginalMember(owner = "mapview!ba", name = "p", descriptor = "Lia;")
    public static class15 field24 = class28.method196("Archery Shop", false);

    @OriginalMember(owner = "mapview!ba", name = "q", descriptor = "Lia;")
    public static class15 field25 = class28.method196("u_pass", false);

    @OriginalMember(owner = "mapview!ba", name = "w", descriptor = "I")
    public static int field31 = 0;

    @OriginalMember(owner = "mapview!ba", name = "s", descriptor = "Lia;")
    public static class15 field27 = class28.method196("37(U", false);

    @OriginalMember(owner = "mapview!ba", name = "u", descriptor = "Lia;")
    public static class15 field29 = class28.method196("world", false);

    @OriginalMember(owner = "mapview!ba", name = "v", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "mapview!ba", name = "r", descriptor = "Lia;")
    public class15 field26;

    @OriginalMember(owner = "mapview!ba", name = "t", descriptor = "Ll;")
    public static class20 field28;

    @OriginalMember(owner = "mapview!ba", name = "x", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field32;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "([BI)V", line = 10)
    public static final void method16(byte[] arg0, int arg1) {
        class1 var2 = new class1(arg0);
        var2.field1 = arg0.length - 2;
        mapview.field336 = var2.method1(-1119584920);
        class25.field358 = new int[mapview.field336];
        class6.field60 = new int[mapview.field336];
        class9.field78 = new byte[mapview.field336][];
        class33.field471 = new int[mapview.field336];
        class30.field425 = new int[mapview.field336];
        var2.field1 = arg0.length - mapview.field336 * 8 - 7;
        mapview.field294 = var2.method1(-1119584920);
        field30 = var2.method1(-1119584920);
        int var3 = (var2.method5(-2) & 0xFF) + 1;
        for (int var4 = 0; var4 < mapview.field336; var4++) {
            class6.field60[var4] = var2.method1(-1119584920);
        }
        for (int var5 = 0; var5 < mapview.field336; var5++) {
            class30.field425[var5] = var2.method1(-1119584920);
        }
        for (int var6 = 0; var6 < mapview.field336; var6++) {
            class33.field471[var6] = var2.method1(-1119584920);
        }
        for (int var7 = 0; var7 < mapview.field336; var7++) {
            class25.field358[var7] = var2.method1(-1119584920);
        }
        var2.field1 = arg0.length - mapview.field336 * 8 - (var3 + -1) * 3 - 7;
        class10.field79 = new int[var3];
        if (arg1 >= -45) {
            field27 = null;
        }
        for (int var8 = 1; var8 < var3; var8++) {
            class10.field79[var8] = var2.method10((byte) 50);
            if (class10.field79[var8] == 0) {
                class10.field79[var8] = 1;
            }
        }
        var2.field1 = 0;
        for (int var9 = 0; var9 < mapview.field336; var9++) {
            int var10 = class25.field358[var9];
            int var11 = class33.field471[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class9.field78[var9] = var13;
            int var14 = var2.method5(-2);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method11(true);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var11; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var13[var11 * var16 + var15] = var2.method11(true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "([Lia;I)V", line = 143)
    public static final void method17(class15[] arg0, int arg1) {
        if (arg1 >= 78) {
            class25.method173(arg0.length, 0, arg0, (byte) -84);
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(B)V", line = 153)
    public static void method18(byte arg0) {
        if (arg0 < 85) {
            method19(65, 107, null, -26);
        }
        field32 = null;
        field24 = null;
        field28 = null;
        field29 = null;
        field25 = null;
        field27 = null;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(IILoa;I)[Lv;", line = 172)
    public static final class40[] method19(int arg0, int arg1, class27 arg2, int arg3) {
        if (arg0 < 100) {
            method18((byte) -120);
        }
        return class9.method49(arg2, -126, arg3, arg1) ? class9.method47(0) : null;
    }
}
