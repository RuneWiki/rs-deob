import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class439 {

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "[I")
    private int[] field6243 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "Lqv;")
    public static class316 field6249 = new class316(46, 4);

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "Lfh;")
    public static class470 field6252 = new class470("WIP", 2);

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "[I")
    public static int[] field6254 = new int[1];

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "[I")
    public static int[] field6255 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "Ljr;")
    public class74 field6239;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "[I")
    private int[] field6242;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "[S")
    private short[] field6244;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "[S")
    private short[] field6248;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "[S")
    private short[] field6251;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "[S")
    private short[] field6253;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IILwn;)V")
    private final void method2578(int arg0, int arg1, class519 arg2) {
        if (arg0 == 1) {
            arg2.method3072((byte) -119);
        } else if (arg0 == 2) {
            int var8 = arg2.method3072((byte) -122);
            this.field6242 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field6242[var9] = arg2.method3018(566990904);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var6 = arg2.method3072((byte) -126);
                this.field6248 = new short[var6];
                this.field6251 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field6248[var7] = (short) arg2.method3018(566990904);
                    this.field6251[var7] = (short) arg2.method3018(566990904);
                }
            } else if (arg0 == 41) {
                int var4 = arg2.method3072((byte) -122);
                this.field6253 = new short[var4];
                this.field6244 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field6253[var5] = (short) arg2.method3018(566990904);
                    this.field6244[var5] = (short) arg2.method3018(566990904);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field6243[arg0 - 60] = arg2.method3018(566990904);
            }
        }
        if (arg1 < 15) {
            this.method2583(null, 110);
        }
        field6246++;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
    public static void method2579(int arg0) {
        field6255 = null;
        field6252 = null;
        if (arg0 < -45) {
            field6254 = null;
            field6249 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)Z")
    public final boolean method2580(int arg0) {
        field6241++;
        if (this.field6242 == null) {
            return true;
        }
        boolean var2 = true;
        class320 var3 = this.field6239.field1204;
        synchronized (this.field6239.field1204) {
            for (int var4 = arg0; var4 < this.field6242.length; var4++) {
                if (!this.field6239.field1204.method2019(this.field6242[var4], 0, 99)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)Z")
    public final boolean method2581(int arg0) {
        if (arg0 != -1) {
            return true;
        }
        field6245++;
        boolean var2 = true;
        class320 var3 = this.field6239.field1204;
        synchronized (this.field6239.field1204) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field6243[var4] != -1 && !this.field6239.field1204.method2019(this.field6243[var4], 0, 104)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)Lch;")
    public final class330 method2582(int arg0) {
        field6247++;
        if (this.field6242 == null) {
            return null;
        }
        class330[] var2 = new class330[this.field6242.length];
        class320 var3 = this.field6239.field1204;
        synchronized (this.field6239.field1204) {
            int var4 = 0;
            while (true) {
                if (this.field6242.length <= var4) {
                    break;
                }
                var2[var4] = class494.method2904(this.field6239.field1204, 0, this.field6242[var4], -3808);
                var4++;
            }
        }
        for (int var5 = arg0; var5 < this.field6242.length; var5++) {
            if (var2[var5].field4843 < 13) {
                var2[var5].method2082(98, 0);
            }
        }
        class330 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class330(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field6248 != null) {
            for (int var7 = 0; var7 < this.field6248.length; var7++) {
                var6.method2090(this.field6248[var7], (byte) 117, this.field6251[var7]);
            }
        }
        if (this.field6253 != null) {
            for (int var8 = 0; var8 < this.field6253.length; var8++) {
                var6.method2096(-19019, this.field6253[var8], this.field6244[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lwn;I)V")
    public final void method2583(class519 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3072((byte) -121);
            if (var3 == 0) {
                field6240++;
                if (arg1 != 0) {
                    this.method2580(123);
                    return;
                }
                return;
            }
            this.method2578(var3, 96, arg0);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)Lch;")
    public final class330 method2584(byte arg0) {
        field6250++;
        class330[] var2 = new class330[5];
        int var3 = 0;
        class320 var4 = this.field6239.field1204;
        synchronized (this.field6239.field1204) {
            if (arg0 > -14) {
                return null;
            }
            int var6 = 0;
            while (true) {
                if (var6 >= 5) {
                    break;
                }
                if (this.field6243[var6] != -1) {
                    var2[var3++] = class494.method2904(this.field6239.field1204, 0, this.field6243[var6], -3808);
                }
                var6++;
            }
        }
        for (int var7 = 0; var7 < 5; var7++) {
            if (var2[var7] != null && var2[var7].field4843 < 13) {
                var2[var7].method2082(114, 0);
            }
        }
        class330 var8 = new class330(var2, var3);
        if (this.field6248 != null) {
            for (int var9 = 0; var9 < this.field6248.length; var9++) {
                var8.method2090(this.field6248[var9], (byte) 118, this.field6251[var9]);
            }
        }
        if (this.field6253 != null) {
            for (int var10 = 0; var10 < this.field6253.length; var10++) {
                var8.method2096(-19019, this.field6253[var10], this.field6244[var10]);
            }
        }
        return var8;
    }
}
