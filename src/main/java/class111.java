import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class111 extends class317 {

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
    private final int field2005;

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
    private final int field2012;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    private final int field2003;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
    private final int field2007;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "I")
    public static int field2010 = 0;

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "[I")
    public static int[] field2015 = new int[100];

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "Lbd;")
    public static class162 field2018 = class17.method142(0, "gr-Un:");

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "Lda;")
    public static class143 field2008;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V", line = 4)
    public static void method893(byte arg0) {
        field2008 = null;
        field2018 = null;
        if (arg0 >= 85) {
            field2015 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(III)V", line = 16)
    public final void method424(int arg0, int arg1, int arg2) {
        if (arg2 != 50) {
            field2010 = -94;
        }
        field2006++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/awt/Component;III)Lpj;", line = 27)
    public static final class86 method894(Component arg0, int arg1, int arg2, int arg3) {
        field2009++;
        try {
            Class var4 = Class.forName("ml");
            if (arg1 == -9970) {
                class86 var5 = (class86) var4.getDeclaredConstructor().newInstance();
                var5.method11(arg2, -9750, arg3, arg0);
                return var5;
            } else {
                return (class86) null;
            }
        } catch (Throwable var8) {
            class220 var7 = new class220();
            var7.method11(arg2, arg1 ^ 0xE4, arg3, arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V", line = 52)
    public final void method421(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method897((byte) -66, -73);
        }
        field2014++;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)V", line = 62)
    public static final void method895(int arg0, int arg1) {
        class62.field955.method1538(arg1, (byte) -74);
        field2016++;
        if (arg0 != 100) {
            method895(-16, -31);
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(III)V", line = 98)
    public final void method422(int arg0, int arg1, int arg2) {
        if (arg2 != 4) {
            this.method424(-71, -39, 113);
        }
        int var4 = this.field2012 * arg0 >> 12;
        field2013++;
        int var5 = this.field2005 * arg0 >> 12;
        int var6 = this.field2003 * arg1 >> 12;
        int var7 = this.field2007 * arg1 >> 12;
        class148.method1175(var7, this.field5345, false, var6, var5, var4);
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)Lmb;", line = 129)
    public static final class10 method896(byte arg0) {
        field2017++;
        int var1 = -1 % ((arg0 - 17) / 51);
        try {
            return (class10) Class.forName("sg").getDeclaredConstructor().newInstance();
        } catch (Throwable var3) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IIIIII)V", line = 145)
    public class111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2005 = arg2;
        this.field2012 = arg0;
        this.field2003 = arg1;
        this.field2007 = arg3;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)Lfi;", line = 157)
    public static final class70 method897(byte arg0, int arg1) {
        field2004++;
        if (arg0 != -60) {
            method896((byte) 125);
        }
        class70 var2 = (class70) class62.field955.method1536((long) arg1, -111);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class34.field554.method1128(class12.method99(arg0 ^ 0x34, arg1), 0, class72.method521(28071, arg1));
        class70 var4 = new class70();
        if (var3 != null) {
            var4.method509(new class94(var3), (byte) -117);
        }
        class62.field955.method1532((long) arg1, arg0 - 5, var4);
        return var4;
    }
}
