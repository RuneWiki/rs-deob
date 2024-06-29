import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class98 implements class622 {

    @OriginalMember(owner = "client!ju", name = "x", descriptor = "I")
    private int field1460 = -1;

    @OriginalMember(owner = "client!ju", name = "z", descriptor = "[Ljv;")
    private class619[] field1462 = new class619[9];

    @OriginalMember(owner = "client!ju", name = "v", descriptor = "I")
    private int field1458 = 0;

    @OriginalMember(owner = "client!ju", name = "s", descriptor = "Lrs;")
    private class166 field1455;

    @OriginalMember(owner = "client!ju", name = "u", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client!ju", name = "t", descriptor = "Lwk;")
    public static class430 field1456 = new class430(11, 7);

    @OriginalMember(owner = "client!ju", name = "B", descriptor = "I")
    public static int field1464 = 0;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
    private int field1442;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!ju", name = "m", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!ju", name = "q", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ju", name = "r", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!ju", name = "w", descriptor = "I")
    private int field1459;

    @OriginalMember(owner = "client!ju", name = "y", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!ju", name = "A", descriptor = "I")
    private int field1463;

    @OriginalMember(owner = "client!ju", name = "C", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!ju", name = "D", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)V")
    public final void method797(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        field1440++;
        this.field1458 &= 0xFFFFFFFE;
        this.field1460 = this.method804(36008);
        int var2 = -110 / (arg0 / 50);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIILio;)V")
    public final void method798(int arg0, int arg1, int arg2, class708 arg3) {
        field1441++;
        this.method810(arg0, arg2, arg1, arg3, (byte) -103);
    }

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "(I)V")
    public final void method799(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, 0);
        field1438++;
        this.field1458 &= 0xFFFFFFFB;
        if (arg0 == -3364) {
            this.field1460 = this.method804(36008);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V")
    public final void method800(byte arg0) {
        if (arg0 != 33) {
            this.field1459 = 45;
        }
        OpenGL.glBindFramebufferEXT(36160, this.field1457);
        field1454++;
        this.field1458 |= 0x4;
        this.field1460 = this.method804(36008);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
    public final void method801(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field1457);
        if (arg0 != 9249) {
            method803(-114, 8, 114);
        }
        field1452++;
        this.field1458 |= 0x2;
        this.field1460 = this.method804(36008);
    }

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "(I)V")
    public static void method802(int arg0) {
        if (arg0 != -17) {
            field1447 = 116;
        }
        field1456 = null;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(III)V")
    public static final void method803(int arg0, int arg1, int arg2) {
        field1446++;
        if (class274.field4187 == 1) {
            class370.method2364(true, arg1, arg0, class469.field6822);
        } else if (class274.field4187 == 2) {
            if (class250.field3989) {
                class569.method3301(arg1 + class545.method3197(-106), arg0 + class499.method3028(0), false);
            } else {
                class569.method3301(arg1, arg0, false);
            }
        }
        class274.field4187 = arg2;
        class469.field6822 = null;
    }

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "(I)I")
    private final int method804(int arg0) {
        if (arg0 != 36008) {
            this.field1458 = -45;
        }
        field1449++;
        if ((this.field1458 & 0x4) != 0) {
            return 36160;
        } else if ((this.field1458 & 0x2) == 0) {
            return (this.field1458 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILqca;I)V")
    public final void method805(int arg0, class314 arg1, int arg2) {
        field1448++;
        if (this.field1460 == -1) {
            throw new RuntimeException();
        }
        int var4 = arg2 << arg0;
        if ((this.field1459 & ~var4) == 0) {
            this.field1442 = arg1.field4730;
            this.field1463 = arg1.field4718;
        } else if (this.field1442 != arg1.field4730 || this.field1463 != arg1.field4718) {
            throw new RuntimeException();
        }
        arg1.method2068(this.field1460, false, class105.field1544[arg0]);
        this.field1462[arg0] = arg1;
        this.field1459 |= var4;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)V")
    public final void method806(int arg0, int arg1) {
        field1444++;
        if (this.field1460 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class105.field1544[arg0]);
        int var3 = -83 / ((51 - arg1) / 53);
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IILwo;I)V")
    private final void method807(int arg0, int arg1, class692 arg2, int arg3) {
        field1451++;
        if (this.field1460 == -1) {
            throw new RuntimeException();
        }
        if (arg0 != 3176) {
            this.method801(14);
        }
        int var5 = 0x1 << arg1;
        if ((~var5 & this.field1459) == 0) {
            this.field1463 = arg2.field9807;
            this.field1442 = arg2.field9818;
        } else if (this.field1442 != arg2.field9818 || this.field1463 != arg2.field9807) {
            throw new RuntimeException();
        }
        arg2.method3861(arg3, true, this.field1460, class105.field1544[arg1]);
        this.field1462[arg1] = arg2;
        this.field1459 |= var5;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)V")
    public final void method808(boolean arg0) {
        if (!arg0) {
            field1445++;
            OpenGL.glBindFramebufferEXT(36009, 0);
            this.field1458 &= 0xFFFFFFFD;
            this.field1460 = this.method804(36008);
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(II)V")
    public final void method809(int arg0, int arg1) {
        field1443++;
        if (arg1 > -65) {
            return;
        }
        if (this.field1460 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class105.field1544[arg0]);
    }

    @OriginalMember(owner = "client!ju", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1465++;
        this.field1455.method1343(this.field1457, (byte) -55);
        super.finalize();
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIILio;B)V")
    private final void method810(int arg0, int arg1, int arg2, class708 arg3, byte arg4) {
        field1466++;
        if (this.field1460 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg0;
        if ((~var6 & this.field1459) == 0) {
            this.field1463 = arg3.field9978;
            this.field1442 = arg3.field9978;
        } else if (this.field1442 != arg3.field9978 || this.field1463 != arg3.field9978) {
            throw new RuntimeException();
        }
        arg3.method3924(34069, arg1, this.field1460, arg2, class105.field1544[arg0]);
        this.field1462[arg0] = arg3;
        if (arg4 >= -48) {
            this.field1457 = -23;
        }
        this.field1459 |= var6;
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)V")
    public final void method811(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field1457);
        field1439++;
        this.field1458 |= 0x1;
        this.field1460 = this.method804(36008);
        if (arg0 != 30988) {
            this.method800((byte) 7);
        }
    }

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)Z")
    public final boolean method812(byte arg0) {
        field1461++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field1460);
        if (arg0 == -111) {
            return var2 == 36053;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(BI)V")
    public final void method813(byte arg0, int arg1) {
        if (this.field1462[arg1] != null) {
            this.field1462[arg1].method2069((byte) -31);
        }
        int var3 = -59 % ((-arg0 - 41) / 44);
        field1437++;
        this.field1459 &= ~(0x1 << arg1);
        this.field1462[arg1] = null;
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lrs;)V")
    public class98(class166 arg0) {
        if (!arg0.field2805) {
            throw new IllegalStateException("");
        }
        this.field1455 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class596.field8451, 0);
        this.field1457 = class596.field8451[0];
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lwo;ZI)V")
    public final void method814(class692 arg0, boolean arg1, int arg2) {
        field1453++;
        if (arg1) {
            this.method807(3176, arg2, arg0, 0);
        }
    }
}
