import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class314 {

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "Lhu;")
    private class76 field4165 = new class76(64);

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "Lhu;")
    public class76 field4173 = new class76(2);

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "Lr;")
    public class110 field4168;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "Lr;")
    private class110 field4164;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field4163 = 0;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "Lqg;")
    public static class296 field4171 = new class296(5000);

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lnk;III)V")
    public static final void method1724(class464 arg0, int arg1, int arg2, int arg3) {
        field4170++;
        class152 var4 = arg0.method2738((byte) 126, class98.field1432);
        if (var4 == null) {
            return;
        }
        class98.field1432.method1981(arg2, arg3, arg2 + arg0.field6308, arg0.field6340 + arg3);
        if (arg1 <= class455.field6170) {
            class98.field1432.method2029(-16777216, var4, arg2, arg3);
        } else {
            class413.field5649.method843((float) arg0.field6308 / 2.0F + (float) arg2, (float) arg0.field6340 / 2.0F + (float) arg3, 4096, ((int) (-class270.field3610) & 0x3FFF) << 2, var4, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIILje;Lwm;Ljg;Lnp;I)V")
    public static final void method1725(int arg0, int arg1, int arg2, class253 arg3, class364 arg4, class205 arg5, class313 arg6, int arg7) {
        field4160++;
        int var8 = arg5.field2776 - arg0 / 2 - 5;
        int var9 = arg2 + 2;
        if (arg6.field4155 != 0) {
            arg4.method2222(arg2 + arg1 * arg3.method1421() + 1 - var9, var8, var9, arg6.field4155, 97, arg0 + 10);
        }
        if (arg6.field4130 != 0) {
            arg4.method2219(-16385, var9, var8, arg2 + (arg3.method1421() * arg1) + 1 - var9, arg6.field4130, arg0 + 10);
        }
        int var10 = arg6.field4147;
        if (arg5.field2770 && arg6.field4115 != -1) {
            var10 = arg6.field4115;
        }
        if (arg7 != 33) {
            method1727((byte) 33, -15);
        }
        for (int var11 = 0; var11 < arg1; var11++) {
            String var12 = class477.field6584[var11];
            if ((arg1 - 1) > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg3.method1424(arg4, var12, arg5.field2776, arg2, var10, true);
            arg2 += arg3.method1421();
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public final void method1726(int arg0) {
        class76 var2 = this.field4165;
        synchronized (this.field4165) {
            this.field4165.method502(0);
            if (arg0 != -21964) {
                field4171 = null;
            }
        }
        field4166++;
        class76 var3 = this.field4173;
        synchronized (this.field4173) {
            this.field4173.method502(0);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)Lje;")
    public static final class253 method1727(byte arg0, int arg1) {
        field4172++;
        if (arg1 == 0) {
            if ((double) class55.field739 == 3.0D) {
                return class441.field5947;
            }
            if ((double) class55.field739 == 4.0D) {
                return class97.field1418;
            }
            if ((double) class55.field739 == 6.0D) {
                return class310.field4096;
            }
            if ((double) class55.field739 >= 8.0D) {
                return class77.field1041;
            }
        } else if (arg1 == 1) {
            if ((double) class55.field739 == 3.0D) {
                return class310.field4096;
            }
            if ((double) class55.field739 == 4.0D) {
                return class77.field1041;
            }
            if ((double) class55.field739 == 6.0D) {
                return class404.field5544;
            }
            if ((double) class55.field739 >= 8.0D) {
                return class473.field6528;
            }
        } else if (arg1 == 2) {
            if ((double) class55.field739 == 3.0D) {
                return class404.field5544;
            }
            if ((double) class55.field739 == 4.0D) {
                return class473.field6528;
            }
            if ((double) class55.field739 == 6.0D) {
                return class231.field3072;
            }
            if ((double) class55.field739 >= 8.0D) {
                return class446.field6063;
            }
        }
        if (arg0 <= 39) {
            field4169 = -121;
        }
        return null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZLac;Lac;IBZ)I")
    public static final int method1728(int arg0, boolean arg1, class348 arg2, class348 arg3, int arg4, byte arg5, boolean arg6) {
        field4161++;
        int var7 = class341.method1936(arg6, arg2, arg3, (byte) -40, arg4);
        if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var8 = class341.method1936(arg1, arg2, arg3, (byte) -40, arg0);
            if (arg5 < 106) {
                field4171 = null;
            }
            return arg1 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Lte;")
    public final class401 method1729(int arg0, int arg1) {
        field4162++;
        class76 var3 = this.field4165;
        class401 var4;
        synchronized (this.field4165) {
            var4 = (class401) this.field4165.method493((byte) 19, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4164.method702((byte) -82, arg0, 33);
        class401 var6 = new class401();
        var6.field5512 = this;
        if (var5 != null) {
            var6.method2431(new class32(var5), -97);
        }
        int var7 = 92 % ((-arg1 - 77) / 43);
        class76 var8 = this.field4165;
        synchronized (this.field4165) {
            this.field4165.method505((long) arg0, var6, 84);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(BI)V")
    public final void method1730(byte arg0, int arg1) {
        class76 var3 = this.field4165;
        synchronized (this.field4165) {
            this.field4165.method496(arg1, -97);
        }
        if (arg0 != -46) {
            return;
        }
        field4159++;
        class76 var4 = this.field4173;
        synchronized (this.field4173) {
            this.field4173.method496(arg1, 106);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public final void method1731(byte arg0) {
        field4167++;
        class76 var2 = this.field4165;
        synchronized (this.field4165) {
            if (arg0 <= 56) {
                field4163 = -120;
            }
            this.field4165.method495(-116);
        }
        class76 var3 = this.field4173;
        synchronized (this.field4173) {
            this.field4173.method495(-124);
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    public static void method1732(int arg0) {
        int var1 = -85 / ((1 - arg0) / 60);
        field4171 = null;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Ldn;ILr;Lr;)V")
    public class314(class329 arg0, int arg1, class110 arg2, class110 arg3) {
        this.field4168 = arg3;
        this.field4164 = arg2;
        this.field4164.method694(33, (byte) 119);
    }
}
