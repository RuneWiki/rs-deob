import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class89 {

    @OriginalMember(owner = "client!qda", name = "h", descriptor = "I")
    private int field1646;

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "[I")
    public static int[] field1641 = new int[4096];

    @OriginalMember(owner = "client!qda", name = "i", descriptor = "[I")
    public static int[] field1647 = new int[] { 25000, 2000 };

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!qda", name = "d", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!qda", name = "e", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!qda", name = "f", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!qda", name = "g", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!qda", name = "j", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!qda", name = "k", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZLro;)I")
    public static final int method867(boolean arg0, class2 arg1) {
        if (!arg0) {
            field1647 = null;
        }
        field1645++;
        if (class2.field369 == arg1) {
            return 5120;
        } else if (class2.field370 == arg1) {
            return 5122;
        } else if (class2.field371 == arg1) {
            return 5124;
        } else if (class2.field372 == arg1) {
            return 5121;
        } else if (class2.field373 == arg1) {
            return 5123;
        } else if (class2.field374 == arg1) {
            return 5125;
        } else if (class2.field375 == arg1) {
            return 5131;
        } else if (class2.field376 == arg1) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)Z")
    public static final boolean method868(int arg0, int arg1, int arg2) {
        field1648++;
        if (arg0 != 5125) {
            method873((byte) 83);
        }
        if (arg1 >= 0 && arg2 >= 0 && class517.field7301[1].length > arg1 && arg2 < class517.field7301[1][arg1].length) {
            return (class517.field7301[1][arg1][arg2] & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)V")
    public final void method869(byte arg0) {
        if (arg0 < -59) {
            OpenGL.glEndList();
            field1649++;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V")
    public static void method870(int arg0) {
        field1647 = null;
        if (arg0 != -22672) {
            field1647 = null;
        }
        field1641 = null;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZC)V")
    public final void method871(boolean arg0, char arg1) {
        field1640++;
        if (arg0) {
            method868(46, 74, 64);
        }
        OpenGL.glCallList(this.field1646 + arg1);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(BLsaa;)V")
    public static final void method872(byte arg0, class300 arg1) {
        field1643++;
        if (class308.field4551) {
            return;
        }
        arg1.method2588(300);
        if (arg0 != 26) {
            method875(115);
        }
        class481.field6904--;
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(B)V")
    public static final void method873(byte arg0) {
        field1639++;
        int var1 = 0;
        for (int var2 = 0; var2 < class675.field9604; var2++) {
            for (int var4 = 0; var4 < class218.field3316; var4++) {
                if (class344.method2234(var2, true, false, class257.field3792, var4, var1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        int var3 = 77 / ((arg0 + 53) / 58);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)V")
    public final void method874(int arg0, int arg1) {
        OpenGL.glNewList(this.field1646 + arg0, 4864);
        if (arg1 < -96) {
            field1644++;
        }
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lus;I)V")
    public class89(class1 arg0, int arg1) {
        this.field1646 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)V")
    public static final void method875(int arg0) {
        field1642++;
        int var1 = (int) ((double) class675.field9604 * 34.46D);
        int var2 = var1 << 2;
        if (class623.field9017.method74()) {
            var2 += 512;
        }
        class623.field9017.method11(200, var2);
        if (arg0 >= -123) {
            field1647 = null;
        }
    }
}
