import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class492 {

    @OriginalMember(owner = "client!f", name = "m", descriptor = "Lqc;")
    private class325 field7440 = new class325(64);

    @OriginalMember(owner = "client!f", name = "b", descriptor = "Ldda;")
    private class597 field7429;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Z")
    public static boolean field7437 = true;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Z")
    public static volatile boolean field7436 = false;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "Ljt;")
    public static class489 field7433 = new class489(1);

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field7430;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field7435;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public static int field7439;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field7441;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Les;")
    public final class576 method2975(int arg0, int arg1) {
        field7435++;
        class325 var3 = this.field7440;
        class576 var4;
        synchronized (this.field7440) {
            var4 = (class576) this.field7440.method2025((long) arg0, 2);
            int var5 = 39 / ((arg1 + 83) / 42);
        }
        if (var4 != null) {
            return var4;
        }
        class597 var6 = this.field7429;
        byte[] var7;
        synchronized (this.field7429) {
            var7 = this.field7429.method3486((byte) -47, class147.method863((byte) 96, arg0), class260.method1644(194279658, arg0));
        }
        class576 var8 = new class576();
        if (var7 != null) {
            var8.method3370(new class428(var7), false);
        }
        class325 var9 = this.field7440;
        synchronized (this.field7440) {
            this.field7440.method2029(false, var8, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)V")
    public final void method2976(boolean arg0, int arg1) {
        field7438++;
        class325 var3 = this.field7440;
        synchronized (this.field7440) {
            this.field7440.method2037(arg0);
            this.field7440 = new class325(arg1);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V")
    public final void method2977(int arg0, byte arg1) {
        class325 var3 = this.field7440;
        synchronized (this.field7440) {
            this.field7440.method2028(arg0, true);
        }
        if (arg1 != -84) {
            this.method2983(117);
        }
        field7439++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IILqa;Lra;ZII)V")
    public static final void method2978(int arg0, int arg1, class167 arg2, class262 arg3, boolean arg4, int arg5, int arg6) {
        field7431++;
        if (arg4) {
            class331.field4910.method723((class522.field7735 - class331.field4910.method722()) / 2, (class337.field4944 - class331.field4910.method714()) / 2);
            class475.field7253.method723((class522.field7735 - class475.field7253.method722()) / 2, 18);
        }
        String var7 = "";
        if (class490.field7415 == class461.field6666) {
            var7 = class100.field1276.method2953(3181, class77.field889);
        } else if (class461.field6666 == class181.field2783) {
            var7 = class486.field7375.method2953(3181, class77.field889);
        }
        if (arg0 <= 118) {
            method2978(87, -7, null, null, true, 1, 114);
        }
        arg3.method1665(arg6, class522.field7735 / 2, false, var7, -1, class337.field4944 / 2 - 26);
        int var8 = class337.field4944 / 2 - 18;
        arg2.method1032(class522.field7735 / 2 - 152, var8, 304, 34, arg5, 0);
        arg2.method1032(class522.field7735 / 2 - 151, var8 + 1, 302, 32, 0, 0);
        arg2.method980(class522.field7735 / 2 - 150, var8 + 2, class207.field3081 * 3, 30, arg1, 0);
        arg2.method980(class522.field7735 / 2 + (class207.field3081 * 3) - 150, var8 - -2, 300 - (class207.field3081 * 3), 30, 0, 0);
        arg3.method1665(arg6, class522.field7735 / 2, false, class483.field7335, -1, class337.field4944 / 2 + 4);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public final void method2979(int arg0) {
        class325 var2 = this.field7440;
        synchronized (this.field7440) {
            this.field7440.method2024((byte) -93);
        }
        field7434++;
        int var3 = -80 % ((10 - arg0) / 60);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public static void method2980(int arg0) {
        field7433 = null;
        if (arg0 < 88) {
            field7433 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)Lnp;")
    public static final class111 method2981(int arg0) {
        if (arg0 < 57) {
            method2980(-26);
        }
        field7428++;
        try {
            return (class111) Class.forName("iv").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2982(String arg0, byte arg1) {
        if (class59.field709 == null) {
            class66.method406((byte) -104);
        }
        field7430++;
        String[] var2 = class317.method1994(8, '\n', arg0);
        if (arg1 <= 43) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class174.field2410; var4 > 0; var4--) {
                class59.field709[var4] = class59.field709[var4 - 1];
            }
            class59.field709[0] = var2[var3];
            if (class174.field2410 < class59.field709.length - 1) {
                class174.field2410++;
                if (class549.field8179 > 0) {
                    class549.field8179++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
    public final void method2983(int arg0) {
        field7441++;
        class325 var2 = this.field7440;
        synchronized (this.field7440) {
            this.field7440.method2037(true);
            if (arg0 <= 99) {
                method2981(27);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Loda;ILdda;)V")
    public class492(class559 arg0, int arg1, class597 arg2) {
        this.field7429 = arg2;
        if (this.field7429 != null) {
            int var4 = this.field7429.method3477(false) - 1;
            this.field7429.method3462(var4, 106);
        }
    }
}
