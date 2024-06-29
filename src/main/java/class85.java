import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class85 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Lqp;")
    public static class466 field1258 = new class466("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "Lwj;")
    public static class270 field1263 = new class270(8, 3);

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Lkl;")
    public static class55 field1264 = new class55(8, 0, 4, 1);

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Ljv;")
    public static class56 field1262;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIII)V")
    public static final void method661(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class481.field7027.field5719 = 0;
        field1265++;
        class481.field7027.method2302(-4, class141.field2021.field311);
        class481.field7027.method2302(arg4 ^ 0xFFFF9497, arg0);
        class481.field7027.method2302(arg4 - 27503, arg2);
        class481.field7027.method2355(1686288168, arg1);
        class481.field7027.method2355(arg4 + 1686260669, arg3);
        class401.field5888 = 0;
        if (arg4 != 27499) {
            field1264 = null;
        }
        class522.field7733 = 0;
        class377.field5530 = -3;
        class66.field906 = 1;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IBLgg;)Lae;")
    public static final class164 method662(int arg0, byte arg1, class116 arg2) {
        field1261++;
        class164 var3;
        if (client.field2793 == null) {
            var3 = new class164();
        } else {
            var3 = client.field2793;
            client.field2793 = client.field2793.field2467;
            var3.field2467 = null;
            class391.field5738--;
        }
        var3.field2469 = arg0;
        if (arg1 != 14) {
            method663(true);
        }
        var3.field2468 = arg2;
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
    public static void method663(boolean arg0) {
        field1258 = null;
        field1264 = null;
        field1263 = null;
        if (arg0) {
            field1262 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static final void method664(byte arg0) {
        client.field2810.method2814((byte) 91);
        field1259++;
        for (class82 var1 = (class82) class526.field7778.method2818((byte) 105); var1 != null; var1 = (class82) class526.field7778.method2820((byte) -58)) {
            if (var1.field1230 < 1000) {
                var1.method1565(0);
                client.field2810.method2809(var1, 2);
            }
        }
        if (arg0 != -104) {
            method661(-92, 116, 126, 56, -93);
        }
        client.field2810.method2808(class526.field7778, -93);
        int var2 = -1;
        class528 var3 = (class528) class391.field5737.method2818((byte) -33);
        if (var3 != null) {
            var2 = var3.method2741(49);
        }
        if (!class181.field2659) {
            if (var2 == 0 && (class70.field990 == 1 && class274.field3764 > 2 || class442.method2634(-39))) {
                var2 = 2;
            }
            if (var2 == 2 && class274.field3764 > 0 && var3 != null) {
                if (class110.field1664 == null && class514.field7607 == 0) {
                    class323.method1870(var3.method2747(arg0 ^ 0xFFFFFF9D), var3.method2749(-2257), false);
                } else {
                    class296.field4073 = 2;
                }
            }
            if (var2 == 0 && class274.field3764 > 0) {
                class524.method3116(-109);
            }
            if (class110.field1664 != null || class514.field7607 != 0) {
                return;
            }
            class502.field7404 = null;
            class296.field4073 = 0;
            return;
        }
        if (var2 == -1) {
            int var4 = class518.field7668.method1813(0);
            int var5 = class518.field7668.method1822(arg0 ^ 0xFFFFFFE6);
            if ((class88.field1290 - 10) > var4 || class88.field1290 + class464.field6821 + 10 < var4 || var5 < (class263.field3634 - 10) || var5 > (class142.field2034 + class263.field3634 + 10)) {
                class181.field2659 = false;
                class270.method1613(class142.field2034, class464.field6821, class88.field1290, class263.field3634, arg0 + 104);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class88.field1290;
        int var7 = class263.field3634;
        int var8 = class464.field6821;
        int var9 = var3.method2749(-2257);
        int var10 = var3.method2747(arg0 + 109);
        int var11 = -1;
        for (int var12 = 0; var12 < class274.field3764; var12++) {
            if (class476.field6942) {
                int var17 = var7 + ((class274.field3764 + -1 + -var12) * 16) + 33;
                if (var9 > var6 && var9 < var6 + var8 && var17 - 13 < var10 && var10 < (var17 + 4)) {
                    var11 = var12;
                }
            } else {
                int var16 = (class274.field3764 - var12 - 1) * 16 + var7 + 31;
                if (var6 < var9 && var9 < var6 + var8 && var10 > var16 - 13 && var10 < var16 + 3) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class131 var14 = new class131(class526.field7778);
            for (class82 var15 = (class82) var14.method897(-117); var15 != null; var15 = (class82) var14.method900(-8)) {
                if (var11 == var13) {
                    class48.method426(var10, var9, var15, arg0 ^ 0x3F);
                }
                var13++;
            }
        }
        class181.field2659 = false;
        class270.method1613(class142.field2034, class464.field6821, class88.field1290, class263.field3634, arg0 ^ 0xFFFFFF98);
        return;
    }
}
