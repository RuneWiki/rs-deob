import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public abstract class class262 {

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "Ljo;")
    public static class150 field4129 = new class150();

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "[C")
    public static char[] field4130 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "J")
    public static long field4131 = 0L;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "[I")
    public static int[] field4133 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "Lnm;")
    public static class221 field4132;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 7)
    public static final void method1837(int arg0) {
        field4126++;
        if (class236.field3740) {
            return;
        }
        class236.field3740 = true;
        class58.field884 = true;
        if (arg0 != -47) {
            method1841((String) null, (byte) 105, (class313) null);
        }
        if (class307.field5005) {
            class285.field4676 = (float) ((int) class285.field4676 + 47 & 0xFFFFFFF0);
        } else {
            class117.field1712 += (12.0F - class117.field1712) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZ)V", line = 31)
    public static final void method1838(int arg0, boolean arg1) {
        field4124++;
        class305.field4991.method645(arg0, (byte) -44);
        class279.field4594.method645(arg0, (byte) -82);
        if (arg1) {
            method1838(19, false);
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 44)
    public static void method1839(int arg0) {
        if (arg0 != 20965) {
            method1837(43);
        }
        field4130 = null;
        field4129 = null;
        field4133 = null;
        field4132 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V", line = 58)
    public static final void method1840(byte arg0) {
        field4125++;
        class337.method2384((byte) -66);
        class228.method1550(18152);
        class52.method381((byte) -56);
        class268.method1889(-29506);
        class148.method1052(128);
        class25.method217(2048);
        class259.method1828(84);
        class221.method1494(-1);
        class250.method1779(false);
        class148.method1057((byte) 30);
        class76.method514(false);
        if (arg0 <= 6) {
            field4129 = (class150) null;
        }
        class264.method1865(false);
        class286.method2020(true);
        class199.method1359((byte) -22);
        class282.method2002(-113);
        class253.method1793(73);
        class190.method1314(false);
        class248.method1757(0);
        class268.method1891(true);
        if (class343.field5513 != 0) {
            for (int var1 = 0; var1 < class289.field4808.length; var1++) {
                class289.field4808[var1] = null;
            }
            class94.field1378 = 0;
        }
        class140.method997((byte) 30);
        class329.method2352(1);
        class183.method1269(83);
        class130.method844(-112);
        class287.field4702.method644((byte) -48);
        if (!class245.field3886) {
            ((class55) class272.field4467).method396(-65537);
        }
        class177.field2753.method1547(-25);
        class157.field2522.method1487((byte) 93);
        class270.field4457.method1487((byte) 108);
        class141.field2269.method1487((byte) 105);
        class99.field1433.method1487((byte) 109);
        class97.field1406.method1487((byte) 81);
        class310.field5042.method1487((byte) 120);
        class248.field3951.method1487((byte) 116);
        class69.field1073.method1487((byte) 113);
        class253.field4020.method1487((byte) 96);
        class132.field2031.method1487((byte) 80);
        class249.field3959.method1487((byte) 99);
        class79.field1170.method644((byte) -48);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;BLfh;)I", line = 129)
    public static final int method1841(String arg0, byte arg1, class313 arg2) {
        field4128++;
        if (arg1 != -48) {
            method1842(52);
        }
        int var3 = arg2.field5137;
        byte[] var4 = class120.method779((byte) -98, arg0);
        arg2.method2202(var4.length, (byte) -30);
        arg2.field5137 += class138.field2182.method41((byte) -61, 0, var4, var4.length, arg2.field5137, arg2.field5124);
        return arg2.field5137 - var3;
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V", line = 150)
    public static final void method1842(int arg0) {
        try {
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (arg0 >= -120) {
                return;
            }
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class6.field81 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
        } catch (Exception var7) {
        }
        field4127++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)[B")
    public abstract byte[] method1453(boolean arg0, int arg1);

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(ZI)I")
    public abstract int method1445(boolean arg0, int arg1);

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)Lqc;")
    public abstract class357 method1448(byte arg0);

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(IZ)V")
    public abstract void method1440(int arg0, boolean arg1);
}
