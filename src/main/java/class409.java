import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class409 {

    @OriginalMember(owner = "client!ht", name = "q", descriptor = "B")
    public byte field5622 = 0;

    @OriginalMember(owner = "client!ht", name = "n", descriptor = "S")
    public short field5619;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "B")
    public byte field5608;

    @OriginalMember(owner = "client!ht", name = "o", descriptor = "B")
    public byte field5620;

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "S")
    public short field5615;

    @OriginalMember(owner = "client!ht", name = "l", descriptor = "[I")
    public static int[] field5617 = new int[1000];

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "B")
    public byte field5606;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "B")
    public byte field5609;

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "B")
    public byte field5610;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "B")
    public byte field5611;

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!ht", name = "t", descriptor = "Lvl;")
    public class11 field5625;

    @OriginalMember(owner = "client!ht", name = "w", descriptor = "Lvl;")
    public class11 field5628;

    @OriginalMember(owner = "client!ht", name = "y", descriptor = "Lkf;")
    public class165 field5630;

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "Lht;")
    public class409 field5612;

    @OriginalMember(owner = "client!ht", name = "r", descriptor = "Lpm;")
    public class411 field5623;

    @OriginalMember(owner = "client!ht", name = "m", descriptor = "Lpe;")
    public class431 field5618;

    @OriginalMember(owner = "client!ht", name = "s", descriptor = "Ljv;")
    public class55 field5624;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "Lgv;")
    public class56 field5607;

    @OriginalMember(owner = "client!ht", name = "v", descriptor = "Lgv;")
    public class56 field5627;

    @OriginalMember(owner = "client!ht", name = "p", descriptor = "S")
    public short field5621;

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "Z")
    public boolean field5614;

    @OriginalMember(owner = "client!ht", name = "u", descriptor = "Z")
    public boolean field5626;

    @OriginalMember(owner = "client!ht", name = "x", descriptor = "Z")
    public boolean field5629;

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(III)V", line = 2)
    public class409(int arg0, int arg1, int arg2) {
        this.field5619 = (short) arg1;
        this.field5620 = this.field5608 = (byte) arg0;
        this.field5615 = (short) arg2;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IILmd;)Ljava/lang/String;", line = 19)
    public static final String method2369(int arg0, int arg1, class379 arg2) {
        field5613++;
        try {
            int var3 = arg2.method2199((byte) 79);
            if (var3 > arg1) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field5173 += class226.field3055.method1188(var4, 0, var3, arg2.field5152, arg2.field5173, true);
            int var5 = 59 / ((arg0 - 45) / 55);
            return class315.method1824(var3, 0, (byte) -37, var4);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIII)Z", line = 57)
    public static final boolean method2370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class85.field1296[arg0][var8][var14] == -class39.field603) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class530.field7813) + 1;
            int var10 = (arg3 << class530.field7813) + 2;
            int var11 = class141.field2049[arg0].method272(arg1, arg3) + arg5;
            if (!class421.method2426(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class530.field7813) - 1;
            if (!class421.method2426(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class530.field7813) - 1;
            if (!class421.method2426(var9, var11, var13)) {
                return false;
            } else if (class421.method2426(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class92.method667(arg0, arg1, arg3)) {
            int var6 = arg1 << class530.field7813;
            int var7 = arg3 << class530.field7813;
            return class421.method2426(var6 + 1, class141.field2049[arg0].method272(arg1, arg3) + arg5, var7 + 1) && class421.method2426(class220.field2979 + var6 - 1, class141.field2049[arg0].method272(arg1 + 1, arg3) + arg5, var7 + 1) && class421.method2426(class220.field2979 + var6 - 1, class141.field2049[arg0].method272(arg1 + 1, arg3 + 1) + arg5, class220.field2979 + var7 - 1) && class421.method2426(var6 + 1, class141.field2049[arg0].method272(arg1, arg3 + 1) + arg5, class220.field2979 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)V", line = 119)
    public final void method2371(byte arg0) {
        while (this.field5630 != null) {
            class165 var2 = this.field5630.field2400;
            this.field5630.method1113((byte) -122);
            this.field5630 = var2;
        }
        if (arg0 >= -54) {
            this.field5609 = 39;
        }
        field5616++;
        this.field5622 = 0;
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(B)V", line = 145)
    public static void method2372(byte arg0) {
        field5617 = null;
        if (arg0 < 26) {
            field5617 = null;
        }
    }
}
