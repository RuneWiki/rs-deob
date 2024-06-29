import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class221 extends class439 {

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "[Law;")
    public static class53[] field3190 = new class53[16];

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "[I")
    public static int[] field3200 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public int field3187;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public int field3188;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public int field3189;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public int field3191;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public int field3193;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public int field3195;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public int field3196;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public int field3197;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public int field3198;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "I")
    public int field3199;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
    public int field3201;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
    public int field3203;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    public int field3205;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rd", name = "I", descriptor = "Ljava/lang/Class;")
    public static Class field3206;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
    public static void method1460(int arg0) {
        if (arg0 != 0) {
            field3190 = null;
        }
        field3190 = null;
        field3200 = null;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
    public static final void method1461(byte arg0) {
        field3192++;
        class157 var1 = (class157) class448.field6552.method2257((byte) 94);
        boolean var2 = class13.field221 != null || class459.field6781 > 0;
        if (var2) {
            class364.field5474 = 1;
        }
        if (arg0 != -43) {
            method1461((byte) -5);
        }
        if (class76.field1245 && class351.field5334.method1767(81, (byte) 25) && class106.field1669 > 2) {
            if (var2) {
                class87.field1473 = (class231) class246.field3563.field5279.field6396.field6396;
            } else {
                class271.method1738((class231) class246.field3563.field5279.field6396.field6396, var1.method1103(5), -4879, var1.method1102(true));
            }
        } else if (var2) {
            class87.field1473 = (class231) class246.field3563.field5279.field6396;
        } else {
            class271.method1738((class231) class246.field3563.field5279.field6396, var1.method1103(arg0 + 48), arg0 ^ 0x1324, var1.method1102(true));
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lqa;II)Lc;")
    public final class121 method1462(class162 arg0, int arg1, int arg2) {
        field3202++;
        int var4 = class113.field1798[this.field3204];
        if (arg1 < 121) {
            return null;
        }
        if (var4 == 0) {
            class524 var11 = class396.method2468(this.field3188, this.field3191, this.field3199);
            if (var11 instanceof class448) {
                class448 var12 = (class448) var11;
                if (var12.field6563 != null) {
                    return ((class232) var12.field6563).method381(1584, arg2, arg0);
                }
            }
        } else if (var4 == 1) {
            class177 var5 = class7.method52(this.field3188, this.field3191, this.field3199);
            if (var5 instanceof class385) {
                class385 var6 = (class385) var5;
                if (var6.field5698 != null) {
                    return ((class232) var6.field5698).method381(1584, arg2, arg0);
                }
            }
        } else if (var4 == 2) {
            class370 var9 = class51.method372(this.field3188, this.field3191, this.field3199, field3206 == null ? (field3206 = method1463("rq")) : field3206);
            if (var9 instanceof class504) {
                class504 var10 = (class504) var9;
                if (var10.field7398 != null) {
                    return ((class232) var10.field7398).method381(1584, arg2, arg0);
                }
            }
        } else if (var4 == 3) {
            class311 var7 = class358.method2310(this.field3188, this.field3191, this.field3199);
            if (var7 instanceof class244) {
                class244 var8 = (class244) var7;
                if (var8.field3514 != null) {
                    return ((class232) var8.field3514).method381(1584, arg2, arg0);
                }
            }
        }
        return null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1463(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
