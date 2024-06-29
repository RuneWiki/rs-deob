import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class504 extends class499 {

    @OriginalMember(owner = "client!dr", name = "C", descriptor = "I")
    private int field6940;

    @OriginalMember(owner = "client!dr", name = "y", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!dr", name = "z", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!dr", name = "A", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!dr", name = "D", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!dr", name = "G", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!dr", name = "H", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!dr", name = "E", descriptor = "[Lpf;")
    public class410[] field6942;

    @OriginalMember(owner = "client!dr", name = "B", descriptor = "[[B")
    private byte[][] field6939;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIILjava/lang/Class;)Ldm;", line = 4)
    public static final class37 method2874(int arg0, int arg1, int arg2, Class arg3) {
        class409 var4 = class497.field6886[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class165 var5 = var4.field5630; var5 != null; var5 = var5.field2400) {
            class37 var6 = var5.field2402;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field581 == arg1 && var6.field587 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)Z", line = 33)
    public final boolean method2875(int arg0) {
        field6936++;
        if (this.field6942 != null) {
            return true;
        }
        if (this.field6939 == null) {
            if (!class326.field4288.method2712(this.field6940, arg0 - 110)) {
                return false;
            }
            int[] var2 = class326.field4288.method2719(this.field6940, (byte) -79);
            this.field6939 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field6939[var3] = class326.field4288.method2708(this.field6940, var2[var3], (byte) 54);
            }
        }
        boolean var4 = true;
        if (arg0 != 110) {
            this.field6942 = null;
        }
        for (int var5 = 0; var5 < this.field6939.length; var5++) {
            byte[] var14 = this.field6939[var5];
            int var15 = var14[1] & 0xFF | var14[0] & 0xFF << 8;
            var4 &= class59.field920.method2721(var15, (byte) 126);
        }
        if (!var4) {
            return false;
        }
        class280 var6 = new class280();
        int var7 = class326.field4288.method2710(this.field6940, (byte) -114);
        this.field6942 = new class410[var7];
        int[] var8 = class326.field4288.method2719(this.field6940, (byte) -79);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field6939[var9];
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            class426 var12 = null;
            for (class426 var13 = (class426) var6.method1672((byte) -96); var13 != null; var13 = (class426) var6.method1668(-1)) {
                if (var13.field5819 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class426(var11, class59.field920.method2707(var11, 0));
                var6.method1666((byte) -106, var12);
            }
            this.field6942[var8[var9]] = new class410(var10, var12);
        }
        this.field6939 = null;
        return true;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BI)Z", line = 130)
    public final boolean method2876(byte arg0, int arg1) {
        if (arg0 != -120) {
            this.method2875(-77);
        }
        field6937++;
        return this.field6942[arg1].field5636;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILit;IIIIZ)V", line = 141)
    public static final void method2877(int arg0, class455 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class435.method2505(arg1.field574, arg2, arg5, (byte) -95, arg1.field573, arg1.field584, 0, arg0, arg4, arg3);
        if (arg6) {
            method2877(45, null, 46, -89, 117, 78, false);
        }
        field6938++;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)Z", line = 152)
    public final boolean method2878(int arg0, int arg1) {
        if (arg0 != 20411) {
            this.field6940 = -24;
        }
        field6943++;
        return this.field6942[arg1].field5639;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V", line = 166)
    public static final void method2879(Throwable arg0, String arg1, int arg2) {
        field6941++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class30.method250(3030, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class515.method3035((byte) -83, var3);
            String var4 = class448.method2569(":", "%3a", arg2 ^ arg2, var3);
            String var5 = class448.method2569("@", "%40", 0, var4);
            String var6 = class448.method2569("&", "%26", arg2 + 19638, var5);
            String var7 = class448.method2569("#", "%23", 0, var6);
            if (class253.field3359.field2917 != null) {
                class446 var8 = class253.field3359.method1367(new URL(class253.field3359.field2917.getCodeBase(), "clienterror.ws?c=" + class423.field5794 + "&u=" + class428.field5859 + "&v1=" + class216.field2910 + "&v2=" + class216.field2918 + "&e=" + var7), 0);
                while (var8.field6100 == 0) {
                    class94.method674(1L, 1);
                }
                if (var8.field6100 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field6104;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(BI)Z", line = 214)
    public final boolean method2880(byte arg0, int arg1) {
        field6944++;
        if (arg0 != 69) {
            this.field6940 = -76;
        }
        return this.field6942[arg1].field5632;
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(I)V", line = 227)
    public class504(int arg0) {
        this.field6940 = arg0;
    }
}
