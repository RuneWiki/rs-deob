import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class85 extends class87 {

    @OriginalMember(owner = "client!hm", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field1355 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!hm", name = "Q", descriptor = "Lnh;")
    public static class312 field1354 = new class312(16);

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "I")
    private int field1346;

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "client!hm", name = "K", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!hm", name = "M", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!hm", name = "N", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!hm", name = "O", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!hm", name = "S", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!hm", name = "T", descriptor = "I")
    private int field1357;

    @OriginalMember(owner = "client!hm", name = "P", descriptor = "Ldj;")
    public static class138 field1353;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "(I)V")
    public static final void method629(int arg0) {
        class288.field4607 = null;
        class166.field2544 = null;
        int var1 = 68 / ((arg0 - 13) / 56);
        ++field1356;
        class312.field4992 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZI)V")
    private final void method630(boolean arg0, int arg1) {
        this.field1346 = (65280 & arg1) >> 4;
        this.field1348 = 4080 & arg1 >> 12;
        this.field1357 = (255 & arg1) << 4;
        if (arg0) {
            field1353 = null;
        }
        ++field1352;
    }

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "(I)V")
    public static void method631(int arg0) {
        field1353 = null;
        if (arg0 != 0) {
            method632((String) null, 89, (byte) -103, (String) null, (String) null);
        }
        field1355 = null;
        field1354 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;Ljava/lang/String;)V")
    public static final void method632(String arg0, int arg1, byte arg2, String arg3, String arg4) {
        ++field1350;
        class194.method1376(arg0, arg1, (byte) 38, arg4, -1, arg3);
        int var5 = -59 % ((-63 - arg2) / 40);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method633(byte arg0, String arg1) {
        ++field1349;
        if (arg0 != 27) {
            field1354 = null;
        }
        String var2 = class121.method920(arg0 + -19, class143.method1064((byte) -112, arg1));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V")
    public class85() {
        this(0);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            this.method630(false, arg0.method362(arg2 + -25649));
        }
        if (arg2 == 25645) {
            ++field1351;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)[[I")
    public final int[][] method143(int arg0, int arg1) {
        ++field1345;
        int[][] var3 = super.field1390.method1902(-121, arg0);
        if (arg1 != 6) {
            method634(-94, -74, -80, -61, -25, -72, 7, 102, 25);
        }
        if (super.field1390.field4428) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class206.field3032 < ~var7; ++var7) {
                var4[var7] = this.field1348;
                var5[var7] = this.field1346;
                var6[var7] = this.field1357;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(I)V")
    private class85(int arg0) {
        super(0, false);
        this.method630(false, arg0);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1347;
        if (class309.method2092(91923, arg7)) {
            if (arg4 <= 28) {
                method629(44);
            }
            class303.method2066(arg1, -1, arg6, arg5, arg2, arg8, arg0, -11580, arg3, class134.field2195[arg7]);
        } else if (~arg3 != 0) {
            class91.field1452[arg3] = true;
        } else {
            for (int var9 = 0; ~var9 > -101; ++var9) {
                class91.field1452[var9] = true;
            }
        }
    }
}
