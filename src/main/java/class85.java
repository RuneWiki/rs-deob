import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class85 {

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field1394 = 0;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field1402 = 0;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public int field1389;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public int field1392;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public int field1395;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public int field1396;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public int field1400;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public int field1403;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "[B")
    public byte[] field1397;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "[B")
    public byte[] field1401;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V")
    public static final void method609(int arg0, int arg1) {
        class108.field1787 = arg0;
        class73.field1194 = arg1;
        field1393++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIBIII)V")
    public static final void method610(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        if (arg5 >= -120) {
            return;
        }
        field1391++;
        int var9 = arg1 - arg6;
        int var10 = arg2 - arg3;
        int var11 = (arg0 - arg4 << 16) / var9;
        int var12 = (arg7 - arg8 << 16) / var10;
        class176.method1216(arg8, 0, arg3, arg1, var12, 0, arg2, arg6, var11, arg4, (byte) -16);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)I")
    public static final int method611(boolean arg0, int arg1) {
        if (!arg0) {
            method611(true, -99);
        }
        field1398++;
        if (arg1 < 0) {
            return 0;
        }
        class201 var2 = (class201) class103.field1708.method150((long) arg1, -63);
        if (var2 == null) {
            return class83.method596(5, arg1).field4203;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field3511.length; var4++) {
            if (var2.field3511[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class83.method596(5, arg1).field4203 - var2.field3511.length);
    }
}
