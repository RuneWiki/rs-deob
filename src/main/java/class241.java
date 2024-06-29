import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class241 {

    @OriginalMember(owner = "client!of", name = "m", descriptor = "I")
    public int field4254 = -1;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field4243 = 50;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "[Ljf;")
    public static class229[] field4244 = new class229[field4243];

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field4250 = 0;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "[I")
    public static int[] field4255 = new int[field4243];

    @OriginalMember(owner = "client!of", name = "g", descriptor = "[I")
    public static int[] field4248 = new int[field4243];

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Ljf;")
    public static class229 field4249 = class212.method1457((byte) 120, ",Mcran)2titre ouvert");

    @OriginalMember(owner = "client!of", name = "k", descriptor = "Ljf;")
    public static class229 field4252 = class212.method1457((byte) 119, "(U2");

    @OriginalMember(owner = "client!of", name = "a", descriptor = "[I")
    public static int[] field4242 = new int[field4243];

    @OriginalMember(owner = "client!of", name = "e", descriptor = "[I")
    public static int[] field4246 = new int[field4243];

    @OriginalMember(owner = "client!of", name = "q", descriptor = "[I")
    public static int[] field4258 = new int[field4243];

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Ljf;")
    public static class229 field4260 = class212.method1457((byte) 102, "Hidden)2use");

    @OriginalMember(owner = "client!of", name = "r", descriptor = "[I")
    public static int[] field4259 = new int[field4243];

    @OriginalMember(owner = "client!of", name = "t", descriptor = "[I")
    public static int[] field4261 = new int[field4243];

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "Lpm;")
    public static class103 field4253;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "Lil;")
    public class57 field4247;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "[I")
    public int[] field4251;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "[Ljf;")
    public class229[] field4256;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 48)
    public static void method1743(int arg0) {
        field4252 = null;
        field4258 = null;
        field4244 = null;
        field4249 = null;
        field4242 = null;
        field4259 = null;
        field4246 = null;
        field4253 = null;
        if (arg0 != -24982) {
            method1743(91);
        }
        field4248 = null;
        field4260 = null;
        field4255 = null;
        field4261 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)I", line = 85)
    public static final int method1744(int arg0, int arg1, int arg2) {
        field4245++;
        if (arg2 != 4913) {
            field4253 = (class103) null;
        }
        int var3 = arg0 >> 31 & arg1 - 1;
        return (arg0 + (arg0 >>> 31)) % arg1 + var3;
    }
}
