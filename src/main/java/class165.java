import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class165 extends class406 {

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    private int field2657 = -1;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "F")
    public static float field2658;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLod;)V", line = 4)
    public static final void method1289(boolean arg0, class534 arg1) {
        if (arg0) {
            return;
        }
        field2655++;
        if (class611.field8532) {
            return;
        }
        arg1.method1207(80);
        class690.field9574--;
        if (!arg1.field7228) {
            long var5 = arg1.field7235;
            class606 var7;
            for (var7 = (class606) class732.field10102.method337(var5, 1); var7 != null && !var7.field8462.equals(arg1.field7233); var7 = (class606) class732.field10102.method344((byte) 107)) {
            }
            if (var7 != null && var7.method3442(-1, arg1)) {
                client.method2011((byte) -69, var7);
            }
            return;
        }
        for (class606 var2 = (class606) class142.field2405.method1951(-723780560); var2 != null; var2 = (class606) class142.field2405.method1946(-6974)) {
            if (var2.field8462.equals(arg1.field7233)) {
                boolean var3 = false;
                for (class534 var4 = (class534) var2.field8460.method1951(-723780560); var4 != null; var4 = (class534) var2.field8460.method1946(-6974)) {
                    if (arg1 == var4) {
                        if (var2.method3442(-1, arg1)) {
                            client.method2011((byte) -69, var2);
                        }
                        var3 = true;
                        break;
                    }
                }
                if (var3) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)Lrda;", line = 84)
    public static final class691 method1290(byte arg0) {
        field2660++;
        try {
            return arg0 <= 59 ? null : (class691) Class.forName("wi").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLgca;)V", line = 104)
    public final void method1291(boolean arg0, class265 arg1) {
        arg1.method1727(this.field2657, -68);
        field2656++;
        if (!arg0) {
            this.method1291(true, null);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lfca;Z)V", line = 117)
    public final void method1292(class93 arg0, boolean arg1) {
        field2654++;
        this.field2657 = arg0.method763(124);
        arg0.method793((byte) 77);
        if (arg0.method793((byte) 92) != 255) {
            arg0.field1442--;
            arg0.method770((byte) 104);
        }
        if (arg1) {
            method1289(false, null);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lkh;IIIZLha;)V", line = 141)
    public static final void method1293(class17 arg0, int arg1, int arg2, int arg3, boolean arg4, class66 arg5) {
        if (arg4) {
            return;
        }
        for (int var6 = 7; var6 >= 0; var6--) {
            for (int var7 = 127; var7 >= 0; var7--) {
                int var8 = var7 & 0x7F | arg1 & 0x3F << 10 | var6 & 0x7 << 7;
                int var9 = class624.field8692[class752.method4172(var8, 1474149255) & 0xFFFF];
                arg5.method537(arg3 + (arg0.field347 * var7 >> 7), ((-var6 + 7) * arg0.field330 >> 3) + arg2, (arg0.field347 >> 7) + 1, (arg0.field330 >> 3) + 1, var9, 0);
            }
        }
        field2659++;
    }
}
