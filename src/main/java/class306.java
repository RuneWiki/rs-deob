import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class306 {

    @OriginalMember(owner = "client!on", name = "l", descriptor = "Lfaa;")
    private class139 field4233 = new class139(256);

    @OriginalMember(owner = "client!on", name = "m", descriptor = "Lfaa;")
    private class139 field4234 = new class139(256);

    @OriginalMember(owner = "client!on", name = "i", descriptor = "Lsea;")
    private class648 field4230;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "Lsea;")
    private class648 field4231;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "[Lut;")
    public static class109[] field4228 = new class109[14];

    @OriginalMember(owner = "client!on", name = "f", descriptor = "F")
    public static float field4227 = 1.0F;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "Lrc;")
    public static class499 field4232;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "[[B")
    public static byte[][] field4223;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "([IIIB)Lbu;")
    private final class19 method1856(int[] arg0, int arg1, int arg2, byte arg3) {
        field4226++;
        int var5 = arg2 ^ (arg1 << 4 & 0xFFFF | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class19 var9 = (class19) this.field4234.method970((byte) 89, var7);
        if (arg3 != -86) {
            return null;
        } else if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class172 var10 = (class172) this.field4233.method970((byte) 89, var7);
            if (var10 == null) {
                var10 = class172.method1214(this.field4231, arg1, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field4233.method968(var7, var10, -1);
            }
            class19 var11 = var10.method1215(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method2340(arg3 + 202);
                this.field4234.method968(var7, var11, arg3 ^ 0x55);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(III)Z")
    public static final boolean method1857(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field4224++;
            return ((arg1 & 0x2000) != 0 | class91.method662(-2, arg0, arg1) | class330.method1958(arg2 + 122, arg0, arg1)) & class14.method72((byte) -57, arg1, arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
    public static void method1858(int arg0) {
        field4232 = null;
        if (arg0 >= -62) {
            method1858(-92);
        }
        field4228 = null;
        field4223 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "([IIII)Lbu;")
    private final class19 method1859(int[] arg0, int arg1, int arg2, int arg3) {
        field4225++;
        int var5 = ((arg3 & 0x50000FFF) << 4 | arg3 >>> 12) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class19 var9 = (class19) this.field4234.method970((byte) 89, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class237 var10 = class237.method1484(this.field4230, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            class19 var11 = var10.method1485();
            this.field4234.method968(var7, var11, -1);
            if (arg0 != null) {
                arg0[0] -= var11.field205.length;
            }
            int var12 = -52 / ((arg1 + 65) / 48);
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "([III)Lbu;")
    public final class19 method1860(int[] arg0, int arg1, int arg2) {
        field4229++;
        if (this.field4230.method3649((byte) 112) == 1) {
            return this.method1859(arg0, -117, arg2, 0);
        }
        if (arg1 != 0) {
            this.method1856(null, 93, -75, (byte) 20);
        }
        if (this.field4230.method3653(arg2, true) != 1) {
            throw new RuntimeException();
        }
        return this.method1859(arg0, -120, 0, arg2);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I[IZ)Lbu;")
    public final class19 method1861(int arg0, int[] arg1, boolean arg2) {
        field4222++;
        if (this.field4231.method3649((byte) 112) == 1) {
            return this.method1856(arg1, 0, arg0, (byte) -86);
        } else if (this.field4231.method3653(arg0, arg2) == 1) {
            return this.method1856(arg1, arg0, 0, (byte) -86);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lsea;Lsea;)V")
    public class306(class648 arg0, class648 arg1) {
        this.field4230 = arg0;
        this.field4231 = arg1;
    }
}
