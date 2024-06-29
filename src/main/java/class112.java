import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class112 {

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "Z")
    public boolean field1700 = true;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "Lmc;")
    public static class78 field1691 = new class78(65, 4);

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "Lmc;")
    public static class78 field1701 = new class78(6, 15);

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "Lh;")
    public static class434 field1703 = new class434(5, 8);

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "C")
    private char field1693;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
    public int field1702;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "Ljava/lang/String;")
    public String field1694;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
    public static final void method718(int arg0) {
        field1692++;
        if (class94.field1398 != null) {
            return;
        }
        int var1 = class178.field2416;
        if (arg0 >= -54) {
            field1691 = null;
        }
        int var2 = class145.field2091;
        int var3 = class383.field5274 - var1 - class424.field5738;
        int var4 = class152.field2139 - class72.field986 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class492.field6883 == null) {
                var5 = class251.field3359.field3209;
            } else {
                var5 = class492.field6883;
            }
            int var6 = 0;
            int var7 = 0;
            if (class492.field6883 == var5) {
                Insets var8 = class492.field6883.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class152.field2139);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class383.field5274, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class383.field5274 - var3, var7, var3, class152.field2139);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class152.field2139 - var4, class383.field5274, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lbt;I)V")
    public final void method719(class32 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method201((byte) -109);
            if (var3 == 0) {
                field1698++;
                if (arg1 != -1) {
                    this.method721(-34);
                    return;
                }
                return;
            }
            this.method722(var3, 91, arg0);
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BII)V")
    public static final void method720(byte arg0, int arg1, int arg2) {
        field1697++;
        class268 var3 = new class268(16);
        for (class223 var4 = (class223) class33.field505.method1518((byte) -59); var4 != null; var4 = (class223) class33.field505.method1517(-30942)) {
            var4.method2614((byte) -128);
            int var5 = (int) (var4.field6047 >> 28);
            int var6 = (int) (var4.field6047 >> 14 & 0x3FFFL) - arg1;
            int var7 = (int) (var4.field6047 & 0x3FFFL) - arg2;
            if (var7 >= 0 && var6 >= 0 && var7 < class295.field3947 && var6 < class39.field567) {
                var3.method1525((byte) 19, var4, (long) (var5 << 28 | var6 << 14 | var7));
            }
        }
        if (arg0 >= -62) {
            field1703 = null;
        }
        class33.field505 = var3;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)Z")
    public final boolean method721(int arg0) {
        field1696++;
        if (arg0 != -116) {
            this.method721(69);
        }
        return this.field1693 == 's';
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IILbt;)V")
    private final void method722(int arg0, int arg1, class32 arg2) {
        if (arg0 == 1) {
            this.field1693 = class107.method661(-2101, arg2.method211(29861));
        } else if (arg0 == 2) {
            this.field1702 = arg2.method222(1024);
        } else if (arg0 == 4) {
            this.field1700 = false;
        } else if (arg0 == 5) {
            this.field1694 = arg2.method195(-111);
        }
        if (arg1 < 70) {
            method723((byte) 23);
        }
        field1695++;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
    public static void method723(byte arg0) {
        field1703 = null;
        field1691 = null;
        field1701 = null;
        if (arg0 != 120) {
            field1691 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BLbt;)Lrm;")
    public static final class259 method724(byte arg0, class32 arg1) {
        if (arg0 > -16) {
            method720((byte) -30, 0, -4);
        }
        field1699++;
        return new class259(arg1.method209((byte) 35), arg1.method209((byte) 35), arg1.method209((byte) 35), arg1.method209((byte) 35), arg1.method219(-124), arg1.method219(-120), arg1.method201((byte) -127));
    }
}
