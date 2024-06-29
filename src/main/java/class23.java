import java.awt.Component;
import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class23 extends RuntimeException {

    @OriginalMember(owner = "mapview!l", name = "f", descriptor = "Ljava/lang/String;")
    public String field216;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field211;

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "[[B")
    public static byte[][] field213 = new byte[1000][];

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "I")
    public static int field212 = 0;

    @OriginalMember(owner = "mapview!l", name = "e", descriptor = "[[[[B")
    public static byte[][][][] field215 = new byte[5][][][];

    @OriginalMember(owner = "mapview!l", name = "g", descriptor = "Lu;")
    public static class38 field217 = class9.method45(-41, "fonts");

    @OriginalMember(owner = "mapview!l", name = "i", descriptor = "Lu;")
    public static class38 field219 = class9.method45(-41, "Potters Wheel");

    @OriginalMember(owner = "mapview!l", name = "h", descriptor = "Lfa;")
    public static class12 field218;

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "Ljava/awt/Font;")
    public static Font field214;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(B)V", line = 5)
    public static final void method104(byte arg0) {
        class19 var1 = class18.field164;
        synchronized (class18.field164) {
            class18.field158 = class26.field324;
            class16.field148 = class41.field521;
            class12.field119 = class39.field496;
            class5.field31 = class19.field185;
            class41.field525 = class22.field202;
            if (arg0 != 5) {
                method108(-91L, (byte) -58);
            }
            class8.field65 = class40.field506;
            class19.field185 = 0;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "([BZI)I", line = 39)
    public static final int method105(byte[] arg0, boolean arg1, int arg2) {
        return arg1 ? 80 : class25.method122(0, (byte) -15, arg0, arg2);
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(B)I", line = 54)
    public static final int method106(byte arg0) {
        if (arg0 <= 45) {
            method105(null, false, 121);
        }
        if (class22.field209 == null) {
            return 0;
        } else if (class22.field209.field445 == null) {
            return class16.field156[class22.field209.field449 & 0xFF];
        } else {
            return class16.field156[class22.field209.field445[class14.field139] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(I)V", line = 73)
    public static void method107(int arg0) {
        field213 = null;
        field214 = null;
        field217 = null;
        if (arg0 != 0) {
            field213 = null;
        }
        field218 = null;
        field215 = null;
        field219 = null;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(JB)V", line = 109)
    public static final void method108(long arg0, byte arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
        if (arg1 > -56) {
            field218 = null;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 137)
    public static final void method109(int arg0, Component arg1) {
        arg1.removeKeyListener(class13.field126);
        if (arg0 != 1000) {
            method109(70, null);
        }
        arg1.removeFocusListener(class13.field126);
        field212 = -1;
    }

    @OriginalMember(owner = "mapview!l", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 148)
    public class23(Throwable arg0, String arg1) {
        this.field216 = arg1;
        this.field211 = arg0;
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(Lu;Lw;Lw;Lu;B)Lt;", line = 169)
    public static final class37 method110(class38 arg0, class41 arg1, class41 arg2, class38 arg3, byte arg4) {
        int var5 = arg1.method263(arg3, -111);
        int var6 = arg1.method258(var5, arg0, (byte) 110);
        if (arg4 != 33) {
            method105(null, true, 121);
        }
        return class40.method254((byte) 85, arg2, var5, arg1, var6);
    }
}
