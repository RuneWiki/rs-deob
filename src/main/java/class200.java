import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class200 {

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "[J")
    public static long[] field2828 = new long[32];

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "F")
    public static float field2830;

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "F")
    public static float field2831;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2827;

    static {
        new class466("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(Leo;IIIII)V", line = 5)
    public static final void method1245(class194 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field2765 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field2763[var6] != null) {
                arg0.field2765++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field2765; var7++) {
            long var8 = class243.field3402[arg1][arg2][arg3];
            while (var8 != 0L) {
                class525 var14 = class94.field1451[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field2763[var7] == var14.field7770) {
                    continue label50;
                }
            }
            long var10 = class243.field3402[arg1][arg4][arg5];
            while (var10 != 0L) {
                class525 var13 = class94.field1451[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field2763[var7] == var13.field7770) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field2765 - 1; var12++) {
                arg0.field2763[var12] = arg0.field2763[var12 + 1];
            }
            arg0.field2765--;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BLsi;[B)V", line = 60)
    public final void method1246(byte arg0, class391 arg1, byte[] arg2) {
        field2826++;
        if (arg1.field5678[arg1.field5719] != 31 || arg1.field5678[arg1.field5719 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2827 == null) {
            this.field2827 = new Inflater(true);
        }
        try {
            if (arg0 > -105) {
                field2831 = 0.747381F;
            }
            this.field2827.setInput(arg1.field5678, arg1.field5719 + 10, -18 - (arg1.field5719 - arg1.field5678.length));
            this.field2827.inflate(arg2);
        } catch (Exception var4) {
            this.field2827.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2827.reset();
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V", line = 87)
    public static void method1247(int arg0) {
        if (arg0 == 0) {
            field2828 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I[Lem;IIZI)V", line = 99)
    public static final void method1248(int arg0, class150[] arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field2824++;
        int var6 = 0;
        if (arg5 != -1) {
            field2831 = -1.270022F;
        }
        while (arg1.length > var6) {
            class150 var7 = arg1[var6];
            if (var7 != null && var7.field2259 == arg2) {
                class122.method860(arg0, arg4, arg3, false, var7);
                class362.method2183(var7, arg0, arg3, -5);
                if ((var7.field2187 - var7.field2204) < var7.field2181) {
                    var7.field2181 = var7.field2187 - var7.field2204;
                }
                if ((var7.field2308 - var7.field2322) < var7.field2173) {
                    var7.field2173 = var7.field2308 - var7.field2322;
                }
                if (var7.field2181 < 0) {
                    var7.field2181 = 0;
                }
                if (var7.field2173 < 0) {
                    var7.field2173 = 0;
                }
                if (var7.field2315 == 0) {
                    class356.method2132(var7, (byte) 65, arg4);
                }
            }
            var6++;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(III)I", line = 150)
    public static final int method1249(int arg0, int arg1, int arg2) {
        field2825++;
        int var3 = class409.method2449(arg1 - 1, 1, arg2 - 1) + class409.method2449(arg1 + 1, 1, arg2 - 1) + class409.method2449(arg1 + -1, arg0, arg2 + 1) + class409.method2449(arg1 + 1, 1, arg2 + 1);
        int var4 = class409.method2449(arg1 - 1, 1, arg2) - (-class409.method2449(arg1 + 1, arg0, arg2) - class409.method2449(arg1, arg0, arg2 - 1) - class409.method2449(arg1, 1, arg2 + 1));
        int var5 = class409.method2449(arg1, 1, arg2);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIZI)V", line = 166)
    public static final void method1250(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2829++;
        class97 var5 = class348.method2064(arg0, 4, 118);
        var5.method712((byte) -97);
        var5.field1468 = arg4;
        if (arg3) {
            var5.field1471 = arg2;
            var5.field1472 = arg1;
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(III)V", line = 186)
    private class200(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V", line = 200)
    public class200() {
        this(-1, 1000000, 1000000);
    }
}
