import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class class246 {

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public static int field4382 = 255;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "[I")
    public static int[] field4387 = new int[5];

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Lsg;")
    private static class30 field4385 = class167.method1221((byte) 33, "Select");

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Lsg;")
    public static class30 field4384 = null;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Lsg;")
    public static class30 field4380 = field4385;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "Lsg;")
    public static class30 field4389 = class167.method1221((byte) 33, ")2");

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "[[[B")
    public static byte[][][] field4386;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static final void method1726(int arg0) {
        class45.field1060 = arg0;
        for (int var1 = 0; var1 < class209.field3759; var1++) {
            for (int var2 = 0; var2 < class44.field1050; var2++) {
                if (class71.field1613[arg0][var1][var2] == null) {
                    class71.field1613[arg0][var1][var2] = new class195(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([BB)V")
    public abstract void method1321(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)Z")
    public static final boolean method1727(byte arg0) {
        field4379++;
        if (arg0 >= -56) {
            return true;
        }
        try {
            return class105.method843(-26);
        } catch (IOException var4) {
            class261.method1805(40);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class70.field1586 + "," + class52.field1161 + "," + class36.field871 + " - " + class163.field3041 + "," + (class22.field421 + class247.field4394.field1349[0]) + "," + (class247.field4394.field1372[0] + class196.field3547) + " - ";
            for (int var3 = 0; class163.field3041 > var3 && var3 < 50; var3++) {
                var2 = var2 + class59.field1289.field124[var3] + ",";
            }
            class93.method751(var5, var2, -127);
            class41.method428(31531);
            return true;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
    public static void method1728(int arg0) {
        if (arg0 != 0) {
            field4391 = 96;
        }
        field4386 = null;
        field4387 = null;
        field4380 = null;
        field4385 = null;
        field4389 = null;
        field4384 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)J")
    public static final long method1729(int arg0, int arg1, int arg2) {
        class195 var3 = class71.field1613[arg0][arg1][arg2];
        return var3 == null || var3.field3537 == null ? 0L : var3.field3537.field2803;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BIII)I")
    public static final int method1730(byte arg0, int arg1, int arg2, int arg3) {
        field4383++;
        if (arg0 < 18) {
            method1728(-2);
        }
        if ((class272.field4771[arg2][arg3][arg1] & 0x8) == 0) {
            return arg2 <= 0 || (class272.field4771[1][arg3][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)[B")
    public abstract byte[] method1322(byte arg0);

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)I")
    public static final int method1731(int arg0) {
        if (arg0 <= 25) {
            field4385 = null;
        }
        field4381++;
        return 6;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method1732(boolean arg0, Component arg1) {
        arg1.addMouseListener(class74.field1659);
        field4388++;
        if (arg0) {
            field4380 = null;
        }
        arg1.addMouseMotionListener(class74.field1659);
        arg1.addFocusListener(class74.field1659);
    }
}
