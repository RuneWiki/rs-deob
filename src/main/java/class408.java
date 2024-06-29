import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class408 {

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public int field5921;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Z")
    public boolean field5922;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "B")
    public byte field5926;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "S")
    public short field5927;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "B")
    public byte field5932;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "S")
    public short field5929;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "S")
    public short field5924;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field5925 = 0;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field5931 = 2;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIII)Lai;", line = 7)
    public final class408 method2417(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5930++;
        if (arg1 >= -16) {
            method2419(-8, 119, 93, 98, -26, (byte) -15, 92, 5, 105);
        }
        return new class408(arg0, arg2, arg4, arg3, this.field5924, this.field5927, this.field5929, this.field5926, this.field5932, this.field5922);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lhs;Z)Z", line = 22)
    public static final boolean method2418(class205 arg0, boolean arg1) {
        boolean var2 = class99.field1801 == class262.field3978;
        int var3 = 0;
        byte var4 = 0;
        byte var5 = 0;
        arg0.method891((byte) 64);
        if (arg0.field3225 < 0 || arg0.field3219 < 0 || arg0.field3227 >= class377.field5492 || arg0.field3220 >= class347.field5132) {
            return false;
        }
        for (int var6 = arg0.field3225; var6 <= arg0.field3227; var6++) {
            for (int var9 = arg0.field3219; var9 <= arg0.field3220; var9++) {
                class268 var10 = class18.method95(arg0.field3217, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field3225) {
                        var11++;
                    }
                    if (var6 < arg0.field3227) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field3219) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field3220) {
                        var11 += 2;
                    }
                    class297 var12 = class495.method2983((byte) -124, var11, arg0);
                    class297 var13 = var10.field4045;
                    if (var13 == null) {
                        var10.field4045 = var12;
                    } else {
                        while (var13.field4500 != null) {
                            var13 = var13.field4500;
                        }
                        var13.field4500 = var12;
                    }
                    var10.field4038 = (byte) (var10.field4038 | var11);
                    if (var2 && (class280.field4251[var6][var9] & 0xFF000000) != 0) {
                        var3 = class280.field4251[var6][var9];
                        var4 = class226.field3467[var6][var9];
                        var5 = class31.field407[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field3225; var7 <= arg0.field3227; var7++) {
                for (int var8 = arg0.field3219; var8 <= arg0.field3220; var8++) {
                    if ((class280.field4251[var7][var8] & 0xFF000000) == 0) {
                        class280.field4251[var7][var8] = var3;
                        class226.field3467[var7][var8] = var4;
                        class31.field407[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class355.field5297[class103.field1830++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 141)
    public class408(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field5921 = arg0;
        this.field5922 = arg9;
        this.field5926 = (byte) arg7;
        this.field5927 = (short) arg5;
        this.field5932 = (byte) arg8;
        this.field5929 = (short) arg6;
        this.field5924 = (short) arg4;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIBIII)V", line = 161)
    public static final void method2419(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field5923++;
        if (arg5 >= -58) {
            field5931 = -120;
        }
        if (arg8 < 1 || arg0 < 1 || (class150.field2422 - 2) < arg8 || class21.field272 - 2 < arg0) {
            return;
        }
        int var9 = arg2;
        if (arg2 < 3 && class426.method2502(arg8, arg0, (byte) -114)) {
            var9 = arg2 + 1;
        }
        if (!class463.field7116.method75(-1, class30.field395) && !class29.method153(arg8, arg0, var9, (byte) 100, class455.field6976)) {
            return;
        }
        if (class321.field4830 == null) {
            return;
        }
        class6.field77.method1722(arg0, (byte) 75, arg8, arg6, class91.field1641[arg2], class345.field5116, arg2);
        if (arg4 < 0) {
            return;
        }
        boolean var10 = class463.field7116.field2944;
        class463.field7116.field2944 = true;
        class6.field77.method1714(arg1, arg8, var9, class91.field1641[arg2], arg4, class345.field5116, arg2, false, arg7, arg0, arg3);
        class463.field7116.field2944 = var10;
        return;
    }
}
