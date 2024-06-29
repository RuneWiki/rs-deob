import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class673 extends class728 {

    @OriginalMember(owner = "client!aga", name = "E", descriptor = "I")
    private int field9421;

    @OriginalMember(owner = "client!aga", name = "D", descriptor = "I")
    private int field9420;

    @OriginalMember(owner = "client!aga", name = "z", descriptor = "I")
    private int field9416;

    @OriginalMember(owner = "client!aga", name = "J", descriptor = "I")
    private int field9426;

    @OriginalMember(owner = "client!aga", name = "B", descriptor = "[[Z")
    public static boolean[][] field9418 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!aga", name = "M", descriptor = "Lin;")
    public static class380 field9429 = null;

    @OriginalMember(owner = "client!aga", name = "w", descriptor = "I")
    public static int field9413;

    @OriginalMember(owner = "client!aga", name = "y", descriptor = "I")
    private int field9415;

    @OriginalMember(owner = "client!aga", name = "A", descriptor = "I")
    private int field9417;

    @OriginalMember(owner = "client!aga", name = "C", descriptor = "I")
    public static int field9419;

    @OriginalMember(owner = "client!aga", name = "F", descriptor = "I")
    public static int field9422;

    @OriginalMember(owner = "client!aga", name = "G", descriptor = "I")
    private int field9423;

    @OriginalMember(owner = "client!aga", name = "H", descriptor = "I")
    public static int field9424;

    @OriginalMember(owner = "client!aga", name = "I", descriptor = "I")
    public static int field9425;

    @OriginalMember(owner = "client!aga", name = "L", descriptor = "I")
    public static int field9428;

    @OriginalMember(owner = "client!aga", name = "N", descriptor = "I")
    public static int field9430;

    @OriginalMember(owner = "client!aga", name = "O", descriptor = "I")
    public static int field9431;

    @OriginalMember(owner = "client!aga", name = "P", descriptor = "I")
    public static int field9432;

    @OriginalMember(owner = "client!aga", name = "Q", descriptor = "I")
    private int field9433;

    @OriginalMember(owner = "client!aga", name = "R", descriptor = "I")
    public static int field9434;

    @OriginalMember(owner = "client!aga", name = "x", descriptor = "[B")
    private byte[] field9414;

    @OriginalMember(owner = "client!aga", name = "K", descriptor = "[Lmq;")
    public static class85[] field9427;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Z)V", line = 6)
    public static void method3767(boolean arg0) {
        if (arg0) {
            field9427 = null;
            field9418 = null;
            field9429 = null;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(ZII)V", line = 24)
    public final void method1672(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            return;
        }
        if (arg1 == 0) {
            this.field9415 = this.field9420 - (arg2 < 0 ? -arg2 : arg2);
            this.field9415 = this.field9415 * this.field9415 >> 12;
            this.field9417 = 4096;
            this.field9433 = this.field9415;
        } else {
            this.field9417 = this.field9421 * this.field9415 >> 12;
            this.field9415 = this.field9420 - (arg2 < 0 ? -arg2 : arg2);
            if (this.field9417 < 0) {
                this.field9417 = 0;
            } else if (this.field9417 > 4096) {
                this.field9417 = 4096;
            }
            this.field9415 = this.field9415 * this.field9415 >> 12;
            this.field9415 = this.field9417 * this.field9415 >> 12;
            this.field9433 += this.field9426 * this.field9415 >> 12;
            this.field9426 = this.field9426 * this.field9416 >> 12;
        }
        field9413++;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 60)
    public static final int method3768(String arg0, int arg1) {
        if (arg1 == 18016) {
            field9432++;
            return arg0.length() + 2;
        } else {
            return 28;
        }
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(Z)V", line = 77)
    public static final void method3769(boolean arg0) {
        class321.field4568.method57(class747.field10386, class271.field3810, class681.field9660);
        if (arg0) {
            field9431++;
        }
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)V", line = 88)
    public final void method1673(int arg0) {
        this.field9423 = 0;
        this.field9433 = 0;
        if (arg0 > -63) {
            this.method2108(-76, (byte) -30, (byte) -34);
        }
        field9434++;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "([[BBLqv;)V", line = 100)
    public static final void method3770(byte[][] arg0, byte arg1, class79 arg2) {
        for (int var3 = 0; var3 < arg2.field10531; var3++) {
            class193.method1378(123);
            for (int var4 = 0; var4 < (class192.field2891 >> 3); var4++) {
                for (int var5 = 0; var5 < (class456.field6225 >> 3); var5++) {
                    int var6 = class364.field5178[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x3D62AD1) >> 24;
                        if (!arg2.field10544 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = (var6 & 0x3FFC) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class12.field156.length; var12++) {
                                if (class12.field156[var12] == var11 && arg0[var12] != null) {
                                    arg2.method702(var4 * 8, var5 * 8, (var9 & 0x7) * 8, class605.field8591, (var10 & 0x7) * 8, var3, arg0[var12], false, var8, var7, class686.field9702);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 < 54) {
            field9429 = null;
        }
        field9425++;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IBB)V", line = 171)
    public void method2108(int arg0, byte arg1, byte arg2) {
        this.field9414[arg0] = arg1;
        field9430++;
        if (arg2 != 53) {
            this.field9421 = -36;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIII)V", line = 182)
    public static final void method3771(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 < 48) {
            field9418 = null;
        }
        field9419++;
        if (arg0 != 8 && arg0 != 16) {
            class172 var5 = class514.field7096[arg3][arg1][arg2];
            if (var5 != null) {
                if (arg0 == 1) {
                    var5.field2597 = 0;
                } else if (arg0 == 2) {
                    var5.field2601 = 0;
                }
            }
            class492.method2871(true);
            return;
        }
        for (int var6 = 0; var6 < class260.field3684; var6++) {
            class131 var7 = class289.field4221[var6];
            if (var7.field2216 == arg0 && var7.field2209 == arg1 && var7.field2219 == arg2 || var7.field2210 == arg1 && var7.field2219 == arg2) {
                if (class260.field3684 != var6) {
                    class171.method1265(class289.field4221, var6 + 1, class289.field4221, var6, class289.field4221.length - var6 - 1);
                }
                class260.field3684--;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)V", line = 239)
    public final void method1671(int arg0) {
        this.field9433 >>= 0x4;
        field9424++;
        this.field9426 = this.field9416;
        if (this.field9433 < 0) {
            this.field9433 = 0;
        } else if (this.field9433 > 255) {
            this.field9433 = 255;
        }
        this.method2108(this.field9423++, (byte) this.field9433, (byte) 53);
        if (arg0 <= -42) {
            this.field9433 = 0;
        }
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(IIIIIFFF)V", line = 267)
    public class673(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field9421 = (int) (arg7 * 4096.0F);
        this.field9420 = (int) (arg6 * 4096.0F);
        this.field9426 = this.field9416 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIILea;)V", line = 285)
    public static final void method3772(int arg0, int arg1, int arg2, class21 arg3) {
        if (arg2 == -16287) {
            field9428++;
            int[] var4 = new int[4];
            class171.method1264(var4, 0, var4.length, arg0);
            class45.method341(var4, -1, arg1, arg3);
        }
    }
}
