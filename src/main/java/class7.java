import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class7 {

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "Ldf;")
    public static class51 field73 = class46.method233("W-=hlen Sie eine Welt", 100);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Ldf;")
    public static class51 field71 = class46.method233(" loggt sich aus)3", 100);

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field78 = -1;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "[I")
    public static int[] field76 = new int[50];

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "Lhc;")
    public static class212 field77 = new class212(32);

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)J")
    public static final synchronized long method31(byte arg0) {
        field80++;
        if (arg0 != -88) {
            method35((byte) 104);
        }
        long var1 = System.currentTimeMillis();
        if (class230.field4014 > var1) {
            class132.field2197 += class230.field4014 - var1;
        }
        class230.field4014 = var1;
        return class132.field2197 + var1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)J")
    public static final long method32(int arg0, int arg1, int arg2) {
        class97 var3 = class27.field395[arg0][arg1][arg2];
        return var3 == null || var3.field1616 == null ? 0L : var3.field1616.field3273;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)I")
    public static final int method33(int arg0, int arg1) {
        field72++;
        if (arg0 != 255) {
            field76 = null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILwc;II)V")
    public static final void method34(int arg0, class213 arg1, int arg2, int arg3) {
        field74++;
        if (class136.field2257 != null || class90.field1498 || arg1 == null || class207.method1428(arg1, (byte) -101) == null) {
            return;
        }
        class136.field2257 = arg1;
        class140.field2359 = class207.method1428(arg1, (byte) -101);
        class36.field563 = arg2;
        class193.field3241 = arg0;
        class43.field690 = false;
        class41.field660 = 0;
        if (arg3 <= 113) {
            method34(-11, (class213) null, -89, 34);
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
    public static void method35(byte arg0) {
        field71 = null;
        field73 = null;
        field76 = null;
        if (arg0 <= 107) {
            field73 = null;
        }
        field77 = null;
    }
}
