import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class40 {

    @OriginalMember(owner = "client!bt", name = "s", descriptor = "B")
    public byte field672;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "Lnea;")
    public static class664 field655 = new class664(2, 5);

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
    public static int field657 = 0;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!bt", name = "r", descriptor = "Lfv;")
    public class106 field671;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "Lfea;")
    public class126 field662;

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "Lfea;")
    public class126 field665;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "Lkg;")
    public class244 field658;

    @OriginalMember(owner = "client!bt", name = "p", descriptor = "Lkg;")
    public class244 field669;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "Lbt;")
    public class40 field668;

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "Lsj;")
    public class423 field664;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "Lsw;")
    public class701 field663;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bt", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field673;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "S")
    public short field660;

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "S")
    public short field666;

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "S")
    public short field667;

    @OriginalMember(owner = "client!bt", name = "q", descriptor = "S")
    public short field670;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method458(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(I)V", line = 10)
    public class40(int arg0) {
        this.field672 = (byte) arg0;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V", line = 20)
    public final void method453(int arg0) {
        if (arg0 > -73) {
            method456(123);
        }
        field654++;
        while (this.field671 != null) {
            class106 var2 = this.field671.field1641;
            this.field671.method843(500);
            this.field671 = var2;
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLjava/lang/String;)I", line = 45)
    public static final int method454(byte arg0, String arg1) {
        if (arg0 != -127) {
            field657 = 85;
        }
        field656++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class520.method2966(arg1.charAt(var4), 20965) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IILft;Lmo;)V", line = 68)
    public static final void method455(int arg0, int arg1, class4 arg2, class695 arg3) {
        field661++;
        class689 var4 = new class689();
        var4.field9702 = arg3.method3826(false);
        var4.field9698 = arg3.method3880(8);
        if (arg0 < 94) {
            field657 = 4;
        }
        var4.field9695 = new int[var4.field9702];
        var4.field9700 = new int[var4.field9702];
        var4.field9701 = new class494[var4.field9702];
        var4.field9697 = new class494[var4.field9702];
        var4.field9692 = new int[var4.field9702];
        var4.field9696 = new byte[var4.field9702][][];
        for (int var5 = 0; var5 < var4.field9702; var5++) {
            try {
                int var6 = arg3.method3826(false);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg3.method3836(false);
                    String var18 = arg3.method3836(false);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method3880(8);
                    }
                    var4.field9692[var5] = var6;
                    var4.field9695[var5] = var19;
                    var4.field9701[var5] = arg2.method27(var18, -109, class99.method806(-1, var17));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg3.method3836(false);
                    String var8 = arg3.method3836(false);
                    int var9 = arg3.method3826(false);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg3.method3836(false);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method3880(8);
                            var12[var13] = new byte[var14];
                            arg3.method3876((byte) 127, var12[var13], 0, var14);
                        }
                    }
                    var4.field9692[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class99.method806(-1, var10[var16]);
                    }
                    var4.field9697[var5] = arg2.method26(var8, -24, var15, class99.method806(-1, var7));
                    var4.field9696[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field9700[var5] = -1;
            } catch (SecurityException var21) {
                var4.field9700[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field9700[var5] = -3;
            } catch (Exception var23) {
                var4.field9700[var5] = -4;
            } catch (Throwable var24) {
                var4.field9700[var5] = -5;
            }
        }
        class394.field5849.method474(var4, 6);
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V", line = 185)
    public static final void method456(int arg0) {
        if (arg0 > -86) {
            return;
        }
        field659++;
        try {
            Method var1 = (field673 == null ? (field673 = method458("java.lang.Runtime")) : field673).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class187.field2693 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)V", line = 214)
    public static void method457(byte arg0) {
        field655 = null;
        if (arg0 >= -70) {
            method455(-101, 46, null, null);
        }
    }
}
