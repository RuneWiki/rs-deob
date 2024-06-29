import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class67 {

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Ln;")
    public static class282 field1056 = new class282(500);

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field1059 = -1;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Lfd;")
    public static class242 field1054;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Lbe;")
    public static class297 field1058;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "[S")
    public static short[] field1053;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lna;BZ)V", line = 32)
    public static final void method497(class26 arg0, byte arg1, boolean arg2) {
        if (arg1 < 124) {
            field1056 = (class282) null;
        }
        field1051++;
        if (!arg2) {
            try {
                class56.field919.getAppletContext().showDocument(arg0.method178(class56.field919.getCodeBase(), true), "_top");
            } catch (Exception var7) {
            }
            return;
        }
        if (class255.field4184 && class120.field1869) {
            try {
                class227.method1518(class45.field712.field2431, "openjs", new Object[] { arg0.method178(class56.field919.getCodeBase(), true).toString() }, (byte) 117);
                return;
            } catch (Throwable var8) {
            }
        }
        try {
            class56.field919.getAppletContext().showDocument(arg0.method178(class56.field919.getCodeBase(), true), "_blank");
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIILll;)Ljava/awt/Frame;", line = 74)
    public static final Frame method498(int arg0, int arg1, int arg2, int arg3, int arg4, class156 arg5) {
        field1057++;
        if (!arg5.method1066(false)) {
            return null;
        }
        if (arg2 == 0) {
            class25[] var6 = class103.method743(10, arg5);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field367 == arg4 && var6[var8].field369 == arg3 && (arg1 == 0 || var6[var8].field368 == arg1) && (!var7 || var6[var8].field370 > arg2)) {
                    arg2 = var6[var8].field370;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class180 var9 = arg5.method1060(arg1, arg2, arg3, arg4, -121);
        while (var9.field2811 == 0) {
            class126.method862(10L, 64);
        }
        Frame var10 = (Frame) var9.field2812;
        if (var10 == null) {
            return null;
        } else if (var9.field2811 == arg0) {
            class304.method2135(var10, true, arg5);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 141)
    public static void method499(int arg0) {
        if (arg0 <= -106) {
            field1053 = null;
            field1058 = null;
            field1056 = null;
            field1054 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[BB)I", line = 167)
    public static final int method500(int arg0, int arg1, byte[] arg2, byte arg3) {
        field1052++;
        int var4 = -1;
        int var5 = -16 % ((arg3 - 61) / 57);
        for (int var6 = arg0; var6 < arg1; var6++) {
            var4 = var4 >>> 8 ^ class260.field4247[(var4 ^ arg2[var6]) & 0xFF];
        }
        return ~var4;
    }
}
