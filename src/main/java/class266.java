import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class266 extends class80 {

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "J")
    public long field4477;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Lvm;")
    public static class202 field4478 = new class202(64);

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "[I")
    public static int[] field4480 = new int[100];

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "[I")
    public static int[] field4482 = new int[1000];

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "[I")
    public static int[] field4481 = new int[32];

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "Lph;")
    public static class229 field4485 = method1858("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 0);

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "[I")
    public static int[] field4488 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;I)Lph;", line = 6)
    public static final class229 method1858(String arg0, int arg1) {
        field4476++;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class229 var4 = new class229();
        var4.field3772 = new byte[var3];
        int var5 = arg1;
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var5) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field3772[var4.field3785++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field3772[var4.field3785++] = (byte) var6;
            }
        }
        var4.method1620(-22358);
        return var4.method1622(-1447633246);
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)V", line = 45)
    public static void method1859(int arg0) {
        field4478 = null;
        field4481 = null;
        field4482 = null;
        field4488 = null;
        field4485 = null;
        field4480 = null;
        if (arg0 >= -9) {
            method1861((Frame) null, (byte) 125, (class92) null);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLph;Z)V", line = 76)
    public static final void method1860(byte arg0, class229 arg1, boolean arg2) {
        if (arg0 != 66) {
            field4483 = -70;
        }
        field4479++;
        int var3 = 0;
        int var4 = arg2 ? 32768 : 0;
        short[] var5 = new short[16];
        class229 var6 = arg1.method1616(-985019996);
        int var7 = var4 + (arg2 ? class174.field2858 : class145.field2356);
        for (int var8 = var4; var8 < var7; var8++) {
            class260 var9 = class224.method1560((byte) -61, var8);
            if (var9.field4344 && var9.method1809(0).method1616(-985019996).method1611(var6, 24104) != -1) {
                if (var3 >= 50) {
                    class38.field610 = -1;
                    class65.field987 = null;
                    return;
                }
                if (var5.length <= var3) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var3; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var3++] = (short) var8;
            }
        }
        class38.field610 = var3;
        class229[] var12 = new class229[class38.field610];
        class65.field987 = var5;
        class206.field3400 = 0;
        for (int var13 = 0; var13 < class38.field610; var13++) {
            var12[var13] = class224.method1560((byte) -61, var5[var13]).method1809(0);
        }
        class59.method392(var12, true, class65.field987);
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V", line = 143)
    public class266() {
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/awt/Frame;BLwe;)V", line = 164)
    public static final void method1861(Frame arg0, byte arg1, class92 arg2) {
        field4475++;
        if (arg1 != 86) {
            return;
        }
        while (true) {
            class247 var3 = arg2.method692(arg0, -115);
            while (var3.field4125 == 0) {
                class288.method1976((byte) 101, 10L);
            }
            if (var3.field4125 == 1) {
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class288.method1976((byte) 100, 100L);
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(J)V", line = 201)
    public class266(long arg0) {
        this.field4477 = arg0;
    }
}
