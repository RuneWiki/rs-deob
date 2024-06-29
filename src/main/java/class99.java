import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class99 extends class90 {

    @OriginalMember(owner = "client!bu", name = "w", descriptor = "Lo;")
    public static class332 field1405 = new class332("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!bu", name = "A", descriptor = "Lct;")
    public static class285 field1409 = new class285(33, -1);

    @OriginalMember(owner = "client!bu", name = "D", descriptor = "Lct;")
    public static class285 field1412 = new class285(46, 7);

    @OriginalMember(owner = "client!bu", name = "s", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "client!bu", name = "t", descriptor = "I")
    public int field1402;

    @OriginalMember(owner = "client!bu", name = "u", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!bu", name = "y", descriptor = "I")
    public int field1407;

    @OriginalMember(owner = "client!bu", name = "E", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!bu", name = "G", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!bu", name = "x", descriptor = "Lfc;")
    public static class239 field1406;

    @OriginalMember(owner = "client!bu", name = "v", descriptor = "Lsl;")
    public class422 field1404;

    @OriginalMember(owner = "client!bu", name = "B", descriptor = "Ljava/lang/String;")
    public String field1410;

    @OriginalMember(owner = "client!bu", name = "C", descriptor = "[I")
    public int[] field1411;

    @OriginalMember(owner = "client!bu", name = "H", descriptor = "[I")
    public int[] field1415;

    @OriginalMember(owner = "client!bu", name = "I", descriptor = "[Lfa;")
    public class371[] field1416;

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "[Ljava/lang/String;")
    public String[] field1408;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIZI)V", line = 12)
    public static final void method764(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field1403++;
        if (arg4) {
            class263.method1734((byte) 44);
        }
        if (class123.field1698 != null && (arg2 != 3 || class337.field5038.field3944 != arg3 || class337.field5038.field3948 != arg1)) {
            class475.method2766(class21.field261, class123.field1698, (byte) 78);
            class123.field1698 = null;
        }
        if (arg2 == 3 && class123.field1698 == null) {
            class123.field1698 = class24.method215(class21.field261, 0, arg3, 0, (byte) -21, arg1);
            if (class123.field1698 != null) {
                class337.field5038.field3944 = arg3;
                class337.field5038.field3948 = arg1;
                class337.field5038.method2208(-100, class21.field261);
            }
        }
        if (arg2 == 3 && class123.field1698 == null) {
            method764(arg0, -1, class337.field5038.field3947, -1, true, -95);
            return;
        }
        int var6 = 82 / ((-arg5 - 41) / 48);
        Container var7;
        if (class123.field1698 != null) {
            class321.field4794 = arg1;
            var7 = class123.field1698;
            class297.field4450 = arg3;
        } else if (class316.field4749 == null) {
            var7 = class21.field261.field2125;
            class297.field4450 = var7.getSize().width;
            class321.field4794 = var7.getSize().height;
        } else {
            Insets var8 = class316.field4749.getInsets();
            class297.field4450 = class316.field4749.getSize().width - var8.right - var8.left;
            class321.field4794 = class316.field4749.getSize().height - var8.bottom - var8.top;
            var7 = class316.field4749;
        }
        if (arg2 == 1) {
            class342.field5115 = class356.field5401;
            class73.field979 = (class297.field4450 - class356.field5401) / 2;
            class433.field6157 = 0;
            class233.field3411 = class4.field86;
        } else if (class45.field646 < 96 && class170.field2424 == 0) {
            int var9 = class297.field4450 > 1024 ? 1024 : class297.field4450;
            class73.field979 = (class297.field4450 - var9) / 2;
            class342.field5115 = var9;
            int var10 = class321.field4794 <= 768 ? class321.field4794 : 768;
            class233.field3411 = var10;
            class433.field6157 = 0;
        } else {
            class73.field979 = 0;
            class233.field3411 = class321.field4794;
            class342.field5115 = class297.field4450;
            class433.field6157 = 0;
        }
        if (class150.field2114 != class103.field1445) {
            boolean var10000;
            if (class342.field5115 < 1024 && class233.field3411 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg4) {
            class267.method1745(class170.field2424, -115);
        } else {
            class378.field5618.setSize(class342.field5115, class233.field3411);
            if (class138.field1976 != null) {
                class138.field1976.method546();
            }
            if (class316.field4749 == var7) {
                Insets var11 = class316.field4749.getInsets();
                class378.field5618.setLocation(class73.field979 + var11.left, class433.field6157 + var11.top);
            } else {
                class378.field5618.setLocation(class73.field979, class433.field6157);
            }
        }
        if (arg2 >= 2) {
            class106.field1486 = true;
        } else {
            class106.field1486 = false;
        }
        if (class279.field4220 != -1) {
            class355.method2187(true, -1);
        }
        if (class27.field335 != null && (class316.field4752 == 30 || class316.field4752 == 25)) {
            class81.method667((byte) -114);
        }
        for (int var12 = 0; var12 < 100; var12++) {
            class103.field1442[var12] = true;
        }
        class442.field6243 = true;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V", line = 174)
    public static void method765(byte arg0) {
        if (arg0 == 30) {
            field1406 = null;
            field1409 = null;
            field1405 = null;
            field1412 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIILt;)V", line = 188)
    public static final void method766(int arg0, int arg1, int arg2, int arg3, class367 arg4) {
        class337 var5 = class15.method139(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field5545 = (arg1 << class426.field6091) + class47.field683;
        arg4.field5543 = arg3;
        arg4.field5551 = (arg2 << class426.field6091) + class47.field683;
        for (class448 var7 = var5.field5054; var7 != null; var7 = var7.field6340) {
            if (var7.field6343.field4551) {
                int var8 = var7.field6343.method899(0);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field5543 += var6;
            arg4.field5549 = true;
        }
        var5.field5055 = arg4;
    }
}
