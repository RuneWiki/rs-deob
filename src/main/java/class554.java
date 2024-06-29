import java.awt.Color;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class554 {

    @OriginalMember(owner = "client!it", name = "d", descriptor = "Z")
    public boolean field8245 = false;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "[Ljava/awt/Color;")
    public static Color[] field8244 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!it", name = "o", descriptor = "I")
    public static int field8256 = 0;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field8242;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field8243;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public int field8246;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public static int field8247;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "I")
    public static int field8248;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "I")
    public static int field8249;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "I")
    public static int field8251;

    @OriginalMember(owner = "client!it", name = "k", descriptor = "I")
    public static int field8252;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "I")
    public static int field8253;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "I")
    public static int field8254;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "I")
    public int field8255;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "Lkl;")
    public class69 field8250;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ZIIIII)V", line = 7)
    public static final void method3344(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8254++;
        if (class99.field1448 != null && (arg1 != 3 || class56.field668.field6839 != arg4 || class56.field668.field6865 != arg2)) {
            class145.method993(class99.field1448, class442.field5896, 0);
            class99.field1448 = null;
        }
        if (arg1 == 3 && class99.field1448 == null) {
            class99.field1448 = class568.method3390(0, 0, arg4, -96, class442.field5896, arg2);
            if (class99.field1448 != null) {
                class56.field668.field6839 = arg4;
                class56.field668.field6865 = arg2;
                class56.field668.method1480(class442.field5896, (byte) -69);
            }
        }
        if (arg1 == 3 && class99.field1448 == null) {
            method3344(true, class56.field668.field6858, -1, arg3, -1, 117);
            return;
        }
        Container var6;
        if (class99.field1448 != null) {
            class384.field5289 = arg4;
            class625.field9202 = arg2;
            var6 = class99.field1448;
        } else if (class390.field5382 == null) {
            var6 = class442.field5896.field4568;
            class384.field5289 = var6.getSize().width;
            class625.field9202 = var6.getSize().height;
        } else {
            Insets var7 = class390.field5382.getInsets();
            class384.field5289 = class390.field5382.getSize().width - var7.right - var7.left;
            int var10001 = var7.top + var7.bottom;
            class625.field9202 = class390.field5382.getSize().height - var10001;
            var6 = class390.field5382;
        }
        if (arg1 == 1) {
            class165.field2605 = class214.field3159;
            class104.field1513 = (class384.field5289 - class214.field3159) / 2;
            class587.field8700 = 0;
            class47.field562 = class347.field4760;
        } else if (class467.field6579 < 96 && class526.field7533 == 0) {
            int var8 = class384.field5289 <= 1024 ? class384.field5289 : 1024;
            int var9 = class625.field9202 <= 768 ? class625.field9202 : 768;
            class104.field1513 = (class384.field5289 - var8) / 2;
            class165.field2605 = var8;
            class587.field8700 = 0;
            class47.field562 = var9;
        } else {
            class165.field2605 = class384.field5289;
            class104.field1513 = 0;
            class587.field8700 = 0;
            class47.field562 = class625.field9202;
        }
        if (class577.field8514 != class186.field2781) {
            boolean var10000;
            if (class165.field2605 < 1024 && class47.field562 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg0) {
            class485.method2913((byte) 5);
        } else {
            class79.field1069.setSize(class165.field2605, class47.field562);
            class99.field1445.method503(class79.field1069);
            if (class390.field5382 == var6) {
                Insets var10 = class390.field5382.getInsets();
                class79.field1069.setLocation(var10.left + class104.field1513, class587.field8700 + var10.top);
            } else {
                class79.field1069.setLocation(class104.field1513, class587.field8700);
            }
        }
        if (arg1 >= 2) {
            class624.field9195 = true;
        } else {
            class624.field9195 = false;
        }
        if (class340.field4708 != -1) {
            class600.method3545(false, true);
        }
        if (class296.field4075 != null && class238.method1522(-105, class472.field6670)) {
            class577.method3433((byte) 106);
        }
        int var11 = 0;
        if (arg5 < 103) {
            return;
        }
        while (var11 < 100) {
            class104.field1511[var11] = true;
            var11++;
        }
        class551.field8214 = true;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)Z", line = 156)
    public final boolean method3345(byte arg0) {
        if (arg0 != -46) {
            method3349(null, 55, null);
        }
        field8252++;
        return this.field8250.field873.method1981(true, this.field8255);
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(B)V", line = 169)
    public static final void method3346(byte arg0) {
        if (arg0 != 5) {
            method3346((byte) -6);
        }
        field8251++;
        if (class472.field6670 == 2) {
            class18.method117((byte) -85, 3);
        } else if (class472.field6670 == 6) {
            class18.method117((byte) -85, 7);
        } else if (class472.field6670 == 9) {
            class18.method117((byte) -85, 10);
            return;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILkda;)V", line = 191)
    public static final void method3347(int arg0, class328 arg1) {
        if (arg0 != 21260) {
            field8244 = null;
        }
        class636.field9300 = arg1;
        field8248++;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IBZLqa;)Lha;", line = 204)
    public final class53 method3348(int arg0, byte arg1, boolean arg2, class208 arg3) {
        field8253++;
        if (arg1 < 74) {
            field8244 = null;
        }
        long var5 = (long) (arg3.field3090 << 19 | this.field8255 | arg0 << 16 | (arg2 ? 262144 : 0));
        class53 var7 = (class53) this.field8250.field879.method842(0, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field8250.field873.method1981(true, this.field8255)) {
            class126 var8 = class126.method896(this.field8250.field873, this.field8255, 0);
            if (var8 != null) {
                var8.field1768 = var8.field1766 = var8.field1765 = var8.field1770 = 0;
                if (arg2) {
                    var8.method884();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method892();
                }
            }
            class53 var10 = arg3.method474(var8, true);
            if (var10 != null) {
                this.field8250.field879.method835((byte) 117, var5, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lkda;ILqa;)V", line = 247)
    public static final void method3349(class328 arg0, int arg1, class208 arg2) {
        field8242++;
        class126[] var3 = class126.method889(arg0, class572.field8431, 0);
        class561.field8341 = new class53[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class561.field8341[var4] = arg2.method474(var3[var4], true);
        }
        class126[] var5 = class126.method889(arg0, class166.field2615, 0);
        class248.field3558 = new class53[var5.length];
        int var6 = 0;
        if (arg1 != -14812) {
            return;
        }
        while (var6 < var5.length) {
            class248.field3558[var6] = arg2.method474(var5[var6], true);
            var6++;
        }
        class126[] var7 = class126.method889(arg0, class379.field5226, 0);
        class83.field1196 = new class53[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class83.field1196[var8] = arg2.method474(var7[var8], true);
        }
        class126[] var9 = class126.method889(arg0, class65.field805, 0);
        class165.field2611 = new class53[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class165.field2611[var10] = arg2.method474(var9[var10], true);
        }
        class126[] var11 = class126.method889(arg0, class15.field153, 0);
        class568.field8377 = new class53[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class568.field8377[var12] = arg2.method474(var11[var12], true);
        }
        class126[] var13 = class126.method889(arg0, class106.field1526, 0);
        class604.field8997 = new class53[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class604.field8997[var14] = arg2.method474(var13[var14], true);
        }
        class126[] var15 = class126.method889(arg0, class440.field5878, 0);
        class349.field4779 = new class53[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class349.field4779[var16] = arg2.method474(var15[var16], true);
        }
        class126[] var17 = class126.method889(arg0, class116.field1629, 0);
        class623.field9183 = new class53[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class623.field9183[var18] = arg2.method474(var17[var18], true);
        }
        class126[] var19 = class126.method889(arg0, class386.field5314, 0);
        class600.field8847 = new class53[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class600.field8847[var20] = arg2.method474(var19[var20], true);
        }
        class126[] var21 = class126.method889(arg0, class561.field8336, 0);
        class408.field5574 = new class53[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class408.field5574[var22] = arg2.method474(var21[var22], true);
        }
        class126[] var23 = class126.method889(arg0, class140.field1989, 0);
        class374.field5180 = new class53[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class374.field5180[var24] = arg2.method474(var23[var24], true);
        }
        class126[] var25 = class126.method889(arg0, class115.field1624, 0);
        class416.field5639 = new class53[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class416.field5639[var26] = arg2.method474(var25[var26], true);
        }
        class574.field8450 = arg2.method474(class126.method896(arg0, class553.field8241, 0), true);
        class580.field8536 = arg2.method474(class126.method896(arg0, class373.field5123, 0), true);
        class126[] var27 = class126.method889(arg0, class117.field1648, 0);
        class474.field6699 = new class53[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class474.field6699[var28] = arg2.method474(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(B)V", line = 377)
    public static final void method3350(byte arg0) {
        field8249++;
        class623.method3643();
        int var1 = 0;
        if (arg0 < 69) {
            return;
        }
        while (var1 < 4) {
            class127.field1774[var1].method231(-3995);
            var1++;
        }
        class618.method3620(-126);
        class459.method2781((byte) 112);
        System.gc();
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lgw;I)V", line = 398)
    public final void method3351(class148 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1032((byte) -33);
            if (var3 == 0) {
                if (arg1 != 0) {
                    return;
                }
                field8247++;
                return;
            }
            this.method3352(arg0, 119, var3);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lgw;II)V", line = 420)
    private final void method3352(class148 arg0, int arg1, int arg2) {
        int var4 = -120 / ((arg1 - 69) / 47);
        if (arg2 == 1) {
            this.field8255 = arg0.method1045(true);
        } else if (arg2 == 2) {
            this.field8246 = arg0.method1028((byte) 123);
        } else if (arg2 == 3) {
            this.field8245 = true;
        } else if (arg2 == 4) {
            this.field8255 = -1;
        }
        field8243++;
    }

    @OriginalMember(owner = "client!it", name = "d", descriptor = "(B)V", line = 448)
    public static void method3353(byte arg0) {
        field8244 = null;
        if (arg0 != -33) {
            method3353((byte) -98);
        }
    }
}
