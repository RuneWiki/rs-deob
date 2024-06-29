import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class284 extends class167 implements class303 {

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Lin;")
    public class167 field3843;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "Z")
    public static boolean field3857 = false;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "Lmh;")
    public static class112 field3854;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "[I")
    public static int[] field3856;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)Z", line = 3)
    public final boolean method160(byte arg0) {
        field3858++;
        if (arg0 != 112) {
            field3856 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)I", line = 15)
    public final int method157(byte arg0) {
        field3848++;
        return arg0 == -22 ? 0 : 3;
    }

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "(I)V", line = 29)
    public static void method1631(int arg0) {
        if (arg0 != -1314633917) {
            field3856 = null;
        }
        field3856 = null;
        field3854 = null;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)Z", line = 43)
    public final boolean method169(int arg0) {
        if (arg0 != -28206) {
            field3850 = 112;
        }
        field3859++;
        return false;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IBILza;)Z", line = 55)
    public final boolean method158(int arg0, byte arg1, int arg2, class295 arg3) {
        if (arg1 <= 58) {
            return true;
        } else {
            field3846++;
            return false;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lza;I)V", line = 69)
    public final void method156(class295 arg0, int arg1) {
        field3847++;
        if (arg1 >= -109) {
            method1632(109, (byte) 53, true);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)I", line = 80)
    public final int method159(int arg0) {
        int var2 = 41 / ((78 - arg0) / 46);
        field3851++;
        return 0;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(Lza;I)V", line = 90)
    public final void method164(class295 arg0, int arg1) {
        field3860++;
        if (arg1 != 1907) {
            this.method170((byte) 57);
        }
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)V", line = 100)
    public final void method168(int arg0) {
        field3842++;
        int var2 = 92 % ((arg0 - 43) / 56);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILza;B)Le;", line = 109)
    public final class285 method162(int arg0, class295 arg1, byte arg2) {
        if (arg2 != -14) {
            field3857 = false;
        }
        field3853++;
        return null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLza;)Lql;", line = 125)
    public final class121 method171(byte arg0, class295 arg1) {
        if (arg0 == -96) {
            field3849++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(Lza;I)V", line = 136)
    public final void method166(class295 arg0, int arg1) {
        if (arg1 < 7) {
            method1631(42);
        }
        field3852++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IBZ)V", line = 149)
    public static final void method1632(int arg0, byte arg1, boolean arg2) {
        field3861++;
        if (arg0 == 0) {
            class275.field3737 = class295.method1715(arg0, class76.field1075.field3689 * 2, class415.field6025, class239.field3307, class346.field4985, (byte) 70);
        } else {
            if (arg2) {
                class275.field3737 = class295.method1715(0, 0, class415.field6025, class239.field3307, class346.field4985, (byte) 105);
                class275.field3737.method467(0);
                class61 var3 = class130.method938(class521.field7644, 0, class300.field4107, (byte) 32);
                class306 var4 = class275.field3737.method529(var3, class396.method2347(class509.field7453, class521.field7644, 0), true);
                class229.method1408(0, class314.field4251.method1126(class486.field6998, (byte) -19), var4, true);
                class275.field3737.method536();
                class366.method2191(0);
                class275.field3737.method1713(-1);
            }
            try {
                class275.field3737 = class295.method1715(arg0, class76.field1075.field3689 * 2, class415.field6025, class239.field3307, class346.field4985, (byte) 64);
                if (class275.field3737.method542()) {
                    boolean var5 = true;
                    try {
                        var5 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var8) {
                    }
                    class391 var6;
                    if (var5) {
                        var6 = class275.field3737.method539(146800640);
                    } else {
                        var6 = class275.field3737.method539(104857600);
                    }
                    class275.field3737.method497(var6);
                }
            } catch (Throwable var9) {
                arg0 = 0;
                class275.field3737 = class295.method1715(0, 0, class415.field6025, class239.field3307, class346.field4985, (byte) 89);
            }
        }
        class195.field2849 = arg0;
        class302.method1751(2);
        if (!class275.field3737.method531()) {
            class499.field7299 = 1;
        }
        class275.field3737.method493(class499.field7299);
        class275.field3737.method494(0);
        class275.field3737.method547(8);
        class14.field146 = class275.field3737.method489();
        class374.field5384 = class275.field3737.method489();
        class120.method879((byte) 48);
        class275.field3737.method524(!class76.field1075.field3674);
        if (class275.field3737.method519()) {
            class148.method1067(true, class76.field1075.field3679);
        }
        class445.method2630(-58, class192.field2809 >> 3, class275.field3737, class9.field111 >> 3);
        int var7 = 122 / ((-arg1 - 58) / 32);
        class325.method1925((byte) -123);
        class425.field6186 = false;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Llb;IZIBILza;)V", line = 226)
    public final void method161(class186 arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, class295 arg6) {
        field3855++;
        if (arg4 < 54) {
            field3854 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIILin;)V", line = 237)
    public class284(int arg0, int arg1, int arg2, class167 arg3) {
        super(arg0, arg1, arg2, arg3.field2557, false, false);
        this.field3843 = arg3;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V", line = 245)
    public final void method165(int arg0) {
        if (arg0 == -8698) {
            field3844++;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)I", line = 260)
    public final int method170(byte arg0) {
        field3845++;
        int var2 = -100 % ((arg0 + 11) / 47);
        return 0;
    }
}
