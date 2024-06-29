import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class89 {

    @OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "Lni;")
    public static class117 field1174;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IZII)I")
    public static final int method673(int arg0, boolean arg1, int arg2, int arg3) {
        field1175++;
        int var4 = arg3 / arg2;
        int var5 = arg2 - 1 & arg3;
        int var6 = arg0 / arg2;
        int var7 = arg2 - 1 & arg0;
        int var8 = class210.method1343(var4, 16, var6);
        int var9 = class210.method1343(var4 + 1, 16, var6);
        int var10 = class210.method1343(var4, 16, var6 + 1);
        int var11 = class210.method1343(var4 + 1, 16, var6 + 1);
        if (arg1) {
            method678(null, (byte) 109);
        }
        int var12 = class171.method1167(arg2, var9, var8, var5, 6);
        int var13 = class171.method1167(arg2, var11, var10, var5, 6);
        return class171.method1167(arg2, var13, var12, var7, 6);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IZI)B")
    public static final byte method674(int arg0, boolean arg1, int arg2) {
        field1176++;
        if (arg1) {
            return 81;
        } else if (arg2 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "([[BILiaa;)V")
    public static final void method675(byte[][] arg0, int arg1, class99 arg2) {
        field1172++;
        int var3 = class124.field1607.length;
        int var4 = 0;
        if (arg1 != -18931) {
            return;
        }
        while (var3 > var4) {
            byte[] var5 = arg0[var4];
            if (var5 != null) {
                int var6 = (class547.field7096[var4] >> 8) * 64 - class100.field1326;
                int var7 = (class547.field7096[var4] & 0xFF) * 64 - class186.field2376;
                class424.method2439(arg1 + 18957);
                arg2.method742(var6, 2, var7, class703.field9806, class520.field6799, var5);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)V")
    public static void method676(int arg0) {
        if (arg0 == 13517) {
            field1174 = null;
        }
    }

    @OriginalMember(owner = "client!pw", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1171++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method677(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1173++;
        if (arg5 < 512 || arg9 < 512 || ((class611.field8258 - 2) * 512) < arg5 || arg9 > (class656.field9155 - 2) * 512) {
            class483.field6441[0] = class483.field6441[1] = -1;
            return;
        }
        int var10 = class332.method1916(arg0 + 1218445319, arg9, arg7, arg5) - arg1;
        class355.field4580.method143(arg2, 0, arg0);
        class520.field6799.method342(class355.field4580);
        class520.field6799.method350(arg5, var10, arg9, class483.field6441);
        class355.field4580.method143(-arg2, 0, 0);
        class520.field6799.method342(class355.field4580);
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Ldg;B)V")
    public static final void method678(class193 arg0, byte arg1) {
        field1170++;
        if (arg1 != 67) {
            field1174 = null;
        }
        class118 var2 = (class118) class145.field1891.method39((long) arg0.field2960, arg1 + 31683);
        if (var2 == null) {
            class64.method535((byte) -115, arg0.field3030[0], null, null, 0, arg0, arg0.field508, arg0.field3039[0]);
        } else {
            var2.method885(90);
        }
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(I)V")
    public class89(int arg0) {
        this.field1177 = arg0;
    }
}
