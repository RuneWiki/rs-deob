import java.io.DataInputStream;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class79 extends class297 {

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
    private int field1233 = 16;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    private int field1234 = 0;

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "I")
    private int field1241 = 4096;

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
    private int field1242 = 2000;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "I")
    private int field1244 = 0;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    public static int field1236 = 0;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "Lpk;")
    public static class120 field1232;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "[I")
    public static int[] field1238;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)V", line = 5)
    public static final void method617(byte arg0, int arg1) {
        field1237++;
        if (arg0 <= -16 && class9.field214 == arg1 && arg1 != 0) {
            class335 var2 = class136.field2221[arg1];
            var2.method786(class217.field3370);
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(III)V", line = 23)
    public static final void method618(int arg0, int arg1, int arg2) {
        field1231++;
        if (arg2 == 26822 && class309.method2186(26080, arg1)) {
            class24.method224(arg0, 97, class110.field1789[arg1]);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Ljava/lang/String;", line = 38)
    public static final String method619(int arg0, int arg1) {
        field1239++;
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else {
            if (arg0 <= 89) {
                field1236 = 28;
            }
            return arg1 >= 10000000 ? "<col=00ff80>" + arg1 / 1000000 + class135.field2161 + "</col>" : "<col=ffffff>" + arg1 / 1000 + class155.field2514 + "</col>";
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILaj;)V", line = 57)
    public final void method169(int arg0, int arg1, class1 arg2) {
        if (arg1 != 255) {
            return;
        }
        if (arg0 == 0) {
            this.field1234 = arg2.method15((byte) 114);
        } else if (arg0 == 1) {
            this.field1242 = arg2.method56(19612);
        } else if (arg0 == 2) {
            this.field1233 = arg2.method15((byte) 127);
        } else if (arg0 == 3) {
            this.field1244 = arg2.method56(19612);
        } else if (arg0 == 4) {
            this.field1241 = arg2.method56(19612);
        }
        field1230++;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 381)
    public class79() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZ)[I", line = 131)
    public final int[] method173(int arg0, boolean arg1) {
        field1243++;
        if (!arg1) {
            method622((String) null, (Throwable) null, -55);
        }
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (this.field4760.field388) {
            int var4 = this.field1241 >> 1;
            int[][] var5 = this.field4760.method212((byte) 90);
            Random var6 = new Random((long) this.field1234);
            for (int var7 = 0; var7 < this.field1242; var7++) {
                int var8 = this.field1241 > 0 ? this.field1244 + class64.method509(this.field1241, var6, 79) - var4 : this.field1244;
                int var9 = class64.method509(class31.field491, var6, 84);
                int var10 = class64.method509(class164.field2670, var6, 123);
                int var11 = var8 >> 4 & 0xFF;
                int var12 = (class66.field986[var11] * this.field1233 >> 12) + var9;
                int var13 = (class323.field5065[var11] * this.field1233 >> 12) + var10;
                int var14 = var13 - var10;
                int var15 = var12 - var9;
                if (var15 != 0 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var9;
                        var9 = var10;
                        var10 = var17;
                        int var18 = var12;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var9 > var12) {
                        int var19 = var9;
                        int var20 = var10;
                        var9 = var12;
                        var12 = var19;
                        var10 = var13;
                        var13 = var20;
                    }
                    int var21 = var13 - var10;
                    if (var21 < 0) {
                        var21 = -var21;
                    }
                    int var22 = var12 - var9;
                    int var23 = var10;
                    int var24 = 2048 / var22;
                    int var25 = -var22 / 2;
                    int var26 = var10 < var13 ? 1 : -1;
                    int var27 = 1024 - (class64.method509(4096, var6, 106) >> 2);
                    for (int var28 = var9; var28 < var12; var28++) {
                        var25 += var21;
                        int var29 = (var28 - var9) * var24 + var27 + 1024;
                        int var30 = var23 & class175.field2801;
                        if (var25 > 0) {
                            var23 += var26;
                            var25 += -var22;
                        }
                        int var31 = class257.field3813 & var28;
                        if (var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)V", line = 266)
    public static void method620(byte arg0) {
        field1238 = null;
        if (arg0 != -23) {
            field1232 = (class120) null;
        }
        field1232 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILvb;Lvb;)V", line = 278)
    public static final void method621(int arg0, class60 arg1, class60 arg2) {
        field1240++;
        if (arg1.field880 != null) {
            arg1.method489(false);
        }
        arg1.field891 = arg2;
        arg1.field880 = arg2.field880;
        arg1.field880.field891 = arg1;
        arg1.field891.field880 = arg1;
        if (arg0 != 255) {
            field1236 = 40;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V", line = 308)
    public final void method247(byte arg0) {
        class37.method330((byte) 36);
        field1235++;
        if (arg0 != 68) {
            this.method247((byte) -31);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V", line = 324)
    public static final void method622(String arg0, Throwable arg1, int arg2) {
        field1245++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class154.method1149((byte) 105, arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class244.method1722(var3, (byte) -70);
            String var4 = class213.method1544(":", 36, "%3a", var3);
            String var5 = class213.method1544("@", 112, "%40", var4);
            String var6 = class213.method1544("&", arg2 + 652852865, "%26", var5);
            String var7 = class213.method1544("#", arg2 + 652852912, "%23", var6);
            if (class141.field2280.field1037 == null) {
                return;
            }
            class23 var8 = class141.field2280.method555(-3080, new URL(class141.field2280.field1037.getCodeBase(), "clienterror.ws?c=" + class154.field2502 + "&u=" + class337.field5213 + "&v1=" + class69.field1054 + "&v2=" + class69.field1049 + "&e=" + var7));
            while (var8.field405 == 0) {
                class245.method1729(arg2 ^ 0x26E9BE6A, 1L);
            }
            if (var8.field405 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field409;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
        if (arg2 != -652852820) {
            method619(-89, -44);
        }
    }
}
