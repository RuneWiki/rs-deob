import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class139 extends class122 {

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
    private int field2621 = 0;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "Z")
    public boolean field2622 = false;

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "I")
    private int field2635 = 0;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
    public int field2627;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    public int field2624;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "I")
    public int field2632;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    public int field2631;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    public int field2616;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    private int field2620;

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "Lic;")
    private class77 field2634;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "[Lw;")
    public static class199[] field2625 = new class199[50];

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "Lai;")
    public static class10 field2623 = class44.method278("mapedge", 123);

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "Ldd;")
    public static class34 field2629 = new class34(30);

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "[I")
    public static int[] field2633;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
    public static void method946(int arg0) {
        if (arg0 != 15) {
            method947(-105);
        }
        field2625 = null;
        field2623 = null;
        field2633 = null;
        field2629 = null;
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V")
    public static final void method947(int arg0) {
        field2617++;
        int var1 = class97.field1795.method1270(class89.field1564);
        for (int var2 = 0; var2 < class53.field946; var2++) {
            int var6 = class97.field1795.method1270(class35.method234(var2, arg0 - 16135));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        class193.field3670 = var1;
        class180.field3415 = true;
        class118.field2279 = class53.field946 * 15 + 22;
        int var3 = class172.field3330 - var1 / 2;
        if (var1 + var3 > 765) {
            var3 = 765 - var1;
        }
        if (var3 < 0) {
            var3 = 0;
        }
        int var4 = class53.field946 * 15 + 21;
        int var5 = class5.field58;
        if (var4 + var5 > 503) {
            var5 = 503 - var4;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        class108.field2008 = var5;
        if (arg0 != 26026) {
            method949(-50);
        }
        class160.field3086 = var3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)V")
    public final void method948(int arg0, byte arg1) {
        field2628++;
        if (this.field2622) {
            return;
        }
        if (arg1 >= -59) {
            field2629 = null;
        }
        this.field2635 += arg0;
        while (this.field2635 > this.field2634.field1358[this.field2621]) {
            this.field2635 -= this.field2634.field1358[this.field2621];
            this.field2621++;
            if (this.field2634.field1339.length <= this.field2621) {
                this.field2622 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "(I)V")
    public static final void method949(int arg0) {
        class76.field1323.method635((byte) -77, 225);
        for (class118 var1 = (class118) class165.field3162.method212((byte) -126); var1 != null; var1 = (class118) class165.field3162.method215((byte) 34)) {
            if (var1.field2281 == 0) {
                class27.method176(true, var1, true);
            }
        }
        class136.field2565++;
        field2618++;
        if (class137.field2569 != null) {
            class168.method1116(class137.field2569, -103);
            class137.field2569 = null;
        }
        if (arg0 != -1) {
            method949(-37);
        }
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)Lsa;")
    public final class164 method264(int arg0) {
        field2619++;
        class154 var2 = class135.method919(false, this.field2620);
        int var3 = -102 % ((arg0 - 66) / 59);
        class164 var4;
        if (this.field2622) {
            var4 = var2.method1048(-1, -81);
        } else {
            var4 = var2.method1048(this.field2621, -65);
        }
        return var4 == null ? null : var4;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IIIIIII)V")
    public class139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2627 = arg5 + arg6;
        this.field2624 = arg2;
        this.field2632 = arg4;
        this.field2631 = arg3;
        this.field2616 = arg1;
        this.field2620 = arg0;
        int var8 = class135.method919(false, this.field2620).field2981;
        if (var8 == -1) {
            this.field2622 = true;
        } else {
            this.field2622 = false;
            this.field2634 = class142.method958((byte) -102, var8);
        }
    }
}
