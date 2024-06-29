import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class233 {

    @OriginalMember(owner = "client!up", name = "m", descriptor = "Z")
    public boolean field3264 = false;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "Lhp;")
    private class277 field3257 = new class277(64);

    @OriginalMember(owner = "client!up", name = "s", descriptor = "Lhp;")
    public class277 field3270 = new class277(500);

    @OriginalMember(owner = "client!up", name = "t", descriptor = "Lhp;")
    public class277 field3271 = new class277(30);

    @OriginalMember(owner = "client!up", name = "u", descriptor = "Lhp;")
    public class277 field3272 = new class277(50);

    @OriginalMember(owner = "client!up", name = "d", descriptor = "Lkea;")
    public class203 field3255;

    @OriginalMember(owner = "client!up", name = "r", descriptor = "Lkea;")
    private class203 field3269;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "Z")
    public boolean field3258;

    @OriginalMember(owner = "client!up", name = "o", descriptor = "[B")
    public static byte[] field3266 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!up", name = "p", descriptor = "Z")
    public static boolean field3267 = false;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "F")
    public static float field3252;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!up", name = "h", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!up", name = "i", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!up", name = "j", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!up", name = "k", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!up", name = "l", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!up", name = "n", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!up", name = "v", descriptor = "I")
    public int field3273;

    @OriginalMember(owner = "client!up", name = "q", descriptor = "[Lxa;")
    public static class433[] field3268;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IZ)V")
    public final void method1496(int arg0, boolean arg1) {
        field3260++;
        if (arg1 != this.field3258) {
            this.field3258 = arg1;
            if (arg0 < -77) {
                this.method1497(false);
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)V")
    public final void method1497(boolean arg0) {
        class277 var2 = this.field3257;
        synchronized (this.field3257) {
            this.field3257.method1810(false);
        }
        field3259++;
        class277 var3 = this.field3270;
        synchronized (this.field3270) {
            this.field3270.method1810(false);
        }
        class277 var4 = this.field3271;
        synchronized (this.field3271) {
            this.field3271.method1810(arg0);
        }
        class277 var5 = this.field3272;
        synchronized (this.field3272) {
            this.field3272.method1810(arg0);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BLkea;)V")
    public static final void method1498(byte arg0, class203 arg1) {
        field3263++;
        class546.field7820 = arg1.method1283((byte) -93, "p11_full");
        class201.field2692 = arg1.method1283((byte) -112, "p12_full");
        class52.field548 = arg1.method1283((byte) -54, "b12_full");
        if (arg0 != 2) {
            field3268 = null;
        }
        class32.field363 = arg1.method1283((byte) -128, "hitmarks");
        class11.field93 = arg1.method1283((byte) -83, "hitbar_default");
        class447.field6681 = arg1.method1283((byte) -47, "timerbar_default");
        class18.field180 = arg1.method1283((byte) -44, "headicons_pk");
        class86.field987 = arg1.method1283((byte) -88, "headicons_prayer");
        class322.field4661 = arg1.method1283((byte) -56, "hint_headicons");
        class86.field982 = arg1.method1283((byte) -121, "hint_mapmarkers");
        class656.field9488 = arg1.method1283((byte) -46, "mapflag");
        class561.field8012 = arg1.method1283((byte) -35, "cross");
        class381.field5774 = arg1.method1283((byte) -116, "mapdots");
        class650.field9383 = arg1.method1283((byte) -67, "scrollbar");
        class114.field1424 = arg1.method1283((byte) -72, "name_icons");
        class50.field538 = arg1.method1283((byte) -55, "floorshadows");
        class346.field4959 = arg1.method1283((byte) -109, "compass");
        class499.field7267 = arg1.method1283((byte) -45, "otherlevel");
        class321.field4644 = arg1.method1283((byte) -45, "hint_mapedge");
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II)Lqd;")
    public final class385 method1499(int arg0, int arg1) {
        field3254++;
        class277 var3 = this.field3257;
        class385 var4;
        synchronized (this.field3257) {
            var4 = (class385) this.field3257.method1801(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class203 var5 = this.field3269;
        byte[] var6;
        synchronized (this.field3269) {
            var6 = this.field3269.method1286(class616.method3556((byte) 62, arg1), class329.method2150(-128, arg1), (byte) -49);
        }
        if (arg0 != -7532) {
            this.field3270 = null;
        }
        class385 var7 = new class385();
        var7.field5854 = this;
        var7.field5810 = arg1;
        if (var6 != null) {
            var7.method2456((byte) 92, new class194(var6));
        }
        var7.method2464((byte) 122);
        if (var7.field5834) {
            var7.field5829 = 0;
            var7.field5812 = false;
        }
        if (!this.field3258 && var7.field5832) {
            var7.field5863 = null;
            var7.field5871 = null;
        }
        class277 var8 = this.field3257;
        synchronized (this.field3257) {
            this.field3257.method1808((long) arg1, var7, (byte) -49);
            return var7;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V")
    public static void method1500(byte arg0) {
        if (arg0 == 0) {
            field3268 = null;
            field3266 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(BZ)V")
    public final void method1501(byte arg0, boolean arg1) {
        field3262++;
        if (arg0 >= -87) {
            this.field3258 = true;
        }
        if (arg1 != this.field3264) {
            this.field3264 = arg1;
            this.method1497(false);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IB)V")
    public final void method1502(int arg0, byte arg1) {
        field3261++;
        if (arg1 <= 114) {
            method1498((byte) 106, null);
        }
        this.field3257 = new class277(arg0);
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(II)V")
    public final void method1503(int arg0, int arg1) {
        field3256++;
        this.field3273 = arg1;
        class277 var3 = this.field3270;
        synchronized (this.field3270) {
            this.field3270.method1810(false);
        }
        class277 var4 = this.field3271;
        synchronized (this.field3271) {
            this.field3271.method1810(false);
        }
        class277 var5 = this.field3272;
        synchronized (this.field3272) {
            this.field3272.method1810(false);
            if (arg0 != 23099) {
                this.method1501((byte) -99, false);
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
    public final void method1504(int arg0) {
        field3265++;
        class277 var2 = this.field3257;
        synchronized (this.field3257) {
            this.field3257.method1805(-119);
        }
        class277 var3 = this.field3270;
        synchronized (this.field3270) {
            this.field3270.method1805(25);
        }
        class277 var4 = this.field3271;
        synchronized (this.field3271) {
            this.field3271.method1805(arg0 - 3522);
        }
        class277 var5 = this.field3272;
        synchronized (this.field3272) {
            if (arg0 == 3394) {
                this.field3272.method1805(arg0 - 3498);
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(IB)V")
    public final void method1505(int arg0, byte arg1) {
        class277 var3 = this.field3257;
        synchronized (this.field3257) {
            this.field3257.method1811((byte) -106, arg0);
        }
        field3253++;
        class277 var4 = this.field3270;
        synchronized (this.field3270) {
            this.field3270.method1811((byte) -109, arg0);
        }
        class277 var5 = this.field3271;
        synchronized (this.field3271) {
            this.field3271.method1811((byte) -23, arg0);
        }
        class277 var6 = this.field3272;
        synchronized (this.field3272) {
            this.field3272.method1811((byte) 113, arg0);
        }
        if (arg1 != 2) {
            this.field3270 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lcda;IZLkea;Lkea;)V")
    public class233(class149 arg0, int arg1, boolean arg2, class203 arg3, class203 arg4) {
        this.field3255 = arg4;
        this.field3269 = arg3;
        this.field3258 = arg2;
        if (this.field3269 != null) {
            int var6 = this.field3269.method1282(-82) - 1;
            this.field3269.method1309(1675886592, var6);
        }
    }
}
