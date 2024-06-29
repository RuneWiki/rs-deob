import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class class51 {

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "Lh;")
    public static class434 field667 = new class434(1, 6);

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "[I")
    public static int[] field677 = new int[1000];

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "Lmc;")
    public static class78 field678 = new class78(69, 3);

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "Z")
    public static boolean field681 = false;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "Z")
    public static boolean field682 = false;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public int field670;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public int field672;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public int field674;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "Lqo;")
    public static class19 field679;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "[Lec;")
    public static class143[] field676;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method355(int arg0) {
        field671++;
        if (arg0 != 1) {
            this.field674 = -112;
        }
        return (this.field670 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)Z", line = 16)
    public final boolean method356(byte arg0) {
        if (arg0 != 25) {
            field679 = null;
        }
        field675++;
        return (this.field670 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V", line = 31)
    public static final void method357(boolean arg0) {
        field669++;
        if (!class488.field6789.method2415(120, class222.field2958) && class373.field5104 != class160.field2220) {
            class295.method1654(false, class4.field60, false, class391.field5426, !arg0);
            return;
        }
        if (arg0) {
            field677 = null;
        }
        class263.method1493(class98.field1432, (byte) 47);
        if (class373.field5104 != class120.field1766) {
            class34.method256(117);
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)Z", line = 56)
    public final boolean method358(int arg0) {
        if (arg0 != 0) {
            method359(-70);
        }
        field673++;
        return (this.field670 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V", line = 70)
    public static void method359(int arg0) {
        field667 = null;
        field676 = null;
        field678 = null;
        field677 = null;
        int var1 = 43 % ((arg0 - 22) / 57);
        field679 = null;
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)Z", line = 86)
    public final boolean method360(int arg0) {
        if (arg0 != 6) {
            method359(-34);
        }
        field668++;
        return (this.field670 & 0x2) != 0;
    }
}
