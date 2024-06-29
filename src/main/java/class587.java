import jaggl.OpenGL;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class587 extends class188 {

    @OriginalMember(owner = "client!pu", name = "v", descriptor = "I")
    private int field8285;

    @OriginalMember(owner = "client!pu", name = "s", descriptor = "I")
    public static int field8282;

    @OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
    public static int field8283;

    @OriginalMember(owner = "client!pu", name = "u", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 3)
    public static final void method3423(String arg0, int arg1) {
        ++field8284;
        if (arg1 <= -105) {
            if (class353.field4964 == null) {
                class333.method2121(500);
            }
            class602.field8435.setTime(new Date(class459.method2731(124)));
            int var2 = class602.field8435.get(11);
            int var3 = class602.field8435.get(12);
            int var4 = class602.field8435.get(13);
            String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
            String[] var6 = class3.method22(true, '\n', arg0);
            for (int var7 = 0; var7 < var6.length; ++var7) {
                for (int var8 = class787.field10806; ~var8 < -1; --var8) {
                    class353.field4964[var8] = class353.field4964[var8 + -1];
                }
                class353.field4964[0] = var5 + ": " + var6[var7];
                if (class239.field3592 != null) {
                    try {
                        class239.field3592.write(class518.method3119((byte) 119, class353.field4964[0] + "\n"));
                    } catch (IOException var9) {
                    }
                }
                if (class353.field4964.length - 1 > class787.field10806) {
                    if (~class138.field2057 < -1) {
                        ++class138.field2057;
                    }
                    ++class787.field10806;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lqfa;II[BI)V", line = 68)
    public class587(class106 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field8285 = arg2;
        super.field2905.method808((byte) 34, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field2899, 0, super.field2906, this.field8285, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1312((byte) -79, true);
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(IZ)V", line = 84)
    public final void method3424(int arg0, boolean arg1) {
        super.field2905.method808((byte) 34, this);
        ++field8282;
        OpenGL.glTexParameteri(super.field2899, 10242, arg1 ? 10497 : 33071);
        if (arg0 != 4) {
            this.method1319(-49);
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(II)I", line = 96)
    public static int method3425(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V", line = 105)
    public final void method1319(int arg0) {
        ++field8283;
        if (arg0 != -17115) {
            method3423((String) null, 78);
        }
    }
}
