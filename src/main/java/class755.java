import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class755 extends class111 {

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "Z")
    public static boolean field10217 = false;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "F")
    private float field10210;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "F")
    private float field10219;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    private int field10211;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    private int field10212;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field10213;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field10214;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
    public static int field10215;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public static int field10216;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
    public static int field10218;

    @OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
    public static int field10220;

    @OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
    public static int field10221;

    @OriginalMember(owner = "client!hb", name = "E", descriptor = "Luq;")
    public static class172 field10224;

    @OriginalMember(owner = "client!hb", name = "C", descriptor = "Ljava/lang/String;")
    private String field10222;

    @OriginalMember(owner = "client!hb", name = "D", descriptor = "Ljava/lang/String;")
    private String field10223;

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "Ljava/lang/String;")
    private String field10225;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)F", line = 3)
    public final float method4137(int arg0) {
        if (arg0 < 50) {
            this.method646((OggPacket) null, (byte) 105);
        }
        ++field10213;
        return this.field10210;
    }

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "(I)Ljava/lang/String;", line = 15)
    public final String method4138(int arg0) {
        ++field10214;
        if (arg0 != 0) {
            this.method4137(-65);
        }
        return this.field10225;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V", line = 26)
    public final void method643(int arg0) {
        ++field10216;
        if (arg0 != -1) {
            method4140((class214) null);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)Ljava/lang/String;", line = 37)
    public final String method4139(byte arg0) {
        if (arg0 != 93) {
            field10224 = null;
        }
        ++field10221;
        return this.field10222;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V", line = 49)
    public final void method646(OggPacket arg0, byte arg1) {
        ++field10215;
        if (~super.field1531 >= -1 || "SUB".equals(this.field10223)) {
            class254 var3 = new class254(arg0.getData());
            if (arg1 == -23) {
                int var4 = var3.method1731((byte) 64);
                if (~super.field1531 >= -9) {
                    if ((128 | var4) == 0) {
                        throw new IllegalStateException();
                    }
                    if (~super.field1531 == -1) {
                        var3.field3725 += 23;
                        this.field10212 = var3.method1679(-3);
                        this.field10211 = var3.method1679(arg1 + 20);
                        if (~this.field10212 != -1 && ~this.field10211 != -1) {
                            class254 var5 = new class254(16);
                            var3.method1735(0, -125, var5.field3789, 16);
                            this.field10222 = var5.method1699(-87);
                            var5.field3725 = 0;
                            var3.method1735(0, 20, var5.field3789, 16);
                            this.field10223 = var5.method1699(arg1 + -104);
                            return;
                        }
                        throw new IllegalStateException();
                    }
                } else {
                    if (~var4 == -1) {
                        long var6 = var3.method1693(2042275360);
                        long var8 = var3.method1693(2042275360);
                        long var10 = var3.method1693(2042275360);
                        if (~var6 > -1L || var8 < 0L || ~var10 > -1L || var6 < var10) {
                            throw new IllegalStateException();
                        }
                        this.field10210 = (float) ((long) this.field10211 * var6) / (float) this.field10212;
                        this.field10219 = (float) ((var6 + var8) * (long) this.field10211) / (float) this.field10212;
                        int var12 = var3.method1679(-3);
                        if (~var12 > -1 || var3.field3789.length - var3.field3725 < var12) {
                            throw new IllegalStateException();
                        }
                        this.field10225 = class761.method4200(var3.field3789, -225, var12, var3.field3725);
                    }
                    if ((128 | var4) != 0) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lfq;)V", line = 124)
    public static final void method4140(class214 arg0) {
        if (arg0 != null) {
            for (int var1 = 0; var1 < 2; ++var1) {
                class214 var2 = null;
                for (class214 var3 = class737.field10005[var1]; var3 != null; var3 = var3.field2808) {
                    if (arg0 == var3) {
                        if (var2 != null) {
                            var2.field2808 = var3.field2808;
                        } else {
                            class737.field10005[var1] = var3.field2808;
                        }
                        class132.field1818 = true;
                        return;
                    }
                    var2 = var3;
                }
                class214 var4 = null;
                for (class214 var5 = class151.field2056[var1]; var5 != null; var5 = var5.field2808) {
                    if (arg0 == var5) {
                        if (var4 != null) {
                            var4.field2808 = var5.field2808;
                        } else {
                            class151.field2056[var1] = var5.field2808;
                        }
                        class132.field1818 = true;
                        return;
                    }
                    var4 = var5;
                }
                class214 var6 = null;
                for (class214 var7 = class570.field7774[var1]; var7 != null; var7 = var7.field2808) {
                    if (arg0 == var7) {
                        if (var6 != null) {
                            var6.field2808 = var7.field2808;
                        } else {
                            class570.field7774[var1] = var7.field2808;
                        }
                        class132.field1818 = true;
                        return;
                    }
                    var6 = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)F", line = 208)
    public final float method4141(byte arg0) {
        if (arg0 < 94) {
            this.field10223 = null;
        }
        ++field10218;
        return this.field10219;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V", line = 226)
    public static void method4142(boolean arg0) {
        field10224 = null;
        if (arg0) {
            method4142(false);
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 238)
    public class755(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B[BII)Ljava/lang/String;", line = 244)
    public static final String method4143(byte arg0, byte[] arg1, int arg2, int arg3) {
        ++field10220;
        char[] var4 = new char[arg2];
        int var5 = 0;
        int var6 = 0;
        if (arg0 <= 95) {
            return null;
        } else {
            while (~arg2 < ~var6) {
                int var7 = arg1[arg3 + var6] & 255;
                if (~var7 != -1) {
                    if (~var7 <= -129 && var7 < 160) {
                        char var8 = class652.field8796[var7 + -128];
                        if (var8 == 0) {
                            var8 = '?';
                        }
                        var7 = var8;
                    }
                    var4[var5++] = (char) var7;
                }
                ++var6;
            }
            return new String(var4, 0, var5);
        }
    }
}
