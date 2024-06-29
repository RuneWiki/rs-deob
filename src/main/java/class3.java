import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class3 extends class12 {

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "[J")
    private long[] field67 = new long[10];

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    private int field68 = 0;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    private int field77 = 1;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    private int field66 = 256;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "J")
    private long field70 = class213.method1414(-9292);

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "[I")
    public static int[] field71 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "Lsc;")
    public static class181 field74 = class149.method967(255, "loc");

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    private int field72;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method27(int arg0, Component arg1) {
        field75++;
        Method var2 = class142.field2298;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class2.field57);
        if (arg0 != 1) {
            field71 = null;
        }
        arg1.addFocusListener(class2.field57);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(III)Lqh;")
    public static final class100 method28(int arg0, int arg1, int arg2) {
        class220 var3 = class221.field3820[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3806; var4++) {
            class100 var5 = var3.field3797[var4];
            if ((var5.field1677 >> 29 & 0x3L) == 2L && var5.field1688 == arg1 && var5.field1672 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BIIIII)V")
    public static final void method29(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class59.field893[0].method482(arg3, arg4);
        class59.field893[1].method482(arg3, arg2 + arg4 - 16);
        int var6 = -48 % ((-arg0 - 2) / 39);
        field69++;
        int var7 = (arg2 - 32) * arg2 / arg1;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg2 - var7 - 32) * arg5 / (arg1 - arg2);
        class17.method156(arg3, arg4 + 16, 16, arg2 - 32, class11.field204);
        class17.method156(arg3, arg4 + var8 + 16, 16, var7, class213.field3673);
        class17.method152(arg3, var8 + arg4 + 16, var7, class240.field4169);
        class17.method152(arg3 + 1, arg4 - -16 + var8, var7, class240.field4169);
        class17.method167(arg3, arg4 - (-var8 - 16), 16, class240.field4169);
        class17.method167(arg3, arg4 - (-var8 - 17), 16, class240.field4169);
        class17.method152(arg3 + 15, var8 + 16 + arg4, var7, class33.field538);
        class17.method152(arg3 + 14, var8 + 17 + arg4, var7 - 1, class33.field538);
        class17.method167(arg3, arg4 + var8 + var7 + 15, 16, class33.field538);
        class17.method167(arg3 + 1, var8 - -var7 + arg4 + 14, 15, class33.field538);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
    public static void method30(byte arg0) {
        if (arg0 >= 59) {
            field74 = null;
            field71 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)I")
    public final int method31(int arg0, int arg1, int arg2) {
        int var4 = this.field77;
        int var5 = this.field66;
        field76++;
        this.field66 = 300;
        this.field77 = 1;
        this.field70 = class213.method1414(-9292);
        if (this.field67[this.field72] == 0L) {
            this.field77 = var4;
            this.field66 = var5;
        } else if (this.field70 > this.field67[this.field72]) {
            this.field66 = (int) ((long) (arg2 * 2560) / (this.field70 - this.field67[this.field72]));
        }
        if (this.field66 < 25) {
            this.field66 = 25;
        }
        if (this.field66 > 256) {
            this.field66 = 256;
            this.field77 = (int) ((long) arg2 - ((this.field70 - this.field67[this.field72]) / 10L));
        }
        if (arg2 < this.field77) {
            this.field77 = arg2;
        }
        this.field67[this.field72] = this.field70;
        this.field72 = (this.field72 + 1) % 10;
        if (this.field77 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field67[var6] != 0L) {
                    this.field67[var6] -= -((long) this.field77);
                }
            }
        }
        if (this.field77 < arg1) {
            this.field77 = arg1;
        }
        int var7 = -113 % ((-arg0 - 9) / 35);
        int var8 = 0;
        class95.method632(true, (long) this.field77);
        while (this.field68 < 256) {
            var8++;
            this.field68 += this.field66;
        }
        this.field68 &= 0xFF;
        return var8;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public final void method32(byte arg0) {
        field73++;
        if (arg0 < 65) {
            method28(-91, -89, -48);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field67[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    public class3() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field67[var1] = this.field70;
        }
    }
}
