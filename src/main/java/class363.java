import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class363 extends class445 {

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public int field4980 = 0;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
    public int field4977 = -1;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public int field4970;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public int field4971;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public int field4972;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public int field4973;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
    public int field4976;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public int field4978;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
    public int field4983;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
    public int field4984;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
    public int field4985;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public int field4986;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "[Z")
    public static boolean[] field4975;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(IB)I")
    public static final int method2210(int arg0, byte arg1) {
        if (arg1 != 34) {
            return -10;
        }
        field4979++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Ljava/awt/Canvas;I)Ltr;")
    public static final class176 method2211(Canvas arg0, int arg1) {
        field4981++;
        if (arg1 != -1143953951) {
            return null;
        }
        try {
            Class var2 = Class.forName("rg");
            class176 var3 = (class176) var2.getDeclaredConstructor().newInstance();
            var3.method1009(arg0, (byte) 109);
            return var3;
        } catch (Throwable var5) {
            class492 var4 = new class492();
            var4.method1009(arg0, (byte) -83);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lur;ZLjava/lang/String;B)V")
    public static final void method2212(class345 arg0, boolean arg1, String arg2, byte arg3) {
        field4982++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class448.field6097.method2143((class139[]) null, arg2, (byte) -52, 250);
        int var8 = class448.field6097.method2142((byte) -70, arg2, 250, (class139[]) null) * 13;
        class98.field1432.method2003(var5 - var4, -var4 + var6, var4 + var4 + var7, var4 + var8 + var4, -16777216, 0);
        class98.field1432.method1973(var5 - var4, -var4 + var6, var4 + var4 + var7, var4 + var8 - -var4, -1, 0);
        arg0.method2120(0, 0, var5, 1, -1, (int[]) null, 0, (class152) null, var8, arg2, 1, 1, var6, (class139[]) null, -1, var7);
        if (arg3 < 62) {
            field4975 = null;
        }
        class446.method2623(var4 + var7 + var4, -729334780, -var4 + var5, var4 + var8 + var4, -var4 + var6);
        if (arg1) {
            class98.field1432.method1966();
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)V")
    public static void method2213(boolean arg0) {
        if (arg0) {
            method2214(81);
        }
        field4975 = null;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public static final void method2214(int arg0) {
        field4974++;
        for (int var1 = 0; var1 < 5; var1++) {
            class278.field3687[var1] = false;
        }
        class294.field3934 = class70.field968;
        class268.field3584 = class195.field2638;
        class26.field335 = -1;
        int var2 = 59 % ((-arg0 - 27) / 51);
        class358.field4957 = -1;
        class56.field772 = 5;
        class120.field1771 = class348.field4796;
        class374.field5152 = class155.field2171;
        class336.field4540 = class412.field5637;
        class464.field6420 = 0;
        class447.field6087 = 0;
        class243.field3237 = class197.field2680;
    }

    static {
        new class225("", 76);
    }
}
