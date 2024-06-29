import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class201 implements Runnable {

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "Ltga;")
    private class255 field2978 = new class191();

    @OriginalMember(owner = "client!cu", name = "w", descriptor = "Ltga;")
    private class255 field2999 = null;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "F")
    public static float field2980 = 0.0F;

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "Lfba;")
    public static class348 field2992 = new class348(5);

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!cu", name = "s", descriptor = "I")
    private int field2995;

    @OriginalMember(owner = "client!cu", name = "v", descriptor = "I")
    private int field2998;

    @OriginalMember(owner = "client!cu", name = "t", descriptor = "J")
    private long field2996;

    @OriginalMember(owner = "client!cu", name = "x", descriptor = "J")
    private long field3000;

    @OriginalMember(owner = "client!cu", name = "y", descriptor = "Lsj;")
    private class474 field3001;

    @OriginalMember(owner = "client!cu", name = "u", descriptor = "Ljava/lang/String;")
    private String field2997;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "Z")
    private boolean field2979;

    @OriginalMember(owner = "client!cu", name = "q", descriptor = "Z")
    private volatile boolean field2993;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)V")
    public final synchronized void method1420(boolean arg0) {
        if (!arg0) {
            this.field2979 = true;
            field2989++;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)I")
    public final int method1421(byte arg0) {
        int var2 = -69 / ((arg0 - 28) / 62);
        field2994++;
        return this.field2995;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)I")
    public final int method1422(int arg0) {
        field2990++;
        if (this.field3001 == null) {
            return 0;
        }
        int var2 = this.field3001.method2844((byte) -49);
        if (this.field3001.field6714 && this.field3001.field6713 > this.field2998) {
            return this.field2998 + 1;
        } else if (var2 >= arg0 && var2 < (class591.field8407.length - 1)) {
            return this.field3001.field6718 == this.field2998 ? this.field3001.field6713 : this.field3001.field6718;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V")
    public static void method1423(int arg0) {
        field2992 = null;
        if (arg0 > -81) {
            field2992 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)Lsj;")
    public final class474 method1424(int arg0) {
        field2985++;
        if (arg0 != -5048) {
            field2992 = null;
        }
        return this.field3001;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BII)I")
    public static final int method1425(byte arg0, int arg1, int arg2) {
        field2984++;
        if (arg1 > arg2) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        return arg0 > -80 ? 26 : arg2;
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(Z)V")
    public final void method1426(boolean arg0) {
        this.field2993 = arg0;
        field2988++;
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(B)J")
    public final long method1427(byte arg0) {
        if (arg0 <= 34) {
            return -26L;
        } else {
            field2983++;
            return this.field2996;
        }
    }

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "(I)I")
    public final int method1428(int arg0) {
        if (arg0 != 16777215) {
            this.method1432(-116);
        }
        field2986++;
        return this.field2998;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Ltga;B)V")
    public final synchronized void method1429(class255 arg0, byte arg1) {
        field2982++;
        this.field2999 = this.field2978;
        if (arg1 <= 106) {
            this.method1431(false);
        }
        this.field2978 = arg0;
        this.field3000 = class465.method2818(255);
    }

    @OriginalMember(owner = "client!cu", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field2993) {
            long var1 = class465.method2818(255);
            synchronized (this) {
                try {
                    this.field2995++;
                    if (this.field2978 instanceof class191) {
                        this.field2978.method1340(true, this.field2979);
                    } else {
                        long var4 = class465.method2818(255);
                        if (class211.field3164 == null || this.field2999 == null || this.field2999.method1342((byte) 122) == 0 || this.field3000 < (var4 - ((long) this.field2999.method1342((byte) 54)))) {
                            if (this.field2999 != null) {
                                this.field2979 = true;
                                this.field2999.method1343(106);
                                this.field2999 = null;
                            }
                            if (this.field2979) {
                                class457.method2783((byte) 76);
                                if (class211.field3164 != null) {
                                    class211.field3164.method1240(0);
                                }
                            }
                            this.field2978.method1340(true, this.field2979 || class211.field3164 != null && class211.field3164.method292());
                        } else {
                            int var6 = (int) ((var4 - this.field3000) * 255L / (long) this.field2999.method1342((byte) 109));
                            int var7 = 255 - var6;
                            int var8 = var6 << 24 | 0xFFFFFF;
                            int var9 = var7 << 24 | 0xFFFFFF;
                            class457.method2783((byte) 76);
                            class211.field3164.method1240(0);
                            class515 var10 = class211.field3164.method377(class68.field1042, class565.field8187, true);
                            class211.field3164.method3264(var10, 1337);
                            this.field2999.method1340(true, true);
                            class211.field3164.method1224();
                            var10.method789(0, 0, 0, var9, 1);
                            class211.field3164.method3264(var10, 1337);
                            class211.field3164.method1240(0);
                            this.field2978.method1340(true, true);
                            class211.field3164.method1224();
                            var10.method789(0, 0, 0, var8, 1);
                        }
                        try {
                            if (class211.field3164 != null && !(this.field2978 instanceof class191)) {
                                class211.field3164.method3268(true);
                            }
                        } catch (class360 var18) {
                            class705.method3952(var18.getMessage() + " (Recovered) " + class660.field9437.method1556(9), var18, -29913);
                            class403.method2449(true, 0, -117);
                        }
                    }
                    Container var12;
                    if (class696.field9834 != null) {
                        var12 = class696.field9834;
                    } else if (class486.field6999 == null) {
                        var12 = class181.field2502;
                    } else {
                        var12 = class486.field6999;
                    }
                    var12.getSize();
                    var12.getSize();
                    if (class696.field9834 == var12) {
                        class696.field9834.getInsets();
                    }
                    this.field2979 = false;
                    if (class211.field3164 != null) {
                        class654.method3753(77);
                    }
                } catch (Exception var19) {
                    continue;
                }
            }
            long var13 = class465.method2818(255);
            int var15 = (int) (20L - (var13 - var1));
            if (var15 > 0) {
                class363.method2283((long) var15, -24244);
            }
        }
        field2987++;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lsj;Ljava/lang/String;JII)V")
    public final synchronized void method1430(class474 arg0, String arg1, long arg2, int arg3, int arg4) {
        this.field2998 = arg3;
        this.field2996 = arg2;
        this.field2997 = arg1;
        field2981++;
        if (arg4 != 255) {
            this.field2978 = null;
        }
        this.field3001 = arg0;
    }

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "(Z)Z")
    public final synchronized boolean method1431(boolean arg0) {
        field2977++;
        return arg0 ? true : this.field2978.method1336((byte) -27, this.field3000);
    }

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "(I)Ljava/lang/String;")
    public final String method1432(int arg0) {
        if (arg0 < 121) {
            return null;
        } else {
            field2991++;
            return this.field2997;
        }
    }
}
