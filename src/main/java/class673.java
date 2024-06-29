import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public abstract class class673 implements class262 {

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "Lwm;")
    public class30 field8706;

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "Lwm;")
    private class30 field8707;

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "Laf;")
    public class14 field8712;

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "I")
    public static int field8709 = 0;

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "I")
    public static int field8708;

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "I")
    public static int field8710;

    @OriginalMember(owner = "client!mba", name = "h", descriptor = "I")
    public static int field8713;

    @OriginalMember(owner = "client!mba", name = "i", descriptor = "I")
    private int field8714;

    @OriginalMember(owner = "client!mba", name = "j", descriptor = "I")
    public static int field8715;

    @OriginalMember(owner = "client!mba", name = "k", descriptor = "I")
    public static int field8716;

    @OriginalMember(owner = "client!mba", name = "m", descriptor = "I")
    public static int field8718;

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "J")
    private long field8711;

    @OriginalMember(owner = "client!mba", name = "l", descriptor = "Lda;")
    private class420 field8717;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mba", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field8719;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mba", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field8720;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZI)V")
    public final void method835(boolean arg0, int arg1) {
        field8710++;
        int var3 = this.field8712.field149.method4129(0, class719.field9443, this.field8712.field140) + this.field8712.field144;
        int var4 = this.field8712.field143.method90(class398.field5240, this.field8712.field141, 96) + this.field8712.field151;
        this.method1746(var3, var4, arg1 ^ 0xFFFF9F19, arg0);
        this.method1745(var3, true, arg0, var4);
        String var5 = class601.field7648.method1335(0);
        if (arg1 != 24726) {
            this.field8714 = 115;
        }
        if ((class502.method2786(arg1 ^ 0xFFFF84A0) - this.field8711) > 10000L) {
            var5 = var5 + " (" + class601.field7648.method1328(30).method11(3) + ")";
        }
        this.field8717.method2427(var5, var4 + this.field8712.field146 - (-(this.field8712.field141 / 2) - 4), 116, this.field8712.field140 / 2 + var3, -1, this.field8712.field142);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIIZ)V")
    public abstract void method1746(int arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z)I")
    public static final int method3627(boolean arg0) {
        field8708++;
        if (arg0) {
            return 45;
        }
        int var1 = 0;
        Field[] var2 = (field8719 == null ? (field8719 = method3630("sf")) : field8719).getDeclaredFields();
        Field[] var3 = var2;
        for (int var4 = 0; var4 < var3.length; var4++) {
            Field var5 = var3[var4];
            if ((field8720 == null ? (field8720 = method3630("jca")) : field8720).isAssignableFrom(var5.getType())) {
                var1++;
            }
        }
        return var1 + 1;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIII)Lfi;")
    public static final class13 method3628(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            field8709 = 112;
        }
        field8716++;
        class13 var4 = null;
        if (arg1 == 0) {
            class417.field5510++;
            var4 = class659.method3587(class68.field909, 98, class38.field426);
        }
        if (arg1 == 1) {
            var4 = class659.method3587(class68.field909, 98, class38.field420);
            class520.field6606++;
        }
        var4.field130.method1502(class714.field9407 + arg3, 65280);
        var4.field130.method1533(class679.field8781.method271((byte) 121, 82) ? 1 : 0, (byte) 32);
        var4.field130.method1541(arg0 + 374, class240.field3293 + arg2);
        class102.field1357 = false;
        class270.field3560 = arg3;
        class167.field2221 = arg2;
        class20.method91((byte) -84);
        return var4;
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)V")
    public void method1035(int arg0) {
        field8718++;
        class166 var2 = class663.method3610(this.field8707, this.field8712.field150, 8);
        this.field8717 = class576.field7320.method1002(var2, class388.method2237(this.field8706, this.field8712.field150), true);
        if (arg0 != 27889) {
            this.method1035(24);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IZZI)V")
    public abstract void method1745(int arg0, boolean arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)Z")
    public boolean method1034(int arg0) {
        field8715++;
        boolean var2 = true;
        if (!this.field8706.method130(-2, this.field8712.field150)) {
            var2 = false;
        }
        if (!this.field8707.method130(arg0 ^ 0x7D9E, this.field8712.field150)) {
            var2 = false;
        }
        if (arg0 != -32160) {
            this.method1034(80);
        }
        return var2;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)I")
    public final int method3629(byte arg0) {
        field8713++;
        int var2 = class601.field7648.method1327(117);
        int var3 = var2 * 100;
        if (this.field8714 == var2 && var2 != 0) {
            int var4 = class601.field7648.method1332(115);
            if (var4 > var2) {
                long var5 = this.field8711 - class601.field7648.method1334(25326);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class502.method2786(-7114) - this.field8711) * 10000L;
                    if (var7 > var9) {
                        var3 = (int) ((long) (var4 - var2) * var9 * 100L / var7 + ((long) (var2 * 100)));
                    } else {
                        var3 = var4 * 100;
                    }
                }
            }
        } else {
            this.field8714 = var2;
            this.field8711 = class502.method2786(-7114);
        }
        return arg0 < 15 ? -45 : var3;
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lwm;Lwm;Laf;)V")
    public class673(class30 arg0, class30 arg1, class14 arg2) {
        this.field8706 = arg0;
        this.field8707 = arg1;
        this.field8712 = arg2;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3630(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
