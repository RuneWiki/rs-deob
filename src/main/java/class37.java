import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class37 {

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "Lqw;")
    public static class84 field388 = new class84();

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
    public static int field393 = -1;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IZ)V", line = 7)
    public static final void method212(int arg0, boolean arg1) {
        field391++;
        class125.field1721.method2255(true, 0, class125.field1721.field5170);
        class125.field1721.method2255(true, 0, class125.field1721.field5155);
        class125.field1721.method2255(true, 1, class125.field1721.field5168);
        class125.field1721.method2255(true, 1, class125.field1721.field5172);
        class125.field1721.method2255(true, 0, class125.field1721.field5166);
        class125.field1721.method2255(true, 0, class125.field1721.field5171);
        class125.field1721.method2255(true, 0, class125.field1721.field5147);
        class125.field1721.method2255(true, 0, class125.field1721.field5163);
        class125.field1721.method2255(true, 0, class125.field1721.field5153);
        class125.field1721.method2255(true, 0, class125.field1721.field5134);
        class125.field1721.method2255(true, 0, class125.field1721.field5156);
        if (arg0 != 28974) {
            method214(-23);
        }
        class125.field1721.method2255(true, 0, class125.field1721.field5167);
        class125.field1721.method2255(true, 0, class125.field1721.field5160);
        class125.field1721.method2255(true, 0, class125.field1721.field5188);
        class125.field1721.method2255(true, 0, class125.field1721.field5174);
        class125.field1721.method2255(true, 0, class125.field1721.field5184);
        class125.field1721.method2255(true, 0, class125.field1721.field5175);
        class125.field1721.method2255(true, 0, class125.field1721.field5144);
        class125.field1721.method2255(true, 0, class125.field1721.field5164);
        class87.method698((byte) 80);
        class125.field1721.method2255(true, 2, class125.field1721.field5182);
        class125.field1721.method2255(true, 1, class125.field1721.field5137);
        class380.method2369((byte) 22);
        class697.method3787(-108);
        class130.field1794 = true;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)Z", line = 45)
    public final boolean method213(int arg0) {
        if (arg0 != 0) {
            method216(0);
        }
        field387++;
        return class219.field2841 == this | class280.field4058 == this;
    }

    @OriginalMember(owner = "client!wv", name = "toString", descriptor = "()Ljava/lang/String;", line = 57)
    public final String toString() {
        field386++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)Z", line = 69)
    public static final boolean method214(int arg0) {
        field389++;
        try {
            if (class289.field4115 == 2) {
                if (class82.field1144 == null) {
                    class82.field1144 = class591.method3325(class765.field10514, class122.field1694, class786.field10798);
                    if (class82.field1144 == null) {
                        return false;
                    }
                }
                if (class774.field10652 == null) {
                    class774.field10652 = new class507(class548.field7572, class208.field2682);
                }
                class64 var1 = class311.field4406;
                if (class348.field5049 != null) {
                    var1 = class348.field5049;
                }
                if (var1.method410(63, class774.field10652, 22050, class82.field1144, class626.field8486)) {
                    class311.field4406 = var1;
                    class311.field4406.method425((byte) -96);
                    if (class458.field6542 > 0) {
                        class289.field4115 = 3;
                        class311.field4406.method400((byte) 104, class458.field6542 <= class460.field6563 ? class458.field6542 : class460.field6563);
                        for (int var2 = 0; var2 < class714.field9734.length; var2++) {
                            class311.field4406.method399(var2, 16, class714.field9734[var2]);
                            class714.field9734[var2] = 255;
                        }
                    } else {
                        class289.field4115 = 0;
                        class311.field4406.method400((byte) 97, class460.field6563);
                        for (int var3 = 0; var3 < class714.field9734.length; var3++) {
                            class311.field4406.method399(var3, 16, class714.field9734[var3]);
                            class714.field9734[var3] = 255;
                        }
                    }
                    if (class348.field5049 == null) {
                        if (class445.field6406 <= 0L) {
                            class311.field4406.method404((byte) -127, class82.field1144, class100.field1451);
                        } else {
                            class311.field4406.method414(class100.field1451, false, true, class82.field1144, class445.field6406);
                        }
                    }
                    if (class129.field1778 != null) {
                        class129.field1778.method2500(-27177, class311.field4406);
                    }
                    class82.field1144 = null;
                    class765.field10514 = null;
                    class774.field10652 = null;
                    class348.field5049 = null;
                    class445.field6406 = 0L;
                    return true;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class311.field4406.method408(true);
            class348.field5049 = null;
            class82.field1144 = null;
            class289.field4115 = 0;
            class774.field10652 = null;
            class765.field10514 = null;
        }
        int var5 = 29 % ((-arg0 - 85) / 33);
        return false;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(FFIFIBIFLmm;IF)[B", line = 169)
    public static final byte[] method215(float arg0, float arg1, int arg2, float arg3, int arg4, byte arg5, int arg6, float arg7, class294 arg8, int arg9, float arg10) {
        field390++;
        if (arg5 != 118) {
            field388 = null;
        }
        byte[] var11 = new byte[arg2 * arg9 * arg4];
        class170.method1146(arg6, arg9, 0, arg3, var11, arg0, arg1, arg8, arg7, arg10, (byte) 93, arg2, arg4);
        return var11;
    }

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "(I)V", line = 192)
    public static void method216(int arg0) {
        if (arg0 != 156) {
            field392 = 66;
        }
        field388 = null;
    }
}
