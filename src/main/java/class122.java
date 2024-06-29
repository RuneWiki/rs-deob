import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class122 extends class130 {

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "Lcd;")
    public static class64 field2194 = class44.method335((byte) 71, ")2");

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "Lig;")
    public static class168 field2190 = new class168(64);

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "Lcd;")
    public static class64 field2203 = class44.method335((byte) 71, "Weiter");

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public int field2188;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    private int field2189;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "Lcd;")
    public class64 field2191;

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "[Log;")
    public static class195[] field2201;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "[[[B")
    public static byte[][][] field2192;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIILa;JZ)V", line = 4)
    public static final void method854(int arg0, int arg1, int arg2, int arg3, class262 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class37 var8 = new class37();
        var8.field599 = arg4;
        var8.field596 = arg1 * 128 + 64;
        var8.field594 = arg2 * 128 + 64;
        var8.field604 = arg3;
        var8.field593 = arg5;
        var8.field592 = arg6;
        if (class304.field5203[arg0][arg1][arg2] == null) {
            class304.field5203[arg0][arg1][arg2] = new class295(arg0, arg1, arg2);
        }
        class304.field5203[arg0][arg1][arg2].field5095 = var8;
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)Z", line = 25)
    public final boolean method855(int arg0) {
        field2202++;
        if (arg0 != 26205) {
            method857((byte) -125, -54);
        }
        return this.field2189 == 115;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lkh;ZI)V", line = 36)
    private final void method856(class13 arg0, boolean arg1, int arg2) {
        if (arg2 == 1) {
            this.field2189 = arg0.method152((byte) -117);
        } else if (arg2 == 2) {
            this.field2188 = arg0.method105((byte) 116);
        } else if (arg2 == 5) {
            this.field2191 = arg0.method104((byte) 102);
        }
        field2193++;
        if (!arg1) {
            this.field2191 = (class64) null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BI)V", line = 67)
    public static final void method857(byte arg0, int arg1) {
        class70.field1357.method1197((byte) 120, arg1);
        class301.field5173.method1197((byte) 96, arg1);
        field2198++;
        class130.field2311.method1197((byte) 116, arg1);
        if (arg0 >= -63) {
            field2197 = 77;
        }
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V", line = 81)
    public static void method858(int arg0) {
        field2192 = (byte[][][]) null;
        field2201 = null;
        field2190 = null;
        field2203 = null;
        if (arg0 < -70) {
            field2194 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLjava/awt/Component;)V", line = 98)
    public static final void method859(boolean arg0, Component arg1) {
        field2200++;
        if (arg0) {
            method860(-12, -91);
        }
        Method var2 = class282.field4862;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class29.field477);
        arg1.addFocusListener(class29.field477);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V", line = 125)
    public static final void method860(int arg0, int arg1) {
        class104.field1918[1] = (float) class224.method1614(255, arg0 >> 8) / 255.0F;
        field2199++;
        class104.field1918[0] = (float) (class224.method1614(arg0, 16722957) >> 16) / 255.0F;
        if (arg1 > -102) {
            field2194 = (class64) null;
        }
        class104.field1918[2] = (float) class224.method1614(255, arg0) / 255.0F;
        class160.method1154(5405, 3);
        class160.method1154(5405, 4);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lcd;I)I", line = 149)
    public static final int method861(class64 arg0, int arg1) {
        if (arg1 >= -10) {
            return 52;
        } else {
            field2195++;
            return arg0.method540(28981) + 1;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLkh;)V", line = 160)
    public final void method862(boolean arg0, class13 arg1) {
        field2196++;
        while (true) {
            int var3 = arg1.method152((byte) -74);
            if (var3 == 0) {
                if (!arg0) {
                    field2203 = (class64) null;
                }
                return;
            }
            this.method856(arg1, true, var3);
        }
    }
}
