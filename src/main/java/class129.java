import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class129 extends class41 {

    @OriginalMember(owner = "client!t", name = "v", descriptor = "Lu;")
    public static class135 field3097 = class87.method676((byte) -58, "@cya@");

    @OriginalMember(owner = "client!t", name = "z", descriptor = "Lu;")
    private static class135 field3101 = class87.method676((byte) -126, "Loaded textures");

    @OriginalMember(owner = "client!t", name = "w", descriptor = "Lu;")
    public static class135 field3098 = field3101;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    public static int field3107 = -1;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "I")
    public int field3104;

    @OriginalMember(owner = "client!t", name = "F", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "Lpe;")
    public static class109 field3099;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "Lpe;")
    public class109 field3105;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "Lud;")
    public class139 field3109;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "Lid;")
    public static class60 field3102;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "Lae;")
    public static class6 field3100;

    @OriginalMember(owner = "client!t", name = "H", descriptor = "[B")
    public byte[] field3108;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    public static final void method1042(int arg0) {
        Object var1 = class60.field1528;
        synchronized (class60.field1528) {
            if (class93.field2216 == 0) {
                class41.field965.method220(5, false, new class37());
            }
            class93.field2216 = 600;
            if (arg0 >= -40) {
                field3100 = null;
            }
        }
        field3103++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lcc;Lcc;I)V")
    public static final void method1043(class18 arg0, class18 arg1, int arg2) {
        field3106++;
        if (class115.field2759) {
            class75.method609(arg1, arg0, -1);
            return;
        }
        if (class83.field1963 == 0 || class83.field1963 == 5) {
            byte var3 = 20;
            arg1.method127(class48.field1136, 382, 245 - var3, 16777215);
            int var4 = 253 - var3;
            class70.method574(230, var4, 304, 34, 9179409);
            class70.method574(231, var4 + 1, 302, 32, 0);
            class70.method564(232, var4 + 2, class97.field2346 * 3, 30, 9179409);
            class70.method564(class97.field2346 * 3 + 232, var4 + 2, 300 - class97.field2346 * 3, 30, 0);
            arg1.method127(class57.field1398, 382, 276 - var3, 16777215);
        }
        if (class83.field1963 == 20) {
            class93.field2206.method29(382 - class93.field2206.field132 / 2, 271 - class93.field2206.field134 / 2);
            short var5 = 211;
            arg1.method130(class57.field1397, 382, var5, 16776960, true);
            int var23 = var5 + 15;
            arg1.method130(class57.field1394, 382, var23, 16776960, true);
            int var24 = var23 + 15;
            arg1.method130(class57.field1399, 382, var24, 16776960, true);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg1.method137(class107.method867(arg2 ^ 0x201D, new class135[] { class58.field1442, class57.field1389 }), 272, var26, 16777215, true);
            int var28 = var26 + 15;
            arg1.method137(class107.method867(2, new class135[] { class58.field1440, class57.field1401.method1080((byte) -98) }), 274, var28, 16777215, true);
            int var29 = var28 + 15;
        }
        if (class83.field1963 == 10) {
            class93.field2206.method29(202, 171);
            if (class37.field837 == 0) {
                short var6 = 251;
                arg1.method130(class60.field1510, 382, var6, 16776960, true);
                int var27 = var6 + 30;
                short var7 = 291;
                short var8 = 302;
                class148.field3686.method29(var8 - 73, var7 + -20);
                arg1.method124(class14.field345, var8 - 73, var7 - 20, 144, 40, 16777215, true, 1, 1, 0);
                short var9 = 462;
                class148.field3686.method29(var9 - 73, var7 + -20);
                arg1.method124(class46.field1105, var9 - 73, var7 + -20, 144, 40, 16777215, true, 1, 1, 0);
            } else if (class37.field837 == 2) {
                short var13 = 211;
                short var14 = 302;
                short var15 = 321;
                arg1.method130(class57.field1397, 382, var13, 16776960, true);
                int var34 = var13 + 15;
                arg1.method130(class57.field1394, 382, var34, 16776960, true);
                int var35 = var34 + 15;
                arg1.method130(class57.field1399, 382, var35, 16776960, true);
                int var36 = var35 + 15;
                int var37 = var36 + 10;
                arg1.method137(class107.method867(2, new class135[] { class58.field1442, class57.field1389, class139.field3369 == 0 & class126.field2998 % 40 < 20 ? class102.field2476 : class57.field1390 }), 272, var37, 16777215, true);
                int var38 = var37 + 15;
                arg1.method137(class107.method867(2, new class135[] { class58.field1440, class57.field1401.method1080((byte) -98), class139.field3369 == 1 & class126.field2998 % 40 < 20 ? class102.field2476 : class57.field1390 }), 274, var38, 16777215, true);
                class148.field3686.method29(var14 - 73, var15 + -20);
                arg1.method130(class1.field1, var14, var15 + 5, 16777215, true);
                int var39 = var38 + 15;
                short var16 = 462;
                class148.field3686.method29(var16 - 73, var15 + -20);
                arg1.method130(class32.field756, var16, var15 + 5, 16777215, true);
            } else if (class37.field837 == 3) {
                arg1.method130(class103.field2496, 382, 211, 16776960, true);
                short var10 = 236;
                short var11 = 321;
                short var12 = 382;
                arg1.method130(class107.field2581, 382, var10, 16777215, true);
                int var30 = var10 + 15;
                arg1.method130(class28.field666, 382, var30, 16777215, true);
                int var31 = var30 + 15;
                arg1.method130(class53.field1266, 382, var31, 16777215, true);
                int var32 = var31 + 15;
                arg1.method130(class84.field1988, 382, var32, 16777215, true);
                int var33 = var32 + 15;
                class148.field3686.method29(var12 - 73, var11 + -20);
                arg1.method130(class32.field756, var12, var11 + 5, 16777215, true);
            }
        }
        if (arg2 != 8223) {
            field3100 = null;
        }
        if (class42.field991 > 0) {
            class26.method212(class42.field991, 11166);
            class42.field991 = 0;
        }
        class148.method1215(-128);
        class43.field1027[class4.field103 ? 1 : 0].method29(725, 463);
        if (class83.field1963 > 5 && class63.field1568 != 2 && class111.field2701 == 0) {
            if (field3100 == null) {
                field3100 = class34.method266(class57.field1390, class125.field2982, (byte) 100, class58.field1435);
            } else {
                byte var17 = 5;
                short var18 = 463;
                field3100.method29(var17, var18);
                byte var19 = 100;
                byte var20 = 35;
                arg1.method130(class107.method867(2, new class135[] { class148.field3676, class52.field1238, class68.method547(-1, class52.field1240) }), var19 / 2 + var17, var20 / 2 + var18 - 2, 16777215, true);
                if (class28.field679 == null) {
                    arg0.method130(class28.field688, var17 + var19 / 2, var20 / 2 + var18 + 12, 16777215, true);
                } else {
                    arg0.method130(class22.field539, var19 / 2 + var17, var20 / 2 + 12 + var18, 16777215, true);
                }
            }
        }
        try {
            Graphics var21 = class59.field1484.getGraphics();
            class113.field2739.method94(-17740, 0, var21, 0);
        } catch (Exception var22) {
            class59.field1484.repaint();
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
    public static void method1044(int arg0) {
        field3098 = null;
        field3101 = null;
        field3099 = null;
        if (arg0 != -1258) {
            method1044(69);
        }
        field3100 = null;
        field3102 = null;
        field3097 = null;
    }
}
