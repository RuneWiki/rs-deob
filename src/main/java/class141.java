import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public abstract class class141 extends class324 {

    @OriginalMember(owner = "client!aq", name = "r", descriptor = "Lad;")
    public class362 field1741;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "J")
    public static volatile long field1739 = 0L;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "Z")
    public static boolean field1740 = false;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public static int field1734 = 0;

    @OriginalMember(owner = "client!aq", name = "u", descriptor = "Lkca;")
    public static class73 field1744 = new class73(44, 3);

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!aq", name = "t", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!aq", name = "v", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!aq", name = "w", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "Lpn;")
    public static class644 field1735;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "Z")
    public boolean field1733;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IFFIFIFFLqp;I[BBI)V")
    public static final void method844(int arg0, float arg1, float arg2, int arg3, float arg4, int arg5, float arg6, float arg7, class573 arg8, int arg9, byte[] arg10, byte arg11, int arg12) {
        field1738++;
        int var13 = 0;
        if (arg11 > -107) {
            method853((byte) -89, -43, null, null, null);
        }
        while (arg0 > var13) {
            class243.method1619(arg8, arg9, arg5, arg6, arg3, arg1, arg10, (byte) -123, arg7, arg0, var13, arg12, arg4, arg2);
            arg9 += arg3 * arg12;
            var13++;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V")
    public abstract void method845(byte arg0);

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZI)V")
    public abstract void method846(boolean arg0, int arg1);

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(Z)Z")
    public abstract boolean method847(boolean arg0);

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)Z")
    public abstract boolean method848(int arg0);

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I[J[Ljava/lang/Object;)V")
    public static final void method849(int arg0, long[] arg1, Object[] arg2) {
        class609.method3533(0, arg1, arg2, arg1.length - 1, 1);
        field1737++;
        if (arg0 >= -5) {
            field1740 = true;
        }
    }

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "(I)Z")
    public final boolean method850(int arg0) {
        if (arg0 != 0) {
            method853((byte) 120, -44, null, null, null);
        }
        field1736++;
        return this.field1733;
    }

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "(I)V")
    public static void method851(int arg0) {
        int var1 = -44 % ((14 - arg0) / 47);
        field1735 = null;
        field1744 = null;
    }

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "(I)I")
    public final int method852(int arg0) {
        if (arg0 == 0) {
            field1742++;
            return 1;
        } else {
            return -43;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BILjava/awt/Canvas;Lkea;Le;)Loa;")
    public static final class605 method853(byte arg0, int arg1, Canvas arg2, class203 arg3, class462 arg4) {
        field1745++;
        if (!class81.method532(-96)) {
            throw new RuntimeException("");
        } else if (class636.method3630(105, "jaggl")) {
            if (arg0 >= -19) {
                method853((byte) 101, -21, null, null, null);
            }
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg2, 8, 8, 8, 24, 0, arg1);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class234 var8 = new class234(var5, arg2, var6, arg4, arg3, arg1);
            var8.method1964(4);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(B)I")
    public int method854(byte arg0) {
        field1743++;
        if (arg0 < 86) {
            this.method857(true);
        }
        return 0;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZILcs;Lcs;)V")
    public abstract void method855(boolean arg0, int arg1, class289 arg2, class289 arg3);

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lad;)V")
    public class141(class362 arg0) {
        this.field1741 = arg0;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BII)V")
    public abstract void method856(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(Z)Z")
    public final boolean method857(boolean arg0) {
        field1746++;
        return arg0 ? false : false;
    }
}
