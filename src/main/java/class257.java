import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class257 extends class195 {

    @OriginalMember(owner = "client!lb", name = "gb", descriptor = "[[I")
    public static int[][] field4131 = new int[104][104];

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!lb", name = "ab", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!lb", name = "cb", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!lb", name = "db", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!lb", name = "eb", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!lb", name = "fb", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!lb", name = "hb", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!lb", name = "ib", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!lb", name = "jb", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "Lob;")
    public static class294 field4123;

    @OriginalMember(owner = "client!lb", name = "bb", descriptor = "[Lil;")
    private class280[] field4126;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([[II)V", line = 18)
    private final void method1644(int[][] arg0, int arg1) {
        int var3 = class157.field2504;
        field4129++;
        int var4 = class227.field3621;
        class210.method1320((byte) -126, arg0);
        if (arg1 <= 0) {
            return;
        }
        class231.method1490(0, -414, class59.field945, class254.field4088, 0);
        if (this.field4126 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field4126.length; var5++) {
            class280 var6 = this.field4126[var5];
            int var7 = var6.field4633;
            int var8 = var6.field4635;
            if (var7 >= 0) {
                if (var8 >= 0) {
                    var6.method528(12623, var4, var3);
                } else {
                    var6.method530(2, var4, var3);
                }
            } else if (var8 >= 0) {
                var6.method532(var4, (byte) -106, var3);
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[SI[Lck;I)V", line = 70)
    public static final void method1645(int arg0, short[] arg1, int arg2, class119[] arg3, int arg4) {
        field4132++;
        if (arg0 != 1 || arg2 >= arg4) {
            return;
        }
        int var5 = (arg2 + arg4) / 2;
        class119 var6 = arg3[var5];
        arg3[var5] = arg3[arg4];
        int var7 = arg2;
        arg3[arg4] = var6;
        short var8 = arg1[var5];
        arg1[var5] = arg1[arg4];
        arg1[arg4] = var8;
        for (int var9 = arg2; var9 < arg4; var9++) {
            if (var6 == null || arg3[var9] != null && arg3[var9].method751(true, var6) < (var9 & 0x1)) {
                class119 var10 = arg3[var9];
                arg3[var9] = arg3[var7];
                arg3[var7] = var10;
                short var11 = arg1[var9];
                arg1[var9] = arg1[var7];
                arg1[var7++] = var11;
            }
        }
        arg3[arg4] = arg3[var7];
        arg3[var7] = var6;
        arg1[arg4] = arg1[var7];
        arg1[var7] = var8;
        method1645(1, arg1, arg2, arg3, var7 - 1);
        method1645(1, arg1, var7 + 1, arg3, arg4);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/Object;Llh;B)V", line = 125)
    public static final void method1646(Object arg0, class282 arg1, byte arg2) {
        field4122++;
        if (arg1.field4654 == null) {
            return;
        }
        int var3 = 27 / ((1 - arg2) / 44);
        for (int var4 = 0; var4 < 50 && arg1.field4654.peekEvent() != null; var4++) {
            class232.method1493(1L, (byte) -51);
        }
        if (arg0 != null) {
            arg1.field4654.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)[[I", line = 157)
    public final int[][] method9(byte arg0, int arg1) {
        if (arg0 != 3) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field3126.method603(arg1, -128);
        if (this.field3126.field1372) {
            int var4 = class157.field2504;
            int var5 = class227.field3621;
            int[][][] var6 = this.field3126.method607(-28281);
            int[][] var7 = new int[var5][var4];
            this.method1644(var7, 41);
            for (int var8 = 0; var8 < class227.field3621; var8++) {
                int[][] var9 = var6[var8];
                int[] var10 = var9[1];
                int[] var11 = var7[var8];
                int[] var12 = var9[2];
                int[] var13 = var9[0];
                for (int var14 = 0; var14 < class157.field2504; var14++) {
                    int var15 = var11[var14];
                    var12[var14] = class19.method151(4080, var15 << 4);
                    var10[var14] = class19.method151(var15 >> 4, 4080);
                    var13[var14] = class19.method151(16711680, var15) >> 12;
                }
            }
        }
        field4125++;
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 224)
    public class257() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)V", line = 228)
    public static final void method1647(int arg0) {
        field4127++;
        class288 var1 = (class288) class206.field3268.method1325(arg0 - 102);
        if (arg0 != -1) {
            method1645(-6, (short[]) null, 127, (class119[]) null, -44);
        }
        while (var1 != null) {
            int var2 = var1.field4739;
            if (class247.method1609(arg0 ^ 0xFFFF875E, var2)) {
                boolean var3 = true;
                class134[] var4 = class135.field2189[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field2097;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field1218;
                    class134 var7 = class20.method153(1, var6);
                    if (var7 != null) {
                        class26.method194(var7, arg0 - 62);
                    }
                }
            }
            var1 = (class288) class206.field3268.method1332(-22);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLde;Lva;Lva;Lva;)Z", line = 295)
    public static final boolean method1648(byte arg0, class191 arg1, class36 arg2, class36 arg3, class36 arg4) {
        class86.field1306 = arg3;
        field4130++;
        class263.field4274 = arg1;
        class249.field4018 = arg2;
        class277.field4551 = arg4;
        if (arg0 > -94) {
            method1649((byte) -35);
        }
        return true;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lfj;II)V", line = 317)
    public final void method13(class3 arg0, int arg1, int arg2) {
        field4120++;
        if (arg1 > -117) {
            return;
        }
        if (arg2 == 0) {
            this.field4126 = new class280[arg0.method64((byte) -98)];
            for (int var4 = 0; var4 < this.field4126.length; var4++) {
                int var5 = arg0.method64((byte) -90);
                if (var5 == 0) {
                    this.field4126[var4] = class269.method1784((byte) 64, arg0);
                } else if (var5 == 1) {
                    this.field4126[var4] = class260.method1671(21715, arg0);
                } else if (var5 == 2) {
                    this.field4126[var4] = class55.method411((byte) 112, arg0);
                } else if (var5 == 3) {
                    this.field4126[var4] = class272.method1800(arg0, (byte) -58);
                }
            }
        } else if (arg2 == 1) {
            this.field3127 = arg0.method64((byte) -103) == 1;
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V", line = 395)
    public static void method1649(byte arg0) {
        field4123 = null;
        field4131 = (int[][]) null;
        if (arg0 != -49) {
            method1646((Object) null, (class282) null, (byte) -112);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)[I", line = 410)
    public final int[] method11(int arg0, boolean arg1) {
        field4134++;
        if (arg1) {
            field4121 = -8;
        }
        int[] var3 = this.field3106.method924(100, arg0);
        if (this.field3106.field2260) {
            this.method1644(this.field3106.method920((byte) 116), 52);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILeb;B)V", line = 436)
    public static final void method1650(int arg0, class297 arg1, byte arg2) {
        field4124++;
        if (arg1.field4954 > class1.field15) {
            class27.method199((byte) -126, arg1);
        } else if (class1.field15 <= arg1.field5002) {
            class3.method62(arg1, (byte) 117);
        } else {
            class108.method700(arg1, 24185);
        }
        if (arg2 < 111) {
            return;
        }
        if (arg1.field4949 < 128 || arg1.field4991 < 128 || arg1.field4949 >= 13184 || arg1.field4991 >= 13184) {
            arg1.field5002 = 0;
            arg1.field4949 = arg1.field4963[0] * 128 + arg1.field4956 * 64;
            arg1.field4993 = -1;
            arg1.field4991 = arg1.field4973[0] * 128 + (arg1.field4956 * 64);
            arg1.field4954 = 0;
            arg1.field4962 = -1;
            arg1.method1980(-28035);
        }
        if (class124.field1917 == arg1 && (arg1.field4949 < 1536 || arg1.field4991 < 1536 || arg1.field4949 >= 11776 || arg1.field4991 >= 11776)) {
            arg1.field4949 = arg1.field4963[0] * 128 + arg1.field4956 * 64;
            arg1.field4962 = -1;
            arg1.field4991 = arg1.field4973[0] * 128 + (arg1.field4956 * 64);
            arg1.field5002 = 0;
            arg1.field4954 = 0;
            arg1.field4993 = -1;
            arg1.method1980(-28035);
        }
        class20.method162((byte) -108, arg1);
        class234.method1512(arg1, 1);
    }
}
