import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class286 {

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Lgw;")
    private class690 field4110 = new class690(64);

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "Luu;")
    private class237 field4115;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "[F")
    public static float[] field4114 = new float[2];

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "Lst;")
    public static class335 field4112 = new class335(84, 8);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BIIIILni;I)V", line = 5)
    public static final void method1894(byte arg0, int arg1, int arg2, int arg3, int arg4, class515 arg5, int arg6) {
        class275.method1846(arg5.field4418, (byte) 125, arg6, arg1, 0, arg5.field4410, arg3, arg2, arg5.field4408, arg4);
        field4111++;
        if (arg0 <= 40) {
            method1896(true);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 17)
    public static void method1895(int arg0) {
        field4114 = null;
        int var1 = -79 / ((arg0 - 48) / 33);
        field4112 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V", line = 28)
    public static final void method1896(boolean arg0) {
        field4118++;
        if (arg0) {
            field4114 = null;
        }
        try {
            if (class217.field2826 == 1) {
                int var1 = class149.field2066.method1778((byte) -125);
                if (var1 > 0 && class149.field2066.method1790((byte) -85)) {
                    int var2 = var1 - class459.field6373;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class149.field2066.method1786(var2, 63);
                    return;
                }
                class149.field2066.method1761(2);
                class149.field2066.method1774(0);
                class505.field7027 = null;
                class216.field2820 = null;
                if (class524.field7281 == null) {
                    class217.field2826 = 0;
                } else {
                    class217.field2826 = 2;
                }
            }
            if (class217.field2826 == 3) {
                int var3 = class149.field2066.method1778((byte) -109);
                if (class517.field7221 > var3 && class149.field2066.method1790((byte) -78)) {
                    int var4 = class401.field5751 + var3;
                    if (class517.field7221 < var4) {
                        var4 = class517.field7221;
                    }
                    class149.field2066.method1786(var4, 37);
                } else {
                    class217.field2826 = 0;
                    class401.field5751 = 0;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class149.field2066.method1761(2);
            class123.field1689 = null;
            class216.field2820 = null;
            class217.field2826 = 0;
            class524.field7281 = null;
            class505.field7027 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V", line = 99)
    public final void method1897(int arg0, int arg1) {
        field4119++;
        class690 var3 = this.field4110;
        synchronized (this.field4110) {
            this.field4110.method3906(-121);
            this.field4110 = new class690(arg1);
            if (arg0 != 64) {
                field4114 = null;
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lsba;B)Ljava/lang/String;", line = 115)
    public static final String method1898(class558 arg0, byte arg1) {
        if (arg1 <= 117) {
            field4112 = null;
        }
        field4116++;
        if (arg0.field7763 == null || arg0.field7763.length() == 0) {
            return arg0.field7759 == null || arg0.field7759.length() <= 0 ? arg0.field7755 : arg0.field7755 + class155.field2151.method978(class120.field1576, (byte) -111) + arg0.field7759;
        } else if (arg0.field7759 == null || arg0.field7759.length() <= 0) {
            return arg0.field7755 + class155.field2151.method978(class120.field1576, (byte) -116) + arg0.field7763;
        } else {
            return arg0.field7755 + class155.field2151.method978(class120.field1576, (byte) -110) + arg0.field7759 + class155.field2151.method978(class120.field1576, (byte) -112) + arg0.field7763;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BII)Z", line = 143)
    public static final boolean method1899(byte arg0, int arg1, int arg2) {
        field4108++;
        if (class720.method4034(arg2, arg1, 99)) {
            if (arg0 > -121) {
                method1896(false);
            }
            return class8.method44(false, arg1, arg2) | (arg2 & 0x9000) != 0 | class551.method3267((byte) 103, arg2, arg1) ? true : (class338.method2146(544, arg1, arg2) | (arg2 & 0x2000) != 0 | class526.method3124(arg2, arg1, 65536)) & (arg1 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZI)Lor;", line = 161)
    public final class327 method1900(boolean arg0, int arg1) {
        field4109++;
        class690 var3 = this.field4110;
        class327 var4;
        synchronized (this.field4110) {
            if (!arg0) {
                this.field4115 = null;
            }
            var4 = (class327) this.field4110.method3898((byte) -42, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class237 var5 = this.field4115;
        byte[] var6;
        synchronized (this.field4115) {
            var6 = this.field4115.method1572(class363.method2304(arg1, 0), 0, class516.method3091(arg1, (byte) -89));
        }
        class327 var7 = new class327();
        if (var6 != null) {
            var7.method2088((byte) -120, new class63(var6));
        }
        class690 var8 = this.field4110;
        synchronized (this.field4110) {
            this.field4110.method3899(-108, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V", line = 192)
    public final void method1901(int arg0) {
        class690 var2 = this.field4110;
        synchronized (this.field4110) {
            this.field4110.method3906(-108);
        }
        field4120++;
        if (arg0 != 29164) {
            this.field4115 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lgp;ILuu;)V", line = 243)
    public class286(class553 arg0, int arg1, class237 arg2) {
        this.field4115 = arg2;
        if (this.field4115 != null) {
            int var4 = this.field4115.method1584((byte) 39) - 1;
            this.field4115.method1597(var4, 0);
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(II)V", line = 214)
    public final void method1902(int arg0, int arg1) {
        class690 var3 = this.field4110;
        synchronized (this.field4110) {
            this.field4110.method3896(1, arg0);
            if (arg1 != 0) {
                field4114 = null;
            }
        }
        field4117++;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(Z)V", line = 228)
    public final void method1903(boolean arg0) {
        if (arg0) {
            this.field4115 = null;
        }
        class690 var2 = this.field4110;
        synchronized (this.field4110) {
            this.field4110.method3902(0);
        }
        field4113++;
    }
}
