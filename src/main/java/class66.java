import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class66 extends class243 {

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "I")
    private int field1027;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
    private int field1022;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    private int field1021;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
    private int field1023;

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!ao", name = "t", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!ao", name = "u", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!ao", name = "v", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIII)V")
    public static final void method531(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1030;
        if (arg2 == -16426) {
            int var5 = class614.field8262;
            int var6 = class236.field3494;
            if (class222.field3009) {
                var5 += class580.method3374(arg2 + 40614);
                var6 += class721.method4038(true);
            }
            if (~class424.field5954 == -2) {
                class298 var7 = class266.field3897[class180.field2480 / 100];
                var7.method1970(var5 + -8, var6 - 8);
                class483.method2944(var7.method1963() + var5 + -8, -8 + (var6 - -var7.method1961()), var5 + -8, var6 + -8, -1);
            }
            if (class424.field5954 == 2) {
                class298 var8 = class266.field3897[class180.field2480 / 100 + 4];
                var8.method1970(var5 - 8, var6 + -8);
                class483.method2944(var5 + -8 + var8.method1963(), var8.method1961() + var6 + -8, var5 + -8, var6 + -8, -1);
            }
            class64.method516((byte) 48);
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(IIIIII)V")
    public class66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1027 = arg1;
        this.field1022 = arg3;
        this.field1021 = arg2;
        this.field1023 = arg0;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)V")
    public final void method90(int arg0, int arg1, int arg2) {
        if (arg2 == 10893) {
            ++field1029;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IILjava/lang/String;BZ)V")
    public static final void method532(int arg0, int arg1, String arg2, byte arg3, boolean arg4) {
        ++field1026;
        class126.method787(arg4, false, arg2, 0, arg1, (String) null, arg0);
        if (arg3 > -118) {
            method531(-54, 39, 124, 33, 4);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIB)V")
    public final void method87(int arg0, int arg1, byte arg2) {
        ++field1028;
        if (arg2 < 92) {
            this.field1021 = -104;
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(III)V")
    public final void method92(int arg0, int arg1, int arg2) {
        ++field1024;
        int var4 = -98 % ((arg1 - -20) / 33);
        int var5 = this.field1023 * arg2 >> 12;
        int var6 = this.field1021 * arg2 >> 12;
        int var7 = this.field1027 * arg0 >> 12;
        int var8 = this.field1022 * arg0 >> 12;
        class733.method4079(var8, var5, super.field3610, var6, -16192, var7);
    }
}
