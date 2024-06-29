import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class448 {

    @OriginalMember(owner = "client!am", name = "d", descriptor = "Ljk;")
    private class449 field6405 = new class449(128);

    @OriginalMember(owner = "client!am", name = "c", descriptor = "Lqn;")
    private class47 field6404;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "Lap;")
    public static class335 field6407 = new class335("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!am", name = "k", descriptor = "[I")
    public static int[] field6412 = new int[4096];

    @OriginalMember(owner = "client!am", name = "h", descriptor = "F")
    public static float field6409;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "Lqn;")
    public static class47 field6413;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
    public final void method2629(int arg0) {
        if (arg0 <= 79) {
            this.field6404 = null;
        }
        field6408++;
        class449 var2 = this.field6405;
        synchronized (this.field6405) {
            this.field6405.method2640(119);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method2630(String arg0, int arg1, boolean arg2) {
        String var3 = arg0.toLowerCase();
        field6406++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = var6 + (arg2 ? class176.field2307.field1586 : class176.field2307.field1592);
        if (arg1 != 31234) {
            method2633(-41);
        }
        for (int var8 = var6; var8 < var7; var8++) {
            class261 var11 = class176.field2307.method847(var8, 32768);
            if (var11.field3286 && var11.method1558(-51).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class218.field2786 = null;
                    class466.field6745 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class10.field164 = 0;
        class466.field6745 = var5;
        class218.field2786 = var4;
        String[] var9 = new String[class466.field6745];
        for (int var10 = 0; var10 < class466.field6745; var10++) {
            var9[var10] = class176.field2307.method847(var4[var10], 32768).method1558(-14);
        }
        class420.method2468(class218.field2786, var9, arg1 - 31233);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Lqg;")
    public final class324 method2631(int arg0, int arg1) {
        field6402++;
        class449 var3 = this.field6405;
        class324 var4;
        synchronized (this.field6405) {
            var4 = (class324) this.field6405.method2647(-107, (long) arg1);
        }
        if (arg0 != 32768) {
            return null;
        } else if (var4 == null) {
            class47 var5 = this.field6404;
            byte[] var6;
            synchronized (this.field6404) {
                var6 = this.field6404.method481(1, arg1, -68);
            }
            class324 var7 = new class324();
            if (var6 != null) {
                var7.method1899(0, new class463(var6));
            }
            class449 var8 = this.field6405;
            synchronized (this.field6405) {
                this.field6405.method2635((long) arg1, arg0 ^ 0xFFFF1821, var7);
                return var7;
            }
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
    public final void method2632(int arg0) {
        class449 var2 = this.field6405;
        synchronized (this.field6405) {
            if (arg0 != -22098) {
                return;
            }
            this.field6405.method2642(0);
        }
        field6403++;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
    public static void method2633(int arg0) {
        field6413 = null;
        field6412 = null;
        if (arg0 == 1) {
            field6407 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(II)V")
    public final void method2634(int arg0, int arg1) {
        class449 var3 = this.field6405;
        synchronized (this.field6405) {
            this.field6405.method2648(false, arg1);
        }
        field6411++;
        if (arg0 != -1) {
            this.field6404 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lae;ILqn;)V")
    public class448(class165 arg0, int arg1, class47 arg2) {
        this.field6404 = arg2;
        this.field6404.method469(30322, 1);
    }
}
