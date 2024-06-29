import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public abstract class class10 {

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field106 = 0;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "Z")
    public static boolean field104 = true;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public int field112;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "Lgk;")
    public static class10 field107;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "Ljava/awt/Image;")
    public Image field109;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "[I")
    public int[] field102;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "[Lpf;")
    public static class97[] field94;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 6)
    public final void method59(int arg0) {
        class343.method2355(this.field102, this.field100, this.field112);
        if (arg0 != 0) {
            this.field109 = (Image) null;
        }
        field105++;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILnk;)Z", line = 20)
    public static final boolean method60(int arg0, class16 arg1) {
        if (arg0 == -32749) {
            field97++;
            return arg1.method125(class258.field4075, -46);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIII)V", line = 37)
    public static final void method61(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field110++;
        int var7 = arg2 + arg6;
        int var8 = arg0 - arg6;
        int var9 = arg4 - arg6;
        for (int var10 = arg2; var10 < var7; var10++) {
            class278.method1986(arg5, class347.field5501[var10], arg3, arg4, (byte) 59);
        }
        for (int var11 = arg0; var11 > var8; var11--) {
            class278.method1986(arg5, class347.field5501[var11], arg3, arg4, (byte) -119);
        }
        int var12 = arg5 + arg6;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class347.field5501[var13];
            class278.method1986(arg5, var14, arg3, var12, (byte) 113);
            class278.method1986(var9, var14, arg3, arg4, (byte) 106);
        }
        if (arg1 != 0) {
            method63((class93) null, (class16) null, 19, (class16) null, (class16) null);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V", line = 86)
    public static void method62(int arg0) {
        field107 = null;
        field94 = null;
        if (arg0 >= -40) {
            method60(58, (class16) null);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lwd;Lnk;ILnk;Lnk;)Z", line = 103)
    public static final boolean method63(class93 arg0, class16 arg1, int arg2, class16 arg3, class16 arg4) {
        field98++;
        class140.field2150 = arg3;
        class116.field1615 = arg0;
        class344.field5444 = arg4;
        class57.field677 = arg1;
        int var5 = 62 % ((20 - arg2) / 37);
        return true;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 126)
    public static final void method66(byte arg0) {
        field95++;
        class321 var1 = class188.field2839;
        synchronized (class188.field2839) {
            class123.field1694++;
            class63.field750 = class324.field5208;
            if (class205.field3106 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class276.field4349[var2] = false;
                }
                class205.field3106 = class71.field882;
            } else {
                while (class71.field882 != class205.field3106) {
                    int var3 = class289.field4549[class71.field882];
                    class71.field882 = class71.field882 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class276.field4349[var3] = true;
                    } else {
                        class276.field4349[~var3] = false;
                    }
                }
            }
            class324.field5208 = class72.field895;
            if (arg0 < 116) {
                field106 = 110;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V", line = 175)
    protected class10() {
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method58(int arg0, int arg1, int arg2, Graphics arg3);

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIZILjava/awt/Graphics;I)V")
    public abstract void method64(int arg0, int arg1, boolean arg2, int arg3, Graphics arg4, int arg5);

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLjava/awt/Component;II)V")
    public abstract void method65(byte arg0, Component arg1, int arg2, int arg3);
}
