import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class182 extends class170 {

    @OriginalMember(owner = "client!in", name = "z", descriptor = "I")
    private int field2558;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "I")
    public static int field2556 = 16777215;

    @OriginalMember(owner = "client!in", name = "E", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!in", name = "C", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!in", name = "F", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!in", name = "G", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!in", name = "I", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!in", name = "J", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!in", name = "A", descriptor = "[Log;")
    public class358[] field2559;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "[[B")
    private byte[][] field2557;

    static {
        new class368("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field2561 = 0;
        field2560 = 0;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BIIJ)V", line = 7)
    public static final void method1269(byte arg0, int arg1, int arg2, long arg3) {
        field2555++;
        int var5 = (int) arg3 >> 14 & 0x1F;
        if (arg0 >= -16) {
            method1269((byte) -9, -104, 107, -20L);
        }
        int var6 = ((int) arg3 & 0x3BFF13) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class398.method2469(arg2, true, 0, 0, 0, arg1, var5, var6, class359.field4970.field2659[0], 118, class359.field4970.field2662[0]);
            return;
        }
        class447 var8 = class133.method996((byte) -19, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field6322;
            var10 = var8.field6330;
        } else {
            var9 = var8.field6330;
            var10 = var8.field6322;
        }
        int var11 = var8.field6272;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class398.method2469(arg2, true, var9, var11, var10, arg1, 0, 0, class359.field4970.field2659[0], -122, class359.field4970.field2662[0]);
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(B)Z", line = 51)
    public final boolean method1270(byte arg0) {
        field2564++;
        if (this.field2559 != null) {
            return true;
        }
        if (this.field2557 == null) {
            if (!class417.field5774.method1919(this.field2558, false)) {
                return false;
            }
            int[] var2 = class417.field5774.method1936(-92, this.field2558);
            this.field2557 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field2557[var3] = class417.field5774.method1926(0, var2[var3], this.field2558);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field2557.length; var5++) {
            byte[] var14 = this.field2557[var5];
            int var15 = var14[0] & 0xFF << 8 | var14[1] & 0xFF;
            var4 &= class42.field564.method1930((byte) -121, var15);
        }
        if (!var4) {
            return false;
        }
        class162 var6 = new class162();
        int var7 = class417.field5774.method1934((byte) 28, this.field2558);
        this.field2559 = new class358[var7];
        int[] var8 = class417.field5774.method1936(-117, this.field2558);
        if (arg0 != -55) {
            this.method1271(109, (byte) 90);
        }
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field2557[var9];
            int var11 = var10[0] & 0xFF << 8 | var10[1] & 0xFF;
            class221 var12 = null;
            for (class221 var13 = (class221) var6.method1173(0); var13 != null; var13 = (class221) var6.method1165(true)) {
                if (var13.field3094 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class221(var11, class42.field564.method1908((byte) -38, var11));
                var6.method1162(arg0 + 180, var12);
            }
            this.field2559[var8[var9]] = new class358(var10, var12);
        }
        this.field2557 = null;
        return true;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(IB)Z", line = 157)
    public final boolean method1271(int arg0, byte arg1) {
        field2565++;
        if (arg1 != 93) {
            this.method1271(98, (byte) 108);
        }
        return this.field2559[arg0].field4938;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BI)Z", line = 171)
    public final boolean method1272(byte arg0, int arg1) {
        field2563++;
        return arg0 < 104 ? false : this.field2559[arg1].field4939;
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(I)V", line = 182)
    public class182(int arg0) {
        this.field2558 = arg0;
    }
}
