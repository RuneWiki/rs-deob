import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class8 extends class157 {

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    private int field201;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "Z")
    public static boolean field204 = false;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field196 = 0;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Laj;I)V", line = 4)
    public static final void method140(class1 arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field200++;
        while (true) {
            while (arg0.field34.length > arg0.field48) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method15((byte) 126) == 1) {
                    var3 = arg0.method15((byte) 70);
                    var4 = arg0.method15((byte) 93);
                    var2 = true;
                }
                int var5 = arg0.method15((byte) -98);
                int var6 = arg0.method15((byte) 67);
                int var7 = var5 * 64 - class227.field3512;
                int var8 = class286.field4473 - (var6 * 64 - class188.field2953) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < class113.field1833 && var8 < class286.field4473) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && (var3 * 8 + 8) > var11 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                                byte var13 = arg0.method55(arg1 + 5);
                                if (var13 != 0) {
                                    if (class258.field3828[var9][var10] == null) {
                                        class258.field3828[var9][var10] = new byte[4096];
                                    }
                                    class258.field3828[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method55(4);
                                    if (class209.field3299[var9][var10] == null) {
                                        class209.field3299[var9][var10] = new byte[4096];
                                    }
                                    class209.field3299[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method55(4);
                        if (var16 != 0) {
                            arg0.field48++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V", line = 101)
    public final void method141(int arg0, int arg1, int arg2) {
        field195++;
        int var4 = 34 / ((arg1 + 24) / 60);
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(III)V", line = 114)
    public final void method142(int arg0, int arg1, int arg2) {
        field207++;
        int var4 = this.field206 * arg2 >> 12;
        int var5 = this.field201 * arg2 >> 12;
        if (arg1 != -1) {
            this.field199 = 52;
        }
        int var6 = this.field199 * arg0 >> 12;
        int var7 = this.field197 * arg0 >> 12;
        class90.method716((byte) 95, var4, this.field2570, var6, var5, var7);
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(IIIIIII)V", line = 138)
    public class8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field199 = arg3;
        this.field197 = arg1;
        this.field201 = arg2;
        this.field206 = arg0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BII)V", line = 154)
    public static final void method143(byte arg0, int arg1, int arg2) {
        field203++;
        class123.field1998[arg1] = arg2;
        class173 var3 = (class173) class16.field332.method79((long) arg1, (byte) 0);
        if (var3 == null) {
            class173 var4 = new class173(class212.method1543(22326) + 500L);
            class16.field332.method75(var4, -1, (long) arg1);
        } else {
            var3.field2771 = class212.method1543(22326) + 500L;
        }
        int var5 = 88 / ((33 - arg0) / 44);
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(III)V", line = 174)
    public final void method144(int arg0, int arg1, int arg2) {
        field205++;
        if (arg1 != 1) {
            method140((class1) null, 86);
        }
        int var4 = this.field206 * arg0 >> 12;
        int var5 = this.field201 * arg0 >> 12;
        int var6 = this.field199 * arg2 >> 12;
        int var7 = this.field197 * arg2 >> 12;
        class334.method2339(var5, var6, this.field2573, this.field2574, this.field2570, var4, var7, (byte) -4);
    }
}
