import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class231 {

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "Lca;")
    public static class263 field4128 = new class263();

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Lcf;")
    public static class93 field4131 = class147.method1066("::serverjs5drop", -48);

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Lcf;")
    public static class93 field4129 = class147.method1066("<col=40ff00>", -48);

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Lcf;")
    public static class93 field4130 = class147.method1066("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", -48);

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Lcf;")
    public static class93 field4132 = class147.method1066("glissement:", -48);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public static final void method1579(byte arg0) {
        field4133++;
        for (int var1 = -1; var1 < class252.field4543; var1++) {
            int var6;
            if (var1 == -1) {
                var6 = 2047;
            } else {
                var6 = class234.field4166[var1];
            }
            class237 var7 = class224.field4031[var6];
            if (var7 != null && var7.field3773 > 0) {
                var7.field3773--;
                if (var7.field3773 == 0) {
                    var7.field3792 = null;
                }
            }
        }
        int var2 = 105 % ((-arg0 - 15) / 59);
        for (int var3 = 0; var3 < class72.field1299; var3++) {
            int var4 = class58.field995[var3];
            class227 var5 = class155.field2709[var4];
            if (var5 != null && var5.field3773 > 0) {
                var5.field3773--;
                if (var5.field3773 == 0) {
                    var5.field3792 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static void method1580(int arg0) {
        if (arg0 <= 55) {
            field4130 = null;
        }
        field4131 = null;
        field4128 = null;
        field4132 = null;
        field4130 = null;
        field4129 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLhg;I)Z")
    public static final boolean method1581(byte arg0, class177 arg1, int arg2) {
        field4127++;
        byte[] var3 = arg1.method1264(arg0 ^ 0xD, arg2);
        if (arg0 != 106) {
            method1580(-19);
        }
        if (var3 == null) {
            return false;
        } else {
            class124.method912(var3, 0);
            return true;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
    public static final void method1582(boolean arg0) {
        if (arg0) {
            class232.field4138 = class193.field3543;
            class233.field4151 = class270.field4815;
        } else {
            class232.field4138 = class164.field2897;
            class233.field4151 = class69.field1265;
        }
        class170.field3002 = class232.field4138.length;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIILdh;Ltg;)V")
    public static final void method1583(int arg0, int arg1, int arg2, int arg3, int arg4, class120 arg5, class181 arg6) {
        field4126++;
        if (arg5 == null) {
            return;
        }
        int var7 = class95.field1719 + class50.field825 & 0x7FF;
        int var8 = Math.max(arg6.field3270 / 2, arg6.field3252 / 2) + 10;
        int var9 = arg0 * arg0 + (arg3 * arg3);
        if ((var8 * var8) < var9) {
            return;
        }
        int var10 = class179.field3155[var7];
        int var11 = var10 * 256 / (class248.field4458 + 256);
        if (arg1 != 1) {
            method1580(-56);
        }
        int var12 = class179.field3158[var7];
        int var13 = var12 * 256 / (class248.field4458 + 256);
        int var14 = arg3 * var13 - (arg0 * var11) >> 16;
        int var15 = arg0 * var13 + arg3 * var11 >> 16;
        ((class158) arg5).method1144(arg2 + var15 + arg6.field3270 / 2 - (arg5.field2130 / 2), arg6.field3252 / 2 + -var14 + -(arg5.field2129 / 2) + arg4, arg6.field3261, arg6.field3257);
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)Lgk;")
    public static final class157 method1584(byte arg0) {
        field4125++;
        return arg0 <= 103 ? null : class164.field2886;
    }
}
