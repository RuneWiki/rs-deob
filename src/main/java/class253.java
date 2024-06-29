import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class253 extends class217 {

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public int field3781;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public int field3777;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public int field3778;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    public int field3782;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "Z")
    public static boolean field3771 = true;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3775 = "Loading sprites - ";

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "Lek;")
    public static class184 field3774;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBILjava/awt/Component;)Lah;", line = 6)
    public static final class206 method1757(int arg0, byte arg1, int arg2, Component arg3) {
        field3780++;
        try {
            if (arg1 == -34) {
                Class var4 = Class.forName("rl");
                class206 var5 = (class206) var4.getDeclaredConstructor().newInstance();
                var5.method617((byte) -123, arg0, arg2, arg3);
                return var5;
            } else {
                return (class206) null;
            }
        } catch (Throwable var8) {
            class77 var7 = new class77();
            var7.method617((byte) -123, arg0, arg2, arg3);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)V", line = 29)
    public static void method1758(byte arg0) {
        field3775 = null;
        if (arg0 < -75) {
            field3774 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)C", line = 47)
    public static final char method1759(int arg0, byte arg1) {
        field3779++;
        int var2 = arg1 & 0xFF;
        if (~var2 == arg0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class282.field4360[var2 - 128];
            if (var3 == '\u0000') {
                throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)I", line = 81)
    public static final int method1760(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BII)Z", line = 94)
    public final boolean method1761(byte arg0, int arg1, int arg2) {
        field3773++;
        if (arg0 == -19) {
            return this.field3782 <= arg1 && this.field3778 >= arg1 && this.field3777 <= arg2 && this.field3781 >= arg2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(IIII)V", line = 109)
    public class253(int arg0, int arg1, int arg2, int arg3) {
        this.field3781 = arg3;
        this.field3777 = arg1;
        this.field3778 = arg2;
        this.field3782 = arg0;
    }
}
