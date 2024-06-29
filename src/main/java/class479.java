import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class479 {

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "Luf;")
    private class380 field6665 = new class380(64);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Lga;")
    private class332 field6661;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "[I")
    public static int[] field6663 = new int[6];

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field6667;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field6668;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field6669;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZIIII)V")
    public static final void method2754(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class618.field8566 == 0) {
            class551.method3082((byte) 113, false);
        } else {
            class100.field1207 = class618.field8566;
            class174.method1190(0, 0);
        }
        field6662++;
        class389.field5224 = arg0;
        class225.field2933 = arg4;
        if (arg2 > 23) {
            class383.field5059 = arg3;
            class672.method3818(arg1);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)Lbs;")
    public final class211 method2755(int arg0, int arg1) {
        field6667++;
        class380 var3 = this.field6665;
        class211 var4;
        synchronized (this.field6665) {
            var4 = (class211) this.field6665.method2176(-125, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != -3251) {
            this.method2755(13, -19);
        }
        class332 var5 = this.field6661;
        byte[] var6;
        synchronized (this.field6661) {
            var6 = this.field6661.method1938(class297.method1746(-122, arg1), class541.method3036((byte) -58, arg1), -17);
        }
        class211 var7 = new class211();
        if (var6 != null) {
            var7.method1337(new class157(var6), 0);
        }
        class380 var8 = this.field6665;
        synchronized (this.field6665) {
            this.field6665.method2174(var7, (long) arg1, (byte) 125);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public final void method2756(int arg0) {
        if (arg0 != 6221) {
            field6663 = null;
        }
        field6666++;
        class380 var2 = this.field6665;
        synchronized (this.field6665) {
            this.field6665.method2172(arg0 ^ 0xFFFFDCB5);
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
    public static void method2757(int arg0) {
        field6663 = null;
        if (arg0 != 6) {
            method2754(false, 23, 78, -87, -126);
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)V")
    public final void method2758(int arg0, int arg1) {
        field6669++;
        class380 var3 = this.field6665;
        synchronized (this.field6665) {
            this.field6665.method2179(false, arg0);
            if (arg1 >= -50) {
                this.method2760(-84);
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lnq;ILga;)V")
    public class479(class650 arg0, int arg1, class332 arg2) {
        this.field6661 = arg2;
        if (this.field6661 != null) {
            int var4 = this.field6661.method1933(-113) - 1;
            this.field6661.method1939(0, var4);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)V")
    public final void method2759(byte arg0, int arg1) {
        field6668++;
        class380 var3 = this.field6665;
        synchronized (this.field6665) {
            this.field6665.method2168((byte) -82);
            this.field6665 = new class380(arg1);
            if (arg0 != 52) {
                field6663 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V")
    public final void method2760(int arg0) {
        class380 var2 = this.field6665;
        synchronized (this.field6665) {
            this.field6665.method2168((byte) -105);
        }
        int var3 = -86 % ((arg0 + 50) / 54);
        field6664++;
    }
}
