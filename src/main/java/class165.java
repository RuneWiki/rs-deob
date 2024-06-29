import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class class165 {

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field3157 = 128;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Lsg;")
    private static class169 field3155 = method1060("glow1:", 1536);

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "[Z")
    public static boolean[] field3158 = new boolean[112];

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Lsg;")
    public static class169 field3164 = field3155;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Lsg;")
    public static class169 field3162 = field3155;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Lcb;")
    public static class22 field3159 = new class22();

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field3170 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Lsg;")
    public static class169 field3171 = method1060("huffman", 1536);

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public int field3165;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public int field3169;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "Ljava/awt/Image;")
    public Image field3166;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "[I")
    public int[] field3160;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[Lsg;)Lsg;")
    public static final class169 method1058(int arg0, class169[] arg1) {
        if (arg0 != 0) {
            return null;
        }
        field3168++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class154.method1009(0, 0, arg1, arg1.length);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method763(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public final void method1059(byte arg0) {
        if (arg0 != 14) {
            method1061(28, null);
        }
        field3163++;
        class130.method841(this.field3160, this.field3169, this.field3165);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public abstract void method765(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;I)Lsg;")
    public static final class169 method1060(String arg0, int arg1) {
        byte[] var2 = arg0.getBytes();
        field3156++;
        if (arg1 != 1536) {
            field3158 = null;
        }
        int var3 = var2.length;
        int var4 = 0;
        class169 var5 = new class169();
        var5.field3248 = new byte[var3];
        while (var4 < var3) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 >= var3) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field3248[var5.field3253++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field3248[var5.field3253++] = (byte) var6;
            }
        }
        var5.method1119((byte) -20);
        return var5.method1102((byte) 118);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BILjava/awt/Component;I)V")
    public abstract void method764(byte arg0, int arg1, Component arg2, int arg3);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILv;)V")
    public static final void method1061(int arg0, class189 arg1) {
        if (arg1.field3728 == 0) {
            arg1.field3681 = 1024;
        }
        int var2 = arg1.field3693 - class162.field3107;
        int var3 = arg1.field3686 * 128 + arg1.field3711 * 64;
        arg1.field3698 += (var3 - arg1.field3698) / var2;
        arg1.field3670 = 0;
        field3161++;
        if (arg1.field3728 == 1) {
            arg1.field3681 = 1536;
        }
        int var4 = arg1.field3711 * 64 + arg1.field3669 * 128;
        arg1.field3679 += (var4 - arg1.field3679) / var2;
        if (arg0 != -3) {
            return;
        }
        if (arg1.field3728 == 2) {
            arg1.field3681 = 0;
        }
        if (arg1.field3728 == 3) {
            arg1.field3681 = 512;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    protected class165() {
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
    public static void method1062(byte arg0) {
        field3159 = null;
        field3171 = null;
        field3164 = null;
        field3155 = null;
        field3158 = null;
        if (arg0 != -86) {
            method1061(-14, null);
        }
        field3162 = null;
    }
}
