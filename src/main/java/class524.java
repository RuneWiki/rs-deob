import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class524 {

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "Lwb;")
    public class578 field7630 = new class578();

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7643 = new String[] { method3989(method3988("WvnLf")), method3989(method3988("WvnDf")), method3989(method3988("Me,j")), method3989(method3988("WvnGf")), method3989(method3988("X>n(3")), method3989(method3988("WvnJf")), method3989(method3988("WvnKf")), method3989(method3988("L`%h$P")), method3989(method3988("WvnOf")), method3989(method3988("WvnMf")), method3989(method3988("WvnHf")), method3989(method3988("WvnIf")), method3989(method3988("WvnEf")), method3989(method3988("Wvn@f")), method3989(method3988("WvnNf")), method3989(method3988("WvnAf")), method3989(method3988("WvnBf")), method3989(method3988("Wvn:'My48f")), method3989(method3988("WvnCf")) };

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lwo;")
    public static class765 field7634 = new class765();

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public static int field7642 = 0;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field7641 = 0;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field7627;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field7629;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "Llga;")
    public static class47 field7640;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Lwb;")
    private class578 field7639;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V", line = 6)
    public static void method3973(byte arg0) {
        try {
            int var1 = 86 / ((arg0 - 12) / 57);
            field7634 = null;
            field7640 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7643[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Z", line = 20)
    public final boolean method3974(int arg0) {
        try {
            field7626++;
            if (arg0 == -22016) {
                return this.field7630.field8373 == this.field7630;
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7643[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lwb;ILtf;)V", line = 31)
    private final void method3975(class578 arg0, int arg1, class524 arg2) {
        try {
            field7633++;
            class578 var4 = this.field7630.field8374;
            if (arg1 == 0) {
                this.field7630.field8374 = arg0.field8374;
                arg0.field8374.field8373 = this.field7630;
                if (this.field7630 != arg0) {
                    arg0.field8374 = arg2.field7630.field8374;
                    arg0.field8374.field8373 = arg0;
                    arg2.field7630.field8374 = var4;
                    var4.field8373 = arg2.field7630;
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7643[12] + (arg0 == null ? field7643[2] : field7643[4]) + ',' + arg1 + ',' + (arg2 == null ? field7643[2] : field7643[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)I", line = 57)
    public static final int method3976(byte arg0) {
        try {
            if (arg0 != 82) {
                return 97;
            }
            field7631++;
            class251 var1 = class391.field5710;
            synchronized (class391.field5710) {
                return class391.field5710.method2050(7);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field7643[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)Lwb;", line = 70)
    public final class578 method3977(byte arg0) {
        try {
            field7635++;
            if (arg0 > -27) {
                this.method3980(52);
            }
            class578 var2 = this.field7630.field8373;
            if (this.field7630 == var2) {
                this.field7639 = null;
                return null;
            } else {
                this.field7639 = var2.field8373;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7643[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)Lwb;", line = 93)
    public final class578 method3978(int arg0) {
        try {
            field7636++;
            class578 var2 = this.field7639;
            if (this.field7630 == var2) {
                this.field7639 = null;
                return null;
            }
            this.field7639 = var2.field8374;
            if (arg0 > -5) {
                this.method3974(-50);
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7643[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILtf;)V", line = 115)
    public final void method3979(int arg0, class524 arg1) {
        try {
            this.method3975(this.field7630.field8373, arg0, arg1);
            field7629++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7643[3] + arg0 + ',' + (arg1 == null ? field7643[2] : field7643[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)Lwb;", line = 123)
    public final class578 method3980(int arg0) {
        try {
            if (arg0 != -27119) {
                this.method3987(-64);
            }
            field7623++;
            class578 var2 = this.field7630.field8373;
            if (this.field7630 == var2) {
                return null;
            } else {
                var2.method4294(arg0 + 27119);
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7643[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)I", line = 142)
    public final int method3981(int arg0) {
        try {
            field7625++;
            int var2 = arg0;
            for (class578 var3 = this.field7630.field8373; var3 != this.field7630; var3 = var3.field8373) {
                var2++;
            }
            return var2;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7643[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)V", line = 160)
    public final void method3982(int arg0) {
        try {
            field7627++;
            while (true) {
                class578 var2 = this.field7630.field8373;
                if (this.field7630 == var2) {
                    this.field7639 = null;
                    if (arg0 > -118) {
                        this.method3981(72);
                        return;
                    } else {
                        return;
                    }
                }
                var2.method4294(0);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7643[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILwb;)V", line = 181)
    public final void method3983(int arg0, class578 arg1) {
        try {
            field7637++;
            if (arg1.field8374 != null) {
                arg1.method4294(0);
            }
            arg1.field8374 = this.field7630;
            arg1.field8373 = this.field7630.field8373;
            arg1.field8374.field8373 = arg1;
            arg1.field8373.field8374 = arg1;
            if (arg0 < 9) {
                this.method3979(120, null);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7643[8] + arg0 + ',' + (arg1 == null ? field7643[2] : field7643[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V", line = 270)
    public class524() {
        try {
            this.field7630.field8374 = this.field7630;
            this.field7630.field8373 = this.field7630;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7643[17] + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lwb;I)V", line = 209)
    public final void method3984(class578 arg0, int arg1) {
        try {
            field7624++;
            if (arg0.field8374 != null) {
                arg0.method4294(0);
            }
            arg0.field8373 = this.field7630;
            if (arg1 != 0) {
                this.method3983(107, null);
            }
            arg0.field8374 = this.field7630.field8374;
            arg0.field8374.field8373 = arg0;
            arg0.field8373.field8374 = arg0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7643[16] + (arg0 == null ? field7643[2] : field7643[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lft;IILjava/lang/String;)Lvn;", line = 227)
    public static final class328 method3985(class188 arg0, int arg1, int arg2, String arg3) {
        try {
            field7628++;
            if (arg2 <= 101) {
                field7641 = 97;
            }
            return class599.method4417(arg3, arg1, (byte) 78, field7643[7], arg0);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7643[6] + (arg0 == null ? field7643[2] : field7643[4]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field7643[2] : field7643[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)Lwb;", line = 239)
    public final class578 method3986(boolean arg0) {
        try {
            field7632++;
            class578 var2 = this.field7630.field8374;
            if (this.field7630 == var2) {
                this.field7639 = null;
                return null;
            }
            this.field7639 = var2.field8374;
            if (arg0) {
                field7641 = -90;
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7643[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)Lwb;", line = 279)
    public final class578 method3987(int arg0) {
        try {
            field7638++;
            if (arg0 != 0) {
                field7642 = 29;
            }
            class578 var2 = this.field7639;
            if (this.field7630 == var2) {
                this.field7639 = null;
                return null;
            } else {
                this.field7639 = var2.field8373;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7643[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3988(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3989(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 16;
                    break;
                case 2:
                    var10005 = 64;
                    break;
                case 3:
                    var10005 = 6;
                    break;
                default:
                    var10005 = 78;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
