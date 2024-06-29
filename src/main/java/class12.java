import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class12 {

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public int field136 = 16777215;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public int field145 = 8;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "Ljava/lang/String;")
    public static String field143 = " more options";

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    public static int field149 = 0;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "S")
    public static short field147 = 320;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
    public static int field152 = 0;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field146 = 0;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public int field137;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public int field141;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public int field142;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public int field148;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Lba;")
    public static class170 field139;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "Z")
    public boolean field151;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
    public static void method93(boolean arg0) {
        if (!arg0) {
            method93(true);
        }
        field143 = null;
        field139 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method94(String arg0, int arg1, boolean arg2) {
        field140++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = field139.method1256(arg0, arg1);
        int var7 = field139.method1266(arg0, 250) * 13;
        class70.method508(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 0);
        class70.method505(var4 - var3, -var3 + var5, var3 + var3 + var6, var3 + var7 + var3, 16777215);
        field139.method1265(arg0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class194.method1440(var7 + var3 + var3, -var3 + var5, var4 - var3, -8, var3 + var6 + var3);
        if (!arg2) {
            class46.method346(var5, var4, var6, var7, 29262);
            return;
        }
        try {
            Graphics var8 = class10.field89.getGraphics();
            class29.field367.method114(-2377, 0, var8, 0);
        } catch (Exception var9) {
            class10.field89.repaint();
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILv;I)V")
    private final void method95(int arg0, int arg1, class152 arg2, int arg3) {
        if (arg1 == 1) {
            this.field145 = arg2.method1126(false);
        } else if (arg1 == 2) {
            this.field151 = true;
        } else if (arg1 == 3) {
            this.field142 = arg2.method1090(arg0 + 12101);
            this.field138 = arg2.method1090(12107);
            this.field148 = arg2.method1090(arg0 + 12101);
        } else if (arg1 == 4) {
            this.field141 = arg2.method1111(arg0 + 249);
        } else if (arg1 == 5) {
            this.field137 = arg2.method1126(false);
        } else if (arg1 == 6) {
            this.field136 = arg2.method1128((byte) -111);
        }
        field144++;
        if (arg0 != 6) {
            this.method98((class152) null, (byte) -62, -58);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static final void method96(int arg0) {
        if (arg0 != 16777215) {
            method93(true);
        }
        field153++;
        class59.field832.method1556((byte) 117);
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)I")
    public static final int method97(int arg0) {
        field135++;
        class190.field3067 = arg0;
        return class244.method1741(-21400);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lv;BI)V")
    public final void method98(class152 arg0, byte arg1, int arg2) {
        field150++;
        while (true) {
            int var4 = arg0.method1111(255);
            if (var4 == 0) {
                if (arg1 <= 75) {
                    field139 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method95(6, var4, arg0, arg2);
        }
    }
}
