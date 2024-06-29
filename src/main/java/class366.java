import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class366 {

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Lpg;")
    public static class492 field5634 = new class492(76, -1);

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    public static final void method2295(byte arg0) {
        field5636++;
        class329.field5066++;
        class179.method1287(false, class61.field871);
        class75.field1006.method625(0, false);
        if (arg0 != 8) {
            field5634 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public static void method2296(int arg0) {
        int var1 = -75 / ((2 - arg0) / 44);
        field5634 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lof;II)Z")
    public static final boolean method2297(class321 arg0, int arg1, int arg2) {
        if (arg2 <= 70) {
            method2295((byte) -114);
        }
        field5637++;
        int var3 = arg0.method2084((byte) -118, 2);
        if (var3 == 0) {
            if (arg0.method2084((byte) -118, 1) != 0) {
                method2297(arg0, arg1, 78);
            }
            int var4 = arg0.method2084((byte) -118, 6);
            int var5 = arg0.method2084((byte) -118, 6);
            boolean var6 = arg0.method2084((byte) -118, 1) == 1;
            if (var6) {
                class113.field1582[class499.field7298++] = arg1;
            }
            if (class439.field6539[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class314 var7 = class57.field759[arg1];
            class322 var8 = class439.field6539[arg1] = new class322();
            var8.field5254 = arg1;
            if (class289.field4303[arg1] != null) {
                var8.method2098(class289.field4303[arg1], (byte) -80);
            }
            var8.method2184(var7.field4805, 14839);
            var8.field5257 = var7.field4807;
            int var9 = var7.field4798;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            var8.field4978 = var7.field4799;
            int var12 = var9 & 0xFF;
            var8.field5340[0] = class363.field5624[arg1];
            var8.field2210 = (byte) var10;
            var8.method2097(50, (var11 << 6) + var4 - class82.field1105, (var12 << 6) + -class437.field6477 + var5);
            var8.field4949 = false;
            class57.field759[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg0.method2084((byte) -118, 2);
            int var14 = class57.field759[arg1].field4798;
            class57.field759[arg1].field4798 = ((var14 >> 28) + var13 & 0x3 << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg0.method2084((byte) -118, 5);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class57.field759[arg1].field4798;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = var18 >> 14 & 0xFF;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var20--;
                var21--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var21--;
                var20++;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var20--;
                var21++;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var20++;
                var21++;
            }
            class57.field759[arg1].field4798 = (var20 << 14) + ((var19 << 28) + var21);
            return false;
        } else {
            int var22 = arg0.method2084((byte) -118, 18);
            int var23 = var22 >> 16;
            int var24 = (var22 & 0xFF4D) >> 8;
            int var25 = var22 & 0xFF;
            int var26 = class57.field759[arg1].field4798;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class57.field759[arg1].field4798 = (var27 << 28) + ((var28 << 14) + var29);
            return false;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V")
    public static final void method2298(byte arg0) {
        class17.field278 = null;
        int var1 = -91 / ((arg0 - 21) / 42);
        field5635++;
        class435.field6467 = null;
    }
}
