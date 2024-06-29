import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class274 {

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    private int field4709 = 0;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Z")
    public boolean field4711 = true;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public int field4717 = -1;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public int field4724 = 128;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Z")
    public static boolean field4719 = false;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "[I")
    public static int[] field4712 = new int[128];

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "Lok;")
    public static class146 field4721 = class235.method1724(-12908, "<img=0>");

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "[I")
    public static int[] field4723 = new int[100];

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public int field4714;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public int field4715;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public int field4716;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public int field4718;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Lih;")
    public static class30 field4725;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/lang/String;I)Lok;", line = 10)
    public static final class146 method1999(String arg0, int arg1) {
        field4720++;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg0.getBytes();
        }
        class146 var4 = new class146();
        var4.field2461 = 0;
        if (arg1 >= -125) {
            field4712 = (int[]) null;
        }
        var4.field2462 = var2;
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field2461++] = var2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)V", line = 51)
    public static final void method2000(int arg0, boolean arg1) {
        if (arg1) {
            method2000(32, true);
        }
        field4710++;
        if (class272.method1992(2306, arg0)) {
            class70.method521(-1, -1, class92.field1459[arg0]);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V", line = 74)
    public static void method2001(byte arg0) {
        int var1 = -102 / ((-arg0 - 46) / 56);
        field4725 = null;
        field4721 = null;
        field4712 = null;
        field4723 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILwe;I)V", line = 115)
    private final void method2002(int arg0, int arg1, class47 arg2, int arg3) {
        if (arg0 == 1) {
            this.field4709 = arg2.method389((byte) 102);
            this.method2004(this.field4709, -91);
        } else if (arg0 == 2) {
            this.field4717 = arg2.method379(-2);
            if (this.field4717 == 65535) {
                this.field4717 = -1;
            }
        } else if (arg0 == 3) {
            this.field4724 = arg2.method379(-2);
        } else if (arg0 == 4) {
            this.field4711 = false;
        }
        field4708++;
        if (arg1 < 24) {
            this.field4714 = -86;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lwe;II)V", line = 157)
    public final void method2003(class47 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method368(arg2 ^ 0xFFFFFF8A);
            if (var4 == 0) {
                field4722++;
                if (arg2 != 1) {
                    this.method2003((class47) null, 27, 85);
                }
                return;
            }
            this.method2002(var4, arg2 ^ 0x18, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V", line = 183)
    private final void method2004(int arg0, int arg1) {
        field4713++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = var3;
        if (var3 > var5) {
            var7 = var5;
        }
        double var9 = (double) (arg0 & 0xFF) / 256.0D;
        double var11 = var3;
        if (var9 < var7) {
            var7 = var9;
        }
        double var13 = 0.0D;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var11 < var9) {
            var11 = var9;
        }
        double var15 = 0.0D;
        if (arg1 > -81) {
            return;
        }
        double var17 = (var7 + var11) / 2.0D;
        if (var7 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var7) / (var7 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var7) / (2.0D - var11 - var7);
            }
            if (var3 == var11) {
                var13 = (var5 - var9) / (var11 - var7);
            } else if (var5 == var11) {
                var13 = (var9 - var3) / (var11 - var7) + 2.0D;
            } else if (var9 == var11) {
                var13 = (var3 - var5) / (var11 - var7) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        if (var17 > 0.5D) {
            this.field4716 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field4716 = (int) (var15 * var17 * 512.0D);
        }
        this.field4715 = (int) (var17 * 256.0D);
        this.field4718 = (int) (var15 * 256.0D);
        if (this.field4715 < 0) {
            this.field4715 = 0;
        } else if (this.field4715 > 255) {
            this.field4715 = 255;
        }
        if (this.field4718 < 0) {
            this.field4718 = 0;
        } else if (this.field4718 > 255) {
            this.field4718 = 255;
        }
        if (this.field4716 < 1) {
            this.field4716 = 1;
        }
        this.field4714 = (int) ((double) this.field4716 * var19);
    }
}
