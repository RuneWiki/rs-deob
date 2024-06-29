import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class291 {

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "Ljo;")
    private class382 field4356 = new class382(16);

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "Lok;")
    private class74 field4360;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field4359 = 1407;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Luv;")
    public static class2 field4362 = new class2(79, 12);

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "J")
    public static long field4366 = 0L;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "J")
    public static long field4367 = 0L;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Lla;")
    public static class307 field4363;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "Ltf;")
    public static class533 field4361;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public final void method1801(int arg0) {
        field4355++;
        class382 var2 = this.field4356;
        synchronized (this.field4356) {
            this.field4356.method2287(111);
        }
        int var3 = -31 / ((arg0 + 14) / 46);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public final void method1802(byte arg0) {
        field4364++;
        class382 var2 = this.field4356;
        synchronized (this.field4356) {
            if (arg0 < 29) {
                field4353 = 85;
            }
            this.field4356.method2293(false);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIILri;)Lpo;")
    public final class396 method1803(int arg0, int arg1, int arg2, int arg3, int arg4, class482 arg5) {
        field4357++;
        class48[] var7 = null;
        if (arg4 != 2174) {
            field4366 = 0L;
        }
        class463 var8 = this.method1805(79, arg2);
        if (var8.field6737 != null) {
            var7 = new class48[var8.field6737.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class317 var10 = arg5.method2881(var8.field6737[var9], arg4 - 30036);
                var7[var9] = new class48(var10.field4904, var10.field4897, var10.field4903, var10.field4902, var10.field4899, var10.field4894, var10.field4896, var10.field4893);
            }
        }
        return new class396(var8.field6733, var7, var8.field6735, arg0, arg1, arg3);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)I")
    public static final int method1804(int arg0, int arg1) {
        if (arg0 != 12) {
            field4362 = null;
        }
        field4354++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)Lld;")
    private final class463 method1805(int arg0, int arg1) {
        field4365++;
        class382 var3 = this.field4356;
        class463 var4;
        synchronized (this.field4356) {
            var4 = (class463) this.field4356.method2288((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class74 var5 = this.field4360;
        byte[] var6;
        synchronized (this.field4360) {
            var6 = this.field4360.method541(arg1, 29, (byte) -122);
        }
        class463 var7 = new class463();
        if (var6 != null) {
            var7.method2681(new class468(var6), (byte) 122);
        }
        if (arg0 != 79) {
            method1804(94, 112);
        }
        class382 var8 = this.field4356;
        synchronized (this.field4356) {
            this.field4356.method2290((long) arg1, var7, 117);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ)V")
    public final void method1806(int arg0, boolean arg1) {
        class382 var3 = this.field4356;
        synchronized (this.field4356) {
            this.field4356.method2294(arg0, arg1);
        }
        field4358++;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
    public static void method1807(byte arg0) {
        field4361 = null;
        field4362 = null;
        if (arg0 == 51) {
            field4363 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lkr;ILok;)V")
    public class291(class262 arg0, int arg1, class74 arg2) {
        this.field4360 = arg2;
        this.field4360.method536(false, 29);
    }
}
