import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class219 implements class58 {

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "Lhj;")
    private class45 field3577;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "Lbga;")
    private class168 field3578;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "Z")
    public static boolean field3581 = false;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "[I")
    public static int[] field3584;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZII)I", line = 8)
    public static final int method1563(boolean arg0, int arg1, int arg2) {
        if (arg2 < 79) {
            field3581 = true;
        }
        field3583++;
        if (arg0) {
            return 0;
        }
        class33 var3 = class446.method2724(arg1, 9, arg0);
        if (var3 == null) {
            return class398.field5919.method2408((byte) 79, arg1).field9563;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field311.length; var5++) {
            if (var3.field311[var5] == -1) {
                var4++;
            }
        }
        return var4 + (class398.field5919.method2408((byte) 79, arg1).field9563 - var3.field311.length);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BIII)V", line = 45)
    public static final void method1564(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -14) {
            field3581 = false;
        }
        field3576++;
        class118 var4 = class86.method755(true, 9, arg3);
        var4.method933((byte) 112);
        var4.field1821 = arg2;
        var4.field1811 = arg1;
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V", line = 60)
    public static void method1565(int arg0) {
        field3584 = null;
        if (arg0 != 12) {
            field3584 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)Z", line = 72)
    public final boolean method574(byte arg0) {
        field3579++;
        if (arg0 < 96) {
            method1563(true, 100, 125);
        }
        return this.field3578.method1350(true);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/lang/String;IILda;IB)I", line = 85)
    private final int method1566(String arg0, int arg1, int arg2, class400 arg3, int arg4, byte arg5) {
        if (arg5 >= -7) {
            field3584 = null;
        }
        field3580++;
        return arg3.method2468(0, 0, 0, 0, 0, arg1 + arg2, arg4 - -arg2, null, arg0, this.field3577.field762, this.field3577.field761 - (arg2 * 2), null, null, this.field3577.field760, 0, this.field3577.field759 - (arg2 * 2));
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)I", line = 100)
    public static final int method1567(int arg0) {
        int var1 = 74 % ((arg0 - 88) / 37);
        field3582++;
        return class440.field6416 == null ? 0 : class440.field6416.length * 2;
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lbga;Lhj;)V", line = 114)
    public class219(class168 arg0, class45 arg1) {
        this.field3577 = arg1;
        this.field3578 = arg0;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZZ)V", line = 123)
    public final void method575(boolean arg0, boolean arg1) {
        if (!arg0) {
            return;
        }
        field3585++;
        class376 var3 = this.field3578.method1351(-17517, this.field3577.field754);
        if (var3 == null) {
            return;
        }
        int var4 = this.field3577.field763.method3824(class335.field4917, (byte) -123, this.field3577.field759) + this.field3577.field755;
        int var5 = this.field3577.field767.method2088(this.field3577.field761, (byte) -99, class614.field8651) + this.field3577.field756;
        if (this.field3577.field766) {
            class364.field5573.method224(var4, var5, this.field3577.field759, this.field3577.field761, this.field3577.field753, 0);
        }
        int var6 = var5 + this.method1566(var3.field5660, var5, 5, class257.field4034, var4, (byte) -45) * 12;
        int var9 = var6 + 8;
        if (this.field3577.field766) {
            class364.field5573.method315(var4, var9, var4 + this.field3577.field759 - 1, var9, this.field3577.field753, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method1566(var3.field5663, var6, 5, class257.field4034, var4, (byte) -89) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method1566(var3.field5661, var10, 5, class257.field4034, var4, (byte) -23) * 12;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V", line = 159)
    public final void method576(int arg0) {
        if (arg0 != -28886) {
            this.method575(true, true);
        }
        field3586++;
    }
}
