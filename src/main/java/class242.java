import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class242 extends class262 {

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
    private int field4016 = 204;

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "I")
    private int field4020 = 1;

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
    private int field4025 = 1;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "Lok;")
    public static class146 field4014 = class235.method1724(-12908, "Benutzen");

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "Lok;")
    private static class146 field4018 = class235.method1724(-12908, " from your friend list first)3");

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "Lok;")
    public static class146 field4023 = class235.method1724(-12908, "::cardmem");

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "Lok;")
    public static class146 field4013 = class235.method1724(-12908, "Choisir une option");

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "Lok;")
    public static class146 field4019 = field4018;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "Lok;")
    public static class146 field4024 = class235.method1724(-12908, "n");

    @OriginalMember(owner = "client!cc", name = "eb", descriptor = "I")
    public static int field4029 = 0;

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "Lok;")
    public static class146 field4026 = class235.method1724(-12908, "Attaquer");

    @OriginalMember(owner = "client!cc", name = "gb", descriptor = "Lok;")
    public static class146 field4031 = class235.method1724(-12908, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!cc", name = "db", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!cc", name = "fb", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)I", line = 12)
    public static final int method1753(byte arg0, int arg1) {
        field4017++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        int var3 = 30 / ((-arg0 - 41) / 41);
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return var2 + arg1;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V", line = 66)
    public class242() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)V", line = 72)
    public static void method1754(int arg0) {
        field4023 = null;
        field4031 = null;
        field4026 = null;
        field4018 = null;
        field4014 = null;
        field4013 = null;
        field4024 = null;
        field4019 = null;
        if (arg0 < 7) {
            field4019 = (class146) null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)[I", line = 130)
    public final int[] method38(int arg0, byte arg1) {
        field4022++;
        if (arg1 > -85) {
            this.field4025 = 104;
        }
        int[] var3 = this.field4350.method1532(arg0, (byte) 97);
        if (this.field4350.field3333) {
            for (int var4 = 0; var4 < class98.field1598; var4++) {
                int var5 = class210.field3485[var4];
                int var6 = this.field4020 * var5 >> 12;
                int var7 = class312.field5326[arg0];
                int var8 = this.field4025 * var7 >> 12;
                int var9 = var5 % (4096 / this.field4020) * this.field4020;
                int var10 = var7 % (4096 / this.field4025) * this.field4025;
                if (this.field4016 > var10) {
                    for (var6 -= var8; var6 < 0; var6 += 4) {
                    }
                    while (var6 > 3) {
                        var6 -= 4;
                    }
                    if (var6 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field4016 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field4016) {
                    int var11;
                    for (var11 = var6 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([BIIZ)Z", line = 215)
    public static final boolean method1755(byte[] arg0, int arg1, int arg2, boolean arg3) {
        field4021++;
        int var4 = -1;
        if (arg3) {
            return false;
        }
        boolean var5 = true;
        class47 var6 = new class47(arg0);
        label62: while (true) {
            int var7 = var6.method334(arg3);
            if (var7 == 0) {
                return var5;
            }
            int var8 = 0;
            var4 += var7;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var6.method350(-32768);
                    if (var11 == 0) {
                        continue label62;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 >> 6 & 0x3F;
                    int var13 = var8 & 0x3F;
                    int var14 = arg2 + var13;
                    int var15 = var6.method368(86) >> 2;
                    int var16 = arg1 + var12;
                    if (var16 > 0 && var14 > 0 && var16 < 103 && var14 < 103) {
                        class5 var17 = class112.method756((byte) 65, var4);
                        if (var15 != 22 || class76.field1230 || var17.field77 != 0 || var17.field125 == 1 || var17.field50) {
                            if (!var17.method28(65535)) {
                                class214.field3529++;
                                var5 = false;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var6.method350(-32768);
                if (var10 == 0) {
                    break;
                }
                var6.method368(-107);
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lwe;II)V", line = 306)
    public final void method40(class47 arg0, int arg1, int arg2) {
        field4028++;
        if (arg1 != 2048) {
            return;
        }
        if (arg2 == 0) {
            this.field4020 = arg0.method368(-122);
        } else if (arg2 == 1) {
            this.field4025 = arg0.method368(126);
        } else if (arg2 == 2) {
            this.field4016 = arg0.method379(-2);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILt;)V", line = 358)
    public static final void method1756(int arg0, class247 arg1) {
        field4030++;
        arg1.field4089 = false;
        if (arg1.field4090 != null) {
            arg1.field4090.field3007 = 0;
        }
        for (class247 var2 = arg1.method301(); var2 != null; var2 = arg1.method298()) {
            method1756(0, var2);
        }
        if (arg0 != 0) {
            field4019 = (class146) null;
        }
    }
}
