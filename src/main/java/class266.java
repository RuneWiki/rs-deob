import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class266 {

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public int field3937 = 8;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    public int field3941 = 16777215;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "Lfi;")
    public static class8 field3944 = new class8();

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "[I")
    public static int[] field3949 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "[I")
    public static int[] field3952 = new int[13];

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
    public int field3940;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public int field3942;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
    public int field3945;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
    public int field3947;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
    public int field3951;

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "Lir;")
    public static class185 field3948;

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "Lir;")
    public static class185 field3954;

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "Z")
    public boolean field3953;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "[Lda;")
    public static class193[] field3950;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)Lbd;")
    public static final class27 method1778(byte arg0) {
        field3943++;
        if (arg0 >= -34) {
            return null;
        } else if (class200.field2763 == null || class36.field555 == null) {
            return null;
        } else {
            class36.field555.method2301(class200.field2763, (byte) -92);
            class27 var1 = (class27) class36.field555.method2306(-101);
            if (var1 == null) {
                return null;
            } else {
                class170 var2 = class174.method1160(-28930, var1.field462);
                return var2 != null && var2.field2330 && var2.method1138(-4123) ? var1 : class164.method1110(-24377);
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lfb;II)V")
    public final void method1779(class341 arg0, int arg1, int arg2) {
        if (arg2 != 39) {
            field3949 = null;
        }
        field3946++;
        while (true) {
            int var4 = arg0.method2233((byte) 104);
            if (var4 == 0) {
                return;
            }
            this.method1782(arg1, arg0, arg2 - 43, var4);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method1780(int arg0, String arg1, Throwable arg2) {
        if (arg0 != 1) {
            method1783(-33);
        }
        field3938++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class447.method2772(arg2, 1);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class236.method1531(var3, -124);
            String var4 = class350.method2315((byte) -126, ":", var3, "%3a");
            String var5 = class350.method2315((byte) -126, "@", var4, "%40");
            String var6 = class350.method2315((byte) -126, "&", var5, "%26");
            String var7 = class350.method2315((byte) -126, "#", var6, "%23");
            if (class280.field4126.field5381 != null) {
                class225 var8 = class280.field4126.method2399(new URL(class280.field4126.field5381.getCodeBase(), "clienterror.ws?c=" + class342.field5104 + "&u=" + class39.field595 + "&v1=" + class364.field5386 + "&v2=" + class364.field5376 + "&e=" + var7), 10000);
                while (var8.field3104 == 0) {
                    class31.method245(1L, 72);
                }
                if (var8.field3104 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field3105;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)I")
    public static final int method1781(int arg0, int arg1) {
        field3955++;
        return arg0 > -126 ? -7 : arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILfb;II)V")
    private final void method1782(int arg0, class341 arg1, int arg2, int arg3) {
        if (arg2 != -4) {
            this.field3942 = -115;
        }
        if (arg3 == 1) {
            this.field3937 = arg1.method2239(arg2 ^ 0x4025EF74);
        } else if (arg3 == 2) {
            this.field3953 = true;
        } else if (arg3 == 3) {
            this.field3947 = arg1.method2212(-2);
            this.field3942 = arg1.method2212(-2);
            this.field3940 = arg1.method2212(-2);
        } else if (arg3 == 4) {
            this.field3951 = arg1.method2233((byte) 104);
        } else if (arg3 == 5) {
            this.field3945 = arg1.method2239(-1076227960);
        } else if (arg3 == 6) {
            this.field3941 = arg1.method2249(32767);
        }
        field3939++;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
    public static void method1783(int arg0) {
        field3954 = null;
        field3944 = null;
        if (arg0 != 0) {
            method1781(88, -1);
        }
        field3949 = null;
        field3950 = null;
        field3948 = null;
        field3952 = null;
    }
}
