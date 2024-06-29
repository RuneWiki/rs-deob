import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public abstract class class108 {

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field1311 = 0;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field1313 = -1;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)I", line = 10)
    public static final int method728(int arg0, int arg1, int arg2, int arg3) {
        field1312++;
        int var4 = arg0 / arg1;
        int var5 = arg1 - 1 & arg0;
        int var6 = arg2 / arg1;
        int var7 = arg2 & arg1 - 1;
        int var8 = class36.method245(var6, 124, var4);
        int var9 = class36.method245(var6, -93, var4 + 1);
        int var10 = class36.method245(var6 + 1, -109, var4);
        int var11 = class36.method245(var6 + 1, -128, var4 - arg3);
        int var12 = class593.method3433(var9, var8, arg1, var5, (byte) 127);
        int var13 = class593.method3433(var11, var10, arg1, var5, (byte) 127);
        return class593.method3433(var13, var12, arg1, var7, (byte) 127);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(BI)I")
    public abstract int method726(byte arg0, int arg1);

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)[B")
    public abstract byte[] method727(int arg0, byte arg1);

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)Lew;")
    public abstract class516 method729(byte arg0);

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IZ)V")
    public abstract void method730(int arg0, boolean arg1);
}
