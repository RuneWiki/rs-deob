import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!u")
public class class40 extends class35 {

    @OriginalMember(owner = "mapview!u", name = "m", descriptor = "Lua;")
    public static class41 field495 = null;

    @OriginalMember(owner = "mapview!u", name = "n", descriptor = "Lua;")
    public static class41 field496 = class16.method86("Silver Shop", true);

    @OriginalMember(owner = "mapview!u", name = "l", descriptor = "Lua;")
    public static class41 field494 = class16.method86("Candle Shop", true);

    @OriginalMember(owner = "mapview!u", name = "j", descriptor = "Lua;")
    public static class41 field492 = class16.method86(" map", true);

    @OriginalMember(owner = "mapview!u", name = "p", descriptor = "Lua;")
    public class41 field498;

    @OriginalMember(owner = "mapview!u", name = "o", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field497;

    @OriginalMember(owner = "mapview!u", name = "k", descriptor = "[B")
    public static byte[] field493;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Z)B", line = 23)
    public static final byte method218(boolean arg0) {
        if (arg0) {
            field492 = null;
        }
        return class17.field146 == null ? 0 : class17.field146[class42.field514];
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(IJ)V", line = 48)
    public static final void method219(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (arg0 != 0) {
                field495 = null;
            }
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(B)V", line = 68)
    public static void method220(byte arg0) {
        field495 = null;
        field494 = null;
        field496 = null;
        field492 = null;
        field497 = null;
        int var1 = -14 / ((arg0 + 17) / 56);
        field493 = null;
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "(Z[B)V", line = 101)
    public static final void method221(boolean arg0, byte[] arg1) {
        class19 var2 = new class19(arg1);
        var2.field158 = arg1.length - 2;
        class11.field110 = var2.method99(255);
        class9.field95 = new int[class11.field110];
        class39.field478 = new byte[class11.field110][];
        class43.field541 = new int[class11.field110];
        class1.field3 = new int[class11.field110];
        class23.field245 = new int[class11.field110];
        var2.field158 = arg1.length - class11.field110 * 8 - 7;
        class9.field92 = var2.method99(255);
        mapview.field354 = var2.method99(255);
        int var3 = (var2.method100(-84) & 0xFF) + 1;
        if (!arg0) {
            method221(false, null);
        }
        for (int var4 = 0; var4 < class11.field110; var4++) {
            class23.field245[var4] = var2.method99(255);
        }
        for (int var5 = 0; var5 < class11.field110; var5++) {
            class43.field541[var5] = var2.method99(255);
        }
        for (int var6 = 0; var6 < class11.field110; var6++) {
            class9.field95[var6] = var2.method99(255);
        }
        for (int var7 = 0; var7 < class11.field110; var7++) {
            class1.field3[var7] = var2.method99(255);
        }
        var2.field158 = arg1.length - (var3 - 1) * 3 - class11.field110 * 8 - 7;
        class17.field150 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class17.field150[var8] = var2.method101((byte) -61);
            if (class17.field150[var8] == 0) {
                class17.field150[var8] = 1;
            }
        }
        var2.field158 = 0;
        for (int var9 = 0; var9 < class11.field110; var9++) {
            int var10 = class1.field3[var9];
            int var11 = class9.field95[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class39.field478[var9] = var13;
            int var14 = var2.method100(-50);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method106(-5902);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var11; var16++) {
                    for (int var17 = 0; var17 < var10; var17++) {
                        var13[var11 * var17 + var16] = var2.method106(-5902);
                    }
                }
            }
        }
    }
}
