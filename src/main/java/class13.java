import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class13 extends class262 {

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
    private int field236 = 1;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "[S")
    private short[] field238 = new short[512];

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    private int field240 = 0;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    private int field237 = 5;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
    private int field242 = 2;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "[B")
    private byte[] field239 = new byte[512];

    @OriginalMember(owner = "client!kh", name = "fb", descriptor = "I")
    private int field252 = 2048;

    @OriginalMember(owner = "client!kh", name = "jb", descriptor = "I")
    private int field256 = 5;

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "Lhd;")
    public static class117 field244 = new class117(50);

    @OriginalMember(owner = "client!kh", name = "gb", descriptor = "I")
    public static int field253 = 1;

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "I")
    public static int field248 = 0;

    @OriginalMember(owner = "client!kh", name = "hb", descriptor = "Lr;")
    public static class264 field254 = null;

    @OriginalMember(owner = "client!kh", name = "db", descriptor = "Lhd;")
    public static class117 field250 = new class117(64);

    @OriginalMember(owner = "client!kh", name = "eb", descriptor = "F")
    public static float field251;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!kh", name = "Y", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!kh", name = "kb", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!kh", name = "ib", descriptor = "[Lan;")
    public static class315[] field255;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)V", line = 4)
    private final void method75(int arg0) {
        field247++;
        Random var2 = new Random((long) this.field240);
        if (arg0 <= 83) {
            return;
        }
        this.field238 = new short[512];
        if (this.field252 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field238[var3] = (short) class9.method66(-482656096, this.field252, var2);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lwe;II)V", line = 49)
    public final void method40(class47 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field256 = this.field237 = arg0.method368(40);
        } else if (arg2 == 1) {
            this.field240 = arg0.method368(-105);
        } else if (arg2 == 2) {
            this.field252 = arg0.method379(-2);
        } else if (arg2 == 3) {
            this.field242 = arg0.method368(54);
        } else if (arg2 == 4) {
            this.field236 = arg0.method368(88);
        } else if (arg2 == 5) {
            this.field256 = arg0.method368(-112);
        } else if (arg2 == 6) {
            this.field237 = arg0.method368(51);
        }
        if (arg1 != 2048) {
            method76(38, (byte) -124, 37, (class234) null);
        }
        field249++;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V", line = 109)
    public class13() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBILtd;)V", line = 116)
    public static final void method76(int arg0, byte arg1, int arg2, class234 arg3) {
        field241++;
        int var4 = -68 % ((arg1 - 70) / 50);
        if (arg3.field5408 == arg0 && arg0 != -1) {
            class287 var5 = class306.method2156(123, arg0);
            int var6 = var5.field4917;
            if (var6 == 1) {
                arg3.field5443 = 0;
                arg3.field5391 = 0;
                arg3.field5427 = 0;
                arg3.field5438 = arg2;
                class11.method70(false, class102.field1639 == arg3, var5, arg3.field5409, arg3.field5443, arg3.field5380);
            }
            if (var6 == 2) {
                arg3.field5427 = 0;
            }
        } else if (arg0 == -1 || arg3.field5408 == -1 || class306.method2156(121, arg0).field4907 >= class306.method2156(122, arg3.field5408).field4907) {
            arg3.field5438 = arg2;
            arg3.field5443 = 0;
            arg3.field5427 = 0;
            arg3.field5408 = arg0;
            arg3.field5391 = 0;
            arg3.field5431 = arg3.field5424;
            if (arg3.field5408 != -1) {
                class11.method70(false, class102.field1639 == arg3, class306.method2156(127, arg3.field5408), arg3.field5409, arg3.field5443, arg3.field5380);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)V", line = 174)
    public static void method77(int arg0) {
        field255 = null;
        field244 = null;
        field254 = null;
        if (arg0 >= -42) {
            field248 = 119;
        }
        field250 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)[I", line = 189)
    public final int[] method38(int arg0, byte arg1) {
        if (arg1 >= -85) {
            field251 = -0.15760565F;
        }
        field257++;
        int[] var3 = this.field4350.method1532(arg0, (byte) 98);
        if (this.field4350.field3333) {
            int var4 = class312.field5326[arg0] * this.field237 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class98.field1598; var7++) {
                class268.field4612 = Integer.MAX_VALUE;
                class210.field3479 = Integer.MAX_VALUE;
                class118.field1915 = Integer.MAX_VALUE;
                class305.field5212 = Integer.MAX_VALUE;
                int var8 = class210.field3485[var7] * this.field256 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field239[(var11 < this.field237 ? var11 : var11 - this.field237) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field239[(var13 < this.field256 ? var13 : var13 - this.field256) + var12 & 0xFF] & 0xFF) * 2;
                        int var10000 = -(var13 << 12);
                        int var27 = var14 + 1;
                        int var15 = var10000 + var8 - this.field238[var14];
                        int var16 = var4 - this.field238[var27] - (var11 << 12);
                        int var17 = this.field236;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var24 = var16 < 0 ? -var16 : var16;
                            int var25 = var15 < 0 ? -var15 : var15;
                            var18 = var24 >= var25 ? var24 : var25;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var18 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var19 = var15 * var15;
                            int var20 = var16 * var16;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var19 + var20) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var15 < 0 ? -var15 : var15) + (var16 < 0 ? -var16 : var16);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var18 < class305.field5212) {
                            class268.field4612 = class210.field3479;
                            class210.field3479 = class118.field1915;
                            class118.field1915 = class305.field5212;
                            class305.field5212 = var18;
                        } else if (var18 < class118.field1915) {
                            class268.field4612 = class210.field3479;
                            class210.field3479 = class118.field1915;
                            class118.field1915 = var18;
                        } else if (class210.field3479 > var18) {
                            class268.field4612 = class210.field3479;
                            class210.field3479 = var18;
                        } else if (var18 < class268.field4612) {
                            class268.field4612 = var18;
                        }
                    }
                }
                int var26 = this.field242;
                if (var26 == 0) {
                    var3[var7] = class305.field5212;
                } else if (var26 == 1) {
                    var3[var7] = class118.field1915;
                } else if (var26 == 3) {
                    var3[var7] = class210.field3479;
                } else if (var26 == 4) {
                    var3[var7] = class268.field4612;
                } else if (var26 == 2) {
                    var3[var7] = class118.field1915 - class305.field5212;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)V", line = 406)
    public final void method43(int arg0) {
        field246++;
        this.field239 = class211.method1584(this.field240, (byte) 93);
        if (arg0 == -2) {
            this.method75(arg0 ^ 0xFFFFFF89);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lwe;I)Lec;", line = 429)
    public static final class36 method78(class47 arg0, int arg1) {
        if (arg1 == 5) {
            field245++;
            return new class36(arg0.method343(arg1 + 26162), arg0.method343(arg1 ^ 0x6632), arg0.method343(26167), arg0.method343(26167), arg0.method389((byte) 14), arg0.method368(94));
        } else {
            return (class36) null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(III)V", line = 451)
    public static final void method79(int arg0, int arg1, int arg2) {
        class143.field2385 = true;
        class262.field4354 = arg0;
        class113.field1834 = arg1;
        class206.field3419 = arg2;
        class157.field2652 = -1;
        class313.field5337 = -1;
    }
}
