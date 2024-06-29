import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class162 {

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Leg;")
    public static class37 field2680 = class174.method1167("(U", 91);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Leg;")
    public static class37 field2677 = class174.method1167("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", -60);

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method1089(boolean arg0, Object arg1, int arg2) {
        field2679++;
        if (arg1 == null) {
            return null;
        }
        if (arg2 != 16825) {
            field2680 = null;
        }
        if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class237.method1623(var3, true) : var3;
        } else if (arg1 instanceof class66) {
            class66 var4 = (class66) arg1;
            return var4.method460((byte) -5);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLeg;Lpe;)Leg;")
    public static final class37 method1090(byte arg0, class37 arg1, class237 arg2) {
        field2678++;
        if (arg0 != -58) {
            field2677 = null;
        }
        if (arg1.method220(field2680, (byte) 105) == -1) {
            return arg1;
        }
        while (true) {
            int var3 = arg1.method220(class123.field2066, (byte) 110);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg1.method220(class181.field3027, (byte) 107);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg1.method220(class133.field2305, (byte) 113);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg1.method220(class255.field4529, (byte) 90);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg1.method220(class116.field1985, (byte) 105);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg1.method220(class96.field1511, (byte) 121);
                                                    if (var8 == -1) {
                                                        return arg1;
                                                    }
                                                    class37 var9 = class179.field2989;
                                                    if (class187.field3198 != null) {
                                                        var9 = class150.method1025(class187.field3198.field4487, 15722);
                                                        try {
                                                            if (class187.field3198.field4483 != null) {
                                                                byte[] var10 = ((String) class187.field3198.field4483).getBytes("ISO-8859-1");
                                                                var9 = class80.method545(var10.length, 0, var10, (byte) -19);
                                                            }
                                                        } catch (UnsupportedEncodingException var11) {
                                                        }
                                                    }
                                                    arg1 = class156.method1061((byte) 90, new class37[] { arg1.method247(0, var8, arg0 ^ 0xFFFFFFC6), var9, arg1.method263(var8 + 4, false) });
                                                }
                                            }
                                            arg1 = class156.method1061((byte) 40, new class37[] { arg1.method247(0, var7, arg0 + 58), class171.method1143(false, class121.method858(4, -50, arg2)), arg1.method263(var7 + 2, false) });
                                        }
                                    }
                                    arg1 = class156.method1061((byte) 69, new class37[] { arg1.method247(0, var6, arg0 ^ 0xFFFFFFC6), class171.method1143(false, class121.method858(3, -77, arg2)), arg1.method263(var6 + 2, false) });
                                }
                            }
                            arg1 = class156.method1061((byte) -114, new class37[] { arg1.method247(0, var5, 0), class171.method1143(false, class121.method858(2, -58, arg2)), arg1.method263(var5 + 2, false) });
                        }
                    }
                    arg1 = class156.method1061((byte) -49, new class37[] { arg1.method247(0, var4, arg0 + 58), class171.method1143(false, class121.method858(1, -104, arg2)), arg1.method263(var4 + 2, false) });
                }
            }
            arg1 = class156.method1061((byte) -96, new class37[] { arg1.method247(0, var3, 0), class171.method1143(false, class121.method858(0, -67, arg2)), arg1.method263(var3 + 2, false) });
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static void method1091(byte arg0) {
        if (arg0 <= 63) {
            field2677 = null;
        }
        field2677 = null;
        field2680 = null;
    }
}
