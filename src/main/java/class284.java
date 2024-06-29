import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class284 extends class182 {

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "[S")
    private short[] field4631 = new short[257];

    @OriginalMember(owner = "client!tf", name = "bb", descriptor = "I")
    private int field4649 = 0;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "Z")
    public static volatile boolean field4635 = false;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public static int field4633 = -1;

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "I")
    public static int field4641 = 0;

    @OriginalMember(owner = "client!tf", name = "U", descriptor = "I")
    public static int field4642 = -1;

    @OriginalMember(owner = "client!tf", name = "X", descriptor = "Ljava/lang/String;")
    public static String field4645 = "Loading - please wait.";

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4638 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!tf", name = "ib", descriptor = "I")
    public static int field4656 = 0;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!tf", name = "V", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!tf", name = "W", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!tf", name = "Y", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!tf", name = "ab", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!tf", name = "cb", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!tf", name = "eb", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!tf", name = "fb", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!tf", name = "gb", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!tf", name = "hb", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!tf", name = "db", descriptor = "Lek;")
    public static class206 field4651;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "[I")
    public static int[] field4632;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "[I")
    private int[] field4637;

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "[I")
    private int[] field4640;

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "[[I")
    private int[][] field4639;

    @OriginalMember(owner = "client!tf", name = "Z", descriptor = "[[Z")
    public static boolean[][] field4647;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(II)V", line = 7)
    public static final void method2013(int arg0, int arg1) {
        field4654++;
        if (arg0 != 4514) {
            field4641 = 3;
        }
        for (class70 var2 = class223.field3682.method2345((byte) -105); var2 != null; var2 = class223.field3682.method2336(arg0 ^ 0xFFFFEE3B)) {
            if ((var2.field1291 >> 48 & 0xFFFFL) == ((long) arg1)) {
                var2.method535(-2801);
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Loe;IB)V", line = 29)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg2 != 60) {
            return;
        }
        if (arg1 == 0) {
            this.field4649 = arg0.method1005((byte) 122);
            this.field4639 = new int[arg0.method1005((byte) 122)][2];
            for (int var4 = 0; var4 < this.field4639.length; var4++) {
                this.field4639[var4][0] = arg0.method989(71);
                this.field4639[var4][1] = arg0.method989(class115.method856(arg2, 78));
            }
        }
        field4648++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lqc;II)V", line = 57)
    public static final void method2014(class6 arg0, int arg1, int arg2) {
        if (class267.field4371 < arg0.field172) {
            class94.method715(arg0, arg2 ^ 0x8D);
        } else if (class267.field4371 > arg0.field161) {
            class18.method176(-1, arg0);
        } else {
            class52.method457(-17068, arg0);
        }
        if (arg0.field199 < 128 || arg0.field213 < 128 || arg0.field199 >= 13184 || arg0.field213 >= 13184) {
            arg0.field161 = 0;
            arg0.field166 = -1;
            arg0.field172 = 0;
            arg0.field127 = -1;
            arg0.field199 = arg0.field139[0] * 128 + (arg0.method49((byte) -106) * 64);
            arg0.field213 = arg0.field170[0] * 128 + arg0.method49((byte) -100) * 64;
            arg0.method52((byte) -90);
        }
        field4655++;
        if (arg2 != 255) {
            field4642 = -120;
        }
        if (class96.field1750 == arg0 && (arg0.field199 < 1536 || arg0.field213 < 1536 || arg0.field199 >= 11776 || arg0.field213 >= 11776)) {
            arg0.field172 = 0;
            arg0.field161 = 0;
            arg0.field166 = -1;
            arg0.field127 = -1;
            arg0.field199 = arg0.field139[0] * 128 + (arg0.method49((byte) 59) * 64);
            arg0.field213 = arg0.field170[0] * 128 + (arg0.method49((byte) 114) * 64);
            arg0.method52((byte) -58);
        }
        class199.method1364(arg0, true);
        class15.method156(-13351, arg0);
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V", line = 107)
    public class284() {
        super(1, true);
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V", line = 119)
    private final void method2015(byte arg0) {
        int var2 = -59 % ((62 - arg0) / 59);
        field4643++;
        int var3 = this.field4649;
        if (var3 == 2) {
            for (int var21 = 0; var21 < 257; var21++) {
                int var22 = var21 << 4;
                int var23;
                for (var23 = 1; (this.field4639.length - 1) > var23 && var22 >= this.field4639[var23][0]; var23++) {
                }
                int[] var24 = this.field4639[var23];
                int[] var25 = this.field4639[var23 - 1];
                int var26 = this.method2019(var23 - 2, true)[1];
                int var27 = var25[1];
                int var28 = var24[1];
                int var29 = this.method2019(var23 + 1, true)[1];
                int var30 = (var22 - var25[0] << 12) / (var24[0] - var25[0]);
                int var31 = var30 * var30 >> 12;
                int var33 = var29 + var27 - var28 - var26;
                int var34 = var28 - var26;
                int var35 = var26 - var27 - var33;
                int var36 = (var30 * var33 >> 12) * var31 >> 12;
                int var37 = var31 * var35 >> 12;
                int var38 = var30 * var34 >> 12;
                int var39 = var36 + var37 + var27 + var38;
                if (var39 <= -32768) {
                    var39 = -32767;
                }
                if (var39 >= 32768) {
                    var39 = 32767;
                }
                this.field4631[var21] = (short) var39;
            }
        } else if (var3 == 1) {
            for (int var12 = 0; var12 < 257; var12++) {
                int var13 = var12 << 4;
                int var14;
                for (var14 = 1; (this.field4639.length - 1) > var14 && var13 >= this.field4639[var14][0]; var14++) {
                }
                int[] var15 = this.field4639[var14];
                int[] var16 = this.field4639[var14 - 1];
                int var17 = (var13 - var16[0] << 12) / (var15[0] - var16[0]);
                int var18 = 4096 - class107.field1937[var17 >> 5 & 0xFF] >> 1;
                int var19 = 4096 - var18;
                int var20 = var15[1] * var18 + var16[1] * var19 >> 12;
                if (var20 <= -32768) {
                    var20 = -32767;
                }
                if (var20 >= 32768) {
                    var20 = 32767;
                }
                this.field4631[var12] = (short) var20;
            }
        } else {
            for (int var4 = 0; var4 < 257; var4++) {
                int var5 = var4 << 4;
                int var6;
                for (var6 = 1; var6 < (this.field4639.length - 1) && this.field4639[var6][0] <= var5; var6++) {
                }
                int[] var7 = this.field4639[var6 - 1];
                int[] var8 = this.field4639[var6];
                int var9 = (var5 - var7[0] << 12) / (var8[0] - var7[0]);
                int var10 = 4096 - var9;
                int var11 = var7[1] * var10 + var8[1] * var9 >> 12;
                if (var11 <= -32768) {
                    var11 = -32767;
                }
                if (var11 >= 32768) {
                    var11 = 32767;
                }
                this.field4631[var4] = (short) var11;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZB)V", line = 297)
    public static final void method2016(boolean arg0, byte arg1) {
        field4652++;
        int var2 = class341.field5405.length;
        byte[][] var3;
        if (class241.field4016 && arg0) {
            var3 = class148.field2516;
        } else {
            var3 = class46.field920;
        }
        if (arg1 <= 56) {
            method2021(115, -22, -1, -64, -27, 74, 123, -107);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            byte[] var5 = var3[var4];
            if (var5 != null) {
                int var6 = (class127.field2221[var4] >> 8) * 64 - class272.field4426;
                int var7 = (class127.field2221[var4] & 0xFF) * 64 - class21.field543;
                class119.method865(-4097);
                class289.method2057(arg0, 110, var5, class23.field576, var6, var7);
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)[I", line = 348)
    public final int[] method125(int arg0, int arg1) {
        if (arg0 != 2) {
            field4633 = 73;
        }
        int[] var3 = this.field3166.method775(arg1, arg0 + 125);
        if (this.field3166.field1903) {
            int[] var4 = this.method1292(arg1, 0, arg0 - 110);
            for (int var5 = 0; var5 < class26.field672; var5++) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field4631[var6];
            }
        }
        field4636++;
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "(I)V", line = 388)
    private final void method2017(int arg0) {
        field4653++;
        if (arg0 != 15880) {
            this.field4631 = (short[]) null;
        }
        int[] var2 = this.field4639[0];
        int[] var3 = this.field4639[1];
        int[] var4 = this.field4639[this.field4639.length - 2];
        int[] var5 = this.field4639[this.field4639.length - 1];
        this.field4640 = new int[] { var4[0] + var4[0] - var5[0], -var5[1] - -var4[1] + var4[1] };
        this.field4637 = new int[] { var2[0] + var2[0] - var3[0], var2[1] - (var3[1] - var2[1]) };
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)V", line = 412)
    public static final void method2018(byte arg0) {
        class117.field2087 = 0;
        class91.field1613 = 0;
        class317.method2286(true);
        class302.method2159((byte) -62);
        class140.method968((byte) 60);
        field4634++;
        class75.method576((byte) -113);
        if (arg0 != 83) {
            field4645 = (String) null;
        }
        for (int var1 = 0; var1 < class117.field2087; var1++) {
            int var2 = class28.field685[var1];
            if (class267.field4371 != class182.field3151[var2].field221) {
                if (class182.field3151[var2].field1799 > 0) {
                    class318.method2289(var2, class182.field3151[var2], arg0 + 278577501);
                }
                class182.field3151[var2] = null;
            }
        }
        if (class205.field3414 != class342.field5413.field2435) {
            throw new RuntimeException("gpp1 pos:" + class342.field5413.field2435 + " psize:" + class205.field3414);
        }
        for (int var3 = 0; var3 < class252.field4144; var3++) {
            if (class182.field3151[class22.field556[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class252.field4144);
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)[I", line = 464)
    private final int[] method2019(int arg0, boolean arg1) {
        field4650++;
        if (arg0 < 0) {
            return this.field4637;
        } else {
            if (!arg1) {
                method2016(true, (byte) -77);
            }
            return this.field4639.length > arg0 ? this.field4639[arg0] : this.field4640;
        }
    }

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "(I)V", line = 483)
    public static void method2020(int arg0) {
        field4638 = null;
        if (arg0 != 1441278124) {
            method2018((byte) 54);
        }
        field4651 = null;
        field4647 = (boolean[][]) null;
        field4645 = null;
        field4632 = null;
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)V", line = 497)
    public final void method163(int arg0) {
        if (this.field4639 == null) {
            this.field4639 = new int[][] { { 0, 0 }, { 4096, 4096 } };
        }
        field4630++;
        if (this.field4639.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        }
        if (arg0 != 100) {
            this.method126((class146) null, 118, (byte) 29);
        }
        if (this.field4649 == 2) {
            this.method2017(arg0 + 15780);
        }
        class219.method1526(arg0 ^ 0x164);
        this.method2015((byte) 123);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIII)V", line = 544)
    public static final void method2021(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4644++;
        int var8 = class114.method842(class87.field1520, (byte) -124, arg3, class177.field2930);
        int var9 = class114.method842(class87.field1520, (byte) -31, arg2, class177.field2930);
        int var10 = class114.method842(class190.field3224, (byte) -55, arg1, class289.field4704);
        int var11 = class114.method842(class190.field3224, (byte) -116, arg4, class289.field4704);
        int var12 = class114.method842(class87.field1520, (byte) -31, arg3 + arg5, class177.field2930);
        int var13 = class114.method842(class87.field1520, (byte) -103, arg2 - arg5, class177.field2930);
        for (int var14 = var8; var14 < var12; var14++) {
            class344.method2417(class232.field3799[var14], var10, var11, arg0, (byte) -128);
        }
        if (arg6 != 27809) {
            return;
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class344.method2417(class232.field3799[var15], var10, var11, arg0, (byte) -124);
        }
        int var16 = class114.method842(class190.field3224, (byte) -98, arg1 + arg5, class289.field4704);
        int var17 = class114.method842(class190.field3224, (byte) -39, arg4 - arg5, class289.field4704);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class232.field3799[var18];
            class344.method2417(var19, var10, var16, arg0, (byte) -120);
            class344.method2417(var19, var16, var17, arg7, (byte) -125);
            class344.method2417(var19, var17, var11, arg0, (byte) -121);
        }
    }
}
