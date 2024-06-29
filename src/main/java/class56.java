import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class56 extends class27 {

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    private int field817 = 4096;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    private int field816 = 4096;

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "[I")
    private int[] field822 = new int[3];

    @OriginalMember(owner = "client!ld", name = "bb", descriptor = "I")
    private int field824 = 409;

    @OriginalMember(owner = "client!ld", name = "ab", descriptor = "I")
    private int field823 = 4096;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "Z")
    public static boolean field821 = true;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
    public static int field819 = 0;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "[I")
    public static int[] field820 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "Ljava/lang/String;")
    public static String field809 = "Starting 3d Library";

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    public static int field815 = 0;

    @OriginalMember(owner = "client!ld", name = "cb", descriptor = "I")
    public static int field825 = 0;

    @OriginalMember(owner = "client!ld", name = "db", descriptor = "Ljava/lang/String;")
    public static String field826 = " has logged out.";

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "Lin;")
    public static class177 field813;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "Lp;")
    public static class25 field807;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "(I)V", line = 13)
    public static void method453(int arg0) {
        field813 = null;
        field826 = null;
        field820 = null;
        if (arg0 == 6406) {
            field807 = null;
            field809 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILph;)V", line = 31)
    public static final void method454(int arg0, class361 arg1) {
        if (arg0 != -436665780) {
            method453(96);
        }
        field810++;
        class329.field4953 = arg1;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 56)
    public class56() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(B)V", line = 65)
    public static final void method455(byte arg0) {
        field814++;
        for (int var1 = -1; var1 < class265.field4053; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class227.field3426[var1];
            }
            class228 var3 = class343.field5312[var2];
            if (var3 != null) {
                class122.method908(-30927, var3, var3.method1700(-128));
            }
        }
        if (arg0 != 76) {
            field825 = 38;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILsb;I)V", line = 105)
    public final void method23(int arg0, class190 arg1, int arg2) {
        field818++;
        if (arg2 == 0) {
            this.field824 = arg1.method1317((byte) 99);
        } else if (arg2 == 1) {
            this.field817 = arg1.method1317((byte) 99);
        } else if (arg2 == 2) {
            this.field823 = arg1.method1317((byte) 109);
        } else if (arg2 == 3) {
            this.field816 = arg1.method1317((byte) 32);
        } else if (arg2 == 4) {
            int var5 = arg1.method1312(77);
            this.field822[1] = class287.method2076(65280, var5) >> 4;
            this.field822[2] = class287.method2076(var5 >> 12, 0);
            this.field822[0] = class287.method2076(16711680, var5) << 4;
        }
        if (arg0 != -5836) {
            field825 = 42;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[[I", line = 182)
    public final int[][] method19(int arg0, int arg1) {
        field808++;
        if (arg0 != -28941) {
            method454(9, (class361) null);
        }
        int[][] var3 = this.field379.method668(arg1, arg0 + 28941);
        if (this.field379.field1171) {
            int[][] var4 = this.method168(0, -123, arg1);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var3[1];
            int[] var8 = var4[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class209.field3053; var11++) {
                int var12 = var6[var11];
                int var13 = var12 - this.field822[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field824 >= var13) {
                    int var14 = var8[var11];
                    int var15 = var14 - this.field822[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field824 < var15) {
                        var9[var11] = var12;
                        var7[var11] = var14;
                        var10[var11] = var5[var11];
                    } else {
                        int var16 = var5[var11];
                        int var17 = var16 - this.field822[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field824 < var17) {
                            var9[var11] = var12;
                            var7[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var9[var11] = this.field816 * var12 >> 12;
                            var7[var11] = this.field823 * var14 >> 12;
                            var10[var11] = this.field817 * var16 >> 12;
                        }
                    }
                } else {
                    var9[var11] = var12;
                    var7[var11] = var8[var11];
                    var10[var11] = var5[var11];
                }
            }
        }
        return var3;
    }
}
