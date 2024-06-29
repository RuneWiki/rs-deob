import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class77 {

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1306 = "Select";

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public int field1305;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
    private int field1314;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "[Lod;")
    public static class137[] field1313;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)I", line = 5)
    public final int method603(int arg0) {
        field1312++;
        if (arg0 != 16383) {
            field1306 = null;
        }
        return this.field1305 & 0x3FFF;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)V", line = 17)
    public final void method604(int arg0, int arg1) {
        if (arg1 == -30009) {
            field1310++;
            this.field1305 = arg0;
            this.field1314 = 0;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V", line = 31)
    public final void method605(byte arg0) {
        if (arg0 != -60) {
            this.method605((byte) 104);
        }
        field1304++;
        this.field1305 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIILfp;)V", line = 56)
    public static final void method606(int arg0, int arg1, int arg2, int arg3, class7 arg4) {
        arg4.field86 = (arg1 << 7) + 64;
        arg4.field95 = arg3;
        arg4.field90 = (arg2 << 7) + 64;
        class168 var5 = class443.field6447[arg0][arg1][arg2];
        if (var5 != null) {
            int var6 = 0;
            for (class36 var7 = var5.field2488; var7 != null; var7 = var7.field505) {
                if (var7.field511.field6517) {
                    int var8 = var7.field511.method136(0);
                    if (var8 != -32768 && var8 < var6) {
                        var6 = var8;
                    }
                }
            }
            if (var6 < 0) {
                arg4.field95 += var6;
                arg4.field96 = true;
            }
        }
        if (class443.field6447[arg0][arg1][arg2] == null) {
            class253.method1833(arg0, arg1, arg2);
        }
        class443.field6447[arg0][arg1][arg2].field2493 = arg4;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIII)Z", line = 96)
    public final boolean method607(int arg0, int arg1, int arg2, int arg3) {
        field1309++;
        int var5 = this.field1314;
        if (this.field1305 == arg3 && this.field1314 == 0) {
            return false;
        }
        boolean var8;
        if (this.field1314 == arg1) {
            if (arg3 > this.field1305 && (this.field1305 + arg2) >= arg3 || this.field1305 > arg3 && arg3 >= (this.field1305 - arg2)) {
                this.field1305 = arg3;
                return false;
            }
            var8 = true;
        } else if (this.field1314 > 0 && arg3 > this.field1305) {
            int var6 = this.field1314 * this.field1314 / (arg2 * 2);
            int var7 = this.field1305 + var6;
            if (arg3 > var7 && this.field1305 <= var7) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field1314 < 0 && arg3 < this.field1305) {
            int var9 = this.field1314 * this.field1314 / (arg2 * 2);
            int var10 = this.field1305 - var9;
            if (var10 > arg3 && var10 <= this.field1305) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (this.field1305 >= arg3) {
                this.field1314 -= arg2;
                if (arg0 != 0 && (-arg0) > this.field1314) {
                    this.field1314 = -arg0;
                }
            } else {
                this.field1314 += arg2;
                if (arg0 != 0 && arg0 < this.field1314) {
                    this.field1314 = arg0;
                }
            }
            if (this.field1314 != var5) {
                int var11 = this.field1314 * this.field1314 / (arg2 * 2);
                if (arg3 > this.field1305) {
                    if (arg3 < this.field1305 + var11) {
                        this.field1314 = var5;
                    }
                } else if (this.field1305 > arg3 && (this.field1305 - var11) < arg3) {
                    this.field1314 = var5;
                }
            }
        } else if (this.field1314 > 0) {
            this.field1314 -= arg2;
            if (this.field1314 < 0) {
                this.field1314 = 0;
            }
        } else {
            this.field1314 += arg2;
            if (this.field1314 > 0) {
                this.field1314 = 0;
            }
        }
        this.field1305 += this.field1314 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)V", line = 234)
    public static void method608(byte arg0) {
        field1313 = null;
        field1306 = null;
        if (arg0 != -28) {
            field1306 = null;
        }
    }
}
