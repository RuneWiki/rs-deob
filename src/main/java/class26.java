import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class26 extends class285 {

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "I")
    private int field366 = 1365;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    private int field359 = 0;

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "I")
    private int field367 = 0;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "I")
    private int field365 = 20;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "[I")
    public static int[] field360 = new int[128];

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!ae", name = "ab", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "Lbf;")
    public static class58 field361;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)V", line = 6)
    public static final void method149(int arg0, int arg1, int arg2, int arg3) {
        class115.method793(false, (byte) -34);
        class105.field1546 = arg0;
        if (arg3 != 29681) {
            field360 = (int[]) null;
        }
        class333.field5191 = arg1;
        class36.method195(arg2, 10667);
        field364++;
    }

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "(I)V", line = 21)
    public static void method150(int arg0) {
        if (arg0 >= -37) {
            method149(12, -105, 107, -109);
        }
        field361 = null;
        field360 = null;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V", line = 38)
    public class26() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLak;ILak;I)Lq;", line = 44)
    public static final class345 method151(boolean arg0, class172 arg1, int arg2, class172 arg3, int arg4) {
        field363++;
        if (class55.method353(arg1, arg2, (byte) -5, arg4)) {
            if (!arg0) {
                field360 = (int[]) null;
            }
            return class126.method916(arg3.method1287(arg4, arg2, -1), -3815);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V", line = 58)
    public static final void method152(Throwable arg0, String arg1, int arg2) {
        field356++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class295.method2111(arg0, 18204);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class196.method1442((byte) 122, var3);
            String var4 = class84.method569("%3a", (byte) -73, ":", var3);
            String var5 = class84.method569("%40", (byte) -73, "@", var4);
            String var6 = class84.method569("%26", (byte) -73, "&", var5);
            String var7 = class84.method569("%23", (byte) -73, "#", var6);
            if (class175.field2899.field1951 == null) {
                return;
            }
            if (arg2 >= -23) {
                return;
            }
            class161 var8 = class175.field2899.method896(true, new URL(class175.field2899.field1951.getCodeBase(), "clienterror.ws?c=" + class286.field4582 + "&u=" + class99.field1451 + "&v1=" + class124.field1947 + "&v2=" + class124.field1930 + "&e=" + var7));
            while (var8.field2661 == 0) {
                class121.method867((byte) 84, 1L);
            }
            if (var8.field2661 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field2664;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)I", line = 116)
    public static final int method153(int arg0, int arg1) {
        field368++;
        if (arg0 > 0) {
            return 1;
        } else {
            if (arg1 != 28865) {
                field360 = (int[]) null;
            }
            return arg0 < 0 ? -1 : 0;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLjj;I)V", line = 160)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        if (arg2 == 0) {
            this.field366 = arg1.method271(21081);
        } else if (arg2 == 1) {
            this.field365 = arg1.method271(21081);
        } else if (arg2 == 2) {
            this.field359 = arg1.method271(21081);
        } else if (arg2 == 3) {
            this.field367 = arg1.method271(21081);
        }
        if (!arg0) {
            field361 = (class58) null;
        }
        field362++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)[I", line = 202)
    public final int[] method60(boolean arg0, int arg1) {
        int[] var3 = this.field4573.method1116(108, arg1);
        if (this.field4573.field2420) {
            for (int var4 = 0; var4 < class287.field4599; var4++) {
                int var5 = (class48.field669[var4] << 12) / this.field366 + this.field359;
                int var6 = (class27.field382[arg1] << 12) / this.field366 + this.field367;
                int var7 = var6;
                int var8 = var5;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && this.field365 > var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var7;
                    var13++;
                    var9 = var8 + var11 - var12;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = var13 >= (this.field365 - 1) ? 0 : (var13 << 12) / this.field365;
            }
        }
        if (arg0) {
            field358++;
            return var3;
        } else {
            return (int[]) null;
        }
    }
}
