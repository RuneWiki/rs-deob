import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class410 {

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "Lfda;")
    public static class294 field5938 = new class294(1);

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public int field5930;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public int field5932;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public int field5933;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public int field5934;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public int field5935;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public int field5936;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public int field5937;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public int field5939;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public int field5940;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public int field5942;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public int field5943;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public int field5944;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "Lpca;")
    public static class666 field5945;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "[I")
    public static int[] field5946;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
    public static void method2500(int arg0) {
        if (arg0 != 1) {
            method2500(-110);
        }
        field5938 = null;
        field5946 = null;
        field5945 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLn;Ljava/lang/String;I)Lkp;")
    public static final class456 method2501(byte arg0, class17 arg1, String arg2, int arg3) {
        field5941++;
        if (arg0 != 50) {
            return null;
        } else if (arg3 == 0) {
            return arg1.method409(arg2, (byte) 89);
        } else if (arg3 == 1) {
            try {
                class31.method506(new Object[] { (new URL(class416.field6017.getCodeBase(), arg2)).toString() }, "openjs", class416.field6017, -86);
                class456 var4 = new class456();
                var4.field6502 = 1;
                return var4;
            } catch (Throwable var10) {
                class456 var5 = new class456();
                var5.field6502 = 2;
                return var5;
            }
        } else if (arg3 == 2) {
            try {
                class416.field6017.getAppletContext().showDocument(new URL(class416.field6017.getCodeBase(), arg2), "_blank");
                class456 var6 = new class456();
                var6.field6502 = 1;
                return var6;
            } catch (Exception var11) {
                class456 var7 = new class456();
                var7.field6502 = 2;
                return var7;
            }
        } else if (arg3 == 3) {
            try {
                class31.method507(13009, "loggedout", class416.field6017);
            } catch (Throwable var13) {
            }
            try {
                class416.field6017.getAppletContext().showDocument(new URL(class416.field6017.getCodeBase(), arg2), "_top");
                class456 var8 = new class456();
                var8.field6502 = 1;
                return var8;
            } catch (Exception var12) {
                class456 var9 = new class456();
                var9.field6502 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILjava/lang/String;B)I")
    public static final int method2502(int arg0, String arg1, byte arg2) {
        if (arg2 != 40) {
            field5938 = null;
        }
        field5931++;
        return class685.method3854(arg0, arg1, true, (byte) -127);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILvj;)Z")
    public final boolean method2503(int arg0, class410 arg1) {
        field5929++;
        if (this.field5943 == arg1.field5943 && this.field5933 == arg1.field5933 && this.field5934 == arg1.field5934) {
            return true;
        } else {
            if (arg0 != 2) {
                field5945 = null;
            }
            return false;
        }
    }
}
