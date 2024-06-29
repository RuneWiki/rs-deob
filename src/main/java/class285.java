import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public abstract class class285 {

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field4643 = 20;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "[I")
    public static int[] field4651 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public static int field4655 = 0;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "[F")
    public static float[] field4647 = new float[] { 0.0F, 0.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!em", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4657 = "";

    @OriginalMember(owner = "client!em", name = "r", descriptor = "Ljava/lang/String;")
    public static String field4659 = "green:";

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public int field4642;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public int field4644;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public int field4645;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public int field4649;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public int field4650;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public int field4652;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)Ljn;", line = 6)
    public static final class59 method2078(byte arg0) {
        field4658++;
        if (class174.field2782 == null) {
            return null;
        } else if (arg0 <= 81) {
            return (class59) null;
        } else {
            class353.field5601.method1165(class174.field2782, (byte) -111);
            class59 var1 = (class59) class353.field5601.method1166(11533);
            class213 var2 = class169.method1315(var1.field1011, 83);
            return var2 != null && var2.field3426 && var2.method1610((byte) 62) ? var1 : class57.method460(true);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V", line = 46)
    public static final void method2079(Throwable arg0, byte arg1, String arg2) {
        field4653++;
        try {
            String var3 = "";
            if (arg1 != -16) {
                method2081(4);
            }
            if (arg0 != null) {
                var3 = class142.method1092(114, arg0);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class118.method928(var3, true);
            String var4 = class267.method2026("%3a", ":", var3, 2206);
            String var5 = class267.method2026("%40", "@", var4, 2206);
            String var6 = class267.method2026("%26", "&", var5, 2206);
            String var7 = class267.method2026("%23", "#", var6, 2206);
            if (class304.field4866.field2350 == null) {
                return;
            }
            class192 var8 = class304.field4866.method1118(new URL(class304.field4866.field2350.getCodeBase(), "clienterror.ws?c=" + class209.field3299 + "&u=" + class323.field5151 + "&v1=" + class145.field2349 + "&v2=" + class145.field2347 + "&e=" + var7), 4);
            while (var8.field3064 == 0) {
                class283.method2076((byte) -109, 1L);
            }
            if (var8.field3064 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field3066;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILth;)V", line = 112)
    public static final void method2080(int arg0, class57 arg1) {
        if (arg0 != 23254) {
            field4643 = 101;
        }
        field4656++;
        class156.field2473 = arg1.method483(-1, "titlebg");
        class116.field1941 = arg1.method483(arg0 ^ 0xFFFFA529, "logo");
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 138)
    public static void method2081(int arg0) {
        field4647 = null;
        int var1 = 15 / ((arg0 + 8) / 58);
        field4651 = null;
        field4657 = null;
        field4659 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)V")
    public abstract void method2015(int arg0, int arg1);

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V")
    public abstract void method2014(int arg0, int arg1, int arg2);
}
