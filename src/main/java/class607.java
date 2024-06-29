import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class607 {

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "[I")
    public int[] field8211;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "[I")
    public static int[] field8214 = new int[1];

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field8208;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field8209;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field8210;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field8212;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field8213;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static final void method3378(byte arg0) {
        class183.method1237(8390);
        field8213++;
        if (arg0 < 14) {
            field8214 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;Z)V")
    public static final void method3379(String arg0, Throwable arg1, boolean arg2) {
        field8208++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class404.method2445(arg1, 31660);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class408.method2451(var3, 125);
            String var4 = class640.method3522("%3a", ":", (byte) 22, var3);
            String var5 = class640.method3522("%40", "@", (byte) 22, var4);
            String var6 = class640.method3522("%26", "&", (byte) 22, var5);
            String var7 = class640.method3522("%23", "#", (byte) 22, var6);
            if (class21.field194 != null) {
                class621 var8 = class58.field762.method1546(17, new URL(class21.field194.getCodeBase(), "clienterror.ws?c=" + class115.field1559 + "&u=" + (class399.field5717 == null ? String.valueOf(class782.field10744) : class399.field5717) + "&v1=" + class248.field3246 + "&v2=" + class248.field3250 + "&e=" + var7));
                while (var8.field8405 == 0) {
                    class171.method1152(1L, false);
                }
                if (var8.field8405 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field8403;
                    var9.read();
                    var9.close();
                }
                if (!arg2) {
                    method3382(-77);
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BIII)I")
    public static final int method3380(byte arg0, int arg1, int arg2, int arg3) {
        field8212++;
        if (arg0 != 77) {
            return -55;
        }
        int var4 = arg3 / arg2;
        int var5 = arg2 - 1 & arg3;
        int var6 = arg1 / arg2;
        int var7 = arg1 & arg2 - 1;
        int var8 = class73.method598(var4, -125, var6);
        int var9 = class73.method598(var4 + 1, -128, var6);
        int var10 = class73.method598(var4, arg0 ^ 0xFFFFFFC5, var6 + 1);
        int var11 = class73.method598(var4 + 1, arg0 + -195, var6 + 1);
        int var12 = class356.method2262(var9, arg2, arg0 ^ 0xFFFF8451, var5, var8);
        int var13 = class356.method2262(var11, arg2, -31716, var5, var10);
        return class356.method2262(var13, arg2, -31716, var7, var12);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLdt;)V")
    private final void method3381(boolean arg0, class254 arg1) {
        while (true) {
            int var3 = arg1.method1731((byte) 64);
            if (var3 == 0) {
                field8209++;
                if (arg0) {
                    field8210 = 17;
                    return;
                }
                return;
            }
            if (var3 == 1) {
                int var4 = arg1.method1731((byte) 64);
                this.field8211 = new int[var4];
                for (int var5 = 0; var5 < this.field8211.length; var5++) {
                    this.field8211[var5] = arg1.method1731((byte) 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method3382(int arg0) {
        if (arg0 <= -34) {
            field8214 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Luq;)V")
    public class607(class172 arg0) {
        byte[] var2 = arg0.method1176(6, 80);
        this.method3381(false, new class254(var2));
        if (this.field8211 == null) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    protected class607() {
        this.field8211 = new int[0];
    }
}
