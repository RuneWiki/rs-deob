import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public abstract class class231 extends class259 {

    @OriginalMember(owner = "client!al", name = "J", descriptor = "Lcc;")
    public static class209 field4196 = class95.method669(120, "<col=ff3000>");

    @OriginalMember(owner = "client!al", name = "H", descriptor = "Lla;")
    public static class95 field4194 = new class95(50);

    @OriginalMember(owner = "client!al", name = "N", descriptor = "[Lcc;")
    public static class209[] field4199 = new class209[100];

    @OriginalMember(owner = "client!al", name = "D", descriptor = "I")
    public int field4190;

    @OriginalMember(owner = "client!al", name = "E", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "I")
    public int field4192;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "I")
    public int field4195;

    @OriginalMember(owner = "client!al", name = "L", descriptor = "I")
    public int field4197;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "I")
    public int field4198;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!al", name = "P", descriptor = "I")
    public int field4201;

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(III)V")
    public abstract void method225(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!al", name = "h", descriptor = "(I)V")
    public static void method1610(int arg0) {
        field4199 = null;
        field4194 = null;
        int var1 = 10 % ((arg0 - 51) / 61);
        field4196 = null;
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(II)V")
    public abstract void method228(int arg0, int arg1);

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIII)V")
    public abstract void method224(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZIJI)Lcc;")
    public static final class209 method1611(int arg0, boolean arg1, int arg2, long arg3, int arg4) {
        class209 var6 = class79.method554(-30159, 0);
        field4191++;
        if (arg3 < 0L) {
            var6.method1445(class32.field581, (byte) -76);
            arg3 = -arg3;
        }
        class209 var7 = class48.field930;
        class209 var8 = class28.field508;
        if (arg0 == 1) {
            var7 = class28.field508;
            var8 = class48.field930;
        }
        if (arg0 == 2) {
            var7 = class28.field508;
            var8 = class43.field863;
        }
        if (arg0 == 3) {
            var7 = class28.field508;
            var8 = class48.field930;
        }
        class209 var9 = class79.method554(-30159, 0);
        class209 var10 = class79.method554(-30159, 0);
        for (int var11 = 0; var11 < arg2; var11++) {
            var10.method1445(class66.method485((int) (arg3 % 10L), (byte) 48), (byte) -76);
            arg3 /= 10L;
        }
        if (arg4 < 37) {
            return null;
        }
        if (arg3 == 0L) {
            var9 = class97.field1897;
        }
        int var12 = 0;
        while (arg3 > 0L) {
            if (arg1 && var12 != 0 && (var12 % 3) == 0) {
                var9.method1445(var8, (byte) -76);
            }
            var9.method1445(class66.method485((int) (arg3 % 10L), (byte) 43), (byte) -76);
            arg3 /= 10L;
            var12++;
        }
        if (var10.method1486(5) > 0) {
            var10.method1445(var7, (byte) -76);
        }
        return class229.method1604(new class209[] { var6, var9.method1488((byte) 4), var10.method1488((byte) 4) }, (byte) 119);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)V")
    public abstract void method235(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(II)V")
    public static final void method1612(int arg0, int arg1) {
        class109 var2 = class106.field2089[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class109 var4 = class106.field2089[var3][arg0][arg1] = class106.field2089[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2208--;
                for (int var5 = 0; var5 < var4.field2203; var5++) {
                    class264 var6 = var4.field2189[var5];
                    if ((var6.field4733 >> 29 & 0x3L) == 2L && var6.field4746 == arg0 && var6.field4741 == arg1) {
                        var6.field4749--;
                    }
                }
            }
        }
        if (class106.field2089[0][arg0][arg1] == null) {
            class106.field2089[0][arg0][arg1] = new class109(0, arg0, arg1);
        }
        class106.field2089[0][arg0][arg1].field2216 = var2;
        class106.field2089[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIB)V")
    public final void method1613(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4193++;
        if (arg4 != 74) {
            this.method233(-98, -104, 74, -54, -104, 83);
        }
        int var6 = this.field4198 << 3;
        int var7 = (arg3 << 4) + (var6 & 0xF);
        int var8 = this.field4201 << 3;
        int var9 = (arg0 << 4) + (var8 & 0xF);
        this.method233(var6, var8, var7, var9, arg1, arg2);
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(IIIIII)V")
    public abstract void method233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!al", name = "f", descriptor = "(II)V")
    public abstract void method232(int arg0, int arg1);
}
