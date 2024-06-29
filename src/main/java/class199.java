import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class199 implements Runnable {

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "[I")
    public static int[] field3940 = new int[128];

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Z")
    public static boolean field3941 = false;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Lrf;")
    public static class163 field3942 = class53.method392(-85, "mapedge");

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "Lrf;")
    public static class163 field3945 = class53.method392(-74, ")3");

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Lrf;")
    public static class163 field3946 = class53.method392(-51, "welle2:");

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lrf;")
    public static class163 field3936 = class53.method392(-68, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Lrf;")
    public static class163 field3937 = class53.method392(-75, "gr-Un:");

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "Lfa;")
    public static class52 field3947 = new class52(new byte[5000]);

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Lkg;")
    public static class102 field3935;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "Lea;")
    public static class42 field3949;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "[Lrf;")
    public static class163[] field3944;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "[[S")
    public static short[][] field3938;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static final void method1312(int arg0) {
        if (arg0 != 128) {
            field3944 = null;
        }
        class186.field3706.method399(false);
        field3948++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static void method1313(byte arg0) {
        field3945 = null;
        field3936 = null;
        field3935 = null;
        field3946 = null;
        field3944 = null;
        field3938 = null;
        field3949 = null;
        field3937 = null;
        field3940 = null;
        field3947 = null;
        if (arg0 < -20) {
            field3942 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI)Lg;")
    public static final class61 method1314(byte arg0, int arg1) {
        field3950++;
        class61 var2 = (class61) class146.field3000.method401((long) arg1, (byte) -85);
        if (var2 != null) {
            return var2;
        } else if (arg0 < 125) {
            return null;
        } else {
            byte[] var3 = class92.field2006.method1235(arg1, (byte) -64, 6);
            class61 var4 = new class61();
            var4.field1244 = arg1;
            if (var3 != null) {
                var4.method442(-100, new class52(var3));
            }
            var4.method436(65536);
            if (var4.field1265) {
                var4.field1272 = false;
                var4.field1296 = 0;
            }
            class146.field3000.method398(var4, (long) arg1, (byte) 114);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vf", name = "run", descriptor = "()V")
    public final void run() {
        field3943++;
        try {
            while (true) {
                class5 var1 = class96.field2046;
                class82 var2;
                synchronized (class96.field2046) {
                    var2 = (class82) class96.field2046.method46(53);
                }
                if (var2 == null) {
                    class25.method151(100L, (byte) 0);
                    Object var3 = class40.field814;
                    synchronized (class40.field814) {
                        if (class105.field2197 <= 1) {
                            class105.field2197 = 0;
                            class40.field814.notifyAll();
                            return;
                        }
                        class105.field2197--;
                    }
                } else {
                    if (var2.field1666 == 0) {
                        var2.field1663.method105(var2.field1657, 0, var2.field1657.length, (int) var2.field1950);
                        class5 var5 = class96.field2046;
                        synchronized (class96.field2046) {
                            var2.method630(58);
                        }
                    } else if (var2.field1666 == 1) {
                        var2.field1657 = var2.field1663.method109(false, (int) var2.field1950);
                        class5 var4 = class96.field2046;
                        synchronized (class96.field2046) {
                            class37.field748.method51(0, var2);
                        }
                    }
                    Object var6 = class40.field814;
                    synchronized (class40.field814) {
                        if (class105.field2197 <= 1) {
                            class105.field2197 = 0;
                            class40.field814.notifyAll();
                            return;
                        }
                        class105.field2197 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class152.method980(var17, null, true);
        }
    }
}
