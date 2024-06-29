import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public abstract class class149 {

    @OriginalMember(owner = "client!g", name = "c", descriptor = "S")
    public static short field2564 = 32767;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lwa;")
    public static class75 field2562 = class66.method560("Schlie-8en", false);

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Lwa;")
    public static class75 field2570 = class66.method560("details", false);

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Loh;")
    public static class15 field2569;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 32)
    public static final void method1146(byte arg0) {
        class301.method2069();
        for (int var1 = 0; var1 < 4; var1++) {
            class286.field4931[var1].method815(64);
        }
        if (arg0 != -38) {
            method1149(8, 62);
        }
        field2565++;
        System.gc();
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V", line = 53)
    public static final void method1147(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2568++;
        int var5 = 0;
        int var6 = -arg2;
        if (arg4 != 27268) {
            return;
        }
        int var7 = arg2;
        int var8 = -1;
        int var9 = class14.method74(class288.field4956, arg2 + arg3, -1178441849, class153.field2635);
        int var10 = class14.method74(class288.field4956, arg3 - arg2, -1178441849, class153.field2635);
        class150.method1151(7, class63.field1096[arg1], var10, arg0, var9);
        while (var5 < var7) {
            var8 += 2;
            var6 += var8;
            if (var6 > 0) {
                var7--;
                int var11 = arg1 + var7;
                int var12 = arg1 - var7;
                if (var11 >= class90.field1495 && class294.field5041 >= var12) {
                    int var13 = class14.method74(class288.field4956, arg3 + var5, -1178441849, class153.field2635);
                    int var14 = class14.method74(class288.field4956, arg3 - var5, arg4 + -1178469117, class153.field2635);
                    if (class294.field5041 >= var11) {
                        class150.method1151(7, class63.field1096[var11], var14, arg0, var13);
                    }
                    if (class90.field1495 <= var12) {
                        class150.method1151(7, class63.field1096[var12], var14, arg0, var13);
                    }
                }
                var6 -= var7 << 1;
            }
            var5++;
            int var15 = arg1 - var5;
            int var16 = arg1 + var5;
            if (class90.field1495 <= var16 && class294.field5041 >= var15) {
                int var17 = class14.method74(class288.field4956, arg3 + var7, -1178441849, class153.field2635);
                int var18 = class14.method74(class288.field4956, arg3 - var7, arg4 ^ 0xB9C20D03, class153.field2635);
                if (var16 <= class294.field5041) {
                    class150.method1151(arg4 - 27261, class63.field1096[var16], var18, arg0, var17);
                }
                if (class90.field1495 <= var15) {
                    class150.method1151(7, class63.field1096[var15], var18, arg0, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V", line = 135)
    public static void method1148(byte arg0) {
        field2569 = null;
        field2562 = null;
        field2570 = null;
        if (arg0 <= 113) {
            field2566 = 24;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V", line = 146)
    protected class149() {
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)I", line = 152)
    public static final int method1149(int arg0, int arg1) {
        field2567++;
        class233 var2 = class237.method1721(arg1, arg0 ^ 0x30);
        int var3 = var2.field3946;
        int var4 = var2.field3948;
        int var5 = class273.field4719[var4 - var3];
        int var6 = var2.field3945;
        if (arg0 != 0) {
            field2564 = -100;
        }
        return class286.field4920[var6] >> var3 & var5;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
    public abstract void method1144(byte arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public abstract void method1145(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);
}
