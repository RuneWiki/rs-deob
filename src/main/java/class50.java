import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class50 extends class42 {

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public int field916 = -1;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    public int field928 = 0;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "Lqv;")
    public static class316 field915 = new class316(1, -1);

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public int field926;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
    public int field930;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    public int field931;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIZIZ)I")
    public static final int method446(int arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field917++;
        class304 var5 = class75.method579(arg2, true, arg3);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = arg0; var7 < var5.field4506.length; var7++) {
            if (var5.field4506[var7] >= 0 && class58.field1052.field3771 > var5.field4506[var7]) {
                class116 var8 = class58.field1052.method1646(21708, var5.field4506[var7]);
                int var9 = var8.method823(arg1, class510.field7361.method2011(66, arg1).field4220, false);
                if (arg4) {
                    var6 += var5.field4510[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method447(int arg0) {
        if (arg0 > -87) {
            field927 = -89;
        }
        field915 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILiu;)V")
    public static final void method448(int arg0, class415 arg1) {
        for (int var2 = 0; var2 < class177.field2636; var2++) {
            int var4 = class8.field60[var2];
            class510 var5 = class494.field7143[var4];
            int var6 = arg1.method3072((byte) -127);
            if ((var6 & 0x10) != 0) {
                var6 += arg1.method3072((byte) -125) << 8;
            }
            if ((var6 & 0x4000) != 0) {
                var6 += arg1.method3072((byte) -121) << 16;
            }
            class70.method544(var4, var5, arg1, var6, 0);
        }
        int var3 = 52 % ((-arg0 - 61) / 32);
        field921++;
    }
}
