import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class342 extends class369 {

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "F")
    private float field4316 = 0.0F;

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "Ltt;")
    private class341 field4319;

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "Lcq;")
    public static class110 field4324 = new class110(6, -1);

    @OriginalMember(owner = "client!uq", name = "x", descriptor = "I")
    public static int field4326 = 0;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!uq", name = "u", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!uq", name = "w", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "(I)V")
    public static void method1976(int arg0) {
        if (arg0 <= -97) {
            field4324 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)V")
    public final void method7(int arg0, int arg1, int arg2) {
        ++field4317;
        if (arg1 == 8250) {
            super.field5047.method2015(1, -2);
            if ((128 & arg0) != 0) {
                super.field5047.method1997(127, (class686) null);
            } else if ((1 & arg2) != 1) {
                if (this.field4319.field4308) {
                    super.field5047.method1997(126, this.field4319.field4314);
                } else {
                    super.field5047.method1997(arg1 + -8123, this.field4319.field4311[0]);
                }
            } else if (!this.field4319.field4308) {
                int var4 = super.field5047.field4585 % 4000 * 16 / 4000;
                super.field5047.method1997(127, this.field4319.field4311[var4]);
            } else {
                this.field4316 = (float) (super.field5047.field4585 % 4000) / 4000.0F;
                super.field5047.method1997(126, this.field4319.field4314);
            }
            super.field5047.method2015(0, -2);
        }
    }

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "(B)V")
    public final void method4(byte arg0) {
        if (super.field5047.method2043(4) == 0) {
            class537 var2 = super.field5047.method2020(15);
            super.field5047.method2015(1, -2);
            class537 var3 = super.field5047.method2044(43);
            var3.method15(var2);
            var3.method3012(0.125F, -20775, 1.0F, 0.125F);
            var3.method3017(0.0F, this.field4316, (byte) -48, 0.0F);
            super.field5047.method1999(class631.field8878, false);
            super.field5047.method2015(0, -2);
        }
        ++field4315;
        if (arg0 < 75) {
            this.method8(80);
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(B)V")
    public final void method3(byte arg0) {
        super.field5047.method2015(1, -2);
        ++field4322;
        super.field5047.method1994(-30, class250.field3133, class250.field3133);
        super.field5047.method2012((byte) -109, 0, class304.field3769);
        super.field5047.method1979(0, class304.field3769, (byte) -13);
        super.field5047.method1280(1, 1);
        super.field5047.method1997(126, (class686) null);
        super.field5047.method2015(0, -2);
        super.field5047.method1979(0, class304.field3769, (byte) -72);
        int var2 = -49 % ((arg0 - 54) / 47);
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        int var2 = -29 % ((37 - arg0) / 36);
        ++field4321;
        return this.field4319.method1974(-15210);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZ)V")
    public final void method5(int arg0, boolean arg1) {
        if (arg0 != 382) {
            this.method8(62);
        }
        ++field4318;
        super.field5047.method1994(-30, class428.field6081, class250.field3133);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZI)V")
    public final void method10(boolean arg0, int arg1) {
        ++field4325;
        super.field5047.method2015(1, arg1 ^ 14328);
        super.field5047.method1994(-30, class428.field6081, class644.field9099);
        if (arg1 != -14330) {
            this.method5(-88, false);
        }
        super.field5047.method1328(0, false, true, true, class304.field3769);
        super.field5047.method1979(0, class692.field9717, (byte) -122);
        super.field5047.method1280(0, 1);
        super.field5047.method2015(0, -2);
        super.field5047.method1988(-16777216, arg1 + 14334);
        super.field5047.method1979(0, class107.field1154, (byte) -32);
        this.method4((byte) 109);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BILlc;)V")
    public final void method9(byte arg0, int arg1, class686 arg2) {
        if (arg0 != -94) {
            this.method3((byte) 72);
        }
        super.field5047.method1997(arg0 + 221, arg2);
        ++field4323;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method1977(Throwable arg0, int arg1) throws IOException {
        ++field4320;
        String var3;
        if (arg0 instanceof class594) {
            class594 var2 = (class594) arg0;
            var3 = var2.field8378 + " | ";
            arg0 = var2.field8382;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        if (arg1 < 99) {
            field4326 = 58;
        }
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (~var10 == 0) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) - -1);
            String var15 = var14.substring(1 + var14.lastIndexOf(9));
            String var16 = var3 + var15;
            if (~var10 != 0 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (~var17 <= -1) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lmj;Ltt;)V")
    public class342(class344 arg0, class341 arg1) {
        super(arg0);
        this.field4319 = arg1;
    }
}
