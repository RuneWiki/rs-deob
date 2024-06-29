import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class668 implements class130 {

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Lkb;")
    private class718 field9295;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "[Laj;")
    private class331[] field9294;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "Lsaa;")
    public static class345 field9298 = new class345(8, 1);

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "Lpha;")
    public static class174 field9303 = new class174("", 14);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field9289;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field9290;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field9292;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field9296;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field9297;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field9299;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field9300;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Lha;")
    private class65 field9291;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "Z")
    private boolean field9293;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "[[[S")
    public static short[][][] field9301;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public final void method969(byte arg0) {
        field9299++;
        if (class37.field491 != this.field9291) {
            this.field9293 = true;
            this.field9291 = class37.field491;
        }
        this.field9291.method509(0);
        if (arg0 <= 66) {
            return;
        }
        class331[] var2 = this.field9294;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class331 var4 = var2[var3];
            if (var4 != null) {
                var4.method297(122);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V")
    public static void method3799(int arg0) {
        int var1 = 69 % ((arg0 + 64) / 61);
        field9301 = null;
        field9298 = null;
        field9303 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)I")
    public final int method970(boolean arg0) {
        if (!arg0) {
            this.field9293 = true;
        }
        field9292++;
        int var2 = 0;
        class331[] var3 = this.field9294;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class331 var5 = var3[var4];
            if (var5 == null || var5.method298((byte) -98)) {
                var2++;
            }
        }
        return var2 * 100 / this.field9294.length;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IJ)Z")
    public final boolean method967(int arg0, long arg1) {
        field9302++;
        if (arg0 != -30245) {
            this.method968(true, (byte) 6);
        }
        return class459.method2731(109) >= ((long) this.field9295.field9951 + arg1);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)Z")
    public static final boolean method3800(int arg0, boolean arg1) {
        if (arg1) {
            method3800(57, true);
        }
        field9297++;
        return arg0 == 0 || arg0 == 2;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lkb;Lsb;)V")
    public class668(class718 arg0, class306 arg1) {
        this.field9295 = arg0;
        this.field9294 = new class331[this.field9295.field9948.length];
        for (int var3 = 0; var3 < this.field9294.length; var3++) {
            this.field9294[var3] = arg1.method1980((byte) 25, this.field9295.field9948[var3]);
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
    public static final void method3801(byte arg0) {
        if (class578.field8148 != null) {
            class578.field8148.method533(112);
            class345.field4815 = null;
            class578.field8148 = null;
        }
        field9296++;
        if (arg0 != 65) {
            method3801((byte) -118);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)I")
    public final int method966(int arg0) {
        field9300++;
        if (arg0 != 9619) {
            this.field9293 = false;
        }
        return this.field9295.field9950;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    public final void method971(int arg0) {
        if (arg0 != 4005) {
            this.method969((byte) -82);
        }
        field9289++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZB)V")
    public final void method968(boolean arg0, byte arg1) {
        field9290++;
        boolean var3 = true;
        class331[] var4 = this.field9294;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class331 var6 = var4[var5];
            if (var6 != null) {
                var6.method299(var3 || this.field9293, false);
            }
        }
        this.field9293 = false;
        if (arg1 != -84) {
            this.method967(-55, 94L);
        }
    }
}
