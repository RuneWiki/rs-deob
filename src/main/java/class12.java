import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public abstract class class12 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Ltg;")
    public static class277 field228 = new class277(512);

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "Llc;")
    public static class143 field234 = class66.method374("<col=ff7000>", -1);

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Z")
    public static volatile boolean field235 = true;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "[I")
    public static int[] field237 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "Lvh;")
    public static class43 field236;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public static final void method95(byte arg0) {
        if (arg0 <= -4) {
            field229++;
            if (class147.field2652 == 30) {
                class43.method271(25, -37);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public abstract void method96(int arg0);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZB)V")
    public static final void method97(boolean arg0, byte arg1) {
        field232++;
        byte[][] var2 = class40.field687;
        int var3 = -93 / ((arg1 - 38) / 60);
        int var4 = class240.field4330.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = var2[var5];
            if (var6 != null) {
                int var7 = (class6.field88[var5] & 0xFF) * 64 - class141.field2466;
                int var8 = (class6.field88[var5] >> 8) * 64 - class148.field2733;
                class224.method1543((byte) -56);
                class112.method674(var7, 3, var6, arg0, class171.field3052, var8);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V")
    public static void method98(byte arg0) {
        int var1 = 9 / ((arg0 + 2) / 46);
        field237 = null;
        field228 = null;
        field234 = null;
        field236 = null;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
    public static final void method99(int arg0) {
        if (arg0 != 512) {
            return;
        }
        if (class51.field1016 == null || class279.field4922 == null) {
            class51.field1016 = new int[256];
            class279.field4922 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class51.field1016[var1] = (int) (Math.sin(var2) * 4096.0D);
                class279.field4922[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field230++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V")
    public static final void method100(int arg0, int arg1) {
        class1.field13.method835(1, arg1);
        if (arg0 != 4096) {
            method99(-18);
        }
        field231++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)I")
    public abstract int method101(int arg0, int arg1, int arg2);
}
