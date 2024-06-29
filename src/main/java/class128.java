import java.awt.Component;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class128 extends class65 {

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
    public int field3116;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    private int field3102;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "[I")
    public int[] field3110;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "[[I")
    public int[][] field3117;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "Lrc;")
    public static class105 field3108 = class43.method374("backhmid2", 0);

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "Lrc;")
    private static class105 field3106 = class43.method374("This computers address has been blocked", 0);

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "[I")
    public static int[] field3104 = new int[500];

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "[I")
    public static int[] field3118 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "Lrc;")
    public static class105 field3105 = class43.method374("Fps:", 0);

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "Z")
    public static boolean field3114 = false;

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "Lrc;")
    public static class105 field3120 = field3106;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "Lfc;")
    public static class34 field3103;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "Lfc;")
    public static class34 field3107;

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "Lpb;")
    public static class92 field3119;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V", line = 7)
    public static void method1026(int arg0) {
        field3104 = null;
        field3106 = null;
        field3120 = null;
        field3105 = null;
        if (arg0 != 0) {
            field3108 = null;
        }
        field3119 = null;
        field3107 = null;
        field3103 = null;
        field3118 = null;
        field3108 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 25)
    public static final Class method1027(String arg0, int arg1) throws ClassNotFoundException {
        field3112++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        }
        if (arg1 != -1537) {
            field3118 = null;
        }
        if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(Ljava/awt/Component;I)V", line = 76)
    public static final void method1028(Component arg0, int arg1) {
        field3111++;
        if (arg1 != 8532) {
            field3107 = null;
        }
        arg0.removeKeyListener(class76.field1706);
        arg0.removeFocusListener(class76.field1706);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjd;B)V", line = 93)
    public static final void method1029(int arg0, class58 arg1, byte arg2) {
        field3109++;
        if (arg1.field1229 < 128 || arg1.field1274 < 128 || arg1.field1229 >= 13184 || arg1.field1274 >= 13184) {
            arg1.field1238 = -1;
            arg1.field1288 = 0;
            arg1.field1245 = -1;
            arg1.field1272 = 0;
            arg1.field1229 = arg1.field1281[0] * 128 + arg1.field1227 * 64;
            arg1.field1274 = arg1.field1261[0] * 128 + arg1.field1227 * 64;
            arg1.method462(7362);
        }
        if (class119.field2842 == arg1 && (arg1.field1229 < 1536 || arg1.field1274 < 1536 || arg1.field1229 >= 11776 || arg1.field1274 >= 11776)) {
            arg1.field1245 = -1;
            arg1.field1288 = 0;
            arg1.field1272 = 0;
            arg1.field1238 = -1;
            arg1.field1229 = arg1.field1281[0] * 128 + arg1.field1227 * 64;
            arg1.field1274 = arg1.field1261[0] * 128 + arg1.field1227 * 64;
            arg1.method462(7362);
        }
        if (arg2 != 49) {
            method1028(null, 1);
        }
        if (arg1.field1272 > class104.field2351) {
            class95.method786(100, arg1);
        } else if (class104.field2351 > arg1.field1288) {
            class3.method22(256, arg1);
        } else {
            class102.method812(arg1, (byte) 117);
        }
        class24.method238((byte) -124, arg1);
        class133.method1054(arg1, false);
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(I[B)V", line = 160)
    public class128(int arg0, byte[] arg1) {
        this.field3116 = arg0;
        class7 var3 = new class7(arg1);
        this.field3102 = var3.method96(27023);
        this.field3110 = new int[this.field3102];
        this.field3117 = new int[this.field3102][];
        for (int var4 = 0; var4 < this.field3102; var4++) {
            this.field3110[var4] = var3.method96(27023);
        }
        for (int var5 = 0; var5 < this.field3102; var5++) {
            this.field3117[var5] = new int[var3.method96(27023)];
        }
        for (int var6 = 0; var6 < this.field3102; var6++) {
            for (int var7 = 0; var7 < this.field3117[var6].length; var7++) {
                this.field3117[var6][var7] = var3.method96(27023);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lfb;BLjava/awt/Component;)Lud;", line = 206)
    public static final class124 method1030(class33 arg0, byte arg1, Component arg2) {
        class30.method288(arg0, 85, arg2);
        field3115++;
        class124 var3 = new class124();
        int var4 = -80 % ((arg1 + 35) / 33);
        class35.method329(var3, 0);
        return var3;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 225)
    public static final int method1031(int arg0, KeyEvent arg1) {
        if (arg0 > -38) {
            method1028(null, 54);
        }
        field3113++;
        int var2 = arg1.getKeyChar();
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }
}
