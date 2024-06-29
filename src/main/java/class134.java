import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class134 {

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public int field2196;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Lmg;")
    public static class134 field2188 = new class134(1);

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lmg;")
    public static class134 field2189 = new class134(2);

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Lmg;")
    public static class134 field2195 = new class134(4);

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Lmg;")
    public static class134 field2197 = new class134(1);

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "Lmg;")
    public static class134 field2198 = new class134(2);

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "Lmg;")
    public static class134 field2199 = new class134(4);

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "Lmg;")
    public static class134 field2200 = new class134(2);

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Lmg;")
    public static class134 field2201 = new class134(4);

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "Z")
    public static boolean field2202 = false;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "I")
    public static int field2204 = 0;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILvca;)Z")
    public static final boolean method1160(int arg0, class257 arg1) {
        field2190++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != 2) {
            field2189 = null;
        }
        if (!arg1.field4094) {
            return false;
        } else if (!arg1.method1822((byte) -58, class378.field5870)) {
            return false;
        } else if (class606.field8620.method1558((long) arg1.field4079, (byte) -93) == null) {
            return class236.field3753.method1558((long) arg1.field4112, (byte) -93) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static void method1161(int arg0) {
        field2195 = null;
        field2199 = null;
        if (arg0 != 1) {
            field2201 = null;
        }
        field2200 = null;
        field2197 = null;
        field2198 = null;
        field2201 = null;
        field2188 = null;
        field2189 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLol;)V")
    public static final void method1162(byte arg0, class260 arg1) {
        if (arg0 != -56) {
            method1160(54, null);
        }
        if ((arg1 instanceof class589)) {
            class589 var3 = (class589) arg1;
            if (var3.field8354 != null) {
                class9.method194(var3, class567.field8141.field9695 != var3.field9695, 1);
            }
        } else if (arg1 instanceof class304) {
            class304 var2 = (class304) arg1;
            class235.method1700(class567.field8141.field9695 != var2.field9695, (byte) 56, var2);
        }
        field2191++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/awt/Canvas;BLfa;I)Lr;")
    public static final class167 method1163(Canvas arg0, byte arg1, class214 arg2, int arg3) {
        if (arg1 != -108) {
            method1161(-41);
        }
        field2192++;
        return new class92(arg0, arg2, arg3);
    }

    @OriginalMember(owner = "client!mg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2193++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)Ljn;")
    public static final class669 method1164(byte arg0) {
        field2194++;
        try {
            if (arg0 != 86) {
                field2188 = null;
            }
            return (class669) Class.forName("bi").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I)V")
    private class134(int arg0) {
        this.field2196 = arg0;
    }
}
