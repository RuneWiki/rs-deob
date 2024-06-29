import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class31 implements Runnable {

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Z")
    public boolean field466 = true;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Ljava/lang/Object;")
    public Object field461 = new Object();

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public int field471 = 0;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "[I")
    public int[] field472 = new int[500];

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "[I")
    public int[] field473 = new int[500];

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "[I")
    public static int[] field465 = new int[2];

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "[I")
    public static int[] field470 = new int[2500];

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Ljava/awt/Frame;")
    public static Frame field469;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static void method192(byte arg0) {
        field470 = null;
        if (arg0 != -66) {
            method192((byte) -31);
        }
        field469 = null;
        field465 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
    public static final void method193(int arg0, int arg1) {
        if (arg1 != -12006) {
            field469 = null;
        }
        class170.field2422 = -1;
        class223.field3477 = arg0;
        class145.field2008 = -1;
        class163.method1040(0);
        field467++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILim;IZ)V")
    public static final void method194(int arg0, int arg1, class178 arg2, int arg3, boolean arg4) {
        if (arg4) {
            return;
        }
        if (class249.field3897 < 3) {
            ((class203) class246.field3869).method1273(arg3, arg1, arg2.field2529, arg2.field2571, class246.field3869.field1540 / 2, class246.field3869.field1543 / 2, (int) class123.field1743, 256, arg2.field2528, arg2.field2631);
        } else {
            class266.method1750(arg3, arg1, 0, arg2.field2528, arg2.field2631);
        }
        class30.field459[arg0] = true;
        field464++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([IIIIII)V")
    public static final void method195(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class91 var6 = class246.field3856[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class165 var7 = var6.field1341;
        if (var7 != null) {
            int var8 = var7.field2341;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class152 var10 = var6.field1333;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field2123;
        int var12 = var10.field2122;
        int var13 = var10.field2104;
        int var14 = var10.field2112;
        int[] var15 = class171.field2440[var11];
        int[] var16 = class3.field26[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "run", descriptor = "()V")
    public final void run() {
        field468++;
        while (this.field466) {
            Object var1 = this.field461;
            synchronized (this.field461) {
                if (this.field471 < 500) {
                    this.field473[this.field471] = class17.field304;
                    this.field472[this.field471] = class249.field3891;
                    this.field471++;
                }
            }
            class17.method116(-62, 50L);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILnh;Lnh;Z)V")
    public static final void method196(int arg0, class305 arg1, class305 arg2, boolean arg3) {
        field460++;
        if (arg0 != 256) {
            field470 = null;
        }
        class6.field49 = arg2;
        class29.field452 = arg3;
        class35.field535 = arg1;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static final void method197(int arg0) {
        class19.field322 = 0;
        if (arg0 != 4) {
            field469 = null;
        }
        class102.field1466 = 0;
        class11.method68((byte) -109);
        field462++;
        class56.method351((byte) 123);
        class127.method817(-29021);
        class60.method380(1828574536);
        for (int var1 = 0; var1 < class19.field322; var1++) {
            int var3 = class194.field2959[var1];
            if (class35.field533 != class48.field689[var3].field4119) {
                if (class48.field689[var3].field5030 > 0) {
                    class151.method956(true, class48.field689[var3], var3);
                }
                class48.field689[var3] = null;
            }
        }
        if (class114.field1632 != class131.field1830.field3280) {
            throw new RuntimeException("gpp1 pos:" + class131.field1830.field3280 + " psize:" + class114.field1632);
        }
        for (int var2 = 0; var2 < class171.field2437; var2++) {
            if (class48.field689[class160.field2235[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class171.field2437);
            }
        }
    }
}
