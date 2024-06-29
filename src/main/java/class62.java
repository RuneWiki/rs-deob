import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class62 {

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "Lml;")
    public static class266 field1264;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "[Lqi;")
    public static class402[] field1266;

    static {
        new class309("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        field1268 = 0;
        field1269 = 0;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IBIIIILza;)Le;", line = 3)
    public static final class374 method546(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class288 arg6) {
        field1265++;
        long var7 = (long) arg3;
        class374 var9 = (class374) class189.field3038.method2478(arg1 ^ 0xFFFFFF83, var7);
        short var10 = 2055;
        if (var9 == null) {
            class528 var11 = class299.method1926(0, class477.field7053, 0, arg3);
            if (var11 == null) {
                return null;
            }
            if (var11.field7668 < 13) {
                var11.method3135((byte) -93, 0);
            }
            var9 = arg6.method297(var11, var10, class344.field5146, 64, 768);
            class189.field3038.method2472(-61, var9, var7);
        }
        class374 var12 = var9.method746((byte) 2, var10, true);
        if (arg2 != 0) {
            var12.method769(arg2);
        }
        if (arg0 != 0) {
            var12.method725(arg0);
        }
        if (arg1 != -126) {
            field1269 = 125;
        }
        if (arg4 != 0) {
            var12.method754(arg4);
        }
        if (arg5 != 0) {
            var12.method730(0, arg5, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)V", line = 62)
    public static void method547(byte arg0) {
        field1266 = null;
        field1264 = null;
        if (arg0 > -11) {
            method547((byte) -91);
        }
    }
}
