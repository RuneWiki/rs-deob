import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class191 extends class120 {

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "[S")
    private short[] field3078 = new short[512];

    @OriginalMember(owner = "client!ob", name = "eb", descriptor = "I")
    private int field3089 = 1;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "I")
    private int field3086 = 0;

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "I")
    private int field3088 = 5;

    @OriginalMember(owner = "client!ob", name = "hb", descriptor = "I")
    private int field3092 = 5;

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "I")
    private int field3087 = 2;

    @OriginalMember(owner = "client!ob", name = "lb", descriptor = "[B")
    private byte[] field3096 = new byte[512];

    @OriginalMember(owner = "client!ob", name = "mb", descriptor = "I")
    private int field3097 = 2048;

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "Lok;")
    public static class41 field3084 = class137.method956("huffman", 45);

    @OriginalMember(owner = "client!ob", name = "jb", descriptor = "I")
    public static int field3094 = -1;

    @OriginalMember(owner = "client!ob", name = "kb", descriptor = "I")
    public static int field3095 = -1;

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!ob", name = "fb", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!ob", name = "gb", descriptor = "I")
    private static int field3091;

    @OriginalMember(owner = "client!ob", name = "ib", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V", line = 62)
    public class191() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(B)V", line = 12)
    public static final void method1371(byte arg0) {
        field3079++;
        if (!class307.field5180) {
            return;
        }
        class307.field5180 = false;
        if (arg0 > 119) {
            class136.field2028 = null;
            class68.field1024 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V", line = 31)
    public final void method31(int arg0) {
        if (arg0 == -31851) {
            field3085++;
            this.field3096 = class146.method1009((byte) -29, this.field3086);
            this.method1373((byte) 4);
        }
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(B)V", line = 46)
    public static void method1372(byte arg0) {
        if (arg0 != -102) {
            field3091 = 29;
        }
        field3084 = null;
    }

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "(B)V", line = 66)
    private final void method1373(byte arg0) {
        field3093++;
        if (arg0 != 4) {
            this.field3089 = 75;
        }
        Random var2 = new Random((long) this.field3086);
        this.field3078 = new short[512];
        if (this.field3097 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field3078[var3] = (short) class91.method640(class26.method169(arg0, 46), this.field3097, var2);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)[I", line = 96)
    public final int[] method14(int arg0, int arg1) {
        field3083++;
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (arg1 != -14959) {
            this.method30((class112) null, 11, -77);
        }
        if (this.field1775.field1798) {
            int var4 = class16.field216[arg0] * this.field3092 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class307.field5160; var7++) {
                class23.field357 = Integer.MAX_VALUE;
                class123.field1834 = Integer.MAX_VALUE;
                field3091 = Integer.MAX_VALUE;
                class277.field4543 = Integer.MAX_VALUE;
                int var8 = class203.field3278[var7] * this.field3088 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field3096[(this.field3092 <= var11 ? var11 - this.field3092 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field3096[var12 + (this.field3088 <= var13 ? var13 - this.field3088 : var13) & 0xFF] & 0xFF) * 2;
                        int var10001 = -(var13 << 12);
                        int var27 = var14 + 1;
                        int var15 = var8 + var10001 - this.field3078[var14];
                        int var16 = var4 - (var11 << 12) - this.field3078[var27];
                        int var17 = this.field3089;
                        int var20;
                        if (var17 == 1) {
                            var20 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var18 = var16 < 0 ? -var16 : var16;
                            int var19 = var15 < 0 ? -var15 : var15;
                            var20 = var19 > var18 ? var19 : var18;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var20 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var24 = var16 * var16;
                            int var25 = var15 * var15;
                            var20 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var24 + var25) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var20 = (var15 < 0 ? -var15 : var15) + (var16 < 0 ? -var16 : var16);
                        } else {
                            var20 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var20 < class277.field4543) {
                            class23.field357 = class123.field1834;
                            class123.field1834 = field3091;
                            field3091 = class277.field4543;
                            class277.field4543 = var20;
                        } else if (field3091 > var20) {
                            class23.field357 = class123.field1834;
                            class123.field1834 = field3091;
                            field3091 = var20;
                        } else if (class123.field1834 > var20) {
                            class23.field357 = class123.field1834;
                            class123.field1834 = var20;
                        } else if (class23.field357 > var20) {
                            class23.field357 = var20;
                        }
                    }
                }
                int var26 = this.field3087;
                if (var26 == 0) {
                    var3[var7] = class277.field4543;
                } else if (var26 == 1) {
                    var3[var7] = field3091;
                } else if (var26 == 3) {
                    var3[var7] = class123.field1834;
                } else if (var26 == 4) {
                    var3[var7] = class23.field357;
                } else if (var26 == 2) {
                    var3[var7] = field3091 - class277.field4543;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V", line = 305)
    public static final void method1374(int arg0) {
        class232.field3661 = null;
        class57.field819 = (int[][][]) null;
        if (arg0 != 8736) {
            field3081 = 106;
        }
        class224.field3586 = (byte[][][]) null;
        class151.field2347 = null;
        class277.field4542 = (byte[][][]) null;
        class59.field843 = null;
        class69.field1043 = (byte[][][]) null;
        class276.field4521 = (byte[][][]) null;
        class27.field404 = null;
        field3090++;
        class101.field1442 = null;
        class314.field5301 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Llb;II)V", line = 335)
    public final void method30(class112 arg0, int arg1, int arg2) {
        field3082++;
        if (arg2 == 0) {
            this.field3088 = this.field3092 = arg0.method792(2);
        } else if (arg2 == 1) {
            this.field3086 = arg0.method792(2);
        } else if (arg2 == 2) {
            this.field3097 = arg0.method759((byte) -121);
        } else if (arg2 == 3) {
            this.field3087 = arg0.method792(2);
        } else if (arg2 == 4) {
            this.field3089 = arg0.method792(2);
        } else if (arg2 == 5) {
            this.field3088 = arg0.method792(2);
        } else if (arg2 == 6) {
            this.field3092 = arg0.method792(2);
        }
        if (arg1 != -1) {
            method1372((byte) -17);
        }
    }
}
