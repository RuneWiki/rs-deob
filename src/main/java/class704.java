import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class704 extends class263 {

    @OriginalMember(owner = "client!nca", name = "h", descriptor = "Lac;")
    public class506 field9854;

    @OriginalMember(owner = "client!nca", name = "l", descriptor = "[Lsaa;")
    public static class305[] field9858 = new class305[0];

    @OriginalMember(owner = "client!nca", name = "g", descriptor = "I")
    public static int field9853;

    @OriginalMember(owner = "client!nca", name = "i", descriptor = "I")
    public static int field9855;

    @OriginalMember(owner = "client!nca", name = "j", descriptor = "I")
    public static int field9856;

    @OriginalMember(owner = "client!nca", name = "k", descriptor = "I")
    public static int field9857;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BI)V", line = 6)
    public static final void method3885(String arg0, String arg1, byte arg2, int arg3) {
        class139.field1674 = arg3;
        field9856++;
        class628.field8531 = 2;
        if (arg2 <= -11) {
            class22.method144(arg1, arg0, false, -211631871);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IC)Z", line = 19)
    public static final boolean method3886(int arg0, char arg1) {
        field9853++;
        int var2 = 49 / ((16 - arg0) / 57);
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)V", line = 32)
    public static void method3887(byte arg0) {
        if (arg0 == -1) {
            field9858 = null;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZI)V", line = 43)
    public static final void method3888(boolean arg0, int arg1) {
        field9855++;
        class440.field5535 = 0;
        class94.field1209 = 0;
        class82.method629((byte) 121);
        class632.method3545(93, arg0);
        class235.method1418(-5608);
        if (arg1 != 23136) {
            method3885(null, null, (byte) 31, -39);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < class440.field5535; var3++) {
            int var5 = class6.field64[var3];
            class704 var6 = (class704) class168.field1973.method3828((long) var5, (byte) -91);
            class506 var7 = var6.field9854;
            if (class367.field4752 && class185.method1102(9729, var5)) {
                class75.method598(arg1 - 23136);
            }
            if (class665.field9027 != var7.field441) {
                if (var7.field6326.method3814(true)) {
                    class550.method2944((byte) -93, var7);
                }
                var7.method2759(0, null);
                var2 = true;
                var6.method1566(arg1 - 23184);
            }
        }
        if (var2) {
            class215.field2516 = class168.field1973.method3833(0);
            class168.field1973.method3836(class140.field1687, (byte) -96);
        }
        if (class10.field100 != class222.field2585.field7313) {
            throw new RuntimeException("gnp1 pos:" + class222.field2585.field7313 + " psize:" + class10.field100);
        }
        for (int var4 = 0; var4 < class99.field1276; var4++) {
            if (class168.field1973.method3828((long) class352.field4562[var4], (byte) -91) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class99.field1276);
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Lac;)V", line = 117)
    public class704(class506 arg0) {
        this.field9854 = arg0;
    }
}
