import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class625 {

    @OriginalMember(owner = "client!vfa", name = "j", descriptor = "Laj;")
    private class287 field9034 = new class287(16);

    @OriginalMember(owner = "client!vfa", name = "k", descriptor = "Lom;")
    private class344 field9035;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "I")
    public static int field9025 = 2;

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "Z")
    public static boolean field9026 = false;

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "I")
    public static int field9028;

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "I")
    public static int field9029;

    @OriginalMember(owner = "client!vfa", name = "f", descriptor = "I")
    public static int field9030;

    @OriginalMember(owner = "client!vfa", name = "g", descriptor = "I")
    public static int field9031;

    @OriginalMember(owner = "client!vfa", name = "h", descriptor = "I")
    public static int field9032;

    @OriginalMember(owner = "client!vfa", name = "i", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "Lju;")
    public static class111 field9027;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lom;B)V")
    public static final void method3558(class344 arg0, byte arg1) {
        if (arg1 != 112) {
            field9026 = true;
        }
        class90.field1653 = arg0;
        field9030++;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V")
    public final void method3559(int arg0) {
        field9033++;
        if (arg0 < -43) {
            class287 var2 = this.field9034;
            synchronized (this.field9034) {
                this.field9034.method1913(true);
            }
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)V")
    public final void method3560(int arg0, int arg1) {
        field9028++;
        class287 var3 = this.field9034;
        synchronized (this.field9034) {
            this.field9034.method1908(arg0, (byte) -11);
            int var4 = -3 / ((arg1 - 53) / 61);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IBLjava/lang/String;)V")
    public static final void method3561(int arg0, byte arg1, String arg2) {
        field9029++;
        int var3 = class237.field3520;
        int[] var4 = class47.field1140;
        boolean var5 = false;
        int var6 = 0;
        if (arg1 <= 93) {
            return;
        }
        while (var3 > var6) {
            class602 var7 = class59.field1341[var4[var6]];
            if (var7 != null && class532.field7456 != var7 && var7.field8631 != null && var7.field8631.equalsIgnoreCase(arg2)) {
                if (arg0 == 1) {
                    class230.field3428++;
                    class275 var8 = class185.method1355(0, class568.field8269, class395.field5772);
                    var8.field4103.method709(var4[var6], -110);
                    var8.field4103.method744((byte) -54, 0);
                    class140.method1141(var8, 19321);
                } else if (arg0 == 4) {
                    class515.field7273++;
                    class275 var12 = class185.method1355(0, class424.field6128, class395.field5772);
                    var12.field4103.method709(var4[var6], -102);
                    var12.field4103.method707(0, (byte) 100);
                    class140.method1141(var12, 19321);
                } else if (arg0 == 5) {
                    class609.field8874++;
                    class275 var9 = class185.method1355(0, class308.field4550, class395.field5772);
                    var9.field4103.method746(0, var4[var6]);
                    var9.field4103.method744((byte) -54, 0);
                    class140.method1141(var9, 19321);
                } else if (arg0 == 6) {
                    class36.field1031++;
                    class275 var10 = class185.method1355(0, class233.field3485, class395.field5772);
                    var10.field4103.method746(0, var4[var6]);
                    var10.field4103.method707(0, (byte) 100);
                    class140.method1141(var10, 19321);
                } else if (arg0 == 7) {
                    class381.field5640++;
                    class275 var11 = class185.method1355(0, class498.field7093, class395.field5772);
                    var11.field4103.method745(var4[var6], 128);
                    var11.field4103.method693((byte) 106, 0);
                    class140.method1141(var11, 19321);
                }
                var5 = true;
                break;
            }
            var6++;
        }
        if (!var5) {
            class108.method974(4, class265.field3896.method1733(255, class140.field2466) + arg2, 3867);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)V")
    public static void method3562(byte arg0) {
        field9027 = null;
        if (arg0 != 67) {
            method3562((byte) -12);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(II)Leu;")
    public final class447 method3563(int arg0, int arg1) {
        field9032++;
        class287 var3 = this.field9034;
        class447 var4;
        synchronized (this.field9034) {
            var4 = (class447) this.field9034.method1900((long) arg1, 113);
        }
        if (var4 != null) {
            return var4;
        }
        class344 var5 = this.field9035;
        byte[] var6;
        synchronized (this.field9035) {
            var6 = this.field9035.method2216(arg0, arg1, true);
        }
        class447 var7 = new class447();
        if (var6 != null) {
            var7.method2690(125, new class61(var6));
        }
        class287 var8 = this.field9034;
        synchronized (this.field9034) {
            this.field9034.method1904(var7, (long) arg1, arg0 - 31);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)V")
    public final void method3564(int arg0) {
        field9031++;
        class287 var2 = this.field9034;
        synchronized (this.field9034) {
            this.field9034.method1912(-2552);
            if (arg0 <= 89) {
                this.field9035 = null;
            }
        }
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lmea;ILom;)V")
    public class625(class398 arg0, int arg1, class344 arg2) {
        this.field9035 = arg2;
        this.field9035.method2236(30, 0);
    }
}
