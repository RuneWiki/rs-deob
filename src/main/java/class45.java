import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class45 extends class529 {

    @OriginalMember(owner = "client!nn", name = "v", descriptor = "[I")
    public static int[] field586 = new int[32];

    @OriginalMember(owner = "client!nn", name = "x", descriptor = "Lqu;")
    public static class219 field588 = new class219(0, 3);

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
    public int field578;

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "client!nn", name = "p", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
    public int field581;

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
    public int field582;

    @OriginalMember(owner = "client!nn", name = "s", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!nn", name = "t", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "client!nn", name = "u", descriptor = "I")
    public int field585;

    @OriginalMember(owner = "client!nn", name = "w", descriptor = "I")
    public int field587;

    @OriginalMember(owner = "client!nn", name = "y", descriptor = "I")
    public int field589;

    @OriginalMember(owner = "client!nn", name = "z", descriptor = "I")
    public int field590;

    @OriginalMember(owner = "client!nn", name = "A", descriptor = "I")
    public int field591;

    @OriginalMember(owner = "client!nn", name = "B", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "client!nn", name = "C", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "client!nn", name = "D", descriptor = "I")
    public int field594;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nn", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field595;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nn", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field596;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lza;II)Le;")
    public final class536 method332(class497 arg0, int arg1, int arg2) {
        if (arg1 > -108) {
            this.field579 = 36;
        }
        field580++;
        int var4 = class361.field5586[this.field590];
        if (var4 == 0) {
            class477 var11 = class409.method2611(this.field592, this.field594, this.field579);
            if (var11 instanceof class516) {
                class516 var12 = (class516) var11;
                if (var12.field7662 != null) {
                    return ((class267) var12.field7662).method107(false, arg0, arg2);
                }
            }
        } else if (var4 == 1) {
            class304 var9 = class75.method544(this.field592, this.field594, this.field579);
            if (var9 instanceof class19) {
                class19 var10 = (class19) var9;
                if (var10.field214 != null) {
                    return ((class267) var10.field214).method107(false, arg0, arg2);
                }
            }
        } else if (var4 == 2) {
            class423 var5 = class49.method352(this.field592, this.field594, this.field579, field595 == null ? (field595 = method335("jq")) : field595);
            if (var5 instanceof class232) {
                class232 var6 = (class232) var5;
                if (var6.field3830 != null) {
                    return ((class267) var6.field3830).method107(false, arg0, arg2);
                }
            }
        } else if (var4 == 3) {
            class12 var7 = class76.method548(this.field592, this.field594, this.field579);
            if (var7 instanceof class406) {
                class406 var8 = (class406) var7;
                if (var8.field6130 != null) {
                    return ((class267) var8.field6130).method107(false, arg0, arg2);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
    public static void method333(byte arg0) {
        if (arg0 < 103) {
            field586 = null;
        }
        field586 = null;
        field588 = null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Ljava/awt/Component;ZB)Liv;")
    public static final class433 method334(Component arg0, boolean arg1, byte arg2) {
        field583++;
        int var3 = 59 % ((arg2 + 53) / 43);
        try {
            Constructor var4 = Class.forName("tc").getDeclaredConstructor(field596 == null ? (field596 = method335("java.awt.Component")) : field596, Boolean.TYPE);
            return (class433) var4.newInstance(arg0, Boolean.valueOf(arg1));
        } catch (Throwable var5) {
            return new class303(arg0, arg1);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method335(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
