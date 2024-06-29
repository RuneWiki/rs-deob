import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public abstract class class95 {

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "Lmb;")
    public static class96 field1554 = class243.method1708("cross", (byte) 105);

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "Lmb;")
    public static class96 field1564 = class243.method1708("Lade Titelbild )2 ", (byte) 110);

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "[I")
    public static int[] field1565 = new int[25];

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field1556 = -1;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public int field1560;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public int field1563;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "Ljava/awt/Image;")
    public Image field1553;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "[I")
    public int[] field1558;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static final void method664(int arg0) {
        field1559++;
        class157.field2745 = 0;
        class105.field1764 = 0;
        class207.method1428(false);
        class39.method311((byte) 122);
        class219.method1507(arg0 ^ 0x12);
        for (int var1 = arg0; var1 < class105.field1764; var1++) {
            int var3 = class41.field693[var1];
            if (class236.field4053 != class86.field1450[var3].field4510) {
                if (class86.field1450[var3].field3436.method1570(105)) {
                    class274.method1859((byte) 15, class86.field1450[var3]);
                }
                class86.field1450[var3].field3436 = null;
                class86.field1450[var3] = null;
            }
        }
        if (class47.field820 != class1.field4.field4124) {
            throw new RuntimeException("gnp1 pos:" + class1.field4.field4124 + " psize:" + class47.field820);
        }
        for (int var2 = 0; var2 < class132.field2375; var2++) {
            if (class86.field1450[class222.field3797[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class132.field2375);
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)Lna;")
    public static final class19 method665(int arg0, int arg1, int arg2) {
        class187 var3 = class259.field4487[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3281;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIII)V")
    public static final void method666(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1561++;
        if (arg2 < 106) {
            field1564 = null;
        }
        for (int var6 = arg5; var6 <= arg4; var6++) {
            class36.method283(arg1, class229.field3939[var6], arg0, (byte) -122, arg3);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public abstract void method67(Component arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public abstract void method68(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V")
    public final void method667(byte arg0) {
        field1557++;
        class84.method590(this.field1558, this.field1560, this.field1563);
        if (arg0 > -66) {
            method669(-91);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IJ)Lmb;")
    public static final class96 method668(int arg0, long arg1) {
        if (arg0 == 10) {
            field1562++;
            return class1.method6(10, (byte) 43, false, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BIILjava/awt/Graphics;)V")
    public abstract void method66(byte arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    public static void method669(int arg0) {
        field1554 = null;
        field1565 = null;
        if (arg0 == 0) {
            field1564 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
    protected class95() {
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BLgd;)V")
    public static final void method670(byte arg0, class123 arg1) {
        class261 var2 = null;
        try {
            if (arg0 > -83) {
                return;
            }
            class263 var3 = arg1.method953("runescape", 0);
            while (var3.field4605 == 0) {
                class226.method1543(1L, -738);
            }
            if (var3.field4605 == 1) {
                var2 = (class261) var3.field4604;
                class239 var4 = class171.method1220((byte) 30);
                var2.method1808(var4.field4144, var4.field4124, 0, 56);
            }
        } catch (Exception var6) {
        }
        field1555++;
        try {
            if (var2 != null) {
                var2.method1804(0);
            }
        } catch (Exception var5) {
        }
    }
}
