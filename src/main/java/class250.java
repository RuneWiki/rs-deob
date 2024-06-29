import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class250 extends class398 implements Runnable {

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public int field4254 = -1;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "Z")
    private boolean field4262 = true;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Lwi;")
    private class343 field4255;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4263 = "";

    @OriginalMember(owner = "client!df", name = "r", descriptor = "[I")
    public static int[] field4260 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!df", name = "q", descriptor = "Llo;")
    public static class306 field4259 = new class306("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!df", name = "w", descriptor = "Lvv;")
    public static class313 field4265 = new class313(59, -1);

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1692(boolean arg0) {
        if (arg0) {
            method1696(-55, null);
        }
        field4263 = null;
        field4259 = null;
        field4265 = null;
        field4260 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 19)
    public final void method1693(int arg0) {
        field4261++;
        this.field4262 = false;
        if (arg0 != -15168) {
            field4263 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lwi;)V", line = 87)
    public class250(class343 arg0) {
        this.field4255 = arg0;
    }

    @OriginalMember(owner = "client!df", name = "run", descriptor = "()V", line = 43)
    public final void run() {
        while (this.field4262) {
            this.field4255.method2198((byte) -122, this);
        }
        field4258++;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V", line = 55)
    public final void method1694(byte arg0) {
        if (arg0 == -16) {
            (new Thread(this, "a")).start();
            field4257++;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIB)Z", line = 66)
    public static final boolean method1695(int arg0, int arg1, byte arg2) {
        if (arg2 == -49) {
            field4253++;
            return (arg0 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILap;)V", line = 102)
    public static final void method1696(int arg0, class340 arg1) {
        field4256++;
        for (int var2 = 0; var2 < class299.field4808; var2++) {
            int var3 = class335.field5261[var2];
            class166 var4 = class435.field6489[var3];
            int var5 = arg1.method126((byte) -112);
            if ((var5 & 0x8) != 0) {
                var5 += arg1.method126((byte) -76) << 8;
            }
            if ((var5 & 0x400) != 0) {
                var5 += arg1.method126((byte) -116) << 16;
            }
            class49.method350(var4, (byte) -94, arg1, var3, var5);
        }
        if (arg0 != -20950) {
            method1695(78, 122, (byte) -127);
        }
    }
}
