import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class15 extends class147 {

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public static int field198 = 0;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "J")
    public long field199;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "Lrj;")
    public class15 field197;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "Lrj;")
    public class15 field200;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)Z")
    public final boolean method102(byte arg0) {
        if (arg0 != 103) {
            method105(90, 29, -71);
        }
        field203++;
        return this.field200 != null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)Z")
    public static final boolean method103(int arg0, int arg1, int arg2) {
        field205++;
        if (!class385.field5517) {
            return false;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (arg0 != -1) {
            field204 = 112;
        }
        if (class284.field4130[var3] == null || class284.field4130[var3][var4] == null) {
            return false;
        }
        class256 var5 = class284.field4130[var3][var4];
        if (arg1 == -1 && var5.field3654 == 0) {
            for (class158 var6 = (class158) class485.field6882.method802((byte) 106); var6 != null; var6 = (class158) class485.field6882.method806((byte) 104)) {
                if (var6.field1889 == 22 || var6.field1889 == 1010 || var6.field1889 == 18 || var6.field1889 == 15 || var6.field1889 == 49) {
                    for (class256 var7 = class399.method2387(var6.field1881, -1857167024); var7 != null; var7 = class4.method30((byte) 102, var7)) {
                        if (var5.field3659 == var7.field3659) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class158 var8 = (class158) class485.field6882.method802((byte) 125); var8 != null; var8 = (class158) class485.field6882.method806((byte) 104)) {
                if (var8.field1884 == arg1 && var5.field3659 == var8.field1881 && (var8.field1889 == 22 || var8.field1889 == 1010 || var8.field1889 == 18 || var8.field1889 == 15 || var8.field1889 == 49)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(B)V")
    public final void method104(byte arg0) {
        field196++;
        if (this.field200 == null) {
            return;
        }
        this.field200.field197 = this.field197;
        this.field197.field200 = this.field200;
        if (arg0 > -55) {
            this.method102((byte) -95);
        }
        this.field197 = null;
        this.field200 = null;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(III)I")
    public static final int method105(int arg0, int arg1, int arg2) {
        field201++;
        if (arg1 > -115) {
            method105(95, -117, -111);
        }
        if (arg2 > arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }
}
