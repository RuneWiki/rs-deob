import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class327 {

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "Lnf;")
    private class136 field4596 = null;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    private int field4594 = 65000;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "Lnf;")
    private class136 field4598 = null;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    private int field4592;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "[I")
    public static int[] field4597 = new int[14];

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public static int field4599 = 1339;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "Lhba;")
    public static class719 field4593 = new class719();

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "[I")
    public static int[] field4602 = new int[120];

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "Ljk;")
    public static class788 field4603;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    public static int field4604;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field4602[var1] = var0 / 4;
        }
        field4603 = null;
    }

    @OriginalMember(owner = "client!pn", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field4601++;
        return "Cache:" + this.field4592;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "([BIII)Z", line = 11)
    public final boolean method2064(byte[] arg0, int arg1, int arg2, int arg3) {
        field4591++;
        if (arg1 > -71) {
            this.field4598 = null;
        }
        class136 var5 = this.field4596;
        synchronized (this.field4596) {
            if (arg3 < 0 || this.field4594 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method2065(arg0, arg2, arg3, true, -105);
            if (!var6) {
                var6 = this.method2065(arg0, arg2, arg3, false, -4);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "([BIIZI)Z", line = 42)
    private final boolean method2065(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field4600++;
        class136 var6 = this.field4596;
        synchronized (this.field4596) {
            try {
                int var8;
                if (arg3) {
                    if (this.field4598.method908(-125) < (long) (arg1 * 6 + 6)) {
                        return false;
                    }
                    this.field4598.method918(0, (long) (arg1 * 6));
                    this.field4598.method919(0, 6, -1, class443.field6129);
                    var8 = ((class443.field6129[4] & 0xFF) << 8) + ((class443.field6129[3] & 0xFF << 16) + (class443.field6129[5] & 0xFF));
                    if (var8 <= 0 || ((long) var8) > (this.field4596.method908(-125) / 520L)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field4596.method908(-110) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class443.field6129[3] = (byte) (var8 >> 16);
                class443.field6129[4] = (byte) (var8 >> 8);
                class443.field6129[1] = (byte) (arg2 >> 8);
                class443.field6129[5] = (byte) var8;
                class443.field6129[0] = (byte) (arg2 >> 16);
                class443.field6129[2] = (byte) arg2;
                this.field4598.method918(0, (long) (arg1 * 6));
                this.field4598.method911(0, -13467, class443.field6129, 6);
                int var10 = 0;
                int var11 = 28 / ((57 - arg4) / 59);
                int var12 = 0;
                while (var10 < arg2) {
                    int var13 = 0;
                    if (arg3) {
                        label104: {
                            this.field4596.method918(0, (long) (var8 * 520));
                            try {
                                this.field4596.method919(0, 8, -1, class443.field6129);
                            } catch (EOFException var34) {
                                return true;
                            }
                            int var14 = ((class443.field6129[0] & 0xFF) << 8) + (class443.field6129[1] & 0xFF);
                            var13 = (class443.field6129[5] & 0xFF << 8) + (((class443.field6129[4] & 0xFF) << 16) + (class443.field6129[6] & 0xFF));
                            int var15 = ((class443.field6129[2] & 0xFF) << 8) + (class443.field6129[3] & 0xFF);
                            int var16 = class443.field6129[7] & 0xFF;
                            if (arg1 == var14 && var12 == var15 && this.field4592 == var16) {
                                if (var13 >= 0 && this.field4596.method908(-105) / 520L >= (long) var13) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        var13 = (int) ((this.field4596.method908(-105) + 519L) / 520L);
                        arg3 = false;
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class443.field6129[0] = (byte) (arg1 >> 8);
                    class443.field6129[2] = (byte) (var12 >> 8);
                    class443.field6129[1] = (byte) arg1;
                    class443.field6129[3] = (byte) var12;
                    if ((arg2 - var10) <= 512) {
                        var13 = 0;
                    }
                    class443.field6129[4] = (byte) (var13 >> 16);
                    class443.field6129[5] = (byte) (var13 >> 8);
                    class443.field6129[6] = (byte) var13;
                    class443.field6129[7] = (byte) this.field4592;
                    this.field4596.method918(0, (long) (var8 * 520));
                    this.field4596.method911(0, -13467, class443.field6129, 8);
                    int var19 = arg2 - var10;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    this.field4596.method911(var10, -13467, arg0, var19);
                    var12++;
                    var8 = var13;
                    var10 += var19;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V", line = 162)
    public static void method2066(byte arg0) {
        field4597 = null;
        field4603 = null;
        field4602 = null;
        field4593 = null;
        if (arg0 <= 46) {
            field4602 = null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(ILnf;Lnf;I)V", line = 283)
    public class327(int arg0, class136 arg1, class136 arg2, int arg3) {
        this.field4596 = arg1;
        this.field4598 = arg2;
        this.field4592 = arg0;
        this.field4594 = arg3;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZI)[B", line = 188)
    public final byte[] method2067(boolean arg0, int arg1) {
        field4595++;
        class136 var3 = this.field4596;
        synchronized (this.field4596) {
            if (!arg0) {
                return null;
            }
            try {
                if (this.field4598.method908(-108) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field4598.method918(0, (long) (arg1 * 6));
                this.field4598.method919(0, 6, -1, class443.field6129);
                int var6 = (class443.field6129[0] & 0xFF << 16) + (class443.field6129[1] & 0xFF << 8) + (class443.field6129[2] & 0xFF);
                int var7 = ((class443.field6129[3] & 0xFF) << 16) + (class443.field6129[4] & 0xFF << 8) + (class443.field6129[5] & 0xFF);
                if (var6 < 0 || this.field4594 < var6) {
                    return null;
                } else if (var7 > 0 && (this.field4596.method908(-121) / 520L) >= ((long) var7)) {
                    byte[] var10 = new byte[var6];
                    int var11 = 0;
                    int var12 = 0;
                    while (var6 > var11) {
                        if (var7 == 0) {
                            return null;
                        }
                        this.field4596.method918(0, (long) (var7 * 520));
                        int var14 = var6 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field4596.method919(0, var14 + 8, -1, class443.field6129);
                        int var15 = ((class443.field6129[0] & 0xFF) << 8) + (class443.field6129[1] & 0xFF);
                        int var16 = ((class443.field6129[2] & 0xFF) << 8) + (class443.field6129[3] & 0xFF);
                        int var17 = (class443.field6129[6] & 0xFF) + ((class443.field6129[5] & 0xFF) << 8) + (class443.field6129[4] & 0xFF << 16);
                        int var18 = class443.field6129[7] & 0xFF;
                        if (arg1 == var15 && var12 == var16 && this.field4592 == var18) {
                            if (var17 >= 0 && (this.field4596.method908(-117) / 520L) >= ((long) var17)) {
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var10[var11++] = class443.field6129[var21 + 8];
                                }
                                var12++;
                                var7 = var17;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }
}
