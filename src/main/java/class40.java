import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class40 implements Runnable {

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "[Lac;")
    public volatile class127[] field480 = new class127[2];

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "Z")
    public volatile boolean field479 = false;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Z")
    public volatile boolean field481 = false;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field483 = 10;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field476 = 0;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Lbc;")
    public static class282 field484;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Lsi;")
    public class56 field477;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILwe;III)V")
    public static final void method248(int arg0, class82 arg1, int arg2, int arg3, int arg4) {
        int var5 = -45 / ((arg4 + 43) / 35);
        field485++;
        if (class230.field3306 < 3) {
            ((class187) class63.field738).method1223(arg0, arg3, arg1.field1131, arg1.field1048, class63.field738.field1882 / 2, class63.field738.field1879 / 2, (int) class274.field4085, 256, arg1.field977, arg1.field1017);
        } else {
            class155.method1026(arg0, arg3, 0, arg1.field977, arg1.field1017);
        }
        class163.field2341[arg2] = true;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public static void method249(byte arg0) {
        if (arg0 != 66) {
            method251(-4, true, 97);
        }
        field484 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([I[IILtl;[I)V")
    public static final void method250(int[] arg0, int[] arg1, int arg2, class240 arg3, int[] arg4) {
        field475++;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg4[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg3.field4540.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field4540[var9] = null;
                    } else {
                        class274 var10 = class27.method165(var6, (byte) -122);
                        class214 var11 = arg3.field4540[var9];
                        int var12 = var10.field4090;
                        if (var11 != null) {
                            if (var11.field2988 == var6) {
                                if (var12 == 0) {
                                    var11 = arg3.field4540[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field2994 = 0;
                                    var11.field2992 = 0;
                                    var11.field2987 = 0;
                                    var11.field2991 = var8;
                                    var11.field2995 = 1;
                                    class270.method1730(0, arg3.field4563, arg3.field4553, (byte) -119, var10, class177.field2507 == arg3);
                                } else if (var12 == 2) {
                                    var11.field2987 = 0;
                                }
                            } else if (var10.field4071 >= class27.method165(var11.field2988, (byte) -126).field4071) {
                                var11 = arg3.field4540[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class214 var13 = arg3.field4540[var9] = new class214();
                            var13.field2987 = 0;
                            var13.field2988 = var6;
                            var13.field2992 = 0;
                            var13.field2991 = var8;
                            var13.field2995 = 1;
                            var13.field2994 = 0;
                            class270.method1730(0, arg3.field4563, arg3.field4553, (byte) -113, var10, class177.field2507 == arg3);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        if (arg2 != -2) {
            field476 = -76;
        }
    }

    @OriginalMember(owner = "client!ok", name = "run", descriptor = "()V")
    public final void run() {
        field482++;
        this.field481 = true;
        try {
            while (!this.field479) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class127 var2 = this.field480[var1];
                    if (var2 != null) {
                        var2.method834((byte) -95);
                    }
                }
                class247.method1595(10L, (byte) -83);
                class21.method126(32488, (Object) null, this.field477);
            }
        } catch (Exception var9) {
            class142.method918(-1, var9, (String) null);
        } finally {
            Object var6 = null;
            this.field481 = false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZI)V")
    public static final void method251(int arg0, boolean arg1, int arg2) {
        field486++;
        class66 var3 = class6.method34(7, arg1, arg2);
        if (!arg1) {
            method249((byte) 115);
        }
        var3.method408(0);
        var3.field784 = arg0;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static final void method252(int arg0) {
        class260.field3785.method71(-120);
        if (arg0 == 0) {
            field478++;
        }
    }
}
