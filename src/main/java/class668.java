import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class668 {

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "Lgg;")
    private class114 field9140 = new class114(64);

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "Lgg;")
    public class114 field9151 = new class114(60);

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "Lkha;")
    public class687 field9149;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "Lkha;")
    private class687 field9139;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "Lmq;")
    public static class78 field9145 = new class78(15, -2);

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
    public static int field9150 = 0;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field9141;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field9142;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field9143;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
    public static int field9144;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
    public static int field9146;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
    public int field9152;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "Ldb;")
    public static class99 field9148;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)V", line = 4)
    public final void method3611(int arg0, byte arg1) {
        this.field9152 = arg0;
        field9146++;
        class114 var3 = this.field9151;
        synchronized (this.field9151) {
            this.field9151.method776((byte) 105);
            if (arg1 <= 35) {
                method3613(null, -63, null, -18);
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)V", line = 20)
    public final void method3612(int arg0, int arg1) {
        field9142++;
        if (arg0 != 0) {
            this.method3612(-124, -78);
        }
        class114 var3 = this.field9140;
        synchronized (this.field9140) {
            this.field9140.method775(1, arg1);
        }
        class114 var4 = this.field9151;
        synchronized (this.field9151) {
            this.field9151.method775(1, arg1);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ltn;ILnga;I)V", line = 36)
    public static final void method3613(class179 arg0, int arg1, class256 arg2, int arg3) {
        field9141++;
        class325 var4 = new class325();
        var4.field4148 = arg0.method1094(255);
        var4.field4140 = arg0.method1095((byte) 125);
        var4.field4142 = new class435[var4.field4148];
        var4.field4149 = new int[var4.field4148];
        var4.field4141 = new int[var4.field4148];
        var4.field4147 = new byte[var4.field4148][][];
        var4.field4144 = new int[var4.field4148];
        var4.field4145 = new class435[var4.field4148];
        int var5 = 0;
        if (arg3 != 10653) {
            return;
        }
        while (var5 < var4.field4148) {
            try {
                int var6 = arg0.method1094(255);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = arg0.method1106(arg3 ^ 0xFFFFD662);
                    String var18 = arg0.method1106(arg3 - 10654);
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg0.method1095((byte) 122);
                    }
                    var4.field4149[var5] = var6;
                    var4.field4141[var5] = var19;
                    var4.field4142[var5] = arg2.method1565(class263.method1587(var17, 0), (byte) 78, var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = arg0.method1106(-1);
                    String var8 = arg0.method1106(arg3 ^ 0xFFFFD662);
                    int var9 = arg0.method1094(255);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = arg0.method1106(-1);
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg0.method1095((byte) 121);
                            var12[var13] = new byte[var14];
                            arg0.method1096(var14, 0, var12[var13], 12050);
                        }
                    }
                    var4.field4149[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class263.method1587(var10[var16], 0);
                    }
                    var4.field4145[var5] = arg2.method1553(var8, 14042, var15, class263.method1587(var7, 0));
                    var4.field4147[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field4144[var5] = -1;
            } catch (SecurityException var21) {
                var4.field4144[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field4144[var5] = -3;
            } catch (Exception var23) {
                var4.field4144[var5] = -4;
            } catch (Throwable var24) {
                var4.field4144[var5] = -5;
            }
            var5++;
        }
        class508.field7185.method3110(var4, 1);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V", line = 149)
    public static void method3614(int arg0) {
        field9148 = null;
        field9145 = null;
        if (arg0 != 6921) {
            method3613(null, -92, null, -91);
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)V", line = 162)
    public final void method3615(int arg0) {
        field9143++;
        class114 var2 = this.field9140;
        synchronized (this.field9140) {
            this.field9140.method776((byte) 97);
        }
        class114 var3 = this.field9151;
        synchronized (this.field9151) {
            this.field9151.method776((byte) 105);
        }
        if (arg0 != 0) {
            this.field9151 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BI)Lqa;", line = 186)
    public final class716 method3616(byte arg0, int arg1) {
        field9144++;
        class114 var3 = this.field9140;
        class716 var4;
        synchronized (this.field9140) {
            var4 = (class716) this.field9140.method778((long) arg1, 89);
        }
        if (var4 != null) {
            return var4;
        }
        class687 var5 = this.field9139;
        byte[] var6;
        synchronized (this.field9139) {
            var6 = this.field9139.method3810(class332.method1950((byte) 106, arg1), -23360, class660.method3581(false, arg1));
        }
        class716 var7 = new class716();
        var7.field10092 = arg1;
        var7.field10102 = this;
        if (arg0 < 100) {
            field9148 = null;
        }
        if (var6 != null) {
            var7.method3973(new class179(var6), (byte) -102);
        }
        class114 var8 = this.field9140;
        synchronized (this.field9140) {
            this.field9140.method774((long) arg1, 114, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V", line = 218)
    public final void method3617(byte arg0) {
        class114 var2 = this.field9140;
        synchronized (this.field9140) {
            this.field9140.method781((byte) 47);
        }
        int var3 = 3 % ((-arg0 - 44) / 62);
        field9147++;
        class114 var4 = this.field9151;
        synchronized (this.field9151) {
            this.field9151.method781((byte) 47);
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Ldh;ILkha;Lkha;)V", line = 251)
    public class668(class286 arg0, int arg1, class687 arg2, class687 arg3) {
        this.field9149 = arg3;
        this.field9139 = arg2;
        int var5 = this.field9139.method3816(-125) - 1;
        this.field9139.method3812(0, var5);
    }
}
