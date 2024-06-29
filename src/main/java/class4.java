import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class4 {

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "Ld;")
    private class142 field35 = new class142();

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Ld;")
    private class142 field36 = new class142();

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "Ld;")
    private class142 field37 = new class142();

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "Ld;")
    private class142 field38 = new class142();

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "Lhb;")
    private class35 field41 = new class35(4);

    @OriginalMember(owner = "client!qc", name = "D", descriptor = "I")
    public volatile int field44 = 0;

    @OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
    public volatile int field45 = 0;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "B")
    private byte field43 = 0;

    @OriginalMember(owner = "client!qc", name = "F", descriptor = "Lhb;")
    private class35 field46 = new class35(8);

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field23 = 3353893;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field26 = 0;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
    private int field39;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "J")
    private long field42;

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "Lel;")
    private class118 field40;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "Lme;")
    private class188 field47;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "Llb;")
    public static class211 field24;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "[I")
    public static int[] field22;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)Z", line = 7)
    public final boolean method40(boolean arg0) {
        field15++;
        if (arg0) {
            this.method52(93);
        }
        return this.method42(60) >= 20;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZBII)Lme;", line = 20)
    public final class188 method41(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field16++;
        long var6 = (long) ((arg4 << 16) + arg3);
        class188 var8 = new class188();
        var8.field1262 = var6;
        var8.field2991 = arg2;
        if (arg0 != -6479) {
            this.field35 = (class142) null;
        }
        var8.field4998 = arg1;
        if (arg1) {
            if (this.method52(0) >= 20) {
                throw new RuntimeException();
            }
            this.field35.method1076(var8, (byte) -106);
        } else if (this.method42(arg0 ^ -6427) < 20) {
            this.field37.method1076(var8, (byte) -55);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)I", line = 61)
    private final int method42(int arg0) {
        field25++;
        return arg0 < 40 ? -112 : this.field37.method1069(43) + this.field38.method1069(98);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V", line = 74)
    public final void method43(int arg0) {
        if (this.field40 != null) {
            this.field40.method914(arg0 - 1);
        }
        field32++;
        if (arg0 != 0) {
            field19 = 25;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)Z", line = 91)
    public final boolean method44(boolean arg0) {
        field34++;
        if (this.field40 != null) {
            long var2 = class234.method1650((byte) 49);
            int var4 = (int) (var2 - this.field42);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field42 = var2;
            this.field39 += var4;
            if (this.field39 > 30000) {
                try {
                    this.field40.method916(-25224);
                } catch (Exception var30) {
                }
                this.field40 = null;
            }
        }
        if (this.field40 == null) {
            return this.method52(0) == 0 && this.method42(87) == 0;
        }
        try {
            this.field40.method921(35);
            for (class188 var6 = (class188) this.field35.method1077(18667); var6 != null; var6 = (class188) this.field35.method1068(29540)) {
                this.field41.field455 = 0;
                this.field41.method262((byte) 81, 1);
                this.field41.method293((int) var6.field1262, -2049521200);
                this.field40.method920((byte) -76, this.field41.field437, 0, 4);
                this.field36.method1076(var6, (byte) -45);
            }
            if (arg0) {
                return false;
            }
            for (class188 var7 = (class188) this.field37.method1077(18667); var7 != null; var7 = (class188) this.field37.method1068(29540)) {
                this.field41.field455 = 0;
                this.field41.method262((byte) 81, 0);
                this.field41.method293((int) var7.field1262, -2049521200);
                this.field40.method920((byte) -76, this.field41.field437, 0, 4);
                this.field38.method1076(var7, (byte) -74);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field40.method915(0);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field39 = 0;
                byte var10 = 0;
                if (this.field47 == null) {
                    var10 = 8;
                } else if (this.field47.field2998 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = this.field47.field2988.field437.length - this.field47.field2991;
                    int var12 = 512 - this.field47.field2998;
                    if (var12 > var11 - this.field47.field2988.field455) {
                        var12 = var11 - this.field47.field2988.field455;
                    }
                    if (var12 > var9) {
                        var12 = var9;
                    }
                    this.field40.method919(var12, this.field47.field2988.field437, 10224, this.field47.field2988.field455);
                    if (this.field43 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field47.field2988.field437[this.field47.field2988.field455 + var13] = (byte) class203.method1462(this.field47.field2988.field437[this.field47.field2988.field455 + var13], this.field43);
                        }
                    }
                    this.field47.field2988.field455 += var12;
                    this.field47.field2998 += var12;
                    if (this.field47.field2988.field455 == var11) {
                        this.field47.method713((byte) 91);
                        this.field47.field5004 = false;
                        this.field47 = null;
                    } else if (this.field47.field2998 == 512) {
                        this.field47.field2998 = 0;
                    }
                } else {
                    int var14 = var10 - this.field46.field455;
                    if (var14 > var9) {
                        var14 = var9;
                    }
                    this.field40.method919(var14, this.field46.field437, 10224, this.field46.field455);
                    if (this.field43 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field46.field437[this.field46.field455 + var15] = (byte) class203.method1462(this.field46.field437[this.field46.field455 + var15], this.field43);
                        }
                    }
                    this.field46.field455 += var14;
                    if (this.field46.field455 >= var10) {
                        if (this.field47 == null) {
                            this.field46.field455 = 0;
                            int var16 = this.field46.method273(65280);
                            int var17 = this.field46.method300(-1394191632);
                            int var18 = this.field46.method273(65280);
                            boolean var19 = (var18 & 0x80) != 0;
                            int var20 = var18 & 0x7F;
                            long var21 = (long) ((var16 << 16) + var17);
                            int var23 = this.field46.method299(-95);
                            Object var24 = null;
                            class188 var25;
                            if (var19) {
                                for (var25 = (class188) this.field38.method1077(18667); var25 != null && var25.field1262 != var21; var25 = (class188) this.field38.method1068(29540)) {
                                }
                            } else {
                                for (var25 = (class188) this.field36.method1077(18667); var25 != null && var25.field1262 != var21; var25 = (class188) this.field36.method1068(29540)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            this.field47 = var25;
                            int var26 = var20 == 0 ? 5 : 9;
                            this.field47.field2988 = new class35(var23 - (-var26 - this.field47.field2991));
                            this.field47.field2988.method262((byte) 81, var20);
                            this.field47.field2988.method259(-15195, var23);
                            this.field46.field455 = 0;
                            this.field47.field2998 = 8;
                        } else if (this.field47.field2998 != 0) {
                            throw new IOException();
                        } else if (this.field46.field437[0] == -1) {
                            this.field46.field455 = 0;
                            this.field47.field2998 = 1;
                        } else {
                            this.field47 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field40.method916(-25224);
            } catch (Exception var29) {
            }
            this.field45 = -2;
            this.field44++;
            this.field40 = null;
            return this.method52(0) == 0 && this.method42(102) == 0;
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(Z)V", line = 369)
    public final void method45(boolean arg0) {
        field28++;
        try {
            this.field40.method916(-25224);
        } catch (Exception var3) {
        }
        if (!arg0) {
            this.field44++;
            this.field40 = null;
            this.field45 = -1;
            this.field43 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V", line = 387)
    public final void method46(byte arg0) {
        field29++;
        if (this.field40 == null) {
            return;
        }
        try {
            this.field41.field455 = 0;
            this.field41.method262((byte) 81, 7);
            this.field41.method293(0, -2049521200);
            if (arg0 != -30) {
                method51(-82);
            }
            this.field40.method920((byte) -76, this.field41.field437, 0, 4);
        } catch (IOException var5) {
            try {
                this.field40.method916(-25224);
            } catch (Exception var4) {
            }
            this.field45 = -2;
            this.field40 = null;
            this.field44++;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZZ)V", line = 414)
    public final void method47(boolean arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field27++;
        if (this.field40 == null) {
            return;
        }
        try {
            this.field41.field455 = 0;
            this.field41.method262((byte) 81, arg0 ? 2 : 3);
            this.field41.method293(0, -2049521200);
            this.field40.method920((byte) -76, this.field41.field437, 0, 4);
        } catch (IOException var6) {
            try {
                this.field40.method916(-25224);
            } catch (Exception var5) {
            }
            this.field40 = null;
            this.field44++;
            this.field45 = -2;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lel;IZ)V", line = 444)
    public final void method48(class118 arg0, int arg1, boolean arg2) {
        if (arg1 != -12984) {
            this.field38 = (class142) null;
        }
        if (this.field40 != null) {
            try {
                this.field40.method916(arg1 ^ 0x5030);
            } catch (Exception var11) {
            }
            this.field40 = null;
        }
        this.field40 = arg0;
        field33++;
        this.method49((byte) 74);
        this.method47(arg2, false);
        this.field46.field455 = 0;
        this.field47 = null;
        while (true) {
            class188 var5 = (class188) this.field36.method1070(true);
            if (var5 == null) {
                while (true) {
                    class188 var6 = (class188) this.field38.method1070(true);
                    if (var6 == null) {
                        if (this.field43 != 0) {
                            try {
                                this.field41.field455 = 0;
                                this.field41.method262((byte) 81, 4);
                                this.field41.method262((byte) 81, this.field43);
                                this.field41.method263(0, (byte) 97);
                                this.field40.method920((byte) -76, this.field41.field437, 0, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field40.method916(-25224);
                                } catch (Exception var9) {
                                }
                                this.field45 = -2;
                                this.field44++;
                                this.field40 = null;
                            }
                        }
                        this.field39 = 0;
                        this.field42 = class234.method1650((byte) 126);
                        return;
                    }
                    this.field37.method1076(var6, (byte) -114);
                }
            }
            this.field35.method1076(var5, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V", line = 524)
    private final void method49(byte arg0) {
        field18++;
        if (this.field40 == null) {
            return;
        }
        try {
            int var2 = 104 / ((22 - arg0) / 52);
            this.field41.field455 = 0;
            this.field41.method262((byte) 81, 6);
            this.field41.method293(3, -2049521200);
            this.field40.method920((byte) -76, this.field41.field437, 0, 4);
        } catch (IOException var6) {
            try {
                this.field40.method916(-25224);
            } catch (Exception var5) {
            }
            this.field44++;
            this.field45 = -2;
            this.field40 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)Z", line = 551)
    public final boolean method50(int arg0) {
        field31++;
        if (arg0 != 1514) {
            this.field47 = (class188) null;
        }
        return this.method52(0) >= 20;
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V", line = 562)
    public static void method51(int arg0) {
        field22 = null;
        if (arg0 == 0) {
            field24 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)I", line = 577)
    public final int method52(int arg0) {
        if (arg0 == 0) {
            field17++;
            return this.field35.method1069(22) + this.field36.method1069(44);
        } else {
            return 12;
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(Z)V", line = 591)
    public final void method53(boolean arg0) {
        field30++;
        if (!arg0 && this.field40 != null) {
            this.field40.method916(-25224);
        }
    }
}
