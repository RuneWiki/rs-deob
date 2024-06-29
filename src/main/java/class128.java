import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class128 {

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "Leda;")
    private class14 field1995 = new class14(64);

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "Lla;")
    private class422 field1994;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "Lla;")
    public class422 field1997;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "[I")
    public static int[] field1990 = new int[13];

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "([BIII[[B[I[[B[I)I", line = 7)
    public static final int method990(byte[] arg0, int arg1, int arg2, int arg3, byte[][] arg4, int[] arg5, byte[][] arg6, int[] arg7) {
        field1991++;
        int var8 = arg7[arg1];
        int var9 = arg5[arg1] + var8;
        int var10 = arg7[arg3];
        int var11 = arg5[arg3] + var10;
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg0[arg1] & 0xFF;
        if (var14 > (arg2 & arg0[arg3])) {
            var14 = arg0[arg3] & 0xFF;
        }
        byte[] var15 = arg4[arg1];
        byte[] var16 = arg6[arg3];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var15[var17++] + var16[var18++];
            if (var14 > var20) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V", line = 68)
    public static void method991(byte arg0) {
        if (arg0 <= 10) {
            field1990 = null;
        }
        field1990 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BI)Lgi;", line = 79)
    public final class120 method992(byte arg0, int arg1) {
        field1996++;
        class14 var3 = this.field1995;
        class120 var4;
        synchronized (this.field1995) {
            var4 = (class120) this.field1995.method80((byte) -111, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class422 var5 = this.field1994;
        byte[] var6;
        synchronized (this.field1994) {
            var6 = this.field1994.method2624(0, 3, arg1);
            if (arg0 != -93) {
                this.method993(-113, 103);
            }
        }
        class120 var7 = new class120();
        var7.field1842 = this;
        if (var6 != null) {
            var7.method947(new class301(var6), -1);
        }
        class14 var8 = this.field1995;
        synchronized (this.field1995) {
            this.field1995.method67((long) arg1, var7, arg0 - 6679);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)V", line = 116)
    public final void method993(int arg0, int arg1) {
        class14 var3 = this.field1995;
        synchronized (this.field1995) {
            this.field1995.method68(-16878, arg1);
        }
        if (arg0 <= 96) {
            this.field1997 = null;
        }
        field1992++;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)V", line = 131)
    public final void method994(boolean arg0) {
        field1993++;
        class14 var2 = this.field1995;
        synchronized (this.field1995) {
            this.field1995.method76(-105);
        }
        if (arg0) {
            this.method992((byte) -61, -26);
        }
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lcr;ILla;Lla;)V", line = 161)
    public class128(class292 arg0, int arg1, class422 arg2, class422 arg3) {
        this.field1994 = arg2;
        this.field1997 = arg3;
        this.field1994.method2615(0, 3);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V", line = 148)
    public final void method995(int arg0) {
        if (arg0 != 255) {
            this.method993(-65, -115);
        }
        field1989++;
        class14 var2 = this.field1995;
        synchronized (this.field1995) {
            this.field1995.method71((byte) 44);
        }
    }
}
