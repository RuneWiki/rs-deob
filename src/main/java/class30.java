import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class30 extends class28 {

    @OriginalMember(owner = "client!rca", name = "u", descriptor = "Z")
    public boolean field443 = true;

    @OriginalMember(owner = "client!rca", name = "E", descriptor = "I")
    public static int field453 = 0;

    @OriginalMember(owner = "client!rca", name = "B", descriptor = "F")
    public static float field450;

    @OriginalMember(owner = "client!rca", name = "v", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!rca", name = "x", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!rca", name = "y", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!rca", name = "A", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!rca", name = "D", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!rca", name = "F", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!rca", name = "H", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!rca", name = "I", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!rca", name = "J", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!rca", name = "L", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!rca", name = "N", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!rca", name = "O", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!rca", name = "P", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!rca", name = "Q", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!rca", name = "M", descriptor = "Lkw;")
    public class7 field461;

    @OriginalMember(owner = "client!rca", name = "w", descriptor = "[I")
    private int[] field445;

    @OriginalMember(owner = "client!rca", name = "G", descriptor = "[I")
    public int[] field455;

    @OriginalMember(owner = "client!rca", name = "K", descriptor = "[Law;")
    public static class506[] field459;

    @OriginalMember(owner = "client!rca", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field448;

    @OriginalMember(owner = "client!rca", name = "C", descriptor = "[[I")
    private int[][] field451;

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(BII)I", line = 7)
    public final int method243(byte arg0, int arg1, int arg2) {
        int var4 = 46 % ((arg0 + 49) / 56);
        field452++;
        if (this.field445 == null || arg1 < 0 || arg1 > this.field445.length) {
            return -1;
        } else if (this.field451[arg1] == null || arg2 < 0 || this.field451[arg1].length < arg2) {
            return -1;
        } else {
            return this.field451[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILfd;)V", line = 23)
    public final void method244(int arg0, class418 arg1) {
        while (true) {
            int var3 = arg1.method2396(arg0 + 109);
            if (var3 == 0) {
                field444++;
                if (arg0 != 0) {
                    this.method251((byte) 114);
                    return;
                }
                return;
            }
            this.method249(arg1, var3, 4);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IB)Lmv;", line = 47)
    public final class297 method245(int arg0, byte arg1) {
        field449++;
        int var3 = 57 % ((-arg1 - 72) / 38);
        return this.field445 == null || arg0 < 0 || arg0 > this.field445.length ? null : class407.method2302(this.field445[arg0], 0);
    }

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "(I)V", line = 63)
    public static void method246(int arg0) {
        if (arg0 != -18) {
            field453 = -123;
        }
        field459 = null;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILfd;[I)V", line = 73)
    public final void method247(int arg0, class418 arg1, int[] arg2) {
        field456++;
        if (arg0 > -43) {
            this.field455 = null;
        }
        if (this.field445 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field445.length; var4++) {
            if (var4 >= arg2.length) {
                return;
            }
            int var5 = this.method245(var4, (byte) 85).field3888;
            if (var5 > 0) {
                arg1.method2410((long) arg2[var4], -19, var5);
            }
        }
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(ILfd;)Ljava/lang/String;", line = 107)
    public final String method248(int arg0, class418 arg1) {
        if (arg0 != 1) {
            return null;
        }
        field464++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field445 != null) {
            for (int var4 = 0; var4 < this.field445.length; var4++) {
                var3.append(this.field448[var4]);
                var3.append(this.field461.method25(this.method245(var4, (byte) 4), arg1.method2371(128, class407.method2302(this.field445[var4], 0).field3890), this.field451[var4], (byte) 46));
            }
        }
        var3.append(this.field448[this.field448.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lfd;II)V", line = 137)
    private final void method249(class418 arg0, int arg1, int arg2) {
        field446++;
        if (arg2 != 4) {
            this.method247(-97, null, null);
        }
        if (arg1 == 1) {
            this.field448 = class420.method2420('<', 127, arg0.method2394(arg2));
        } else if (arg1 == 2) {
            int var9 = arg0.method2396(84);
            this.field455 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field455[var10] = arg0.method2393(arg2 - 30731);
            }
        } else if (arg1 == 3) {
            int var4 = arg0.method2396(arg2 + 61);
            this.field445 = new int[var4];
            this.field451 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method2393(-30727);
                class297 var7 = class407.method2302(var6, 0);
                if (var7 != null) {
                    this.field445[var5] = var6;
                    this.field451[var5] = new int[var7.field3886];
                    for (int var8 = 0; var8 < var7.field3886; var8++) {
                        this.field451[var5][var8] = arg0.method2393(-30727);
                    }
                }
            }
        } else if (arg1 == 4) {
            this.field443 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!rca", name = "h", descriptor = "(I)I", line = 214)
    public final int method250(int arg0) {
        int var2 = -9 / ((-arg0 - 17) / 48);
        field462++;
        return this.field445 == null ? 0 : this.field445.length;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)V", line = 235)
    public final void method251(byte arg0) {
        if (this.field455 != null) {
            for (int var2 = 0; var2 < this.field455.length; var2++) {
                this.field455[var2] = class131.method954(this.field455[var2], 32768);
            }
        }
        field447++;
        if (arg0 != 101) {
            this.method250(-49);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IBLtc;I)V", line = 257)
    public static final void method252(int arg0, byte arg1, class477 arg2, int arg3) {
        field458++;
        class619 var4 = arg2.method2647(false, class520.field6799);
        if (var4 == null) {
            return;
        }
        class520.field6799.method376(arg0, arg3, arg0 + arg2.field6372, arg2.field6224 + arg3);
        if (arg1 != -87) {
            field459 = null;
        }
        if (class323.field4195 >= 3) {
            class520.field6799.method357(-16777216, var4, arg0, arg3);
        } else {
            class307.field4020.method2757((float) arg2.field6372 / 2.0F + (float) arg0, (float) arg2.field6224 / 2.0F + (float) arg3, 4096, (int) (-class141.field1859) & 0x3FFF << 2, var4, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(IB)Z", line = 280)
    public static final boolean method253(int arg0, byte arg1) {
        if (arg1 == -9) {
            field463++;
            return arg0 >= 12 && arg0 <= 17;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ZII)Z", line = 295)
    public static final boolean method254(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method253(71, (byte) -117);
        }
        field460++;
        return (arg1 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "(B)Ljava/lang/String;", line = 306)
    public final String method255(byte arg0) {
        field465++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field448 == null) {
            return "";
        }
        var2.append(this.field448[0]);
        for (int var3 = 1; var3 < this.field448.length; var3++) {
            var2.append("...");
            var2.append(this.field448[var3]);
        }
        if (arg0 >= -23) {
            this.method251((byte) -28);
        }
        return var2.toString();
    }
}
