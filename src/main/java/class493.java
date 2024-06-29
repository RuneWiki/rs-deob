import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class493 extends class339 {

    @OriginalMember(owner = "client!nt", name = "z", descriptor = "I")
    private int field6800;

    @OriginalMember(owner = "client!nt", name = "E", descriptor = "Ltt;")
    public static class338 field6805 = new class338(71, 3);

    @OriginalMember(owner = "client!nt", name = "v", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!nt", name = "w", descriptor = "I")
    public static int field6797;

    @OriginalMember(owner = "client!nt", name = "x", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!nt", name = "y", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!nt", name = "B", descriptor = "I")
    public static int field6802;

    @OriginalMember(owner = "client!nt", name = "C", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!nt", name = "F", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!nt", name = "u", descriptor = "[I")
    public static int[] field6795;

    @OriginalMember(owner = "client!nt", name = "A", descriptor = "[Lws;")
    public class578[] field6801;

    @OriginalMember(owner = "client!nt", name = "D", descriptor = "[[B")
    private byte[][] field6804;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)Z")
    public final boolean method2810(int arg0) {
        field6798++;
        if (this.field6801 != null) {
            return true;
        }
        if (this.field6804 == null) {
            class332 var2 = class215.field2827;
            synchronized (class215.field2827) {
                if (!class215.field2827.method1960((byte) 112, this.field6800)) {
                    return false;
                }
                int[] var4 = class215.field2827.method1954(0, this.field6800);
                this.field6804 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field6804[var5] = class215.field2827.method1938(var4[var5], this.field6800, -17);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field6804.length; var7++) {
            byte[] var8 = this.field6804[var7];
            class157 var9 = new class157(var8);
            var9.field2219 = 1;
            int var10 = var9.method963(-126);
            class332 var11 = class76.field901;
            synchronized (class76.field901) {
                var6 &= class76.field901.method1931(1, var10);
            }
        }
        if (!var6) {
            return false;
        }
        class445 var12 = new class445();
        class332 var13 = class215.field2827;
        int[] var15;
        synchronized (class215.field2827) {
            int var14 = class215.field2827.method1939(0, this.field6800);
            this.field6801 = new class578[var14];
            var15 = class215.field2827.method1954(0, this.field6800);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field6804[var16];
            class157 var18 = new class157(var17);
            var18.field2219 = 1;
            int var19 = var18.method963(-127);
            class108 var20 = null;
            for (class108 var21 = (class108) var12.method2506(68); var21 != null; var21 = (class108) var12.method2505(-119)) {
                if (var21.field1278 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class332 var22 = class76.field901;
                synchronized (class76.field901) {
                    var20 = new class108(var19, class76.field901.method1946(0, var19));
                }
                var12.method2507(var20, (byte) -128);
            }
            this.field6801[var15[var16]] = new class578(var17, var20);
        }
        int var23 = -30 / ((arg0 + 35) / 45);
        this.field6804 = null;
        return true;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(B)V")
    public static void method2811(byte arg0) {
        if (arg0 > 104) {
            field6805 = null;
            field6795 = null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)Z")
    public final boolean method2812(int arg0, int arg1) {
        if (arg1 > -49) {
            field6795 = null;
        }
        field6796++;
        return this.field6801[arg0].field7907;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IZ)Z")
    public final boolean method2813(int arg0, boolean arg1) {
        field6806++;
        if (arg1) {
            field6795 = null;
        }
        return this.field6801[arg0].field7903;
    }

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "(I)V")
    public static final void method2814(int arg0) throws IOException {
        field6799++;
        if (class163.field2346 != null && class315.field4229 > 0) {
            int var1 = 0;
            while (true) {
                class229 var2 = (class229) class223.field2892.method2506(68);
                if (var2 == null) {
                    class337.field4545 += var1;
                    class309.field4164 = 0;
                    break;
                }
                class163.field2346.method1165(var2.field2964, (byte) 91, 0, var2.field2971.field2199);
                class315.field4229 -= var2.field2964;
                var1 += var2.field2964;
                var2.method242(true);
                var2.field2971.method929(1);
                var2.method1419((byte) 110);
            }
        }
        if (arg0 != -30301) {
            field6805 = null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(II)Z")
    public final boolean method2815(int arg0, int arg1) {
        if (arg0 == -30011) {
            field6802++;
            return this.field6801[arg1].field7906;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(I)V")
    public class493(int arg0) {
        this.field6800 = arg0;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIII)V")
    public static final void method2816(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6803++;
        if (class602.field8408.field4310 != 0 && arg0 != 0 && class413.field5414 < 50 && arg1 != -1) {
            class67.field824[class413.field5414++] = new class480((byte) 1, arg1, arg0, arg4, arg3, 0);
        }
        if (arg2 != 3) {
            method2811((byte) 47);
        }
    }
}
