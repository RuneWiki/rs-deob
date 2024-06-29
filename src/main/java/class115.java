import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class115 extends class24 {

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "I")
    public int field2818;

    @OriginalMember(owner = "client!tc", name = "cb", descriptor = "I")
    private int field2824;

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "[[I")
    public int[][] field2805;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "[I")
    public int[] field2804;

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "Lv;")
    private static class122 field2813 = class55.method425(-56, "Attack");

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    public static int field2802 = 50;

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "Lv;")
    public static class122 field2821 = field2813;

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "Lv;")
    public static class122 field2812 = class55.method425(-92, "titlebox");

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "Lv;")
    private static class122 field2819 = class55.method425(-82, "Accept challenge");

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "[Ld;")
    public static class19[] field2820 = new class19[12];

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "Lv;")
    public static class122 field2822 = class55.method425(-108, "Sichtbare Karte vorbereitet)3");

    @OriginalMember(owner = "client!tc", name = "K", descriptor = "Lv;")
    private static class122 field2807 = class55.method425(-110, "Connecting to friendserver");

    @OriginalMember(owner = "client!tc", name = "J", descriptor = "Lv;")
    public static class122 field2806 = field2819;

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "Lv;")
    public static class122 field2816 = field2807;

    @OriginalMember(owner = "client!tc", name = "bb", descriptor = "I")
    public static int field2823 = -1;

    @OriginalMember(owner = "client!tc", name = "db", descriptor = "Lv;")
    public static class122 field2825 = class55.method425(-51, "Nehmen");

    @OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "Lkb;")
    public static class62 field2803;

    @OriginalMember(owner = "client!tc", name = "L", descriptor = "Lmb;")
    public static class74 field2808;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljc;ZI)Z", line = 5)
    public static final boolean method882(class57 arg0, boolean arg1, int arg2) {
        field2814++;
        class28.field723 = 20;
        try {
            class66.field1697 = (class120) Class.forName("qa").getDeclaredConstructor().newInstance();
            if (arg2 != 29888) {
                method883((byte) 80);
            }
            return true;
        } catch (Throwable var4) {
            class39 var3 = arg0.method440(83);
            if (var3 != null) {
                class66.field1697 = new class104(arg0, var3);
                return true;
            } else if (arg1) {
                class66.field1697 = new class112(arg0);
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V", line = 40)
    public static void method883(byte arg0) {
        if (arg0 != 86) {
            return;
        }
        field2812 = null;
        field2816 = null;
        field2813 = null;
        field2822 = null;
        field2806 = null;
        field2807 = null;
        field2803 = null;
        field2825 = null;
        field2819 = null;
        field2820 = null;
        field2808 = null;
        field2821 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZB)Lv;", line = 81)
    public static final class122 method884(int arg0, int arg1, boolean arg2, byte arg3) {
        field2811++;
        if (arg0 < 1 || arg0 > 36) {
            arg0 = 10;
        }
        int var4 = 1;
        for (int var5 = arg1 / arg0; var5 != 0; var5 /= arg0) {
            var4++;
        }
        int var6 = var4;
        if (arg1 < 0 || arg2) {
            var6 = var4 + 1;
        }
        if (arg3 <= 44) {
            field2809 = 22;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg2) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg1 % arg0;
            arg1 /= arg0;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class122 var9 = new class122();
        var9.field2971 = var6;
        var9.field2923 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V", line = 159)
    public static final void method885(int arg0) {
        if (arg0 != 3140) {
            method885(70);
        }
        field2810++;
        for (class5 var1 = (class5) class129.field3126.method311((byte) 92); var1 != null; var1 = (class5) class129.field3126.method302((byte) -68)) {
            if (var1.field121 == -1) {
                var1.field140 = 0;
                class8.method84(102, var1);
            } else {
                var1.method249(0);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(I[B)V", line = 205)
    public class115(int arg0, byte[] arg1) {
        this.field2818 = arg0;
        class64 var3 = new class64(arg1);
        this.field2824 = var3.method520(-124);
        this.field2805 = new int[this.field2824][];
        this.field2804 = new int[this.field2824];
        for (int var4 = 0; var4 < this.field2824; var4++) {
            this.field2804[var4] = var3.method520(-126);
        }
        for (int var5 = 0; var5 < this.field2824; var5++) {
            this.field2805[var5] = new int[var3.method520(-123)];
        }
        for (int var6 = 0; var6 < this.field2824; var6++) {
            for (int var7 = 0; var7 < this.field2805[var6].length; var7++) {
                this.field2805[var6][var7] = var3.method520(-120);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 252)
    public static final void method886(int arg0, Component arg1) {
        try {
            Method var2 = class57.field1505;
            if (var2 != null) {
                var2.invoke(arg1, Boolean.FALSE);
            }
            if (arg0 != -24789) {
                field2822 = null;
            }
        } catch (Throwable var3) {
        }
        field2817++;
        arg1.addKeyListener(class16.field406);
        arg1.addFocusListener(class16.field406);
    }
}
