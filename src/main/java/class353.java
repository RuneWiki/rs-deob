import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class353 extends class40 {

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    private int field5178;

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "S")
    public static short field5181 = 1;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field5182 = new String[100];

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    public static int field5176;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public static int field5180;

    @OriginalMember(owner = "client!dk", name = "A", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "(I)V", line = 3)
    public static void method2115(int arg0) {
        if (arg0 <= 75) {
            method2115(-72);
        }
        field5182 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZB)V", line = 13)
    public final void method2116(boolean arg0, byte arg1) {
        super.field503.method1996(2, this);
        int var3 = -110 % ((58 - arg1) / 41);
        ++field5176;
        OpenGL.glTexParameteri(super.field505, 10242, arg0 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "(I)V", line = 26)
    public static final void method2117(int arg0) {
        if (arg0 == 7051) {
            class498.field7256 = 0;
            class289.field4004 = 0;
            class74.field1003 = 0;
            class143.field2059 = 0;
            ++field5177;
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lef;II[BI)V", line = 37)
    public class353(class338 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field5178 = arg2;
        super.field503.method1996(2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field505, 0, super.field496, this.field5178, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method335((byte) 51, true);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V", line = 52)
    public final void method332(byte arg0) {
        if (arg0 != 37) {
            this.method332((byte) 82);
        }
        ++field5183;
    }
}
