import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class123 extends class27 {

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    private int field1991;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
    private int field1998;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    private int field1995;

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
    private int field2000;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "Lvj;")
    public static class115 field1999 = new class115();

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "Ljava/lang/String;")
    public static String field2003 = "wave:";

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "Lab;")
    public static class146 field2004;

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(IIIIIII)V")
    public class123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1991 = arg0;
        this.field1998 = arg3;
        this.field1995 = arg1;
        this.field2000 = arg2;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)Lph;")
    public static final class78 method886(int arg0) {
        ++field1996;
        if (arg0 > -45) {
            method890((byte) -58);
        }
        class56.field964 = 0;
        return class12.method92((byte) -42);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IBI)V")
    public final void method234(int arg0, byte arg1, int arg2) {
        ++field1994;
        int var4 = this.field1991 * arg2 >> 12;
        if (arg1 <= -74) {
            int var5 = this.field2000 * arg2 >> 12;
            int var6 = this.field1995 * arg0 >> 12;
            int var7 = this.field1998 * arg0 >> 12;
            class181.method1233(var4, var5, super.field427, var7, 3, var6);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method887(int arg0, Component arg1) {
        if (arg0 >= 45) {
            arg1.removeMouseListener(class12.field234);
            ++field1993;
            arg1.removeMouseMotionListener(class12.field234);
            arg1.removeFocusListener(class12.field234);
            class241.field3895 = 0;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BII)I")
    public static final int method888(byte arg0, int arg1, int arg2) {
        ++field2002;
        if (arg0 != -37) {
            field2003 = null;
        }
        if (~arg2 < ~arg1) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        while (~arg2 != -1) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V")
    public static final void method889(byte arg0) {
        if (arg0 != 22) {
            method890((byte) -37);
        }
        class222.field3685.method472((byte) -63);
        class229.field3773.method472((byte) -63);
        ++field1992;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIB)V")
    public final void method236(int arg0, int arg1, byte arg2) {
        int var4 = this.field1991 * arg0 >> 12;
        ++field1997;
        int var5 = this.field2000 * arg0 >> 12;
        int var6 = this.field1998 * arg1 >> 12;
        int var7 = this.field1995 * arg1 >> 12;
        int var8 = 60 / ((33 - arg2) / 54);
        class185.method1252(var5, var7, super.field424, super.field423, 104, var6, var4);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(IBI)V")
    public final void method238(int arg0, byte arg1, int arg2) {
        ++field1990;
        int var4 = this.field1991 * arg2 >> 12;
        int var5 = -37 % ((arg1 - -2) / 58);
        int var6 = this.field2000 * arg2 >> 12;
        int var7 = this.field1995 * arg0 >> 12;
        int var8 = this.field1998 * arg0 >> 12;
        class16.method125(super.field427, 0, super.field423, var8, var6, var7, super.field424, var4);
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(B)V")
    public static void method890(byte arg0) {
        field2004 = null;
        field1999 = null;
        field2003 = null;
        if (arg0 > -124) {
            method888((byte) 61, -111, -36);
        }
    }
}
