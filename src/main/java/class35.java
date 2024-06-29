import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class35 extends class17 {

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
    private int field480 = 4096;

    @OriginalMember(owner = "client!kb", name = "jb", descriptor = "I")
    private int field488 = 0;

    @OriginalMember(owner = "client!kb", name = "eb", descriptor = "Lsf;")
    public static class108 field483 = class140.method973(255, "Benutzen");

    @OriginalMember(owner = "client!kb", name = "gb", descriptor = "S")
    public static short field485 = 256;

    @OriginalMember(owner = "client!kb", name = "mb", descriptor = "Lsf;")
    public static class108 field491 = class140.method973(255, "overlay2");

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "F")
    public static float field479;

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!kb", name = "fb", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!kb", name = "hb", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!kb", name = "ib", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!kb", name = "kb", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!kb", name = "lb", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!kb", name = "nb", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)[[I", line = 18)
    public final int[][] method122(boolean arg0, int arg1) {
        if (arg0) {
            this.field480 = -20;
        }
        field481++;
        int[][] var3 = this.field224.method2081(arg1, -90);
        if (this.field224.field5106) {
            int[][] var4 = this.method111(3, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class116.field2008; var11++) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 < this.field488) {
                    var9[var11] = this.field488;
                } else if (var12 > this.field480) {
                    var9[var11] = this.field480;
                } else {
                    var9[var11] = var12;
                }
                if (this.field488 > var14) {
                    var8[var11] = this.field488;
                } else if (var14 > this.field480) {
                    var8[var11] = this.field480;
                } else {
                    var8[var11] = var14;
                }
                if (var13 < this.field488) {
                    var10[var11] = this.field488;
                } else if (var13 > this.field480) {
                    var10[var11] = this.field480;
                } else {
                    var10[var11] = var13;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V", line = 114)
    public class35() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBIZZ)V", line = 99)
    public static final void method242(int arg0, byte arg1, int arg2, boolean arg3, boolean arg4) {
        if (arg1 == 1) {
            class166.method1163(arg4, 0, arg2, class15.field201.length - 1, arg3, (byte) 82, arg0);
            field484++;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII)V", line = 128)
    public static final void method243(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < arg3) {
            class209.method1452(arg3, class106.field1839[arg2], arg4 - 7610, arg0, arg1);
        } else {
            class209.method1452(arg0, class106.field1839[arg2], 7, arg3, arg1);
        }
        field482++;
        if (arg4 != 7617) {
            method246(-23);
        }
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(II)V", line = 149)
    public static final void method244(int arg0, int arg1) {
        field489++;
        class53.field778 = arg0;
        class116.method830(3, (byte) -30);
        if (arg1 == -1) {
            class116.method830(4, (byte) -69);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[B)Lvl;", line = 162)
    public static final class80 method245(int arg0, byte[] arg1) {
        if (arg0 <= 54) {
            return (class80) null;
        }
        field490++;
        if (arg1 == null) {
            return null;
        }
        class80 var2;
        if (class231.field4051) {
            var2 = new class332(arg1, class154.field2775, class88.field1383, class155.field2780, class273.field4795, class94.field1512);
        } else {
            var2 = new class250(arg1, class154.field2775, class88.field1383, class155.field2780, class273.field4795, class94.field1512);
        }
        class15.method100(1);
        return var2;
    }

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "(I)V", line = 184)
    public static void method246(int arg0) {
        field491 = null;
        if (arg0 != -1) {
            field491 = (class108) null;
        }
        field483 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLrm;I)V", line = 196)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        if (arg0 != -114) {
            method243(36, -103, 73, 90, -42);
        }
        field487++;
        if (arg2 == 0) {
            this.field488 = arg1.method1712(arg0 ^ 0x71);
        } else if (arg2 == 1) {
            this.field480 = arg1.method1712(arg0 ^ 0x71);
        } else if (arg2 == 2) {
            this.field225 = arg1.method1731(true) == 1;
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(II)[I", line = 240)
    public final int[] method120(int arg0, int arg1) {
        field486++;
        if (arg0 >= -95) {
            method247(-101, 57);
        }
        int[] var3 = this.field217.method1698(114, arg1);
        if (this.field217.field4295) {
            int[] var4 = this.method124(52, 0, arg1);
            for (int var5 = 0; var5 < class116.field2008; var5++) {
                int var6 = var4[var5];
                if (this.field488 > var6) {
                    var3[var5] = this.field488;
                } else if (var6 <= this.field480) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field480;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(II)V", line = 283)
    public static final void method247(int arg0, int arg1) {
        field492++;
        if (!class219.method1508(arg1, -123)) {
            return;
        }
        class98[] var2 = class320.field5485[arg1];
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class98 var4 = var2[var3];
            if (var4 != null) {
                var4.field1675 = 0;
                var4.field1713 = 0;
            }
        }
    }
}
