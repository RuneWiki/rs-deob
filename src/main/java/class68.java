import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class68 {

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "Liha;")
    private class29 field960 = new class29(64);

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "Lgda;")
    private class58 field962;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field970 = new String[] { method728(method727("b\u001evfV")), method728(method727("b\u001evkV")), method728(method727("b\u001eviV")), method728(method727("b\u001evjV")), method728(method727("b\u001evmV")), method728(method727("h^v\u0000\u0003")), method728(method727("}\u00054B")), method728(method727("b\u001evlV")), method728(method727("b\u001ev\u0012\u0017}\u0019,\u0010V")), method728(method727("b\u001evoV")), method728(method727("b\u001evhV")) };

    @OriginalMember(owner = "client!qn", name = "n", descriptor = "Lvn;")
    public static class330 field959 = new class330(18, 7);

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    public static int field965 = 0;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "Lhl;")
    public static class556 field968 = new class556(121, 4);

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "[[B")
    public static byte[][] field969 = new byte[50][];

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)V")
    public final void method719(int arg0, byte arg1) {
        try {
            field966++;
            class29 var3 = this.field960;
            synchronized (this.field960) {
                this.field960.method304(arg1 - 18);
                this.field960 = new class29(arg0);
            }
            if (arg1 != 19) {
                field959 = null;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field970[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)V")
    public final void method720(byte arg0) {
        try {
            class29 var2 = this.field960;
            synchronized (this.field960) {
                this.field960.method298(5);
                int var3 = 33 / ((arg0 + 28) / 54);
            }
            field958++;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field970[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V")
    public final void method721(boolean arg0) {
        try {
            field964++;
            if (arg0) {
                class29 var2 = this.field960;
                synchronized (this.field960) {
                    this.field960.method304(1);
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field970[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
    public final void method722(int arg0, int arg1) {
        try {
            class29 var3 = this.field960;
            synchronized (this.field960) {
                if (arg0 != 0) {
                    return;
                }
                this.field960.method294(arg1, -630);
            }
            field956++;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field970[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIILnq;I)V")
    public static final void method723(int arg0, int arg1, int arg2, class487 arg3, int arg4) {
        try {
            arg3.field7362.method1641((byte) -108, arg0);
            field963++;
            arg3.field7362.method1631(arg4, -25924);
            arg3.field7362.method1631(arg1, -25924);
            if (arg2 >= -43) {
                field968 = null;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field970[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field970[6] : field970[5]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILoi;)V")
    public static final void method724(int arg0, class77 arg1) {
        try {
            int var2 = 37 % ((2 - arg0) / 54);
            if ((arg1 instanceof class426)) {
                class426 var4 = (class426) arg1;
                if (var4.field6716 != null) {
                    class127.method1223(var4, class438.field6846.field9975 != var4.field9975, (byte) -36);
                }
            } else if (arg1 instanceof class738) {
                class738 var3 = (class738) arg1;
                class59.method616(var3, 53, class438.field6846.field9975 != var3.field9975);
            }
            field961++;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field970[10] + arg0 + ',' + (arg1 == null ? field970[6] : field970[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V")
    public static void method725(byte arg0) {
        try {
            field969 = null;
            field959 = null;
            field968 = null;
            if (arg0 != -103) {
                method725((byte) 12);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field970[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lpo;ILgda;)V")
    public class68(class585 arg0, int arg1, class58 arg2) {
        try {
            this.field962 = arg2;
            if (this.field962 != null) {
                int var4 = this.field962.method600(1) - 1;
                this.field962.method580(101, var4);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field970[8] + (arg0 == null ? field970[6] : field970[5]) + ',' + arg1 + ',' + (arg2 == null ? field970[6] : field970[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(II)Lhb;")
    public final class759 method726(int arg0, int arg1) {
        try {
            if (arg1 != 50) {
                this.field960 = null;
            }
            field957++;
            class29 var3 = this.field960;
            class759 var4;
            synchronized (this.field960) {
                var4 = (class759) this.field960.method302(arg1 - 170, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class58 var5 = this.field962;
            byte[] var6;
            synchronized (this.field962) {
                var6 = this.field962.method604((byte) 72, class305.method2618(arg1 + 66, arg0), class262.method2281(arg0, 114));
            }
            class759 var7 = new class759();
            if (var6 != null) {
                var7.method5486(new class176(var6), 85);
            }
            class29 var8 = this.field960;
            synchronized (this.field960) {
                this.field960.method295(false, (long) arg0, var7);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field970[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method727(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method728(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 19;
                    break;
                case 1:
                    var10005 = 112;
                    break;
                case 2:
                    var10005 = 88;
                    break;
                case 3:
                    var10005 = 46;
                    break;
                default:
                    var10005 = 126;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
