import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class322 implements class438 {

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Lem;")
    public static class206 field4398 = new class206(75, 3);

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Lfaa;")
    public static class139 field4400 = new class139(512);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public int field4387;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public int field4391;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public int field4392;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public int field4395;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public int field4396;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public int field4399;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Lfb;")
    public static class627 field4389;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Z")
    public boolean field4390;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Loga;B)Z")
    public final boolean method1929(class438 arg0, byte arg1) {
        field4394++;
        if (!(arg0 instanceof class322)) {
            return false;
        }
        class322 var3 = (class322) arg0;
        if (this.field4396 != var3.field4396) {
            return false;
        } else if (arg1 != -47) {
            return false;
        } else if (this.field4395 != var3.field4395) {
            return false;
        } else if (this.field4387 != var3.field4387) {
            return false;
        } else if (this.field4391 != var3.field4391) {
            return false;
        } else if (this.field4392 != var3.field4392) {
            return false;
        } else if (this.field4399 == var3.field4399) {
            return var3.field4390 == this.field4390;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIII)V")
    public static final void method1930(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4393++;
        class51 var5 = class703.method3938(-1989279584, arg3, arg0);
        var5.method402((byte) 100);
        var5.field605 = arg2;
        var5.field604 = arg1;
        var5.field603 = arg4;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
    public static void method1931(byte arg0) {
        if (arg0 != 25) {
            method1932(-117, -108);
        }
        field4398 = null;
        field4400 = null;
        field4389 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
    public static final void method1932(int arg0, int arg1) {
        field4388++;
        if (arg1 != 472256856) {
            method1930(-109, 63, -11, -11, -37);
        }
        class51 var2 = class703.method3938(-1989279584, arg0, 16);
        var2.method404(124);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)J")
    public final long method1933(byte arg0) {
        field4397++;
        long[] var2 = class422.field5939;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field4396 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) (((long) (this.field4395 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field4395 ^ var7) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field4387 >> 24) ^ var9) & 0xFFL)];
        long var13 = var2[(int) ((var11 ^ (long) (this.field4387 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var2[(int) (((long) (this.field4387 >> 8) ^ var13) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var15 >>> 8 ^ var2[(int) (((long) this.field4387 ^ var15) & 0xFFL)];
        long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field4391) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field4392 >> 24)) & 0xFFL)];
        if (arg0 > -23) {
            field4389 = null;
        }
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field4392 >> 16) ^ var21) & 0xFFL)];
        long var25 = var23 >>> 8 ^ var2[(int) ((var23 ^ (long) (this.field4392 >> 8)) & 0xFFL)];
        long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field4392 ^ var25) & 0xFFL)];
        long var29 = var27 >>> 8 ^ var2[(int) ((var27 ^ (long) this.field4399) & 0xFFL)];
        return var2[(int) (((long) (this.field4390 ? 1 : 0) ^ var29) & 0xFFL)] ^ var29 >>> 8;
    }
}
