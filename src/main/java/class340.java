import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class340 {

    @OriginalMember(owner = "client!im", name = "e", descriptor = "J")
    public static long field5260 = 0L;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BLtm;)V", line = 3)
    public static final void method2233(byte arg0, class219 arg1) {
        if (arg0 != -26) {
            method2233((byte) 61, (class219) null);
        }
        field5259++;
        class58 var2 = (class58) class126.field1939.method1770(arg0 ^ 0x376, (long) arg1.field1868);
        if (var2 == null) {
            return;
        }
        if (var2.field753 != null) {
            class82.field1025.method2479(var2.field753);
            var2.field753 = null;
        }
        var2.method1120(-93);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/String;IILap;)Lvd;", line = 30)
    public static final class26 method2234(String arg0, int arg1, int arg2, class279 arg3) {
        field5256++;
        if (arg1 == 0) {
            return arg3.method1892(0, arg0);
        } else if (arg1 == 1) {
            try {
                class169.method1179(arg3.field4464, "openjs", new Object[] { (new URL(arg3.field4464.getCodeBase(), arg0)).toString() }, (byte) -86);
                class26 var4 = new class26();
                var4.field304 = 1;
                return var4;
            } catch (Throwable var10) {
                class26 var5 = new class26();
                var5.field304 = 2;
                return var5;
            }
        } else if (arg1 == 2) {
            try {
                arg3.field4464.getAppletContext().showDocument(new URL(arg3.field4464.getCodeBase(), arg0), "_blank");
                class26 var6 = new class26();
                var6.field304 = 1;
                return var6;
            } catch (Exception var11) {
                class26 var7 = new class26();
                var7.field304 = 2;
                return var7;
            }
        } else if (arg2 != 26153) {
            return null;
        } else if (arg1 == 3) {
            try {
                class169.method1180(arg3.field4464, "loggedout", false);
            } catch (Throwable var13) {
            }
            try {
                arg3.field4464.getAppletContext().showDocument(new URL(arg3.field4464.getCodeBase(), arg0), "_top");
                class26 var8 = new class26();
                var8.field304 = 1;
                return var8;
            } catch (Exception var12) {
                class26 var9 = new class26();
                var9.field304 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)Ljava/lang/String;", line = 117)
    public static final String method2235(int arg0, int arg1) {
        field5257++;
        return arg1 > -9 ? null : (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + ((arg0 & 0xFF1C) >> 8) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V", line = 128)
    public static final void method2236(byte arg0) {
        if (arg0 >= -9) {
            method2235(-56, 123);
        }
        field5258++;
        class51.field625.method336(-110);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ID)V", line = 145)
    public static final void method2237(int arg0, double arg1) {
        field5261++;
        int var3 = 96 % ((arg0 - 24) / 42);
        if (class427.field6295 == arg1) {
            return;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = (int) (Math.pow((double) var4 / 255.0D, arg1) * 255.0D);
            class392.field5894[var4] = var5 <= 255 ? var5 : 255;
        }
        class427.field6295 = arg1;
    }
}
