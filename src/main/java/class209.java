import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class209 {

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "Lqc;")
    private class325 field3087 = new class325(64);

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "Lqc;")
    public class325 field3095 = new class325(2);

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "Ldda;")
    private class597 field3089;

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "Ldda;")
    public class597 field3093;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "[I")
    public static int[] field3086 = new int[4];

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "J")
    public static long field3092 = 0L;

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
    public static int field3097;

    static {
        new class487(null, "geschickt werden.", null, null);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V", line = 3)
    public static final void method1351(byte arg0) {
        field3091++;
        int var1 = class264.field3925;
        int[] var2 = class533.field7895;
        for (int var3 = 0; var3 < var1; var3++) {
            class179 var9 = class383.field5604[var2[var3]];
            if (var9 != null && var9.field1027 > 0) {
                var9.field1027--;
                if (var9.field1027 == 0) {
                    var9.field1042 = null;
                }
            }
        }
        if (arg0 >= -84) {
            return;
        }
        for (int var4 = 0; var4 < class567.field8409; var4++) {
            long var5 = (long) class25.field230[var4];
            class234 var7 = (class234) class627.field9185.method1333(var5, false);
            if (var7 != null) {
                class383 var8 = var7.field3443;
                if (var8.field1027 > 0) {
                    var8.field1027--;
                    if (var8.field1027 == 0) {
                        var8.field1042 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V", line = 63)
    public final void method1352(int arg0) {
        if (arg0 != 33) {
            this.method1353(63, -45);
        }
        field3096++;
        class325 var2 = this.field3087;
        synchronized (this.field3087) {
            this.field3087.method2037(true);
        }
        class325 var3 = this.field3095;
        synchronized (this.field3095) {
            this.field3095.method2037(true);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)Lwa;", line = 88)
    public final class604 method1353(int arg0, int arg1) {
        field3097++;
        class325 var3 = this.field3087;
        class604 var4;
        synchronized (this.field3087) {
            var4 = (class604) this.field3087.method2025((long) arg0, 2);
        }
        if (var4 != null) {
            return var4;
        }
        class597 var5 = this.field3089;
        byte[] var6;
        synchronized (this.field3089) {
            var6 = this.field3089.method3486((byte) -67, arg0, 33);
        }
        class604 var7 = new class604();
        var7.field8890 = this;
        if (var6 != null) {
            var7.method3511(new class428(var6), 0);
        }
        class325 var8 = this.field3087;
        synchronized (this.field3087) {
            if (arg1 != 0) {
                this.field3095 = null;
            }
            this.field3087.method2029(false, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(B)V", line = 120)
    public final void method1354(byte arg0) {
        field3088++;
        class325 var2 = this.field3087;
        synchronized (this.field3087) {
            this.field3087.method2024((byte) -116);
        }
        class325 var3 = this.field3095;
        synchronized (this.field3095) {
            if (arg0 == -38) {
                this.field3095.method2024((byte) -117);
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "(B)V", line = 136)
    public static final void method1355(byte arg0) {
        field3090++;
        if (arg0 != 90) {
            method1351((byte) -119);
        }
        class487.field7385 = 0;
        class272.field4014.method2499(0);
        class272.field4014.method2492(class347.field5057, (byte) -105);
        class487.field7385++;
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(II)V", line = 150)
    public final void method1356(int arg0, int arg1) {
        field3094++;
        if (arg0 >= -114) {
            method1355((byte) 27);
        }
        class325 var3 = this.field3087;
        synchronized (this.field3087) {
            this.field3087.method2028(arg1, true);
        }
        class325 var4 = this.field3095;
        synchronized (this.field3095) {
            this.field3095.method2028(arg1, true);
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V", line = 169)
    public static void method1357(int arg0) {
        field3086 = null;
        if (arg0 != -25233) {
            method1355((byte) 26);
        }
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Loda;ILdda;Ldda;)V", line = 200)
    public class209(class559 arg0, int arg1, class597 arg2, class597 arg3) {
        this.field3089 = arg2;
        this.field3093 = arg3;
        this.field3089.method3462(33, -50);
    }
}
