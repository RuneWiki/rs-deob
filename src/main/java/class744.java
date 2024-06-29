import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class744 {

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "Ljn;")
    public static class134 field10260 = new class134(5, -1);

    @OriginalMember(owner = "client!qr", name = "z", descriptor = "[Ldn;")
    public static class609[] field10274 = new class609[6];

    @OriginalMember(owner = "client!qr", name = "A", descriptor = "I")
    public static int field10275 = 0;

    @OriginalMember(owner = "client!qr", name = "C", descriptor = "I")
    public static int field10277 = 0;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "B")
    public byte field10257;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "B")
    public byte field10259;

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "B")
    public byte field10262;

    @OriginalMember(owner = "client!qr", name = "t", descriptor = "B")
    public byte field10268;

    @OriginalMember(owner = "client!qr", name = "u", descriptor = "B")
    public byte field10269;

    @OriginalMember(owner = "client!qr", name = "v", descriptor = "B")
    public byte field10270;

    @OriginalMember(owner = "client!qr", name = "y", descriptor = "B")
    public byte field10273;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field10250;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public static int field10251;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field10254;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public int field10256;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
    public int field10258;

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "I")
    public int field10267;

    @OriginalMember(owner = "client!qr", name = "x", descriptor = "I")
    public static int field10272;

    @OriginalMember(owner = "client!qr", name = "B", descriptor = "I")
    public static int field10276;

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "S")
    public short field10266;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "Z")
    public boolean field10249;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "Z")
    public boolean field10252;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "Z")
    public boolean field10253;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "Z")
    public boolean field10255;

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "Z")
    public boolean field10261;

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "Z")
    public boolean field10263;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "Z")
    public boolean field10264;

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "Z")
    public boolean field10265;

    @OriginalMember(owner = "client!qr", name = "w", descriptor = "[I")
    public static int[] field10271;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V", line = 16)
    public static void method4119(int arg0) {
        field10260 = null;
        field10271 = null;
        field10274 = null;
        if (arg0 != 0) {
            method4120(-57, null, (byte) 112);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILae;B)Lce;", line = 32)
    public static final class588 method4120(int arg0, class283 arg1, byte arg2) {
        field10251++;
        byte[] var3 = arg1.method1854(0, arg0);
        if (arg2 < 68) {
            method4119(-31);
        }
        return var3 == null ? null : new class588(var3);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V", line = 53)
    public static final void method4121(byte arg0) {
        field10254++;
        if (class610.field8597 == -1) {
            return;
        }
        int var1 = class205.field2881.method354((byte) -20);
        int var2 = class205.field2881.method351(-25269);
        class620 var3 = (class620) class297.field4326.method1041(arg0 + 1048953);
        if (arg0 != -121) {
            return;
        }
        if (var3 != null) {
            var1 = var3.method1623(true);
            var2 = var3.method1626(51);
        }
        int var4 = 0;
        int var5 = 0;
        if (class55.field651) {
            var4 = class236.method1611(-5110);
            var5 = class339.method2149((byte) -110);
        }
        class121.method854(var4, var4, var2, class742.field10226 + var4, var5, class249.field3700 + var5, var1 + var4, var1, var5, var2 + var5, class610.field8597, false);
        if (class378.field5431 != null) {
            class224.method1514((byte) 17, var1 + var4, var2 + var5);
        }
    }
}
