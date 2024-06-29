import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class264 {

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "Lad;")
    private class19 field3292 = new class19(64);

    @OriginalMember(owner = "client!hda", name = "h", descriptor = "Ltf;")
    private class701 field3299;

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIIIBII)V")
    public static final void method1559(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 <= 32) {
            return;
        }
        field3297++;
        if (arg3 != 8 && arg3 != 16) {
            class499 var7 = class487.field7044[arg2][arg5][arg0];
            if (var7 == null) {
                var7 = new class499(arg2);
            }
            if (arg3 == 1) {
                var7.field7214 = (short) arg1;
                var7.field7232 = (short) arg6;
            } else if (arg3 == 2) {
                var7.field7216 = (short) arg6;
                var7.field7224 = (short) arg1;
            }
            if (class667.field9319) {
                class113.method602(false);
                return;
            }
            return;
        }
        if (arg3 != 8) {
            int var8 = (arg5 << class559.field7984) + class171.field1904;
            int var9 = var8 - class171.field1904;
            int var10 = arg0 << class559.field7984;
            int var11 = class171.field1904 + var10;
            int var12 = class385.field5193[arg2].method1608(arg0, 840, arg5 + 1);
            int var13 = class385.field5193[arg2].method1608(arg0 + 1, 840, arg5);
            class389.field5262[class120.field1341++] = new class603(arg3, arg2, var8, var9, var9, var8, var12, var13, var13 - arg6, var12 - arg6, var10, var11, var11, var10);
            return;
        }
        int var14 = arg5 << class559.field7984;
        int var15 = var14 + class171.field1904;
        int var16 = arg0 << class559.field7984;
        int var17 = class171.field1904 + var16;
        int var18 = class385.field5193[arg2].method1608(arg0, 840, arg5);
        int var19 = class385.field5193[arg2].method1608(arg0 + 1, 840, arg5 + 1);
        class389.field5262[class120.field1341++] = new class603(arg3, arg2, var14, var15, var15, var14, var18, var19, var19 - arg6, -arg6 + var18, var16, var17, var17, var16);
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V")
    public final void method1560(int arg0) {
        field3295++;
        if (arg0 == -3) {
            class19 var2 = this.field3292;
            synchronized (this.field3292) {
                this.field3292.method88(111);
            }
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IB)V")
    public final void method1561(int arg0, byte arg1) {
        field3296++;
        class19 var3 = this.field3292;
        synchronized (this.field3292) {
            this.field3292.method83((byte) -2, arg0);
            if (arg1 != -65) {
                this.method1562(-29, (byte) 47);
            }
        }
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(IB)Laf;")
    public final class166 method1562(int arg0, byte arg1) {
        field3298++;
        class19 var3 = this.field3292;
        class166 var4;
        synchronized (this.field3292) {
            var4 = (class166) this.field3292.method78(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class701 var5 = this.field3299;
        byte[] var6;
        synchronized (this.field3299) {
            var6 = this.field3299.method3854((byte) 36, 11, arg0);
        }
        class166 var7 = new class166();
        if (var6 != null) {
            var7.method907(new class115(var6), 123);
        }
        int var8 = 103 / ((-arg1 - 17) / 52);
        class19 var9 = this.field3292;
        synchronized (this.field3292) {
            this.field3292.method92(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(I)V")
    public final void method1563(int arg0) {
        field3294++;
        class19 var2 = this.field3292;
        synchronized (this.field3292) {
            this.field3292.method80((byte) 98);
        }
        if (arg0 != -9) {
            field3293 = 122;
        }
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lqh;ILtf;)V")
    public class264(class320 arg0, int arg1, class701 arg2) {
        this.field3299 = arg2;
        if (this.field3299 != null) {
            this.field3299.method3883(11, 0);
        }
    }
}
