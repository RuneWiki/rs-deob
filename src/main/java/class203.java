import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class203 extends class152 {

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    private int field3468 = 1;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    private int field3474 = 2048;

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "I")
    private int field3479 = 2;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "[S")
    private short[] field3473 = new short[512];

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "[B")
    private byte[] field3470 = new byte[512];

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "I")
    private int field3481 = 0;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "I")
    private int field3472 = 5;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    private int field3476 = 5;

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "Lml;")
    public static class160 field3480 = new class160(64);

    @OriginalMember(owner = "client!jb", name = "gb", descriptor = "Lvc;")
    public static class129 field3483 = new class129();

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!jb", name = "fb", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(B)V", line = 4)
    private final void method1429(byte arg0) {
        field3469++;
        Random var2 = new Random((long) this.field3481);
        this.field3473 = new short[512];
        if (this.field3474 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field3473[var3] = (short) class244.method1675(var2, (byte) 110, this.field3474);
            }
        }
        if (arg0 < 80) {
            field3483 = (class129) null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)[I", line = 43)
    public final int[] method6(boolean arg0, int arg1) {
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (!arg0) {
            this.method2((byte) 110);
        }
        field3475++;
        if (this.field2776.field4516) {
            int var4 = class122.field2038[arg1] * this.field3476 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class244.field4133; var7++) {
                class209.field3591 = Integer.MAX_VALUE;
                class143.field2606 = Integer.MAX_VALUE;
                class45.field690 = Integer.MAX_VALUE;
                class317.field5433 = Integer.MAX_VALUE;
                int var8 = (class29.field406[var7] * this.field3472) + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field3470[(this.field3476 <= var11 ? var11 - this.field3476 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field3470[var12 + (this.field3472 > var13 ? var13 : var13 - this.field3472) & 0xFF] & 0xFF) * 2;
                        int var27 = var14 + 1;
                        int var15 = var8 - this.field3473[var14] - (var13 << 12);
                        int var16 = var4 - this.field3473[var27] - (var11 << 12);
                        int var17 = this.field3468;
                        int var21;
                        if (var17 == 1) {
                            var21 = var15 * var15 + var16 * var16 >> 12;
                        } else if (var17 == 3) {
                            int var24 = var16 < 0 ? -var16 : var16;
                            int var25 = var15 < 0 ? -var15 : var15;
                            var21 = var24 < var25 ? var25 : var24;
                        } else if (var17 == 4) {
                            int var18 = (int) (Math.sqrt((double) ((float) (var15 < 0 ? -var15 : var15) / 4096.0F)) * 4096.0D);
                            int var19 = (int) (Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                            int var20 = var18 + var19;
                            var21 = var20 * var20 >> 12;
                        } else if (var17 == 5) {
                            int var22 = var16 * var16;
                            int var23 = var15 * var15;
                            var21 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var22 + var23) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var21 = (var16 >= 0 ? var16 : -var16) + (var15 < 0 ? -var15 : var15);
                        } else {
                            var21 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (class317.field5433 > var21) {
                            class209.field3591 = class143.field2606;
                            class143.field2606 = class45.field690;
                            class45.field690 = class317.field5433;
                            class317.field5433 = var21;
                        } else if (var21 < class45.field690) {
                            class209.field3591 = class143.field2606;
                            class143.field2606 = class45.field690;
                            class45.field690 = var21;
                        } else if (var21 < class143.field2606) {
                            class209.field3591 = class143.field2606;
                            class143.field2606 = var21;
                        } else if (class209.field3591 > var21) {
                            class209.field3591 = var21;
                        }
                    }
                }
                int var26 = this.field3479;
                if (var26 == 0) {
                    var3[var7] = class317.field5433;
                } else if (var26 == 1) {
                    var3[var7] = class45.field690;
                } else if (var26 == 3) {
                    var3[var7] = class143.field2606;
                } else if (var26 == 4) {
                    var3[var7] = class209.field3591;
                } else if (var26 == 2) {
                    var3[var7] = class45.field690 - class317.field5433;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBLcc;)Lha;", line = 252)
    public static final class26 method1430(int arg0, byte arg1, class313 arg2) {
        field3477++;
        if (class189.method1354(arg0, arg1 + 187, arg2)) {
            if (arg1 != -75) {
                method1431(34, -33, -113, -33, (class114) null, -30L, (class114) null, (class114) null);
            }
            return class242.method1667(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIILja;JLja;Lja;)V", line = 273)
    public static final void method1431(int arg0, int arg1, int arg2, int arg3, class114 arg4, long arg5, class114 arg6, class114 arg7) {
        class74 var9 = new class74();
        var9.field1188 = arg4;
        var9.field1190 = arg1 * 128 + 64;
        var9.field1189 = arg2 * 128 + 64;
        var9.field1187 = arg3;
        var9.field1201 = arg5;
        var9.field1191 = arg6;
        var9.field1193 = arg7;
        int var10 = 0;
        class5 var11 = class297.field4940[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field61; var12++) {
                class240 var13 = var11.field54[var12];
                if ((var13.field4045 & 0x400000L) == 4194304L) {
                    int var14 = var13.field4043.method225();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1192 = -var10;
        if (class297.field4940[arg0][arg1][arg2] == null) {
            class297.field4940[arg0][arg1][arg2] = new class5(arg0, arg1, arg2);
        }
        class297.field4940[arg0][arg1][arg2].field65 = var9;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILbb;)V", line = 334)
    public final void method5(int arg0, int arg1, class134 arg2) {
        if (arg1 == 0) {
            this.field3472 = this.field3476 = arg2.method948(-121);
        } else if (arg1 == 1) {
            this.field3481 = arg2.method948(arg0 ^ 0xFFFFFF8A);
        } else if (arg1 == 2) {
            this.field3474 = arg2.method942(true);
        } else if (arg1 == 3) {
            this.field3479 = arg2.method948(-124);
        } else if (arg1 == 4) {
            this.field3468 = arg2.method948(arg0 ^ 0xFFFFFF88);
        } else if (arg1 == 5) {
            this.field3472 = arg2.method948(arg0 - 136);
        } else if (arg1 == 6) {
            this.field3476 = arg2.method948(-128);
        }
        if (arg0 != 8) {
            this.field3481 = -67;
        }
        field3482++;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 394)
    public class203() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(B)V", line = 398)
    public final void method2(byte arg0) {
        this.field3470 = class64.method469(this.field3481, -112);
        field3478++;
        int var2 = 67 / ((2 - arg0) / 37);
        this.method1429((byte) 115);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIZ)V", line = 410)
    public static final void method1432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field3471++;
        int var7 = arg1 + arg3;
        int var8 = arg2 - arg3;
        int var9 = arg5 + arg3;
        for (int var10 = arg1; var10 < var7; var10++) {
            class94.method647(class314.field5393[var10], arg5, -7, arg0, arg4);
        }
        if (!arg6) {
            method1430(-13, (byte) -113, (class313) null);
        }
        for (int var11 = arg2; var11 > var8; var11--) {
            class94.method647(class314.field5393[var11], arg5, -7, arg0, arg4);
        }
        int var12 = arg0 - arg3;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class314.field5393[var13];
            class94.method647(var14, arg5, -7, var9, arg4);
            class94.method647(var14, var12, -7, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)V", line = 467)
    public static void method1433(int arg0) {
        field3480 = null;
        field3483 = null;
        if (arg0 != 5) {
            method1431(41, 2, 27, -10, (class114) null, -45L, (class114) null, (class114) null);
        }
    }
}
