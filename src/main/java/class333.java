import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class333 {

    @OriginalMember(owner = "client!gga", name = "f", descriptor = "I")
    public static int field4178 = 0;

    @OriginalMember(owner = "client!gga", name = "j", descriptor = "D")
    public static double field4182 = -1.0D;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!gga", name = "e", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!gga", name = "g", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!gga", name = "d", descriptor = "J")
    public long field4176;

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "Lgga;")
    public class333 field4174;

    @OriginalMember(owner = "client!gga", name = "i", descriptor = "Lgga;")
    public class333 field4181;

    @OriginalMember(owner = "client!gga", name = "h", descriptor = "[[I")
    public static int[][] field4180;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(II)I")
    public static final int method1921(int arg0, int arg1) {
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        field4177++;
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCD) >>> 2);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        if (arg0 != -689981592) {
            field4180 = null;
        }
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!gga", name = "d", descriptor = "(I)V")
    public final void method1922(int arg0) {
        field4173++;
        if (this.field4174 == null) {
            return;
        }
        this.field4174.field4181 = this.field4181;
        this.field4181.field4174 = this.field4174;
        this.field4181 = null;
        this.field4174 = null;
        if (arg0 < 71) {
            method1924((byte) 18);
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Ljava/lang/Throwable;ZLjava/lang/String;)V")
    public static final void method1923(Throwable arg0, boolean arg1, String arg2) {
        field4175++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class342.method1977(arg0, 106);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class306.method1765(arg1, var3);
            String var4 = class393.method2231(77, "%3a", ":", var3);
            String var5 = class393.method2231(121, "%40", "@", var4);
            String var6 = class393.method2231(74, "%26", "&", var5);
            String var7 = class393.method2231(118, "%23", "#", var6);
            if (class205.field2428 != null) {
                class88 var8 = class334.field4184.method2681((byte) 8, new URL(class205.field2428.getCodeBase(), "clienterror.ws?c=" + class106.field1139 + "&u=" + class94.field962 + "&v1=" + class464.field6613 + "&v2=" + class464.field6615 + "&e=" + var7));
                while (var8.field884 == 0) {
                    class452.method2602(1L, (byte) -97);
                }
                if (var8.field884 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field886;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "(B)V")
    public static void method1924(byte arg0) {
        int var1 = -68 / ((arg0 + 13) / 62);
        field4180 = null;
    }

    @OriginalMember(owner = "client!gga", name = "e", descriptor = "(I)Z")
    public final boolean method1925(int arg0) {
        if (arg0 != 14325) {
            this.field4176 = -113L;
        }
        field4179++;
        return this.field4174 != null;
    }
}
