import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class602 extends class212 {

    @OriginalMember(owner = "client!kfa", name = "v", descriptor = "I")
    public static int field8268 = 0;

    @OriginalMember(owner = "client!kfa", name = "o", descriptor = "I")
    public static int field8261;

    @OriginalMember(owner = "client!kfa", name = "p", descriptor = "I")
    public static int field8262;

    @OriginalMember(owner = "client!kfa", name = "q", descriptor = "I")
    public static int field8263;

    @OriginalMember(owner = "client!kfa", name = "r", descriptor = "I")
    public static int field8264;

    @OriginalMember(owner = "client!kfa", name = "s", descriptor = "I")
    public static int field8265;

    @OriginalMember(owner = "client!kfa", name = "t", descriptor = "I")
    public static int field8266;

    @OriginalMember(owner = "client!kfa", name = "u", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!kfa", name = "w", descriptor = "I")
    public static int field8269;

    @OriginalMember(owner = "client!kfa", name = "x", descriptor = "I")
    public static int field8270;

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)I", line = 3)
    public final int method422(int arg0) {
        ++field8269;
        return arg0 != 20014 ? 98 : 1;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II)V", line = 14)
    public final void method419(int arg0, int arg1) {
        super.field3006 = arg1;
        int var3 = 57 / ((arg0 - 82) / 35);
        ++field8264;
    }

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "(I)I", line = 27)
    public final int method3426(int arg0) {
        ++field8266;
        if (arg0 != -32350) {
            field8263 = -17;
        }
        return super.field3006;
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Ldh;)V", line = 39)
    public class602(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIZ)Z", line = 43)
    public static final boolean method3427(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return true;
        } else {
            ++field8267;
            return class85.method815((byte) -128, arg1, arg0) || class582.method3336(arg1, arg0, (byte) 96);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lua;B)V", line = 56)
    public static final void method3428(class665 arg0, byte arg1) {
        ++field8270;
        arg0.method3740(122);
        int var2 = class561.field7752;
        class598 var3 = class58.field1147 = class49.field1040[var2] = new class598();
        var3.field5716 = var2;
        int var4 = arg0.method3733((byte) -24, 30);
        if (arg1 != 118) {
            field8263 = 111;
        }
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 16383;
        var3.field5746[0] = -class221.field3177 + var6;
        int var7 = 16383 & var4;
        var3.field5922 = (var3.field5746[0] << 9) + (var3.method2457((byte) 91) << 8);
        var3.field5743[0] = -class367.field5236 + var7;
        var3.field5933 = (var3.field5743[0] << 9) - -(var3.method2457((byte) 85) << 8);
        class382.field5551 = var3.field5926 = var3.field5921 = var5;
        if (class334.method2118(var3.field5743[0], var3.field5746[0], true)) {
            ++var3.field5921;
        }
        if (class627.field8638[var2] != null) {
            var3.method3400((byte) 84, class627.field8638[var2]);
        }
        class219.field3167 = 0;
        class87.field1561[class219.field3167++] = var2;
        class25.field736[var2] = 0;
        class500.field6982 = 0;
        for (int var8 = 1; ~var8 > -2049; ++var8) {
            if (~var2 != ~var8) {
                int var9 = arg0.method3733((byte) -24, 18);
                int var10 = var9 >> 16;
                int var11 = (var9 & 65400) >> 8;
                int var12 = var9 & 255;
                class753 var13 = class217.field3154[var8] = new class753();
                var13.field10521 = false;
                var13.field10515 = (var11 << 14) + (var10 << 28) + var12;
                var13.field10518 = 0;
                var13.field10520 = -1;
                class106.field1861[class500.field6982++] = var8;
                class25.field736[var8] = 0;
            }
        }
        arg0.method3735(false);
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(ILdh;)V", line = 131)
    public class602(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(ZI)Lmf;", line = 134)
    public static final class420 method3429(boolean arg0, int arg1) {
        if (arg0) {
            method3427(35, -126, false);
        }
        ++field8262;
        return class637.field8754 && class380.field5522 <= arg1 && ~arg1 >= ~class123.field2120 ? class349.field4876[-class380.field5522 + arg1] : null;
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(II)I", line = 153)
    public final int method417(int arg0, int arg1) {
        if (arg0 != 3) {
            field8268 = -34;
        }
        ++field8261;
        return 1;
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)V", line = 164)
    public final void method418(boolean arg0) {
        ++field8265;
        if (arg0) {
            this.method422(-110);
        }
        if (~super.field3006 != -2 && ~super.field3006 != -1) {
            super.field3006 = this.method422(20014);
        }
    }
}
