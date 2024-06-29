import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class162 extends class361 {

    @OriginalMember(owner = "client!dt", name = "H", descriptor = "Leh;")
    public static class246 field2395 = new class246(35, -2);

    @OriginalMember(owner = "client!dt", name = "J", descriptor = "Lnh;")
    public static class536 field2397 = new class536("WTI", 5);

    @OriginalMember(owner = "client!dt", name = "M", descriptor = "Lbh;")
    public static class28 field2400 = new class28(8);

    @OriginalMember(owner = "client!dt", name = "w", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!dt", name = "x", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!dt", name = "z", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!dt", name = "C", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!dt", name = "D", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!dt", name = "E", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!dt", name = "F", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!dt", name = "I", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!dt", name = "K", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!dt", name = "B", descriptor = "Ljava/lang/String;")
    public String field2389;

    @OriginalMember(owner = "client!dt", name = "A", descriptor = "[C")
    public char[] field2388;

    @OriginalMember(owner = "client!dt", name = "L", descriptor = "[C")
    public char[] field2399;

    @OriginalMember(owner = "client!dt", name = "y", descriptor = "[I")
    public int[] field2386;

    @OriginalMember(owner = "client!dt", name = "G", descriptor = "[I")
    public int[] field2394;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(BLjava/awt/Component;)Ldf;")
    public static final class279 method1027(byte arg0, Component arg1) {
        if (arg0 == -32) {
            field2391++;
            return new class139(arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
    public static void method1028(int arg0) {
        field2400 = null;
        field2397 = null;
        if (arg0 != 0) {
            field2400 = null;
        }
        field2395 = null;
    }

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "(I)V")
    public final void method1029(int arg0) {
        field2398++;
        if (arg0 != 4376) {
            return;
        }
        if (this.field2394 != null) {
            for (int var2 = 0; var2 < this.field2394.length; var2++) {
                this.field2394[var2] = class170.method1067(this.field2394[var2], 32768);
            }
        }
        if (this.field2386 != null) {
            for (int var3 = 0; var3 < this.field2386.length; var3++) {
                this.field2386[var3] = class170.method1067(this.field2386[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(Z)I")
    public static final int method1030(boolean arg0) {
        if (!arg0) {
            return 116;
        }
        field2393++;
        if (class471.field6573 == null) {
            if (!class424.field5977 && class37.field408 > 0) {
                if (class462.field6464 && class345.field5009.method870(81, -124) && class37.field408 > 2) {
                    return ((class214) class363.field5190.field6378.field7056.field7056).field3092;
                }
                return ((class214) class363.field5190.field6378.field7056).field3092;
            }
            int var1 = class22.field277.method1192(true);
            int var2 = class22.field277.method1194(36);
            int var3 = class123.field1679;
            int var4 = class250.field3725;
            int var5 = class388.field5445;
            if (var1 > var3 && (var3 + var5) > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class37.field408; var7++) {
                    if (class328.field4784) {
                        int var11 = (class37.field408 - var7 - 1) * 16 + var4 + 33;
                        if ((var11 - 13) < var2 && var2 <= (var11 + 3)) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = var4 + ((class37.field408 - var7 - 1) * 16) + 31;
                        if (var12 - 13 < var2 && var2 <= (var12 + 3)) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class140 var9 = new class140(class363.field5190);
                    for (class214 var10 = (class214) var9.method876((byte) -121); var10 != null; var10 = (class214) var9.method880((byte) -47)) {
                        if ((var8++) == var6) {
                            return var10.field3092;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)V")
    public static final void method1031(int arg0, int arg1) {
        class367.field5246 = 3;
        if (arg1 < -85) {
            class515.field7594 = 100;
            class163.field2416 = -1;
            class205.field2969 = arg0;
            field2385++;
        }
    }

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "(I)V")
    public static final void method1032(int arg0) {
        class30.field357.field5665 = 0;
        field2396++;
        class15.field195 = null;
        class184.field2664 = 0;
        class211.field3061 = null;
        class455.field6390 = null;
        class497.field7039 = null;
        class264.field3874.field5665 = 0;
        class190.field2715 = arg0;
        class503.field7252 = 0;
        class362.method2136((byte) -63);
        class240.method1513(arg0 + 125);
        for (int var1 = 0; var1 < 2048; var1++) {
            class378.field5355[var1] = null;
        }
        class246.field3587 = null;
        for (int var2 = 0; var2 < class481.field6704; var2++) {
            class429 var4 = class367.field5245[var2].field5353;
            if (var4 != null) {
                var4.field3338 = -1;
            }
        }
        class3.method25((byte) -24);
        class504.field7461 = 1;
        class86.method623(9, (byte) 107);
        for (int var3 = 0; var3 < 100; var3++) {
            class306.field4450[var3] = true;
        }
        class510.method3046(true);
        class397.field5620 = 0L;
        class369.field5264 = null;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(BLwm;I)V")
    private final void method1033(byte arg0, class403 arg1, int arg2) {
        if (arg0 > -93) {
            method1028(126);
        }
        field2390++;
        if (arg2 == 1) {
            this.field2389 = arg1.method2356(-25178);
        } else if (arg2 == 2) {
            int var4 = arg1.method2357((byte) 115);
            this.field2388 = new char[var4];
            this.field2386 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2386[var5] = arg1.method2338(0);
                byte var6 = arg1.method2359(-90);
                this.field2388[var5] = var6 == 0 ? 0 : class120.method805(var6, (byte) -85);
            }
        } else if (arg2 == 3) {
            int var7 = arg1.method2357((byte) 106);
            this.field2399 = new char[var7];
            this.field2394 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2394[var8] = arg1.method2338(0);
                byte var9 = arg1.method2359(-117);
                this.field2399[var8] = var9 == 0 ? 0 : class120.method805(var9, (byte) -98);
            }
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZLwm;)V")
    public final void method1034(boolean arg0, class403 arg1) {
        while (true) {
            int var3 = arg1.method2357((byte) 115);
            if (var3 == 0) {
                if (arg0) {
                    method1032(38);
                }
                field2384++;
                return;
            }
            this.method1033((byte) -128, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(BC)I")
    public final int method1035(byte arg0, char arg1) {
        int var3 = -17 / ((arg0 + 13) / 46);
        field2387++;
        if (this.field2394 == null) {
            return -1;
        }
        for (int var4 = 0; var4 < this.field2394.length; var4++) {
            if (this.field2399[var4] == arg1) {
                return this.field2394[var4];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(CI)I")
    public final int method1036(char arg0, int arg1) {
        field2392++;
        if (this.field2386 == null) {
            return -1;
        }
        for (int var3 = arg1; var3 < this.field2386.length; var3++) {
            if (this.field2388[var3] == arg0) {
                return this.field2386[var3];
            }
        }
        return -1;
    }
}
