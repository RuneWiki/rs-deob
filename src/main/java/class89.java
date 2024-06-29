import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class89 {

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field1468 = 0;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "Lwa;")
    public static class75 field1472 = class66.method560("Mitglieder)2Welt", false);

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field1479 = -1;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "Lwa;")
    public static class75 field1477 = class66.method560("cookieprefix", false);

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "Lwa;")
    public static class75 field1482 = class66.method560("Ausw-=hlen", false);

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "Lwa;")
    public static class75 field1480 = class66.method560("gr-Un:", false);

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "Lql;")
    public static class16 field1470 = new class16(5000);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public int field1463;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public int field1464;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public int field1474;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public int field1481;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Lml;")
    public static class125 field1465;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "[Lbh;")
    public static class258[] field1473;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "[[[B")
    public static byte[][][] field1469;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILcl;IILjava/awt/Component;)Llb;", line = 5)
    public static final class199 method705(int arg0, class124 arg1, int arg2, int arg3, Component arg4) {
        field1476++;
        if (class99.field1644 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class199 var5 = (class199) Class.forName("ec").getDeclaredConstructor().newInstance();
                var5.field3359 = new int[(class26.field348 ? 2 : 1) * 256];
                var5.field3365 = arg3;
                var5.method239(arg4);
                var5.field3367 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field3367 > 16384) {
                    var5.field3367 = 16384;
                }
                var5.method242(var5.field3367);
                if (class180.field3023 > 0 && class301.field5141 == null) {
                    class301.field5141 = new class303();
                    class301.field5141.field5180 = arg1;
                    arg1.method947(arg0 - 27095, class301.field5141, class180.field3023);
                }
                if (class301.field5141 != null) {
                    if (class301.field5141.field5184[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class301.field5141.field5184[arg2] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class62 var7 = new class62(arg1, arg2);
                    var7.field3359 = new int[(class26.field348 ? 2 : 1) * 256];
                    var7.field3365 = arg3;
                    var7.method239(arg4);
                    if (arg0 != 27095) {
                        field1468 = -92;
                    }
                    var7.field3367 = 16384;
                    var7.method242(var7.field3367);
                    if (class180.field3023 > 0 && class301.field5141 == null) {
                        class301.field5141 = new class303();
                        class301.field5141.field5180 = arg1;
                        arg1.method947(arg0 ^ 0x69D7, class301.field5141, class180.field3023);
                    }
                    if (class301.field5141 != null) {
                        if (class301.field5141.field5184[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class301.field5141.field5184[arg2] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class199();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 99)
    public static void method706(int arg0) {
        field1472 = null;
        if (arg0 != -1) {
            field1469 = (byte[][][]) ((byte[][][]) null);
        }
        field1470 = null;
        field1482 = null;
        field1480 = null;
        field1469 = (byte[][][]) null;
        field1465 = null;
        field1473 = null;
        field1477 = null;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V", line = 126)
    public static final void method707(int arg0) {
        if (arg0 != 16384) {
            return;
        }
        field1467++;
        for (int var1 = 0; var1 < 5; var1++) {
            class169.field2841[var1] = false;
        }
        class188.field3142 = -1;
        class272.field4693 = -1;
        class163.field2777 = 1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)Lwa;", line = 159)
    public static final class75 method708(int arg0, int arg1) {
        if (arg0 != 7391) {
            return (class75) null;
        }
        class75 var2 = new class75();
        var2.field1296 = new byte[arg1];
        field1478++;
        var2.field1280 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lcb;III)Lje;", line = 199)
    public static final class68 method709(class267 arg0, int arg1, int arg2, int arg3) {
        if (arg2 > -70) {
            field1469 = (byte[][][]) ((byte[][][]) null);
        }
        field1475++;
        return class281.method1994(arg3, (byte) -7, arg1, arg0) ? class226.method1659(-7507) : null;
    }
}
