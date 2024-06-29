import jaggl.OpenGL;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class266 extends class440 {

    @OriginalMember(owner = "client!lp", name = "z", descriptor = "I")
    private int field3840;

    @OriginalMember(owner = "client!lp", name = "C", descriptor = "I")
    public static int field3843 = 0;

    @OriginalMember(owner = "client!lp", name = "w", descriptor = "Ldq;")
    public static class489 field3837 = new class489(10, 7);

    @OriginalMember(owner = "client!lp", name = "E", descriptor = "[I")
    public static int[] field3845 = new int[5];

    @OriginalMember(owner = "client!lp", name = "v", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!lp", name = "x", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!lp", name = "y", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!lp", name = "A", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!lp", name = "B", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!lp", name = "D", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!lp", name = "F", descriptor = "[I")
    public static int[] field3846;

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lqg;II[BI)V", line = 3)
    public class266(class321 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field3840 = arg2;
        super.field6421.method2042(this, 0);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field6424, 0, super.field6412, this.field3840, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2673(95, true);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)Z", line = 16)
    public static final boolean method1701(int arg0, int arg1, int arg2) {
        if (arg0 != -2001) {
            field3837 = null;
        }
        ++field3841;
        return class390.method2452(arg0 + 2034, arg2, arg1) | ~(arg1 & 458752) != -1 || class415.method2559(arg0 ^ -1951, arg1, arg2);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)V", line = 28)
    public final void method329(boolean arg0) {
        if (arg0) {
            ++field3844;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V", line = 42)
    public static final void method1702(byte arg0) {
        ++field3839;
        if (~class267.field3859 != -1) {
            try {
                if (~(++class343.field5238) < -2001) {
                    if (class138.field2091 != null) {
                        class138.field2091.method694(false);
                        class138.field2091 = null;
                    }
                    if (~class303.field4362 <= -2) {
                        class412.field6071 = -5;
                        class267.field3859 = 0;
                        return;
                    }
                    if (~class334.field5129 != ~class289.field4153) {
                        class334.field5129 = class289.field4153;
                    } else {
                        class334.field5129 = class231.field3376;
                    }
                    ++class303.field4362;
                    class343.field5238 = 0;
                    class267.field3859 = 1;
                }
                if (class267.field3859 == 1) {
                    class178.field2699 = class112.field1785.method1962(1, class102.field1633, class334.field5129);
                    class267.field3859 = 2;
                }
                if (~class267.field3859 == -3) {
                    if (~class178.field2699.field1604 == -3) {
                        throw new IOException();
                    }
                    if (class178.field2699.field1604 != 1) {
                        return;
                    }
                    class138.field2091 = new class85((Socket) class178.field2699.field1608, class112.field1785);
                    class178.field2699 = null;
                    class138.field2091.method695(class86.field1436.field4333, 0, class86.field1436.field4326, (byte) 120);
                    class13.method125(-4);
                    int var1 = class138.field2091.method697(0);
                    class13.method125(-4);
                    if (~var1 != -22) {
                        class267.field3859 = 0;
                        class412.field6071 = var1;
                        class138.field2091.method694(false);
                        class138.field2091 = null;
                        return;
                    }
                    class267.field3859 = 3;
                }
                if (~class267.field3859 == -4) {
                    if (class138.field2091.method693((byte) -127) < 1) {
                        return;
                    }
                    class173.field2642 = new String[class138.field2091.method697(0)];
                    class267.field3859 = 4;
                }
                if (class267.field3859 != 4) {
                    int var3 = 66 / ((23 - arg0) / 34);
                } else if (~class138.field2091.method693((byte) -121) <= ~(class173.field2642.length * 8)) {
                    class387.field5738.field4333 = 0;
                    class138.field2091.method691(0, class387.field5738.field4326, 124, class173.field2642.length * 8);
                    for (int var2 = 0; var2 < class173.field2642.length; ++var2) {
                        class173.field2642[var2] = class41.method317((byte) 26, class387.field5738.method1917((byte) 4));
                    }
                    class267.field3859 = 0;
                    class412.field6071 = 21;
                    class138.field2091.method694(false);
                    class138.field2091 = null;
                }
            } catch (IOException var4) {
                if (class138.field2091 != null) {
                    class138.field2091.method694(false);
                    class138.field2091 = null;
                }
                if (~class303.field4362 > -2) {
                    if (class334.field5129 != class289.field4153) {
                        class334.field5129 = class289.field4153;
                    } else {
                        class334.field5129 = class231.field3376;
                    }
                    ++class303.field4362;
                    class343.field5238 = 0;
                    class267.field3859 = 1;
                } else {
                    class412.field6071 = -4;
                    class267.field3859 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "(I)V", line = 185)
    public static void method1703(int arg0) {
        field3837 = null;
        field3846 = null;
        field3845 = null;
        if (arg0 != 13761) {
            field3845 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(CB)Z", line = 198)
    public static final boolean method1704(char arg0, byte arg1) {
        if (arg1 != 24) {
            field3846 = null;
        }
        ++field3842;
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZI)V", line = 212)
    public final void method1705(boolean arg0, int arg1) {
        ++field3836;
        if (arg1 >= 105) {
            super.field6421.method2042(this, 0);
            OpenGL.glTexParameteri(super.field6424, 10242, arg0 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "(I)I", line = 225)
    public static final int method1706(int arg0) {
        ++field3838;
        int var1 = -48 % ((-64 - arg0) / 62);
        return class73.field1228;
    }
}
