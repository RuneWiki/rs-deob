import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class442 extends class225 {

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "I")
    private int field6482;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "[I")
    public static int[] field6470 = new int[256];

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "Ljava/lang/String;")
    public static String field6475 = "Connection lost.";

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "Ljava/lang/String;")
    public static String field6481 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
    public static int field6473;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "I")
    public static int field6479;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "[I")
    public static int[] field6474;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "[Lsh;")
    public class340[] field6476;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "[[B")
    private byte[][] field6469;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "[[S")
    public static short[][] field6478;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)V")
    public static void method2781(int arg0) {
        int var1 = 81 % ((arg0 - 48) / 53);
        field6474 = null;
        field6470 = null;
        field6481 = null;
        field6475 = null;
        field6478 = null;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(BI)Z")
    public final boolean method2782(byte arg0, int arg1) {
        field6479++;
        return arg0 == 87 ? this.field6476[arg1].field4906 : false;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)Z")
    public final boolean method2783(int arg0, byte arg1) {
        if (arg1 != -83) {
            field6471 = 78;
        }
        field6473++;
        return this.field6476[arg0].field4898;
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V")
    public static final void method2784(int arg0) {
        field6480++;
        class15.field216.method1141(256);
        if (arg0 != 65280) {
            method2785(-0.6967724558650187D, true);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(DZ)V")
    public static final void method2785(double arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field6472++;
        if (class184.field2497 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
            field6470[var3] = var4 > 255 ? 255 : var4;
        }
        class184.field2497 = arg0;
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(B)Z")
    public final boolean method2786(byte arg0) {
        field6477++;
        if (this.field6476 != null) {
            return true;
        }
        if (this.field6469 == null) {
            if (!class126.field1766.method2255(this.field6482, (byte) -84)) {
                return false;
            }
            int[] var2 = class126.field1766.method2253(this.field6482, -127);
            this.field6469 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field6469[var3] = class126.field1766.method2261(var2[var3], this.field6482, 90);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field6469.length; var5++) {
            byte[] var15 = this.field6469[var5];
            int var16 = var15[1] & 0xFF | var15[0] & 0xFF << 8;
            var4 &= class388.field5602.method2257(true, var16);
        }
        if (!var4) {
            return false;
        }
        class47 var6 = new class47();
        int var7 = 101 / ((arg0 + 45) / 53);
        int var8 = class126.field1766.method2272(90, this.field6482);
        this.field6476 = new class340[var8];
        int[] var9 = class126.field1766.method2253(this.field6482, -128);
        for (int var10 = 0; var10 < var9.length; var10++) {
            byte[] var11 = this.field6469[var10];
            int var12 = var11[1] & 0xFF | var11[0] & 0xFF << 8;
            class448 var13 = null;
            for (class448 var14 = (class448) var6.method332(-2130841184); var14 != null; var14 = (class448) var6.method343((byte) -75)) {
                if (var14.field6572 == var12) {
                    var13 = var14;
                    break;
                }
            }
            if (var13 == null) {
                var13 = new class448(var12, class388.field5602.method2266((byte) 53, var12));
                var6.method330(var13, -2130841184);
            }
            this.field6476[var9[var10]] = new class340(var11, var13);
        }
        this.field6469 = null;
        return true;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(I)V")
    public class442(int arg0) {
        this.field6482 = arg0;
    }
}
