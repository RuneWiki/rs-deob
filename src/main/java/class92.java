import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class92 implements class650 {

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[Ltf;")
    private class220[] field1345 = new class220[9];

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    private int field1354 = 0;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    private int field1356 = -1;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "Lkfa;")
    private class382 field1362;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    private int field1343;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Leda;")
    public static class116 field1353 = new class116(93, 9);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    private int field1342;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    private int field1346;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
    private int field1368;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLkf;I)V", line = 7)
    public final void method676(byte arg0, class325 arg1, int arg2) {
        field1366++;
        if (this.field1356 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg2;
        if ((this.field1368 & ~var4) == 0) {
            this.field1342 = arg1.field4536;
            this.field1346 = arg1.field4522;
        } else if (this.field1346 != arg1.field4522 || this.field1342 != arg1.field4536) {
            throw new RuntimeException();
        }
        arg1.method1942(-4993, class538.field7906[arg2], this.field1356);
        this.field1345[arg2] = arg1;
        this.field1368 |= var4;
        if (arg0 > -69) {
            this.method676((byte) -62, null, -76);
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V", line = 39)
    public final void method677(int arg0) {
        field1365++;
        OpenGL.glBindFramebufferEXT(36160, this.field1343);
        this.field1354 |= 0x4;
        this.field1356 = this.method684((byte) -80);
        if (arg0 != 29991) {
            this.method683(126);
        }
    }

    @OriginalMember(owner = "client!ec", name = "finalize", descriptor = "()V", line = 52)
    protected final void finalize() throws Throwable {
        field1360++;
        this.field1362.method2331(-1, this.field1343);
        super.finalize();
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V", line = 61)
    public final void method678(int arg0) {
        if (arg0 < -84) {
            OpenGL.glBindFramebufferEXT(36009, 0);
            field1359++;
            this.field1354 &= 0xFFFFFFFD;
            this.field1356 = this.method684((byte) 74);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILgfa;I)V", line = 77)
    public final void method679(int arg0, int arg1, class656 arg2, int arg3) {
        this.method682(arg0, false, arg2, arg3, arg1);
        field1349++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V", line = 87)
    public final void method680(int arg0, int arg1) {
        field1355++;
        if (this.field1356 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class538.field7906[arg1]);
        if (arg0 != 20733) {
            this.method684((byte) -42);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIILil;)V", line = 102)
    private final void method681(int arg0, int arg1, int arg2, class586 arg3) {
        field1351++;
        if (~this.field1356 == arg0) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg1;
        if ((this.field1368 & ~var5) == 0) {
            this.field1342 = arg3.field8571;
            this.field1346 = arg3.field8567;
        } else if (this.field1346 != arg3.field8567 || this.field1342 != arg3.field8571) {
            throw new RuntimeException();
        }
        arg3.method3376(class538.field7906[arg1], 492, arg2, this.field1356);
        this.field1345[arg1] = arg3;
        this.field1368 |= var5;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZLgfa;II)V", line = 130)
    private final void method682(int arg0, boolean arg1, class656 arg2, int arg3, int arg4) {
        field1350++;
        if (this.field1356 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg3;
        if ((~var6 & this.field1368) == 0) {
            this.field1346 = arg2.field9267;
            this.field1342 = arg2.field9267;
        } else if (this.field1346 != arg2.field9267 || this.field1342 != arg2.field9267) {
            throw new RuntimeException();
        }
        if (arg1) {
            this.field1346 = -60;
        }
        arg2.method3703(this.field1356, arg0, class538.field7906[arg3], (byte) -57, arg4);
        this.field1345[arg3] = arg2;
        this.field1368 |= var6;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lkfa;)V", line = 338)
    public class92(class382 arg0) {
        if (!arg0.field5571) {
            throw new IllegalStateException("");
        }
        this.field1362 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class538.field7910, 0);
        this.field1343 = class538.field7910[0];
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 167)
    public final void method683(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field1343);
        field1364++;
        this.field1354 |= 0x2;
        this.field1356 = this.method684((byte) 83);
        if (arg0 != -16793) {
            field1347 = -52;
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)I", line = 188)
    private final int method684(byte arg0) {
        int var2 = -97 % ((arg0 - 14) / 46);
        field1352++;
        if ((this.field1354 & 0x4) != 0) {
            return 36160;
        } else if ((this.field1354 & 0x2) == 0) {
            return (this.field1354 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)V", line = 211)
    public static void method685(byte arg0) {
        if (arg0 > -18) {
            field1347 = 76;
        }
        field1353 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 230)
    public final void method686(byte arg0) {
        field1363++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field1354 &= 0xFFFFFFFB;
        this.field1356 = this.method684((byte) -128);
        int var2 = 106 % ((-arg0 - 22) / 39);
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V", line = 246)
    public final void method687(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        field1344++;
        if (arg0 == 14837) {
            this.field1354 &= 0xFFFFFFFE;
            this.field1356 = this.method684((byte) 107);
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)V", line = 260)
    public final void method688(int arg0, int arg1) {
        if (this.field1345[arg1] != null) {
            this.field1345[arg1].method1475(101);
        }
        field1357++;
        int var3 = 89 / ((-arg0 - 60) / 37);
        this.field1368 &= ~(0x1 << arg1);
        this.field1345[arg1] = null;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V", line = 276)
    public final void method689(byte arg0) {
        if (arg0 == 28) {
            OpenGL.glBindFramebufferEXT(36008, this.field1343);
            field1361++;
            this.field1354 |= 0x1;
            this.field1356 = this.method684((byte) 107);
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(II)V", line = 289)
    public final void method690(int arg0, int arg1) {
        field1348++;
        if (this.field1356 == -1) {
            throw new RuntimeException();
        }
        if (arg0 != 21589) {
            this.method679(-96, -30, null, -122);
        }
        OpenGL.glDrawBuffer(class538.field7906[arg1]);
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)Z", line = 304)
    public final boolean method691(int arg0) {
        field1367++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field1356);
        if (arg0 > -61) {
            this.field1362 = null;
        }
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLil;I)V", line = 327)
    public final void method692(byte arg0, class586 arg1, int arg2) {
        this.method681(0, arg2, 0, arg1);
        if (arg0 >= -118) {
            this.field1354 = 117;
        }
        field1358++;
    }
}
