import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public abstract class class271 implements class81 {

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "Llga;")
    private class47 field3837;

    @OriginalMember(owner = "client!vga", name = "l", descriptor = "Llga;")
    public class47 field3831;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "Lsq;")
    public class742 field3830;

    @OriginalMember(owner = "client!vga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3843 = new String[] { method2222(method2221("\u0013^8B\nM")), method2222(method2221("\u0013^8B\fM")), method2222(method2221("\u0013^8B\u0005M")), method2222(method2221("\u0013^8B\u000bM")), method2222(method2221("E\u0011")), method2222(method2221("\u0013^8B\u000eM")), method2222(method2221("\u001e\u0017wB=")), method2222(method2221("\u0013^8B|\fW0\u0018~M")), method2222(method2221("\u000bL5\u0000")), method2222(method2221("\u0013^8B\rM")), method2222(method2221("\u0013^8B\u0006M")) };

    @OriginalMember(owner = "client!vga", name = "i", descriptor = "Lsb;")
    public static class261 field3833 = new class261(23, 6);

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!vga", name = "g", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!vga", name = "j", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!vga", name = "k", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!vga", name = "h", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!vga", name = "d", descriptor = "I")
    private int field3839;

    @OriginalMember(owner = "client!vga", name = "f", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!vga", name = "m", descriptor = "J")
    private long field3841;

    @OriginalMember(owner = "client!vga", name = "e", descriptor = "Lda;")
    private class216 field3840;

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)Z", line = 6)
    public boolean method800(byte arg0) {
        try {
            if (arg0 > -2) {
                return false;
            }
            field3836++;
            boolean var2 = true;
            if (!this.field3831.method530(false, this.field3830.field10545)) {
                var2 = false;
            }
            if (!this.field3837.method530(false, this.field3830.field10545)) {
                var2 = false;
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3843[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(IZ)V", line = 29)
    public final void method801(int arg0, boolean arg1) {
        try {
            field3842++;
            int var3 = 64 % ((arg0 - 15) / 60);
            int var4 = this.field3830.field10540.method2058(this.field3830.field10543, class500.field7304, 0) + this.field3830.field10542;
            int var5 = this.field3830.field10539.method4767(23467, this.field3830.field10541, class791.field11507) + this.field3830.field10547;
            this.method550(var4, var5, (byte) -35, arg1);
            this.method549((byte) 67, var5, arg1, var4);
            String var6 = class298.field4155.method2226(20);
            if ((class614.method4531(-17) - this.field3841) > 10000L) {
                var6 = var6 + field3843[4] + class298.field4155.method2234((byte) -112).method5398(27577) + ")";
            }
            this.field3840.method1825(this.field3830.field10541 / 2 + (var5 + this.field3830.field10544 + 4), this.field3830.field10543 / 2 + var4, this.field3830.field10548, -1, (byte) -107, var6);
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field3843[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(Z)I", line = 55)
    public final int method2217(boolean arg0) {
        try {
            field3834++;
            if (arg0) {
                return 48;
            }
            int var2 = class298.field4155.method2232(-28);
            int var3 = var2 * 100;
            if (this.field3839 == var2 && var2 != 0) {
                int var4 = class298.field4155.method2223(false);
                if (var2 < var4) {
                    long var5 = this.field3841 - class298.field4155.method2231(0);
                    if (var5 > 0L) {
                        long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                        long var9 = (class614.method4531(-124) - this.field3841) * 10000L;
                        if (var7 <= var9) {
                            var3 = var4 * 100;
                        } else {
                            var3 = (int) ((long) (var4 - var2) * var9 * 100L / var7 + (long) (var2 * 100));
                        }
                    }
                }
            } else {
                this.field3839 = var2;
                this.field3841 = class614.method4531(-122);
            }
            return var3;
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field3843[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(I)V", line = 107)
    public static void method2218(int arg0) {
        try {
            if (arg0 != 10000) {
                field3833 = null;
            }
            field3833 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3843[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(DI)V", line = 117)
    public static final void method2219(double arg0, int arg1) {
        try {
            field3838++;
            class209.field3043.method733(class570.field8270);
            if (arg1 == -8546) {
                class209.field3043.method721(0, 0, (int) arg0);
                class349.field5060.method204(class209.field3043);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3843[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "(I)V", line = 137)
    public static final void method2220(int arg0) {
        try {
            field3832++;
            if (!class319.field4359) {
                class319.field4359 = true;
                if (arg0 == 0) {
                    class669.field9440 = true;
                    class292.field4112 += (24.0F - class292.field4112) / 2.0F;
                }
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3843[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Llga;Llga;Lsq;)V", line = 153)
    public class271(class47 arg0, class47 arg1, class742 arg2) {
        try {
            this.field3837 = arg1;
            this.field3831 = arg0;
            this.field3830 = arg2;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3843[7] + (arg0 == null ? field3843[8] : field3843[6]) + ',' + (arg1 == null ? field3843[8] : field3843[6]) + ',' + (arg2 == null ? field3843[8] : field3843[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V", line = 164)
    public void method802(int arg0) {
        try {
            field3835++;
            class161 var2 = class692.method4940(this.field3830.field10545, this.field3837, 3);
            int var3 = -113 / ((arg0 - 38) / 41);
            this.field3840 = class236.field3418.method145(var2, class66.method702(this.field3831, this.field3830.field10545), true);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3843[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(IIBZ)V")
    public abstract void method550(int arg0, int arg1, byte arg2, boolean arg3);

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(BIZI)V")
    public abstract void method549(byte arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!vga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2221(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x40);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2222(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 101;
                    break;
                case 1:
                    var10005 = 57;
                    break;
                case 2:
                    var10005 = 89;
                    break;
                case 3:
                    var10005 = 108;
                    break;
                default:
                    var10005 = 64;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
