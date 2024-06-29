import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class class391 {

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public int field5468 = 0;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "[B")
    public byte[] field5470 = new byte[5000];

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public int field5472 = 0;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "[F")
    public float[] field5466 = new float[5000];

    @OriginalMember(owner = "client!si", name = "l", descriptor = "[Ljava/lang/Object;")
    public Object[] field5473 = new Object[5000];

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public volatile int field5474 = 0;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public volatile int field5464 = 0;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "[F")
    public static float[] field5463 = new float[4];

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljv;III)J", line = 5)
    public static final long method2238(class55 arg0, int arg1, int arg2, int arg3) {
        field5462++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class132 var10 = class82.field1154.method2121(arg0.method354((byte) 126), true);
        long var11 = (long) (arg3 | 0x800000 << 7 | arg1 | arg0.method355(13599) << 14 | arg0.method359((byte) -8) << 20);
        if (var10.field1850 == 0) {
            var11 |= var8;
        }
        if (var10.field1853 == 1) {
            var11 |= var4;
        }
        if (var10.field1884) {
            var11 |= var6;
        }
        long var13 = var11 | (long) arg0.method354((byte) -64) << 32;
        if (arg2 != -10737) {
            method2244((byte) -38, null);
        }
        return var13;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILbt;I)Ljc;", line = 45)
    public static final class302 method2239(int arg0, class33 arg1, int arg2) {
        field5469++;
        class302 var3;
        if (class135.field1954 == null) {
            var3 = new class302();
        } else {
            var3 = class135.field1954;
            class135.field1954 = class135.field1954.field4140;
            var3.field4140 = null;
            class31.field452--;
        }
        if (arg2 != 1) {
            method2244((byte) 59, null);
        }
        var3.field4139 = arg0;
        var3.field4136 = arg1;
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)Lgf;", line = 74)
    public static final class180 method2240(int arg0, int arg1, int arg2) {
        class61 var3 = class385.field5410[arg0][arg1][arg2];
        return var3 == null || var3.field824 == null ? null : var3.field824;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IFFF)I", line = 85)
    public static final int method2241(int arg0, float arg1, float arg2, float arg3) {
        field5467++;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = (arg2 < (float) arg0) ? -arg2 : arg2;
        float var6 = arg3 < 0.0F ? -arg3 : arg3;
        if (var4 < var5 && var6 < var5) {
            return (arg2 > 0.0F) ? 0 : 1;
        } else if (var4 < var6 && var5 < var6) {
            return arg3 > 0.0F ? 2 : 3;
        } else if (arg1 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II)I", line = 137)
    public static final int method2242(int arg0, int arg1) {
        if (arg1 > -33) {
            method2242(36, -62);
        }
        field5471++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V", line = 152)
    public static void method2243(int arg0) {
        if (arg0 == -92905113) {
            field5463 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLvh;)V", line = 165)
    public static final void method2244(byte arg0, class240 arg1) {
        if (arg0 < 30) {
            method2238(null, -76, -83, -115);
        }
        class405.field5627 = arg1.method1396("titlebg", (byte) 71);
        field5465++;
        class278.field3755 = arg1.method1396("logo", (byte) 71);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public abstract void method1951(byte arg0);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)V")
    public abstract void method1958(int arg0, boolean arg1);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public abstract void method1955(int arg0);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
    public abstract void method1953(int arg0, int arg1);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLsd;)V")
    public abstract void method1957(boolean arg0, class61 arg1);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lsd;B)V")
    public abstract void method1952(class61 arg0, byte arg1);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILsd;)V")
    public abstract void method1956(int arg0, class61 arg1);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLna;FII)V")
    public abstract void method1959(boolean arg0, class35 arg1, float arg2, int arg3, int arg4);
}
