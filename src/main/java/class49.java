import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public abstract class class49 extends class435 {

    @OriginalMember(owner = "client!pba", name = "w", descriptor = "I")
    public static int field642 = -1;

    @OriginalMember(owner = "client!pba", name = "q", descriptor = "Leda;")
    public static class116 field636 = new class116(65, 1);

    @OriginalMember(owner = "client!pba", name = "r", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!pba", name = "s", descriptor = "I")
    public int field638;

    @OriginalMember(owner = "client!pba", name = "t", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!pba", name = "u", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!pba", name = "x", descriptor = "I")
    public int field643;

    @OriginalMember(owner = "client!pba", name = "v", descriptor = "[I")
    public int[] field641;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ZIZI)V")
    public static final void method386(int arg0, String arg1, String arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        class400.field5781.field4849 = 1;
        field640++;
        String var7 = arg2.toLowerCase();
        short[] var8 = new short[16];
        int var9 = -1;
        String var10 = null;
        if (arg6 != -1) {
            class349 var11 = class237.field3504.method1554(false, arg6);
            if (var11 == null || arg5 != var11.method2122((byte) -18)) {
                return;
            }
            if (var11.method2122((byte) 117)) {
                var10 = var11.field4931;
            } else {
                var9 = var11.field4922;
            }
        }
        int var12 = 0;
        for (int var13 = 0; var13 < class430.field6132.field104; var13++) {
            class432 var16 = class430.field6132.method42(var13, false);
            if ((!arg3 || var16.field6163) && var16.field6146 == -1 && var16.field6157 == -1 && var16.field6189 == 0 && var16.field6194.toLowerCase().indexOf(var7) != -1) {
                if (arg6 != -1) {
                    if (arg5) {
                        if (!arg1.equals(var16.method2538(var10, 10000000, arg6))) {
                            continue;
                        }
                    } else if (arg0 != var16.method2531(false, arg6, var9)) {
                        continue;
                    }
                }
                if (var12 >= 250) {
                    class252.field3647 = -1;
                    class53.field685 = null;
                    return;
                }
                if (var8.length <= var12) {
                    short[] var17 = new short[var8.length * 2];
                    for (int var18 = 0; var18 < var12; var18++) {
                        var17[var18] = var8[var18];
                    }
                    var8 = var17;
                }
                var8[var12++] = (short) var13;
            }
        }
        class53.field685 = var8;
        class252.field3647 = var12;
        class168.field2747 = 0;
        String[] var14 = new String[class252.field3647];
        int var15 = 0;
        if (arg4 != -13808) {
            return;
        }
        while (class252.field3647 > var15) {
            var14[var15] = class430.field6132.method42(var8[var15], false).field6194;
            var15++;
        }
        class512.method3048(-2, class53.field685, var14);
        class400.field5781.method2097(-107);
        class400.field5781.field4849 = 2;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public abstract void method387(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "()V")
    public static final void method388() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class355.field4980.length; var1++) {
                if (class355.field4980[var1].method1306()) {
                    class464.field6645[var1] = class355.field4980[var1].method1308();
                } else {
                    synchronized (class355.field4980[var1]) {
                        class355.field4980[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class355.field4980[class355.field4980.length - 1].method1307();
                class666.method3751(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class355.field4980.length - 1; var4++) {
                        if (!class355.field4980[var4].method1306()) {
                            synchronized (class355.field4980[var4]) {
                                class355.field4980[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class355.field4980.length - 2; var6++) {
                            class355.field4980[var6].method1307();
                        }
                        class666.method3751(2);
                        while (!class355.field4980[0].method1306()) {
                            synchronized (class355.field4980[0]) {
                                class355.field4980[0].notify();
                            }
                            try {
                                class564.method3300((byte) 94, 1L);
                            } catch (Exception var9) {
                            }
                        }
                        class355.field4980[0].method1307();
                        return;
                    }
                    try {
                        class564.method3300((byte) 125, 1L);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class564.method3300((byte) -116, 1L);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public abstract void method389(Canvas arg0, byte arg1);

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
    public abstract void method390(int arg0, Graphics arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Ln;[[BI)V")
    public static final void method391(class678 arg0, byte[][] arg1, int arg2) {
        field639++;
        int var3 = class436.field6271.length;
        if (arg2 != 8945) {
            field637 = -99;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class221.field3306[var4] >> 8) * 64 - class143.field2474;
                int var7 = (class221.field3306[var4] & 0xFF) * 64 - class63.field917;
                class655.method3701((byte) 38);
                arg0.method3832(class637.field9048, var6, class45.field609, var5, var7, arg2 ^ 0x22CE);
            }
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V")
    public static void method392(int arg0) {
        field636 = null;
        if (arg0 != -1) {
            field642 = -109;
        }
    }
}
