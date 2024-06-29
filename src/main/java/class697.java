import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class697 extends class665 {

    @OriginalMember(owner = "client!gfa", name = "p", descriptor = "I")
    public int field9862 = -1;

    @OriginalMember(owner = "client!gfa", name = "A", descriptor = "I")
    public int field9873 = 0;

    @OriginalMember(owner = "client!gfa", name = "r", descriptor = "I")
    public static int field9864 = 0;

    @OriginalMember(owner = "client!gfa", name = "s", descriptor = "I")
    public static int field9865 = 0;

    @OriginalMember(owner = "client!gfa", name = "k", descriptor = "I")
    public int field9857;

    @OriginalMember(owner = "client!gfa", name = "m", descriptor = "I")
    public int field9859;

    @OriginalMember(owner = "client!gfa", name = "n", descriptor = "I")
    public int field9860;

    @OriginalMember(owner = "client!gfa", name = "o", descriptor = "I")
    public int field9861;

    @OriginalMember(owner = "client!gfa", name = "q", descriptor = "I")
    public int field9863;

    @OriginalMember(owner = "client!gfa", name = "t", descriptor = "I")
    public int field9866;

    @OriginalMember(owner = "client!gfa", name = "u", descriptor = "I")
    public static int field9867;

    @OriginalMember(owner = "client!gfa", name = "v", descriptor = "I")
    public static int field9868;

    @OriginalMember(owner = "client!gfa", name = "w", descriptor = "I")
    public int field9869;

    @OriginalMember(owner = "client!gfa", name = "x", descriptor = "I")
    public int field9870;

    @OriginalMember(owner = "client!gfa", name = "y", descriptor = "I")
    public static int field9871;

    @OriginalMember(owner = "client!gfa", name = "z", descriptor = "I")
    public int field9872;

    @OriginalMember(owner = "client!gfa", name = "B", descriptor = "I")
    public int field9874;

    @OriginalMember(owner = "client!gfa", name = "l", descriptor = "Ljp;")
    public static class322 field9858;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)V")
    public static void method3891(int arg0) {
        if (arg0 != 12078) {
            method3891(-36);
        }
        field9858 = null;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I[Lvg;BZII)V")
    public static final void method3892(int arg0, class49[] arg1, byte arg2, boolean arg3, int arg4, int arg5) {
        field9871++;
        if (arg2 < 113) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length; var6++) {
            class49 var7 = arg1[var6];
            if (var7 != null && var7.field885 == arg4) {
                class178.method1209(var7, (byte) 1, arg3, arg5, arg0);
                class598.method3380(arg5, var7, (byte) -104, arg0);
                if (var7.field909 > (var7.field1021 - var7.field967)) {
                    var7.field909 = var7.field1021 - var7.field967;
                }
                if (var7.field909 < 0) {
                    var7.field909 = 0;
                }
                if (var7.field921 - var7.field877 < var7.field891) {
                    var7.field891 = var7.field921 - var7.field877;
                }
                if (var7.field891 < 0) {
                    var7.field891 = 0;
                }
                if (var7.field980 == 0) {
                    class391.method2407(0, var7, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIILok;BI)Lot;")
    public static final class546 method3893(int arg0, int arg1, int arg2, class228 arg3, byte arg4, int arg5) {
        if (arg4 <= 63) {
            return null;
        }
        field9867++;
        if (!arg3.field3521 && (!class284.method1835(arg2, 98) || !class284.method1835(arg5, 97))) {
            return arg3.field3471 ? new class546(arg3, 34037, arg1, arg0, arg2, arg5, true) : new class546(arg3, arg1, arg0, arg2, arg5, class2.method9(arg2, -39), class2.method9(arg5, 111), true);
        } else {
            return new class546(arg3, 3553, arg1, arg0, arg2, arg5, true);
        }
    }

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "(I)V")
    public static final void method3894(int arg0) {
        field9868++;
        if (arg0 != 19874) {
            return;
        }
        for (class420 var1 = (class420) class436.field6378.method472((byte) -34); var1 != null; var1 = (class420) class436.field6378.method482(119)) {
            class236 var2 = var1.field6118;
            if (var2.field3647) {
                var1.method3678(-1);
                var2.method1613(95);
            } else if (class564.field7962 >= var2.field3656) {
                var2.method1615(class312.field4621, 125);
                if (var2.field3647) {
                    var1.method3678(arg0 - 19875);
                } else {
                    class598.method3381(var2, true);
                }
            }
        }
    }
}
