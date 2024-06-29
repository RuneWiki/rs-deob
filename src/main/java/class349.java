import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class349 {

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "B")
    public byte field4514 = 0;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "B")
    public byte field4515;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "B")
    public byte field4495;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "S")
    public short field4516;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "S")
    public short field4503;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field4501 = 0;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "B")
    public byte field4502;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "B")
    public byte field4508;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "B")
    public byte field4512;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "B")
    public byte field4513;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "Lig;")
    public class202 field4509;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Lbq;")
    public class241 field4496;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Lbq;")
    public class241 field4497;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "Lwv;")
    public class31 field4506;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "Ldg;")
    public class349 field4494;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "Lka;")
    public class400 field4492;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "Lqn;")
    public class56 field4498;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "Lqn;")
    public class56 field4507;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "Lpv;")
    public class61 field4499;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "S")
    public short field4504;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Z")
    public boolean field4491;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "Z")
    public boolean field4500;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "Z")
    public boolean field4505;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([BIBIIIII[B)V", line = 5)
    public static final void method1945(byte[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        field4510++;
        int var9 = -(arg5 >> 2);
        if (arg2 > -99) {
            method1947(102, -114, 110, 24, 0);
        }
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg0[var10001] = (byte) (arg0[var10001] - arg8[arg4++]);
                int var14 = arg1++;
                arg0[var14] = (byte) (arg0[var14] - arg8[arg4++]);
                int var15 = arg1++;
                arg0[var15] = (byte) (arg0[var15] - arg8[arg4++]);
                int var16 = arg1++;
                arg0[var16] = (byte) (arg0[var16] - arg8[arg4++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg0[var10001] = (byte) (arg0[var10001] - arg8[arg4++]);
            }
            arg1 += arg7;
            arg4 += arg3;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(III)V", line = 48)
    public class349(int arg0, int arg1, int arg2) {
        this.field4495 = this.field4515 = (byte) arg0;
        this.field4516 = (short) arg2;
        this.field4503 = (short) arg1;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 65)
    public final void method1946(int arg0) {
        while (this.field4499 != null) {
            class61 var2 = this.field4499.field595;
            this.field4499.method349(24898);
            this.field4499 = var2;
        }
        field4490++;
        this.field4514 = 0;
        if (arg0 < 43) {
            this.field4497 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIII)V", line = 92)
    public static final void method1947(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4493++;
        class557 var5 = class93.method564(4, -14073, arg1);
        var5.method3257(1948);
        var5.field8201 = arg3;
        var5.field8207 = arg2;
        var5.field8211 = arg4;
        if (arg0 != 10905) {
            method1945(null, -42, (byte) 70, -61, -52, -15, -43, -23, null);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)Lrs;", line = 116)
    public static final class557 method1948(byte arg0) {
        field4511++;
        class557 var1 = (class557) class316.field4044.method2066((byte) -82);
        if (var1 != null) {
            var1.method3187(true);
            var1.method48(-1);
            return var1;
        }
        int var2 = 10 / ((-arg0 - 25) / 44);
        class557 var3;
        do {
            var3 = (class557) class520.field7307.method2066((byte) -82);
            if (var3 == null) {
                return null;
            }
            if (var3.method3266(-6013) > class190.method1030(false)) {
                return null;
            }
            var3.method3187(true);
            var3.method48(-1);
        } while ((Long.MIN_VALUE & var3.field67) == 0L);
        return var3;
    }
}
