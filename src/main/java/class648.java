import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class648 {

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    private int field8733 = -1;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    private int field8736 = 0;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "Lqw;")
    private class84 field8739 = new class84();

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "Z")
    public boolean field8746 = false;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    private int field8742;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    private int field8737;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "[Lhaa;")
    private class89[] field8744;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "[[[I")
    private int[][][] field8743;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "Z")
    public static boolean field8735 = false;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field8734;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field8738;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field8740;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field8741;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field8747;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "[Ls;")
    public static class295[] field8748;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLmfa;)I")
    public static final int method3597(byte arg0, class641 arg1) {
        if (arg0 != 84) {
            method3603(-73, -128, true);
        }
        field8741++;
        String var2 = class624.method3444(arg1, -119);
        return class643.field8657.method3627(var2, class584.field7966, 31033);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V")
    public static final void method3598(int arg0, String arg1, int arg2, String arg3, int arg4, String arg5, int arg6, String arg7, String arg8) {
        field8740++;
        class696 var9 = class559.field7665[99];
        for (int var10 = 99; var10 > 0; var10--) {
            class559.field7665[var10] = class559.field7665[var10 - 1];
        }
        if (arg6 != -1) {
            method3598(2, null, -114, null, 48, null, 82, null, null);
        }
        if (var9 == null) {
            var9 = new class696(arg4, arg2, arg5, arg7, arg8, arg3, arg0, arg1);
        } else {
            var9.method3786(arg1, arg8, arg5, arg2, arg4, arg0, 23853, arg3, arg7);
        }
        class124.field1712 = class701.field9280;
        class559.field7665[0] = var9;
        class773.field10630++;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
    public static void method3599(int arg0) {
        if (arg0 != 0) {
            method3599(-119);
        }
        field8748 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method3600(byte arg0) {
        field8738++;
        if (this.field8742 != this.field8737) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field8737; var2++) {
            this.field8744[var2] = class250.field3486;
        }
        int var3 = -6 / ((arg0 + 71) / 34);
        return this.field8743;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V")
    public final void method3601(byte arg0) {
        for (int var2 = 0; var2 < this.field8737; var2++) {
            this.field8743[var2][0] = null;
            this.field8743[var2][1] = null;
            this.field8743[var2][2] = null;
            this.field8743[var2] = null;
        }
        field8745++;
        this.field8743 = null;
        this.field8744 = null;
        this.field8739.method690(arg0 + 20220);
        this.field8739 = null;
        if (arg0 != -86) {
            this.method3600((byte) 91);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method3602(int arg0, byte arg1) {
        if (arg1 != -74) {
            method3597((byte) 28, null);
        }
        field8734++;
        if (this.field8742 == this.field8737) {
            this.field8746 = this.field8744[arg0] == null;
            this.field8744[arg0] = class250.field3486;
            return this.field8743[arg0];
        } else if (this.field8737 == 1) {
            this.field8746 = this.field8733 != arg0;
            this.field8733 = arg0;
            return this.field8743[0];
        } else {
            class89 var3 = this.field8744[arg0];
            if (var3 == null) {
                this.field8746 = true;
                if (this.field8737 <= this.field8736) {
                    class89 var4 = (class89) this.field8739.method678(false);
                    var3 = new class89(arg0, var4.field1263);
                    this.field8744[var4.field1262] = null;
                    var4.method1102((byte) 95);
                } else {
                    var3 = new class89(arg0, this.field8736);
                    this.field8736++;
                }
                this.field8744[arg0] = var3;
            } else {
                this.field8746 = false;
            }
            this.field8739.method686(-1, var3);
            return this.field8743[var3.field1263];
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(III)V")
    public class648(int arg0, int arg1, int arg2) {
        this.field8742 = arg1;
        this.field8737 = arg0;
        this.field8744 = new class89[this.field8742];
        this.field8743 = new int[this.field8737][3][arg2];
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
    public static final String method3603(int arg0, int arg1, boolean arg2) {
        field8747++;
        if (arg2 && arg0 >= 0) {
            return arg1 >= -29 ? null : class34.method199(arg0, 10, arg2, (byte) -48);
        } else {
            return Integer.toString(arg0);
        }
    }
}
