import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class365 {

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
    private int field5065 = 0;

    @OriginalMember(owner = "client!hca", name = "f", descriptor = "I")
    private int field5067 = -1;

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "Lau;")
    private class692 field5071 = new class692();

    @OriginalMember(owner = "client!hca", name = "n", descriptor = "Z")
    public boolean field5075 = false;

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "I")
    private int field5066;

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "I")
    private int field5069;

    @OriginalMember(owner = "client!hca", name = "m", descriptor = "[Ltl;")
    private class122[] field5074;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "[[I")
    private int[][] field5063;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V")
    public final void method2188(int arg0) {
        for (int var2 = arg0; var2 < this.field5069; var2++) {
            this.field5063[var2] = null;
        }
        field5068++;
        this.field5074 = null;
        this.field5063 = null;
        this.field5071.method3896(3);
        this.field5071 = null;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2189(int arg0, byte arg1, int arg2) {
        if (arg1 == -27) {
            field5073++;
            return (arg2 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method2190(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5064++;
        if (!class155.field2557) {
            return false;
        } else if (class495.field7220 < 100) {
            return false;
        } else if (class118.method952(arg2, arg1, true, arg3)) {
            int var5 = arg1 << class49.field637;
            int var6 = arg3 << class49.field637;
            if (class623.method3516(arg4, 53, class457.field6576, var6, class687.field9745[arg2].method3858(arg3, arg1, (byte) 52), class457.field6576, var5)) {
                class78.field1197++;
                return true;
            } else {
                if (arg0 >= -101) {
                    method2190(-128, 31, 77, -43, -124);
                }
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)V")
    public static final void method2191(String arg0, boolean arg1, String arg2, int arg3) {
        class70.field1107 = arg3;
        field5070++;
        class133.field2155 = 2;
        class218.method1466(arg1, arg2, (byte) -74, arg0);
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)[[I")
    public final int[][] method2192(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field5072++;
        if (this.field5069 != this.field5066) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field5069; var2++) {
            this.field5074[var2] = class418.field5946;
        }
        return this.field5063;
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)[I")
    public final int[] method2193(int arg0, int arg1) {
        if (arg0 != 1269) {
            this.field5066 = 103;
        }
        field5062++;
        if (this.field5069 == this.field5066) {
            this.field5075 = this.field5074[arg1] == null;
            this.field5074[arg1] = class418.field5946;
            return this.field5063[arg1];
        } else if (this.field5069 == 1) {
            this.field5075 = this.field5067 != arg1;
            this.field5067 = arg1;
            return this.field5063[0];
        } else {
            class122 var3 = this.field5074[arg1];
            if (var3 == null) {
                this.field5075 = true;
                if (this.field5069 <= this.field5065) {
                    class122 var4 = (class122) this.field5071.method3895(true);
                    var3 = new class122(arg1, var4.field1991);
                    this.field5074[var4.field1990] = null;
                    var4.method2549((byte) 57);
                } else {
                    var3 = new class122(arg1, this.field5065);
                    this.field5065++;
                }
                this.field5074[arg1] = var3;
            } else {
                this.field5075 = false;
            }
            this.field5071.method3902(var3, 0);
            return this.field5063[var3.field1991];
        }
    }

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(III)V")
    public class365(int arg0, int arg1, int arg2) {
        this.field5066 = arg1;
        this.field5069 = arg0;
        this.field5074 = new class122[this.field5066];
        this.field5063 = new int[this.field5069][arg2];
    }
}
