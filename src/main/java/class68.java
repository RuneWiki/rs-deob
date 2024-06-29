import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class68 extends class92 {

    @OriginalMember(owner = "client!pn", name = "u", descriptor = "Z")
    public static boolean field1289 = false;

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "I")
    public static int field1287 = -1;

    @OriginalMember(owner = "client!pn", name = "B", descriptor = "I")
    public static int field1296 = -1;

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
    public static int field1286 = 0;

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!pn", name = "v", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!pn", name = "w", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!pn", name = "x", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!pn", name = "y", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!pn", name = "A", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!pn", name = "C", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)V", line = 9)
    public final void method669(byte arg0) {
        super.field1635.method3629((byte) -50, false);
        ++field1297;
        if (arg0 <= 55) {
            this.method671(true, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III[BIIII[B)V", line = 22)
    public static final void method670(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        ++field1295;
        int var9 = 73 % ((arg4 - -44) / 32);
        int var10 = -(arg2 >> 2);
        int var11 = -(arg2 & 3);
        for (int var12 = -arg5; ~var12 > -1; ++var12) {
            int var10001;
            for (int var13 = var10; var13 < 0; ++var13) {
                var10001 = arg6++;
                arg8[var10001] = (byte) (arg8[var10001] + -arg3[arg1++]);
                int var15 = arg6++;
                arg8[var15] = (byte) (arg8[var15] + -arg3[arg1++]);
                int var16 = arg6++;
                arg8[var16] = (byte) (arg8[var16] + -arg3[arg1++]);
                int var17 = arg6++;
                arg8[var17] = (byte) (arg8[var17] + -arg3[arg1++]);
            }
            for (int var14 = var11; ~var14 > -1; ++var14) {
                var10001 = arg6++;
                arg8[var10001] = (byte) (arg8[var10001] + -arg3[arg1++]);
            }
            arg1 += arg0;
            arg6 += arg7;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZB)V", line = 66)
    public final void method671(boolean arg0, byte arg1) {
        ++field1292;
        if (arg1 != 107) {
            field1286 = -26;
        }
        super.field1635.method3629((byte) -65, true);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IILqv;)V", line = 78)
    public final void method672(int arg0, int arg1, class96 arg2) {
        ++field1291;
        super.field1635.method3577(arg2, true);
        if (arg0 == 0) {
            super.field1635.method3600(-118, arg1);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)Z", line = 94)
    public final boolean method673(int arg0) {
        ++field1290;
        if (arg0 != -1) {
            this.method672(88, -26, (class96) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lnd;)V", line = 114)
    public class68(class632 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lco;I)Lvn;", line = 117)
    public static final class328 method674(class268 arg0, int arg1) {
        ++field1294;
        arg0.method1738(255);
        int var2 = arg0.method1738(255);
        class328 var3 = class74.method712(arg1 + 123, var2);
        var3.field4719 = arg0.method1738(arg1 ^ 255);
        int var4 = arg0.method1738(255);
        for (int var5 = arg1; ~var5 > ~var4; ++var5) {
            int var6 = arg0.method1738(255);
            var3.method1((byte) 102, var6, arg0);
        }
        var3.method2(-100);
        return var3;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZII)V", line = 150)
    public final void method675(boolean arg0, int arg1, int arg2) {
        ++field1288;
        if (!arg0) {
            field1296 = -90;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZI)V", line = 160)
    public final void method676(boolean arg0, int arg1) {
        ++field1293;
        if (arg1 > -65) {
            field1287 = 102;
        }
    }
}
