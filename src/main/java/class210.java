import java.awt.Component;
import java.io.IOException;
import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class210 extends class8 {

    @OriginalMember(owner = "client!tl", name = "O", descriptor = "I")
    private int field3449 = -1;

    @OriginalMember(owner = "client!tl", name = "R", descriptor = "I")
    private int field3452 = 0;

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "I")
    private int field3442;

    @OriginalMember(owner = "client!tl", name = "M", descriptor = "I")
    public static int field3447 = 255;

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "Z")
    public static boolean field3446 = false;

    @OriginalMember(owner = "client!tl", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field3450 = new String[100];

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!tl", name = "I", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!tl", name = "N", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!tl", name = "Q", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!tl", name = "S", descriptor = "Leg;")
    public static class154 field3453;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V", line = 6)
    public final void method1517(int arg0) {
        field3440++;
        int var2 = class131.method967(103);
        if ((var2 & 0x1) == 0) {
            class232.method1662(this.field3449);
        }
        if ((var2 & 0x2) == 0) {
            class232.method1677(0);
        }
        if (arg0 < -38 && (var2 & 0x4) == 0) {
            class232.method1664(0);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/awt/Component;III)Lsi;", line = 32)
    public static final class336 method1518(Component arg0, int arg1, int arg2, int arg3) {
        field3448++;
        try {
            Class var4 = Class.forName("cf");
            class336 var5 = (class336) var4.getDeclaredConstructor().newInstance();
            var5.method558(true, arg0, arg2, arg3);
            int var6 = -107 % ((arg1 + 35) / 43);
            return var5;
        } catch (Throwable var9) {
            class128 var8 = new class128();
            var8.method558(true, arg0, arg2, arg3);
            return var8;
        }
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)V", line = 57)
    public static void method1519(int arg0) {
        field3453 = null;
        if (arg0 == -6184) {
            field3450 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILak;II)[Lbf;", line = 77)
    public static final class58[] method1520(int arg0, class172 arg1, int arg2, int arg3) {
        if (arg2 == 14738) {
            field3445++;
            return class55.method353(arg1, arg0, (byte) -5, arg3) ? class55.method356(255) : null;
        } else {
            return (class58[]) null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "finalize", descriptor = "()V", line = 101)
    protected final void finalize() throws Throwable {
        if (this.field3449 != -1) {
            class230.method1630(this.field3449, this.field3452, this.field3442);
            this.field3449 = -1;
            this.field3452 = 0;
        }
        super.finalize();
        field3443++;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(I)V", line = 128)
    public class210(int arg0) {
        GL var2 = class232.field3716;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field3449 = var3[0];
        this.field3442 = class230.field3658;
        class232.method1662(this.field3449);
        int var4 = class170.field2812[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class230.field3663 += var6.limit() - this.field3452;
        this.field3452 = var6.limit();
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljh;I)V", line = 155)
    public static final void method1521(class124 arg0, int arg1) {
        class149.field2311 = 3;
        field3441++;
        class313 var2 = null;
        class73.method488(-107, true);
        class245.field3872 = true;
        class185.field3065 = 0;
        class297.field4695 = true;
        class174.field2883 = arg1;
        class45.field634 = 0;
        class43.field541 = true;
        class273.field4410 = true;
        class8.field123 = true;
        class245.field3863 = true;
        class42.field535 = true;
        class70.field994 = 0;
        field3447 = 255;
        class261.field4169 = 127;
        class18.field250 = 2;
        class34.field460 = 0;
        class322.field4994 = true;
        class322.field4989 = true;
        class180.field2984 = true;
        class152.field2352 = true;
        if (class36.field480 < 96) {
            class294.method2101(0);
        } else {
            class294.method2101(2);
        }
        class105.field1537 = 0;
        class57.field803 = false;
        class159.field2627 = false;
        class79.field1111 = false;
        class318.field4946 = 0;
        class231.field3681 = true;
        class97.field1376 = 0;
        try {
            class161 var3 = arg0.method894("runescape", (byte) -126);
            while (var3.field2661 == 0) {
                class121.method867((byte) -89, 1L);
            }
            if (var3.field2661 == 1) {
                var2 = (class313) var3.field2664;
                byte[] var4 = new byte[(int) var2.method2199(106)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method2202(arg1 ^ 0xFFFFFFF2, var5, var4, var4.length - var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class199.method1463(1, new class44(var4));
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method2203(-1);
            }
        } catch (Exception var9) {
        }
    }
}
