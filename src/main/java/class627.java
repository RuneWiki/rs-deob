import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class627 {

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "Ltja;")
    private class288 field8586 = new class288(64);

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "Lbt;")
    private class48 field8584;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "Lhj;")
    public static class596 field8583 = new class596(107, 3);

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field8580;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field8581;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field8582;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field8585;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public static int field8587;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field8589;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "Ld;")
    public static class162 field8588;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public final void method3553(int arg0) {
        field8587++;
        class288 var2 = this.field8586;
        synchronized (this.field8586) {
            this.field8586.method1690(0);
            if (arg0 < 88) {
                field8583 = null;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZLlc;Ljava/lang/String;ILjava/lang/String;)Lpga;")
    public static final class561 method3554(boolean arg0, class675 arg1, String arg2, int arg3, String arg4) {
        if (!arg0) {
            return null;
        }
        field8585++;
        if (arg3 == 0) {
            return arg1.method3793(arg4, 122);
        } else if (arg3 == 1) {
            try {
                Object var5 = class745.method4170(true, class345.field4331, new Object[] { (new URL(class345.field4331.getCodeBase(), arg4)).toString() }, arg2);
                if (var5 == null) {
                    throw new RuntimeException();
                }
                class561 var6 = new class561();
                var6.field7769 = 1;
                return var6;
            } catch (Throwable var12) {
                class561 var7 = new class561();
                var7.field7769 = 2;
                return var7;
            }
        } else if (arg3 == 2) {
            try {
                class345.field4331.getAppletContext().showDocument(new URL(class345.field4331.getCodeBase(), arg4), "_blank");
                class561 var8 = new class561();
                var8.field7769 = 1;
                return var8;
            } catch (Exception var13) {
                class561 var9 = new class561();
                var9.field7769 = 2;
                return var9;
            }
        } else if (arg3 == 3) {
            try {
                class745.method4171("loggedout", class345.field4331, (byte) 79);
            } catch (Throwable var15) {
            }
            try {
                class345.field4331.getAppletContext().showDocument(new URL(class345.field4331.getCodeBase(), arg4), "_top");
                class561 var10 = new class561();
                var10.field7769 = 1;
                return var10;
            } catch (Exception var14) {
                class561 var11 = new class561();
                var11.field7769 = 2;
                return var11;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V")
    public static final void method3555(int arg0, int arg1) {
        class727 var2 = class107.field1351[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class727 var4 = class107.field1351[var3][arg0][arg1] = class107.field1351[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class10 var5 = var4.field10174; var5 != null; var5 = var5.field186) {
                    class712 var6 = var5.field187;
                    if (var6.field9994 == arg0 && var6.field9997 == arg1) {
                        var6.field808--;
                    }
                }
                if (var4.field10177 != null) {
                    var4.field10177.field808--;
                }
                if (var4.field10173 != null) {
                    var4.field10173.field808--;
                }
                if (var4.field10187 != null) {
                    var4.field10187.field808--;
                }
                if (var4.field10171 != null) {
                    var4.field10171.field808--;
                }
                if (var4.field10181 != null) {
                    var4.field10181.field808--;
                }
            }
        }
        if (class107.field1351[0][arg0][arg1] == null) {
            class107.field1351[0][arg0][arg1] = new class727(0);
            class107.field1351[0][arg0][arg1].field10186 = 1;
        }
        class107.field1351[0][arg0][arg1].field10172 = var2;
        class107.field1351[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)Ltea;")
    public final class253 method3556(byte arg0, int arg1) {
        if (arg0 != 95) {
            field8588 = null;
        }
        field8582++;
        class288 var3 = this.field8586;
        class253 var4;
        synchronized (this.field8586) {
            var4 = (class253) this.field8586.method1684((long) arg1, -359);
        }
        if (var4 != null) {
            return var4;
        }
        class48 var5 = this.field8584;
        byte[] var6;
        synchronized (this.field8584) {
            var6 = this.field8584.method437(54, (byte) -119, arg1);
        }
        class253 var7 = new class253();
        if (var6 != null) {
            var7.method1508(-84, new class403(var6));
        }
        class288 var8 = this.field8586;
        synchronized (this.field8586) {
            this.field8586.method1686(-25638, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)Lida;")
    public static final class250 method3557(int arg0) {
        if (arg0 != -7126) {
            field8588 = null;
        }
        field8581++;
        try {
            return (class250) Class.forName("dl").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class84();
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(II)V")
    public final void method3558(int arg0, int arg1) {
        class288 var3 = this.field8586;
        synchronized (this.field8586) {
            this.field8586.method1694(arg0, -78);
        }
        field8589++;
        if (arg1 > -65) {
            method3555(-54, -111);
        }
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
    public static void method3559(int arg0) {
        field8588 = null;
        if (arg0 != 12570) {
            field8588 = null;
        }
        field8583 = null;
    }

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)V")
    public final void method3560(int arg0) {
        field8580++;
        class288 var2 = this.field8586;
        synchronized (this.field8586) {
            this.field8586.method1687((byte) 61);
            if (arg0 >= -45) {
                method3555(-40, 119);
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lmja;ILbt;)V")
    public class627(class441 arg0, int arg1, class48 arg2) {
        this.field8584 = arg2;
        if (this.field8584 != null) {
            this.field8584.method431(4, 54);
        }
    }
}
