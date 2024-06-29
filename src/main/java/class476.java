import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class476 implements class524 {

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field6560 = 0;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "Ljava/lang/String;")
    public static String field6563 = null;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "[Lwp;")
    public static class118[] field6566 = new class118[4];

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public int field6558;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public int field6559;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public int field6561;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public int field6562;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public int field6564;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public int field6567;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Z")
    public boolean field6568;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)J")
    public final long method2734(boolean arg0) {
        field6565++;
        long[] var2 = class172.field2502;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field6564 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) (((long) (this.field6562 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) ((var7 ^ (long) this.field6562) & 0xFFL)];
        long var11 = var2[(int) (((long) (this.field6567 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var2[(int) (((long) (this.field6567 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var2[(int) (((long) (this.field6567 >> 8) ^ var13) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) (((long) this.field6567 ^ var15) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field6558 ^ var17) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field6561 >> 24)) & 0xFFL)];
        long var23 = var2[(int) ((var21 ^ (long) (this.field6561 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var2[(int) (((long) (this.field6561 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var2[(int) (((long) this.field6561 ^ var25) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var27 >>> 8 ^ var2[(int) ((var27 ^ (long) this.field6559) & 0xFFL)];
        long var31 = var29 >>> 8 ^ var2[(int) ((var29 ^ (long) (this.field6568 ? 1 : 0)) & 0xFFL)];
        if (arg0) {
            this.field6564 = 99;
        }
        return var31;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static final void method2735(int arg0) {
        field6569++;
        if (class304.field4004 != null) {
            class304.field4004.method1886(arg0 - 256);
            class304.field4004 = null;
        }
        class129.method924(-10808);
        class99.method708();
        for (int var1 = 0; var1 < 4; var1++) {
            class120.field1754[var1].method1155(true);
        }
        class148.method1023(true, false);
        System.gc();
        client.method1258(2, (byte) 60);
        class153.field2234 = -1;
        class21.field380 = false;
        class442.method2552(true, (byte) -13);
        class421.field5762 = 0;
        class401.field5382 = 0;
        class522.field7715 = 0;
        class55.field872 = 0;
        class176.field2564 = 0;
        for (int var2 = 0; var2 < class335.field4395.length; var2++) {
            class335.field4395[var2] = null;
        }
        class245.method1494((byte) 55);
        for (int var3 = 0; var3 < 2048; var3++) {
            class499.field6901[var3] = null;
        }
        if (arg0 != 255) {
            method2735(-120);
        }
        class60.field942 = 0;
        for (int var4 = 0; var4 < 32768; var4++) {
            class291.field3822[var4] = null;
        }
        class436.field5982.method176(-1);
        class430.method2483(true);
        class47.field710 = 0;
        class301.field3980.method1723(16);
        class21.method199((byte) 126);
        class462.method2631(arg0 - 153);
        class39.method291(true, arg0 - 256);
        try {
            class87.method637(-118, class389.field5281.field2917, "loggedout");
        } catch (Throwable var5) {
        }
        class50.field776 = null;
        class319.field4182 = 0L;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)V")
    public static final void method2736(int arg0, byte arg1) {
        class132.field1909 = arg0;
        field6570++;
        if (arg1 != 108) {
            method2736(3, (byte) -20);
        }
        class347.field4676.method1458((byte) 118);
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public static void method2737(int arg0) {
        field6566 = null;
        field6563 = null;
        if (arg0 != 255) {
            method2736(107, (byte) 44);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lkr;B)Z")
    public final boolean method2738(class524 arg0, byte arg1) {
        field6557++;
        if (!(arg0 instanceof class476)) {
            return false;
        }
        class476 var3 = (class476) arg0;
        if (this.field6564 != var3.field6564) {
            return false;
        } else if (this.field6562 != var3.field6562) {
            return false;
        } else if (this.field6567 == var3.field6567) {
            int var4 = -116 % ((arg1 + 74) / 50);
            if (this.field6558 != var3.field6558) {
                return false;
            } else if (this.field6561 != var3.field6561) {
                return false;
            } else if (this.field6559 == var3.field6559) {
                return var3.field6568 == this.field6568;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
