import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public abstract class class116 {

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "[J")
    public static long[] field2011 = new long[256];

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public int field2008;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Ljava/awt/Image;")
    public Image field2010;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "[I")
    public int[] field2009;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public final void method818(byte arg0) {
        class23.method165(this.field2009, this.field2012, this.field2008);
        if (arg0 != 79) {
            this.field2012 = -119;
        }
        field2007++;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method804(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method799(int arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public abstract void method801(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)V")
    public static void method819(byte arg0) {
        field2011 = null;
        int var1 = 109 / ((-arg0 - 29) / 42);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BJ)V")
    public static final void method820(byte arg0, long arg1) {
        field2014++;
        class261.field4645.field2593 = 0;
        class261.field4645.method1041(true, 248);
        class261.field4645.method1048((byte) 108, arg1);
        if (arg0 > 89) {
            class25.field521 = -3;
            class55.field1022 = 0;
            class216.field3848 = 0;
            class242.field4411 = 1;
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(B)V")
    public static final void method821(byte arg0) {
        class107.field1895 = null;
        class287.field5127 = null;
        class241.field4402 = null;
        class170.field3021 = null;
        class243.field4421 = null;
        field2006++;
        if (arg0 < -122) {
            class185.field3286 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
    protected class116() {
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2011[var0] = var1;
        }
        field2013 = 3;
    }
}
