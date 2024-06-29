import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class95 {

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field1753 = 0;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field1751 = 0;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "Lai;")
    private static class10 field1756 = class44.method278("(U5", -39);

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field1754 = 0;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Lai;")
    public static class10 field1755 = class44.method278(":duelstake:", 125);

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "Lai;")
    public static class10 field1757 = class44.method278("headicons_prayer", 113);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "[I")
    public static int[] field1752;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method628(int arg0) {
        field1756 = null;
        field1752 = null;
        field1755 = null;
        field1757 = null;
        if (arg0 > -99) {
            method629(null, false, null);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lwa;ZLai;)Lai;")
    public static final class10 method629(class200 arg0, boolean arg1, class10 arg2) {
        if (arg1) {
            field1753 = 30;
        }
        if (arg2.method53((byte) -127, class64.field1068) != -1) {
            label62: while (true) {
                int var3 = arg2.method53((byte) 42, class74.field1263);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.method53((byte) -124, class39.field662);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.method53((byte) 20, class72.field1244);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.method53((byte) -124, class148.field2834);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.method53((byte) -122, field1756);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.method53((byte) 93, class70.field1203);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class10 var9 = class10.field119;
                                                        if (class194.field3693 != null) {
                                                            var9 = class70.method449(14766, class194.field3693.field350);
                                                            try {
                                                                if (class194.field3693.field353 != null) {
                                                                    byte[] var10 = ((String) class194.field3693.field353).getBytes("ISO-8859-1");
                                                                    var9 = class195.method1245(0, var10, var10.length, 106);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg2 = class67.method440(0, new class10[] { arg2.method44(var8, 0, (byte) -78), var9, arg2.method52((byte) -118, var8 + 4) });
                                                    }
                                                }
                                                arg2 = class67.method440(0, new class10[] { arg2.method44(var7, 0, (byte) -15), class66.method433(class87.method530(4, false, arg0), 83), arg2.method52((byte) -118, var7 + 2) });
                                            }
                                        }
                                        arg2 = class67.method440(0, new class10[] { arg2.method44(var6, 0, (byte) 119), class66.method433(class87.method530(3, false, arg0), 95), arg2.method52((byte) -118, var6 + 2) });
                                    }
                                }
                                arg2 = class67.method440(0, new class10[] { arg2.method44(var5, 0, (byte) 80), class66.method433(class87.method530(2, arg1, arg0), 114), arg2.method52((byte) -118, var5 + 2) });
                            }
                        }
                        arg2 = class67.method440(0, new class10[] { arg2.method44(var4, 0, (byte) -97), class66.method433(class87.method530(1, arg1, arg0), 101), arg2.method52((byte) -118, var4 + 2) });
                    }
                }
                arg2 = class67.method440(0, new class10[] { arg2.method44(var3, 0, (byte) 103), class66.method433(class87.method530(0, arg1, arg0), 91), arg2.method52((byte) -118, var3 + 2) });
            }
        }
        field1750++;
        return arg2;
    }
}
