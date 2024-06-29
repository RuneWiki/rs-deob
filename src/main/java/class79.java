import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class79 {

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "[I")
    private int[] field1196 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "Lem;")
    public static class206 field1200 = new class206(55, 4);

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "Ltq;")
    public class582 field1190;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "[I")
    private int[] field1189;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "[S")
    private short[] field1191;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "[S")
    private short[] field1192;

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "[S")
    private short[] field1197;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "[S")
    private short[] field1203;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V", line = 3)
    public static void method617(int arg0) {
        field1200 = null;
        if (arg0 != 2) {
            method617(76);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILac;)V", line = 25)
    private final void method618(int arg0, int arg1, class501 arg2) {
        if (arg0 != 31043) {
            this.method620(null, -76);
        }
        if (arg1 == 1) {
            arg2.method2874((byte) -75);
        } else if (arg1 == 2) {
            int var8 = arg2.method2874((byte) -75);
            this.field1189 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1189[var9] = arg2.method2845(arg0 - 31044);
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var4 = arg2.method2874((byte) -75);
                this.field1203 = new short[var4];
                this.field1197 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1197[var5] = (short) arg2.method2845(-1);
                    this.field1203[var5] = (short) arg2.method2845(-1);
                }
            } else if (arg1 == 41) {
                int var6 = arg2.method2874((byte) -75);
                this.field1192 = new short[var6];
                this.field1191 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field1191[var7] = (short) arg2.method2845(-1);
                    this.field1192[var7] = (short) arg2.method2845(-1);
                }
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field1196[arg1 - 60] = arg2.method2845(-1);
            }
        }
        field1195++;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)Lnba;", line = 106)
    public final class270 method619(byte arg0) {
        if (arg0 < 6) {
            return null;
        }
        field1194++;
        class270[] var2 = new class270[5];
        int var3 = 0;
        class648 var4 = this.field1190.field8196;
        synchronized (this.field1190.field8196) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field1196[var5] != -1) {
                    var2[var3++] = class29.method282(0, (byte) 126, this.field1196[var5], this.field1190.field8196);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field3661 < 13) {
                var2[var6].method1639((byte) -123, 2);
            }
        }
        class270 var7 = new class270(var2, var3);
        if (this.field1197 != null) {
            for (int var8 = 0; var8 < this.field1197.length; var8++) {
                var7.method1651(118, this.field1197[var8], this.field1203[var8]);
            }
        }
        if (this.field1191 != null) {
            for (int var9 = 0; var9 < this.field1191.length; var9++) {
                var7.method1650(this.field1192[var9], this.field1191[var9], 256);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lac;I)V", line = 180)
    public final void method620(class501 arg0, int arg1) {
        field1204++;
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var3 = arg0.method2874((byte) -75);
            if (var3 == 0) {
                return;
            }
            this.method618(31043, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)Lnba;", line = 202)
    public final class270 method621(int arg0) {
        field1199++;
        if (this.field1189 == null) {
            return null;
        }
        int var2 = -74 % ((23 - arg0) / 40);
        class270[] var3 = new class270[this.field1189.length];
        class648 var4 = this.field1190.field8196;
        synchronized (this.field1190.field8196) {
            int var5 = 0;
            while (true) {
                if (this.field1189.length <= var5) {
                    break;
                }
                var3[var5] = class29.method282(0, (byte) 127, this.field1189[var5], this.field1190.field8196);
                var5++;
            }
        }
        for (int var6 = 0; var6 < this.field1189.length; var6++) {
            if (var3[var6].field3661 < 13) {
                var3[var6].method1639((byte) -114, 2);
            }
        }
        class270 var7;
        if (var3.length == 1) {
            var7 = var3[0];
        } else {
            var7 = new class270(var3, var3.length);
        }
        if (var7 == null) {
            return null;
        }
        if (this.field1197 != null) {
            for (int var8 = 0; var8 < this.field1197.length; var8++) {
                var7.method1651(106, this.field1197[var8], this.field1203[var8]);
            }
        }
        if (this.field1191 != null) {
            for (int var9 = 0; var9 < this.field1191.length; var9++) {
                var7.method1650(this.field1192[var9], this.field1191[var9], 256);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)Z", line = 277)
    public final boolean method622(int arg0) {
        field1193++;
        boolean var2 = true;
        class648 var3 = this.field1190.field8196;
        synchronized (this.field1190.field8196) {
            int var4 = 0;
            while (true) {
                if (var4 >= 5) {
                    break;
                }
                if (this.field1196[var4] != -1 && !this.field1190.field8196.method3630(0, this.field1196[var4], arg0 - 121)) {
                    var2 = false;
                }
                var4++;
            }
        }
        if (arg0 != -6) {
            this.field1197 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLjava/lang/String;)I", line = 313)
    public static final int method623(byte arg0, String arg1) {
        field1201++;
        int var2 = arg1.length();
        if (arg0 >= -46) {
            return -23;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = ((var3 << 5) + arg1.charAt(var4)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "(I)Z", line = 338)
    public final boolean method624(int arg0) {
        field1198++;
        int var2 = -110 / ((arg0 - 36) / 32);
        if (this.field1189 == null) {
            return true;
        }
        boolean var3 = true;
        class648 var4 = this.field1190.field8196;
        synchronized (this.field1190.field8196) {
            for (int var5 = 0; var5 < this.field1189.length; var5++) {
                if (!this.field1190.field8196.method3630(0, this.field1189[var5], -118)) {
                    var3 = false;
                }
            }
            return var3;
        }
    }
}
