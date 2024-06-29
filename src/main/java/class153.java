import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class153 {

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public int field2354;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public int field2355;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "B")
    public byte field2346;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "S")
    public short field2344;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "S")
    public short field2356;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "S")
    public short field2351;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Z")
    public boolean field2352;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public int field2347;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public int field2348;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public int field2350;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Lpg;")
    public static class734 field2345;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIII)I", line = 11)
    public static final int method1118(int arg0, int arg1, int arg2, int arg3) {
        field2343++;
        if (class507.field6771 == null) {
            return 0;
        }
        int var4 = arg1 >> 9;
        int var5 = arg0 >> 9;
        if (var4 < 0 || var5 < 0 || class719.field10004 - 1 < var4 || (class107.field1453 - 1) < var5) {
            return 0;
        }
        int var6 = -13 % ((arg2 - 84) / 42);
        int var7 = arg3;
        if (arg3 < 3 && (class184.field2782[1][var4][var5] & 0x2) != 0) {
            var7 = arg3 + 1;
        }
        return class507.field6771[var7].method1750((byte) 98, arg1, arg0);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V", line = 42)
    public static void method1119(byte arg0) {
        if (arg0 != -78) {
            method1119((byte) -80);
        }
        field2345 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lfs;IILqfa;IIILfha;)V", line = 55)
    public static final void method1120(class556 arg0, int arg1, int arg2, class100 arg3, int arg4, int arg5, int arg6, class383 arg7) {
        field2349++;
        class461 var8 = new class461();
        var8.field6306 = arg5 << 9;
        var8.field6324 = arg4;
        if (arg6 != -652104791) {
            method1118(-91, -5, -99, 15);
        }
        var8.field6311 = arg2 << 9;
        if (arg3 != null) {
            var8.field6301 = arg3;
            int var9 = arg3.field1355;
            int var10 = arg3.field1323;
            if (arg1 == 1 || arg1 == 3) {
                var10 = arg3.field1355;
                var9 = arg3.field1323;
            }
            var8.field6319 = arg5 + var10 << 9;
            var8.field6317 = arg3.field1304;
            var8.field6320 = arg2 + var9 << 9;
            var8.field6321 = arg3.field1336;
            var8.field6315 = arg3.field1276;
            var8.field6309 = arg3.field1286 << 9;
            var8.field6310 = arg3.field1277 << 9;
            var8.field6325 = arg3.field1353;
            var8.field6318 = arg3.field1308;
            var8.field6323 = arg3.field1328;
            var8.field6326 = arg3.field1337;
            var8.field6298 = arg3.field1362;
            var8.field6307 = arg3.field1350;
            if (arg3.field1307 != null) {
                var8.field6303 = true;
                var8.method2621(256);
            }
            if (var8.field6317 != null) {
                var8.field6314 = var8.field6321 + ((int) ((double) (var8.field6315 - var8.field6321) * Math.random()));
            }
            class496.field6692.method11(var8, arg6 ^ 0x26DE5429);
        } else if (arg0 != null) {
            var8.field6304 = arg0;
            class166 var11 = arg0.field7328;
            if (var11.field2575 != null) {
                var8.field6303 = true;
                var11 = var11.method1190((byte) 101, class74.field901);
            }
            if (var11 != null) {
                var8.field6319 = var11.field2544 + arg5 << 9;
                var8.field6320 = arg2 + var11.field2544 << 9;
                var8.field6307 = class483.method2731(arg0, (byte) 89);
                var8.field6318 = var11.field2553;
                var8.field6309 = var11.field2543 << 9;
                var8.field6323 = var11.field2536;
                var8.field6325 = var11.field2514;
                var8.field6326 = var11.field2534;
                var8.field6310 = var11.field2526 << 9;
            }
            class681.field9519.method11(var8, arg6 ^ 0x26DE5426);
        } else if (arg7 != null) {
            var8.field6308 = arg7;
            var8.field6320 = arg2 + arg7.method2256(-1) << 9;
            var8.field6319 = arg5 + arg7.method2256(arg6 ^ 0x26DE5456) << 9;
            var8.field6307 = class416.method2417(arg7, (byte) 22);
            var8.field6326 = arg7.field5354;
            var8.field6325 = arg7.field5350;
            var8.field6310 = 0;
            var8.field6309 = arg7.field5337 << 9;
            var8.field6318 = 256;
            var8.field6323 = 256;
            class592.field7700.method2143(-1, var8, (long) arg7.field10297);
            return;
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 162)
    public class153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field2354 = arg11;
        this.field2355 = arg2;
        this.field2346 = (byte) arg8;
        this.field2344 = (short) arg5;
        this.field2356 = (short) arg4;
        this.field2351 = (short) arg6;
        this.field2352 = arg10;
        this.field2347 = arg1;
        this.field2348 = arg3;
        this.field2350 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 183)
    public static final void method1121(int arg0) {
        field2353++;
        int var1 = 80 % ((arg0 + 42) / 63);
        field2345.method2310(-1);
        class569.field7492.method769((byte) -97);
        class243.field3401.method1870(-6515);
        class295.field4217.setBackground(Color.black);
        class379.field5281 = -1;
        field2345 = class727.method4087(class295.field4217, true);
        class569.field7492 = class675.method3761(class295.field4217, true, (byte) 122);
    }
}
