import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class105 {

    @OriginalMember(owner = "client!qha", name = "g", descriptor = "Llga;")
    public static class712 field1405 = new class712(60, 7);

    @OriginalMember(owner = "client!qha", name = "j", descriptor = "D")
    public static double field1408;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!qha", name = "c", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!qha", name = "e", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!qha", name = "f", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!qha", name = "h", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!qha", name = "i", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!qha", name = "k", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1402;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)V", line = 6)
    public static final void method713(int arg0) {
        field1399++;
        if (class526.field7067 != null) {
            return;
        }
        int var1 = class294.field3959;
        int var2 = class56.field575;
        int var3 = class496.field6749 - class546.field7710 - var1;
        int var4 = class305.field4136 - class512.field6932 - var2;
        if (arg0 != 14059 || var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class271.field3587 != null) {
                var5 = class271.field3587;
            } else if (class144.field1868 == null) {
                var5 = class561.field7928;
            } else {
                var5 = class144.field1868;
            }
            int var6 = 0;
            int var7 = 0;
            if (class271.field3587 == var5) {
                Insets var8 = class271.field3587.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class305.field4136);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class496.field6749, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class496.field6749 - var3, var7, var3, class305.field4136);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class305.field4136 - var4, class496.field6749, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(IC)C", line = 76)
    public static final char method714(int arg0, char arg1) {
        field1401++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else if (arg1 == 'œ') {
            return 'e';
        } else {
            if (arg0 != 14561) {
                field1406 = 124;
            }
            return '\u0000';
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "([BLji;I)V", line = 117)
    public final void method715(byte[] arg0, class611 arg1, int arg2) {
        field1404++;
        if (arg2 != 18762) {
            return;
        }
        if (arg1.field8529[arg1.field8520] != 31 || arg1.field8529[arg1.field8520 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1402 == null) {
            this.field1402 = new Inflater(true);
        }
        try {
            this.field1402.setInput(arg1.field8529, arg1.field8520 + 10, -18 - arg1.field8520 + arg1.field8529.length);
            this.field1402.inflate(arg0);
        } catch (Exception var4) {
            this.field1402.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1402.reset();
    }

    @OriginalMember(owner = "client!qha", name = "<init>", descriptor = "()V", line = 143)
    public class105() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(ZIII)I", line = 146)
    public static final int method716(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            field1408 = 0.7636388514984377D;
        }
        field1400++;
        if (arg2 <= arg3) {
            return arg1 >= arg3 ? arg3 : arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(B[B)[B", line = 164)
    public final byte[] method717(byte arg0, byte[] arg1) {
        field1407++;
        class611 var3 = new class611(arg1);
        var3.field8520 = arg1.length - 4;
        int var4 = var3.method3401((byte) -63);
        byte[] var5 = new byte[var4];
        var3.field8520 = 0;
        this.method715(var5, var3, 18762);
        return arg0 < 90 ? null : var5;
    }

    @OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(III)V", line = 186)
    private class105(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)V", line = 199)
    public static void method718(int arg0) {
        if (arg0 > -97) {
            field1408 = 0.1934401666895311D;
        }
        field1405 = null;
    }
}
