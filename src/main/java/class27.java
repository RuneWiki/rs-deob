import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class27 extends class76 {

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "Z")
    public static boolean field321 = false;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public static int field325 = 0;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "Lbc;")
    public static class282 field326;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "[[[B")
    public static byte[][][] field324;

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(IIIIII)V")
    public class27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field317 = arg2;
        this.field332 = arg3;
        this.field330 = arg1;
        this.field327 = arg0;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZLbc;Lol;BLbc;)V")
    public static final void method161(boolean arg0, class282 arg1, class111 arg2, byte arg3, class282 arg4) {
        class167.field2412 = arg4;
        ++field322;
        class87.field1180 = arg1;
        if (arg3 > -76) {
            method161(false, (class282) null, (class111) null, (byte) 94, (class282) null);
        }
        class270.field3940 = arg0;
        int var5 = -1 + class167.field2412.method1856(-118);
        class95.field1270 = class167.field2412.method1874((byte) 18, var5) + var5 * 256;
        class212.field2974 = new String[] { null, null, null, null, class94.field1264 };
        class24.field289 = arg2;
        class233.field3362 = new String[] { null, null, class228.field3222, null, null };
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
    public static void method162(int arg0) {
        if (arg0 != 17391) {
            method165(41, (byte) 70);
        }
        field324 = null;
        field326 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BLjava/lang/String;Lqi;)I")
    public static final int method163(byte arg0, String arg1, class216 arg2) {
        ++field318;
        if (arg0 <= 114) {
            method161(true, (class282) null, (class111) null, (byte) -71, (class282) null);
        }
        int var3 = arg2.field3021;
        byte[] var4 = class54.method330(arg1, (byte) -119);
        arg2.method1390((byte) -124, var4.length);
        arg2.field3021 += class95.field1267.method845(var4, true, 0, arg2.field3021, arg2.field3030, var4.length);
        return arg2.field3021 - var3;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IILwe;)Ljava/lang/String;")
    public static final String method164(int arg0, int arg1, class82 arg2) {
        ++field323;
        if (!client.method1920(arg2).method1157(false, arg0) && arg2.field1109 == null) {
            return null;
        } else if (arg2.field1010 != null && ~arg0 > ~arg2.field1010.length && arg2.field1010[arg0] != null && arg2.field1010[arg0].trim().length() != 0) {
            return arg1 != -29702 ? null : arg2.field1010[arg0];
        } else {
            return class296.field4679 ? "Hidden-" + arg0 : null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)Lrj;")
    public static final class274 method165(int arg0, byte arg1) {
        class274 var2 = (class274) class274.field4099.method65((byte) -113, (long) arg0);
        ++field319;
        if (var2 != null) {
            return var2;
        } else {
            int var3 = 110 % ((-54 - arg1) / 54);
            byte[] var4 = class203.field2886.method1861(class182.method1186((byte) 119, arg0), class26.method159(true, arg0), 1);
            class274 var5 = new class274();
            var5.field4077 = arg0;
            if (var4 != null) {
                var5.method1759((byte) 92, new class216(var4));
            }
            var5.method1761(-29416);
            class274.field4099.method64((long) arg0, -1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V")
    public final void method166(int arg0, int arg1, int arg2) {
        int var4 = -63 / ((arg1 - -14) / 55);
        ++field328;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIB)V")
    public final void method167(int arg0, int arg1, byte arg2) {
        ++field329;
        if (arg2 >= -37) {
            this.field330 = -16;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(III)V")
    public final void method168(int arg0, int arg1, int arg2) {
        ++field331;
        int var4 = this.field327 * arg2 >> 12;
        int var5 = this.field317 * arg2 >> 12;
        int var6 = this.field332 * arg1 >> 12;
        if (arg0 == -31341) {
            int var7 = this.field330 * arg1 >> 12;
            class105.method637(1124985996, var6, super.field910, var5, var7, var4);
        }
    }
}
