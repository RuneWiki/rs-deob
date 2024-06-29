import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public abstract class class60 {

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "[C")
    public static char[] field1047 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)I")
    public abstract int method537(boolean arg0);

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lqa;)V")
    public static final void method538(class162 arg0) {
        for (int var1 = class272.field3938; var1 < class334.field5130; var1++) {
            for (int var2 = 0; var2 < class246.field3560; var2++) {
                for (int var3 = 0; var3 < class254.field3675; var3++) {
                    class165 var4 = class36.field545[var1][var2][var3];
                    if (var4 != null) {
                        class524 var5 = var4.field2480;
                        class524 var6 = var4.field2484;
                        if (var5 != null && var5.method121(26923)) {
                            class515.method3052(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method121(26923)) {
                                class515.method3052(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method111(0, 0, arg0, 59, false, var5, 0);
                                var6.method117(-128);
                            }
                            var5.method117(-128);
                        }
                        for (class525 var7 = var4.field2490; var7 != null; var7 = var7.field7716) {
                            class370 var9 = var7.field7711;
                            if (var9 != null && var9.method121(26923)) {
                                class515.method3052(arg0, var9, var1, var2, var3, var9.field5542 + 1 - var9.field5532, var9.field5540 - var9.field5535 + 1);
                                var9.method117(-128);
                            }
                        }
                        class311 var8 = var4.field2487;
                        if (var8 != null && var8.method121(26923)) {
                            class530.method3142(arg0, var8, var1, var2, var3);
                            var8.method117(-128);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method539(boolean arg0, Component arg1);

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(Z)V")
    public static void method540(boolean arg0) {
        field1047 = null;
        if (!arg0) {
            field1047 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method541(byte arg0, Component arg1);

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)V")
    public static final void method542(int arg0, int arg1, int arg2) {
        field1048++;
        int var3 = class476.field6998.method105(class229.field3348.method1273(true, class370.field5530), 1);
        for (class231 var4 = (class231) class246.field3563.method2257((byte) 103); var4 != null; var4 = (class231) class246.field3563.method2256(57)) {
            int var8 = class104.method791(var4, (byte) -119);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class106.field1669 * 16 + 21;
        int var6 = arg1 - (var3 / 2);
        if (class112.field1780 < (var3 + var6)) {
            var6 = class112.field1780 - var3;
        }
        if (arg2 != 0) {
            method538(null);
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg0;
        if (class477.field7003 < var5 + arg0) {
            var7 = class477.field7003 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        class529.field7806 = var6;
        class447.field6548 = class106.field1669 * 16 + (class207.field2981 ? 26 : 22);
        class314.field4487 = true;
        class365.field5484 = var3;
        class103.field1641 = var7;
    }
}
