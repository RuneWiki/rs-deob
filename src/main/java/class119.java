import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class119 {

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field2003 = 3553;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field2004 = 34037;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field2005 = 6407;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field2006 = 6408;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field2007 = 32993;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field2008 = 34843;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field2009 = 34842;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field2010 = 34837;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field2011 = 34836;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field2012 = 6406;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field2013 = 6402;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field2014 = 9729;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field2015 = 9728;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public static int field2016 = 5126;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field2017 = 5121;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "[I")
    private static int[] field2018 = new int[1];

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V", line = 7)
    public static final void method933(int arg0, int arg1, int arg2) {
        method941(field2004, arg0, arg1, arg2, field2005, field2017, (byte[]) null);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III[B)I", line = 15)
    public static final int method934(int arg0, int arg1, int arg2, byte[] arg3) {
        return method938(field2003, arg0, arg1, arg2, field2014, field2014, arg0, field2017, arg3);
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(III)V", line = 19)
    public static final void method935(int arg0, int arg1, int arg2) {
        method941(field2003, arg0, arg1, arg2, field2005, field2017, (byte[]) null);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "()V", line = 22)
    public static void method936() {
        field2018 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 25)
    public static final void method937(int arg0) {
        field2018[0] = arg0;
        class42.field627.glDeleteTextures(1, field2018, 0);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIIII[B)I", line = 30)
    public static final int method938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        GL var9 = class42.field627;
        int var10 = method939();
        if (arg0 == 3553) {
            class42.method273(var10);
        } else {
            var9.glBindTexture(arg0, var10);
        }
        method941(arg0, arg1, arg2, arg3, arg6, arg7, arg8);
        var9.glTexParameteri(3553, 10241, arg4);
        var9.glTexParameteri(3553, 10240, arg5);
        return var10;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "()I", line = 49)
    public static final int method939() {
        class42.field627.glGenTextures(1, field2018, 0);
        return field2018[0];
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(III)I", line = 53)
    public static final int method940(int arg0, int arg1, int arg2) {
        return method938(field2003, arg0, arg1, arg2, field2014, field2014, arg0, field2017, (byte[]) null);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIII[B)V", line = 57)
    public static final void method941(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        ByteBuffer var7 = arg6 == null ? null : ByteBuffer.wrap(arg6);
        class42.field627.glTexImage2D(arg0, 0, arg1, arg2, arg3, 0, arg4, arg5, var7);
    }
}
