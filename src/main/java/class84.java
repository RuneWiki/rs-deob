import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class84 implements class589 {

    @OriginalMember(owner = "client!qfa", name = "g", descriptor = "Lso;")
    public static class433 field1384 = new class433();

    @OriginalMember(owner = "client!qfa", name = "o", descriptor = "[I")
    public static int[] field1392 = new int[1000];

    @OriginalMember(owner = "client!qfa", name = "n", descriptor = "Lnea;")
    public static class664 field1391 = new class664(70, 12);

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "I")
    public int field1379;

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "I")
    public int field1380;

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "I")
    public int field1381;

    @OriginalMember(owner = "client!qfa", name = "e", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!qfa", name = "f", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!qfa", name = "h", descriptor = "I")
    public int field1385;

    @OriginalMember(owner = "client!qfa", name = "j", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!qfa", name = "k", descriptor = "I")
    public int field1388;

    @OriginalMember(owner = "client!qfa", name = "l", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!qfa", name = "m", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!qfa", name = "p", descriptor = "J")
    public static long field1393;

    @OriginalMember(owner = "client!qfa", name = "i", descriptor = "Z")
    public boolean field1386;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)J")
    public final long method740(int arg0) {
        field1387++;
        long[] var2 = class597.field8433;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field1378 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) ((var5 ^ (long) (this.field1379 >> 8)) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field1379 ^ var7) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field1380 >> 24) ^ var9) & 0xFFL)];
        long var13 = var11 >>> 8 ^ var2[(int) ((var11 ^ (long) (this.field1380 >> 16)) & 0xFFL)];
        long var15 = var13 >>> 8 ^ var2[(int) ((var13 ^ (long) (this.field1380 >> 8)) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field1380) & 0xFFL)];
        long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field1381) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) (((long) (this.field1388 >> 24) ^ var19) & 0xFFL)];
        if (arg0 != 22503) {
            this.method740(115);
        }
        long var23 = var2[(int) ((var21 ^ (long) (this.field1388 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var2[(int) (((long) (this.field1388 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var2[(int) (((long) this.field1388 ^ var25) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field1385 ^ var27) & 0xFFL)];
        return var2[(int) (((long) (this.field1386 ? 1 : 0) ^ var29) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lqt;I)Z")
    public final boolean method741(class589 arg0, int arg1) {
        field1382++;
        if (!(arg0 instanceof class84)) {
            return false;
        }
        class84 var3 = (class84) arg0;
        if (this.field1378 != var3.field1378) {
            return false;
        } else if (this.field1379 == var3.field1379) {
            if (arg1 != -3267) {
                this.field1381 = 47;
            }
            if (this.field1380 != var3.field1380) {
                return false;
            } else if (this.field1381 != var3.field1381) {
                return false;
            } else if (this.field1388 != var3.field1388) {
                return false;
            } else if (this.field1385 == var3.field1385) {
                return this.field1386 == var3.field1386;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BLpaa;)V")
    public static final void method742(byte arg0, class577 arg1) {
        field1383++;
        int var2 = -90 / ((arg0 + 40) / 43);
        for (class28 var3 = (class28) class490.field6944.method472((byte) -88); var3 != null; var3 = (class28) class490.field6944.method482(125)) {
            if (var3.field425 == arg1) {
                if (var3.field430 != null) {
                    class627.field8780.method2114(var3.field430);
                    var3.field430 = null;
                }
                var3.method3678(-1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Z)V")
    public static final void method743(boolean arg0) {
        field1390++;
        class382 var1 = class513.field7222;
        synchronized (class513.field7222) {
            class513.field7222.method2285((byte) -83);
            if (arg0) {
                method742((byte) 13, null);
            }
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lmo;Z)Lon;")
    public static final class304 method744(class695 arg0, boolean arg1) {
        field1389++;
        if (!arg1) {
            field1384 = null;
        }
        class455 var2 = class457.method2686(arg0, 22466);
        int var3 = arg0.method3842(-2);
        return new class304(var2.field6537, var2.field6534, var2.field6535, var2.field6530, var2.field6529, var3);
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)V")
    public static void method745(byte arg0) {
        field1384 = null;
        int var1 = 91 % ((1 - arg0) / 43);
        field1392 = null;
        field1391 = null;
    }
}
