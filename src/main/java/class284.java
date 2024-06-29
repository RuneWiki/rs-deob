import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class284 extends class285 {

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    private int field4542 = 0;

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "I")
    private int field4550 = 10;

    @OriginalMember(owner = "client!jg", name = "cb", descriptor = "I")
    private int field4555 = 2048;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "Ljava/lang/String;")
    public static String field4541 = "Connection lost.";

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "Ljava/lang/String;")
    public static String field4547 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "I")
    public static int field4548 = 0;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!jg", name = "Z", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!jg", name = "bb", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!jg", name = "ab", descriptor = "[I")
    private int[] field4553;

    @OriginalMember(owner = "client!jg", name = "db", descriptor = "[I")
    private int[] field4556;

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V", line = 4)
    public class284() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "(I)V", line = 13)
    public final void method361(int arg0) {
        field4549++;
        this.method2039(13068);
        int var2 = -19 % ((42 - arg0) / 36);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)[I", line = 26)
    public final int[] method60(boolean arg0, int arg1) {
        if (!arg0) {
            this.method63(true, (class44) null, 77);
        }
        field4544++;
        int[] var3 = this.field4573.method1116(110, arg1);
        if (this.field4573.field2420) {
            int var4 = class27.field382[arg1];
            if (this.field4542 == 0) {
                short var11 = 0;
                for (int var12 = 0; var12 < this.field4550; var12++) {
                    if (var4 >= this.field4553[var12] && this.field4553[var12 + 1] > var4) {
                        if (this.field4556[var12] > var4) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class9.method49(var3, 0, class287.field4599, var11);
            } else {
                for (int var5 = 0; var5 < class287.field4599; var5++) {
                    short var6 = 0;
                    int var7 = 0;
                    int var8 = class48.field669[var5];
                    int var9 = this.field4542;
                    if (var9 == 1) {
                        var7 = var8;
                    } else if (var9 == 2) {
                        var7 = (var8 - (4096 - var4) >> 1) + 2048;
                    } else if (var9 == 3) {
                        var7 = (var8 - var4 >> 1) + 2048;
                    }
                    for (int var10 = 0; var10 < this.field4550; var10++) {
                        if (this.field4553[var10] <= var7 && var7 < this.field4553[var10 + 1]) {
                            if (this.field4556[var10] > var7) {
                                var6 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZLjj;I)V", line = 145)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        field4545++;
        if (arg2 == 0) {
            this.field4550 = arg1.method286((byte) -72);
        } else if (arg2 == 1) {
            this.field4555 = arg1.method271(21081);
        } else if (arg2 == 2) {
            this.field4542 = arg1.method286((byte) -68);
        }
        if (!arg0) {
            this.method2039(62);
        }
    }

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "(I)V", line = 195)
    private final void method2039(int arg0) {
        this.field4556 = new int[this.field4550 + 1];
        field4546++;
        this.field4553 = new int[this.field4550 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field4550;
        int var4 = this.field4555 * var3 >> 12;
        int var5 = 0;
        if (arg0 != 13068) {
            this.field4542 = 62;
        }
        while (this.field4550 > var5) {
            this.field4553[var5] = var2;
            this.field4556[var5] = var2 + var4;
            var2 += var3;
            var5++;
        }
        this.field4553[this.field4550] = 4096;
        this.field4556[this.field4550] = this.field4556[0] + 4096;
    }

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "(I)V", line = 227)
    public static final void method2040(int arg0) {
        class192.field3138 = arg0;
        field4552++;
        class24.field330 = 0;
        class29.method168(arg0 ^ 0x1);
        class214.method1539(arg0 + 109);
        class228.method1613(-9797);
        class115.method794(106);
        for (int var1 = 0; var1 < class24.field330; var1++) {
            int var2 = class117.field1773[var1];
            if (class240.field3818 != class74.field1049[var2].field4204) {
                if (class74.field1049[var2].field5226 > 0) {
                    class315.method2214(class74.field1049[var2], 0);
                }
                class74.field1049[var2] = null;
            }
        }
        if (class219.field3540 != class247.field3898.field586) {
            throw new RuntimeException("gpp1 pos:" + class247.field3898.field586 + " psize:" + class219.field3540);
        }
        for (int var3 = 0; var3 < class275.field4435; var3++) {
            if (class74.field1049[class160.field2656[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class275.field4435);
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lak;II)Z", line = 277)
    public static final boolean method2041(class172 arg0, int arg1, int arg2) {
        field4543++;
        byte[] var3 = arg0.method1292(false, arg2);
        if (var3 == null) {
            return false;
        } else {
            int var4 = -61 % ((arg1 + 54) / 32);
            class145.method1077((byte) -65, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(Z)Lt;", line = 300)
    public static final class339 method2042(boolean arg0) {
        if (!arg0) {
            method2042(true);
        }
        field4551++;
        return class340.field5293.length <= class81.field1130 ? null : class340.field5293[class81.field1130++];
    }

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "(I)V", line = 315)
    public static void method2043(int arg0) {
        if (arg0 == 2048) {
            field4547 = null;
            field4541 = null;
        }
    }
}
