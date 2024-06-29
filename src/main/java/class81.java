import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class81 {

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Z")
    public boolean field2002 = false;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public int field2001 = -1;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Lud;")
    public class143 field2006 = null;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "[I")
    public int[] field2000;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "[I")
    public int[] field2003;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "[I")
    public int[] field1999;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "[I")
    public int[] field2008;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "[I")
    private static int[] field1998 = new int[500];

    @OriginalMember(owner = "client!le", name = "h", descriptor = "[I")
    private static int[] field2005 = new int[500];

    @OriginalMember(owner = "client!le", name = "g", descriptor = "[I")
    private static int[] field2004 = new int[500];

    @OriginalMember(owner = "client!le", name = "j", descriptor = "[I")
    private static int[] field2007 = new int[500];

    @OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
    public static void method624() {
        field2004 = null;
        field2005 = null;
        field1998 = null;
        field2007 = null;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "([BLud;)V")
    public class81(byte[] arg0, class143 arg1) {
        this.field2006 = arg1;
        class83 var3 = new class83(arg0);
        class83 var4 = new class83(arg0);
        var3.field2076 = 2;
        int var5 = var3.method638(0);
        int var6 = -1;
        int var7 = 0;
        var4.field2076 = var3.field2076 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method638(0);
            if (var10 > 0) {
                if (this.field2006.field3273[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field2006.field3273[var11] == 0) {
                            field2004[var7] = var11;
                            field2005[var7] = 0;
                            field1998[var7] = 0;
                            field2007[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field2004[var7] = var8;
                short var12 = 0;
                if (this.field2006.field3273[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field2005[var7] = var12;
                } else {
                    field2005[var7] = var4.method682(-59);
                }
                if ((var10 & 0x2) == 0) {
                    field1998[var7] = var12;
                } else {
                    field1998[var7] = var4.method682(-84);
                }
                if ((var10 & 0x4) == 0) {
                    field2007[var7] = var12;
                } else {
                    field2007[var7] = var4.method682(-80);
                }
                var6 = var8;
                var7++;
                if (this.field2006.field3273[var8] == 5) {
                    this.field2002 = true;
                }
            }
        }
        if (arg0.length != var4.field2076) {
            throw new RuntimeException();
        }
        this.field2001 = var7;
        this.field2000 = new int[var7];
        this.field2003 = new int[var7];
        this.field1999 = new int[var7];
        this.field2008 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field2000[var9] = field2004[var9];
            this.field2003[var9] = field2005[var9];
            this.field1999[var9] = field1998[var9];
            this.field2008[var9] = field2007[var9];
        }
    }
}
