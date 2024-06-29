import java.awt.Container;
import java.awt.Insets;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class569 {

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "Lgw;")
    private class690 field7864 = new class690(16);

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "Luu;")
    private class237 field7868;

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field7865 = 0;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "Z")
    public static boolean field7870 = true;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public static int field7867;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    public static int field7869;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
    public static int field7871;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "I")
    public static int field7873;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
    public static int field7874;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V", line = 3)
    public final void method3334(int arg0) {
        field7869++;
        class690 var2 = this.field7864;
        synchronized (this.field7864) {
            if (arg0 != -1) {
                this.field7864 = null;
            }
            this.field7864.method3902(0);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IJ)V", line = 17)
    public static final void method3335(int arg0, long arg1) {
        if (arg0 != 25856) {
            field7870 = true;
        }
        field7867++;
        class614.field8252.setTime(new Date(arg1));
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lr;III[Z)V", line = 33)
    public static final void method3336(class709 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class433.field6043 == class371.field5240) {
            return;
        }
        int var5 = class550.field7649[arg1].method2172(arg2, -1, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class341 var7 = class550.field7649[var6];
                if (var7 != null) {
                    var7.method1025(arg0, arg2, var5 - var7.method2172(arg2, -1, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(Lr;III[Z)Z", line = 60)
    public static final boolean method3337(class709 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class433.field6043 != class371.field5240) {
            int var6 = class550.field7649[arg1].method2172(arg2, -1, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class341 var8 = class550.field7649[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method2172(arg2, -1, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1041(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1042(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V", line = 95)
    public final void method3338(int arg0) {
        class690 var2 = this.field7864;
        synchronized (this.field7864) {
            this.field7864.method3906(-120);
            if (arg0 != -1025) {
                this.method3342(42, -90);
            }
        }
        field7871++;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILsn;IBII)Lhb;", line = 113)
    public final class588 method3339(int arg0, class162 arg1, int arg2, byte arg3, int arg4, int arg5) {
        field7866++;
        class564[] var7 = null;
        class48 var8 = this.method3340(arg4, 10285);
        if (var8.field728 != null) {
            var7 = new class564[var8.field728.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class571 var10 = arg1.method1006(var8.field728[var9], false);
                var7[var9] = new class564(var10.field7890, var10.field7887, var10.field7886, var10.field7884, var10.field7894, var10.field7888, var10.field7891, var10.field7882);
            }
        }
        if (arg3 != -107) {
            this.method3342(7, -88);
        }
        return new class588(var8.field725, var7, var8.field722, arg0, arg2, arg5);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)Ljea;", line = 146)
    private final class48 method3340(int arg0, int arg1) {
        field7874++;
        class690 var3 = this.field7864;
        class48 var4;
        synchronized (this.field7864) {
            var4 = (class48) this.field7864.method3898((byte) -42, (long) arg0);
        }
        if (arg1 != 10285) {
            this.method3340(28, -79);
        }
        if (var4 != null) {
            return var4;
        }
        class237 var5 = this.field7868;
        byte[] var6;
        synchronized (this.field7868) {
            var6 = this.field7868.method1572(29, 0, arg0);
        }
        class48 var7 = new class48();
        if (var6 != null) {
            var7.method351(-88, new class63(var6));
        }
        class690 var8 = this.field7864;
        synchronized (this.field7864) {
            this.field7864.method3899(-95, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)V", line = 176)
    public static final void method3341(int arg0) {
        field7872++;
        client var1 = class516.field7210;
        synchronized (class516.field7210) {
            if (class178.field2452 == null) {
                if (arg0 != 29608) {
                    field7870 = false;
                }
                Container var2;
                if (class553.field7717 != null) {
                    var2 = class553.field7717;
                } else if (class320.field4445 == null) {
                    var2 = class109.field1462;
                } else {
                    var2 = class320.field4445;
                }
                class374.field5260 = var2.getSize().width;
                class648.field8690 = var2.getSize().height;
                if (class553.field7717 == var2) {
                    Insets var3 = class553.field7717.getInsets();
                    class648.field8690 -= var3.top + var3.bottom;
                    class374.field5260 -= var3.right + var3.left;
                }
                if (class710.method3997(3) == 1) {
                    class320.field4452 = 0;
                    class118.field1561 = class732.field10164;
                    class555.field7740 = (class374.field5260 - class732.field10164) / 2;
                    class553.field7716 = class84.field1195;
                } else {
                    class362.method2302(30428);
                }
                if (class341.field4815 != class172.field2390) {
                    boolean var10000;
                    if (class118.field1561 < 1024 && class553.field7716 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                class570.field7875.setSize(class118.field1561, class553.field7716);
                if (class129.field1802 != null) {
                    if (class222.field3009) {
                        class252.method1725(class570.field7875, 2228);
                    } else {
                        class129.field1802.method1533(class570.field7875, class118.field1561, class553.field7716);
                    }
                }
                if (class553.field7717 == var2) {
                    Insets var4 = class553.field7717.getInsets();
                    class570.field7875.setLocation(class555.field7740 + var4.left, class320.field4452 + var4.top);
                } else {
                    class570.field7875.setLocation(class555.field7740, class320.field4452);
                }
                if (class544.field7545 != -1) {
                    class304.method2002(true, 24615);
                }
                class680.method3835((byte) -73);
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(II)V", line = 274)
    public final void method3342(int arg0, int arg1) {
        field7873++;
        if (arg1 >= 77) {
            class690 var3 = this.field7864;
            synchronized (this.field7864) {
                this.field7864.method3896(1, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lgp;ILuu;)V", line = 291)
    public class569(class553 arg0, int arg1, class237 arg2) {
        this.field7868 = arg2;
        this.field7868.method1597(29, 0);
    }
}
