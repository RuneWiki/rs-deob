import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.lang.reflect.Method;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class156 {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Led;")
    private static class43 field3142 = class191.method1219("Cancel", false);

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Led;")
    public static class43 field3144 = field3142;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Led;")
    private static class43 field3145 = class191.method1219("Loaded textures", false);

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field3152 = 0;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "Led;")
    private static class43 field3149 = class191.method1219("as it was used to break our rules)3", false);

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Led;")
    private static class43 field3150 = class191.method1219("This computers address has been blocked", false);

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Led;")
    private static class43 field3148 = class191.method1219("Type", false);

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "Led;")
    public static class43 field3156 = field3145;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Led;")
    public static class43 field3153 = class191.method1219("Angreifen", false);

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static volatile int field3157 = 0;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field3151 = 0;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "[I")
    public static int[] field3160 = new int[256];

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "[I")
    public static int[] field3155 = new int[5];

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Led;")
    public static class43 field3147 = field3150;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "Led;")
    public static class43 field3158 = field3149;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Led;")
    public static class43 field3146 = field3148;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "[I")
    public static int[] field3163 = new int[50];

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field3143;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3154;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZILjava/awt/Color;Led;)V")
    public static final void method987(boolean arg0, int arg1, Color arg2, class43 arg3) {
        field3162++;
        try {
            Graphics var4 = class100.field1911.getGraphics();
            if (class108.field2079 == null) {
                class108.field2079 = new Font("Helvetica", 1, 13);
                class61.field1245 = class100.field1911.getFontMetrics(class108.field2079);
            }
            if (class206.field4026) {
                class206.field4026 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class27.field482, class127.field2542);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class22.field366 == null) {
                    class22.field366 = class100.field1911.createImage(304, 34);
                }
                Graphics var5 = class22.field366.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
                var5.setFont(class108.field2079);
                var5.setColor(Color.white);
                if (!arg0) {
                    arg3.method239(var5, 22, (304 - arg3.method252(-12828, class61.field1245)) / 2, (byte) 15);
                    var4.drawImage(class22.field366, class27.field482 / 2 - 152, class127.field2542 / 2 + -18, null);
                }
            } catch (Exception var8) {
                int var6 = class27.field482 / 2 - 152;
                int var7 = class127.field2542 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 - -2, arg1 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg1 * 3 + var6 + 2, var7 + 2, 300 - arg1 * 3, 30);
                var4.setFont(class108.field2079);
                var4.setColor(Color.white);
                arg3.method239(var4, var7 + 22, (304 - arg3.method252(-12828, class61.field1245)) / 2 + var6, (byte) 15);
            }
        } catch (Exception var9) {
            class100.field1911.repaint();
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljg;[BI)V")
    public final void method988(class89 arg0, byte[] arg1, int arg2) {
        field3159++;
        if (arg0.field1769[arg0.field1727] != arg2 || arg0.field1769[arg0.field1727 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3154 == null) {
            this.field3154 = new Inflater(true);
        }
        try {
            this.field3154.setInput(arg0.field1769, arg0.field1727 + 10, arg0.field1769.length + -arg0.field1727 + -18);
            this.field3154.inflate(arg1);
        } catch (Exception var4) {
            this.field3154.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3154.reset();
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class156() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method989(Component arg0, int arg1) {
        if (arg1 >= -78) {
            method990(111, -23, 51, false, null, 85, 87);
        }
        Method var2 = class160.field3244;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class144.field2959);
        arg0.addFocusListener(class144.field2959);
        field3161++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIZLga;II)V")
    public static final void method990(int arg0, int arg1, int arg2, boolean arg3, class58 arg4, int arg5, int arg6) {
        class1.field32 = arg6;
        class158.field3206 = arg0;
        field3143++;
        class104.field1971 = arg1;
        class153.field3108 = arg2;
        class92.field1825 = arg3;
        class7.field152 = arg5;
        class5.field113 = arg4;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static void method991(int arg0) {
        field3147 = null;
        field3148 = null;
        field3146 = null;
        field3155 = null;
        field3163 = null;
        field3145 = null;
        field3158 = null;
        field3150 = null;
        field3153 = null;
        field3144 = null;
        field3160 = null;
        field3142 = null;
        if (arg0 != 5) {
            field3142 = null;
        }
        field3149 = null;
        field3156 = null;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(III)V")
    private class156(int arg0, int arg1, int arg2) {
    }
}
