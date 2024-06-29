import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class28 implements Runnable {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Lwl;")
    private class374 field338 = new class469();

    @OriginalMember(owner = "client!o", name = "x", descriptor = "Lwl;")
    private class374 field361 = null;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field341 = 0;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "J")
    private long field358;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "J")
    private long field360;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "Lnw;")
    private class543 field363;

    // $FF: synthetic field
    @OriginalMember(owner = "client!o", name = "A", descriptor = "Ljava/lang/Class;")
    public static Class field364;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "Ljava/lang/String;")
    private String field359;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Z")
    private volatile boolean field347;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "Z")
    private boolean field356;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public final void method265(byte arg0) {
        int var2 = 113 / ((arg0 + 60) / 63);
        field350++;
        this.field347 = true;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public static final boolean method266(boolean arg0, String arg1) {
        field355++;
        if (!arg0) {
            method266(true, null);
        }
        return class333.method1967(true, arg1, field364 == null ? (field364 = method279("fw")) : field364);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)Z")
    public final synchronized boolean method267(byte arg0) {
        if (arg0 <= 49) {
            method271(-67);
        }
        field352++;
        return this.field338.method2154(false, this.field360);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)Lnw;")
    public final class543 method268(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field346++;
            return this.field363;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)J")
    public final long method269(int arg0) {
        field345++;
        if (arg0 != -1081028616) {
            this.field359 = null;
        }
        return this.field358;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZ)V")
    public static final void method270(int arg0, boolean arg1) {
        field340++;
        if (arg1) {
            if (class631.field8758 != -1) {
                class515.method2941((byte) 109, class631.field8758);
            }
            for (class685 var2 = (class685) class4.field26.method977(0); var2 != null; var2 = (class685) class4.field26.method975(arg0 ^ 0xFFFF9D8D)) {
                if (!var2.method2339(116)) {
                    var2 = (class685) class4.field26.method977(arg0 ^ 0x6272);
                    if (var2 == null) {
                        break;
                    }
                }
                class17.method83(true, var2, arg0 ^ 0xFFFFBCB9, false);
            }
            class631.field8758 = -1;
            class4.field26 = new class139(8);
            class568.method3252((byte) 110);
            class631.field8758 = class606.field8431;
            class546.method3075(false, 0);
            class314.method1905(-101);
            class97.method705(class631.field8758);
        }
        class75.field991 = true;
        if (arg0 != 25202) {
            field341 = 13;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
    public static final void method271(int arg0) {
        class360.field4750 = arg0;
        for (int var1 = 0; var1 < class335.field4511; var1++) {
            for (int var2 = 0; var2 < class643.field8878; var2++) {
                if (class295.field4051[arg0][var1][var2] == null) {
                    class295.field4051[arg0][var1][var2] = new class390(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V")
    public final synchronized void method272(boolean arg0) {
        field344++;
        this.field356 = true;
        if (arg0) {
            this.method267((byte) 33);
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)I")
    public final int method273(int arg0) {
        field354++;
        if (arg0 != 13084) {
            this.field357 = -105;
        }
        return this.field362;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)I")
    public final int method274(int arg0) {
        if (arg0 != 0) {
            method270(8, false);
        }
        field339++;
        return this.field357;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILwl;)V")
    public final synchronized void method275(int arg0, class374 arg1) {
        field353++;
        this.field361 = this.field338;
        this.field338 = arg1;
        this.field360 = class577.method3295((byte) 15);
        if (arg0 != -26446) {
            this.field361 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)I")
    public final int method276(byte arg0) {
        field343++;
        if (this.field363 == null) {
            return 0;
        }
        int var2 = this.field363.method3065((byte) -78);
        int var3 = -117 % ((32 - arg0) / 54);
        if (this.field363.field7347 && this.field362 < this.field363.field7352) {
            return this.field362 + 1;
        } else if (var2 >= 0 && class268.field3626.length - 1 > var2) {
            return this.field363.field7344 == this.field362 ? this.field363.field7352 : this.field363.field7344;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)Ljava/lang/String;")
    public final String method277(int arg0) {
        field351++;
        return arg0 > -26 ? null : this.field359;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(JLjava/lang/String;IILnw;)V")
    public final synchronized void method278(long arg0, String arg1, int arg2, int arg3, class543 arg4) {
        field342++;
        this.field363 = arg4;
        this.field359 = arg1;
        this.field358 = arg0;
        if (arg3 != 4309) {
            this.field362 = -21;
        }
        this.field362 = arg2;
    }

    @OriginalMember(owner = "client!o", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field347) {
            long var1 = class577.method3295((byte) 15);
            synchronized (this) {
                try {
                    if (this.field338 instanceof class469) {
                        this.field338.method2149(20582, this.field356);
                    } else {
                        this.field357++;
                        long var4 = class577.method3295((byte) 15);
                        if (class334.field4506 == null || this.field361 == null || this.field361.method2153(-5525) == 0 || this.field360 < var4 - (long) this.field361.method2153(-5525)) {
                            if (this.field361 != null) {
                                this.field356 = true;
                                this.field361.method2150(-25602);
                                this.field361 = null;
                            }
                            if (this.field356) {
                                class148.method1084(-1);
                                if (class334.field4506 != null) {
                                    class334.field4506.method101(0);
                                }
                            }
                            this.field338.method2149(20582, this.field356 || class334.field4506 != null && class334.field4506.method116());
                        } else {
                            int var6 = (int) ((var4 - this.field360) * 255L / (long) this.field361.method2153(-5525));
                            int var7 = 255 - var6;
                            class148.method1084(-1);
                            int var8 = var7 << 24 | 0xFFFFFF;
                            int var9 = var6 << 24 | 0xFFFFFF;
                            class334.field4506.method101(0);
                            class702 var10 = class334.field4506.method170(class222.field3096, class340.field4553, true);
                            class334.field4506.method1173(1, var10);
                            this.field361.method2149(20582, true);
                            class334.field4506.method96();
                            var10.method935(0, 0, 0, var8, 1);
                            class334.field4506.method1173(1, var10);
                            class334.field4506.method101(0);
                            this.field338.method2149(20582, true);
                            class334.field4506.method96();
                            var10.method935(0, 0, 0, var9, 1);
                        }
                        try {
                            if (class334.field4506 != null && !(this.field338 instanceof class469)) {
                                class334.field4506.method100();
                            }
                        } catch (class39 var17) {
                            class413.method2400(var17.getMessage() + " (Recovered) " + class647.field8937.method1522(-102), var17, (byte) -27);
                            class203.method1327((byte) 63, 0);
                        }
                    }
                    this.field356 = false;
                } catch (Exception var18) {
                    continue;
                }
            }
            long var12 = class577.method3295((byte) 15);
            int var14 = (int) (20L - (var12 - var1));
            if (var14 > 0) {
                class519.method2960(-74, (long) var14);
            }
        }
        field348++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method279(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
