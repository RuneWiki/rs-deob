import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class549 {

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "Z")
    public boolean field8084 = true;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    private int field8089 = -1;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "Lcba;")
    private class81 field8080;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    private int field8083;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "I")
    private int field8092;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "Lum;")
    private class528 field8082;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public int field8088;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "Lfj;")
    private class75 field8076;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
    private int field8091;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    private int field8090;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "Lip;")
    private class532 field8094;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field8077 = 0;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "Lau;")
    public static class692 field8078 = new class692(4);

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field8079;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field8081;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field8085;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field8086;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field8087;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "Lhd;")
    public static class310 field8093;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 4)
    public final void method3202(int arg0) {
        field8087++;
        if (arg0 < 6) {
            this.field8076 = null;
        }
        this.method3207(this.field8094, this.field8088, 0);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 15)
    private final void method3203(byte arg0) {
        field8085++;
        if (!this.field8084) {
            return;
        }
        this.field8084 = false;
        byte[] var2 = this.field8080.field1303;
        int var3 = 0;
        int var4 = this.field8080.field1312;
        int var5 = this.field8080.field1312 * this.field8092 + this.field8083;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field8076 != null && this.field8089 == var3) {
            this.field8084 = false;
            return;
        }
        this.field8089 = var3;
        int var7 = 0;
        if (arg0 <= 119) {
            method3206(-128);
        }
        int var8 = this.field8092 * var4 + this.field8083;
        if (!this.field8082.method780(class592.field8601, class106.field1573, -104)) {
            if (class397.field6004 == null) {
                class397.field6004 = new int[16384];
            }
            int[] var9 = class397.field6004;
            for (int var10 = -128; var10 < 0; var10++) {
                for (int var11 = -128; var11 < 0; var11++) {
                    if (var2[var8] == 0) {
                        int var12 = 0;
                        if (var2[var8 - 1] != 0) {
                            var12++;
                        }
                        if (var2[var8 + 1] != 0) {
                            var12++;
                        }
                        if (var2[var8 - var4] != 0) {
                            var12++;
                        }
                        if (var2[var4 + var8] != 0) {
                            var12++;
                        }
                        var9[var7++] = var12 * 17 << 24;
                    } else {
                        var9[var7++] = 1140850688;
                    }
                    var8++;
                }
                var8 += this.field8080.field1312 - 128;
            }
            if (this.field8076 == null) {
                this.field8076 = this.field8082.method3035(128, 128, (byte) -50, false, class397.field6004);
                this.field8076.method432(false, false, (byte) 99);
            } else {
                this.field8076.method430(128, 0, class397.field6004, 0, 128, 0, 128, 42);
            }
            return;
        }
        if (class678.field9600 == null) {
            class678.field9600 = new byte[16384];
        }
        byte[] var13 = class678.field9600;
        for (int var14 = -128; var14 < 0; var14++) {
            for (int var15 = -128; var15 < 0; var15++) {
                if (var2[var8] == 0) {
                    int var16 = 0;
                    if (var2[var8 - 1] != 0) {
                        var16++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var16++;
                    }
                    if (var2[var8 - var4] != 0) {
                        var16++;
                    }
                    if (var2[var4 + var8] != 0) {
                        var16++;
                    }
                    var13[var7++] = (byte) (var16 * 17);
                } else {
                    var13[var7++] = 68;
                }
                var8++;
            }
            var8 += this.field8080.field1312 - 128;
        }
        if (this.field8076 == null) {
            this.field8076 = this.field8082.method3009(class678.field9600, (byte) 62, 128, false, class592.field8601, 128);
            this.field8076.method432(false, false, (byte) 89);
        } else {
            this.field8076.method434(128, 128, 0, 128, 0, 0, class678.field9600, class592.field8601, -11100);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V", line = 192)
    public static final void method3204(boolean arg0) {
        field8086++;
        if (class348.field5160 != null) {
            return;
        }
        int var1 = class189.field2573;
        int var2 = class356.field5273;
        if (arg0) {
            return;
        }
        int var3 = class173.field2443 - class454.field6538 - var1;
        int var4 = class300.field4447 - class425.field6218 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class388.field5808 != null) {
                var5 = class388.field5808;
            } else if (class551.field8116 == null) {
                var5 = class679.field9602;
            } else {
                var5 = class551.field8116;
            }
            int var6 = 0;
            int var7 = 0;
            if (class388.field5808 == var5) {
                Insets var8 = class388.field5808.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class300.field4447);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class173.field2443, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class173.field2443 - var3, var7, var3, class300.field4447);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class300.field4447 + var7 - var4, class173.field2443, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V", line = 263)
    public static void method3205(int arg0) {
        field8093 = null;
        field8078 = null;
        if (arg0 != Integer.MAX_VALUE) {
            field8078 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lum;Lcba;Lom;IIIII)V", line = 343)
    public class549(class528 arg0, class81 arg1, class351 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field8080 = arg1;
        this.field8083 = arg6;
        this.field8092 = arg7;
        this.field8082 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field9628 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field5213[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field8088 = 0;
            this.field8076 = null;
        } else {
            this.field8091 = Integer.MIN_VALUE;
            this.field8090 = Integer.MAX_VALUE;
            this.field8094 = this.field8082.method800(false, -25475);
            this.field8094.method984(var10, 125);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field8094.method985((byte) -65, true);
                if (var15 != null) {
                    Stream var16 = this.field8082.method3038(-10641, var15);
                    if (Stream.method2077()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field9628 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field5213[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (this.field8091 < var28) {
                                            this.field8091 = var28;
                                        }
                                        if (this.field8090 > var28) {
                                            this.field8090 = var28;
                                        }
                                        var16.method2083(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field9628 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field5213[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (var22 < this.field8090) {
                                            this.field8090 = var22;
                                        }
                                        if (this.field8091 < var22) {
                                            this.field8091 = var22;
                                        }
                                        var16.method2080(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method2084();
                    if (this.field8094.method986(true)) {
                        break;
                    }
                }
            }
            this.field8088 = var10 / 3;
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V", line = 286)
    public static final void method3206(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field8081++;
        if (class199.field2714 != null) {
            class199.field2714.method3315(85);
        }
        if (class81.field1298 == null) {
            return;
        }
        while (true) {
            try {
                class81.field1298.join();
                return;
            } catch (InterruptedException var1) {
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lip;II)V", line = 316)
    public final void method3207(class532 arg0, int arg1, int arg2) {
        field8079++;
        if (arg2 < arg1) {
            this.method3203((byte) 126);
            this.field8082.method3011(-127, this.field8076);
            this.field8082.method756(0, this.field8091 + 1 - this.field8090, 11897, class433.field6280, arg1, arg0, this.field8090);
        }
    }
}
