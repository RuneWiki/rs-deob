import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class65 extends class189 {

    @OriginalMember(owner = "client!hia", name = "j", descriptor = "S")
    public short field793;

    @OriginalMember(owner = "client!hia", name = "l", descriptor = "[I")
    public static int[] field795 = new int[1];

    @OriginalMember(owner = "client!hia", name = "k", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!hia", name = "m", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(ZII)Lml;", line = 5)
    public static final class387 method544(boolean arg0, int arg1, int arg2) {
        field794++;
        if (arg2 != 24824) {
            method545(-125, null, null, false, 79);
        }
        class360[] var3 = class239.field3195;
        synchronized (class239.field3195) {
            class387 var4;
            if (class239.field3195.length <= arg1 || class239.field3195[arg1].method2306(15)) {
                var4 = new class387();
                var4.field5482 = new class137[arg1];
                for (int var5 = 0; var5 < arg1; var5++) {
                    var4.field5482[var5] = new class137();
                }
            } else {
                var4 = (class387) class239.field3195[arg1].method2308(arg2 ^ 0x6078);
                var4.method3646((byte) -111);
                int var10002 = class95.field1115[arg1]--;
            }
            var4.field5480 = arg0;
            return var4;
        }
    }

    @OriginalMember(owner = "client!hia", name = "<init>", descriptor = "()V", line = 38)
    public class65() {
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(I[Ljava/lang/Object;[IZI)V", line = 41)
    public static final void method545(int arg0, Object[] arg1, int[] arg2, boolean arg3, int arg4) {
        field796++;
        if (arg0 < arg4) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg0;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            Object var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg0; var10 < arg4; var10++) {
                if (((var9 & var10) + var7) > arg2[var10]) {
                    int var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    Object var12 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var12;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var8;
            method545(arg0, arg1, arg2, arg3, var6 - 1);
            method545(var6 + 1, arg1, arg2, arg3, arg4);
        }
        if (!arg3) {
            field795 = null;
        }
    }

    @OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(S)V", line = 96)
    public class65(short arg0) {
        this.field793 = arg0;
    }

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "(B)V", line = 104)
    public static void method546(byte arg0) {
        field795 = null;
        if (arg0 != 25) {
            field795 = null;
        }
    }
}
