import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class73 extends class23 {

    @OriginalMember(owner = "client!ph", name = "ab", descriptor = "I")
    private int field1286 = 0;

    @OriginalMember(owner = "client!ph", name = "hb", descriptor = "I")
    private int field1293 = 4096;

    @OriginalMember(owner = "client!ph", name = "cb", descriptor = "I")
    public static int field1288 = 0;

    @OriginalMember(owner = "client!ph", name = "jb", descriptor = "Lqd;")
    public static class40 field1295 = class147.method1106(")2", (byte) -102);

    @OriginalMember(owner = "client!ph", name = "fb", descriptor = "Lqd;")
    private static class40 field1291 = class147.method1106("Loading)3)3)3", (byte) -110);

    @OriginalMember(owner = "client!ph", name = "ib", descriptor = "Lqd;")
    public static class40 field1294 = class147.method1106(" ", (byte) -86);

    @OriginalMember(owner = "client!ph", name = "db", descriptor = "Lqd;")
    public static class40 field1289 = field1291;

    @OriginalMember(owner = "client!ph", name = "Y", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!ph", name = "Z", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ph", name = "bb", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!ph", name = "eb", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!ph", name = "gb", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILsd;)V", line = 11)
    public final void method23(int arg0, int arg1, class26 arg2) {
        if (arg1 != 0) {
            return;
        }
        if (arg0 == 0) {
            this.field1286 = arg2.method197(-1);
        } else if (arg0 == 1) {
            this.field1293 = arg2.method197(-1);
        }
        field1290++;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)V", line = 46)
    public static void method543(boolean arg0) {
        field1289 = null;
        if (arg0) {
            field1295 = (class40) null;
        }
        field1291 = null;
        field1295 = null;
        field1294 = null;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V", line = 58)
    public class73() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)[I", line = 74)
    public final int[] method32(byte arg0, int arg1) {
        if (arg0 != -94) {
            field1287 = -9;
        }
        field1292++;
        int[] var3 = this.field403.method724((byte) 97, arg1);
        if (this.field403.field1760) {
            int[] var4 = this.method174(0, 0, arg1);
            for (int var5 = 0; var5 < class52.field1007; var5++) {
                int var6 = var4[var5];
                var3[var5] = this.field1286 <= var6 && var6 <= this.field1293 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIILbg;IJ)Z", line = 113)
    public static final boolean method544(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class196 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class303.method2066(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)Z", line = 125)
    public static final boolean method545(int arg0, int arg1) {
        field1284++;
        if (arg1 > -122) {
            return false;
        } else if (arg0 >= 0) {
            int var2 = class288.field4832[arg0];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 1002;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILqd;I)V", line = 153)
    public static final void method546(int arg0, class40 arg1, int arg2) {
        field1285++;
        class177 var3 = class177.method1310(103, 3, arg0);
        var3.method1302(-20040);
        int var4 = 70 % ((arg2 + 62) / 45);
        var3.field2904 = arg1;
    }
}
