import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class35 {

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Z")
    public boolean field454 = false;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public int field456 = -1;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public int field461 = -1;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public int field465 = 8;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Z")
    public boolean field462 = true;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public int field463 = 128;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public int field466 = 0;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "Z")
    public boolean field467 = true;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public int field464 = 1190717;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public int field472 = 16;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lmh;")
    public static class62 field457 = class201.method1405(true, "huffman");

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "Lmh;")
    public static class62 field468 = class201.method1405(true, "www");

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field469 = 0;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "Lhi;")
    public static class26 field470;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "Lhi;")
    public static class26 field471;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "[[[B")
    public static byte[][][] field473;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V", line = 12)
    public static final void method225(int arg0, byte arg1) {
        field459++;
        if (arg1 > -97) {
            method229(true);
        }
        class110.field1774.method1390(arg0, -91);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIILmi;)V", line = 46)
    private final void method226(int arg0, int arg1, int arg2, class92 arg3) {
        field460++;
        if (arg0 > -10) {
            field470 = (class26) null;
        }
        if (arg2 == 1) {
            this.field466 = class113.method883(arg3.method737(-1), -83);
        } else if (arg2 == 2) {
            this.field461 = arg3.method702(-1);
        } else if (arg2 == 3) {
            this.field461 = arg3.method721(76);
            if (this.field461 == 65535) {
                this.field461 = -1;
            }
        } else if (arg2 == 5) {
            this.field467 = false;
        } else if (arg2 == 7) {
            this.field456 = class113.method883(arg3.method737(-1), 27);
        } else if (arg2 == 8) {
            class293.field4992 = arg1;
        } else if (arg2 == 9) {
            this.field463 = arg3.method721(88);
        } else if (arg2 == 10) {
            this.field462 = false;
        } else if (arg2 == 11) {
            this.field465 = arg3.method702(-1);
        } else if (arg2 == 12) {
            this.field454 = true;
        } else if (arg2 == 13) {
            this.field464 = arg3.method737(-1);
        } else if (arg2 == 14) {
            this.field472 = arg3.method702(-1);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZILmi;)V", line = 119)
    public final void method227(boolean arg0, int arg1, class92 arg2) {
        if (arg0) {
            field471 = (class26) null;
        }
        field458++;
        while (true) {
            int var4 = arg2.method702(-1);
            if (var4 == 0) {
                return;
            }
            this.method226(-75, arg1, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 159)
    public static final void method228(int arg0) {
        field455++;
        class304.field5228.method1392(arg0 ^ arg0);
        class54.field785.method1392(0);
        class301.field5182.method1392(0);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V", line = 175)
    public static void method229(boolean arg0) {
        field473 = (byte[][][]) null;
        field468 = null;
        field471 = null;
        field457 = null;
        if (arg0) {
            method229(false);
        }
        field470 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Lsh;", line = 200)
    public static final class297 method230(int arg0, int arg1) {
        class297 var2 = (class297) class236.field4051.method1396(0, (long) arg0);
        field452++;
        if (var2 != null) {
            return var2;
        } else if (arg1 >= -56) {
            return (class297) null;
        } else {
            byte[] var3 = class92.field1520.method157(class301.method2063(121, arg0), class268.method1845(0, arg0), (byte) 19);
            class297 var4 = new class297();
            if (var3 != null) {
                var4.method2009(new class92(var3), (byte) 52);
            }
            class236.field4051.method1397((long) arg0, var4, true);
            return var4;
        }
    }
}
