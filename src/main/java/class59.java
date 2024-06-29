import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class59 extends class55 {

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field691 = new String[200];

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "S")
    public static short field690 = 1;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "Lrc;")
    public static class9 field703 = new class9(64);

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "I")
    public static int field704 = 0;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "[Z")
    public static boolean[] field705 = new boolean[100];

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "Lb;")
    public static class262 field700;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "Lc;")
    private class284 field694;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V")
    public static void method360(int arg0) {
        field705 = null;
        field703 = null;
        field691 = null;
        if (arg0 != 64) {
            method362((int[]) null, -50, 88, -72L);
        }
        field700 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILqi;)V")
    private final void method361(int arg0, int arg1, class216 arg2) {
        if (arg0 != 0) {
            field691 = null;
        }
        if (arg1 == 249) {
            int var4 = arg2.method1407(110);
            if (this.field694 == null) {
                int var5 = class72.method450(true, var4);
                this.field694 = new class284(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method1407(124) == 1;
                int var8 = arg2.method1382(arg0 ^ 0xFFFFFFD1);
                class288 var9;
                if (var7) {
                    var9 = new class20(arg2.method1352((byte) -63));
                } else {
                    var9 = new class138(arg2.method1358(arg0 + 66));
                }
                this.field694.method1894(-1, var9, (long) var8);
            }
        }
        field692++;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([IIIJ)Ljava/lang/String;")
    public static final String method362(int[] arg0, int arg1, int arg2, long arg3) {
        field698++;
        if (class179.field2543 != null) {
            String var5 = class179.field2543.method151(arg0, -20054, arg2, arg3);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg1 != 6433) {
            field690 = -120;
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
    public static final void method363(int arg0, int arg1) {
        field693++;
        class21.field258 = new int[arg1];
        if (arg0 == 1) {
            class238.field3428 = new int[arg1];
            class288.field4481 = new int[arg1];
            class296.field4670 = new int[arg1];
            class279.field4239 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;BI)Ljava/lang/String;")
    public final String method364(String arg0, byte arg1, int arg2) {
        field699++;
        if (this.field694 == null) {
            return arg0;
        }
        class20 var4 = (class20) this.field694.method1895((long) arg2, -112);
        if (arg1 <= 59) {
            return null;
        } else if (var4 == null) {
            return arg0;
        } else {
            return var4.field249;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method365(int arg0, Component arg1) {
        arg1.removeKeyListener(class280.field4251);
        if (arg0 > -50) {
            field690 = -40;
        }
        field697++;
        arg1.removeFocusListener(class280.field4251);
        class296.field4675 = -1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)I")
    public final int method366(int arg0, int arg1, int arg2) {
        field695++;
        if (this.field694 == null) {
            return arg1;
        } else if (arg0 == 9368) {
            class138 var4 = (class138) this.field694.method1895((long) arg2, arg0 - 9484);
            return var4 == null ? arg1 : var4.field2013;
        } else {
            return -116;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lqi;I)V")
    public final void method367(class216 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1407(111);
            if (var3 == 0) {
                int var4 = 126 / ((arg1 + 80) / 39);
                field701++;
                return;
            }
            this.method361(0, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static final String method368(int arg0, byte arg1) {
        if (arg1 > -126) {
            method368(-42, (byte) -127);
        }
        field696++;
        return class240.field3482[arg0].length() <= 0 ? class153.field2217[arg0] : class153.field2217[arg0] + class41.field502 + class240.field3482[arg0];
    }
}
