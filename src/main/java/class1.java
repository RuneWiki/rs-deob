import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public abstract class class1 {

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "Lbd;")
    public static class162 field6 = class17.method142(0, "mapscene");

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "[Lbd;")
    public static class162[] field9 = new class162[500];

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Lbd;")
    public static class162 field11 = class17.method142(0, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Lbd;")
    public static class162 field4 = class17.method142(0, " )2> ");

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "[S")
    public static short[] field13 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public int field7;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Loc;")
    public static class267 field1;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V", line = 10)
    public static final void method1(byte arg0) {
        field8++;
        class270.field4508.method1529(false);
        class134.field2398.method1529(false);
        if (arg0 != 121) {
            method1((byte) 26);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLb;)Lnl;", line = 28)
    public static final class219 method2(byte arg0, class94 arg1) {
        field5++;
        if (arg0 >= -109) {
            method2((byte) -70, (class94) null);
        }
        arg1.method756(915905888);
        int var2 = arg1.method756(915905888);
        class219 var3 = class304.method2074(1116, var2);
        var3.field3653 = arg1.method756(915905888);
        int var4 = arg1.method756(915905888);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method756(915905888);
            var3.method42(var6, 0, arg1);
        }
        var3.method39((byte) 22);
        return var3;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Z", line = 62)
    public final boolean method3(int arg0) {
        if (arg0 != 0) {
            field9 = (class162[]) null;
        }
        field16++;
        return (this.field7 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)Z", line = 82)
    public final boolean method4(int arg0) {
        field17++;
        int var2 = -79 % ((arg0 - 83) / 38);
        return (this.field7 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lob;I)V", line = 92)
    public static final void method5(class78 arg0, int arg1) {
        field18++;
        if (arg1 != -20996) {
            return;
        }
        int var2 = arg0.field1313;
        if (var2 == 324) {
            if (class242.field4022 == -1) {
                class119.field2171 = arg0.field1348;
                class242.field4022 = arg0.field1240;
            }
            if (class165.field2920.field3404) {
                arg0.field1240 = class242.field4022;
            } else {
                arg0.field1240 = class119.field2171;
            }
        } else if (var2 == 325) {
            if (class242.field4022 == -1) {
                class119.field2171 = arg0.field1348;
                class242.field4022 = arg0.field1240;
            }
            if (class165.field2920.field3404) {
                arg0.field1240 = class119.field2171;
            } else {
                arg0.field1240 = class242.field4022;
            }
        } else if (var2 == 327) {
            arg0.field1237 = 150;
            arg0.field1323 = (int) (Math.sin((double) class90.field1598 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1361 = 5;
            arg0.field1322 = -1;
        } else if (var2 == 328) {
            if (class122.field2215.field611 == null) {
                arg0.field1322 = 0;
            } else {
                arg0.field1237 = 150;
                arg0.field1323 = (int) (Math.sin((double) class90.field1598 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field1361 = 5;
                arg0.field1322 = ((int) class122.field2215.field611.method1256(arg1 ^ 0xFFFFADFC) << 11) + 2047;
                arg0.field1288 = class122.field2215.field5041;
                arg0.field1317 = class122.field2215.field5064;
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)Lud;", line = 172)
    public static final class79 method6(byte arg0) {
        int var1 = class260.field4333[0] * class190.field3253[0];
        if (arg0 >= -21) {
            return (class79) null;
        }
        byte[] var2 = class317.field5350[0];
        int[] var3 = new int[var1];
        field14++;
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class306.field5152[class92.method695(255, var2[var4])];
        }
        class79 var5 = new class79(class238.field3962, class277.field4637, class127.field2312[0], class40.field646[0], class190.field3253[0], class260.field4333[0], var3);
        class247.method1738(93);
        return var5;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)V", line = 202)
    public static void method7(byte arg0) {
        field9 = null;
        field11 = null;
        field4 = null;
        field13 = null;
        int var1 = 99 / ((-arg0 - 31) / 33);
        field1 = null;
        field6 = null;
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(B)Z", line = 233)
    public final boolean method8(byte arg0) {
        field3++;
        if (arg0 != -52) {
            method5((class78) null, 26);
        }
        return (this.field7 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(B)Z", line = 246)
    public final boolean method9(byte arg0) {
        field10++;
        if (arg0 < 119) {
            return false;
        } else {
            return (this.field7 & 0x4) != 0;
        }
    }
}
