import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class92 {

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Lsb;")
    public static class305 field917 = new class305(19, 2);

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field933 = 0;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public int field916;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public int field919;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public int field923;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public int field926;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public int field931;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public int field932;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)Lwp;")
    public static final class452 method464(int arg0, int arg1) {
        field930++;
        if (arg1 != -167823504) {
            field917 = null;
        }
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class102.field1106[var2] == null || class102.field1106[var2][var3] == null) {
            boolean var4 = class255.method1506(var2, (byte) 113);
            if (!var4) {
                return null;
            }
        }
        return class102.field1106[var2][var3];
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)V")
    public static void method465(boolean arg0) {
        field917 = null;
        if (arg0) {
            field933 = -42;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lk;I)Z")
    public final boolean method466(class92 arg0, int arg1) {
        if (arg1 != -25819) {
            this.method466(null, 67);
        }
        field924++;
        return this.field921 == arg0.field921 && this.field929 == arg0.field929 && this.field931 == arg0.field931;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lrb;Z)V")
    public static final void method467(class383 arg0, boolean arg1) {
        if (!class110.field1180) {
            class193.method1173(arg0, class293.field3664);
        } else if (arg1) {
            class472.field6799[class472.field6799.length - 1].method1220(arg0, (byte) -87);
        } else {
            int var2 = class70.method366(arg0.field5173);
            int var3 = class381.field5160[2] * arg0.method175((byte) 120) / arg0.field5168;
            int var4 = class70.method366(arg0.field5173 - var3);
            int var5 = class70.method366(arg0.field5173 + var3);
            if (var4 == var5) {
                class472.field6799[var2].method1220(arg0, (byte) -101);
            } else if (var5 - var4 == 1) {
                class472.field6799[class531.field7481 + var4].method1220(arg0, (byte) -83);
            } else {
                class472.field6799[class472.field6799.length - 1].method1220(arg0, (byte) -102);
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)Z")
    public static final boolean method468(int arg0) {
        field928++;
        if (class381.field5161) {
            try {
                class627.method3524("showVideoAd", class591.field8347, 23421);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != 65535) {
            field917 = null;
        }
        return false;
    }
}
