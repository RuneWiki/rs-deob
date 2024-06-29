import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class287 {

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "Lcs;")
    public class287 field4004;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "Lcs;")
    public class287 field4005;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public static final void method1780(int arg0) {
        field4010++;
        class69.field869 = class643.field9365.field4792 + class643.field9365.field4788 + 2;
        if (arg0 != -78660991) {
            return;
        }
        class184.field2770 = class470.field6636.field4792 + class470.field6636.field4788 + 2;
        class540.field8106 = new String[500];
        for (int var1 = 0; var1 < class540.field8106.length; var1++) {
            class540.field8106[var1] = "";
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIII)V")
    public static final void method1781(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4009++;
        int var5 = 0;
        if (arg3 > -98) {
            return;
        }
        int var6 = arg0;
        int var7 = -arg0;
        class140.method969(arg2 - arg0, 15888, arg1, arg0 + arg2, class604.field8993[arg4]);
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class604.field8993[arg4 + var6];
                int[] var10 = class604.field8993[arg4 - var6];
                int var11 = arg2 + var5;
                int var12 = arg2 - var5;
                class140.method969(var12, 15888, arg1, var11, var9);
                class140.method969(var12, 15888, arg1, var11, var10);
            }
            int var13 = arg2 + var6;
            int var14 = arg2 - var6;
            int[] var15 = class604.field8993[arg4 + var5];
            int[] var16 = class604.field8993[arg4 - var5];
            class140.method969(var14, 15888, arg1, var13, var15);
            class140.method969(var14, 15888, arg1, var13, var16);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IBII)V")
    public static final void method1782(int arg0, byte arg1, int arg2, int arg3) {
        field4007++;
        class221 var4 = class65.method413(11, arg3, (byte) 116);
        var4.method1426((byte) -122);
        var4.field3214 = arg0;
        var4.field3208 = arg2;
        if (arg1 != 82) {
            method1784(-47, 20, 8, -65);
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
    public final void method1783(byte arg0) {
        field4008++;
        if (this.field4004 == null) {
            return;
        }
        int var2 = -116 % ((-arg0 - 75) / 35);
        this.field4004.field4005 = this.field4005;
        this.field4005.field4004 = this.field4004;
        this.field4004 = null;
        this.field4005 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1784(int arg0, int arg1, int arg2, int arg3) {
        if (class190.method1303(arg0, arg1, arg2)) {
            int var4 = arg1 << class115.field1626;
            int var5 = arg2 << class115.field1626;
            return class94.method740(var4 + 1, class165.field2609[arg0].method1239(arg1, arg2) + arg3, var5 + 1) && class94.method740(class96.field1409 + var4 - 1, class165.field2609[arg0].method1239(arg1 + 1, arg2) + arg3, var5 + 1) && class94.method740(class96.field1409 + var4 - 1, class165.field2609[arg0].method1239(arg1 + 1, arg2 + 1) + arg3, class96.field1409 + var5 - 1) && class94.method740(var4 + 1, class165.field2609[arg0].method1239(arg1, arg2 + 1) + arg3, class96.field1409 + var5 - 1);
        } else {
            return false;
        }
    }
}
