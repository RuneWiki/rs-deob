import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class12 {

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public int field306 = 0;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public int field309 = 0;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Ldc;")
    public static class25 field307 = new class25(8);

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field314 = 0;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "Lfc;")
    private static class39 field315 = class90.method774("From", -119);

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Lfc;")
    public static class39 field321 = field315;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field327 = 0;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field320 = 0;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public static int field326 = 0;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "Lfc;")
    private static class39 field323 = class90.method774("Loaded gamescreen", -128);

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Lfc;")
    public static class39 field317 = field323;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "Lfc;")
    public static class39 field328 = class90.method774("<col=ffff00>*V", -123);

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public static int field325 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public static int field324 = 0;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field318 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public int field303;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public int field304;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public int field308;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public int field310;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public int field312;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Lqb;")
    public class113 field311;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "Llf;")
    public static class82 field316;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Z")
    public static boolean field319;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Z", line = 10)
    public static final boolean method149(int arg0, int arg1) {
        if (arg0 > -27) {
            method150((byte) 87);
        }
        field322++;
        return (arg1 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V", line = 31)
    public static void method150(byte arg0) {
        field318 = null;
        field317 = null;
        field315 = null;
        field328 = null;
        field316 = null;
        field321 = null;
        field307 = null;
        if (arg0 == 112) {
            field323 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lob;ILfc;)Lfc;", line = 92)
    public static final class39 method151(class99 arg0, int arg1, class39 arg2) {
        if (arg1 != ~arg2.method471(class37.field1017, (byte) -62)) {
            label58: while (true) {
                int var3 = arg2.method471(class74.field1708, (byte) -62);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.method471(class151.field3744, (byte) -62);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.method471(class7.field233, (byte) -62);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.method471(class66.field1579, (byte) -62);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.method471(class36.field983, (byte) -62);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.method471(class137.field3427, (byte) -62);
                                                        if (var8 == -1) {
                                                            break label58;
                                                        }
                                                        class39 var9 = class107.field2693;
                                                        if (class101.field2523 != null) {
                                                            var9 = class68.method646((byte) -75, class101.field2523.field1819);
                                                            try {
                                                                if (class101.field2523.field1820 != null) {
                                                                    byte[] var10 = ((String) class101.field2523.field1820).getBytes("ISO-8859-1");
                                                                    var9 = class29.method363(0, var10, arg1 ^ 0x74, var10.length);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg2 = class137.method1111(new class39[] { arg2.method456(0, 0, var8), var9, arg2.method469(var8 + 4, (byte) -110) }, (byte) 79);
                                                    }
                                                }
                                                arg2 = class137.method1111(new class39[] { arg2.method456(0, 0, var7), class103.method917(-20666, class113.method988(arg0, (byte) 59, 4)), arg2.method469(var7 + 2, (byte) -110) }, (byte) 91);
                                            }
                                        }
                                        arg2 = class137.method1111(new class39[] { arg2.method456(arg1, 0, var6), class103.method917(-20666, class113.method988(arg0, (byte) 26, 3)), arg2.method469(var6 + 2, (byte) -125) }, (byte) 88);
                                    }
                                }
                                arg2 = class137.method1111(new class39[] { arg2.method456(0, 0, var5), class103.method917(arg1 - 20666, class113.method988(arg0, (byte) 124, 2)), arg2.method469(var5 + 2, (byte) -128) }, (byte) 121);
                            }
                        }
                        arg2 = class137.method1111(new class39[] { arg2.method456(0, 0, var4), class103.method917(-20666, class113.method988(arg0, (byte) 98, 1)), arg2.method469(var4 + 2, (byte) -103) }, (byte) 118);
                    }
                }
                arg2 = class137.method1111(new class39[] { arg2.method456(0, 0, var3), class103.method917(arg1 - 20666, class113.method988(arg0, (byte) 26, 0)), arg2.method469(var3 + 2, (byte) -118) }, (byte) 114);
            }
        }
        field313++;
        return arg2;
    }
}
