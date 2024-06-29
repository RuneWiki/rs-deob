import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class385 {

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "Lqu;")
    public static class219 field5889 = new class219(54, -1);

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "[I")
    public static int[] field5893 = new int[1];

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "[I")
    public static int[] field5895 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "Lss;")
    public static class213 field5896 = new class213("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public int field5885;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "Lac;")
    public class504 field5891;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "[I")
    public int[] field5897;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Z")
    public static final boolean method2479(int arg0, int arg1) {
        field5888++;
        if (class239.field3897[arg1]) {
            return true;
        } else if (class152.field2017.method1002(1, arg1)) {
            int var2 = class152.field2017.method1008(arg1, (byte) -21);
            if (arg0 == var2) {
                class239.field3897[arg1] = true;
                return true;
            }
            if (class433.field6540[arg1] == null) {
                class433.field6540[arg1] = new class437[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class433.field6540[arg1][var3] == null) {
                    byte[] var4 = class152.field2017.method1004(arg1, false, var3);
                    if (var4 != null) {
                        class437 var5 = class433.field6540[arg1][var3] = new class437();
                        var5.field6751 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method2750(new class208(var4), arg0 - 26272);
                    }
                }
            }
            class239.field3897[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II[Lgi;)V")
    public static final void method2480(int arg0, int arg1, class437[] arg2) {
        field5890++;
        if (arg0 > -36) {
            return;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class437 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field6729 == 0) {
                    if (var4.field6675 != null) {
                        method2480(-48, arg1, var4.field6675);
                    }
                    class301 var5 = (class301) class423.field6414.method1122((byte) 59, (long) var4.field6751);
                    if (var5 != null) {
                        class263.method1808(var5.field4721, 5759, arg1);
                    }
                }
                if (arg1 == 0 && var4.field6668 != null) {
                    class491 var6 = new class491();
                    var6.field7423 = var4;
                    var6.field7430 = var4.field6668;
                    class420.method2673(var6);
                }
                if (arg1 == 1 && var4.field6654 != null) {
                    if (var4.field6595 >= 0) {
                        class437 var7 = class255.method1747(var4.field6751, false);
                        if (var7 == null || var7.field6675 == null || var4.field6595 >= var7.field6675.length || var7.field6675[var4.field6595] != var4) {
                            continue;
                        }
                    }
                    class491 var8 = new class491();
                    var8.field7423 = var4;
                    var8.field7430 = var4.field6654;
                    class420.method2673(var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBI)Ljava/lang/String;")
    public static final String method2481(int arg0, byte arg1, int arg2) {
        field5886++;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else {
            if (arg1 != -44) {
                method2479(-8, 90);
            }
            if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static void method2482(int arg0) {
        field5895 = null;
        field5889 = null;
        field5893 = null;
        if (arg0 >= 5) {
            field5896 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)Z")
    public static final boolean method2483(int arg0) {
        field5887++;
        if (arg0 > -90) {
            field5889 = null;
        }
        class529 var1 = class392.field5958.field4939.field7776;
        if (var1 == null || class392.field5958.field4939 == var1) {
            return false;
        }
        class140 var2 = (class140) var1;
        if (var2.field1894 >= 2000) {
            var2.field1894 -= 2000;
        }
        return var2.field1894 == 1012;
    }
}
