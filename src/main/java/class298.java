import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class298 extends class179 {

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field4515 = 1;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Lcm;")
    public static class491 field4512 = null;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "[Z")
    public static boolean[] field4528 = new boolean[100];

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Loe;")
    public static class127 field4521 = new class127(7, 11);

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public int field4516;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public int field4518;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public int field4519;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public int field4524;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public int field4526;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public int field4527;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "Ltq;")
    public class427 field4514;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "Ltq;")
    public class427 field4517;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Ljava/lang/String;")
    public String field4513;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "Z")
    public boolean field4523;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "[Ljava/lang/Object;")
    public Object[] field4520;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1802(int arg0, byte arg1, int arg2) {
        field4522++;
        if (arg1 != -73) {
            method1803(78);
        }
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
    public static void method1803(int arg0) {
        field4521 = null;
        int var1 = 124 / ((58 - arg0) / 63);
        field4512 = null;
        field4528 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ltq;Z)V")
    public static final void method1804(class427 arg0, boolean arg1) {
        field4525++;
        if (!arg1 || class237.field3583 != arg0.field6187) {
            return;
        }
        if (class286.field4329.field685 == null) {
            arg0.field6161 = 0;
            arg0.field6134 = 0;
            return;
        }
        arg0.field6214 = 150;
        arg0.field6201 = (int) (Math.sin((double) class369.field5424 / 40.0D) * 256.0D) & 0x7FF;
        arg0.field6161 = class507.field7667;
        arg0.field6195 = 5;
        arg0.field6134 = class499.method3002((byte) -51, class286.field4329.field685);
        arg0.field6275 = class286.field4329.field2201;
        arg0.field6235 = class286.field4329.field2205;
        arg0.field6290 = 0;
        arg0.field6217 = class286.field4329.field2194;
    }
}
