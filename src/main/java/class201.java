import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class201 {

    @OriginalMember(owner = "client!en", name = "c", descriptor = "Lrp;")
    private class288 field3185 = new class288(64);

    @OriginalMember(owner = "client!en", name = "o", descriptor = "Lrp;")
    public class288 field3197 = new class288(30);

    @OriginalMember(owner = "client!en", name = "k", descriptor = "Llt;")
    public class458 field3193;

    @OriginalMember(owner = "client!en", name = "l", descriptor = "Llt;")
    private class458 field3194;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "Lrp;")
    public static class288 field3189 = new class288(4);

    @OriginalMember(owner = "client!en", name = "q", descriptor = "Z")
    public static boolean field3199 = false;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!en", name = "p", descriptor = "I")
    public int field3198;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "Len;")
    public static class201 field3192;

    @OriginalMember(owner = "client!en", name = "n", descriptor = "La;")
    public static class420 field3196;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "Ljava/awt/Frame;")
    public static Frame field3190;

    @OriginalMember(owner = "client!en", name = "m", descriptor = "[Lfo;")
    public static class343[] field3195;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)J", line = 4)
    public static final long method1248(byte arg0) {
        field3187++;
        int var1 = 36 / ((arg0 + 30) / 33);
        return class138.field2275.method69((byte) 89);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 20)
    public static void method1249(int arg0) {
        field3190 = null;
        field3196 = null;
        field3189 = null;
        if (arg0 != 30) {
            field3196 = null;
        }
        field3192 = null;
        field3195 = null;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)Lvd;", line = 34)
    public final class29 method1250(int arg0, int arg1) {
        field3186++;
        class288 var3 = this.field3185;
        class29 var4;
        synchronized (this.field3185) {
            var4 = (class29) this.field3185.method1752(0, (long) arg0);
        }
        int var5 = 122 % ((32 - arg1) / 33);
        if (var4 != null) {
            return var4;
        }
        byte[] var6 = this.field3194.method2715(class77.method563(arg0, true), class378.method2279(arg0, (byte) -113), false);
        class29 var7 = new class29();
        var7.field386 = this;
        var7.field363 = arg0;
        if (var6 != null) {
            var7.method148(new class40(var6), 0);
        }
        class288 var8 = this.field3185;
        synchronized (this.field3185) {
            this.field3185.method1758(1, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZI)V", line = 63)
    public final void method1251(boolean arg0, int arg1) {
        this.field3198 = arg1;
        field3188++;
        class288 var3 = this.field3197;
        synchronized (this.field3197) {
            this.field3197.method1761(-119);
            if (!arg0) {
                this.method1250(-107, 88);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V", line = 77)
    public final void method1252(int arg0) {
        class288 var2 = this.field3185;
        synchronized (this.field3185) {
            this.field3185.method1761(-113);
        }
        if (arg0 > -39) {
            field3195 = null;
        }
        field3184++;
        class288 var3 = this.field3197;
        synchronized (this.field3197) {
            this.field3197.method1761(-124);
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(II)V", line = 98)
    public final void method1253(int arg0, int arg1) {
        if (arg1 != 30) {
            this.method1251(true, -110);
        }
        field3191++;
        class288 var3 = this.field3185;
        synchronized (this.field3185) {
            this.field3185.method1760(arg0, 30398);
        }
        class288 var4 = this.field3197;
        synchronized (this.field3197) {
            this.field3197.method1760(arg0, 30398);
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(B)V", line = 117)
    public final void method1254(byte arg0) {
        class288 var2 = this.field3185;
        synchronized (this.field3185) {
            this.field3185.method1749((byte) -19);
        }
        field3183++;
        class288 var3 = this.field3197;
        synchronized (this.field3197) {
            if (arg0 == 79) {
                this.field3197.method1749((byte) 127);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lcm;ILlt;Llt;)V", line = 148)
    public class201(class491 arg0, int arg1, class458 arg2, class458 arg3) {
        this.field3193 = arg3;
        this.field3194 = arg2;
        int var5 = this.field3194.method2738((byte) 109) - 1;
        this.field3194.method2726((byte) 113, var5);
    }
}
