import java.awt.Component;
import java.awt.Frame;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public class class1 {

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "[I")
    public int[] field1 = new int[16];

    @OriginalMember(owner = "mapview!a", name = "f", descriptor = "[Z")
    public boolean[] field6 = new boolean[256];

    @OriginalMember(owner = "mapview!a", name = "v", descriptor = "[B")
    public byte[] field22 = new byte[4096];

    @OriginalMember(owner = "mapview!a", name = "u", descriptor = "[I")
    public int[] field21 = new int[256];

    @OriginalMember(owner = "mapview!a", name = "A", descriptor = "[I")
    public int[] field27 = new int[6];

    @OriginalMember(owner = "mapview!a", name = "y", descriptor = "[[I")
    public int[][] field25 = new int[6][258];

    @OriginalMember(owner = "mapview!a", name = "x", descriptor = "[[I")
    public int[][] field24 = new int[6][258];

    @OriginalMember(owner = "mapview!a", name = "n", descriptor = "[B")
    public byte[] field14 = new byte[256];

    @OriginalMember(owner = "mapview!a", name = "z", descriptor = "[B")
    public byte[] field26 = new byte[18002];

    @OriginalMember(owner = "mapview!a", name = "B", descriptor = "[[B")
    public byte[][] field28 = new byte[6][258];

    @OriginalMember(owner = "mapview!a", name = "G", descriptor = "[I")
    public int[] field33 = new int[257];

    @OriginalMember(owner = "mapview!a", name = "L", descriptor = "I")
    public int field38 = 0;

    @OriginalMember(owner = "mapview!a", name = "H", descriptor = "[[I")
    public int[][] field34 = new int[6][258];

    @OriginalMember(owner = "mapview!a", name = "I", descriptor = "[Z")
    public boolean[] field35 = new boolean[16];

    @OriginalMember(owner = "mapview!a", name = "K", descriptor = "I")
    public int field37 = 0;

    @OriginalMember(owner = "mapview!a", name = "F", descriptor = "[B")
    public byte[] field32 = new byte[18002];

    @OriginalMember(owner = "mapview!a", name = "m", descriptor = "Lv;")
    public static class40 field13 = class24.method170("Mace Shop", (byte) -89);

    @OriginalMember(owner = "mapview!a", name = "r", descriptor = "Lv;")
    public static class40 field18 = class24.method170("Sandpit", (byte) -124);

    @OriginalMember(owner = "mapview!a", name = "t", descriptor = "Lv;")
    public static class40 field20 = class24.method170("b12_full", (byte) -95);

    @OriginalMember(owner = "mapview!a", name = "w", descriptor = "Lv;")
    public static class40 field23 = class24.method170("underlay)3dat", (byte) -96);

    @OriginalMember(owner = "mapview!a", name = "M", descriptor = "Z")
    public static boolean field39 = false;

    @OriginalMember(owner = "mapview!a", name = "h", descriptor = "Ld;")
    public static class7 field8 = new class7();

    @OriginalMember(owner = "mapview!a", name = "N", descriptor = "Lv;")
    public static class40 field40 = class24.method170("Bank", (byte) 33);

    @OriginalMember(owner = "mapview!a", name = "O", descriptor = "Lv;")
    public static class40 field41 = class24.method170("Chainmail Shop", (byte) -92);

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "B")
    public byte field5;

    @OriginalMember(owner = "mapview!a", name = "j", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "mapview!a", name = "k", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "mapview!a", name = "l", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "mapview!a", name = "o", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "mapview!a", name = "p", descriptor = "I")
    public int field16;

    @OriginalMember(owner = "mapview!a", name = "q", descriptor = "I")
    public int field17;

    @OriginalMember(owner = "mapview!a", name = "s", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "mapview!a", name = "C", descriptor = "I")
    public int field29;

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "I")
    public int field3;

    @OriginalMember(owner = "mapview!a", name = "E", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "I")
    public int field4;

    @OriginalMember(owner = "mapview!a", name = "g", descriptor = "I")
    public int field7;

    @OriginalMember(owner = "mapview!a", name = "i", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "Ljava/awt/Frame;")
    public static Frame field2;

    @OriginalMember(owner = "mapview!a", name = "D", descriptor = "[B")
    public byte[] field30;

    @OriginalMember(owner = "mapview!a", name = "J", descriptor = "[B")
    public byte[] field36;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(JB)V", line = 22)
    public static final void method1(long arg0, byte arg1) {
        int var3 = -2 % ((arg1 + 9) / 63);
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var5) {
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Loa;", line = 39)
    public static final class27 method2(Throwable arg0, String arg1) {
        class27 var2;
        if (arg0 instanceof class27) {
            var2 = (class27) arg0;
            var2.field409 = var2.field409 + ' ' + arg1;
        } else {
            var2 = new class27(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 87)
    public static final void method3(Component arg0, int arg1) {
        if (arg1 != 32) {
            return;
        }
        Method var2 = class17.field180;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(field8);
        arg0.addFocusListener(field8);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(B)V", line = 147)
    public static void method4(byte arg0) {
        field40 = null;
        field8 = null;
        field23 = null;
        field2 = null;
        if (arg0 != 58) {
            field20 = null;
        }
        field41 = null;
        field20 = null;
        field13 = null;
        field18 = null;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IBIII)V", line = 167)
    public static final void method5(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = arg4 >> 6;
        int var6 = arg0 >> 6;
        if (class34.field454[arg3][var5][var6] == null) {
            class34.field454[arg3][var5][var6] = new byte[4096];
        }
        class34.field454[arg3][var5][var6][class39.method241(63, arg0) + (class39.method241(arg4, 63) << 6)] = arg1;
        if (arg2 > -96) {
            field23 = null;
        }
    }
}
