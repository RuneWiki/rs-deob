import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class763 {

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public int field10621 = -1;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    public int field10627 = -1;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public static int field10622;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field10623;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field10624;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public static int field10625;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public static int field10626;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "[I")
    public int[] field10628;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lrg;IB)V", line = 16)
    private final void method4233(class645 arg0, int arg1, byte arg2) {
        field10625++;
        if (arg2 != -68) {
            this.field10621 = -88;
        }
        if (arg1 == 1) {
            this.field10621 = arg0.method3712((byte) 104);
        } else if (arg1 == 2) {
            this.field10628 = new int[arg0.method3745(-6314)];
            for (int var4 = 0; var4 < this.field10628.length; var4++) {
                this.field10628[var4] = arg0.method3712((byte) -122);
            }
            return;
        } else if (arg1 == 3) {
            this.field10627 = arg0.method3745(-6314);
            return;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lvd;B)V", line = 53)
    public static final void method4234(class39 arg0, byte arg1) {
        class627.field8774 = 0;
        class103.field1437 = 0;
        field10624++;
        class493.field7031 = new class243();
        class514.field7296 = new class655[1024];
        class59.field840 = new class626[class490.field7000[class34.field352] + 1];
        if (arg1 != -54) {
            method4234(null, (byte) 119);
        }
        class699.field9637 = 0;
        class756.field10587 = 0;
        class240.method1587(66, arg0);
        class435.method2694(817, arg0);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)Z", line = 72)
    public static final boolean method4235(byte arg0) {
        if (arg0 != 123) {
            return false;
        }
        field10623++;
        try {
            return class120.method868((byte) 38);
        } catch (IOException var4) {
            class213.method1446(true);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class542.field7732 == null ? -1 : class542.field7732.method2843(true)) + "," + (class242.field3522 == null ? -1 : class242.field3522.method2843(true)) + "," + (class394.field5924 == null ? -1 : class394.field5924.method2843(true)) + " - " + class228.field3361 + "," + (class361.field5224 + class130.field1749.field6133[0]) + "," + (class582.field8288 + class130.field1749.field6139[0]) + " - ";
            for (int var3 = 0; var3 < class228.field3361 && var3 < 50; var3++) {
                var2 = var2 + class469.field6851.field9068[var3] + ",";
            }
            class326.method2072(-3753, var5, var2);
            class109.method812(false, (byte) 108);
            return true;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BLjava/lang/String;)I", line = 111)
    public static final int method4236(byte arg0, String arg1) {
        field10622++;
        if (arg0 != 37) {
            method4234(null, (byte) -87);
        }
        return class313.method1978(arg1, true, 10, -1);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lrg;Z)V", line = 128)
    public final void method4237(class645 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method3745(-6314);
            if (var3 == 0) {
                field10626++;
                if (arg1) {
                    this.field10627 = 103;
                    return;
                }
                return;
            }
            this.method4233(arg0, var3, (byte) -68);
        }
    }
}
