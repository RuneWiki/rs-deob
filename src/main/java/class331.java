import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class331 extends class141 {

    @OriginalMember(owner = "client!f", name = "n", descriptor = "[I")
    public static int[] field5631 = new int[25];

    @OriginalMember(owner = "client!f", name = "w", descriptor = "Lhi;")
    public static class82 field5640 = class95.method664((byte) -77, "Nehmen");

    @OriginalMember(owner = "client!f", name = "B", descriptor = "[F")
    public static float[] field5645 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!f", name = "x", descriptor = "Lhi;")
    public static class82 field5641 = class95.method664((byte) -74, "::rect_debug");

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public static int field5647 = 1;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "Lhi;")
    public static class82 field5639 = class95.method664((byte) -126, "<col=ffb000>");

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    public int field5632;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    public int field5636;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "I")
    public int field5638;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public int field5644;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "I")
    public int field5648;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "Lme;")
    public class75 field5646;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "Lme;")
    public class75 field5649;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "Lhi;")
    public class82 field5630;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "Z")
    public boolean field5637;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "[Ljava/lang/Object;")
    public Object[] field5635;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II)Lhi;", line = 10)
    public static final class82 method2259(int arg0, int arg1) {
        field5633++;
        return arg0 == 255 ? class29.method182(-6039, new class82[] { class327.method2240((byte) -74, arg1 >> 24 & 0xFF), class150.field2558, class327.method2240((byte) -74, arg1 >> 16 & 0xFF), class150.field2558, class327.method2240((byte) -74, arg1 >> 8 & 0xFF), class150.field2558, class327.method2240((byte) -74, arg1 & 0xFF) }) : (class82) null;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V", line = 29)
    public static void method2260(byte arg0) {
        field5631 = null;
        field5645 = null;
        field5639 = null;
        field5641 = null;
        field5640 = null;
        if (arg0 >= -8) {
            field5641 = (class82) null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZIIII)V", line = 52)
    public static final void method2261(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field5634++;
        if (class113.method777((byte) -111, arg3)) {
            class88.method615(arg2, arg1, arg0, class277.field4660[arg3], arg4, -21299);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(JI)Lhi;", line = 69)
    public static final class82 method2262(long arg0, int arg1) {
        field5643++;
        class230.field3959.setTime(new Date(arg0));
        int var3 = class230.field3959.get(7);
        int var4 = class230.field3959.get(5);
        int var5 = class230.field3959.get(2);
        int var6 = class230.field3959.get(1);
        int var7 = class230.field3959.get(11);
        int var8 = 29 % ((arg1 + 26) / 63);
        int var9 = class230.field3959.get(12);
        int var10 = class230.field3959.get(13);
        return class29.method182(-6039, new class82[] { class309.field5272[var3 - 1], class298.field5067, class327.method2240((byte) -74, var4 / 10), class327.method2240((byte) -74, var4 % 10), class164.field2872, class56.field903[var5], class164.field2872, class327.method2240((byte) -74, var6), class209.field3683, class327.method2240((byte) -74, var7 / 10), class327.method2240((byte) -74, var7 % 10), class138.field2370, class327.method2240((byte) -74, var9 / 10), class327.method2240((byte) -74, var9 % 10), class138.field2370, class327.method2240((byte) -74, var10 / 10), class327.method2240((byte) -74, var10 % 10), class62.field972 });
    }
}
