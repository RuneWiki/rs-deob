import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class105 extends class181 {

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "[Llb;")
    public class177[] field1896;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "Lli;")
    public static class185 field1898 = class245.method1649("1", -120);

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "Lae;")
    public static class238 field1891 = new class238(64);

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "Lli;")
    public static class185 field1899 = class245.method1649("", 1);

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V")
    public static void method737(byte arg0) {
        field1898 = null;
        field1899 = null;
        field1891 = null;
        if (arg0 < 35) {
            field1898 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(JILli;SILli;II)V")
    public static final void method738(long arg0, int arg1, class185 arg2, short arg3, int arg4, class185 arg5, int arg6, int arg7) {
        if (arg7 > -96) {
            method740((class250) null, 108);
        }
        field1897++;
        if (class112.field2027 || class127.field2283 >= 500) {
            return;
        }
        class37.field587[class127.field2283] = arg5;
        class107.field1922[class127.field2283] = arg2;
        class158.field3004[class127.field2283] = arg4 == -1 ? class158.field2986 : arg4;
        class55.field936[class127.field2283] = arg3;
        class162.field3052[class127.field2283] = arg0;
        class78.field1353[class127.field2283] = arg1;
        class49.field809[class127.field2283] = arg6;
        class127.field2283++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Z")
    public final boolean method739(int arg0, int arg1) {
        field1892++;
        return arg1 == 255 ? this.field1896[arg0].field3225 : true;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lhi;I)V")
    public static final void method740(class250 arg0, int arg1) {
        int var2 = -25 % ((-arg1 - 31) / 40);
        class178.field3252 = arg0;
        field1893++;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)V")
    public static final void method741(int arg0, int arg1) {
        if (arg1 <= -76) {
            field1894++;
            class5.field128.method85((byte) 75, arg0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lhi;Lhi;IZ)V")
    public class105(class250 arg0, class250 arg1, int arg2, boolean arg3) {
        class191 var5 = new class191();
        int var6 = arg0.method1693(arg2, 0);
        this.field1896 = new class177[var6];
        int[] var7 = arg0.method1698(false, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1688(0, var7[var8], arg2);
            class243 var10 = null;
            int var11 = var9[0] & 0xFF << 8 | var9[1] & 0xFF;
            for (class243 var12 = (class243) var5.method1375(16259); var12 != null; var12 = (class243) var5.method1377(-19546)) {
                if (var12.field4345 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1695(0, var11, 0);
                } else {
                    var13 = arg1.method1695(var11, 0, 0);
                }
                var10 = new class243(var11, var13);
                var5.method1382(var10, (byte) -107);
            }
            this.field1896[var7[var8]] = new class177(var9, var10);
        }
    }
}
