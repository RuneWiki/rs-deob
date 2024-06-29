import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public abstract class class122 {

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Lu;")
    private static class135 field2926 = class87.method676((byte) -107, "Private chat");

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Lu;")
    private static class135 field2927 = class87.method676((byte) -88, "Loaded update list");

    @OriginalMember(owner = "client!re", name = "m", descriptor = "Lu;")
    public static class135 field2929 = field2927;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "Lu;")
    public static class135 field2931 = field2926;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "Lu;")
    private static class135 field2934 = class87.method676((byte) -66, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!re", name = "t", descriptor = "Lu;")
    private static class135 field2936 = class87.method676((byte) -79, "flash1:");

    @OriginalMember(owner = "client!re", name = "p", descriptor = "Lu;")
    public static class135 field2932 = field2934;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Lu;")
    public static class135 field2918 = field2936;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "Lu;")
    public static class135 field2933 = field2936;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public int field2922;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public int field2925;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "Lpe;")
    public static class109 field2917;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "Ljava/awt/Image;")
    public Image field2930;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "[I")
    public int[] field2921;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "[I")
    public static int[] field2924;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static void method962(byte arg0) {
        field2917 = null;
        field2934 = null;
        field2929 = null;
        field2936 = null;
        field2926 = null;
        field2933 = null;
        field2918 = null;
        field2927 = null;
        field2932 = null;
        int var1 = 96 / ((arg0 + 28) / 44);
        field2924 = null;
        field2931 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method94(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static final void method963(int arg0) {
        field2935++;
        int var1 = class63.field1579.method115(class90.field2111);
        for (int var2 = arg0; var2 < class131.field3135; var2++) {
            int var12 = class63.field1579.method120(class108.field2599[var2]);
            if (var1 < var12) {
                var1 = var12;
            }
        }
        var1 += 8;
        int var3 = class131.field3135 * 15 + 21;
        if (class19.field425 != -1) {
            class128.field3077 = true;
            class12.field289 = var1;
            class28.field676 = class131.field3135 * 15 + 22;
            int var4 = class20.field470;
            if (var3 + var4 > 503) {
                var4 = 503 - var3;
            }
            if (var4 < 0) {
                var4 = 0;
            }
            int var5 = class139.field3389 - var1 / 2;
            class94.field2237 = 0;
            if (var1 + var5 > 765) {
                var5 = 765 - var1;
            }
            class14.field331 = var4;
            if (var5 < 0) {
                var5 = 0;
            }
            class80.field1908 = var5;
        } else if (class139.field3389 > 4 && class20.field470 > 4 && class139.field3389 < 516 && class20.field470 < 338) {
            class128.field3077 = true;
            class12.field289 = var1;
            int var6 = class139.field3389 - var1 / 2 - 4;
            class94.field2237 = 0;
            class28.field676 = class131.field3135 * 15 + 22;
            if (var1 + var6 > 512) {
                var6 = 512 - var1;
            }
            int var7 = class20.field470 - 4;
            if (var3 + var7 > 334) {
                var7 = 334 - var3;
            }
            if (var7 < 0) {
                var7 = 0;
            }
            class14.field331 = var7;
            if (var6 < 0) {
                var6 = 0;
            }
            class80.field1908 = var6;
        } else if (class139.field3389 > 553 && class20.field470 > 205 && class139.field3389 < 743 && class20.field470 < 466) {
            class128.field3077 = true;
            class12.field289 = var1;
            class28.field676 = class131.field3135 * 15 + 22;
            int var8 = class20.field470 - 205;
            class94.field2237 = 1;
            if (var8 < 0) {
                var8 = 0;
            } else if (var3 + var8 > 261) {
                var8 = 261 - var3;
            }
            class14.field331 = var8;
            int var9 = class139.field3389 - var1 / 2 - 553;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 + var1 > 190) {
                var9 = 190 - var1;
            }
            class80.field1908 = var9;
        } else if (class139.field3389 > 17 && class20.field470 > 357 && class139.field3389 < 496 && class20.field470 < 453) {
            int var10 = class139.field3389 - var1 / 2 - 17;
            class128.field3077 = true;
            class12.field289 = var1;
            class28.field676 = class131.field3135 * 15 + 22;
            class94.field2237 = 2;
            int var11 = class20.field470 - 357;
            if (var10 < 0) {
                var10 = 0;
            } else if (var1 + var10 > 479) {
                var10 = 479 - var1;
            }
            class80.field1908 = var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var3 + var11 > 96) {
                var11 = 96 - var3;
            }
            class14.field331 = var11;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)V")
    public static final void method964(int arg0, int arg1, int arg2) {
        field2923++;
        if (class84.field1996 != 0 && arg2 != -1) {
            class4.method16(0, class68.field1670, arg2, 84, false, class84.field1996);
            class69.field1709 = true;
        }
        int var3 = -127 / ((15 - arg0) / 47);
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)Z")
    public static final boolean method965(int arg0) {
        int var1 = -56 / ((62 - arg0) / 61);
        field2920++;
        class77 var2 = class46.field1103;
        synchronized (class46.field1103) {
            if (class3.field85 == class1.field15) {
                return false;
            } else {
                class46.field1106 = class131.field3167[class1.field15];
                class32.field750 = class2.field58[class1.field15];
                class1.field15 = class1.field15 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
    public final void method966(int arg0) {
        if (arg0 >= -43) {
            this.method966(103);
        }
        field2928++;
        class70.method558(this.field2921, this.field2925, this.field2922);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
    protected class122() {
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method93(int arg0, int arg1, int arg2, Component arg3);
}
