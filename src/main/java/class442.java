import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class442 {

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "Ltl;")
    private class400 field6241 = new class400(128);

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "Lui;")
    private class451 field6245;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "Z")
    public static volatile boolean field6243 = true;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "Ldp;")
    public static class319 field6239;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IB)Lwr;", line = 3)
    public final class489 method2566(int arg0, byte arg1) {
        int var3 = 50 % ((-arg1 - 12) / 50);
        field6247++;
        class400 var4 = this.field6241;
        class489 var5;
        synchronized (this.field6241) {
            var5 = (class489) this.field6241.method2393(-123, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field6245.method2691(arg0, 1, 0);
        class489 var7 = new class489();
        if (var6 != null) {
            var7.method2855(new class446(var6), (byte) 113);
        }
        class400 var8 = this.field6241;
        synchronized (this.field6241) {
            this.field6241.method2395(0, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 34)
    public final void method2567(int arg0) {
        class400 var2 = this.field6241;
        synchronized (this.field6241) {
            this.field6241.method2388(arg0 ^ 0xFFFFD93D);
        }
        field6240++;
        if (arg0 != 9894) {
            method2571((String) null, -105);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 48)
    public static void method2568(byte arg0) {
        field6239 = null;
        if (arg0 > -41) {
            field6239 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V", line = 60)
    public final void method2569(int arg0, int arg1) {
        field6248++;
        if (arg0 != 5) {
            method2571((String) null, 35);
        }
        class400 var3 = this.field6241;
        synchronized (this.field6241) {
            this.field6241.method2389(false, arg1);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lui;ILcp;)V", line = 73)
    public static final void method2570(class451 arg0, int arg1, class481 arg2) {
        class163.field2268 = arg2;
        class484.field6797 = arg0;
        field6238++;
        if (arg1 != 4) {
            field6243 = true;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 92)
    public static final void method2571(String arg0, int arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field6242++;
        if (arg1 != -1996554240) {
            field6239 = null;
        }
        System.exit(1);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIILtq;I)V", line = 105)
    public static final void method2572(int arg0, int arg1, int arg2, int arg3, class63 arg4, int arg5) {
        arg4.method500(arg1, arg5, arg1 + arg3, arg5 - -arg0);
        field6244++;
        arg4.method530(arg0, -16777216, arg5, (byte) 108, arg1, arg3);
        if (class286.field4374 < 100) {
            return;
        }
        float var6 = (float) class189.field2914 / (float) class189.field2899;
        int var7 = arg3;
        int var8 = arg0;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg3 * var6);
        } else {
            var7 = (int) ((float) arg0 / var6);
        }
        int var9 = (arg0 - var8) / 2 + arg5;
        int var10 = (arg3 - var7) / 2 + arg1;
        if (class350.field5345 == null || class350.field5345.method798() != arg3 || arg0 != class350.field5345.method796()) {
            class189.method1319(class189.field2912, class189.field2914 + class189.field2902, class189.field2912 + class189.field2899, class189.field2902, var10, var9, var7 + var10, var9 - -var8);
            class189.method1316(arg4);
            class350.field5345 = arg4.method574(var10, var9, var7, var8, false);
        }
        class350.field5345.method1958(var10, var9);
        int var11 = class325.field4875 * var7 / class189.field2899;
        int var12 = class304.field4531 * var8 / class189.field2914;
        int var13 = class226.field3312 * var7 / class189.field2899 + var10;
        int var14 = var9 + var8 - (class316.field4753 * var8 / class189.field2914 + var12);
        int var15 = -1996554240;
        if (class77.field1088 == class124.field1710) {
            var15 = -1996488705;
        }
        arg4.method508(var13, var14, var11, var12, var15, 1);
        arg4.method569(var13, var14, var11, var12, var15, arg2);
        if (class132.field1843 <= 0) {
            return;
        }
        int var16;
        if (class163.field2270 <= 50) {
            var16 = class163.field2270 * 5;
        } else {
            var16 = (100 - class163.field2270) * 5;
        }
        for (class290 var17 = (class290) class189.field2885.method2456(32101); var17 != null; var17 = (class290) class189.field2885.method2461(301)) {
            class94 var18 = class189.field2877.method1111(var17.field4401, -13516);
            if (class88.method695(arg2 ^ 0x6F, var18)) {
                if (class346.field5287 == var17.field4401) {
                    int var21 = var10 + (var17.field4404 * var7 / class189.field2899);
                    int var22 = (class189.field2914 - var17.field4408) * var8 / class189.field2914 + var9;
                    arg4.method530(4, var16 << 24 | 0xFFFF00, var22 - 2, (byte) 108, var21 - 2, 4);
                } else if (class47.field685 != -1 && class47.field685 == var18.field1322) {
                    int var19 = var17.field4404 * var7 / class189.field2899 + var10;
                    int var20 = (class189.field2914 - var17.field4408) * var8 / class189.field2914 + var9;
                    arg4.method530(4, var16 << 24 | 0xFFFF00, var20 - 2, (byte) 108, var19 - 2, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)V", line = 198)
    public final void method2573(boolean arg0) {
        field6246++;
        class400 var2 = this.field6241;
        synchronized (this.field6241) {
            this.field6241.method2401((byte) -40);
            if (!arg0) {
                this.field6241 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lgp;ILui;)V", line = 218)
    public class442(class430 arg0, int arg1, class451 arg2) {
        this.field6245 = arg2;
        this.field6245.method2662(1, (byte) -7);
    }
}
